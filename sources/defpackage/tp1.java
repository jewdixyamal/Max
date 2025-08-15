package defpackage;

/* renamed from: tp1  reason: default package */
public final class tp1 implements up1 {
    public final gg1 a;
    public final jqe b;
    public final jqe c;
    public final uc0 d;
    public final String e;
    public final long f;

    public tp1(gg1 gg1, iqe iqe, iqe iqe2, uc0 uc0, String str, long j) {
        this.a = gg1;
        this.b = iqe;
        this.c = iqe2;
        this.d = uc0;
        this.e = str;
        this.f = j;
    }

    public final long a() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp1)) {
            return false;
        }
        tp1 tp1 = (tp1) obj;
        return tpa.f(this.a, tp1.a) && tpa.f(this.b, tp1.b) && tpa.f(this.c, tp1.c) && tpa.f(this.d, tp1.d) && tpa.f(this.e, tp1.e) && this.f == tp1.f;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + k7d.f(k7d.f(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        String str = this.e;
        return Long.hashCode(this.f) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "Single(id=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", avatarAbbreviationModel=" + this.d + ", url=" + this.e + ", lastUpdate=" + this.f + ")";
    }
}
