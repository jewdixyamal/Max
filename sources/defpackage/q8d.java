package defpackage;

import java.util.Collections;

/* renamed from: q8d  reason: default package */
public final class q8d extends g9d {
    public final long A0;
    public final long B0;
    public final long z0;

    public q8d(p8d p8d) {
        super(p8d);
        this.z0 = p8d.l;
        this.A0 = p8d.m;
        this.B0 = p8d.n;
    }

    /* JADX WARNING: type inference failed for: r11v2, types: [java.lang.Object, m20] */
    public final bu8 y() {
        cu8 q = o().q(this.A0);
        String str = null;
        if (!(g().C(this.z0) == null || q == null)) {
            k8g k8g = q.z0;
            int i = k8g.i();
            int i2 = 0;
            while (i2 < i) {
                l20 h = k8g.h(i2);
                if (h == null) {
                    return null;
                }
                boolean f = h.f();
                x10 x10 = h.b;
                long j = this.B0;
                if ((!f || x10.s0 != j) && ((!h.i() || h.d.a != j) && ((!h.h() || h.f.a != j) && (!h.g() || h.g.a != j)))) {
                    i2++;
                } else {
                    if (h.f()) {
                        x10 a = x10.b().a();
                        j10 j2 = h.j();
                        j2.b = a;
                        h = j2.a();
                    }
                    ? obj = new Object();
                    obj.a = Collections.singletonList(h);
                    k8g c = obj.c();
                    if (h.g()) {
                        str = h.g.b;
                    }
                    bu8 bu8 = new bu8();
                    bu8.g = str;
                    bu8.n = c;
                    return bu8;
                }
            }
        }
        return null;
    }
}
