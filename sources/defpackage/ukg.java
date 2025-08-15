package defpackage;

import com.google.android.gms.tasks.DuplicateTaskCompletionException;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: ukg  reason: default package */
public final class ukg extends Task {
    public final Object a = new Object();
    public final td b = new td();
    public boolean c;
    public volatile boolean d;
    public Object e;
    public Exception f;

    public final ukg a(Executor executor, k3a k3a) {
        this.b.y(new gig(executor, k3a));
        q();
        return this;
    }

    public final ukg b(Executor executor, l3a l3a) {
        this.b.y(new gig(executor, l3a));
        q();
        return this;
    }

    public final ukg c(Executor executor, o3a o3a) {
        this.b.y(new gig(executor, o3a));
        q();
        return this;
    }

    public final ukg d(Executor executor, x3a x3a) {
        this.b.y(new gig(executor, x3a));
        q();
        return this;
    }

    public final Exception e() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    public final Object f() {
        Object obj;
        synchronized (this.a) {
            try {
                fp3.p("Task is not yet complete", this.c);
                if (!this.d) {
                    Exception exc = this.f;
                    if (exc == null) {
                        obj = this.e;
                    } else {
                        throw new RuntimeException(exc);
                    }
                } else {
                    throw new CancellationException("Task is already canceled.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final boolean g() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    public final boolean h() {
        boolean z;
        synchronized (this.a) {
            try {
                z = false;
                if (this.c && !this.d && this.f == null) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final ukg i(l3a l3a) {
        this.b.y(new gig((Executor) xne.a, l3a));
        q();
        return this;
    }

    public final ukg j(Executor executor, fu3 fu3) {
        ukg ukg = new ukg();
        this.b.y(new ogg(executor, fu3, ukg, 0));
        q();
        return ukg;
    }

    public final ukg k(Executor executor, fu3 fu3) {
        ukg ukg = new ukg();
        this.b.y(new ogg(executor, fu3, ukg, 1));
        q();
        return ukg;
    }

    public final ukg l(Executor executor, sbe sbe) {
        ukg ukg = new ukg();
        this.b.y(new gig(executor, sbe, ukg));
        q();
        return ukg;
    }

    public final void m(Exception exc) {
        fp3.o(exc, "Exception must not be null");
        synchronized (this.a) {
            p();
            this.c = true;
            this.f = exc;
        }
        this.b.z(this);
    }

    public final void n(Object obj) {
        synchronized (this.a) {
            p();
            this.c = true;
            this.e = obj;
        }
        this.b.z(this);
    }

    public final void o() {
        synchronized (this.a) {
            try {
                if (!this.c) {
                    this.c = true;
                    this.d = true;
                    this.b.z(this);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final void p() {
        IllegalStateException illegalStateException;
        if (this.c) {
            int i = DuplicateTaskCompletionException.a;
            if (g()) {
                Exception e2 = e();
                illegalStateException = new IllegalStateException("Complete with: ".concat(e2 == null ? !h() ? this.d ? "cancellation" : "unknown issue" : "result ".concat(String.valueOf(f())) : "failure"), e2);
            } else {
                illegalStateException = new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            throw illegalStateException;
        }
    }

    public final void q() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    this.b.z(this);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }
}
