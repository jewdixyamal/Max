package defpackage;

/* renamed from: ce8  reason: default package */
public class ce8 {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public ce8(ce8 ce8) {
        this.a = ce8.a;
        this.b = ce8.b;
        this.c = ce8.c;
        this.d = ce8.d;
        this.e = ce8.e;
    }

    public final boolean a() {
        return this.b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ce8)) {
            return false;
        }
        ce8 ce8 = (ce8) obj;
        return this.a.equals(ce8.a) && this.b == ce8.b && this.c == ce8.c && this.d == ce8.d && this.e == ce8.e;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public ce8(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }
}
