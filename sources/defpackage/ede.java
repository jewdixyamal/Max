package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: ede  reason: default package */
public final class ede implements bde {
    public final pk a;
    public final av0 b;
    public final p82 c;
    public final dq0 d;
    public final ece e;
    public final y8 f;
    public final ztc g;
    public final b0d h;
    public final bdb i;
    public final m7b j;
    public final u7b k;
    public final hbd l;
    public final je7 m;
    public e52 n;
    public final ArrayList o = new ArrayList();
    public final ArrayList p = new ArrayList();
    public iq1 q;
    public iq1 r;
    public final je7 s;

    public ede(pk pkVar, av0 av0, p82 p82, dq0 dq0, e52 e52, ztc ztc, b0d b0d, ida ida, m7b m7b, u7b u7b, hbd hbd) {
        je7 je7 = iyc.z;
        je7 je72 = iyc.q;
        this.b = av0;
        this.c = p82;
        this.d = dq0;
        j92 j92 = e52.b.b;
        this.f = new y8((Object) j92);
        this.n = e52;
        this.a = pkVar;
        this.e = new ece(j92);
        this.g = ztc;
        this.h = b0d;
        this.j = m7b;
        this.k = u7b;
        this.l = hbd;
        this.i = new bdb((Object) b0d, 7, (Object) ida);
        this.s = je7;
        this.m = je72;
        av0.d(this);
        d();
    }

    public final q1a a(int i2, String str) {
        return new q1a(1, new ui0((Object) this, (Object) str, i2, 12));
    }

    public final List b(LinkedHashSet linkedHashSet) {
        dce c2 = c();
        this.e.getClass();
        return c2.l(linkedHashSet);
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [qi8, dce, java.lang.Object] */
    public final dce c() {
        if (((jbd) this.l).h != 3 || this.n.b.e.size() >= this.n.b.c()) {
            return new q40(this.h, this.i, this.j, this.k, this.s, new dde(this));
        }
        long j2 = this.n.b.a;
        pk pkVar = this.a;
        bdb bdb = this.i;
        ztc ztc = this.g;
        je7 je7 = this.s;
        ? obj = new Object();
        obj.o = j2;
        obj.a = pkVar;
        obj.b = bdb;
        obj.c = ztc;
        obj.X = je7;
        return obj;
    }

    public final void clear() {
        this.o.clear();
        this.p.clear();
        try {
            this.b.f(this);
        } catch (Exception unused) {
        }
    }

    public final void d() {
        cqc.b(this.r);
        if (e()) {
            long j2 = this.n.b.a;
            au auVar = new au((sla) null, 12);
            auVar.i(j2, ApiProtocol.PARAM_CHAT_ID);
            drd K = ((k4a) this.a).K(auVar, muc.b());
            iq1 iq1 = new iq1(new dde(this), 2, new m2e(25));
            K.k(iq1);
            this.r = iq1;
        }
    }

    public final boolean e() {
        e52 e52 = this.n;
        return e52.b.a != 0 && e52.e0() && this.n.C() && this.n.n0();
    }

    @uae
    public void onEvent(vz2 vz2) {
        e52 e52 = this.n;
        if (e52 != null && vz2.b.contains(Long.valueOf(e52.a))) {
            cqc.b(this.q);
            this.q = cqc.a(new e5(16, this), this.g, (f6) null, new m2e(24), (ztc) null);
        }
    }
}
