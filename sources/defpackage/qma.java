package defpackage;

/* renamed from: qma  reason: default package */
public final class qma {
    public final md0 a;
    public final String b;
    public final gg1 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final haf g;
    public final iaf h;
    public final boolean i;
    public final CharSequence j;

    public qma(md0 md0, String str, gg1 gg1, boolean z, boolean z2, boolean z3, haf haf, iaf iaf, boolean z4, CharSequence charSequence) {
        this.a = md0;
        this.b = str;
        this.c = gg1;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = haf;
        this.h = iaf;
        this.i = z4;
        this.j = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qma)) {
            return false;
        }
        qma qma = (qma) obj;
        return tpa.f(this.a, qma.a) && tpa.f(this.b, qma.b) && tpa.f(this.c, qma.c) && this.d == qma.d && this.e == qma.e && this.f == qma.f && tpa.f(this.g, qma.g) && this.h == qma.h && this.i == qma.i && tpa.f(this.j, qma.j);
    }

    public final int hashCode() {
        int i2 = 0;
        md0 md0 = this.a;
        int hashCode = (md0 == null ? 0 : md0.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        gg1 gg1 = this.c;
        int d2 = ms2.d(ms2.d(ms2.d((hashCode2 + (gg1 == null ? 0 : gg1.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
        haf haf = this.g;
        int d3 = ms2.d((this.h.hashCode() + ((d2 + (haf == null ? 0 : haf.hashCode())) * 31)) * 31, 31, this.i);
        CharSequence charSequence = this.j;
        if (charSequence != null) {
            i2 = charSequence.hashCode();
        }
        return d3 + i2;
    }

    public final String toString() {
        return "OpponentPipState(avatar=" + this.a + ", name=" + this.b + ", id=" + this.c + ", isTalking=" + this.d + ", isMicrophoneEnabled=" + this.e + ", isConnecting=" + this.f + ", videoState=" + this.g + ", action=" + this.h + ", isMe=" + this.i + ", userNameWithState=" + this.j + ")";
    }
}
