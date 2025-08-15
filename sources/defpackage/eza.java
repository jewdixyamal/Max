package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: eza  reason: default package */
public final class eza extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ long Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eza(long j, Continuation continuation) {
        super(2, continuation);
        this.Y = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((eza) n((uj3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        eza eza = new eza(this.Y, continuation);
        eza.X = obj;
        return eza;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        uj3 uj3 = (uj3) this.X;
        long n = uj3.n();
        String d = uj3.d();
        String str = d == null ? "" : d;
        String p = uj3.p(kk0.a);
        return new rya(this.Y, n, uj3.m(), str, p == null ? "" : p);
    }
}
