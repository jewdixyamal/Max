package defpackage;

/* renamed from: r0a  reason: default package */
public final class r0a extends w2 {
    public final ztc b;
    public final int c;

    public r0a(r1a r1a, ztc ztc, int i) {
        super(r1a);
        this.b = ztc;
        this.c = i;
    }

    public final void q(f2a f2a) {
        ztc ztc = this.b;
        boolean z = ztc instanceof u0f;
        r1a r1a = this.a;
        if (z) {
            r1a.a(f2a);
        } else {
            r1a.a(new q0a(f2a, ztc.a(), this.c));
        }
    }
}
