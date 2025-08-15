package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: vzc  reason: default package */
public final class vzc implements xzc {
    public final p82 a;
    public final el3 b;
    public final oq3 c;
    public final b0d d;
    public final boolean e;

    public vzc(p82 p82, el3 el3, oq3 oq3, b0d b0d, boolean z) {
        this.a = p82;
        this.b = el3;
        this.c = oq3;
        this.d = b0d;
        this.e = z;
    }

    public final List a(String str) {
        List list;
        b0d b0d;
        gi9 gi9 = new gi9((Object) null);
        boolean z = this.e;
        p82 p82 = this.a;
        if (z) {
            v00 v00 = p82.I;
            ArrayList D = p82.D(p82.M, true, (c7b) null);
            Collections.sort(D, v00);
            list = Collections.unmodifiableList(D);
        } else {
            list = p82.E(p82.I);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            b0d = this.d;
            if (!hasNext) {
                break;
            }
            Object next = it.next();
            if (b0d.f((e52) next, str)) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() > 1) {
            c63.U(arrayList, new ky6(12));
        }
        ArrayList arrayList2 = new ArrayList(z53.S(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            e52 e52 = (e52) it2.next();
            uj3 l = e52.l();
            if (l != null) {
                gi9.a(l.n());
            }
            arrayList2.add(b0d.a(e52, str));
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        List k = this.b.k();
        ArrayList arrayList4 = new ArrayList();
        for (Object next2 : k) {
            uj3 uj3 = (uj3) next2;
            if (!gi9.d(uj3.n()) && b0d.g(uj3, str)) {
                arrayList4.add(next2);
            }
        }
        oq3 oq3 = this.c;
        oq3.getClass();
        c63.U(arrayList4, new ca3(2, oq3));
        ArrayList arrayList5 = new ArrayList(z53.S(arrayList4, 10));
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            arrayList5.add(b0d.b((uj3) it3.next(), str));
        }
        arrayList3.addAll(arrayList5);
        return arrayList3;
    }
}
