package defpackage;

/* renamed from: az8  reason: default package */
public final class az8 {
    public final long a;
    public final boolean b;

    public az8(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az8)) {
            return false;
        }
        az8 az8 = (az8) obj;
        return this.a == az8.a && this.b == az8.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InputEditData(messageId=");
        sb.append(this.a);
        sb.append(", shouldInsertOriginalText=");
        return au1.j(sb, this.b, ")");
    }
}
