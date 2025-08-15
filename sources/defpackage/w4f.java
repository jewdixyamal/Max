package defpackage;

/* renamed from: w4f  reason: default package */
public final class w4f {
    public final CharSequence a;
    public final CharSequence b;
    public final m31 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public w4f(CharSequence charSequence, String str, m31 m31, boolean z, boolean z2, boolean z3) {
        this.a = charSequence;
        this.b = str;
        this.c = m31;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4f)) {
            return false;
        }
        w4f w4f = (w4f) obj;
        return tpa.f(this.a, w4f.a) && tpa.f(this.b, w4f.b) && tpa.f(this.c, w4f.c) && this.d == w4f.d && this.e == w4f.e && this.f == w4f.f;
    }

    public final int hashCode() {
        int i = 0;
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.b;
        int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        m31 m31 = this.c;
        if (m31 != null) {
            i = m31.hashCode();
        }
        return Boolean.hashCode(this.f) + ms2.d(ms2.d((hashCode2 + i) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "UnavailableCallState(callDescription=" + this.a + ", callStateStatus=" + this.b + ", chatInfo=" + this.c + ", isCallBackAvailable=" + this.d + ", isVideoCall=" + this.e + ", isPrivacyReason=" + this.f + ")";
    }
}
