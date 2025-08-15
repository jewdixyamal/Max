package defpackage;

/* renamed from: f76  reason: default package */
public final /* synthetic */ class f76 implements mq1, wu {
    public final /* synthetic */ int a;
    public final /* synthetic */ bm7 b;

    public /* synthetic */ f76(bm7 bm7, int i) {
        this.a = i;
        this.b = bm7;
    }

    public bm7 apply(Object obj) {
        switch (this.a) {
            case 2:
                ov1 ov1 = (ov1) obj;
                return ((ov1) this.b.get()).a();
            default:
                Void voidR = (Void) obj;
                return ((ov1) this.b.get()).b();
        }
    }

    public String q(lq1 lq1) {
        switch (this.a) {
            case 0:
                zd4 zd4 = new zd4(lq1, 1);
                ok4 k = ju0.k();
                bm7 bm7 = this.b;
                bm7.d(zd4, k);
                return "transformVoidFuture [" + bm7 + "]";
            default:
                ok4 k2 = ju0.k();
                bm7 bm72 = this.b;
                kq0.z(false, bm72, lq1, k2);
                return "nonCancellationPropagating[" + bm72 + "]";
        }
    }
}
