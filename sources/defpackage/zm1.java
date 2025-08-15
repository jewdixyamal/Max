package defpackage;

/* renamed from: zm1  reason: default package */
public final class zm1 extends j1e {
    public final long d;
    public final boolean e;

    public zm1(long j, boolean z) {
        this.d = j;
        this.e = z;
    }

    public final boolean A() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zm1)) {
            return false;
        }
        zm1 zm1 = (zm1) obj;
        return this.d == zm1.d && this.e == zm1.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + (Long.hashCode(this.d) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("User(userId=");
        sb.append(this.d);
        sb.append(", isVideo=");
        return au1.j(sb, this.e, ")");
    }
}
