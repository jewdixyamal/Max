package defpackage;

/* renamed from: ufb  reason: default package */
public final class ufb implements xfb {
    public final a73 a;

    public ufb(a73 a73) {
        this.a = a73;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ufb) && tpa.f(this.a, ((ufb) obj).a);
    }

    public final int hashCode() {
        a73 a73 = this.a;
        if (a73 == null) {
            return 0;
        }
        return a73.a.hashCode();
    }

    public final String toString() {
        return "FirstNamePayload(errorText=" + this.a + ")";
    }
}
