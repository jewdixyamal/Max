package defpackage;

/* renamed from: r6  reason: default package */
public final class r6 extends s6 {
    public final jqe a;
    public final int b;
    public final int c;

    public r6() {
        eqe eqe = new eqe(b8a.I);
        int i = gpc.Q;
        int i2 = y7a.G;
        this.a = eqe;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6)) {
            return false;
        }
        r6 r6Var = (r6) obj;
        return tpa.f(this.a, r6Var.a) && this.b == r6Var.b && this.c == r6Var.c;
    }

    public final int getIcon() {
        return this.b;
    }

    public final int getId() {
        return this.c;
    }

    public final jqe getName() {
        return this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + k7d.e(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WriteToChat(name=");
        sb.append(this.a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", id=");
        return zr6.j(sb, this.c, ")");
    }
}
