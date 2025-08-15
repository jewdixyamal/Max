package defpackage;

/* renamed from: u9b  reason: default package */
public final /* synthetic */ class u9b implements tj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w9b b;

    public /* synthetic */ u9b(w9b w9b, int i) {
        this.a = i;
        this.b = w9b;
    }

    public final void accept(Object obj) {
        int i = this.a;
        jb0 jb0 = (jb0) obj;
        w9b w9b = this.b;
        w9b.getClass();
        switch (i) {
            case 0:
                if (jb0.a.f.g) {
                    jb0.b.close();
                    return;
                }
                w9b.a.execute(new v9b(w9b, jb0, 1));
                return;
            default:
                if (jb0.a.f.g) {
                    jb0.b.close();
                    return;
                }
                w9b.a.execute(new v9b(w9b, jb0, 0));
                return;
        }
    }
}
