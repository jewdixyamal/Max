package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: bj6  reason: default package */
public final class bj6 {
    public final ArrayList a;

    public bj6(List list) {
        this.a = new ArrayList(list);
    }

    public static void i(bj6 bj6) {
        ArrayList arrayList = new ArrayList();
        Iterator it = bj6.a.iterator();
        while (it.hasNext()) {
            arrayList.add(((vrb) it.next()).getClass().getSimpleName());
        }
        String.join(" | ", arrayList);
    }

    public void a(String str, String str2) {
        ngg.l(str);
        ngg.n(str2, str);
        b(str, str2);
    }

    public void b(String str, String str2) {
        ArrayList arrayList = this.a;
        arrayList.add(str);
        arrayList.add(w9e.b1(str2).toString());
    }

    public cj6 c() {
        Object[] array = this.a.toArray(new String[0]);
        if (array != null) {
            return new cj6((String[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public boolean d(Class cls) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(((vrb) it.next()).getClass())) {
                return true;
            }
        }
        return false;
    }

    public vrb e(Class cls) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            vrb vrb = (vrb) it.next();
            if (vrb.getClass() == cls) {
                return vrb;
            }
        }
        return null;
    }

    public ArrayList f(Class cls) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            vrb vrb = (vrb) it.next();
            if (cls.isAssignableFrom(vrb.getClass())) {
                arrayList.add(vrb);
            }
        }
        return arrayList;
    }

    public void g(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i < arrayList.size()) {
                if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                    arrayList.remove(i);
                    arrayList.remove(i);
                    i -= 2;
                }
                i += 2;
            } else {
                return;
            }
        }
    }

    public void h(String str, String str2) {
        ngg.l(str);
        ngg.n(str2, str);
        g(str);
        b(str, str2);
    }

    public bj6() {
        this.a = new ArrayList(20);
    }
}
