package defpackage;

/* renamed from: o6  reason: default package */
public final class o6 extends s6 {
    public final jqe a;
    public final int b;
    public final int c;

    public o6() {
        eqe eqe = new eqe(b8a.J);
        int i = x7a.K0;
        int i2 = y7a.r;
        this.a = eqe;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6)) {
            return false;
        }
        o6 o6Var = (o6) obj;
        return tpa.f(this.a, o6Var.a) && this.b == o6Var.b && this.c == o6Var.c;
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
        StringBuilder sb = new StringBuilder("OpenProfile(name=");
        sb.append(this.a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", id=");
        return zr6.j(sb, this.c, ")");
    }
}
