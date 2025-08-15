package defpackage;

/* renamed from: myc  reason: default package */
public final class myc extends rd7 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bm7 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ myc(bm7 bm7, int i) {
        super(1);
        this.a = i;
        this.b = bm7;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                Throwable th = (Throwable) obj;
                this.b.cancel(false);
                return e5f.a;
            default:
                Throwable th2 = (Throwable) obj;
                this.b.cancel(false);
                return e5f.a;
        }
    }
}
