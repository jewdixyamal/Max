package defpackage;

/* renamed from: fy0  reason: default package */
public final /* synthetic */ class fy0 implements Runnable {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ py0 a;
    public final /* synthetic */ wq9 b;
    public final /* synthetic */ qld c;
    public final /* synthetic */ boolean o;

    public /* synthetic */ fy0(py0 py0, wq9 wq9, qld qld, boolean z, boolean z2, String str) {
        this.a = py0;
        this.b = wq9;
        this.c = qld;
        this.o = z;
        this.X = z2;
        this.Y = str;
    }

    public final void run() {
        py0 py0 = this.a;
        wq9 wq9 = this.b;
        qld qld = this.c;
        boolean z = this.o;
        boolean z2 = this.X;
        String str = this.Y;
        py0.getClass();
        Runnable runnable = wq9.m;
        qld.getClass();
        qld.a.execute(new old(qld, z, 2));
        qld.d.setPreprocessorParams(z2, wq9.e, str, wq9.g, wq9.h, wq9.i, wq9.j, wq9.k, wq9.l, z2 ? new iy0(py0, runnable, 0) : new kc(4));
    }
}
