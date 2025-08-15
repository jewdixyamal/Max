package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: lk1  reason: default package */
public final class lk1 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ el1 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lk1(el1 el1, Continuation continuation) {
        super(2, continuation);
        this.Y = el1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((lk1) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new lk1(this.Y, continuation);
    }

    public final Object o(Object obj) {
        Object obj2 = tx3.a;
        int i = this.X;
        Object obj3 = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            el1 el1 = this.Y;
            q0e b = el1.c.b();
            ir1 ir1 = el1.c;
            j0e e = ir1.e();
            q0e q0e = ((l31) ir1.f).k;
            q0e f = ir1.f();
            q0e q0e2 = ((yz0) ir1.l).F0;
            kk1 kk1 = new kk1(el1, (Continuation) null, 0);
            this.X = 1;
            Object h = oag.h(gr9.a, bv3.Z, new vp5((Continuation) null, (Object) kk1, 3), this, new mn5[]{b, e, q0e, f, q0e2});
            if (h != obj2) {
                h = obj3;
            }
            if (h != obj2) {
                h = obj3;
            }
            if (h == obj2) {
                return obj2;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj3;
    }
}
