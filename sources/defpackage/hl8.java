package defpackage;

import android.os.Handler;
import android.os.SystemClock;

/* renamed from: hl8  reason: default package */
public final class hl8 implements Runnable {
    public final m56 X;
    public final String Y = hl8.class.getName();
    public long Z = Long.MIN_VALUE;
    public final Handler a;
    public final h1f b;
    public final long c;
    public final long o;
    public int s0 = Integer.MIN_VALUE;
    public final fm5 t0 = new fm5(false);

    public hl8(Handler handler, h1f h1f, long j, long j2, wz7 wz7) {
        this.a = handler;
        this.b = h1f;
        this.c = j;
        this.o = j2;
        this.X = wz7;
    }

    public final void a() {
        String str = this.Y;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, str, "cancel", (Throwable) null);
        }
        this.a.removeCallbacks(this);
        this.Z = Long.MIN_VALUE;
        this.s0 = Integer.MIN_VALUE;
    }

    public final void b() {
        String str = this.Y;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, str, "start", (Throwable) null);
        }
        this.a.postDelayed(this, this.c);
    }

    public final void run() {
        int i;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        h1f h1f = this.b;
        fm5 fm5 = this.t0;
        int d = h1f.d(fm5);
        long j = this.Z;
        if (j == Long.MIN_VALUE) {
            this.Z = elapsedRealtime;
            if (d == 2) {
                this.s0 = fm5.b;
            }
        } else {
            String str = this.Y;
            if (d != 2 || (i = fm5.b) <= this.s0) {
                long j2 = elapsedRealtime - j;
                if (j2 >= this.o) {
                    hm9.m0(str, "it seems media transform is stuck, ~ " + (((float) j2) / 1000.0f) + " s", new Object[0]);
                }
            } else {
                this.Z = elapsedRealtime;
                this.s0 = i;
                hm9.m(str, "media transform progress=" + i + "%", new Object[0]);
                m56 m56 = this.X;
                if (m56 != null) {
                    m56.invoke(Float.valueOf(((float) this.s0) / 100.0f));
                }
            }
        }
        this.a.postDelayed(this, this.c);
    }
}
