package defpackage;

import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.ArrayList;

/* renamed from: ki0  reason: default package */
public abstract class ki0 implements t24 {
    public final boolean a;
    public final ArrayList b = new ArrayList(1);
    public int c;
    public a34 o;

    public ki0(boolean z) {
        this.a = z;
    }

    public final void H(z0f z0f) {
        z0f.getClass();
        ArrayList arrayList = this.b;
        if (!arrayList.contains(z0f)) {
            arrayList.add(z0f);
            this.c++;
        }
    }

    public final void b(int i) {
        a34 a34 = this.o;
        int i2 = oaf.a;
        for (int i3 = 0; i3 < this.c; i3++) {
            boolean z = this.a;
            i84 i84 = (i84) ((z0f) this.b.get(i3));
            synchronized (i84) {
                ffc ffc = i84.n;
                if (z && (a34.i & 8) != 8) {
                    i84.h += (long) i;
                }
            }
        }
    }

    public final void c() {
        a34 a34 = this.o;
        int i = oaf.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            boolean z = this.a;
            i84 i84 = (i84) ((z0f) this.b.get(i2));
            synchronized (i84) {
                try {
                    ffc ffc = i84.n;
                    if (z && (a34.i & 8) != 8) {
                        fm9.k(i84.f > 0);
                        i84.c.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        int i3 = (int) (elapsedRealtime - i84.g);
                        i84.i += (long) i3;
                        long j = i84.j;
                        long j2 = i84.h;
                        i84.j = j + j2;
                        if (i3 > 0) {
                            i84.e.a((int) Math.sqrt((double) j2), (((float) j2) * 8000.0f) / ((float) i3));
                            if (i84.i < 2000) {
                                if (i84.j >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                                }
                                i84.c(i3, i84.h, i84.k);
                                i84.g = elapsedRealtime;
                                i84.h = 0;
                            }
                            i84.k = (long) i84.e.b();
                            i84.c(i3, i84.h, i84.k);
                            i84.g = elapsedRealtime;
                            i84.h = 0;
                        }
                        i84.f--;
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }
        this.o = null;
    }

    public final void d() {
        for (int i = 0; i < this.c; i++) {
            ((z0f) this.b.get(i)).getClass();
        }
    }

    public final void f(a34 a34) {
        this.o = a34;
        for (int i = 0; i < this.c; i++) {
            boolean z = this.a;
            i84 i84 = (i84) ((z0f) this.b.get(i));
            synchronized (i84) {
                try {
                    ffc ffc = i84.n;
                    if (z && (a34.i & 8) != 8) {
                        if (i84.f == 0) {
                            i84.c.getClass();
                            i84.g = SystemClock.elapsedRealtime();
                        }
                        i84.f++;
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }
    }
}
