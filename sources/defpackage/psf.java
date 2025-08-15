package defpackage;

/* renamed from: psf  reason: default package */
public final class psf extends q42 {
    public final long c;

    public psf(long j) {
        super(4, Long.valueOf(j));
        this.c = j;
    }

    public final Long a() {
        return Long.valueOf(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof psf) && this.c == ((psf) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    public final String toString() {
        return zr6.k(new StringBuilder("ChannelId(sourceId="), this.c, ")");
    }
}
