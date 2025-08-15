package defpackage;

/* renamed from: xo0  reason: default package */
public final class xo0 implements ap0 {
    public final kn3 a;

    public xo0(kn3 kn3) {
        this.a = kn3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xo0) && tpa.f(this.a, ((xo0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ContactList(event=" + this.a + ")";
    }
}
