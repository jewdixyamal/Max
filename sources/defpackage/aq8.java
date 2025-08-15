package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: aq8  reason: default package */
public final class aq8 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ jq8 Y;
    public final /* synthetic */ e52 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aq8(jq8 jq8, e52 e52, Continuation continuation) {
        super(2, continuation);
        this.Y = jq8;
        this.Z = e52;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((aq8) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new aq8(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            long j = this.Z.b.a;
            this.X = 1;
            obj = ((mc6) this.Y.w0.getValue()).a(j, ek2.MEMBER, 0, (String) null, this);
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
