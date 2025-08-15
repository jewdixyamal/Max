package defpackage;

/* renamed from: wu1  reason: default package */
public final /* synthetic */ class wu1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wu1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                ((lq1) this.b).b((Object) null);
                return;
            default:
                gvc gvc = (gvc) this.b;
                synchronized (gvc.b) {
                    gvc.c();
                }
                return;
        }
    }
}
