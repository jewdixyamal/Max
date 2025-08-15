package defpackage;

/* renamed from: x05  reason: default package */
public final /* synthetic */ class x05 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z05 b;
    public final /* synthetic */ lq1 c;

    public /* synthetic */ x05(z05 z05, lq1 lq1, int i) {
        this.a = i;
        this.b = z05;
        this.c = lq1;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.c.b(this.b.b);
                return;
            default:
                z05 z05 = this.b;
                lt0 lt0 = z05.b;
                lt0 lt02 = lt0.a;
                lq1 lq1 = this.c;
                if (lt0 == lt02) {
                    d15 d15 = z05.o;
                    bm7 a2 = d15.a();
                    kq0.y(a2, lq1);
                    lq1.a(new y05(z05, a2, 0), ju0.k());
                    z05.c.add(a2);
                    a2.d(new y05(z05, a2, 1), d15.h);
                    return;
                } else if (lt0 == lt0.b) {
                    lq1.d(new IllegalStateException("BufferProvider is not active."));
                    return;
                } else {
                    lq1.d(new IllegalStateException("Unknown state: " + z05.b));
                    return;
                }
        }
    }
}
