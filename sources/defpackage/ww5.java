package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ww5  reason: default package */
public final class ww5 extends ffe implements a66 {
    public final /* synthetic */ yw5 X;
    public final /* synthetic */ String Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ww5(yw5 yw5, String str, Continuation continuation) {
        super(2, continuation);
        this.X = yw5;
        this.Y = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ww5) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ww5(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        wha wha = (wha) this.X.Y.getValue();
        wha.h(this.Y);
        wha.e(new kia(woc.j));
        wha.i();
        return e5f.a;
    }
}
