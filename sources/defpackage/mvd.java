package defpackage;

import java.util.List;

/* renamed from: mvd  reason: default package */
public final class mvd {
    public final List a;
    public final zx7 b;
    public final qma c;

    public mvd(List list, zx7 zx7, qma qma) {
        this.a = list;
        this.b = zx7;
        this.c = qma;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mvd)) {
            return false;
        }
        mvd mvd = (mvd) obj;
        return tpa.f(this.a, mvd.a) && tpa.f(this.b, mvd.b) && tpa.f(this.c, mvd.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = 0;
        zx7 zx7 = this.b;
        int hashCode2 = (hashCode + (zx7 == null ? 0 : zx7.hashCode())) * 31;
        qma qma = this.c;
        if (qma != null) {
            i = qma.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "SpeakerModeState(opponentsPages=" + this.a + ", mainOpponentState=" + this.b + ", opponentPipState=" + this.c + ")";
    }
}
