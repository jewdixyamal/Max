package defpackage;

/* renamed from: i86  reason: default package */
public final class i86 implements k86 {
    public final b86 a;

    public i86(b86 b86) {
        this.a = b86;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i86) && tpa.f(this.a, ((i86) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnSelectAlbum(album=" + this.a + ")";
    }
}
