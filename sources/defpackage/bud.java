package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import java.util.concurrent.CancellationException;

/* renamed from: bud  reason: default package */
public final class bud {
    public static final /* synthetic */ bc7[] e;
    public final sx3 a;
    public final je7 b = tu0.r(3, new xid(6));
    public final w4d c = mqd.D();
    public final w4d d = mqd.D();

    static {
        Class<bud> cls = bud.class;
        e = new bc7[]{new oi9(cls, "infiniteAnimationJob", "getInfiniteAnimationJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, cls, "stateAnimationJob", "getStateAnimationJob()Lkotlinx/coroutines/Job;")};
    }

    public bud(rg7 rg7) {
        this.a = rg7;
    }

    public static void a(l17 l17, int i) {
        if (l17 != null) {
            ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(((ptd) l17).H0.getCurrentTextColor()), Integer.valueOf(i)});
            ofObject.setDuration(200);
            ofObject.addUpdateListener(new vtd(l17, 1));
            ofObject.start();
        }
    }

    public final void b() {
        bc7[] bc7Arr = e;
        bc7 bc7 = bc7Arr[0];
        w4d w4d = this.c;
        x77 x77 = (x77) w4d.T0(this, bc7);
        if (x77 != null) {
            x77.cancel((CancellationException) null);
        }
        w4d.o1(this, bc7Arr[0], (Object) null);
    }
}
