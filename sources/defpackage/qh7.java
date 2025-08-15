package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: qh7  reason: default package */
public final class qh7 extends dle {
    public static final int[] w0 = {533, 567, 850, 750};
    public static final int[] x0 = {1267, 1000, 333, 0};
    public static final l12 y0 = new l12(Float.class, "animationFraction", 9);
    public ObjectAnimator X;
    public final Interpolator[] Y;
    public final xh7 Z;
    public ObjectAnimator o;
    public int s0 = 0;
    public boolean t0;
    public float u0;
    public le v0 = null;

    public qh7(Context context, xh7 xh7) {
        super(2);
        this.Z = xh7;
        this.Y = new Interpolator[]{AnimationUtils.loadInterpolator(context, dsb.linear_indeterminate_line1_head_interpolator), AnimationUtils.loadInterpolator(context, dsb.linear_indeterminate_line1_tail_interpolator), AnimationUtils.loadInterpolator(context, dsb.linear_indeterminate_line2_head_interpolator), AnimationUtils.loadInterpolator(context, dsb.linear_indeterminate_line2_tail_interpolator)};
    }

    public final void S() {
        h0();
    }

    public final void a0(rj0 rj0) {
        this.v0 = rj0;
    }

    public final void c0() {
        ObjectAnimator objectAnimator = this.X;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            x();
            if (((tz6) this.b).isVisible()) {
                this.X.setFloatValues(new float[]{this.u0, 1.0f});
                this.X.setDuration((long) ((1.0f - this.u0) * 1800.0f));
                this.X.start();
            }
        }
    }

    public final void e0() {
        ObjectAnimator objectAnimator = this.o;
        l12 l12 = y0;
        if (objectAnimator == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, l12, new float[]{0.0f, 1.0f});
            this.o = ofFloat;
            ofFloat.setDuration(1800);
            this.o.setInterpolator((TimeInterpolator) null);
            this.o.setRepeatCount(-1);
            this.o.addListener(new ph7(this, 0));
        }
        if (this.X == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, l12, new float[]{1.0f});
            this.X = ofFloat2;
            ofFloat2.setDuration(1800);
            this.X.setInterpolator((TimeInterpolator) null);
            this.X.addListener(new ph7(this, 1));
        }
        h0();
        this.o.start();
    }

    public final void f0() {
        this.v0 = null;
    }

    public final void h0() {
        this.s0 = 0;
        Iterator it = ((ArrayList) this.c).iterator();
        while (it.hasNext()) {
            ((vq4) it.next()).c = this.Z.c[0];
        }
    }

    public final void x() {
        ObjectAnimator objectAnimator = this.o;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }
}
