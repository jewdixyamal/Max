package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: n0g  reason: default package */
public final class n0g extends ffe implements a66 {
    public int X;
    public final /* synthetic */ p0g Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n0g(p0g p0g, Continuation continuation) {
        super(2, continuation);
        this.Y = p0g;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((n0g) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new n0g(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        p0g p0g = this.Y;
        if (i == 0) {
            od2.a0(obj);
            mtf mtf = (mtf) p0g.Y.getValue();
            this.X = 1;
            mtf.getClass();
            if (ote.j(mtf.a, new itf(mtf, p0g.b, p0g.c), this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bc7[] bc7Arr = p0g.z0;
        p0g.q();
        return e5f.a;
    }
}
