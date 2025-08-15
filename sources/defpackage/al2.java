package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: al2  reason: default package */
public final class al2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ bl2 Y;
    public final /* synthetic */ List Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public al2(bl2 bl2, List list, Continuation continuation) {
        super(2, continuation);
        this.Y = bl2;
        this.Z = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((al2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new al2(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            bl2 bl2 = this.Y;
            e52 q = bl2.q();
            if (q == null) {
                return e5f;
            }
            long j = q.b.a;
            boolean z = bl2.v0.get();
            this.X = 1;
            ((eh4) bl2.Z.getValue()).a(bl2.b, j, this.Z, z);
            if (e5f == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f;
    }
}
