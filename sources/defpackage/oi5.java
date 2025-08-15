package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: oi5  reason: default package */
public final class oi5 {
    public static final long[] h = {1, 2, 5, 10, 16};
    public final zy a;
    public final fd7 b;
    public final mi5 c;
    public final AtomicReference d = new AtomicReference((Object) null);
    public final Object e = new Object();
    public nx3 f;
    public final je7 g = tu0.r(2, new es3(15, this));

    public oi5(zy zyVar, fd7 fd7, mi5 mi5) {
        this.a = zyVar;
        this.b = fd7;
        this.c = mi5;
    }

    public final void a(qi9 qi9) {
        nx3 nx3;
        synchronized (this.e) {
            try {
                fd7 fd7 = this.b;
                if (fd7 != null) {
                    fd7.G("schedule update");
                }
                this.d.set(qi9);
                if (this.f == null) {
                    try {
                        nx3 = this.c.a().limitedParallelism(1, "file-prefs");
                    } catch (Throwable unused) {
                        nx3 = null;
                    }
                    this.f = nx3;
                }
                nx3 nx32 = this.f;
                if (nx32 != null) {
                    nx32.dispatch(hz4.a, (ni5) this.g.getValue());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
