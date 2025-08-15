package defpackage;

/* renamed from: gr5  reason: default package */
public final class gr5 extends wq5 {
    public final /* synthetic */ int b;
    public final Object c;

    public /* synthetic */ gr5(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [dg4, erd] */
    public final void g(vae vae) {
        Object obj = this.c;
        switch (this.b) {
            case 0:
                try {
                    Object obj2 = ((kde) obj).get();
                    if (obj2 != null) {
                        p45 p45 = q45.a;
                        th = (Throwable) obj2;
                        b05.b(th, vae);
                        return;
                    }
                    throw q45.b("Callable returned a null Throwable.");
                } catch (Throwable th) {
                    th = th;
                    c37.B(th);
                }
            case 1:
                vae.f(new or5(vae, (Object[]) obj));
                return;
            case 2:
                ((r1a) obj).a(new qr5(vae));
                return;
            default:
                ((iqd) obj).k(new dg4(vae));
                return;
        }
    }
}
