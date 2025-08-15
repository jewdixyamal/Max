package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: zy6  reason: default package */
public final class zy6 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ fz6 Y;
    public final /* synthetic */ int Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zy6(fz6 fz6, int i, Continuation continuation) {
        super(2, continuation);
        this.Y = fz6;
        this.Z = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((zy6) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        zy6 zy6 = new zy6(this.Y, this.Z, continuation);
        zy6.X = obj;
        return zy6;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        sx3 sx3 = (sx3) this.X;
        fz6 fz6 = this.Y;
        vxd T = j47.T(sx3, (lx3) null, (vx3) null, new xy6(fz6, (Continuation) null), 3);
        int i = this.Z;
        T.invokeOnCompletion(new wy6(i, 0));
        j47.T(sx3, (lx3) null, (vx3) null, new yy6(fz6, (Continuation) null), 3).invokeOnCompletion(new wy6(i, 1));
        return e5f.a;
    }
}
