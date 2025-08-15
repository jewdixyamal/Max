package defpackage;

import android.net.Uri;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: t13  reason: default package */
public final class t13 implements grc, j6d, do7, io7 {
    public j13 A0;
    public qy5 B0;
    public r13 C0;
    public long D0;
    public long E0;
    public int F0;
    public zi0 G0;
    public boolean H0;
    public final g94 X;
    public final h6d Y;
    public final jn Z;
    public final int a;
    public final int[] b;
    public final qy5[] c;
    public final boolean[] o;
    public final huc s0;
    public final vq7 t0 = new vq7("ChunkSampleStream");
    public final ar0 u0 = new Object();
    public final ArrayList v0;
    public final List w0;
    public final erc x0;
    public final erc[] y0;
    public final qz7 z0;

    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Object, ar0] */
    public t13(int i, int[] iArr, qy5[] qy5Arr, g94 g94, h6d h6d, n64 n64, long j, tr4 tr4, lr4 lr4, huc huc, jn jnVar) {
        this.a = i;
        this.b = iArr;
        this.c = qy5Arr;
        this.X = g94;
        this.Y = h6d;
        this.Z = jnVar;
        this.s0 = huc;
        ArrayList arrayList = new ArrayList();
        this.v0 = arrayList;
        this.w0 = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.y0 = new erc[length];
        this.o = new boolean[length];
        int i2 = length + 1;
        int[] iArr2 = new int[i2];
        erc[] ercArr = new erc[i2];
        tr4.getClass();
        erc erc = new erc(n64, tr4, lr4);
        this.x0 = erc;
        int i3 = 0;
        iArr2[0] = i;
        ercArr[0] = erc;
        while (i3 < length) {
            erc erc2 = new erc(n64, (tr4) null, (lr4) null);
            this.y0[i3] = erc2;
            int i4 = i3 + 1;
            ercArr[i4] = erc2;
            iArr2[i4] = this.b[i3];
            i3 = i4;
        }
        this.z0 = new qz7((Object) iArr2, 6, (Object) ercArr);
        this.D0 = j;
        this.E0 = j;
    }

    public final int A(int i, int i2) {
        ArrayList arrayList;
        do {
            i2++;
            arrayList = this.v0;
            if (i2 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((zi0) arrayList.get(i2)).d(0) <= i);
        return i2 - 1;
    }

    public final void B(r13 r13) {
        this.C0 = r13;
        erc erc = this.x0;
        erc.h();
        fr4 fr4 = erc.h;
        if (fr4 != null) {
            fr4.f(erc.e);
            erc.h = null;
            erc.g = null;
        }
        for (erc erc2 : this.y0) {
            erc2.h();
            fr4 fr42 = erc2.h;
            if (fr42 != null) {
                fr42.f(erc2.e);
                erc2.h = null;
                erc2.g = null;
            }
        }
        this.t0.s(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0237  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.b11 C(defpackage.go7 r27, long r28, long r30, java.io.IOException r32, int r33) {
        /*
            r26 = this;
            r0 = r26
            r12 = r32
            r1 = 1
            r2 = r27
            j13 r2 = (defpackage.j13) r2
            u1e r3 = r2.t0
            long r3 = r3.b
            boolean r5 = r2 instanceof defpackage.zi0
            java.util.ArrayList r6 = r0.v0
            int r7 = r6.size()
            int r7 = r7 - r1
            r8 = 0
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x0027
            if (r5 == 0) goto L_0x0027
            boolean r3 = r0.x(r7)
            if (r3 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r3 = 0
            goto L_0x0028
        L_0x0027:
            r3 = r1
        L_0x0028:
            yn7 r10 = new yn7
            u1e r11 = r2.t0
            android.net.Uri r11 = r11.c
            r13 = r30
            r10.<init>(r13)
            long r13 = r2.Z
            defpackage.oaf.h0(r13)
            long r8 = r2.s0
            defpackage.oaf.h0(r8)
            wn7 r8 = new wn7
            r9 = r33
            r8.<init>(r9, r12)
            g94 r9 = r0.X
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            huc r11 = r0.s0
            if (r3 != 0) goto L_0x005b
            r9.getClass()
            r16 = r6
            r17 = r7
            r25 = r10
        L_0x0058:
            r1 = 0
            goto L_0x0234
        L_0x005b:
            d4b r4 = r9.h
            r19 = r2
            if (r4 == 0) goto L_0x00a8
            long r1 = r4.d
            int r17 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r17 == 0) goto L_0x006d
            int r1 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r1 >= 0) goto L_0x006d
            r1 = 1
            goto L_0x006e
        L_0x006d:
            r1 = 0
        L_0x006e:
            e4b r2 = r4.e
            java.lang.Object r4 = r2.u0
            i14 r4 = (defpackage.i14) r4
            boolean r4 = r4.d
            if (r4 != 0) goto L_0x0079
            goto L_0x00a8
        L_0x0079:
            boolean r4 = r2.X
            if (r4 == 0) goto L_0x007e
            goto L_0x009d
        L_0x007e:
            if (r1 == 0) goto L_0x00a8
            boolean r1 = r2.o
            if (r1 != 0) goto L_0x0085
            goto L_0x009d
        L_0x0085:
            r1 = 1
            r2.X = r1
            r1 = 0
            r2.o = r1
            java.lang.Object r1 = r2.s0
            ey1 r1 = (defpackage.ey1) r1
            java.lang.Object r1 = r1.b
            y14 r1 = (defpackage.y14) r1
            android.os.Handler r2 = r1.D
            s14 r4 = r1.w
            r2.removeCallbacks(r4)
            r1.z()
        L_0x009d:
            r16 = r6
            r17 = r7
            r25 = r10
            r2 = r19
        L_0x00a5:
            r1 = 1
            goto L_0x0234
        L_0x00a8:
            i14 r1 = r9.k
            boolean r1 = r1.d
            r2 = r19
            qy5 r4 = r2.o
            c94[] r13 = r9.i
            if (r1 != 0) goto L_0x0107
            boolean r1 = r2 instanceof defpackage.g78
            if (r1 == 0) goto L_0x0107
            boolean r1 = r12 instanceof androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException
            if (r1 == 0) goto L_0x0107
            r1 = r12
            androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException r1 = (androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException) r1
            int r1 = r1.o
            r14 = 404(0x194, float:5.66E-43)
            if (r1 != r14) goto L_0x0107
            n85 r1 = r9.j
            int r1 = r1.s(r4)
            r1 = r13[r1]
            long r17 = r1.e()
            r19 = -1
            int r14 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r14 == 0) goto L_0x0107
            r19 = 0
            int r14 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r14 == 0) goto L_0x0107
            java.lang.Object r14 = r1.g
            a24 r14 = (defpackage.a24) r14
            defpackage.fm9.l(r14)
            long r19 = r14.C()
            long r14 = r1.c
            long r19 = r19 + r14
            long r19 = r19 + r17
            r14 = 1
            long r19 = r19 - r14
            r1 = r2
            g78 r1 = (defpackage.g78) r1
            long r14 = r1.b()
            int r1 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r1 <= 0) goto L_0x0107
            r1 = 1
            r9.n = r1
        L_0x0100:
            r16 = r6
            r17 = r7
            r25 = r10
            goto L_0x00a5
        L_0x0107:
            n85 r1 = r9.j
            int r1 = r1.s(r4)
            r1 = r13[r1]
            java.lang.Object r13 = r1.e
            lhc r13 = (defpackage.lhc) r13
            zw6 r13 = r13.b
            die r14 = r9.b
            mk0 r13 = r14.O(r13)
            java.lang.Object r15 = r1.f
            mk0 r15 = (defpackage.mk0) r15
            if (r13 == 0) goto L_0x0128
            boolean r13 = r15.equals(r13)
            if (r13 != 0) goto L_0x0128
            goto L_0x0100
        L_0x0128:
            n85 r13 = r9.j
            java.lang.Object r1 = r1.e
            lhc r1 = (defpackage.lhc) r1
            zw6 r1 = r1.b
            r16 = r6
            r17 = r7
            long r6 = android.os.SystemClock.elapsedRealtime()
            int r12 = r13.length()
            r25 = r10
            r10 = 0
            r23 = 0
        L_0x0141:
            if (r10 >= r12) goto L_0x0153
            boolean r18 = r13.q(r10, r6)
            if (r18 == 0) goto L_0x014e
            r18 = 1
            int r23 = r23 + 1
            goto L_0x0150
        L_0x014e:
            r18 = 1
        L_0x0150:
            int r10 = r10 + 1
            goto L_0x0141
        L_0x0153:
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            r7 = 0
        L_0x0159:
            int r10 = r1.size()
            if (r7 >= r10) goto L_0x0171
            java.lang.Object r10 = r1.get(r7)
            mk0 r10 = (defpackage.mk0) r10
            int r10 = r10.c
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r6.add(r10)
            r10 = 1
            int r7 = r7 + r10
            goto L_0x0159
        L_0x0171:
            int r20 = r6.size()
            ty4 r6 = new ty4
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            java.util.ArrayList r1 = r14.n(r1)
            r10 = 0
        L_0x0181:
            int r13 = r1.size()
            if (r10 >= r13) goto L_0x0199
            java.lang.Object r13 = r1.get(r10)
            mk0 r13 = (defpackage.mk0) r13
            int r13 = r13.c
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r7.add(r13)
            r13 = 1
            int r10 = r10 + r13
            goto L_0x0181
        L_0x0199:
            int r1 = r7.size()
            int r21 = r20 - r1
            r24 = 2
            r19 = r6
            r22 = r12
            r19.<init>(r20, r21, r22, r23, r24)
            r1 = 2
            boolean r7 = r6.a(r1)
            if (r7 != 0) goto L_0x01b8
            r7 = 1
            boolean r10 = r6.a(r7)
            if (r10 != 0) goto L_0x01b8
            goto L_0x0058
        L_0x01b8:
            r11.getClass()
            b11 r7 = defpackage.huc.o(r6, r8)
            if (r7 == 0) goto L_0x0058
            int r10 = r7.b
            boolean r6 = r6.a(r10)
            if (r6 != 0) goto L_0x01cb
            goto L_0x0058
        L_0x01cb:
            long r6 = r7.c
            if (r10 != r1) goto L_0x01da
            n85 r1 = r9.j
            int r4 = r1.s(r4)
            boolean r1 = r1.u(r4, r6)
            goto L_0x0234
        L_0x01da:
            r1 = 1
            if (r10 != r1) goto L_0x0058
            long r9 = android.os.SystemClock.elapsedRealtime()
            long r9 = r9 + r6
            java.lang.String r1 = r15.b
            java.lang.Object r4 = r14.a
            java.util.HashMap r4 = (java.util.HashMap) r4
            boolean r6 = r4.containsKey(r1)
            if (r6 == 0) goto L_0x01ff
            java.lang.Object r6 = r4.get(r1)
            java.lang.Long r6 = (java.lang.Long) r6
            int r7 = defpackage.oaf.a
            long r6 = r6.longValue()
            long r6 = java.lang.Math.max(r9, r6)
            goto L_0x0200
        L_0x01ff:
            r6 = r9
        L_0x0200:
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r4.put(r1, r6)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r4 = r15.c
            if (r4 == r1) goto L_0x00a5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r14.b
            java.util.HashMap r4 = (java.util.HashMap) r4
            boolean r6 = r4.containsKey(r1)
            if (r6 == 0) goto L_0x022b
            java.lang.Object r6 = r4.get(r1)
            java.lang.Long r6 = (java.lang.Long) r6
            int r7 = defpackage.oaf.a
            long r6 = r6.longValue()
            long r9 = java.lang.Math.max(r9, r6)
        L_0x022b:
            java.lang.Long r6 = java.lang.Long.valueOf(r9)
            r4.put(r1, r6)
            goto L_0x00a5
        L_0x0234:
            r12 = 0
            if (r1 == 0) goto L_0x025b
            if (r3 == 0) goto L_0x0256
            if (r5 == 0) goto L_0x0253
            r7 = r17
            zi0 r1 = r0.p(r7)
            if (r1 != r2) goto L_0x0245
            r1 = 1
            goto L_0x0246
        L_0x0245:
            r1 = 0
        L_0x0246:
            defpackage.fm9.k(r1)
            boolean r1 = r16.isEmpty()
            if (r1 == 0) goto L_0x0253
            long r3 = r0.E0
            r0.D0 = r3
        L_0x0253:
            b11 r1 = defpackage.vq7.Y
            goto L_0x025c
        L_0x0256:
            java.lang.String r1 = "Ignoring attempt to cancel non-cancelable load."
            defpackage.z04.c0(r1)
        L_0x025b:
            r1 = r12
        L_0x025c:
            if (r1 != 0) goto L_0x027e
            r11.getClass()
            long r14 = defpackage.huc.q(r8)
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x027c
            b11 r1 = new b11
            r17 = 5
            r18 = 0
            r13 = r1
            r3 = 0
            r16 = r3
            r13.<init>(r14, r16, r17, r18)
            goto L_0x027e
        L_0x027c:
            b11 r1 = defpackage.vq7.Z
        L_0x027e:
            r14 = r1
            boolean r1 = r14.a()
            r3 = 1
            r15 = r1 ^ 1
            long r8 = r2.Z
            long r6 = r2.s0
            jn r1 = r0.Z
            int r3 = r2.c
            int r4 = r0.a
            qy5 r5 = r2.o
            int r10 = r2.X
            java.lang.Object r13 = r2.Y
            r2 = r25
            r16 = r6
            r6 = r10
            r7 = r13
            r18 = r11
            r10 = r16
            r13 = r12
            r12 = r32
            r27 = r14
            r14 = r13
            r13 = r15
            r1.B(r2, r3, r4, r5, r6, r7, r8, r10, r12, r13)
            if (r15 == 0) goto L_0x02b6
            r0.A0 = r14
            r18.getClass()
            h6d r1 = r0.Y
            r1.j(r0)
        L_0x02b6:
            return r27
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t13.C(go7, long, long, java.io.IOException, int):b11");
    }

    public final p13 D(int i, long j) {
        int i2 = 0;
        while (true) {
            erc[] ercArr = this.y0;
            if (i2 >= ercArr.length) {
                throw new IllegalStateException();
            } else if (this.b[i2] == i) {
                boolean[] zArr = this.o;
                fm9.k(!zArr[i2]);
                zArr[i2] = true;
                ercArr[i2].A(j, true);
                return new p13(this, this, ercArr[i2], i2);
            } else {
                i2++;
            }
        }
    }

    public final boolean a() {
        return this.t0.o();
    }

    public final void b() {
        erc erc = this.x0;
        erc.y(true);
        fr4 fr4 = erc.h;
        if (fr4 != null) {
            fr4.f(erc.e);
            erc.h = null;
            erc.g = null;
        }
        for (erc erc2 : this.y0) {
            erc2.y(true);
            fr4 fr42 = erc2.h;
            if (fr42 != null) {
                fr42.f(erc2.e);
                erc2.h = null;
                erc2.g = null;
            }
        }
        for (c94 c94 : this.X.i) {
            k13 k13 = (k13) c94.d;
            if (k13 != null) {
                ((xu0) k13).c();
            }
        }
        r13 r13 = this.C0;
        if (r13 != null) {
            q14 q14 = (q14) r13;
            synchronized (q14) {
                d4b d4b = (d4b) q14.y0.remove(this);
                if (d4b != null) {
                    erc erc3 = d4b.a;
                    erc3.y(true);
                    fr4 fr43 = erc3.h;
                    if (fr43 != null) {
                        fr43.f(erc3.e);
                        erc3.h = null;
                        erc3.g = null;
                    }
                }
            }
        }
    }

    public final void c() {
        vq7 vq7 = this.t0;
        vq7.c();
        this.x0.u();
        if (!vq7.o()) {
            g94 g94 = this.X;
            BehindLiveWindowException behindLiveWindowException = g94.m;
            if (behindLiveWindowException == null) {
                g94.a.c();
                return;
            }
            throw behindLiveWindowException;
        }
    }

    public final boolean d() {
        return !y() && this.x0.s(this.H0);
    }

    public final int e(long j) {
        if (y()) {
            return 0;
        }
        erc erc = this.x0;
        int p = erc.p(j, this.H0);
        zi0 zi0 = this.G0;
        if (zi0 != null) {
            p = Math.min(p, zi0.d(0) - erc.n());
        }
        erc.B(p);
        z();
        return p;
    }

    public final long f() {
        if (y()) {
            return this.D0;
        }
        if (this.H0) {
            return Long.MIN_VALUE;
        }
        return w().s0;
    }

    public final int j(y7g y7g, p54 p54, int i) {
        if (y()) {
            return -3;
        }
        zi0 zi0 = this.G0;
        erc erc = this.x0;
        if (zi0 != null && zi0.d(0) <= erc.n()) {
            return -3;
        }
        z();
        return erc.x(y7g, p54, i, this.H0);
    }

    public final void m(go7 go7, long j, long j2, boolean z) {
        j13 j13 = (j13) go7;
        this.A0 = null;
        this.G0 = null;
        long j3 = j13.a;
        Uri uri = j13.t0.c;
        yn7 yn7 = new yn7(j2);
        this.s0.getClass();
        this.Z.x(yn7, j13.c, this.a, j13.o, j13.X, j13.Y, j13.Z, j13.s0);
        if (!z) {
            if (y()) {
                this.x0.y(false);
                for (erc y : this.y0) {
                    y.y(false);
                }
            } else if (j13 instanceof zi0) {
                ArrayList arrayList = this.v0;
                p(arrayList.size() - 1);
                if (arrayList.isEmpty()) {
                    this.D0 = this.E0;
                }
            }
            this.Y.j(this);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r41v3, types: [rs3] */
    /* JADX WARNING: type inference failed for: r41v4, types: [mrd] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0196 A[EDGE_INSN: B:202:0x0196->B:66:0x0196 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x021f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean o(defpackage.qo7 r64) {
        /*
            r63 = this;
            r0 = r63
            boolean r1 = r0.H0
            if (r1 != 0) goto L_0x0014
            vq7 r1 = r0.t0
            boolean r3 = r1.o()
            if (r3 != 0) goto L_0x0014
            boolean r3 = r1.n()
            if (r3 == 0) goto L_0x0017
        L_0x0014:
            r0 = 0
            goto L_0x04ec
        L_0x0017:
            boolean r3 = r63.y()
            if (r3 == 0) goto L_0x0024
            java.util.List r4 = java.util.Collections.emptyList()
            long r5 = r0.D0
            goto L_0x002c
        L_0x0024:
            zi0 r4 = r63.w()
            long r5 = r4.s0
            java.util.List r4 = r0.w0
        L_0x002c:
            g94 r15 = r0.X
            androidx.media3.exoplayer.source.BehindLiveWindowException r7 = r15.m
            ar0 r11 = r0.u0
            if (r7 == 0) goto L_0x003b
            r38 = r1
            r17 = r3
            r0 = r11
            goto L_0x043d
        L_0x003b:
            r7 = r64
            long r8 = r7.a
            long r16 = r5 - r8
            i14 r7 = r15.k
            r19 = r11
            long r10 = r7.a
            long r10 = defpackage.oaf.S(r10)
            i14 r7 = r15.k
            int r2 = r15.l
            kta r2 = r7.b(r2)
            long r12 = r2.b
            long r12 = defpackage.oaf.S(r12)
            long r12 = r12 + r10
            long r12 = r12 + r5
            d4b r2 = r15.h
            if (r2 == 0) goto L_0x00e2
            e4b r2 = r2.e
            java.lang.Object r7 = r2.u0
            i14 r7 = (defpackage.i14) r7
            boolean r10 = r7.d
            if (r10 != 0) goto L_0x006d
            r23 = r15
            r14 = 0
            goto L_0x00d5
        L_0x006d:
            boolean r10 = r2.X
            if (r10 == 0) goto L_0x0075
            r23 = r15
            r14 = 1
            goto L_0x00d5
        L_0x0075:
            java.util.TreeMap r10 = r2.c
            r23 = r15
            long r14 = r7.h
            java.lang.Long r7 = java.lang.Long.valueOf(r14)
            java.util.Map$Entry r7 = r10.ceilingEntry(r7)
            java.lang.Object r10 = r2.s0
            ey1 r10 = (defpackage.ey1) r10
            if (r7 == 0) goto L_0x00b8
            java.lang.Object r11 = r7.getValue()
            java.lang.Long r11 = (java.lang.Long) r11
            long r14 = r11.longValue()
            int r11 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r11 >= 0) goto L_0x00b8
            java.lang.Object r7 = r7.getKey()
            java.lang.Long r7 = (java.lang.Long) r7
            long r11 = r7.longValue()
            java.lang.Object r7 = r10.b
            y14 r7 = (defpackage.y14) r7
            long r13 = r7.N
            r21 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r15 = (r13 > r21 ? 1 : (r13 == r21 ? 0 : -1))
            if (r15 == 0) goto L_0x00b4
            int r13 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x00b6
        L_0x00b4:
            r7.N = r11
        L_0x00b6:
            r7 = 1
            goto L_0x00b9
        L_0x00b8:
            r7 = 0
        L_0x00b9:
            if (r7 == 0) goto L_0x00d4
            boolean r11 = r2.o
            if (r11 != 0) goto L_0x00c0
            goto L_0x00d4
        L_0x00c0:
            r11 = 1
            r2.X = r11
            r11 = 0
            r2.o = r11
            java.lang.Object r2 = r10.b
            y14 r2 = (defpackage.y14) r2
            android.os.Handler r10 = r2.D
            s14 r11 = r2.w
            r10.removeCallbacks(r11)
            r2.z()
        L_0x00d4:
            r14 = r7
        L_0x00d5:
            if (r14 == 0) goto L_0x00df
            r38 = r1
        L_0x00d9:
            r17 = r3
            r0 = r19
            goto L_0x043d
        L_0x00df:
            r2 = r23
            goto L_0x00e3
        L_0x00e2:
            r2 = r15
        L_0x00e3:
            long r10 = r2.f
            long r10 = defpackage.oaf.B(r10)
            long r14 = defpackage.oaf.S(r10)
            i14 r7 = r2.k
            long r10 = r7.a
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r23 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r23 != 0) goto L_0x0100
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0110
        L_0x0100:
            int r12 = r2.l
            kta r7 = r7.b(r12)
            long r12 = r7.b
            long r10 = r10 + r12
            long r10 = defpackage.oaf.S(r10)
            long r10 = r14 - r10
            r12 = r10
        L_0x0110:
            boolean r7 = r4.isEmpty()
            if (r7 == 0) goto L_0x011b
            r23 = 1
            r24 = 0
            goto L_0x012b
        L_0x011b:
            int r7 = r4.size()
            r23 = 1
            int r7 = r7 + -1
            java.lang.Object r7 = r4.get(r7)
            g78 r7 = (defpackage.g78) r7
            r24 = r7
        L_0x012b:
            n85 r7 = r2.j
            int r7 = r7.length()
            i78[] r10 = new defpackage.i78[r7]
            r25 = r12
            r11 = 0
        L_0x0136:
            c94[] r12 = r2.i
            if (r11 >= r7) goto L_0x0196
            r12 = r12[r11]
            java.lang.Object r13 = r12.g
            a24 r13 = (defpackage.a24) r13
            o84 r27 = defpackage.i78.P
            if (r13 != 0) goto L_0x0149
            r10[r11] = r27
            r38 = r1
            goto L_0x018f
        L_0x0149:
            long r34 = r12.c(r14)
            long r36 = r12.d(r14)
            if (r24 == 0) goto L_0x015c
            long r12 = r24.b()
            r38 = r1
            r30 = r12
            goto L_0x0179
        L_0x015c:
            java.lang.Object r13 = r12.g
            a24 r13 = (defpackage.a24) r13
            defpackage.fm9.l(r13)
            r38 = r1
            long r0 = r12.b
            long r0 = r13.v(r5, r0)
            long r12 = r12.c
            long r28 = r0 + r12
            r30 = r34
            r32 = r36
            long r0 = defpackage.oaf.k(r28, r30, r32)
            r30 = r0
        L_0x0179:
            int r0 = (r30 > r34 ? 1 : (r30 == r34 ? 0 : -1))
            if (r0 >= 0) goto L_0x0180
            r10[r11] = r27
            goto L_0x018f
        L_0x0180:
            c94 r29 = r2.b(r11)
            e94 r0 = new e94
            r28 = r0
            r32 = r36
            r28.<init>(r29, r30, r32)
            r10[r11] = r0
        L_0x018f:
            int r11 = r11 + 1
            r0 = r63
            r1 = r38
            goto L_0x0136
        L_0x0196:
            r38 = r1
            i14 r0 = r2.k
            boolean r0 = r0.d
            r27 = r5
            r5 = 0
            if (r0 == 0) goto L_0x01ad
            r0 = 0
            r1 = r12[r0]
            long r29 = r1.e()
            int r1 = (r29 > r5 ? 1 : (r29 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x01b3
        L_0x01ad:
            r21 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x01eb
        L_0x01b3:
            r1 = r12[r0]
            long r5 = r1.d(r14)
            r1 = r12[r0]
            long r0 = r1.f(r5)
            i14 r5 = r2.k
            long r6 = r5.a
            r21 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r11 = (r6 > r21 ? 1 : (r6 == r21 ? 0 : -1))
            if (r11 != 0) goto L_0x01cf
            r5 = r21
            goto L_0x01de
        L_0x01cf:
            int r11 = r2.l
            kta r5 = r5.b(r11)
            long r11 = r5.b
            long r6 = r6 + r11
            long r5 = defpackage.oaf.S(r6)
            long r5 = r14 - r5
        L_0x01de:
            long r0 = java.lang.Math.min(r5, r0)
            long r0 = r0 - r8
            r5 = 0
            long r0 = java.lang.Math.max(r5, r0)
            r12 = r0
            goto L_0x01ed
        L_0x01eb:
            r12 = r21
        L_0x01ed:
            n85 r7 = r2.j
            r5 = r10
            r1 = r19
            r0 = 0
            r10 = r16
            r39 = r25
            r41 = r14
            r6 = r23
            r14 = r4
            r15 = r5
            r7.r(r8, r10, r12, r14, r15)
            n85 r5 = r2.j
            int r5 = r5.b()
            android.os.SystemClock.elapsedRealtime()
            c94 r5 = r2.b(r5)
            java.lang.Object r7 = r5.g
            a24 r7 = (defpackage.a24) r7
            java.lang.Object r8 = r5.f
            mk0 r8 = (defpackage.mk0) r8
            java.lang.Object r9 = r5.d
            k13 r9 = (defpackage.k13) r9
            java.lang.Object r10 = r5.e
            lhc r10 = (defpackage.lhc) r10
            if (r9 == 0) goto L_0x0275
            r11 = r9
            xu0 r11 = (defpackage.xu0) r11
            qy5[] r11 = r11.t0
            if (r11 != 0) goto L_0x0229
            r4c r11 = r10.X
            goto L_0x022a
        L_0x0229:
            r11 = r0
        L_0x022a:
            if (r7 != 0) goto L_0x0231
            r4c r12 = r10.d()
            goto L_0x0232
        L_0x0231:
            r12 = r0
        L_0x0232:
            if (r11 != 0) goto L_0x0236
            if (r12 == 0) goto L_0x0275
        L_0x0236:
            n85 r4 = r2.j
            qy5 r16 = r4.j()
            n85 r4 = r2.j
            int r17 = r4.k()
            n85 r4 = r2.j
            java.lang.Object r18 = r4.m()
            if (r11 == 0) goto L_0x0255
            java.lang.String r4 = r8.a
            r4c r4 = r11.a(r12, r4)
            if (r4 != 0) goto L_0x0253
            goto L_0x0259
        L_0x0253:
            r11 = r4
            goto L_0x0259
        L_0x0255:
            r12.getClass()
            r11 = r12
        L_0x0259:
            java.lang.String r4 = r8.a
            r7 = 0
            a34 r15 = defpackage.ft.d(r10, r4, r11, r7)
            u07 r4 = new u07
            java.lang.Object r5 = r5.d
            r19 = r5
            k13 r19 = (defpackage.k13) r19
            t24 r14 = r2.e
            r13 = r4
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r1.b = r4
        L_0x0270:
            r0 = r1
            r17 = r3
            goto L_0x043d
        L_0x0275:
            i14 r11 = r2.k
            boolean r12 = r11.d
            if (r12 == 0) goto L_0x0288
            int r12 = r2.l
            java.util.List r11 = r11.m
            int r11 = r11.size()
            int r11 = r11 - r6
            if (r12 != r11) goto L_0x0288
            r14 = r6
            goto L_0x0289
        L_0x0288:
            r14 = 0
        L_0x0289:
            long r12 = r5.b
            r64 = r7
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r14 == 0) goto L_0x029b
            int r15 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r15 == 0) goto L_0x0299
            goto L_0x029b
        L_0x0299:
            r15 = 0
            goto L_0x029c
        L_0x029b:
            r15 = 1
        L_0x029c:
            long r16 = r5.e()
            r18 = 0
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 != 0) goto L_0x02a9
            r1.a = r15
            goto L_0x0270
        L_0x02a9:
            r6 = r41
            long r16 = r5.c(r6)
            long r6 = r5.d(r6)
            if (r14 == 0) goto L_0x02c9
            long r18 = r5.f(r6)
            long r21 = r5.g(r6)
            long r21 = r18 - r21
            long r21 = r21 + r18
            int r14 = (r21 > r12 ? 1 : (r21 == r12 ? 0 : -1))
            if (r14 < 0) goto L_0x02c7
            r14 = 1
            goto L_0x02c8
        L_0x02c7:
            r14 = 0
        L_0x02c8:
            r15 = r15 & r14
        L_0x02c9:
            r19 = r1
            long r0 = r5.c
            if (r24 == 0) goto L_0x02da
            long r21 = r24.b()
            r14 = r64
            r64 = r10
        L_0x02d7:
            r10 = r21
            goto L_0x02f4
        L_0x02da:
            defpackage.fm9.l(r64)
            r14 = r64
            r64 = r10
            r10 = r27
            long r21 = r14.v(r10, r12)
            long r29 = r21 + r0
            r31 = r16
            r33 = r6
            long r21 = defpackage.oaf.k(r29, r31, r33)
            r27 = r10
            goto L_0x02d7
        L_0x02f4:
            int r16 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r16 >= 0) goto L_0x0301
            androidx.media3.exoplayer.source.BehindLiveWindowException r0 = new androidx.media3.exoplayer.source.BehindLiveWindowException
            r0.<init>()
            r2.m = r0
            goto L_0x00d9
        L_0x0301:
            int r16 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            r17 = r3
            if (r16 > 0) goto L_0x030d
            boolean r3 = r2.n
            if (r3 == 0) goto L_0x0311
            if (r16 < 0) goto L_0x0311
        L_0x030d:
            r0 = r19
            goto L_0x043b
        L_0x0311:
            if (r15 == 0) goto L_0x0323
            long r15 = r5.g(r10)
            int r3 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
            if (r3 < 0) goto L_0x0323
            r15 = r19
            r3 = 1
            r15.a = r3
            r0 = r15
            goto L_0x043d
        L_0x0323:
            r15 = r19
            int r3 = r2.g
            r19 = r8
            r16 = r9
            long r8 = (long) r3
            long r6 = r6 - r10
            r21 = 1
            long r6 = r6 + r21
            long r6 = java.lang.Math.min(r8, r6)
            int r3 = (int) r6
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0351
        L_0x033f:
            r6 = 1
            if (r3 <= r6) goto L_0x0351
            long r6 = (long) r3
            long r6 = r6 + r10
            long r6 = r6 - r21
            long r6 = r5.g(r6)
            int r6 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r6 < 0) goto L_0x0351
            int r3 = r3 + -1
            goto L_0x033f
        L_0x0351:
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x035a
            r51 = r27
            goto L_0x035f
        L_0x035a:
            r51 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x035f:
            n85 r4 = r2.j
            qy5 r4 = r4.j()
            n85 r6 = r2.j
            int r45 = r6.k()
            n85 r6 = r2.j
            java.lang.Object r46 = r6.m()
            long r47 = r5.g(r10)
            defpackage.fm9.l(r14)
            long r6 = r10 - r0
            r4c r6 = r14.n(r6)
            t24 r7 = r2.e
            if (r16 != 0) goto L_0x03b4
            long r49 = r5.f(r10)
            r0 = r39
            boolean r0 = r5.h(r10, r0)
            if (r0 == 0) goto L_0x0392
            r0 = r19
            r9 = 0
            goto L_0x0396
        L_0x0392:
            r0 = r19
            r9 = 8
        L_0x0396:
            java.lang.String r0 = r0.a
            r1 = r64
            a34 r43 = defpackage.ft.d(r1, r0, r6, r9)
            mrd r0 = new mrd
            int r1 = r2.d
            r41 = r0
            r42 = r7
            r44 = r4
            r51 = r10
            r53 = r1
            r54 = r4
            r41.<init>(r42, r43, r44, r45, r46, r47, r49, r51, r53, r54)
            r1 = r15
            goto L_0x0437
        L_0x03b4:
            r9 = r64
            r2 = r19
            r61 = r39
            r16 = r7
            r19 = r15
            r7 = 1
            r15 = 1
        L_0x03c0:
            if (r15 >= r3) goto L_0x03e3
            r25 = r3
            r23 = r4
            long r3 = (long) r15
            long r3 = r3 + r10
            defpackage.fm9.l(r14)
            long r3 = r3 - r0
            r4c r3 = r14.n(r3)
            java.lang.String r4 = r2.a
            r4c r3 = r6.a(r3, r4)
            if (r3 != 0) goto L_0x03d9
            goto L_0x03e5
        L_0x03d9:
            int r7 = r7 + 1
            int r15 = r15 + 1
            r6 = r3
            r4 = r23
            r3 = r25
            goto L_0x03c0
        L_0x03e3:
            r23 = r4
        L_0x03e5:
            long r0 = (long) r7
            long r0 = r0 + r10
            long r0 = r0 - r21
            long r49 = r5.f(r0)
            if (r8 == 0) goto L_0x03f8
            int r3 = (r12 > r49 ? 1 : (r12 == r49 ? 0 : -1))
            if (r3 > 0) goto L_0x03f8
            r53 = r12
            r3 = r61
            goto L_0x03ff
        L_0x03f8:
            r3 = r61
            r53 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x03ff:
            boolean r0 = r5.h(r0, r3)
            if (r0 == 0) goto L_0x0407
            r0 = 0
            goto L_0x0409
        L_0x0407:
            r0 = 8
        L_0x0409:
            java.lang.String r1 = r2.a
            a34 r43 = defpackage.ft.d(r9, r1, r6, r0)
            long r0 = r9.c
            long r0 = -r0
            r2 = r23
            java.lang.String r3 = r2.n
            boolean r3 = defpackage.ia9.i(r3)
            if (r3 == 0) goto L_0x041e
            long r0 = r0 + r47
        L_0x041e:
            r58 = r0
            rs3 r0 = new rs3
            r41 = r0
            java.lang.Object r1 = r5.d
            r60 = r1
            k13 r60 = (defpackage.k13) r60
            r42 = r16
            r44 = r2
            r55 = r10
            r57 = r7
            r41.<init>(r42, r43, r44, r45, r46, r47, r49, r51, r53, r55, r57, r58, r60)
            r1 = r19
        L_0x0437:
            r1.b = r0
            r0 = r1
            goto L_0x043d
        L_0x043b:
            r0.a = r15
        L_0x043d:
            boolean r1 = r0.a
            java.lang.Object r2 = r0.b
            j13 r2 = (defpackage.j13) r2
            r3 = 0
            r0.b = r3
            r3 = 0
            r0.a = r3
            if (r1 == 0) goto L_0x0458
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r63
            r0.D0 = r4
            r1 = 1
            r0.H0 = r1
            return r1
        L_0x0458:
            r0 = r63
            if (r2 != 0) goto L_0x045d
            return r3
        L_0x045d:
            r0.A0 = r2
            boolean r1 = r2 instanceof defpackage.zi0
            qz7 r3 = r0.z0
            if (r1 == 0) goto L_0x04ad
            r1 = r2
            zi0 r1 = (defpackage.zi0) r1
            if (r17 == 0) goto L_0x048c
            long r4 = r0.D0
            long r6 = r1.Z
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0485
            erc r6 = r0.x0
            r6.t = r4
            erc[] r4 = r0.y0
            int r5 = r4.length
            r6 = 0
        L_0x047a:
            if (r6 >= r5) goto L_0x0485
            r7 = r4[r6]
            long r8 = r0.D0
            r7.t = r8
            int r6 = r6 + 1
            goto L_0x047a
        L_0x0485:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.D0 = r4
        L_0x048c:
            r1.x0 = r3
            java.lang.Object r3 = r3.c
            erc[] r3 = (defpackage.erc[]) r3
            int r4 = r3.length
            int[] r4 = new int[r4]
            r5 = 0
        L_0x0496:
            int r6 = r3.length
            if (r5 >= r6) goto L_0x04a5
            r6 = r3[r5]
            int r7 = r6.q
            int r6 = r6.p
            int r7 = r7 + r6
            r4[r5] = r7
            int r5 = r5 + 1
            goto L_0x0496
        L_0x04a5:
            r1.y0 = r4
            java.util.ArrayList r3 = r0.v0
            r3.add(r1)
            goto L_0x04b6
        L_0x04ad:
            boolean r1 = r2 instanceof defpackage.u07
            if (r1 == 0) goto L_0x04b6
            r1 = r2
            u07 r1 = (defpackage.u07) r1
            r1.v0 = r3
        L_0x04b6:
            huc r1 = r0.s0
            int r3 = r2.c
            int r1 = r1.p(r3)
            r3 = r38
            long r8 = r3.v(r2, r0, r1)
            yn7 r13 = new yn7
            long r5 = r2.a
            a34 r7 = r2.b
            r4 = r13
            r4.<init>(r5, r7, r8)
            int r1 = r2.X
            java.lang.Object r3 = r2.Y
            jn r12 = r0.Z
            int r14 = r2.c
            int r15 = r0.a
            qy5 r0 = r2.o
            long r4 = r2.Z
            long r6 = r2.s0
            r16 = r0
            r17 = r1
            r18 = r3
            r19 = r4
            r21 = r6
            r12.F(r13, r14, r15, r16, r17, r18, r19, r21)
            r0 = 1
        L_0x04ec:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t13.o(qo7):boolean");
    }

    public final zi0 p(int i) {
        ArrayList arrayList = this.v0;
        zi0 zi0 = (zi0) arrayList.get(i);
        oaf.X(arrayList, i, arrayList.size());
        this.F0 = Math.max(this.F0, arrayList.size());
        int i2 = 0;
        this.x0.j(zi0.d(0));
        while (true) {
            erc[] ercArr = this.y0;
            if (i2 >= ercArr.length) {
                return zi0;
            }
            erc erc = ercArr[i2];
            i2++;
            erc.j(zi0.d(i2));
        }
    }

    public final long r() {
        long j;
        if (this.H0) {
            return Long.MIN_VALUE;
        }
        if (y()) {
            return this.D0;
        }
        long j2 = this.E0;
        zi0 w = w();
        if (!w.c()) {
            ArrayList arrayList = this.v0;
            w = arrayList.size() > 1 ? (zi0) wg0.f(arrayList, 2) : null;
        }
        if (w != null) {
            j2 = Math.max(j2, w.s0);
        }
        erc erc = this.x0;
        synchronized (erc) {
            j = erc.v;
        }
        return Math.max(j2, j);
    }

    public final void t(long j) {
        vq7 vq7 = this.t0;
        if (!vq7.n() && !y()) {
            boolean o2 = vq7.o();
            ArrayList arrayList = this.v0;
            boolean z = false;
            List list = this.w0;
            g94 g94 = this.X;
            if (o2) {
                j13 j13 = this.A0;
                j13.getClass();
                boolean z2 = j13 instanceof zi0;
                if (!z2 || !x(arrayList.size() - 1)) {
                    if (g94.m == null) {
                        z = g94.j.t(j, j13, list);
                    }
                    if (z) {
                        vq7.l();
                        if (z2) {
                            this.G0 = (zi0) j13;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            int size = (g94.m != null || g94.j.length() < 2) ? list.size() : g94.j.g(j, list);
            if (size < arrayList.size()) {
                fm9.k(!vq7.o());
                int size2 = arrayList.size();
                while (true) {
                    if (size >= size2) {
                        size = -1;
                        break;
                    } else if (!x(size)) {
                        break;
                    } else {
                        size++;
                    }
                }
                if (size != -1) {
                    long j2 = w().s0;
                    zi0 p = p(size);
                    if (arrayList.isEmpty()) {
                        this.D0 = this.E0;
                    }
                    this.H0 = false;
                    jn jnVar = this.Z;
                    jnVar.getClass();
                    jnVar.P(new pc8(1, this.a, (Object) null, 3, (Object) null, oaf.h0(p.Z), oaf.h0(j2)));
                }
            }
        }
    }

    public final g94 u() {
        return this.X;
    }

    public final void v(go7 go7, long j, long j2) {
        j13 j13 = (j13) go7;
        this.A0 = null;
        g94 g94 = this.X;
        g94.getClass();
        if (j13 instanceof u07) {
            int s = g94.j.s(((u07) j13).o);
            c94[] c94Arr = g94.i;
            c94 c94 = c94Arr[s];
            if (((a24) c94.g) == null) {
                k13 k13 = (k13) c94.d;
                fm9.l(k13);
                m13 a2 = ((xu0) k13).a();
                if (a2 != null) {
                    lhc lhc = (lhc) c94.e;
                    g03 g03 = new g03((Object) a2, lhc.c, 3);
                    long j3 = c94.c;
                    c94Arr[s] = new c94(c94.b, lhc, (mk0) c94.f, (k13) c94.d, j3, g03, 1);
                }
            }
        }
        d4b d4b = g94.h;
        if (d4b != null) {
            long j4 = d4b.d;
            if (j4 == -9223372036854775807L || j13.s0 > j4) {
                d4b.d = j13.s0;
            }
            d4b.e.o = true;
        }
        long j5 = j13.a;
        Uri uri = j13.t0.c;
        yn7 yn7 = new yn7(j2);
        this.s0.getClass();
        this.Z.z(yn7, j13.c, this.a, j13.o, j13.X, j13.Y, j13.Z, j13.s0);
        this.Y.j(this);
    }

    public final zi0 w() {
        return (zi0) wg0.f(this.v0, 1);
    }

    public final boolean x(int i) {
        int n;
        zi0 zi0 = (zi0) this.v0.get(i);
        if (this.x0.n() > zi0.d(0)) {
            return true;
        }
        int i2 = 0;
        do {
            erc[] ercArr = this.y0;
            if (i2 >= ercArr.length) {
                return false;
            }
            n = ercArr[i2].n();
            i2++;
        } while (n <= zi0.d(i2));
        return true;
    }

    public final boolean y() {
        return this.D0 != -9223372036854775807L;
    }

    public final void z() {
        int A = A(this.x0.n(), this.F0 - 1);
        while (true) {
            int i = this.F0;
            if (i <= A) {
                this.F0 = i + 1;
                zi0 zi0 = (zi0) this.v0.get(i);
                qy5 qy5 = zi0.o;
                if (!qy5.equals(this.B0)) {
                    qy5 qy52 = qy5;
                    this.Z.m(this.a, qy52, zi0.X, zi0.Y, zi0.Z);
                }
                this.B0 = qy5;
            } else {
                return;
            }
        }
    }
}
