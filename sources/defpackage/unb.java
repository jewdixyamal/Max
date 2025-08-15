package defpackage;

import android.net.Uri;
import android.os.Handler;
import androidx.work.WorkRequest;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource$CleartextNotPermittedException;
import com.google.android.exoplayer2.upstream.Loader$UnexpectedLoaderException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: unb  reason: default package */
public final class unb implements yd8, oa5, co7, ho7, brc {
    public static final Map X0;
    public static final oy5 Y0;
    public final Handler A0;
    public wd8 B0;
    public ts6 C0;
    public drc[] D0;
    public snb[] E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public die I0;
    public u1d J0;
    public long K0;
    public boolean L0;
    public int M0;
    public boolean N0;
    public boolean O0;
    public int P0;
    public long Q0;
    public long R0;
    public long S0;
    public boolean T0;
    public int U0;
    public boolean V0;
    public boolean W0;
    public final gk8 X;
    public final kr4 Y;
    public final znb Z;
    public final Uri a;
    public final r24 b;
    public final sr4 c;
    public final buc o;
    public final n64 s0;
    public final String t0 = null;
    public final long u0;
    public final jo7 v0;
    public final glc w0;
    public final ae3 x0;
    public final lnb y0;
    public final lnb z0;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        X0 = Collections.unmodifiableMap(hashMap);
        my5 my5 = new my5();
        my5.a = "icy";
        my5.k = "application/x-icy";
        Y0 = my5.a();
    }

    public unb(Uri uri, r24 r24, glc glc, sr4 sr4, kr4 kr4, buc buc, gk8 gk8, znb znb, n64 n64, int i) {
        this.a = uri;
        this.b = r24;
        this.c = sr4;
        this.Y = kr4;
        this.o = buc;
        this.X = gk8;
        this.Z = znb;
        this.s0 = n64;
        this.u0 = (long) i;
        this.v0 = new jo7("ProgressiveMediaPeriod", 0);
        this.w0 = glc;
        this.x0 = new ae3(false, 0);
        this.y0 = new lnb(this, 0);
        this.z0 = new lnb(this, 1);
        this.A0 = maf.m((Handler.Callback) null);
        this.E0 = new snb[0];
        this.D0 = new drc[0];
        this.S0 = -9223372036854775807L;
        this.Q0 = -1;
        this.K0 = -9223372036854775807L;
        this.M0 = 1;
    }

    public final long A(long j, w1d w1d) {
        d();
        if (!this.J0.c()) {
            return 0;
        }
        s1d e = this.J0.e(j);
        return w1d.a(j, e.a.a, e.b.a);
    }

    public final xze B(int i, int i2) {
        return p(new snb(i, false));
    }

    public final boolean C(long j) {
        if (this.V0) {
            return false;
        }
        jo7 jo7 = this.v0;
        if (jo7.n() || this.T0) {
            return false;
        }
        if (this.G0 && this.P0 == 0) {
            return false;
        }
        boolean g = this.x0.g();
        if (jo7.o()) {
            return g;
        }
        u();
        return true;
    }

    public final void J(wd8 wd8, long j) {
        this.B0 = wd8;
        this.x0.g();
        u();
    }

    public final long L(m85[] m85Arr, boolean[] zArr, frc[] frcArr, boolean[] zArr2, long j) {
        boolean[] zArr3;
        m85 m85;
        d();
        die die = this.I0;
        sze sze = (sze) die.a;
        int i = this.P0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int length = m85Arr.length;
            zArr3 = (boolean[]) die.c;
            if (i3 >= length) {
                break;
            }
            qnb qnb = frcArr[i3];
            if (qnb != null && (m85Arr[i3] == null || !zArr[i3])) {
                int i4 = qnb.a;
                np8.f(zArr3[i4]);
                this.P0--;
                zArr3[i4] = false;
                frcArr[i3] = null;
            }
            i3++;
        }
        boolean z = !this.N0 ? j != 0 : i == 0;
        for (int i5 = 0; i5 < m85Arr.length; i5++) {
            if (frcArr[i5] == null && (m85 = m85Arr[i5]) != null) {
                np8.f(m85.length() == 1);
                np8.f(m85.f(0) == 0);
                int b2 = sze.b(m85.a());
                np8.f(!zArr3[b2]);
                this.P0++;
                zArr3[b2] = true;
                frcArr[i5] = new qnb(this, b2);
                zArr2[i5] = true;
                if (!z) {
                    drc drc = this.D0[b2];
                    z = !drc.A(j, true) && drc.o() != 0;
                }
            }
        }
        if (this.P0 == 0) {
            this.T0 = false;
            this.O0 = false;
            jo7 jo7 = this.v0;
            if (jo7.o()) {
                drc[] drcArr = this.D0;
                int length2 = drcArr.length;
                while (i2 < length2) {
                    drcArr[i2].i();
                    i2++;
                }
                jo7.a();
            } else {
                for (drc z2 : this.D0) {
                    z2.z(false);
                }
            }
        } else if (z) {
            j = l(j);
            while (i2 < frcArr.length) {
                if (frcArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.N0 = true;
        return j;
    }

    public final void M(u1d u1d) {
        this.A0.post(new do9(this, 22, u1d));
    }

    public final boolean a() {
        boolean z;
        if (this.v0.o()) {
            ae3 ae3 = this.x0;
            synchronized (ae3) {
                z = ae3.b;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        for (drc drc : this.D0) {
            drc.z(true);
            er4 er4 = drc.h;
            if (er4 != null) {
                er4.f(drc.e);
                drc.h = null;
                drc.g = null;
            }
        }
        glc glc = this.w0;
        ka5 ka5 = (ka5) glc.c;
        if (ka5 != null) {
            ka5.release();
            glc.c = null;
        }
        glc.o = null;
    }

    public final void c() {
        this.A0.post(this.y0);
    }

    public final void d() {
        np8.f(this.G0);
        this.I0.getClass();
        this.J0.getClass();
    }

    public final int e() {
        int i = 0;
        for (drc drc : this.D0) {
            i += drc.q + drc.p;
        }
        return i;
    }

    public final long f() {
        if (this.P0 == 0) {
            return Long.MIN_VALUE;
        }
        return r();
    }

    public final long g() {
        long j;
        long j2 = Long.MIN_VALUE;
        for (drc drc : this.D0) {
            synchronized (drc) {
                j = drc.v;
            }
            j2 = Math.max(j2, j);
        }
        return j2;
    }

    public final boolean h() {
        return this.S0 != -9223372036854775807L;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [die, java.lang.Object] */
    public final void i() {
        int i;
        e99 e99;
        if (!this.W0 && !this.G0 && this.F0 && this.J0 != null) {
            drc[] drcArr = this.D0;
            int length = drcArr.length;
            int i2 = 0;
            while (i2 < length) {
                if (drcArr[i2].r() != null) {
                    i2++;
                } else {
                    return;
                }
            }
            ae3 ae3 = this.x0;
            synchronized (ae3) {
                ae3.b = false;
            }
            int length2 = this.D0.length;
            qze[] qzeArr = new qze[length2];
            boolean[] zArr = new boolean[length2];
            for (int i3 = 0; i3 < length2; i3++) {
                oy5 r = this.D0[i3].r();
                r.getClass();
                String str = r.w0;
                boolean h = ha9.h(str);
                boolean z = h || ha9.j(str);
                zArr[i3] = z;
                this.H0 = z | this.H0;
                ts6 ts6 = this.C0;
                if (ts6 != null) {
                    if (h || this.E0[i3].b) {
                        e99 e992 = r.u0;
                        if (e992 == null) {
                            e99 = new e99(ts6);
                        } else {
                            int i4 = maf.a;
                            c99[] c99Arr = e992.a;
                            Object[] copyOf = Arrays.copyOf(c99Arr, c99Arr.length + 1);
                            System.arraycopy(new c99[]{ts6}, 0, copyOf, c99Arr.length, 1);
                            e99 = new e99((c99[]) copyOf);
                        }
                        my5 a2 = r.a();
                        a2.i = e99;
                        r = new oy5(a2);
                    }
                    if (h && r.Y == -1 && r.Z == -1 && (i = ts6.a) != -1) {
                        my5 a3 = r.a();
                        a3.f = i;
                        r = new oy5(a3);
                    }
                }
                int b2 = this.c.b(r);
                my5 a4 = r.a();
                a4.D = b2;
                qzeArr[i3] = new qze(Integer.toString(i3), a4.a());
            }
            sze sze = new sze(qzeArr);
            ? obj = new Object();
            obj.a = sze;
            obj.b = zArr;
            int i5 = sze.a;
            obj.c = new boolean[i5];
            obj.o = new boolean[i5];
            this.I0 = obj;
            this.G0 = true;
            wd8 wd8 = this.B0;
            wd8.getClass();
            wd8.d(this);
        }
    }

    public final void j(int i) {
        d();
        die die = this.I0;
        boolean[] zArr = (boolean[]) die.o;
        if (!zArr[i]) {
            oy5 oy5 = ((sze) die.a).a(i).c[0];
            this.X.b(ha9.g(oy5.w0), oy5, 0, (Object) null, this.R0);
            zArr[i] = true;
        }
    }

    public final void k() {
        int v = this.o.v(this.M0);
        jo7 jo7 = this.v0;
        IOException iOException = (IOException) jo7.c;
        if (iOException == null) {
            eo7 eo7 = (eo7) jo7.b;
            if (eo7 != null) {
                if (v == Integer.MIN_VALUE) {
                    v = eo7.b;
                }
                IOException iOException2 = eo7.o;
                if (iOException2 != null && eo7.X > v) {
                    throw iOException2;
                }
            }
            if (this.V0 && !this.G0) {
                throw ParserException.a((RuntimeException) null, "Loading finished before preparation is complete.");
            }
            return;
        }
        throw iOException;
    }

    public final long l(long j) {
        d();
        boolean[] zArr = (boolean[]) this.I0.b;
        if (!this.J0.c()) {
            j = 0;
        }
        this.O0 = false;
        this.R0 = j;
        if (h()) {
            this.S0 = j;
            return j;
        }
        if (this.M0 != 7) {
            int length = this.D0.length;
            int i = 0;
            while (i < length) {
                if (this.D0[i].A(j, false) || (!zArr[i] && this.H0)) {
                    i++;
                }
            }
            return j;
        }
        this.T0 = false;
        this.S0 = j;
        this.V0 = false;
        jo7 jo7 = this.v0;
        if (jo7.o()) {
            for (drc i2 : this.D0) {
                i2.i();
            }
            jo7.a();
        } else {
            jo7.c = null;
            for (drc z : this.D0) {
                z.z(false);
            }
        }
        return j;
    }

    public final void m(int i) {
        d();
        boolean[] zArr = (boolean[]) this.I0.b;
        if (this.T0 && zArr[i] && !this.D0[i].t(false)) {
            this.S0 = 0;
            this.T0 = false;
            this.O0 = true;
            this.R0 = 0;
            this.U0 = 0;
            for (drc z : this.D0) {
                z.z(false);
            }
            wd8 wd8 = this.B0;
            wd8.getClass();
            wd8.c(this);
        }
    }

    public final long n() {
        if (!this.O0) {
            return -9223372036854775807L;
        }
        if (!this.V0 && e() <= this.U0) {
            return -9223372036854775807L;
        }
        this.O0 = false;
        return this.R0;
    }

    public final void o(fo7 fo7, long j, long j2, boolean z) {
        onb onb = (onb) fo7;
        t1e t1e = onb.c;
        xn7 xn7 = new xn7(onb.a, onb.v0, t1e.c, t1e.o, j, j2, t1e.b);
        this.o.getClass();
        this.X.d(xn7, 1, -1, (oy5) null, 0, (Object) null, onb.u0, this.K0);
        if (!z) {
            if (this.Q0 == -1) {
                this.Q0 = onb.w0;
            }
            for (drc z2 : this.D0) {
                z2.z(false);
            }
            if (this.P0 > 0) {
                wd8 wd8 = this.B0;
                wd8.getClass();
                wd8.c(this);
            }
        }
    }

    public final drc p(snb snb) {
        int length = this.D0.length;
        for (int i = 0; i < length; i++) {
            if (snb.equals(this.E0[i])) {
                return this.D0[i];
            }
        }
        sr4 sr4 = this.c;
        sr4.getClass();
        kr4 kr4 = this.Y;
        kr4.getClass();
        drc drc = new drc(this.s0, sr4, kr4);
        drc.f = this;
        int i2 = length + 1;
        snb[] snbArr = (snb[]) Arrays.copyOf(this.E0, i2);
        snbArr[length] = snb;
        int i3 = maf.a;
        this.E0 = snbArr;
        drc[] drcArr = (drc[]) Arrays.copyOf(this.D0, i2);
        drcArr[length] = drc;
        this.D0 = drcArr;
        return drc;
    }

    public final sze q() {
        d();
        return (sze) this.I0.a;
    }

    public final long r() {
        long j;
        boolean z;
        long j2;
        d();
        boolean[] zArr = (boolean[]) this.I0.b;
        if (this.V0) {
            return Long.MIN_VALUE;
        }
        if (h()) {
            return this.S0;
        }
        if (this.H0) {
            int length = this.D0.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                if (zArr[i]) {
                    drc drc = this.D0[i];
                    synchronized (drc) {
                        z = drc.w;
                    }
                    if (!z) {
                        drc drc2 = this.D0[i];
                        synchronized (drc2) {
                            j2 = drc2.v;
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
            j = g();
        }
        return j == Long.MIN_VALUE ? this.R0 : j;
    }

    public final void s(long j, boolean z) {
        d();
        if (!h()) {
            boolean[] zArr = (boolean[]) this.I0.c;
            int length = this.D0.length;
            for (int i = 0; i < length; i++) {
                this.D0[i].h(j, z, zArr[i]);
            }
        }
    }

    public final void t(long j) {
    }

    public final void u() {
        onb onb = new onb(this, this.a, this.b, this.w0, this, this.x0);
        if (this.G0) {
            np8.f(h());
            long j = this.K0;
            if (j == -9223372036854775807L || this.S0 <= j) {
                u1d u1d = this.J0;
                u1d.getClass();
                long j2 = u1d.e(this.S0).a.b;
                long j3 = this.S0;
                onb.Z.a = j2;
                onb.u0 = j3;
                onb.t0 = true;
                onb.y0 = false;
                for (drc drc : this.D0) {
                    drc.t = this.S0;
                }
                this.S0 = -9223372036854775807L;
            } else {
                this.V0 = true;
                this.S0 = -9223372036854775807L;
                return;
            }
        }
        this.U0 = e();
        this.X.k(new xn7(onb.a, onb.v0, this.v0.w(onb, this, this.o.v(this.M0))), 1, -1, (oy5) null, 0, (Object) null, onb.u0, this.K0);
    }

    public final boolean v() {
        return this.O0 || h();
    }

    public final void w() {
        this.F0 = true;
        this.A0.post(this.y0);
    }

    public final void y(fo7 fo7, long j, long j2) {
        u1d u1d;
        onb onb = (onb) fo7;
        if (this.K0 == -9223372036854775807L && (u1d = this.J0) != null) {
            boolean c2 = u1d.c();
            long g = g();
            long j3 = g == Long.MIN_VALUE ? 0 : g + WorkRequest.MIN_BACKOFF_MILLIS;
            this.K0 = j3;
            this.Z.q(j3, c2, this.L0);
        }
        t1e t1e = onb.c;
        xn7 xn7 = new xn7(onb.a, onb.v0, t1e.c, t1e.o, j, j2, t1e.b);
        this.o.getClass();
        this.X.f(xn7, 1, -1, (oy5) null, 0, (Object) null, onb.u0, this.K0);
        if (this.Q0 == -1) {
            this.Q0 = onb.w0;
        }
        this.V0 = true;
        wd8 wd8 = this.B0;
        wd8.getClass();
        wd8.c(this);
    }

    public final b11 z(fo7 fo7, long j, long j2, IOException iOException, int i) {
        long j3;
        b11 b11;
        u1d u1d;
        IOException iOException2 = iOException;
        onb onb = (onb) fo7;
        if (this.Q0 == -1) {
            this.Q0 = onb.w0;
        }
        t1e t1e = onb.c;
        xn7 xn7 = new xn7(onb.a, onb.v0, t1e.c, t1e.o, j, j2, t1e.b);
        int i2 = maf.a;
        this.o.getClass();
        if (!(iOException2 instanceof ParserException) && !(iOException2 instanceof FileNotFoundException) && !(iOException2 instanceof HttpDataSource$CleartextNotPermittedException) && !(iOException2 instanceof Loader$UnexpectedLoaderException)) {
            int i3 = DataSourceException.b;
            Throwable th = iOException2;
            while (true) {
                if (th != null) {
                    if ((th instanceof DataSourceException) && ((DataSourceException) th).a == 2008) {
                        break;
                    }
                    th = th.getCause();
                } else {
                    j3 = (long) Math.min((i - 1) * 1000, 5000);
                    break;
                }
            }
        }
        j3 = -9223372036854775807L;
        if (j3 == -9223372036854775807L) {
            b11 = jo7.Y;
        } else {
            int e = e();
            int i4 = e > this.U0 ? 1 : 0;
            if (this.Q0 != -1 || ((u1d = this.J0) != null && u1d.f() != -9223372036854775807L)) {
                this.U0 = e;
            } else if (!this.G0 || v()) {
                this.O0 = this.G0;
                this.R0 = 0;
                this.U0 = 0;
                for (drc z : this.D0) {
                    z.z(false);
                }
                onb.Z.a = 0;
                onb.u0 = 0;
                onb.t0 = true;
                onb.y0 = false;
            } else {
                this.T0 = true;
                b11 = jo7.X;
            }
            b11 = new b11(j3, i4, 4, false);
        }
        b11 b112 = b11;
        this.X.h(xn7, 1, -1, (oy5) null, 0, (Object) null, onb.u0, this.K0, iOException, !b112.a());
        return b112;
    }
}
