package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: zv  reason: default package */
public final class zv extends ffe implements a66 {
    public int X;
    public final /* synthetic */ bx Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zv(bx bxVar, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = bxVar;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zv) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new zv(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            bx bxVar = this.Y;
            pfc pfc = bxVar.k;
            this.X = 1;
            obj = bx.c(bxVar, pfc, this.Z, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
