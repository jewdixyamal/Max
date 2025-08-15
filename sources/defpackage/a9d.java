package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: a9d  reason: default package */
public final class a9d extends ffe implements a66 {
    public int X;
    public final /* synthetic */ c9d Y;
    public final /* synthetic */ kec Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a9d(c9d c9d, kec kec, Continuation continuation) {
        super(2, continuation);
        this.Y = c9d;
        this.Z = kec;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((a9d) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new a9d(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        Object obj2 = tx3.a;
        int i = this.X;
        Object obj3 = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            c9d c9d = this.Y;
            e8d e8d = c9d.a;
            if (e8d == null) {
                e8d = null;
            }
            k5d k5d = new k5d((Object) c9d, 1, (Object) this.Z);
            this.X = 1;
            hmc b = ((js7) e8d.w.getValue()).b();
            Object t0 = j47.t0(((w9a) b.a).b(), new emc(b, k5d, (Continuation) null), this);
            if (t0 != obj2) {
                t0 = obj3;
            }
            if (t0 != obj2) {
                t0 = obj3;
            }
            if (t0 == obj2) {
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
