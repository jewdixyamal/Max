package defpackage;

import android.text.SpannableStringBuilder;

/* renamed from: qd7  reason: default package */
public final class qd7 {
    public static final qd7 f = new qd7((gg1) null, (SpannableStringBuilder) null, false, false, iaf.o);
    public final gg1 a;
    public final CharSequence b;
    public final boolean c;
    public final boolean d;
    public final iaf e;

    public qd7(gg1 gg1, SpannableStringBuilder spannableStringBuilder, boolean z, boolean z2, iaf iaf) {
        this.a = gg1;
        this.b = spannableStringBuilder;
        this.c = z;
        this.d = z2;
        this.e = iaf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd7)) {
            return false;
        }
        qd7 qd7 = (qd7) obj;
        return tpa.f(this.a, qd7.a) && tpa.f(this.b, qd7.b) && this.c == qd7.c && this.d == qd7.d && this.e == qd7.e;
    }

    public final int hashCode() {
        int i = 0;
        gg1 gg1 = this.a;
        int hashCode = (gg1 == null ? 0 : gg1.hashCode()) * 31;
        CharSequence charSequence = this.b;
        if (charSequence != null) {
            i = charSequence.hashCode();
        }
        return this.e.hashCode() + ms2.d(ms2.d((hashCode + i) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "LabelSpeakerState(participantId=" + this.a + ", title=" + this.b + ", isPinned=" + this.c + ", isTalking=" + this.d + ", action=" + this.e + ")";
    }
}
