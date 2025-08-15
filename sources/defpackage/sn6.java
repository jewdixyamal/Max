package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: sn6  reason: default package */
public final class sn6 implements co7, ho7, i6d, oa5, brc {
    public static final Set j1 = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[]{1, 2, 5})));
    public final ln6 A0;
    public final ln6 B0;
    public final Handler C0;
    public final ArrayList D0;
    public final Map E0;
    public h13 F0;
    public qn6[] G0;
    public int[] H0;
    public final HashSet I0;
    public final SparseIntArray J0;
    public on6 K0;
    public int L0;
    public int M0;
    public boolean N0;
    public boolean O0;
    public int P0;
    public oy5 Q0;
    public oy5 R0;
    public boolean S0;
    public sze T0;
    public Set U0;
    public int[] V0;
    public int W0;
    public final n64 X;
    public boolean X0;
    public final oy5 Y;
    public boolean[] Y0;
    public final sr4 Z;
    public boolean[] Z0;
    public final String a;
    public long a1;
    public final int b;
    public long b1;
    public final em6 c;
    public boolean c1;
    public boolean d1;
    public boolean e1;
    public boolean f1;
    public long g1;
    public cr4 h1;
    public cm6 i1;
    public final wl6 o;
    public final kr4 s0;
    public final buc t0;
    public final jo7 u0 = new jo7("Loader:HlsSampleStreamWrapper", 0);
    public final gk8 v0;
    public final int w0;
    public final td x0;
    public final ArrayList y0;
    public final List z0;

    public sn6(String str, int i, em6 em6, wl6 wl6, Map map, n64 n64, long j, oy5 oy5, sr4 sr4, kr4 kr4, buc buc, gk8 gk8, int i2) {
        this.a = str;
        this.b = i;
        this.c = em6;
        this.o = wl6;
        this.E0 = map;
        this.X = n64;
        this.Y = oy5;
        this.Z = sr4;
        this.s0 = kr4;
        this.t0 = buc;
        this.v0 = gk8;
        this.w0 = i2;
        td tdVar = new td(9, (byte) 0);
        tdVar.c = null;
        tdVar.b = false;
        tdVar.o = null;
        this.x0 = tdVar;
        this.H0 = new int[0];
        Set set = j1;
        this.I0 = new HashSet(set.size());
        this.J0 = new SparseIntArray(set.size());
        this.G0 = new qn6[0];
        this.Z0 = new boolean[0];
        this.Y0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.y0 = arrayList;
        this.z0 = Collections.unmodifiableList(arrayList);
        this.D0 = new ArrayList();
        this.A0 = new ln6(this, 0);
        this.B0 = new ln6(this, 1);
        this.C0 = maf.m((Handler.Callback) null);
        this.a1 = j;
        this.b1 = j;
    }

    public static oy5 g(oy5 oy5, oy5 oy52, boolean z) {
        String str;
        String str2;
        if (oy5 == null) {
            return oy52;
        }
        String str3 = oy52.w0;
        int g = ha9.g(str3);
        String str4 = oy5.t0;
        if (maf.p(g, str4) == 1) {
            str2 = maf.q(g, str4);
            str = ha9.c(str2);
        } else {
            String a2 = ha9.a(str4, str3);
            str = str3;
            str2 = a2;
        }
        my5 a3 = oy52.a();
        a3.a = oy5.a;
        a3.b = oy5.b;
        a3.c = oy5.c;
        a3.d = oy5.o;
        a3.e = oy5.X;
        a3.f = z ? oy5.Y : -1;
        a3.g = z ? oy5.Z : -1;
        a3.h = str2;
        if (g == 2) {
            a3.p = oy5.B0;
            a3.q = oy5.C0;
            a3.r = oy5.D0;
        }
        if (str != null) {
            a3.k = str;
        }
        int i = oy5.J0;
        if (i != -1 && g == 1) {
            a3.x = i;
        }
        e99 e99 = oy5.u0;
        if (e99 != null) {
            e99 e992 = oy52.u0;
            if (e992 != null) {
                c99[] c99Arr = e99.a;
                if (c99Arr.length == 0) {
                    e99 = e992;
                } else {
                    c99[] c99Arr2 = e992.a;
                    Object[] copyOf = Arrays.copyOf(c99Arr2, c99Arr2.length + c99Arr.length);
                    System.arraycopy(c99Arr, 0, copyOf, c99Arr2.length, c99Arr.length);
                    e99 = new e99((c99[]) copyOf);
                }
            }
            a3.i = e99;
        }
        return new oy5(a3);
    }

    public static int j(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    /* JADX WARNING: type inference failed for: r1v15, types: [dt4] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.xze B(int r12, int r13) {
        /*
            r11 = this;
            r0 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            java.util.Set r2 = j1
            boolean r1 = r2.contains(r1)
            java.util.HashSet r3 = r11.I0
            android.util.SparseIntArray r4 = r11.J0
            r5 = 0
            r6 = 0
            if (r1 == 0) goto L_0x0046
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            boolean r1 = r2.contains(r1)
            defpackage.np8.d(r1)
            r1 = -1
            int r2 = r4.get(r13, r1)
            if (r2 != r1) goto L_0x0026
            goto L_0x0057
        L_0x0026:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            boolean r1 = r3.add(r1)
            if (r1 == 0) goto L_0x0034
            int[] r1 = r11.H0
            r1[r2] = r12
        L_0x0034:
            int[] r1 = r11.H0
            r1 = r1[r2]
            if (r1 != r12) goto L_0x0040
            qn6[] r1 = r11.G0
            r1 = r1[r2]
        L_0x003e:
            r6 = r1
            goto L_0x0057
        L_0x0040:
            dt4 r1 = new dt4
            r1.<init>()
            goto L_0x003e
        L_0x0046:
            r1 = r5
        L_0x0047:
            qn6[] r2 = r11.G0
            int r7 = r2.length
            if (r1 >= r7) goto L_0x0057
            int[] r7 = r11.H0
            r7 = r7[r1]
            if (r7 != r12) goto L_0x0055
            r6 = r2[r1]
            goto L_0x0057
        L_0x0055:
            int r1 = r1 + r0
            goto L_0x0047
        L_0x0057:
            if (r6 != 0) goto L_0x00e9
            boolean r1 = r11.f1
            if (r1 == 0) goto L_0x0063
            dt4 r11 = new dt4
            r11.<init>()
            return r11
        L_0x0063:
            qn6[] r1 = r11.G0
            int r1 = r1.length
            if (r13 == r0) goto L_0x006b
            r2 = 2
            if (r13 != r2) goto L_0x006c
        L_0x006b:
            r5 = r0
        L_0x006c:
            qn6 r6 = new qn6
            n64 r2 = r11.X
            java.util.Map r7 = r11.E0
            sr4 r8 = r11.Z
            kr4 r9 = r11.s0
            r6.<init>(r2, r8, r9, r7)
            long r7 = r11.a1
            r6.t = r7
            if (r5 == 0) goto L_0x0085
            cr4 r2 = r11.h1
            r6.I = r2
            r6.z = r0
        L_0x0085:
            long r7 = r11.g1
            long r9 = r6.F
            int r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x0091
            r6.F = r7
            r6.z = r0
        L_0x0091:
            cm6 r2 = r11.i1
            if (r2 == 0) goto L_0x0099
            int r2 = r2.v0
            r6.C = r2
        L_0x0099:
            r6.f = r11
            int[] r2 = r11.H0
            int r7 = r1 + 1
            int[] r2 = java.util.Arrays.copyOf(r2, r7)
            r11.H0 = r2
            r2[r1] = r12
            qn6[] r12 = r11.G0
            int r2 = defpackage.maf.a
            int r2 = r12.length
            int r2 = r2 + r0
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r12, r2)
            int r12 = r12.length
            r0[r12] = r6
            qn6[] r0 = (defpackage.qn6[]) r0
            r11.G0 = r0
            boolean[] r12 = r11.Z0
            boolean[] r12 = java.util.Arrays.copyOf(r12, r7)
            r11.Z0 = r12
            r12[r1] = r5
            boolean r12 = r11.X0
            r12 = r12 | r5
            r11.X0 = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
            r3.add(r12)
            r4.append(r13, r1)
            int r12 = j(r13)
            int r0 = r11.L0
            int r0 = j(r0)
            if (r12 <= r0) goto L_0x00e1
            r11.M0 = r1
            r11.L0 = r13
        L_0x00e1:
            boolean[] r12 = r11.Y0
            boolean[] r12 = java.util.Arrays.copyOf(r12, r7)
            r11.Y0 = r12
        L_0x00e9:
            r12 = 5
            if (r13 != r12) goto L_0x00fc
            on6 r12 = r11.K0
            if (r12 != 0) goto L_0x00f9
            on6 r12 = new on6
            int r13 = r11.w0
            r12.<init>(r6, r13)
            r11.K0 = r12
        L_0x00f9:
            on6 r11 = r11.K0
            return r11
        L_0x00fc:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sn6.B(int, int):xze");
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x026d  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02f2  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0300  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0318  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x031d  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0321  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0484  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0491  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0535  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x021b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean C(long r56) {
        /*
            r55 = this;
            r0 = r55
            r10 = 1
            boolean r1 = r0.e1
            r11 = 0
            if (r1 != 0) goto L_0x0016
            jo7 r12 = r0.u0
            boolean r1 = r12.o()
            if (r1 != 0) goto L_0x0016
            boolean r1 = r12.n()
            if (r1 == 0) goto L_0x0019
        L_0x0016:
            r0 = r11
            goto L_0x053d
        L_0x0019:
            boolean r1 = r55.m()
            if (r1 == 0) goto L_0x0036
            java.util.List r1 = java.util.Collections.emptyList()
            long r2 = r0.b1
            qn6[] r4 = r0.G0
            int r5 = r4.length
            r6 = r11
        L_0x0029:
            if (r6 >= r5) goto L_0x0033
            r7 = r4[r6]
            long r8 = r0.b1
            r7.t = r8
            int r6 = r6 + r10
            goto L_0x0029
        L_0x0033:
            r8 = r1
            r14 = r2
            goto L_0x004e
        L_0x0036:
            cm6 r1 = r55.i()
            boolean r2 = r1.S0
            if (r2 == 0) goto L_0x0042
            long r1 = r1.s0
        L_0x0040:
            r2 = r1
            goto L_0x004b
        L_0x0042:
            long r2 = r0.a1
            long r4 = r1.Z
            long r1 = java.lang.Math.max(r2, r4)
            goto L_0x0040
        L_0x004b:
            java.util.List r1 = r0.z0
            goto L_0x0033
        L_0x004e:
            td r13 = r0.x0
            r9 = 0
            r13.c = r9
            r13.b = r11
            r13.o = r9
            boolean r1 = r0.O0
            if (r1 != 0) goto L_0x0065
            boolean r1 = r8.isEmpty()
            if (r1 != 0) goto L_0x0062
            goto L_0x0065
        L_0x0062:
            r21 = r11
            goto L_0x0067
        L_0x0065:
            r21 = r10
        L_0x0067:
            wl6 r6 = r0.o
            r6.getClass()
            boolean r1 = r8.isEmpty()
            if (r1 == 0) goto L_0x0074
            r7 = r9
            goto L_0x007b
        L_0x0074:
            java.lang.Object r1 = defpackage.mqd.m(r8)
            cm6 r1 = (defpackage.cm6) r1
            r7 = r1
        L_0x007b:
            if (r7 != 0) goto L_0x007f
            r5 = -1
            goto L_0x0088
        L_0x007f:
            qze r1 = r6.h
            oy5 r2 = r7.o
            int r1 = r1.a(r2)
            r5 = r1
        L_0x0088:
            long r1 = r14 - r56
            r17 = r5
            long r4 = r6.r
            r22 = r12
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r3 == 0) goto L_0x009c
            long r4 = r4 - r56
            goto L_0x009d
        L_0x009c:
            r4 = r11
        L_0x009d:
            if (r7 == 0) goto L_0x00c0
            boolean r3 = r6.p
            if (r3 != 0) goto L_0x00c0
            long r9 = r7.s0
            long r11 = r7.Z
            long r9 = r9 - r11
            long r1 = r1 - r9
            r11 = 0
            long r1 = java.lang.Math.max(r11, r1)
            r19 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r3 == 0) goto L_0x00c0
            long r4 = r4 - r9
            long r3 = java.lang.Math.max(r11, r4)
            r9 = r3
        L_0x00be:
            r4 = r1
            goto L_0x00c2
        L_0x00c0:
            r9 = r4
            goto L_0x00be
        L_0x00c2:
            h78[] r11 = r6.a(r7, r14)
            m85 r1 = r6.q
            r2 = r56
            r12 = r17
            r0 = -1
            r0 = r6
            r57 = r7
            r6 = r9
            r10 = 0
            r9 = r11
            r1.t(r2, r4, r6, r8, r9)
            m85 r1 = r0.q
            int r5 = r1.i()
            if (r12 == r5) goto L_0x00e0
            r1 = 1
            goto L_0x00e1
        L_0x00e0:
            r1 = 0
        L_0x00e1:
            android.net.Uri[] r2 = r0.e
            r3 = r2[r5]
            hb4 r4 = r0.g
            boolean r6 = r4.d(r3)
            if (r6 != 0) goto L_0x00ff
            r13.o = r3
            boolean r1 = r0.s
            android.net.Uri r2 = r0.o
            boolean r2 = r3.equals(r2)
            r1 = r1 & r2
            r0.s = r1
            r0.o = r3
            r0 = r13
            goto L_0x0478
        L_0x00ff:
            r6 = 1
            pm6 r7 = r4.a(r3, r6)
            r7.getClass()
            boolean r6 = r7.c
            r0.p = r6
            boolean r6 = r7.o
            long r8 = r7.h
            if (r6 == 0) goto L_0x0119
            r23 = r7
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0122
        L_0x0119:
            long r10 = r7.u
            long r10 = r10 + r8
            r23 = r7
            long r6 = r4.Z
            long r6 = r10 - r6
        L_0x0122:
            r0.r = r6
            long r6 = r4.Z
            long r8 = r8 - r6
            r7 = r13
            r13 = r0
            r10 = r14
            r14 = r57
            r15 = r1
            r16 = r23
            r17 = r8
            r19 = r10
            android.util.Pair r6 = r13.c(r14, r15, r16, r17, r19)
            java.lang.Object r13 = r6.first
            java.lang.Long r13 = (java.lang.Long) r13
            long r13 = r13.longValue()
            java.lang.Object r6 = r6.second
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r16 = r5
            r17 = r6
            r15 = r23
            long r5 = r15.k
            int r5 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r5 >= 0) goto L_0x0188
            r5 = r57
            if (r5 == 0) goto L_0x018a
            if (r1 == 0) goto L_0x018a
            r3 = r2[r12]
            r1 = 1
            pm6 r2 = r4.a(r3, r1)
            r2.getClass()
            long r8 = r4.Z
            long r13 = r2.h
            long r8 = r13 - r8
            r15 = 0
            r13 = r0
            r14 = r5
            r16 = r2
            r17 = r8
            r19 = r10
            android.util.Pair r1 = r13.c(r14, r15, r16, r17, r19)
            java.lang.Object r4 = r1.first
            java.lang.Long r4 = (java.lang.Long) r4
            long r13 = r4.longValue()
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r15 = r2
            goto L_0x018e
        L_0x0188:
            r5 = r57
        L_0x018a:
            r12 = r16
            r1 = r17
        L_0x018e:
            long r10 = r15.k
            int r2 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r2 >= 0) goto L_0x019e
            com.google.android.exoplayer2.source.BehindLiveWindowException r1 = new com.google.android.exoplayer2.source.BehindLiveWindowException
            r1.<init>()
            r0.n = r1
        L_0x019b:
            r0 = r7
            goto L_0x0478
        L_0x019e:
            r16 = r8
            long r8 = r13 - r10
            int r2 = (int) r8
            zw6 r4 = r15.r
            int r6 = r4.size()
            zw6 r8 = r15.s
            r18 = 1
            if (r2 != r6) goto L_0x01c6
            r6 = -1
            if (r1 == r6) goto L_0x01b3
            goto L_0x01b4
        L_0x01b3:
            r1 = 0
        L_0x01b4:
            int r2 = r8.size()
            if (r1 >= r2) goto L_0x0218
            vl6 r9 = new vl6
            java.lang.Object r2 = r8.get(r1)
            mm6 r2 = (defpackage.mm6) r2
            r9.<init>((defpackage.mm6) r2, (long) r13, (int) r1)
            goto L_0x0219
        L_0x01c6:
            java.lang.Object r6 = r4.get(r2)
            km6 r6 = (defpackage.km6) r6
            r9 = -1
            if (r1 != r9) goto L_0x01d6
            vl6 r1 = new vl6
            r1.<init>((defpackage.mm6) r6, (long) r13, (int) r9)
            r9 = r1
            goto L_0x0219
        L_0x01d6:
            zw6 r9 = r6.x0
            int r9 = r9.size()
            if (r1 >= r9) goto L_0x01ec
            vl6 r9 = new vl6
            zw6 r2 = r6.x0
            java.lang.Object r2 = r2.get(r1)
            mm6 r2 = (defpackage.mm6) r2
            r9.<init>((defpackage.mm6) r2, (long) r13, (int) r1)
            goto L_0x0219
        L_0x01ec:
            r1 = 1
            int r2 = r2 + r1
            int r1 = r4.size()
            if (r2 >= r1) goto L_0x0203
            vl6 r9 = new vl6
            java.lang.Object r1 = r4.get(r2)
            mm6 r1 = (defpackage.mm6) r1
            long r13 = r13 + r18
            r2 = -1
            r9.<init>((defpackage.mm6) r1, (long) r13, (int) r2)
            goto L_0x0219
        L_0x0203:
            boolean r1 = r8.isEmpty()
            if (r1 != 0) goto L_0x0218
            vl6 r9 = new vl6
            r1 = 0
            java.lang.Object r2 = r8.get(r1)
            mm6 r2 = (defpackage.mm6) r2
            long r13 = r13 + r18
            r9.<init>((defpackage.mm6) r2, (long) r13, (int) r1)
            goto L_0x0219
        L_0x0218:
            r9 = 0
        L_0x0219:
            if (r9 != 0) goto L_0x024e
            boolean r1 = r15.o
            if (r1 != 0) goto L_0x0230
            r7.o = r3
            boolean r1 = r0.s
            android.net.Uri r2 = r0.o
            boolean r2 = r3.equals(r2)
            r1 = r1 & r2
            r0.s = r1
            r0.o = r3
            goto L_0x019b
        L_0x0230:
            if (r21 != 0) goto L_0x0238
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L_0x023a
        L_0x0238:
            r0 = 1
            goto L_0x0250
        L_0x023a:
            vl6 r9 = new vl6
            java.lang.Object r1 = defpackage.mqd.m(r4)
            mm6 r1 = (defpackage.mm6) r1
            int r2 = r4.size()
            long r13 = (long) r2
            long r10 = r10 + r13
            long r10 = r10 - r18
            r2 = -1
            r9.<init>((defpackage.mm6) r1, (long) r10, (int) r2)
        L_0x024e:
            r1 = 0
            goto L_0x0254
        L_0x0250:
            r7.b = r0
            goto L_0x019b
        L_0x0254:
            r0.s = r1
            r1 = 0
            r0.o = r1
            java.lang.Comparable r1 = r9.d
            mm6 r1 = (defpackage.mm6) r1
            km6 r2 = r1.b
            java.lang.String r4 = r15.a
            if (r2 == 0) goto L_0x026d
            java.lang.String r2 = r2.Z
            if (r2 != 0) goto L_0x0268
            goto L_0x026d
        L_0x0268:
            android.net.Uri r2 = defpackage.kq0.F(r4, r2)
            goto L_0x026e
        L_0x026d:
            r2 = 0
        L_0x026e:
            pl6 r8 = r0.d(r2, r12)
            r7.c = r8
            if (r8 == 0) goto L_0x0278
        L_0x0276:
            goto L_0x019b
        L_0x0278:
            java.lang.String r8 = r1.Z
            if (r8 != 0) goto L_0x027e
            r8 = 0
            goto L_0x0282
        L_0x027e:
            android.net.Uri r8 = defpackage.kq0.F(r4, r8)
        L_0x0282:
            pl6 r10 = r0.d(r8, r12)
            r7.c = r10
            if (r10 == 0) goto L_0x028b
            goto L_0x0276
        L_0x028b:
            long r10 = r1.X
            if (r5 != 0) goto L_0x0296
            java.util.concurrent.atomic.AtomicInteger r13 = defpackage.cm6.W0
        L_0x0291:
            r19 = r7
            r53 = 0
            goto L_0x02cd
        L_0x0296:
            android.net.Uri r13 = r5.x0
            boolean r13 = r3.equals(r13)
            if (r13 == 0) goto L_0x02a3
            boolean r13 = r5.S0
            if (r13 == 0) goto L_0x02a3
            goto L_0x0291
        L_0x02a3:
            long r13 = r16 + r10
            boolean r6 = r1 instanceof defpackage.gm6
            r19 = r7
            boolean r7 = r15.c
            if (r6 == 0) goto L_0x02bf
            r6 = r1
            gm6 r6 = (defpackage.gm6) r6
            boolean r6 = r6.w0
            if (r6 != 0) goto L_0x02bd
            int r6 = r9.b
            if (r6 != 0) goto L_0x02bb
            if (r7 == 0) goto L_0x02bb
            goto L_0x02bd
        L_0x02bb:
            r6 = 0
            goto L_0x02be
        L_0x02bd:
            r6 = 1
        L_0x02be:
            r7 = r6
        L_0x02bf:
            if (r7 == 0) goto L_0x02ca
            long r6 = r5.s0
            int r6 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x02c8
            goto L_0x02ca
        L_0x02c8:
            r6 = 0
            goto L_0x02cb
        L_0x02ca:
            r6 = 1
        L_0x02cb:
            r53 = r6
        L_0x02cd:
            boolean r6 = r9.c
            if (r53 == 0) goto L_0x02d7
            if (r6 == 0) goto L_0x02d7
            r0 = r19
            goto L_0x0478
        L_0x02d7:
            oy5[] r7 = r0.f
            r28 = r7[r12]
            m85 r7 = r0.q
            int r35 = r7.k()
            m85 r7 = r0.q
            java.lang.Object r36 = r7.m()
            boolean r7 = r0.l
            bkg r12 = r0.j
            if (r8 != 0) goto L_0x02f2
            r12.getClass()
            r8 = 0
            goto L_0x02fc
        L_0x02f2:
            java.lang.Object r13 = r12.b
            i56 r13 = (defpackage.i56) r13
            java.lang.Object r8 = r13.get(r8)
            byte[] r8 = (byte[]) r8
        L_0x02fc:
            if (r2 != 0) goto L_0x0300
            r2 = 0
            goto L_0x030a
        L_0x0300:
            java.lang.Object r12 = r12.b
            i56 r12 = (defpackage.i56) r12
            java.lang.Object r2 = r12.get(r2)
            byte[] r2 = (byte[]) r2
        L_0x030a:
            java.util.concurrent.atomic.AtomicInteger r12 = defpackage.cm6.W0
            java.util.Map r43 = java.util.Collections.emptyMap()
            java.lang.String r12 = r1.a
            android.net.Uri r38 = defpackage.kq0.F(r4, r12)
            if (r6 == 0) goto L_0x031d
            r12 = 8
            r49 = r12
            goto L_0x031f
        L_0x031d:
            r49 = 0
        L_0x031f:
            if (r38 == 0) goto L_0x0535
            z24 r27 = new z24
            r48 = 0
            r50 = 0
            r39 = 0
            r41 = 1
            r42 = 0
            long r12 = r1.t0
            r14 = r6
            r20 = r7
            long r6 = r1.u0
            r37 = r27
            r44 = r12
            r46 = r6
            r37.<init>(r38, r39, r41, r42, r43, r44, r46, r48, r49, r50)
            if (r8 == 0) goto L_0x0342
            r29 = 1
            goto L_0x0344
        L_0x0342:
            r29 = 0
        L_0x0344:
            if (r29 == 0) goto L_0x0350
            java.lang.String r6 = r1.s0
            r6.getClass()
            byte[] r6 = defpackage.cm6.e(r6)
            goto L_0x0351
        L_0x0350:
            r6 = 0
        L_0x0351:
            r24 r7 = r0.b
            if (r8 == 0) goto L_0x0360
            r6.getClass()
            ic r12 = new ic
            r12.<init>(r7, r8, r6)
            r26 = r12
            goto L_0x0362
        L_0x0360:
            r26 = r7
        L_0x0362:
            km6 r6 = r1.b
            if (r6 == 0) goto L_0x03b6
            if (r2 == 0) goto L_0x036a
            r8 = 1
            goto L_0x036b
        L_0x036a:
            r8 = 0
        L_0x036b:
            if (r8 == 0) goto L_0x0377
            java.lang.String r12 = r6.s0
            r12.getClass()
            byte[] r12 = defpackage.cm6.e(r12)
            goto L_0x0378
        L_0x0377:
            r12 = 0
        L_0x0378:
            java.lang.String r13 = r6.a
            android.net.Uri r38 = defpackage.kq0.F(r4, r13)
            z24 r4 = new z24
            r56 = r8
            r13 = r9
            long r8 = r6.t0
            r21 = r13
            r57 = r14
            long r13 = r6.u0
            java.util.Map r43 = java.util.Collections.emptyMap()
            r49 = 0
            r50 = 0
            r39 = 0
            r41 = 1
            r42 = 0
            r48 = 0
            r37 = r4
            r44 = r8
            r46 = r13
            r37.<init>(r38, r39, r41, r42, r43, r44, r46, r48, r49, r50)
            if (r2 == 0) goto L_0x03b0
            r12.getClass()
            ic r6 = new ic
            r6.<init>(r7, r2, r12)
            r9 = r6
            goto L_0x03b1
        L_0x03b0:
            r9 = r7
        L_0x03b1:
            r32 = r56
            r30 = r9
            goto L_0x03bf
        L_0x03b6:
            r21 = r9
            r57 = r14
            r4 = 0
            r30 = 0
            r32 = 0
        L_0x03bf:
            long r37 = r16 + r10
            long r6 = r1.c
            long r39 = r37 + r6
            int r2 = r15.j
            int r6 = r1.o
            int r2 = r2 + r6
            if (r5 == 0) goto L_0x0414
            z24 r6 = r5.B0
            if (r4 == r6) goto L_0x03e9
            if (r4 == 0) goto L_0x03e7
            if (r6 == 0) goto L_0x03e7
            android.net.Uri r7 = r4.a
            android.net.Uri r8 = r6.a
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x03e7
            long r7 = r4.f
            long r9 = r6.f
            int r6 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r6 != 0) goto L_0x03e7
            goto L_0x03e9
        L_0x03e7:
            r6 = 0
            goto L_0x03ea
        L_0x03e9:
            r6 = 1
        L_0x03ea:
            android.net.Uri r7 = r5.x0
            boolean r7 = r3.equals(r7)
            if (r7 == 0) goto L_0x03f8
            boolean r7 = r5.S0
            if (r7 == 0) goto L_0x03f8
            r7 = 1
            goto L_0x03f9
        L_0x03f8:
            r7 = 0
        L_0x03f9:
            if (r6 == 0) goto L_0x0408
            if (r7 == 0) goto L_0x0408
            boolean r6 = r5.U0
            if (r6 != 0) goto L_0x0408
            int r6 = r5.w0
            if (r6 != r2) goto L_0x0408
            nw4 r9 = r5.N0
            goto L_0x0409
        L_0x0408:
            r9 = 0
        L_0x0409:
            at6 r6 = r5.J0
            yaf r5 = r5.K0
            r52 = r5
            r51 = r6
            r50 = r9
            goto L_0x0427
        L_0x0414:
            at6 r5 = new at6
            r6 = 0
            r5.<init>(r6)
            yaf r7 = new yaf
            r8 = 10
            r7.<init>((int) r8)
            r51 = r5
            r50 = r6
            r52 = r7
        L_0x0427:
            cm6 r5 = new cm6
            r6 = 1
            r44 = r57 ^ 1
            o9g r6 = r0.d
            java.lang.Object r6 = r6.b
            android.util.SparseArray r6 = (android.util.SparseArray) r6
            java.lang.Object r7 = r6.get(r2)
            sue r7 = (defpackage.sue) r7
            if (r7 != 0) goto L_0x0447
            sue r7 = new sue
            r8 = 9223372036854775806(0x7ffffffffffffffe, double:NaN)
            r7.<init>(r8)
            r6.put(r2, r7)
        L_0x0447:
            r48 = r7
            r9 = r21
            int r6 = r9.b
            r43 = r6
            boolean r6 = r1.v0
            r46 = r6
            zl6 r6 = r0.a
            r25 = r6
            java.util.List r6 = r0.i
            r34 = r6
            long r6 = r9.a
            r41 = r6
            cr4 r1 = r1.Y
            r49 = r1
            i4b r0 = r0.k
            r54 = r0
            r24 = r5
            r31 = r4
            r33 = r3
            r45 = r2
            r47 = r20
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r39, r41, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54)
            r0 = r19
            r0.c = r5
        L_0x0478:
            boolean r1 = r0.b
            java.lang.Object r2 = r0.c
            h13 r2 = (defpackage.h13) r2
            java.lang.Object r0 = r0.o
            android.net.Uri r0 = (android.net.Uri) r0
            if (r1 == 0) goto L_0x0491
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1 = r55
            r1.b1 = r3
            r0 = 1
            r1.e1 = r0
            return r0
        L_0x0491:
            r1 = r55
            if (r2 != 0) goto L_0x04aa
            if (r0 == 0) goto L_0x04a8
            em6 r1 = r1.c
            hb4 r1 = r1.b
            java.util.HashMap r1 = r1.b
            java.lang.Object r0 = r1.get(r0)
            fb4 r0 = (defpackage.fb4) r0
            android.net.Uri r1 = r0.a
            r0.c(r1)
        L_0x04a8:
            r0 = 0
            return r0
        L_0x04aa:
            boolean r0 = r2 instanceof defpackage.cm6
            if (r0 == 0) goto L_0x0500
            r0 = r2
            cm6 r0 = (defpackage.cm6) r0
            r1.i1 = r0
            oy5 r3 = r0.o
            r1.Q0 = r3
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.b1 = r3
            java.util.ArrayList r3 = r1.y0
            r3.add(r0)
            ww6 r3 = defpackage.zw6.i()
            qn6[] r4 = r1.G0
            int r5 = r4.length
            r6 = 0
        L_0x04cb:
            if (r6 >= r5) goto L_0x04de
            r7 = r4[r6]
            int r8 = r7.q
            int r7 = r7.p
            int r8 = r8 + r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r3.a(r7)
            r7 = 1
            int r6 = r6 + r7
            goto L_0x04cb
        L_0x04de:
            ffc r3 = r3.j()
            r0.O0 = r1
            r0.T0 = r3
            qn6[] r3 = r1.G0
            int r4 = r3.length
            r11 = 0
        L_0x04ea:
            if (r11 >= r4) goto L_0x0500
            r5 = r3[r11]
            r5.getClass()
            int r6 = r0.v0
            r5.C = r6
            boolean r6 = r0.y0
            if (r6 == 0) goto L_0x04fd
            r6 = 1
            r5.G = r6
            goto L_0x04fe
        L_0x04fd:
            r6 = 1
        L_0x04fe:
            int r11 = r11 + r6
            goto L_0x04ea
        L_0x0500:
            r1.F0 = r2
            buc r0 = r1.t0
            int r3 = r2.c
            int r0 = r0.v(r3)
            r3 = r22
            long r8 = r3.w(r2, r1, r0)
            xn7 r11 = new xn7
            long r5 = r2.a
            z24 r7 = r2.b
            r4 = r11
            r4.<init>(r5, r7, r8)
            int r15 = r2.X
            java.lang.Object r0 = r2.Y
            gk8 r10 = r1.v0
            int r12 = r2.c
            int r13 = r1.b
            oy5 r14 = r2.o
            long r3 = r2.Z
            long r1 = r2.s0
            r16 = r0
            r17 = r3
            r19 = r1
            r10.k(r11, r12, r13, r14, r15, r16, r17, r19)
            r0 = 1
            return r0
        L_0x0535:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "The uri must be set."
            r0.<init>(r1)
            throw r0
        L_0x053d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sn6.C(long):boolean");
    }

    public final boolean D(long j, boolean z) {
        this.a1 = j;
        if (m()) {
            this.b1 = j;
            return true;
        }
        if (this.N0 && !z) {
            int length = this.G0.length;
            int i = 0;
            while (i < length) {
                if (this.G0[i].A(j, false) || (!this.Z0[i] && this.X0)) {
                    i++;
                }
            }
            return false;
        }
        this.b1 = j;
        this.e1 = false;
        this.y0.clear();
        jo7 jo7 = this.u0;
        if (jo7.o()) {
            if (this.N0) {
                for (qn6 i2 : this.G0) {
                    i2.i();
                }
            }
            jo7.a();
        } else {
            jo7.c = null;
            x();
        }
        return true;
    }

    public final void M(u1d u1d) {
    }

    public final boolean a() {
        return this.u0.o();
    }

    public final void b() {
        for (qn6 qn6 : this.G0) {
            qn6.z(true);
            er4 er4 = qn6.h;
            if (er4 != null) {
                er4.f(qn6.e);
                qn6.h = null;
                qn6.g = null;
            }
        }
    }

    public final void c() {
        this.C0.post(this.A0);
    }

    public final void d() {
        np8.f(this.O0);
        this.T0.getClass();
        this.U0.getClass();
    }

    public final sze e(qze[] qzeArr) {
        for (int i = 0; i < qzeArr.length; i++) {
            qze qze = qzeArr[i];
            oy5[] oy5Arr = new oy5[qze.a];
            for (int i2 = 0; i2 < qze.a; i2++) {
                oy5 oy5 = qze.c[i2];
                int b2 = this.Z.b(oy5);
                my5 a2 = oy5.a();
                a2.D = b2;
                oy5Arr[i2] = a2.a();
            }
            qzeArr[i] = new qze(qze.b, oy5Arr);
        }
        return new sze(qzeArr);
    }

    public final long f() {
        if (m()) {
            return this.b1;
        }
        if (this.e1) {
            return Long.MIN_VALUE;
        }
        return i().s0;
    }

    public final void h(int i) {
        ArrayList arrayList;
        np8.f(!this.u0.o());
        int i2 = i;
        loop0:
        while (true) {
            arrayList = this.y0;
            if (i2 >= arrayList.size()) {
                i2 = -1;
                break;
            }
            int i3 = i2;
            while (true) {
                if (i3 >= arrayList.size()) {
                    cm6 cm6 = (cm6) arrayList.get(i2);
                    int i4 = 0;
                    while (i4 < this.G0.length) {
                        if (this.G0[i4].o() <= cm6.f(i4)) {
                            i4++;
                        }
                    }
                    break loop0;
                } else if (((cm6) arrayList.get(i3)).y0) {
                    break;
                } else {
                    i3++;
                }
            }
            i2++;
        }
        if (i2 != -1) {
            long j = i().s0;
            cm6 cm62 = (cm6) arrayList.get(i2);
            maf.I(arrayList, i2, arrayList.size());
            for (int i5 = 0; i5 < this.G0.length; i5++) {
                this.G0[i5].k(cm62.f(i5));
            }
            if (arrayList.isEmpty()) {
                this.b1 = this.a1;
            } else {
                ((cm6) mqd.m(arrayList)).U0 = true;
            }
            this.e1 = false;
            int i6 = this.L0;
            long j2 = cm62.Z;
            gk8 gk8 = this.v0;
            gk8.m(new pc8(1, i6, (Object) null, 3, (Object) null, gk8.a(j2), gk8.a(j)));
        }
    }

    public final cm6 i() {
        return (cm6) wg0.f(this.y0, 1);
    }

    public final boolean m() {
        return this.b1 != -9223372036854775807L;
    }

    public final void o(fo7 fo7, long j, long j2, boolean z) {
        h13 h13 = (h13) fo7;
        this.F0 = null;
        long j3 = h13.a;
        t1e t1e = h13.t0;
        xn7 xn7 = new xn7(j3, h13.b, t1e.c, t1e.o, j, j2, t1e.b);
        this.t0.getClass();
        xn7 xn72 = xn7;
        this.v0.d(xn72, h13.c, this.b, h13.o, h13.X, h13.Y, h13.Z, h13.s0);
        if (!z) {
            if (m() || this.P0 == 0) {
                x();
            }
            if (this.P0 > 0) {
                this.c.c(this);
            }
        }
    }

    public final void p() {
        boolean z;
        if (!this.S0 && this.V0 == null && this.N0) {
            qn6[] qn6Arr = this.G0;
            int length = qn6Arr.length;
            boolean z2 = false;
            int i = 0;
            while (i < length) {
                if (qn6Arr[i].r() != null) {
                    i++;
                } else {
                    return;
                }
            }
            sze sze = this.T0;
            if (sze != null) {
                int i2 = sze.a;
                int[] iArr = new int[i2];
                this.V0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i3 = 0; i3 < i2; i3++) {
                    int i4 = 0;
                    while (true) {
                        qn6[] qn6Arr2 = this.G0;
                        if (i4 >= qn6Arr2.length) {
                            break;
                        }
                        oy5 r = qn6Arr2[i4].r();
                        np8.g(r);
                        oy5 oy5 = this.T0.a(i3).c[0];
                        String str = oy5.w0;
                        String str2 = r.w0;
                        int g = ha9.g(str2);
                        if (g == 3) {
                            if (maf.a(str2, str)) {
                                if ((!"application/cea-608".equals(str2) && !"application/cea-708".equals(str2)) || r.O0 == oy5.O0) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                            i4++;
                        } else if (g == ha9.g(str)) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    this.V0[i3] = i4;
                }
                Iterator it = this.D0.iterator();
                while (it.hasNext()) {
                    ((jn6) it.next()).a();
                }
                return;
            }
            int length2 = this.G0.length;
            int i5 = 0;
            int i6 = -1;
            int i7 = -2;
            while (true) {
                int i8 = 1;
                if (i5 >= length2) {
                    break;
                }
                oy5 r2 = this.G0[i5].r();
                np8.g(r2);
                String str3 = r2.w0;
                if (ha9.j(str3)) {
                    i8 = 2;
                } else if (!ha9.h(str3)) {
                    i8 = ha9.i(str3) ? 3 : -2;
                }
                if (j(i8) > j(i7)) {
                    i6 = i5;
                    i7 = i8;
                } else if (i8 == i7 && i6 != -1) {
                    i6 = -1;
                }
                i5++;
            }
            qze qze = this.o.h;
            int i9 = qze.a;
            this.W0 = -1;
            this.V0 = new int[length2];
            for (int i10 = 0; i10 < length2; i10++) {
                this.V0[i10] = i10;
            }
            qze[] qzeArr = new qze[length2];
            int i11 = 0;
            while (i11 < length2) {
                oy5 r3 = this.G0[i11].r();
                np8.g(r3);
                String str4 = this.a;
                oy5 oy52 = this.Y;
                if (i11 == i6) {
                    oy5[] oy5Arr = new oy5[i9];
                    for (int i12 = z2; i12 < i9; i12++) {
                        oy5 oy53 = qze.c[i12];
                        if (i7 == 1 && oy52 != null) {
                            oy53 = oy53.d(oy52);
                        }
                        oy5Arr[i12] = i9 == 1 ? r3.d(oy53) : g(oy53, r3, true);
                    }
                    qzeArr[i11] = new qze(str4, oy5Arr);
                    this.W0 = i11;
                    z = false;
                } else {
                    if (i7 != 2 || !ha9.h(r3.w0)) {
                        oy52 = null;
                    }
                    int i13 = i11 < i6 ? i11 : i11 - 1;
                    StringBuilder sb = new StringBuilder(rh4.e(18, str4));
                    sb.append(str4);
                    sb.append(":muxed:");
                    sb.append(i13);
                    z = false;
                    qzeArr[i11] = new qze(sb.toString(), g(oy52, r3, false));
                }
                i11++;
                z2 = z;
            }
            boolean z3 = z2;
            this.T0 = e(qzeArr);
            np8.f(this.U0 == null ? true : z3);
            this.U0 = Collections.emptySet();
            this.O0 = true;
            this.c.i();
        }
    }

    public final long r() {
        long j;
        if (this.e1) {
            return Long.MIN_VALUE;
        }
        if (m()) {
            return this.b1;
        }
        long j2 = this.a1;
        cm6 i = i();
        if (!i.S0) {
            ArrayList arrayList = this.y0;
            i = arrayList.size() > 1 ? (cm6) wg0.f(arrayList, 2) : null;
        }
        if (i != null) {
            j2 = Math.max(j2, i.s0);
        }
        if (this.N0) {
            for (qn6 qn6 : this.G0) {
                synchronized (qn6) {
                    j = qn6.v;
                }
                j2 = Math.max(j2, j);
            }
        }
        return j2;
    }

    public final void t(long j) {
        jo7 jo7 = this.u0;
        if (!jo7.n() && !m()) {
            boolean o2 = jo7.o();
            wl6 wl6 = this.o;
            List list = this.z0;
            if (o2) {
                this.F0.getClass();
                if (wl6.n != null ? false : wl6.q.u(j, this.F0, list)) {
                    jo7.a();
                    return;
                }
                return;
            }
            int size = list.size();
            while (size > 0 && wl6.b((cm6) list.get(size - 1)) == 2) {
                size--;
            }
            if (size < list.size()) {
                h(size);
            }
            int size2 = (wl6.n != null || wl6.q.length() < 2) ? list.size() : wl6.q.g(j, list);
            if (size2 < this.y0.size()) {
                h(size2);
            }
        }
    }

    public final void u() {
        this.u0.c();
        wl6 wl6 = this.o;
        BehindLiveWindowException behindLiveWindowException = wl6.n;
        if (behindLiveWindowException == null) {
            Uri uri = wl6.o;
            if (uri != null && wl6.s) {
                fb4 fb4 = (fb4) wl6.g.b.get(uri);
                fb4.b.c();
                IOException iOException = fb4.u0;
                if (iOException != null) {
                    throw iOException;
                }
                return;
            }
            return;
        }
        throw behindLiveWindowException;
    }

    public final void v(qze[] qzeArr, int... iArr) {
        this.T0 = e(qzeArr);
        this.U0 = new HashSet();
        for (int a2 : iArr) {
            this.U0.add(this.T0.a(a2));
        }
        this.W0 = 0;
        Handler handler = this.C0;
        em6 em6 = this.c;
        Objects.requireNonNull(em6);
        handler.post(new dd4(29, em6));
        this.O0 = true;
    }

    public final void w() {
        this.f1 = true;
        this.C0.post(this.B0);
    }

    public final void x() {
        for (qn6 z : this.G0) {
            z.z(this.c1);
        }
        this.c1 = false;
    }

    public final void y(fo7 fo7, long j, long j2) {
        h13 h13 = (h13) fo7;
        this.F0 = null;
        wl6 wl6 = this.o;
        wl6.getClass();
        if (h13 instanceof pl6) {
            pl6 pl6 = (pl6) h13;
            wl6.m = pl6.u0;
            Uri uri = pl6.b.a;
            byte[] bArr = pl6.w0;
            bArr.getClass();
            bkg bkg = wl6.j;
            bkg.getClass();
            uri.getClass();
            byte[] bArr2 = (byte[]) ((i56) bkg.b).put(uri, bArr);
        }
        long j3 = h13.a;
        t1e t1e = h13.t0;
        xn7 xn7 = new xn7(j3, h13.b, t1e.c, t1e.o, j, j2, t1e.b);
        this.t0.getClass();
        xn7 xn72 = xn7;
        this.v0.f(xn72, h13.c, this.b, h13.o, h13.X, h13.Y, h13.Z, h13.s0);
        if (!this.O0) {
            C(this.a1);
        } else {
            this.c.c(this);
        }
    }

    public final b11 z(fo7 fo7, long j, long j2, IOException iOException, int i) {
        boolean z;
        b11 b11;
        int i2;
        IOException iOException2 = iOException;
        h13 h13 = (h13) fo7;
        boolean z2 = h13 instanceof cm6;
        if (z2 && !((cm6) h13).V0 && (iOException2 instanceof HttpDataSource$InvalidResponseCodeException) && ((i2 = ((HttpDataSource$InvalidResponseCodeException) iOException2).c) == 410 || i2 == 404)) {
            return jo7.o;
        }
        long j3 = h13.t0.b;
        t1e t1e = h13.t0;
        xn7 xn7 = new xn7(h13.a, h13.b, t1e.c, t1e.o, j, j2, j3);
        maf.M(h13.Z);
        maf.M(h13.s0);
        wn7 wn7 = new wn7(i, iOException2);
        wl6 wl6 = this.o;
        ty4 h = ay7.h(wl6.q);
        this.t0.getClass();
        b11 u = buc.u(h, wn7);
        boolean z3 = false;
        if (u == null || u.b != 2) {
            z = false;
        } else {
            m85 m85 = wl6.q;
            z = m85.r(m85.p(wl6.h.a(h13.o)), u.c);
        }
        if (z) {
            if (z2 && j3 == 0) {
                ArrayList arrayList = this.y0;
                if (((cm6) arrayList.remove(arrayList.size() - 1)) == h13) {
                    z3 = true;
                }
                np8.f(z3);
                if (arrayList.isEmpty()) {
                    this.b1 = this.a1;
                } else {
                    ((cm6) mqd.m(arrayList)).U0 = true;
                }
            }
            b11 = jo7.X;
        } else {
            long w = buc.w(wn7);
            b11 = w != -9223372036854775807L ? new b11(w, 0, 4, false) : jo7.Y;
        }
        b11 b112 = b11;
        boolean z4 = !b112.a();
        this.v0.h(xn7, h13.c, this.b, h13.o, h13.X, h13.Y, h13.Z, h13.s0, iOException, z4);
        if (z4) {
            this.F0 = null;
        }
        if (z) {
            if (!this.O0) {
                C(this.a1);
            } else {
                this.c.c(this);
            }
        }
        return b112;
    }
}
