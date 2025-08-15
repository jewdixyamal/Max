package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import java.util.WeakHashMap;

/* renamed from: d18  reason: default package */
public final class d18 {
    public final MaterialButton a;
    public gjd b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public PorterDuff.Mode i;
    public ColorStateList j;
    public ColorStateList k;
    public ColorStateList l;
    public q18 m;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public boolean q;
    public boolean r = true;
    public RippleDrawable s;
    public int t;

    public d18(MaterialButton materialButton, gjd gjd) {
        this.a = materialButton;
        this.b = gjd;
    }

    public final rjd a() {
        RippleDrawable rippleDrawable = this.s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.s.getNumberOfLayers() > 2 ? (rjd) this.s.getDrawable(2) : (rjd) this.s.getDrawable(1);
    }

    public final q18 b(boolean z) {
        RippleDrawable rippleDrawable = this.s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (q18) ((LayerDrawable) ((InsetDrawable) this.s.getDrawable(0)).getDrawable()).getDrawable(z ^ true ? 1 : 0);
    }

    public final void c(gjd gjd) {
        this.b = gjd;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(gjd);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(gjd);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(gjd);
        }
    }

    public final void d(int i2, int i3) {
        WeakHashMap weakHashMap = zmf.a;
        MaterialButton materialButton = this.a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i4 = this.e;
        int i5 = this.f;
        this.f = i3;
        this.e = i2;
        if (!this.o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i2) - i4, paddingEnd, (paddingBottom + i3) - i5);
    }

    public final void e() {
        q18 q18 = new q18(this.b);
        MaterialButton materialButton = this.a;
        q18.j(materialButton.getContext());
        aq4.h(q18, this.j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            aq4.i(q18, mode);
        }
        ColorStateList colorStateList = this.k;
        q18.a.k = (float) this.h;
        q18.invalidateSelf();
        q18.n(colorStateList);
        q18 q182 = new q18(this.b);
        q182.setTint(0);
        float f2 = (float) this.h;
        int z = this.n ? mr0.z(materialButton, tsb.colorSurface) : 0;
        q182.a.k = f2;
        q182.invalidateSelf();
        q182.n(ColorStateList.valueOf(z));
        q18 q183 = new q18(this.b);
        this.m = q183;
        aq4.g(q183, -1);
        ColorStateList colorStateList2 = this.l;
        if (colorStateList2 == null) {
            colorStateList2 = ColorStateList.valueOf(0);
        }
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList2, new InsetDrawable(new LayerDrawable(new Drawable[]{q182, q18}), this.c, this.e, this.d, this.f), this.m);
        this.s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        q18 b2 = b(false);
        if (b2 != null) {
            b2.k((float) this.t);
            b2.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        int i2 = 0;
        q18 b2 = b(false);
        q18 b3 = b(true);
        if (b2 != null) {
            ColorStateList colorStateList = this.k;
            b2.a.k = (float) this.h;
            b2.invalidateSelf();
            b2.n(colorStateList);
            if (b3 != null) {
                float f2 = (float) this.h;
                if (this.n) {
                    i2 = mr0.z(this.a, tsb.colorSurface);
                }
                b3.a.k = f2;
                b3.invalidateSelf();
                b3.n(ColorStateList.valueOf(i2));
            }
        }
    }
}
