package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: h00  reason: default package */
public final class h00 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ i00 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h00(i00 i00, Continuation continuation) {
        super(2, continuation);
        this.Y = i00;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((h00) n((r5c) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        h00 h00 = new h00(this.Y, continuation);
        h00.X = obj;
        return h00;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        i00 i00 = this.Y;
        i00.e.m((Object) null, i00.a((r5c) this.X));
        return e5f.a;
    }
}
