package defpackage;

/* renamed from: c6e  reason: default package */
public final class c6e {
    public final long a;
    public final String b;

    public c6e(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6e)) {
            return false;
        }
        c6e c6e = (c6e) obj;
        return this.a == c6e.a && tpa.f(this.b, c6e.b);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QueryState(marker=");
        sb.append(this.a);
        sb.append(", query=");
        return zr6.l(sb, this.b, ")");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c6e(String str, int i) {
        this(0, (i & 2) != 0 ? null : str);
    }
}
