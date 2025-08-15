package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: c40  reason: default package */
public final class c40 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ f40 Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ long s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c40(f40 f40, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.Y = f40;
        this.Z = j;
        this.s0 = j2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c40) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new c40(this.Y, this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        k8g k8g;
        l20 k;
        i10 i10;
        tx3 tx3 = tx3.a;
        int i = this.X;
        f40 f40 = this.Y;
        if (i == 0) {
            od2.a0(obj);
            nx3 b = ((w9a) ((kke) f40.Z.getValue())).b();
            b40 b40 = new b40(f40, this.s0, (Continuation) null);
            this.X = 1;
            obj = j47.t0(b, b40, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        cu8 cu8 = (cu8) obj;
        e5f e5f = e5f.a;
        if (cu8 == null || !cu8.u() || (k8g = cu8.z0) == null || (k = k8g.k(g20.X)) == null || (i10 = k.e) == null) {
            return e5f;
        }
        au8 au8 = (au8) f40.Y.getValue();
        au8.getClass();
        au8.t(cu8, k.r, new v72(au8, this.Z, i10.c));
        return e5f;
    }
}
