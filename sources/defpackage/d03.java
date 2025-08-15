package defpackage;

import kotlinx.coroutines.internal.DispatchedContinuation;

/* renamed from: d03  reason: default package */
public final class d03 extends k87 {
    public final /* synthetic */ int b;
    public final sy1 c;

    public /* synthetic */ d03(sy1 sy1, int i) {
        this.b = i;
        this.c = sy1;
    }

    public final boolean c() {
        switch (this.b) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void d(Throwable th) {
        switch (this.b) {
            case 0:
                z87 z87 = this.a;
                if (z87 == null) {
                    z87 = null;
                }
                sy1 sy1 = this.c;
                Throwable k = sy1.k(z87);
                if (!(!sy1.r() ? false : ((DispatchedContinuation) sy1.a).postponeCancellation$kotlinx_coroutines_core(k))) {
                    sy1.cancel(k);
                    if (!sy1.r()) {
                        sy1.h();
                        return;
                    }
                    return;
                }
                return;
            default:
                z87 z872 = this.a;
                if (z872 == null) {
                    z872 = null;
                }
                Object state$kotlinx_coroutines_core = z872.getState$kotlinx_coroutines_core();
                boolean z = state$kotlinx_coroutines_core instanceof lb3;
                sy1 sy12 = this.c;
                if (z) {
                    sy12.resumeWith(new njc(((lb3) state$kotlinx_coroutines_core).a));
                    return;
                } else {
                    sy12.resumeWith(a97.a(state$kotlinx_coroutines_core));
                    return;
                }
        }
    }
}
