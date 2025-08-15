package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: k2e  reason: default package */
public final /* synthetic */ class k2e implements b66, qj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o2e b;

    public /* synthetic */ k2e(o2e o2e, int i) {
        this.a = i;
        this.b = o2e;
    }

    public void accept(Object obj) {
        this.b.e((List) obj);
    }

    public Object apply(Object obj) {
        o2e o2e = this.b;
        int i = this.a;
        List<h9c> list = (List) obj;
        o2e.getClass();
        switch (i) {
            case 0:
                ArrayList arrayList = new ArrayList();
                for (h9c h9c : list) {
                    if (h9c instanceof j3e) {
                        arrayList.add(Long.valueOf(((j3e) h9c).c));
                    }
                }
                ArrayList c = o2e.c(arrayList);
                if (!c.isEmpty()) {
                    o2e.d(c).e();
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Long l = (Long) it.next();
                    l.getClass();
                    d2e d2e = (d2e) o2e.a.get(l);
                    if (d2e != null) {
                        arrayList2.add(d2e);
                    }
                }
                return arrayList2;
            default:
                hm9.m("o2e", "loadNetworkStickersSingle: ids=%s", list);
                uqd h = ((k4a) ((pk) o2e.f.get())).K(new au(2, nd7.j(list)), o2e.g).h(new gd1(12, eu.class)).h(new m2e(2)).h(new m2e(3));
                fme fme = (fme) o2e.i.get();
                fme.getClass();
                return new rqd(h.j(new dme(fme, 2, 0)), new k2e(o2e, 2), 2);
        }
    }
}
