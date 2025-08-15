package defpackage;

import android.os.SystemClock;
import kotlin.coroutines.Continuation;

/* renamed from: fs7  reason: default package */
public final class fs7 implements yp {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fs7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void b() {
    }

    public final void a() {
        switch (this.a) {
            case 0:
                js7.g((js7) this.b, false, 3);
                return;
            default:
                ((an9) this.b).i = SystemClock.elapsedRealtime();
                an9.g((an9) this.b, wuc.APPLICATION_BACKGROUND);
                return;
        }
    }

    public final void c() {
        switch (this.a) {
            case 0:
                return;
            default:
                an9 an9 = (an9) this.b;
                if (an9.i != 0) {
                    v1e v1e = (v1e) an9.l.get();
                    String str = an9.f;
                    ir6 ir6 = hm9.m;
                    if (ir6 != null && ir6.c()) {
                        us7 us7 = us7.X;
                        long j = an9.i;
                        ir6.d(us7, str, "Navigation stats. Try update session id on warmStart, lastTime:" + j + "|lastCondition:" + v1e, (Throwable) null);
                    }
                    if (!an9.e()) {
                        v1e.getClass();
                        if (v1e != v1e.b && v1e != v1e.c) {
                            j47.T(an9.e, (lx3) null, (vx3) null, new xm9(an9, (Continuation) null), 3);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
