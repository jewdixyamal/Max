package defpackage;

/* renamed from: zz4  reason: default package */
public final class zz4 implements a05 {
    public final String a;
    public final jqe b;
    public final jqe c;

    public zz4(String str, eqe eqe, eqe eqe2) {
        this.a = str;
        this.b = eqe;
        this.c = eqe2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zz4)) {
            return false;
        }
        zz4 zz4 = (zz4) obj;
        return tpa.f(this.a, zz4.a) && tpa.f(this.b, zz4.b) && tpa.f(this.c, zz4.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + k7d.f((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return "SavedMessages(avatar=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ")";
    }
}
