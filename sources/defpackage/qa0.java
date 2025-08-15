package defpackage;

/* renamed from: qa0  reason: default package */
public final class qa0 {
    public final eb0 a;
    public final int b;

    public qa0(eb0 eb0, int i) {
        if (eb0 != null) {
            this.a = eb0;
            this.b = i;
            return;
        }
        throw new NullPointerException("Null packet");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qa0)) {
            return false;
        }
        qa0 qa0 = (qa0) obj;
        return this.a.equals(qa0.a) && this.b == qa0.b;
    }

    public final int hashCode() {
        return this.b ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{packet=");
        sb.append(this.a);
        sb.append(", jpegQuality=");
        return zr6.j(sb, this.b, "}");
    }
}
