package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.cache.Cache$CacheException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: nw0  reason: default package */
public final class nw0 implements r24 {
    public upd A0;
    public boolean B0;
    public boolean C0;
    public long D0;
    public final xw0 X;
    public final boolean Y;
    public final boolean Z;
    public final hw0 a;
    public final r24 b;
    public final koe c;
    public final r24 o;
    public final boolean s0;
    public Uri t0;
    public z24 u0;
    public z24 v0;
    public r24 w0;
    public long x0;
    public long y0;
    public long z0;

    public nw0(hw0 hw0, r24 r24, r24 r242, kw0 kw0, int i) {
        xw0 xw0 = xw0.b;
        this.a = hw0;
        this.b = r242;
        this.X = xw0;
        boolean z = true;
        this.Y = (i & 1) != 0;
        this.Z = (i & 2) != 0;
        this.s0 = (i & 4) == 0 ? false : z;
        koe koe = null;
        if (r24 != null) {
            this.o = r24;
            this.c = kw0 != null ? new koe(r24, kw0) : koe;
            return;
        }
        this.o = at4.a;
        this.c = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0070 A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0075 A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0099 A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b6 A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b7 A[Catch:{ all -> 0x0073 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long L(defpackage.z24 r17) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            hw0 r2 = r1.a
            xw0 r4 = r1.X     // Catch:{ all -> 0x0073 }
            r4.getClass()     // Catch:{ all -> 0x0073 }
            java.lang.String r4 = r0.h     // Catch:{ all -> 0x0073 }
            if (r4 == 0) goto L_0x0010
            goto L_0x0016
        L_0x0010:
            android.net.Uri r4 = r0.a     // Catch:{ all -> 0x0073 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0073 }
        L_0x0016:
            long r5 = r0.f
            y24 r7 = r17.a()     // Catch:{ all -> 0x0073 }
            r7.i = r4     // Catch:{ all -> 0x0073 }
            z24 r7 = r7.a()     // Catch:{ all -> 0x0073 }
            r1.u0 = r7     // Catch:{ all -> 0x0073 }
            android.net.Uri r8 = r7.a     // Catch:{ all -> 0x0073 }
            r9 = r2
            rpd r9 = (defpackage.rpd) r9     // Catch:{ all -> 0x0073 }
            a94 r9 = r9.g(r4)     // Catch:{ all -> 0x0073 }
            java.util.Map r9 = r9.b     // Catch:{ all -> 0x0073 }
            java.lang.String r10 = "exo_redir"
            java.lang.Object r9 = r9.get(r10)     // Catch:{ all -> 0x0073 }
            byte[] r9 = (byte[]) r9     // Catch:{ all -> 0x0073 }
            r10 = 0
            if (r9 == 0) goto L_0x0042
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x0073 }
            java.nio.charset.Charset r12 = defpackage.b52.c     // Catch:{ all -> 0x0073 }
            r11.<init>(r9, r12)     // Catch:{ all -> 0x0073 }
            goto L_0x0043
        L_0x0042:
            r11 = r10
        L_0x0043:
            if (r11 != 0) goto L_0x0046
            goto L_0x004a
        L_0x0046:
            android.net.Uri r10 = android.net.Uri.parse(r11)     // Catch:{ all -> 0x0073 }
        L_0x004a:
            if (r10 == 0) goto L_0x004d
            r8 = r10
        L_0x004d:
            r1.t0 = r8     // Catch:{ all -> 0x0073 }
            r1.y0 = r5     // Catch:{ all -> 0x0073 }
            boolean r8 = r1.Z     // Catch:{ all -> 0x0073 }
            r9 = 0
            r10 = -1
            long r12 = r0.g
            if (r8 == 0) goto L_0x005f
            boolean r0 = r1.B0     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x005f
            goto L_0x0067
        L_0x005f:
            boolean r0 = r1.s0     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x0069
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x0069
        L_0x0067:
            r0 = 1
            goto L_0x006a
        L_0x0069:
            r0 = r9
        L_0x006a:
            r1.C0 = r0     // Catch:{ all -> 0x0073 }
            r14 = 0
            if (r0 == 0) goto L_0x0075
            r1.z0 = r10     // Catch:{ all -> 0x0073 }
            goto L_0x0095
        L_0x0073:
            r0 = move-exception
            goto L_0x00ba
        L_0x0075:
            rpd r2 = (defpackage.rpd) r2     // Catch:{ all -> 0x0073 }
            a94 r0 = r2.g(r4)     // Catch:{ all -> 0x0073 }
            long r3 = defpackage.ct3.a(r0)     // Catch:{ all -> 0x0073 }
            r1.z0 = r3     // Catch:{ all -> 0x0073 }
            int r0 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x0095
            long r3 = r3 - r5
            r1.z0 = r3     // Catch:{ all -> 0x0073 }
            int r0 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r0 < 0) goto L_0x008d
            goto L_0x0095
        L_0x008d:
            com.google.android.exoplayer2.upstream.DataSourceException r0 = new com.google.android.exoplayer2.upstream.DataSourceException     // Catch:{ all -> 0x0073 }
            r3 = 2008(0x7d8, float:2.814E-42)
            r0.<init>(r3)     // Catch:{ all -> 0x0073 }
            throw r0     // Catch:{ all -> 0x0073 }
        L_0x0095:
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x00a7
            long r3 = r1.z0     // Catch:{ all -> 0x0073 }
            int r5 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r5 != 0) goto L_0x00a1
            r3 = r12
            goto L_0x00a5
        L_0x00a1:
            long r3 = java.lang.Math.min(r3, r12)     // Catch:{ all -> 0x0073 }
        L_0x00a5:
            r1.z0 = r3     // Catch:{ all -> 0x0073 }
        L_0x00a7:
            long r3 = r1.z0     // Catch:{ all -> 0x0073 }
            int r5 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r5 > 0) goto L_0x00b1
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x00b4
        L_0x00b1:
            r1.c(r7, r9)     // Catch:{ all -> 0x0073 }
        L_0x00b4:
            if (r0 == 0) goto L_0x00b7
            goto L_0x00b9
        L_0x00b7:
            long r12 = r1.z0     // Catch:{ all -> 0x0073 }
        L_0x00b9:
            return r12
        L_0x00ba:
            r24 r3 = r1.w0
            r24 r4 = r1.b
            if (r3 == r4) goto L_0x00c4
            boolean r3 = r0 instanceof com.google.android.exoplayer2.upstream.cache.Cache$CacheException
            if (r3 == 0) goto L_0x00c7
        L_0x00c4:
            r2 = 1
            r1.B0 = r2
        L_0x00c7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nw0.L(z24):long");
    }

    public final void N(y0f y0f) {
        y0f.getClass();
        this.b.N(y0f);
        this.o.N(y0f);
    }

    public final Map a() {
        return (this.w0 == this.b) ^ true ? this.o.a() : Collections.emptyMap();
    }

    public final void b() {
        hw0 hw0 = this.a;
        r24 r24 = this.w0;
        if (r24 != null) {
            try {
                r24.close();
            } finally {
                this.v0 = null;
                this.w0 = null;
                upd upd = this.A0;
                if (upd != null) {
                    ((rpd) hw0).i(upd);
                    this.A0 = null;
                }
            }
        }
    }

    public final void c(z24 z24, boolean z) {
        upd upd;
        z24 z242;
        r24 r24;
        z24 z243 = z24;
        String str = z243.h;
        int i = maf.a;
        Uri uri = null;
        if (this.C0) {
            upd = null;
        } else if (this.Y) {
            try {
                hw0 hw0 = this.a;
                long j = this.y0;
                long j2 = this.z0;
                rpd rpd = (rpd) hw0;
                synchronized (rpd) {
                    rpd.d();
                    while (true) {
                        upd = rpd.l(j, str, j2);
                        if (upd != null) {
                            break;
                        }
                        rpd.wait();
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            upd = ((rpd) this.a).l(this.y0, str, this.z0);
        }
        if (upd == null) {
            r24 = this.o;
            y24 a2 = z24.a();
            a2.g = this.y0;
            a2.h = this.z0;
            z242 = a2.a();
        } else if (upd.o) {
            Uri fromFile = Uri.fromFile(upd.X);
            long j3 = upd.b;
            long j4 = this.y0 - j3;
            long j5 = upd.c - j4;
            long j6 = this.z0;
            if (j6 != -1) {
                j5 = Math.min(j5, j6);
            }
            y24 a3 = z24.a();
            a3.b = fromFile;
            a3.c = j3;
            a3.g = j4;
            a3.h = j5;
            z242 = a3.a();
            r24 = this.b;
        } else {
            long j7 = upd.c;
            if (j7 == -1) {
                j7 = this.z0;
            } else {
                long j8 = this.z0;
                if (j8 != -1) {
                    j7 = Math.min(j7, j8);
                }
            }
            y24 a4 = z24.a();
            a4.g = this.y0;
            a4.h = j7;
            z242 = a4.a();
            r24 = this.c;
            if (r24 == null) {
                r24 = this.o;
                ((rpd) this.a).i(upd);
                upd = null;
            }
        }
        this.D0 = (this.C0 || r24 != this.o) ? Long.MAX_VALUE : this.y0 + 102400;
        boolean z2 = false;
        if (z) {
            np8.f(this.w0 == this.o);
            if (r24 != this.o) {
                try {
                    b();
                } catch (Throwable th) {
                    Throwable th2 = th;
                    if (!upd.o) {
                        ((rpd) this.a).i(upd);
                    }
                    throw th2;
                }
            } else {
                return;
            }
        }
        if (upd != null && (!upd.o)) {
            this.A0 = upd;
        }
        this.w0 = r24;
        this.v0 = z242;
        this.x0 = 0;
        long L = r24.L(z242);
        h7b h7b = new h7b(13);
        if (z242.g == -1 && L != -1) {
            this.z0 = L;
            h7b.e(Long.valueOf(this.y0 + L), "exo_len");
        }
        if (this.w0 == this.b) {
            z2 = true;
        }
        if (!z2) {
            Uri uri2 = r24.getUri();
            this.t0 = uri2;
            if (!z243.a.equals(uri2)) {
                uri = this.t0;
            }
            if (uri == null) {
                ((ArrayList) h7b.c).add("exo_redir");
                ((HashMap) h7b.b).remove("exo_redir");
            } else {
                h7b.e(uri.toString(), "exo_redir");
            }
        }
        if (this.w0 == this.c) {
            ((rpd) this.a).c(str, h7b);
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
        r24 r24 = this.b;
        boolean z = false;
        if (i4 == 0) {
            return 0;
        }
        if (this.z0 == 0) {
            return -1;
        }
        z24 z24 = this.u0;
        z24.getClass();
        z24 z242 = this.v0;
        z242.getClass();
        try {
            if (this.y0 >= this.D0) {
                c(z24, true);
            }
            r24 r242 = this.w0;
            r242.getClass();
            int read = r242.read(bArr, i, i4);
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
            r24 r243 = this.w0;
            if (!(r243 == r24)) {
                i3 = read;
                long j3 = z242.g;
                if (j3 == -1 || this.x0 < j3) {
                    String str = z24.h;
                    int i5 = maf.a;
                    this.z0 = 0;
                    if (r243 == this.c) {
                        z = true;
                    }
                    if (!z) {
                        return i3;
                    }
                    h7b h7b = new h7b(13);
                    h7b.e(Long.valueOf(this.y0), "exo_len");
                    ((rpd) this.a).c(str, h7b);
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
            c(z24, false);
            return read(bArr, i, i2);
        } catch (Throwable th) {
            if (this.w0 == r24 || (th instanceof Cache$CacheException)) {
                this.B0 = true;
            }
            throw th;
        }
    }
}
