package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: p18  reason: default package */
public class p18 extends Drawable.ConstantState {
    public gjd a;
    public ew4 b;
    public ColorStateList c = null;
    public ColorStateList d = null;
    public final ColorStateList e = null;
    public ColorStateList f = null;
    public PorterDuff.Mode g = PorterDuff.Mode.SRC_IN;
    public Rect h = null;
    public final float i = 1.0f;
    public float j = 1.0f;
    public float k;
    public int l = 255;
    public float m = 0.0f;
    public float n = 0.0f;
    public final float o = 0.0f;
    public int p = 0;
    public int q = 0;
    public int r = 0;
    public final int s = 0;
    public final boolean t = false;
    public final Paint.Style u = Paint.Style.FILL_AND_STROKE;

    public p18(gjd gjd) {
        this.a = gjd;
        this.b = null;
    }

    public final int getChangingConfigurations() {
        return 0;
    }

    public Drawable newDrawable() {
        q18 q18 = new q18(this);
        q18.X = true;
        return q18;
    }

    public p18(p18 p18) {
        this.a = p18.a;
        this.b = p18.b;
        this.k = p18.k;
        this.c = p18.c;
        this.d = p18.d;
        this.g = p18.g;
        this.f = p18.f;
        this.l = p18.l;
        this.i = p18.i;
        this.r = p18.r;
        this.p = p18.p;
        this.t = p18.t;
        this.j = p18.j;
        this.m = p18.m;
        this.n = p18.n;
        this.o = p18.o;
        this.q = p18.q;
        this.s = p18.s;
        this.e = p18.e;
        this.u = p18.u;
        if (p18.h != null) {
            this.h = new Rect(p18.h);
        }
    }
}
