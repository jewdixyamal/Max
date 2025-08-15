package defpackage;

import com.google.android.exoplayer2.source.BehindLiveWindowException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: s13  reason: default package */
public final class s13 implements frc, i6d, co7, ho7 {
    public h13 A0;
    public oy5 B0;
    public q13 C0;
    public long D0;
    public long E0;
    public int F0;
    public yi0 G0;
    public boolean H0;
    public final f94 X;
    public final g6d Y;
    public final gk8 Z;
    public final int a;
    public final int[] b;
    public final oy5[] c;
    public final boolean[] o;
    public final buc s0;
    public final jo7 t0 = new jo7("ChunkSampleStream", 0);
    public final ar0 u0 = new Object();
    public final ArrayList v0;
    public final List w0;
    public final drc x0;
    public final drc[] y0;
    public final ph4 z0;

    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Object, ar0] */
    public s13(int i, int[] iArr, oy5[] oy5Arr, f94 f94, g6d g6d, n64 n64, long j, sr4 sr4, kr4 kr4, buc buc, gk8 gk8) {
        this.a = i;
        this.b = iArr;
        this.c = oy5Arr;
        this.X = f94;
        this.Y = g6d;
        this.Z = gk8;
        this.s0 = buc;
        ArrayList arrayList = new ArrayList();
        this.v0 = arrayList;
        this.w0 = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.y0 = new drc[length];
        this.o = new boolean[length];
        int i2 = length + 1;
        int[] iArr2 = new int[i2];
        drc[] drcArr = new drc[i2];
        sr4.getClass();
        drc drc = new drc(n64, sr4, kr4);
        this.x0 = drc;
        int i3 = 0;
        iArr2[0] = i;
        drcArr[0] = drc;
        while (i3 < length) {
            drc drc2 = new drc(n64, (sr4) null, (kr4) null);
            this.y0[i3] = drc2;
            int i4 = i3 + 1;
            drcArr[i4] = drc2;
            iArr2[i4] = this.b[i3];
            i3 = i4;
        }
        this.z0 = new ph4((Object) iArr2, (Object) drcArr);
        this.D0 = j;
        this.E0 = j;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v0, resolved type: qs3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v35, resolved type: lrd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v36, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v2, resolved type: lrd} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x03fc  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0409  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean C(long r60) {
        /*
            r59 = this;
            r0 = r59
            boolean r1 = r0.H0
            if (r1 != 0) goto L_0x0014
            jo7 r11 = r0.t0
            boolean r1 = r11.o()
            if (r1 != 0) goto L_0x0014
            boolean r1 = r11.n()
            if (r1 == 0) goto L_0x0017
        L_0x0014:
            r0 = 0
            goto L_0x0499
        L_0x0017:
            boolean r12 = r59.m()
            if (r12 == 0) goto L_0x0026
            java.util.List r1 = java.util.Collections.emptyList()
            long r2 = r0.D0
        L_0x0023:
            r13 = r1
            r14 = r2
            goto L_0x002f
        L_0x0026:
            yi0 r1 = r59.i()
            long r2 = r1.s0
            java.util.List r1 = r0.w0
            goto L_0x0023
        L_0x002f:
            f94 r9 = r0.X
            com.google.android.exoplayer2.source.BehindLiveWindowException r1 = r9.l
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            ar0 r5 = r0.u0
            if (r1 == 0) goto L_0x0043
        L_0x003c:
            r0 = r5
            r26 = r11
            r23 = r12
            goto L_0x03ee
        L_0x0043:
            long r16 = r14 - r60
            h14 r1 = r9.j
            long r1 = r1.a
            long r1 = defpackage.maf.D(r1)
            h14 r3 = r9.j
            int r4 = r9.k
            jta r3 = r3.b(r4)
            long r3 = r3.b
            long r3 = defpackage.maf.D(r3)
            long r3 = r3 + r1
            long r3 = r3 + r14
            c4b r1 = r9.g
            if (r1 == 0) goto L_0x00d7
            e4b r1 = r1.e
            java.lang.Object r2 = r1.u0
            h14 r2 = (defpackage.h14) r2
            boolean r10 = r2.d
            if (r10 != 0) goto L_0x006f
            r20 = r9
            r2 = 0
            goto L_0x00d1
        L_0x006f:
            boolean r10 = r1.X
            if (r10 == 0) goto L_0x0077
            r20 = r9
            r2 = 1
            goto L_0x00d1
        L_0x0077:
            java.util.TreeMap r10 = r1.c
            r20 = r9
            long r8 = r2.h
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            java.util.Map$Entry r2 = r10.ceilingEntry(r2)
            java.lang.Object r8 = r1.s0
            wmc r8 = (defpackage.wmc) r8
            if (r2 == 0) goto L_0x00b5
            java.lang.Object r9 = r2.getValue()
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            int r3 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x00b5
            java.lang.Object r2 = r2.getKey()
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            java.lang.Object r4 = r8.a
            x14 r4 = (defpackage.x14) r4
            long r9 = r4.N
            int r22 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r22 == 0) goto L_0x00b1
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r9 >= 0) goto L_0x00b3
        L_0x00b1:
            r4.N = r2
        L_0x00b3:
            r2 = 1
            goto L_0x00b6
        L_0x00b5:
            r2 = 0
        L_0x00b6:
            if (r2 == 0) goto L_0x00d1
            boolean r3 = r1.o
            if (r3 != 0) goto L_0x00bd
            goto L_0x00d1
        L_0x00bd:
            r3 = 1
            r1.X = r3
            r3 = 0
            r1.o = r3
            java.lang.Object r1 = r8.a
            x14 r1 = (defpackage.x14) r1
            android.os.Handler r3 = r1.D
            r14 r4 = r1.w
            r3.removeCallbacks(r4)
            r1.t()
        L_0x00d1:
            if (r2 == 0) goto L_0x00d5
            goto L_0x003c
        L_0x00d5:
            r9 = r20
        L_0x00d7:
            long r1 = r9.f
            long r1 = defpackage.maf.t(r1)
            long r2 = defpackage.maf.D(r1)
            h14 r1 = r9.j
            r8 = r5
            long r4 = r1.a
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x00ed
            r24 = r6
            goto L_0x00fe
        L_0x00ed:
            int r10 = r9.k
            jta r1 = r1.b(r10)
            long r6 = r1.b
            long r4 = r4 + r6
            long r4 = defpackage.maf.D(r4)
            long r4 = r2 - r4
            r24 = r4
        L_0x00fe:
            boolean r1 = r13.isEmpty()
            if (r1 == 0) goto L_0x0108
            r10 = 1
            r20 = 0
            goto L_0x0116
        L_0x0108:
            int r1 = r13.size()
            r10 = 1
            int r1 = r1 - r10
            java.lang.Object r1 = r13.get(r1)
            f78 r1 = (defpackage.f78) r1
            r20 = r1
        L_0x0116:
            m85 r1 = r9.i
            int r1 = r1.length()
            h78[] r6 = new defpackage.h78[r1]
            r4 = 0
        L_0x011f:
            c94[] r5 = r9.h
            if (r4 >= r1) goto L_0x0180
            r5 = r5[r4]
            java.lang.Object r7 = r5.g
            z14 r7 = (defpackage.z14) r7
            sp3 r21 = defpackage.h78.O
            if (r7 != 0) goto L_0x0134
            r6[r4] = r21
            r30 = r8
            r26 = r11
            goto L_0x0178
        L_0x0134:
            r26 = r11
            long r10 = r5.b
            long r28 = r7.k(r10, r2)
            r30 = r8
            long r7 = r5.c
            long r28 = r28 + r7
            long r37 = r5.d(r2)
            if (r20 == 0) goto L_0x014f
            long r7 = r20.b()
        L_0x014c:
            r33 = r7
            goto L_0x0162
        L_0x014f:
            java.lang.Object r5 = r5.g
            z14 r5 = (defpackage.z14) r5
            long r10 = r5.v(r14, r10)
            long r31 = r10 + r7
            r33 = r28
            r35 = r37
            long r7 = defpackage.maf.k(r31, r33, r35)
            goto L_0x014c
        L_0x0162:
            int r5 = (r33 > r28 ? 1 : (r33 == r28 ? 0 : -1))
            if (r5 >= 0) goto L_0x0169
            r6[r4] = r21
            goto L_0x0178
        L_0x0169:
            c94 r32 = r9.b(r4)
            d94 r5 = new d94
            r31 = r5
            r35 = r37
            r31.<init>(r32, r33, r35)
            r6[r4] = r5
        L_0x0178:
            int r4 = r4 + 1
            r11 = r26
            r8 = r30
            r10 = 1
            goto L_0x011f
        L_0x0180:
            r30 = r8
            r26 = r11
            h14 r1 = r9.j
            boolean r1 = r1.d
            if (r1 != 0) goto L_0x0195
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r21 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x01ce
        L_0x0195:
            r1 = 0
            r4 = r5[r1]
            long r7 = r4.d(r2)
            r4 = r5[r1]
            long r4 = r4.f(r7)
            h14 r1 = r9.j
            long r7 = r1.a
            r21 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r23 = (r7 > r21 ? 1 : (r7 == r21 ? 0 : -1))
            if (r23 != 0) goto L_0x01b2
            r7 = r21
            goto L_0x01c1
        L_0x01b2:
            int r10 = r9.k
            jta r1 = r1.b(r10)
            long r10 = r1.b
            long r7 = r7 + r10
            long r7 = defpackage.maf.D(r7)
            long r7 = r2 - r7
        L_0x01c1:
            long r4 = java.lang.Math.min(r7, r4)
            long r4 = r4 - r60
            r7 = 0
            long r4 = java.lang.Math.max(r7, r4)
            r7 = r4
        L_0x01ce:
            m85 r1 = r9.i
            r10 = r2
            r2 = r60
            r23 = r12
            r12 = r30
            r4 = r16
            r16 = r14
            r14 = r21
            r21 = r6
            r6 = r7
            r8 = r13
            r14 = r9
            r9 = r21
            r1.t(r2, r4, r6, r8, r9)
            m85 r1 = r14.i
            int r1 = r1.b()
            c94 r1 = r14.b(r1)
            java.lang.Object r2 = r1.g
            z14 r2 = (defpackage.z14) r2
            java.lang.Object r3 = r1.f
            lk0 r3 = (defpackage.lk0) r3
            java.lang.Object r4 = r1.d
            wu0 r4 = (defpackage.wu0) r4
            java.lang.Object r5 = r1.e
            khc r5 = (defpackage.khc) r5
            if (r4 == 0) goto L_0x0254
            oy5[] r6 = r4.t0
            if (r6 != 0) goto L_0x020a
            q4c r6 = r5.X
            goto L_0x020b
        L_0x020a:
            r6 = 0
        L_0x020b:
            if (r2 != 0) goto L_0x0212
            q4c r7 = r5.d()
            goto L_0x0213
        L_0x0212:
            r7 = 0
        L_0x0213:
            if (r6 != 0) goto L_0x0217
            if (r7 == 0) goto L_0x0254
        L_0x0217:
            m85 r2 = r14.i
            oy5 r30 = r2.j()
            m85 r2 = r14.i
            int r31 = r2.k()
            m85 r2 = r14.i
            java.lang.Object r32 = r2.m()
            if (r6 == 0) goto L_0x0236
            java.lang.String r2 = r3.a
            q4c r2 = r6.a(r7, r2)
            if (r2 != 0) goto L_0x0234
            goto L_0x0237
        L_0x0234:
            r6 = r2
            goto L_0x0237
        L_0x0236:
            r6 = r7
        L_0x0237:
            java.lang.String r2 = r3.a
            r3 = 0
            z24 r29 = defpackage.kp.f(r5, r2, r6, r3)
            t07 r2 = new t07
            java.lang.Object r1 = r1.d
            r33 = r1
            wu0 r33 = (defpackage.wu0) r33
            r24 r1 = r14.e
            r27 = r2
            r28 = r1
            r27.<init>(r28, r29, r30, r31, r32, r33)
            r12.b = r2
        L_0x0251:
            r0 = r12
            goto L_0x03ee
        L_0x0254:
            long r6 = r1.b
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r15 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r15 == 0) goto L_0x0261
            r8 = 1
            goto L_0x0262
        L_0x0261:
            r8 = 0
        L_0x0262:
            long r21 = r2.D(r6)
            r27 = 0
            int r9 = (r21 > r27 ? 1 : (r21 == r27 ? 0 : -1))
            if (r9 != 0) goto L_0x026f
            r12.a = r8
            goto L_0x0251
        L_0x026f:
            long r21 = r2.k(r6, r10)
            r27 = r3
            r9 = r4
            long r3 = r1.c
            long r21 = r21 + r3
            long r10 = r1.d(r10)
            if (r20 == 0) goto L_0x028b
            long r28 = r20.b()
            r20 = r12
            r34 = r13
        L_0x0288:
            r12 = r28
            goto L_0x02a2
        L_0x028b:
            r20 = r12
            r34 = r13
            r12 = r16
            long r16 = r2.v(r12, r6)
            long r28 = r16 + r3
            r30 = r21
            r32 = r10
            long r28 = defpackage.maf.k(r28, r30, r32)
            r16 = r12
            goto L_0x0288
        L_0x02a2:
            int r21 = (r12 > r21 ? 1 : (r12 == r21 ? 0 : -1))
            if (r21 >= 0) goto L_0x02b1
            com.google.android.exoplayer2.source.BehindLiveWindowException r1 = new com.google.android.exoplayer2.source.BehindLiveWindowException
            r1.<init>()
            r14.l = r1
            r0 = r20
            goto L_0x03ee
        L_0x02b1:
            int r21 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r21 > 0) goto L_0x02bb
            boolean r0 = r14.m
            if (r0 == 0) goto L_0x02bf
            if (r21 < 0) goto L_0x02bf
        L_0x02bb:
            r0 = r20
            goto L_0x03ec
        L_0x02bf:
            if (r8 == 0) goto L_0x02d1
            long r21 = r1.g(r12)
            int r0 = (r21 > r6 ? 1 : (r21 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x02d1
            r8 = r20
            r0 = 1
            r8.a = r0
            r0 = r8
            goto L_0x03ee
        L_0x02d1:
            r0 = 1
            r30 = r20
            r20 = r9
            long r8 = (long) r0
            long r10 = r10 - r12
            r21 = 1
            long r10 = r10 + r21
            long r8 = java.lang.Math.min(r8, r10)
            int r8 = (int) r8
            if (r15 == 0) goto L_0x02f4
        L_0x02e3:
            if (r8 <= r0) goto L_0x02f4
            long r9 = (long) r8
            long r9 = r9 + r12
            long r9 = r9 - r21
            long r9 = r1.g(r9)
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 < 0) goto L_0x02f4
            int r8 = r8 + -1
            goto L_0x02e3
        L_0x02f4:
            boolean r9 = r34.isEmpty()
            if (r9 == 0) goto L_0x02fd
            r49 = r16
            goto L_0x0302
        L_0x02fd:
            r49 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0302:
            m85 r9 = r14.i
            oy5 r9 = r9.j()
            m85 r10 = r14.i
            int r43 = r10.k()
            m85 r10 = r14.i
            java.lang.Object r44 = r10.m()
            long r45 = r1.g(r12)
            long r10 = r12 - r3
            q4c r10 = r2.n(r10)
            r24 r11 = r14.e
            r16 = 8
            if (r20 != 0) goto L_0x036a
            long r47 = r1.f(r12)
            boolean r2 = r2.A()
            if (r2 == 0) goto L_0x0330
        L_0x032e:
            r8 = r0
            goto L_0x0343
        L_0x0330:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r24 > r2 ? 1 : (r24 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x032e
            long r1 = r1.f(r12)
            int r1 = (r1 > r24 ? 1 : (r1 == r24 ? 0 : -1))
            if (r1 > 0) goto L_0x0342
            goto L_0x032e
        L_0x0342:
            r8 = 0
        L_0x0343:
            if (r8 == 0) goto L_0x0349
            r2 = r27
            r1 = 0
            goto L_0x034d
        L_0x0349:
            r1 = r16
            r2 = r27
        L_0x034d:
            java.lang.String r2 = r2.a
            z24 r41 = defpackage.kp.f(r5, r2, r10, r1)
            lrd r1 = new lrd
            int r2 = r14.d
            r39 = r1
            r40 = r11
            r42 = r9
            r49 = r12
            r51 = r2
            r52 = r9
            r39.<init>(r40, r41, r42, r43, r44, r45, r47, r49, r51, r52)
        L_0x0366:
            r0 = r30
            goto L_0x03e9
        L_0x036a:
            r14 = r27
            r17 = r9
            r9 = r0
            r0 = r10
            r10 = r9
        L_0x0371:
            r27 = r6
            r7 = r5
            if (r10 >= r8) goto L_0x038f
            long r5 = (long) r10
            long r5 = r5 + r12
            long r5 = r5 - r3
            q4c r5 = r2.n(r5)
            java.lang.String r6 = r14.a
            q4c r5 = r0.a(r5, r6)
            if (r5 != 0) goto L_0x0386
            goto L_0x038f
        L_0x0386:
            int r9 = r9 + 1
            int r10 = r10 + 1
            r0 = r5
            r5 = r7
            r6 = r27
            goto L_0x0371
        L_0x038f:
            long r3 = (long) r9
            long r3 = r3 + r12
            long r3 = r3 - r21
            long r47 = r1.f(r3)
            if (r15 == 0) goto L_0x03a0
            int r5 = (r27 > r47 ? 1 : (r27 == r47 ? 0 : -1))
            if (r5 > 0) goto L_0x03a0
            r51 = r27
            goto L_0x03a5
        L_0x03a0:
            r51 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x03a5:
            boolean r2 = r2.A()
            if (r2 == 0) goto L_0x03ad
        L_0x03ab:
            r8 = 1
            goto L_0x03c0
        L_0x03ad:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r24 > r5 ? 1 : (r24 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x03ab
            long r2 = r1.f(r3)
            int r2 = (r2 > r24 ? 1 : (r2 == r24 ? 0 : -1))
            if (r2 > 0) goto L_0x03bf
            goto L_0x03ab
        L_0x03bf:
            r8 = 0
        L_0x03c0:
            if (r8 == 0) goto L_0x03c4
            r2 = 0
            goto L_0x03c6
        L_0x03c4:
            r2 = r16
        L_0x03c6:
            java.lang.String r3 = r14.a
            z24 r41 = defpackage.kp.f(r7, r3, r0, r2)
            long r2 = r7.c
            long r2 = -r2
            r56 = r2
            qs3 r0 = new qs3
            r39 = r0
            java.lang.Object r1 = r1.d
            r58 = r1
            wu0 r58 = (defpackage.wu0) r58
            r40 = r11
            r42 = r17
            r53 = r12
            r55 = r9
            r39.<init>(r40, r41, r42, r43, r44, r45, r47, r49, r51, r53, r55, r56, r58)
            r1 = r0
            goto L_0x0366
        L_0x03e9:
            r0.b = r1
            goto L_0x03ee
        L_0x03ec:
            r0.a = r8
        L_0x03ee:
            boolean r1 = r0.a
            java.lang.Object r2 = r0.b
            h13 r2 = (defpackage.h13) r2
            r3 = 0
            r0.b = r3
            r3 = 0
            r0.a = r3
            if (r1 == 0) goto L_0x0409
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r59
            r0.D0 = r4
            r1 = 1
            r0.H0 = r1
            return r1
        L_0x0409:
            r0 = r59
            if (r2 != 0) goto L_0x040e
            return r3
        L_0x040e:
            r0.A0 = r2
            boolean r1 = r2 instanceof defpackage.yi0
            ph4 r3 = r0.z0
            if (r1 == 0) goto L_0x045e
            r1 = r2
            yi0 r1 = (defpackage.yi0) r1
            if (r23 == 0) goto L_0x043d
            long r4 = r0.D0
            long r6 = r1.Z
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0436
            drc r6 = r0.x0
            r6.t = r4
            drc[] r4 = r0.y0
            int r5 = r4.length
            r6 = 0
        L_0x042b:
            if (r6 >= r5) goto L_0x0436
            r7 = r4[r6]
            long r8 = r0.D0
            r7.t = r8
            int r6 = r6 + 1
            goto L_0x042b
        L_0x0436:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.D0 = r4
        L_0x043d:
            r1.x0 = r3
            java.lang.Object r3 = r3.b
            drc[] r3 = (defpackage.drc[]) r3
            int r4 = r3.length
            int[] r4 = new int[r4]
            r10 = 0
        L_0x0447:
            int r5 = r3.length
            if (r10 >= r5) goto L_0x0456
            r5 = r3[r10]
            int r6 = r5.q
            int r5 = r5.p
            int r6 = r6 + r5
            r4[r10] = r6
            int r10 = r10 + 1
            goto L_0x0447
        L_0x0456:
            r1.y0 = r4
            java.util.ArrayList r3 = r0.v0
            r3.add(r1)
            goto L_0x0467
        L_0x045e:
            boolean r1 = r2 instanceof defpackage.t07
            if (r1 == 0) goto L_0x0467
            r1 = r2
            t07 r1 = (defpackage.t07) r1
            r1.v0 = r3
        L_0x0467:
            buc r1 = r0.s0
            int r3 = r2.c
            int r1 = r1.v(r3)
            r3 = r26
            long r8 = r3.w(r2, r0, r1)
            xn7 r11 = new xn7
            long r5 = r2.a
            z24 r7 = r2.b
            r4 = r11
            r4.<init>(r5, r7, r8)
            int r15 = r2.X
            java.lang.Object r1 = r2.Y
            gk8 r10 = r0.Z
            int r12 = r2.c
            int r13 = r0.a
            oy5 r14 = r2.o
            long r3 = r2.Z
            long r5 = r2.s0
            r16 = r1
            r17 = r3
            r19 = r5
            r10.k(r11, r12, r13, r14, r15, r16, r17, r19)
            r0 = 1
        L_0x0499:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s13.C(long):boolean");
    }

    public final boolean a() {
        return this.t0.o();
    }

    public final void b() {
        drc drc = this.x0;
        drc.z(true);
        er4 er4 = drc.h;
        if (er4 != null) {
            er4.f(drc.e);
            drc.h = null;
            drc.g = null;
        }
        for (drc drc2 : this.y0) {
            drc2.z(true);
            er4 er42 = drc2.h;
            if (er42 != null) {
                er42.f(drc2.e);
                drc2.h = null;
                drc2.g = null;
            }
        }
        for (c94 c94 : this.X.h) {
            wu0 wu0 = (wu0) c94.d;
            if (wu0 != null) {
                wu0.c();
            }
        }
        q13 q13 = this.C0;
        if (q13 != null) {
            p14 p14 = (p14) q13;
            synchronized (p14) {
                c4b c4b = (c4b) p14.y0.remove(this);
                if (c4b != null) {
                    drc drc3 = c4b.a;
                    drc3.z(true);
                    er4 er43 = drc3.h;
                    if (er43 != null) {
                        er43.f(drc3.e);
                        drc3.h = null;
                        drc3.g = null;
                    }
                }
            }
        }
    }

    public final void c() {
        jo7 jo7 = this.t0;
        jo7.c();
        this.x0.v();
        if (!jo7.o()) {
            f94 f94 = this.X;
            BehindLiveWindowException behindLiveWindowException = f94.l;
            if (behindLiveWindowException == null) {
                f94.a.c();
                return;
            }
            throw behindLiveWindowException;
        }
    }

    public final boolean d() {
        return !m() && this.x0.t(this.H0);
    }

    public final int e(long j) {
        if (m()) {
            return 0;
        }
        drc drc = this.x0;
        int q = drc.q(j, this.H0);
        yi0 yi0 = this.G0;
        if (yi0 != null) {
            q = Math.min(q, yi0.d(0) - drc.o());
        }
        drc.B(q);
        p();
        return q;
    }

    public final long f() {
        if (m()) {
            return this.D0;
        }
        if (this.H0) {
            return Long.MIN_VALUE;
        }
        return i().s0;
    }

    public final int g(imc imc, o54 o54, int i) {
        if (m()) {
            return -3;
        }
        yi0 yi0 = this.G0;
        drc drc = this.x0;
        if (yi0 != null && yi0.d(0) <= drc.o()) {
            return -3;
        }
        p();
        return drc.y(imc, o54, i, this.H0);
    }

    public final yi0 h(int i) {
        ArrayList arrayList = this.v0;
        yi0 yi0 = (yi0) arrayList.get(i);
        maf.I(arrayList, i, arrayList.size());
        this.F0 = Math.max(this.F0, arrayList.size());
        int i2 = 0;
        this.x0.k(yi0.d(0));
        while (true) {
            drc[] drcArr = this.y0;
            if (i2 >= drcArr.length) {
                return yi0;
            }
            drc drc = drcArr[i2];
            i2++;
            drc.k(yi0.d(i2));
        }
    }

    public final yi0 i() {
        return (yi0) wg0.f(this.v0, 1);
    }

    public final boolean j(int i) {
        int o2;
        yi0 yi0 = (yi0) this.v0.get(i);
        if (this.x0.o() > yi0.d(0)) {
            return true;
        }
        int i2 = 0;
        do {
            drc[] drcArr = this.y0;
            if (i2 >= drcArr.length) {
                return false;
            }
            o2 = drcArr[i2].o();
            i2++;
        } while (o2 <= yi0.d(i2));
        return true;
    }

    public final boolean m() {
        return this.D0 != -9223372036854775807L;
    }

    public final void o(fo7 fo7, long j, long j2, boolean z) {
        h13 h13 = (h13) fo7;
        this.A0 = null;
        this.G0 = null;
        long j3 = h13.a;
        t1e t1e = h13.t0;
        xn7 xn7 = new xn7(j3, h13.b, t1e.c, t1e.o, j, j2, t1e.b);
        this.s0.getClass();
        this.Z.d(xn7, h13.c, this.a, h13.o, h13.X, h13.Y, h13.Z, h13.s0);
        if (!z) {
            if (m()) {
                this.x0.z(false);
                for (drc z2 : this.y0) {
                    z2.z(false);
                }
            } else if (h13 instanceof yi0) {
                ArrayList arrayList = this.v0;
                h(arrayList.size() - 1);
                if (arrayList.isEmpty()) {
                    this.D0 = this.E0;
                }
            }
            this.Y.c(this);
        }
    }

    public final void p() {
        int u = u(this.x0.o(), this.F0 - 1);
        while (true) {
            int i = this.F0;
            if (i <= u) {
                this.F0 = i + 1;
                yi0 yi0 = (yi0) this.v0.get(i);
                oy5 oy5 = yi0.o;
                if (!oy5.equals(this.B0)) {
                    oy5 oy52 = oy5;
                    this.Z.b(this.a, oy52, yi0.X, yi0.Y, yi0.Z);
                }
                this.B0 = oy5;
            } else {
                return;
            }
        }
    }

    public final long r() {
        long j;
        if (this.H0) {
            return Long.MIN_VALUE;
        }
        if (m()) {
            return this.D0;
        }
        long j2 = this.E0;
        yi0 i = i();
        if (!i.c()) {
            ArrayList arrayList = this.v0;
            i = arrayList.size() > 1 ? (yi0) wg0.f(arrayList, 2) : null;
        }
        if (i != null) {
            j2 = Math.max(j2, i.s0);
        }
        drc drc = this.x0;
        synchronized (drc) {
            j = drc.v;
        }
        return Math.max(j2, j);
    }

    public final void t(long j) {
        long j2 = j;
        jo7 jo7 = this.t0;
        if (!jo7.n() && !m()) {
            boolean o2 = jo7.o();
            ArrayList arrayList = this.v0;
            boolean z = false;
            List list = this.w0;
            f94 f94 = this.X;
            if (o2) {
                h13 h13 = this.A0;
                h13.getClass();
                boolean z2 = h13 instanceof yi0;
                if (!z2 || !j(arrayList.size() - 1)) {
                    if (f94.l == null) {
                        z = f94.i.u(j2, h13, list);
                    }
                    if (z) {
                        jo7.a();
                        if (z2) {
                            this.G0 = (yi0) h13;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            int size = (f94.l != null || f94.i.length() < 2) ? list.size() : f94.i.g(j2, list);
            if (size < arrayList.size()) {
                np8.f(!jo7.o());
                int size2 = arrayList.size();
                while (true) {
                    if (size >= size2) {
                        size = -1;
                        break;
                    } else if (!j(size)) {
                        break;
                    } else {
                        size++;
                    }
                }
                if (size != -1) {
                    long j3 = i().s0;
                    yi0 h = h(size);
                    if (arrayList.isEmpty()) {
                        this.D0 = this.E0;
                    }
                    this.H0 = false;
                    gk8 gk8 = this.Z;
                    gk8.m(new pc8(1, this.a, (Object) null, 3, (Object) null, gk8.a(h.Z), gk8.a(j3)));
                }
            }
        }
    }

    public final int u(int i, int i2) {
        ArrayList arrayList;
        do {
            i2++;
            arrayList = this.v0;
            if (i2 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((yi0) arrayList.get(i2)).d(0) <= i);
        return i2 - 1;
    }

    public final void v(q13 q13) {
        this.C0 = q13;
        drc drc = this.x0;
        drc.i();
        er4 er4 = drc.h;
        if (er4 != null) {
            er4.f(drc.e);
            drc.h = null;
            drc.g = null;
        }
        for (drc drc2 : this.y0) {
            drc2.i();
            er4 er42 = drc2.h;
            if (er42 != null) {
                er42.f(drc2.e);
                drc2.h = null;
                drc2.g = null;
            }
        }
        this.t0.p(this);
    }

    public final void y(fo7 fo7, long j, long j2) {
        l13 a2;
        h13 h13 = (h13) fo7;
        this.A0 = null;
        f94 f94 = this.X;
        f94.getClass();
        if (h13 instanceof t07) {
            int q = f94.i.q(((t07) h13).o);
            c94[] c94Arr = f94.h;
            c94 c94 = c94Arr[q];
            if (((z14) c94.g) == null && (a2 = ((wu0) c94.d).a()) != null) {
                khc khc = (khc) c94.e;
                c94Arr[q] = new c94(c94.b, khc, (lk0) c94.f, (wu0) c94.d, c94.c, new g03((Object) a2, khc.c, 2), 0);
            }
        }
        c4b c4b = f94.g;
        if (c4b != null) {
            long j3 = c4b.d;
            if (j3 == -9223372036854775807L || h13.s0 > j3) {
                c4b.d = h13.s0;
            }
            c4b.e.o = true;
        }
        long j4 = h13.a;
        t1e t1e = h13.t0;
        xn7 xn7 = new xn7(j4, h13.b, t1e.c, t1e.o, j, j2, t1e.b);
        this.s0.getClass();
        xn7 xn72 = xn7;
        this.Z.f(xn72, h13.c, this.a, h13.o, h13.X, h13.Y, h13.Z, h13.s0);
        this.Y.c(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x023f A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.b11 z(defpackage.fo7 r33, long r34, long r36, java.io.IOException r38, int r39) {
        /*
            r32 = this;
            r0 = r32
            r12 = r38
            r1 = 1
            r2 = r33
            h13 r2 = (defpackage.h13) r2
            t1e r3 = r2.t0
            long r3 = r3.b
            boolean r5 = r2 instanceof defpackage.yi0
            java.util.ArrayList r6 = r0.v0
            int r7 = r6.size()
            int r7 = r7 - r1
            r8 = 0
            int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0027
            if (r5 == 0) goto L_0x0027
            boolean r10 = r0.j(r7)
            if (r10 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r10 = 0
            goto L_0x0028
        L_0x0027:
            r10 = r1
        L_0x0028:
            xn7 r25 = new xn7
            t1e r13 = r2.t0
            android.net.Uri r14 = r13.c
            java.util.Map r15 = r13.o
            long r8 = r2.a
            z24 r13 = r2.b
            r16 = r13
            r13 = r25
            r17 = r14
            r18 = r15
            r14 = r8
            r19 = r34
            r21 = r36
            r23 = r3
            r13.<init>(r14, r16, r17, r18, r19, r21, r23)
            long r3 = r2.Z
            defpackage.maf.M(r3)
            long r8 = r2.s0
            defpackage.maf.M(r8)
            wn7 r8 = new wn7
            r9 = r39
            r8.<init>(r9, r12)
            f94 r9 = r0.X
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            buc r15 = r0.s0
            if (r10 != 0) goto L_0x006c
            r9.getClass()
            r20 = r2
            r16 = r6
        L_0x0069:
            r1 = 0
            goto L_0x023c
        L_0x006c:
            c4b r11 = r9.g
            r20 = r2
            if (r11 == 0) goto L_0x00b3
            long r1 = r11.d
            int r16 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r16 == 0) goto L_0x007e
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x007e
            r1 = 1
            goto L_0x007f
        L_0x007e:
            r1 = 0
        L_0x007f:
            e4b r2 = r11.e
            java.lang.Object r3 = r2.u0
            h14 r3 = (defpackage.h14) r3
            boolean r3 = r3.d
            if (r3 != 0) goto L_0x008a
            goto L_0x00b3
        L_0x008a:
            boolean r3 = r2.X
            if (r3 == 0) goto L_0x008f
            goto L_0x00ae
        L_0x008f:
            if (r1 == 0) goto L_0x00b3
            boolean r1 = r2.o
            if (r1 != 0) goto L_0x0096
            goto L_0x00ae
        L_0x0096:
            r1 = 1
            r2.X = r1
            r1 = 0
            r2.o = r1
            java.lang.Object r1 = r2.s0
            wmc r1 = (defpackage.wmc) r1
            java.lang.Object r1 = r1.a
            x14 r1 = (defpackage.x14) r1
            android.os.Handler r2 = r1.D
            r14 r3 = r1.w
            r2.removeCallbacks(r3)
            r1.t()
        L_0x00ae:
            r16 = r6
        L_0x00b0:
            r1 = 1
            goto L_0x023c
        L_0x00b3:
            h14 r1 = r9.j
            boolean r1 = r1.d
            r2 = r20
            oy5 r3 = r2.o
            c94[] r4 = r9.h
            if (r1 != 0) goto L_0x0111
            boolean r1 = r2 instanceof defpackage.f78
            if (r1 == 0) goto L_0x0111
            boolean r1 = r12 instanceof com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException
            if (r1 == 0) goto L_0x0111
            r1 = r12
            com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException r1 = (com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException) r1
            int r1 = r1.c
            r11 = 404(0x194, float:5.66E-43)
            if (r1 != r11) goto L_0x0111
            m85 r1 = r9.i
            int r1 = r1.q(r3)
            r1 = r4[r1]
            java.lang.Object r11 = r1.g
            z14 r11 = (defpackage.z14) r11
            long r13 = r1.b
            long r13 = r11.D(r13)
            r16 = -1
            int r11 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r11 == 0) goto L_0x0111
            r16 = 0
            int r11 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r11 == 0) goto L_0x0111
            java.lang.Object r11 = r1.g
            z14 r11 = (defpackage.z14) r11
            long r16 = r11.C()
            long r11 = r1.c
            long r16 = r16 + r11
            long r16 = r16 + r13
            r11 = 1
            long r16 = r16 - r11
            r1 = r2
            f78 r1 = (defpackage.f78) r1
            long r11 = r1.b()
            int r1 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r1 <= 0) goto L_0x0111
            r1 = 1
            r9.m = r1
        L_0x010e:
            r20 = r2
            goto L_0x00ae
        L_0x0111:
            m85 r1 = r9.i
            int r1 = r1.q(r3)
            r1 = r4[r1]
            java.lang.Object r4 = r1.e
            khc r4 = (defpackage.khc) r4
            zw6 r4 = r4.b
            c8d r11 = r9.b
            lk0 r4 = r11.A(r4)
            java.lang.Object r12 = r1.f
            lk0 r12 = (defpackage.lk0) r12
            if (r4 == 0) goto L_0x0132
            boolean r4 = r12.equals(r4)
            if (r4 != 0) goto L_0x0132
            goto L_0x010e
        L_0x0132:
            m85 r4 = r9.i
            java.lang.Object r1 = r1.e
            khc r1 = (defpackage.khc) r1
            zw6 r1 = r1.b
            long r13 = android.os.SystemClock.elapsedRealtime()
            r16 = r6
            int r6 = r4.length()
            r20 = r2
            r2 = 0
            r30 = 0
        L_0x0149:
            if (r2 >= r6) goto L_0x015b
            boolean r17 = r4.s(r2, r13)
            if (r17 == 0) goto L_0x0156
            r17 = 1
            int r30 = r30 + 1
            goto L_0x0158
        L_0x0156:
            r17 = 1
        L_0x0158:
            int r2 = r2 + 1
            goto L_0x0149
        L_0x015b:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r4 = 0
        L_0x0161:
            int r13 = r1.size()
            if (r4 >= r13) goto L_0x0179
            java.lang.Object r13 = r1.get(r4)
            lk0 r13 = (defpackage.lk0) r13
            int r13 = r13.c
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r2.add(r13)
            r13 = 1
            int r4 = r4 + r13
            goto L_0x0161
        L_0x0179:
            int r27 = r2.size()
            ty4 r2 = new ty4
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.ArrayList r1 = r11.l(r1)
            r13 = 0
        L_0x0189:
            int r14 = r1.size()
            if (r13 >= r14) goto L_0x01a1
            java.lang.Object r14 = r1.get(r13)
            lk0 r14 = (defpackage.lk0) r14
            int r14 = r14.c
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r4.add(r14)
            r14 = 1
            int r13 = r13 + r14
            goto L_0x0189
        L_0x01a1:
            int r1 = r4.size()
            int r28 = r27 - r1
            r31 = 1
            r26 = r2
            r29 = r6
            r26.<init>(r27, r28, r29, r30, r31)
            r1 = 2
            boolean r4 = r2.a(r1)
            if (r4 != 0) goto L_0x01c0
            r4 = 1
            boolean r6 = r2.a(r4)
            if (r6 != 0) goto L_0x01c0
            goto L_0x0069
        L_0x01c0:
            r15.getClass()
            b11 r4 = defpackage.buc.u(r2, r8)
            if (r4 == 0) goto L_0x0069
            int r6 = r4.b
            boolean r2 = r2.a(r6)
            if (r2 != 0) goto L_0x01d3
            goto L_0x0069
        L_0x01d3:
            long r13 = r4.c
            if (r6 != r1) goto L_0x01e2
            m85 r1 = r9.i
            int r2 = r1.q(r3)
            boolean r1 = r1.r(r2, r13)
            goto L_0x023c
        L_0x01e2:
            r1 = 1
            if (r6 != r1) goto L_0x0069
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r1 = r1 + r13
            java.lang.String r3 = r12.b
            java.lang.Object r4 = r11.a
            java.util.HashMap r4 = (java.util.HashMap) r4
            boolean r6 = r4.containsKey(r3)
            if (r6 == 0) goto L_0x0207
            java.lang.Object r6 = r4.get(r3)
            java.lang.Long r6 = (java.lang.Long) r6
            int r9 = defpackage.maf.a
            long r13 = r6.longValue()
            long r13 = java.lang.Math.max(r1, r13)
            goto L_0x0208
        L_0x0207:
            r13 = r1
        L_0x0208:
            java.lang.Long r6 = java.lang.Long.valueOf(r13)
            r4.put(r3, r6)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            int r4 = r12.c
            if (r4 == r3) goto L_0x00b0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r11.b
            java.util.HashMap r4 = (java.util.HashMap) r4
            boolean r6 = r4.containsKey(r3)
            if (r6 == 0) goto L_0x0233
            java.lang.Object r6 = r4.get(r3)
            java.lang.Long r6 = (java.lang.Long) r6
            int r9 = defpackage.maf.a
            long r11 = r6.longValue()
            long r1 = java.lang.Math.max(r1, r11)
        L_0x0233:
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r4.put(r3, r1)
            goto L_0x00b0
        L_0x023c:
            r12 = 0
            if (r1 == 0) goto L_0x0261
            if (r10 == 0) goto L_0x0261
            if (r5 == 0) goto L_0x025c
            yi0 r1 = r0.h(r7)
            r2 = r20
            if (r1 != r2) goto L_0x024d
            r1 = 1
            goto L_0x024e
        L_0x024d:
            r1 = 0
        L_0x024e:
            defpackage.np8.f(r1)
            boolean r1 = r16.isEmpty()
            if (r1 == 0) goto L_0x025e
            long r3 = r0.E0
            r0.D0 = r3
            goto L_0x025e
        L_0x025c:
            r2 = r20
        L_0x025e:
            b11 r1 = defpackage.jo7.X
            goto L_0x0264
        L_0x0261:
            r2 = r20
            r1 = r12
        L_0x0264:
            if (r1 != 0) goto L_0x028d
            r15.getClass()
            long r3 = defpackage.buc.w(r8)
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0287
            b11 r1 = new b11
            r17 = 4
            r18 = 0
            r13 = r1
            r20 = r15
            r14 = r3
            r3 = 0
            r16 = r3
            r13.<init>(r14, r16, r17, r18)
            goto L_0x028b
        L_0x0287:
            r20 = r15
            b11 r1 = defpackage.jo7.Y
        L_0x028b:
            r14 = r1
            goto L_0x0290
        L_0x028d:
            r20 = r15
            goto L_0x028b
        L_0x0290:
            boolean r1 = r14.a()
            r3 = 1
            r15 = r1 ^ 1
            long r8 = r2.Z
            long r10 = r2.s0
            gk8 r1 = r0.Z
            int r3 = r2.c
            int r4 = r0.a
            oy5 r5 = r2.o
            int r6 = r2.X
            java.lang.Object r7 = r2.Y
            r2 = r25
            r13 = r12
            r12 = r38
            r33 = r14
            r14 = r13
            r13 = r15
            r1.h(r2, r3, r4, r5, r6, r7, r8, r10, r12, r13)
            if (r15 == 0) goto L_0x02bf
            r0.A0 = r14
            r20.getClass()
            g6d r1 = r0.Y
            r1.c(r0)
        L_0x02bf:
            return r33
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s13.z(fo7, long, long, java.io.IOException, int):b11");
    }
}
