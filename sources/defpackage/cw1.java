package defpackage;

import android.animation.ValueAnimator;

/* renamed from: cw1  reason: default package */
public final /* synthetic */ class cw1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int X;
    public final /* synthetic */ float Y;
    public final /* synthetic */ float Z;
    public final /* synthetic */ ew1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int o;
    public final /* synthetic */ int s0;
    public final /* synthetic */ int t0;
    public final /* synthetic */ int u0;
    public final /* synthetic */ int v0;

    public /* synthetic */ cw1(ew1 ew1, int i, int i2, int i3, int i4, float f, float f2, int i5, int i6, int i7, int i8) {
        this.a = ew1;
        this.b = i;
        this.c = i2;
        this.o = i3;
        this.X = i4;
        this.Y = f;
        this.Z = f2;
        this.s0 = i5;
        this.t0 = i6;
        this.u0 = i7;
        this.v0 = i8;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ew1.b(this.a, this.b, this.c, this.o, this.X, this.Y, this.Z, this.s0, this.t0, this.u0, this.v0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
