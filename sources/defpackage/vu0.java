package defpackage;

/* renamed from: vu0  reason: default package */
public final class vu0 implements yze {
    public final int a;
    public final qy5 b;
    public final sk4 c = new sk4();
    public qy5 d;
    public yze e;
    public long f;

    public vu0(int i, int i2, qy5 qy5) {
        this.a = i2;
        this.b = qy5;
    }

    public final void a(long j, int i, int i2, int i3, wze wze) {
        long j2 = this.f;
        if (j2 != -9223372036854775807L && j >= j2) {
            this.e = this.c;
        }
        yze yze = this.e;
        int i4 = oaf.a;
        yze.a(j, i, i2, i3, wze);
    }

    public final void b(wpa wpa, int i, int i2) {
        yze yze = this.e;
        int i3 = oaf.a;
        yze.b(wpa, i, 0);
    }

    public final int c(m24 m24, int i, boolean z) {
        yze yze = this.e;
        int i2 = oaf.a;
        return yze.d(m24, i, z);
    }

    public final void e(qy5 qy5) {
        qy5 qy52 = this.b;
        if (qy52 != null) {
            qy5 = qy5.f(qy52);
        }
        this.d = qy5;
        yze yze = this.e;
        int i = oaf.a;
        yze.e(qy5);
    }
}
