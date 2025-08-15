package defpackage;

/* renamed from: rc5  reason: default package */
public final /* synthetic */ class rc5 implements f6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;

    public /* synthetic */ rc5(int i, int i2, long j) {
        this.a = i2;
        this.b = j;
        this.c = i;
    }

    public final void run() {
        int i = this.c;
        long j = this.b;
        switch (this.a) {
            case 0:
                hm9.m("sc5", "onNotifMoved: success move id=%d to position=%d", Long.valueOf(j), Integer.valueOf(i));
                return;
            default:
                hm9.m("md5", "onNotifMoved: success move id=%d to position=%d", Long.valueOf(j), Integer.valueOf(i));
                return;
        }
    }
}
