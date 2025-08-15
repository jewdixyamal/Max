package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: is1  reason: default package */
public final /* synthetic */ class is1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ks1 b;

    public /* synthetic */ is1(ks1 ks1, int i) {
        this.a = i;
        this.b = ks1;
    }

    public final void run() {
        boolean z = true;
        switch (this.a) {
            case 0:
                ks1 ks1 = this.b;
                ks1.getClass();
                ks1.c = new js1();
                new File(((kk5) ks1.A0).b(), "call_history_state").delete();
                return;
            case 1:
                ks1 ks12 = this.b;
                ks12.e();
                if (ks12.Z == 0) {
                    if (ks12.c.b == 0) {
                        z = false;
                    }
                    boolean z2 = z;
                    hm9.m("ks1", "sync: from: " + ks12.c.b + " forward: " + z2, new Object[0]);
                    pk pkVar = ks12.w0;
                    k4a k4a = (k4a) pkVar;
                    ks12.Z = k4a.v(k4a, new tdf(((p7b) k4a.y()).a.o(), ks12.c.b, z2));
                    return;
                }
                return;
            case 2:
                Iterator it = this.b.Y.iterator();
                while (it.hasNext()) {
                    m81 m81 = (m81) it.next();
                    hm9.m("CallHistoryPageViewModel", "loaded history for type=" + m81.b, new Object[0]);
                    m81.t();
                }
                return;
            case 3:
                ks1 ks13 = this.b;
                ks13.B0.d(ks13);
                return;
            case 4:
                ks1 ks14 = this.b;
                ks14.B0.f(ks14);
                return;
            default:
                ks1 ks15 = this.b;
                if (!ks15.a) {
                    ks15.e();
                    if (ks15.c.a.a == 0 && ks15.c.a.b == 0 && ks15.c.X) {
                        ks15.g(new is1(ks15, 1));
                        return;
                    }
                    ArrayList m = ks15.x0.m(ks15.c.a.a, ks15.c.a.b);
                    hm9.m("ks1", "loadInitial: loaded from db: " + m.size() + " messages", new Object[0]);
                    ks15.b(ks15.o.size(), m);
                    ks15.a = true;
                    ks15.b = m.isEmpty();
                    ks15.f();
                    if (ks15.c.o) {
                        ks15.g(new u60((Object) ks15, true, 5));
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
