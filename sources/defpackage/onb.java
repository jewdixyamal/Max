package defpackage;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;

/* renamed from: onb  reason: default package */
public final class onb implements fo7 {
    public final oa5 X;
    public final ae3 Y;
    public final lh4 Z = new Object();
    public final long a = xn7.h.getAndIncrement();
    public final Uri b;
    public final t1e c;
    public final glc o;
    public volatile boolean s0;
    public boolean t0 = true;
    public long u0;
    public z24 v0 = b(0);
    public long w0 = -1;
    public drc x0;
    public boolean y0;
    public final /* synthetic */ unb z0;

    /* JADX WARNING: type inference failed for: r1v2, types: [lh4, java.lang.Object] */
    public onb(unb unb, Uri uri, r24 r24, glc glc, oa5 oa5, ae3 ae3) {
        this.z0 = unb;
        this.b = uri;
        this.c = new t1e(r24);
        this.o = glc;
        this.X = oa5;
        this.Y = ae3;
    }

    public final void a() {
        this.s0 = true;
    }

    public final z24 b(long j) {
        Collections.emptyMap();
        String str = this.z0.t0;
        Map map = unb.X0;
        Uri uri = this.b;
        if (uri != null) {
            return new z24(uri, 0, 1, (byte[]) null, map, j, -1, str, 6, (Object) null);
        }
        throw new IllegalStateException("The uri must be set.");
    }

    public final void load() {
        r24 r24;
        int i;
        int i2 = 0;
        while (i2 == 0 && !this.s0) {
            try {
                long j = this.Z.a;
                z24 b2 = b(j);
                this.v0 = b2;
                long L = this.c.L(b2);
                this.w0 = L;
                if (L != -1) {
                    this.w0 = L + j;
                }
                this.z0.C0 = ts6.a(this.c.a.a());
                t1e t1e = this.c;
                ts6 ts6 = this.z0.C0;
                if (ts6 == null || (i = ts6.Y) == -1) {
                    r24 = t1e;
                } else {
                    r24 = new ps6(t1e, i, this);
                    unb unb = this.z0;
                    unb.getClass();
                    drc p = unb.p(new snb(0, true));
                    this.x0 = p;
                    p.d(unb.Y0);
                }
                long j2 = j;
                this.o.j(r24, this.b, this.c.a.a(), j, this.w0, this.X);
                if (this.z0.C0 != null) {
                    ka5 ka5 = (ka5) this.o.c;
                    if (ka5 instanceof rd9) {
                        ((rd9) ka5).r = true;
                    }
                }
                if (this.t0) {
                    glc glc = this.o;
                    long j3 = this.u0;
                    ka5 ka52 = (ka5) glc.c;
                    ka52.getClass();
                    ka52.d(j2, j3);
                    this.t0 = false;
                }
                while (true) {
                    long j4 = j2;
                    while (i2 == 0 && !this.s0) {
                        this.Y.a();
                        glc glc2 = this.o;
                        lh4 lh4 = this.Z;
                        ka5 ka53 = (ka5) glc2.c;
                        ka53.getClass();
                        ra4 ra4 = (ra4) glc2.o;
                        ra4.getClass();
                        i2 = ka53.i(ra4, lh4);
                        j2 = this.o.i();
                        if (j2 > this.z0.u0 + j4) {
                            ae3 ae3 = this.Y;
                            synchronized (ae3) {
                                ae3.b = false;
                            }
                            unb unb2 = this.z0;
                            unb2.A0.post(unb2.z0);
                        }
                    }
                }
                if (i2 == 1) {
                    i2 = 0;
                } else if (this.o.i() != -1) {
                    this.Z.a = this.o.i();
                }
                kq0.f(this.c);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (Throwable th) {
                if (!(i2 == 1 || this.o.i() == -1)) {
                    this.Z.a = this.o.i();
                }
                kq0.f(this.c);
                throw th;
            }
        }
    }
}
