package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: wtc  reason: default package */
public final class wtc implements Runnable {
    public long X;
    public long Y;
    public final /* synthetic */ xtc Z;
    public final Runnable a;
    public final uy1 b;
    public final long c;
    public long o;

    public wtc(xtc xtc, long j, Runnable runnable, long j2, uy1 uy1, long j3) {
        this.Z = xtc;
        this.a = runnable;
        this.b = uy1;
        this.c = j3;
        this.X = j2;
        this.Y = j;
    }

    public final void run() {
        long j;
        this.a.run();
        uy1 uy1 = this.b;
        if (!uy1.h()) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            xtc xtc = this.Z;
            xtc.getClass();
            long a2 = xtc.a(timeUnit);
            long j2 = ztc.b;
            long j3 = this.X;
            int i = ((a2 + j2) > j3 ? 1 : ((a2 + j2) == j3 ? 0 : -1));
            long j4 = this.c;
            if (i < 0 || a2 >= j3 + j4 + j2) {
                j = a2 + j4;
                long j5 = this.o + 1;
                this.o = j5;
                this.Y = j - (j4 * j5);
            } else {
                long j6 = this.Y;
                long j7 = this.o + 1;
                this.o = j7;
                j = (j7 * j4) + j6;
            }
            this.X = a2;
            dm4.c(uy1, xtc.c(this, j - a2, timeUnit));
        }
    }
}
