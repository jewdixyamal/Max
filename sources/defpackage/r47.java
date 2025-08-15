package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: r47  reason: default package */
public final class r47 {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;

    public r47(je7 je7, je7 je72, je7 je73, je7 je74) {
        this.a = je7;
        this.b = je72;
        this.c = je73;
        this.d = je74;
    }

    public final void a(Collection collection) {
        Collection collection2 = collection;
        if (!collection.isEmpty()) {
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                ir6.d(us7.X, "r47", zr6.h(collection.size(), "invalidateChatsInternal, contactsIds.size() = "), (Throwable) null);
            }
            List<e52> E = ((p82) this.a.getValue()).E(p82.I);
            t6b t6b = (t6b) this.c.getValue();
            p82 p82 = (p82) this.a.getValue();
            t6b.getClass();
            xs xsVar = new xs(collection2);
            hm9.m("t6b", "invalidatePreprocessedDataByContacts, contactIds = %d", Integer.valueOf(xsVar.c));
            ArrayList arrayList = new ArrayList();
            xs xsVar2 = new xs(0);
            for (Map.Entry value : t6b.c.entrySet()) {
                u6b u6b = (u6b) value.getValue();
                boolean contains = xsVar.contains(Long.valueOf(u6b.d.Y));
                cu8 cu8 = u6b.d;
                if (contains) {
                    arrayList.add(cu8);
                    xsVar2.add(Long.valueOf(cu8.b));
                }
                cu8 cu82 = cu8.C0;
                if (cu82 != null && xsVar.contains(Long.valueOf(cu82.Y))) {
                    arrayList.add(cu8);
                    xsVar2.add(Long.valueOf(cu8.b));
                }
                q10 f = cu8.f();
                if (f != null) {
                    if (!xsVar.contains(Long.valueOf(f.b))) {
                        Iterator it = f.c.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (xsVar.contains((Long) it.next())) {
                                    arrayList.add(cu8);
                                    xsVar2.add(Long.valueOf(cu8.b));
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    } else {
                        arrayList.add(cu8);
                        xsVar2.add(Long.valueOf(cu8.b));
                    }
                }
            }
            hm9.m("t6b", "invalidated messages count = %d", Integer.valueOf(arrayList.size()));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                cu8 cu83 = (cu8) it2.next();
                e52 C = p82.C(cu83.t0);
                if (C == null) {
                    hm9.m0("t6b", "don't create and put preprocessed data, because chat is null", new Object[0]);
                } else {
                    t6b.b(C, cu83);
                    long j = cu83.t0;
                    long j2 = cu83.b;
                    l6f l6f = r11;
                    l6f l6f2 = new l6f(j, j2, 0);
                    t6b = t6b;
                    t6b.a.c(l6f);
                }
            }
            Set unmodifiableSet = Collections.unmodifiableSet(xsVar2);
            gi9 gi9 = new gi9((Object) null);
            for (e52 e52 : E) {
                ArrayList j3 = e52.j();
                xs xsVar3 = new xs(0);
                Iterator it3 = j3.iterator();
                while (it3.hasNext()) {
                    xsVar3.add(Long.valueOf(((uj3) it3.next()).n()));
                }
                if (!Collections.disjoint(collection2, xsVar3)) {
                    gi9.a(e52.b.a);
                    e52.o0((el3) this.b.getValue());
                }
                es8 es8 = e52.c;
                if (es8 != null && unmodifiableSet.contains(Long.valueOf(es8.a.b))) {
                    ((p82) this.a.getValue()).k0(e52.a, e52.c.a, true);
                    gi9.a(e52.b.a);
                }
            }
            if (gi9.j()) {
                ((cea) this.d.getValue()).g(gi9);
            }
        }
    }
}
