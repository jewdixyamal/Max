package defpackage;

/* renamed from: cs5  reason: default package */
public final class cs5 extends p0 {
    public final Object X;
    public final /* synthetic */ int c;
    public final boolean o = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cs5(wq5 wq5, Object obj, int i) {
        super(wq5);
        this.c = i;
        this.X = obj;
    }

    public final void g(vae vae) {
        switch (this.c) {
            case 0:
                this.b.c(new bs5(vae, this.X, this.o));
                return;
            default:
                xtc a = ((ztc) this.X).a();
                fs5 fs5 = new fs5(vae, a, this.b, this.o);
                vae.f(fs5);
                a.b(fs5);
                return;
        }
    }
}
