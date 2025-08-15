package defpackage;

/* renamed from: ccd  reason: default package */
public final class ccd extends e1 {
    public final boolean n(bm7 bm7) {
        t0 t0Var;
        bm7.getClass();
        Object obj = this.a;
        if (obj == null) {
            if (bm7.isDone()) {
                if (!k1.Y.j(this, (Object) null, k1.h(bm7))) {
                    return false;
                }
                k1.e(this, false);
            } else {
                z0 z0Var = new z0(this, bm7);
                if (k1.Y.j(this, (Object) null, z0Var)) {
                    try {
                        bm7.d(z0Var, nk4.a);
                    } catch (Throwable th) {
                        try {
                            t0Var = new t0(th);
                        } catch (Error | Exception unused) {
                            t0Var = t0.b;
                        }
                        k1.Y.j(this, z0Var, t0Var);
                    }
                } else {
                    obj = this.a;
                }
            }
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        bm7.cancel(((q0) obj).a);
        return false;
    }
}
