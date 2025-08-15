package defpackage;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;

/* renamed from: pnb  reason: default package */
public final class pnb implements go7 {
    public final pa5 X;
    public final ae3 Y;
    public final lh4 Z = new Object();
    public final long a = yn7.b.getAndIncrement();
    public final Uri b;
    public final u1e c;
    public final k8g o;
    public volatile boolean s0;
    public boolean t0 = true;
    public long u0;
    public a34 v0 = b(0);
    public yze w0;
    public boolean x0;
    public final /* synthetic */ vnb y0;

    /* JADX WARNING: type inference failed for: r1v2, types: [lh4, java.lang.Object] */
    public pnb(vnb vnb, Uri uri, t24 t24, k8g k8g, pa5 pa5, ae3 ae3) {
        this.y0 = vnb;
        this.b = uri;
        this.c = new u1e(t24);
        this.o = k8g;
        this.X = pa5;
        this.Y = ae3;
    }

    public final void a() {
        this.s0 = true;
    }

    public final a34 b(long j) {
        Collections.emptyMap();
        String str = this.y0.t0;
        Map map = vnb.Z0;
        Uri uri = this.b;
        fm9.m(uri, "The uri must be set.");
        return new a34(uri, 0, 1, (byte[]) null, map, j, -1, str, 6, (Object) null);
    }

    public final void load() {
        t24 t24;
        int i;
        int i2 = 0;
        while (i2 == 0 && !this.s0) {
            try {
                long j = this.Z.a;
                a34 b2 = b(j);
                this.v0 = b2;
                long G = this.c.G(b2);
                if (this.s0) {
                    if (!(i2 == 1 || this.o.m() == -1)) {
                        this.Z.a = this.o.m();
                    }
                    mr0.i(this.c);
                    return;
                }
                if (G != -1) {
                    G += j;
                    vnb vnb = this.y0;
                    vnb.B0.post(new mnb(vnb, 0));
                }
                long j2 = G;
                this.y0.D0 = us6.a(this.c.a.a());
                u1e u1e = this.c;
                us6 us6 = this.y0.D0;
                if (us6 == null || (i = us6.Y) == -1) {
                    t24 = u1e;
                } else {
                    t24 = new qs6(u1e, i, this);
                    vnb vnb2 = this.y0;
                    vnb2.getClass();
                    yze z = vnb2.z(new tnb(0, true));
                    this.w0 = z;
                    z.e(vnb.a1);
                }
                long j3 = j;
                this.o.u(t24, this.b, this.c.a.a(), j, j2, this.X);
                if (this.y0.D0 != null) {
                    la5 la5 = (la5) this.o.b;
                    if (la5 != null) {
                        la5 m = la5.m();
                        if (m instanceof sd9) {
                            ((sd9) m).C0 = true;
                        }
                    }
                }
                if (this.t0) {
                    k8g k8g = this.o;
                    long j4 = this.u0;
                    la5 la52 = (la5) k8g.b;
                    la52.getClass();
                    la52.d(j3, j4);
                    this.t0 = false;
                }
                while (true) {
                    long j5 = j3;
                    while (i2 == 0 && !this.s0) {
                        this.Y.a();
                        k8g k8g2 = this.o;
                        lh4 lh4 = this.Z;
                        la5 la53 = (la5) k8g2.b;
                        la53.getClass();
                        sa4 sa4 = (sa4) k8g2.c;
                        sa4.getClass();
                        i2 = la53.g(sa4, lh4);
                        j3 = this.o.m();
                        if (j3 > this.y0.u0 + j5) {
                            this.Y.c();
                            vnb vnb3 = this.y0;
                            vnb3.B0.post(vnb3.A0);
                        }
                    }
                }
                if (i2 == 1) {
                    i2 = 0;
                } else if (this.o.m() != -1) {
                    this.Z.a = this.o.m();
                }
                mr0.i(this.c);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (Throwable th) {
                if (!(i2 == 1 || this.o.m() == -1)) {
                    this.Z.a = this.o.m();
                }
                mr0.i(this.c);
                throw th;
            }
        }
    }
}
