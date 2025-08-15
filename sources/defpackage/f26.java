package defpackage;

import android.util.SparseArray;
import androidx.media3.common.ParserException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import org.apache.http.HttpStatus;

/* renamed from: f26  reason: default package */
public final class f26 implements la5 {
    public static final byte[] U0 = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final qy5 V0;
    public ffc A0;
    public int B0;
    public int C0;
    public long D0;
    public int E0;
    public wpa F0;
    public long G0;
    public int H0;
    public long I0;
    public long J0;
    public long K0;
    public d26 L0;
    public int M0;
    public int N0;
    public int O0;
    public boolean P0;
    public pa5 Q0;
    public yze[] R0;
    public yze[] S0;
    public boolean T0;
    public final wpa X;
    public final wpa Y;
    public final wpa Z;
    public final mbe a;
    public final int b;
    public final List c;
    public final SparseArray o;
    public final byte[] s0;
    public final wpa t0;
    public final tue u0;
    public final ph4 v0;
    public final wpa w0;
    public final ArrayDeque x0;
    public final ArrayDeque y0;
    public final yze z0;

    static {
        ny5 ny5 = new ny5();
        ny5.m = ia9.l("application/x-emsg");
        V0 = ny5.a();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public f26(int i, mbe mbe) {
        this(mbe, i, (tue) null, ffc.X, (yze) null);
        ls5 ls5 = zw6.b;
    }

    public static dr4 a(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i = 0; i < size; i++) {
            ny nyVar = (ny) arrayList.get(i);
            if (nyVar.b == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = nyVar.c.a;
                tpb y = mqd.y(bArr);
                UUID uuid = y == null ? null : y.a;
                if (uuid == null) {
                    z04.c0("Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new br4(uuid, (String) null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new dr4((String) null, false, (br4[]) arrayList2.toArray(new br4[0]));
    }

    public static void b(wpa wpa, int i, pze pze) {
        wpa.G(i + 8);
        int g = wpa.g();
        if ((g & 1) == 0) {
            boolean z = (g & 2) != 0;
            int y = wpa.y();
            if (y == 0) {
                Arrays.fill(pze.k, 0, pze.d, false);
            } else if (y == pze.d) {
                Arrays.fill(pze.k, 0, y, z);
                int a2 = wpa.a();
                wpa wpa2 = (wpa) pze.q;
                wpa2.D(a2);
                pze.j = true;
                pze.l = true;
                wpa.e(0, wpa2.a, wpa2.c);
                wpa2.G(0);
                pze.l = false;
            } else {
                StringBuilder n = rh4.n(y, "Senc sample count ", " is different from fragment sample count");
                n.append(pze.d);
                throw ParserException.a((RuntimeException) null, n.toString());
            }
        } else {
            throw ParserException.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
    }

    public final void S(pa5 pa5) {
        int i;
        int i2 = this.b;
        if ((i2 & 32) == 0) {
            pa5 = new k8g(pa5, this.a);
        }
        this.Q0 = pa5;
        int i3 = 0;
        this.B0 = 0;
        this.E0 = 0;
        yze[] yzeArr = new yze[2];
        this.R0 = yzeArr;
        yze yze = this.z0;
        if (yze != null) {
            yzeArr[0] = yze;
            i = 1;
        } else {
            i = 0;
        }
        int i4 = 100;
        if ((i2 & 4) != 0) {
            yzeArr[i] = pa5.B(100, 5);
            i4 = HttpStatus.SC_SWITCHING_PROTOCOLS;
            i++;
        }
        yze[] yzeArr2 = (yze[]) oaf.U(i, this.R0);
        this.R0 = yzeArr2;
        for (yze e : yzeArr2) {
            e.e(V0);
        }
        List list = this.c;
        this.S0 = new yze[list.size()];
        while (i3 < this.S0.length) {
            yze B = this.Q0.B(i4, 3);
            B.e((qy5) list.get(i3));
            this.S0[i3] = B;
            i3++;
            i4++;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v36, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: id4} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x039f  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x03a1  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x03b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(long r52) {
        /*
            r51 = this;
            r0 = r51
            r5 = 1
        L_0x0003:
            java.util.ArrayDeque r6 = r0.x0
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L_0x07b6
            java.lang.Object r7 = r6.peek()
            ly r7 = (defpackage.ly) r7
            long r9 = r7.c
            int r7 = (r9 > r52 ? 1 : (r9 == r52 ? 0 : -1))
            if (r7 != 0) goto L_0x07b6
            java.lang.Object r7 = r6.pop()
            r9 = r7
            ly r9 = (defpackage.ly) r9
            int r7 = r9.b
            android.util.SparseArray r15 = r0.o
            java.util.ArrayList r10 = r9.o
            r11 = 1836019574(0x6d6f6f76, float:4.631354E27)
            int r12 = r0.b
            r13 = 12
            if (r7 != r11) goto L_0x0189
            dr4 r6 = a(r10)
            r7 = 1836475768(0x6d766578, float:4.7659988E27)
            ly r7 = r9.v(r7)
            r7.getClass()
            android.util.SparseArray r14 = new android.util.SparseArray
            r14.<init>()
            java.util.ArrayList r7 = r7.o
            int r10 = r7.size()
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r11 = 0
        L_0x004c:
            if (r11 >= r10) goto L_0x00bf
            java.lang.Object r16 = r7.get(r11)
            r1 = r16
            ny r1 = (defpackage.ny) r1
            int r8 = r1.b
            r2 = 1953654136(0x74726578, float:7.6818474E31)
            wpa r1 = r1.c
            if (r8 != r2) goto L_0x0096
            r1.G(r13)
            int r2 = r1.g()
            int r8 = r1.g()
            int r8 = r8 - r5
            int r13 = r1.g()
            int r5 = r1.g()
            int r1 = r1.g()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r19 = r7
            id4 r7 = new id4
            r7.<init>(r8, r13, r5, r1)
            android.util.Pair r1 = android.util.Pair.create(r2, r7)
            java.lang.Object r2 = r1.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Object r1 = r1.second
            id4 r1 = (defpackage.id4) r1
            r14.put(r2, r1)
            goto L_0x00b7
        L_0x0096:
            r19 = r7
            r2 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r8 != r2) goto L_0x00b7
            r2 = 8
            r1.G(r2)
            int r2 = r1.g()
            int r2 = defpackage.oy.t(r2)
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
            r5 = r1
            r7 = r19
            r13 = 12
            goto L_0x004c
        L_0x00bf:
            r1 = r5
            ea6 r10 = new ea6
            r10.<init>()
            r2 = 16
            r5 = r12 & 16
            if (r5 == 0) goto L_0x00cd
            r2 = r1
            goto L_0x00ce
        L_0x00cd:
            r2 = 0
        L_0x00ce:
            z16 r5 = new z16
            r5.<init>(r1, r0)
            r1 = 0
            r11 = r3
            r13 = r6
            r3 = r14
            r14 = r2
            r2 = r15
            r15 = r1
            r16 = r5
            java.util.ArrayList r1 = defpackage.wy.f(r9, r10, r11, r13, r14, r15, r16)
            int r4 = r1.size()
            int r5 = r2.size()
            if (r5 != 0) goto L_0x0133
            r5 = 0
        L_0x00eb:
            if (r5 >= r4) goto L_0x012d
            java.lang.Object r6 = r1.get(r5)
            a0f r6 = (defpackage.a0f) r6
            kze r7 = r6.a
            d26 r8 = new d26
            pa5 r9 = r0.Q0
            int r10 = r7.b
            yze r9 = r9.B(r5, r10)
            int r10 = r3.size()
            int r11 = r7.a
            r12 = 1
            if (r10 != r12) goto L_0x0110
            r10 = 0
            java.lang.Object r12 = r3.valueAt(r10)
            id4 r12 = (defpackage.id4) r12
            goto L_0x011a
        L_0x0110:
            java.lang.Object r10 = r3.get(r11)
            r12 = r10
            id4 r12 = (defpackage.id4) r12
            r12.getClass()
        L_0x011a:
            r8.<init>(r9, r6, r12)
            r2.put(r11, r8)
            long r8 = r0.J0
            long r6 = r7.e
            long r6 = java.lang.Math.max(r8, r6)
            r0.J0 = r6
            r6 = 1
            int r5 = r5 + r6
            goto L_0x00eb
        L_0x012d:
            pa5 r1 = r0.Q0
            r1.w()
            goto L_0x017f
        L_0x0133:
            int r5 = r2.size()
            if (r5 != r4) goto L_0x013b
            r5 = 1
            goto L_0x013c
        L_0x013b:
            r5 = 0
        L_0x013c:
            defpackage.fm9.k(r5)
            r5 = 0
        L_0x0140:
            if (r5 >= r4) goto L_0x017f
            java.lang.Object r6 = r1.get(r5)
            a0f r6 = (defpackage.a0f) r6
            kze r7 = r6.a
            int r8 = r7.a
            java.lang.Object r8 = r2.get(r8)
            d26 r8 = (defpackage.d26) r8
            int r9 = r3.size()
            r10 = 1
            if (r9 != r10) goto L_0x0161
            r9 = 0
            java.lang.Object r7 = r3.valueAt(r9)
            id4 r7 = (defpackage.id4) r7
            goto L_0x016c
        L_0x0161:
            int r7 = r7.a
            java.lang.Object r7 = r3.get(r7)
            id4 r7 = (defpackage.id4) r7
            r7.getClass()
        L_0x016c:
            r8.d = r6
            r8.e = r7
            kze r6 = r6.a
            qy5 r6 = r6.f
            yze r7 = r8.a
            r7.e(r6)
            r8.d()
            r6 = 1
            int r5 = r5 + r6
            goto L_0x0140
        L_0x017f:
            r7 = r0
            r5 = 8
            r8 = 16
            r11 = 1
            r14 = 4
            r15 = 2
            goto L_0x07b2
        L_0x0189:
            r2 = r15
            r1 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r7 != r1) goto L_0x0799
            java.util.ArrayList r1 = r9.X
            int r5 = r1.size()
            r6 = 0
        L_0x0196:
            if (r6 >= r5) goto L_0x06f8
            java.lang.Object r8 = r1.get(r6)
            ly r8 = (defpackage.ly) r8
            int r9 = r8.b
            r11 = 1953653094(0x74726166, float:7.6813435E31)
            if (r9 != r11) goto L_0x06d3
            r9 = 1952868452(0x74666864, float:7.301914E31)
            ny r9 = r8.w(r9)
            r9.getClass()
            wpa r9 = r9.c
            r11 = 8
            r9.G(r11)
            int r11 = r9.g()
            int r13 = r9.g()
            java.lang.Object r13 = r2.get(r13)
            d26 r13 = (defpackage.d26) r13
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
            id4 r3 = r13.e
            r4 = 2
            r15 = r11 & 2
            if (r15 == 0) goto L_0x01e7
            int r4 = r9.g()
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
            int r15 = r9.g()
        L_0x01f2:
            r17 = 16
            goto L_0x01f8
        L_0x01f5:
            int r15 = r3.b
            goto L_0x01f2
        L_0x01f8:
            r20 = r11 & 16
            if (r20 == 0) goto L_0x0203
            int r20 = r9.g()
            r7 = r20
            goto L_0x0205
        L_0x0203:
            int r7 = r3.c
        L_0x0205:
            r11 = r11 & 32
            if (r11 == 0) goto L_0x020e
            int r3 = r9.g()
            goto L_0x0210
        L_0x020e:
            int r3 = r3.d
        L_0x0210:
            id4 r9 = new id4
            r9.<init>(r4, r15, r7, r3)
            r14.o = r9
        L_0x0217:
            if (r13 != 0) goto L_0x021b
            goto L_0x06d3
        L_0x021b:
            pze r3 = r13.b
            long r14 = r3.m
            boolean r4 = r3.n
            r13.d()
            r7 = 1
            r13.l = r7
            r9 = 1952867444(0x74666474, float:7.3014264E31)
            ny r9 = r8.w(r9)
            if (r9 == 0) goto L_0x0254
            r11 = 2
            r18 = r12 & 2
            if (r18 != 0) goto L_0x0254
            wpa r4 = r9.c
            r9 = 8
            r4.G(r9)
            int r9 = r4.g()
            int r9 = defpackage.oy.t(r9)
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
            r22 = r1
            r1 = r21
            ny r1 = (defpackage.ny) r1
            r21 = r5
            int r5 = r1.b
            if (r5 != r15) goto L_0x0287
            wpa r1 = r1.c
            r5 = 12
            r1.G(r5)
            int r1 = r1.y()
            if (r1 <= 0) goto L_0x0287
            int r14 = r14 + r1
            r1 = 1
            int r11 = r11 + r1
            goto L_0x0288
        L_0x0287:
            r1 = 1
        L_0x0288:
            int r9 = r9 + r1
            r5 = r21
            r1 = r22
            goto L_0x0261
        L_0x028e:
            r22 = r1
            r21 = r5
            r1 = 0
            r13.h = r1
            r13.g = r1
            r13.f = r1
            r3.c = r11
            r3.d = r14
            int[] r1 = r3.f
            int r1 = r1.length
            if (r1 >= r11) goto L_0x02aa
            long[] r1 = new long[r11]
            r3.e = r1
            int[] r1 = new int[r11]
            r3.f = r1
        L_0x02aa:
            int[] r1 = r3.g
            int r1 = r1.length
            if (r1 >= r14) goto L_0x02c3
            int r14 = r14 * 125
            int r14 = r14 / 100
            int[] r1 = new int[r14]
            r3.g = r1
            long[] r1 = new long[r14]
            r3.h = r1
            boolean[] r1 = new boolean[r14]
            r3.i = r1
            boolean[] r1 = new boolean[r14]
            r3.k = r1
        L_0x02c3:
            r1 = 0
            r5 = 0
            r9 = 0
        L_0x02c6:
            r23 = 0
            if (r1 >= r7) goto L_0x04ab
            java.lang.Object r11 = r4.get(r1)
            ny r11 = (defpackage.ny) r11
            int r14 = r11.b
            if (r14 != r15) goto L_0x0481
            r14 = 1
            int r25 = r5 + 1
            wpa r11 = r11.c
            r14 = 8
            r11.G(r14)
            int r14 = r11.g()
            a0f r15 = r13.d
            kze r15 = r15.a
            r26 = r7
            java.lang.Object r7 = r3.o
            id4 r7 = (defpackage.id4) r7
            int r27 = defpackage.oaf.a
            r27 = r2
            int[] r2 = r3.f
            int r28 = r11.y()
            r2[r5] = r28
            long[] r2 = r3.e
            r28 = r1
            long r0 = r3.a
            r2[r5] = r0
            r18 = 1
            r29 = r14 & 1
            if (r29 == 0) goto L_0x0316
            r29 = r10
            int r10 = r11.g()
            r30 = r8
            r31 = r9
            long r8 = (long) r10
            long r0 = r0 + r8
            r2[r5] = r0
        L_0x0314:
            r0 = 4
            goto L_0x031d
        L_0x0316:
            r30 = r8
            r31 = r9
            r29 = r10
            goto L_0x0314
        L_0x031d:
            r1 = r14 & 4
            if (r1 == 0) goto L_0x0323
            r0 = 1
            goto L_0x0324
        L_0x0323:
            r0 = 0
        L_0x0324:
            int r1 = r7.d
            if (r0 == 0) goto L_0x032c
            int r1 = r11.g()
        L_0x032c:
            r2 = r14 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x0332
            r2 = 1
            goto L_0x0333
        L_0x0332:
            r2 = 0
        L_0x0333:
            r8 = r14 & 512(0x200, float:7.175E-43)
            if (r8 == 0) goto L_0x0339
            r8 = 1
            goto L_0x033a
        L_0x0339:
            r8 = 0
        L_0x033a:
            r9 = r14 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L_0x0340
            r9 = 1
            goto L_0x0341
        L_0x0340:
            r9 = 0
        L_0x0341:
            r10 = r14 & 2048(0x800, float:2.87E-42)
            if (r10 == 0) goto L_0x0347
            r10 = 1
            goto L_0x0348
        L_0x0347:
            r10 = 0
        L_0x0348:
            long[] r14 = r15.h
            r32 = r1
            if (r14 == 0) goto L_0x038c
            int r1 = r14.length
            r33 = r6
            r6 = 1
            if (r1 != r6) goto L_0x0358
            long[] r1 = r15.i
            if (r1 != 0) goto L_0x035e
        L_0x0358:
            r34 = r9
            r35 = r10
            r6 = r13
            goto L_0x038f
        L_0x035e:
            r6 = 0
            r34 = r14[r6]
            int r14 = (r34 > r23 ? 1 : (r34 == r23 ? 0 : -1))
            if (r14 != 0) goto L_0x036c
            r34 = r9
            r35 = r10
            r9 = r6
            r6 = r13
            goto L_0x0389
        L_0x036c:
            r36 = r1[r6]
            long r38 = r34 + r36
            java.math.RoundingMode r44 = java.math.RoundingMode.FLOOR
            r40 = 1000000(0xf4240, double:4.940656E-318)
            r6 = r13
            long r13 = r15.d
            r42 = r13
            long r13 = defpackage.oaf.a0(r38, r40, r42, r44)
            r34 = r9
            r35 = r10
            long r9 = r15.e
            int r9 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r9 < 0) goto L_0x038f
            r9 = 0
        L_0x0389:
            r23 = r1[r9]
            goto L_0x038f
        L_0x038c:
            r33 = r6
            goto L_0x0358
        L_0x038f:
            int[] r1 = r3.g
            long[] r9 = r3.h
            boolean[] r10 = r3.i
            int r13 = r15.b
            r14 = 2
            if (r13 != r14) goto L_0x03a1
            r13 = 1
            r14 = r12 & 1
            if (r14 == 0) goto L_0x03a1
            r13 = 1
            goto L_0x03a2
        L_0x03a1:
            r13 = 0
        L_0x03a2:
            int[] r14 = r3.f
            r5 = r14[r5]
            int r5 = r31 + r5
            r14 = r12
            r36 = r13
            long r12 = r3.m
            r37 = r14
            r13 = r12
            r12 = r31
        L_0x03b2:
            if (r12 >= r5) goto L_0x0475
            if (r2 == 0) goto L_0x03c1
            int r31 = r11.g()
            r38 = r2
            r39 = r5
            r2 = r31
            goto L_0x03c7
        L_0x03c1:
            r38 = r2
            int r2 = r7.b
            r39 = r5
        L_0x03c7:
            java.lang.String r5 = "Unexpected negative value: "
            if (r2 < 0) goto L_0x0463
            if (r8 == 0) goto L_0x03d6
            int r31 = r11.g()
            r40 = r8
            r8 = r31
            goto L_0x03da
        L_0x03d6:
            r40 = r8
            int r8 = r7.c
        L_0x03da:
            if (r8 < 0) goto L_0x0451
            if (r34 == 0) goto L_0x03e3
            int r5 = r11.g()
            goto L_0x03ec
        L_0x03e3:
            if (r12 != 0) goto L_0x03ea
            if (r0 == 0) goto L_0x03ea
            r5 = r32
            goto L_0x03ec
        L_0x03ea:
            int r5 = r7.d
        L_0x03ec:
            if (r35 == 0) goto L_0x03fb
            int r31 = r11.g()
            r41 = r0
            r43 = r10
            r42 = r11
            r0 = r31
            goto L_0x0402
        L_0x03fb:
            r41 = r0
            r43 = r10
            r42 = r11
            r0 = 0
        L_0x0402:
            long r10 = (long) r0
            long r10 = r10 + r13
            long r44 = r10 - r23
            java.math.RoundingMode r50 = java.math.RoundingMode.FLOOR
            r46 = 1000000(0xf4240, double:4.940656E-318)
            long r10 = r15.c
            r48 = r10
            long r10 = defpackage.oaf.a0(r44, r46, r48, r50)
            r9[r12] = r10
            boolean r0 = r3.n
            if (r0 != 0) goto L_0x0425
            a0f r0 = r6.d
            r45 = r6
            r44 = r7
            long r6 = r0.h
            long r10 = r10 + r6
            r9[r12] = r10
            goto L_0x0429
        L_0x0425:
            r45 = r6
            r44 = r7
        L_0x0429:
            r1[r12] = r8
            r0 = 16
            int r5 = r5 >> r0
            r0 = 1
            r5 = r5 & r0
            if (r5 != 0) goto L_0x0438
            if (r36 == 0) goto L_0x0436
            if (r12 != 0) goto L_0x0438
        L_0x0436:
            r0 = 1
            goto L_0x0439
        L_0x0438:
            r0 = 0
        L_0x0439:
            r43[r12] = r0
            long r5 = (long) r2
            long r13 = r13 + r5
            r0 = 1
            int r12 = r12 + r0
            r2 = r38
            r5 = r39
            r8 = r40
            r0 = r41
            r11 = r42
            r10 = r43
            r7 = r44
            r6 = r45
            goto L_0x03b2
        L_0x0451:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r1, r0)
            throw r0
        L_0x0463:
            r1 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r1, r0)
            throw r0
        L_0x0475:
            r39 = r5
            r45 = r6
            r3.m = r13
            r5 = r25
            r9 = r39
        L_0x047f:
            r0 = 1
            goto L_0x0494
        L_0x0481:
            r28 = r1
            r27 = r2
            r33 = r6
            r26 = r7
            r30 = r8
            r31 = r9
            r29 = r10
            r37 = r12
            r45 = r13
            goto L_0x047f
        L_0x0494:
            int r1 = r28 + 1
            r0 = r51
            r7 = r26
            r2 = r27
            r10 = r29
            r8 = r30
            r6 = r33
            r12 = r37
            r13 = r45
            r15 = 1953658222(0x7472756e, float:7.683823E31)
            goto L_0x02c6
        L_0x04ab:
            r27 = r2
            r33 = r6
            r30 = r8
            r29 = r10
            r37 = r12
            a0f r0 = r13.d
            kze r0 = r0.a
            java.lang.Object r1 = r3.o
            id4 r1 = (defpackage.id4) r1
            r1.getClass()
            oze[] r0 = r0.k
            if (r0 != 0) goto L_0x04c6
            r1 = 0
            goto L_0x04cb
        L_0x04c6:
            int r1 = r1.a
            r0 = r0[r1]
            r1 = r0
        L_0x04cb:
            r0 = 1935763834(0x7361697a, float:1.785898E31)
            r8 = r30
            ny r0 = r8.w(r0)
            if (r0 == 0) goto L_0x054c
            r1.getClass()
            wpa r0 = r0.c
            r2 = 8
            r0.G(r2)
            int r5 = r0.g()
            r6 = 1
            r5 = r5 & r6
            if (r5 != r6) goto L_0x04eb
            r0.H(r2)
        L_0x04eb:
            int r2 = r0.u()
            int r5 = r0.y()
            int r6 = r3.d
            if (r5 > r6) goto L_0x0535
            int r6 = r1.d
            if (r2 != 0) goto L_0x0512
            boolean[] r2 = r3.k
            r7 = 0
            r9 = 0
        L_0x04ff:
            if (r7 >= r5) goto L_0x0510
            int r10 = r0.u()
            int r9 = r9 + r10
            if (r10 <= r6) goto L_0x050a
            r10 = 1
            goto L_0x050b
        L_0x050a:
            r10 = 0
        L_0x050b:
            r2[r7] = r10
            r10 = 1
            int r7 = r7 + r10
            goto L_0x04ff
        L_0x0510:
            r6 = 0
            goto L_0x051f
        L_0x0512:
            if (r2 <= r6) goto L_0x0516
            r0 = 1
            goto L_0x0517
        L_0x0516:
            r0 = 0
        L_0x0517:
            int r9 = r2 * r5
            boolean[] r2 = r3.k
            r6 = 0
            java.util.Arrays.fill(r2, r6, r5, r0)
        L_0x051f:
            boolean[] r0 = r3.k
            int r2 = r3.d
            java.util.Arrays.fill(r0, r5, r2, r6)
            if (r9 <= 0) goto L_0x054c
            java.lang.Object r0 = r3.q
            wpa r0 = (defpackage.wpa) r0
            r0.D(r9)
            r0 = 1
            r3.j = r0
            r3.l = r0
            goto L_0x054c
        L_0x0535:
            java.lang.String r0 = "Saiz sample count "
            java.lang.String r1 = " is greater than fragment sample count"
            java.lang.StringBuilder r0 = defpackage.rh4.n(r5, r0, r1)
            int r1 = r3.d
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r1, r0)
            throw r0
        L_0x054c:
            r0 = 1935763823(0x7361696f, float:1.7858967E31)
            ny r0 = r8.w(r0)
            if (r0 == 0) goto L_0x0582
            wpa r0 = r0.c
            r2 = 8
            r0.G(r2)
            int r5 = r0.g()
            r6 = 1
            r7 = r5 & 1
            if (r7 != r6) goto L_0x0568
            r0.H(r2)
        L_0x0568:
            int r2 = r0.y()
            if (r2 != r6) goto L_0x0584
            int r2 = defpackage.oy.t(r5)
            long r5 = r3.b
            if (r2 != 0) goto L_0x057b
            long r9 = r0.w()
            goto L_0x057f
        L_0x057b:
            long r9 = r0.z()
        L_0x057f:
            long r5 = r5 + r9
            r3.b = r5
        L_0x0582:
            r2 = 0
            goto L_0x0598
        L_0x0584:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unexpected saio entry count: "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r2 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r2, r0)
            throw r0
        L_0x0598:
            r0 = 1936027235(0x73656e63, float:1.8177412E31)
            ny r0 = r8.w(r0)
            if (r0 == 0) goto L_0x05a7
            wpa r0 = r0.c
            r5 = 0
            b(r0, r5, r3)
        L_0x05a7:
            if (r1 == 0) goto L_0x05ad
            java.lang.String r1 = r1.b
            r7 = r1
            goto L_0x05ae
        L_0x05ad:
            r7 = r2
        L_0x05ae:
            r0 = r2
            r1 = r0
            r5 = 0
        L_0x05b1:
            int r6 = r4.size()
            if (r5 >= r6) goto L_0x05eb
            java.lang.Object r6 = r4.get(r5)
            ny r6 = (defpackage.ny) r6
            wpa r8 = r6.c
            r9 = 1935828848(0x73626770, float:1.7937577E31)
            r10 = 1936025959(0x73656967, float:1.817587E31)
            int r6 = r6.b
            if (r6 != r9) goto L_0x05d7
            r13 = 12
            r8.G(r13)
            int r6 = r8.g()
            if (r6 != r10) goto L_0x05d5
            r1 = r8
        L_0x05d5:
            r6 = 1
            goto L_0x05e9
        L_0x05d7:
            r13 = 12
            r9 = 1936158820(0x73677064, float:1.8336489E31)
            if (r6 != r9) goto L_0x05d5
            r8.G(r13)
            int r6 = r8.g()
            if (r6 != r10) goto L_0x05d5
            r0 = r8
            goto L_0x05d5
        L_0x05e9:
            int r5 = r5 + r6
            goto L_0x05b1
        L_0x05eb:
            r6 = 1
            r13 = 12
            if (r1 == 0) goto L_0x05f2
            if (r0 != 0) goto L_0x05f6
        L_0x05f2:
            r14 = 4
            r15 = 2
            goto L_0x068f
        L_0x05f6:
            r5 = 8
            r1.G(r5)
            int r8 = r1.g()
            int r8 = defpackage.oy.t(r8)
            r14 = 4
            r1.H(r14)
            if (r8 != r6) goto L_0x060c
            r1.H(r14)
        L_0x060c:
            int r1 = r1.g()
            if (r1 != r6) goto L_0x0688
            r0.G(r5)
            int r1 = r0.g()
            int r1 = defpackage.oy.t(r1)
            r0.H(r14)
            if (r1 != r6) goto L_0x0633
            long r5 = r0.w()
            int r1 = (r5 > r23 ? 1 : (r5 == r23 ? 0 : -1))
            if (r1 == 0) goto L_0x062c
            r15 = 2
            goto L_0x0639
        L_0x062c:
            java.lang.String r0 = "Variable length description in sgpd found (unsupported)"
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.c(r0)
            throw r0
        L_0x0633:
            r15 = 2
            if (r1 < r15) goto L_0x0639
            r0.H(r14)
        L_0x0639:
            long r5 = r0.w()
            r8 = 1
            int r1 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x0681
            r1 = 1
            r0.H(r1)
            int r5 = r0.u()
            r6 = r5 & 240(0xf0, float:3.36E-43)
            int r10 = r6 >> 4
            r11 = r5 & 15
            int r5 = r0.u()
            if (r5 != r1) goto L_0x0659
            r6 = 1
            goto L_0x065a
        L_0x0659:
            r6 = 0
        L_0x065a:
            if (r6 != 0) goto L_0x065d
            goto L_0x068f
        L_0x065d:
            int r8 = r0.u()
            r1 = 16
            byte[] r9 = new byte[r1]
            r5 = 0
            r0.e(r5, r9, r1)
            if (r8 != 0) goto L_0x0674
            int r1 = r0.u()
            byte[] r2 = new byte[r1]
            r0.e(r5, r2, r1)
        L_0x0674:
            r12 = r2
            r0 = 1
            r3.j = r0
            oze r0 = new oze
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r3.p = r0
            goto L_0x068f
        L_0x0681:
            java.lang.String r0 = "Entry count in sgpd != 1 (unsupported)."
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.c(r0)
            throw r0
        L_0x0688:
            java.lang.String r0 = "Entry count in sbgp != 1 (unsupported)."
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.c(r0)
            throw r0
        L_0x068f:
            int r0 = r4.size()
            r10 = 0
        L_0x0694:
            if (r10 >= r0) goto L_0x06cb
            java.lang.Object r1 = r4.get(r10)
            ny r1 = (defpackage.ny) r1
            int r2 = r1.b
            r5 = 1970628964(0x75756964, float:3.1109627E32)
            if (r2 != r5) goto L_0x06c2
            wpa r1 = r1.c
            r5 = 8
            r1.G(r5)
            r7 = r51
            byte[] r2 = r7.s0
            r6 = 0
            r8 = 16
            r1.e(r6, r2, r8)
            byte[] r6 = U0
            boolean r2 = java.util.Arrays.equals(r2, r6)
            if (r2 != 0) goto L_0x06bd
            goto L_0x06c0
        L_0x06bd:
            b(r1, r8, r3)
        L_0x06c0:
            r1 = 1
            goto L_0x06c9
        L_0x06c2:
            r5 = 8
            r8 = 16
            r7 = r51
            goto L_0x06c0
        L_0x06c9:
            int r10 = r10 + r1
            goto L_0x0694
        L_0x06cb:
            r1 = 1
            r5 = 8
            r8 = 16
            r7 = r51
            goto L_0x06e9
        L_0x06d3:
            r7 = r0
            r22 = r1
            r27 = r2
            r21 = r5
            r33 = r6
            r29 = r10
            r37 = r12
            r1 = 1
            r5 = 8
            r8 = 16
            r13 = 12
            r14 = 4
            r15 = 2
        L_0x06e9:
            int r6 = r33 + 1
            r0 = r7
            r5 = r21
            r1 = r22
            r2 = r27
            r10 = r29
            r12 = r37
            goto L_0x0196
        L_0x06f8:
            r7 = r0
            r27 = r2
            r29 = r10
            r2 = 0
            r5 = 8
            r8 = 16
            r14 = 4
            r15 = 2
            dr4 r0 = a(r29)
            if (r0 == 0) goto L_0x0754
            int r1 = r27.size()
            r10 = 0
        L_0x070f:
            if (r10 >= r1) goto L_0x0754
            r3 = r27
            java.lang.Object r4 = r3.valueAt(r10)
            d26 r4 = (defpackage.d26) r4
            a0f r6 = r4.d
            kze r6 = r6.a
            pze r9 = r4.b
            java.lang.Object r9 = r9.o
            id4 r9 = (defpackage.id4) r9
            int r11 = defpackage.oaf.a
            int r9 = r9.a
            oze[] r6 = r6.k
            if (r6 != 0) goto L_0x072d
            r6 = r2
            goto L_0x072f
        L_0x072d:
            r6 = r6[r9]
        L_0x072f:
            if (r6 == 0) goto L_0x0734
            java.lang.String r6 = r6.b
            goto L_0x0735
        L_0x0734:
            r6 = r2
        L_0x0735:
            dr4 r6 = r0.a(r6)
            a0f r9 = r4.d
            kze r9 = r9.a
            qy5 r9 = r9.f
            ny5 r9 = r9.a()
            r9.q = r6
            qy5 r6 = new qy5
            r6.<init>(r9)
            yze r4 = r4.a
            r4.e(r6)
            r4 = 1
            int r10 = r10 + r4
            r27 = r3
            goto L_0x070f
        L_0x0754:
            r3 = r27
            long r0 = r7.I0
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0797
            int r0 = r3.size()
            r1 = 0
        L_0x0766:
            if (r1 >= r0) goto L_0x078e
            java.lang.Object r2 = r3.valueAt(r1)
            d26 r2 = (defpackage.d26) r2
            long r9 = r7.I0
            int r4 = r2.f
        L_0x0772:
            pze r6 = r2.b
            int r11 = r6.d
            if (r4 >= r11) goto L_0x078b
            long[] r11 = r6.h
            r11 = r11[r4]
            int r11 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r11 > 0) goto L_0x078b
            boolean[] r6 = r6.i
            boolean r6 = r6[r4]
            if (r6 == 0) goto L_0x0788
            r2.i = r4
        L_0x0788:
            r11 = 1
            int r4 = r4 + r11
            goto L_0x0772
        L_0x078b:
            r11 = 1
            int r1 = r1 + r11
            goto L_0x0766
        L_0x078e:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r11 = 1
            r7.I0 = r1
            goto L_0x07b2
        L_0x0797:
            r11 = 1
            goto L_0x07b2
        L_0x0799:
            r7 = r0
            r5 = 8
            r8 = 16
            r11 = 1
            r14 = 4
            r15 = 2
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x07b2
            java.lang.Object r0 = r6.peek()
            ly r0 = (defpackage.ly) r0
            java.util.ArrayList r0 = r0.X
            r0.add(r9)
        L_0x07b2:
            r0 = r7
            r5 = r11
            goto L_0x0003
        L_0x07b6:
            r7 = r0
            r0 = 0
            r7.B0 = r0
            r7.E0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f26.c(long):void");
    }

    public final void d(long j, long j2) {
        SparseArray sparseArray = this.o;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((d26) sparseArray.valueAt(i)).d();
        }
        this.y0.clear();
        this.H0 = 0;
        this.I0 = j2;
        this.x0.clear();
        this.B0 = 0;
        this.E0 = 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: d26} */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01e1, code lost:
        if ((r8 & 31) != 6) goto L_0x01e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01f1, code lost:
        if (((r8 & 126) >> 1) == 39) goto L_0x01f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01f3, code lost:
        r2 = true;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int g(defpackage.na5 r30, defpackage.lh4 r31) {
        /*
            r29 = this;
            r0 = r29
            r1 = r30
        L_0x0004:
            r2 = 1
        L_0x0005:
            int r3 = r0.B0
            java.util.ArrayDeque r4 = r0.x0
            android.util.SparseArray r5 = r0.o
            r6 = 0
            r7 = 1701671783(0x656d7367, float:7.0083103E22)
            r8 = 1936286840(0x73696478, float:1.8491255E31)
            r11 = 2
            if (r3 == 0) goto L_0x05b9
            java.util.ArrayDeque r12 = r0.y0
            tue r13 = r0.u0
            if (r3 == r2) goto L_0x0368
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 == r11) goto L_0x0311
            d26 r3 = r0.L0
            if (r3 != 0) goto L_0x00b5
            int r3 = r5.size()
            r15 = r7
            r7 = 0
            r8 = r6
        L_0x002d:
            if (r8 >= r3) goto L_0x0068
            java.lang.Object r17 = r5.valueAt(r8)
            r11 = r17
            d26 r11 = (defpackage.d26) r11
            boolean r14 = r11.l
            if (r14 != 0) goto L_0x0043
            int r9 = r11.f
            a0f r4 = r11.d
            int r4 = r4.b
            if (r9 == r4) goto L_0x0065
        L_0x0043:
            pze r4 = r11.b
            if (r14 == 0) goto L_0x004e
            int r9 = r11.h
            int r10 = r4.c
            if (r9 != r10) goto L_0x004e
            goto L_0x0065
        L_0x004e:
            if (r14 != 0) goto L_0x0059
            a0f r4 = r11.d
            long[] r4 = r4.c
            int r9 = r11.f
            r9 = r4[r9]
            goto L_0x005f
        L_0x0059:
            long[] r4 = r4.e
            int r9 = r11.h
            r9 = r4[r9]
        L_0x005f:
            int r4 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r4 >= 0) goto L_0x0065
            r15 = r9
            r7 = r11
        L_0x0065:
            int r8 = r8 + r2
            r11 = 2
            goto L_0x002d
        L_0x0068:
            if (r7 != 0) goto L_0x0088
            long r3 = r0.G0
            r5 = r1
            sa4 r5 = (defpackage.sa4) r5
            long r7 = r5.o
            long r3 = r3 - r7
            int r3 = (int) r3
            if (r3 < 0) goto L_0x0080
            r4 = r1
            sa4 r4 = (defpackage.sa4) r4
            r4.z(r3)
            r0.B0 = r6
            r0.E0 = r6
            goto L_0x0005
        L_0x0080:
            java.lang.String r0 = "Offset to end of mdat was negative."
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r1, r0)
            throw r0
        L_0x0088:
            boolean r3 = r7.l
            if (r3 != 0) goto L_0x0095
            a0f r3 = r7.d
            long[] r3 = r3.c
            int r4 = r7.f
            r3 = r3[r4]
            goto L_0x009d
        L_0x0095:
            pze r3 = r7.b
            long[] r3 = r3.e
            int r4 = r7.h
            r3 = r3[r4]
        L_0x009d:
            r5 = r1
            sa4 r5 = (defpackage.sa4) r5
            long r8 = r5.o
            long r3 = r3 - r8
            int r3 = (int) r3
            if (r3 >= 0) goto L_0x00ac
            java.lang.String r3 = "Ignoring negative offset to sample data."
            defpackage.z04.c0(r3)
            r3 = r6
        L_0x00ac:
            r4 = r1
            sa4 r4 = (defpackage.sa4) r4
            r4.z(r3)
            r0.L0 = r7
            r3 = r7
        L_0x00b5:
            int r4 = r0.B0
            r5 = 6
            pze r7 = r3.b
            r8 = 3
            if (r4 != r8) goto L_0x0164
            boolean r4 = r3.l
            if (r4 != 0) goto L_0x00ca
            a0f r4 = r3.d
            int[] r4 = r4.d
            int r8 = r3.f
            r4 = r4[r8]
            goto L_0x00d0
        L_0x00ca:
            int[] r4 = r7.g
            int r8 = r3.f
            r4 = r4[r8]
        L_0x00d0:
            r0.M0 = r4
            int r8 = r3.f
            int r9 = r3.i
            if (r8 >= r9) goto L_0x0112
            sa4 r1 = (defpackage.sa4) r1
            r1.z(r4)
            oze r1 = r3.a()
            if (r1 != 0) goto L_0x00e4
            goto L_0x0103
        L_0x00e4:
            java.lang.Object r2 = r7.q
            wpa r2 = (defpackage.wpa) r2
            int r1 = r1.d
            if (r1 == 0) goto L_0x00ef
            r2.H(r1)
        L_0x00ef:
            int r1 = r3.f
            boolean r4 = r7.j
            if (r4 == 0) goto L_0x0103
            boolean[] r4 = r7.k
            boolean r1 = r4[r1]
            if (r1 == 0) goto L_0x0103
            int r1 = r2.A()
            int r1 = r1 * r5
            r2.H(r1)
        L_0x0103:
            boolean r1 = r3.b()
            if (r1 != 0) goto L_0x010c
            r1 = 0
            r0.L0 = r1
        L_0x010c:
            r1 = 3
            r0.B0 = r1
            r0 = r6
            goto L_0x0310
        L_0x0112:
            a0f r8 = r3.d
            kze r8 = r8.a
            int r8 = r8.g
            if (r8 != r2) goto L_0x0125
            r8 = 8
            int r4 = r4 - r8
            r0.M0 = r4
            r4 = r1
            sa4 r4 = (defpackage.sa4) r4
            r4.z(r8)
        L_0x0125:
            a0f r4 = r3.d
            kze r4 = r4.a
            qy5 r4 = r4.f
            java.lang.String r4 = r4.n
            java.lang.String r8 = "audio/ac4"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x0150
            int r4 = r0.M0
            r8 = 7
            int r4 = r3.c(r4, r8)
            r0.N0 = r4
            int r4 = r0.M0
            wpa r9 = r0.t0
            defpackage.nu0.k(r4, r9)
            yze r4 = r3.a
            r4.b(r9, r8, r6)
            int r4 = r0.N0
            int r4 = r4 + r8
            r0.N0 = r4
            goto L_0x0158
        L_0x0150:
            int r4 = r0.M0
            int r4 = r3.c(r4, r6)
            r0.N0 = r4
        L_0x0158:
            int r4 = r0.M0
            int r8 = r0.N0
            int r4 = r4 + r8
            r0.M0 = r4
            r4 = 4
            r0.B0 = r4
            r0.O0 = r6
        L_0x0164:
            a0f r4 = r3.d
            kze r8 = r4.a
            boolean r9 = r3.l
            if (r9 != 0) goto L_0x0173
            long[] r4 = r4.f
            int r9 = r3.f
            r9 = r4[r9]
            goto L_0x0179
        L_0x0173:
            int r4 = r3.f
            long[] r9 = r7.h
            r9 = r9[r4]
        L_0x0179:
            if (r13 == 0) goto L_0x017f
            long r9 = r13.a(r9)
        L_0x017f:
            int r4 = r8.j
            yze r11 = r3.a
            if (r4 == 0) goto L_0x0271
            wpa r14 = r0.Y
            byte[] r15 = r14.a
            r15[r6] = r6
            r15[r2] = r6
            r16 = 2
            r15[r16] = r6
            int r5 = r4 + 1
            r16 = 4
            int r4 = 4 - r4
        L_0x0197:
            int r2 = r0.N0
            int r6 = r0.M0
            if (r2 >= r6) goto L_0x026e
            int r2 = r0.O0
            java.lang.String r6 = "video/hevc"
            r28 = r13
            qy5 r13 = r8.f
            if (r2 != 0) goto L_0x0214
            r2 = r1
            sa4 r2 = (defpackage.sa4) r2
            r18 = r8
            r8 = 0
            r2.h(r15, r4, r5, r8)
            r14.G(r8)
            int r2 = r14.g()
            r8 = 1
            if (r2 < r8) goto L_0x020c
            int r2 = r2 - r8
            r0.O0 = r2
            wpa r2 = r0.X
            r8 = 0
            r2.G(r8)
            r21 = r5
            r5 = 4
            r11.b(r2, r5, r8)
            r2 = 1
            r11.b(r14, r2, r8)
            yze[] r2 = r0.S0
            int r2 = r2.length
            if (r2 <= 0) goto L_0x01f5
            java.lang.String r2 = r13.n
            byte r8 = r15[r5]
            java.lang.String r5 = "video/avc"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x01e4
            r5 = r8 & 31
            r13 = 6
            if (r5 == r13) goto L_0x01f3
            goto L_0x01e5
        L_0x01e4:
            r13 = 6
        L_0x01e5:
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x01f6
            r2 = r8 & 126(0x7e, float:1.77E-43)
            r5 = 1
            int r2 = r2 >> r5
            r5 = 39
            if (r2 != r5) goto L_0x01f6
        L_0x01f3:
            r2 = 1
            goto L_0x01f7
        L_0x01f5:
            r13 = 6
        L_0x01f6:
            r2 = 0
        L_0x01f7:
            r0.P0 = r2
            int r2 = r0.N0
            int r2 = r2 + 5
            r0.N0 = r2
            int r2 = r0.M0
            int r2 = r2 + r4
            r0.M0 = r2
            r8 = r18
            r5 = r21
        L_0x0208:
            r13 = r28
            r6 = 0
            goto L_0x0197
        L_0x020c:
            java.lang.String r0 = "Invalid NAL length"
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r1, r0)
            throw r0
        L_0x0214:
            r21 = r5
            r18 = r8
            r5 = 6
            boolean r8 = r0.P0
            if (r8 == 0) goto L_0x0252
            wpa r8 = r0.Z
            r8.D(r2)
            byte[] r2 = r8.a
            int r5 = r0.O0
            r22 = r4
            r4 = r1
            sa4 r4 = (defpackage.sa4) r4
            r23 = r14
            r14 = 0
            r4.h(r2, r14, r5, r14)
            int r2 = r0.O0
            r11.b(r8, r2, r14)
            int r2 = r0.O0
            byte[] r4 = r8.a
            int r5 = r8.c
            int r4 = defpackage.fm9.Q(r5, r4)
            java.lang.String r5 = r13.n
            boolean r5 = r6.equals(r5)
            r8.G(r5)
            r8.F(r4)
            yze[] r4 = r0.S0
            defpackage.z04.q(r9, r8, r4)
            goto L_0x025b
        L_0x0252:
            r22 = r4
            r23 = r14
            r4 = 0
            int r2 = r11.c(r1, r2, r4)
        L_0x025b:
            int r4 = r0.N0
            int r4 = r4 + r2
            r0.N0 = r4
            int r4 = r0.O0
            int r4 = r4 - r2
            r0.O0 = r4
            r8 = r18
            r5 = r21
            r4 = r22
            r14 = r23
            goto L_0x0208
        L_0x026e:
            r28 = r13
            goto L_0x0285
        L_0x0271:
            r28 = r13
        L_0x0273:
            int r2 = r0.N0
            int r4 = r0.M0
            if (r2 >= r4) goto L_0x0285
            int r4 = r4 - r2
            r2 = 0
            int r4 = r11.c(r1, r4, r2)
            int r2 = r0.N0
            int r2 = r2 + r4
            r0.N0 = r2
            goto L_0x0273
        L_0x0285:
            boolean r1 = r3.l
            if (r1 != 0) goto L_0x0292
            a0f r1 = r3.d
            int[] r1 = r1.g
            int r2 = r3.f
            r1 = r1[r2]
            goto L_0x029d
        L_0x0292:
            boolean[] r1 = r7.i
            int r2 = r3.f
            boolean r1 = r1[r2]
            if (r1 == 0) goto L_0x029c
            r1 = 1
            goto L_0x029d
        L_0x029c:
            r1 = 0
        L_0x029d:
            oze r2 = r3.a()
            if (r2 == 0) goto L_0x02a6
            r2 = 1073741824(0x40000000, float:2.0)
            r1 = r1 | r2
        L_0x02a6:
            r24 = r1
            oze r1 = r3.a()
            if (r1 == 0) goto L_0x02b3
            wze r1 = r1.c
            r27 = r1
            goto L_0x02b5
        L_0x02b3:
            r27 = 0
        L_0x02b5:
            int r1 = r0.M0
            r26 = 0
            r21 = r11
            r22 = r9
            r25 = r1
            r21.a(r22, r24, r25, r26, r27)
        L_0x02c2:
            boolean r1 = r12.isEmpty()
            if (r1 != 0) goto L_0x0303
            java.lang.Object r1 = r12.removeFirst()
            b26 r1 = (defpackage.b26) r1
            int r2 = r0.H0
            int r4 = r1.c
            int r2 = r2 - r4
            r0.H0 = r2
            boolean r2 = r1.b
            long r4 = r1.a
            if (r2 == 0) goto L_0x02dc
            long r4 = r4 + r9
        L_0x02dc:
            r2 = r28
            if (r28 == 0) goto L_0x02e4
            long r4 = r2.a(r4)
        L_0x02e4:
            yze[] r6 = r0.R0
            int r7 = r6.length
            r8 = 0
        L_0x02e8:
            if (r8 >= r7) goto L_0x0300
            r21 = r6[r8]
            int r11 = r0.H0
            r27 = 0
            r24 = 1
            int r13 = r1.c
            r22 = r4
            r25 = r13
            r26 = r11
            r21.a(r22, r24, r25, r26, r27)
            r11 = 1
            int r8 = r8 + r11
            goto L_0x02e8
        L_0x0300:
            r28 = r2
            goto L_0x02c2
        L_0x0303:
            boolean r1 = r3.b()
            if (r1 != 0) goto L_0x030c
            r1 = 0
            r0.L0 = r1
        L_0x030c:
            r1 = 3
            r0.B0 = r1
            r0 = 0
        L_0x0310:
            return r0
        L_0x0311:
            int r2 = r5.size()
            r3 = 0
            r4 = 0
        L_0x0317:
            if (r4 >= r2) goto L_0x0335
            java.lang.Object r6 = r5.valueAt(r4)
            d26 r6 = (defpackage.d26) r6
            pze r6 = r6.b
            boolean r9 = r6.l
            if (r9 == 0) goto L_0x0332
            long r9 = r6.b
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 >= 0) goto L_0x0332
            java.lang.Object r3 = r5.valueAt(r4)
            d26 r3 = (defpackage.d26) r3
            r7 = r9
        L_0x0332:
            r6 = 1
            int r4 = r4 + r6
            goto L_0x0317
        L_0x0335:
            if (r3 != 0) goto L_0x033c
            r2 = 3
            r0.B0 = r2
            goto L_0x0004
        L_0x033c:
            r2 = r1
            sa4 r2 = (defpackage.sa4) r2
            long r4 = r2.o
            long r7 = r7 - r4
            int r2 = (int) r7
            if (r2 < 0) goto L_0x0360
            r4 = r1
            sa4 r4 = (defpackage.sa4) r4
            r4.z(r2)
            pze r2 = r3.b
            java.lang.Object r3 = r2.q
            wpa r3 = (defpackage.wpa) r3
            byte[] r5 = r3.a
            int r6 = r3.c
            r7 = 0
            r4.h(r5, r7, r6, r7)
            r3.G(r7)
            r2.l = r7
            goto L_0x0004
        L_0x0360:
            java.lang.String r0 = "Offset to encryption data was negative."
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r1, r0)
            throw r0
        L_0x0368:
            r2 = r13
            long r5 = r0.D0
            int r3 = (int) r5
            int r5 = r0.E0
            int r3 = r3 - r5
            wpa r5 = r0.F0
            if (r5 == 0) goto L_0x05a9
            byte[] r6 = r5.a
            r9 = r1
            sa4 r9 = (defpackage.sa4) r9
            r10 = 0
            r11 = 8
            r9.h(r6, r11, r3, r10)
            ny r3 = new ny
            int r6 = r0.C0
            r3.<init>(r6, r5)
            r9 = r1
            sa4 r9 = (defpackage.sa4) r9
            long r9 = r9.o
            boolean r11 = r4.isEmpty()
            if (r11 != 0) goto L_0x039d
            java.lang.Object r2 = r4.peek()
            ly r2 = (defpackage.ly) r2
            java.util.ArrayList r2 = r2.o
            r2.add(r3)
            goto L_0x05af
        L_0x039d:
            if (r6 != r8) goto L_0x045f
            r3 = 8
            r5.G(r3)
            int r2 = r5.g()
            int r2 = defpackage.oy.t(r2)
            r3 = 4
            r5.H(r3)
            long r3 = r5.w()
            if (r2 != 0) goto L_0x03c0
            long r6 = r5.w()
            long r11 = r5.w()
        L_0x03be:
            long r11 = r11 + r9
            goto L_0x03c9
        L_0x03c0:
            long r6 = r5.z()
            long r11 = r5.z()
            goto L_0x03be
        L_0x03c9:
            int r2 = defpackage.oaf.a
            java.math.RoundingMode r27 = java.math.RoundingMode.FLOOR
            r23 = 1000000(0xf4240, double:4.940656E-318)
            r21 = r6
            r25 = r3
            long r8 = defpackage.oaf.a0(r21, r23, r25, r27)
            r2 = 2
            r5.H(r2)
            int r2 = r5.A()
            int[] r10 = new int[r2]
            long[] r13 = new long[r2]
            long[] r14 = new long[r2]
            long[] r15 = new long[r2]
            r21 = r8
            r18 = r11
            r11 = r6
            r6 = 0
        L_0x03ee:
            if (r6 >= r2) goto L_0x043a
            int r7 = r5.g()
            r23 = -2147483648(0xffffffff80000000, float:-0.0)
            r23 = r7 & r23
            if (r23 != 0) goto L_0x0432
            long r23 = r5.w()
            r25 = 2147483647(0x7fffffff, float:NaN)
            r7 = r7 & r25
            r10[r6] = r7
            r13[r6] = r18
            r15[r6] = r21
            long r11 = r11 + r23
            java.math.RoundingMode r27 = java.math.RoundingMode.FLOOR
            r23 = 1000000(0xf4240, double:4.940656E-318)
            r21 = r11
            r25 = r3
            long r21 = defpackage.oaf.a0(r21, r23, r25, r27)
            r23 = r15[r6]
            long r23 = r21 - r23
            r14[r6] = r23
            r7 = 4
            r5.H(r7)
            r7 = r10[r6]
            r31 = r2
            r23 = r3
            long r2 = (long) r7
            long r18 = r18 + r2
            r2 = 1
            int r6 = r6 + r2
            r2 = r31
            r3 = r23
            goto L_0x03ee
        L_0x0432:
            java.lang.String r0 = "Unhandled indirect reference"
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r1, r0)
            throw r0
        L_0x043a:
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            m13 r3 = new m13
            r3.<init>(r10, r13, r14, r15)
            android.util.Pair r2 = android.util.Pair.create(r2, r3)
            java.lang.Object r3 = r2.first
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            r0.K0 = r3
            pa5 r3 = r0.Q0
            java.lang.Object r2 = r2.second
            v1d r2 = (defpackage.v1d) r2
            r3.J(r2)
            r2 = 1
            r0.T0 = r2
            goto L_0x05af
        L_0x045f:
            if (r6 != r7) goto L_0x05af
            yze[] r3 = r0.R0
            int r3 = r3.length
            if (r3 != 0) goto L_0x0468
            goto L_0x05af
        L_0x0468:
            r3 = 8
            r5.G(r3)
            int r3 = r5.g()
            int r3 = defpackage.oy.t(r3)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 == 0) goto L_0x04c5
            r4 = 1
            if (r3 == r4) goto L_0x0486
            java.lang.String r2 = "Skipping unsupported emsg version: "
            defpackage.ey8.k(r3, r2)
            goto L_0x05af
        L_0x0486:
            long r3 = r5.w()
            long r17 = r5.z()
            java.math.RoundingMode r8 = java.math.RoundingMode.FLOOR
            r19 = 1000000(0xf4240, double:4.940656E-318)
            r21 = r3
            r23 = r8
            long r9 = defpackage.oaf.a0(r17, r19, r21, r23)
            long r17 = r5.w()
            r19 = 1000(0x3e8, double:4.94E-321)
            r21 = r3
            r23 = r8
            long r3 = defpackage.oaf.a0(r17, r19, r21, r23)
            long r13 = r5.w()
            java.lang.String r8 = r5.p()
            r8.getClass()
            java.lang.String r11 = r5.p()
            r11.getClass()
            r22 = r3
            r20 = r8
            r21 = r11
            r24 = r13
            r13 = r6
            goto L_0x050e
        L_0x04c5:
            java.lang.String r8 = r5.p()
            r8.getClass()
            java.lang.String r11 = r5.p()
            r11.getClass()
            long r3 = r5.w()
            long r17 = r5.w()
            java.math.RoundingMode r9 = java.math.RoundingMode.FLOOR
            r19 = 1000000(0xf4240, double:4.940656E-318)
            r21 = r3
            r23 = r9
            long r13 = defpackage.oaf.a0(r17, r19, r21, r23)
            r31 = r11
            long r10 = r0.K0
            int r15 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r15 == 0) goto L_0x04f2
            long r10 = r10 + r13
            goto L_0x04f3
        L_0x04f2:
            r10 = r6
        L_0x04f3:
            long r17 = r5.w()
            r19 = 1000(0x3e8, double:4.94E-321)
            r21 = r3
            r23 = r9
            long r3 = defpackage.oaf.a0(r17, r19, r21, r23)
            long r17 = r5.w()
            r21 = r31
            r22 = r3
            r20 = r8
            r9 = r10
            r24 = r17
        L_0x050e:
            int r3 = r5.a()
            byte[] r3 = new byte[r3]
            int r4 = r5.a()
            r8 = 0
            r5.e(r8, r3, r4)
            d45 r4 = new d45
            r19 = r4
            r26 = r3
            r19.<init>(r20, r21, r22, r24, r26)
            wpa r3 = new wpa
            ph4 r5 = r0.v0
            byte[] r4 = r5.j(r4)
            r3.<init>((byte[]) r4)
            int r4 = r3.a()
            yze[] r5 = r0.R0
            int r8 = r5.length
            r11 = 0
        L_0x0538:
            if (r11 >= r8) goto L_0x054b
            r15 = r5[r11]
            r6 = 0
            r3.G(r6)
            r15.b(r3, r4, r6)
            r6 = 1
            int r11 = r11 + r6
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0538
        L_0x054b:
            r15 = r6
            r6 = 1
            int r3 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r3 != 0) goto L_0x055f
            b26 r2 = new b26
            r2.<init>(r4, r13, r6)
            r12.addLast(r2)
            int r2 = r0.H0
            int r2 = r2 + r4
            r0.H0 = r2
            goto L_0x05af
        L_0x055f:
            boolean r3 = r12.isEmpty()
            if (r3 != 0) goto L_0x0574
            b26 r2 = new b26
            r3 = 0
            r2.<init>(r4, r9, r3)
            r12.addLast(r2)
            int r2 = r0.H0
            int r2 = r2 + r4
            r0.H0 = r2
            goto L_0x05af
        L_0x0574:
            r3 = 0
            if (r2 == 0) goto L_0x058b
            boolean r5 = r2.e()
            if (r5 != 0) goto L_0x058b
            b26 r2 = new b26
            r2.<init>(r4, r9, r3)
            r12.addLast(r2)
            int r2 = r0.H0
            int r2 = r2 + r4
            r0.H0 = r2
            goto L_0x05af
        L_0x058b:
            if (r2 == 0) goto L_0x0591
            long r9 = r2.a(r9)
        L_0x0591:
            yze[] r2 = r0.R0
            int r3 = r2.length
            r6 = 0
        L_0x0595:
            if (r6 >= r3) goto L_0x05af
            r17 = r2[r6]
            r23 = 0
            r20 = 1
            r22 = 0
            r18 = r9
            r21 = r4
            r17.a(r18, r20, r21, r22, r23)
            r5 = 1
            int r6 = r6 + r5
            goto L_0x0595
        L_0x05a9:
            r2 = r1
            sa4 r2 = (defpackage.sa4) r2
            r2.z(r3)
        L_0x05af:
            r2 = r1
            sa4 r2 = (defpackage.sa4) r2
            long r2 = r2.o
            r0.c(r2)
            goto L_0x0004
        L_0x05b9:
            int r2 = r0.E0
            wpa r3 = r0.w0
            if (r2 != 0) goto L_0x05e1
            byte[] r2 = r3.a
            r6 = r1
            sa4 r6 = (defpackage.sa4) r6
            r9 = 0
            r10 = 8
            r11 = 1
            boolean r2 = r6.h(r2, r9, r10, r11)
            if (r2 != 0) goto L_0x05d0
            r0 = -1
            return r0
        L_0x05d0:
            r0.E0 = r10
            r3.G(r9)
            long r9 = r3.w()
            r0.D0 = r9
            int r2 = r3.g()
            r0.C0 = r2
        L_0x05e1:
            long r9 = r0.D0
            r11 = 1
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x0600
            byte[] r2 = r3.a
            r6 = r1
            sa4 r6 = (defpackage.sa4) r6
            r9 = 0
            r10 = 8
            r6.h(r2, r10, r10, r9)
            int r2 = r0.E0
            int r2 = r2 + r10
            r0.E0 = r2
            long r9 = r3.z()
            r0.D0 = r9
            goto L_0x062f
        L_0x0600:
            r11 = 0
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x062f
            r2 = r1
            sa4 r2 = (defpackage.sa4) r2
            long r9 = r2.c
            r11 = -1
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x061f
            boolean r2 = r4.isEmpty()
            if (r2 != 0) goto L_0x061f
            java.lang.Object r2 = r4.peek()
            ly r2 = (defpackage.ly) r2
            long r9 = r2.c
        L_0x061f:
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 == 0) goto L_0x062f
            r2 = r1
            sa4 r2 = (defpackage.sa4) r2
            long r11 = r2.o
            long r9 = r9 - r11
            int r2 = r0.E0
            long r11 = (long) r2
            long r9 = r9 + r11
            r0.D0 = r9
        L_0x062f:
            long r9 = r0.D0
            int r2 = r0.E0
            long r11 = (long) r2
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 < 0) goto L_0x07b3
            r6 = r1
            sa4 r6 = (defpackage.sa4) r6
            long r9 = r6.o
            long r11 = (long) r2
            long r9 = r9 - r11
            int r2 = r0.C0
            r6 = 1835295092(0x6d646174, float:4.4175247E27)
            r11 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r2 == r11) goto L_0x064b
            if (r2 != r6) goto L_0x065e
        L_0x064b:
            boolean r2 = r0.T0
            if (r2 != 0) goto L_0x065e
            pa5 r2 = r0.Q0
            wd0 r12 = new wd0
            long r13 = r0.J0
            r12.<init>(r13, r9)
            r2.J(r12)
            r2 = 1
            r0.T0 = r2
        L_0x065e:
            int r2 = r0.C0
            if (r2 != r11) goto L_0x067b
            int r2 = r5.size()
            r12 = 0
        L_0x0667:
            if (r12 >= r2) goto L_0x067b
            java.lang.Object r13 = r5.valueAt(r12)
            d26 r13 = (defpackage.d26) r13
            pze r13 = r13.b
            r13.getClass()
            r13.b = r9
            r13.a = r9
            r13 = 1
            int r12 = r12 + r13
            goto L_0x0667
        L_0x067b:
            int r2 = r0.C0
            if (r2 != r6) goto L_0x068d
            r5 = 0
            r0.L0 = r5
            long r2 = r0.D0
            long r9 = r9 + r2
            r0.G0 = r9
            r2 = 2
            r0.B0 = r2
            r3 = 1
            goto L_0x07b0
        L_0x068d:
            r5 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r2 == r5) goto L_0x06b7
            r5 = 1953653099(0x7472616b, float:7.681346E31)
            if (r2 == r5) goto L_0x06b7
            r5 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r2 == r5) goto L_0x06b7
            r5 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r2 == r5) goto L_0x06b7
            r5 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r2 == r5) goto L_0x06b7
            if (r2 == r11) goto L_0x06b7
            r5 = 1953653094(0x74726166, float:7.6813435E31)
            if (r2 == r5) goto L_0x06b7
            r5 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r2 == r5) goto L_0x06b7
            r5 = 1701082227(0x65647473, float:6.742798E22)
            if (r2 != r5) goto L_0x06ba
        L_0x06b7:
            r3 = 1
            goto L_0x078b
        L_0x06ba:
            r4 = 1751411826(0x68646c72, float:4.3148E24)
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r2 == r4) goto L_0x0759
            r4 = 1835296868(0x6d646864, float:4.418049E27)
            if (r2 == r4) goto L_0x0759
            r4 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r2 == r4) goto L_0x0759
            if (r2 == r8) goto L_0x0759
            r4 = 1937011556(0x73747364, float:1.9367383E31)
            if (r2 == r4) goto L_0x0759
            r4 = 1937011827(0x73747473, float:1.9367711E31)
            if (r2 == r4) goto L_0x0759
            r4 = 1668576371(0x63747473, float:4.5093966E21)
            if (r2 == r4) goto L_0x0759
            r4 = 1937011555(0x73747363, float:1.9367382E31)
            if (r2 == r4) goto L_0x0759
            r4 = 1937011578(0x7374737a, float:1.936741E31)
            if (r2 == r4) goto L_0x0759
            r4 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r2 == r4) goto L_0x0759
            r4 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r2 == r4) goto L_0x0759
            r4 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r2 == r4) goto L_0x0759
            r4 = 1937011571(0x73747373, float:1.9367401E31)
            if (r2 == r4) goto L_0x0759
            r4 = 1952867444(0x74666474, float:7.3014264E31)
            if (r2 == r4) goto L_0x0759
            r4 = 1952868452(0x74666864, float:7.301914E31)
            if (r2 == r4) goto L_0x0759
            r4 = 1953196132(0x746b6864, float:7.46037E31)
            if (r2 == r4) goto L_0x0759
            r4 = 1953654136(0x74726578, float:7.6818474E31)
            if (r2 == r4) goto L_0x0759
            r4 = 1953658222(0x7472756e, float:7.683823E31)
            if (r2 == r4) goto L_0x0759
            r4 = 1886614376(0x70737368, float:3.013775E29)
            if (r2 == r4) goto L_0x0759
            r4 = 1935763834(0x7361697a, float:1.785898E31)
            if (r2 == r4) goto L_0x0759
            r4 = 1935763823(0x7361696f, float:1.7858967E31)
            if (r2 == r4) goto L_0x0759
            r4 = 1936027235(0x73656e63, float:1.8177412E31)
            if (r2 == r4) goto L_0x0759
            r4 = 1970628964(0x75756964, float:3.1109627E32)
            if (r2 == r4) goto L_0x0759
            r4 = 1935828848(0x73626770, float:1.7937577E31)
            if (r2 == r4) goto L_0x0759
            r4 = 1936158820(0x73677064, float:1.8336489E31)
            if (r2 == r4) goto L_0x0759
            r4 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r2 == r4) goto L_0x0759
            r4 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r2 == r4) goto L_0x0759
            if (r2 != r7) goto L_0x0744
            goto L_0x0759
        L_0x0744:
            long r2 = r0.D0
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x0752
            r2 = 0
            r0.F0 = r2
            r2 = 1
            r0.B0 = r2
            r3 = r2
            goto L_0x07b0
        L_0x0752:
            java.lang.String r0 = "Skipping atom with length > 2147483647 (unsupported)."
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.c(r0)
            throw r0
        L_0x0759:
            int r2 = r0.E0
            r4 = 8
            if (r2 != r4) goto L_0x0784
            long r7 = r0.D0
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x077d
            wpa r2 = new wpa
            long r4 = r0.D0
            int r4 = (int) r4
            r2.<init>((int) r4)
            byte[] r3 = r3.a
            byte[] r4 = r2.a
            r5 = 0
            r6 = 8
            java.lang.System.arraycopy(r3, r5, r4, r5, r6)
            r0.F0 = r2
            r3 = 1
            r0.B0 = r3
            goto L_0x07b0
        L_0x077d:
            java.lang.String r0 = "Leaf atom with length > 2147483647 (unsupported)."
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.c(r0)
            throw r0
        L_0x0784:
            java.lang.String r0 = "Leaf atom defines extended atom size (unsupported)."
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.c(r0)
            throw r0
        L_0x078b:
            r5 = r1
            sa4 r5 = (defpackage.sa4) r5
            long r5 = r5.o
            long r7 = r0.D0
            long r5 = r5 + r7
            r7 = 8
            long r5 = r5 - r7
            ly r7 = new ly
            r7.<init>(r2, r5)
            r4.push(r7)
            long r7 = r0.D0
            int r2 = r0.E0
            long r9 = (long) r2
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x07ab
            r0.c(r5)
            goto L_0x07b0
        L_0x07ab:
            r2 = 0
            r0.B0 = r2
            r0.E0 = r2
        L_0x07b0:
            r2 = r3
            goto L_0x0005
        L_0x07b3:
            java.lang.String r0 = "Atom size less than header length (unsupported)."
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.c(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f26.g(na5, lh4):int");
    }

    public final boolean n(na5 na5) {
        ffc ffc;
        iud W = mr0.W(na5, true, false);
        if (W != null) {
            ffc = zw6.n(W);
        } else {
            ls5 ls5 = zw6.b;
            ffc = ffc.X;
        }
        this.A0 = ffc;
        return W == null;
    }

    public final List o() {
        return this.A0;
    }

    public final void release() {
    }

    public f26(mbe mbe, int i, tue tue, List list, yze yze) {
        this.a = mbe;
        this.b = i;
        this.u0 = tue;
        this.c = Collections.unmodifiableList(list);
        this.z0 = yze;
        this.v0 = new ph4(18);
        this.w0 = new wpa(16);
        this.X = new wpa(fm9.e);
        this.Y = new wpa(5);
        this.Z = new wpa();
        byte[] bArr = new byte[16];
        this.s0 = bArr;
        this.t0 = new wpa(bArr);
        this.x0 = new ArrayDeque();
        this.y0 = new ArrayDeque();
        this.o = new SparseArray();
        ls5 ls5 = zw6.b;
        this.A0 = ffc.X;
        this.J0 = -9223372036854775807L;
        this.I0 = -9223372036854775807L;
        this.K0 = -9223372036854775807L;
        this.Q0 = pa5.v;
        this.R0 = new yze[0];
        this.S0 = new yze[0];
    }
}
