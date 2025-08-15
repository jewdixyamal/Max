package defpackage;

/* renamed from: ib3  reason: default package */
public final class ib3 extends iqd {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public ib3(iqd iqd, pa3 pa3) {
        this.a = 3;
        this.c = iqd;
        this.b = pa3;
    }

    public final void l(erd erd) {
        switch (this.a) {
            case 0:
                ((pa3) this.b).i(new ph4((Object) this, (Object) erd, false));
                return;
            case 1:
                ((f38) this.b).a(new h38(erd, (iqd) this.c, 0));
                return;
            case 2:
                ((f38) this.b).a(new cb3(erd, 3, this.c));
                return;
            case 3:
                ((pa3) this.b).i(new h38(erd, (iqd) this.c, 1));
                return;
            case 4:
                ((iqd) this.b).k(new iq1(erd, (f6) this.c));
                return;
            case 5:
                ((iqd) this.b).k(new b9b(this, erd, false, 6));
                return;
            default:
                iqd[] iqdArr = (iqd[]) this.b;
                int length = iqdArr.length;
                int i = 0;
                if (length == 1) {
                    iqdArr[0].k(new l7b(erd, new gd1(20, this), false, 7));
                    return;
                }
                hsd hsd = new hsd(length, (b66) this.c, erd);
                erd.c(hsd);
                while (i < length && !hsd.h()) {
                    iqd iqd = iqdArr[i];
                    if (iqd == null) {
                        hsd.a(new NullPointerException("One of the sources is null"), i);
                        return;
                    } else {
                        iqd.k(hsd.c[i]);
                        i++;
                    }
                }
                return;
        }
    }

    public /* synthetic */ ib3(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
