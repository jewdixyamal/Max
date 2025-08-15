package defpackage;

import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: sq3  reason: default package */
public final class sq3 extends ol implements lme, hua {
    public final int X;
    public final String Y;
    public final String Z;
    public final long o;
    public final String s0;
    public final String t0;

    public sq3(int i, long j, long j2, String str, String str2, String str3, String str4) {
        super(j);
        this.o = j2;
        this.X = i;
        this.Y = str;
        this.Z = str2;
        this.s0 = str3;
        this.t0 = str4;
    }

    public final int c() {
        return 1;
    }

    public final void d() {
    }

    public final void e(gle gle) {
        tq3 tq3 = (tq3) gle;
        if (tq3.c != null) {
            n().u(Collections.singletonList(tq3.c));
            ((k4a) j()).u(Collections.singletonList(Long.valueOf(tq3.c.a)));
        }
        p82 m = m();
        long j = this.o;
        e52 F = m.F(j);
        if (F != null) {
            int s = au1.s(this.X);
            long j2 = F.a;
            if (s != 0) {
                k92 k92 = F.b;
                if (s == 1) {
                    m().j(j, i92.a);
                    ((k4a) j()).j(k92.a);
                    l().c(new vz2(Collections.singletonList(Long.valueOf(j2)), true, false, (mg4) null, (h9b) null, 124));
                } else if (s == 2 || s == 3 || s == 4) {
                    ((k4a) j()).j(k92.a);
                    l().c(new vz2(Collections.singletonList(Long.valueOf(j2)), true, false, (mg4) null, (h9b) null, 124));
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                m().j(j, i92.o);
                l().c(new vz2(Collections.singletonList(Long.valueOf(j2)), true, false, (mg4) null, (h9b) null, 124));
            }
        }
    }

    public final byte[] f() {
        Tasks.ContactUpdate contactUpdate = new Tasks.ContactUpdate();
        contactUpdate.requestId = this.a;
        contactUpdate.contactId = this.o;
        String str = this.Y;
        if (str != null) {
            contactUpdate.oldName = str;
        }
        String str2 = this.Z;
        if (str2 != null) {
            contactUpdate.oldLastName = str2;
        }
        String str3 = this.s0;
        if (str3 != null) {
            contactUpdate.newName = str3;
        }
        String str4 = this.t0;
        if (str4 != null) {
            contactUpdate.lastName = str4;
        }
        contactUpdate.action = ms2.b(this.X);
        return qw8.toByteArray(contactUpdate);
    }

    public final void g(pke pke) {
        String str = pke.b;
        boolean U = f46.U(str);
        long j = this.a;
        if (!U) {
            int s = au1.s(this.X);
            long j2 = this.o;
            if (s == 0) {
                el3 n = n();
                n.getClass();
                hm9.m("ContactController", "undo block, id = " + j2, new Object[0]);
                n.c(j2, new v02(18, (Object) null));
                ((ike) n.l.get()).f(Collections.singletonList(Long.valueOf(j2)));
                n.g.c(new ps3(j2));
            } else if (s == 1) {
                el3 n2 = n();
                n2.getClass();
                hm9.m("ContactController", "undo unblock, id = " + j2, new Object[0]);
                n2.c(j2, new v02(18, nl3.a));
                ((ike) n2.l.get()).f(Collections.singletonList(Long.valueOf(j2)));
                n2.g.c(new ps3(j2));
            } else if (s == 2) {
                el3 n3 = n();
                n3.getClass();
                hm9.m("ContactController", "undo remove, id = " + j2, new Object[0]);
                n3.c(j2, new f9(ol3.a, 22, (Object) null));
                n3.r(j2, false);
                ((ike) n3.l.get()).f(Collections.singletonList(Long.valueOf(j2)));
                n3.g.c(new ps3(j2));
            } else if (s == 3) {
                el3 n4 = n();
                n4.getClass();
                hm9.m("ContactController", "undo add, id = " + j2, new Object[0]);
                n4.c(j2, new f9(ol3.b, 22, (Object) null));
                ((ike) n4.l.get()).f(Collections.singletonList(Long.valueOf(j2)));
                n4.g.c(new ps3(j2));
            } else if (s == 4) {
                el3 n5 = n();
                n5.getClass();
                Long valueOf = Long.valueOf(j2);
                String str2 = this.Y;
                String str3 = this.Z;
                hm9.m("ContactController", "undo rename, id = %d => %s %s", valueOf, str2, str3);
                n5.c(j2, new bl3(str2, str3, 0));
                ps3 ps3 = new ps3(j2);
                av0 av0 = n5.g;
                av0.c(ps3);
                ((ike) n5.l.get()).f(Collections.singletonList(Long.valueOf(j2)));
                av0.c(new ps3(j2));
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if ("not.found".equals(str)) {
                n().o(j2);
            }
            t().d(j);
        }
        l().c(new oi0(j, pke));
    }

    public final long getId() {
        return this.a;
    }

    public final iua getType() {
        return iua.TYPE_CONTACT_UPDATE;
    }

    public final int h() {
        return 1000000;
    }

    public final dle i() {
        tq2 tq2 = new tq2((sla) null, 10);
        tq2.i(this.o, "contactId");
        int i = this.X;
        if (i != 0) {
            tq2.p("action", ms2.b(i));
        }
        String str = this.s0;
        if (!oag.t(str)) {
            tq2.p("firstName", str);
        }
        String str2 = this.t0;
        if (oag.u(str2)) {
            tq2.p("lastName", str2);
        }
        return tq2;
    }
}
