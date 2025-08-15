package defpackage;

/* renamed from: jj8  reason: default package */
public final /* synthetic */ class jj8 implements Runnable {
    public final /* synthetic */ ii8 X;
    public final /* synthetic */ rj8 Y;
    public final /* synthetic */ sj8 a;
    public final /* synthetic */ oh8 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int o;

    public /* synthetic */ jj8(sj8 sj8, oh8 oh8, int i, int i2, ii8 ii8, rj8 rj8) {
        this.a = sj8;
        this.b = oh8;
        this.c = i;
        this.o = i2;
        this.X = ii8;
        this.Y = rj8;
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [zg3, java.lang.Object] */
    public final void run() {
        m5d m5d = this.a.e;
        oh8 oh8 = this.b;
        int i = this.c;
        boolean G = m5d.G(oh8, i);
        int i2 = this.o;
        if (!G) {
            sj8.M0(oh8, i2, new sad(-4));
            return;
        }
        ii8 ii8 = this.X;
        ii8.s(oh8);
        ii8.e.getClass();
        rj8 rj8 = this.Y;
        if (i == 27) {
            rj8.k(ii8, oh8, i2);
            m5d.s(oh8, i, new Object());
            return;
        }
        m5d.s(oh8, i, new nj8(rj8, ii8, oh8, i2));
    }
}
