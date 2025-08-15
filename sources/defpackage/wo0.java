package defpackage;

/* renamed from: wo0  reason: default package */
public final class wo0 implements ol7 {
    public final long a;
    public final String b;
    public final CharSequence c;
    public final CharSequence o;

    public wo0(long j, String str, String str2, CharSequence charSequence) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.o = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wo0)) {
            return false;
        }
        wo0 wo0 = (wo0) obj;
        return this.a == wo0.a && tpa.f(this.b, wo0.b) && tpa.f(this.c, wo0.c) && tpa.f(this.o, wo0.o);
    }

    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        return this.o.hashCode() + rh4.f(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final int l() {
        return 0;
    }

    public final String toString() {
        return "BlackListItem(itemId=" + this.a + ", avatar=" + this.b + ", name=" + this.c + ", abbreviation=" + this.o + ")";
    }
}
