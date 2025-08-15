package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: qa  reason: default package */
public final class qa extends pnf {
    public final w7c X;
    public final qx7 b;
    public final je7 c;
    public final q0e o;

    public qa(je7 je7, je7 je72, qx7 qx7) {
        this.b = qx7;
        this.c = je7;
        q0e a = r0e.a(na.c);
        this.o = a;
        this.X = new w7c(a);
        od2.L(new zn5(((yz0) ((ez0) je7.getValue())).t0, new pa(je72, this, (Continuation) null), 5), this.a);
    }

    public final void q(boolean z) {
        yz0 yz0 = (yz0) ((ez0) this.c.getValue());
        ir6 ir6 = hm9.m;
        if (ir6 != null) {
            yz0.getClass();
            if (ir6.c()) {
                ir6.d(us7.X, "CallAdminSettingsController", ey8.j("Update users from waiting room for all with apply state=", z), (Throwable) null);
            }
        }
        if (z) {
            bt1 bt1 = (bt1) yz0.X.getValue();
            bt1.getClass();
            bt1.c(bt1, "PROMOTE_JOIN_WAITING_ROOM", (String) null, (String) null, (Long) null, (String) null, (String) null, true, 54);
        } else {
            bt1 bt12 = (bt1) yz0.X.getValue();
            bt12.getClass();
            bt1.c(bt12, "REJECT_JOIN_WAITING_ROOM", (String) null, (String) null, (Long) null, (String) null, (String) null, true, 54);
        }
        yz0.Z.updateAndGet(new jz0(z, yz0));
        if (!z) {
            yz0.l();
        }
    }
}
