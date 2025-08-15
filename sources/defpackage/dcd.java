package defpackage;

/* renamed from: dcd  reason: default package */
public final class dcd extends l1 {
    public final boolean j(Object obj) {
        if (obj == null) {
            obj = l1.Z;
        }
        if (!l1.Y.d(this, (Object) null, obj)) {
            return false;
        }
        l1.b(this);
        return true;
    }

    public final boolean k(Throwable th) {
        if (!l1.Y.d(this, (Object) null, new u0(th))) {
            return false;
        }
        l1.b(this);
        return true;
    }

    public final boolean l(bm7 bm7) {
        a1 a1Var;
        u0 u0Var;
        bm7.getClass();
        Object obj = this.a;
        if (obj == null) {
            if (bm7.isDone()) {
                if (!l1.Y.d(this, (Object) null, l1.f(bm7))) {
                    return false;
                }
                l1.b(this);
            } else {
                a1Var = new a1(this, bm7);
                if (l1.Y.d(this, (Object) null, a1Var)) {
                    try {
                        bm7.d(a1Var, mk4.a);
                    } catch (Throwable unused) {
                        u0Var = u0.b;
                    }
                } else {
                    obj = this.a;
                }
            }
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        bm7.cancel(((r0) obj).a);
        return false;
        l1.Y.d(this, a1Var, u0Var);
        return true;
    }
}
