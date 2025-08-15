package defpackage;

/* renamed from: vef  reason: default package */
public final /* synthetic */ class vef implements b66, qj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wef b;

    public /* synthetic */ vef(wef wef, int i) {
        this.a = i;
        this.b = wef;
    }

    public void accept(Object obj) {
        int i = this.a;
        wef wef = this.b;
        switch (i) {
            case 1:
                zl4 zl4 = (zl4) obj;
                synchronized (wef) {
                    wef.h.a(zl4);
                }
                return;
            default:
                kef kef = (kef) obj;
                nd7.U(new qa3(wef.b.a(), 2, new uef(kef, 2)).l(), ft.e, new uef(kef, 0), new e5(22, kef));
                return;
        }
    }

    public Object apply(Object obj) {
        iqd iqd;
        wef wef = this.b;
        int i = this.a;
        kef kef = (kef) obj;
        wef.getClass();
        switch (i) {
            case 0:
                if (!kef.b || !kj6.h(kef.d)) {
                    hm9.m("wef", "convertVideo: start convert = %s", kef);
                    if (!oag.t(kef.c)) {
                        iqd = iqd.g(kef);
                    } else {
                        it3 c = ((cj0) wef.a).c(kef.a.a);
                        if (c == null) {
                            iqd = iqd.f(new RuntimeException("failed to prepare videoConversion files"));
                        } else if (c.b == 0) {
                            iqd = iqd.f(new RuntimeException("content is zero length"));
                        } else {
                            String str = c.e;
                            if (oag.t(str)) {
                                iqd = new q1a(1, new tef(wef, kef, c, 0)).m(wef.g.a).i(wef.f);
                            } else {
                                w36 a2 = kef.a();
                                a2.c = str;
                                iqd = iqd.g(new kef(a2));
                            }
                        }
                    }
                    return new rqd(new rqd(new uqd(new rqd(iqd, new vef(wef, 2), 2), new vef(wef, 3), 0), new uef(kef, 1), 1), new vef(wef, 2), 2);
                }
                hm9.m("wef", "convertVideo: exists result = %s", kef);
                return iqd.g(kef);
            default:
                return new q1a(1, new ypc(wef, 24, kef)).m(wef.e.a).i(wef.f);
        }
    }
}
