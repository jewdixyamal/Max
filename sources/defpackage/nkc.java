package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: nkc  reason: default package */
public final class nkc {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final Set e;
    public final boolean f;
    public final boolean g;
    public final List h;
    public final Long i;
    public final Map j;
    public final List k;
    public final Set l;
    public final boolean m;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ nkc(java.lang.String r18, java.lang.String r19, java.lang.String r20, int r21, java.util.Set r22, boolean r23, boolean r24, java.util.List r25, java.lang.Long r26, java.util.Map r27, java.util.List r28, java.util.Set r29, int r30) {
        /*
            r17 = this;
            r0 = r30
            r1 = r0 & 128(0x80, float:1.794E-43)
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r11 = r2
            goto L_0x000b
        L_0x0009:
            r11 = r25
        L_0x000b:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0011
            r12 = r2
            goto L_0x0013
        L_0x0011:
            r12 = r26
        L_0x0013:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0019
            r13 = r2
            goto L_0x001b
        L_0x0019:
            r13 = r27
        L_0x001b:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0021
            r14 = r2
            goto L_0x0023
        L_0x0021:
            r14 = r28
        L_0x0023:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0029
            r15 = r2
            goto L_0x002b
        L_0x0029:
            r15 = r29
        L_0x002b:
            r16 = 0
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r3.<init>((java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6, (int) r7, (java.util.Set) r8, (boolean) r9, (boolean) r10, (java.util.List) r11, (java.lang.Long) r12, (java.util.Map) r13, (java.util.List) r14, (java.util.Set) r15, (boolean) r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nkc.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.util.Set, boolean, boolean, java.util.List, java.lang.Long, java.util.Map, java.util.List, java.util.Set, int):void");
    }

    public final at5 a(List list, Set set, Set set2, hda hda) {
        List list2 = nz4.a;
        String str = this.b;
        List list3 = this.h;
        CharSequence b2 = hda.a(str, list3, 2, false, 0, true);
        Set H0 = x53.H0(list);
        List list4 = list3 == null ? list2 : list3;
        Map map = this.j;
        if (map == null) {
            map = oz4.a;
        }
        Map map2 = map;
        List list5 = this.k;
        List list6 = list5 == null ? list2 : list5;
        Set set3 = this.l;
        if (set3 == null) {
            set3 = wz4.a;
        }
        return new at5(this.a, b2, this.c, this.d, list2, this.e, true, this.f, list, this.g, H0, set, set2, list4, this.i, map2, list6, set3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nkc)) {
            return false;
        }
        nkc nkc = (nkc) obj;
        return tpa.f(this.a, nkc.a) && tpa.f(this.b, nkc.b) && tpa.f(this.c, nkc.c) && this.d == nkc.d && tpa.f(this.e, nkc.e) && this.f == nkc.f && this.g == nkc.g && tpa.f(this.h, nkc.h) && tpa.f(this.i, nkc.i) && tpa.f(this.j, nkc.j) && tpa.f(this.k, nkc.k) && tpa.f(this.l, nkc.l) && this.m == nkc.m;
    }

    public final int hashCode() {
        int d2 = rh4.d(this.a.hashCode() * 31, 31, this.b);
        int i2 = 0;
        String str = this.c;
        int d3 = ms2.d(ms2.d((this.e.hashCode() + k7d.e(this.d, (d2 + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31, 31, this.f), 31, this.g);
        List list = this.h;
        int hashCode = (d3 + (list == null ? 0 : list.hashCode())) * 31;
        Long l2 = this.i;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Map map = this.j;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        List list2 = this.k;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Set set = this.l;
        if (set != null) {
            i2 = set.hashCode();
        }
        return Boolean.hashCode(this.m) + ((hashCode4 + i2) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoomChatFolder(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", emoji=");
        sb.append(this.c);
        sb.append(", order=");
        sb.append(this.d);
        sb.append(", filters=");
        sb.append(this.e);
        sb.append(", isHiddenForAllFolder=");
        sb.append(this.f);
        sb.append(", hideIfEmpty=");
        sb.append(this.g);
        sb.append(", elements=");
        sb.append(this.h);
        sb.append(", creatorId=");
        sb.append(this.i);
        sb.append(", filterSubjects=");
        sb.append(this.j);
        sb.append(", widgets=");
        sb.append(this.k);
        sb.append(", options=");
        sb.append(this.l);
        sb.append(", isRemoved=");
        return au1.j(sb, this.m, ")");
    }

    public nkc(String str, String str2, String str3, int i2, Set set, boolean z, boolean z2, List list, Long l2, Map map, List list2, Set set2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i2;
        this.e = set;
        this.f = z;
        this.g = z2;
        this.h = list;
        this.i = l2;
        this.j = map;
        this.k = list2;
        this.l = set2;
        this.m = z3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public nkc(defpackage.at5 r17) {
        /*
            r16 = this;
            r0 = r17
            java.lang.CharSequence r1 = r0.b
            java.lang.String r4 = r1.toString()
            java.util.List r13 = r0.B0
            java.util.Set r14 = r0.C0
            java.lang.String r3 = r0.a
            java.lang.String r5 = r0.c
            int r6 = r0.o
            java.util.Set r7 = r0.Y
            boolean r8 = r0.s0
            boolean r9 = r0.u0
            java.util.List r10 = r0.y0
            java.lang.Long r11 = r0.z0
            java.util.Map r12 = r0.A0
            r15 = 4096(0x1000, float:5.74E-42)
            r2 = r16
            r2.<init>((java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5, (int) r6, (java.util.Set) r7, (boolean) r8, (boolean) r9, (java.util.List) r10, (java.lang.Long) r11, (java.util.Map) r12, (java.util.List) r13, (java.util.Set) r14, (int) r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nkc.<init>(at5):void");
    }
}
