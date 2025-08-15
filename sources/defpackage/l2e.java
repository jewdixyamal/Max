package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: l2e  reason: default package */
public final /* synthetic */ class l2e implements b66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o2e b;
    public final /* synthetic */ List c;

    public /* synthetic */ l2e(o2e o2e, List list, int i) {
        this.a = i;
        this.b = o2e;
        this.c = list;
    }

    public final Object apply(Object obj) {
        List list = this.c;
        o2e o2e = this.b;
        int i = this.a;
        List list2 = (List) obj;
        o2e.getClass();
        switch (i) {
            case 0:
                return new uqd(new ty9(qy9.j(list), new z72(23, list2), 1).v(), new l2e(o2e, list2, 1), 0);
            default:
                if (list2.isEmpty()) {
                    return iqd.g(list);
                }
                wq5 a2 = wq5.a(iqd.g(list), o2e.d(list2));
                hm9.j0(Integer.MAX_VALUE, "maxConcurrency");
                lr5 lr5 = new lr5(a2);
                ArrayList arrayList = new ArrayList();
                return new ar5(lr5, new t66(arrayList), new m2e(1));
        }
    }
}
