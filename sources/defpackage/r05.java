package defpackage;

/* renamed from: r05  reason: default package */
public final /* synthetic */ class r05 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d15 b;

    public /* synthetic */ r05(d15 d15, int i) {
        this.a = i;
        this.b = d15;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                d15 d15 = this.b;
                kq0.a(d15.a(), new re6(13, (Object) d15), d15.h);
                return;
            case 1:
                d15 d152 = this.b;
                d152.h.execute(new r05(d152, 2));
                return;
            case 2:
                d15 d153 = this.b;
                if (d153.v) {
                    d153.w = null;
                    d153.j();
                    d153.v = false;
                    return;
                }
                return;
            case 3:
                d15 d154 = this.b;
                int s = au1.s(d154.D);
                if (s == 1) {
                    d154.g();
                    return;
                } else if (s == 6 || s == 8) {
                    throw new IllegalStateException("Encoder is released");
                } else {
                    return;
                }
            case 4:
                d15 d155 = this.b;
                switch (au1.s(d155.D)) {
                    case 0:
                    case 1:
                    case 2:
                    case 7:
                        d155.f();
                        return;
                    case 3:
                    case 4:
                    case 5:
                        d155.i(7);
                        return;
                    case 6:
                    case 8:
                        return;
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(rh4.r(d155.D)));
                }
            default:
                d15 d156 = this.b;
                d156.A = true;
                if (d156.z) {
                    d156.e.stop();
                    d156.h();
                    return;
                }
                return;
        }
    }
}
