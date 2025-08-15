package defpackage;

/* renamed from: xia  reason: default package */
public final class xia implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yia b;

    public /* synthetic */ xia(yia yia, int i) {
        this.a = i;
        this.b = yia;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.invalidate();
                return;
            default:
                this.b.invalidate();
                return;
        }
    }
}
