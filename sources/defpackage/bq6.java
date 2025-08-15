package defpackage;

/* renamed from: bq6  reason: default package */
public final /* synthetic */ class bq6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ long c;
    public final /* synthetic */ zl4 o;

    public /* synthetic */ bq6(zl4 zl4, float f, long j, int i) {
        this.a = i;
        this.o = zl4;
        this.b = f;
        this.c = j;
    }

    public final void run() {
        zl4 zl4 = this.o;
        switch (this.a) {
            case 0:
                cq6 cq6 = (cq6) zl4;
                if (!cq6.Y.get()) {
                    long nanoTime = System.nanoTime();
                    long j = cq6.Z;
                    int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                    float f = this.b;
                    if (i == 0 || Math.abs(nanoTime - j) > 1000000000) {
                        cq6.Z = nanoTime;
                        hm9.m("dq6", "onFileUploadProgress: progress=%f, total %d", Float.valueOf(f), Long.valueOf(this.c));
                    }
                    cq6.X.e(new zp6(f, false));
                    return;
                }
                return;
            default:
                tq6 tq6 = (tq6) zl4;
                if (!tq6.s0.get()) {
                    long nanoTime2 = System.nanoTime();
                    long j2 = tq6.t0;
                    int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
                    float f2 = this.b;
                    long j3 = this.c;
                    if (i2 == 0 || Math.abs(nanoTime2 - j2) > 1000000000) {
                        tq6.t0 = nanoTime2;
                        hm9.m("uq6", "onFileUploadProgress: progress=%f, total %d", Float.valueOf(f2), Long.valueOf(j3));
                    }
                    tq6.Z.e(new sq6(false, (String) null, f2, j3));
                    return;
                }
                return;
        }
    }
}
