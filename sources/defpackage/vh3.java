package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* renamed from: vh3  reason: default package */
public final class vh3 {
    public final q0e a;

    public vh3(kke kke, hbd hbd) {
        ContextScope a2 = j1e.a(((w9a) kke).a().limitedParallelism(1, "conn-events"));
        jbd jbd = (jbd) hbd;
        q0e a3 = r0e.a(Integer.valueOf(jbd.h));
        this.a = a3;
        od2.L(new zn5(c37.c(jbd.e), new vw(2, a3, ti9.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 15), 5), a2);
    }
}
