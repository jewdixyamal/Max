package defpackage;

import android.view.ViewGroup;
import java.util.concurrent.ExecutorService;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: kjb  reason: default package */
public final class kjb extends ppd {
    public final jjb X;

    public kjb(ExecutorService executorService, jjb jjb) {
        super(executorService);
        this.X = jjb;
    }

    /* renamed from: J */
    public final void r(kgb kgb, int i) {
        kgb kgb2 = kgb;
        efb efb = (efb) ((ol7) C(i));
        kgb2.A(efb);
        if (efb instanceof x6) {
            n6 n6Var = kgb2 instanceof n6 ? (n6) kgb2 : null;
            if (n6Var != null) {
                ((ufd) n6Var.a).setOnSwitchListener(new qz7((Object) new v59(2, this.X, jjb.class, "onChecked", "onChecked(JZ)V", 0, 11), 2, (Object) new om8(1, this.X, jjb.class, "onDisabledClick", "onDisabledClick(J)V", 0, 13)));
            }
        }
    }

    public final int l(int i) {
        return ((efb) ((ol7) C(i))).l();
    }

    public final dec t(ViewGroup viewGroup, int i) {
        int i2 = 536870911 & i;
        if (dy7.o(i2, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY)) {
            return new n6(viewGroup.getContext());
        }
        if (dy7.o(i2, 2048)) {
            return new g2b(viewGroup.getContext(), 1);
        }
        throw new IllegalStateException(("unknown item viewType: " + i).toString());
    }
}
