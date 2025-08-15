package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* renamed from: gjd  reason: default package */
public final class gjd {
    public hm9 a = new rnc();
    public hm9 b = new rnc();
    public hm9 c = new rnc();
    public hm9 d = new rnc();
    public hx3 e = new a0(0.0f);
    public hx3 f = new a0(0.0f);
    public hx3 g = new a0(0.0f);
    public hx3 h = new a0(0.0f);
    public vu4 i = new Object();
    public vu4 j = new Object();
    public vu4 k = new Object();
    public vu4 l = new Object();

    public static i8g a(Context context, int i2, int i3, a0 a0Var) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i2);
        if (i3 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i3);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(z2c.ShapeAppearance);
        try {
            int i4 = obtainStyledAttributes.getInt(z2c.ShapeAppearance_cornerFamily, 0);
            int i5 = obtainStyledAttributes.getInt(z2c.ShapeAppearance_cornerFamilyTopLeft, i4);
            int i6 = obtainStyledAttributes.getInt(z2c.ShapeAppearance_cornerFamilyTopRight, i4);
            int i7 = obtainStyledAttributes.getInt(z2c.ShapeAppearance_cornerFamilyBottomRight, i4);
            int i8 = obtainStyledAttributes.getInt(z2c.ShapeAppearance_cornerFamilyBottomLeft, i4);
            hx3 c2 = c(obtainStyledAttributes, z2c.ShapeAppearance_cornerSize, a0Var);
            hx3 c3 = c(obtainStyledAttributes, z2c.ShapeAppearance_cornerSizeTopLeft, c2);
            hx3 c4 = c(obtainStyledAttributes, z2c.ShapeAppearance_cornerSizeTopRight, c2);
            hx3 c5 = c(obtainStyledAttributes, z2c.ShapeAppearance_cornerSizeBottomRight, c2);
            hx3 c6 = c(obtainStyledAttributes, z2c.ShapeAppearance_cornerSizeBottomLeft, c2);
            i8g i8g = new i8g();
            hm9 f2 = nu0.f(i5);
            i8g.a = f2;
            i8g.d(f2);
            i8g.e = c3;
            hm9 f3 = nu0.f(i6);
            i8g.b = f3;
            i8g.d(f3);
            i8g.f = c4;
            hm9 f4 = nu0.f(i7);
            i8g.c = f4;
            i8g.d(f4);
            i8g.g = c5;
            hm9 f5 = nu0.f(i8);
            i8g.d = f5;
            i8g.d(f5);
            i8g.h = c6;
            return i8g;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static i8g b(Context context, AttributeSet attributeSet, int i2, int i3) {
        a0 a0Var = new a0((float) 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2c.MaterialShape, i2, i3);
        int resourceId = obtainStyledAttributes.getResourceId(z2c.MaterialShape_shapeAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(z2c.MaterialShape_shapeAppearanceOverlay, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, a0Var);
    }

    public static hx3 c(TypedArray typedArray, int i2, hx3 hx3) {
        TypedValue peekValue = typedArray.peekValue(i2);
        if (peekValue == null) {
            return hx3;
        }
        int i3 = peekValue.type;
        return i3 == 5 ? new a0((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i3 == 6 ? new nfc(peekValue.getFraction(1.0f, 1.0f)) : hx3;
    }

    public final boolean d(RectF rectF) {
        Class<vu4> cls = vu4.class;
        boolean z = this.l.getClass().equals(cls) && this.j.getClass().equals(cls) && this.i.getClass().equals(cls) && this.k.getClass().equals(cls);
        float a2 = this.e.a(rectF);
        return z && ((this.f.a(rectF) > a2 ? 1 : (this.f.a(rectF) == a2 ? 0 : -1)) == 0 && (this.h.a(rectF) > a2 ? 1 : (this.h.a(rectF) == a2 ? 0 : -1)) == 0 && (this.g.a(rectF) > a2 ? 1 : (this.g.a(rectF) == a2 ? 0 : -1)) == 0) && ((this.b instanceof rnc) && (this.a instanceof rnc) && (this.c instanceof rnc) && (this.d instanceof rnc));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [i8g, java.lang.Object] */
    public final i8g e() {
        ? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        obj.h = this.h;
        obj.i = this.i;
        obj.j = this.j;
        obj.k = this.k;
        obj.l = this.l;
        return obj;
    }
}
