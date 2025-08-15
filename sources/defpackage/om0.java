package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;

/* renamed from: om0  reason: default package */
public abstract class om0 {
    public final /* synthetic */ int a = 0;
    public final int b;
    public final Object c;
    public final Object d;
    public Object e;

    public om0(jm0 jm0, mm0 mm0, long j, long j2, long j3, long j4, long j5, int i) {
        this.d = mm0;
        this.b = i;
        this.c = new gm0(jm0, j, j2, j3, j4, j5);
    }

    public static int c(ra4 ra4, long j, lh4 lh4) {
        if (j == ra4.o) {
            return 0;
        }
        lh4.a = j;
        return 1;
    }

    public static int d(sa4 sa4, long j, lh4 lh4) {
        if (j == sa4.o) {
            return 0;
        }
        lh4.a = j;
        return 1;
    }

    public int a(ra4 ra4, lh4 lh4) {
        ra4 ra42;
        lh4 lh42;
        long j;
        while (true) {
            ra42 = ra4;
            lh42 = lh4;
            im0 im0 = (im0) this.e;
            np8.g(im0);
            long j2 = im0.f;
            long j3 = im0.g;
            j = im0.h;
            int i = ((j3 - j2) > ((long) this.b) ? 1 : ((j3 - j2) == ((long) this.b) ? 0 : -1));
            mm0 mm0 = (mm0) this.d;
            if (i <= 0) {
                this.e = null;
                mm0.f();
                return c(ra42, j2, lh42);
            }
            long j4 = j - ra42.o;
            if (j4 >= 0 && j4 <= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                ra42.z((int) j4);
                ra42.Y = 0;
                lm0 h = mm0.h(ra42, im0.b);
                int i2 = h.a;
                if (i2 != -3) {
                    long j5 = h.b;
                    long j6 = h.c;
                    if (i2 == -2) {
                        long j7 = j5;
                        im0.d = j7;
                        im0.f = j6;
                        im0.h = im0.a(im0.b, j7, im0.e, j6, im0.g, im0.c);
                    } else if (i2 == -1) {
                        long j8 = j5;
                        im0.e = j8;
                        im0.g = j6;
                        im0.h = im0.a(im0.b, im0.d, j8, im0.f, j6, im0.c);
                    } else if (i2 == 0) {
                        long j9 = j6 - ra42.o;
                        if (j9 >= 0 && j9 <= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                            ra42.z((int) j9);
                        }
                        this.e = null;
                        mm0.f();
                        return c(ra42, j6, lh42);
                    } else {
                        throw new IllegalStateException("Invalid case");
                    }
                } else {
                    this.e = null;
                    mm0.f();
                    return c(ra4, j, lh4);
                }
            }
        }
        return c(ra42, j, lh42);
    }

    public int b(sa4 sa4, lh4 lh4) {
        sa4 sa42;
        lh4 lh42;
        long j;
        while (true) {
            sa42 = sa4;
            lh42 = lh4;
            im0 im0 = (im0) this.e;
            fm9.l(im0);
            long j2 = im0.f;
            long j3 = im0.g;
            j = im0.h;
            int i = ((j3 - j2) > ((long) this.b) ? 1 : ((j3 - j2) == ((long) this.b) ? 0 : -1));
            nm0 nm0 = (nm0) this.d;
            if (i <= 0) {
                this.e = null;
                nm0.f();
                return d(sa42, j2, lh42);
            }
            long j4 = j - sa42.o;
            if (j4 >= 0 && j4 <= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                sa42.z((int) j4);
                sa42.Y = 0;
                lm0 g = nm0.g(sa42, im0.b);
                int i2 = g.a;
                if (i2 != -3) {
                    long j5 = g.b;
                    long j6 = g.c;
                    if (i2 == -2) {
                        long j7 = j5;
                        im0.d = j7;
                        im0.f = j6;
                        im0.h = im0.b(im0.b, j7, im0.e, j6, im0.g, im0.c);
                    } else if (i2 == -1) {
                        long j8 = j5;
                        im0.e = j8;
                        im0.g = j6;
                        im0.h = im0.b(im0.b, im0.d, j8, im0.f, j6, im0.c);
                    } else if (i2 == 0) {
                        long j9 = j6 - sa42.o;
                        if (j9 >= 0 && j9 <= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                            sa42.z((int) j9);
                        }
                        this.e = null;
                        nm0.f();
                        return d(sa42, j6, lh42);
                    } else {
                        throw new IllegalStateException("Invalid case");
                    }
                } else {
                    this.e = null;
                    nm0.f();
                    return d(sa4, j, lh4);
                }
            }
        }
        return d(sa42, j, lh42);
    }

    public final void e(long j) {
        long j2 = j;
        switch (this.a) {
            case 0:
                im0 im0 = (im0) this.e;
                if (im0 == null || im0.a != j2) {
                    gm0 gm0 = (gm0) this.c;
                    long j3 = j;
                    this.e = new im0(j3, gm0.a.b(j2), gm0.d, gm0.e, gm0.f, gm0.g, 0);
                    return;
                }
                return;
            default:
                im0 im02 = (im0) this.e;
                if (im02 == null || im02.a != j2) {
                    hm0 hm0 = (hm0) this.c;
                    long j4 = j;
                    this.e = new im0(j4, hm0.a.b(j2), hm0.o, hm0.X, hm0.Y, hm0.Z, 1);
                    return;
                }
                return;
        }
    }

    public om0(km0 km0, nm0 nm0, long j, long j2, long j3, long j4, long j5, int i) {
        this.d = nm0;
        this.b = i;
        this.c = new hm0(km0, j, j2, j3, j4, j5);
    }
}
