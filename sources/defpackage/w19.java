package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: w19  reason: default package */
public final class w19 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ Long Y;
    public final /* synthetic */ x19 Z;
    public final /* synthetic */ long s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w19(Long l, x19 x19, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = l;
        this.Z = x19;
        this.s0 = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((w19) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new w19(this.Y, this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        x19 x19 = this.Z;
        if (i == 0) {
            od2.a0(obj);
            Long l = this.Y;
            if (l == null) {
                return null;
            }
            long longValue = l.longValue();
            this.X = 1;
            obj = ((r79) x19.a.getValue()).a(longValue, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        cu8 cu8 = (cu8) obj;
        if (cu8 == null) {
            return null;
        }
        es8 a = zu8.a((zu8) x19.b.getValue(), cu8);
        long j = a.a.c;
        long j2 = this.s0;
        return new bw8(1, j2, a, (String) null, (String) null, j2, j);
    }
}
