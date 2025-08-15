package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: saf  reason: default package */
public final class saf {
    public final ol6 a;
    public final mg4 b;

    public saf(ol6 ol6, mg4 mg4) {
        this.a = ol6;
        this.b = mg4;
    }

    public final List a(List list, m56 m56, m56 m562, m56 m563, sj3 sj3, m56 m564) {
        ol6 ol6 = this.a;
        if (!ol6.b()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object next : list) {
            boolean n = ol6.n(((Number) m56.invoke(next)).longValue());
            if (!n && m563 != null && this.b.a() && m563.invoke(next) != vx8.DELAYED_FIRE_ERROR) {
                arrayList.add(m562.invoke(next));
            }
            if (m564 != null) {
                m564.invoke(next);
            }
            if (n) {
                arrayList2.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            hm9.m("saf", "items for delete not empty, count = " + size, new Object[0]);
            sj3.accept(arrayList);
        }
        return arrayList2;
    }
}
