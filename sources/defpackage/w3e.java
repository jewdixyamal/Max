package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: w3e  reason: default package */
public final class w3e implements ol7 {
    public final List X;
    public final int Y;
    public final boolean Z;
    public final long a;
    public final jqe b;
    public final String c;
    public final Integer o;
    public final boolean s0;
    public final int t0;
    public final long u0;

    public w3e(long j, jqe jqe, String str, Integer num, List list, int i, boolean z, boolean z2) {
        int i2;
        this.a = j;
        this.b = jqe;
        this.c = str;
        this.o = num;
        this.X = list;
        this.Y = i;
        this.Z = z;
        this.s0 = z2;
        if (i == 5) {
            i2 = tga.l;
        } else {
            i2 = tga.k;
        }
        this.t0 = i2;
        this.u0 = j >= 0 ? -j : j;
    }

    public static w3e k(w3e w3e, ArrayList arrayList, boolean z, boolean z2, int i) {
        long j = w3e.a;
        jqe jqe = w3e.b;
        String str = w3e.c;
        Integer num = w3e.o;
        List list = arrayList;
        if ((i & 16) != 0) {
            list = w3e.X;
        }
        List list2 = list;
        int i2 = w3e.Y;
        if ((i & 64) != 0) {
            z = w3e.Z;
        }
        boolean z3 = z;
        if ((i & 128) != 0) {
            z2 = w3e.s0;
        }
        w3e.getClass();
        return new w3e(j, jqe, str, num, list2, i2, z3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3e)) {
            return false;
        }
        w3e w3e = (w3e) obj;
        return this.a == w3e.a && tpa.f(this.b, w3e.b) && tpa.f(this.c, w3e.c) && tpa.f(this.o, w3e.o) && tpa.f(this.X, w3e.X) && this.Y == w3e.Y && this.Z == w3e.Z && this.s0 == w3e.s0;
    }

    public final long getItemId() {
        return this.u0;
    }

    public final boolean h(ol7 ol7) {
        return this.u0 == ol7.getItemId();
    }

    public final int hashCode() {
        int f = k7d.f(Long.hashCode(this.a) * 31, 31, this.b);
        int i = 0;
        String str = this.c;
        int hashCode = (f + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.o;
        if (num != null) {
            i = num.hashCode();
        }
        return Boolean.hashCode(this.s0) + ms2.d(ey8.g(this.Y, k7d.g(this.X, (hashCode + i) * 31, 31), 31), 31, this.Z);
    }

    public final int l() {
        return this.t0;
    }

    public final Object n(Object obj) {
        ol7 ol7 = (ol7) obj;
        if (!(ol7 instanceof w3e)) {
            return null;
        }
        w3e w3e = (w3e) ol7;
        boolean z = this.Z;
        boolean z2 = w3e.Z;
        if (z != z2) {
            return new t3e(z2);
        }
        int i = this.Y;
        int i2 = w3e.Y;
        if (i != i2) {
            return new u3e(i2);
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerSetModel(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", iconUrl=");
        sb.append(this.c);
        sb.append(", iconRes=");
        sb.append(this.o);
        sb.append(", stickers=");
        sb.append(this.X);
        sb.append(", type=");
        sb.append(k7d.r(this.Y));
        sb.append(", selected=");
        sb.append(this.Z);
        sb.append(", favorite=");
        return au1.j(sb, this.s0, ")");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ w3e(long r14, defpackage.jqe r16, java.lang.String r17, java.lang.Integer r18, java.util.List r19, int r20, boolean r21, boolean r22, int r23) {
        /*
            r13 = this;
            r0 = r23
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r7 = r2
            goto L_0x000b
        L_0x0009:
            r7 = r17
        L_0x000b:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0011
            r8 = r2
            goto L_0x0013
        L_0x0011:
            r8 = r18
        L_0x0013:
            r1 = r0 & 64
            r2 = 0
            if (r1 == 0) goto L_0x001a
            r11 = r2
            goto L_0x001c
        L_0x001a:
            r11 = r21
        L_0x001c:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0022
            r12 = r2
            goto L_0x0024
        L_0x0022:
            r12 = r22
        L_0x0024:
            r3 = r13
            r4 = r14
            r6 = r16
            r9 = r19
            r10 = r20
            r3.<init>(r4, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w3e.<init>(long, jqe, java.lang.String, java.lang.Integer, java.util.List, int, boolean, boolean, int):void");
    }
}
