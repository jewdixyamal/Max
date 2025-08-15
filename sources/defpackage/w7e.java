package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: w7e  reason: default package */
public final class w7e extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ b8e Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w7e(b8e b8e, Continuation continuation) {
        super(2, continuation);
        this.Y = b8e;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((w7e) n((j7e) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        w7e w7e = new w7e(this.Y, continuation);
        w7e.X = obj;
        return w7e;
    }

    public final Object o(Object obj) {
        List list;
        List<m3e> list2;
        ynd ynd;
        w3e w3e;
        int i;
        q0e q0e;
        od2.a0(obj);
        j7e j7e = (j7e) this.X;
        List list3 = j7e.a;
        if (!(list3 == null || (list = j7e.b) == null || (list2 = j7e.c) == null || (ynd = j7e.d) == null)) {
            bc7[] bc7Arr = b8e.B0;
            b8e b8e = this.Y;
            b8e.getClass();
            ArrayList arrayList = new ArrayList();
            boolean z = !list3.isEmpty();
            q0e q0e2 = b8e.w0;
            if (z) {
                w3e = new w3e(-9223372036854775807L, new eqe(kca.l), (String) null, Integer.valueOf(woc.d2), b8e.s(-9223372036854775807L, list3), 1, ((k7e) q0e2.getValue()).a == 0, false, 132);
            } else {
                w3e = null;
            }
            w3e w3e2 = list.isEmpty() ^ true ? new w3e(-9223372036854775806L, new eqe(kca.j), (String) null, Integer.valueOf(woc.K), b8e.s(-9223372036854775806L, list), 2, w3e == null, false, 132) : null;
            boolean z2 = w3e == null && w3e2 == null;
            List list4 = ynd.a;
            w3e w3e3 = list4.isEmpty() ^ true ? new w3e(-9223372036854775805L, new eqe(kca.k), (String) null, Integer.valueOf(ica.e), b8e.s(-9223372036854775805L, list4), 3, z2, false, 132) : null;
            List y0 = x53.y0(ynd.b, 100);
            ArrayList arrayList2 = new ArrayList();
            for (Object next : y0) {
                m3e m3e = (m3e) next;
                if (!list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        q0e = q0e2;
                        if (m3e.a == ((m3e) it.next()).a) {
                            break;
                        }
                        q0e2 = q0e;
                    }
                    q0e2 = q0e;
                }
                q0e = q0e2;
                arrayList2.add(next);
                q0e2 = q0e;
            }
            q0e q0e3 = q0e2;
            kl7 l = j1e.l();
            l.add(ob5.a);
            if (w3e != null) {
                b8e.q(l, w3e, arrayList);
            }
            if (w3e2 != null) {
                b8e.q(l, w3e2, arrayList);
            }
            if (w3e3 != null) {
                b8e.q(l, w3e3, arrayList);
            }
            for (m3e r : list2) {
                b8e.q(l, b8e.r(r, 4), arrayList);
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                w3e r2 = b8e.r((m3e) it2.next(), 5);
                arrayList.add(new e02(r2.a, r2));
                l.add(r2);
            }
            kl7 d = j1e.d(l);
            hm9.m(b8e.class.getName(), "stickers loaded, sets:" + arrayList.size() + ",content:" + d.getSize(), new Object[0]);
            l7e l7e = new l7e(arrayList, d);
            q0e q0e4 = b8e.t0;
            q0e4.m((Object) null, l7e);
            long andSet = b8e.v0.getAndSet(0);
            if (andSet > 0) {
                Iterator it3 = ((l7e) q0e4.getValue()).a.iterator();
                int i2 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        i = 1;
                        i2 = -1;
                        break;
                    } else if (((e02) it3.next()).b.a == andSet) {
                        i = 1;
                        break;
                    } else {
                        i2++;
                    }
                }
                int i3 = i2 - i;
                q0e3.m((Object) null, new k7e(andSet, 0, i3 < 0 ? 0 : i3, 2));
                b8e.t(andSet, (m56) null);
            }
        }
        return e5f.a;
    }
}
