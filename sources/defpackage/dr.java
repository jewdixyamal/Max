package defpackage;

import java.util.Iterator;

/* renamed from: dr  reason: default package */
public final /* synthetic */ class dr implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ je7 b;
    public final /* synthetic */ je7 c;

    public /* synthetic */ dr(je7 je7) {
        this.a = 8;
        this.b = iyc.l;
        this.c = je7;
    }

    public final Object invoke() {
        Object obj;
        switch (this.a) {
            case 0:
                return new ao7(this.b, this.c);
            case 1:
                return new ao7(this.b, this.c);
            case 2:
                return f46.a().plus(((w9a) ((kke) this.b.getValue())).b()).plus((lx3) this.c.getValue());
            case 3:
                at5 a2 = ((wt2) this.b.getValue()).a();
                tu2 su2 = a2.b() ? ru2.a : new su2(a2.v0, a2.Y, a2.w0, a2.x0, a2.A0);
                jz2 jz2 = (jz2) ((yu2) this.c.getValue());
                jz2.getClass();
                e52 e52 = (e52) l6d.c0(jz2.h(jz2.i(new at(2, jz2.l().E(su2.a())), su2), su2));
                Long valueOf = e52 != null ? Long.valueOf(e52.a) : null;
                return Long.valueOf(valueOf != null ? valueOf.longValue() : -1);
            case 4:
                at5 a3 = ((wt2) this.b.getValue()).a();
                tu2 su22 = a3.b() ? ru2.a : new su2(a3.v0, a3.Y, a3.w0, a3.x0, a3.A0);
                jz2 jz22 = (jz2) ((yu2) this.c.getValue());
                jz22.getClass();
                Iterator it = jz22.h(jz2.i(new at(2, jz22.l().E(su22.a())), su22), su22).iterator();
                Long l = null;
                if (!it.hasNext()) {
                    obj = null;
                } else {
                    obj = it.next();
                    while (it.hasNext()) {
                        obj = it.next();
                    }
                }
                e52 e522 = (e52) obj;
                if (e522 != null) {
                    l = Long.valueOf(e522.a);
                }
                return Long.valueOf(l != null ? l.longValue() : -1);
            case 5:
                return new qe0(this.b, this.c);
            case 6:
                return new qe0(this.b, this.c);
            case 7:
                return j1e.a(pag.a().plus((lx3) ((w9a) ((kke) this.b.getValue())).a().limitedParallelism(1, "non-contacts")).plus((lx3) this.c.getValue()));
            case 8:
                return new qe0(this.b, this.c);
            case 9:
                return j1e.a(((w9a) ((kke) this.b.getValue())).b().limitedParallelism(1, "shortcuts").plus((lx3) this.c.getValue()));
            default:
                return new xs2(this.b, this.c);
        }
    }

    public /* synthetic */ dr(je7 je7, je7 je72, int i) {
        this.a = i;
        this.b = je7;
        this.c = je72;
    }

    public /* synthetic */ dr(khe khe, je7 je7, lt2 lt2, int i) {
        this.a = i;
        this.b = khe;
        this.c = je7;
    }
}
