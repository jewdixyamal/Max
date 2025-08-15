package defpackage;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* renamed from: jx5  reason: default package */
public final class jx5 extends pnf {
    public final eca X;
    public final lqf Y;
    public final je7 Z;
    public final kke b;
    public final rba c;
    public final vh3 o;
    public final q0e s0;
    public final w7c t0;
    public final q0e u0;
    public final w7c v0;
    public final w7c w0;
    public boolean x0;

    /* JADX WARNING: type inference failed for: r4v14, types: [java.lang.Object, lec] */
    public jx5() {
        je7 je7 = iyc.y;
        ys2 ys2 = ys2.a;
        nba nba = (nba) ys2.getAccessor().c(nba.class);
        jyc jyc = jyc.a;
        kke s = jyc.s();
        eca eca = (eca) ys2.getAccessor().c(eca.class);
        ys2.getAccessor().d(hda.class);
        this.b = s;
        this.c = (rba) jyc.getAccessor().c(rba.class);
        this.o = (vh3) ys2.getAccessor().c(vh3.class);
        this.X = eca;
        this.Y = (lqf) ys2.getAccessor().c(lqf.class);
        this.Z = je7;
        kl7 l = j1e.l();
        List<xa9> list = (List) ((AtomicReference) ((ya9) eca.c.getValue()).c).get();
        ArrayList arrayList = new ArrayList(z53.S(list, 10));
        boolean z = false;
        for (xa9 xa9 : list) {
            if (tpa.f(xa9.a, "all.chat.folder")) {
                z = true;
            }
            av5 av5 = r10;
            av5 av52 = new av5(xa9.a, xa9.b, (CharSequence) null, xa9.c, xa9.d);
            arrayList.add(av5);
        }
        l.addAll(arrayList);
        if (!z) {
            l.add(0, new av5("all.chat.folder", this.c.a.getString(jpc.f0), (CharSequence) null, hy3.b, EnumSet.allOf(cv5.class)));
        }
        q0e a = r0e.a(j1e.d(l));
        this.s0 = a;
        this.t0 = new w7c(a);
        q0e a2 = r0e.a(0);
        this.u0 = a2;
        this.v0 = new w7c(a2);
        od2.L(od2.F(new zn5(od2.F(new j31(((zb2) ((ta2) this.Z.getValue())).g(), nba.f, new c3(this, (Continuation) null, 12), 4), ((w9a) this.b).a()), new dx5(this, (Continuation) null), 5), ((w9a) this.b).b()), this.a);
        int i = ft4.o;
        long e = ft4.e(z7.R(2, kt4.SECONDS));
        ? obj = new Object();
        obj.a = System.currentTimeMillis();
        this.w0 = od2.X(od2.x(od2.M(od2.x(nu0.Q(new j31(od2.g(new ix5(this, obj, (Continuation) null)), new ac(new w7c(this.o.a), 23, this), new xi1(3, (Continuation) null, 1), 4), z7.R(500, kt4.MILLISECONDS))), new gx5(obj, e, (Continuation) null))), this.a, wld.b, xi6.c);
    }

    public final void q(String str) {
        if (str != null) {
            Iterator it = ((List) this.s0.getValue()).iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (tpa.f(((av5) it.next()).a, str)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                this.u0.m((Object) null, Integer.valueOf(i));
            }
        }
    }
}
