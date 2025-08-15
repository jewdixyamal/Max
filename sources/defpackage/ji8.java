package defpackage;

/* renamed from: ji8  reason: default package */
public final /* synthetic */ class ji8 implements ri8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ si8 b;

    public /* synthetic */ ji8(si8 si8, int i) {
        this.a = i;
        this.b = si8;
    }

    public final void b(oh8 oh8) {
        switch (this.a) {
            case 0:
                this.b.f.s.K0();
                return;
            case 1:
                ii8 ii8 = this.b.f;
                if (ii8.s.W() != null) {
                    ii8.s(oh8);
                    ii8.e.getClass();
                    fm9.F(new sad(-6));
                    return;
                }
                return;
            case 2:
                this.b.f.s.V();
                return;
            case 3:
                this.b.f.s.D();
                return;
            case 4:
                this.b.f.s.L0();
                return;
            case 5:
                this.b.f.s.prepare();
                return;
            case 6:
                this.b.f.s.stop();
                return;
            case 7:
                ii8 ii82 = this.b.f;
                x4b x4b = ii82.s;
                if (oaf.c0(x4b, ii82.p)) {
                    oaf.I(x4b);
                    return;
                } else if (x4b != null && x4b.t1(1)) {
                    x4b.pause();
                    return;
                } else {
                    return;
                }
            case 8:
                this.b.f.s.J0();
                return;
            case 9:
                this.b.f.s.f0();
                return;
            case 10:
                this.b.f.g(oh8, true);
                return;
            default:
                x4b x4b2 = this.b.f.s;
                if (x4b2 != null && x4b2.t1(1)) {
                    x4b2.pause();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ ji8(si8 si8, e5c e5c) {
        this.a = 1;
        this.b = si8;
    }
}
