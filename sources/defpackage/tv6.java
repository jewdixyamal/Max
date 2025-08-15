package defpackage;

import android.graphics.Bitmap;
import android.os.Trace;
import androidx.media3.exoplayer.image.ImageDecoderException;
import java.util.ArrayDeque;

/* renamed from: tv6  reason: default package */
public final class tv6 extends vj0 {
    public final ku6 C0;
    public final p54 D0 = new p54(0);
    public final ArrayDeque E0 = new ArrayDeque();
    public boolean F0;
    public boolean G0;
    public sv6 H0 = sv6.c;
    public long I0 = -9223372036854775807L;
    public long J0 = -9223372036854775807L;
    public int K0 = 0;
    public int L0 = 1;
    public qy5 M0;
    public vn0 N0;
    public p54 O0;
    public dv6 P0 = dv6.a;
    public Bitmap Q0;
    public boolean R0;
    public mx1 S0;
    public mx1 T0;
    public int U0;

    public tv6(o9g o9g) {
        super(4);
        this.C0 = o9g;
    }

    public final int D(qy5 qy5) {
        return ((o9g) this.C0).D(qy5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0141, code lost:
        if (r14.a == ((r0.J * r1.I) - 1)) goto L_0x0143;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean F(long r13) {
        /*
            r12 = this;
            android.graphics.Bitmap r0 = r12.Q0
            r1 = 0
            if (r0 == 0) goto L_0x000a
            mx1 r2 = r12.S0
            if (r2 != 0) goto L_0x000a
            return r1
        L_0x000a:
            int r2 = r12.L0
            r3 = 2
            if (r2 != 0) goto L_0x0014
            int r2 = r12.s0
            if (r2 == r3) goto L_0x0014
            return r1
        L_0x0014:
            java.util.ArrayDeque r2 = r12.E0
            r4 = 3
            r5 = 1
            if (r0 != 0) goto L_0x005b
            vn0 r0 = r12.N0
            defpackage.fm9.l(r0)
            vn0 r0 = r12.N0
            q54 r0 = r0.c()
            tn0 r0 = (defpackage.tn0) r0
            if (r0 != 0) goto L_0x002a
            return r1
        L_0x002a:
            r6 = 4
            boolean r6 = r0.f(r6)
            if (r6 == 0) goto L_0x004d
            int r13 = r12.K0
            if (r13 != r4) goto L_0x0041
            r12.J()
            qy5 r13 = r12.M0
            defpackage.fm9.l(r13)
            r12.H()
            goto L_0x004c
        L_0x0041:
            r0.w()
            boolean r13 = r2.isEmpty()
            if (r13 == 0) goto L_0x004c
            r12.G0 = r5
        L_0x004c:
            return r1
        L_0x004d:
            android.graphics.Bitmap r6 = r0.X
            java.lang.String r7 = "Non-EOS buffer came back from the decoder without bitmap."
            defpackage.fm9.m(r6, r7)
            android.graphics.Bitmap r6 = r0.X
            r12.Q0 = r6
            r0.w()
        L_0x005b:
            boolean r0 = r12.R0
            if (r0 == 0) goto L_0x014c
            android.graphics.Bitmap r0 = r12.Q0
            if (r0 == 0) goto L_0x014c
            mx1 r0 = r12.S0
            if (r0 == 0) goto L_0x014c
            qy5 r0 = r12.M0
            defpackage.fm9.l(r0)
            qy5 r0 = r12.M0
            int r6 = r0.I
            int r0 = r0.J
            if (r6 != r5) goto L_0x0076
            if (r0 == r5) goto L_0x007d
        L_0x0076:
            r7 = -1
            if (r6 == r7) goto L_0x007d
            if (r0 == r7) goto L_0x007d
            r0 = r5
            goto L_0x007e
        L_0x007d:
            r0 = r1
        L_0x007e:
            mx1 r6 = r12.S0
            java.lang.Object r7 = r6.c
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            if (r7 == 0) goto L_0x0087
            goto L_0x00c3
        L_0x0087:
            if (r0 == 0) goto L_0x00bc
            android.graphics.Bitmap r7 = r12.Q0
            defpackage.fm9.l(r7)
            android.graphics.Bitmap r7 = r12.Q0
            int r7 = r7.getWidth()
            qy5 r8 = r12.M0
            defpackage.fm9.l(r8)
            int r8 = r8.I
            int r7 = r7 / r8
            android.graphics.Bitmap r8 = r12.Q0
            int r8 = r8.getHeight()
            qy5 r9 = r12.M0
            defpackage.fm9.l(r9)
            int r9 = r9.J
            int r8 = r8 / r9
            qy5 r9 = r12.M0
            int r9 = r9.I
            int r10 = r6.a
            int r11 = r10 % r9
            int r11 = r11 * r7
            int r10 = r10 / r9
            int r10 = r10 * r8
            android.graphics.Bitmap r9 = r12.Q0
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r9, r11, r10, r7, r8)
            goto L_0x00c1
        L_0x00bc:
            android.graphics.Bitmap r7 = r12.Q0
            defpackage.fm9.l(r7)
        L_0x00c1:
            r6.c = r7
        L_0x00c3:
            mx1 r6 = r12.S0
            java.lang.Object r6 = r6.c
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            defpackage.fm9.l(r6)
            mx1 r6 = r12.S0
            long r6 = r6.b
            long r6 = r6 - r13
            int r13 = r12.s0
            if (r13 != r3) goto L_0x00d7
            r13 = r5
            goto L_0x00d8
        L_0x00d7:
            r13 = r1
        L_0x00d8:
            int r14 = r12.L0
            if (r14 == 0) goto L_0x00e9
            if (r14 == r5) goto L_0x00e8
            if (r14 != r4) goto L_0x00e2
            r13 = r1
            goto L_0x00e9
        L_0x00e2:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>()
            throw r12
        L_0x00e8:
            r13 = r5
        L_0x00e9:
            if (r13 != 0) goto L_0x00f4
            r13 = 30000(0x7530, double:1.4822E-319)
            int r13 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r13 >= 0) goto L_0x00f2
            goto L_0x00f4
        L_0x00f2:
            r13 = r1
            goto L_0x00fe
        L_0x00f4:
            dv6 r13 = r12.P0
            sv6 r14 = r12.H0
            long r6 = r14.b
            r13.getClass()
            r13 = r5
        L_0x00fe:
            if (r13 != 0) goto L_0x0101
            return r1
        L_0x0101:
            mx1 r13 = r12.S0
            defpackage.fm9.l(r13)
            long r13 = r13.b
            r12.I0 = r13
        L_0x010a:
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x0125
            java.lang.Object r1 = r2.peek()
            sv6 r1 = (defpackage.sv6) r1
            long r6 = r1.a
            int r1 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r1 < 0) goto L_0x0125
            java.lang.Object r1 = r2.removeFirst()
            sv6 r1 = (defpackage.sv6) r1
            r12.H0 = r1
            goto L_0x010a
        L_0x0125:
            r12.L0 = r4
            r13 = 0
            if (r0 == 0) goto L_0x0143
            mx1 r14 = r12.S0
            defpackage.fm9.l(r14)
            qy5 r0 = r12.M0
            defpackage.fm9.l(r0)
            qy5 r1 = r12.M0
            defpackage.fm9.l(r1)
            int r1 = r1.I
            int r0 = r0.J
            int r0 = r0 * r1
            int r0 = r0 - r5
            int r14 = r14.a
            if (r14 != r0) goto L_0x0145
        L_0x0143:
            r12.Q0 = r13
        L_0x0145:
            mx1 r14 = r12.T0
            r12.S0 = r14
            r12.T0 = r13
            return r5
        L_0x014c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tv6.F(long):boolean");
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [mx1, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0104, code lost:
        if (r2 == false) goto L_0x010d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean G(long r13) {
        /*
            r12 = this;
            boolean r0 = r12.R0
            r1 = 0
            if (r0 == 0) goto L_0x000a
            mx1 r0 = r12.S0
            if (r0 == 0) goto L_0x000a
            return r1
        L_0x000a:
            y7g r0 = r12.c
            r0.t()
            vn0 r2 = r12.N0
            if (r2 == 0) goto L_0x0149
            int r3 = r12.K0
            r4 = 3
            if (r3 == r4) goto L_0x0149
            boolean r3 = r12.F0
            if (r3 == 0) goto L_0x001e
            goto L_0x0149
        L_0x001e:
            p54 r3 = r12.O0
            if (r3 != 0) goto L_0x002d
            java.lang.Object r2 = r2.f()
            p54 r2 = (defpackage.p54) r2
            r12.O0 = r2
            if (r2 != 0) goto L_0x002d
            return r1
        L_0x002d:
            int r2 = r12.K0
            r3 = 2
            r5 = 0
            r6 = 4
            if (r2 != r3) goto L_0x004c
            p54 r13 = r12.O0
            defpackage.fm9.l(r13)
            p54 r13 = r12.O0
            r13.b = r6
            vn0 r13 = r12.N0
            defpackage.fm9.l(r13)
            p54 r14 = r12.O0
            r13.d(r14)
            r12.O0 = r5
            r12.K0 = r4
            return r1
        L_0x004c:
            p54 r2 = r12.O0
            int r2 = r12.y(r0, r2, r1)
            r4 = -5
            r7 = 1
            if (r2 == r4) goto L_0x013d
            r0 = -4
            if (r2 == r0) goto L_0x0063
            r12 = -3
            if (r2 != r12) goto L_0x005d
            return r1
        L_0x005d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>()
            throw r12
        L_0x0063:
            p54 r0 = r12.O0
            r0.y()
            p54 r0 = r12.O0
            java.nio.ByteBuffer r0 = r0.X
            defpackage.fm9.l(r0)
            int r0 = r0.remaining()
            if (r0 > 0) goto L_0x0083
            p54 r0 = r12.O0
            defpackage.fm9.l(r0)
            boolean r0 = r0.f(r6)
            if (r0 == 0) goto L_0x0081
            goto L_0x0083
        L_0x0081:
            r0 = r1
            goto L_0x0084
        L_0x0083:
            r0 = r7
        L_0x0084:
            if (r0 == 0) goto L_0x0095
            vn0 r2 = r12.N0
            defpackage.fm9.l(r2)
            p54 r3 = r12.O0
            defpackage.fm9.l(r3)
            r2.d(r3)
            r12.U0 = r1
        L_0x0095:
            p54 r2 = r12.O0
            defpackage.fm9.l(r2)
            boolean r3 = r2.f(r6)
            if (r3 == 0) goto L_0x00a4
            r12.R0 = r7
            goto L_0x010d
        L_0x00a4:
            mx1 r3 = new mx1
            int r4 = r12.U0
            long r8 = r2.Z
            r3.<init>()
            r3.a = r4
            r3.b = r8
            r12.T0 = r3
            int r2 = r4 + 1
            r12.U0 = r2
            boolean r2 = r12.R0
            if (r2 != 0) goto L_0x0107
            r2 = 30000(0x7530, double:1.4822E-319)
            long r10 = r8 - r2
            int r10 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r10 > 0) goto L_0x00ca
            long r2 = r2 + r8
            int r2 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x00ca
            r2 = r7
            goto L_0x00cb
        L_0x00ca:
            r2 = r1
        L_0x00cb:
            mx1 r3 = r12.S0
            if (r3 == 0) goto L_0x00db
            long r10 = r3.b
            int r3 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r3 > 0) goto L_0x00db
            int r13 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r13 >= 0) goto L_0x00db
            r13 = r7
            goto L_0x00dc
        L_0x00db:
            r13 = r1
        L_0x00dc:
            qy5 r14 = r12.M0
            defpackage.fm9.l(r14)
            int r14 = r14.I
            r3 = -1
            if (r14 == r3) goto L_0x00f5
            qy5 r14 = r12.M0
            int r8 = r14.J
            if (r8 == r3) goto L_0x00f5
            int r14 = r14.I
            int r8 = r8 * r14
            int r8 = r8 - r7
            if (r4 != r8) goto L_0x00f3
            goto L_0x00f5
        L_0x00f3:
            r14 = r1
            goto L_0x00f6
        L_0x00f5:
            r14 = r7
        L_0x00f6:
            if (r2 != 0) goto L_0x00ff
            if (r13 != 0) goto L_0x00ff
            if (r14 == 0) goto L_0x00fd
            goto L_0x00ff
        L_0x00fd:
            r14 = r1
            goto L_0x0100
        L_0x00ff:
            r14 = r7
        L_0x0100:
            r12.R0 = r14
            if (r13 == 0) goto L_0x0107
            if (r2 != 0) goto L_0x0107
            goto L_0x010d
        L_0x0107:
            mx1 r13 = r12.T0
            r12.S0 = r13
            r12.T0 = r5
        L_0x010d:
            p54 r13 = r12.O0
            defpackage.fm9.l(r13)
            boolean r13 = r13.f(r6)
            if (r13 == 0) goto L_0x011d
            r12.F0 = r7
            r12.O0 = r5
            return r1
        L_0x011d:
            long r13 = r12.J0
            p54 r1 = r12.O0
            defpackage.fm9.l(r1)
            long r1 = r1.Z
            long r13 = java.lang.Math.max(r13, r1)
            r12.J0 = r13
            if (r0 == 0) goto L_0x0131
            r12.O0 = r5
            goto L_0x0139
        L_0x0131:
            p54 r13 = r12.O0
            defpackage.fm9.l(r13)
            r13.v()
        L_0x0139:
            boolean r12 = r12.R0
            r12 = r12 ^ r7
            return r12
        L_0x013d:
            java.lang.Object r13 = r0.c
            qy5 r13 = (defpackage.qy5) r13
            defpackage.fm9.l(r13)
            r12.M0 = r13
            r12.K0 = r3
            return r7
        L_0x0149:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tv6.G(long):boolean");
    }

    public final void H() {
        qy5 qy5 = this.M0;
        o9g o9g = (o9g) this.C0;
        int D = o9g.D(qy5);
        if (D == vj0.b(4, 0, 0, 0) || D == vj0.b(3, 0, 0, 0)) {
            vn0 vn0 = this.N0;
            if (vn0 != null) {
                vn0.release();
            }
            this.N0 = new vn0((un0) o9g.b);
            return;
        }
        throw e(new Exception("Provided decoder factory can't create decoder for format."), this.M0, false, 4005);
    }

    public final void J() {
        this.O0 = null;
        this.K0 = 0;
        this.J0 = -9223372036854775807L;
        vn0 vn0 = this.N0;
        if (vn0 != null) {
            vn0.release();
            this.N0 = null;
        }
    }

    public final void a(int i, Object obj) {
        if (i == 15) {
            dv6 dv6 = obj instanceof dv6 ? (dv6) obj : null;
            if (dv6 == null) {
                dv6 = dv6.a;
            }
            this.P0 = dv6;
        }
    }

    public final String k() {
        return "ImageRenderer";
    }

    public final boolean m() {
        return this.G0;
    }

    public final boolean o() {
        int i = this.L0;
        return i == 3 || (i == 0 && this.R0);
    }

    public final void p() {
        this.M0 = null;
        this.H0 = sv6.c;
        this.E0.clear();
        J();
        this.P0.getClass();
    }

    public final void q(boolean z, boolean z2) {
        this.L0 = z2 ? 1 : 0;
    }

    public final void r(long j, boolean z) {
        this.L0 = Math.min(this.L0, 1);
        this.G0 = false;
        this.F0 = false;
        this.Q0 = null;
        this.S0 = null;
        this.T0 = null;
        this.R0 = false;
        this.O0 = null;
        vn0 vn0 = this.N0;
        if (vn0 != null) {
            vn0.flush();
        }
        this.E0.clear();
    }

    public final void s() {
        J();
    }

    public final void u() {
        J();
        this.L0 = Math.min(this.L0, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (r2 >= r7) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x(defpackage.qy5[] r6, long r7, long r9) {
        /*
            r5 = this;
            sv6 r6 = r5.H0
            long r6 = r6.b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 == 0) goto L_0x0031
            java.util.ArrayDeque r6 = r5.E0
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L_0x0026
            long r7 = r5.J0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0031
            long r2 = r5.I0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L_0x0026
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r7 < 0) goto L_0x0026
            goto L_0x0031
        L_0x0026:
            sv6 r7 = new sv6
            long r0 = r5.J0
            r7.<init>(r0, r9)
            r6.add(r7)
            goto L_0x0038
        L_0x0031:
            sv6 r6 = new sv6
            r6.<init>(r0, r9)
            r5.H0 = r6
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tv6.x(qy5[], long, long):void");
    }

    public final void z(long j, long j2) {
        if (!this.G0) {
            if (this.M0 == null) {
                y7g y7g = this.c;
                y7g.t();
                p54 p54 = this.D0;
                p54.v();
                int y = y(y7g, p54, 2);
                if (y == -5) {
                    qy5 qy5 = (qy5) y7g.c;
                    fm9.l(qy5);
                    this.M0 = qy5;
                    H();
                } else if (y == -4) {
                    fm9.k(p54.f(4));
                    this.F0 = true;
                    this.G0 = true;
                    return;
                } else {
                    return;
                }
            }
            try {
                Trace.beginSection("drainAndFeedDecoder");
                while (F(j)) {
                }
                while (G(j)) {
                }
                Trace.endSection();
            } catch (ImageDecoderException e) {
                throw e(e, (qy5) null, false, 4003);
            }
        }
    }
}
