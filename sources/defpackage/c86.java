package defpackage;

import android.net.Uri;

/* renamed from: c86  reason: default package */
public final class c86 implements ol7 {
    public final b86 a;
    public final Uri b;
    public final boolean c;
    public final long o;

    public c86(b86 b86, Uri uri, boolean z) {
        this.a = b86;
        this.b = uri;
        this.c = z;
        this.o = (long) b86.a.b().hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c86)) {
            return false;
        }
        c86 c86 = (c86) obj;
        return tpa.f(this.a, c86.a) && tpa.f(this.b, c86.b) && this.c == c86.c;
    }

    public final long getItemId() {
        return this.o;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (uri == null ? 0 : uri.hashCode())) * 31);
    }

    public final int l() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GalleryAlbumUiItem(album=");
        sb.append(this.a);
        sb.append(", cover=");
        sb.append(this.b);
        sb.append(", isSelected=");
        return au1.j(sb, this.c, ")");
    }
}
