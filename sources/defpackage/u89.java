package defpackage;

/* renamed from: u89  reason: default package */
public final class u89 extends pnf {
    public final s35 X = new s35(0);
    public final hp b;
    public final q0e c;
    public final w7c o;

    public u89(hp hpVar) {
        this.b = hpVar;
        q0e a = r0e.a(nz4.a);
        this.c = a;
        this.o = new w7c(a);
        q();
    }

    public final void q() {
        kl7 l = j1e.l();
        vfd vfd = r2;
        vfd vfd2 = new vfd(Long.MAX_VALUE, 0, new eqe(vda.a), (jfd) null, (jqe) null, (Integer) null, new ffd(((jp) this.b).g.getBoolean("app.messages.send.by.enter", false), true), (zed) null, (jqe) null, 0, (wed) null, 1976);
        l.add(vfd);
        l.add(new vfd(9223372036854775806L, 0, new eqe(vda.b), (jfd) null, (jqe) null, (Integer) null, cfd.a, (zed) null, (jqe) null, 0, (wed) null, 1976));
        kl7 d = j1e.d(l);
        this.c.setValue(d);
        String name = u89.class.getName();
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, name, zr6.h(d.getSize(), "process sections. finish, size:"), (Throwable) null);
        }
    }
}
