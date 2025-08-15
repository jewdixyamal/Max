package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: oh7  reason: default package */
public final class oh7 extends dle {
    public static final l12 u0 = new l12(Float.class, "animationFraction", 8);
    public final wb5 X;
    public final xh7 Y;
    public int Z = 1;
    public ObjectAnimator o;
    public boolean s0;
    public float t0;

    public oh7(xh7 xh7) {
        super(3);
        this.Y = xh7;
        this.X = new wb5();
    }

    public final void S() {
        h0();
    }

    public final void a0(rj0 rj0) {
    }

    public final void c0() {
    }

    public final void e0() {
        if (this.o == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, u0, new float[]{0.0f, 1.0f});
            this.o = ofFloat;
            ofFloat.setDuration(333);
            this.o.setInterpolator((TimeInterpolator) null);
            this.o.setRepeatCount(-1);
            this.o.addListener(new h6(7, (Object) this));
        }
        h0();
        this.o.start();
    }

    public final void f0() {
    }

    public final void h0() {
        this.s0 = true;
        this.Z = 1;
        Iterator it = ((ArrayList) this.c).iterator();
        while (it.hasNext()) {
            vq4 vq4 = (vq4) it.next();
            xh7 xh7 = this.Y;
            vq4.c = xh7.c[0];
            vq4.d = xh7.g / 2;
        }
    }

    public final void x() {
        ObjectAnimator objectAnimator = this.o;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }
}
