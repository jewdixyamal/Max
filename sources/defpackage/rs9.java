package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: rs9  reason: default package */
public final class rs9 {
    public final av0 a;
    public final rm4 b;
    public final rm4 c;
    public final rm4 d;

    public rs9(av0 av0, rm4 rm4, rm4 rm42, rm4 rm43) {
        this.a = av0;
        this.b = rm4;
        this.c = rm42;
        this.d = rm43;
    }

    public static void a(e52 e52, cea cea) {
        k92 k92 = e52.b;
        int i = k92.m;
        long j = k92.a;
        if (i > 0) {
            cea.f(j);
        } else {
            cea.a(j);
        }
    }

    public final void b(e52 e52, Collection collection, mg4 mg4) {
        hm9.m("rs9", "onNotifMsgDelete, %s", mg4.name());
        if (e52 != null) {
            boolean a2 = mg4.a();
            av0 av0 = this.a;
            rm4 rm4 = this.c;
            long j = e52.a;
            if (a2) {
                ArrayList k = ((au8) rm4.get()).k(j, collection);
                ArrayList arrayList = new ArrayList(k.size());
                Iterator it = k.iterator();
                while (it.hasNext()) {
                    try {
                        arrayList.add(Long.valueOf(((cu8) it.next()).b));
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
                ((k24) ((au8) rm4.get()).a).c.d().o(j, arrayList, vx8.DELETED);
                av0.c(new re9(j, arrayList, mg4));
                return;
            }
            ArrayList k2 = ((au8) rm4.get()).k(j, collection);
            ArrayList arrayList2 = new ArrayList(k2.size());
            Iterator it2 = k2.iterator();
            while (it2.hasNext()) {
                try {
                    arrayList2.add(Long.valueOf(((cu8) it2.next()).b));
                } catch (Throwable th2) {
                    throw new RuntimeException(th2);
                }
            }
            ((au8) rm4.get()).c(j, arrayList2);
            if (mg4.b()) {
                ((p82) this.b.get()).w(j);
            }
            av0.c(new re9(j, arrayList2, mg4));
            if (mg4.b()) {
                a(e52, (cea) this.d.get());
            }
        }
    }
}
