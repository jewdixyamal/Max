package defpackage;

/* renamed from: gjg  reason: default package */
public final class gjg extends sig {
    public final /* synthetic */ qne b;
    public final /* synthetic */ sig c;
    public final /* synthetic */ mkg o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gjg(mkg mkg, qne qne, qne qne2, uhg uhg) {
        super(qne);
        this.b = qne2;
        this.c = uhg;
        this.o = mkg;
    }

    public final void a() {
        synchronized (this.o.f) {
            try {
                mkg mkg = this.o;
                qne qne = this.b;
                mkg.e.add(qne);
                qne.a.i(new bdb((Object) mkg, 16, (Object) qne));
                if (this.o.k.getAndIncrement() > 0) {
                    this.o.b.b("Already connected to the service.", new Object[0]);
                }
                mkg.b(this.o, this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
