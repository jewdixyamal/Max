package defpackage;

/* renamed from: mf4  reason: default package */
public final /* synthetic */ class mf4 implements xff {
    public final /* synthetic */ int a;
    public final /* synthetic */ rf4 b;
    public final /* synthetic */ jn c;

    public /* synthetic */ mf4(rf4 rf4, jn jnVar, int i) {
        this.a = i;
        this.b = rf4;
        this.c = jnVar;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(this.c, true);
                return;
            default:
                this.b.a(this.c, false);
                return;
        }
    }
}
