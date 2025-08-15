package defpackage;

/* renamed from: bb0  reason: default package */
public final class bb0 extends sn9 {
    public final rn9 a;
    public final qn9 b;

    public bb0(rn9 rn9, qn9 qn9) {
        this.a = rn9;
        this.b = qn9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sn9)) {
            return false;
        }
        sn9 sn9 = (sn9) obj;
        rn9 rn9 = this.a;
        if (rn9 != null ? rn9.equals(((bb0) sn9).a) : ((bb0) sn9).a == null) {
            qn9 qn9 = this.b;
            if (qn9 == null) {
                if (((bb0) sn9).b == null) {
                    return true;
                }
            } else if (qn9.equals(((bb0) sn9).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        rn9 rn9 = this.a;
        int hashCode = ((rn9 == null ? 0 : rn9.hashCode()) ^ 1000003) * 1000003;
        qn9 qn9 = this.b;
        if (qn9 != null) {
            i = qn9.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}
