package defpackage;

/* renamed from: z90  reason: default package */
public final class z90 extends o33 {
    public final n33 a = n33.a;
    public final kd b;

    public z90(k90 k90) {
        this.b = k90;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o33)) {
            return false;
        }
        o33 o33 = (o33) obj;
        n33 n33 = this.a;
        if (n33 != null ? n33.equals(((z90) o33).a) : ((z90) o33).a == null) {
            kd kdVar = this.b;
            if (kdVar == null) {
                if (((z90) o33).b == null) {
                    return true;
                }
            } else if (kdVar.equals(((z90) o33).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        n33 n33 = this.a;
        int hashCode = ((n33 == null ? 0 : n33.hashCode()) ^ 1000003) * 1000003;
        kd kdVar = this.b;
        if (kdVar != null) {
            i = kdVar.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.a + ", androidClientInfo=" + this.b + "}";
    }
}
