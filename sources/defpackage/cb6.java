package defpackage;

import java.util.Iterator;
import java.util.List;

/* renamed from: cb6  reason: default package */
public final class cb6 {
    public final je7 a;

    public cb6(je7 je7) {
        this.a = je7;
    }

    public final boolean a(e52 e52, List list) {
        long t = ((hyc) ((q33) this.a.getValue())).t();
        if (e52 == null || !e52.b.f(t)) {
            return true;
        }
        if (list.size() > 1) {
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    cu8 cu8 = (cu8) it.next();
                    if (cu8.C0 != null && cu8.A0 == 2) {
                        return true;
                    }
                }
            }
            return false;
        }
        cu8 cu82 = (cu8) x53.i0(list);
        if (cu82 == null) {
            return true;
        }
        return cu82.C0 != null && cu82.A0 == 2;
    }
}
