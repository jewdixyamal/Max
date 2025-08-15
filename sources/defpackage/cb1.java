package defpackage;

import android.text.SpannableStringBuilder;

/* renamed from: cb1  reason: default package */
public final class cb1 extends gb1 {
    public final CharSequence a;
    public final String b;

    public cb1(SpannableStringBuilder spannableStringBuilder, String str) {
        this.a = spannableStringBuilder;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb1)) {
            return false;
        }
        cb1 cb1 = (cb1) obj;
        return tpa.f(this.a, cb1.a) && tpa.f(this.b, cb1.b);
    }

    public final int hashCode() {
        int i = 0;
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "Name(name=" + this.a + ", accessibility=" + this.b + ")";
    }
}
