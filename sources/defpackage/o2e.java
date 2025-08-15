package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: o2e  reason: default package */
public final class o2e implements e4e {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final rm4 c;
    public final m7b d;
    public final rm4 e;
    public final rm4 f;
    public final ztc g;
    public final ztc h;
    public final rm4 i;
    public final rm4 j;
    public iq1 k;
    public final ml0 l;

    public o2e(rm4 rm4, m7b m7b, rm4 rm42, rm4 rm43, ztc ztc, ztc ztc2, rm4 rm44, rm4 rm45) {
        new ConcurrentHashMap();
        this.l = ml0.z(Collections.emptyList());
        this.c = rm4;
        this.d = m7b;
        this.e = rm42;
        this.f = rm43;
        this.g = ztc;
        this.h = ztc2;
        this.i = rm44;
        this.j = rm45;
    }

    public final e0a a() {
        return new e0a(((x9c) this.j.get()).b().a(Collections.singletonList(t9c.STICKER)), new k2e(this, 0), 3);
    }

    public final uqd b(List list) {
        hm9.m("o2e", "getStickersByIds: ids count=%d", Integer.valueOf(list.size()));
        return new q28(new uqd(new e0a(new ty9(qy9.j(this.a.entrySet()), new z72(24, list), 1), new p4c(28), 3).v(), new l2e(this, list, 0), 0), new jj9(2), 3).w(new eme(list, new p4c(26)));
    }

    public final ArrayList c(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Long l2 = (Long) it.next();
            l2.getClass();
            if (((d2e) this.a.get(l2)) == null) {
                arrayList.add(l2);
            }
        }
        return arrayList;
    }

    public final drd d(List list) {
        hm9.m("o2e", "loadNetworkStickers: %s", list);
        nd7.O(list);
        q28 f2 = qy9.j(nd7.T(list)).f(new k2e(this, 1));
        ArrayList arrayList = new ArrayList();
        return new yy9(f2, new t66(arrayList), new m2e(0)).m(this.g);
    }

    public final synchronized void e(List list) {
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                d2e d2e = (d2e) it.next();
                this.a.put(Long.valueOf(d2e.a), d2e);
            }
            cqc.a(new p00(this, 12, list), this.h, (f6) null, new m2e(4), (ztc) null);
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final synchronized void f() {
        if (!pag.K(((kk5) ((zi5) this.e.get())).p(), this.b)) {
            hm9.m("o2e", "Failed to store initial showcase", new Object[0]);
        }
    }

    public final void g(List list) {
        ConcurrentHashMap concurrentHashMap;
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            concurrentHashMap = this.b;
            if (!hasNext) {
                break;
            }
            r0d r0d = (r0d) it.next();
            Iterator it2 = concurrentHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                if (((String) ((Map.Entry) it2.next()).getKey()).equals(r0d.b)) {
                    it2.remove();
                }
            }
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            r0d r0d2 = (r0d) it3.next();
            int i2 = r0d2.a;
            String str = r0d2.b;
            if (i2 == 3) {
                if (!((d4e) r0d2).c.isEmpty()) {
                    concurrentHashMap.put(str, r0d2);
                }
            } else if (i2 == 2 && !((r5e) r0d2).c.isEmpty()) {
                concurrentHashMap.put(str, r0d2);
            }
        }
        this.l.e(concurrentHashMap.values());
    }

    public final void h(List list) {
        hm9.m("o2e", "Update recent section", new Object[0]);
        int i2 = 0;
        while (i2 < list.size()) {
            r0d r0d = (r0d) list.get(i2);
            if (!"RECENT".equals(r0d.b) || r0d.a != 4) {
                i2++;
            } else {
                cqc.b(this.k);
                x9c x9c = (x9c) this.j.get();
                x9c.getClass();
                List list2 = ((y9c) r0d).c;
                hm9.m("x9c", "Replace recents. New size = %d", Integer.valueOf(list2.size()));
                p9c b2 = x9c.b();
                za3 k2 = new qa3(b2.b(), 2, new o9c(b2, (ArrayList) list2, 0)).k(this.h);
                iq1 iq1 = new iq1(new m2e(7), 0, new fa4(9));
                k2.i(iq1);
                this.k = iq1;
                return;
            }
        }
    }
}
