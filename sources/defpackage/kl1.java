package defpackage;

import java.util.List;

/* renamed from: kl1  reason: default package */
public final class kl1 {
    public final yad a;
    public final String b;
    public final boolean c;
    public final List d;
    public final int e;
    public final bg1 f;
    public final Long g;

    public kl1(int i, bg1 bg1, yad yad, Long l, String str, List list, boolean z) {
        this.a = yad;
        this.b = str;
        this.c = z;
        this.d = list;
        this.e = i;
        this.f = bg1;
        this.g = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl1)) {
            return false;
        }
        kl1 kl1 = (kl1) obj;
        return tpa.f(this.a, kl1.a) && tpa.f(this.b, kl1.b) && this.c == kl1.c && tpa.f(this.d, kl1.d) && this.e == kl1.e && tpa.f(this.f, kl1.f) && tpa.f(this.g, kl1.g);
    }

    public final int hashCode() {
        int d2 = ms2.d(rh4.d(Integer.hashCode(this.a.a) * 31, 31, this.b), 31, this.c);
        int i = 0;
        List list = this.d;
        int c2 = s36.c(this.e, (d2 + (list == null ? 0 : list.hashCode())) * 31);
        bg1 bg1 = this.f;
        int hashCode = (c2 + (bg1 == null ? 0 : bg1.hashCode())) * 31;
        Long l = this.g;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "CallSessionRoom(id=" + this.a + ", name=" + this.b + ", isActive=" + this.c + ", participantIds=" + this.d + ", participantCount=" + this.e + ", pinnedParticipantId=" + this.f + ", timeoutMs=" + this.g + ")";
    }
}
