package defpackage;

import android.net.Uri;
import java.util.List;

/* renamed from: mx8  reason: default package */
public final class mx8 extends izc {
    public final fs8 X;
    public final e52 Y;
    public final String Z;
    public final Uri c;
    public final List o;
    public final w6b s0;
    public final CharSequence t0;
    public final long u0;
    public final int v0 = p8a.r;
    public final long w0;

    public mx8(Uri uri, List list, fs8 fs8, e52 e52, String str, w6b w6b, CharSequence charSequence, long j) {
        super(5, list);
        this.c = uri;
        this.o = list;
        this.X = fs8;
        this.Y = e52;
        this.Z = str;
        this.s0 = w6b;
        this.t0 = charSequence;
        this.u0 = j;
        this.w0 = fs8.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mx8)) {
            return false;
        }
        mx8 mx8 = (mx8) obj;
        return tpa.f(this.c, mx8.c) && tpa.f(this.o, mx8.o) && tpa.f(this.X, mx8.X) && tpa.f(this.Y, mx8.Y) && tpa.f(this.Z, mx8.Z) && tpa.f(this.s0, mx8.s0) && tpa.f(this.t0, mx8.t0) && this.u0 == mx8.u0;
    }

    public final long getItemId() {
        return this.w0;
    }

    public final int hashCode() {
        int i = 0;
        Uri uri = this.c;
        int hashCode = (this.X.hashCode() + k7d.g(this.o, (uri == null ? 0 : uri.hashCode()) * 31, 31)) * 31;
        e52 e52 = this.Y;
        int hashCode2 = (hashCode + (e52 == null ? 0 : e52.hashCode())) * 31;
        String str = this.Z;
        int hashCode3 = (this.s0.hashCode() + ((hashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        CharSequence charSequence = this.t0;
        if (charSequence != null) {
            i = charSequence.hashCode();
        }
        return Long.hashCode(this.u0) + ((hashCode3 + i) * 31);
    }

    public final boolean k(izc izc) {
        mx8 mx8 = (mx8) izc;
        if (tpa.f(this.c, mx8.c)) {
            fs8 fs8 = this.X;
            long j = fs8.c;
            fs8 fs82 = mx8.X;
            return j == fs82.c && tpa.f(fs8.Z, fs82.Z) && fs8.X == fs82.X;
        }
    }

    public final int l() {
        return this.v0;
    }

    public final boolean m(izc izc) {
        return this.w0 == izc.getItemId();
    }

    public final String toString() {
        String x = pag.x(this.t0);
        StringBuilder sb = new StringBuilder("MessageSearchModel(avatar=");
        sb.append(this.c);
        sb.append(", messageHighlights=");
        sb.append(this.o);
        sb.append(", message=");
        sb.append(this.X);
        sb.append(", chat=");
        sb.append(this.Y);
        sb.append(", feedback=");
        sb.append(this.Z);
        sb.append(", preProcessedText=");
        sb.append(this.s0);
        sb.append(", preProcessedChatTitle=");
        sb.append(x);
        sb.append(", chatId=");
        sb.append(this.u0);
        sb.append(", viewType=");
        sb.append(this.v0);
        sb.append(", itemId=");
        return zr6.k(sb, this.w0, ")");
    }
}
