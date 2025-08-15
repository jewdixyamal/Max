package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: a13  reason: default package */
public final class a13 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ Throwable Y;
    public final /* synthetic */ qp4 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a13(qp4 qp4, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.Z = qp4;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        on5 on5 = (on5) obj;
        Throwable th = (Throwable) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                a13 a13 = new a13(this.Z, continuation, 0);
                a13.Y = th;
                a13.o(e5f.a);
                throw null;
            default:
                a13 a132 = new a13(this.Z, continuation, 1);
                a132.Y = th;
                e5f e5f = e5f.a;
                a132.o(e5f);
                return e5f;
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                Throwable th = this.Y;
                hm9.p((String) this.Z.a, "big_flow: fail", th);
                throw th;
            default:
                od2.a0(obj);
                Throwable th2 = this.Y;
                qp4 qp4 = this.Z;
                if (th2 != null) {
                    hm9.p((String) qp4.a, "big_flow: completion", th2);
                } else {
                    hm9.m((String) qp4.a, "big_flow: completion", new Object[0]);
                }
                return e5f.a;
        }
    }
}
