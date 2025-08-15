package defpackage;

/* renamed from: hma  reason: default package */
public final class hma extends wm9 {
    public final long b;
    public final String c;
    public final String d;

    public hma(long j, String str, String str2) {
        super(e5f.a);
        this.b = j;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hma)) {
            return false;
        }
        hma hma = (hma) obj;
        return this.b == hma.b && tpa.f(this.c, hma.c) && tpa.f(this.d, hma.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + rh4.d(Long.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenPhoneBook(contactId=");
        sb.append(this.b);
        sb.append(", fullName=");
        sb.append(this.c);
        sb.append(", phone=");
        return zr6.l(sb, this.d, ")");
    }
}
