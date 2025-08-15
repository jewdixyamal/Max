package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* renamed from: of1  reason: default package */
public final class of1 extends pnf implements zl1 {
    public final q0e A0;
    public final en1 B0;
    public final q0e C0;
    public final w7c D0;
    public final s35 E0;
    public final kke X;
    public final ir1 Y;
    public final qx7 Z;
    public final b31 b;
    public final eo1 c;
    public final oqa o;
    public final je7 s0;
    public final je7 t0;
    public final je7 u0;
    public final je7 v0;
    public final je7 w0;
    public final je7 x0 = tu0.r(3, new k11(18));
    public String y0 = "";
    public final q0e z0;

    public of1(je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, je7 je76, b31 b31, eo1 eo1, oqa oqa, kke kke, ir1 ir1, qx7 qx7) {
        Object value;
        je7 je77 = je73;
        b31 b312 = b31;
        eo1 eo12 = eo1;
        kke kke2 = kke;
        ir1 ir12 = ir1;
        je7 je78 = iyc.h;
        this.b = b312;
        this.c = eo12;
        this.o = oqa;
        this.X = kke2;
        this.Y = ir12;
        this.Z = qx7;
        this.s0 = je78;
        this.t0 = je74;
        this.u0 = je72;
        this.v0 = je7;
        this.w0 = je76;
        q0e a = r0e.a(wf1.g);
        this.z0 = a;
        this.A0 = a;
        this.B0 = new en1();
        q0e a2 = r0e.a(na.c);
        this.C0 = a2;
        this.D0 = new w7c(a2);
        this.E0 = new s35(0);
        w9a w9a = (w9a) kke2;
        od2.L(od2.F(new zn5(((yz0) ((ez0) je74.getValue())).t0, new ef1(this, (Continuation) null), 5), w9a.a()), this.a);
        j47.T(this.a, w9a.e(), (vx3) null, new gf1(this, (Continuation) null), 2);
        od2.L(new zn5(eo12.j, new hf1(this, (Continuation) null), 5), this.a);
        od2.L(new zn5(((l31) ir12.f).k, new if1(this, (Continuation) null), 5), this.a);
        od2.L(new j31(ir12.c.e, new e21(ir1.e(), je77, 1), new jf1((Object) je77, (Object) this, (Continuation) null, 0), 4), this.a);
        boolean z = ((se5) ((qe5) je75.getValue())).r() && !((y21) ((l31) b312).k.getValue()).g;
        if (((se5) ((qe5) je75.getValue())).q()) {
            od2.L(od2.F(new zn5(((yz0) ((ez0) je74.getValue())).F0, new kf1(this, z, je75, (Continuation) null), 5), w9a.a()), this.a);
        } else {
            do {
                value = a.getValue();
            } while (!a.c(value, wf1.a((wf1) value, (List) null, r(false, z), (List) null, false, (CharSequence) null, false, 29)));
        }
        od2.L(new zn5(((yz0) this.Y.l).D0, new lf1(this, (Continuation) null), 5), this.a);
        ((wr1) ((kr1) this.u0.getValue())).d(this);
    }

    public static final void q(of1 of1, kl7 kl7, Map map) {
        Object value;
        wf1 wf1;
        ArrayList arrayList;
        of1 of12 = of1;
        kl7 kl72 = kl7;
        q0e q0e = of12.z0;
        do {
            value = q0e.getValue();
            wf1 = (wf1) value;
            arrayList = new ArrayList(z53.S(kl72, 10));
            ListIterator listIterator = kl72.listIterator(0);
            while (true) {
                il7 il7 = (il7) listIterator;
                if (il7.hasNext()) {
                    fqa fqa = (fqa) il7.next();
                    gg1 id = fqa.a.getId();
                    bo1 bo1 = fqa.b;
                    String q = bo1.q();
                    if (q == null) {
                        q = "";
                    }
                    String str = q;
                    String name = bo1.getName();
                    ig1 ig1 = fqa.a;
                    boolean m = ig1.m();
                    boolean o2 = ig1.o();
                    boolean h = ig1.h();
                    Long l = (Long) map.get(ig1.getId());
                    arrayList.add(new ve1(id, name, str, o2, m, h, l != null ? l.longValue() : -1, Integer.valueOf((!ig1.m() || !ig1.o()) ? ig1.m() ? b8a.i2 : ig1.o() ? b8a.k2 : b8a.m2 : b8a.l2)));
                }
            }
        } while (!q0e.c(value, wf1.a(wf1, x53.x0(arrayList, (Comparator) of12.x0.getValue()), (kl7) null, (List) null, false, (CharSequence) null, false, 62)));
    }

    public static kl7 r(boolean z, boolean z2) {
        kl7 l = j1e.l();
        if (!z2) {
            l.add(new l7a(y7a.f1, Integer.valueOf(b8a.o1), (Integer) null, Integer.valueOf(x7a.S), (Integer) null, 52));
        }
        if (!z2) {
            l.add(new l7a(y7a.e1, Integer.valueOf(yoc.s0), (Integer) null, Integer.valueOf(x7a.d), (Integer) null, 52));
        } else if (z2 && z) {
            l.add(new l7a(y7a.d1, Integer.valueOf(b8a.l1), (Integer) null, Integer.valueOf(x7a.d), (Integer) null, 52));
        }
        return j1e.d(l);
    }

    public final void i() {
        pnf.o(this.E0, aj1.D);
    }
}
