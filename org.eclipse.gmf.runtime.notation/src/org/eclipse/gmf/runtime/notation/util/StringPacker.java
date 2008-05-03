/*
 *+------------------------------------------------------------------------+
 *| Licensed Materials - Property of IBM                                   |
 *| (C) Copyright IBM Corp. 2008.  All Rights Reserved.                    |
 *|                                                                        |
 *| US Government Users Restricted Rights - Use, duplication or disclosure |
 *| restricted by GSA ADP Schedule Contract with IBM Corp.                 |
 *+------------------------------------------------------------------------+
 */
package org.eclipse.gmf.runtime.notation.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class StringPacker {

	protected char[] characters;

	protected ReusableByteArrayInputStream inputBytes;

	protected ByteArrayOutputStream outputBytes;

	public StringPacker() {
		outputBytes = new ByteArrayOutputStream();
		inputBytes = new ReusableByteArrayInputStream();
	}

	public byte[] getByteArray(String value) {
		outputBytes.reset();
		writeString(value);
		return outputBytes.toByteArray();
	}

	protected void writeString(String value) {
		int length = value.length();

		if (characters == null || characters.length < length) {
			characters = new char[length];
		}
		value.getChars(0, length, characters, 0);
		LOOP : for (int i = 0; i < length; ++i) {
			char character = characters[i];

			if (character == 0 || character > 0xFF) {
				writeByte((byte) 0);
				writeChar(character);
				while (++i < length) {
					writeChar(characters[i]);
				}
				break LOOP;

			} else {
				writeByte((byte) character);
			}
		}
	}

	protected void writeChar(int value) {
		writeByte((byte) (value >> 8 & 0xFF));
		writeByte((byte) (value & 0xFF));
	}

	protected void writeByte(int value) {
		outputBytes.write(value);
	}

	public String getString(byte[] value) {
		inputBytes.reset(value);
		return readString(value);
	}

	protected String readString(byte[] bytes) {
		int length = bytes.length;
		int charCount = 0;
		
		if (characters == null || characters.length < length) {
			characters = new char[length];
		}
		LOOP : for (int i = 0; i < length; ++i) {
			byte value = readByte();
			if (value == 0) {
				i++;
				do {
					characters[charCount++] = readChar();
					i += 2; // read two bytes
				} while (i < length);
				break LOOP;
			} else {
				characters[charCount++] = (char) value;
			}
		}
		return new String(characters, 0, charCount);
	}

	protected char readChar() {
		return (char) ((readByte() << 8) & 0xFF00 | readByte() & 0xFF);
	}

	protected byte readByte() {
		int result = inputBytes.read();
		if (result == -1) {
			throw new IllegalArgumentException("Invalid bytes"); //$NON-NLS-1$
		}
		return (byte) result;
	}

	protected class ReusableByteArrayInputStream
			extends ByteArrayInputStream {

		public ReusableByteArrayInputStream() {
			super(new byte[]{});
		}

		public synchronized void reset(byte buf[]) {
			this.buf = buf;
			this.pos = 0;
			this.mark = 0;
			this.count = buf.length;
		}
	}

}
