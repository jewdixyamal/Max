package defpackage;

/* renamed from: ab0  reason: default package */
public final class ab0 {
    public final mc0 a;
    public final o90 b;
    public final int c;

    public ab0(mc0 mc0, o90 o90, int i) {
        this.a = mc0;
        this.b = o90;
        this.c = i;
    }

    public static nw4 a() {
        nw4 nw4 = new nw4(2);
        nw4.o = -1;
        nw4.c = o90.a().k();
        nw4.b = mc0.a().a();
        return nw4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ab0)) {
            return false;
        }
        ab0 ab0 = (ab0) obj;
        return this.a.equals(ab0.a) && this.b.equals(ab0.b) && this.c == ab0.c;
    }

    public final int hashCode() {
        return this.c ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSpec{videoSpec=");
        sb.append(this.a);
        sb.append(", audioSpec=");
        sb.append(this.b);
        sb.append(", outputFormat=");
        return zr6.j(sb, this.c, "}");
    }
}
