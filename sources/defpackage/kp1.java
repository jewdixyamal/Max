package defpackage;

import java.util.Objects;

/* renamed from: kp1  reason: default package */
public final class kp1 {
    public final lp1 a;
    public final o61 b;

    public kp1(lp1 lp1, o61 o61) {
        this.a = lp1;
        this.b = o61;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kp1.class != obj.getClass()) {
            return false;
        }
        kp1 kp1 = (kp1) obj;
        return this.a.equals(kp1.a) && Objects.equals(this.b, kp1.b);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return "WaitingParticipant{waitingParticipantId=" + this.a + ", externalId=" + this.b + '}';
    }
}
