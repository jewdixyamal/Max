package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: qi3  reason: default package */
public abstract class qi3 {
    public final ej3 a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public Object d;
    public adb e;

    public qi3(ej3 ej3) {
        this.a = ej3;
    }

    public abstract boolean a(h8g h8g);

    public abstract boolean b(Object obj);

    public final void c(Iterable iterable) {
        this.b.clear();
        this.c.clear();
        ArrayList arrayList = this.b;
        for (Object next : iterable) {
            if (a((h8g) next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = this.b;
        ArrayList arrayList3 = this.c;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((h8g) it.next()).a);
        }
        if (this.b.isEmpty()) {
            this.a.n(this);
        } else {
            ej3 ej3 = this.a;
            synchronized (ej3.c) {
                try {
                    if (((LinkedHashSet) ej3.X).add(this)) {
                        if (((LinkedHashSet) ej3.X).size() == 1) {
                            ej3.o = ej3.i();
                            a14 u = a14.u();
                            String str = fj3.a;
                            u.n(str, ej3.getClass().getSimpleName() + ": initial state = " + ej3.o);
                            ej3.r();
                        }
                        Object obj = ej3.o;
                        this.d = obj;
                        d(this.e, obj);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d(this.e, this.d);
    }

    public final void d(adb adb, Object obj) {
        if (!this.b.isEmpty() && adb != null) {
            if (obj == null || b(obj)) {
                ArrayList arrayList = this.b;
                synchronized (adb.c) {
                    e7g e7g = (e7g) adb.a;
                    if (e7g != null) {
                        e7g.a(arrayList);
                    }
                }
                return;
            }
            ArrayList arrayList2 = this.b;
            synchronized (adb.c) {
                try {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (adb.b(((h8g) next).a)) {
                            arrayList3.add(next);
                        }
                    }
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        a14 u = a14.u();
                        String str = f7g.a;
                        u.n(str, "Constraints met for " + ((h8g) it2.next()));
                    }
                    e7g e7g2 = (e7g) adb.a;
                    if (e7g2 != null) {
                        e7g2.f(arrayList3);
                    }
                } finally {
                }
            }
        }
    }
}
