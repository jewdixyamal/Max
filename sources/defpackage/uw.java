package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: uw  reason: default package */
public final class uw extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ mn5 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uw(m32 m32, Continuation continuation) {
        super(2, continuation);
        this.Z = m32;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((uw) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        uw uwVar = new uw((m32) this.Z, continuation);
        uwVar.Y = obj;
        return uwVar;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            pw pwVar = new pw((on5) this.Y, 3);
            this.X = 1;
            if (this.Z.d(pwVar, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
