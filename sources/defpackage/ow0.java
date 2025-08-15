package defpackage;

import android.net.Uri;
import androidx.media3.datasource.cache.Cache$CacheException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ow0  reason: default package */
public final class ow0 implements t24 {
    public vpd A0;
    public boolean B0;
    public boolean C0;
    public long D0;
    public final xw0 X;
    public final boolean Y;
    public final boolean Z;
    public final gw0 a;
    public final t24 b;
    public final loe c;
    public final t24 o;
    public final boolean s0;
    public Uri t0;
    public a34 u0;
    public a34 v0;
    public t24 w0;
    public long x0;
    public long y0;
    public long z0;

    public ow0(gw0 gw0, t24 t24, t24 t242, kw0 kw0, int i) {
        xw0 xw0 = xw0.c;
        this.a = gw0;
        this.b = t242;
        this.X = xw0;
        boolean z = true;
        this.Y = (i & 1) != 0;
        this.Z = (i & 2) != 0;
        this.s0 = (i & 4) == 0 ? false : z;
        loe loe = null;
        if (t24 != null) {
            this.o = t24;
            this.c = kw0 != null ? new loe(t24, kw0) : loe;
            return;
        }
        this.o = m2b.a;
        this.c = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0066 A[Catch:{ all -> 0x0069 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006b A[Catch:{ all -> 0x0069 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008f A[Catch:{ all -> 0x0069 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ac A[Catch:{ all -> 0x0069 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ad A[Catch:{ all -> 0x0069 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long G(defpackage.a34 r17) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            gw0 r2 = r1.a
            xw0 r4 = r1.X     // Catch:{ all -> 0x0069 }
            java.lang.String r4 = r4.e(r0)     // Catch:{ all -> 0x0069 }
            long r5 = r0.f
            y24 r7 = r17.a()     // Catch:{ all -> 0x0069 }
            r7.i = r4     // Catch:{ all -> 0x0069 }
            a34 r7 = r7.b()     // Catch:{ all -> 0x0069 }
            r1.u0 = r7     // Catch:{ all -> 0x0069 }
            android.net.Uri r8 = r7.a     // Catch:{ all -> 0x0069 }
            r9 = r2
            spd r9 = (defpackage.spd) r9     // Catch:{ all -> 0x0069 }
            b94 r9 = r9.i(r4)     // Catch:{ all -> 0x0069 }
            java.util.Map r9 = r9.b     // Catch:{ all -> 0x0069 }
            java.lang.String r10 = "exo_redir"
            java.lang.Object r9 = r9.get(r10)     // Catch:{ all -> 0x0069 }
            byte[] r9 = (byte[]) r9     // Catch:{ all -> 0x0069 }
            r10 = 0
            if (r9 == 0) goto L_0x0038
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x0069 }
            java.nio.charset.Charset r12 = defpackage.b52.c     // Catch:{ all -> 0x0069 }
            r11.<init>(r9, r12)     // Catch:{ all -> 0x0069 }
            goto L_0x0039
        L_0x0038:
            r11 = r10
        L_0x0039:
            if (r11 != 0) goto L_0x003c
            goto L_0x0040
        L_0x003c:
            android.net.Uri r10 = android.net.Uri.parse(r11)     // Catch:{ all -> 0x0069 }
        L_0x0040:
            if (r10 == 0) goto L_0x0043
            r8 = r10
        L_0x0043:
            r1.t0 = r8     // Catch:{ all -> 0x0069 }
            r1.y0 = r5     // Catch:{ all -> 0x0069 }
            boolean r8 = r1.Z     // Catch:{ all -> 0x0069 }
            r9 = 0
            r10 = -1
            long r12 = r0.g
            if (r8 == 0) goto L_0x0055
            boolean r0 = r1.B0     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x0055
            goto L_0x005d
        L_0x0055:
            boolean r0 = r1.s0     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x005f
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x005f
        L_0x005d:
            r0 = 1
            goto L_0x0060
        L_0x005f:
            r0 = r9
        L_0x0060:
            r1.C0 = r0     // Catch:{ all -> 0x0069 }
            r14 = 0
            if (r0 == 0) goto L_0x006b
            r1.z0 = r10     // Catch:{ all -> 0x0069 }
            goto L_0x008b
        L_0x0069:
            r0 = move-exception
            goto L_0x00b0
        L_0x006b:
            spd r2 = (defpackage.spd) r2     // Catch:{ all -> 0x0069 }
            b94 r0 = r2.i(r4)     // Catch:{ all -> 0x0069 }
            long r3 = defpackage.dt3.a(r0)     // Catch:{ all -> 0x0069 }
            r1.z0 = r3     // Catch:{ all -> 0x0069 }
            int r0 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x008b
            long r3 = r3 - r5
            r1.z0 = r3     // Catch:{ all -> 0x0069 }
            int r0 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r0 < 0) goto L_0x0083
            goto L_0x008b
        L_0x0083:
            androidx.media3.datasource.DataSourceException r0 = new androidx.media3.datasource.DataSourceException     // Catch:{ all -> 0x0069 }
            r3 = 2008(0x7d8, float:2.814E-42)
            r0.<init>(r3)     // Catch:{ all -> 0x0069 }
            throw r0     // Catch:{ all -> 0x0069 }
        L_0x008b:
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x009d
            long r3 = r1.z0     // Catch:{ all -> 0x0069 }
            int r5 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r5 != 0) goto L_0x0097
            r3 = r12
            goto L_0x009b
        L_0x0097:
            long r3 = java.lang.Math.min(r3, r12)     // Catch:{ all -> 0x0069 }
        L_0x009b:
            r1.z0 = r3     // Catch:{ all -> 0x0069 }
        L_0x009d:
            long r3 = r1.z0     // Catch:{ all -> 0x0069 }
            int r5 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r5 > 0) goto L_0x00a7
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x00aa
        L_0x00a7:
            r1.c(r7, r9)     // Catch:{ all -> 0x0069 }
        L_0x00aa:
            if (r0 == 0) goto L_0x00ad
            goto L_0x00af
        L_0x00ad:
            long r12 = r1.z0     // Catch:{ all -> 0x0069 }
        L_0x00af:
            return r12
        L_0x00b0:
            t24 r3 = r1.w0
            t24 r4 = r1.b
            if (r3 == r4) goto L_0x00ba
            boolean r3 = r0 instanceof androidx.media3.datasource.cache.Cache$CacheException
            if (r3 == 0) goto L_0x00bd
        L_0x00ba:
            r2 = 1
            r1.B0 = r2
        L_0x00bd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ow0.G(a34):long");
    }

    public final void H(z0f z0f) {
        z0f.getClass();
        this.b.H(z0f);
        this.o.H(z0f);
    }

    public final Map a() {
        return (this.w0 == this.b) ^ true ? this.o.a() : Collections.emptyMap();
    }

    public final void b() {
        gw0 gw0 = this.a;
        t24 t24 = this.w0;
        if (t24 != null) {
            try {
                t24.close();
            } finally {
                this.v0 = null;
                this.w0 = null;
                vpd vpd = this.A0;
                if (vpd != null) {
                    ((spd) gw0).k(vpd);
                    this.A0 = null;
                }
            }
        }
    }

    public final void c(a34 a34, boolean z) {
        vpd vpd;
        a34 a342;
        t24 t24;
        a34 a343 = a34;
        String str = a343.h;
        int i = oaf.a;
        Uri uri = null;
        if (this.C0) {
            vpd = null;
        } else if (this.Y) {
            try {
                gw0 gw0 = this.a;
                long j = this.y0;
                long j2 = this.z0;
                spd spd = (spd) gw0;
                synchronized (spd) {
                    spd.d();
                    while (true) {
                        vpd = spd.o(j, str, j2);
                        if (vpd != null) {
                            break;
                        }
                        spd.wait();
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            vpd = ((spd) this.a).o(this.y0, str, this.z0);
        }
        if (vpd == null) {
            t24 = this.o;
            y24 a2 = a34.a();
            a2.g = this.y0;
            a2.h = this.z0;
            a342 = a2.b();
        } else if (vpd.o) {
            Uri fromFile = Uri.fromFile(vpd.X);
            long j3 = vpd.b;
            long j4 = this.y0 - j3;
            long j5 = vpd.c - j4;
            long j6 = this.z0;
            if (j6 != -1) {
                j5 = Math.min(j5, j6);
            }
            y24 a3 = a34.a();
            a3.b = fromFile;
            a3.c = j3;
            a3.g = j4;
            a3.h = j5;
            a342 = a3.b();
            t24 = this.b;
        } else {
            long j7 = vpd.c;
            if (j7 == -1) {
                j7 = this.z0;
            } else {
                long j8 = this.z0;
                if (j8 != -1) {
                    j7 = Math.min(j7, j8);
                }
            }
            y24 a4 = a34.a();
            a4.g = this.y0;
            a4.h = j7;
            a342 = a4.b();
            t24 = this.c;
            if (t24 == null) {
                t24 = this.o;
                ((spd) this.a).k(vpd);
                vpd = null;
            }
        }
        this.D0 = (this.C0 || t24 != this.o) ? Long.MAX_VALUE : this.y0 + 102400;
        boolean z2 = false;
        if (z) {
            fm9.k(this.w0 == this.o);
            if (t24 != this.o) {
                try {
                    b();
                } catch (Throwable th) {
                    Throwable th2 = th;
                    if (!vpd.o) {
                        ((spd) this.a).k(vpd);
                    }
                    throw th2;
                }
            } else {
                return;
            }
        }
        if (vpd != null && (!vpd.o)) {
            this.A0 = vpd;
        }
        this.w0 = t24;
        this.v0 = a342;
        this.x0 = 0;
        long G = t24.G(a342);
        imc imc = new imc(13);
        if (a342.g == -1 && G != -1) {
            this.z0 = G;
            imc.M(Long.valueOf(this.y0 + G), "exo_len");
        }
        if (this.w0 == this.b) {
            z2 = true;
        }
        if (!z2) {
            Uri uri2 = t24.getUri();
            this.t0 = uri2;
            if (!a343.a.equals(uri2)) {
                uri = this.t0;
            }
            if (uri == null) {
                ((ArrayList) imc.c).add("exo_redir");
                ((HashMap) imc.b).remove("exo_redir");
            } else {
                imc.M(uri.toString(), "exo_redir");
            }
        }
        if (this.w0 == this.c) {
            ((spd) this.a).c(str, imc);
        }
    }

    public final void close() {
        this.u0 = null;
        this.t0 = null;
        this.y0 = 0;
        try {
            b();
        } catch (Throwable th) {
            if (this.w0 == this.b || (th instanceof Cache$CacheException)) {
                this.B0 = true;
            }
            throw th;
        }
    }

    public final Uri getUri() {
        return this.t0;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = i2;
        t24 t24 = this.b;
        boolean z = false;
        if (i4 == 0) {
            return 0;
        }
        if (this.z0 == 0) {
            return -1;
        }
        a34 a34 = this.u0;
        a34.getClass();
        a34 a342 = this.v0;
        a342.getClass();
        try {
            if (this.y0 >= this.D0) {
                c(a34, true);
            }
            t24 t242 = this.w0;
            t242.getClass();
            int read = t242.read(bArr, i, i4);
            if (read != -1) {
                long j = (long) read;
                this.y0 += j;
                this.x0 += j;
                long j2 = this.z0;
                if (j2 != -1) {
                    this.z0 = j2 - j;
                }
                return read;
            }
            t24 t243 = this.w0;
            if (!(t243 == t24)) {
                i3 = read;
                long j3 = a342.g;
                if (j3 == -1 || this.x0 < j3) {
                    String str = a34.h;
                    int i5 = oaf.a;
                    this.z0 = 0;
                    if (t243 == this.c) {
                        z = true;
                    }
                    if (!z) {
                        return i3;
                    }
                    imc imc = new imc(13);
                    imc.M(Long.valueOf(this.y0), "exo_len");
                    ((spd) this.a).c(str, imc);
                    return i3;
                }
            } else {
                i3 = read;
            }
            long j4 = this.z0;
            if (j4 <= 0) {
                if (j4 != -1) {
                    return i3;
                }
            }
            b();
            c(a34, false);
            return read(bArr, i, i2);
        } catch (Throwable th) {
            if (this.w0 == t24 || (th instanceof Cache$CacheException)) {
                this.B0 = true;
            }
            throw th;
        }
    }
}
