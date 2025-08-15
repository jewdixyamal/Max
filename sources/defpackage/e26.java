package defpackage;

import android.util.SparseArray;
import com.google.android.exoplayer2.ParserException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import org.apache.http.HttpStatus;

/* renamed from: e26  reason: default package */
public final class e26 implements ka5 {
    public static final byte[] H = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final oy5 I;
    public int A;
    public int B;
    public boolean C;
    public oa5 D;
    public xze[] E;
    public xze[] F;
    public boolean G;
    public final int a;
    public final List b;
    public final SparseArray c;
    public final yaf d = new yaf(np8.b);
    public final yaf e = new yaf(5);
    public final yaf f = new yaf(3, false);
    public final byte[] g;
    public final yaf h;
    public final sue i;
    public final y7g j = new y7g(16);
    public final yaf k = new yaf(16);
    public final ArrayDeque l;
    public final ArrayDeque m;
    public final xze n;
    public int o;
    public int p;
    public long q;
    public int r;
    public yaf s;
    public long t;
    public int u;
    public long v;
    public long w;
    public long x;
    public c26 y;
    public int z;

    static {
        my5 my5 = new my5();
        my5.k = "application/x-emsg";
        I = my5.a();
    }

    public e26(int i2, sue sue, List list, xze xze) {
        this.a = i2;
        this.i = sue;
        this.b = Collections.unmodifiableList(list);
        this.n = xze;
        byte[] bArr = new byte[16];
        this.g = bArr;
        this.h = new yaf(bArr);
        this.l = new ArrayDeque();
        this.m = new ArrayDeque();
        this.c = new SparseArray();
        this.w = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.x = -9223372036854775807L;
        this.D = oa5.u;
        this.E = new xze[0];
        this.F = new xze[0];
    }

    public static cr4 a(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i2 = 0; i2 < size; i2++) {
            my myVar = (my) arrayList.get(i2);
            if (myVar.b == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = myVar.c.a;
                tpb A2 = wmd.A(bArr);
                UUID uuid = A2 == null ? null : A2.a;
                if (uuid != null) {
                    arrayList2.add(new ar4(uuid, (String) null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new cr4((String) null, false, (ar4[]) arrayList2.toArray(new ar4[0]));
    }

    public static void b(yaf yaf, int i2, pze pze) {
        yaf.H(i2 + 8);
        int h2 = yaf.h();
        if ((h2 & 1) == 0) {
            boolean z2 = (h2 & 2) != 0;
            int y2 = yaf.y();
            if (y2 == 0) {
                Arrays.fill(pze.k, 0, pze.d, false);
                return;
            }
            int i3 = pze.d;
            if (y2 == i3) {
                Arrays.fill(pze.k, 0, y2, z2);
                int c2 = yaf.c();
                yaf yaf2 = (yaf) pze.q;
                yaf2.E(c2);
                pze.j = true;
                pze.l = true;
                yaf.g(0, yaf2.a, yaf2.c);
                yaf2.H(0);
                pze.l = false;
                return;
            }
            StringBuilder sb = new StringBuilder(80);
            sb.append("Senc sample count ");
            sb.append(y2);
            sb.append(" is different from fragment sample count");
            sb.append(i3);
            throw ParserException.a((RuntimeException) null, sb.toString());
        }
        throw ParserException.c("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v31, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v17, resolved type: hd4} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(long r51) {
        /*
            r50 = this;
            r0 = r50
            r6 = 1
        L_0x0003:
            java.util.ArrayDeque r7 = r0.l
            boolean r8 = r7.isEmpty()
            if (r8 != 0) goto L_0x07bd
            java.lang.Object r8 = r7.peek()
            ky r8 = (defpackage.ky) r8
            long r8 = r8.c
            int r8 = (r8 > r51 ? 1 : (r8 == r51 ? 0 : -1))
            if (r8 != 0) goto L_0x07bd
            java.lang.Object r8 = r7.pop()
            r9 = r8
            ky r9 = (defpackage.ky) r9
            int r8 = r9.b
            android.util.SparseArray r15 = r0.c
            java.util.ArrayList r10 = r9.o
            r11 = 1836019574(0x6d6f6f76, float:4.631354E27)
            int r12 = r0.a
            r13 = 12
            if (r8 != r11) goto L_0x0189
            cr4 r7 = a(r10)
            r8 = 1836475768(0x6d766578, float:4.7659988E27)
            ky r8 = r9.v(r8)
            r8.getClass()
            android.util.SparseArray r14 = new android.util.SparseArray
            r14.<init>()
            java.util.ArrayList r8 = r8.o
            int r10 = r8.size()
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r11 = 0
        L_0x004c:
            if (r11 >= r10) goto L_0x00bf
            java.lang.Object r16 = r8.get(r11)
            r1 = r16
            my r1 = (defpackage.my) r1
            int r5 = r1.b
            r2 = 1953654136(0x74726578, float:7.6818474E31)
            yaf r1 = r1.c
            if (r5 != r2) goto L_0x0096
            r1.H(r13)
            int r2 = r1.h()
            int r5 = r1.h()
            int r5 = r5 - r6
            int r13 = r1.h()
            int r6 = r1.h()
            int r1 = r1.h()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r19 = r8
            hd4 r8 = new hd4
            r8.<init>(r5, r13, r6, r1)
            android.util.Pair r1 = android.util.Pair.create(r2, r8)
            java.lang.Object r2 = r1.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Object r1 = r1.second
            hd4 r1 = (defpackage.hd4) r1
            r14.put(r2, r1)
            goto L_0x00b7
        L_0x0096:
            r19 = r8
            r2 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r5 != r2) goto L_0x00b7
            r2 = 8
            r1.H(r2)
            int r2 = r1.h()
            int r2 = defpackage.oy.s(r2)
            if (r2 != 0) goto L_0x00b2
            long r1 = r1.w()
        L_0x00b0:
            r3 = r1
            goto L_0x00b7
        L_0x00b2:
            long r1 = r1.z()
            goto L_0x00b0
        L_0x00b7:
            r1 = 1
            int r11 = r11 + r1
            r6 = r1
            r8 = r19
            r13 = 12
            goto L_0x004c
        L_0x00bf:
            da6 r10 = new da6
            r10.<init>()
            r1 = 16
            r2 = r12 & 16
            if (r2 == 0) goto L_0x00cc
            r1 = 1
            goto L_0x00cd
        L_0x00cc:
            r1 = 0
        L_0x00cd:
            z16 r2 = new z16
            r5 = 0
            r2.<init>(r5, r0)
            r5 = 0
            r11 = r3
            r13 = r7
            r3 = r14
            r14 = r1
            r1 = r15
            r15 = r5
            r16 = r2
            java.util.ArrayList r2 = defpackage.vy.e(r9, r10, r11, r13, r14, r15, r16)
            int r4 = r2.size()
            int r5 = r1.size()
            if (r5 != 0) goto L_0x0133
            r5 = 0
        L_0x00eb:
            if (r5 >= r4) goto L_0x012d
            java.lang.Object r6 = r2.get(r5)
            zze r6 = (defpackage.zze) r6
            jze r7 = r6.a
            c26 r8 = new c26
            oa5 r9 = r0.D
            int r10 = r7.b
            xze r9 = r9.B(r5, r10)
            int r10 = r3.size()
            int r11 = r7.a
            r12 = 1
            if (r10 != r12) goto L_0x0110
            r10 = 0
            java.lang.Object r12 = r3.valueAt(r10)
            hd4 r12 = (defpackage.hd4) r12
            goto L_0x011a
        L_0x0110:
            java.lang.Object r10 = r3.get(r11)
            r12 = r10
            hd4 r12 = (defpackage.hd4) r12
            r12.getClass()
        L_0x011a:
            r8.<init>(r9, r6, r12)
            r1.put(r11, r8)
            long r8 = r0.w
            long r6 = r7.e
            long r6 = java.lang.Math.max(r8, r6)
            r0.w = r6
            r6 = 1
            int r5 = r5 + r6
            goto L_0x00eb
        L_0x012d:
            oa5 r1 = r0.D
            r1.w()
            goto L_0x017f
        L_0x0133:
            int r5 = r1.size()
            if (r5 != r4) goto L_0x013b
            r5 = 1
            goto L_0x013c
        L_0x013b:
            r5 = 0
        L_0x013c:
            defpackage.np8.f(r5)
            r5 = 0
        L_0x0140:
            if (r5 >= r4) goto L_0x017f
            java.lang.Object r6 = r2.get(r5)
            zze r6 = (defpackage.zze) r6
            jze r7 = r6.a
            int r8 = r7.a
            java.lang.Object r8 = r1.get(r8)
            c26 r8 = (defpackage.c26) r8
            int r9 = r3.size()
            r10 = 1
            if (r9 != r10) goto L_0x0161
            r9 = 0
            java.lang.Object r7 = r3.valueAt(r9)
            hd4 r7 = (defpackage.hd4) r7
            goto L_0x016c
        L_0x0161:
            int r7 = r7.a
            java.lang.Object r7 = r3.get(r7)
            hd4 r7 = (defpackage.hd4) r7
            r7.getClass()
        L_0x016c:
            r8.d = r6
            r8.e = r7
            jze r6 = r6.a
            oy5 r6 = r6.f
            xze r7 = r8.a
            r7.d(r6)
            r8.d()
            r6 = 1
            int r5 = r5 + r6
            goto L_0x0140
        L_0x017f:
            r4 = r0
            r2 = 8
            r8 = 16
            r11 = 1
            r14 = 4
            r15 = 2
            goto L_0x07b9
        L_0x0189:
            r1 = r15
            r2 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r8 != r2) goto L_0x07a0
            java.util.ArrayList r2 = r9.X
            int r5 = r2.size()
            r6 = 0
        L_0x0196:
            if (r6 >= r5) goto L_0x06ff
            java.lang.Object r8 = r2.get(r6)
            ky r8 = (defpackage.ky) r8
            int r9 = r8.b
            r11 = 1953653094(0x74726166, float:7.6813435E31)
            if (r9 != r11) goto L_0x06da
            r9 = 1952868452(0x74666864, float:7.301914E31)
            my r9 = r8.w(r9)
            r9.getClass()
            yaf r9 = r9.c
            r11 = 8
            r9.H(r11)
            int r11 = r9.h()
            int r13 = r9.h()
            java.lang.Object r13 = r1.get(r13)
            c26 r13 = (defpackage.c26) r13
            if (r13 != 0) goto L_0x01c8
            r13 = 0
            goto L_0x0217
        L_0x01c8:
            r14 = 1
            r15 = r11 & 1
            pze r14 = r13.b
            if (r15 == 0) goto L_0x01d7
            long r3 = r9.z()
            r14.a = r3
            r14.b = r3
        L_0x01d7:
            hd4 r3 = r13.e
            r4 = 2
            r15 = r11 & 2
            if (r15 == 0) goto L_0x01e7
            int r4 = r9.h()
            r15 = 1
            int r4 = r4 - r15
        L_0x01e4:
            r15 = 8
            goto L_0x01ea
        L_0x01e7:
            int r4 = r3.a
            goto L_0x01e4
        L_0x01ea:
            r20 = r11 & 8
            if (r20 == 0) goto L_0x01f5
            int r15 = r9.h()
        L_0x01f2:
            r17 = 16
            goto L_0x01f8
        L_0x01f5:
            int r15 = r3.b
            goto L_0x01f2
        L_0x01f8:
            r20 = r11 & 16
            if (r20 == 0) goto L_0x0203
            int r20 = r9.h()
            r7 = r20
            goto L_0x0205
        L_0x0203:
            int r7 = r3.c
        L_0x0205:
            r11 = r11 & 32
            if (r11 == 0) goto L_0x020e
            int r3 = r9.h()
            goto L_0x0210
        L_0x020e:
            int r3 = r3.d
        L_0x0210:
            hd4 r9 = new hd4
            r9.<init>(r4, r15, r7, r3)
            r14.o = r9
        L_0x0217:
            if (r13 != 0) goto L_0x021b
            goto L_0x06da
        L_0x021b:
            pze r3 = r13.b
            long r14 = r3.m
            boolean r4 = r3.n
            r13.d()
            r7 = 1
            r13.l = r7
            r9 = 1952867444(0x74666474, float:7.3014264E31)
            my r9 = r8.w(r9)
            if (r9 == 0) goto L_0x0254
            r11 = 2
            r18 = r12 & 2
            if (r18 != 0) goto L_0x0254
            yaf r4 = r9.c
            r9 = 8
            r4.H(r9)
            int r9 = r4.h()
            int r9 = defpackage.oy.s(r9)
            if (r9 != r7) goto L_0x024b
            long r14 = r4.z()
            goto L_0x024f
        L_0x024b:
            long r14 = r4.w()
        L_0x024f:
            r3.m = r14
            r3.n = r7
            goto L_0x0258
        L_0x0254:
            r3.m = r14
            r3.n = r4
        L_0x0258:
            java.util.ArrayList r4 = r8.o
            int r7 = r4.size()
            r9 = 0
            r11 = 0
            r14 = 0
        L_0x0261:
            r15 = 1953658222(0x7472756e, float:7.683823E31)
            if (r9 >= r7) goto L_0x028e
            java.lang.Object r21 = r4.get(r9)
            r22 = r2
            r2 = r21
            my r2 = (defpackage.my) r2
            r21 = r5
            int r5 = r2.b
            if (r5 != r15) goto L_0x0287
            yaf r2 = r2.c
            r5 = 12
            r2.H(r5)
            int r2 = r2.y()
            if (r2 <= 0) goto L_0x0287
            int r14 = r14 + r2
            r2 = 1
            int r11 = r11 + r2
            goto L_0x0288
        L_0x0287:
            r2 = 1
        L_0x0288:
            int r9 = r9 + r2
            r5 = r21
            r2 = r22
            goto L_0x0261
        L_0x028e:
            r22 = r2
            r21 = r5
            r2 = 0
            r13.h = r2
            r13.g = r2
            r13.f = r2
            r3.c = r11
            r3.d = r14
            int[] r2 = r3.f
            int r2 = r2.length
            if (r2 >= r11) goto L_0x02aa
            long[] r2 = new long[r11]
            r3.e = r2
            int[] r2 = new int[r11]
            r3.f = r2
        L_0x02aa:
            int[] r2 = r3.g
            int r2 = r2.length
            if (r2 >= r14) goto L_0x02c3
            int r14 = r14 * 125
            int r14 = r14 / 100
            int[] r2 = new int[r14]
            r3.g = r2
            long[] r2 = new long[r14]
            r3.h = r2
            boolean[] r2 = new boolean[r14]
            r3.i = r2
            boolean[] r2 = new boolean[r14]
            r3.k = r2
        L_0x02c3:
            r2 = 0
            r5 = 0
            r9 = 0
        L_0x02c6:
            r23 = 0
            if (r2 >= r7) goto L_0x049b
            java.lang.Object r11 = r4.get(r2)
            my r11 = (defpackage.my) r11
            int r14 = r11.b
            if (r14 != r15) goto L_0x046f
            r14 = 1
            int r25 = r5 + 1
            yaf r11 = r11.c
            r14 = 8
            r11.H(r14)
            int r14 = r11.h()
            zze r15 = r13.d
            jze r15 = r15.a
            r26 = r7
            java.lang.Object r7 = r3.o
            hd4 r7 = (defpackage.hd4) r7
            int r27 = defpackage.maf.a
            r27 = r1
            int[] r1 = r3.f
            int r28 = r11.y()
            r1[r5] = r28
            long[] r1 = r3.e
            r28 = r8
            r29 = r9
            long r8 = r3.a
            r1[r5] = r8
            r18 = 1
            r30 = r14 & 1
            if (r30 == 0) goto L_0x0318
            r30 = r10
            int r10 = r11.h()
            r31 = r12
            r32 = r13
            long r12 = (long) r10
            long r8 = r8 + r12
            r1[r5] = r8
        L_0x0316:
            r1 = 4
            goto L_0x031f
        L_0x0318:
            r30 = r10
            r31 = r12
            r32 = r13
            goto L_0x0316
        L_0x031f:
            r8 = r14 & 4
            if (r8 == 0) goto L_0x0325
            r1 = 1
            goto L_0x0326
        L_0x0325:
            r1 = 0
        L_0x0326:
            int r8 = r7.d
            if (r1 == 0) goto L_0x032e
            int r8 = r11.h()
        L_0x032e:
            r9 = r14 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x0334
            r9 = 1
            goto L_0x0335
        L_0x0334:
            r9 = 0
        L_0x0335:
            r10 = r14 & 512(0x200, float:7.175E-43)
            if (r10 == 0) goto L_0x033b
            r10 = 1
            goto L_0x033c
        L_0x033b:
            r10 = 0
        L_0x033c:
            r12 = r14 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0342
            r12 = 1
            goto L_0x0343
        L_0x0342:
            r12 = 0
        L_0x0343:
            r13 = r14 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0349
            r13 = 1
            goto L_0x034a
        L_0x0349:
            r13 = 0
        L_0x034a:
            long[] r14 = r15.h
            if (r14 == 0) goto L_0x0362
            r33 = r8
            int r8 = r14.length
            r34 = r6
            r6 = 1
            if (r8 != r6) goto L_0x0366
            r6 = 0
            r35 = r14[r6]
            int r8 = (r35 > r23 ? 1 : (r35 == r23 ? 0 : -1))
            if (r8 != 0) goto L_0x0366
            long[] r8 = r15.i
            r23 = r8[r6]
            goto L_0x0366
        L_0x0362:
            r34 = r6
            r33 = r8
        L_0x0366:
            int[] r6 = r3.g
            long[] r8 = r3.h
            boolean[] r14 = r3.i
            int r0 = r15.b
            r35 = r4
            r4 = 2
            if (r0 != r4) goto L_0x037a
            r0 = 1
            r4 = r31 & 1
            if (r4 == 0) goto L_0x037a
            r0 = 1
            goto L_0x037b
        L_0x037a:
            r0 = 0
        L_0x037b:
            int[] r4 = r3.f
            r4 = r4[r5]
            int r4 = r29 + r4
            r36 = r6
            long r5 = r3.m
            r37 = r2
            r2 = r29
        L_0x0389:
            if (r2 >= r4) goto L_0x0463
            if (r9 == 0) goto L_0x0398
            int r29 = r11.h()
            r38 = r4
            r39 = r9
            r4 = r29
            goto L_0x039e
        L_0x0398:
            r38 = r4
            int r4 = r7.b
            r39 = r9
        L_0x039e:
            java.lang.String r9 = "Unexpected negative value: "
            r29 = r9
            if (r4 < 0) goto L_0x044a
            if (r10 == 0) goto L_0x03ad
            int r40 = r11.h()
            r9 = r40
            goto L_0x03af
        L_0x03ad:
            int r9 = r7.c
        L_0x03af:
            if (r9 < 0) goto L_0x0431
            if (r12 == 0) goto L_0x03ba
            int r29 = r11.h()
            r41 = r1
            goto L_0x03c9
        L_0x03ba:
            if (r2 != 0) goto L_0x03c3
            if (r1 == 0) goto L_0x03c3
            r41 = r1
            r29 = r33
            goto L_0x03c9
        L_0x03c3:
            r41 = r1
            int r1 = r7.d
            r29 = r1
        L_0x03c9:
            if (r13 == 0) goto L_0x03d4
            int r1 = r11.h()
            r43 = r10
            r42 = r11
            goto L_0x03d9
        L_0x03d4:
            r43 = r10
            r42 = r11
            r1 = 0
        L_0x03d9:
            long r10 = (long) r1
            long r10 = r10 + r5
            long r44 = r10 - r23
            r46 = 1000000(0xf4240, double:4.940656E-318)
            long r10 = r15.c
            r48 = r10
            long r10 = defpackage.maf.J(r44, r46, r48)
            r8[r2] = r10
            boolean r1 = r3.n
            if (r1 != 0) goto L_0x03fe
            r1 = r32
            r32 = r7
            zze r7 = r1.d
            r44 = r12
            r45 = r13
            long r12 = r7.h
            long r10 = r10 + r12
            r8[r2] = r10
            goto L_0x0406
        L_0x03fe:
            r44 = r12
            r45 = r13
            r1 = r32
            r32 = r7
        L_0x0406:
            r36[r2] = r9
            r7 = 16
            int r9 = r29 >> 16
            r7 = 1
            r9 = r9 & r7
            if (r9 != 0) goto L_0x0416
            if (r0 == 0) goto L_0x0414
            if (r2 != 0) goto L_0x0416
        L_0x0414:
            r7 = 1
            goto L_0x0417
        L_0x0416:
            r7 = 0
        L_0x0417:
            r14[r2] = r7
            long r9 = (long) r4
            long r5 = r5 + r9
            r4 = 1
            int r2 = r2 + r4
            r7 = r32
            r4 = r38
            r9 = r39
            r11 = r42
            r10 = r43
            r12 = r44
            r13 = r45
            r32 = r1
            r1 = r41
            goto L_0x0389
        L_0x0431:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 38
            r0.<init>(r1)
            r2 = r29
            r0.append(r2)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            r3 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r3, r0)
            throw r0
        L_0x044a:
            r2 = r29
            r1 = 38
            r3 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r3, r0)
            throw r0
        L_0x0463:
            r38 = r4
            r1 = r32
            r3.m = r5
            r5 = r25
            r9 = r38
        L_0x046d:
            r0 = 1
            goto L_0x0483
        L_0x046f:
            r27 = r1
            r37 = r2
            r35 = r4
            r34 = r6
            r26 = r7
            r28 = r8
            r29 = r9
            r30 = r10
            r31 = r12
            r1 = r13
            goto L_0x046d
        L_0x0483:
            int r2 = r37 + 1
            r0 = r50
            r13 = r1
            r7 = r26
            r1 = r27
            r8 = r28
            r10 = r30
            r12 = r31
            r6 = r34
            r4 = r35
            r15 = 1953658222(0x7472756e, float:7.683823E31)
            goto L_0x02c6
        L_0x049b:
            r27 = r1
            r35 = r4
            r34 = r6
            r28 = r8
            r30 = r10
            r31 = r12
            r1 = r13
            zze r0 = r1.d
            jze r0 = r0.a
            java.lang.Object r1 = r3.o
            hd4 r1 = (defpackage.hd4) r1
            r1.getClass()
            nze[] r0 = r0.k
            if (r0 != 0) goto L_0x04b9
            r0 = 0
            goto L_0x04bd
        L_0x04b9:
            int r1 = r1.a
            r0 = r0[r1]
        L_0x04bd:
            r1 = 1935763834(0x7361697a, float:1.785898E31)
            r8 = r28
            my r1 = r8.w(r1)
            if (r1 == 0) goto L_0x0548
            r0.getClass()
            yaf r1 = r1.c
            r2 = 8
            r1.H(r2)
            int r4 = r1.h()
            r5 = 1
            r4 = r4 & r5
            if (r4 != r5) goto L_0x04dd
            r1.I(r2)
        L_0x04dd:
            int r2 = r1.v()
            int r4 = r1.y()
            int r5 = r3.d
            if (r4 > r5) goto L_0x0527
            int r5 = r0.d
            if (r2 != 0) goto L_0x0504
            boolean[] r2 = r3.k
            r6 = 0
            r7 = 0
        L_0x04f1:
            if (r6 >= r4) goto L_0x0502
            int r9 = r1.v()
            int r7 = r7 + r9
            if (r9 <= r5) goto L_0x04fc
            r9 = 1
            goto L_0x04fd
        L_0x04fc:
            r9 = 0
        L_0x04fd:
            r2[r6] = r9
            r9 = 1
            int r6 = r6 + r9
            goto L_0x04f1
        L_0x0502:
            r5 = 0
            goto L_0x0511
        L_0x0504:
            if (r2 <= r5) goto L_0x0508
            r1 = 1
            goto L_0x0509
        L_0x0508:
            r1 = 0
        L_0x0509:
            int r7 = r2 * r4
            boolean[] r2 = r3.k
            r5 = 0
            java.util.Arrays.fill(r2, r5, r4, r1)
        L_0x0511:
            boolean[] r1 = r3.k
            int r2 = r3.d
            java.util.Arrays.fill(r1, r4, r2, r5)
            if (r7 <= 0) goto L_0x0548
            java.lang.Object r1 = r3.q
            yaf r1 = (defpackage.yaf) r1
            r1.E(r7)
            r1 = 1
            r3.j = r1
            r3.l = r1
            goto L_0x0548
        L_0x0527:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 78
            r0.<init>(r1)
            java.lang.String r1 = "Saiz sample count "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = " is greater than fragment sample count"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r1, r0)
            throw r0
        L_0x0548:
            r1 = 1935763823(0x7361696f, float:1.7858967E31)
            my r1 = r8.w(r1)
            if (r1 == 0) goto L_0x057e
            yaf r1 = r1.c
            r2 = 8
            r1.H(r2)
            int r4 = r1.h()
            r5 = 1
            r6 = r4 & 1
            if (r6 != r5) goto L_0x0564
            r1.I(r2)
        L_0x0564:
            int r2 = r1.y()
            if (r2 != r5) goto L_0x0580
            int r2 = defpackage.oy.s(r4)
            long r4 = r3.b
            if (r2 != 0) goto L_0x0577
            long r1 = r1.w()
            goto L_0x057b
        L_0x0577:
            long r1 = r1.z()
        L_0x057b:
            long r4 = r4 + r1
            r3.b = r4
        L_0x057e:
            r1 = 0
            goto L_0x0599
        L_0x0580:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 40
            r0.<init>(r1)
            java.lang.String r1 = "Unexpected saio entry count: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r1, r0)
            throw r0
        L_0x0599:
            r2 = 1936027235(0x73656e63, float:1.8177412E31)
            my r2 = r8.w(r2)
            if (r2 == 0) goto L_0x05a8
            yaf r2 = r2.c
            r4 = 0
            b(r2, r4, r3)
        L_0x05a8:
            if (r0 == 0) goto L_0x05ae
            java.lang.String r0 = r0.b
            r6 = r0
            goto L_0x05af
        L_0x05ae:
            r6 = r1
        L_0x05af:
            r0 = r1
            r2 = r0
            r4 = 0
        L_0x05b2:
            int r5 = r35.size()
            if (r4 >= r5) goto L_0x05f0
            r12 = r35
            java.lang.Object r5 = r12.get(r4)
            my r5 = (defpackage.my) r5
            yaf r7 = r5.c
            r8 = 1935828848(0x73626770, float:1.7937577E31)
            r9 = 1936025959(0x73656967, float:1.817587E31)
            int r5 = r5.b
            if (r5 != r8) goto L_0x05da
            r13 = 12
            r7.H(r13)
            int r5 = r7.h()
            if (r5 != r9) goto L_0x05d8
            r0 = r7
        L_0x05d8:
            r5 = 1
            goto L_0x05ec
        L_0x05da:
            r13 = 12
            r8 = 1936158820(0x73677064, float:1.8336489E31)
            if (r5 != r8) goto L_0x05d8
            r7.H(r13)
            int r5 = r7.h()
            if (r5 != r9) goto L_0x05d8
            r2 = r7
            goto L_0x05d8
        L_0x05ec:
            int r4 = r4 + r5
            r35 = r12
            goto L_0x05b2
        L_0x05f0:
            r12 = r35
            r5 = 1
            r13 = 12
            if (r0 == 0) goto L_0x05f9
            if (r2 != 0) goto L_0x05fd
        L_0x05f9:
            r14 = 4
            r15 = 2
            goto L_0x0696
        L_0x05fd:
            r4 = 8
            r0.H(r4)
            int r7 = r0.h()
            int r7 = defpackage.oy.s(r7)
            r14 = 4
            r0.I(r14)
            if (r7 != r5) goto L_0x0613
            r0.I(r14)
        L_0x0613:
            int r0 = r0.h()
            if (r0 != r5) goto L_0x068f
            r2.H(r4)
            int r0 = r2.h()
            int r0 = defpackage.oy.s(r0)
            r2.I(r14)
            if (r0 != r5) goto L_0x063a
            long r4 = r2.w()
            int r0 = (r4 > r23 ? 1 : (r4 == r23 ? 0 : -1))
            if (r0 == 0) goto L_0x0633
            r15 = 2
            goto L_0x0640
        L_0x0633:
            java.lang.String r0 = "Variable length description in sgpd found (unsupported)"
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.c(r0)
            throw r0
        L_0x063a:
            r15 = 2
            if (r0 < r15) goto L_0x0640
            r2.I(r14)
        L_0x0640:
            long r4 = r2.w()
            r7 = 1
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0688
            r0 = 1
            r2.I(r0)
            int r4 = r2.v()
            r5 = r4 & 240(0xf0, float:3.36E-43)
            int r9 = r5 >> 4
            r10 = r4 & 15
            int r4 = r2.v()
            if (r4 != r0) goto L_0x0660
            r5 = 1
            goto L_0x0661
        L_0x0660:
            r5 = 0
        L_0x0661:
            if (r5 != 0) goto L_0x0664
            goto L_0x0696
        L_0x0664:
            int r7 = r2.v()
            r0 = 16
            byte[] r8 = new byte[r0]
            r4 = 0
            r2.g(r4, r8, r0)
            if (r7 != 0) goto L_0x067b
            int r0 = r2.v()
            byte[] r1 = new byte[r0]
            r2.g(r4, r1, r0)
        L_0x067b:
            r11 = r1
            r0 = 1
            r3.j = r0
            nze r0 = new nze
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r3.p = r0
            goto L_0x0696
        L_0x0688:
            java.lang.String r0 = "Entry count in sgpd != 1 (unsupported)."
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.c(r0)
            throw r0
        L_0x068f:
            java.lang.String r0 = "Entry count in sbgp != 1 (unsupported)."
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.c(r0)
            throw r0
        L_0x0696:
            int r0 = r12.size()
            r5 = 0
        L_0x069b:
            if (r5 >= r0) goto L_0x06d2
            java.lang.Object r1 = r12.get(r5)
            my r1 = (defpackage.my) r1
            int r2 = r1.b
            r4 = 1970628964(0x75756964, float:3.1109627E32)
            if (r2 != r4) goto L_0x06c9
            yaf r1 = r1.c
            r2 = 8
            r1.H(r2)
            r4 = r50
            byte[] r6 = r4.g
            r7 = 0
            r8 = 16
            r1.g(r7, r6, r8)
            byte[] r7 = H
            boolean r6 = java.util.Arrays.equals(r6, r7)
            if (r6 != 0) goto L_0x06c4
            goto L_0x06c7
        L_0x06c4:
            b(r1, r8, r3)
        L_0x06c7:
            r1 = 1
            goto L_0x06d0
        L_0x06c9:
            r2 = 8
            r8 = 16
            r4 = r50
            goto L_0x06c7
        L_0x06d0:
            int r5 = r5 + r1
            goto L_0x069b
        L_0x06d2:
            r1 = 1
            r2 = 8
            r8 = 16
            r4 = r50
            goto L_0x06f0
        L_0x06da:
            r4 = r0
            r27 = r1
            r22 = r2
            r21 = r5
            r34 = r6
            r30 = r10
            r31 = r12
            r1 = 1
            r2 = 8
            r8 = 16
            r13 = 12
            r14 = 4
            r15 = 2
        L_0x06f0:
            int r6 = r34 + 1
            r0 = r4
            r5 = r21
            r2 = r22
            r1 = r27
            r10 = r30
            r12 = r31
            goto L_0x0196
        L_0x06ff:
            r4 = r0
            r27 = r1
            r30 = r10
            r1 = 0
            r2 = 8
            r8 = 16
            r14 = 4
            r15 = 2
            cr4 r0 = a(r30)
            if (r0 == 0) goto L_0x075b
            int r3 = r27.size()
            r5 = 0
        L_0x0716:
            if (r5 >= r3) goto L_0x075b
            r6 = r27
            java.lang.Object r7 = r6.valueAt(r5)
            c26 r7 = (defpackage.c26) r7
            zze r9 = r7.d
            jze r9 = r9.a
            pze r10 = r7.b
            java.lang.Object r10 = r10.o
            hd4 r10 = (defpackage.hd4) r10
            int r11 = defpackage.maf.a
            int r10 = r10.a
            nze[] r9 = r9.k
            if (r9 != 0) goto L_0x0734
            r9 = r1
            goto L_0x0736
        L_0x0734:
            r9 = r9[r10]
        L_0x0736:
            if (r9 == 0) goto L_0x073b
            java.lang.String r9 = r9.b
            goto L_0x073c
        L_0x073b:
            r9 = r1
        L_0x073c:
            cr4 r9 = r0.a(r9)
            zze r10 = r7.d
            jze r10 = r10.a
            oy5 r10 = r10.f
            my5 r10 = r10.a()
            r10.n = r9
            oy5 r9 = new oy5
            r9.<init>(r10)
            xze r7 = r7.a
            r7.d(r9)
            r7 = 1
            int r5 = r5 + r7
            r27 = r6
            goto L_0x0716
        L_0x075b:
            r6 = r27
            long r0 = r4.v
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x079e
            int r0 = r6.size()
            r5 = 0
        L_0x076d:
            if (r5 >= r0) goto L_0x0795
            java.lang.Object r1 = r6.valueAt(r5)
            c26 r1 = (defpackage.c26) r1
            long r9 = r4.v
            int r3 = r1.f
        L_0x0779:
            pze r7 = r1.b
            int r11 = r7.d
            if (r3 >= r11) goto L_0x0792
            long[] r11 = r7.h
            r11 = r11[r3]
            int r11 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r11 >= 0) goto L_0x0792
            boolean[] r7 = r7.i
            boolean r7 = r7[r3]
            if (r7 == 0) goto L_0x078f
            r1.i = r3
        L_0x078f:
            r11 = 1
            int r3 = r3 + r11
            goto L_0x0779
        L_0x0792:
            r11 = 1
            int r5 = r5 + r11
            goto L_0x076d
        L_0x0795:
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r11 = 1
            r4.v = r9
            goto L_0x07b9
        L_0x079e:
            r11 = 1
            goto L_0x07b9
        L_0x07a0:
            r4 = r0
            r2 = 8
            r8 = 16
            r11 = 1
            r14 = 4
            r15 = 2
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x07b9
            java.lang.Object r0 = r7.peek()
            ky r0 = (defpackage.ky) r0
            java.util.ArrayList r0 = r0.X
            r0.add(r9)
        L_0x07b9:
            r0 = r4
            r6 = r11
            goto L_0x0003
        L_0x07bd:
            r4 = r0
            r0 = 0
            r4.o = r0
            r4.r = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e26.c(long):void");
    }

    public final void d(long j2, long j3) {
        SparseArray sparseArray = this.c;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((c26) sparseArray.valueAt(i2)).d();
        }
        this.m.clear();
        this.u = 0;
        this.v = j3;
        this.l.clear();
        this.o = 0;
        this.r = 0;
    }

    public final void g(oa5 oa5) {
        int i2;
        this.D = oa5;
        int i3 = 0;
        this.o = 0;
        this.r = 0;
        xze[] xzeArr = new xze[2];
        this.E = xzeArr;
        xze xze = this.n;
        if (xze != null) {
            xzeArr[0] = xze;
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i4 = 100;
        if ((this.a & 4) != 0) {
            xzeArr[i2] = oa5.B(100, 5);
            i4 = HttpStatus.SC_SWITCHING_PROTOCOLS;
            i2++;
        }
        xze[] xzeArr2 = (xze[]) maf.F(i2, this.E);
        this.E = xzeArr2;
        for (xze d2 : xzeArr2) {
            d2.d(I);
        }
        List list = this.b;
        this.F = new xze[list.size()];
        while (i3 < this.F.length) {
            xze B2 = this.D.B(i4, 3);
            B2.d((oy5) list.get(i3));
            this.F[i3] = B2;
            i3++;
            i4++;
        }
    }

    public final boolean h(ma5 ma5) {
        return ju0.H(ma5, true, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: c26} */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01e2, code lost:
        if ((r13 & 31) != 6) goto L_0x01e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01f4, code lost:
        if (((r13 & 126) >> 1) == 39) goto L_0x01f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01f6, code lost:
        r4 = true;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int i(defpackage.ma5 r36, defpackage.lh4 r37) {
        /*
            r35 = this;
            r0 = r35
            r1 = r36
        L_0x0004:
            int r2 = r0.o
            java.util.ArrayDeque r3 = r0.l
            android.util.SparseArray r4 = r0.c
            r5 = 0
            r6 = 1
            r7 = 1701671783(0x656d7367, float:7.0083103E22)
            r8 = 1936286840(0x73696478, float:1.8491255E31)
            r10 = 0
            r11 = 2
            if (r2 == 0) goto L_0x058f
            java.util.ArrayDeque r12 = r0.m
            sue r13 = r0.i
            if (r2 == r6) goto L_0x0371
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 == r11) goto L_0x031a
            c26 r2 = r0.y
            if (r2 != 0) goto L_0x00b3
            int r2 = r4.size()
            r15 = r7
            r7 = r10
            r8 = r5
        L_0x002e:
            if (r8 >= r2) goto L_0x006c
            java.lang.Object r17 = r4.valueAt(r8)
            r11 = r17
            c26 r11 = (defpackage.c26) r11
            boolean r14 = r11.l
            if (r14 != 0) goto L_0x0044
            int r9 = r11.f
            zze r6 = r11.d
            int r6 = r6.b
            if (r9 == r6) goto L_0x0067
        L_0x0044:
            pze r6 = r11.b
            if (r14 == 0) goto L_0x004f
            int r9 = r11.h
            int r3 = r6.c
            if (r9 != r3) goto L_0x004f
            goto L_0x0067
        L_0x004f:
            if (r14 != 0) goto L_0x005a
            zze r3 = r11.d
            long[] r3 = r3.c
            int r6 = r11.f
            r20 = r3[r6]
            goto L_0x0060
        L_0x005a:
            long[] r3 = r6.e
            int r6 = r11.h
            r20 = r3[r6]
        L_0x0060:
            int r3 = (r20 > r15 ? 1 : (r20 == r15 ? 0 : -1))
            if (r3 >= 0) goto L_0x0067
            r7 = r11
            r15 = r20
        L_0x0067:
            int r8 = r8 + 1
            r6 = 1
            r11 = 2
            goto L_0x002e
        L_0x006c:
            if (r7 != 0) goto L_0x008b
            long r2 = r0.t
            r4 = r1
            ra4 r4 = (defpackage.ra4) r4
            long r6 = r4.o
            long r2 = r2 - r6
            int r2 = (int) r2
            if (r2 < 0) goto L_0x0084
            r3 = r1
            ra4 r3 = (defpackage.ra4) r3
            r3.z(r2)
            r0.o = r5
            r0.r = r5
            goto L_0x0004
        L_0x0084:
            java.lang.String r0 = "Offset to end of mdat was negative."
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r10, r0)
            throw r0
        L_0x008b:
            boolean r2 = r7.l
            if (r2 != 0) goto L_0x0098
            zze r2 = r7.d
            long[] r2 = r2.c
            int r3 = r7.f
            r2 = r2[r3]
            goto L_0x00a0
        L_0x0098:
            pze r2 = r7.b
            long[] r2 = r2.e
            int r3 = r7.h
            r2 = r2[r3]
        L_0x00a0:
            r4 = r1
            ra4 r4 = (defpackage.ra4) r4
            long r8 = r4.o
            long r2 = r2 - r8
            int r2 = (int) r2
            if (r2 >= 0) goto L_0x00aa
            r2 = r5
        L_0x00aa:
            r3 = r1
            ra4 r3 = (defpackage.ra4) r3
            r3.z(r2)
            r0.y = r7
            r2 = r7
        L_0x00b3:
            int r3 = r0.o
            r4 = 6
            pze r6 = r2.b
            r7 = 3
            if (r3 != r7) goto L_0x0162
            boolean r3 = r2.l
            if (r3 != 0) goto L_0x00c8
            zze r3 = r2.d
            int[] r3 = r3.d
            int r7 = r2.f
            r3 = r3[r7]
            goto L_0x00ce
        L_0x00c8:
            int[] r3 = r6.g
            int r7 = r2.f
            r3 = r3[r7]
        L_0x00ce:
            r0.z = r3
            int r7 = r2.f
            int r8 = r2.i
            if (r7 >= r8) goto L_0x010f
            ra4 r1 = (defpackage.ra4) r1
            r1.z(r3)
            nze r1 = r2.a()
            if (r1 != 0) goto L_0x00e2
            goto L_0x0101
        L_0x00e2:
            java.lang.Object r3 = r6.q
            yaf r3 = (defpackage.yaf) r3
            int r1 = r1.d
            if (r1 == 0) goto L_0x00ed
            r3.I(r1)
        L_0x00ed:
            int r1 = r2.f
            boolean r7 = r6.j
            if (r7 == 0) goto L_0x0101
            boolean[] r6 = r6.k
            boolean r1 = r6[r1]
            if (r1 == 0) goto L_0x0101
            int r1 = r3.A()
            int r1 = r1 * r4
            r3.I(r1)
        L_0x0101:
            boolean r1 = r2.b()
            if (r1 != 0) goto L_0x0109
            r0.y = r10
        L_0x0109:
            r1 = 3
            r0.o = r1
            r0 = r5
            goto L_0x0319
        L_0x010f:
            zze r7 = r2.d
            jze r7 = r7.a
            int r7 = r7.g
            r8 = 1
            if (r7 != r8) goto L_0x0123
            r7 = 8
            int r3 = r3 - r7
            r0.z = r3
            r3 = r1
            ra4 r3 = (defpackage.ra4) r3
            r3.z(r7)
        L_0x0123:
            zze r3 = r2.d
            jze r3 = r3.a
            oy5 r3 = r3.f
            java.lang.String r3 = r3.w0
            java.lang.String r7 = "audio/ac4"
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L_0x014e
            int r3 = r0.z
            r7 = 7
            int r3 = r2.c(r3, r7)
            r0.A = r3
            int r3 = r0.z
            yaf r8 = r0.h
            defpackage.ju0.o(r3, r8)
            xze r3 = r2.a
            r3.c(r7, r8)
            int r3 = r0.A
            int r3 = r3 + r7
            r0.A = r3
            goto L_0x0156
        L_0x014e:
            int r3 = r0.z
            int r3 = r2.c(r3, r5)
            r0.A = r3
        L_0x0156:
            int r3 = r0.z
            int r7 = r0.A
            int r3 = r3 + r7
            r0.z = r3
            r3 = 4
            r0.o = r3
            r0.B = r5
        L_0x0162:
            zze r3 = r2.d
            jze r7 = r3.a
            boolean r8 = r2.l
            if (r8 != 0) goto L_0x0171
            long[] r3 = r3.f
            int r8 = r2.f
            r8 = r3[r8]
            goto L_0x0177
        L_0x0171:
            int r3 = r2.f
            long[] r8 = r6.h
            r8 = r8[r3]
        L_0x0177:
            if (r13 == 0) goto L_0x017d
            long r8 = r13.a(r8)
        L_0x017d:
            int r3 = r7.j
            xze r11 = r2.a
            if (r3 == 0) goto L_0x0277
            yaf r14 = r0.e
            byte[] r15 = r14.a
            r15[r5] = r5
            r16 = 1
            r15[r16] = r5
            r16 = 2
            r15[r16] = r5
            int r10 = r3 + 1
            r17 = 4
            int r3 = 4 - r3
        L_0x0197:
            int r4 = r0.A
            int r5 = r0.z
            if (r4 >= r5) goto L_0x0274
            int r4 = r0.B
            java.lang.String r5 = "video/hevc"
            r27 = r13
            oy5 r13 = r7.f
            if (r4 != 0) goto L_0x0219
            r4 = r1
            ra4 r4 = (defpackage.ra4) r4
            r18 = r7
            r7 = 0
            r4.h(r15, r3, r10, r7)
            r14.H(r7)
            int r4 = r14.h()
            r7 = 1
            if (r4 < r7) goto L_0x0211
            int r4 = r4 + -1
            r0.B = r4
            yaf r4 = r0.d
            r7 = 0
            r4.H(r7)
            r7 = 4
            r11.c(r7, r4)
            r4 = 1
            r11.c(r4, r14)
            xze[] r4 = r0.F
            int r4 = r4.length
            if (r4 <= 0) goto L_0x01f8
            java.lang.String r4 = r13.w0
            byte r13 = r15[r7]
            java.lang.String r7 = "video/avc"
            boolean r7 = r7.equals(r4)
            if (r7 == 0) goto L_0x01e5
            r7 = r13 & 31
            r20 = r10
            r10 = 6
            if (r7 == r10) goto L_0x01f6
            goto L_0x01e8
        L_0x01e5:
            r20 = r10
            r10 = 6
        L_0x01e8:
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x01fb
            r4 = r13 & 126(0x7e, float:1.77E-43)
            r5 = 1
            int r4 = r4 >> r5
            r5 = 39
            if (r4 != r5) goto L_0x01fb
        L_0x01f6:
            r4 = 1
            goto L_0x01fc
        L_0x01f8:
            r20 = r10
            r10 = 6
        L_0x01fb:
            r4 = 0
        L_0x01fc:
            r0.C = r4
            int r4 = r0.A
            int r4 = r4 + 5
            r0.A = r4
            int r4 = r0.z
            int r4 = r4 + r3
            r0.z = r4
            r7 = r18
            r10 = r20
        L_0x020d:
            r13 = r27
            r5 = 0
            goto L_0x0197
        L_0x0211:
            java.lang.String r0 = "Invalid NAL length"
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r1, r0)
            throw r0
        L_0x0219:
            r18 = r7
            r20 = r10
            r10 = 6
            boolean r7 = r0.C
            if (r7 == 0) goto L_0x0257
            yaf r7 = r0.f
            r7.E(r4)
            byte[] r4 = r7.a
            int r10 = r0.B
            r21 = r3
            r3 = r1
            ra4 r3 = (defpackage.ra4) r3
            r22 = r14
            r14 = 0
            r3.h(r4, r14, r10, r14)
            int r3 = r0.B
            r11.c(r3, r7)
            int r3 = r0.B
            byte[] r4 = r7.a
            int r10 = r7.c
            int r4 = defpackage.np8.O(r10, r4)
            java.lang.String r10 = r13.w0
            boolean r5 = r5.equals(r10)
            r7.H(r5)
            r7.G(r4)
            xze[] r4 = r0.F
            defpackage.fp3.r(r8, r7, r4)
            goto L_0x0261
        L_0x0257:
            r21 = r3
            r22 = r14
            r3 = 0
            int r4 = r11.a(r1, r4, r3)
            r3 = r4
        L_0x0261:
            int r4 = r0.A
            int r4 = r4 + r3
            r0.A = r4
            int r4 = r0.B
            int r4 = r4 - r3
            r0.B = r4
            r7 = r18
            r10 = r20
            r3 = r21
            r14 = r22
            goto L_0x020d
        L_0x0274:
            r27 = r13
            goto L_0x028b
        L_0x0277:
            r27 = r13
        L_0x0279:
            int r3 = r0.A
            int r4 = r0.z
            if (r3 >= r4) goto L_0x028b
            int r4 = r4 - r3
            r3 = 0
            int r4 = r11.a(r1, r4, r3)
            int r3 = r0.A
            int r3 = r3 + r4
            r0.A = r3
            goto L_0x0279
        L_0x028b:
            boolean r1 = r2.l
            if (r1 != 0) goto L_0x0298
            zze r1 = r2.d
            int[] r1 = r1.g
            int r3 = r2.f
            r6 = r1[r3]
            goto L_0x02a3
        L_0x0298:
            boolean[] r1 = r6.i
            int r3 = r2.f
            boolean r1 = r1[r3]
            if (r1 == 0) goto L_0x02a2
            r6 = 1
            goto L_0x02a3
        L_0x02a2:
            r6 = 0
        L_0x02a3:
            nze r1 = r2.a()
            if (r1 == 0) goto L_0x02af
            r1 = 1073741824(0x40000000, float:2.0)
            r1 = r1 | r6
            r23 = r1
            goto L_0x02b1
        L_0x02af:
            r23 = r6
        L_0x02b1:
            nze r1 = r2.a()
            if (r1 == 0) goto L_0x02bc
            vze r1 = r1.c
            r26 = r1
            goto L_0x02be
        L_0x02bc:
            r26 = 0
        L_0x02be:
            int r1 = r0.z
            r25 = 0
            r20 = r11
            r21 = r8
            r24 = r1
            r20.b(r21, r23, r24, r25, r26)
        L_0x02cb:
            boolean r1 = r12.isEmpty()
            if (r1 != 0) goto L_0x030c
            java.lang.Object r1 = r12.removeFirst()
            a26 r1 = (defpackage.a26) r1
            int r3 = r0.u
            int r4 = r1.c
            int r3 = r3 - r4
            r0.u = r3
            boolean r3 = r1.b
            long r4 = r1.a
            if (r3 == 0) goto L_0x02e5
            long r4 = r4 + r8
        L_0x02e5:
            r6 = r27
            if (r27 == 0) goto L_0x02ed
            long r4 = r6.a(r4)
        L_0x02ed:
            xze[] r3 = r0.E
            int r7 = r3.length
            r10 = 0
        L_0x02f1:
            if (r10 >= r7) goto L_0x0309
            r20 = r3[r10]
            int r11 = r0.u
            r26 = 0
            r23 = 1
            int r13 = r1.c
            r21 = r4
            r24 = r13
            r25 = r11
            r20.b(r21, r23, r24, r25, r26)
            int r10 = r10 + 1
            goto L_0x02f1
        L_0x0309:
            r27 = r6
            goto L_0x02cb
        L_0x030c:
            boolean r1 = r2.b()
            if (r1 != 0) goto L_0x0315
            r1 = 0
            r0.y = r1
        L_0x0315:
            r1 = 3
            r0.o = r1
            r0 = 0
        L_0x0319:
            return r0
        L_0x031a:
            int r2 = r4.size()
            r3 = 0
            r5 = 0
        L_0x0320:
            if (r5 >= r2) goto L_0x033e
            java.lang.Object r6 = r4.valueAt(r5)
            c26 r6 = (defpackage.c26) r6
            pze r6 = r6.b
            boolean r9 = r6.l
            if (r9 == 0) goto L_0x033b
            long r9 = r6.b
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 >= 0) goto L_0x033b
            java.lang.Object r3 = r4.valueAt(r5)
            c26 r3 = (defpackage.c26) r3
            r7 = r9
        L_0x033b:
            int r5 = r5 + 1
            goto L_0x0320
        L_0x033e:
            if (r3 != 0) goto L_0x0345
            r2 = 3
            r0.o = r2
            goto L_0x0004
        L_0x0345:
            r2 = r1
            ra4 r2 = (defpackage.ra4) r2
            long r4 = r2.o
            long r7 = r7 - r4
            int r2 = (int) r7
            if (r2 < 0) goto L_0x0369
            r4 = r1
            ra4 r4 = (defpackage.ra4) r4
            r4.z(r2)
            pze r2 = r3.b
            java.lang.Object r3 = r2.q
            yaf r3 = (defpackage.yaf) r3
            byte[] r5 = r3.a
            int r6 = r3.c
            r7 = 0
            r4.h(r5, r7, r6, r7)
            r3.H(r7)
            r2.l = r7
            goto L_0x0004
        L_0x0369:
            java.lang.String r0 = "Offset to encryption data was negative."
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r1, r0)
            throw r0
        L_0x0371:
            r6 = r13
            long r4 = r0.q
            int r2 = (int) r4
            int r4 = r0.r
            int r2 = r2 - r4
            yaf r4 = r0.s
            if (r4 == 0) goto L_0x057f
            byte[] r5 = r4.a
            r9 = r1
            ra4 r9 = (defpackage.ra4) r9
            r10 = 0
            r11 = 8
            r9.h(r5, r11, r2, r10)
            my r2 = new my
            int r5 = r0.p
            r2.<init>(r5, r4)
            r9 = r1
            ra4 r9 = (defpackage.ra4) r9
            long r9 = r9.o
            boolean r11 = r3.isEmpty()
            if (r11 != 0) goto L_0x03a6
            java.lang.Object r3 = r3.peek()
            ky r3 = (defpackage.ky) r3
            java.util.ArrayList r3 = r3.o
            r3.add(r2)
            goto L_0x0585
        L_0x03a6:
            if (r5 != r8) goto L_0x045d
            r2 = 8
            r4.H(r2)
            int r2 = r4.h()
            int r2 = defpackage.oy.s(r2)
            r3 = 4
            r4.I(r3)
            long r5 = r4.w()
            if (r2 != 0) goto L_0x03c9
            long r2 = r4.w()
            long r7 = r4.w()
        L_0x03c7:
            long r7 = r7 + r9
            goto L_0x03d2
        L_0x03c9:
            long r2 = r4.z()
            long r7 = r4.z()
            goto L_0x03c7
        L_0x03d2:
            r21 = 1000000(0xf4240, double:4.940656E-318)
            r19 = r2
            r23 = r5
            long r9 = defpackage.maf.J(r19, r21, r23)
            r11 = 2
            r4.I(r11)
            int r11 = r4.A()
            int[] r12 = new int[r11]
            long[] r13 = new long[r11]
            long[] r14 = new long[r11]
            long[] r15 = new long[r11]
            r25 = r7
            r19 = r9
            r7 = 0
        L_0x03f2:
            if (r7 >= r11) goto L_0x0438
            int r8 = r4.h()
            r18 = -2147483648(0xffffffff80000000, float:-0.0)
            r18 = r8 & r18
            if (r18 != 0) goto L_0x0430
            long r21 = r4.w()
            r18 = 2147483647(0x7fffffff, float:NaN)
            r8 = r8 & r18
            r12[r7] = r8
            r13[r7] = r25
            r15[r7] = r19
            long r2 = r2 + r21
            r21 = 1000000(0xf4240, double:4.940656E-318)
            r19 = r2
            r23 = r5
            long r19 = defpackage.maf.J(r19, r21, r23)
            r21 = r15[r7]
            long r21 = r19 - r21
            r14[r7] = r21
            r8 = 4
            r4.I(r8)
            r8 = r12[r7]
            r21 = r2
            long r2 = (long) r8
            long r25 = r25 + r2
            int r7 = r7 + 1
            r2 = r21
            goto L_0x03f2
        L_0x0430:
            java.lang.String r0 = "Unhandled indirect reference"
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r1, r0)
            throw r0
        L_0x0438:
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            l13 r3 = new l13
            r3.<init>(r12, r13, r14, r15)
            android.util.Pair r2 = android.util.Pair.create(r2, r3)
            java.lang.Object r3 = r2.first
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            r0.x = r3
            oa5 r3 = r0.D
            java.lang.Object r2 = r2.second
            u1d r2 = (defpackage.u1d) r2
            r3.M(r2)
            r2 = 1
            r0.G = r2
            goto L_0x0585
        L_0x045d:
            if (r5 != r7) goto L_0x0585
            xze[] r2 = r0.E
            int r2 = r2.length
            if (r2 != 0) goto L_0x0466
            goto L_0x0585
        L_0x0466:
            r2 = 8
            r4.H(r2)
            int r2 = r4.h()
            int r2 = defpackage.oy.s(r2)
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L_0x04b6
            r3 = 1
            if (r2 == r3) goto L_0x047f
            goto L_0x0585
        L_0x047f:
            long r2 = r4.w()
            long r13 = r4.z()
            r15 = 1000000(0xf4240, double:4.940656E-318)
            r17 = r2
            long r9 = defpackage.maf.J(r13, r15, r17)
            long r13 = r4.w()
            r15 = 1000(0x3e8, double:4.94E-321)
            long r2 = defpackage.maf.J(r13, r15, r17)
            long r13 = r4.w()
            java.lang.String r5 = r4.q()
            r5.getClass()
            java.lang.String r11 = r4.q()
            r11.getClass()
            r30 = r2
            r28 = r5
            r2 = r7
            r29 = r11
            r32 = r13
            goto L_0x04fc
        L_0x04b6:
            java.lang.String r5 = r4.q()
            r5.getClass()
            java.lang.String r11 = r4.q()
            r11.getClass()
            long r2 = r4.w()
            long r13 = r4.w()
            r15 = 1000000(0xf4240, double:4.940656E-318)
            r17 = r2
            long r9 = defpackage.maf.J(r13, r15, r17)
            long r13 = r0.x
            int r15 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r15 == 0) goto L_0x04df
            long r13 = r13 + r9
            r19 = r13
            goto L_0x04e1
        L_0x04df:
            r19 = r7
        L_0x04e1:
            long r13 = r4.w()
            r15 = 1000(0x3e8, double:4.94E-321)
            r17 = r2
            long r2 = defpackage.maf.J(r13, r15, r17)
            long r13 = r4.w()
            r30 = r2
            r28 = r5
            r2 = r9
            r29 = r11
            r32 = r13
            r9 = r19
        L_0x04fc:
            int r5 = r4.c()
            byte[] r5 = new byte[r5]
            int r11 = r4.c()
            r13 = 0
            r4.g(r13, r5, r11)
            c45 r4 = new c45
            r27 = r4
            r34 = r5
            r27.<init>(r28, r29, r30, r32, r34)
            yaf r5 = new yaf
            y7g r11 = r0.j
            byte[] r4 = r11.w(r4)
            r5.<init>((byte[]) r4)
            int r4 = r5.c()
            xze[] r11 = r0.E
            int r13 = r11.length
            r14 = 0
        L_0x0526:
            if (r14 >= r13) goto L_0x0539
            r15 = r11[r14]
            r7 = 0
            r5.H(r7)
            r15.c(r4, r5)
            int r14 = r14 + 1
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0526
        L_0x0539:
            int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x054c
            a26 r5 = new a26
            r6 = 1
            r5.<init>(r4, r2, r6)
            r12.addLast(r5)
            int r2 = r0.u
            int r2 = r2 + r4
            r0.u = r2
            goto L_0x0585
        L_0x054c:
            boolean r2 = r12.isEmpty()
            if (r2 != 0) goto L_0x0561
            a26 r2 = new a26
            r3 = 0
            r2.<init>(r4, r9, r3)
            r12.addLast(r2)
            int r2 = r0.u
            int r2 = r2 + r4
            r0.u = r2
            goto L_0x0585
        L_0x0561:
            if (r6 == 0) goto L_0x0567
            long r9 = r6.a(r9)
        L_0x0567:
            xze[] r2 = r0.E
            int r3 = r2.length
            r5 = 0
        L_0x056b:
            if (r5 >= r3) goto L_0x0585
            r19 = r2[r5]
            r25 = 0
            r22 = 1
            r24 = 0
            r20 = r9
            r23 = r4
            r19.b(r20, r22, r23, r24, r25)
            int r5 = r5 + 1
            goto L_0x056b
        L_0x057f:
            r3 = r1
            ra4 r3 = (defpackage.ra4) r3
            r3.z(r2)
        L_0x0585:
            r2 = r1
            ra4 r2 = (defpackage.ra4) r2
            long r2 = r2.o
            r0.c(r2)
            goto L_0x0004
        L_0x058f:
            int r2 = r0.r
            yaf r5 = r0.k
            if (r2 != 0) goto L_0x05b7
            byte[] r2 = r5.a
            r6 = r1
            ra4 r6 = (defpackage.ra4) r6
            r9 = 0
            r10 = 1
            r11 = 8
            boolean r2 = r6.h(r2, r9, r11, r10)
            if (r2 != 0) goto L_0x05a6
            r0 = -1
            return r0
        L_0x05a6:
            r0.r = r11
            r5.H(r9)
            long r9 = r5.w()
            r0.q = r9
            int r2 = r5.h()
            r0.p = r2
        L_0x05b7:
            long r9 = r0.q
            r11 = 1
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x05d6
            byte[] r2 = r5.a
            r6 = r1
            ra4 r6 = (defpackage.ra4) r6
            r9 = 0
            r10 = 8
            r6.h(r2, r10, r10, r9)
            int r2 = r0.r
            int r2 = r2 + r10
            r0.r = r2
            long r9 = r5.z()
            r0.q = r9
            goto L_0x0605
        L_0x05d6:
            r11 = 0
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x0605
            r2 = r1
            ra4 r2 = (defpackage.ra4) r2
            long r9 = r2.c
            r11 = -1
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x05f5
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L_0x05f5
            java.lang.Object r2 = r3.peek()
            ky r2 = (defpackage.ky) r2
            long r9 = r2.c
        L_0x05f5:
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 == 0) goto L_0x0605
            r2 = r1
            ra4 r2 = (defpackage.ra4) r2
            long r11 = r2.o
            long r9 = r9 - r11
            int r2 = r0.r
            long r11 = (long) r2
            long r9 = r9 + r11
            r0.q = r9
        L_0x0605:
            long r9 = r0.q
            int r2 = r0.r
            long r11 = (long) r2
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 < 0) goto L_0x0786
            r6 = r1
            ra4 r6 = (defpackage.ra4) r6
            long r9 = r6.o
            long r11 = (long) r2
            long r9 = r9 - r11
            int r2 = r0.p
            r6 = 1835295092(0x6d646174, float:4.4175247E27)
            r11 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r2 == r11) goto L_0x0621
            if (r2 != r6) goto L_0x0634
        L_0x0621:
            boolean r2 = r0.G
            if (r2 != 0) goto L_0x0634
            oa5 r2 = r0.D
            pm5 r12 = new pm5
            long r13 = r0.w
            r12.<init>((long) r13, (long) r9)
            r2.M(r12)
            r2 = 1
            r0.G = r2
        L_0x0634:
            int r2 = r0.p
            if (r2 != r11) goto L_0x0651
            int r2 = r4.size()
            r12 = 0
        L_0x063d:
            if (r12 >= r2) goto L_0x0651
            java.lang.Object r13 = r4.valueAt(r12)
            c26 r13 = (defpackage.c26) r13
            pze r13 = r13.b
            r13.getClass()
            r13.b = r9
            r13.a = r9
            int r12 = r12 + 1
            goto L_0x063d
        L_0x0651:
            int r2 = r0.p
            if (r2 != r6) goto L_0x0662
            r4 = 0
            r0.y = r4
            long r2 = r0.q
            long r9 = r9 + r2
            r0.t = r9
            r2 = 2
            r0.o = r2
            goto L_0x0004
        L_0x0662:
            r4 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r2 == r4) goto L_0x075e
            r4 = 1953653099(0x7472616b, float:7.681346E31)
            if (r2 == r4) goto L_0x075e
            r4 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r2 == r4) goto L_0x075e
            r4 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r2 == r4) goto L_0x075e
            r4 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r2 == r4) goto L_0x075e
            if (r2 == r11) goto L_0x075e
            r4 = 1953653094(0x74726166, float:7.6813435E31)
            if (r2 == r4) goto L_0x075e
            r4 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r2 == r4) goto L_0x075e
            r4 = 1701082227(0x65647473, float:6.742798E22)
            if (r2 != r4) goto L_0x068e
            goto L_0x075e
        L_0x068e:
            r3 = 1751411826(0x68646c72, float:4.3148E24)
            r9 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r2 == r3) goto L_0x072d
            r3 = 1835296868(0x6d646864, float:4.418049E27)
            if (r2 == r3) goto L_0x072d
            r3 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r2 == r3) goto L_0x072d
            if (r2 == r8) goto L_0x072d
            r3 = 1937011556(0x73747364, float:1.9367383E31)
            if (r2 == r3) goto L_0x072d
            r3 = 1937011827(0x73747473, float:1.9367711E31)
            if (r2 == r3) goto L_0x072d
            r3 = 1668576371(0x63747473, float:4.5093966E21)
            if (r2 == r3) goto L_0x072d
            r3 = 1937011555(0x73747363, float:1.9367382E31)
            if (r2 == r3) goto L_0x072d
            r3 = 1937011578(0x7374737a, float:1.936741E31)
            if (r2 == r3) goto L_0x072d
            r3 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r2 == r3) goto L_0x072d
            r3 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r2 == r3) goto L_0x072d
            r3 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r2 == r3) goto L_0x072d
            r3 = 1937011571(0x73747373, float:1.9367401E31)
            if (r2 == r3) goto L_0x072d
            r3 = 1952867444(0x74666474, float:7.3014264E31)
            if (r2 == r3) goto L_0x072d
            r3 = 1952868452(0x74666864, float:7.301914E31)
            if (r2 == r3) goto L_0x072d
            r3 = 1953196132(0x746b6864, float:7.46037E31)
            if (r2 == r3) goto L_0x072d
            r3 = 1953654136(0x74726578, float:7.6818474E31)
            if (r2 == r3) goto L_0x072d
            r3 = 1953658222(0x7472756e, float:7.683823E31)
            if (r2 == r3) goto L_0x072d
            r3 = 1886614376(0x70737368, float:3.013775E29)
            if (r2 == r3) goto L_0x072d
            r3 = 1935763834(0x7361697a, float:1.785898E31)
            if (r2 == r3) goto L_0x072d
            r3 = 1935763823(0x7361696f, float:1.7858967E31)
            if (r2 == r3) goto L_0x072d
            r3 = 1936027235(0x73656e63, float:1.8177412E31)
            if (r2 == r3) goto L_0x072d
            r3 = 1970628964(0x75756964, float:3.1109627E32)
            if (r2 == r3) goto L_0x072d
            r3 = 1935828848(0x73626770, float:1.7937577E31)
            if (r2 == r3) goto L_0x072d
            r3 = 1936158820(0x73677064, float:1.8336489E31)
            if (r2 == r3) goto L_0x072d
            r3 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r2 == r3) goto L_0x072d
            r3 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r2 == r3) goto L_0x072d
            if (r2 != r7) goto L_0x0718
            goto L_0x072d
        L_0x0718:
            long r2 = r0.q
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 > 0) goto L_0x0726
            r2 = 0
            r0.s = r2
            r2 = 1
            r0.o = r2
            goto L_0x0004
        L_0x0726:
            java.lang.String r0 = "Skipping atom with length > 2147483647 (unsupported)."
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.c(r0)
            throw r0
        L_0x072d:
            int r2 = r0.r
            r3 = 8
            if (r2 != r3) goto L_0x0757
            long r2 = r0.q
            int r4 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r4 > 0) goto L_0x0750
            yaf r4 = new yaf
            int r2 = (int) r2
            r4.<init>((int) r2)
            byte[] r2 = r5.a
            byte[] r3 = r4.a
            r5 = 0
            r6 = 8
            java.lang.System.arraycopy(r2, r5, r3, r5, r6)
            r0.s = r4
            r2 = 1
            r0.o = r2
            goto L_0x0004
        L_0x0750:
            java.lang.String r0 = "Leaf atom with length > 2147483647 (unsupported)."
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.c(r0)
            throw r0
        L_0x0757:
            java.lang.String r0 = "Leaf atom defines extended atom size (unsupported)."
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.c(r0)
            throw r0
        L_0x075e:
            r4 = r1
            ra4 r4 = (defpackage.ra4) r4
            long r4 = r4.o
            long r6 = r0.q
            long r4 = r4 + r6
            r6 = 8
            long r4 = r4 - r6
            ky r6 = new ky
            r6.<init>(r2, r4)
            r3.push(r6)
            long r2 = r0.q
            int r6 = r0.r
            long r6 = (long) r6
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x077f
            r0.c(r4)
            goto L_0x0004
        L_0x077f:
            r2 = 0
            r0.o = r2
            r0.r = r2
            goto L_0x0004
        L_0x0786:
            java.lang.String r0 = "Atom size less than header length (unsupported)."
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.c(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e26.i(ma5, lh4):int");
    }

    public final void release() {
    }
}
