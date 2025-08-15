package defpackage;

/* renamed from: tfb  reason: default package */
public final class tfb implements xfb {
    public final a73 a;

    public tfb(a73 a73) {
        this.a = a73;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tfb) && tpa.f(this.a, ((tfb) obj).a);
    }

    public final int hashCode() {
        a73 a73 = this.a;
        if (a73 == null) {
            return 0;
        }
        return a73.a.hashCode();
    }

    public final String toString() {
        return "ChatNamePayload(errorText=" + this.a + ")";
    }
}
