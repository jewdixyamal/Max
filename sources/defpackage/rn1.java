package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: rn1  reason: default package */
public final class rn1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ el1 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rn1(el1 el1, Continuation continuation) {
        super(2, continuation);
        this.Y = el1;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((rn1) n((dxe) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        rn1 rn1 = new rn1(this.Y, continuation);
        rn1.X = obj;
        return rn1;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        hm9.m(this.Y.getClass().getName(), ((dxe) this.X).toString(), new Object[0]);
        return e5f.a;
    }
}
