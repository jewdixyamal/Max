package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: t81  reason: default package */
public final class t81 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ u81 Y;
    public final /* synthetic */ List Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t81(u81 u81, List list, Continuation continuation) {
        super(2, continuation);
        this.Y = u81;
        this.Z = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((t81) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new t81(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            m5d m5d = this.Y.c;
            this.X = 1;
            Object t0 = j47.t0(((w9a) ((kke) ((je7) m5d.X).getValue())).b(), new ns1(this.Z, m5d, (Continuation) null), this);
            if (t0 != tx3) {
                t0 = e5f;
            }
            if (t0 == tx3) {
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
