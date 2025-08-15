package defpackage;

/* renamed from: y33  reason: default package */
public final class y33 implements grc {
    public final grc a;
    public boolean b;
    public final /* synthetic */ a43 c;

    public y33(a43 a43, grc grc) {
        this.c = a43;
        this.a = grc;
    }

    public final void c() {
        this.a.c();
    }

    public final boolean d() {
        return !this.c.b() && this.a.d();
    }

    public final int e(long j) {
        if (this.c.b()) {
            return -3;
        }
        return this.a.e(j);
    }

    public final int j(y7g y7g, p54 p54, int i) {
        a43 a43 = this.c;
        if (a43.b()) {
            return -3;
        }
        if (this.b) {
            p54.b = 4;
            return -4;
        }
        long r = a43.r();
        int j = this.a.j(y7g, p54, i);
        if (j == -5) {
            qy5 qy5 = (qy5) y7g.c;
            qy5.getClass();
            int i2 = qy5.F;
            int i3 = qy5.E;
            if (!(i3 == 0 && i2 == 0)) {
                if (a43.X != 0) {
                    i3 = 0;
                }
                if (a43.Y != Long.MIN_VALUE) {
                    i2 = 0;
                }
                ny5 a2 = qy5.a();
                a2.D = i3;
                a2.E = i2;
                y7g.c = a2.a();
            }
            return -5;
        }
        long j2 = a43.Y;
        if (j2 == Long.MIN_VALUE || ((j != -4 || p54.Z < j2) && (j != -3 || r != Long.MIN_VALUE || p54.Y))) {
            return j;
        }
        p54.v();
        p54.b = 4;
        this.b = true;
        return -4;
    }
}
