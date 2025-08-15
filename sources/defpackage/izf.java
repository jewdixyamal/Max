package defpackage;

/* renamed from: izf  reason: default package */
public final class izf implements kzf {
    public final String a;
    public final c1g b;

    public izf(String str, c1g c1g) {
        this.a = str;
        this.b = c1g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof izf)) {
            return false;
        }
        izf izf = (izf) obj;
        return tpa.f(this.a, izf.a) && tpa.f(this.b, izf.b);
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        c1g c1g = this.b;
        if (c1g != null) {
            i = c1g.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ShowShareDialog(text=" + this.a + ", fileInfo=" + this.b + ")";
    }
}
