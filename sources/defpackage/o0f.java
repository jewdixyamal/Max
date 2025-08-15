package defpackage;

import java.util.Arrays;

/* renamed from: o0f  reason: default package */
public final class o0f {
    public static final String f = Integer.toString(0, 36);
    public static final String g = Integer.toString(1, 36);
    public static final String h = Integer.toString(3, 36);
    public static final String i = Integer.toString(4, 36);
    public final int a;
    public final rze b;
    public final boolean c;
    public final int[] d;
    public final boolean[] e;

    static {
        int i2 = oaf.a;
    }

    public o0f(rze rze, boolean z, int[] iArr, boolean[] zArr) {
        int i2 = rze.a;
        this.a = i2;
        boolean z2 = false;
        fm9.f(i2 == iArr.length && i2 == zArr.length);
        this.b = rze;
        if (z && i2 > 1) {
            z2 = true;
        }
        this.c = z2;
        this.d = (int[]) iArr.clone();
        this.e = (boolean[]) zArr.clone();
    }

    public final o0f a(String str) {
        return new o0f(this.b.a(str), this.c, this.d, this.e);
    }

    public final rze b() {
        return this.b;
    }

    public final qy5 c(int i2) {
        return this.b.d[i2];
    }

    public final int d(int i2) {
        return this.d[i2];
    }

    public final int e() {
        return this.b.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o0f.class != obj.getClass()) {
            return false;
        }
        o0f o0f = (o0f) obj;
        return this.c == o0f.c && this.b.equals(o0f.b) && Arrays.equals(this.d, o0f.d) && Arrays.equals(this.e, o0f.e);
    }

    public final boolean f() {
        for (boolean z : this.e) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean g(int i2) {
        return this.e[i2];
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.d);
        return Arrays.hashCode(this.e) + ((hashCode + (((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31)) * 31);
    }
}
