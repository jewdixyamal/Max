package defpackage;

import android.util.Pair;

/* renamed from: mue  reason: default package */
public abstract class mue {
    public static final fue a = new Object();
    public static final String b = Integer.toString(0, 36);
    public static final String c = Integer.toString(1, 36);
    public static final String d = Integer.toString(2, 36);

    /* JADX WARNING: type inference failed for: r0v0, types: [fue, java.lang.Object] */
    static {
        int i = oaf.a;
    }

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

    public final int d(int i, hue hue, kue kue, int i2, boolean z) {
        int i3 = g(i, hue, false).c;
        if (n(i3, kue, 0).o != i) {
            return i + 1;
        }
        int e = e(i3, i2, z);
        if (e == -1) {
            return -1;
        }
        return n(e, kue, 0).n;
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

    public boolean equals(Object obj) {
        int c2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mue)) {
            return false;
        }
        mue mue = (mue) obj;
        if (mue.p() != p() || mue.i() != i()) {
            return false;
        }
        kue kue = new kue();
        hue hue = new hue();
        kue kue2 = new kue();
        hue hue2 = new hue();
        for (int i = 0; i < p(); i++) {
            if (!n(i, kue, 0).equals(mue.n(i, kue2, 0))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < i(); i2++) {
            if (!g(i2, hue, true).equals(mue.g(i2, hue2, true))) {
                return false;
            }
        }
        int a2 = a(true);
        if (a2 != mue.a(true) || (c2 = c(true)) != mue.c(true)) {
            return false;
        }
        while (a2 != c2) {
            int e = e(a2, 0, true);
            if (e != mue.e(a2, 0, true)) {
                return false;
            }
            a2 = e;
        }
        return true;
    }

    public final hue f(int i, hue hue) {
        return g(i, hue, false);
    }

    public abstract hue g(int i, hue hue, boolean z);

    public hue h(Object obj, hue hue) {
        return g(b(obj), hue, true);
    }

    public int hashCode() {
        kue kue = new kue();
        hue hue = new hue();
        int p = p() + 217;
        for (int i = 0; i < p(); i++) {
            p = (p * 31) + n(i, kue, 0).hashCode();
        }
        int i2 = i() + (p * 31);
        for (int i3 = 0; i3 < i(); i3++) {
            i2 = (i2 * 31) + g(i3, hue, true).hashCode();
        }
        int a2 = a(true);
        while (a2 != -1) {
            i2 = (i2 * 31) + a2;
            a2 = e(a2, 0, true);
        }
        return i2;
    }

    public abstract int i();

    public final Pair j(kue kue, hue hue, int i, long j) {
        Pair k = k(kue, hue, i, j, 0);
        k.getClass();
        return k;
    }

    public final Pair k(kue kue, hue hue, int i, long j, long j2) {
        fm9.g(i, p());
        n(i, kue, j2);
        if (j == -9223372036854775807L) {
            j = kue.l;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = kue.n;
        g(i2, hue, false);
        while (i2 < kue.o && hue.e != j) {
            int i3 = i2 + 1;
            if (g(i3, hue, false).e > j) {
                break;
            }
            i2 = i3;
        }
        g(i2, hue, true);
        long j3 = j - hue.e;
        long j4 = hue.d;
        if (j4 != -9223372036854775807L) {
            j3 = Math.min(j3, j4 - 1);
        }
        long max = Math.max(0, j3);
        Object obj = hue.b;
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

    public abstract kue n(int i, kue kue, long j);

    public final void o(int i, kue kue) {
        n(i, kue, 0);
    }

    public abstract int p();

    public final boolean q() {
        return p() == 0;
    }
}
