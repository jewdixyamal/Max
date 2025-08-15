package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: ce2  reason: default package */
public final class ce2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ k70 Y;
    public final /* synthetic */ e52 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ce2(k70 k70, e52 e52, Continuation continuation) {
        super(2, continuation);
        this.Y = k70;
        this.Z = e52;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ce2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ce2(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            k70 k70 = this.Y;
            long j = this.Z.a;
            this.X = 1;
            obj = ((jz2) ((iy2) ((je7) k70.X).getValue())).t(j, (Set) k70.o, this);
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
