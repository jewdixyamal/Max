package defpackage;

import android.text.SpannableStringBuilder;

/* renamed from: a91  reason: default package */
public final class a91 implements c91 {
    public final m31 a;
    public final boolean b;
    public final CharSequence c;

    public a91(m31 m31, boolean z, SpannableStringBuilder spannableStringBuilder) {
        this.a = m31;
        this.b = z;
        this.c = spannableStringBuilder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a91)) {
            return false;
        }
        a91 a91 = (a91) obj;
        return tpa.f(this.a, a91.a) && this.b == a91.b && tpa.f(this.c, a91.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ms2.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "Calling(chatState=" + this.a + ", isVideo=" + this.b + ", callTypeDescription=" + this.c + ")";
    }
}
