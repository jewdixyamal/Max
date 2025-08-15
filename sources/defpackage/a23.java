package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import java.util.ArrayList;

/* renamed from: a23  reason: default package */
public final class a23 extends dle {
    public static final l12 A0;
    public static final int[] w0 = {0, 1350, 2700, 4050};
    public static final int[] x0 = {667, 2017, 3367, 4717};
    public static final int[] y0 = {1000, 2350, 3700, 5050};
    public static final l12 z0;
    public ObjectAnimator X;
    public final wb5 Y;
    public final e23 Z;
    public ObjectAnimator o;
    public int s0 = 0;
    public float t0;
    public float u0;
    public le v0 = null;

    static {
        Class<Float> cls = Float.class;
        z0 = new l12(cls, "animationFraction", 5);
        A0 = new l12(cls, "completeEndFraction", 6);
    }

    public a23(e23 e23) {
        super(1);
        this.Z = e23;
        this.Y = new wb5();
    }

    public final void S() {
        this.s0 = 0;
        ((vq4) ((ArrayList) this.c).get(0)).c = this.Z.c[0];
        this.u0 = 0.0f;
    }

    public final void a0(rj0 rj0) {
        this.v0 = rj0;
    }

    public final void c0() {
        ObjectAnimator objectAnimator = this.X;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            if (((tz6) this.b).isVisible()) {
                this.X.start();
            } else {
                x();
            }
        }
    }

    public final void e0() {
        if (this.o == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, z0, new float[]{0.0f, 1.0f});
            this.o = ofFloat;
            ofFloat.setDuration(5400);
            this.o.setInterpolator((TimeInterpolator) null);
            this.o.setRepeatCount(-1);
            this.o.addListener(new z13(this, 0));
        }
        if (this.X == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, A0, new float[]{0.0f, 1.0f});
            this.X = ofFloat2;
            ofFloat2.setDuration(333);
            this.X.setInterpolator(this.Y);
            this.X.addListener(new z13(this, 1));
        }
        this.s0 = 0;
        ((vq4) ((ArrayList) this.c).get(0)).c = this.Z.c[0];
        this.u0 = 0.0f;
        this.o.start();
    }

    public final void f0() {
        this.v0 = null;
    }

    public final void x() {
        ObjectAnimator objectAnimator = this.o;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }
}
