package defpackage;

import java.util.concurrent.Executor;

/* renamed from: lq1  reason: default package */
public final class lq1 {
    public Object a;
    public oq1 b;
    public nic c;
    public boolean d;

    public final void a(Runnable runnable, Executor executor) {
        nic nic = this.c;
        if (nic != null) {
            nic.d(runnable, executor);
        }
    }

    public final boolean b(Object obj) {
        boolean z = true;
        this.d = true;
        oq1 oq1 = this.b;
        if (oq1 == null || !oq1.b.i(obj)) {
            z = false;
        }
        if (z) {
            this.a = null;
            this.b = null;
            this.c = null;
        }
        return z;
    }

    public final void c() {
        this.d = true;
        oq1 oq1 = this.b;
        if (oq1 != null && oq1.b.cancel(true)) {
            this.a = null;
            this.b = null;
            this.c = null;
        }
    }

    public final boolean d(Throwable th) {
        boolean z = true;
        this.d = true;
        oq1 oq1 = this.b;
        if (oq1 == null || !oq1.b.j(th)) {
            z = false;
        }
        if (z) {
            this.a = null;
            this.b = null;
            this.c = null;
        }
        return z;
    }

    public final void finalize() {
        nic nic;
        oq1 oq1 = this.b;
        if (oq1 != null) {
            nq1 nq1 = oq1.b;
            if (!nq1.isDone()) {
                nq1.j(new s0("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a, 3));
            }
        }
        if (!this.d && (nic = this.c) != null) {
            nic.i((Object) null);
        }
    }
}
