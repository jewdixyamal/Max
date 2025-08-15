package defpackage;

import android.util.Pair;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: a5b  reason: default package */
public final class a5b extends lue {
    public final int X;
    public final int[] Y;
    public final int[] Z;
    public final int b;
    public final cod c;
    public final int o;
    public final lue[] s0;
    public final Object[] t0;
    public final HashMap u0 = new HashMap();

    public a5b(Collection collection, cod cod) {
        this.c = cod;
        this.b = cod.b.length;
        int size = collection.size();
        this.Y = new int[size];
        this.Z = new int[size];
        this.s0 = new lue[size];
        this.t0 = new Object[size];
        Iterator it = collection.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            jk8 jk8 = (jk8) it.next();
            this.s0[i3] = jk8.b();
            this.Z[i3] = i;
            this.Y[i3] = i2;
            i += this.s0[i3].p();
            i2 += this.s0[i3].i();
            this.t0[i3] = jk8.a();
            this.u0.put(this.t0[i3], Integer.valueOf(i3));
            i3++;
        }
        this.o = i;
        this.X = i2;
    }

    public final int a(boolean z) {
        if (this.b == 0) {
            return -1;
        }
        int i = 0;
        if (z) {
            int[] iArr = this.c.b;
            i = iArr.length > 0 ? iArr[0] : -1;
        }
        do {
            lue[] lueArr = this.s0;
            if (lueArr[i].q()) {
                i = r(i, z);
            } else {
                return lueArr[i].a(z) + this.Z[i];
            }
        } while (i != -1);
        return -1;
    }

    public final int b(Object obj) {
        int b2;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.u0.get(obj2);
        int intValue = num == null ? -1 : num.intValue();
        if (intValue == -1 || (b2 = this.s0[intValue].b(obj3)) == -1) {
            return -1;
        }
        return this.Y[intValue] + b2;
    }

    public final int c(boolean z) {
        int i;
        int i2 = this.b;
        if (i2 == 0) {
            return -1;
        }
        if (z) {
            int[] iArr = this.c.b;
            i = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
        } else {
            i = i2 - 1;
        }
        do {
            lue[] lueArr = this.s0;
            if (lueArr[i].q()) {
                i = s(i, z);
            } else {
                return lueArr[i].c(z) + this.Z[i];
            }
        } while (i != -1);
        return -1;
    }

    public final int e(int i, int i2, boolean z) {
        int[] iArr = this.Z;
        int c2 = maf.c(i + 1, iArr);
        int i3 = iArr[c2];
        lue[] lueArr = this.s0;
        int e = lueArr[c2].e(i - i3, i2 == 2 ? 0 : i2, z);
        if (e != -1) {
            return i3 + e;
        }
        int r = r(c2, z);
        while (r != -1 && lueArr[r].q()) {
            r = r(r, z);
        }
        if (r != -1) {
            return lueArr[r].a(z) + iArr[r];
        } else if (i2 == 2) {
            return a(z);
        } else {
            return -1;
        }
    }

    public final gue g(int i, gue gue, boolean z) {
        int[] iArr = this.Y;
        int c2 = maf.c(i + 1, iArr);
        int i2 = this.Z[c2];
        this.s0[c2].g(i - iArr[c2], gue, z);
        gue.c += i2;
        if (z) {
            Object obj = this.t0[c2];
            Object obj2 = gue.b;
            obj2.getClass();
            gue.b = Pair.create(obj, obj2);
        }
        return gue;
    }

    public final gue h(Object obj, gue gue) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.u0.get(obj2);
        int intValue = num == null ? -1 : num.intValue();
        int i = this.Z[intValue];
        this.s0[intValue].h(obj3, gue);
        gue.c += i;
        gue.b = obj;
        return gue;
    }

    public final int i() {
        return this.X;
    }

    public final int l(int i, int i2, boolean z) {
        int[] iArr = this.Z;
        int c2 = maf.c(i + 1, iArr);
        int i3 = iArr[c2];
        lue[] lueArr = this.s0;
        int l = lueArr[c2].l(i - i3, i2 == 2 ? 0 : i2, z);
        if (l != -1) {
            return i3 + l;
        }
        int s = s(c2, z);
        while (s != -1 && lueArr[s].q()) {
            s = s(s, z);
        }
        if (s != -1) {
            return lueArr[s].c(z) + iArr[s];
        } else if (i2 == 2) {
            return c(z);
        } else {
            return -1;
        }
    }

    public final Object m(int i) {
        int[] iArr = this.Y;
        int c2 = maf.c(i + 1, iArr);
        return Pair.create(this.t0[c2], this.s0[c2].m(i - iArr[c2]));
    }

    public final jue n(int i, jue jue, long j) {
        int[] iArr = this.Z;
        int c2 = maf.c(i + 1, iArr);
        int i2 = iArr[c2];
        int i3 = this.Y[c2];
        this.s0[c2].n(i - i2, jue, j);
        Object obj = this.t0[c2];
        if (!jue.C0.equals(jue.a)) {
            obj = Pair.create(obj, jue.a);
        }
        jue.a = obj;
        jue.z0 += i3;
        jue.A0 += i3;
        return jue;
    }

    public final int p() {
        return this.o;
    }

    public final int r(int i, boolean z) {
        if (z) {
            cod cod = this.c;
            int i2 = cod.c[i] + 1;
            int[] iArr = cod.b;
            if (i2 < iArr.length) {
                return iArr[i2];
            }
            return -1;
        } else if (i < this.b - 1) {
            return i + 1;
        } else {
            return -1;
        }
    }

    public final int s(int i, boolean z) {
        if (z) {
            cod cod = this.c;
            int i2 = cod.c[i] - 1;
            if (i2 >= 0) {
                return cod.b[i2];
            }
            return -1;
        } else if (i > 0) {
            return i - 1;
        } else {
            return -1;
        }
    }
}
