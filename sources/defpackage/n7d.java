package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: n7d  reason: default package */
public final class n7d {
    public static final /* synthetic */ int h = 0;
    public final long a;
    public final String b;
    public final List c;
    public final List d;
    public final Long e;
    public final Long f;
    public final long g;

    public n7d(long j, String str, List list, List list2, Long l, Long l2, long j2) {
        this.a = j;
        this.b = str;
        this.c = list;
        this.d = list2;
        this.e = l;
        this.f = l2;
        this.g = j2;
    }

    public final Map a() {
        String str = this.b;
        kpa kpa = null;
        if (!oag.u(str)) {
            str = null;
        }
        kpa kpa2 = str != null ? new kpa("text", str) : null;
        List list = this.c;
        if (!(!list.isEmpty())) {
            list = null;
        }
        kpa kpa3 = list != null ? new kpa("attaches", list) : null;
        List list2 = this.d;
        if (!(!list2.isEmpty())) {
            list2 = null;
        }
        kpa kpa4 = list2 != null ? new kpa("elements", list2) : null;
        Long l = this.e;
        kpa kpa5 = l != null ? new kpa("replyTo", Long.valueOf(l.longValue())) : null;
        Long l2 = this.f;
        kpa kpa6 = l2 != null ? new kpa("editOn", Long.valueOf(l2.longValue())) : null;
        long j = this.g;
        Long valueOf = Long.valueOf(j);
        if (j == 0) {
            valueOf = null;
        }
        kpa kpa7 = valueOf != null ? new kpa("saveTime", Long.valueOf(valueOf.longValue())) : null;
        long j2 = this.a;
        Long valueOf2 = Long.valueOf(j2);
        if (j2 == 0) {
            valueOf2 = null;
        }
        if (valueOf2 != null) {
            kpa = new kpa("cid", Long.valueOf(valueOf2.longValue()));
        }
        return mz7.c0(ys.d0(new kpa[]{kpa2, kpa3, kpa4, kpa5, kpa6, kpa7, kpa}));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7d)) {
            return false;
        }
        n7d n7d = (n7d) obj;
        return this.a == n7d.a && tpa.f(this.b, n7d.b) && tpa.f(this.c, n7d.c) && tpa.f(this.d, n7d.d) && tpa.f(this.e, n7d.e) && tpa.f(this.f, n7d.f) && this.g == n7d.g;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        int i = 0;
        String str = this.b;
        int g2 = k7d.g(this.d, k7d.g(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        Long l = this.e;
        int hashCode2 = (g2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return Long.hashCode(this.g) + ((hashCode2 + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServerDraft(text=***, attaches=");
        sb.append(this.c);
        sb.append(", elements=");
        sb.append(this.d);
        sb.append(", replyTo=");
        sb.append(this.e);
        sb.append(", editOn=");
        sb.append(this.f);
        sb.append(", saveTime=");
        return zr6.k(sb, this.g, ")");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ n7d(java.lang.String r13, java.util.List r14, java.lang.Long r15, java.lang.Long r16, int r17) {
        /*
            r12 = this;
            r0 = r17 & 2
            r1 = 0
            if (r0 == 0) goto L_0x0007
            r5 = r1
            goto L_0x0008
        L_0x0007:
            r5 = r13
        L_0x0008:
            nz4 r6 = defpackage.nz4.a
            r0 = r17 & 8
            if (r0 == 0) goto L_0x0010
            r7 = r6
            goto L_0x0011
        L_0x0010:
            r7 = r14
        L_0x0011:
            r0 = r17 & 16
            if (r0 == 0) goto L_0x0017
            r8 = r1
            goto L_0x0018
        L_0x0017:
            r8 = r15
        L_0x0018:
            r0 = r17 & 32
            if (r0 == 0) goto L_0x001e
            r9 = r1
            goto L_0x0020
        L_0x001e:
            r9 = r16
        L_0x0020:
            r10 = 0
            r3 = 0
            r2 = r12
            r2.<init>(r3, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n7d.<init>(java.lang.String, java.util.List, java.lang.Long, java.lang.Long, int):void");
    }
}
