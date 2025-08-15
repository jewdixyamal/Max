package defpackage;

/* renamed from: im2  reason: default package */
public final class im2 extends pnf {
    public final w7c X;
    public final je7 b;
    public final je7 c;
    public final q0e o;

    public im2() {
        sw9 sw9 = sw9.a;
        khe d = sw9.getAccessor().d(hp.class);
        this.b = sw9.getAccessor().d(pk.class);
        this.c = d;
        q0e a = r0e.a(nz4.a);
        this.o = a;
        this.X = new w7c(a);
        a.setValue(q());
    }

    public final kl7 q() {
        kl7 l = j1e.l();
        boolean z = false;
        boolean z2 = ((kxc) r()).o() != 1;
        boolean z3 = ((kxc) r()).o() == 0;
        if (((kxc) r()).o() == 2) {
            z = true;
        }
        vfd vfd = r5;
        vfd vfd2 = new vfd((long) dea.a, 0, new eqe(eea.a), (jfd) null, (jqe) null, (Integer) null, new ffd(z2, true), (zed) null, (jqe) null, 0, (wed) null, 1976);
        l.add(vfd);
        if (z2) {
            l.add(new vfd((long) dea.f, 1, new eqe(eea.e), (jfd) null, (jqe) null, (Integer) null, new efd(z3, true), (zed) null, (jqe) null, 0, (wed) null, 1976));
            l.add(new vfd((long) dea.g, 1, new eqe(eea.f), (jfd) null, (jqe) null, (Integer) null, new efd(z, true), (zed) null, (jqe) null, 0, (wed) null, 1976));
        }
        return j1e.d(l);
    }

    public final hp r() {
        return (hp) this.c.getValue();
    }

    public final void s(long j) {
        if (j == ((long) dea.a)) {
            int i = 1;
            if (((kxc) r()).o() == 1) {
                i = ((kxc) r()).g.getInt("app.notification.chats.show.last", 0);
            }
            t(i);
        } else if (j == ((long) dea.f)) {
            t(0);
        } else if (j == ((long) dea.g)) {
            t(2);
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, eaf] */
    public final void t(int i) {
        String str = i != 1 ? i != 2 ? "ON" : "REPLY" : "OFF";
        ((kxc) r()).s(i);
        ? obj = new Object();
        obj.d = str;
        ((pk) this.b.getValue()).a(new gaf(obj));
        this.o.setValue(q());
    }
}
