package defpackage;

import android.net.Uri;
import android.text.Layout;

/* renamed from: xv8  reason: default package */
public final class xv8 implements zv8 {
    public final String a;
    public final int b;
    public final Layout c;
    public final Uri d;
    public final boolean e;

    public xv8(String str, int i, Layout layout, Uri uri, boolean z) {
        this.a = str;
        this.b = i;
        this.c = layout;
        this.d = uri;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xv8)) {
            return false;
        }
        xv8 xv8 = (xv8) obj;
        return tpa.f(this.a, xv8.a) && this.b == xv8.b && tpa.f(this.c, xv8.c) && tpa.f(this.d, xv8.d) && this.e == xv8.e;
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int hashCode = (this.c.hashCode() + k7d.e(this.b, (str == null ? 0 : str.hashCode()) * 31, 31)) * 31;
        Uri uri = this.d;
        if (uri != null) {
            i = uri.hashCode();
        }
        return Boolean.hashCode(this.e) + ((hashCode + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Media(url=");
        sb.append(this.a);
        sb.append(", attachCount=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", lowResPreviewUri=");
        sb.append(this.d);
        sb.append(", isRoundPreview=");
        return au1.j(sb, this.e, ")");
    }
}
