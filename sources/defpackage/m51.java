package defpackage;

/* renamed from: m51  reason: default package */
public final class m51 implements t51 {
    public final hi7 a;

    public m51(hi7 hi7) {
        this.a = hi7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m51) && tpa.f(this.a, ((m51) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LinkInfo(info=" + this.a + ")";
    }
}
