package defpackage;

import java.util.List;

/* renamed from: lna  reason: default package */
public final class lna {
    public final long a;
    public final String b;
    public final wz c;
    public final nna d;
    public final boolean e;
    public final int f;
    public final boolean g;
    public final List h;
    public final ng4 i;
    public final int j;
    public final boolean k;

    public lna(kna kna) {
        this.a = kna.a;
        this.b = kna.b;
        this.c = kna.c;
        this.d = kna.d;
        this.e = kna.e;
        this.f = kna.f;
        this.g = kna.g;
        this.h = kna.h;
        this.i = kna.i;
        this.j = kna.j;
        this.k = kna.k;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [qpd, us] */
    public final us a() {
        ? qpd = new qpd(0);
        qpd.put("cid", Long.valueOf(this.a));
        qpd.put("zoom", Integer.valueOf(this.j));
        qpd.put("attachMEL", Boolean.valueOf(this.k));
        String str = this.b;
        if (!oag.t(str)) {
            qpd.put("text", str);
        }
        qpd.put("detectShare", Boolean.valueOf(this.e));
        wz wzVar = this.c;
        if (wzVar != null && wzVar.size() > 0) {
            qpd.put("attaches", wzVar);
        }
        nna nna = this.d;
        if (nna != null) {
            qpd.put("link", nna);
        }
        int i2 = this.f;
        if (i2 > 0) {
            qpd.put("ttl", Integer.valueOf(i2));
        }
        qpd.put("isLive", Boolean.valueOf(this.g));
        List list = this.h;
        if (list != null) {
            qpd.put("elements", list);
        }
        ng4 ng4 = this.i;
        if (ng4 != null) {
            qpd.put("delayedAttributes", ng4.a());
        }
        return qpd;
    }

    public final String toString() {
        o84.Z.getClass();
        int o = s5c.o(this.h);
        StringBuilder sb = new StringBuilder("OutgoingMessage{cid=");
        ms2.j(this.a, ", text=", "***", sb);
        sb.append(", attaches=");
        sb.append(this.c);
        sb.append(", link=");
        sb.append(this.d);
        sb.append(", detectShare=");
        sb.append(this.e);
        sb.append(", ttl=");
        sb.append(this.f);
        sb.append(", live='");
        sb.append(this.g);
        sb.append("', elements=");
        sb.append(o);
        sb.append(", zoom=");
        sb.append(this.j);
        sb.append(", attachMEL=");
        return au1.j(sb, this.k, "}");
    }
}
