package defpackage;

/* renamed from: qca  reason: default package */
public final class qca {
    public final String a;
    public final qec b;
    public final qec c;
    public final int d;
    public final int e;

    public qca(String str, qec qec, qec qec2, int i, int i2) {
        qec = (i2 & 2) != 0 ? null : qec;
        qec2 = (i2 & 4) != 0 ? null : qec2;
        i = (i2 & 16) != 0 ? 8192 : i;
        this.a = str;
        this.b = qec;
        this.c = qec2;
        this.d = 50;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qca)) {
            return false;
        }
        qca qca = (qca) obj;
        return tpa.f(this.a, qca.a) && tpa.f(this.b, qca.b) && tpa.f(this.c, qca.c) && this.d == qca.d && this.e == qca.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = 0;
        qec qec = this.b;
        int hashCode2 = (hashCode + (qec == null ? 0 : qec.hashCode())) * 31;
        qec qec2 = this.c;
        if (qec2 != null) {
            i = qec2.hashCode();
        }
        return Integer.hashCode(this.e) + k7d.e(this.d, (hashCode2 + i) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Target(logName=");
        sb.append(this.a);
        sb.append(", includedTags=");
        sb.append(this.b);
        sb.append(", excludedTags=");
        sb.append(this.c);
        sb.append(", maxBufferEntriesCount=");
        sb.append(this.d);
        sb.append(", sizeLimitKb=");
        return zr6.j(sb, this.e, ")");
    }
}
