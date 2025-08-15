package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: dg0  reason: default package */
public final class dg0 {
    public final cg0 a;
    public final cg0 b = new cg0();
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final int i;
    public final int j;
    public final int k;

    public dg0(int i2, int i3, Context context) {
        AttributeSet attributeSet;
        int i4;
        int next;
        cg0 cg0 = new cg0();
        int i5 = cg0.a;
        if (i5 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i5);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                } else if (TextUtils.equals(xml.getName(), "badge")) {
                    AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                    i4 = asAttributeSet.getStyleAttribute();
                    attributeSet = asAttributeSet;
                } else {
                    throw new XmlPullParserException("Must have a <" + "badge" + "> start tag");
                }
            } catch (IOException | XmlPullParserException e2) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i5));
                notFoundException.initCause(e2);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            i4 = 0;
        }
        TypedArray d2 = sre.d(context, attributeSet, z2c.Badge, i2, i4 == 0 ? i3 : i4, new int[0]);
        Resources resources = context.getResources();
        this.c = (float) d2.getDimensionPixelSize(z2c.Badge_badgeRadius, -1);
        this.i = context.getResources().getDimensionPixelSize(stb.mtrl_badge_horizontal_edge_offset);
        this.j = context.getResources().getDimensionPixelSize(stb.mtrl_badge_text_horizontal_edge_offset);
        this.d = (float) d2.getDimensionPixelSize(z2c.Badge_badgeWithTextRadius, -1);
        this.e = d2.getDimension(z2c.Badge_badgeWidth, resources.getDimension(stb.m3_badge_size));
        this.g = d2.getDimension(z2c.Badge_badgeWithTextWidth, resources.getDimension(stb.m3_badge_with_text_size));
        this.f = d2.getDimension(z2c.Badge_badgeHeight, resources.getDimension(stb.m3_badge_size));
        this.h = d2.getDimension(z2c.Badge_badgeWithTextHeight, resources.getDimension(stb.m3_badge_with_text_size));
        this.k = d2.getInt(z2c.Badge_offsetAlignmentMode, 1);
        cg0 cg02 = this.b;
        int i6 = cg0.t0;
        cg02.t0 = i6 == -2 ? 255 : i6;
        int i7 = cg0.v0;
        if (i7 != -2) {
            cg02.v0 = i7;
        } else if (d2.hasValue(z2c.Badge_number)) {
            this.b.v0 = d2.getInt(z2c.Badge_number, 0);
        } else {
            this.b.v0 = -1;
        }
        String str = cg0.u0;
        if (str != null) {
            this.b.u0 = str;
        } else if (d2.hasValue(z2c.Badge_badgeText)) {
            this.b.u0 = d2.getString(z2c.Badge_badgeText);
        }
        cg0 cg03 = this.b;
        cg03.z0 = cg0.z0;
        CharSequence charSequence = cg0.A0;
        cg03.A0 = charSequence == null ? context.getString(wzb.mtrl_badge_numberless_content_description) : charSequence;
        cg0 cg04 = this.b;
        int i8 = cg0.B0;
        cg04.B0 = i8 == 0 ? qzb.mtrl_badge_content_description : i8;
        int i9 = cg0.C0;
        cg04.C0 = i9 == 0 ? wzb.mtrl_exceed_max_badge_number_content_description : i9;
        Boolean bool = cg0.E0;
        cg04.E0 = Boolean.valueOf(bool == null || bool.booleanValue());
        cg0 cg05 = this.b;
        int i10 = cg0.w0;
        cg05.w0 = i10 == -2 ? d2.getInt(z2c.Badge_maxCharacterCount, -2) : i10;
        cg0 cg06 = this.b;
        int i11 = cg0.x0;
        cg06.x0 = i11 == -2 ? d2.getInt(z2c.Badge_maxNumber, -2) : i11;
        cg0 cg07 = this.b;
        Integer num = cg0.X;
        cg07.X = Integer.valueOf(num == null ? d2.getResourceId(z2c.Badge_badgeShapeAppearance, m2c.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        cg0 cg08 = this.b;
        Integer num2 = cg0.Y;
        cg08.Y = Integer.valueOf(num2 == null ? d2.getResourceId(z2c.Badge_badgeShapeAppearanceOverlay, 0) : num2.intValue());
        cg0 cg09 = this.b;
        Integer num3 = cg0.Z;
        cg09.Z = Integer.valueOf(num3 == null ? d2.getResourceId(z2c.Badge_badgeWithTextShapeAppearance, m2c.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        cg0 cg010 = this.b;
        Integer num4 = cg0.s0;
        cg010.s0 = Integer.valueOf(num4 == null ? d2.getResourceId(z2c.Badge_badgeWithTextShapeAppearanceOverlay, 0) : num4.intValue());
        cg0 cg011 = this.b;
        Integer num5 = cg0.b;
        cg011.b = Integer.valueOf(num5 == null ? ju0.q(context, d2, z2c.Badge_backgroundColor).getDefaultColor() : num5.intValue());
        cg0 cg012 = this.b;
        Integer num6 = cg0.o;
        cg012.o = Integer.valueOf(num6 == null ? d2.getResourceId(z2c.Badge_badgeTextAppearance, m2c.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = cg0.c;
        if (num7 != null) {
            this.b.c = num7;
        } else if (d2.hasValue(z2c.Badge_badgeTextColor)) {
            this.b.c = Integer.valueOf(ju0.q(context, d2, z2c.Badge_badgeTextColor).getDefaultColor());
        } else {
            int intValue = this.b.o.intValue();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(intValue, z2c.TextAppearance);
            obtainStyledAttributes.getDimension(z2c.TextAppearance_android_textSize, 0.0f);
            ColorStateList q = ju0.q(context, obtainStyledAttributes, z2c.TextAppearance_android_textColor);
            ju0.q(context, obtainStyledAttributes, z2c.TextAppearance_android_textColorHint);
            ju0.q(context, obtainStyledAttributes, z2c.TextAppearance_android_textColorLink);
            obtainStyledAttributes.getInt(z2c.TextAppearance_android_textStyle, 0);
            obtainStyledAttributes.getInt(z2c.TextAppearance_android_typeface, 1);
            int i12 = z2c.TextAppearance_fontFamily;
            i12 = !obtainStyledAttributes.hasValue(i12) ? z2c.TextAppearance_android_fontFamily : i12;
            obtainStyledAttributes.getResourceId(i12, 0);
            obtainStyledAttributes.getString(i12);
            obtainStyledAttributes.getBoolean(z2c.TextAppearance_textAllCaps, false);
            ju0.q(context, obtainStyledAttributes, z2c.TextAppearance_android_shadowColor);
            obtainStyledAttributes.getFloat(z2c.TextAppearance_android_shadowDx, 0.0f);
            obtainStyledAttributes.getFloat(z2c.TextAppearance_android_shadowDy, 0.0f);
            obtainStyledAttributes.getFloat(z2c.TextAppearance_android_shadowRadius, 0.0f);
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(intValue, z2c.MaterialTextAppearance);
            obtainStyledAttributes2.hasValue(z2c.MaterialTextAppearance_android_letterSpacing);
            obtainStyledAttributes2.getFloat(z2c.MaterialTextAppearance_android_letterSpacing, 0.0f);
            obtainStyledAttributes2.recycle();
            this.b.c = Integer.valueOf(q.getDefaultColor());
        }
        cg0 cg013 = this.b;
        Integer num8 = cg0.D0;
        cg013.D0 = Integer.valueOf(num8 == null ? d2.getInt(z2c.Badge_badgeGravity, 8388661) : num8.intValue());
        cg0 cg014 = this.b;
        Integer num9 = cg0.F0;
        cg014.F0 = Integer.valueOf(num9 == null ? d2.getDimensionPixelSize(z2c.Badge_badgeWidePadding, resources.getDimensionPixelSize(stb.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        cg0 cg015 = this.b;
        Integer num10 = cg0.G0;
        cg015.G0 = Integer.valueOf(num10 == null ? d2.getDimensionPixelSize(z2c.Badge_badgeVerticalPadding, resources.getDimensionPixelSize(stb.m3_badge_with_text_vertical_padding)) : num10.intValue());
        cg0 cg016 = this.b;
        Integer num11 = cg0.H0;
        cg016.H0 = Integer.valueOf(num11 == null ? d2.getDimensionPixelOffset(z2c.Badge_horizontalOffset, 0) : num11.intValue());
        cg0 cg017 = this.b;
        Integer num12 = cg0.I0;
        cg017.I0 = Integer.valueOf(num12 == null ? d2.getDimensionPixelOffset(z2c.Badge_verticalOffset, 0) : num12.intValue());
        cg0 cg018 = this.b;
        Integer num13 = cg0.J0;
        cg018.J0 = Integer.valueOf(num13 == null ? d2.getDimensionPixelOffset(z2c.Badge_horizontalOffsetWithText, cg018.H0.intValue()) : num13.intValue());
        cg0 cg019 = this.b;
        Integer num14 = cg0.K0;
        cg019.K0 = Integer.valueOf(num14 == null ? d2.getDimensionPixelOffset(z2c.Badge_verticalOffsetWithText, cg019.I0.intValue()) : num14.intValue());
        cg0 cg020 = this.b;
        Integer num15 = cg0.N0;
        cg020.N0 = Integer.valueOf(num15 == null ? d2.getDimensionPixelOffset(z2c.Badge_largeFontVerticalOffsetAdjustment, 0) : num15.intValue());
        cg0 cg021 = this.b;
        Integer num16 = cg0.L0;
        cg021.L0 = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        cg0 cg022 = this.b;
        Integer num17 = cg0.M0;
        cg022.M0 = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        cg0 cg023 = this.b;
        Boolean bool2 = cg0.O0;
        cg023.O0 = Boolean.valueOf(bool2 == null ? d2.getBoolean(z2c.Badge_autoAdjustToWithinGrandparentBounds, false) : bool2.booleanValue());
        d2.recycle();
        Locale locale = cg0.y0;
        if (locale == null) {
            this.b.y0 = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            this.b.y0 = locale;
        }
        this.a = cg0;
    }
}
