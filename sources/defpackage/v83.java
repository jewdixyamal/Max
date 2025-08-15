package defpackage;

/* renamed from: v83  reason: default package */
public final class v83 {
    public final j73 a;
    public final m73 b;
    public final w83 c;
    public final b93 d;
    public final j93 e;
    public final o93 f;
    public final q93 g;

    public v83(j73 j73, m73 m73, w83 w83, b93 b93, j93 j93, o93 o93, q93 q93) {
        this.a = j73;
        this.b = m73;
        this.c = w83;
        this.d = b93;
        this.e = j93;
        this.f = o93;
        this.g = q93;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v83)) {
            return false;
        }
        v83 v83 = (v83) obj;
        return tpa.f(this.a, v83.a) && tpa.f(this.b, v83.b) && tpa.f(this.c, v83.c) && tpa.f(this.d, v83.d) && tpa.f(this.e, v83.e) && tpa.f(this.f, v83.f) && tpa.f(this.g, v83.g);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.d.hashCode();
        int hashCode4 = this.e.hashCode();
        int hashCode5 = this.f.hashCode();
        return this.g.hashCode() + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CommonColors(action=" + this.a + ", background=" + this.b + ", icon=" + this.c + ", shadows=" + this.d + ", states=" + this.e + ", stroke=" + this.f + ", text=" + this.g + ")";
    }
}
