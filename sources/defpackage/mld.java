package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: mld  reason: default package */
public final class mld extends p3 {
    public long a;
    public sy1 b;

    public final boolean a(o3 o3Var) {
        kld kld = (kld) o3Var;
        if (this.a >= 0) {
            return false;
        }
        long j = kld.t0;
        if (j < kld.u0) {
            kld.u0 = j;
        }
        this.a = j;
        return true;
    }

    public final Continuation[] b(o3 o3Var) {
        long j = this.a;
        this.a = -1;
        this.b = null;
        return ((kld) o3Var).y(j);
    }
}
