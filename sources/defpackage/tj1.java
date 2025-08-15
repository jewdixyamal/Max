package defpackage;

/* renamed from: tj1  reason: default package */
public final class tj1 extends wj1 {
    public final v31 D;

    public tj1(v31 v31) {
        this.D = v31;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tj1) && tpa.f(this.D, ((tj1) obj).D);
    }

    public final int hashCode() {
        return this.D.hashCode();
    }

    public final String toString() {
        return "ShowOpponentInfo(contextInfo=" + this.D + ")";
    }
}
