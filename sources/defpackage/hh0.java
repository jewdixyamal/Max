package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: hh0  reason: default package */
public final class hh0 extends ffe implements a66 {
    public final /* synthetic */ vg0 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hh0(vg0 vg0, Continuation continuation) {
        super(2, continuation);
        this.X = vg0;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hh0) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new hh0(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        return Boolean.valueOf(!((Boolean) this.X.c().invoke()).booleanValue());
    }
}
