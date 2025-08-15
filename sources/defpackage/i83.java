package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: i83  reason: default package */
public final class i83 extends ffe implements a66 {
    public final /* synthetic */ m83 X;
    public final /* synthetic */ y73 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i83(m83 m83, y73 y73, Continuation continuation) {
        super(2, continuation);
        this.X = m83;
        this.Y = y73;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((i83) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new i83(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        bc7[] bc7Arr = m83.m;
        return ((jz2) ((iy2) this.X.f.getValue())).m(((x73) this.Y).a).a.getValue();
    }
}
