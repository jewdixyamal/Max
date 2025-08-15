package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ned  reason: default package */
public final class ned extends ffe implements a66 {
    public final /* synthetic */ ped X;
    public final /* synthetic */ long Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ned(ped ped, long j, Continuation continuation) {
        super(2, continuation);
        this.X = ped;
        this.Y = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ned) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ned(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        ped ped = this.X;
        e52 q = ((jz2) ((iy2) ped.X.getValue())).q(this.Y);
        if (q != null) {
            ihd.c.getClass();
            pnf.o(ped.y0, new c64(zr6.k(new StringBuilder(":profile?id="), q.a, "&type=local_chat&is_opened_from_dialog=false")));
        }
        return e5f.a;
    }
}
