package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: l44  reason: default package */
public final class l44 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ o44 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l44(long j, o44 o44, Continuation continuation) {
        super(2, continuation);
        this.Y = j;
        this.Z = o44;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((l44) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new l44(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            long j = this.Y;
            if (j > 0) {
                this.X = 1;
                if (j47.x(j, this) == tx3) {
                    return tx3;
                }
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else if (i == 2) {
            od2.a0(obj);
            return e5f.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o44 o44 = this.Z;
        f44 f44 = o44.g;
        this.X = 2;
        if (o44.a(o44, f44, this) == tx3) {
            return tx3;
        }
        return e5f.a;
    }
}
