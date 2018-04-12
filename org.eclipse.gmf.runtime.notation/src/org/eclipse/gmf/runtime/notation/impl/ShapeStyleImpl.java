/******************************************************************************
 * Copyright (c) 2004, 2010 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/

package org.eclipse.gmf.runtime.notation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.gmf.runtime.notation.DescriptionStyle;
import org.eclipse.gmf.runtime.notation.FillStyle;
import org.eclipse.gmf.runtime.notation.LineStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.RoundedCornersStyle;
import org.eclipse.gmf.runtime.notation.ShapeStyle;
import org.eclipse.gmf.runtime.notation.datatype.GradientData;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shape Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ShapeStyleImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ShapeStyleImpl#getFillColor <em>Fill Color</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ShapeStyleImpl#getTransparency <em>Transparency</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ShapeStyleImpl#getGradient <em>Gradient</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ShapeStyleImpl#getLineColor <em>Line Color</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ShapeStyleImpl#getLineWidth <em>Line Width</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ShapeStyleImpl#getRoundedBendpointsRadius <em>Rounded Bendpoints Radius</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
/*
 * @canBeSeenBy %partners
 */
public class ShapeStyleImpl extends FontStyleImpl implements ShapeStyle {
	
    /**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

				/**
	 * The default value of the '{@link #getFillColor() <em>Fill Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillColor()
	 * @generated
	 * @ordered
	 */
	protected static final int FILL_COLOR_EDEFAULT = 16777215;

    /**
	 * The cached value of the '{@link #getFillColor() <em>Fill Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillColor()
	 * @generated
	 * @ordered
	 */
	protected int fillColor = FILL_COLOR_EDEFAULT;

    /**
	 * The default value of the '{@link #getTransparency() <em>Transparency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransparency()
	 * @generated
	 * @ordered
	 */
	protected static final int TRANSPARENCY_EDEFAULT = -1;

				/**
	 * The cached value of the '{@link #getTransparency() <em>Transparency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransparency()
	 * @generated
	 * @ordered
	 */
	protected int transparency = TRANSPARENCY_EDEFAULT;

				/**
	 * The default value of the '{@link #getGradient() <em>Gradient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradient()
	 * @generated
	 * @ordered
	 */
	protected static final GradientData GRADIENT_EDEFAULT = null;

				/**
	 * The cached value of the '{@link #getGradient() <em>Gradient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradient()
	 * @generated
	 * @ordered
	 */
	protected GradientData gradient = GRADIENT_EDEFAULT;

				/**
	 * The default value of the '{@link #getLineColor() <em>Line Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineColor()
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_COLOR_EDEFAULT = 11579568;

    /**
	 * The cached value of the '{@link #getLineColor() <em>Line Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineColor()
	 * @generated
	 * @ordered
	 */
	protected int lineColor = LINE_COLOR_EDEFAULT;

    /**
	 * The default value of the '{@link #getLineWidth() <em>Line Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_WIDTH_EDEFAULT = -1;

				/**
	 * The cached value of the '{@link #getLineWidth() <em>Line Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineWidth()
	 * @generated
	 * @ordered
	 */
	protected int lineWidth = LINE_WIDTH_EDEFAULT;

				/**
	 * The default value of the '{@link #getRoundedBendpointsRadius() <em>Rounded Bendpoints Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoundedBendpointsRadius()
	 * @generated
	 * @ordered
     * @since 1.4
	 */
	protected static final int ROUNDED_BENDPOINTS_RADIUS_EDEFAULT = 0;

				/**
	 * The cached value of the '{@link #getRoundedBendpointsRadius() <em>Rounded Bendpoints Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoundedBendpointsRadius()
	 * @generated
	 * @ordered
     * @since 1.4
	 */
	protected int roundedBendpointsRadius = ROUNDED_BENDPOINTS_RADIUS_EDEFAULT;

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShapeStyleImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.SHAPE_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setFontName(String newFontName) {
		setFontNameGen(newFontName == null ? null : newFontName.intern());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontNameGen(String newFontName) {
		String oldFontName = fontName;
		fontName = newFontName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.SHAPE_STYLE__FONT_NAME, oldFontName, fontName));
	}
	
				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.SHAPE_STYLE__DESCRIPTION, oldDescription, description));
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFillColor() {
		return fillColor;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillColor(int newFillColor) {
		int oldFillColor = fillColor;
		fillColor = newFillColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.SHAPE_STYLE__FILL_COLOR, oldFillColor, fillColor));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTransparency() {
		return transparency;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransparency(int newTransparency) {
		int oldTransparency = transparency;
		transparency = newTransparency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.SHAPE_STYLE__TRANSPARENCY, oldTransparency, transparency));
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GradientData getGradient() {
		return gradient;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGradient(GradientData newGradient) {
		GradientData oldGradient = gradient;
		gradient = newGradient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.SHAPE_STYLE__GRADIENT, oldGradient, gradient));
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLineColor() {
		return lineColor;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineColor(int newLineColor) {
		int oldLineColor = lineColor;
		lineColor = newLineColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.SHAPE_STYLE__LINE_COLOR, oldLineColor, lineColor));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLineWidth() {
		return lineWidth;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineWidth(int newLineWidth) {
		int oldLineWidth = lineWidth;
		lineWidth = newLineWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.SHAPE_STYLE__LINE_WIDTH, oldLineWidth, lineWidth));
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     * @since 1.4
	 */
	public int getRoundedBendpointsRadius() {
		return roundedBendpointsRadius;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     * @since 1.4
	 */
	public void setRoundedBendpointsRadius(int newRoundedBendpointsRadius) {
		int oldRoundedBendpointsRadius = roundedBendpointsRadius;
		roundedBendpointsRadius = newRoundedBendpointsRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.SHAPE_STYLE__ROUNDED_BENDPOINTS_RADIUS, oldRoundedBendpointsRadius, roundedBendpointsRadius));
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NotationPackage.SHAPE_STYLE__FONT_COLOR:
				return new Integer(getFontColor());
			case NotationPackage.SHAPE_STYLE__FONT_NAME:
				return getFontName();
			case NotationPackage.SHAPE_STYLE__FONT_HEIGHT:
				return new Integer(getFontHeight());
			case NotationPackage.SHAPE_STYLE__BOLD:
				return isBold() ? Boolean.TRUE : Boolean.FALSE;
			case NotationPackage.SHAPE_STYLE__ITALIC:
				return isItalic() ? Boolean.TRUE : Boolean.FALSE;
			case NotationPackage.SHAPE_STYLE__UNDERLINE:
				return isUnderline() ? Boolean.TRUE : Boolean.FALSE;
			case NotationPackage.SHAPE_STYLE__STRIKE_THROUGH:
				return isStrikeThrough() ? Boolean.TRUE : Boolean.FALSE;
			case NotationPackage.SHAPE_STYLE__DESCRIPTION:
				return getDescription();
			case NotationPackage.SHAPE_STYLE__FILL_COLOR:
				return new Integer(getFillColor());
			case NotationPackage.SHAPE_STYLE__TRANSPARENCY:
				return new Integer(getTransparency());
			case NotationPackage.SHAPE_STYLE__GRADIENT:
				return getGradient();
			case NotationPackage.SHAPE_STYLE__LINE_COLOR:
				return new Integer(getLineColor());
			case NotationPackage.SHAPE_STYLE__LINE_WIDTH:
				return new Integer(getLineWidth());
			case NotationPackage.SHAPE_STYLE__ROUNDED_BENDPOINTS_RADIUS:
				return new Integer(getRoundedBendpointsRadius());
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NotationPackage.SHAPE_STYLE__FONT_COLOR:
				setFontColor(((Integer)newValue).intValue());
				return;
			case NotationPackage.SHAPE_STYLE__FONT_NAME:
				setFontName((String)newValue);
				return;
			case NotationPackage.SHAPE_STYLE__FONT_HEIGHT:
				setFontHeight(((Integer)newValue).intValue());
				return;
			case NotationPackage.SHAPE_STYLE__BOLD:
				setBold(((Boolean)newValue).booleanValue());
				return;
			case NotationPackage.SHAPE_STYLE__ITALIC:
				setItalic(((Boolean)newValue).booleanValue());
				return;
			case NotationPackage.SHAPE_STYLE__UNDERLINE:
				setUnderline(((Boolean)newValue).booleanValue());
				return;
			case NotationPackage.SHAPE_STYLE__STRIKE_THROUGH:
				setStrikeThrough(((Boolean)newValue).booleanValue());
				return;
			case NotationPackage.SHAPE_STYLE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case NotationPackage.SHAPE_STYLE__FILL_COLOR:
				setFillColor(((Integer)newValue).intValue());
				return;
			case NotationPackage.SHAPE_STYLE__TRANSPARENCY:
				setTransparency(((Integer)newValue).intValue());
				return;
			case NotationPackage.SHAPE_STYLE__GRADIENT:
				setGradient((GradientData)newValue);
				return;
			case NotationPackage.SHAPE_STYLE__LINE_COLOR:
				setLineColor(((Integer)newValue).intValue());
				return;
			case NotationPackage.SHAPE_STYLE__LINE_WIDTH:
				setLineWidth(((Integer)newValue).intValue());
				return;
			case NotationPackage.SHAPE_STYLE__ROUNDED_BENDPOINTS_RADIUS:
				setRoundedBendpointsRadius(((Integer)newValue).intValue());
				return;
		}
		eDynamicSet(featureID, newValue);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void eUnset(int featureID) {
		switch (featureID) {
			case NotationPackage.SHAPE_STYLE__FONT_COLOR:
				setFontColor(FONT_COLOR_EDEFAULT);
				return;
			case NotationPackage.SHAPE_STYLE__FONT_NAME:
				setFontName(FONT_NAME_EDEFAULT);
				return;
			case NotationPackage.SHAPE_STYLE__FONT_HEIGHT:
				setFontHeight(FONT_HEIGHT_EDEFAULT);
				return;
			case NotationPackage.SHAPE_STYLE__BOLD:
				setBold(BOLD_EDEFAULT);
				return;
			case NotationPackage.SHAPE_STYLE__ITALIC:
				setItalic(ITALIC_EDEFAULT);
				return;
			case NotationPackage.SHAPE_STYLE__UNDERLINE:
				setUnderline(UNDERLINE_EDEFAULT);
				return;
			case NotationPackage.SHAPE_STYLE__STRIKE_THROUGH:
				setStrikeThrough(STRIKE_THROUGH_EDEFAULT);
				return;
			case NotationPackage.SHAPE_STYLE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case NotationPackage.SHAPE_STYLE__FILL_COLOR:
				setFillColor(FILL_COLOR_EDEFAULT);
				return;
			case NotationPackage.SHAPE_STYLE__TRANSPARENCY:
				setTransparency(TRANSPARENCY_EDEFAULT);
				return;
			case NotationPackage.SHAPE_STYLE__GRADIENT:
				setGradient(GRADIENT_EDEFAULT);
				return;
			case NotationPackage.SHAPE_STYLE__LINE_COLOR:
				setLineColor(LINE_COLOR_EDEFAULT);
				return;
			case NotationPackage.SHAPE_STYLE__LINE_WIDTH:
				setLineWidth(LINE_WIDTH_EDEFAULT);
				return;
			case NotationPackage.SHAPE_STYLE__ROUNDED_BENDPOINTS_RADIUS:
				setRoundedBendpointsRadius(ROUNDED_BENDPOINTS_RADIUS_EDEFAULT);
				return;
		}
		eDynamicUnset(featureID);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean eIsSet(int featureID) {
		switch (featureID) {
			case NotationPackage.SHAPE_STYLE__FONT_COLOR:
				return fontColor != FONT_COLOR_EDEFAULT;
			case NotationPackage.SHAPE_STYLE__FONT_NAME:
				return FONT_NAME_EDEFAULT == null ? fontName != null : !FONT_NAME_EDEFAULT.equals(fontName);
			case NotationPackage.SHAPE_STYLE__FONT_HEIGHT:
				return fontHeight != FONT_HEIGHT_EDEFAULT;
			case NotationPackage.SHAPE_STYLE__BOLD:
				return ((eFlags & BOLD_EFLAG) != 0) != BOLD_EDEFAULT;
			case NotationPackage.SHAPE_STYLE__ITALIC:
				return ((eFlags & ITALIC_EFLAG) != 0) != ITALIC_EDEFAULT;
			case NotationPackage.SHAPE_STYLE__UNDERLINE:
				return ((eFlags & UNDERLINE_EFLAG) != 0) != UNDERLINE_EDEFAULT;
			case NotationPackage.SHAPE_STYLE__STRIKE_THROUGH:
				return ((eFlags & STRIKE_THROUGH_EFLAG) != 0) != STRIKE_THROUGH_EDEFAULT;
			case NotationPackage.SHAPE_STYLE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case NotationPackage.SHAPE_STYLE__FILL_COLOR:
				return fillColor != FILL_COLOR_EDEFAULT;
			case NotationPackage.SHAPE_STYLE__TRANSPARENCY:
				return transparency != TRANSPARENCY_EDEFAULT;
			case NotationPackage.SHAPE_STYLE__GRADIENT:
				return GRADIENT_EDEFAULT == null ? gradient != null : !GRADIENT_EDEFAULT.equals(gradient);
			case NotationPackage.SHAPE_STYLE__LINE_COLOR:
				return lineColor != LINE_COLOR_EDEFAULT;
			case NotationPackage.SHAPE_STYLE__LINE_WIDTH:
				return lineWidth != LINE_WIDTH_EDEFAULT;
			case NotationPackage.SHAPE_STYLE__ROUNDED_BENDPOINTS_RADIUS:
				return roundedBendpointsRadius != ROUNDED_BENDPOINTS_RADIUS_EDEFAULT;
		}
		return eDynamicIsSet(featureID);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == DescriptionStyle.class) {
			switch (derivedFeatureID) {
				case NotationPackage.SHAPE_STYLE__DESCRIPTION: return NotationPackage.DESCRIPTION_STYLE__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == FillStyle.class) {
			switch (derivedFeatureID) {
				case NotationPackage.SHAPE_STYLE__FILL_COLOR: return NotationPackage.FILL_STYLE__FILL_COLOR;
				case NotationPackage.SHAPE_STYLE__TRANSPARENCY: return NotationPackage.FILL_STYLE__TRANSPARENCY;
				case NotationPackage.SHAPE_STYLE__GRADIENT: return NotationPackage.FILL_STYLE__GRADIENT;
				default: return -1;
			}
		}
		if (baseClass == LineStyle.class) {
			switch (derivedFeatureID) {
				case NotationPackage.SHAPE_STYLE__LINE_COLOR: return NotationPackage.LINE_STYLE__LINE_COLOR;
				case NotationPackage.SHAPE_STYLE__LINE_WIDTH: return NotationPackage.LINE_STYLE__LINE_WIDTH;
				default: return -1;
			}
		}
		if (baseClass == RoundedCornersStyle.class) {
			switch (derivedFeatureID) {
				case NotationPackage.SHAPE_STYLE__ROUNDED_BENDPOINTS_RADIUS: return NotationPackage.ROUNDED_CORNERS_STYLE__ROUNDED_BENDPOINTS_RADIUS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == DescriptionStyle.class) {
			switch (baseFeatureID) {
				case NotationPackage.DESCRIPTION_STYLE__DESCRIPTION: return NotationPackage.SHAPE_STYLE__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == FillStyle.class) {
			switch (baseFeatureID) {
				case NotationPackage.FILL_STYLE__FILL_COLOR: return NotationPackage.SHAPE_STYLE__FILL_COLOR;
				case NotationPackage.FILL_STYLE__TRANSPARENCY: return NotationPackage.SHAPE_STYLE__TRANSPARENCY;
				case NotationPackage.FILL_STYLE__GRADIENT: return NotationPackage.SHAPE_STYLE__GRADIENT;
				default: return -1;
			}
		}
		if (baseClass == LineStyle.class) {
			switch (baseFeatureID) {
				case NotationPackage.LINE_STYLE__LINE_COLOR: return NotationPackage.SHAPE_STYLE__LINE_COLOR;
				case NotationPackage.LINE_STYLE__LINE_WIDTH: return NotationPackage.SHAPE_STYLE__LINE_WIDTH;
				default: return -1;
			}
		}
		if (baseClass == RoundedCornersStyle.class) {
			switch (baseFeatureID) {
				case NotationPackage.ROUNDED_CORNERS_STYLE__ROUNDED_BENDPOINTS_RADIUS: return NotationPackage.SHAPE_STYLE__ROUNDED_BENDPOINTS_RADIUS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (description: "); //$NON-NLS-1$
		result.append(description);
		result.append(", fillColor: "); //$NON-NLS-1$
		result.append(fillColor);
		result.append(", transparency: "); //$NON-NLS-1$
		result.append(transparency);
		result.append(", gradient: "); //$NON-NLS-1$
		result.append(gradient);
		result.append(", lineColor: "); //$NON-NLS-1$
		result.append(lineColor);
		result.append(", lineWidth: "); //$NON-NLS-1$
		result.append(lineWidth);
		result.append(", roundedBendpointsRadius: "); //$NON-NLS-1$
		result.append(roundedBendpointsRadius);
		result.append(')');
		return result.toString();
	}

} //ShapeStyleImpl
