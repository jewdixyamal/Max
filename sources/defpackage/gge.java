package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: gge  reason: default package */
public final class gge extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ige Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gge(ige ige, Continuation continuation) {
        super(2, continuation);
        this.Y = ige;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gge) n((iy8) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        gge gge = new gge(this.Y, continuation);
        gge.X = obj;
        return gge;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        iy8 iy8 = (iy8) this.X;
        int i = iy8.d;
        return (i == 2 || i == 9) ? c37.c(((kw3) this.Y.d.getValue()).a(iy8)) : new qn5(3, iy8);
    }
}
