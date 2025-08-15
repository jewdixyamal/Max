package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: ec6  reason: default package */
public final class ec6 {
    public final wxc a;
    public final je7 b;
    public final khe c;
    public final khe d;

    public ec6(je7 je7, je7 je72, wxc wxc) {
        this.a = wxc;
        this.b = je7;
        this.c = new khe(new z30(14, je72));
        this.d = new khe(new z30(15, je72));
    }

    public final void a(e52 e52, Collection collection) {
        t5c t5c = (t5c) this.c.getValue();
        t5c.getClass();
        if (t5c == t5c.a) {
            hm9.m0("ec6", "executeByServerIds: reactPermission is disabled", new Object[0]);
        } else if (collection.isEmpty()) {
            hm9.m0("ec6", "messageServerIds are empty!", new Object[0]);
        } else {
            if (e52.b.a == 0) {
                if (!e52.b.f(this.a.a())) {
                    return;
                }
            }
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                us7 us7 = us7.X;
                int size = collection.size();
                String n0 = x53.n0(collection, (String) null, (String) null, (String) null, (m56) null, 63);
                ir6.d(us7, "ec6", "executeByServerIds " + size + " [" + n0 + "]", (Throwable) null);
            }
            try {
                b(e52.a, e52.b.a, new at(2, collection));
            } catch (Throwable th) {
                hm9.p("ec6", "executeByServerIds: call request failure!", th);
            }
        }
    }

    public final void b(long j, long j2, at atVar) {
        khe khe = this.d;
        int intValue = ((Number) khe.getValue()).intValue();
        int intValue2 = ((Number) khe.getValue()).intValue();
        np8.h(intValue, intValue2);
        Iterator Q = np8.Q(atVar.iterator(), intValue, intValue2, false);
        while (Q.hasNext()) {
            List list = (List) Q.next();
            k4a k4a = (k4a) ((pk) this.b.getValue());
            if (k4a.o(j)) {
                k4a.v(k4a, new bf9(((p7b) k4a.y()).a.o(), j, j2, list));
            }
        }
    }
}
