package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: t6d  reason: default package */
public final class t6d implements r6d, px0 {
    public final String a;
    public final pag b;
    public final int c;
    public final List d;
    public final HashSet e;
    public final String[] f;
    public final r6d[] g;
    public final List[] h;
    public final boolean[] i;
    public final Map j;
    public final r6d[] k;
    public final khe l;

    public t6d(String str, pag pag, int i2, List list, bg4 bg4) {
        this.a = str;
        this.b = pag;
        this.c = i2;
        this.d = (List) bg4.b;
        ArrayList arrayList = (ArrayList) bg4.o;
        this.e = x53.B0(arrayList);
        int i3 = 0;
        this.f = (String[]) arrayList.toArray(new String[0]);
        this.g = j1e.j((ArrayList) bg4.X);
        this.h = (List[]) ((ArrayList) bg4.c).toArray(new List[0]);
        ArrayList arrayList2 = (ArrayList) bg4.Y;
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            zArr[i3] = ((Boolean) it.next()).booleanValue();
            i3++;
        }
        this.i = zArr;
        zs zsVar = new zs(2, new ie(1, (Object) this.f));
        ArrayList arrayList3 = new ArrayList(z53.S(zsVar, 10));
        Iterator it2 = zsVar.iterator();
        while (true) {
            ms4 ms4 = (ms4) it2;
            if (ms4.b.hasNext()) {
                yz6 yz6 = (yz6) ms4.next();
                arrayList3.add(new kpa(yz6.b, Integer.valueOf(yz6.a)));
            } else {
                this.j = mz7.c0(arrayList3);
                this.k = j1e.j(list);
                this.l = new khe(new lwa(26, this));
                return;
            }
        }
    }

    public final String a() {
        return this.a;
    }

    public final Set b() {
        return this.e;
    }

    public final boolean c() {
        return false;
    }

    public final int d(String str) {
        Integer num = (Integer) this.j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public final pag e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t6d) {
            r6d r6d = (r6d) obj;
            if (tpa.f(a(), r6d.a()) && Arrays.equals(this.k, ((t6d) obj).k) && f() == r6d.f()) {
                int f2 = f();
                int i2 = 0;
                while (i2 < f2) {
                    if (tpa.f(i(i2).a(), r6d.i(i2).a()) && tpa.f(i(i2).e(), r6d.i(i2).e())) {
                        i2++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int f() {
        return this.c;
    }

    public final String g(int i2) {
        return this.f[i2];
    }

    public final List getAnnotations() {
        return this.d;
    }

    public final List h(int i2) {
        return this.h[i2];
    }

    public final int hashCode() {
        return ((Number) this.l.getValue()).intValue();
    }

    public final r6d i(int i2) {
        return this.g[i2];
    }

    public final boolean isInline() {
        return false;
    }

    public final boolean j(int i2) {
        return this.i[i2];
    }

    public final String toString() {
        return x53.n0(ote.Y(0, this.c), ", ", rh4.m(new StringBuilder(), this.a, '('), ")", new rpc(2, this), 24);
    }
}
