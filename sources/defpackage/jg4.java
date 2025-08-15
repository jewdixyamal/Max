package defpackage;

import android.os.Handler;

/* renamed from: jg4  reason: default package */
public final /* synthetic */ class jg4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kg4 b;

    public /* synthetic */ jg4(kg4 kg4, int i) {
        this.a = i;
        this.b = kg4;
    }

    public final void run() {
        int i = this.a;
        kg4 kg4 = this.b;
        switch (i) {
            case 0:
                kg4.b(kg4);
                return;
            default:
                if (kg4.Z == 0) {
                    kg4.Z = 1;
                    a14 u = a14.u();
                    String str = kg4.x0;
                    u.n(str, "onAllConstraintsMet for " + kg4.c);
                    if (kg4.o.o.h(kg4.w0, (glc) null)) {
                        n8g n8g = kg4.o.c;
                        l7g l7g = kg4.c;
                        synchronized (n8g.d) {
                            a14 u2 = a14.u();
                            String str2 = n8g.e;
                            u2.n(str2, "Starting timer for " + l7g);
                            n8g.a(l7g);
                            m8g m8g = new m8g(n8g, l7g);
                            n8g.b.put(l7g, m8g);
                            n8g.c.put(l7g, kg4);
                            ((Handler) n8g.a.a).postDelayed(m8g, 600000);
                        }
                        return;
                    }
                    kg4.c();
                    return;
                }
                a14 u3 = a14.u();
                String str3 = kg4.x0;
                u3.n(str3, "Already started work for " + kg4.c);
                return;
        }
    }
}
