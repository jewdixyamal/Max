package defpackage;

/* renamed from: g3d  reason: default package */
public final class g3d implements i3d {
    public final b86 a;

    public g3d(b86 b86) {
        this.a = b86;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g3d) && tpa.f(this.a, ((g3d) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnAlbumSelected(album=" + this.a + ")";
    }
}
