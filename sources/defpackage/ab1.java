package defpackage;

/* renamed from: ab1  reason: default package */
public final class ab1 extends gb1 {
    public final iaf a;

    public ab1(iaf iaf) {
        this.a = iaf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ab1) && this.a == ((ab1) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ButtonAction(state=" + this.a + ")";
    }
}
