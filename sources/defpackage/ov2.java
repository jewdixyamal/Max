package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ov2  reason: default package */
public final class ov2 {
    public static final ov2 f = new ov2(nv2.c, "", it6.d, nz4.a, true);
    public final nv2 a;
    public final String b;
    public final it6 c;
    public final List d;
    public final boolean e;

    public ov2(nv2 nv2, String str, it6 it6, List list, boolean z) {
        this.a = nv2;
        this.b = str;
        this.c = it6;
        this.d = list;
        this.e = z;
    }

    public static ov2 a(ov2 ov2, nv2 nv2, it6 it6, ArrayList arrayList, boolean z, int i) {
        if ((i & 1) != 0) {
            nv2 = ov2.a;
        }
        nv2 nv22 = nv2;
        String str = ov2.b;
        if ((i & 4) != 0) {
            it6 = ov2.c;
        }
        it6 it62 = it6;
        List list = arrayList;
        if ((i & 8) != 0) {
            list = ov2.d;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            z = ov2.e;
        }
        ov2.getClass();
        return new ov2(nv22, str, it62, list2, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.ov2) r5;
        r1 = r5.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof defpackage.ov2
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            ov2 r5 = (defpackage.ov2) r5
            nv2 r1 = r5.a
            nv2 r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            java.lang.String r1 = r4.b
            java.lang.String r3 = r5.b
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            it6 r1 = r4.c
            it6 r3 = r5.c
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x0029
            return r2
        L_0x0029:
            java.util.List r1 = r4.d
            java.util.List r3 = r5.d
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x0034
            return r2
        L_0x0034:
            boolean r4 = r4.e
            boolean r5 = r5.e
            if (r4 == r5) goto L_0x003b
            return r2
        L_0x003b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ov2.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int d2 = rh4.d(this.a.hashCode() * 31, 31, this.b);
        return Boolean.hashCode(this.e) + k7d.g(this.d, (this.c.hashCode() + d2) * 31, 31);
    }

    public final String toString() {
        if (this == f) {
            return ov2.class.getSimpleName().concat(".INITIAL");
        }
        StringBuilder sb = new StringBuilder("ChatsListSearchState(type=");
        sb.append(this.a);
        sb.append(", searchQuery='");
        sb.append(pag.x(this.b));
        sb.append("', idleSearchData=");
        sb.append(this.c);
        sb.append(", searchResult=");
        sb.append(x53.n0(this.d, ",", "[", "]", new we1(27), 24));
        sb.append(", scrollToTop=");
        return au1.j(sb, this.e, ")");
    }
}
