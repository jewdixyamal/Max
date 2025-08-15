package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: jw  reason: default package */
public final class jw extends ffe implements a66 {
    public int X;
    public final /* synthetic */ bx Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jw(bx bxVar, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = bxVar;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((jw) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new jw(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        Object value;
        Object obj2;
        tx3 tx3 = tx3.a;
        int i = this.X;
        long j = this.Z;
        bx bxVar = this.Y;
        if (i == 0) {
            od2.a0(obj);
            pfc pfc = bxVar.k;
            this.X = 1;
            obj = bx.c(bxVar, pfc, j, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (((Number) obj).intValue() >= 0) {
            q0e q0e = bxVar.C;
            Object ovVar = new ov(j, true);
            do {
                value = q0e.getValue();
                Object obj3 = (qv) value;
                obj2 = obj3 instanceof nv ? (nv) obj3 : null;
                if (obj2 == null) {
                    obj2 = ovVar;
                }
            } while (!q0e.c(value, obj2));
        }
        return e5f.a;
    }
}
