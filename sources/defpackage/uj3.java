package defpackage;

import java.text.CollationKey;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: uj3  reason: default package */
public final class uj3 implements Comparable {
    public CollationKey X;
    public final boolean Y;
    public final ida Z;
    public final ql3 a;
    public CharSequence b;
    public CharSequence c;
    public String o;
    public mpa s0 = null;

    public uj3(ql3 ql3, boolean z, ida ida) {
        this.a = ql3;
        this.Y = z;
        this.Z = ida;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, hl3] */
    public static uj3 a(long j, long j2, ida ida) {
        ? obj = new Object();
        obj.a = j;
        obj.f = Collections.singletonList(jl3.e);
        obj.s = j2;
        obj.k = ol3.b;
        obj.j = 2;
        return new uj3(new ql3(0, obj.a()), false, ida);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, hl3] */
    public static uj3 b(long j, long j2, ida ida) {
        ? obj = new Object();
        obj.a = j;
        obj.f = Collections.singletonList(jl3.e);
        obj.s = j2;
        obj.k = ol3.b;
        return new uj3(new ql3(0, obj.a()), false, ida);
    }

    public final boolean c() {
        ql3 ql3 = this.a;
        return ql3.b != 0 && ql3.c.k == ol3.a;
    }

    public final int compareTo(Object obj) {
        return d().toLowerCase().compareTo(((uj3) obj).d().toLowerCase());
    }

    public final String d() {
        String str = null;
        if (this.Y) {
            jl3 h = h();
            String a2 = h != null ? h.a() : null;
            if (oag.u(a2)) {
                return a2;
            }
        }
        ql3 ql3 = this.a;
        int i = ql3.c.j;
        ida ida = this.Z;
        if (i == 2) {
            return ida.a.getString(c2c.tt_unbind_ok_deleted_user);
        }
        if (i == 1) {
            return ida.a.getString(c2c.tt_blocked_user);
        }
        if (w()) {
            n();
            return ida.a.getString(dpc.t);
        }
        for (jl3 jl3 : ql3.c.f) {
            if (!jl3.equals(jl3.e)) {
                str = jl3.a();
                if (oag.u(str)) {
                    return str;
                }
            }
        }
        if (!oag.t(str)) {
            return str;
        }
        n();
        return ida.a.getString(dpc.t);
    }

    public final String e() {
        jl3 h;
        if (this.Y && (h = h()) != null) {
            String str = h.a;
            if (oag.u(str)) {
                return str;
            }
        }
        pl3 pl3 = this.a.c;
        int i = pl3.j;
        ida ida = this.Z;
        if (i == 2) {
            return ida.a.getString(c2c.tt_unbind_ok_deleted_user);
        }
        if (i == 1) {
            return ida.a.getString(c2c.tt_blocked_user);
        }
        List list = pl3.f;
        if (!list.isEmpty()) {
            return ((jl3) list.get(0)).a;
        }
        n();
        return ida.a.getString(dpc.t);
    }

    public final String f() {
        jl3 h;
        if (this.Y && (h = h()) != null) {
            String str = h.b;
            if (oag.u(str)) {
                return str;
            }
        }
        pl3 pl3 = this.a.c;
        int i = pl3.j;
        if (i == 2 || i == 1) {
            return null;
        }
        List list = pl3.f;
        if (list.isEmpty()) {
            return null;
        }
        return ((jl3) list.get(0)).b;
    }

    public final String g() {
        return this.a.c.p;
    }

    public final jl3 h() {
        Object obj;
        il3 il3 = il3.c;
        List list = this.a.c.f;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                obj = it.next();
                try {
                    if (((jl3) obj).c == il3) {
                        break;
                    }
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
        }
        obj = null;
        jl3 jl3 = (jl3) obj;
        if (jl3 != null && !oag.t(jl3.a().trim())) {
            return jl3;
        }
        return null;
    }

    public final List i() {
        return this.a.c.f;
    }

    public final String j() {
        String c2 = bre.c(this.a.c.p);
        return !oag.t(c2) ? c2 : "";
    }

    public final int k() {
        return this.a.c.j;
    }

    public final CharSequence l(ida ida) {
        if (this.c == null) {
            this.c = ida.j.b(0, this.a.c.o);
        }
        return this.c;
    }

    public final CharSequence m() {
        if (this.o == null) {
            Pattern pattern = fca.a;
            this.o = fca.b(e(), f());
        }
        return this.o;
    }

    public final long n() {
        return this.a.c.a;
    }

    public final long o() {
        return this.a.c.h;
    }

    public final String p(kk0 kk0) {
        if (!(!w())) {
            return null;
        }
        String t = ju0.t(this.a.c.c, kk0, jk0.a);
        if (!oag.t(t)) {
            return t;
        }
        return null;
    }

    public final String q(String str, kk0 kk0) {
        if (!(!w())) {
            return null;
        }
        boolean z = this.Y;
        String str2 = z ? str : null;
        if (!oag.t(str2)) {
            return str2;
        }
        ql3 ql3 = this.a;
        String t = ju0.t(ql3.c.c, kk0, jk0.a);
        if (!oag.t(t)) {
            return t;
        }
        if (!w()) {
            if (z) {
                return str;
            }
            pl3 pl3 = ql3.c;
            if (!oag.t(pl3.b)) {
                return pl3.b;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (defpackage.c37.k(r0.a, r1.c.c) == false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List r() {
        /*
            r7 = this;
            mpa r0 = r7.s0
            ql3 r1 = r7.a
            if (r0 == 0) goto L_0x0012
            pl3 r2 = r1.c
            java.lang.String r2 = r2.c
            java.lang.Object r0 = r0.a
            boolean r0 = defpackage.c37.k(r0, r2)
            if (r0 != 0) goto L_0x0062
        L_0x0012:
            kk0 r0 = defpackage.kk0.b
            kk0 r2 = defpackage.kk0.o
            kl7 r3 = defpackage.j1e.l()
            v25 r4 = defpackage.nk0.a
            r08 r5 = new r08
            r5.<init>((java.util.List) r4)
            java.util.Iterator r4 = r5.iterator()
        L_0x0025:
            r5 = r4
            fkc r5 = (defpackage.fkc) r5
            java.util.ListIterator r5 = r5.b
            boolean r6 = r5.hasPrevious()
            if (r6 == 0) goto L_0x004c
            java.lang.Object r5 = r5.previous()
            kk0 r5 = (defpackage.kk0) r5
            int r6 = r5.compareTo(r0)
            if (r6 < 0) goto L_0x0025
            int r6 = r5.compareTo(r2)
            if (r6 > 0) goto L_0x0025
            java.lang.String r5 = r7.p(r5)
            if (r5 == 0) goto L_0x0025
            r3.add(r5)
            goto L_0x0025
        L_0x004c:
            kl7 r0 = defpackage.j1e.d(r3)
            pl3 r1 = r1.c
            java.lang.String r1 = r1.c
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x005b
            r0 = 0
        L_0x005b:
            mpa r2 = new mpa
            r2.<init>(r1, r0)
            r7.s0 = r2
        L_0x0062:
            mpa r7 = r7.s0
            java.lang.Object r7 = r7.b
            java.util.List r7 = (java.util.List) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uj3.r():java.util.List");
    }

    public final boolean s() {
        return this.a.c.i == nl3.a;
    }

    public final boolean t() {
        return this.a.c.n.contains(ll3.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Contact{id=");
        ql3 ql3 = this.a;
        sb.append(ql3.b);
        sb.append(", data=");
        sb.append(ql3.c);
        sb.append('}');
        return sb.toString();
    }

    public final boolean u() {
        return this.a.c.n.contains(ll3.a);
    }

    public final boolean v() {
        return this.a.c.n.contains(ll3.c);
    }

    public final boolean w() {
        return k() == 0 && this.a.c.a();
    }
}
