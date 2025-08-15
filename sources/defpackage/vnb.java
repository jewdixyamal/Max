package defpackage;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.common.ParserException;
import androidx.work.WorkRequest;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: vnb  reason: default package */
public final class vnb implements zd8, pa5, do7, io7, crc {
    public static final Map Z0;
    public static final qy5 a1;
    public final mnb A0;
    public final Handler B0;
    public xd8 C0;
    public us6 D0;
    public erc[] E0;
    public tnb[] F0;
    public boolean G0;
    public boolean H0;
    public boolean I0;
    public boolean J0;
    public a8g K0;
    public v1d L0;
    public long M0;
    public boolean N0;
    public int O0;
    public boolean P0;
    public boolean Q0;
    public int R0;
    public boolean S0;
    public long T0;
    public long U0;
    public boolean V0;
    public int W0;
    public final jn X;
    public boolean X0;
    public final lr4 Y;
    public boolean Y0;
    public final aob Z;
    public final Uri a;
    public final t24 b;
    public final tr4 c;
    public final huc o;
    public final n64 s0;
    public final String t0;
    public final long u0;
    public final long v0;
    public final vq7 w0 = new vq7("ProgressiveMediaPeriod");
    public final k8g x0;
    public final ae3 y0;
    public final mnb z0;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        Z0 = Collections.unmodifiableMap(hashMap);
        ny5 ny5 = new ny5();
        ny5.a = "icy";
        ny5.m = ia9.l("application/x-icy");
        a1 = ny5.a();
    }

    public vnb(Uri uri, t24 t24, k8g k8g, tr4 tr4, lr4 lr4, huc huc, jn jnVar, aob aob, n64 n64, String str, int i, long j) {
        this.a = uri;
        this.b = t24;
        this.c = tr4;
        this.Y = lr4;
        this.o = huc;
        this.X = jnVar;
        this.Z = aob;
        this.s0 = n64;
        this.t0 = str;
        this.u0 = (long) i;
        this.x0 = k8g;
        this.v0 = j;
        this.y0 = new ae3(false, 1);
        this.z0 = new mnb(this, 1);
        this.A0 = new mnb(this, 2);
        this.B0 = oaf.o((Handler.Callback) null);
        this.F0 = new tnb[0];
        this.E0 = new erc[0];
        this.U0 = -9223372036854775807L;
        this.O0 = 1;
    }

    public final void A() {
        pnb pnb = new pnb(this, this.a, this.b, this.x0, this, this.y0);
        if (this.H0) {
            fm9.k(p());
            long j = this.M0;
            if (j == -9223372036854775807L || this.U0 <= j) {
                v1d v1d = this.L0;
                v1d.getClass();
                long j2 = v1d.e(this.U0).a.b;
                long j3 = this.U0;
                pnb.Z.a = j2;
                pnb.u0 = j3;
                pnb.t0 = true;
                pnb.x0 = false;
                for (erc erc : this.E0) {
                    erc.t = this.U0;
                }
                this.U0 = -9223372036854775807L;
            } else {
                this.X0 = true;
                this.U0 = -9223372036854775807L;
                return;
            }
        }
        this.W0 = e();
        this.X.F(new yn7(pnb.a, pnb.v0, this.w0.v(pnb, this, this.o.p(this.O0))), 1, -1, (qy5) null, 0, (Object) null, pnb.u0, this.M0);
    }

    public final yze B(int i, int i2) {
        return z(new tnb(i, false));
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.b11 C(defpackage.go7 r19, long r20, long r22, java.io.IOException r24, int r25) {
        /*
            r18 = this;
            r0 = r18
            r11 = r24
            r1 = 1
            r2 = r19
            pnb r2 = (defpackage.pnb) r2
            u1e r3 = r2.c
            yn7 r4 = new yn7
            android.net.Uri r3 = r3.c
            r5 = r22
            r4.<init>(r5)
            int r3 = defpackage.oaf.a
            huc r3 = r0.o
            r3.getClass()
            boolean r3 = r11 instanceof androidx.media3.common.ParserException
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 != 0) goto L_0x0055
            boolean r3 = r11 instanceof java.io.FileNotFoundException
            if (r3 != 0) goto L_0x0055
            boolean r3 = r11 instanceof androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException
            if (r3 != 0) goto L_0x0055
            boolean r3 = r11 instanceof androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException
            if (r3 != 0) goto L_0x0055
            int r3 = androidx.media3.datasource.DataSourceException.b
            r3 = r11
        L_0x0033:
            if (r3 == 0) goto L_0x0048
            boolean r7 = r3 instanceof androidx.media3.datasource.DataSourceException
            if (r7 == 0) goto L_0x0043
            r7 = r3
            androidx.media3.datasource.DataSourceException r7 = (androidx.media3.datasource.DataSourceException) r7
            int r7 = r7.a
            r8 = 2008(0x7d8, float:2.814E-42)
            if (r7 != r8) goto L_0x0043
            goto L_0x0055
        L_0x0043:
            java.lang.Throwable r3 = r3.getCause()
            goto L_0x0033
        L_0x0048:
            int r3 = r25 + -1
            int r3 = r3 * 1000
            r7 = 5000(0x1388, float:7.006E-42)
            int r3 = java.lang.Math.min(r3, r7)
            long r7 = (long) r3
            r13 = r7
            goto L_0x0056
        L_0x0055:
            r13 = r5
        L_0x0056:
            int r3 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x005e
            b11 r3 = defpackage.vq7.Z
        L_0x005c:
            r13 = r3
            goto L_0x00b9
        L_0x005e:
            int r3 = r18.e()
            int r7 = r0.W0
            r8 = 0
            if (r3 <= r7) goto L_0x0069
            r15 = r1
            goto L_0x006a
        L_0x0069:
            r15 = r8
        L_0x006a:
            boolean r7 = r0.S0
            if (r7 != 0) goto L_0x00ac
            v1d r7 = r0.L0
            if (r7 == 0) goto L_0x007b
            long r9 = r7.f()
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x007b
            goto L_0x00ac
        L_0x007b:
            boolean r3 = r0.H0
            if (r3 == 0) goto L_0x008a
            boolean r3 = r18.D()
            if (r3 != 0) goto L_0x008a
            r0.V0 = r1
            b11 r3 = defpackage.vq7.Y
            goto L_0x005c
        L_0x008a:
            boolean r3 = r0.H0
            r0.Q0 = r3
            r5 = 0
            r0.T0 = r5
            r0.W0 = r8
            erc[] r3 = r0.E0
            int r7 = r3.length
            r9 = r8
        L_0x0098:
            if (r9 >= r7) goto L_0x00a1
            r10 = r3[r9]
            r10.y(r8)
            int r9 = r9 + r1
            goto L_0x0098
        L_0x00a1:
            lh4 r3 = r2.Z
            r3.a = r5
            r2.u0 = r5
            r2.t0 = r1
            r2.x0 = r8
            goto L_0x00ae
        L_0x00ac:
            r0.W0 = r3
        L_0x00ae:
            b11 r3 = new b11
            r16 = 5
            r17 = 0
            r12 = r3
            r12.<init>(r13, r15, r16, r17)
            goto L_0x005c
        L_0x00b9:
            boolean r3 = r13.a()
            r12 = r3 ^ 1
            long r7 = r2.u0
            long r9 = r0.M0
            r3 = -1
            r5 = 0
            jn r0 = r0.X
            r2 = 1
            r6 = 0
            r14 = 0
            r1 = r4
            r4 = r5
            r5 = r6
            r6 = r14
            r11 = r24
            r0.B(r1, r2, r3, r4, r5, r6, r7, r9, r11, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vnb.C(go7, long, long, java.io.IOException, int):b11");
    }

    public final boolean D() {
        return this.Q0 || p();
    }

    public final void J(v1d v1d) {
        this.B0.post(new do9(this, 23, v1d));
    }

    public final boolean a() {
        return this.w0.o() && this.y0.e();
    }

    public final void b() {
        for (erc erc : this.E0) {
            erc.y(true);
            fr4 fr4 = erc.h;
            if (fr4 != null) {
                fr4.f(erc.e);
                erc.h = null;
                erc.g = null;
            }
        }
        k8g k8g = this.x0;
        la5 la5 = (la5) k8g.b;
        if (la5 != null) {
            la5.release();
            k8g.b = null;
        }
        k8g.c = null;
    }

    public final void c() {
        this.B0.post(this.z0);
    }

    public final void d() {
        fm9.k(this.H0);
        this.K0.getClass();
        this.L0.getClass();
    }

    public final int e() {
        int i = 0;
        for (erc erc : this.E0) {
            i += erc.q + erc.p;
        }
        return i;
    }

    public final long f() {
        return r();
    }

    public final long g(n85[] n85Arr, boolean[] zArr, grc[] grcArr, boolean[] zArr2, long j) {
        boolean[] zArr3;
        n85 n85;
        d();
        a8g a8g = this.K0;
        tze tze = (tze) a8g.a;
        int i = this.R0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int length = n85Arr.length;
            zArr3 = (boolean[]) a8g.c;
            if (i3 >= length) {
                break;
            }
            rnb rnb = grcArr[i3];
            if (rnb != null && (n85Arr[i3] == null || !zArr[i3])) {
                int i4 = rnb.a;
                fm9.k(zArr3[i4]);
                this.R0--;
                zArr3[i4] = false;
                grcArr[i3] = null;
            }
            i3++;
        }
        boolean z = !this.P0 ? !(j == 0 || this.J0) : i == 0;
        for (int i5 = 0; i5 < n85Arr.length; i5++) {
            if (grcArr[i5] == null && (n85 = n85Arr[i5]) != null) {
                fm9.k(n85.length() == 1);
                fm9.k(n85.f(0) == 0);
                int b2 = tze.b(n85.a());
                fm9.k(!zArr3[b2]);
                this.R0++;
                zArr3[b2] = true;
                grcArr[i5] = new rnb(this, b2);
                zArr2[i5] = true;
                if (!z) {
                    erc erc = this.E0[b2];
                    z = erc.n() != 0 && !erc.A(j, true);
                }
            }
        }
        if (this.R0 == 0) {
            this.V0 = false;
            this.Q0 = false;
            vq7 vq7 = this.w0;
            if (vq7.o()) {
                erc[] ercArr = this.E0;
                int length2 = ercArr.length;
                while (i2 < length2) {
                    ercArr[i2].h();
                    i2++;
                }
                vq7.l();
            } else {
                this.X0 = false;
                for (erc y : this.E0) {
                    y.y(false);
                }
            }
        } else if (z) {
            j = l(j);
            while (i2 < grcArr.length) {
                if (grcArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.P0 = true;
        return j;
    }

    public final long h(long j, x1d x1d) {
        d();
        if (!this.L0.c()) {
            return 0;
        }
        t1d e = this.L0.e(j);
        return x1d.a(j, e.a.a, e.b.a);
    }

    public final void i(xd8 xd8, long j) {
        this.C0 = xd8;
        this.y0.g();
        A();
    }

    public final long j(boolean z) {
        long j;
        long j2 = Long.MIN_VALUE;
        for (int i = 0; i < this.E0.length; i++) {
            if (!z) {
                a8g a8g = this.K0;
                a8g.getClass();
                if (!((boolean[]) a8g.c)[i]) {
                    continue;
                }
            }
            erc erc = this.E0[i];
            synchronized (erc) {
                j = erc.v;
            }
            j2 = Math.max(j2, j);
        }
        return j2;
    }

    public final void k() {
        int p = this.o.p(this.O0);
        vq7 vq7 = this.w0;
        IOException iOException = (IOException) vq7.o;
        if (iOException == null) {
            eo7 eo7 = (eo7) vq7.c;
            if (eo7 != null) {
                if (p == Integer.MIN_VALUE) {
                    p = eo7.b;
                }
                IOException iOException2 = eo7.o;
                if (iOException2 != null && eo7.X > p) {
                    throw iOException2;
                }
            }
            if (this.X0 && !this.H0) {
                throw ParserException.a((RuntimeException) null, "Loading finished before preparation is complete.");
            }
            return;
        }
        throw iOException;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        r0 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long l(long r8) {
        /*
            r7 = this;
            r7.d()
            a8g r0 = r7.K0
            java.lang.Object r0 = r0.b
            boolean[] r0 = (boolean[]) r0
            v1d r1 = r7.L0
            boolean r1 = r1.c()
            if (r1 == 0) goto L_0x0012
            goto L_0x0014
        L_0x0012:
            r8 = 0
        L_0x0014:
            r1 = 0
            r7.Q0 = r1
            r7.T0 = r8
            boolean r2 = r7.p()
            if (r2 == 0) goto L_0x0022
            r7.U0 = r8
            return r8
        L_0x0022:
            int r2 = r7.O0
            r3 = 7
            vq7 r4 = r7.w0
            if (r2 == r3) goto L_0x005f
            boolean r2 = r7.X0
            if (r2 != 0) goto L_0x0033
            boolean r2 = r4.o()
            if (r2 == 0) goto L_0x005f
        L_0x0033:
            erc[] r2 = r7.E0
            int r2 = r2.length
            r3 = r1
        L_0x0037:
            if (r3 >= r2) goto L_0x005b
            erc[] r5 = r7.E0
            r5 = r5[r3]
            boolean r6 = r7.J0
            if (r6 == 0) goto L_0x0048
            int r6 = r5.q
            boolean r5 = r5.z(r6)
            goto L_0x004c
        L_0x0048:
            boolean r5 = r5.A(r8, r1)
        L_0x004c:
            if (r5 != 0) goto L_0x0058
            boolean r5 = r0[r3]
            if (r5 != 0) goto L_0x0056
            boolean r5 = r7.I0
            if (r5 != 0) goto L_0x0058
        L_0x0056:
            r0 = r1
            goto L_0x005c
        L_0x0058:
            int r3 = r3 + 1
            goto L_0x0037
        L_0x005b:
            r0 = 1
        L_0x005c:
            if (r0 == 0) goto L_0x005f
            return r8
        L_0x005f:
            r7.V0 = r1
            r7.U0 = r8
            r7.X0 = r1
            boolean r0 = r4.o()
            if (r0 == 0) goto L_0x007c
            erc[] r7 = r7.E0
            int r0 = r7.length
        L_0x006e:
            if (r1 >= r0) goto L_0x0078
            r2 = r7[r1]
            r2.h()
            int r1 = r1 + 1
            goto L_0x006e
        L_0x0078:
            r4.l()
            goto L_0x008d
        L_0x007c:
            r0 = 0
            r4.o = r0
            erc[] r7 = r7.E0
            int r0 = r7.length
            r2 = r1
        L_0x0083:
            if (r2 >= r0) goto L_0x008d
            r3 = r7[r2]
            r3.y(r1)
            int r2 = r2 + 1
            goto L_0x0083
        L_0x008d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vnb.l(long):long");
    }

    public final void m(go7 go7, long j, long j2, boolean z) {
        pnb pnb = (pnb) go7;
        Uri uri = pnb.c.c;
        yn7 yn7 = new yn7(j2);
        this.o.getClass();
        this.X.x(yn7, 1, -1, (qy5) null, 0, (Object) null, pnb.u0, this.M0);
        if (!z) {
            for (erc y : this.E0) {
                y.y(false);
            }
            if (this.R0 > 0) {
                xd8 xd8 = this.C0;
                xd8.getClass();
                xd8.j(this);
            }
        }
    }

    public final long n() {
        if (!this.Q0) {
            return -9223372036854775807L;
        }
        if (!this.X0 && e() <= this.W0) {
            return -9223372036854775807L;
        }
        this.Q0 = false;
        return this.T0;
    }

    public final boolean o(qo7 qo7) {
        if (this.X0) {
            return false;
        }
        vq7 vq7 = this.w0;
        if (vq7.n() || this.V0) {
            return false;
        }
        if (this.H0 && this.R0 == 0) {
            return false;
        }
        boolean g = this.y0.g();
        if (vq7.o()) {
            return g;
        }
        A();
        return true;
    }

    public final boolean p() {
        return this.U0 != -9223372036854775807L;
    }

    public final tze q() {
        d();
        return (tze) this.K0.a;
    }

    public final long r() {
        long j;
        boolean z;
        long j2;
        d();
        if (this.X0 || this.R0 == 0) {
            return Long.MIN_VALUE;
        }
        if (p()) {
            return this.U0;
        }
        if (this.I0) {
            int length = this.E0.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                a8g a8g = this.K0;
                if (((boolean[]) a8g.b)[i] && ((boolean[]) a8g.c)[i]) {
                    erc erc = this.E0[i];
                    synchronized (erc) {
                        z = erc.w;
                    }
                    if (!z) {
                        erc erc2 = this.E0[i];
                        synchronized (erc2) {
                            j2 = erc2.v;
                        }
                        j = Math.min(j, j2);
                    } else {
                        continue;
                    }
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = j(false);
        }
        return j == Long.MIN_VALUE ? this.T0 : j;
    }

    public final void s(long j, boolean z) {
        if (!this.J0) {
            d();
            if (!p()) {
                boolean[] zArr = (boolean[]) this.K0.c;
                int length = this.E0.length;
                for (int i = 0; i < length; i++) {
                    this.E0[i].g(j, z, zArr[i]);
                }
            }
        }
    }

    public final void t(long j) {
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [a8g, java.lang.Object] */
    public final void u() {
        long j;
        int i;
        if (!this.Y0 && !this.H0 && this.G0 && this.L0 != null) {
            erc[] ercArr = this.E0;
            int length = ercArr.length;
            int i2 = 0;
            while (i2 < length) {
                if (ercArr[i2].q() != null) {
                    i2++;
                } else {
                    return;
                }
            }
            this.y0.c();
            int length2 = this.E0.length;
            rze[] rzeArr = new rze[length2];
            boolean[] zArr = new boolean[length2];
            int i3 = 0;
            while (true) {
                j = this.v0;
                if (i3 >= length2) {
                    break;
                }
                qy5 q = this.E0[i3].q();
                q.getClass();
                String str = q.n;
                boolean h = ia9.h(str);
                boolean z = h || ia9.k(str);
                zArr[i3] = z;
                this.I0 = z | this.I0;
                this.J0 = j != -9223372036854775807L && length2 == 1 && ia9.i(str);
                us6 us6 = this.D0;
                if (us6 != null) {
                    if (h || this.F0[i3].b) {
                        f99 f99 = q.k;
                        f99 f992 = f99 == null ? new f99(us6) : f99.a(us6);
                        ny5 a2 = q.a();
                        a2.j = f992;
                        q = new qy5(a2);
                    }
                    if (h && q.g == -1 && q.h == -1 && (i = us6.a) != -1) {
                        ny5 a3 = q.a();
                        a3.g = i;
                        q = new qy5(a3);
                    }
                }
                int d = this.c.d(q);
                ny5 a4 = q.a();
                a4.J = d;
                rzeArr[i3] = new rze(Integer.toString(i3), a4.a());
                i3++;
            }
            tze tze = new tze(rzeArr);
            ? obj = new Object();
            obj.a = tze;
            obj.b = zArr;
            int i4 = tze.a;
            obj.c = new boolean[i4];
            obj.o = new boolean[i4];
            this.K0 = obj;
            if (this.J0 && this.M0 == -9223372036854775807L) {
                this.M0 = j;
                this.L0 = new nnb(this, this.L0);
            }
            this.Z.v(this.M0, this.L0.c(), this.N0);
            this.H0 = true;
            xd8 xd8 = this.C0;
            xd8.getClass();
            xd8.e(this);
        }
    }

    public final void v(go7 go7, long j, long j2) {
        v1d v1d;
        pnb pnb = (pnb) go7;
        if (this.M0 == -9223372036854775807L && (v1d = this.L0) != null) {
            boolean c2 = v1d.c();
            long j3 = j(true);
            long j4 = j3 == Long.MIN_VALUE ? 0 : j3 + WorkRequest.MIN_BACKOFF_MILLIS;
            this.M0 = j4;
            this.Z.v(j4, c2, this.N0);
        }
        Uri uri = pnb.c.c;
        yn7 yn7 = new yn7(j2);
        this.o.getClass();
        this.X.z(yn7, 1, -1, (qy5) null, 0, (Object) null, pnb.u0, this.M0);
        this.X0 = true;
        xd8 xd8 = this.C0;
        xd8.getClass();
        xd8.j(this);
    }

    public final void w() {
        this.G0 = true;
        this.B0.post(this.z0);
    }

    public final void x(int i) {
        d();
        a8g a8g = this.K0;
        boolean[] zArr = (boolean[]) a8g.o;
        if (!zArr[i]) {
            qy5 qy5 = ((tze) a8g.a).a(i).d[0];
            this.X.m(ia9.g(qy5.n), qy5, 0, (Object) null, this.T0);
            zArr[i] = true;
        }
    }

    public final void y(int i) {
        d();
        boolean[] zArr = (boolean[]) this.K0.b;
        if (this.V0 && zArr[i] && !this.E0[i].s(false)) {
            this.U0 = 0;
            this.V0 = false;
            this.Q0 = true;
            this.T0 = 0;
            this.W0 = 0;
            for (erc y : this.E0) {
                y.y(false);
            }
            xd8 xd8 = this.C0;
            xd8.getClass();
            xd8.j(this);
        }
    }

    public final yze z(tnb tnb) {
        int length = this.E0.length;
        for (int i = 0; i < length; i++) {
            if (tnb.equals(this.F0[i])) {
                return this.E0[i];
            }
        }
        if (this.G0) {
            z04.c0("Extractor added new track (id=" + tnb.a + ") after finishing tracks.");
            return new sk4();
        }
        tr4 tr4 = this.c;
        tr4.getClass();
        lr4 lr4 = this.Y;
        lr4.getClass();
        erc erc = new erc(this.s0, tr4, lr4);
        erc.f = this;
        int i2 = length + 1;
        tnb[] tnbArr = (tnb[]) Arrays.copyOf(this.F0, i2);
        tnbArr[length] = tnb;
        int i3 = oaf.a;
        this.F0 = tnbArr;
        erc[] ercArr = (erc[]) Arrays.copyOf(this.E0, i2);
        ercArr[length] = erc;
        this.E0 = ercArr;
        return erc;
    }
}
