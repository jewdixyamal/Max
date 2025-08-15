package defpackage;

/* renamed from: m93  reason: default package */
public final class m93 {
    public final n93 a;

    public m93(n93 n93) {
        this.a = n93;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m93) && tpa.f(this.a, ((m93) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CommonStatesTextColors(disabled=" + this.a + ")";
    }
}
