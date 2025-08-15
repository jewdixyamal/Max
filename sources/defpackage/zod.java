package defpackage;

/* renamed from: zod  reason: default package */
public final class zod implements apd {
    public final uod a;

    public zod(uod uod) {
        this.a = uod;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zod) && tpa.f(this.a, ((zod) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Replace(command=" + this.a + ")";
    }
}
