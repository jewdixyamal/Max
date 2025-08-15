package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: dt5  reason: default package */
public final class dt5 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ et5 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dt5(et5 et5, Continuation continuation) {
        super(2, continuation);
        this.Y = et5;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((dt5) n((at5) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        dt5 dt5 = new dt5(this.Y, continuation);
        dt5.X = obj;
        return dt5;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        at5 at5 = (at5) this.X;
        et5 et5 = this.Y;
        at5 at52 = et5.d;
        if (at52 == null) {
            et5.d = at5;
        } else {
            et5.getClass();
            if (at52 != null && !at52.equals(at5)) {
                if (!tpa.f(at52.Y, at5.Y) || !tpa.f(at52.v0, at5.v0) || !tpa.f(at52.x0, at5.x0) || !tpa.f(at52.w0, at5.w0)) {
                    et5.a(ht2.a);
                }
                et5.d = at5;
            }
        }
        return e5f.a;
    }
}
