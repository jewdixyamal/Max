package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: eh4  reason: default package */
public final class eh4 {
    public final je7 a;

    public eh4(je7 je7) {
        this.a = je7;
    }

    public final void a(long j, long j2, List list, boolean z) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            pk pkVar = (pk) this.a.getValue();
            List singletonList = Collections.singletonList(new Long(longValue));
            int i = z ? -1 : 0;
            k4a k4a = (k4a) pkVar;
            if (k4a.o(j)) {
                rk2 rk2 = new rk2(((p7b) k4a.y()).a.o(), j, j2, 2, singletonList, ek2.MEMBER, true, i, 0);
                if (i == 0) {
                    k4a.w(k4a, rk2);
                } else {
                    k4a.v(k4a, rk2);
                }
            }
        }
    }
}
