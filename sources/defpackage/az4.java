package defpackage;

import android.graphics.drawable.Drawable;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: az4  reason: default package */
public final class az4 extends pnf {
    public static final /* synthetic */ bc7[] v0;
    public final je7 X;
    public final q0e Y;
    public final w7c Z;
    public final ji b;
    public final y8 c;
    public final kke o;
    public final w4d s0 = mqd.D();
    public final q0e t0;
    public final w7c u0;

    static {
        oi9 oi9 = new oi9(az4.class, "selectedFindJob", "getSelectedFindJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        v0 = new bc7[]{oi9};
    }

    public az4(je7 je7, ji jiVar, y8 y8Var, kke kke, x9c x9c) {
        this.b = jiVar;
        this.c = y8Var;
        this.o = kke;
        this.X = je7;
        q0e a = r0e.a(new yy4(0, 0, 0, 7));
        this.Y = a;
        this.Z = new w7c(a);
        nz4 nz4 = nz4.a;
        q0e a2 = r0e.a(new xy4(nz4, nz4));
        this.t0 = a2;
        this.u0 = new w7c(a2);
        hm9.m(az4.class.getName(), "Load emoji. Start", new Object[0]);
        mqc mqc = new mqc(new uy4(this, (Continuation) null));
        kq1 c2 = c37.c(x9c.b().a(y53.M(t9c.EMOJI, t9c.ANIMOJI)));
        gj gjVar = (gj) je7.getValue();
        gjVar.getClass();
        od2.L(od2.F(new zn5(od2.t(mqc, c2, new mqc(new yi(gjVar, (Continuation) null)), vy4.s0), new wy4(this, (Continuation) null), 5), ((w9a) kke).b()), this.a);
    }

    public final qx4 q(List list, ph phVar, int i, int i2) {
        Drawable drawable;
        Object obj;
        ph phVar2 = phVar;
        Iterator it = list.iterator();
        while (true) {
            drawable = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (tpa.f(((qx4) obj).c, phVar2.b)) {
                break;
            }
        }
        qx4 qx4 = (qx4) obj;
        if (qx4 != null) {
            drawable = qx4.X;
        }
        long j = phVar2.a;
        int G = tu0.G(((float) 28) * fk4.d().getDisplayMetrics().density);
        ji jiVar = this.b;
        jiVar.getClass();
        Long valueOf = Long.valueOf(j);
        String str = phVar2.c;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String str3 = phVar2.e;
        if (str3 != null) {
            str2 = str3;
        }
        zj zjVar = new zj(jiVar.b, G, r0e.a(new a3f(valueOf, str, str2)), drawable == null ? li.a : new ki(drawable), jiVar.a);
        zjVar.setBounds(0, 0, G, G);
        return new qx4(i, qx4 != null ? qx4.b : i2, phVar2.b, (List) null, zjVar, phVar2.a, 8);
    }

    public final void r(int i, m56 m56) {
        vxd S = j47.S(this.a, ((w9a) this.o).b(), vx3.b, new zy4(m56, i, this, (Continuation) null));
        this.s0.o1(this, v0[0], S);
    }
}
