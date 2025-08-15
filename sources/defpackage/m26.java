package defpackage;

/* renamed from: m26  reason: default package */
public final class m26 {
    public static final m26 d = new m26((gef) null, 7);
    public final gef a;
    public final int b;
    public final int c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m26(gef gef, int i) {
        this((i & 1) != 0 ? null : gef, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m26)) {
            return false;
        }
        m26 m26 = (m26) obj;
        return tpa.f(this.a, m26.a) && this.b == m26.b && this.c == m26.c;
    }

    public final int hashCode() {
        gef gef = this.a;
        return Integer.hashCode(this.c) + k7d.e(this.b, (gef == null ? 0 : gef.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExtractorData(videoContent=");
        sb.append(this.a);
        sb.append(", frameWidth=");
        sb.append(this.b);
        sb.append(", frameHeight=");
        return zr6.j(sb, this.c, ")");
    }

    public m26(gef gef, int i, int i2) {
        this.a = gef;
        this.b = i;
        this.c = i2;
    }
}
