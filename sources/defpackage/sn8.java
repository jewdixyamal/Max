package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: sn8  reason: default package */
public final class sn8 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ long Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sn8(long j, Continuation continuation) {
        super(2, continuation);
        this.Y = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sn8) n((uj3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        sn8 sn8 = new sn8(this.Y, continuation);
        sn8.X = obj;
        return sn8;
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
