package defpackage;

/* renamed from: ple  reason: default package */
public final /* synthetic */ class ple implements Runnable {
    public final /* synthetic */ ol X;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ bkb b;
    public final /* synthetic */ lme c;
    public final /* synthetic */ gle o;

    public /* synthetic */ ple(bkb bkb, ol olVar, lme lme, gle gle) {
        this.b = bkb;
        this.X = olVar;
        this.c = lme;
        this.o = gle;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                bkb bkb = this.b;
                bkb.getClass();
                ol olVar = this.X;
                dle s = olVar.s();
                if (s != null) {
                    ((tle) bkb.c).a.remove(s.getClass().getName());
                }
                lme lme = this.c;
                lme.b().a(new ple(bkb, lme, this.o, olVar));
                return;
            default:
                lme lme2 = this.c;
                gle gle = this.o;
                ol olVar2 = this.X;
                bkb bkb2 = this.b;
                bkb2.getClass();
                try {
                    lme2.e(gle);
                    tle.a((tle) bkb2.c, olVar2);
                    return;
                } catch (Exception e) {
                    hm9.r(tle.B0, e, "failure to run task %s", olVar2);
                    lme2.g(new pke("app.exception", e.getMessage(), (String) null));
                    return;
                }
        }
    }

    public /* synthetic */ ple(bkb bkb, lme lme, gle gle, ol olVar) {
        this.b = bkb;
        this.c = lme;
        this.o = gle;
        this.X = olVar;
    }
}
