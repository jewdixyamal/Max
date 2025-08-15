package defpackage;

/* renamed from: xm1  reason: default package */
public final class xm1 extends j1e {
    public final long d;
    public final boolean e;

    public xm1(long j, boolean z) {
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
        if (!(obj instanceof xm1)) {
            return false;
        }
        xm1 xm1 = (xm1) obj;
        return this.d == xm1.d && this.e == xm1.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + (Long.hashCode(this.d) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Chat(chatId=");
        sb.append(this.d);
        sb.append(", isVideo=");
        return au1.j(sb, this.e, ")");
    }
}
