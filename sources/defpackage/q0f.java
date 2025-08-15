package defpackage;

import java.util.Arrays;

/* renamed from: q0f  reason: default package */
public final class q0f implements su0 {
    public final qze a;
    public final int[] b;
    public final int c;
    public final boolean[] o;

    public q0f(qze qze, int[] iArr, int i, boolean[] zArr) {
        int length = iArr.length;
        int i2 = qze.a;
        np8.d(i2 == length && i2 == zArr.length);
        this.a = qze;
        this.b = (int[]) iArr.clone();
        this.c = i;
        this.o = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q0f.class != obj.getClass()) {
            return false;
        }
        q0f q0f = (q0f) obj;
        return this.c == q0f.c && this.a.equals(q0f.a) && Arrays.equals(this.b, q0f.b) && Arrays.equals(this.o, q0f.o);
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.b);
        return Arrays.hashCode(this.o) + ((((hashCode + (this.a.hashCode() * 31)) * 31) + this.c) * 31);
    }
}
