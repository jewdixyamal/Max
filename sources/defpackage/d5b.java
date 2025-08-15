package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: d5b  reason: default package */
public class d5b implements r6d, px0 {
    public final String a;
    public final ga6 b;
    public final int c;
    public int d = -1;
    public final String[] e;
    public final List[] f;
    public final boolean[] g;
    public Map h;
    public final je7 i;
    public final je7 j;
    public final je7 k;

    public d5b(String str, ga6 ga6, int i2) {
        this.a = str;
        this.b = ga6;
        this.c = i2;
        String[] strArr = new String[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i4 = this.c;
        this.f = new List[i4];
        this.g = new boolean[i4];
        this.h = oz4.a;
        this.i = tu0.r(2, new c5b(this, 0));
        this.j = tu0.r(2, new c5b(this, 1));
        this.k = tu0.r(2, new c5b(this, 2));
    }

    public final String a() {
        return this.a;
    }

    public final Set b() {
        return this.h.keySet();
    }

    public final boolean c() {
        return false;
    }

    public final int d(String str) {
        Integer num = (Integer) this.h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public pag e() {
        return nae.e;
    }

    public boolean equals(Object obj) {
        int i2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof d5b) {
            r6d r6d = (r6d) obj;
            if (tpa.f(this.a, r6d.a()) && Arrays.equals((r6d[]) this.j.getValue(), (r6d[]) ((d5b) obj).j.getValue()) && (i2 = this.c) == r6d.f()) {
                int i3 = 0;
                while (i3 < i2) {
                    if (tpa.f(i(i3).a(), r6d.i(i3).a()) && tpa.f(i(i3).e(), r6d.i(i3).e())) {
                        i3++;
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
        return this.e[i2];
    }

    public final List getAnnotations() {
        return nz4.a;
    }

    public final List h(int i2) {
        List list = this.f[i2];
        return list == null ? nz4.a : list;
    }

    public int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    public r6d i(int i2) {
        return ((cc7[]) this.i.getValue())[i2].d();
    }

    public boolean isInline() {
        return false;
    }

    public final boolean j(int i2) {
        return this.g[i2];
    }

    public final void k(String str, boolean z) {
        int i2 = this.d + 1;
        this.d = i2;
        String[] strArr = this.e;
        strArr[i2] = str;
        this.g[i2] = z;
        this.f[i2] = null;
        if (i2 == this.c - 1) {
            HashMap hashMap = new HashMap();
            int length = strArr.length;
            for (int i3 = 0; i3 < length; i3++) {
                hashMap.put(strArr[i3], Integer.valueOf(i3));
            }
            this.h = hashMap;
        }
    }

    public String toString() {
        return x53.n0(ote.Y(0, this.c), ", ", rh4.m(new StringBuilder(), this.a, '('), ")", new wz7(21, this), 24);
    }
}
