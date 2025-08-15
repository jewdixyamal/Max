package defpackage;

import android.net.Uri;
import java.io.EOFException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: dm6  reason: default package */
public final class dm6 extends g78 {
    public static final AtomicInteger X0 = new AtomicInteger();
    public final t24 A0;
    public final a34 B0;
    public final te C0;
    public final boolean D0;
    public final boolean E0;
    public final tue F0;
    public final am6 G0;
    public final List H0;
    public final dr4 I0;
    public final bt6 J0;
    public final wpa K0;
    public final boolean L0;
    public final boolean M0;
    public final long N0;
    public te O0;
    public tn6 P0;
    public int Q0;
    public boolean R0;
    public volatile boolean S0;
    public boolean T0;
    public zw6 U0;
    public boolean V0;
    public boolean W0;
    public final int v0;
    public final int w0;
    public final Uri x0;
    public final boolean y0;
    public final int z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dm6(am6 am6, t24 t24, a34 a34, qy5 qy5, boolean z, t24 t242, a34 a342, boolean z2, Uri uri, List list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, tue tue, long j4, dr4 dr4, te teVar, bt6 bt6, wpa wpa, boolean z6, j4b j4b) {
        super(t24, a34, qy5, i, obj, j, j2, j3);
        a34 a343 = a342;
        this.L0 = z;
        this.z0 = i2;
        this.W0 = z3;
        this.w0 = i3;
        this.B0 = a343;
        this.A0 = t242;
        this.R0 = a343 != null;
        this.M0 = z2;
        this.x0 = uri;
        this.D0 = z5;
        this.F0 = tue;
        this.N0 = j4;
        this.E0 = z4;
        this.G0 = am6;
        this.H0 = list;
        this.I0 = dr4;
        this.C0 = teVar;
        this.J0 = bt6;
        this.K0 = wpa;
        this.y0 = z6;
        ls5 ls5 = zw6.b;
        this.U0 = ffc.X;
        this.v0 = X0.getAndIncrement();
    }

    public static byte[] e(String str) {
        if (lz7.T(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    public final void a() {
        this.S0 = true;
    }

    public final boolean c() {
        throw null;
    }

    public final void d(t24 t24, a34 a34, boolean z, boolean z2) {
        a34 a342;
        sa4 g;
        long j;
        long j2;
        te teVar;
        boolean z3 = false;
        if (z) {
            if (this.Q0 != 0) {
                z3 = true;
            }
            a342 = a34;
        } else {
            a342 = a34.b((long) this.Q0);
        }
        try {
            g = g(t24, a342, z2);
            if (z3) {
                g.z(this.Q0);
            }
            do {
                if (!this.S0) {
                    teVar = this.O0;
                }
                break;
            } while (((la5) teVar.b).g(g, te.Y) == 0);
            break;
            j = g.o;
            j2 = a34.f;
        } catch (EOFException e) {
            if ((this.o.f & 16384) != 0) {
                ((la5) this.O0.b).d(0, 0);
                j = g.o;
                j2 = a34.f;
            } else {
                throw e;
            }
        } catch (Throwable th) {
            mr0.i(t24);
            throw th;
        }
        this.Q0 = (int) (j - j2);
        mr0.i(t24);
    }

    public final int f(int i) {
        fm9.k(!this.y0);
        if (i >= this.U0.size()) {
            return 0;
        }
        return ((Integer) this.U0.get(i)).intValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v1, resolved type: ffc} */
    /* JADX WARNING: type inference failed for: r4v13, types: [la5, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v44 */
    /* JADX WARNING: type inference failed for: r4v45 */
    /* JADX WARNING: type inference failed for: r4v46 */
    /* JADX WARNING: type inference failed for: r4v47 */
    /* JADX WARNING: type inference failed for: r4v48 */
    /* JADX WARNING: type inference failed for: r4v49 */
    /* JADX WARNING: type inference failed for: r22v3, types: [f26] */
    /* JADX WARNING: type inference failed for: r22v4, types: [i3f] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0368  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x036b  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x039f  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0163  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.sa4 g(defpackage.t24 r31, defpackage.a34 r32, boolean r33) {
        /*
            r30 = this;
            r0 = r30
            r1 = r32
            long r6 = r31.G(r32)
            if (r33 == 0) goto L_0x0023
            tue r8 = r0.F0     // Catch:{ InterruptedException -> 0x001d, TimeoutException -> 0x0016 }
            boolean r13 = r0.D0     // Catch:{ InterruptedException -> 0x001d, TimeoutException -> 0x0016 }
            long r9 = r0.Z     // Catch:{ InterruptedException -> 0x001d, TimeoutException -> 0x0016 }
            long r11 = r0.N0     // Catch:{ InterruptedException -> 0x001d, TimeoutException -> 0x0016 }
            r8.g(r9, r11, r13)     // Catch:{ InterruptedException -> 0x001d, TimeoutException -> 0x0016 }
            goto L_0x0023
        L_0x0016:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            throw r1
        L_0x001d:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            r0.<init>()
            throw r0
        L_0x0023:
            sa4 r8 = new sa4
            long r4 = r1.f
            r2 = r8
            r3 = r31
            r2.<init>(r3, r4, r6)
            te r2 = r0.O0
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L_0x03d4
            wpa r2 = r0.K0
            r8.Y = r3
            r5 = 10
            r6 = 8
            r2.D(r5)     // Catch:{ EOFException -> 0x004c }
            byte[] r7 = r2.a     // Catch:{ EOFException -> 0x004c }
            r8.q(r7, r3, r5, r3)     // Catch:{ EOFException -> 0x004c }
            int r7 = r2.x()
            r11 = 4801587(0x494433, float:6.728456E-39)
            if (r7 == r11) goto L_0x0052
        L_0x004c:
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x00ac
        L_0x0052:
            r7 = 3
            r2.H(r7)
            int r7 = r2.t()
            int r11 = r7 + 10
            byte[] r12 = r2.a
            int r13 = r12.length
            if (r11 <= r13) goto L_0x0069
            r2.D(r11)
            byte[] r11 = r2.a
            java.lang.System.arraycopy(r12, r3, r11, r3, r5)
        L_0x0069:
            byte[] r11 = r2.a
            r8.q(r11, r5, r7, r3)
            byte[] r5 = r2.a
            bt6 r11 = r0.J0
            f99 r5 = r11.X(r7, r5)
            if (r5 != 0) goto L_0x0079
            goto L_0x004c
        L_0x0079:
            d99[] r5 = r5.a
            int r7 = r5.length
            r11 = r3
        L_0x007d:
            if (r11 >= r7) goto L_0x004c
            r12 = r5[r11]
            boolean r13 = r12 instanceof defpackage.g9b
            if (r13 == 0) goto L_0x00a9
            g9b r12 = (defpackage.g9b) r12
            java.lang.String r13 = r12.b
            java.lang.String r14 = "com.apple.streaming.transportStreamTimestamp"
            boolean r13 = r14.equals(r13)
            if (r13 == 0) goto L_0x00a9
            byte[] r5 = r2.a
            byte[] r7 = r12.c
            java.lang.System.arraycopy(r7, r3, r5, r3, r6)
            r2.G(r3)
            r2.F(r6)
            long r11 = r2.o()
            r13 = 8589934591(0x1ffffffff, double:4.2439915814E-314)
            long r11 = r11 & r13
            goto L_0x00ac
        L_0x00a9:
            int r11 = r11 + 1
            goto L_0x007d
        L_0x00ac:
            r8.Y = r3
            te r2 = r0.C0
            if (r2 == 0) goto L_0x0163
            java.lang.Object r1 = r2.b
            la5 r1 = (defpackage.la5) r1
            la5 r5 = r1.m()
            boolean r6 = r5 instanceof defpackage.i3f
            if (r6 != 0) goto L_0x00c5
            boolean r5 = r5 instanceof defpackage.f26
            if (r5 == 0) goto L_0x00c3
            goto L_0x00c5
        L_0x00c3:
            r5 = r3
            goto L_0x00c6
        L_0x00c5:
            r5 = r4
        L_0x00c6:
            r5 = r5 ^ r4
            defpackage.fm9.k(r5)
            la5 r5 = r1.m()
            if (r5 != r1) goto L_0x00d2
            r5 = r4
            goto L_0x00d3
        L_0x00d2:
            r5 = r3
        L_0x00d3:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Can't recreate wrapped extractors. Outer type: "
            r6.<init>(r7)
            java.lang.Class r7 = r1.getClass()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            defpackage.fm9.j(r6, r5)
            boolean r5 = r1 instanceof defpackage.t4g
            java.lang.Object r6 = r2.X
            mbe r6 = (defpackage.mbe) r6
            if (r5 == 0) goto L_0x0107
            t4g r1 = new t4g
            java.lang.Object r5 = r2.c
            qy5 r5 = (defpackage.qy5) r5
            java.lang.String r5 = r5.d
            java.lang.Object r7 = r2.o
            tue r7 = (defpackage.tue) r7
            r15 = r6
            b46 r15 = (defpackage.b46) r15
            boolean r9 = r2.a
            r1.<init>(r5, r7, r15, r9)
        L_0x0104:
            r17 = r1
            goto L_0x012f
        L_0x0107:
            boolean r5 = r1 instanceof defpackage.ec
            if (r5 == 0) goto L_0x0111
            ec r1 = new ec
            r1.<init>(r3)
            goto L_0x0104
        L_0x0111:
            boolean r5 = r1 instanceof defpackage.r3
            if (r5 == 0) goto L_0x011b
            r3 r1 = new r3
            r1.<init>()
            goto L_0x0104
        L_0x011b:
            boolean r5 = r1 instanceof defpackage.v3
            if (r5 == 0) goto L_0x0125
            v3 r1 = new v3
            r1.<init>()
            goto L_0x0104
        L_0x0125:
            boolean r5 = r1 instanceof defpackage.sd9
            if (r5 == 0) goto L_0x014f
            sd9 r1 = new sd9
            r1.<init>(r3)
            goto L_0x0104
        L_0x012f:
            te r1 = new te
            boolean r5 = r2.a
            r20 = r6
            b46 r20 = (defpackage.b46) r20
            java.lang.Object r6 = r2.c
            r18 = r6
            qy5 r18 = (defpackage.qy5) r18
            java.lang.Object r2 = r2.o
            r19 = r2
            tue r19 = (defpackage.tue) r19
            r16 = r1
            r21 = r5
            r16.<init>(r17, r18, r19, r20, r21)
            r10 = r3
            r28 = r11
            goto L_0x034b
        L_0x014f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r2 = "Unexpected extractor type for recreation: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x0163:
            java.util.Map r2 = r31.a()
            am6 r5 = r0.G0
            cb4 r5 = (defpackage.cb4) r5
            r5.getClass()
            qy5 r7 = r0.o
            java.lang.String r9 = r7.n
            int r9 = defpackage.ote.A(r9)
            java.lang.String r10 = "Content-Type"
            java.lang.Object r2 = r2.get(r10)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x018e
            boolean r15 = r2.isEmpty()
            if (r15 == 0) goto L_0x0187
            goto L_0x018e
        L_0x0187:
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x018f
        L_0x018e:
            r2 = 0
        L_0x018f:
            int r2 = defpackage.ote.A(r2)
            android.net.Uri r1 = r1.a
            int r1 = defpackage.ote.B(r1)
            java.util.ArrayList r15 = new java.util.ArrayList
            r10 = 7
            r15.<init>(r10)
            defpackage.cb4.a(r15, r9)
            defpackage.cb4.a(r15, r2)
            defpackage.cb4.a(r15, r1)
            int[] r16 = defpackage.cb4.d
            r13 = r3
        L_0x01ab:
            if (r13 >= r10) goto L_0x01b5
            r14 = r16[r13]
            defpackage.cb4.a(r15, r14)
            int r13 = r13 + 1
            goto L_0x01ab
        L_0x01b5:
            r8.Y = r3
            r13 = r3
            r17 = 0
        L_0x01ba:
            int r14 = r15.size()
            tue r3 = r0.F0
            if (r13 >= r14) goto L_0x0330
            java.lang.Object r14 = r15.get(r13)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            r6 = 11
            if (r14 == 0) goto L_0x02dd
            if (r14 == r4) goto L_0x02d3
            r4 = 2
            if (r14 == r4) goto L_0x02c8
            if (r14 == r10) goto L_0x02bb
            kj6 r4 = defpackage.mbe.a0
            java.util.List r10 = r0.H0
            r18 = r4
            r4 = 8
            if (r14 == r4) goto L_0x0266
            if (r14 == r6) goto L_0x0202
            r10 = 13
            if (r14 == r10) goto L_0x01ee
            r28 = r11
            r20 = r15
            r4 = 0
            goto L_0x02e6
        L_0x01ee:
            t4g r10 = new t4g
            mbe r4 = r5.b
            boolean r6 = r5.c
            r20 = r15
            java.lang.String r15 = r7.d
            b46 r4 = (defpackage.b46) r4
            r10.<init>(r15, r3, r4, r6)
            r4 = r10
            r28 = r11
            goto L_0x02e6
        L_0x0202:
            r20 = r15
            mbe r4 = r5.b
            boolean r6 = r5.c
            if (r10 == 0) goto L_0x020f
            r15 = 48
        L_0x020c:
            r21 = r4
            goto L_0x0228
        L_0x020f:
            ny5 r10 = new ny5
            r10.<init>()
            java.lang.String r15 = "application/cea-608"
            java.lang.String r15 = defpackage.ia9.l(r15)
            r10.m = r15
            qy5 r15 = new qy5
            r15.<init>(r10)
            java.util.List r10 = java.util.Collections.singletonList(r15)
            r15 = 16
            goto L_0x020c
        L_0x0228:
            java.lang.String r4 = r7.j
            boolean r22 = android.text.TextUtils.isEmpty(r4)
            r28 = r11
            if (r22 != 0) goto L_0x0248
            java.lang.String r11 = "audio/mp4a-latm"
            java.lang.String r11 = defpackage.ia9.a(r4, r11)
            if (r11 == 0) goto L_0x023b
            goto L_0x023d
        L_0x023b:
            r15 = r15 | 2
        L_0x023d:
            java.lang.String r11 = "video/avc"
            java.lang.String r4 = defpackage.ia9.a(r4, r11)
            if (r4 == 0) goto L_0x0246
            goto L_0x0248
        L_0x0246:
            r15 = r15 | 4
        L_0x0248:
            if (r6 != 0) goto L_0x024d
            r25 = r18
            goto L_0x024f
        L_0x024d:
            r25 = r21
        L_0x024f:
            r24 = r6 ^ 1
            i3f r4 = new i3f
            df4 r6 = new df4
            r11 = 1
            r6.<init>(r10, r15, r11)
            r23 = 2
            r22 = r4
            r26 = r3
            r27 = r6
            r22.<init>(r23, r24, r25, r26, r27)
            goto L_0x02e6
        L_0x0266:
            r28 = r11
            r20 = r15
            mbe r4 = r5.b
            boolean r6 = r5.c
            f99 r11 = r7.k
            if (r11 != 0) goto L_0x0276
            r21 = r4
        L_0x0274:
            r4 = 0
            goto L_0x0294
        L_0x0276:
            r12 = 0
        L_0x0277:
            d99[] r15 = r11.a
            r21 = r4
            int r4 = r15.length
            if (r12 >= r4) goto L_0x0274
            r4 = r15[r12]
            boolean r15 = r4 instanceof defpackage.xn6
            if (r15 == 0) goto L_0x028f
            xn6 r4 = (defpackage.xn6) r4
            java.util.List r4 = r4.c
            boolean r4 = r4.isEmpty()
            r11 = 1
            r4 = r4 ^ r11
            goto L_0x0294
        L_0x028f:
            int r12 = r12 + 1
            r4 = r21
            goto L_0x0277
        L_0x0294:
            if (r4 == 0) goto L_0x0298
            r4 = 4
            goto L_0x0299
        L_0x0298:
            r4 = 0
        L_0x0299:
            if (r6 != 0) goto L_0x02a2
            r4 = r4 | 32
            r24 = r4
            r23 = r18
            goto L_0x02a6
        L_0x02a2:
            r24 = r4
            r23 = r21
        L_0x02a6:
            f26 r4 = new f26
            if (r10 == 0) goto L_0x02ad
            r26 = r10
            goto L_0x02b1
        L_0x02ad:
            ffc r6 = defpackage.ffc.X
            r26 = r6
        L_0x02b1:
            r27 = 0
            r22 = r4
            r25 = r3
            r22.<init>(r23, r24, r25, r26, r27)
            goto L_0x02e6
        L_0x02bb:
            r28 = r11
            r20 = r15
            sd9 r4 = new sd9
            r6 = 0
            r10 = 0
            r4.<init>(r6, r10)
            goto L_0x02e6
        L_0x02c8:
            r28 = r11
            r20 = r15
            r6 = 0
            ec r4 = new ec
            r4.<init>(r6)
            goto L_0x02e6
        L_0x02d3:
            r28 = r11
            r20 = r15
            v3 r4 = new v3
            r4.<init>()
            goto L_0x02e6
        L_0x02dd:
            r28 = r11
            r20 = r15
            r3 r4 = new r3
            r4.<init>()
        L_0x02e6:
            r4.getClass()
            boolean r6 = r4.n(r8)     // Catch:{ EOFException -> 0x02f7, all -> 0x02f1 }
            r10 = 0
            r8.Y = r10
            goto L_0x02fb
        L_0x02f1:
            r0 = move-exception
            r10 = 0
            r1 = r0
            r8.Y = r10
            throw r1
        L_0x02f7:
            r10 = 0
            r8.Y = r10
            r6 = r10
        L_0x02fb:
            if (r6 == 0) goto L_0x0315
            te r1 = new te
            mbe r2 = r5.b
            boolean r5 = r5.c
            r20 = r2
            b46 r20 = (defpackage.b46) r20
            r16 = r1
            r17 = r4
            r18 = r7
            r19 = r3
            r21 = r5
            r16.<init>(r17, r18, r19, r20, r21)
            goto L_0x034b
        L_0x0315:
            if (r17 != 0) goto L_0x0323
            if (r14 == r9) goto L_0x0321
            if (r14 == r2) goto L_0x0321
            if (r14 == r1) goto L_0x0321
            r3 = 11
            if (r14 != r3) goto L_0x0323
        L_0x0321:
            r17 = r4
        L_0x0323:
            int r13 = r13 + 1
            r3 = r10
            r15 = r20
            r11 = r28
            r4 = 1
            r6 = 8
            r10 = 7
            goto L_0x01ba
        L_0x0330:
            r28 = r11
            r10 = 0
            te r1 = new te
            r17.getClass()
            mbe r2 = r5.b
            boolean r4 = r5.c
            r20 = r2
            b46 r20 = (defpackage.b46) r20
            r16 = r1
            r18 = r7
            r19 = r3
            r21 = r4
            r16.<init>(r17, r18, r19, r20, r21)
        L_0x034b:
            r0.O0 = r1
            java.lang.Object r1 = r1.b
            la5 r1 = (defpackage.la5) r1
            la5 r1 = r1.m()
            boolean r2 = r1 instanceof defpackage.ec
            if (r2 != 0) goto L_0x0368
            boolean r2 = r1 instanceof defpackage.r3
            if (r2 != 0) goto L_0x0368
            boolean r2 = r1 instanceof defpackage.v3
            if (r2 != 0) goto L_0x0368
            boolean r1 = r1 instanceof defpackage.sd9
            if (r1 == 0) goto L_0x0366
            goto L_0x0368
        L_0x0366:
            r1 = r10
            goto L_0x0369
        L_0x0368:
            r1 = 1
        L_0x0369:
            if (r1 == 0) goto L_0x039f
            tn6 r1 = r0.P0
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r28 > r2 ? 1 : (r28 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x037f
            tue r2 = r0.F0
            r11 = r28
            long r2 = r2.b(r11)
            goto L_0x0381
        L_0x037f:
            long r2 = r0.Z
        L_0x0381:
            long r4 = r1.g1
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x03c1
            r1.g1 = r2
            rn6[] r1 = r1.G0
            int r4 = r1.length
            r6 = r10
        L_0x038d:
            if (r6 >= r4) goto L_0x03c1
            r5 = r1[r6]
            long r11 = r5.F
            int r7 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x039c
            r5.F = r2
            r7 = 1
            r5.z = r7
        L_0x039c:
            int r6 = r6 + 1
            goto L_0x038d
        L_0x039f:
            tn6 r1 = r0.P0
            long r2 = r1.g1
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x03c1
            r1.g1 = r4
            rn6[] r1 = r1.G0
            int r2 = r1.length
            r6 = r10
        L_0x03af:
            if (r6 >= r2) goto L_0x03c1
            r3 = r1[r6]
            long r11 = r3.F
            int r7 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x03be
            r3.F = r4
            r7 = 1
            r3.z = r7
        L_0x03be:
            int r6 = r6 + 1
            goto L_0x03af
        L_0x03c1:
            tn6 r1 = r0.P0
            java.util.HashSet r1 = r1.I0
            r1.clear()
            te r1 = r0.O0
            tn6 r2 = r0.P0
            java.lang.Object r1 = r1.b
            la5 r1 = (defpackage.la5) r1
            r1.S(r2)
            goto L_0x03d5
        L_0x03d4:
            r10 = r3
        L_0x03d5:
            tn6 r1 = r0.P0
            dr4 r2 = r1.h1
            dr4 r0 = r0.I0
            boolean r2 = defpackage.oaf.a(r2, r0)
            if (r2 != 0) goto L_0x03fb
            r1.h1 = r0
            r3 = r10
        L_0x03e4:
            rn6[] r2 = r1.G0
            int r4 = r2.length
            if (r3 >= r4) goto L_0x03fb
            boolean[] r4 = r1.Z0
            boolean r4 = r4[r3]
            if (r4 == 0) goto L_0x03f7
            r2 = r2[r3]
            r2.I = r0
            r4 = 1
            r2.z = r4
            goto L_0x03f8
        L_0x03f7:
            r4 = 1
        L_0x03f8:
            int r3 = r3 + 1
            goto L_0x03e4
        L_0x03fb:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dm6.g(t24, a34, boolean):sa4");
    }

    public final void load() {
        te teVar;
        this.P0.getClass();
        if (this.O0 == null && (teVar = this.C0) != null) {
            la5 m = ((la5) teVar.b).m();
            if ((m instanceof i3f) || (m instanceof f26)) {
                this.O0 = this.C0;
                this.R0 = false;
            }
        }
        if (this.R0) {
            t24 t24 = this.A0;
            t24.getClass();
            a34 a34 = this.B0;
            a34.getClass();
            d(t24, a34, this.M0, false);
            this.Q0 = 0;
            this.R0 = false;
        }
        if (!this.S0) {
            if (!this.E0) {
                d(this.t0, this.b, this.L0, true);
            }
            this.T0 = !this.S0;
        }
    }
}
