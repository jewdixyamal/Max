package defpackage;

import java.util.TreeSet;

/* renamed from: se7  reason: default package */
public final class se7 implements qw0 {
    public final long a;
    public final TreeSet b = new TreeSet(new ye4(7));
    public long c;

    public se7(long j) {
        this.a = j;
    }

    public final void a(gw0 gw0, ex0 ex0) {
        this.b.remove(ex0);
        this.c -= ex0.c;
    }

    public final void b(gw0 gw0, ex0 ex0) {
        this.b.add(ex0);
        this.c += ex0.c;
        e(gw0, 0);
    }

    public final void c(gw0 gw0, String str, long j, long j2) {
        if (j2 != -1) {
            e(gw0, j2);
        }
    }

    public final void d(gw0 gw0, ex0 ex0, vpd vpd) {
        a(gw0, ex0);
        b(gw0, vpd);
    }

    public final void e(gw0 gw0, long j) {
        while (this.c + j > this.a && !this.b.isEmpty()) {
            ex0 ex0 = (ex0) this.b.first();
            spd spd = (spd) gw0;
            synchronized (spd) {
                spd.m(ex0);
            }
        }
    }
}
