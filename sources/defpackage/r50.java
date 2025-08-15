package defpackage;

import android.os.PowerManager;
import kotlin.coroutines.Continuation;

/* renamed from: r50  reason: default package */
public final class r50 implements ipb {
    public final /* synthetic */ t50 a;

    public r50(t50 t50) {
        this.a = t50;
    }

    public final void a() {
        t50 t50 = this.a;
        if (!t50.a(t50)) {
            ch9 ch9 = t50.a;
            uh9 uh9 = (uh9) ch9;
            uh9.getClass();
            h30 h30 = new h30(1, 0, 2, 1, 0);
            a98 a98 = uh9.m;
            if (a98 != null) {
                a98.m0(h30, false);
            }
            jpb jpb = t50.b;
            jpb.getClass();
            try {
                PowerManager.WakeLock wakeLock = jpb.f;
                if (wakeLock != null) {
                    wakeLock.acquire();
                }
            } catch (Exception e) {
                hm9.r("ProximityHelperTag", e, e.getMessage(), new Object[0]);
            }
            uh9 uh92 = (uh9) ch9;
            uh92.getClass();
            j47.T(uh92.h, (lx3) null, (vx3) null, new qh9(((Number) ((uh9) ch9).t.a.getValue()).longValue() - 1000, uh92, (Continuation) null), 3);
        }
    }

    public final void b() {
        t50 t50 = this.a;
        if (!t50.a(t50)) {
            ch9 ch9 = t50.a;
            uh9 uh9 = (uh9) ch9;
            uh9.getClass();
            h30 h30 = new h30(1, 0, 1, 1, 0);
            a98 a98 = uh9.m;
            if (a98 != null) {
                a98.m0(h30, false);
            }
            t50.b.c();
            ((uh9) ch9).q();
        }
    }
}
