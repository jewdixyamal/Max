package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: fh8  reason: default package */
public final class fh8 implements l78, m78 {
    public final Object X;
    public Object Y;
    public final /* synthetic */ int a;
    public boolean b;
    public long c;
    public long o;

    public fh8(q57 q57) {
        this.a = 0;
        this.X = new Handler(Looper.getMainLooper());
        this.Y = q57;
    }

    public void a(long j) {
        switch (this.a) {
            case 2:
                this.c = j;
                if (this.b) {
                    ((rhe) this.X).getClass();
                    this.o = SystemClock.elapsedRealtime();
                    return;
                }
                return;
            default:
                this.c = j;
                if (this.b) {
                    ((she) this.X).getClass();
                    this.o = SystemClock.elapsedRealtime();
                    return;
                }
                return;
        }
    }

    public void b() {
        switch (this.a) {
            case 2:
                if (!this.b) {
                    ((rhe) this.X).getClass();
                    this.o = SystemClock.elapsedRealtime();
                    this.b = true;
                    return;
                }
                return;
            default:
                if (!this.b) {
                    ((she) this.X).getClass();
                    this.o = SystemClock.elapsedRealtime();
                    this.b = true;
                    return;
                }
                return;
        }
    }

    public b3b d() {
        return (b3b) this.Y;
    }

    public void f(c3b c3b) {
        if (this.b) {
            a(t());
        }
        this.Y = c3b;
    }

    public long t() {
        switch (this.a) {
            case 2:
                long j = this.c;
                if (!this.b) {
                    return j;
                }
                ((rhe) this.X).getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.o;
                b3b b3b = (b3b) this.Y;
                return j + (b3b.a == 1.0f ? maf.D(elapsedRealtime) : elapsedRealtime * ((long) b3b.c));
            default:
                long j2 = this.c;
                if (!this.b) {
                    return j2;
                }
                ((she) this.X).getClass();
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - this.o;
                c3b c3b = (c3b) this.Y;
                return j2 + (c3b.a == 1.0f ? oaf.S(elapsedRealtime2) : elapsedRealtime2 * ((long) c3b.c));
        }
    }

    public void u(b3b b3b) {
        if (this.b) {
            a(t());
        }
        this.Y = b3b;
    }

    /* renamed from: d  reason: collision with other method in class */
    public c3b m7d() {
        return (c3b) this.Y;
    }

    public fh8(rhe rhe) {
        this.a = 2;
        this.X = rhe;
        this.Y = b3b.o;
    }

    public fh8(she she) {
        this.a = 3;
        this.X = she;
        this.Y = c3b.d;
    }

    public fh8(boolean z, long j, long j2, m56 m56, m56 m562) {
        this.a = 1;
        this.b = z;
        this.c = j;
        this.o = j2;
        this.X = m56;
        this.Y = m562;
    }
}
