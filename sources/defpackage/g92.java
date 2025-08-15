package defpackage;

/* renamed from: g92  reason: default package */
public final class g92 {
    public final String a;
    public final long b;
    public final long c;

    public g92(long j, String str, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g92.class != obj.getClass()) {
            return false;
        }
        g92 g92 = (g92) obj;
        if (this.b != g92.b || this.c != g92.c) {
            return false;
        }
        String str = g92.a;
        String str2 = this.a;
        return str2 != null ? str2.equals(str) : str == null;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str != null ? str.hashCode() : 0;
        long j = this.b;
        long j2 = this.c;
        return (((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PushMessage{text='");
        sb.append(pag.x(this.a));
        sb.append("', time=");
        sb.append(this.b);
        sb.append(", id=");
        return z7b.i(sb, this.c, '}');
    }
}
