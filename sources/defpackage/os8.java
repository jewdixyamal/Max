package defpackage;

/* renamed from: os8  reason: default package */
public final /* synthetic */ class os8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ts8 b;

    public /* synthetic */ os8(ts8 ts8, int i) {
        this.a = i;
        this.b = ts8;
    }

    public final void run() {
        int i = this.a;
        ts8 ts8 = this.b;
        switch (i) {
            case 0:
                ts8.setCornersForCollage(ts8.u0);
                return;
            default:
                ts8.N();
                return;
        }
    }
}
