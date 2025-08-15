package defpackage;

import java.util.Objects;

/* renamed from: u41  reason: default package */
public final class u41 {
    public final fp1 a;
    public final bff b;

    public u41(fp1 fp1, bff bff) {
        this.a = fp1;
        this.b = bff;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u41.class != obj.getClass()) {
            return false;
        }
        u41 u41 = (u41) obj;
        return this.a.equals(u41.a) && this.b.equals(u41.b);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return "DisplayLayoutItem{videoTrackParticipantKey=" + this.a + ", layout=" + this.b + '}';
    }
}
