package defpackage;

import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.concurrent.CancellationException;

/* renamed from: et7  reason: default package */
public final class et7 extends a14 {
    public final /* synthetic */ int j;

    public /* synthetic */ et7(int i, byte b) {
        this.j = i;
    }

    private final void U(String str, String str2) {
    }

    private final void V(String str, String str2, Throwable th) {
    }

    private final void W(String str, String str2) {
    }

    private final void X(String str, String str2, Throwable th) {
    }

    private final void Y(String str, String str2) {
    }

    private final void Z(String str, CancellationException cancellationException) {
    }

    private final void a0() {
    }

    private final void b0(String str, String str2) {
    }

    private final void c0(String str, String str2, RuntimeException runtimeException) {
    }

    public final void Q() {
        switch (this.j) {
            case 0:
                return;
            default:
                hm9.h0(ForceStopRunnable$BroadcastReceiver.a, "Rescheduling alarm that keeps track of force-stops.", new Object[0]);
                return;
        }
    }

    public final void R(String str, String str2) {
        switch (this.j) {
            case 0:
                return;
            default:
                hm9.m0(str, str2, new Object[0]);
                return;
        }
    }

    public final void S(String str, String str2, RuntimeException runtimeException) {
        switch (this.j) {
            case 0:
                return;
            default:
                hm9.l0(str, str2, runtimeException);
                return;
        }
    }

    public final void n(String str, String str2) {
        switch (this.j) {
            case 0:
                return;
            default:
                hm9.m(str, str2, new Object[0]);
                return;
        }
    }

    public final void o(String str, String str2, Throwable th) {
        switch (this.j) {
            case 0:
                return;
            default:
                hm9.l(str, str2, th);
                return;
        }
    }

    public final void q(String str, String str2) {
        switch (this.j) {
            case 0:
                return;
            default:
                hm9.p(str, str2, (Throwable) null);
                return;
        }
    }

    public final void r(String str, String str2, Throwable th) {
        switch (this.j) {
            case 0:
                return;
            default:
                hm9.p(str, str2, th);
                return;
        }
    }

    public final void x(String str, String str2) {
        switch (this.j) {
            case 0:
                return;
            default:
                hm9.G(str, str2, (Throwable) null);
                return;
        }
    }

    public final void y(String str, CancellationException cancellationException) {
        switch (this.j) {
            case 0:
                return;
            default:
                hm9.G(v8g.D0, str, cancellationException);
                return;
        }
    }

    public et7(int i) {
        this.j = 0;
    }
}
