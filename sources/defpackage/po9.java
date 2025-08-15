package defpackage;

/* renamed from: po9  reason: default package */
public final class po9 {
    public final long a;
    public final String b;
    public final Boolean c;

    public po9(long j, String str, Boolean bool) {
        this.a = j;
        this.b = str;
        this.c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof po9)) {
            return false;
        }
        po9 po9 = (po9) obj;
        return this.a == po9.a && tpa.f(this.b, po9.b) && tpa.f(this.c, po9.c);
    }

    public final int hashCode() {
        int d = rh4.d(Long.hashCode(this.a) * 31, 31, this.b);
        Boolean bool = this.c;
        return d + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return "NeuroAvatarInfo(id=" + this.a + ", url=" + this.b + ", default=" + this.c + ")";
    }
}
