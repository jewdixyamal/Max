package defpackage;

/* renamed from: v55  reason: default package */
public final class v55 {
    public int a;
    public int b;
    public int c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v55.class != obj.getClass()) {
            return false;
        }
        v55 v55 = (v55) obj;
        if (this.a == v55.a && this.b == v55.b) {
            return this.c == v55.c;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }
}
