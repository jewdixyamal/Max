package defpackage;

/* renamed from: mc4  reason: default package */
public final class mc4 implements la5 {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public mc4(int i) {
        if ((i & 1) != 0) {
            this.b = new krd(65496, 2, "image/jpeg");
        } else {
            this.b = new q97();
        }
    }

    private final void a() {
    }

    private final void b(long j, long j2) {
    }

    public final void S(pa5 pa5) {
        switch (this.a) {
            case 0:
                yze B = pa5.B(0, 3);
                pa5.J(new wd0(-9223372036854775807L));
                pa5.w();
                qy5 qy5 = (qy5) this.b;
                ny5 a2 = qy5.a();
                a2.m = ia9.l("text/x-unknown");
                a2.i = qy5.n;
                B.e(new qy5(a2));
                return;
            default:
                ((la5) this.b).S(pa5);
                return;
        }
    }

    public final void d(long j, long j2) {
        switch (this.a) {
            case 0:
                return;
            default:
                ((la5) this.b).d(j, j2);
                return;
        }
    }

    public final int g(na5 na5, lh4 lh4) {
        switch (this.a) {
            case 0:
                return ((sa4) na5).g(Integer.MAX_VALUE) == -1 ? -1 : 0;
            default:
                return ((la5) this.b).g(na5, lh4);
        }
    }

    public final boolean n(na5 na5) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return ((la5) this.b).n(na5);
        }
    }

    public final void release() {
        switch (this.a) {
            case 0:
                return;
            default:
                ((la5) this.b).release();
                return;
        }
    }

    public mc4(qy5 qy5) {
        this.b = qy5;
    }
}
