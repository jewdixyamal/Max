package defpackage;

/* renamed from: k4d  reason: default package */
public final class k4d {
    public final j4d a;
    public final l2b b;

    public k4d(j4d j4d, l2b l2b) {
        this.a = j4d;
        this.b = l2b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4d)) {
            return false;
        }
        k4d k4d = (k4d) obj;
        return tpa.f(this.a, k4d.a) && tpa.f(this.b, k4d.b);
    }

    public final int hashCode() {
        j4d j4d = this.a;
        return this.b.hashCode() + ((j4d == null ? 0 : j4d.hashCode()) * 31);
    }

    public final String toString() {
        return "SelectedAvatarInfo(avatar=" + this.a + ", placeholder=" + this.b + ")";
    }
}
