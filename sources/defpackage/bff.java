package defpackage;

import java.util.Objects;

/* renamed from: bff  reason: default package */
public final class bff {
    public final int a;
    public final int b;
    public final int c;

    public bff(w3 w3Var) {
        this.a = w3Var.a;
        this.b = w3Var.b;
        this.c = w3Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bff.class != obj.getClass()) {
            return false;
        }
        bff bff = (bff) obj;
        return this.a == bff.a && this.b == bff.b && this.c == bff.c;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), au1.a(this.c)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoDisplayLayout{width=");
        sb.append(this.a);
        sb.append(", height=");
        sb.append(this.b);
        sb.append(", fit=");
        int i = this.c;
        sb.append(i != 1 ? i != 2 ? "null" : "CONTAIN" : "COVER");
        sb.append('}');
        return sb.toString();
    }
}
