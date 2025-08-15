package defpackage;

/* renamed from: ij8  reason: default package */
public final /* synthetic */ class ij8 implements Runnable {
    public final /* synthetic */ int X;
    public final /* synthetic */ rj8 Y;
    public final /* synthetic */ ii8 Z;
    public final /* synthetic */ sj8 a;
    public final /* synthetic */ oh8 b;
    public final /* synthetic */ y9d c;
    public final /* synthetic */ int o;

    public /* synthetic */ ij8(sj8 sj8, oh8 oh8, y9d y9d, int i, int i2, rj8 rj8, ii8 ii8) {
        this.a = sj8;
        this.b = oh8;
        this.c = y9d;
        this.o = i;
        this.X = i2;
        this.Y = rj8;
        this.Z = ii8;
    }

    public final void run() {
        m5d m5d = this.a.e;
        oh8 oh8 = this.b;
        if (m5d.E(oh8)) {
            y9d y9d = this.c;
            int i = this.o;
            if (y9d != null) {
                if (!m5d.I(oh8, y9d)) {
                    sj8.M0(oh8, i, new sad(-4));
                    return;
                }
            } else if (!m5d.H(oh8, this.X)) {
                sj8.M0(oh8, i, new sad(-4));
                return;
            }
            this.Y.k(this.Z, oh8, i);
        }
    }
}
