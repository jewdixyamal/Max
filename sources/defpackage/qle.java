package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: qle  reason: default package */
public final /* synthetic */ class qle implements Runnable {
    public final /* synthetic */ lme X;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ bkb b;
    public final /* synthetic */ ol c;
    public final /* synthetic */ pke o;

    public /* synthetic */ qle(bkb bkb, ol olVar, pke pke, lme lme) {
        this.b = bkb;
        this.c = olVar;
        this.o = pke;
        this.X = lme;
    }

    /* JADX WARNING: type inference failed for: r5v4, types: [java.lang.Object, sle] */
    public final void run() {
        switch (this.a) {
            case 0:
                bkb bkb = this.b;
                bkb.getClass();
                lme lme = this.X;
                lme.b().a(new qle(bkb, this.c, this.o, lme));
                return;
            default:
                bkb bkb2 = this.b;
                bkb2.getClass();
                ol olVar = this.c;
                dle s = olVar.s();
                pke pke = this.o;
                tle tle = (tle) bkb2.c;
                if (s != null) {
                    tle.getClass();
                    if (ele.b0.contains(pke.b)) {
                        String name = s.getClass().getName();
                        ConcurrentHashMap concurrentHashMap = tle.a;
                        sle sle = (sle) concurrentHashMap.get(name);
                        sle sle2 = sle;
                        if (sle == null) {
                            ? obj = new Object();
                            obj.a = 0;
                            sle2 = obj;
                        }
                        sle2.a++;
                        sle2.b = System.currentTimeMillis();
                        concurrentHashMap.put(name, sle2);
                    }
                }
                this.X.g(pke);
                tle.f(olVar, pke);
                return;
        }
    }

    public /* synthetic */ qle(bkb bkb, lme lme, ol olVar, pke pke) {
        this.b = bkb;
        this.X = lme;
        this.c = olVar;
        this.o = pke;
    }
}
