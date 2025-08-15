package defpackage;

/* renamed from: z2d  reason: default package */
public final class z2d extends ppc {
    public final y2d s0;
    public final ow0 t0;
    public final x2d u0;
    public final byte[] v0;
    public final ix0 w0;

    public z2d(y2d y2d, ow0 ow0, x2d x2d, byte[] bArr) {
        this.s0 = y2d;
        this.t0 = ow0;
        this.u0 = x2d;
        this.v0 = bArr;
        this.w0 = new ix0(ow0, y2d.b, bArr, x2d);
    }

    public final void b() {
        this.w0.j = true;
    }

    public final Object c() {
        this.w0.a();
        x2d x2d = this.u0;
        if (x2d == null) {
            return null;
        }
        x2d.X++;
        ((ro4) x2d.a).b(x2d.b(), x2d.b, x2d.o);
        return null;
    }
}
