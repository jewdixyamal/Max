package defpackage;

import android.util.Pair;

/* renamed from: lue  reason: default package */
public abstract class lue implements su0 {
    public static final eue a = new Object();

    public int a(boolean z) {
        return q() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z) {
        if (q()) {
            return -1;
        }
        return p() - 1;
    }

    public final int d(int i, gue gue, jue jue, int i2, boolean z) {
        int i3 = g(i, gue, false).c;
        if (n(i3, jue, 0).A0 != i) {
            return i + 1;
        }
        int e = e(i3, i2, z);
        if (e == -1) {
            return -1;
        }
        return n(e, jue, 0).z0;
    }

    public int e(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 == 2) {
                return i == c(z) ? a(z) : i + 1;
            }
            throw new IllegalStateException();
        } else if (i == c(z)) {
            return -1;
        } else {
            return i + 1;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lue)) {
            return false;
        }
        lue lue = (lue) obj;
        if (lue.p() != p() || lue.i() != i()) {
            return false;
        }
        jue jue = new jue();
        gue gue = new gue();
        jue jue2 = new jue();
        gue gue2 = new gue();
        for (int i = 0; i < p(); i++) {
            if (!n(i, jue, 0).equals(lue.n(i, jue2, 0))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < i(); i2++) {
            if (!g(i2, gue, true).equals(lue.g(i2, gue2, true))) {
                return false;
            }
        }
        return true;
    }

    public final gue f(int i, gue gue) {
        return g(i, gue, false);
    }

    public abstract gue g(int i, gue gue, boolean z);

    public gue h(Object obj, gue gue) {
        return g(b(obj), gue, true);
    }

    public final int hashCode() {
        jue jue = new jue();
        gue gue = new gue();
        int p = p() + 217;
        for (int i = 0; i < p(); i++) {
            p = (p * 31) + n(i, jue, 0).hashCode();
        }
        int i2 = i() + (p * 31);
        for (int i3 = 0; i3 < i(); i3++) {
            i2 = (i2 * 31) + g(i3, gue, true).hashCode();
        }
        return i2;
    }

    public abstract int i();

    public final Pair j(jue jue, gue gue, int i, long j) {
        Pair k = k(jue, gue, i, j, 0);
        k.getClass();
        return k;
    }

    public final Pair k(jue jue, gue gue, int i, long j, long j2) {
        np8.e(i, p());
        n(i, jue, j2);
        if (j == -9223372036854775807L) {
            j = jue.x0;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = jue.z0;
        g(i2, gue, false);
        while (i2 < jue.A0 && gue.X != j) {
            int i3 = i2 + 1;
            if (g(i3, gue, false).X > j) {
                break;
            }
            i2 = i3;
        }
        g(i2, gue, true);
        long j3 = j - gue.X;
        long j4 = gue.o;
        if (j4 != -9223372036854775807L) {
            j3 = Math.min(j3, j4 - 1);
        }
        long max = Math.max(0, j3);
        Object obj = gue.b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public int l(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 == 2) {
                return i == a(z) ? c(z) : i - 1;
            }
            throw new IllegalStateException();
        } else if (i == a(z)) {
            return -1;
        } else {
            return i - 1;
        }
    }

    public abstract Object m(int i);

    public abstract jue n(int i, jue jue, long j);

    public final void o(int i, jue jue) {
        n(i, jue, 0);
    }

    public abstract int p();

    public final boolean q() {
        return p() == 0;
    }
}
