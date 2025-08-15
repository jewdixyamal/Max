package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;

/* renamed from: gn3  reason: default package */
public final class gn3 extends ol implements lme {
    public final int X = 40;
    public final int o;

    public gn3(long j, int i) {
        super(j);
        this.o = i;
    }

    public final void e(gle gle) {
        List<wm3> list;
        List list2;
        List list3 = ((hn3) gle).c;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object next : list3) {
                try {
                    if (((wm3) next) != um3.A0) {
                        arrayList.add(next);
                    }
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
            list = arrayList;
        } else {
            list = Collections.emptyList();
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (wm3 wm3 : list) {
            if (n().g(wm3.a)) {
                arrayList2.add(wm3);
            } else {
                arrayList3.add(wm3);
            }
        }
        n().t(arrayList2, ol3.a);
        n().t(arrayList3, ol3.b);
        av0 l = l();
        if (list.isEmpty()) {
            list2 = nz4.a;
        } else {
            ArrayList arrayList4 = new ArrayList(list.size());
            for (wm3 wm32 : list) {
                try {
                    arrayList4.add(Long.valueOf(wm32.a));
                } catch (Throwable th2) {
                    throw new RuntimeException(th2);
                }
            }
            list2 = arrayList4;
        }
        l.c(new kn3(this.o, this.a, list2));
    }

    public final void g(pke pke) {
        boolean z = pke instanceof gke;
        long j = this.a;
        if (z) {
            l().c(new oi0(j, pke));
            return;
        }
        l().c(new kn3(this.o, j, nz4.a));
    }

    public final dle i() {
        tq2 tq2 = new tq2((sla) null, 7);
        tq2.p("status", "BLOCKED");
        int i = this.o;
        if (i > 0) {
            tq2.e(i, "from");
        }
        int i2 = this.X;
        if (i2 > 0) {
            tq2.e(i2, NewHtcHomeBadger.COUNT);
        }
        return tq2;
    }
}
