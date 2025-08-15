package defpackage;

import java.io.Serializable;
import java.util.List;

/* renamed from: fs8  reason: default package */
public final class fs8 implements Serializable, dt7 {
    public final long A0;
    public final e92 B0;
    public final List C0;
    public final ng4 D0;
    public final fx8 E0;
    public final wx8 X;
    public final long Y;
    public final String Z;
    public final long a;
    public final long b;
    public final long c;
    public final long o;
    public final wz s0;
    public final aw8 t0;
    public final fy8 u0;
    public final ux8 v0;
    public final int w0;
    public final long x0;
    public final int y0;
    public final int z0;

    public fs8(long j, long j2, long j3, long j4, wx8 wx8, long j5, String str, wz wzVar, aw8 aw8, fy8 fy8, ux8 ux8, int i, long j6, int i2, int i3, long j7, e92 e92, List list, ng4 ng4, fx8 fx8) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.o = j4;
        this.X = wx8;
        this.Y = j5;
        this.Z = str;
        this.s0 = wzVar;
        this.t0 = aw8;
        this.u0 = fy8;
        this.v0 = ux8;
        this.w0 = i;
        this.x0 = j6;
        this.y0 = i2;
        this.z0 = i3;
        this.A0 = j7;
        this.B0 = e92;
        this.C0 = list;
        this.D0 = ng4;
        this.E0 = fx8;
    }

    public final String a(boolean z, boolean z2) {
        String str = this.Z;
        if (str == null) {
            str = null;
        } else if (!z2) {
            str = "***";
        }
        String G = nu0.G(Long.valueOf(this.b));
        String x = wmd.x(this.C0, z, z2);
        StringBuilder sb = new StringBuilder("Message{id=");
        ms2.j(this.a, ", text=", str, sb);
        sb.append(", delayedAttrs=");
        sb.append(this.D0);
        sb.append(", time=");
        sb.append(G);
        sb.append(", status=");
        sb.append(this.X);
        sb.append(", sender=");
        sb.append(this.o);
        sb.append(", cid=");
        sb.append(this.Y);
        sb.append(", attaches=");
        sb.append(this.s0);
        sb.append(", type=");
        sb.append(this.u0);
        sb.append(", elements=");
        sb.append(x);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs8)) {
            return false;
        }
        fs8 fs8 = (fs8) obj;
        return this.a == fs8.a && this.b == fs8.b && this.c == fs8.c && this.o == fs8.o && this.X == fs8.X && this.Y == fs8.Y && tpa.f(this.Z, fs8.Z) && tpa.f(this.s0, fs8.s0) && tpa.f(this.t0, fs8.t0) && this.u0 == fs8.u0 && tpa.f(this.v0, fs8.v0) && this.w0 == fs8.w0 && this.x0 == fs8.x0 && this.y0 == fs8.y0 && this.z0 == fs8.z0 && this.A0 == fs8.A0 && tpa.f(this.B0, fs8.B0) && tpa.f(this.C0, fs8.C0) && tpa.f(this.D0, fs8.D0) && tpa.f(this.E0, fs8.E0);
    }

    public final int hashCode() {
        int m = h4f.m(h4f.m(h4f.m(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.o);
        int i = 0;
        wx8 wx8 = this.X;
        int m2 = h4f.m((m + (wx8 == null ? 0 : wx8.hashCode())) * 31, 31, this.Y);
        String str = this.Z;
        int hashCode = (this.s0.hashCode() + ((m2 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        aw8 aw8 = this.t0;
        int hashCode2 = (this.u0.hashCode() + ((hashCode + (aw8 == null ? 0 : aw8.hashCode())) * 31)) * 31;
        ux8 ux8 = this.v0;
        int m3 = h4f.m(k7d.e(this.z0, k7d.e(this.y0, h4f.m(k7d.e(this.w0, (hashCode2 + (ux8 == null ? 0 : ux8.hashCode())) * 31, 31), 31, this.x0), 31), 31), 31, this.A0);
        e92 e92 = this.B0;
        int g = k7d.g(this.C0, (m3 + (e92 == null ? 0 : e92.hashCode())) * 31, 31);
        ng4 ng4 = this.D0;
        int hashCode3 = (g + (ng4 == null ? 0 : ng4.hashCode())) * 31;
        fx8 fx8 = this.E0;
        if (fx8 != null) {
            i = fx8.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return a(false, false);
    }
}
