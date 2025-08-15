package defpackage;

/* renamed from: o93  reason: default package */
public final class o93 {
    public final p93 a;
    public final int b;
    public final int c;

    public o93(p93 p93, int i, int i2) {
        this.a = p93;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o93)) {
            return false;
        }
        o93 o93 = (o93) obj;
        return tpa.f(this.a, o93.a) && this.b == o93.b && this.c == o93.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + k7d.e(-1, k7d.e(this.b, Integer.hashCode(this.a.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommonStrokeColors(separator=");
        sb.append(this.a);
        sb.append(", contrast=");
        sb.append(this.b);
        sb.append(", contrastStatic=-1, glass=");
        return zr6.j(sb, this.c, ")");
    }
}
