package defpackage;

/* renamed from: vh4  reason: default package */
public final class vh4 implements efb {
    public final String a;
    public final jqe b;
    public final int c;

    public vh4(String str, eqe eqe, int i) {
        this.a = str;
        this.b = eqe;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vh4)) {
            return false;
        }
        vh4 vh4 = (vh4) obj;
        return tpa.f(this.a, vh4.a) && tpa.f(this.b, vh4.b) && this.c == vh4.c;
    }

    public final long getItemId() {
        return (long) 4;
    }

    public final boolean h(ol7 ol7) {
        return ((long) 4) == ol7.getItemId();
    }

    public final int hashCode() {
        String str = this.a;
        return Integer.hashCode(this.c) + k7d.f((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final int l() {
        return 4;
    }

    public final boolean t(Object obj) {
        return equals((ol7) obj);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DescriptionItem(text=");
        sb.append(this.a);
        sb.append(", hint=");
        sb.append(this.b);
        sb.append(", limitCharacters=");
        return zr6.j(sb, this.c, ")");
    }
}
