package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* renamed from: as8  reason: default package */
public final class as8 implements zd8, xd8 {
    public final HashMap X = new HashMap();
    public xd8 Y;
    public tze Z;
    public final zd8[] a;
    public final IdentityHashMap b;
    public final oq9 c;
    public final ArrayList o = new ArrayList();
    public zd8[] s0;
    public sc3 t0;

    public as8(oq9 oq9, long[] jArr, zd8... zd8Arr) {
        this.c = oq9;
        this.a = zd8Arr;
        oq9.getClass();
        ls5 ls5 = zw6.b;
        ffc ffc = ffc.X;
        this.t0 = new sc3(ffc, ffc);
        this.b = new IdentityHashMap();
        this.s0 = new zd8[0];
        for (int i = 0; i < zd8Arr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.a[i] = new ute(zd8Arr[i], j);
            }
        }
    }

    public final boolean a() {
        return this.t0.a();
    }

    public final void e(zd8 zd8) {
        ArrayList arrayList = this.o;
        arrayList.remove(zd8);
        if (arrayList.isEmpty()) {
            zd8[] zd8Arr = this.a;
            int i = 0;
            for (zd8 q : zd8Arr) {
                i += q.q().a;
            }
            rze[] rzeArr = new rze[i];
            int i2 = 0;
            for (int i3 = 0; i3 < zd8Arr.length; i3++) {
                tze q2 = zd8Arr[i3].q();
                int i4 = q2.a;
                int i5 = 0;
                while (i5 < i4) {
                    rze a2 = q2.a(i5);
                    qy5[] qy5Arr = new qy5[a2.a];
                    for (int i6 = 0; i6 < a2.a; i6++) {
                        qy5 qy5 = a2.d[i6];
                        ny5 a3 = qy5.a();
                        StringBuilder sb = new StringBuilder();
                        sb.append(i3);
                        sb.append(":");
                        String str = qy5.a;
                        if (str == null) {
                            str = "";
                        }
                        sb.append(str);
                        a3.a = sb.toString();
                        qy5Arr[i6] = a3.a();
                    }
                    rze rze = new rze(i3 + ":" + a2.b, qy5Arr);
                    this.X.put(rze, a2);
                    rzeArr[i2] = rze;
                    i5++;
                    i2++;
                }
            }
            this.Z = new tze(rzeArr);
            xd8 xd8 = this.Y;
            xd8.getClass();
            xd8.e(this);
        }
    }

    public final long f() {
        return this.t0.f();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long g(defpackage.n85[] r23, boolean[] r24, defpackage.grc[] r25, boolean[] r26, long r27) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r25
            int r3 = r1.length
            int[] r3 = new int[r3]
            int r4 = r1.length
            int[] r4 = new int[r4]
            r5 = 0
            r6 = r5
        L_0x000e:
            int r7 = r1.length
            java.util.IdentityHashMap r8 = r0.b
            if (r6 >= r7) goto L_0x004b
            r7 = r2[r6]
            if (r7 != 0) goto L_0x0019
            r9 = 0
            goto L_0x0020
        L_0x0019:
            java.lang.Object r7 = r8.get(r7)
            r9 = r7
            java.lang.Integer r9 = (java.lang.Integer) r9
        L_0x0020:
            r7 = -1
            if (r9 != 0) goto L_0x0025
            r8 = r7
            goto L_0x0029
        L_0x0025:
            int r8 = r9.intValue()
        L_0x0029:
            r3[r6] = r8
            r8 = r1[r6]
            if (r8 == 0) goto L_0x0046
            rze r7 = r8.a()
            java.lang.String r7 = r7.b
            java.lang.String r8 = ":"
            int r8 = r7.indexOf(r8)
            java.lang.String r7 = r7.substring(r5, r8)
            int r7 = java.lang.Integer.parseInt(r7)
            r4[r6] = r7
            goto L_0x0048
        L_0x0046:
            r4[r6] = r7
        L_0x0048:
            int r6 = r6 + 1
            goto L_0x000e
        L_0x004b:
            r8.clear()
            int r6 = r1.length
            grc[] r7 = new defpackage.grc[r6]
            int r10 = r1.length
            grc[] r10 = new defpackage.grc[r10]
            int r11 = r1.length
            n85[] r15 = new defpackage.n85[r11]
            java.util.ArrayList r14 = new java.util.ArrayList
            zd8[] r13 = r0.a
            int r11 = r13.length
            r14.<init>(r11)
            r18 = r27
            r12 = r5
        L_0x0062:
            int r11 = r13.length
            if (r12 >= r11) goto L_0x0106
            r11 = r5
        L_0x0066:
            int r5 = r1.length
            if (r11 >= r5) goto L_0x00a0
            r5 = r3[r11]
            if (r5 != r12) goto L_0x0070
            r5 = r2[r11]
            goto L_0x0071
        L_0x0070:
            r5 = 0
        L_0x0071:
            r10[r11] = r5
            r5 = r4[r11]
            if (r5 != r12) goto L_0x0096
            r5 = r1[r11]
            r5.getClass()
            rze r9 = r5.a()
            r16 = r14
            java.util.HashMap r14 = r0.X
            java.lang.Object r9 = r14.get(r9)
            rze r9 = (defpackage.rze) r9
            r9.getClass()
            wr8 r14 = new wr8
            r14.<init>(r5, r9)
            r15[r11] = r14
            r5 = 0
            goto L_0x009b
        L_0x0096:
            r16 = r14
            r5 = 0
            r15[r11] = r5
        L_0x009b:
            int r11 = r11 + 1
            r14 = r16
            goto L_0x0066
        L_0x00a0:
            r16 = r14
            r5 = 0
            r11 = r13[r12]
            r9 = r12
            r12 = r15
            r20 = r13
            r13 = r24
            r5 = r16
            r14 = r10
            r21 = r15
            r15 = r26
            r16 = r18
            long r11 = r11.g(r12, r13, r14, r15, r16)
            if (r9 != 0) goto L_0x00bd
            r18 = r11
            goto L_0x00c1
        L_0x00bd:
            int r11 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r11 != 0) goto L_0x00fe
        L_0x00c1:
            r11 = 0
            r12 = 0
        L_0x00c3:
            int r13 = r1.length
            if (r11 >= r13) goto L_0x00ed
            r13 = r4[r11]
            r14 = 1
            if (r13 != r9) goto L_0x00dd
            r12 = r10[r11]
            r12.getClass()
            r13 = r10[r11]
            r7[r11] = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r9)
            r8.put(r12, r13)
            r12 = r14
            goto L_0x00ea
        L_0x00dd:
            r13 = r3[r11]
            if (r13 != r9) goto L_0x00ea
            r13 = r10[r11]
            if (r13 != 0) goto L_0x00e6
            goto L_0x00e7
        L_0x00e6:
            r14 = 0
        L_0x00e7:
            defpackage.fm9.k(r14)
        L_0x00ea:
            int r11 = r11 + 1
            goto L_0x00c3
        L_0x00ed:
            if (r12 == 0) goto L_0x00f4
            r11 = r20[r9]
            r5.add(r11)
        L_0x00f4:
            int r12 = r9 + 1
            r14 = r5
            r13 = r20
            r15 = r21
            r5 = 0
            goto L_0x0062
        L_0x00fe:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Children enabled at different positions."
            r0.<init>(r1)
            throw r0
        L_0x0106:
            r1 = r5
            r5 = r14
            java.lang.System.arraycopy(r7, r1, r2, r1, r6)
            zd8[] r1 = new defpackage.zd8[r1]
            java.lang.Object[] r1 = r5.toArray(r1)
            zd8[] r1 = (defpackage.zd8[]) r1
            r0.s0 = r1
            hj8 r1 = new hj8
            r2 = 8
            r1.<init>(r2)
            java.util.AbstractList r1 = defpackage.br7.Z(r1, r5)
            oq9 r2 = r0.c
            r2.getClass()
            sc3 r2 = new sc3
            r2.<init>(r5, r1)
            r0.t0 = r2
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.as8.g(n85[], boolean[], grc[], boolean[], long):long");
    }

    public final long h(long j, x1d x1d) {
        zd8[] zd8Arr = this.s0;
        return (zd8Arr.length > 0 ? zd8Arr[0] : this.a[0]).h(j, x1d);
    }

    public final void i(xd8 xd8, long j) {
        this.Y = xd8;
        ArrayList arrayList = this.o;
        zd8[] zd8Arr = this.a;
        Collections.addAll(arrayList, zd8Arr);
        for (zd8 i : zd8Arr) {
            i.i(this, j);
        }
    }

    public final void j(j6d j6d) {
        zd8 zd8 = (zd8) j6d;
        xd8 xd8 = this.Y;
        xd8.getClass();
        xd8.j(this);
    }

    public final void k() {
        for (zd8 k : this.a) {
            k.k();
        }
    }

    public final long l(long j) {
        long l = this.s0[0].l(j);
        int i = 1;
        while (true) {
            zd8[] zd8Arr = this.s0;
            if (i >= zd8Arr.length) {
                return l;
            }
            if (zd8Arr[i].l(l) == l) {
                i++;
            } else {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
    }

    public final long n() {
        long j = -9223372036854775807L;
        for (zd8 zd8 : this.s0) {
            long n = zd8.n();
            if (n != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    zd8[] zd8Arr = this.s0;
                    int length = zd8Arr.length;
                    int i = 0;
                    while (i < length) {
                        zd8 zd82 = zd8Arr[i];
                        if (zd82 == zd8) {
                            break;
                        } else if (zd82.l(n) == n) {
                            i++;
                        } else {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = n;
                } else if (n != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (!(j == -9223372036854775807L || zd8.l(j) == j)) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    public final boolean o(qo7 qo7) {
        ArrayList arrayList = this.o;
        if (arrayList.isEmpty()) {
            return this.t0.o(qo7);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zd8) arrayList.get(i)).o(qo7);
        }
        return false;
    }

    public final tze q() {
        tze tze = this.Z;
        tze.getClass();
        return tze;
    }

    public final long r() {
        return this.t0.r();
    }

    public final void s(long j, boolean z) {
        for (zd8 s : this.s0) {
            s.s(j, z);
        }
    }

    public final void t(long j) {
        this.t0.t(j);
    }
}
