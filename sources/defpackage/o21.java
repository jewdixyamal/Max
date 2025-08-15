package defpackage;

import one.me.calls.ui.ui.call.CallScreen;

/* renamed from: o21  reason: default package */
public final /* synthetic */ class o21 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q21 b;

    public /* synthetic */ o21(q21 q21, int i) {
        this.a = i;
        this.b = q21;
    }

    public final Object invoke() {
        e5f e5f = e5f.a;
        boolean z = true;
        q21 q21 = this.b;
        switch (this.a) {
            case 0:
                p21 p21 = q21.H0;
                if (p21 != null) {
                    yxc yxc = CallScreen.R0;
                    ((CallScreen) ((gaa) p21).a).s0(true);
                }
                return e5f;
            default:
                p21 p212 = q21.H0;
                if (p212 != null) {
                    yxc yxc2 = CallScreen.R0;
                    CallScreen callScreen = (CallScreen) ((gaa) p212).a;
                    callScreen.y0().e(zs1.RECALL, false);
                    el1 D0 = callScreen.D0();
                    la1 s = D0.s();
                    j1e j1e = s.c;
                    m38 m38 = m38.b;
                    boolean z2 = s.q == m38;
                    if (s.r != m38) {
                        z = false;
                    }
                    ir1 ir1 = D0.c;
                    ir1.getClass();
                    if (j1e != null) {
                        ((wr1) ir1.a).A(new lyd(new jyd(j1e), z2, z, (k56) null));
                        ir1.o(u9f.o);
                        ir1.v.o1(ir1, ir1.y[0], od2.L(ir1.w, ir1.k));
                    }
                    ir1.m();
                    ir1.n();
                }
                return e5f;
        }
    }
}
