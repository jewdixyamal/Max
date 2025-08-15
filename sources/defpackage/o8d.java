package defpackage;

import java.util.List;

/* renamed from: o8d  reason: default package */
public final class o8d extends g9d {
    public final String A0;
    public final List B0;
    public final long z0;

    public o8d(n8d n8d) {
        super(n8d);
        this.z0 = n8d.l;
        this.A0 = n8d.m;
        this.B0 = n8d.n;
    }

    public final void x() {
        cu8 q;
        vx8 vx8;
        e52 C = b().C(this.c);
        if (C != null && (q = n().q(this.z0)) != null && (vx8 = q.v0) != vx8.DELETED) {
            n().x(q, iu8.SENDING);
            e8d e8d = this.a;
            if (e8d == null) {
                e8d = null;
            }
            ((bv4) e8d.q.getValue()).a(this.z0, this.c, this.A0, this.B0, vx8.EDITED, (List) null, false);
            ((k4a) a()).C(this.c, this.z0, C.b.a, q.c, this.A0, q.s0, vx8, q.n() ? (List) q.z0.a : null, false, q.R0);
        }
    }

    public final bu8 y() {
        bu8 bu8 = new bu8();
        String str = this.A0;
        if (!oag.t(str)) {
            bu8.g = str;
        }
        List list = this.B0;
        if (!list.isEmpty()) {
            bu8.F = list;
        }
        bu8.H = this.y0;
        return bu8;
    }
}
