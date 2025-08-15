package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: k31  reason: default package */
public final class k31 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ l31 Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k31(long j, l31 l31, Continuation continuation) {
        super(2, continuation);
        this.Y = l31;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((k31) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new k31(this.Z, this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        long j = this.Z;
        l31 l31 = this.Y;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7Arr = l31.p;
            iy2 a = l31.a();
            this.X = 1;
            obj = ((jz2) a).u(j, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else if (i == 2) {
            od2.a0(obj);
            return e5f;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e52 e52 = (e52) obj;
        if (e52 == null) {
            return e5f;
        }
        bc7[] bc7Arr2 = l31.p;
        long j2 = e52.a;
        vxd b = l31.b(od2.N(((jz2) l31.a()).m(j2), new j31(new g00(((tm3) l31.h.getValue()).a(), j, 1), l31, e52, 0)), j2);
        l31.n.o1(l31, l31.p[1], b);
        if (((el3) l31.g.getValue()).m(j)) {
            int i2 = ft4.o;
            long R = z7.R(30, kt4.SECONDS);
            this.X = 2;
            if (((xb9) l31.i.getValue()).s(this.Z, R, this) == tx3) {
                return tx3;
            }
        }
        return e5f;
    }
}
