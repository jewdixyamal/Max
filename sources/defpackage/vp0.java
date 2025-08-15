package defpackage;

/* renamed from: vp0  reason: default package */
public final class vp0 implements la5 {
    public final /* synthetic */ int a;
    public final krd b;

    public vp0(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new krd(35152, 2, "image/png");
                return;
            default:
                this.b = new krd(16973, 2, "image/bmp");
                return;
        }
    }

    private final void a() {
    }

    private final void b() {
    }

    public final void S(pa5 pa5) {
        switch (this.a) {
            case 0:
                this.b.S(pa5);
                return;
            default:
                this.b.S(pa5);
                return;
        }
    }

    public final void d(long j, long j2) {
        switch (this.a) {
            case 0:
                this.b.d(j, j2);
                return;
            default:
                this.b.d(j, j2);
                return;
        }
    }

    public final int g(na5 na5, lh4 lh4) {
        switch (this.a) {
            case 0:
                return this.b.g(na5, lh4);
            default:
                return this.b.g(na5, lh4);
        }
    }

    public final boolean n(na5 na5) {
        switch (this.a) {
            case 0:
                return this.b.n(na5);
            default:
                return this.b.n(na5);
        }
    }

    public final void release() {
        int i = this.a;
    }
}
