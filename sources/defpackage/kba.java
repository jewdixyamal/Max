package defpackage;

/* renamed from: kba  reason: default package */
public final class kba {
    public final String a;
    public final hy3 b;

    public kba(String str, hy3 hy3) {
        this.a = str;
        this.b = hy3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kba)) {
            return false;
        }
        kba kba = (kba) obj;
        return tpa.f(this.a, kba.a) && tpa.f(this.b, kba.b);
    }

    public final int hashCode() {
        return Integer.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FolderCounter(folderId=" + this.a + ", counter=" + this.b + ")";
    }
}
