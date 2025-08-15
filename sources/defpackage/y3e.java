package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: y3e  reason: default package */
public final /* synthetic */ class y3e implements b66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a4e b;
    public final /* synthetic */ List c;

    public /* synthetic */ y3e(a4e a4e, List list, int i) {
        this.a = i;
        this.b = a4e;
        this.c = list;
    }

    public final Object apply(Object obj) {
        List list = this.c;
        a4e a4e = this.b;
        int i = this.a;
        List list2 = (List) obj;
        a4e.getClass();
        switch (i) {
            case 0:
                if (list2.isEmpty()) {
                    return iqd.g(list);
                }
                wq5 a2 = wq5.a(iqd.g(list), a4e.d(list2));
                hm9.j0(Integer.MAX_VALUE, "maxConcurrency");
                lr5 lr5 = new lr5(a2);
                ArrayList arrayList = new ArrayList(list2.size() + list.size());
                return new ar5(lr5, new t66(arrayList), new m2e(1));
            default:
                return new uqd(new ty9(qy9.j(list), new z72(25, list2), 1).v(), new y3e(a4e, list2, 0), 0);
        }
    }
}
