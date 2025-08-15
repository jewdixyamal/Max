package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: dx9  reason: default package */
public final class dx9 extends ffe implements g66 {
    public final /* synthetic */ gx9 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dx9(gx9 gx9, Continuation continuation) {
        super(5, continuation);
        this.X = gx9;
    }

    public final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        ((Boolean) obj3).getClass();
        ((Number) obj4).intValue();
        return new dx9(this.X, (Continuation) obj5).o(e5f.a);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        bc7[] bc7Arr = gx9.C0;
        gx9 gx9 = this.X;
        gx9.getClass();
        kl7 l = j1e.l();
        boolean z = ((jp) gx9.q()).g.getLong("app.notification.dontDisturbUntil", 0) == 0;
        eqe r = gx9.r(((kxc) gx9.q()).p());
        eqe r2 = gx9.r(((kxc) gx9.q()).o());
        boolean z2 = ((jp) gx9.q()).g.getBoolean("app.notification.show.text", true);
        vfd vfd = r6;
        vfd vfd2 = new vfd((long) dea.m, 0, new eqe(eea.j), (jfd) null, (jqe) null, (Integer) null, new ffd(z, true), (zed) null, (jqe) null, 0, (wed) null, 1976);
        l.add(vfd);
        if (z) {
            l.add(new vfd((long) dea.k, 1, new eqe(eea.h), (jfd) null, (jqe) null, (Integer) null, new dfd(r, (Integer) null), (zed) null, (jqe) null, 0, (wed) null, 1976));
            l.add(new vfd((long) dea.d, 1, new eqe(eea.c), (jfd) null, (jqe) null, (Integer) null, new dfd(r2, (Integer) null), (zed) null, (jqe) null, 0, (wed) null, 1976));
            eqe eqe = new eqe(eea.n);
            cfd cfd = cfd.a;
            l.add(new vfd((long) dea.s, 1, eqe, (jfd) null, (jqe) null, (Integer) null, cfd, (zed) null, (jqe) null, 0, (wed) null, 1976));
            l.add(new vfd((long) dea.w, 0, new eqe(eea.q), (jfd) null, (jqe) null, (Integer) null, new ffd(z2, true), (zed) null, (jqe) null, 0, (wed) null, 1976));
            l.add(new vfd((long) dea.o, 2, new eqe(eea.l), (jfd) null, new eqe(eea.k), (Integer) null, cfd, (zed) null, (jqe) null, 0, (wed) null, 1832));
        }
        return j1e.d(l);
    }
}
