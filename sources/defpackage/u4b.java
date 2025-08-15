package defpackage;

/* renamed from: u4b  reason: default package */
public final /* synthetic */ class u4b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v4b b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int o;

    public /* synthetic */ u4b(v4b v4b, int i, int i2, int i3) {
        this.a = i3;
        this.b = v4b;
        this.c = i;
        this.o = i2;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                x4b x4b = this.b.g;
                if (x4b.t1(25) || x4b.t1(33)) {
                    boolean t1 = x4b.t1(33);
                    int i = this.c;
                    if (t1) {
                        x4b.L(i, this.o);
                        return;
                    } else {
                        x4b.I0(i);
                        return;
                    }
                } else {
                    return;
                }
            default:
                x4b x4b2 = this.b.g;
                if (x4b2.t1(26) || x4b2.t1(34)) {
                    int i2 = this.c;
                    int i3 = this.o;
                    if (i2 != -100) {
                        if (i2 != -1) {
                            if (i2 != 1) {
                                if (i2 != 100) {
                                    if (i2 != 101) {
                                        ey8.k(i2, "onAdjustVolume: Ignoring unknown direction: ");
                                        return;
                                    } else if (x4b2.t1(34)) {
                                        x4b2.H(i3, !x4b2.T0());
                                        return;
                                    } else {
                                        x4b2.q0(!x4b2.T0());
                                        return;
                                    }
                                } else if (x4b2.t1(34)) {
                                    x4b2.H(i3, false);
                                    return;
                                } else {
                                    x4b2.q0(false);
                                    return;
                                }
                            } else if (x4b2.t1(34)) {
                                x4b2.N(i3);
                                return;
                            } else {
                                x4b2.D0();
                                return;
                            }
                        } else if (x4b2.t1(34)) {
                            x4b2.g0(i3);
                            return;
                        } else {
                            x4b2.J();
                            return;
                        }
                    } else if (x4b2.t1(34)) {
                        x4b2.H(i3, true);
                        return;
                    } else {
                        x4b2.q0(true);
                        return;
                    }
                } else {
                    return;
                }
        }
    }
}
