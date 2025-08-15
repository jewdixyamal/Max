package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: fw  reason: default package */
public final class fw extends ffe implements a66 {
    public int X;
    public final /* synthetic */ bx Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fw(bx bxVar, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = bxVar;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fw) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new fw(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        bx bxVar = this.Y;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7Arr = bx.F;
            this.X = 1;
            obj = ((iy2) bxVar.p.getValue()).d(bxVar.a, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else if (i == 2) {
            od2.a0(obj);
            bxVar.r(this.Z);
            return e5f.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e52 e52 = (e52) obj;
        if (!e52.M()) {
            long j = e52.b.a;
            this.X = 2;
            if (((gb6) bxVar.x.getValue()).a(j, true, this) == tx3) {
                return tx3;
            }
        }
        bxVar.r(this.Z);
        return e5f.a;
    }
}
