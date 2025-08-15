package defpackage;

import android.net.Uri;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: f22  reason: default package */
public final class f22 {
    public final je7 a = neb.a.getAccessor().d(fl7.class);

    public static List b() {
        int i = sea.z0;
        vfd vfd = r2;
        vfd vfd2 = new vfd((long) i, 0, new eqe(vea.M1), (jfd) null, (jqe) null, Integer.valueOf(woc.r), (hfd) null, (zed) null, (jqe) null, 0, (wed) null, 2008);
        x6 x6Var = new x6(i, vfd, 536871936);
        int i2 = sea.B0;
        vfd vfd3 = r3;
        vfd vfd4 = new vfd((long) i2, 0, new eqe(vea.O1), (jfd) null, (jqe) null, Integer.valueOf(woc.Z1), (hfd) null, (zed) null, (jqe) null, 0, (wed) null, 2008);
        x6 x6Var2 = new x6(i2, vfd3, 1073742848);
        int i3 = sea.C0;
        vfd vfd5 = r4;
        vfd vfd6 = new vfd((long) i3, 0, new eqe(vea.P1), (jfd) null, (jqe) null, Integer.valueOf(woc.W1), (hfd) null, (zed) null, (jqe) null, 0, (wed) null, 2008);
        return y53.M(x6Var, x6Var2, new x6(i3, vfd5, -2147482624));
    }

    public final List a(z12 z12) {
        Uri parse;
        eqe eqe;
        eqe eqe2;
        z12 z122 = z12;
        boolean z = z122 instanceof k72;
        nz4 nz4 = nz4.a;
        je7 je7 = this.a;
        String str = null;
        if (z) {
            k72 k72 = (k72) z122;
            e52 o = k72.o();
            boolean z2 = false;
            boolean z3 = o != null && o.I();
            q0e q0e = k72.i;
            if (z3) {
                o22 o22 = (o22) q0e.getValue();
                if (o22 == null) {
                    return nz4;
                }
                kl7 l = j1e.l();
                l.add(new s0d(new eqe(vea.Y1), (kqe) null, 0, 14));
                int i = sea.i0;
                n22 n22 = n22.c;
                n22 n222 = o22.b;
                l.add(new c4d(i, n222 == n22, new eqe(vea.n2), new eqe(vea.l2), 536879104));
                l.add(new c4d(sea.j0, n222 == n22.b, new eqe(vea.s2), new eqe(vea.p2), 1073750016));
                int ordinal = n222.ordinal();
                if (ordinal == 0) {
                    String g = au1.g(((fl7) je7.getValue()).e, "/");
                    eqe eqe3 = new eqe(vea.q2);
                    String str2 = o22.c;
                    jqe jqe = o22.d;
                    if (jqe != null) {
                        eqe2 = jqe;
                    } else {
                        eqe2 = (str2 == null || str2.length() == 0) ? new eqe(vea.V1) : new eqe(vea.W1);
                    }
                    Integer num = o22.e;
                    l.add(new qmd(new omd(g, str2, eqe3, false, false, eqe2, Integer.valueOf(num != null ? num.intValue() : wfa.X))));
                } else if (ordinal == 1) {
                    String str3 = o22.c;
                    if (str3 == null || str3.length() == 0) {
                        l.add(new n2b(new eqe(vea.T1)));
                    } else {
                        l.add(new qmd(new pmd(new iqe(str3), new eqe(vea.U1), Integer.valueOf(wfa.X))));
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                if (tpa.f(k72.q(), Boolean.FALSE)) {
                    l.addAll(b());
                }
                return j1e.d(l);
            }
            o22 o222 = (o22) q0e.getValue();
            if (o222 == null) {
                return nz4;
            }
            kl7 l2 = j1e.l();
            l2.add(new s0d(new eqe(vea.e2), (kqe) null, 0, 14));
            int i2 = sea.i0;
            n22 n223 = n22.c;
            n22 n224 = o222.b;
            l2.add(new c4d(i2, n224 == n223, new eqe(vea.n2), new eqe(vea.o2), 536879104));
            l2.add(new c4d(sea.j0, n224 == n22.b, new eqe(vea.s2), new eqe(vea.t2), 1073750016));
            int ordinal2 = n224.ordinal();
            Integer num2 = o222.e;
            String str4 = o222.c;
            if (ordinal2 == 0) {
                String g2 = au1.g(((fl7) je7.getValue()).e, "/");
                eqe eqe4 = new eqe(vea.q2);
                String str5 = o222.c;
                jqe jqe2 = o222.d;
                if (jqe2 != null) {
                    eqe = jqe2;
                } else {
                    eqe = (str5 == null || str5.length() == 0) ? new eqe(vea.b2) : new eqe(vea.c2);
                }
                omd omd = r10;
                omd omd2 = new omd(g2, str5, eqe4, true, false, eqe, Integer.valueOf(num2 != null ? num2.intValue() : wfa.X));
                l2.add(new qmd(omd));
            } else if (ordinal2 != 1) {
                throw new NoWhenBranchMatchedException();
            } else if (str4 == null || str4.length() == 0) {
                l2.add(new qmd(new nmd(new eqe(vea.Z1), new eqe(vea.a2), Integer.valueOf(num2 != null ? num2.intValue() : wfa.X))));
            } else {
                l2.add(new qmd(new pmd(new iqe(str4), new eqe(vea.a2), Integer.valueOf(wfa.X))));
            }
            if (tpa.f(k72.q(), Boolean.FALSE)) {
                if (str4 == null || str4.length() == 0) {
                    z2 = true;
                }
                if (!z2) {
                    l2.addAll(b());
                }
            }
            return j1e.d(l2);
        } else if (z122 instanceof zk3) {
            p22 p22 = (p22) ((zk3) z122).i.getValue();
            if (p22 == null) {
                return nz4;
            }
            kl7 l3 = j1e.l();
            l3.add(new Object());
            String g3 = au1.g(((fl7) je7.getValue()).e, "/");
            String str6 = p22.b;
            if (!(str6 == null || (parse = Uri.parse(str6)) == null)) {
                str = parse.getLastPathSegment();
            }
            String str7 = str;
            eqe eqe5 = new eqe(vea.C0);
            Integer num3 = p22.d;
            l3.add(new qmd(new omd(g3, str7, eqe5, false, true, p22.c, Integer.valueOf(num3 != null ? num3.intValue() : wfa.X))));
            return j1e.d(l3);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
