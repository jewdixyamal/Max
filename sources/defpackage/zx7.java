package defpackage;

/* renamed from: zx7  reason: default package */
public final class zx7 {
    public final md0 a;
    public final CharSequence b;
    public final gg1 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final haf h;
    public final boolean i;
    public final boolean j;
    public final int k;
    public final CharSequence l;
    public final String m;

    public zx7(md0 md0, CharSequence charSequence, gg1 gg1, boolean z, boolean z2, boolean z3, boolean z4, haf haf, boolean z5, boolean z6, int i2, CharSequence charSequence2, String str) {
        this.a = md0;
        this.b = charSequence;
        this.c = gg1;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = haf;
        this.i = z5;
        this.j = z6;
        this.k = i2;
        this.l = charSequence2;
        this.m = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zx7)) {
            return false;
        }
        zx7 zx7 = (zx7) obj;
        return tpa.f(this.a, zx7.a) && tpa.f(this.b, zx7.b) && tpa.f(this.c, zx7.c) && this.d == zx7.d && this.e == zx7.e && this.f == zx7.f && this.g == zx7.g && tpa.f(this.h, zx7.h) && this.i == zx7.i && this.j == zx7.j && this.k == zx7.k && tpa.f(this.l, zx7.l) && tpa.f(this.m, zx7.m);
    }

    public final int hashCode() {
        int i2 = 0;
        md0 md0 = this.a;
        int hashCode = (md0 == null ? 0 : md0.hashCode()) * 31;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        gg1 gg1 = this.c;
        int d2 = ms2.d(ms2.d(ms2.d(ms2.d((hashCode2 + (gg1 == null ? 0 : gg1.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        haf haf = this.h;
        int g2 = ey8.g(this.k, ms2.d(ms2.d((d2 + (haf == null ? 0 : haf.hashCode())) * 31, 31, this.i), 31, this.j), 31);
        CharSequence charSequence2 = this.l;
        int hashCode3 = (g2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        String str = this.m;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MainSpeakerState(avatar=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", id=");
        sb.append(this.c);
        sb.append(", isTalking=");
        sb.append(this.d);
        sb.append(", isConnectedOnce=");
        sb.append(this.e);
        sb.append(", isUserConnectionOnce=");
        sb.append(this.f);
        sb.append(", isConnecting=");
        sb.append(this.g);
        sb.append(", videoState=");
        sb.append(this.h);
        sb.append(", isMe=");
        sb.append(this.i);
        sb.append(", isRaiseHand=");
        sb.append(this.j);
        sb.append(", talkingState=");
        sb.append(k7d.p(this.k));
        sb.append(", label=");
        sb.append(this.l);
        sb.append(", userNameAccessibility=");
        return zr6.l(sb, this.m, ")");
    }
}
