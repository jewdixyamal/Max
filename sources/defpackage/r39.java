package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: r39  reason: default package */
public final class r39 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ n59 Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r39(n59 n59, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = n59;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((r39) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new r39(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        n59 n59 = this.Y;
        if (i == 0) {
            od2.a0(obj);
            r79 r = n59.r(n59);
            this.X = 1;
            obj = r.a(this.Z, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else if (i == 2 || i == 3) {
            od2.a0(obj);
            return e5f;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        cu8 cu8 = (cu8) obj;
        if (cu8 == null) {
            return e5f;
        }
        if (cu8.m(g20.c)) {
            this.X = 2;
            if (n59.s(n59, cu8, this) == tx3) {
                return tx3;
            }
        } else if (cu8.m(g20.o)) {
            this.X = 3;
            if (n59.t(n59, cu8, this) == tx3) {
                return tx3;
            }
        }
        return e5f;
    }
}
