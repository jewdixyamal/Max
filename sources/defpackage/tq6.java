package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: tq6  reason: default package */
public final class tq6 extends AtomicReference implements zl4, jq6 {
    public final String X;
    public final xtc Y;
    public final f2a Z;
    public final je7 a;
    public final int b;
    public final String c;
    public final String o;
    public final AtomicBoolean s0 = new AtomicBoolean();
    public long t0;

    public tq6(f2a f2a, je7 je7, int i, String str, String str2, String str3, xtc xtc) {
        this.a = je7;
        this.b = i;
        this.c = str;
        this.o = str2;
        this.X = str3;
        this.Y = xtc;
        this.Z = f2a;
    }

    public final void a(boolean z) {
        if (this.s0.compareAndSet(false, true)) {
            xtc xtc = this.Y;
            if (!xtc.h()) {
                xtc.g();
            }
            if (z) {
                hm9.m("uq6", "cancelUpload", new Object[0]);
                bk5 bk5 = (bk5) get();
                if (bk5 != null) {
                    synchronized (bk5) {
                        try {
                            if (!bk5.b) {
                                if (bk5.a != null && !bk5.a.x0) {
                                    bk5.a.d();
                                }
                                bk5.b = true;
                            }
                        } catch (Throwable th) {
                            while (true) {
                                throw th;
                            }
                        }
                    }
                }
            }
        }
    }

    public final void b(String str, eq6 eq6) {
        if (!this.s0.get()) {
            this.Y.b(new v05((Object) this, (Object) str, (Object) eq6, 7));
        }
    }

    public final void g() {
        a(true);
    }

    public final boolean h() {
        return this.s0.get();
    }
}
