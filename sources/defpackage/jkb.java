package defpackage;

/* renamed from: jkb  reason: default package */
public final class jkb extends ka1 {
    public final long b;
    public final hdb c;

    public jkb(long j, hdb hdb) {
        super(11);
        this.b = j;
        this.c = hdb;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jkb)) {
            return false;
        }
        jkb jkb = (jkb) obj;
        return this.b == jkb.b && this.c == jkb.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "EditProfile(id=" + this.b + ", type=" + this.c + ")";
    }
}
