package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;
import org.apache.http.HttpStatus;

/* renamed from: ci0  reason: default package */
public abstract class ci0 {
    public final kld a = lld.b(0, 0, 0, 7);
    public final ContextScope b;

    public ci0(kke kke) {
        this.b = j1e.a(((w9a) kke).a());
    }

    public final void a(it2 it2) {
        j47.T(this.b, (lx3) null, (vx3) null, new bi0(this, it2, (Continuation) null), 3);
    }

    public final zn5 b() {
        kld kld = this.a;
        int i = ft4.o;
        return nu0.e(kld, z7.R(HttpStatus.SC_MULTIPLE_CHOICES, kt4.MILLISECONDS), new ai0(0));
    }
}
