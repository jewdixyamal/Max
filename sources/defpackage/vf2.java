package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import ru.ok.messages.media.attaches.ActAttachesView;

/* renamed from: vf2  reason: default package */
public final /* synthetic */ class vf2 implements qj3, grd {
    public final /* synthetic */ zf2 a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ vf2(zf2 zf2, boolean z) {
        this.a = zf2;
        this.b = z;
    }

    public void accept(Object obj) {
        wf2 e;
        d92 d92;
        d92 a2;
        p82 p82;
        List list = (List) obj;
        zf2 zf2 = this.a;
        zf2.getClass();
        hm9.m("zf2", "onLoad: count " + list.size(), new Object[0]);
        boolean z = this.b;
        if (z) {
            zf2.k = true;
            zf2.d.clear();
            zf2.e.clear();
        }
        ArrayList a3 = zf2.a(list, false);
        for (yf2 yf2 : zf2.o) {
            if (yf2 != null) {
                ((ActAttachesView) yf2).m0(a3);
            }
        }
        long j = zf2.a;
        p82 p822 = zf2.q;
        e52 C = p822.C(j);
        if (C != null) {
            k92 k92 = C.b;
            ArrayList d = k92.n.d(mg4.REGULAR);
            Set set = zf2.g;
            if (!p82.L(k92, set) || (d92 = p82.I(k92, set).a) == null) {
                d92 = null;
            }
            if (d92 == null) {
                d92 d922 = (d92) hm9.w(d).b;
                if (d922 != null) {
                    p822.h(j, false, new u00((Object) p822, (Object) set, (Object) d922, 3));
                }
            } else {
                Iterator it = d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    d92 d923 = (d92) it.next();
                    a2 = d92.c().a();
                    long j2 = d923.a;
                    boolean K = hm9.K(j2, a2);
                    long j3 = d923.b;
                    if (K) {
                        p82 = p822;
                        if (j3 > a2.b) {
                            l7 c = a2.c();
                            c.b(j3);
                            a2 = c.a();
                        }
                    } else {
                        p82 = p822;
                    }
                    if (hm9.K(j3, a2) && j2 < a2.a) {
                        l7 c2 = a2.c();
                        if (j2 == -1) {
                            hm9.l0("Chunk.Builder", "", new IllegalStateException("start time is -1"));
                        }
                        c2.b = j2;
                        a2 = c2.a();
                    }
                    if (a2.a == d92.a && a2.b == d92.b) {
                        p822 = p82;
                    } else {
                        p822 = p82;
                        p822.h(j, false, new u00((Object) p822, (Object) set, (Object) a2, 3));
                    }
                }
                p822 = p82;
                p822.h(j, false, new u00((Object) p822, (Object) set, (Object) a2, 3));
            }
        }
        if (!z) {
            zf2.b(true);
            return;
        }
        e52 C2 = p822.C(j);
        if (C2 != null && C2.b.g() && (e = zf2.e(false)) != null) {
            zf2.f(e);
        }
    }

    public void j(nqd nqd) {
        zf2 zf2 = this.a;
        zf2.getClass();
        List<es8> emptyList = Collections.emptyList();
        e52 C = zf2.q.C(zf2.a);
        if (C != null) {
            au8 au8 = zf2.r;
            boolean z = this.b;
            ge2 ge2 = zf2.s;
            if (z) {
                ge2.getClass();
                emptyList = ge2.f.b(((k24) au8.a).c.l(zf2.a, Long.MAX_VALUE, zf2.f, (Integer) null, true));
            } else {
                long j = zf2.b;
                long j2 = 0;
                if (j > 0) {
                    cu8 q = au8.q(j);
                    if (q != null) {
                        j2 = q.o;
                    }
                } else {
                    es8 es8 = C.c;
                    j2 = es8 == null ? Long.MAX_VALUE : es8.a.o;
                }
                ge2.getClass();
                long j3 = zf2.a;
                vlc vlc = ((k24) au8.a).c;
                Set set = zf2.f;
                ArrayList l = vlc.l(j3, j2, set, 40, true);
                ArrayList l2 = ((k24) au8.a).c.l(j3, j2, set, 40, false);
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(l);
                arrayList.addAll(l2);
                TreeSet treeSet = new TreeSet(new v00(11));
                treeSet.addAll(arrayList);
                arrayList.clear();
                arrayList.addAll(treeSet);
                Collections.sort(arrayList, new v00(12));
                emptyList = !arrayList.isEmpty() ? ge2.f.b(arrayList) : Collections.emptyList();
            }
        }
        for (es8 es82 : emptyList) {
            zf2.t.e(es82.a);
        }
        nqd.a(emptyList);
    }
}
