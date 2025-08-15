package defpackage;

/* renamed from: k0g  reason: default package */
public final class k0g extends wm9 {
    public final c64 b;

    public k0g(c64 c64) {
        super(e5f.a);
        this.b = c64;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0g) && tpa.f(this.b, ((k0g) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "OpenAndClose(linkEvent=" + this.b + ")";
    }
}
