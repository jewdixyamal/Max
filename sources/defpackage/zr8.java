package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* renamed from: zr8  reason: default package */
public final class zr8 implements yd8, wd8 {
    public final HashMap X = new HashMap();
    public wd8 Y;
    public sze Z;
    public final yd8[] a;
    public final IdentityHashMap b;
    public final mq9 c;
    public final ArrayList o = new ArrayList();
    public yd8[] s0;
    public rxd t0;

    public zr8(mq9 mq9, long[] jArr, yd8... yd8Arr) {
        this.c = mq9;
        this.a = yd8Arr;
        mq9.getClass();
        this.t0 = new rxd(10, new i6d[0]);
        this.b = new IdentityHashMap();
        this.s0 = new yd8[0];
        for (int i = 0; i < yd8Arr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.a[i] = new xr8(yd8Arr[i], j);
            }
        }
    }

    public final long A(long j, w1d w1d) {
        yd8[] yd8Arr = this.s0;
        return (yd8Arr.length > 0 ? yd8Arr[0] : this.a[0]).A(j, w1d);
    }

    public final boolean C(long j) {
        ArrayList arrayList = this.o;
        if (arrayList.isEmpty()) {
            return this.t0.C(j);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((yd8) arrayList.get(i)).C(j);
        }
        return false;
    }

    public final void J(wd8 wd8, long j) {
        this.Y = wd8;
        ArrayList arrayList = this.o;
        yd8[] yd8Arr = this.a;
        Collections.addAll(arrayList, yd8Arr);
        for (yd8 J : yd8Arr) {
            J.J(this, j);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long L(defpackage.m85[] r25, boolean[] r26, defpackage.frc[] r27, boolean[] r28, long r29) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r27
            int r3 = r1.length
            int[] r3 = new int[r3]
            int r4 = r1.length
            int[] r4 = new int[r4]
            r6 = 0
        L_0x000d:
            int r7 = r1.length
            java.util.HashMap r8 = r0.X
            java.util.IdentityHashMap r9 = r0.b
            yd8[] r11 = r0.a
            if (r6 >= r7) goto L_0x005a
            r7 = r2[r6]
            if (r7 != 0) goto L_0x001c
            r10 = 0
            goto L_0x0023
        L_0x001c:
            java.lang.Object r7 = r9.get(r7)
            r10 = r7
            java.lang.Integer r10 = (java.lang.Integer) r10
        L_0x0023:
            r7 = -1
            if (r10 != 0) goto L_0x0028
            r9 = r7
            goto L_0x002c
        L_0x0028:
            int r9 = r10.intValue()
        L_0x002c:
            r3[r6] = r9
            r4[r6] = r7
            r9 = r1[r6]
            if (r9 == 0) goto L_0x0057
            qze r9 = r9.a()
            java.lang.Object r8 = r8.get(r9)
            qze r8 = (defpackage.qze) r8
            r8.getClass()
            r9 = 0
        L_0x0042:
            int r10 = r11.length
            if (r9 >= r10) goto L_0x0057
            r10 = r11[r9]
            sze r10 = r10.q()
            int r10 = r10.b(r8)
            if (r10 == r7) goto L_0x0054
            r4[r6] = r9
            goto L_0x0057
        L_0x0054:
            int r9 = r9 + 1
            goto L_0x0042
        L_0x0057:
            int r6 = r6 + 1
            goto L_0x000d
        L_0x005a:
            r9.clear()
            int r6 = r1.length
            frc[] r7 = new defpackage.frc[r6]
            int r12 = r1.length
            frc[] r12 = new defpackage.frc[r12]
            int r13 = r1.length
            m85[] r15 = new defpackage.m85[r13]
            java.util.ArrayList r14 = new java.util.ArrayList
            int r13 = r11.length
            r14.<init>(r13)
            r20 = r29
            r13 = 0
        L_0x006f:
            int r5 = r11.length
            if (r13 >= r5) goto L_0x011b
            r5 = 0
        L_0x0073:
            int r10 = r1.length
            if (r5 >= r10) goto L_0x00b1
            r10 = r3[r5]
            if (r10 != r13) goto L_0x007d
            r10 = r2[r5]
            goto L_0x007e
        L_0x007d:
            r10 = 0
        L_0x007e:
            r12[r5] = r10
            r10 = r4[r5]
            if (r10 != r13) goto L_0x00a3
            r10 = r1[r5]
            r10.getClass()
            r16 = r14
            qze r14 = r10.a()
            java.lang.Object r14 = r8.get(r14)
            qze r14 = (defpackage.qze) r14
            r14.getClass()
            r23 = r8
            vr8 r8 = new vr8
            r8.<init>(r10, r14)
            r15[r5] = r8
            r8 = 0
            goto L_0x00aa
        L_0x00a3:
            r23 = r8
            r16 = r14
            r8 = 0
            r15[r5] = r8
        L_0x00aa:
            int r5 = r5 + 1
            r14 = r16
            r8 = r23
            goto L_0x0073
        L_0x00b1:
            r23 = r8
            r16 = r14
            r8 = 0
            r5 = r11[r13]
            r10 = r13
            r13 = r5
            r5 = r16
            r14 = r15
            r22 = r15
            r15 = r26
            r16 = r12
            r17 = r28
            r18 = r20
            long r13 = r13.L(r14, r15, r16, r17, r18)
            if (r10 != 0) goto L_0x00d0
            r20 = r13
            goto L_0x00d4
        L_0x00d0:
            int r13 = (r13 > r20 ? 1 : (r13 == r20 ? 0 : -1))
            if (r13 != 0) goto L_0x0113
        L_0x00d4:
            r13 = 0
            r14 = 0
        L_0x00d6:
            int r15 = r1.length
            if (r13 >= r15) goto L_0x0103
            r15 = r4[r13]
            r16 = 1
            if (r15 != r10) goto L_0x00f2
            r14 = r12[r13]
            r14.getClass()
            r15 = r12[r13]
            r7[r13] = r15
            java.lang.Integer r15 = java.lang.Integer.valueOf(r10)
            r9.put(r14, r15)
            r14 = r16
            goto L_0x0100
        L_0x00f2:
            r15 = r3[r13]
            if (r15 != r10) goto L_0x0100
            r15 = r12[r13]
            if (r15 != 0) goto L_0x00fb
            goto L_0x00fd
        L_0x00fb:
            r16 = 0
        L_0x00fd:
            defpackage.np8.f(r16)
        L_0x0100:
            int r13 = r13 + 1
            goto L_0x00d6
        L_0x0103:
            if (r14 == 0) goto L_0x010a
            r13 = r11[r10]
            r5.add(r13)
        L_0x010a:
            int r13 = r10 + 1
            r14 = r5
            r15 = r22
            r8 = r23
            goto L_0x006f
        L_0x0113:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Children enabled at different positions."
            r0.<init>(r1)
            throw r0
        L_0x011b:
            r5 = r14
            r1 = 0
            java.lang.System.arraycopy(r7, r1, r2, r1, r6)
            yd8[] r1 = new defpackage.yd8[r1]
            java.lang.Object[] r1 = r5.toArray(r1)
            yd8[] r1 = (defpackage.yd8[]) r1
            r0.s0 = r1
            mq9 r2 = r0.c
            r2.getClass()
            rxd r2 = new rxd
            r3 = 10
            r2.<init>(r3, r1)
            r0.t0 = r2
            return r20
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zr8.L(m85[], boolean[], frc[], boolean[], long):long");
    }

    public final boolean a() {
        return this.t0.a();
    }

    public final void c(i6d i6d) {
        yd8 yd8 = (yd8) i6d;
        wd8 wd8 = this.Y;
        wd8.getClass();
        wd8.c(this);
    }

    public final void d(yd8 yd8) {
        ArrayList arrayList = this.o;
        arrayList.remove(yd8);
        if (arrayList.isEmpty()) {
            yd8[] yd8Arr = this.a;
            int i = 0;
            for (yd8 q : yd8Arr) {
                i += q.q().a;
            }
            qze[] qzeArr = new qze[i];
            int i2 = 0;
            for (int i3 = 0; i3 < yd8Arr.length; i3++) {
                sze q2 = yd8Arr[i3].q();
                int i4 = q2.a;
                int i5 = 0;
                while (i5 < i4) {
                    qze a2 = q2.a(i5);
                    String str = a2.b;
                    StringBuilder sb = new StringBuilder(rh4.e(12, str));
                    sb.append(i3);
                    sb.append(":");
                    sb.append(str);
                    qze qze = new qze(sb.toString(), a2.c);
                    this.X.put(qze, a2);
                    qzeArr[i2] = qze;
                    i5++;
                    i2++;
                }
            }
            this.Z = new sze(qzeArr);
            wd8 wd8 = this.Y;
            wd8.getClass();
            wd8.d(this);
        }
    }

    public final long f() {
        return this.t0.f();
    }

    public final void k() {
        for (yd8 k : this.a) {
            k.k();
        }
    }

    public final long l(long j) {
        long l = this.s0[0].l(j);
        int i = 1;
        while (true) {
            yd8[] yd8Arr = this.s0;
            if (i >= yd8Arr.length) {
                return l;
            }
            if (yd8Arr[i].l(l) == l) {
                i++;
            } else {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
    }

    public final long n() {
        long j = -9223372036854775807L;
        for (yd8 yd8 : this.s0) {
            long n = yd8.n();
            if (n != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    yd8[] yd8Arr = this.s0;
                    int length = yd8Arr.length;
                    int i = 0;
                    while (i < length) {
                        yd8 yd82 = yd8Arr[i];
                        if (yd82 == yd8) {
                            break;
                        } else if (yd82.l(n) == n) {
                            i++;
                        } else {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = n;
                } else if (n != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (!(j == -9223372036854775807L || yd8.l(j) == j)) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    public final sze q() {
        sze sze = this.Z;
        sze.getClass();
        return sze;
    }

    public final long r() {
        return this.t0.r();
    }

    public final void s(long j, boolean z) {
        for (yd8 s : this.s0) {
            s.s(j, z);
        }
    }

    public final void t(long j) {
        this.t0.t(j);
    }
}
