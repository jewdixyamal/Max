package defpackage;

/* renamed from: h80  reason: default package */
public final class h80 extends gle {
    public final long X;
    public final long Y;
    public final int Z;
    public final String c;
    public final int o;

    public h80(String str, int i, long j, long j2, int i2) {
        this.c = str;
        this.o = i;
        this.X = j;
        this.Y = j2;
        this.Z = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h80)) {
            return false;
        }
        h80 h80 = (h80) obj;
        return tpa.f(this.c, h80.c) && this.o == h80.o && this.X == h80.X && this.Y == h80.Y && this.Z == h80.Z;
    }

    public final int hashCode() {
        return Integer.hashCode(this.Z) + h4f.m(h4f.m(k7d.e(this.o, this.c.hashCode() * 31, 31), 31, this.X), 31, this.Y);
    }

    public final String toString() {
        StringBuilder m = au1.m("Response(verifyToken='", oag.x(this.c), "', altActionDuration=");
        m.append(this.X);
        m.append(", codeLength=");
        m.append(this.o);
        m.append(", requestMaxDuration=");
        m.append(this.Y);
        m.append(", requestCountLeft=");
        return zr6.j(m, this.Z, ")");
    }
}
