package defpackage;

/* renamed from: xe3  reason: default package */
public final class xe3 extends ka1 {
    public final String b;
    public final e8b c;

    public xe3(String str, e8b e8b) {
        super(3);
        this.b = str;
        this.c = e8b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xe3)) {
            return false;
        }
        xe3 xe3 = (xe3) obj;
        return tpa.f(this.b, xe3.b) && tpa.f(this.c, xe3.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "NameInputScreen(token=" + this.b + ", presetAvatars=" + this.c + ")";
    }
}
