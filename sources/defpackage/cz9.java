package defpackage;

/* renamed from: cz9  reason: default package */
public final class cz9 extends w2 {
    public final int X;
    public final /* synthetic */ int b = 0;
    public final b66 c;
    public final int o;

    public cz9(r1a r1a, b66 b66, int i, int i2) {
        super(r1a);
        this.c = b66;
        this.o = i;
        this.X = i2;
    }

    public final void q(f2a f2a) {
        switch (this.b) {
            case 0:
                r1a r1a = this.a;
                b66 b66 = this.c;
                if (!br7.a0(r1a, f2a, b66)) {
                    boolean z = true;
                    int i = this.o;
                    int i2 = this.X;
                    if (i2 == 1) {
                        r1a.a(new bz9(new y6d(f2a), b66, i));
                        return;
                    }
                    if (i2 != 3) {
                        z = false;
                    }
                    r1a.a(new az9(f2a, b66, i, z));
                    return;
                }
                return;
            default:
                r1a r1a2 = this.a;
                b66 b662 = this.c;
                if (!br7.a0(r1a2, f2a, b662)) {
                    r1a2.a(new yz9(f2a, b662, this.o, this.X));
                    return;
                }
                return;
        }
    }

    public cz9(qy9 qy9, b66 b66, int i, int i2) {
        super(qy9);
        this.c = b66;
        this.X = i2;
        this.o = Math.max(8, i);
    }
}
