package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: zrd  reason: default package */
public final class zrd extends iqd {
    public final iqd X = null;
    public final iqd a;
    public final long b;
    public final TimeUnit c;
    public final ztc o;

    public zrd(uqd uqd, long j, TimeUnit timeUnit, ztc ztc) {
        this.a = uqd;
        this.b = j;
        this.c = timeUnit;
        this.o = ztc;
    }

    public final void l(erd erd) {
        erd erd2 = erd;
        yrd yrd = new yrd(erd2, this.X, this.b, this.c);
        erd.c(yrd);
        dm4.c(yrd.b, this.o.c(yrd, this.b, this.c));
        this.a.k(yrd);
    }
}
