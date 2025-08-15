package defpackage;

/* renamed from: zfd  reason: default package */
public final class zfd extends bgd {
    public final String a;
    public final jqe b;

    public zfd(String str, eqe eqe) {
        this.a = str;
        this.b = eqe;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zfd)) {
            return false;
        }
        zfd zfd = (zfd) obj;
        return tpa.f(this.a, zfd.a) && tpa.f(this.b, zfd.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CopyToClipboard(textToCopy=" + this.a + ", snackbarTitle=" + this.b + ")";
    }
}
