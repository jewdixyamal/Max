package defpackage;

/* renamed from: ce9  reason: default package */
public final class ce9 {
    public final String a;
    public final int b;
    public final int c;
    public final int d;

    public ce9(int i, String str, int i2, int i3) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ce9.class != obj.getClass()) {
            return false;
        }
        ce9 ce9 = (ce9) obj;
        if (this.b == ce9.b && this.c == ce9.c && this.d == ce9.d) {
            return this.a.equals(ce9.a);
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }
}
