package defpackage;

import java.util.Objects;

/* renamed from: ol1  reason: default package */
public final class ol1 {
    public final fg1 a;
    public final zad b;
    public final tad c;

    public ol1(fg1 fg1, zad zad, tad tad) {
        this.a = fg1;
        this.b = zad;
        this.c = tad;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ol1)) {
            return false;
        }
        ol1 ol1 = (ol1) obj;
        return tpa.f(this.a, ol1.a) && tpa.f(this.b, ol1.b) && tpa.f(this.c, ol1.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Objects.hashCode(this.a.a) * 31)) * 31;
        tad tad = this.c;
        return hashCode + (tad == null ? 0 : tad.hashCode());
    }

    public final String toString() {
        return "InvitedParams(me=" + this.a + ", roomId=" + this.b + ", room=" + this.c + ")";
    }
}
