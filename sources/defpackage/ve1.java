package defpackage;

/* renamed from: ve1  reason: default package */
public final class ve1 implements ol7 {
    public final boolean X;
    public final boolean Y;
    public final long Z;
    public final gg1 a;
    public final String b;
    public final String c;
    public final boolean o;
    public final Integer s0;
    public final long t0;

    public ve1(gg1 gg1, String str, String str2, boolean z, boolean z2, boolean z3, long j, Integer num) {
        this.a = gg1;
        this.b = str;
        this.c = str2;
        this.o = z;
        this.X = z2;
        this.Y = z3;
        this.Z = j;
        this.s0 = num;
        this.t0 = gg1.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ve1)) {
            return false;
        }
        ve1 ve1 = (ve1) obj;
        return tpa.f(this.a, ve1.a) && tpa.f(this.b, ve1.b) && tpa.f(this.c, ve1.c) && this.o == ve1.o && this.X == ve1.X && this.Y == ve1.Y && this.Z == ve1.Z && tpa.f(this.s0, ve1.s0);
    }

    public final long getItemId() {
        return this.t0;
    }

    public final boolean h(ol7 ol7) {
        return this.t0 == ol7.getItemId();
    }

    public final int hashCode() {
        int m = h4f.m(ms2.d(ms2.d(ms2.d(rh4.d(rh4.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.o), 31, this.X), 31, this.Y), 31, this.Z);
        Integer num = this.s0;
        return m + (num == null ? 0 : num.hashCode());
    }

    public final int l() {
        return 1;
    }

    public final Object n(Object obj) {
        ve1 ve1 = (ve1) ((ol7) obj);
        kl7 l = j1e.l();
        String str = this.b;
        String str2 = ve1.b;
        if (!tpa.f(str, str2)) {
            l.add(new se1(str2));
        }
        Integer num = this.s0;
        Integer num2 = ve1.s0;
        if (!tpa.f(num, num2)) {
            l.add(new qe1(num2));
        }
        String str3 = this.c;
        String str4 = ve1.c;
        boolean f = tpa.f(str3, str4);
        gg1 gg1 = this.a;
        gg1 gg12 = ve1.a;
        if (!f || !tpa.f(gg1, gg12) || !tpa.f(str, str2)) {
            l.add(new pe1(gg12, str2, str4));
        }
        boolean z = this.o;
        boolean z2 = ve1.o;
        if (z != z2 || !tpa.f(gg1, gg12)) {
            l.add(new re1(gg12, z2));
        }
        boolean z3 = this.Y;
        boolean z4 = ve1.Y;
        if (z3 != z4) {
            l.add(new te1(z4));
        }
        return j1e.d(l);
    }

    public final String toString() {
        return "CallOpponentInfoState(opponentId=" + this.a + ", userName=" + this.b + ", avatar=" + this.c + ", hasMoreAction=" + this.o + ", isAdmin=" + this.X + ", isRaiseHand=" + this.Y + ", isRaiseHandTime=" + this.Z + ", description=" + this.s0 + ")";
    }
}
