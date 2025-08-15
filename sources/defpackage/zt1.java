package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: zt1  reason: default package */
public final /* synthetic */ class zt1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bkb b;

    public /* synthetic */ zt1(bkb bkb, int i) {
        this.a = i;
        this.b = bkb;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                bkb bkb = this.b;
                if (!((AtomicBoolean) bkb.b).getAndSet(true)) {
                    ((fu1) ((imc) bkb.c).c).c.execute(new zt1(bkb, 1));
                    return;
                }
                return;
            default:
                bkb bkb2 = this.b;
                if (((fu1) ((imc) bkb2.c).c).S0 != 8) {
                    fu1 fu1 = (fu1) ((imc) bkb2.c).c;
                    int i = fu1.S0;
                    fu1.toString();
                    return;
                }
                ((fu1) ((imc) bkb2.c).c).toString();
                ((fu1) ((imc) bkb2.c).c).F(7);
                ((fu1) ((imc) bkb2.c).c).s0.b();
                return;
        }
    }
}
