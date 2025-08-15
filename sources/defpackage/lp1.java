package defpackage;

import java.util.Objects;

/* renamed from: lp1  reason: default package */
public final class lp1 {
    public final long a;
    public final bg1 b;

    public lp1(bg1 bg1, long j) {
        this.a = j;
        this.b = bg1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lp1.class != obj.getClass()) {
            return false;
        }
        lp1 lp1 = (lp1) obj;
        return this.a == lp1.a && Objects.equals(this.b, lp1.b);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Long.valueOf(this.a), this.b});
    }

    public final String toString() {
        return "WaitingParticipantId{addedTs=" + this.a + ", participantId=" + this.b + '}';
    }
}
