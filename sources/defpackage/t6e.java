package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: t6e  reason: default package */
public final class t6e extends ffe implements a66 {
    public int X;
    public final /* synthetic */ w6e Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t6e(w6e w6e, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = w6e;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((t6e) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new t6e(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        w6e w6e = this.Y;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7Arr = w6e.B0;
            db3 d = ((sc5) w6e.o.getValue()).d(this.Z, false);
            this.X = 1;
            if (s36.e(d, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        pnf.o(w6e.Z, new ued(woc.w, new eqe(hja.l)));
        return e5f.a;
    }
}
