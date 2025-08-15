package defpackage;

import java.util.Objects;

/* renamed from: e0a  reason: default package */
public final class e0a extends w2 {
    public final /* synthetic */ int b;
    public final b66 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0a(r1a r1a, b66 b66, int i) {
        super(r1a);
        this.b = i;
        this.c = b66;
    }

    public final void q(f2a f2a) {
        switch (this.b) {
            case 0:
                this.a.a(new d0a(f2a, this.c, 0));
                return;
            case 1:
                this.a.a(new d0a(f2a, this.c, 1));
                return;
            case 2:
                this.a.a(new f0a(f2a, this.c, 0));
                return;
            case 3:
                this.a.a(new wz9(f2a, this.c, 1));
                return;
            case 4:
                ana ana = new ana(f2a, (pc5) this.c);
                f2a.c((uy1) ana.X);
                this.a.a(ana);
                return;
            case 5:
                this.a.a(new f0a(f2a, this.c, 1));
                return;
            default:
                b7d b7d = new b7d(new xpb());
                try {
                    Object apply = this.c.apply(b7d);
                    Objects.requireNonNull(apply, "The handler returned a null ObservableSource");
                    r1a r1a = (r1a) apply;
                    k1a k1a = new k1a(f2a, b7d, this.a);
                    f2a.c(k1a);
                    r1a.a(k1a.X);
                    k1a.a();
                    return;
                } catch (Throwable th) {
                    c37.B(th);
                    iz4.b(th, f2a);
                    return;
                }
        }
    }
}
