package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: vi  reason: default package */
public final class vi extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ gj Z;
    public final /* synthetic */ gi9 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vi(gj gjVar, gi9 gi9, Continuation continuation) {
        super(2, continuation);
        this.Z = gjVar;
        this.s0 = gi9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vi) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        vi viVar = new vi(this.Z, this.s0, continuation);
        viVar.Y = obj;
        return viVar;
    }

    public final Object o(Object obj) {
        Object obj2;
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx3 = (sx3) this.Y;
            gj gjVar = this.Z;
            gi9 gi9 = this.s0;
            pk pkVar = gjVar.a;
            au auVar = new au(8, oag.E(gi9));
            this.X = 1;
            obj = ((k4a) pkVar).J(auVar, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            try {
                od2.a0(obj);
            } catch (Throwable th) {
                obj2 = new njc(th);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        obj2 = (eu) obj;
        if (obj2 instanceof njc) {
            return null;
        }
        return obj2;
    }
}
