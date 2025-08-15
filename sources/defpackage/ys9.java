package defpackage;

/* renamed from: ys9  reason: default package */
public final class ys9 extends gle {
    public final nab c;

    public ys9(nab nab) {
        this.c = nab;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ys9) && tpa.f(this.c, ((ys9) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "Response(profile=" + this.c + ")";
    }
}
