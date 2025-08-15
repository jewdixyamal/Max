package defpackage;

import android.net.Uri;
import java.io.EOFException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: cm6  reason: default package */
public final class cm6 extends f78 {
    public static final AtomicInteger W0 = new AtomicInteger();
    public final r24 A0;
    public final z24 B0;
    public final nw4 C0;
    public final boolean D0;
    public final boolean E0;
    public final sue F0;
    public final zl6 G0;
    public final List H0;
    public final cr4 I0;
    public final at6 J0;
    public final yaf K0;
    public final boolean L0;
    public final boolean M0;
    public nw4 N0;
    public sn6 O0;
    public int P0;
    public boolean Q0;
    public volatile boolean R0;
    public boolean S0;
    public zw6 T0;
    public boolean U0;
    public boolean V0;
    public final int v0;
    public final int w0;
    public final Uri x0;
    public final boolean y0;
    public final int z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cm6(zl6 zl6, r24 r24, z24 z24, oy5 oy5, boolean z, r24 r242, z24 z242, boolean z2, Uri uri, List list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, sue sue, cr4 cr4, nw4 nw4, at6 at6, yaf yaf, boolean z6, i4b i4b) {
        super(r24, z24, oy5, i, obj, j, j2, j3);
        z24 z243 = z242;
        this.L0 = z;
        this.z0 = i2;
        this.V0 = z3;
        this.w0 = i3;
        this.B0 = z243;
        this.A0 = r242;
        this.Q0 = z243 != null;
        this.M0 = z2;
        this.x0 = uri;
        this.D0 = z5;
        this.F0 = sue;
        this.E0 = z4;
        this.G0 = zl6;
        this.H0 = list;
        this.I0 = cr4;
        this.C0 = nw4;
        this.J0 = at6;
        this.K0 = yaf;
        this.y0 = z6;
        ls5 ls5 = zw6.b;
        this.T0 = ffc.X;
        this.v0 = W0.getAndIncrement();
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
        this.R0 = true;
    }

    public final boolean c() {
        throw null;
    }

    public final void d(r24 r24, z24 z24, boolean z, boolean z2) {
        z24 z242;
        ra4 g;
        long j;
        long j2;
        nw4 nw4;
        boolean z3 = false;
        if (z) {
            if (this.P0 != 0) {
                z3 = true;
            }
            z242 = z24;
        } else {
            z242 = z24.b((long) this.P0);
        }
        try {
            g = g(r24, z242, z2);
            if (z3) {
                g.z(this.P0);
            }
            do {
                if (!this.R0) {
                    nw4 = this.N0;
                }
                break;
            } while (((ka5) nw4.b).i(g, nw4.X) == 0);
            break;
            j = g.o;
            j2 = z24.f;
        } catch (EOFException e) {
            if ((this.o.X & 16384) != 0) {
                ((ka5) this.N0.b).d(0, 0);
                j = g.o;
                j2 = z24.f;
            } else {
                throw e;
            }
        } catch (Throwable th) {
            kq0.f(r24);
            throw th;
        }
        this.P0 = (int) (j - j2);
        kq0.f(r24);
    }

    public final int f(int i) {
        np8.f(!this.y0);
        if (i >= this.T0.size()) {
            return 0;
        }
        return ((Integer) this.T0.get(i)).intValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:135:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x030b  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x033f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x015a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ra4 g(defpackage.r24 r23, defpackage.z24 r24, boolean r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = r24
            long r6 = r23.L(r24)
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10 = 0
            r11 = 1
            if (r25 == 0) goto L_0x0053
            sue r2 = r0.F0     // Catch:{ InterruptedException -> 0x004d }
            boolean r3 = r0.D0     // Catch:{ InterruptedException -> 0x004d }
            long r4 = r0.Z     // Catch:{ InterruptedException -> 0x004d }
            monitor-enter(r2)     // Catch:{ InterruptedException -> 0x004d }
            long r12 = r2.a     // Catch:{ all -> 0x003d }
            r14 = 9223372036854775806(0x7ffffffffffffffe, double:NaN)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 != 0) goto L_0x0025
            r12 = r11
            goto L_0x0026
        L_0x0025:
            r12 = r10
        L_0x0026:
            defpackage.np8.f(r12)     // Catch:{ all -> 0x003d }
            long r12 = r2.b     // Catch:{ all -> 0x003d }
            int r12 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r12 == 0) goto L_0x0031
            monitor-exit(r2)     // Catch:{ InterruptedException -> 0x004d }
            goto L_0x0053
        L_0x0031:
            if (r3 == 0) goto L_0x003f
            java.lang.ThreadLocal r3 = r2.d     // Catch:{ all -> 0x003d }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x003d }
            r3.set(r4)     // Catch:{ all -> 0x003d }
            goto L_0x0049
        L_0x003d:
            r0 = move-exception
            goto L_0x004b
        L_0x003f:
            long r3 = r2.b     // Catch:{ all -> 0x003d }
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x0049
            r2.wait()     // Catch:{ all -> 0x003d }
            goto L_0x003f
        L_0x0049:
            monitor-exit(r2)     // Catch:{ InterruptedException -> 0x004d }
            goto L_0x0053
        L_0x004b:
            monitor-exit(r2)     // Catch:{ all -> 0x003d }
            throw r0     // Catch:{ InterruptedException -> 0x004d }
        L_0x004d:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            r0.<init>()
            throw r0
        L_0x0053:
            ra4 r12 = new ra4
            long r4 = r1.f
            r2 = r12
            r3 = r23
            r2.<init>(r3, r4, r6)
            nw4 r2 = r0.N0
            if (r2 != 0) goto L_0x0374
            yaf r2 = r0.K0
            r12.Y = r10
            r3 = 10
            r4 = 8
            r2.E(r3)     // Catch:{ EOFException -> 0x007a }
            byte[] r5 = r2.a     // Catch:{ EOFException -> 0x007a }
            r12.q(r5, r10, r3, r10)     // Catch:{ EOFException -> 0x007a }
            int r5 = r2.x()
            r6 = 4801587(0x494433, float:6.728456E-39)
            if (r5 == r6) goto L_0x007c
        L_0x007a:
            r2 = r8
            goto L_0x00d6
        L_0x007c:
            r5 = 3
            r2.I(r5)
            int r5 = r2.u()
            int r6 = r5 + 10
            byte[] r7 = r2.a
            int r13 = r7.length
            if (r6 <= r13) goto L_0x0093
            r2.E(r6)
            byte[] r6 = r2.a
            java.lang.System.arraycopy(r7, r10, r6, r10, r3)
        L_0x0093:
            byte[] r6 = r2.a
            r12.q(r6, r3, r5, r10)
            byte[] r3 = r2.a
            at6 r6 = r0.J0
            e99 r3 = r6.u0(r5, r3)
            if (r3 != 0) goto L_0x00a3
            goto L_0x007a
        L_0x00a3:
            c99[] r3 = r3.a
            int r5 = r3.length
            r6 = r10
        L_0x00a7:
            if (r6 >= r5) goto L_0x007a
            r7 = r3[r6]
            boolean r13 = r7 instanceof defpackage.f9b
            if (r13 == 0) goto L_0x00d3
            f9b r7 = (defpackage.f9b) r7
            java.lang.String r13 = r7.b
            java.lang.String r14 = "com.apple.streaming.transportStreamTimestamp"
            boolean r13 = r14.equals(r13)
            if (r13 == 0) goto L_0x00d3
            byte[] r3 = r2.a
            byte[] r5 = r7.c
            java.lang.System.arraycopy(r5, r10, r3, r10, r4)
            r2.H(r10)
            r2.G(r4)
            long r2 = r2.p()
            r5 = 8589934591(0x1ffffffff, double:4.2439915814E-314)
            long r2 = r2 & r5
            goto L_0x00d6
        L_0x00d3:
            int r6 = r6 + 1
            goto L_0x00a7
        L_0x00d6:
            r12.Y = r10
            nw4 r5 = r0.C0
            if (r5 == 0) goto L_0x015a
            java.lang.Object r1 = r5.b
            ka5 r1 = (defpackage.ka5) r1
            boolean r4 = r1 instanceof defpackage.h3f
            if (r4 != 0) goto L_0x00eb
            boolean r1 = r1 instanceof defpackage.e26
            if (r1 == 0) goto L_0x00e9
            goto L_0x00eb
        L_0x00e9:
            r1 = r10
            goto L_0x00ec
        L_0x00eb:
            r1 = r11
        L_0x00ec:
            r1 = r1 ^ r11
            defpackage.np8.f(r1)
            java.lang.Object r1 = r5.b
            ka5 r1 = (defpackage.ka5) r1
            boolean r4 = r1 instanceof defpackage.s4g
            java.lang.Object r13 = r5.o
            sue r13 = (defpackage.sue) r13
            java.lang.Object r5 = r5.c
            oy5 r5 = (defpackage.oy5) r5
            if (r4 == 0) goto L_0x0108
            s4g r1 = new s4g
            java.lang.String r4 = r5.c
            r1.<init>(r4, r13)
            goto L_0x012f
        L_0x0108:
            boolean r4 = r1 instanceof defpackage.dc
            if (r4 == 0) goto L_0x0112
            dc r1 = new dc
            r1.<init>()
            goto L_0x012f
        L_0x0112:
            boolean r4 = r1 instanceof defpackage.q3
            if (r4 == 0) goto L_0x011c
            q3 r1 = new q3
            r1.<init>()
            goto L_0x012f
        L_0x011c:
            boolean r4 = r1 instanceof defpackage.u3
            if (r4 == 0) goto L_0x0126
            u3 r1 = new u3
            r1.<init>()
            goto L_0x012f
        L_0x0126:
            boolean r4 = r1 instanceof defpackage.rd9
            if (r4 == 0) goto L_0x013a
            rd9 r1 = new rd9
            r1.<init>()
        L_0x012f:
            nw4 r4 = new nw4
            r14 = 1
            r4.<init>((java.lang.Object) r1, (java.lang.Object) r5, (java.lang.Object) r13, (int) r14)
            r19 = r2
            r3 = r10
            goto L_0x02ef
        L_0x013a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            int r2 = r1.length()
            java.lang.String r3 = "Unexpected extractor type for recreation: "
            if (r2 == 0) goto L_0x0151
            java.lang.String r1 = r3.concat(r1)
            goto L_0x0156
        L_0x0151:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3)
        L_0x0156:
            r0.<init>(r1)
            throw r0
        L_0x015a:
            zl6 r5 = r0.G0
            android.net.Uri r1 = r1.a
            oy5 r13 = r0.o
            java.util.List r14 = r0.H0
            sue r15 = r0.F0
            java.util.Map r8 = r23.a()
            oq9 r5 = (defpackage.oq9) r5
            r5.getClass()
            java.lang.String r5 = r13.w0
            int r5 = defpackage.j1e.w(r5)
            java.lang.String r9 = "Content-Type"
            java.lang.Object r8 = r8.get(r9)
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto L_0x018b
            boolean r16 = r8.isEmpty()
            if (r16 == 0) goto L_0x0184
            goto L_0x018b
        L_0x0184:
            java.lang.Object r8 = r8.get(r10)
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x018c
        L_0x018b:
            r8 = 0
        L_0x018c:
            int r8 = defpackage.j1e.w(r8)
            int r1 = defpackage.j1e.x(r1)
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 7
            r6.<init>(r7)
            defpackage.oq9.e(r6, r5)
            defpackage.oq9.e(r6, r8)
            defpackage.oq9.e(r6, r1)
            int[] r17 = defpackage.oq9.o
            r9 = r10
        L_0x01a6:
            if (r9 >= r7) goto L_0x01b2
            r4 = r17[r9]
            defpackage.oq9.e(r6, r4)
            int r9 = r9 + 1
            r4 = 8
            goto L_0x01a6
        L_0x01b2:
            r12.Y = r10
            r4 = r10
            r9 = 0
        L_0x01b6:
            int r10 = r6.size()
            if (r4 >= r10) goto L_0x02e2
            java.lang.Object r10 = r6.get(r4)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r7 = 11
            if (r10 == 0) goto L_0x02a2
            if (r10 == r11) goto L_0x0297
            r11 = 2
            if (r10 == r11) goto L_0x028c
            r11 = 7
            if (r10 == r11) goto L_0x027f
            r11 = 8
            if (r10 == r11) goto L_0x0246
            if (r10 == r7) goto L_0x01f2
            r11 = 13
            if (r10 == r11) goto L_0x01e4
            r19 = r2
            r18 = r6
            r6 = 0
            r11 = 0
            goto L_0x02ac
        L_0x01e4:
            s4g r11 = new s4g
            java.lang.String r7 = r13.c
            r11.<init>(r7, r15)
            r19 = r2
            r18 = r6
        L_0x01ef:
            r6 = 0
            goto L_0x02ac
        L_0x01f2:
            if (r14 == 0) goto L_0x01fa
            r7 = 48
            r18 = r6
            r11 = r14
            goto L_0x0215
        L_0x01fa:
            my5 r7 = new my5
            r7.<init>()
            java.lang.String r11 = "application/cea-608"
            r7.k = r11
            oy5 r11 = new oy5
            r11.<init>(r7)
            java.util.List r7 = java.util.Collections.singletonList(r11)
            r11 = 16
            r18 = r6
            r21 = r11
            r11 = r7
            r7 = r21
        L_0x0215:
            java.lang.String r6 = r13.t0
            boolean r19 = android.text.TextUtils.isEmpty(r6)
            if (r19 != 0) goto L_0x0236
            r19 = r2
            java.lang.String r2 = "audio/mp4a-latm"
            java.lang.String r2 = defpackage.ha9.a(r6, r2)
            if (r2 == 0) goto L_0x0228
            goto L_0x022a
        L_0x0228:
            r7 = r7 | 2
        L_0x022a:
            java.lang.String r2 = "video/avc"
            java.lang.String r2 = defpackage.ha9.a(r6, r2)
            if (r2 == 0) goto L_0x0233
            goto L_0x0238
        L_0x0233:
            r7 = r7 | 4
            goto L_0x0238
        L_0x0236:
            r19 = r2
        L_0x0238:
            h3f r2 = new h3f
            df4 r3 = new df4
            r6 = 0
            r3.<init>(r11, r7, r6)
            r6 = 2
            r2.<init>(r6, r15, r3)
            r11 = r2
            goto L_0x01ef
        L_0x0246:
            r19 = r2
            r18 = r6
            e26 r11 = new e26
            e99 r2 = r13.u0
            if (r2 != 0) goto L_0x0252
        L_0x0250:
            r2 = 0
            goto L_0x026c
        L_0x0252:
            r3 = 0
        L_0x0253:
            c99[] r6 = r2.a
            int r7 = r6.length
            if (r3 >= r7) goto L_0x0250
            r6 = r6[r3]
            boolean r7 = r6 instanceof defpackage.wn6
            if (r7 == 0) goto L_0x0269
            wn6 r6 = (defpackage.wn6) r6
            java.util.List r2 = r6.c
            boolean r2 = r2.isEmpty()
            r3 = 1
            r2 = r2 ^ r3
            goto L_0x026c
        L_0x0269:
            int r3 = r3 + 1
            goto L_0x0253
        L_0x026c:
            if (r2 == 0) goto L_0x0270
            r2 = 4
            goto L_0x0271
        L_0x0270:
            r2 = 0
        L_0x0271:
            if (r14 == 0) goto L_0x0276
            r3 = r14
        L_0x0274:
            r6 = 0
            goto L_0x027b
        L_0x0276:
            java.util.List r3 = java.util.Collections.emptyList()
            goto L_0x0274
        L_0x027b:
            r11.<init>(r2, r15, r3, r6)
            goto L_0x02ac
        L_0x027f:
            r19 = r2
            r18 = r6
            r6 = 0
            rd9 r11 = new rd9
            r2 = 0
            r11.<init>(r2)
            goto L_0x02ac
        L_0x028c:
            r19 = r2
            r18 = r6
            r6 = 0
            dc r11 = new dc
            r11.<init>()
            goto L_0x02ac
        L_0x0297:
            r19 = r2
            r18 = r6
            r6 = 0
            u3 r11 = new u3
            r11.<init>()
            goto L_0x02ac
        L_0x02a2:
            r19 = r2
            r18 = r6
            r6 = 0
            q3 r11 = new q3
            r11.<init>()
        L_0x02ac:
            r11.getClass()
            boolean r2 = r11.h(r12)     // Catch:{ EOFException -> 0x02bd, all -> 0x02b7 }
            r3 = 0
            r12.Y = r3
            goto L_0x02c1
        L_0x02b7:
            r0 = move-exception
            r3 = 0
            r1 = r0
            r12.Y = r3
            throw r1
        L_0x02bd:
            r3 = 0
            r12.Y = r3
            r2 = r3
        L_0x02c1:
            if (r2 == 0) goto L_0x02cb
            nw4 r1 = new nw4
            r2 = 1
            r1.<init>((java.lang.Object) r11, (java.lang.Object) r13, (java.lang.Object) r15, (int) r2)
        L_0x02c9:
            r4 = r1
            goto L_0x02ef
        L_0x02cb:
            if (r9 != 0) goto L_0x02d8
            if (r10 == r5) goto L_0x02d7
            if (r10 == r8) goto L_0x02d7
            if (r10 == r1) goto L_0x02d7
            r2 = 11
            if (r10 != r2) goto L_0x02d8
        L_0x02d7:
            r9 = r11
        L_0x02d8:
            int r4 = r4 + 1
            r6 = r18
            r2 = r19
            r7 = 7
            r11 = 1
            goto L_0x01b6
        L_0x02e2:
            r19 = r2
            r3 = 0
            nw4 r1 = new nw4
            r9.getClass()
            r2 = 1
            r1.<init>((java.lang.Object) r9, (java.lang.Object) r13, (java.lang.Object) r15, (int) r2)
            goto L_0x02c9
        L_0x02ef:
            r0.N0 = r4
            java.lang.Object r1 = r4.b
            ka5 r1 = (defpackage.ka5) r1
            boolean r2 = r1 instanceof defpackage.dc
            if (r2 != 0) goto L_0x0308
            boolean r2 = r1 instanceof defpackage.q3
            if (r2 != 0) goto L_0x0308
            boolean r2 = r1 instanceof defpackage.u3
            if (r2 != 0) goto L_0x0308
            boolean r1 = r1 instanceof defpackage.rd9
            if (r1 == 0) goto L_0x0306
            goto L_0x0308
        L_0x0306:
            r1 = r3
            goto L_0x0309
        L_0x0308:
            r1 = 1
        L_0x0309:
            if (r1 == 0) goto L_0x033f
            sn6 r1 = r0.O0
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r19 > r4 ? 1 : (r19 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x031f
            sue r2 = r0.F0
            r8 = r19
            long r4 = r2.b(r8)
            goto L_0x0321
        L_0x031f:
            long r4 = r0.Z
        L_0x0321:
            long r6 = r1.g1
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0361
            r1.g1 = r4
            qn6[] r1 = r1.G0
            int r2 = r1.length
            r6 = r3
        L_0x032d:
            if (r6 >= r2) goto L_0x0361
            r7 = r1[r6]
            long r8 = r7.F
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x033c
            r7.F = r4
            r8 = 1
            r7.z = r8
        L_0x033c:
            int r6 = r6 + 1
            goto L_0x032d
        L_0x033f:
            sn6 r1 = r0.O0
            long r4 = r1.g1
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x0361
            r1.g1 = r6
            qn6[] r1 = r1.G0
            int r2 = r1.length
            r4 = r3
        L_0x034f:
            if (r4 >= r2) goto L_0x0361
            r5 = r1[r4]
            long r8 = r5.F
            int r8 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x035e
            r5.F = r6
            r8 = 1
            r5.z = r8
        L_0x035e:
            int r4 = r4 + 1
            goto L_0x034f
        L_0x0361:
            sn6 r1 = r0.O0
            java.util.HashSet r1 = r1.I0
            r1.clear()
            nw4 r1 = r0.N0
            sn6 r2 = r0.O0
            java.lang.Object r1 = r1.b
            ka5 r1 = (defpackage.ka5) r1
            r1.g(r2)
            goto L_0x0375
        L_0x0374:
            r3 = r10
        L_0x0375:
            sn6 r1 = r0.O0
            cr4 r0 = r0.I0
            cr4 r2 = r1.h1
            boolean r2 = defpackage.maf.a(r2, r0)
            if (r2 != 0) goto L_0x039b
            r1.h1 = r0
            r10 = r3
        L_0x0384:
            qn6[] r2 = r1.G0
            int r3 = r2.length
            if (r10 >= r3) goto L_0x039b
            boolean[] r3 = r1.Z0
            boolean r3 = r3[r10]
            if (r3 == 0) goto L_0x0397
            r2 = r2[r10]
            r2.I = r0
            r3 = 1
            r2.z = r3
            goto L_0x0398
        L_0x0397:
            r3 = 1
        L_0x0398:
            int r10 = r10 + 1
            goto L_0x0384
        L_0x039b:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cm6.g(r24, z24, boolean):ra4");
    }

    public final void load() {
        nw4 nw4;
        this.O0.getClass();
        if (this.N0 == null && (nw4 = this.C0) != null) {
            ka5 ka5 = (ka5) nw4.b;
            if ((ka5 instanceof h3f) || (ka5 instanceof e26)) {
                this.N0 = nw4;
                this.Q0 = false;
            }
        }
        if (this.Q0) {
            r24 r24 = this.A0;
            r24.getClass();
            z24 z24 = this.B0;
            z24.getClass();
            d(r24, z24, this.M0, false);
            this.P0 = 0;
            this.Q0 = false;
        }
        if (!this.R0) {
            if (!this.E0) {
                d(this.t0, this.b, this.L0, true);
            }
            this.S0 = !this.R0;
        }
    }
}
