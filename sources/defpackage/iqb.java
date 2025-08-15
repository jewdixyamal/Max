package defpackage;

import android.graphics.Bitmap;

/* renamed from: iqb  reason: default package */
public final class iqb {
    public final CharSequence a;
    public final CharSequence b;
    public final Bitmap c;

    public iqb(String str, String str2, Bitmap bitmap) {
        this.a = str;
        this.b = str2;
        this.c = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iqb)) {
            return false;
        }
        iqb iqb = (iqb) obj;
        return tpa.f(this.a, iqb.a) && tpa.f(this.b, iqb.b) && tpa.f(this.c, iqb.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = 0;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        Bitmap bitmap = this.c;
        if (bitmap != null) {
            i = bitmap.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "QrCodeData(name=" + this.a + ", shortName=" + this.b + ", qrCode=" + this.c + ")";
    }
}
