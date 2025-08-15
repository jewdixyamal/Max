package defpackage;

import android.net.Uri;
import java.util.ArrayList;

/* renamed from: prd  reason: default package */
public final class prd implements zd8, do7 {
    public final jn X;
    public final tze Y;
    public final ArrayList Z = new ArrayList();
    public final a34 a;
    public final q24 b;
    public final z0f c;
    public final huc o;
    public final long s0;
    public final vq7 t0 = new vq7("SingleSampleMediaPeriod");
    public final qy5 u0;
    public final boolean v0;
    public boolean w0;
    public byte[] x0;
    public int y0;

    public prd(a34 a34, q24 q24, z0f z0f, qy5 qy5, long j, huc huc, jn jnVar, boolean z) {
        this.a = a34;
        this.b = q24;
        this.c = z0f;
        this.u0 = qy5;
        this.s0 = j;
        this.o = huc;
        this.X = jnVar;
        this.v0 = z;
        this.Y = new tze(new rze("", qy5));
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0082  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.b11 C(defpackage.go7 r19, long r20, long r22, java.io.IOException r24, int r25) {
        /*
            r18 = this;
            r0 = r18
            r11 = r24
            r1 = r25
            r2 = 1
            r3 = r19
            ord r3 = (defpackage.ord) r3
            u1e r3 = r3.c
            yn7 r4 = new yn7
            android.net.Uri r3 = r3.c
            r5 = r22
            r4.<init>(r5)
            int r3 = defpackage.oaf.a
            huc r3 = r0.o
            r3.getClass()
            boolean r3 = r11 instanceof androidx.media3.common.ParserException
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 != 0) goto L_0x0057
            boolean r3 = r11 instanceof java.io.FileNotFoundException
            if (r3 != 0) goto L_0x0057
            boolean r3 = r11 instanceof androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException
            if (r3 != 0) goto L_0x0057
            boolean r3 = r11 instanceof androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException
            if (r3 != 0) goto L_0x0057
            int r3 = androidx.media3.datasource.DataSourceException.b
            r3 = r11
        L_0x0035:
            if (r3 == 0) goto L_0x004a
            boolean r7 = r3 instanceof androidx.media3.datasource.DataSourceException
            if (r7 == 0) goto L_0x0045
            r7 = r3
            androidx.media3.datasource.DataSourceException r7 = (androidx.media3.datasource.DataSourceException) r7
            int r7 = r7.a
            r8 = 2008(0x7d8, float:2.814E-42)
            if (r7 != r8) goto L_0x0045
            goto L_0x0057
        L_0x0045:
            java.lang.Throwable r3 = r3.getCause()
            goto L_0x0035
        L_0x004a:
            int r3 = r1 + -1
            int r3 = r3 * 1000
            r7 = 5000(0x1388, float:7.006E-42)
            int r3 = java.lang.Math.min(r3, r7)
            long r7 = (long) r3
            r13 = r7
            goto L_0x0058
        L_0x0057:
            r13 = r5
        L_0x0058:
            int r3 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            r15 = 0
            if (r3 == 0) goto L_0x0063
            r5 = 3
            if (r1 < r5) goto L_0x0061
            goto L_0x0063
        L_0x0061:
            r1 = r15
            goto L_0x0064
        L_0x0063:
            r1 = r2
        L_0x0064:
            boolean r5 = r0.v0
            if (r5 == 0) goto L_0x0075
            if (r1 == 0) goto L_0x0075
            java.lang.String r1 = "Loading failed, treating as end-of-stream."
            defpackage.z04.d0(r1, r11)
            r0.w0 = r2
            b11 r1 = defpackage.vq7.Y
        L_0x0073:
            r13 = r1
            goto L_0x0085
        L_0x0075:
            if (r3 == 0) goto L_0x0082
            b11 r1 = new b11
            r16 = 5
            r17 = 0
            r12 = r1
            r12.<init>(r13, r15, r16, r17)
            goto L_0x0073
        L_0x0082:
            b11 r1 = defpackage.vq7.Z
            goto L_0x0073
        L_0x0085:
            boolean r1 = r13.a()
            r12 = r1 ^ 1
            r7 = 0
            long r9 = r0.s0
            jn r1 = r0.X
            r2 = 1
            r3 = -1
            qy5 r5 = r0.u0
            r6 = 0
            r14 = 0
            r0 = r1
            r1 = r4
            r4 = r5
            r5 = r6
            r6 = r14
            r11 = r24
            r0.B(r1, r2, r3, r4, r5, r6, r7, r9, r11, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.prd.C(go7, long, long, java.io.IOException, int):b11");
    }

    public final boolean a() {
        return this.t0.o();
    }

    public final long f() {
        return (this.w0 || this.t0.o()) ? Long.MIN_VALUE : 0;
    }

    public final long g(n85[] n85Arr, boolean[] zArr, grc[] grcArr, boolean[] zArr2, long j) {
        for (int i = 0; i < n85Arr.length; i++) {
            grc grc = grcArr[i];
            ArrayList arrayList = this.Z;
            if (grc != null && (n85Arr[i] == null || !zArr[i])) {
                arrayList.remove(grc);
                grcArr[i] = null;
            }
            if (grcArr[i] == null && n85Arr[i] != null) {
                nrd nrd = new nrd(this);
                arrayList.add(nrd);
                grcArr[i] = nrd;
                zArr2[i] = true;
            }
        }
        return j;
    }

    public final long h(long j, x1d x1d) {
        return j;
    }

    public final void i(xd8 xd8, long j) {
        xd8.e(this);
    }

    public final void k() {
    }

    public final long l(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.Z;
            if (i >= arrayList.size()) {
                return j;
            }
            nrd nrd = (nrd) arrayList.get(i);
            if (nrd.a == 2) {
                nrd.a = 1;
            }
            i++;
        }
    }

    public final void m(go7 go7, long j, long j2, boolean z) {
        Uri uri = ((ord) go7).c.c;
        yn7 yn7 = new yn7(j2);
        this.o.getClass();
        this.X.x(yn7, 1, -1, (qy5) null, 0, (Object) null, 0, this.s0);
    }

    public final long n() {
        return -9223372036854775807L;
    }

    public final boolean o(qo7 qo7) {
        if (this.w0) {
            return false;
        }
        vq7 vq7 = this.t0;
        if (vq7.o() || vq7.n()) {
            return false;
        }
        t24 a2 = this.b.a();
        z0f z0f = this.c;
        if (z0f != null) {
            a2.H(z0f);
        }
        ord ord = new ord(a2, this.a);
        this.o.getClass();
        this.X.F(new yn7(ord.a, this.a, vq7.v(ord, this, 3)), 1, -1, this.u0, 0, (Object) null, 0, this.s0);
        return true;
    }

    public final tze q() {
        return this.Y;
    }

    public final long r() {
        return this.w0 ? Long.MIN_VALUE : 0;
    }

    public final void s(long j, boolean z) {
    }

    public final void t(long j) {
    }

    public final void v(go7 go7, long j, long j2) {
        ord ord = (ord) go7;
        this.y0 = (int) ord.c.b;
        byte[] bArr = ord.o;
        bArr.getClass();
        this.x0 = bArr;
        this.w0 = true;
        Uri uri = ord.c.c;
        yn7 yn7 = new yn7(j2);
        this.o.getClass();
        this.X.z(yn7, 1, -1, this.u0, 0, (Object) null, 0, this.s0);
    }
}
