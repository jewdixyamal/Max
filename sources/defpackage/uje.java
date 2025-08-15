package defpackage;

/* renamed from: uje  reason: default package */
public final /* synthetic */ class uje implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vje b;

    public /* synthetic */ uje(vje vje, int i) {
        this.a = i;
        this.b = vje;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                vje vje = this.b;
                vje.o = null;
                vje.c();
                return;
            default:
                this.b.c();
                return;
        }
    }
}
