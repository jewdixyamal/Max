package defpackage;

import android.text.SpannableString;

/* renamed from: m91  reason: default package */
public final class m91 {
    public static final m91 c = new m91((SpannableString) null, n91.a);
    public final CharSequence a;
    public final n91 b;

    public m91(SpannableString spannableString, n91 n91) {
        this.a = spannableString;
        this.b = n91;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m91)) {
            return false;
        }
        m91 m91 = (m91) obj;
        return tpa.f(this.a, m91.a) && this.b == m91.b;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        return this.b.hashCode() + ((charSequence == null ? 0 : charSequence.hashCode()) * 31);
    }

    public final String toString() {
        return "CallIndicatorState(title=" + this.a + ", indicatorState=" + this.b + ")";
    }
}
