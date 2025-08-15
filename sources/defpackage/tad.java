package defpackage;

import java.util.List;

/* renamed from: tad  reason: default package */
public final class tad {
    public final yad a;
    public final String b;
    public final boolean c;
    public final int d;
    public final List e;
    public final bg1 f;
    public final Long g;

    public tad(int i, bg1 bg1, yad yad, Long l, String str, List list, boolean z) {
        this.a = yad;
        this.b = str;
        this.c = z;
        this.d = i;
        this.e = list;
        this.f = bg1;
        this.g = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tad)) {
            return false;
        }
        tad tad = (tad) obj;
        return tpa.f(this.a, tad.a) && tpa.f(this.b, tad.b) && this.c == tad.c && this.d == tad.d && tpa.f(this.e, tad.e) && tpa.f(this.f, tad.f) && tpa.f(this.g, tad.g);
    }

    public final int hashCode() {
        int c2 = s36.c(this.d, ms2.d(rh4.d(Integer.hashCode(this.a.a) * 31, 31, this.b), 31, this.c));
        int i = 0;
        List list = this.e;
        int hashCode = (c2 + (list == null ? 0 : list.hashCode())) * 31;
        bg1 bg1 = this.f;
        int hashCode2 = (hashCode + (bg1 == null ? 0 : bg1.hashCode())) * 31;
        Long l = this.g;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "SessionRoom(id=" + this.a + ", name=" + this.b + ", isActive=" + this.c + ", participantCount=" + this.d + ", participantIds=" + this.e + ", pinnedParticipantId=" + this.f + ", timeoutMs=" + this.g + ")";
    }
}
