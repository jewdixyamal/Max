package defpackage;

import java.util.Iterator;

/* renamed from: t25  reason: default package */
public final class t25 extends d5b {
    public final w6d l = w6d.f;
    public final khe m;

    public t25(int i) {
        super("one.me.webapp.domain.jsbridge.SuccessResponse.Status", (ga6) null, i);
        this.m = new khe(new s25(i, this));
    }

    public final pag e() {
        return this.l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof r6d)) {
            return false;
        }
        r6d r6d = (r6d) obj;
        if (r6d.e() != w6d.f) {
            return false;
        }
        return tpa.f(this.a, r6d.a()) && tpa.f(j1e.e(this), j1e.e(r6d));
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        Iterator it = new zs(4, this).iterator();
        int i = 1;
        while (it.hasNext()) {
            int i2 = i * 31;
            String str = (String) it.next();
            i = i2 + (str != null ? str.hashCode() : 0);
        }
        return (hashCode * 31) + i;
    }

    public final r6d i(int i) {
        return ((r6d[]) this.m.getValue())[i];
    }

    public final String toString() {
        return x53.n0(new zs(4, this), ", ", rh4.m(new StringBuilder(), this.a, '('), ")", (m56) null, 56);
    }
}
