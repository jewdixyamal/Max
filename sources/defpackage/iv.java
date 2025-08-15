package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* renamed from: iv  reason: default package */
public final class iv {
    public static final k40 h = new k40(1);
    public final xl7 a;
    public final qz7 b;
    public final k40 c;
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public List e;
    public List f = Collections.emptyList();
    public int g;

    public iv(xl7 xl7, qz7 qz7) {
        this.a = xl7;
        this.b = qz7;
        this.c = h;
    }

    public final void a(List list, Runnable runnable) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((gl7) it.next()).a.D(list, this.f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void b(List list, Runnable runnable) {
        int i = this.g + 1;
        this.g = i;
        List list2 = this.e;
        if (list != list2) {
            List list3 = this.f;
            xl7 xl7 = this.a;
            if (list == null) {
                int size = list2.size();
                this.e = null;
                this.f = Collections.emptyList();
                xl7.m(0, size);
                a(list3, runnable);
            } else if (list2 == null) {
                this.e = list;
                this.f = Collections.unmodifiableList(list);
                xl7.e(0, list.size());
                a(list3, runnable);
            } else {
                ((Executor) this.b.b).execute(new hv(this, list2, list, i, runnable));
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }
}
