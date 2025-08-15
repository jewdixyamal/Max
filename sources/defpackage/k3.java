package defpackage;

/* renamed from: k3  reason: default package */
public final class k3 extends mqd {
    public final void B(l3 l3Var, l3 l3Var2) {
        l3Var.b = l3Var2;
    }

    public final void C(l3 l3Var, Thread thread) {
        l3Var.a = thread;
    }

    public final boolean c(m3 m3Var, i3 i3Var, i3 i3Var2) {
        synchronized (m3Var) {
            try {
                if (m3Var.b != i3Var) {
                    return false;
                }
                m3Var.b = i3Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(m3 m3Var, Object obj, Object obj2) {
        synchronized (m3Var) {
            try {
                if (m3Var.a != obj) {
                    return false;
                }
                m3Var.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean e(m3 m3Var, l3 l3Var, l3 l3Var2) {
        synchronized (m3Var) {
            try {
                if (m3Var.c != l3Var) {
                    return false;
                }
                m3Var.c = l3Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
