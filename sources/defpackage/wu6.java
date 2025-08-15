package defpackage;

/* renamed from: wu6  reason: default package */
public final /* synthetic */ class wu6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zu6 b;

    public /* synthetic */ wu6(zu6 zu6, int i) {
        this.a = i;
        this.b = zu6;
    }

    public final void run() {
        int i = this.a;
        zu6 zu6 = this.b;
        switch (i) {
            case 0:
                zu6.k();
                return;
            default:
                zu6.w();
                return;
        }
    }
}
