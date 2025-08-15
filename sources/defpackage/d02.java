package defpackage;

import java.util.List;

/* renamed from: d02  reason: default package */
public final class d02 implements f02 {
    public final String X;
    public final String Y;
    public final jqe Z;
    public final int a;
    public final List b;
    public final boolean c;
    public final ow4 o;
    public final int s0;
    public final boolean t0;
    public final long u0;
    public final int v0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d02(int r13, java.util.List r14, boolean r15, defpackage.ow4 r16, java.lang.String r17, java.lang.String r18, defpackage.iqe r19, long r20, int r22) {
        /*
            r12 = this;
            r4 = r16
            r0 = r22 & 16
            r1 = 0
            if (r0 == 0) goto L_0x0009
            r5 = r1
            goto L_0x000b
        L_0x0009:
            r5 = r17
        L_0x000b:
            r0 = r22 & 32
            if (r0 == 0) goto L_0x0011
            r6 = r1
            goto L_0x0013
        L_0x0011:
            r6 = r18
        L_0x0013:
            r0 = r22 & 64
            if (r0 == 0) goto L_0x001b
            jqe r0 = r4.b
            r7 = r0
            goto L_0x001d
        L_0x001b:
            r7 = r19
        L_0x001d:
            int r8 = r4.c
            r9 = 0
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r10 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d02.<init>(int, java.util.List, boolean, ow4, java.lang.String, java.lang.String, iqe, long, int):void");
    }

    public static d02 k(d02 d02, boolean z) {
        return new d02(d02.a, d02.b, z, d02.o, d02.X, d02.Y, d02.Z, d02.s0, d02.t0, d02.u0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!d02.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        d02 d02 = (d02) obj;
        if (this.a != d02.a || this.c != d02.c || this.o != d02.o || !tpa.f(this.X, d02.X) || !tpa.f(this.Y, d02.Y)) {
            return false;
        }
        if (!tpa.f(this.Z, d02.Z) || this.s0 != d02.s0) {
            return false;
        }
        return this.u0 == d02.u0 && this.v0 == d02.v0;
    }

    public final long getItemId() {
        return this.u0;
    }

    public final jqe getName() {
        return this.Z;
    }

    public final int hashCode() {
        int hashCode = (this.o.hashCode() + ms2.d(this.a * 31, 31, this.c)) * 31;
        int i = 0;
        String str = this.X;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.Y;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return h4f.m((k7d.f((hashCode2 + i) * 31, 31, this.Z) + this.s0) * 31, 31, this.u0) + this.v0;
    }

    public final int l() {
        return this.v0;
    }

    public final Object n(Object obj) {
        boolean z;
        ol7 ol7 = (ol7) obj;
        if ((ol7 instanceof d02) && this.c != (z = ((d02) ol7).c)) {
            return new c02(z);
        }
        return null;
    }

    public final boolean r() {
        return this.t0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmojiGroup(groupIndex=");
        sb.append(this.a);
        sb.append(", emojis=");
        sb.append(this.b);
        sb.append(", selected=");
        sb.append(this.c);
        sb.append(", category=");
        sb.append(this.o);
        sb.append(", iconUrl=");
        sb.append(this.X);
        sb.append(", iconLottieUrl=");
        sb.append(this.Y);
        sb.append(", name=");
        sb.append(this.Z);
        sb.append(", iconRes=");
        sb.append(this.s0);
        sb.append(", clearCategoryAvailable=");
        sb.append(this.t0);
        sb.append(", itemId=");
        return zr6.k(sb, this.u0, ")");
    }

    public d02(int i, List list, boolean z, ow4 ow4, String str, String str2, jqe jqe, int i2, boolean z2, long j) {
        this.a = i;
        this.b = list;
        this.c = z;
        this.o = ow4;
        this.X = str;
        this.Y = str2;
        this.Z = jqe;
        this.s0 = i2;
        this.t0 = z2;
        this.u0 = j;
        this.v0 = jca.q;
    }
}
