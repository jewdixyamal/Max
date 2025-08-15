package defpackage;

import android.content.Context;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: xi2  reason: default package */
public final class xi2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ck2 Y;
    public final /* synthetic */ je7 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xi2(ck2 ck2, je7 je7, Continuation continuation) {
        super(2, continuation);
        this.Y = ck2;
        this.Z = je7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xi2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new xi2(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        Object obj2;
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            ck2 ck2 = this.Y;
            r79 r79 = ck2.s0;
            long j = ck2.o;
            this.X = 1;
            obj2 = r79.a(j, this);
            if (obj2 == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
            obj2 = obj;
        } else if (i == 2) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        cu8 cu8 = (cu8) obj2;
        if (cu8 == null) {
            return e5f;
        }
        if (!this.Y.Y || !cu8.y()) {
            long j2 = cu8.o;
            ck2 ck22 = this.Y;
            new Long(j2);
            ck22.getClass();
            zc8 zc8 = (zc8) ((jz2) this.Y.w()).l().J(this.Y.b).getValue();
            ck2 ck23 = this.Y;
            ck23.I0.updateAndGet(new wi2(ck23, zc8, cu8));
            String str = this.Y.w0;
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                us7 us7 = us7.X;
                ir6.d(us7, str, "Media viewer. Create loader with initialTime:" + j2 + ", saved markers:" + zc8, (Throwable) null);
            }
            ck2 ck24 = this.Y;
            ck2 ck25 = this.Y;
            long j3 = ck25.b;
            long j4 = ck25.o;
            Set set = ck25.H0;
            v4 v4Var = ((vd2) this.Z.getValue()).a;
            khe d = v4Var.d(iy2.class);
            khe d2 = v4Var.d(r79.class);
            khe d3 = v4Var.d(au8.class);
            khe d4 = v4Var.d(t6b.class);
            Class<u9a> cls = u9a.class;
            khe d5 = v4Var.d(cls);
            ck2 ck26 = ck24;
            e5f e5f2 = e5f;
            khe khe = d4;
            kke kke = (kke) v4Var.c(kke.class);
            Set set2 = set;
            Context context = (Context) v4Var.c(Context.class);
            long j5 = j3;
            k70 k70 = new k70(d, j3, j4, j2, set2);
            yx4 yx4 = new yx4(ey8.h(j5, "MediaLoader#"));
            eg2 eg2 = new eg2(d, v4Var.d(cls), v4Var.d(o45.class), d2, v4Var.d(qe5.class), kke, j5, set2);
            yg2 yg2 = new yg2(d, d3, v4Var.d(q33.class), v4Var.d(pk.class), eg2, j5, set2, ck25);
            Context context2 = context;
            khe khe2 = new khe(new ud2(context2, v4Var, 1));
            khe khe3 = new khe(new ud2(context2, v4Var, 0));
            kke kke2 = kke;
            khe khe4 = d;
            khe khe5 = d2;
            khe khe6 = d5;
            bx bxVar = new bx(khe4, khe5, khe6, v4Var.d(gb6.class), j5, kke2, yx4, new v19(j5, (av0) v4Var.c(av0.class), kke2), khe2, khe3, (ox3) v4Var.c(ox3.class), new m9a(khe2, khe3, khe, v4Var.d(ds3.class)), k70, eg2, yg2, (oe3) v4Var.c(oe3.class), 100, 100);
            ck2 ck27 = this.Y;
            ck27.getClass();
            od2.L(od2.F(new zn5(new xj2(bxVar.B, ck27, 1), new bk2(ck27, (Continuation) null), 5), ((w9a) ck27.t0).b()), ck27.a);
            od2.L(od2.F(new zn5(new xj2(new w7c(((jz2) ck27.w()).l().J(ck27.b)), ck27, 0), new yj2(ck27, (Continuation) null), 5), ((w9a) ck27.t0).a()), ck27.a);
            hm9.m(ck27.w0, "Media viewer. Start load around", new Object[0]);
            bxVar.r(j2);
            ck26.F0 = bxVar;
            return e5f2;
        }
        ck2 ck28 = this.Y;
        this.X = 2;
        return ck2.t(ck28, cu8, this) == tx3 ? tx3 : e5f;
    }
}
