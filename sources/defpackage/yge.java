package defpackage;

import android.graphics.drawable.GradientDrawable;

/* renamed from: yge  reason: default package */
public final class yge {
    public final GradientDrawable a;
    public final GradientDrawable b;
    public final GradientDrawable c;
    public final GradientDrawable d;

    public yge(GradientDrawable gradientDrawable, GradientDrawable gradientDrawable2, GradientDrawable gradientDrawable3, GradientDrawable gradientDrawable4) {
        this.a = gradientDrawable;
        this.b = gradientDrawable2;
        this.c = gradientDrawable3;
        this.d = gradientDrawable4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yge)) {
            return false;
        }
        yge yge = (yge) obj;
        return tpa.f(this.a, yge.a) && tpa.f(this.b, yge.b) && tpa.f(this.c, yge.c) && tpa.f(this.d, yge.d);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.d.hashCode() + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "StateDrawable(enabledChecked=" + this.a + ", enabledUnchecked=" + this.b + ", disabledChecked=" + this.c + ", disabledUnchecked=" + this.d + ")";
    }
}
