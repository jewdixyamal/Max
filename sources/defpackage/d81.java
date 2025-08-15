package defpackage;

/* renamed from: d81  reason: default package */
public final class d81 extends hqd {
    public final o9g F0;
    public final je7 G0 = tu0.r(3, new x5(24, this));

    public d81(fk3 fk3, o9g o9g) {
        super(fk3);
        this.F0 = o9g;
    }

    /* renamed from: E */
    public final void A(il6 il6) {
        fk3 fk3 = (fk3) this.a;
        fk3.setId(Long.hashCode(il6.w0));
        fk3.setTitle(il6.Y);
        boolean z = il6.v0 instanceof xk6;
        long j = il6.b;
        if (z) {
            fk3.E(j, (CharSequence) null, (String) null);
            fk3.setAvatarOverlay((od0) this.G0.getValue());
        } else {
            fk3.setAvatarOverlay((od0) null);
            String str = il6.o;
            if (str == null) {
                str = "";
            }
            fk3.E(j, il6.c, str);
        }
        fk3.setDescription(il6.t0);
        fk3.setTime(il6.Z);
        fk3.C(il6.s0);
        boolean z2 = true;
        int i = il6.u0;
        fk3.A(i == 1);
        if (i != 2) {
            z2 = false;
        }
        fk3.B(z2);
        fk3.R0 = il6.a;
        fk3.P0 = this.F0;
    }
}
