package defpackage;

/* renamed from: c1  reason: default package */
public final class c1 extends v3c {
    public final void C(j1 j1Var, j1 j1Var2) {
        j1Var.b = j1Var2;
    }

    public final void D(j1 j1Var, Thread thread) {
        j1Var.a = thread;
    }

    public final boolean c(l1 l1Var, w0 w0Var, w0 w0Var2) {
        synchronized (l1Var) {
            try {
                if (l1Var.b != w0Var) {
                    return false;
                }
                l1Var.b = w0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(l1 l1Var, Object obj, Object obj2) {
        synchronized (l1Var) {
            try {
                if (l1Var.a != obj) {
                    return false;
                }
                l1Var.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean e(l1 l1Var, j1 j1Var, j1 j1Var2) {
        synchronized (l1Var) {
            try {
                if (l1Var.c != j1Var) {
                    return false;
                }
                l1Var.c = j1Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
