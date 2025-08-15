package defpackage;

/* renamed from: ae0  reason: default package */
public final class ae0 implements la5 {
    public final /* synthetic */ int a;
    public final wpa b;
    public final krd c;

    public ae0(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new wpa(4);
                this.c = new krd(-1, -1, "image/heif");
                return;
            case 2:
                this.b = new wpa(4);
                this.c = new krd(-1, -1, "image/webp");
                return;
            default:
                this.b = new wpa(4);
                this.c = new krd(-1, -1, "image/avif");
                return;
        }
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    public final void S(pa5 pa5) {
        switch (this.a) {
            case 0:
                this.c.S(pa5);
                return;
            case 1:
                this.c.S(pa5);
                return;
            default:
                this.c.S(pa5);
                return;
        }
    }

    public final void d(long j, long j2) {
        switch (this.a) {
            case 0:
                this.c.d(j, j2);
                return;
            case 1:
                this.c.d(j, j2);
                return;
            default:
                this.c.d(j, j2);
                return;
        }
    }

    public final int g(na5 na5, lh4 lh4) {
        switch (this.a) {
            case 0:
                return this.c.g(na5, lh4);
            case 1:
                return this.c.g(na5, lh4);
            default:
                return this.c.g(na5, lh4);
        }
    }

    public final boolean n(na5 na5) {
        switch (this.a) {
            case 0:
                ((sa4) na5).b(4, false);
                sa4 sa4 = (sa4) na5;
                wpa wpa = this.b;
                wpa.D(4);
                sa4.q(wpa.a, 0, 4, false);
                if (wpa.w() != ((long) 1718909296)) {
                    return false;
                }
                wpa.D(4);
                sa4.q(wpa.a, 0, 4, false);
                return wpa.w() == ((long) 1635150182);
            case 1:
                ((sa4) na5).b(4, false);
                sa4 sa42 = (sa4) na5;
                wpa wpa2 = this.b;
                wpa2.D(4);
                sa42.q(wpa2.a, 0, 4, false);
                if (wpa2.w() != ((long) 1718909296)) {
                    return false;
                }
                wpa2.D(4);
                sa42.q(wpa2.a, 0, 4, false);
                return wpa2.w() == ((long) 1751476579);
            default:
                wpa wpa3 = this.b;
                wpa3.D(4);
                ((sa4) na5).q(wpa3.a, 0, 4, false);
                if (wpa3.w() != 1380533830) {
                    return false;
                }
                sa4 sa43 = (sa4) na5;
                sa43.b(4, false);
                wpa3.D(4);
                sa43.q(wpa3.a, 0, 4, false);
                return wpa3.w() == 1464156752;
        }
    }

    public final void release() {
        int i = this.a;
    }
}
