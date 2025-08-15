package defpackage;

/* renamed from: l7g  reason: default package */
public final class l7g {
    public final String a;
    public final int b;

    public l7g(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l7g)) {
            return false;
        }
        l7g l7g = (l7g) obj;
        return tpa.f(this.a, l7g.a) && this.b == l7g.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb.append(this.a);
        sb.append(", generation=");
        return au1.h(sb, this.b, ')');
    }
}
