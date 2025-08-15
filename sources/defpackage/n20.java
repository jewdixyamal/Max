package defpackage;

/* renamed from: n20  reason: default package */
public final class n20 {
    public final String a;
    public final boolean b;

    public n20(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n20)) {
            return false;
        }
        n20 n20 = (n20) obj;
        return tpa.f(this.a, n20.a) && this.b == n20.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PreviewCacheKey(attachId=" + this.a + ", blurred=" + this.b + ")";
    }
}
