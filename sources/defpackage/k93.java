package defpackage;

/* renamed from: k93  reason: default package */
public final class k93 {
    public final l93 a;

    public k93(l93 l93) {
        this.a = l93;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k93) && tpa.f(this.a, ((k93) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CommonStatesIconColors(disabled=" + this.a + ")";
    }
}
