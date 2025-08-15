package defpackage;

/* renamed from: zd4  reason: default package */
public final /* synthetic */ class zd4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lq1 b;

    public /* synthetic */ zd4(lq1 lq1, int i) {
        this.a = i;
        this.b = lq1;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
                return;
            default:
                this.b.b((Object) null);
                return;
        }
    }
}
