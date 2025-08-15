package defpackage;

/* renamed from: b6f  reason: default package */
public final class b6f {
    public final long a;
    public final k8g b;
    public final int c;

    public b6f(long j, k8g k8g, int i) {
        this.a = j;
        this.b = k8g;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6f)) {
            return false;
        }
        b6f b6f = (b6f) obj;
        return this.a == b6f.a && tpa.f(this.b, b6f.b) && this.c == b6f.c;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        k8g k8g = this.b;
        return Integer.hashCode(this.c) + ((hashCode + (k8g == null ? 0 : k8g.hashCode())) * 31);
    }

    public final String toString() {
        return "UpdateAttachesEntity(id=" + this.a + ", attaches=" + this.b + ", mediaType=" + this.c + ")";
    }
}
