package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ws2  reason: default package */
public final class ws2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ long Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ws2(long j, Continuation continuation) {
        super(2, continuation);
        this.Y = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ws2) n((e52) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ws2 ws2 = new ws2(this.Y, continuation);
        ws2.X = obj;
        return ws2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        e52 e52 = (e52) this.X;
        long j = this.Y;
        long f = e52.f();
        String q = e52.q();
        String g = e52.g(kk0.a, jk0.a);
        if (g == null) {
            g = "";
        }
        e52.l0();
        return new rya(j, f, e52.x0, q, g);
    }
}
