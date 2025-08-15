package defpackage;

/* renamed from: j64  reason: default package */
public final class j64 {
    public static final j64 c = new j64();
    public final k56 a;
    public final k56 b;

    public j64(k56 k56, k56 k562) {
        this.a = k56;
        this.b = k562;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j64)) {
            return false;
        }
        j64 j64 = (j64) obj;
        return tpa.f(this.a, j64.a) && tpa.f(this.b, j64.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Animations(push=" + this.a + ", pop=" + this.b + ")";
    }

    public /* synthetic */ j64() {
        this(bv3.X, bv3.Y);
    }
}
