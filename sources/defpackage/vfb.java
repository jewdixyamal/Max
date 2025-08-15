package defpackage;

/* renamed from: vfb  reason: default package */
public final class vfb implements xfb {
    public final a73 a;

    public vfb(a73 a73) {
        this.a = a73;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vfb) && tpa.f(this.a, ((vfb) obj).a);
    }

    public final int hashCode() {
        a73 a73 = this.a;
        if (a73 == null) {
            return 0;
        }
        return a73.a.hashCode();
    }

    public final String toString() {
        return "LastNamePayload(errorText=" + this.a + ")";
    }
}
