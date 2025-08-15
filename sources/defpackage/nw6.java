package defpackage;

/* renamed from: nw6  reason: default package */
public final class nw6 extends n1 implements rx6, uaf {
    public static final nw6 b = new nw6(true);
    public static final nw6 c = new nw6(false);
    public final boolean a;

    public nw6(boolean z) {
        this.a = z;
    }

    public final String a() {
        return Boolean.toString(this.a);
    }

    public final int e() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uaf)) {
            return false;
        }
        uaf uaf = (uaf) obj;
        int e = ((n1) uaf).e();
        if (e == 0) {
            throw null;
        } else if (e != 2) {
            return false;
        } else {
            return this.a == uaf.q().a;
        }
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final nw6 q() {
        return this;
    }

    public final nw6 t() {
        return this;
    }

    public final String toString() {
        return Boolean.toString(this.a);
    }
}
