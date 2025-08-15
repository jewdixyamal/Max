package defpackage;

/* renamed from: gx6  reason: default package */
public final class gx6 extends n1 implements uaf {
    public static final gx6 a = new Object();

    public final String a() {
        return "null";
    }

    public final int e() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uaf)) {
            return false;
        }
        int e = ((n1) ((uaf) obj)).e();
        if (e != 0) {
            return e == 1;
        }
        throw null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "null";
    }
}
