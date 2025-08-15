package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;

/* renamed from: yx7  reason: default package */
public final class yx7 {
    public final p82 a;
    public final ztc b;
    public final ztc c;
    public final mle d;
    public final av0 e;
    public final fme f;
    public final o45 g;
    public final long h;
    public px7 i;
    public td7 j;
    public iq1 k;
    public iq1 l;
    public iq1 m;
    public ArrayList n = new ArrayList();
    public volatile List o = new ArrayList();
    public final ArrayList p = new ArrayList();
    public final ArrayList q = new ArrayList();
    public String r;
    public String s = "";
    public final jt3 t;

    public yx7(p82 p82, el3 el3, b0d b0d, oq3 oq3, ztc ztc, ztc ztc2, mle mle, av0 av0, fme fme, boolean z, o45 o45, y7d y7d) {
        this.a = p82;
        this.b = ztc2;
        this.c = ztc;
        this.d = mle;
        this.e = av0;
        this.f = fme;
        this.g = o45;
        this.h = el3.i(((p7b) el3.h).a.t(), false).n();
        this.t = new jt3((Object) new ux7(p82, el3, oq3, b0d, z, y7d));
    }

    public final void a() {
        if (!cqc.c(this.j)) {
            td7 td7 = this.j;
            td7.getClass();
            zae.a(td7);
            try {
                this.e.f(this);
            } catch (Exception unused) {
            }
        }
        this.n.clear();
        this.r = null;
        this.s = "";
    }

    public final void b() {
        if (!cqc.c(this.k)) {
            iq1 iq1 = this.k;
            iq1.getClass();
            dm4.a(iq1);
            try {
                this.e.f(this);
            } catch (Exception unused) {
            }
        }
        this.p.clear();
        this.o.clear();
    }

    public final void c() {
        if (!cqc.c(this.l)) {
            iq1 iq1 = this.l;
            iq1.getClass();
            dm4.a(iq1);
        }
        this.q.clear();
        this.s = "";
    }

    public final void d() {
        hm9.m("yx7", "clear", new Object[0]);
        a();
        b();
        c();
    }

    public final drd e(String str) {
        gs9 gs9 = new gs9((sla) null, 4);
        gs9.p("query", str);
        gs9.e(5, NewHtcHomeBadger.COUNT);
        gs9.p("type", "ALL");
        tle tle = (tle) this.d;
        tle.getClass();
        q1a q1a = new q1a(1, new ypc(tle, 9, gs9));
        ztc ztc = this.c;
        return new frd(q1a.i(ztc).h(new rx7(this, 2)).h(new kp7(5)), new kp7(6), (Object) null).m(ztc);
    }

    @uae
    public void onEvent(vz2 vz2) {
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            e52 e52 = ((kzc) it.next()).o;
            if (e52 != null && vz2.b.contains(Long.valueOf(e52.a))) {
                cqc.b(this.m);
                this.m = cqc.a(new e5(11, this), this.c, (f6) null, new kp7(13), (ztc) null);
                return;
            }
        }
    }
}
