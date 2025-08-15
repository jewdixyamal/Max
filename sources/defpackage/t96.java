package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: t96  reason: default package */
public final class t96 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ z96 Y;
    public final /* synthetic */ Set Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t96(z96 z96, Set set, Continuation continuation) {
        super(2, continuation);
        this.Y = z96;
        this.Z = set;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((t96) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new t96(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        z96 z96 = this.Y;
        if (i == 0) {
            od2.a0(obj);
            t03 t03 = new t03(z96.w0, 13);
            this.X = 1;
            if (od2.A(t03, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else if (i == 2) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.X = 2;
        Object t0 = j47.t0(((w9a) z96.s()).e(), new f96(z96, this.Z, (Continuation) null), this);
        if (t0 != tx3) {
            t0 = e5f;
        }
        return t0 == tx3 ? tx3 : e5f;
    }
}
