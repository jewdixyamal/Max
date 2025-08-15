package defpackage;

/* renamed from: veb  reason: default package */
public final class veb implements xeb {
    public final long a;

    public veb(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof veb) && this.a == ((veb) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return zr6.k(new StringBuilder("ProfilePhotoUpdate(photoId="), this.a, ")");
    }
}
