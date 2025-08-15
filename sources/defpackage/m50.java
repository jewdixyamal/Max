package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: m50  reason: default package */
public final class m50 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ p50 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m50(p50 p50, Continuation continuation) {
        super(2, continuation);
        this.Y = p50;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((m50) n((v50) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        m50 m50 = new m50(this.Y, continuation);
        m50.X = obj;
        return m50;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        v50 v50 = (v50) this.X;
        p50 p50 = this.Y;
        p50.Q0 = v50;
        if (v50 != null) {
            if (tpa.f(v50.a, p50.O0)) {
                vu4 vu4 = vu4.a;
                l30 l30 = v50.c;
                if (tpa.f(l30, vu4)) {
                    p50.D0.c(0.0f, false);
                }
                p50.d(l30);
                return e5f.a;
            }
        }
        p50.d(o84.c);
        return e5f.a;
    }
}
