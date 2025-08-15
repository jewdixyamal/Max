package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: o5g  reason: default package */
public final class o5g {
    public static int f;
    public ArrayList a;
    public int b;
    public int c;
    public ArrayList d;
    public int e;

    public final void a(ArrayList arrayList) {
        int size = this.a.size();
        if (this.e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                o5g o5g = (o5g) arrayList.get(i);
                if (this.e == o5g.b) {
                    c(this.c, o5g);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(zh7 zh7, int i) {
        int n;
        int n2;
        ArrayList arrayList = this.a;
        if (arrayList.size() == 0) {
            return 0;
        }
        ij3 ij3 = (ij3) ((hj3) arrayList.get(0)).T;
        zh7.t();
        ij3.b(zh7, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((hj3) arrayList.get(i2)).b(zh7, false);
        }
        if (i == 0 && ij3.z0 > 0) {
            i24.a(ij3, zh7, arrayList, 0);
        }
        if (i == 1 && ij3.A0 > 0) {
            i24.a(ij3, zh7, arrayList, 1);
        }
        try {
            zh7.p();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            hj3 hj3 = (hj3) arrayList.get(i3);
            Object obj = new Object();
            new WeakReference(hj3);
            zh7.n(hj3.I);
            zh7.n(hj3.J);
            zh7.n(hj3.K);
            zh7.n(hj3.L);
            zh7.n(hj3.M);
            this.d.add(obj);
        }
        if (i == 0) {
            n = zh7.n(ij3.I);
            n2 = zh7.n(ij3.K);
            zh7.t();
        } else {
            n = zh7.n(ij3.J);
            n2 = zh7.n(ij3.L);
            zh7.t();
        }
        return n2 - n;
    }

    public final void c(int i, o5g o5g) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            hj3 hj3 = (hj3) it.next();
            ArrayList arrayList = o5g.a;
            if (!arrayList.contains(hj3)) {
                arrayList.add(hj3);
            }
            int i2 = o5g.b;
            if (i == 0) {
                hj3.n0 = i2;
            } else {
                hj3.o0 = i2;
            }
        }
        this.e = o5g.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        String j = zr6.j(sb, this.b, "] <");
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            StringBuilder o = rh4.o(j, " ");
            o.append(((hj3) it.next()).h0);
            j = o.toString();
        }
        return au1.g(j, " >");
    }
}
