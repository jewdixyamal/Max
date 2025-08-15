package defpackage;

/* renamed from: ajb  reason: default package */
public final class ajb extends bjb {
    public final CharSequence a;

    public ajb(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ajb) && tpa.f(this.a, ((ajb) obj).a);
    }

    public final long getItemId() {
        return (long) 16;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final int l() {
        return 16;
    }

    public final String toString() {
        return "Phone(text=" + this.a + ")";
    }
}
