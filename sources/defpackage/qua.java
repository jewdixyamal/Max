package defpackage;

/* renamed from: qua  reason: default package */
public final class qua {
    public final String a;
    public final long b;

    public qua(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qua)) {
            return false;
        }
        qua qua = (qua) obj;
        return tpa.f(this.a, qua.a) && this.b == qua.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhoneAndServerPhone(phone=");
        sb.append(this.a);
        sb.append(", serverPhone=");
        return zr6.k(sb, this.b, ")");
    }
}
