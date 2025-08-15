package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: q2e  reason: default package */
public final class q2e {
    public final pk a;
    public final o2e b;
    public final ztc c;
    public final fme d;

    public q2e(pk pkVar, o2e o2e, ztc ztc, fme fme) {
        this.a = pkVar;
        this.b = o2e;
        this.c = ztc;
        this.d = fme;
    }

    public final ds5 a(String str) {
        gs9 gs9 = new gs9((sla) null, 10);
        if (!oag.t(str)) {
            gs9.p(ApiProtocol.KEY_TOKEN, str);
            rqd rqd = new rqd(new uqd(((k4a) this.a).K(gs9, this.c).h(new gd1(12, p2e.class)).h(new m2e(10)).h(new m2e(11)), new bqc(14, this), 0), new m2e(12), 1);
            fme fme = this.d;
            fme.getClass();
            return rqd.j(new dme(fme, 3, 0));
        }
        throw new IllegalStateException("token cannot be null");
    }
}
