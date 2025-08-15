package defpackage;

/* renamed from: j17  reason: default package */
public final class j17 {
    public final h17 a;

    public j17(h17 h17) {
        this.a = h17;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j17)) {
            return false;
        }
        return this.a.equals(((j17) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
