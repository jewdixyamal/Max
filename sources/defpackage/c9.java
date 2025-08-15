package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* renamed from: c9  reason: default package */
public final class c9 extends fk0 {
    public final hg0 g;
    public final long h;
    public final long i;
    public final long j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final zw6 o;
    public final she p;
    public float q;
    public int r;
    public int s;
    public long t;
    public g78 u;

    public c9(rze rze, int[] iArr, hg0 hg0, long j2, long j3, long j4, int i2, int i3, float f, float f2, zw6 zw6, she she) {
        super(rze, iArr);
        if (j4 < j2) {
            z04.c0("Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j4 = j2;
        }
        this.g = hg0;
        this.h = j2 * 1000;
        this.i = j3 * 1000;
        this.j = j4 * 1000;
        this.k = i2;
        this.l = i3;
        this.m = f;
        this.n = f2;
        this.o = zw6.j(zw6);
        this.p = she;
        this.q = 1.0f;
        this.s = 0;
        this.t = -9223372036854775807L;
    }

    public static void v(ArrayList arrayList, long[] jArr) {
        long j2 = 0;
        for (long j3 : jArr) {
            j2 += j3;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ww6 ww6 = (ww6) arrayList.get(i2);
            if (ww6 != null) {
                ww6.a(new a9(j2, jArr[i2]));
            }
        }
    }

    public static long x(List list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        g78 g78 = (g78) mqd.m(list);
        long j2 = g78.Z;
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j3 = g78.s0;
        if (j3 != -9223372036854775807L) {
            return j3 - j2;
        }
        return -9223372036854775807L;
    }

    public final int b() {
        return this.r;
    }

    public final void e() {
        this.t = -9223372036854775807L;
        this.u = null;
    }

    public final int g(long j2, List list) {
        int i2;
        int i3;
        this.p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.t;
        if (j3 != -9223372036854775807L && elapsedRealtime - j3 < 1000 && (list.isEmpty() || ((g78) mqd.m(list)).equals(this.u))) {
            return list.size();
        }
        this.t = elapsedRealtime;
        this.u = list.isEmpty() ? null : (g78) mqd.m(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long E = oaf.E(this.q, ((g78) list.get(size - 1)).Z - j2);
        long j4 = this.j;
        if (E < j4) {
            return size;
        }
        x(list);
        qy5 qy5 = this.d[w(elapsedRealtime)];
        for (int i4 = 0; i4 < size; i4++) {
            g78 g78 = (g78) list.get(i4);
            qy5 qy52 = g78.o;
            if (oaf.E(this.q, g78.Z - j2) >= j4 && qy52.i < qy5.i && (i2 = qy52.u) != -1 && i2 <= this.l && (i3 = qy52.t) != -1 && i3 <= this.k && i2 < qy5.u) {
                return i4;
            }
        }
        return size;
    }

    public final void h() {
        this.u = null;
    }

    public final int k() {
        return this.s;
    }

    public final void l(float f) {
        this.q = f;
    }

    public final Object m() {
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0051  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r(long r14, long r16, long r18, java.util.List r20, defpackage.i78[] r21) {
        /*
            r13 = this;
            r0 = r13
            r1 = r21
            she r2 = r0.p
            r2.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            int r4 = r0.r
            int r5 = r1.length
            if (r4 >= r5) goto L_0x0027
            r4 = r1[r4]
            boolean r4 = r4.next()
            if (r4 == 0) goto L_0x0027
            int r4 = r0.r
            r1 = r1[r4]
            long r4 = r1.h()
            long r6 = r1.e()
        L_0x0025:
            long r4 = r4 - r6
            goto L_0x0043
        L_0x0027:
            int r4 = r1.length
            r5 = 0
        L_0x0029:
            if (r5 >= r4) goto L_0x003f
            r6 = r1[r5]
            boolean r7 = r6.next()
            if (r7 == 0) goto L_0x003c
            long r4 = r6.h()
            long r6 = r6.e()
            goto L_0x0025
        L_0x003c:
            int r5 = r5 + 1
            goto L_0x0029
        L_0x003f:
            long r4 = x(r20)
        L_0x0043:
            int r1 = r0.s
            if (r1 != 0) goto L_0x0051
            r1 = 1
            r0.s = r1
            int r1 = r13.w(r2)
            r0.r = r1
            return
        L_0x0051:
            int r6 = r0.r
            boolean r7 = r20.isEmpty()
            r8 = -1
            if (r7 == 0) goto L_0x005c
            r7 = r8
            goto L_0x0068
        L_0x005c:
            java.lang.Object r7 = defpackage.mqd.m(r20)
            g78 r7 = (defpackage.g78) r7
            qy5 r7 = r7.o
            int r7 = r13.s(r7)
        L_0x0068:
            if (r7 == r8) goto L_0x0073
            java.lang.Object r1 = defpackage.mqd.m(r20)
            g78 r1 = (defpackage.g78) r1
            int r1 = r1.X
            r6 = r7
        L_0x0073:
            int r7 = r13.w(r2)
            if (r7 == r6) goto L_0x00b7
            boolean r2 = r13.q(r6, r2)
            if (r2 != 0) goto L_0x00b7
            qy5[] r2 = r0.d
            r3 = r2[r6]
            r2 = r2[r7]
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r18 > r8 ? 1 : (r18 == r8 ? 0 : -1))
            long r11 = r0.h
            if (r10 != 0) goto L_0x0091
            goto L_0x00a3
        L_0x0091:
            int r8 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r8 == 0) goto L_0x0098
            long r4 = r18 - r4
            goto L_0x009a
        L_0x0098:
            r4 = r18
        L_0x009a:
            float r4 = (float) r4
            float r5 = r0.n
            float r4 = r4 * r5
            long r4 = (long) r4
            long r11 = java.lang.Math.min(r4, r11)
        L_0x00a3:
            int r2 = r2.i
            int r3 = r3.i
            if (r2 <= r3) goto L_0x00ae
            int r4 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r4 >= 0) goto L_0x00ae
            goto L_0x00b6
        L_0x00ae:
            if (r2 >= r3) goto L_0x00b7
            long r2 = r0.i
            int r2 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x00b7
        L_0x00b6:
            r7 = r6
        L_0x00b7:
            if (r7 != r6) goto L_0x00ba
            goto L_0x00bb
        L_0x00ba:
            r1 = 3
        L_0x00bb:
            r0.s = r1
            r0.r = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c9.r(long, long, long, java.util.List, i78[]):void");
    }

    public final int w(long j2) {
        long j3;
        i84 i84 = (i84) this.g;
        synchronized (i84) {
            j3 = i84.k;
        }
        this.g.getClass();
        long j4 = (long) (((float) ((long) (((float) j3) * this.m))) / this.q);
        if (!this.o.isEmpty()) {
            int i2 = 1;
            while (i2 < this.o.size() - 1 && ((a9) this.o.get(i2)).a < j4) {
                i2++;
            }
            a9 a9Var = (a9) this.o.get(i2 - 1);
            a9 a9Var2 = (a9) this.o.get(i2);
            long j5 = a9Var.a;
            float f = ((float) (j4 - j5)) / ((float) (a9Var2.a - j5));
            long j6 = a9Var.b;
            j4 = j6 + ((long) (f * ((float) (a9Var2.b - j6))));
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.b; i4++) {
            if (j2 == Long.MIN_VALUE || !q(i4, j2)) {
                if (((long) d(i4).i) <= j4) {
                    return i4;
                }
                i3 = i4;
            }
        }
        return i3;
    }
}
