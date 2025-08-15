package defpackage;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: z2e  reason: default package */
public final class z2e implements ol7 {
    public static final z2e z0 = new z2e(0, 0, 0, (String) null, (String) null, (String) null, 0, 0, false, false, 0, 8190);
    public final String X;
    public final String Y;
    public final int Z;
    public final long a;
    public final long b;
    public final long c;
    public final String o;
    public final int s0;
    public final int t0;
    public final boolean u0;
    public final boolean v0;
    public final boolean w0;
    public final long x0;
    public final int y0;

    public z2e(long j, long j2, long j3, String str, String str2, String str3, int i, int i2, int i3, boolean z, boolean z2, boolean z3, long j4) {
        int i4;
        String str4 = str2;
        String str5 = str3;
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.o = str;
        this.X = str4;
        this.Y = str5;
        this.Z = i;
        this.s0 = i2;
        this.t0 = i3;
        this.u0 = z;
        this.v0 = z2;
        this.w0 = z3;
        this.x0 = j4;
        if (str5 != null && str3.length() != 0) {
            i4 = tga.j;
        } else if (str4 == null || str2.length() == 0) {
            i4 = tga.h;
        } else {
            i4 = tga.i;
        }
        this.y0 = i4;
    }

    public static z2e k(z2e z2e, boolean z, boolean z2, int i) {
        z2e z2e2 = z2e;
        int i2 = i;
        boolean z3 = (i2 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? z2e2.v0 : z;
        z2e z2e3 = r3;
        z2e z2e4 = new z2e(z2e2.a, z2e2.b, z2e2.c, z2e2.o, z2e2.X, z2e2.Y, z2e2.Z, z2e2.s0, z2e2.t0, z2e2.u0, z3, (i2 & 2048) != 0 ? z2e2.w0 : z2, z2e2.x0);
        return z2e3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2e)) {
            return false;
        }
        z2e z2e = (z2e) obj;
        return this.a == z2e.a && this.b == z2e.b && this.c == z2e.c && tpa.f(this.o, z2e.o) && tpa.f(this.X, z2e.X) && tpa.f(this.Y, z2e.Y) && this.Z == z2e.Z && this.s0 == z2e.s0 && this.t0 == z2e.t0 && this.u0 == z2e.u0 && this.v0 == z2e.v0 && this.w0 == z2e.w0 && this.x0 == z2e.x0;
    }

    public final long getItemId() {
        return this.x0;
    }

    public final boolean h(ol7 ol7) {
        return this.x0 == ol7.getItemId();
    }

    public final int hashCode() {
        int m = h4f.m(h4f.m(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        int i = 0;
        String str = this.o;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.X;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.Y;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return Long.hashCode(this.x0) + ms2.d(ms2.d(ms2.d(k7d.e(this.t0, k7d.e(this.s0, k7d.e(this.Z, (hashCode2 + i) * 31, 31), 31), 31), 31, this.u0), 31, this.v0), 31, this.w0);
    }

    public final int l() {
        return this.y0;
    }

    public final Object n(Object obj) {
        boolean z;
        ol7 ol7 = (ol7) obj;
        if ((ol7 instanceof z2e) && this.w0 != (z = ((z2e) ol7).w0)) {
            return new y2e(z);
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerModel(id=");
        sb.append(this.a);
        sb.append(", setId=");
        sb.append(this.b);
        sb.append(", originalSetId=");
        sb.append(this.c);
        sb.append(", previewUrl=");
        sb.append(this.o);
        sb.append(", lottieUrl=");
        sb.append(this.X);
        sb.append(", videoUrl=");
        sb.append(this.Y);
        sb.append(", markerType=");
        sb.append(this.Z);
        sb.append(", width=");
        sb.append(this.s0);
        sb.append(", height=");
        sb.append(this.t0);
        sb.append(", external=");
        sb.append(this.u0);
        sb.append(", favorite=");
        sb.append(this.v0);
        sb.append(", selected=");
        sb.append(this.w0);
        sb.append(", itemId=");
        return zr6.k(sb, this.x0, ")");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ z2e(long r23, long r25, long r27, java.lang.String r29, java.lang.String r30, java.lang.String r31, int r32, int r33, boolean r34, boolean r35, long r36, int r38) {
        /*
            r22 = this;
            r0 = r38
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x000a
            r7 = r2
            goto L_0x000c
        L_0x000a:
            r7 = r25
        L_0x000c:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0012
            r9 = r2
            goto L_0x0014
        L_0x0012:
            r9 = r27
        L_0x0014:
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L_0x001b
            r11 = r2
            goto L_0x001d
        L_0x001b:
            r11 = r29
        L_0x001d:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0023
            r12 = r2
            goto L_0x0025
        L_0x0023:
            r12 = r30
        L_0x0025:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x002b
            r13 = r2
            goto L_0x002d
        L_0x002b:
            r13 = r31
        L_0x002d:
            r1 = r0 & 128(0x80, float:1.794E-43)
            r2 = 0
            if (r1 == 0) goto L_0x0034
            r15 = r2
            goto L_0x0036
        L_0x0034:
            r15 = r32
        L_0x0036:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x003d
            r16 = r2
            goto L_0x003f
        L_0x003d:
            r16 = r33
        L_0x003f:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0046
            r18 = r2
            goto L_0x0048
        L_0x0046:
            r18 = r34
        L_0x0048:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x004f
            r19 = r2
            goto L_0x0051
        L_0x004f:
            r19 = r35
        L_0x0051:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0058
            r20 = r23
            goto L_0x005a
        L_0x0058:
            r20 = r36
        L_0x005a:
            r14 = 0
            r17 = 0
            r4 = r22
            r5 = r23
            r4.<init>(r5, r7, r9, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z2e.<init>(long, long, long, java.lang.String, java.lang.String, java.lang.String, int, int, boolean, boolean, long, int):void");
    }
}
