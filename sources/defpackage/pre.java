package defpackage;

/* renamed from: pre  reason: default package */
public final class pre {
    public final kge a;

    public pre(kge kge) {
        this.a = kge;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pre) && tpa.f(this.a, ((pre) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SvgPattern(svgPattern=" + this.a + ")";
    }
}
