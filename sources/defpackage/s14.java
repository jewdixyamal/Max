package defpackage;

/* renamed from: s14  reason: default package */
public final /* synthetic */ class s14 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y14 b;

    public /* synthetic */ s14(y14 y14, int i) {
        this.a = i;
        this.b = y14;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.z();
                return;
            default:
                this.b.y(false);
                return;
        }
    }
}
