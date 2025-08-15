package defpackage;

/* renamed from: u90  reason: default package */
public final class u90 {
    public final int a;
    public final v90 b;

    public u90(int i, v90 v90) {
        if (i != 0) {
            this.a = i;
            this.b = v90;
            return;
        }
        throw new NullPointerException("Null type");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u90)) {
            return false;
        }
        u90 u90 = (u90) obj;
        if (au1.c(this.a, u90.a)) {
            v90 v90 = u90.b;
            v90 v902 = this.b;
            if (v902 == null) {
                if (v90 == null) {
                    return true;
                }
            } else if (v902.equals(v90)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int s = (au1.s(this.a) ^ 1000003) * 1000003;
        v90 v90 = this.b;
        return (v90 == null ? 0 : v90.hashCode()) ^ s;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraState{type=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "CLOSED" : "CLOSING" : "OPEN" : "OPENING" : "PENDING_OPEN");
        sb.append(", error=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
