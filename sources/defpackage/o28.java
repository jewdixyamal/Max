package defpackage;

/* renamed from: o28  reason: default package */
public final class o28 extends f28 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ o28(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void g(b38 b38) {
        switch (this.a) {
            case 0:
                ((iqd) this.b).k(new n28(b38, (b7b) this.c, 0));
                return;
            case 1:
                ((f38) this.b).a(new r28(b38, (b66) this.c, 0));
                return;
            default:
                ((iqd) this.b).k(new r28(b38, (b66) this.c, 1));
                return;
        }
    }
}
