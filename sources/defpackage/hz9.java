package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: hz9  reason: default package */
public final class hz9 extends w2 {
    public final /* synthetic */ int b;
    public final TimeUnit c;
    public final ztc o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hz9(xpb xpb, TimeUnit timeUnit, ztc ztc, int i) {
        super(xpb);
        this.b = i;
        this.c = timeUnit;
        this.o = ztc;
    }

    public final void q(f2a f2a) {
        switch (this.b) {
            case 0:
                this.a.a(new gz9(new y6d(f2a), this.c, this.o.a()));
                return;
            default:
                this.a.a(new x1a(f2a, this.c, this.o.a()));
                return;
        }
    }
}
