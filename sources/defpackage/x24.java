package defpackage;

/* renamed from: x24  reason: default package */
public final class x24 implements ide {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x24(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Object get() {
        switch (this.a) {
            case 0:
                return ju0.x((Throwable) this.b);
            case 1:
                uk4 uk4 = (uk4) this.b;
                uk4.j.getClass();
                return uk4.j.getApplicationContext().getCacheDir();
            case 2:
                return ((kk5) ((je7) this.b).getValue()).m();
            default:
                return this.b;
        }
    }

    public x24() {
        this.a = 0;
        this.b = n0.n;
    }
}
