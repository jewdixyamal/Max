package defpackage;

/* renamed from: ju7  reason: default package */
public final class ju7 extends ol implements lme {
    public final String o;

    public ju7(long j, String str) {
        super(j);
        this.o = str;
    }

    public final void e(gle gle) {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        plVar.b().c(new su(this.a, 8));
    }

    public final void g(pke pke) {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        plVar.b().c(new oi0(this.a, pke));
    }

    public final dle i() {
        dle dle = new dle(sla.LOGOUT);
        String str = this.o;
        if (!(str == null || str.length() == 0)) {
            dle.p("pushToken", str);
        }
        return dle;
    }
}
