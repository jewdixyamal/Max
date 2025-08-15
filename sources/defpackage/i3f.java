package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: i3f  reason: default package */
public final class i3f implements la5 {
    public boolean A0;
    public boolean B0;
    public n3f C0;
    public int D0;
    public int E0;
    public final SparseIntArray X;
    public final df4 Y;
    public final mbe Z;
    public final int a;
    public final int b;
    public final List c;
    public final wpa o;
    public final SparseArray s0;
    public final SparseBooleanArray t0;
    public final SparseBooleanArray u0;
    public final g3f v0;
    public km5 w0;
    public pa5 x0;
    public int y0;
    public boolean z0;

    /* JADX WARNING: type inference failed for: r8v6, types: [aab, f1d, java.lang.Object] */
    public i3f(int i, int i2, mbe mbe, tue tue, df4 df4) {
        this.Y = df4;
        this.a = i;
        this.b = i2;
        this.Z = mbe;
        if (i == 1 || i == 2) {
            this.c = Collections.singletonList(tue);
        } else {
            ArrayList arrayList = new ArrayList();
            this.c = arrayList;
            arrayList.add(tue);
        }
        this.o = new wpa(0, new byte[9400]);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.t0 = sparseBooleanArray;
        this.u0 = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.s0 = sparseArray;
        this.X = new SparseIntArray();
        this.v0 = new g3f(1);
        this.x0 = pa5.v;
        this.E0 = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i3 = 0; i3 < size; i3++) {
            sparseArray.put(sparseArray2.keyAt(i3), (n3f) sparseArray2.valueAt(i3));
        }
        ? obj = new Object();
        obj.b = this;
        obj.a = new s02(new byte[4], 4, 2, (byte) 0);
        sparseArray.put(0, new h1d(obj));
        this.C0 = null;
    }

    public final void S(pa5 pa5) {
        if ((this.b & 1) == 0) {
            pa5 = new k8g(pa5, this.Z);
        }
        this.x0 = pa5;
    }

    public final void d(long j, long j2) {
        km5 km5;
        long j3;
        fm9.k(this.a != 2);
        List list = this.c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            tue tue = (tue) list.get(i);
            synchronized (tue) {
                j3 = tue.b;
            }
            boolean z = j3 == -9223372036854775807L;
            if (!z) {
                long d = tue.d();
                z = (d == -9223372036854775807L || d == 0 || d == j2) ? false : true;
            }
            if (z) {
                tue.f(j2);
            }
        }
        if (!(j2 == 0 || (km5 = this.w0) == null)) {
            km5.e(j2);
        }
        this.o.D(0);
        this.X.clear();
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.s0;
            if (i2 < sparseArray.size()) {
                ((n3f) sparseArray.valueAt(i2)).a();
                i2++;
            } else {
                this.D0 = 0;
                return;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: n3f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: om0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: km5} */
    /* JADX WARNING: type inference failed for: r4v19, types: [java.lang.Object, km0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int g(defpackage.na5 r28, defpackage.lh4 r29) {
        /*
            r27 = this;
            r0 = r27
            r1 = r29
            r2 = r28
            sa4 r2 = (defpackage.sa4) r2
            long r14 = r2.c
            r2 = 0
            r12 = 1
            int r13 = r0.a
            r10 = 2
            if (r13 != r10) goto L_0x0014
            r17 = r12
            goto L_0x0016
        L_0x0014:
            r17 = r2
        L_0x0016:
            boolean r3 = r0.z0
            r11 = 71
            r18 = -1
            if (r3 == 0) goto L_0x019e
            int r3 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            g3f r6 = r0.v0
            if (r3 == 0) goto L_0x0118
            if (r17 != 0) goto L_0x0118
            boolean r3 = r6.b
            if (r3 != 0) goto L_0x0118
            int r0 = r0.E0
            if (r0 > 0) goto L_0x003c
            r0 = r28
            sa4 r0 = (defpackage.sa4) r0
            r6.b(r0)
            goto L_0x0117
        L_0x003c:
            boolean r3 = r6.d
            java.lang.Object r7 = r6.i
            wpa r7 = (defpackage.wpa) r7
            int r8 = r6.a
            if (r3 != 0) goto L_0x009f
            r3 = r28
            sa4 r3 = (defpackage.sa4) r3
            long r8 = (long) r8
            long r13 = r3.c
            long r8 = java.lang.Math.min(r8, r13)
            int r8 = (int) r8
            long r9 = (long) r8
            long r13 = r13 - r9
            long r9 = r3.o
            int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r9 == 0) goto L_0x005f
            r1.a = r13
        L_0x005c:
            r2 = r12
            goto L_0x0117
        L_0x005f:
            r7.D(r8)
            r3.Y = r2
            byte[] r1 = r7.a
            r3.q(r1, r2, r8, r2)
            int r1 = r7.b
            int r3 = r7.c
            int r8 = r3 + -188
        L_0x006f:
            if (r8 < r1) goto L_0x0099
            byte[] r9 = r7.a
            r10 = -4
            r13 = r2
        L_0x0075:
            r14 = 4
            if (r10 > r14) goto L_0x0096
            int r14 = r10 * 188
            int r14 = r14 + r8
            if (r14 < r1) goto L_0x0092
            if (r14 >= r3) goto L_0x0092
            byte r14 = r9[r14]
            if (r14 == r11) goto L_0x0084
            goto L_0x0092
        L_0x0084:
            int r13 = r13 + r12
            r14 = 5
            if (r13 != r14) goto L_0x0093
            long r9 = defpackage.wmd.C(r7, r8, r0)
            int r13 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r13 == 0) goto L_0x0096
            r4 = r9
            goto L_0x0099
        L_0x0092:
            r13 = r2
        L_0x0093:
            int r10 = r10 + 1
            goto L_0x0075
        L_0x0096:
            int r8 = r8 + -1
            goto L_0x006f
        L_0x0099:
            r6.f = r4
            r6.d = r12
            goto L_0x0117
        L_0x009f:
            long r9 = r6.f
            int r3 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x00ae
            r0 = r28
            sa4 r0 = (defpackage.sa4) r0
            r6.b(r0)
            goto L_0x0117
        L_0x00ae:
            boolean r3 = r6.c
            if (r3 != 0) goto L_0x00f1
            long r8 = (long) r8
            r3 = r28
            sa4 r3 = (defpackage.sa4) r3
            long r13 = r3.c
            long r8 = java.lang.Math.min(r8, r13)
            int r8 = (int) r8
            long r9 = r3.o
            long r13 = (long) r2
            int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r9 == 0) goto L_0x00c8
            r1.a = r13
            goto L_0x005c
        L_0x00c8:
            r7.D(r8)
            r3.Y = r2
            byte[] r1 = r7.a
            r3.q(r1, r2, r8, r2)
            int r1 = r7.b
            int r3 = r7.c
        L_0x00d6:
            if (r1 >= r3) goto L_0x00ec
            byte[] r8 = r7.a
            byte r8 = r8[r1]
            if (r8 == r11) goto L_0x00df
            goto L_0x00e9
        L_0x00df:
            long r8 = defpackage.wmd.C(r7, r1, r0)
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 == 0) goto L_0x00e9
            r4 = r8
            goto L_0x00ec
        L_0x00e9:
            int r1 = r1 + 1
            goto L_0x00d6
        L_0x00ec:
            r6.e = r4
            r6.c = r12
            goto L_0x0117
        L_0x00f1:
            long r0 = r6.e
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x00ff
            r0 = r28
            sa4 r0 = (defpackage.sa4) r0
            r6.b(r0)
            goto L_0x0117
        L_0x00ff:
            java.lang.Object r3 = r6.h
            tue r3 = (defpackage.tue) r3
            long r0 = r3.b(r0)
            long r4 = r6.f
            long r3 = r3.c(r4)
            long r3 = r3 - r0
            r6.g = r3
            r0 = r28
            sa4 r0 = (defpackage.sa4) r0
            r6.b(r0)
        L_0x0117:
            return r2
        L_0x0118:
            boolean r3 = r0.A0
            if (r3 != 0) goto L_0x016c
            r0.A0 = r12
            long r7 = r6.g
            int r3 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x015d
            km5 r9 = new km5
            int r3 = r0.E0
            ob6 r4 = new ob6
            r4.<init>()
            f3f r5 = new f3f
            java.lang.Object r6 = r6.h
            tue r6 = (defpackage.tue) r6
            r5.<init>(r3, r6)
            r20 = 1
            long r20 = r7 + r20
            r16 = 940(0x3ac, float:1.317E-42)
            r22 = 0
            r24 = 188(0xbc, double:9.3E-322)
            r3 = r9
            r6 = r7
            r2 = r9
            r8 = r20
            r10 = r22
            r26 = r13
            r12 = r14
            r20 = r14
            r14 = r24
            r3.<init>((defpackage.km0) r4, (defpackage.nm0) r5, (long) r6, (long) r8, (long) r10, (long) r12, (long) r14, (int) r16)
            r0.w0 = r2
            pa5 r3 = r0.x0
            java.lang.Object r2 = r2.c
            hm0 r2 = (defpackage.hm0) r2
            r3.J(r2)
            goto L_0x0170
        L_0x015d:
            r26 = r13
            r20 = r14
            pa5 r2 = r0.x0
            wd0 r3 = new wd0
            r3.<init>(r7)
            r2.J(r3)
            goto L_0x0170
        L_0x016c:
            r26 = r13
            r20 = r14
        L_0x0170:
            boolean r2 = r0.B0
            if (r2 == 0) goto L_0x018a
            r2 = 0
            r0.B0 = r2
            r2 = 0
            r0.d(r2, r2)
            r4 = r28
            sa4 r4 = (defpackage.sa4) r4
            long r4 = r4.o
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x018a
            r1.a = r2
            r2 = 1
            return r2
        L_0x018a:
            r2 = 1
            km5 r3 = r0.w0
            if (r3 == 0) goto L_0x01a3
            java.lang.Object r4 = r3.e
            im0 r4 = (defpackage.im0) r4
            if (r4 == 0) goto L_0x01a3
            r0 = r28
            sa4 r0 = (defpackage.sa4) r0
            int r0 = r3.b(r0, r1)
            return r0
        L_0x019e:
            r2 = r12
            r26 = r13
            r20 = r14
        L_0x01a3:
            wpa r1 = r0.o
            byte[] r3 = r1.a
            int r4 = r1.b
            int r4 = 9400 - r4
            r5 = 188(0xbc, float:2.63E-43)
            if (r4 >= r5) goto L_0x01be
            int r4 = r1.a()
            if (r4 <= 0) goto L_0x01bb
            int r6 = r1.b
            r7 = 0
            java.lang.System.arraycopy(r3, r6, r3, r7, r4)
        L_0x01bb:
            r1.E(r4, r3)
        L_0x01be:
            int r4 = r1.a()
            android.util.SparseArray r6 = r0.s0
            if (r4 >= r5) goto L_0x020a
            int r4 = r1.c
            int r7 = 9400 - r4
            r8 = r28
            sa4 r8 = (defpackage.sa4) r8
            int r7 = r8.read(r3, r4, r7)
            r8 = -1
            if (r7 != r8) goto L_0x0205
            r0 = 0
        L_0x01d6:
            int r1 = r6.size()
            if (r0 >= r1) goto L_0x0204
            java.lang.Object r1 = r6.valueAt(r0)
            n3f r1 = (defpackage.n3f) r1
            boolean r3 = r1 instanceof defpackage.mua
            if (r3 == 0) goto L_0x0201
            mua r1 = (defpackage.mua) r1
            int r3 = r1.c
            r4 = 3
            if (r3 != r4) goto L_0x0201
            int r3 = r1.j
            if (r3 != r8) goto L_0x0201
            if (r17 == 0) goto L_0x01f9
            dw4 r3 = r1.a
            boolean r3 = r3 instanceof defpackage.kh6
            if (r3 != 0) goto L_0x0201
        L_0x01f9:
            wpa r3 = new wpa
            r3.<init>()
            r1.c(r2, r3)
        L_0x0201:
            int r0 = r0 + 1
            goto L_0x01d6
        L_0x0204:
            return r8
        L_0x0205:
            int r4 = r4 + r7
            r1.F(r4)
            goto L_0x01be
        L_0x020a:
            int r3 = r1.b
            int r4 = r1.c
            byte[] r5 = r1.a
            r7 = r3
        L_0x0211:
            if (r7 >= r4) goto L_0x021c
            byte r8 = r5[r7]
            r9 = 71
            if (r8 == r9) goto L_0x021c
            int r7 = r7 + 1
            goto L_0x0211
        L_0x021c:
            r1.G(r7)
            int r5 = r7 + 188
            r8 = 0
            if (r5 <= r4) goto L_0x023c
            int r4 = r0.D0
            int r7 = r7 - r3
            int r7 = r7 + r4
            r0.D0 = r7
            r3 = r26
            r4 = 2
            if (r3 != r4) goto L_0x0233
            r9 = 376(0x178, float:5.27E-43)
            if (r7 > r9) goto L_0x0235
        L_0x0233:
            r7 = 0
            goto L_0x0242
        L_0x0235:
            java.lang.String r0 = "Cannot find sync byte. Most likely not a Transport Stream."
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r8, r0)
            throw r0
        L_0x023c:
            r3 = r26
            r4 = 2
            r7 = 0
            r0.D0 = r7
        L_0x0242:
            int r9 = r1.c
            if (r5 <= r9) goto L_0x0247
            return r7
        L_0x0247:
            int r10 = r1.g()
            r11 = 8388608(0x800000, float:1.17549435E-38)
            r11 = r11 & r10
            if (r11 == 0) goto L_0x0254
            r1.G(r5)
            return r7
        L_0x0254:
            r7 = 4194304(0x400000, float:5.877472E-39)
            r7 = r7 & r10
            if (r7 == 0) goto L_0x025b
            r12 = r2
            goto L_0x025c
        L_0x025b:
            r12 = 0
        L_0x025c:
            r7 = 2096896(0x1fff00, float:2.938377E-39)
            r7 = r7 & r10
            int r7 = r7 >> 8
            r11 = r10 & 32
            if (r11 == 0) goto L_0x0268
            r11 = r2
            goto L_0x0269
        L_0x0268:
            r11 = 0
        L_0x0269:
            r13 = r10 & 16
            if (r13 == 0) goto L_0x0274
            java.lang.Object r6 = r6.get(r7)
            r8 = r6
            n3f r8 = (defpackage.n3f) r8
        L_0x0274:
            if (r8 != 0) goto L_0x027b
            r1.G(r5)
            r6 = 0
            return r6
        L_0x027b:
            r6 = 0
            if (r3 == r4) goto L_0x0299
            r10 = r10 & 15
            android.util.SparseIntArray r13 = r0.X
            int r14 = r10 + -1
            int r14 = r13.get(r7, r14)
            r13.put(r7, r10)
            if (r14 != r10) goto L_0x0291
            r1.G(r5)
            return r6
        L_0x0291:
            int r14 = r14 + r2
            r6 = r14 & 15
            if (r10 == r6) goto L_0x0299
            r8.a()
        L_0x0299:
            if (r11 == 0) goto L_0x02af
            int r6 = r1.u()
            int r10 = r1.u()
            r10 = r10 & 64
            if (r10 == 0) goto L_0x02a9
            r10 = r4
            goto L_0x02aa
        L_0x02a9:
            r10 = 0
        L_0x02aa:
            r12 = r12 | r10
            int r6 = r6 - r2
            r1.H(r6)
        L_0x02af:
            boolean r6 = r0.z0
            if (r3 == r4) goto L_0x02be
            if (r6 != 0) goto L_0x02be
            android.util.SparseBooleanArray r10 = r0.u0
            r11 = 0
            boolean r7 = r10.get(r7, r11)
            if (r7 != 0) goto L_0x02c7
        L_0x02be:
            r1.F(r5)
            r8.c(r12, r1)
            r1.F(r9)
        L_0x02c7:
            if (r3 == r4) goto L_0x02d5
            if (r6 != 0) goto L_0x02d5
            boolean r3 = r0.z0
            if (r3 == 0) goto L_0x02d5
            int r3 = (r20 > r18 ? 1 : (r20 == r18 ? 0 : -1))
            if (r3 == 0) goto L_0x02d5
            r0.B0 = r2
        L_0x02d5:
            r1.G(r5)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i3f.g(na5, lh4):int");
    }

    public final boolean n(na5 na5) {
        byte[] bArr = this.o.a;
        ((sa4) na5).q(bArr, 0, 940, false);
        int i = 0;
        while (i < 188) {
            int i2 = 0;
            while (i2 < 5) {
                if (bArr[(i2 * 188) + i] != 71) {
                    i++;
                } else {
                    i2++;
                }
            }
            ((sa4) na5).z(i);
            return true;
        }
        return false;
    }

    public final void release() {
    }
}
