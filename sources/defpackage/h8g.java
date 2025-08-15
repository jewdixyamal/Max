package defpackage;

import androidx.work.WorkRequest;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: h8g  reason: default package */
public final class h8g {
    public static final String u = a14.O("WorkSpec");
    public static final mu1 v = new mu1(17);
    public final String a;
    public m7g b;
    public final String c;
    public String d;
    public d24 e;
    public final d24 f;
    public long g;
    public long h;
    public long i;
    public kj3 j;
    public int k;
    public mf0 l;
    public long m;
    public long n;
    public long o;
    public long p;
    public boolean q;
    public jna r;
    public final int s;
    public final int t;

    public h8g(String str, m7g m7g, String str2, String str3, d24 d24, d24 d242, long j2, long j3, long j4, kj3 kj3, int i2, mf0 mf0, long j5, long j6, long j7, long j8, boolean z, jna jna, int i3, int i4) {
        this.a = str;
        this.b = m7g;
        this.c = str2;
        this.d = str3;
        this.e = d24;
        this.f = d242;
        this.g = j2;
        this.h = j3;
        this.i = j4;
        this.j = kj3;
        this.k = i2;
        this.l = mf0;
        this.m = j5;
        this.n = j6;
        this.o = j7;
        this.p = j8;
        this.q = z;
        this.r = jna;
        this.s = i3;
        this.t = i4;
    }

    public static h8g b(h8g h8g, String str, m7g m7g, String str2, d24 d24, int i2, long j2, int i3, int i4) {
        h8g h8g2 = h8g;
        int i5 = i4;
        String str3 = (i5 & 1) != 0 ? h8g2.a : str;
        m7g m7g2 = (i5 & 2) != 0 ? h8g2.b : m7g;
        String str4 = (i5 & 4) != 0 ? h8g2.c : str2;
        String str5 = h8g2.d;
        d24 d242 = (i5 & 16) != 0 ? h8g2.e : d24;
        d24 d243 = h8g2.f;
        long j3 = h8g2.g;
        long j4 = h8g2.h;
        long j5 = h8g2.i;
        kj3 kj3 = h8g2.j;
        int i6 = (i5 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? h8g2.k : i2;
        long j6 = j5;
        mf0 mf0 = h8g2.l;
        int i7 = i5 & 8192;
        long j7 = h8g2.m;
        long j8 = i7 != 0 ? h8g2.n : j2;
        long j9 = h8g2.o;
        long j10 = h8g2.p;
        boolean z = h8g2.q;
        kj3 kj32 = kj3;
        jna jna = h8g2.r;
        int i8 = h8g2.s;
        int i9 = (i5 & 524288) != 0 ? h8g2.t : i3;
        h8g.getClass();
        return new h8g(str3, m7g2, str4, str5, d242, d243, j3, j4, j6, kj32, i6, mf0, j7, j8, j9, j10, z, jna, i8, i9);
    }

    public final long a() {
        int i2;
        if (this.b != m7g.a || (i2 = this.k) <= 0) {
            long j2 = 0;
            if (d()) {
                int i3 = this.s;
                long j3 = this.n;
                if (i3 == 0) {
                    j3 += this.g;
                }
                long j4 = this.i;
                long j5 = this.h;
                if (j4 != j5) {
                    if (i3 == 0) {
                        j2 = ((long) -1) * j4;
                    }
                    j3 += j5;
                } else if (i3 != 0) {
                    j2 = j5;
                }
                return j2 + j3;
            }
            long j6 = this.n;
            if (j6 == 0) {
                j6 = System.currentTimeMillis();
            }
            return j6 + this.g;
        }
        long scalb = this.l == mf0.b ? this.m * ((long) i2) : (long) Math.scalb((float) this.m, i2 - 1);
        long j7 = this.n;
        if (scalb > WorkRequest.MAX_BACKOFF_MILLIS) {
            scalb = 18000000;
        }
        return scalb + j7;
    }

    public final boolean c() {
        return !kj3.i.equals(this.j);
    }

    public final boolean d() {
        return this.h != 0;
    }

    public final void e(long j2) {
        int i2 = (j2 > WorkRequest.MAX_BACKOFF_MILLIS ? 1 : (j2 == WorkRequest.MAX_BACKOFF_MILLIS ? 0 : -1));
        String str = u;
        if (i2 > 0) {
            a14.u().R(str, "Backoff delay duration exceeds maximum value");
        }
        if (j2 < WorkRequest.MIN_BACKOFF_MILLIS) {
            a14.u().R(str, "Backoff delay duration less than minimum value");
        }
        this.m = ote.f(j2, WorkRequest.MIN_BACKOFF_MILLIS, WorkRequest.MAX_BACKOFF_MILLIS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8g)) {
            return false;
        }
        h8g h8g = (h8g) obj;
        return tpa.f(this.a, h8g.a) && this.b == h8g.b && tpa.f(this.c, h8g.c) && tpa.f(this.d, h8g.d) && tpa.f(this.e, h8g.e) && tpa.f(this.f, h8g.f) && this.g == h8g.g && this.h == h8g.h && this.i == h8g.i && tpa.f(this.j, h8g.j) && this.k == h8g.k && this.l == h8g.l && this.m == h8g.m && this.n == h8g.n && this.o == h8g.o && this.p == h8g.p && this.q == h8g.q && this.r == h8g.r && this.s == h8g.s && this.t == h8g.t;
    }

    public final int hashCode() {
        int d2 = rh4.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        String str = this.d;
        int hashCode = str == null ? 0 : str.hashCode();
        int m2 = h4f.m(h4f.m(h4f.m(h4f.m((this.l.hashCode() + k7d.e(this.k, (this.j.hashCode() + h4f.m(h4f.m(h4f.m((this.f.hashCode() + ((this.e.hashCode() + ((d2 + hashCode) * 31)) * 31)) * 31, 31, this.g), 31, this.h), 31, this.i)) * 31, 31)) * 31, 31, this.m), 31, this.n), 31, this.o), 31, this.p);
        boolean z = this.q;
        if (z) {
            z = true;
        }
        return Integer.hashCode(this.t) + k7d.e(this.s, (this.r.hashCode() + ((m2 + (z ? 1 : 0)) * 31)) * 31, 31);
    }

    public final String toString() {
        return rh4.m(new StringBuilder("{WorkSpec: "), this.a, '}');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ h8g(java.lang.String r31, defpackage.m7g r32, java.lang.String r33, java.lang.String r34, defpackage.d24 r35, defpackage.d24 r36, long r37, long r39, long r41, defpackage.kj3 r43, int r44, defpackage.mf0 r45, long r46, long r48, long r50, long r52, boolean r54, defpackage.jna r55, int r56, int r57, int r58) {
        /*
            r30 = this;
            r0 = r57
            r1 = r0 & 2
            if (r1 == 0) goto L_0x000a
            m7g r1 = defpackage.m7g.a
            r4 = r1
            goto L_0x000c
        L_0x000a:
            r4 = r32
        L_0x000c:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0013
            r1 = 0
            r6 = r1
            goto L_0x0015
        L_0x0013:
            r6 = r34
        L_0x0015:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x001d
            d24 r1 = defpackage.d24.b
            r7 = r1
            goto L_0x001f
        L_0x001d:
            r7 = r35
        L_0x001f:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0027
            d24 r1 = defpackage.d24.b
            r8 = r1
            goto L_0x0029
        L_0x0027:
            r8 = r36
        L_0x0029:
            r1 = r0 & 64
            r2 = 0
            if (r1 == 0) goto L_0x0031
            r9 = r2
            goto L_0x0033
        L_0x0031:
            r9 = r37
        L_0x0033:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0039
            r11 = r2
            goto L_0x003b
        L_0x0039:
            r11 = r39
        L_0x003b:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0041
            r13 = r2
            goto L_0x0043
        L_0x0041:
            r13 = r41
        L_0x0043:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x004b
            kj3 r1 = defpackage.kj3.i
            r15 = r1
            goto L_0x004d
        L_0x004b:
            r15 = r43
        L_0x004d:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            r5 = 0
            if (r1 == 0) goto L_0x0055
            r16 = r5
            goto L_0x0057
        L_0x0055:
            r16 = r44
        L_0x0057:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0060
            mf0 r1 = defpackage.mf0.a
            r17 = r1
            goto L_0x0062
        L_0x0060:
            r17 = r45
        L_0x0062:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0069
            r18 = 30000(0x7530, double:1.4822E-319)
            goto L_0x006b
        L_0x0069:
            r18 = r46
        L_0x006b:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x0072
            r20 = r2
            goto L_0x0074
        L_0x0072:
            r20 = r48
        L_0x0074:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x007b
            r22 = r2
            goto L_0x007d
        L_0x007b:
            r22 = r50
        L_0x007d:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0088
            r1 = -1
            r24 = r1
            goto L_0x008a
        L_0x0088:
            r24 = r52
        L_0x008a:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0092
            r26 = r5
            goto L_0x0094
        L_0x0092:
            r26 = r54
        L_0x0094:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x009e
            jna r1 = defpackage.jna.a
            r27 = r1
            goto L_0x00a0
        L_0x009e:
            r27 = r55
        L_0x00a0:
            r1 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x00a8
            r28 = r5
            goto L_0x00aa
        L_0x00a8:
            r28 = r56
        L_0x00aa:
            r29 = 0
            r2 = r30
            r3 = r31
            r5 = r33
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r11, r13, r15, r16, r17, r18, r20, r22, r24, r26, r27, r28, r29)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h8g.<init>(java.lang.String, m7g, java.lang.String, java.lang.String, d24, d24, long, long, long, kj3, int, mf0, long, long, long, long, boolean, jna, int, int, int):void");
    }
}
