package defpackage;

import android.media.MediaCodec;
import java.util.ArrayList;

/* renamed from: k65  reason: default package */
public final class k65 extends j65 {
    public final boolean P0;
    public final u43 Q0;
    public final int R0;
    public final ArrayList S0 = new ArrayList();
    public j2d T0;
    public int U0;

    public k65(boolean z, glc glc, int i, g03 g03, wt wtVar) {
        super(2, g03, wtVar);
        this.P0 = z;
        this.Q0 = glc;
        this.R0 = i;
    }

    public final boolean G() {
        if (this.F0.d()) {
            this.E0.e();
            this.G0 = true;
            return false;
        }
        y84 y84 = this.F0;
        MediaCodec.BufferInfo bufferInfo = y84.f(false) ? y84.a : null;
        if (bufferInfo == null) {
            return false;
        }
        long j = bufferInfo.presentationTimeUs;
        long j2 = j - this.C0;
        if (j2 >= 0) {
            ArrayList arrayList = this.S0;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                if (((Long) arrayList.get(i)).longValue() == j) {
                    arrayList.remove(i);
                } else {
                    i++;
                }
            }
            if (this.E0.c() == this.U0 || !this.E0.h(j2)) {
                return false;
            }
            this.F0.j(j2, true);
            return true;
        }
        this.F0.i();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r3.R0 == 1) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void H(defpackage.qy5 r4) {
        /*
            r3 = this;
            wqc r0 = r3.E0
            defpackage.fm9.l(r0)
            i63 r0 = r4.A
            boolean r0 = defpackage.i63.g(r0)
            if (r0 == 0) goto L_0x0013
            int r0 = r3.R0
            r1 = 1
            if (r0 != r1) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            wqc r0 = r3.E0
            android.view.Surface r0 = r0.a()
            r0.getClass()
            u43 r2 = r3.Q0
            y84 r4 = r2.d(r4, r0, r1)
            r3.F0 = r4
            int r4 = r4.f
            r3.U0 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k65.H(qy5):void");
    }

    public final void J(p54 p54) {
        long j = p54.Z;
        if (j < this.w0) {
            this.S0.add(Long.valueOf(j));
        }
    }

    public final void K(qy5 qy5) {
        if (this.P0) {
            this.T0 = new j2d(qy5);
        }
    }

    public final qy5 L(qy5 qy5) {
        if (this.R0 != 3 || !i63.g(qy5.A)) {
            return qy5;
        }
        ny5 a = qy5.a();
        a.z = i63.h;
        return a.a();
    }

    public final qy5 M(qy5 qy5) {
        i63 i63 = qy5.A;
        if (i63 == null || !i63.e()) {
            i63 = i63.h;
        }
        if (this.R0 == 1 && i63.g(i63)) {
            i63 = i63.h;
        }
        ny5 a = qy5.a();
        a.z = i63;
        return new qy5(a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x012c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean P(defpackage.p54 r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 4
            boolean r3 = r1.f(r2)
            r4 = 0
            if (r3 == 0) goto L_0x000d
            return r4
        L_0x000d:
            java.nio.ByteBuffer r3 = r1.X
            r3.getClass()
            j2d r5 = r0.T0
            r6 = 1
            if (r5 == 0) goto L_0x0136
            long r7 = r1.Z
            long r9 = r0.D0
            long r7 = r7 - r9
            itd r9 = r5.b
            if (r9 != 0) goto L_0x0024
            r5.k = r7
            goto L_0x0111
        L_0x0024:
            int r9 = r3.position()
            int r10 = r9 + 4
            r3.position(r10)
            byte[] r10 = r5.a
            r3.get(r10, r4, r2)
            java.lang.String r2 = "video/avc"
            java.lang.String r11 = r5.c
            boolean r2 = r11.equals(r2)
            if (r2 == 0) goto L_0x0061
            byte r2 = r10[r4]
            r2 = r2 & 31
            byte r11 = r10[r6]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 >> 7
            if (r11 != r6) goto L_0x004a
            r11 = r6
            goto L_0x004b
        L_0x004a:
            r11 = r4
        L_0x004b:
            r12 = 14
            if (r2 != r12) goto L_0x0053
            if (r11 == 0) goto L_0x0053
            r2 = r6
            goto L_0x0054
        L_0x0053:
            r2 = r4
        L_0x0054:
            java.lang.String r11 = "Missing SVC extension prefix NAL unit."
            defpackage.fm9.j(r11, r2)
            r2 = 3
            byte r2 = r10[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 >> 5
            goto L_0x006e
        L_0x0061:
            java.lang.String r2 = "video/hevc"
            boolean r2 = r11.equals(r2)
            if (r2 == 0) goto L_0x0130
            byte r2 = r10[r6]
            r2 = r2 & 7
            int r2 = r2 - r6
        L_0x006e:
            i2d r10 = r5.i
            if (r10 == 0) goto L_0x007c
            long r11 = r10.b
            int r11 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r11 < 0) goto L_0x007c
            r5.a()
            goto L_0x006e
        L_0x007c:
            if (r10 == 0) goto L_0x0089
            long r10 = r10.a
            int r10 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r10 < 0) goto L_0x0089
            r5.a()
        L_0x0087:
            r4 = r5
            goto L_0x00a7
        L_0x0089:
            i2d r10 = r5.h
            if (r10 == 0) goto L_0x0087
            long r11 = r10.b
            int r13 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r13 < 0) goto L_0x0087
            long r13 = r5.j
            r16 = r5
            long r4 = r10.a
            long r11 = r11 - r4
            int r4 = r10.c
            int r4 = r4 - r6
            long r4 = (long) r4
            long r11 = r11 * r4
            long r11 = r11 + r13
            r4 = r16
            r4.j = r11
            r5 = 0
            r4.h = r5
        L_0x00a7:
            i2d r5 = r4.h
            if (r5 == 0) goto L_0x00ae
            int r5 = r5.d
            goto L_0x00b0
        L_0x00ae:
            int r5 = r4.g
        L_0x00b0:
            r10 = 30
            if (r2 <= r5) goto L_0x00ed
            i2d r5 = r4.i
            if (r5 == 0) goto L_0x00eb
            int r12 = r5.d
            if (r2 < r12) goto L_0x00bd
            goto L_0x00eb
        L_0x00bd:
            long r13 = r5.a
            long r13 = r13 - r7
            long r13 = r13 * r10
            r16 = 1000000(0xf4240, double:4.940656E-318)
            long r13 = r13 / r16
            int r5 = r4.f
            int r12 = r5 - r12
            int r12 = r6 << r12
            int r12 = -r12
            float r12 = (float) r12
            r16 = 1055286886(0x3ee66666, float:0.45)
            float r12 = r12 + r16
            r15 = r6
        L_0x00d4:
            i2d r10 = r4.i
            int r10 = r10.d
            if (r15 >= r10) goto L_0x00eb
            float r10 = (float) r13
            int r11 = r5 - r15
            int r11 = r6 << r11
            float r11 = (float) r11
            float r11 = r11 + r12
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 >= 0) goto L_0x00eb
            if (r2 > r15) goto L_0x00e8
            goto L_0x00ed
        L_0x00e8:
            int r15 = r15 + 1
            goto L_0x00d4
        L_0x00eb:
            r2 = 0
            goto L_0x00ee
        L_0x00ed:
            r2 = r6
        L_0x00ee:
            long r10 = r4.j
            long r10 = r10 + r7
            i2d r5 = r4.h
            if (r5 == 0) goto L_0x00fe
            long r12 = r5.a
            long r7 = r7 - r12
            int r5 = r5.c
            int r5 = r5 - r6
            long r12 = (long) r5
            long r7 = r7 * r12
            long r10 = r10 + r7
        L_0x00fe:
            r7 = 30
            long r10 = r10 * r7
            float r5 = (float) r10
            float r7 = r4.e
            float r5 = r5 / r7
            int r5 = java.lang.Math.round(r5)
            long r7 = (long) r5
            r4.k = r7
            if (r2 == 0) goto L_0x012c
            r3.position(r9)
        L_0x0111:
            long r2 = r0.D0
            j2d r4 = r0.T0
            long r7 = r4.k
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 == 0) goto L_0x0122
            r5 = r6
            goto L_0x0123
        L_0x0122:
            r5 = 0
        L_0x0123:
            defpackage.fm9.k(r5)
            long r4 = r4.k
            long r2 = r2 + r4
            r1.Z = r2
            goto L_0x0136
        L_0x012c:
            r3.clear()
            return r6
        L_0x0130:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0136:
            y84 r2 = r0.F0
            if (r2 != 0) goto L_0x014b
            long r2 = r1.Z
            long r4 = r0.C0
            long r2 = r2 - r4
            r1.Z = r2
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x014b
            r19.v()
            return r6
        L_0x014b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k65.P(p54):boolean");
    }

    public final String k() {
        return "ExoAssetLoaderVideoRenderer";
    }
}
