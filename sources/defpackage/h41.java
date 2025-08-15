package defpackage;

/* renamed from: h41  reason: default package */
public final class h41 implements j41 {
    public final jp1 a;

    public h41(jp1 jp1) {
        this.a = jp1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h41) && tpa.f(this.a, ((h41) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Active(state=" + this.a + ")";
    }
}
