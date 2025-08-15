package defpackage;

/* renamed from: k9  reason: default package */
public final class k9 implements qza {
    public static final /* synthetic */ bc7[] i;
    public final long a;
    public final je7 b;
    public final je7 c;
    public sx3 d;
    public final kld e;
    public final v7c f;
    public final w4d g = mqd.D();
    public final boolean h;

    static {
        oi9 oi9 = new oi9(k9.class, "processActionJob", "getProcessActionJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        i = new bc7[]{oi9};
    }

    public k9(long j, je7 je7, je7 je72) {
        this.a = j;
        this.b = je7;
        this.c = je72;
        boolean z = false;
        kld b2 = lld.b(0, Integer.MAX_VALUE, 0, 5);
        this.e = b2;
        this.f = new v7c(b2);
        e52 e52 = (e52) ((jz2) ((iy2) je7.getValue())).m(j).a.getValue();
        if (e52 != null && e52.I()) {
            z = true;
        }
        this.h = z;
    }

    public final void a() {
        this.d = null;
    }

    public final void b(gza gza) {
    }

    public final void c(sx3 sx3) {
        this.d = sx3;
    }

    public final void e(long j) {
    }
}
