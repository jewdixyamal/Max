package defpackage;

/* renamed from: yu  reason: default package */
public final /* synthetic */ class yu implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tf2 b;

    public /* synthetic */ yu(tf2 tf2, int i) {
        this.a = i;
        this.b = tf2;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                dv dvVar = this.b.Z;
                return;
            default:
                dv dvVar2 = this.b.Z;
                if (dvVar2 != null) {
                    ((gi2) dvVar2).k();
                    return;
                }
                return;
        }
    }
}
