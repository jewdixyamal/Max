package defpackage;

/* renamed from: zue  reason: default package */
public final /* synthetic */ class zue implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tve b;

    public /* synthetic */ zue(tve tve, int i) {
        this.a = i;
        this.b = tve;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                Runnable delegatedTask = this.b.a.getDelegatedTask();
                if (delegatedTask == null) {
                    return null;
                }
                delegatedTask.run();
                return e5f.a;
            case 1:
                this.b.a.beginHandshake();
                return e5f.a;
            default:
                Runnable delegatedTask2 = this.b.a.getDelegatedTask();
                if (delegatedTask2 == null) {
                    return null;
                }
                delegatedTask2.run();
                return e5f.a;
        }
    }
}
