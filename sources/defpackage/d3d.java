package defpackage;

/* renamed from: d3d  reason: default package */
public final class d3d {
    public final boolean a = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d3d) && this.a == ((d3d) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return au1.j(new StringBuilder("Close(isAnimated="), this.a, ")");
    }
}
