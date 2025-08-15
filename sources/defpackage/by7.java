package defpackage;

/* renamed from: by7  reason: default package */
public final /* synthetic */ class by7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cy7 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ by7(cy7 cy7, Object obj, int i) {
        this.a = i;
        this.b = cy7;
        this.c = obj;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                by7.super.c(this.c);
                return;
            case 1:
                cy7 cy7 = this.b;
                cy7.getClass();
                try {
                    by7.super.d(this.c);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                cy7 cy72 = this.b;
                cy72.getClass();
                try {
                    by7.super.f(this.c);
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
