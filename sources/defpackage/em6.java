package defpackage;

import android.net.Uri;
import android.util.SparseArray;
import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: em6  reason: default package */
public final class em6 implements yd8, fn6, g6d {
    public final i4b A0;
    public wd8 B0;
    public int C0;
    public sze D0;
    public sn6[] E0 = new sn6[0];
    public sn6[] F0 = new sn6[0];
    public int G0;
    public rxd H0 = new rxd(10, new i6d[0]);
    public final sr4 X;
    public final kr4 Y;
    public final buc Z;
    public final zl6 a;
    public final hb4 b;
    public final gaa c;
    public final y0f o;
    public final gk8 s0;
    public final n64 t0;
    public final IdentityHashMap u0 = new IdentityHashMap();
    public final o9g v0 = new o9g(28);
    public final mq9 w0;
    public final boolean x0;
    public final int y0;
    public final boolean z0;

    public em6(zl6 zl6, hb4 hb4, gaa gaa, y0f y0f, sr4 sr4, kr4 kr4, buc buc, gk8 gk8, n64 n64, mq9 mq9, boolean z, int i, boolean z2, i4b i4b) {
        this.a = zl6;
        this.b = hb4;
        this.c = gaa;
        this.o = y0f;
        this.X = sr4;
        this.Y = kr4;
        this.Z = buc;
        this.s0 = gk8;
        this.t0 = n64;
        this.w0 = mq9;
        this.x0 = z;
        this.y0 = i;
        this.z0 = z2;
        this.A0 = i4b;
        mq9.getClass();
    }

    public static oy5 h(oy5 oy5, oy5 oy52, boolean z) {
        String str;
        String str2;
        int i;
        int i2;
        int i3;
        e99 e99;
        String str3;
        int i4 = -1;
        if (oy52 != null) {
            str3 = oy52.t0;
            e99 = oy52.u0;
            i3 = oy52.J0;
            i2 = oy52.o;
            i = oy52.X;
            str2 = oy52.c;
            str = oy52.b;
        } else {
            str3 = maf.q(1, oy5.t0);
            e99 = oy5.u0;
            if (z) {
                i3 = oy5.J0;
                i2 = oy5.o;
                i = oy5.X;
                str2 = oy5.c;
                str = oy5.b;
            } else {
                i2 = 0;
                str2 = null;
                i3 = -1;
                i = 0;
                str = null;
            }
        }
        String c2 = ha9.c(str3);
        int i5 = z ? oy5.Y : -1;
        if (z) {
            i4 = oy5.Z;
        }
        my5 my5 = new my5();
        my5.a = oy5.a;
        my5.b = str;
        my5.j = oy5.v0;
        my5.k = c2;
        my5.h = str3;
        my5.i = e99;
        my5.f = i5;
        my5.g = i4;
        my5.x = i3;
        my5.d = i2;
        my5.e = i;
        my5.c = str2;
        return new oy5(my5);
    }

    public final long A(long j, w1d w1d) {
        sn6[] sn6Arr = this.F0;
        int length = sn6Arr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            sn6 sn6 = sn6Arr[i];
            if (sn6.L0 == 2) {
                wl6 wl6 = sn6.o;
                int b2 = wl6.q.b();
                Uri[] uriArr = wl6.e;
                int length2 = uriArr.length;
                hb4 hb4 = wl6.g;
                pm6 a2 = (b2 >= length2 || b2 == -1) ? null : hb4.a(uriArr[wl6.q.i()], true);
                if (a2 != null) {
                    zw6 zw6 = a2.r;
                    if (!zw6.isEmpty() && a2.c) {
                        long j2 = a2.h - hb4.Z;
                        long j3 = j - j2;
                        int e = maf.e(Long.valueOf(j3), zw6, true);
                        long j4 = ((km6) zw6.get(e)).X;
                        return w1d.a(j3, j4, e != zw6.size() - 1 ? ((km6) zw6.get(e + 1)).X : j4) + j2;
                    }
                }
            } else {
                i++;
            }
        }
        return j;
    }

    public final boolean C(long j) {
        if (this.D0 != null) {
            return this.H0.C(j);
        }
        for (sn6 sn6 : this.E0) {
            if (!sn6.O0) {
                sn6.C(sn6.a1);
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x011a, code lost:
        if (r2[r13] != 1) goto L_0x0120;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0242  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void J(defpackage.wd8 r26, long r27) {
        /*
            r25 = this;
            r10 = r25
            r11 = 1
            r0 = r26
            r10.B0 = r0
            hb4 r0 = r10.b
            r0.getClass()
            java.util.concurrent.CopyOnWriteArrayList r1 = r0.c
            r1.add(r10)
            java.lang.Object r0 = r0.y0
            r12 = r0
            xm6 r12 = (defpackage.xm6) r12
            r12.getClass()
            boolean r0 = r10.z0
            r13 = 0
            if (r0 == 0) goto L_0x008d
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r1 = r12.m
            r0.<init>(r1)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3 = r13
        L_0x002b:
            int r4 = r0.size()
            if (r3 >= r4) goto L_0x008b
            java.lang.Object r4 = r1.get(r3)
            cr4 r4 = (defpackage.cr4) r4
            java.lang.String r5 = r4.c
            int r3 = r3 + r11
            r6 = r3
        L_0x003b:
            int r7 = r0.size()
            if (r6 >= r7) goto L_0x0087
            java.lang.Object r7 = r0.get(r6)
            cr4 r7 = (defpackage.cr4) r7
            java.lang.String r8 = r7.c
            boolean r8 = android.text.TextUtils.equals(r8, r5)
            if (r8 == 0) goto L_0x0085
            java.lang.String r8 = r4.c
            java.lang.String r9 = r7.c
            if (r8 == 0) goto L_0x0060
            if (r9 == 0) goto L_0x0060
            boolean r14 = android.text.TextUtils.equals(r8, r9)
            if (r14 == 0) goto L_0x005e
            goto L_0x0060
        L_0x005e:
            r14 = r13
            goto L_0x0061
        L_0x0060:
            r14 = r11
        L_0x0061:
            defpackage.np8.f(r14)
            if (r8 == 0) goto L_0x0067
            goto L_0x0068
        L_0x0067:
            r8 = r9
        L_0x0068:
            int r9 = defpackage.maf.a
            ar4[] r4 = r4.a
            int r9 = r4.length
            ar4[] r7 = r7.a
            int r14 = r7.length
            int r9 = r9 + r14
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r4, r9)
            int r4 = r4.length
            int r14 = r7.length
            java.lang.System.arraycopy(r7, r13, r9, r4, r14)
            ar4[] r9 = (defpackage.ar4[]) r9
            cr4 r4 = new cr4
            r4.<init>(r8, r11, r9)
            r0.remove(r6)
            goto L_0x003b
        L_0x0085:
            int r6 = r6 + r11
            goto L_0x003b
        L_0x0087:
            r2.put(r5, r4)
            goto L_0x002b
        L_0x008b:
            r14 = r2
            goto L_0x0092
        L_0x008d:
            java.util.Map r2 = java.util.Collections.emptyMap()
            goto L_0x008b
        L_0x0092:
            java.util.List r0 = r12.e
            boolean r1 = r0.isEmpty()
            r1 = r1 ^ r11
            r10.C0 = r13
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            boolean r9 = r10.x0
            java.util.List r7 = r12.g
            if (r1 == 0) goto L_0x0295
            int r1 = r0.size()
            int[] r2 = new int[r1]
            r3 = r13
            r4 = r3
            r5 = r4
        L_0x00b4:
            int r6 = r0.size()
            r13 = 2
            if (r3 >= r6) goto L_0x00e6
            java.lang.Object r6 = r0.get(r3)
            vm6 r6 = (defpackage.vm6) r6
            oy5 r6 = r6.b
            int r11 = r6.C0
            if (r11 > 0) goto L_0x00cf
            java.lang.String r6 = r6.t0
            java.lang.String r11 = defpackage.maf.q(r13, r6)
            if (r11 == 0) goto L_0x00d1
        L_0x00cf:
            r11 = 1
            goto L_0x00e0
        L_0x00d1:
            r11 = 1
            java.lang.String r6 = defpackage.maf.q(r11, r6)
            if (r6 == 0) goto L_0x00dc
            r2[r3] = r11
            int r5 = r5 + r11
            goto L_0x00e3
        L_0x00dc:
            r6 = -1
            r2[r3] = r6
            goto L_0x00e3
        L_0x00e0:
            r2[r3] = r13
            int r4 = r4 + r11
        L_0x00e3:
            int r3 = r3 + r11
            r13 = 0
            goto L_0x00b4
        L_0x00e6:
            if (r4 <= 0) goto L_0x00ec
            r11 = r4
            r1 = 1
        L_0x00ea:
            r3 = 0
            goto L_0x00f6
        L_0x00ec:
            if (r5 >= r1) goto L_0x00f3
            int r1 = r1 - r5
            r11 = r1
            r1 = 0
            r3 = 1
            goto L_0x00f6
        L_0x00f3:
            r11 = r1
            r1 = 0
            goto L_0x00ea
        L_0x00f6:
            android.net.Uri[] r4 = new android.net.Uri[r11]
            oy5[] r6 = new defpackage.oy5[r11]
            int[] r5 = new int[r11]
            r18 = r7
            r13 = 0
            r17 = 0
        L_0x0101:
            int r7 = r0.size()
            if (r13 >= r7) goto L_0x0139
            if (r1 == 0) goto L_0x0113
            r7 = r2[r13]
            r19 = r8
            r8 = 2
            if (r7 != r8) goto L_0x0111
            goto L_0x0115
        L_0x0111:
            r8 = 1
            goto L_0x011d
        L_0x0113:
            r19 = r8
        L_0x0115:
            if (r3 == 0) goto L_0x011f
            r7 = r2[r13]
            r8 = 1
            if (r7 == r8) goto L_0x011d
            goto L_0x0120
        L_0x011d:
            r7 = r8
            goto L_0x0135
        L_0x011f:
            r8 = 1
        L_0x0120:
            java.lang.Object r7 = r0.get(r13)
            vm6 r7 = (defpackage.vm6) r7
            android.net.Uri r8 = r7.a
            r4[r17] = r8
            oy5 r7 = r7.b
            r6[r17] = r7
            r7 = 1
            int r8 = r17 + 1
            r5[r17] = r13
            r17 = r8
        L_0x0135:
            int r13 = r13 + r7
            r8 = r19
            goto L_0x0101
        L_0x0139:
            r19 = r8
            r7 = 1
            r8 = 0
            r0 = r6[r8]
            java.lang.String r0 = r0.t0
            r2 = 2
            int r13 = defpackage.maf.p(r2, r0)
            int r8 = defpackage.maf.p(r7, r0)
            if (r8 > r7) goto L_0x0155
            if (r13 > r7) goto L_0x0155
            int r0 = r8 + r13
            if (r0 <= 0) goto L_0x0155
            r17 = 1
            goto L_0x0157
        L_0x0155:
            r17 = 0
        L_0x0157:
            if (r1 != 0) goto L_0x015d
            if (r8 <= 0) goto L_0x015d
            r2 = 1
            goto L_0x015e
        L_0x015d:
            r2 = 0
        L_0x015e:
            java.lang.String r7 = "main"
            oy5 r3 = r12.j
            java.util.List r1 = r12.k
            r0 = r25
            r20 = r1
            r1 = r7
            r21 = r3
            r3 = r4
            r4 = r6
            r10 = r5
            r5 = r21
            r21 = r6
            r6 = r20
            r22 = r7
            r20 = r18
            r7 = r14
            r23 = r8
            r18 = r14
            r14 = r19
            r19 = r9
            r8 = r27
            sn6 r0 = r0.g(r1, r2, r3, r4, r5, r6, r7, r8)
            r15.add(r0)
            r14.add(r10)
            if (r19 == 0) goto L_0x029c
            if (r17 == 0) goto L_0x029c
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            oy5 r2 = r12.j
            if (r13 <= 0) goto L_0x0242
            oy5[] r3 = new defpackage.oy5[r11]
            r4 = 0
        L_0x019d:
            if (r4 >= r11) goto L_0x01eb
            r5 = r21[r4]
            java.lang.String r6 = r5.t0
            r7 = 2
            java.lang.String r6 = defpackage.maf.q(r7, r6)
            java.lang.String r8 = defpackage.ha9.c(r6)
            my5 r9 = new my5
            r9.<init>()
            java.lang.String r10 = r5.a
            r9.a = r10
            java.lang.String r10 = r5.b
            r9.b = r10
            java.lang.String r10 = r5.v0
            r9.j = r10
            r9.k = r8
            r9.h = r6
            e99 r6 = r5.u0
            r9.i = r6
            int r6 = r5.Y
            r9.f = r6
            int r6 = r5.Z
            r9.g = r6
            int r6 = r5.B0
            r9.p = r6
            int r6 = r5.C0
            r9.q = r6
            float r6 = r5.D0
            r9.r = r6
            int r6 = r5.o
            r9.d = r6
            int r5 = r5.X
            r9.e = r5
            oy5 r5 = new oy5
            r5.<init>(r9)
            r3[r4] = r5
            r5 = 1
            int r4 = r4 + r5
            goto L_0x019d
        L_0x01eb:
            qze r4 = new qze
            r5 = r22
            r4.<init>(r5, r3)
            r1.add(r4)
            if (r23 <= 0) goto L_0x0218
            if (r2 != 0) goto L_0x01ff
            boolean r3 = r20.isEmpty()
            if (r3 == 0) goto L_0x0218
        L_0x01ff:
            qze r3 = new qze
            java.lang.String r4 = ":audio"
            java.lang.String r4 = r5.concat(r4)
            r6 = 0
            r7 = r21[r6]
            oy5 r2 = h(r7, r2, r6)
            oy5[] r2 = new defpackage.oy5[]{r2}
            r3.<init>(r4, r2)
            r1.add(r3)
        L_0x0218:
            java.util.List r2 = r12.k
            if (r2 == 0) goto L_0x0240
            r3 = 0
        L_0x021d:
            int r4 = r2.size()
            if (r3 >= r4) goto L_0x0240
            r4 = 19
            java.lang.String r6 = "main:cc:"
            java.lang.String r4 = defpackage.z7b.h(r4, r3, r6)
            qze r6 = new qze
            java.lang.Object r7 = r2.get(r3)
            oy5 r7 = (defpackage.oy5) r7
            oy5[] r7 = new defpackage.oy5[]{r7}
            r6.<init>(r4, r7)
            r1.add(r6)
            r4 = 1
            int r3 = r3 + r4
            goto L_0x021d
        L_0x0240:
            r4 = 1
            goto L_0x025c
        L_0x0242:
            r5 = r22
            r4 = 1
            oy5[] r3 = new defpackage.oy5[r11]
            r6 = 0
        L_0x0248:
            if (r6 >= r11) goto L_0x0254
            r7 = r21[r6]
            oy5 r7 = h(r7, r2, r4)
            r3[r6] = r7
            int r6 = r6 + r4
            goto L_0x0248
        L_0x0254:
            qze r2 = new qze
            r2.<init>(r5, r3)
            r1.add(r2)
        L_0x025c:
            qze r2 = new qze
            java.lang.String r3 = ":id3"
            java.lang.String r3 = r5.concat(r3)
            my5 r4 = new my5
            r4.<init>()
            java.lang.String r5 = "ID3"
            r4.a = r5
            java.lang.String r5 = "application/id3"
            r4.k = r5
            oy5 r5 = new oy5
            r5.<init>(r4)
            oy5[] r4 = new defpackage.oy5[]{r5}
            r2.<init>(r3, r4)
            r1.add(r2)
            r3 = 0
            qze[] r4 = new defpackage.qze[r3]
            java.lang.Object[] r3 = r1.toArray(r4)
            qze[] r3 = (defpackage.qze[]) r3
            int r1 = r1.indexOf(r2)
            int[] r1 = new int[]{r1}
            r0.v(r3, r1)
            goto L_0x029c
        L_0x0295:
            r20 = r7
            r19 = r9
            r18 = r14
            r14 = r8
        L_0x029c:
            java.util.ArrayList r10 = new java.util.ArrayList
            int r0 = r20.size()
            r10.<init>(r0)
            java.util.ArrayList r11 = new java.util.ArrayList
            int r0 = r20.size()
            r11.<init>(r0)
            java.util.ArrayList r13 = new java.util.ArrayList
            int r0 = r20.size()
            r13.<init>(r0)
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            r9 = 0
        L_0x02bd:
            int r0 = r20.size()
            if (r9 >= r0) goto L_0x03a0
            r7 = r20
            java.lang.Object r0 = r7.get(r9)
            tm6 r0 = (defpackage.tm6) r0
            java.lang.String r0 = r0.c
            boolean r1 = r8.add(r0)
            if (r1 != 0) goto L_0x02dc
            r17 = r7
            r20 = r8
            r21 = r9
        L_0x02d9:
            r0 = 1
            goto L_0x0398
        L_0x02dc:
            r10.clear()
            r11.clear()
            r13.clear()
            r1 = 0
            r16 = 1
        L_0x02e8:
            int r2 = r7.size()
            if (r1 >= r2) goto L_0x0327
            java.lang.Object r2 = r7.get(r1)
            tm6 r2 = (defpackage.tm6) r2
            java.lang.String r2 = r2.c
            boolean r2 = defpackage.maf.a(r0, r2)
            if (r2 == 0) goto L_0x0324
            java.lang.Object r2 = r7.get(r1)
            tm6 r2 = (defpackage.tm6) r2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r13.add(r3)
            android.net.Uri r3 = r2.a
            r10.add(r3)
            oy5 r2 = r2.b
            r11.add(r2)
            java.lang.String r2 = r2.t0
            r3 = 1
            int r2 = defpackage.maf.p(r3, r2)
            if (r2 != r3) goto L_0x031e
            r2 = r3
            goto L_0x031f
        L_0x031e:
            r2 = 0
        L_0x031f:
            r2 = r16 & r2
            r16 = r2
            goto L_0x0325
        L_0x0324:
            r3 = 1
        L_0x0325:
            int r1 = r1 + r3
            goto L_0x02e8
        L_0x0327:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            java.lang.String r2 = "audio:"
            if (r1 == 0) goto L_0x033a
            java.lang.String r0 = r2.concat(r0)
        L_0x0337:
            r6 = r0
            r0 = 0
            goto L_0x0340
        L_0x033a:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            goto L_0x0337
        L_0x0340:
            android.net.Uri[] r1 = new android.net.Uri[r0]
            int r2 = defpackage.maf.a
            java.lang.Object[] r1 = r10.toArray(r1)
            r3 = r1
            android.net.Uri[] r3 = (android.net.Uri[]) r3
            oy5[] r1 = new defpackage.oy5[r0]
            java.lang.Object[] r0 = r11.toArray(r1)
            r4 = r0
            oy5[] r4 = (defpackage.oy5[]) r4
            java.util.List r17 = java.util.Collections.emptyList()
            r2 = 1
            r5 = 0
            r0 = r25
            r1 = r6
            r24 = r6
            r6 = r17
            r17 = r7
            r7 = r18
            r20 = r8
            r21 = r9
            r8 = r27
            sn6 r0 = r0.g(r1, r2, r3, r4, r5, r6, r7, r8)
            int[] r1 = defpackage.s5c.c0(r13)
            r14.add(r1)
            r15.add(r0)
            if (r19 == 0) goto L_0x02d9
            if (r16 == 0) goto L_0x02d9
            r1 = 0
            oy5[] r2 = new defpackage.oy5[r1]
            java.lang.Object[] r2 = r11.toArray(r2)
            oy5[] r2 = (defpackage.oy5[]) r2
            qze r3 = new qze
            r4 = r24
            r3.<init>(r4, r2)
            qze[] r2 = new defpackage.qze[]{r3}
            int[] r3 = new int[r1]
            r0.v(r2, r3)
            goto L_0x02d9
        L_0x0398:
            int r9 = r21 + 1
            r8 = r20
            r20 = r17
            goto L_0x02bd
        L_0x03a0:
            int r0 = r15.size()
            r10 = r25
            r10.G0 = r0
            r11 = 0
        L_0x03a9:
            java.util.List r0 = r12.h
            int r1 = r0.size()
            if (r11 >= r1) goto L_0x0417
            java.lang.Object r0 = r0.get(r11)
            tm6 r0 = (defpackage.tm6) r0
            java.lang.String r1 = r0.c
            r2 = 21
            int r2 = defpackage.rh4.e(r2, r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "subtitle:"
            r3.append(r2)
            r3.append(r11)
            java.lang.String r2 = ":"
            r3.append(r2)
            r3.append(r1)
            java.lang.String r13 = r3.toString()
            android.net.Uri r1 = r0.a
            android.net.Uri[] r3 = new android.net.Uri[]{r1}
            oy5 r8 = r0.b
            oy5[] r4 = new defpackage.oy5[]{r8}
            java.util.List r6 = java.util.Collections.emptyList()
            r2 = 3
            r5 = 0
            r0 = r25
            r1 = r13
            r7 = r18
            r16 = r8
            r8 = r27
            sn6 r0 = r0.g(r1, r2, r3, r4, r5, r6, r7, r8)
            int[] r1 = new int[]{r11}
            r14.add(r1)
            r15.add(r0)
            qze r1 = new qze
            oy5[] r2 = new defpackage.oy5[]{r16}
            r1.<init>(r13, r2)
            qze[] r1 = new defpackage.qze[]{r1}
            r2 = 0
            int[] r3 = new int[r2]
            r0.v(r1, r3)
            r0 = 1
            int r11 = r11 + r0
            goto L_0x03a9
        L_0x0417:
            r2 = 0
            sn6[] r0 = new defpackage.sn6[r2]
            java.lang.Object[] r0 = r15.toArray(r0)
            sn6[] r0 = (defpackage.sn6[]) r0
            r10.E0 = r0
            int[][] r0 = new int[r2][]
            java.lang.Object[] r0 = r14.toArray(r0)
            int[][] r0 = (int[][]) r0
            sn6[] r0 = r10.E0
            int r1 = r0.length
            r10.C0 = r1
            r1 = r0[r2]
            wl6 r1 = r1.o
            r3 = 1
            r1.l = r3
            int r1 = r0.length
            r13 = r2
        L_0x0438:
            if (r13 >= r1) goto L_0x0448
            r2 = r0[r13]
            boolean r3 = r2.O0
            if (r3 != 0) goto L_0x0445
            long r3 = r2.a1
            r2.C(r3)
        L_0x0445:
            r2 = 1
            int r13 = r13 + r2
            goto L_0x0438
        L_0x0448:
            sn6[] r0 = r10.E0
            r10.F0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.em6.J(wd8, long):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v22, resolved type: jn6} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0263  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long L(defpackage.m85[] r38, boolean[] r39, defpackage.frc[] r40, boolean[] r41, long r42) {
        /*
            r37 = this;
            r0 = r37
            r1 = r38
            r2 = r40
            r12 = r42
            int r3 = r1.length
            int[] r14 = new int[r3]
            int r3 = r1.length
            int[] r15 = new int[r3]
            r3 = 0
        L_0x000f:
            int r4 = r1.length
            java.util.IdentityHashMap r10 = r0.u0
            r8 = -1
            if (r3 >= r4) goto L_0x004d
            r4 = r2[r3]
            if (r4 != 0) goto L_0x001b
            r4 = r8
            goto L_0x0025
        L_0x001b:
            java.lang.Object r4 = r10.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
        L_0x0025:
            r14[r3] = r4
            r15[r3] = r8
            r4 = r1[r3]
            if (r4 == 0) goto L_0x004a
            qze r4 = r4.a()
            r5 = 0
        L_0x0032:
            sn6[] r6 = r0.E0
            int r7 = r6.length
            if (r5 >= r7) goto L_0x004a
            r6 = r6[r5]
            r6.d()
            sze r6 = r6.T0
            int r6 = r6.b(r4)
            if (r6 == r8) goto L_0x0047
            r15[r3] = r5
            goto L_0x004a
        L_0x0047:
            int r5 = r5 + 1
            goto L_0x0032
        L_0x004a:
            int r3 = r3 + 1
            goto L_0x000f
        L_0x004d:
            r10.clear()
            int r9 = r1.length
            frc[] r6 = new defpackage.frc[r9]
            int r7 = r1.length
            frc[] r4 = new defpackage.frc[r7]
            int r5 = r1.length
            m85[] r3 = new defpackage.m85[r5]
            sn6[] r11 = r0.E0
            int r11 = r11.length
            sn6[] r11 = new defpackage.sn6[r11]
            r17 = r9
            r9 = 0
            r18 = 0
            r19 = 0
        L_0x0065:
            sn6[] r8 = r0.E0
            int r8 = r8.length
            if (r9 >= r8) goto L_0x0321
            r21 = r6
            r8 = 0
        L_0x006d:
            int r6 = r1.length
            r22 = r7
            if (r8 >= r6) goto L_0x008b
            r6 = r14[r8]
            if (r6 != r9) goto L_0x0079
            r6 = r2[r8]
            goto L_0x007a
        L_0x0079:
            r6 = 0
        L_0x007a:
            r4[r8] = r6
            r6 = r15[r8]
            if (r6 != r9) goto L_0x0083
            r7 = r1[r8]
            goto L_0x0084
        L_0x0083:
            r7 = 0
        L_0x0084:
            r3[r8] = r7
            int r8 = r8 + 1
            r7 = r22
            goto L_0x006d
        L_0x008b:
            sn6[] r6 = r0.E0
            r8 = r6[r9]
            r8.d()
            int r6 = r8.P0
            r24 = r9
            r7 = 0
        L_0x0097:
            if (r7 >= r5) goto L_0x00f1
            r25 = r4[r7]
            r9 = r25
            jn6 r9 = (defpackage.jn6) r9
            if (r9 == 0) goto L_0x00ac
            r25 = r3[r7]
            if (r25 == 0) goto L_0x00a9
            boolean r25 = r39[r7]
            if (r25 != 0) goto L_0x00ac
        L_0x00a9:
            r25 = r10
            goto L_0x00b3
        L_0x00ac:
            r25 = r10
            r27 = r11
            r2 = -1
            r11 = 0
            goto L_0x00e8
        L_0x00b3:
            int r10 = r8.P0
            r26 = 1
            int r10 = r10 + -1
            r8.P0 = r10
            int r10 = r9.c
            r27 = r11
            r11 = -1
            if (r10 == r11) goto L_0x00e3
            sn6 r10 = r9.b
            r10.d()
            int[] r11 = r10.V0
            r11.getClass()
            int[] r11 = r10.V0
            int r2 = r9.a
            r2 = r11[r2]
            boolean[] r11 = r10.Y0
            boolean r11 = r11[r2]
            defpackage.np8.f(r11)
            boolean[] r10 = r10.Y0
            r11 = 0
            r10[r2] = r11
            r2 = -1
            r9.c = r2
        L_0x00e1:
            r9 = 0
            goto L_0x00e6
        L_0x00e3:
            r2 = r11
            r11 = 0
            goto L_0x00e1
        L_0x00e6:
            r4[r7] = r9
        L_0x00e8:
            int r7 = r7 + 1
            r2 = r40
            r10 = r25
            r11 = r27
            goto L_0x0097
        L_0x00f1:
            r25 = r10
            r27 = r11
            r2 = -1
            r11 = 0
            if (r19 != 0) goto L_0x0109
            boolean r7 = r8.d1
            if (r7 == 0) goto L_0x0100
            if (r6 != 0) goto L_0x0107
            goto L_0x0109
        L_0x0100:
            long r6 = r8.a1
            int r6 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0107
            goto L_0x0109
        L_0x0107:
            r6 = r11
            goto L_0x010a
        L_0x0109:
            r6 = 1
        L_0x010a:
            wl6 r10 = r8.o
            m85 r7 = r10.q
            r16 = r6
            r9 = r7
            r6 = r11
        L_0x0112:
            if (r6 >= r5) goto L_0x016b
            r2 = r3[r6]
            if (r2 != 0) goto L_0x011b
            r28 = r3
            goto L_0x0164
        L_0x011b:
            sze r11 = r8.T0
            r28 = r3
            qze r3 = r2.a()
            int r3 = r11.b(r3)
            int r11 = r8.W0
            if (r3 != r11) goto L_0x012e
            r10.q = r2
            r9 = r2
        L_0x012e:
            r2 = r4[r6]
            if (r2 != 0) goto L_0x0164
            int r2 = r8.P0
            r11 = 1
            int r2 = r2 + r11
            r8.P0 = r2
            jn6 r2 = new jn6
            r2.<init>(r8, r3)
            r4[r6] = r2
            r41[r6] = r11
            int[] r11 = r8.V0
            if (r11 == 0) goto L_0x0164
            r2.a()
            if (r16 != 0) goto L_0x0164
            qn6[] r2 = r8.G0
            int[] r11 = r8.V0
            r3 = r11[r3]
            r2 = r2[r3]
            r3 = 1
            boolean r11 = r2.A(r12, r3)
            if (r11 != 0) goto L_0x0161
            int r2 = r2.o()
            if (r2 == 0) goto L_0x0161
            r2 = 1
            goto L_0x0162
        L_0x0161:
            r2 = 0
        L_0x0162:
            r16 = r2
        L_0x0164:
            int r6 = r6 + 1
            r3 = r28
            r2 = -1
            r11 = 0
            goto L_0x0112
        L_0x016b:
            r28 = r3
            int r2 = r8.P0
            java.util.ArrayList r3 = r8.y0
            if (r2 != 0) goto L_0x01bb
            r2 = 0
            r10.n = r2
            r8.R0 = r2
            r2 = 1
            r8.c1 = r2
            r3.clear()
            jo7 r3 = r8.u0
            boolean r6 = r3.o()
            if (r6 == 0) goto L_0x019c
            boolean r6 = r8.N0
            if (r6 == 0) goto L_0x0198
            qn6[] r6 = r8.G0
            int r7 = r6.length
            r9 = 0
        L_0x018e:
            if (r9 >= r7) goto L_0x0198
            r11 = r6[r9]
            r11.i()
            int r9 = r9 + 1
            goto L_0x018e
        L_0x0198:
            r3.a()
            goto L_0x019f
        L_0x019c:
            r8.x()
        L_0x019f:
            r31 = r4
            r32 = r5
            r2 = r8
            r33 = r17
            r20 = r21
            r0 = r22
            r34 = r24
            r35 = r25
            r36 = r27
            r26 = r28
            r17 = -1
            r21 = r14
            r24 = r15
            r14 = r10
            goto L_0x0275
        L_0x01bb:
            r2 = 1
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0242
            boolean r3 = defpackage.maf.a(r9, r7)
            if (r3 != 0) goto L_0x0242
            boolean r3 = r8.d1
            if (r3 != 0) goto L_0x0222
            r6 = 0
            int r3 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x01d3
            long r6 = -r12
        L_0x01d3:
            cm6 r11 = r8.i()
            h78[] r23 = r10.a(r11, r12)
            r29 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.util.List r3 = r8.z0
            r26 = r28
            r28 = r3
            r3 = r9
            r31 = r4
            r32 = r5
            r4 = r42
            r2 = r21
            r0 = r22
            r20 = r2
            r2 = r8
            r22 = r9
            r21 = r14
            r33 = r17
            r34 = r24
            r14 = 1
            r17 = -1
            r8 = r29
            r14 = r10
            r35 = r25
            r10 = r28
            r24 = r15
            r36 = r27
            r15 = r11
            r11 = r23
            r3.t(r4, r6, r8, r10, r11)
            oy5 r3 = r15.o
            qze r4 = r14.h
            int r3 = r4.a(r3)
            int r4 = r22.i()
            if (r4 == r3) goto L_0x0220
        L_0x021e:
            r3 = 1
            goto L_0x023d
        L_0x0220:
            r3 = 1
            goto L_0x025d
        L_0x0222:
            r31 = r4
            r32 = r5
            r2 = r8
            r33 = r17
            r20 = r21
            r0 = r22
            r34 = r24
            r35 = r25
            r36 = r27
            r26 = r28
            r17 = -1
            r21 = r14
            r24 = r15
            r14 = r10
            goto L_0x021e
        L_0x023d:
            r2.c1 = r3
            r4 = r3
            r9 = r4
            goto L_0x0261
        L_0x0242:
            r3 = r2
            r31 = r4
            r32 = r5
            r2 = r8
            r33 = r17
            r20 = r21
            r0 = r22
            r34 = r24
            r35 = r25
            r36 = r27
            r26 = r28
            r17 = -1
            r21 = r14
            r24 = r15
            r14 = r10
        L_0x025d:
            r9 = r16
            r4 = r19
        L_0x0261:
            if (r9 == 0) goto L_0x0273
            r2.D(r12, r4)
            r11 = 0
        L_0x0267:
            if (r11 >= r0) goto L_0x0273
            r4 = r31[r11]
            if (r4 == 0) goto L_0x026f
            r41[r11] = r3
        L_0x026f:
            int r11 = r11 + 1
            r3 = 1
            goto L_0x0267
        L_0x0273:
            r16 = r9
        L_0x0275:
            java.util.ArrayList r3 = r2.D0
            r3.clear()
            r11 = 0
        L_0x027b:
            if (r11 >= r0) goto L_0x0289
            r4 = r31[r11]
            if (r4 == 0) goto L_0x0286
            jn6 r4 = (defpackage.jn6) r4
            r3.add(r4)
        L_0x0286:
            int r11 = r11 + 1
            goto L_0x027b
        L_0x0289:
            r4 = 1
            r2.d1 = r4
            r3 = 0
            r11 = 0
        L_0x028e:
            int r4 = r1.length
            if (r11 >= r4) goto L_0x02be
            r4 = r31[r11]
            r5 = r24[r11]
            r6 = r34
            if (r5 != r6) goto L_0x02a9
            r4.getClass()
            r20[r11] = r4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r5 = r35
            r5.put(r4, r3)
            r3 = 1
            goto L_0x02b7
        L_0x02a9:
            r5 = r35
            r7 = r21[r11]
            if (r7 != r6) goto L_0x02b7
            if (r4 != 0) goto L_0x02b3
            r4 = 1
            goto L_0x02b4
        L_0x02b3:
            r4 = 0
        L_0x02b4:
            defpackage.np8.f(r4)
        L_0x02b7:
            int r11 = r11 + 1
            r35 = r5
            r34 = r6
            goto L_0x028e
        L_0x02be:
            r6 = r34
            r5 = r35
            if (r3 == 0) goto L_0x0302
            r4 = r18
            r3 = r36
            r3[r4] = r2
            int r18 = r4 + 1
            if (r4 != 0) goto L_0x02f3
            r4 = 1
            r14.l = r4
            if (r16 != 0) goto L_0x02e3
            r7 = r0
            r0 = r37
            sn6[] r8 = r0.F0
            int r9 = r8.length
            if (r9 == 0) goto L_0x02e1
            r9 = 0
            r8 = r8[r9]
            if (r2 == r8) goto L_0x030a
            goto L_0x02e7
        L_0x02e1:
            r9 = 0
            goto L_0x02e7
        L_0x02e3:
            r9 = 0
            r7 = r0
            r0 = r37
        L_0x02e7:
            o9g r2 = r0.v0
            java.lang.Object r2 = r2.b
            android.util.SparseArray r2 = (android.util.SparseArray) r2
            r2.clear()
            r19 = r4
            goto L_0x030a
        L_0x02f3:
            r4 = 1
            r9 = 0
            r7 = r0
            r0 = r37
            int r2 = r0.G0
            if (r6 >= r2) goto L_0x02fe
            r11 = r4
            goto L_0x02ff
        L_0x02fe:
            r11 = r9
        L_0x02ff:
            r14.l = r11
            goto L_0x030a
        L_0x0302:
            r9 = 0
            r7 = r0
            r4 = r18
            r3 = r36
            r0 = r37
        L_0x030a:
            int r2 = r6 + 1
            r9 = r2
            r11 = r3
            r10 = r5
            r6 = r20
            r14 = r21
            r15 = r24
            r3 = r26
            r4 = r31
            r5 = r32
            r17 = r33
            r2 = r40
            goto L_0x0065
        L_0x0321:
            r8 = r6
            r3 = r11
            r6 = r17
            r4 = r18
            r9 = 0
            java.lang.System.arraycopy(r8, r9, r2, r9, r6)
            java.lang.Object[] r1 = defpackage.maf.F(r4, r3)
            sn6[] r1 = (defpackage.sn6[]) r1
            r0.F0 = r1
            mq9 r2 = r0.w0
            r2.getClass()
            rxd r2 = new rxd
            r3 = 10
            r2.<init>(r3, r1)
            r0.H0 = r2
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.em6.L(m85[], boolean[], frc[], boolean[], long):long");
    }

    public final boolean a() {
        return this.H0.a();
    }

    public final void b() {
        for (sn6 sn6 : this.E0) {
            ArrayList arrayList = sn6.y0;
            if (!arrayList.isEmpty()) {
                cm6 cm6 = (cm6) mqd.m(arrayList);
                int b2 = sn6.o.b(cm6);
                if (b2 == 1) {
                    cm6.V0 = true;
                } else if (b2 == 2 && !sn6.e1) {
                    jo7 jo7 = sn6.u0;
                    if (jo7.o()) {
                        jo7.a();
                    }
                }
            }
        }
        this.B0.c(this);
    }

    public final void c(i6d i6d) {
        sn6 sn6 = (sn6) i6d;
        this.B0.c(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0090, code lost:
        if (r4 != false) goto L_0x0097;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0055 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e(android.net.Uri r17, defpackage.wn7 r18, boolean r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            sn6[] r2 = r0.E0
            int r3 = r2.length
            r6 = 0
            r7 = 1
        L_0x0009:
            if (r6 >= r3) goto L_0x00a6
            r8 = r2[r6]
            wl6 r9 = r8.o
            android.net.Uri[] r10 = r9.e
            boolean r10 = defpackage.maf.l(r10, r1)
            if (r10 != 0) goto L_0x001d
            r8 = r18
            r4 = 1
            r5 = 1
            goto L_0x00a1
        L_0x001d:
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r19 != 0) goto L_0x003f
            m85 r12 = r9.q
            ty4 r12 = defpackage.ay7.h(r12)
            buc r8 = r8.t0
            r8.getClass()
            r8 = r18
            b11 r12 = defpackage.buc.u(r12, r8)
            if (r12 == 0) goto L_0x0041
            int r13 = r12.b
            r14 = 2
            if (r13 != r14) goto L_0x0041
            long r12 = r12.c
            goto L_0x0042
        L_0x003f:
            r8 = r18
        L_0x0041:
            r12 = r10
        L_0x0042:
            r14 = 0
        L_0x0043:
            android.net.Uri[] r15 = r9.e
            int r5 = r15.length
            r4 = -1
            if (r14 >= r5) goto L_0x0055
            r5 = r15[r14]
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x0052
            goto L_0x0056
        L_0x0052:
            int r14 = r14 + 1
            goto L_0x0043
        L_0x0055:
            r14 = r4
        L_0x0056:
            if (r14 != r4) goto L_0x005b
        L_0x0058:
            r4 = 1
            r5 = 1
            goto L_0x0098
        L_0x005b:
            m85 r5 = r9.q
            int r5 = r5.p(r14)
            if (r5 != r4) goto L_0x0064
            goto L_0x0058
        L_0x0064:
            boolean r4 = r9.s
            android.net.Uri r14 = r9.o
            boolean r14 = r1.equals(r14)
            r4 = r4 | r14
            r9.s = r4
            int r4 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x0096
            m85 r4 = r9.q
            boolean r4 = r4.r(r5, r12)
            if (r4 == 0) goto L_0x0093
            hb4 r4 = r9.g
            java.util.HashMap r4 = r4.b
            java.lang.Object r4 = r4.get(r1)
            fb4 r4 = (defpackage.fb4) r4
            if (r4 == 0) goto L_0x008e
            boolean r4 = defpackage.fb4.a(r4, r12)
            r5 = 1
            r4 = r4 ^ r5
            goto L_0x0090
        L_0x008e:
            r5 = 1
            r4 = 0
        L_0x0090:
            if (r4 == 0) goto L_0x0094
            goto L_0x0097
        L_0x0093:
            r5 = 1
        L_0x0094:
            r4 = 0
            goto L_0x0098
        L_0x0096:
            r5 = 1
        L_0x0097:
            r4 = r5
        L_0x0098:
            if (r4 == 0) goto L_0x00a0
            int r4 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x00a0
            r4 = r5
            goto L_0x00a1
        L_0x00a0:
            r4 = 0
        L_0x00a1:
            r7 = r7 & r4
            int r6 = r6 + 1
            goto L_0x0009
        L_0x00a6:
            wd8 r1 = r0.B0
            r1.c(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.em6.e(android.net.Uri, wn7, boolean):boolean");
    }

    public final long f() {
        return this.H0.f();
    }

    public final sn6 g(String str, int i, Uri[] uriArr, oy5[] oy5Arr, oy5 oy5, List list, Map map, long j) {
        Uri[] uriArr2 = uriArr;
        oy5[] oy5Arr2 = oy5Arr;
        wl6 wl6 = new wl6(this.a, this.b, uriArr2, oy5Arr2, this.c, this.o, this.v0, list, this.A0);
        gk8 gk8 = this.s0;
        int i2 = this.y0;
        return new sn6(str, i, this, wl6, map, this.t0, j, oy5, this.X, this.Y, this.Z, gk8, i2);
    }

    public final void i() {
        int i = this.C0 - 1;
        this.C0 = i;
        if (i <= 0) {
            int i2 = 0;
            for (sn6 sn6 : this.E0) {
                sn6.d();
                i2 += sn6.T0.a;
            }
            qze[] qzeArr = new qze[i2];
            int i3 = 0;
            for (sn6 sn62 : this.E0) {
                sn62.d();
                int i4 = sn62.T0.a;
                int i5 = 0;
                while (i5 < i4) {
                    sn62.d();
                    qzeArr[i3] = sn62.T0.a(i5);
                    i5++;
                    i3++;
                }
            }
            this.D0 = new sze(qzeArr);
            this.B0.d(this);
        }
    }

    public final void k() {
        sn6[] sn6Arr = this.E0;
        int length = sn6Arr.length;
        int i = 0;
        while (i < length) {
            sn6 sn6 = sn6Arr[i];
            sn6.u();
            if (!sn6.e1 || sn6.O0) {
                i++;
            } else {
                throw ParserException.a((RuntimeException) null, "Loading finished before preparation is complete.");
            }
        }
    }

    public final long l(long j) {
        sn6[] sn6Arr = this.F0;
        if (sn6Arr.length > 0) {
            boolean D = sn6Arr[0].D(j, false);
            int i = 1;
            while (true) {
                sn6[] sn6Arr2 = this.F0;
                if (i >= sn6Arr2.length) {
                    break;
                }
                sn6Arr2[i].D(j, D);
                i++;
            }
            if (D) {
                ((SparseArray) this.v0.b).clear();
            }
        }
        return j;
    }

    public final long n() {
        return -9223372036854775807L;
    }

    public final sze q() {
        sze sze = this.D0;
        sze.getClass();
        return sze;
    }

    public final long r() {
        return this.H0.r();
    }

    public final void s(long j, boolean z) {
        for (sn6 sn6 : this.F0) {
            if (sn6.N0 && !sn6.m()) {
                int length = sn6.G0.length;
                for (int i = 0; i < length; i++) {
                    sn6.G0[i].h(j, z, sn6.Y0[i]);
                }
            }
        }
    }

    public final void t(long j) {
        this.H0.t(j);
    }
}
