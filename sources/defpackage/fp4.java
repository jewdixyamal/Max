package defpackage;

/* renamed from: fp4  reason: default package */
public final class fp4 {
    public final long a;
    public final String b;

    public fp4(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fp4)) {
            return false;
        }
        fp4 fp4 = (fp4) obj;
        return this.a == fp4.a && tpa.f(this.b, fp4.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DraftMediaUploadKeyDb(chatId=");
        sb.append(this.a);
        sb.append(", attachLocalId=");
        return zr6.l(sb, this.b, ")");
    }
}
