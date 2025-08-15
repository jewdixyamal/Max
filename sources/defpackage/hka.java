package defpackage;

/* renamed from: hka  reason: default package */
public final class hka extends Thread {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hka(int i, Object obj) {
        super("ExoPlayer:SimpleDecoder");
        this.a = i;
        this.b = obj;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                vse vse = (vse) this.b;
                if (vse != null) {
                    vse.a(getPriority());
                }
                super.run();
                return;
            case 1:
                fqd fqd = (fqd) this.b;
                fqd.getClass();
                do {
                    try {
                    } catch (InterruptedException e) {
                        throw new IllegalStateException(e);
                    }
                } while (fqd.e());
                return;
            case 2:
                vn0 vn0 = (vn0) this.b;
                vn0.getClass();
                do {
                    try {
                    } catch (InterruptedException e2) {
                        throw new IllegalStateException(e2);
                    }
                } while (vn0.j());
                return;
            default:
                ((k56) this.b).invoke();
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hka(String str, Runnable runnable) {
        super(runnable, str);
        this.a = 0;
    }

    public hka(k56 k56) {
        this.a = 3;
        this.b = k56;
    }
}
