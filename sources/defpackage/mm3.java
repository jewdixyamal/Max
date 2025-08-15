package defpackage;

/* renamed from: mm3  reason: default package */
public final class mm3 implements nm3 {
    public final gi9 a;

    public mm3(gi9 gi9) {
        this.a = gi9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mm3) && tpa.f(this.a, ((mm3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Update(contactIds=" + this.a + ")";
    }
}
