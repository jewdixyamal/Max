package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* renamed from: i8a  reason: default package */
public final class i8a implements ra2 {
    public final je7 a;
    public final kld b;

    public i8a(kke kke, je7 je7, ox3 ox3) {
        this.a = je7;
        ContextScope a2 = j1e.a(((w9a) kke).a().limitedParallelism(1, "AnimojiVerifier").plus(ox3));
        kld b2 = lld.b(0, 10, 0, 5);
        this.b = b2;
        int i = ft4.o;
        od2.L(new zn5(od2.x(nu0.Q(b2, z7.R(1, kt4.SECONDS))), new v59(2, this, i8a.class, "internalVerify", "internalVerify(Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 2), 5), a2);
    }
}
