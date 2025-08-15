package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: a4e  reason: default package */
public final class a4e implements qu7 {
    public final ztc X;
    public final fme Y;
    public final c4e a;
    public final e4e b;
    public final pk c;
    public final ztc o;

    public a4e(c4e c4e, e4e e4e, pk pkVar, ztc ztc, ztc ztc2, fme fme) {
        this.a = c4e;
        this.b = e4e;
        this.c = pkVar;
        this.o = ztc;
        this.X = ztc2;
        this.Y = fme;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, k3e] */
    public static q3e e(n3e n3e) {
        long j = n3e.a;
        ? obj = new Object();
        obj.a = j;
        obj.b = n3e.b;
        obj.c = n3e.c;
        obj.d = n3e.d;
        obj.e = n3e.e;
        obj.f = n3e.f;
        obj.g = n3e.g;
        obj.h = n3e.h;
        obj.i = n3e.i;
        return new q3e(obj);
    }

    public final void a() {
        hm9.m("a4e", "clear: ", new Object[0]);
        nd7.U(new qa3(this.a.a.n().h(new m2e(21)), 2, new m2e(17)).l(), ft.e, new m2e(13), new fa4(11));
    }

    public final s1a b(long j) {
        i28 i28 = new i28(new f38[]{new s28(this.a.a(new long[]{j}), new m2e(18), 0), new o28(d(Collections.singletonList(Long.valueOf(j))), 2, new m2e(15))}, 0);
        x3e x3e = new x3e(this, 2);
        hm9.j0(2, "prefetch");
        return new mz9(new hb3(5, new dr5(i28, x3e)), 0).r(this.X);
    }

    public final uqd c(List list) {
        return new q28(new uqd(new ib3(this.a.a(nd7.j(list)), 1, new q1a(2, new ae(1))), new y3e(this, list, 1), 0), new jj9(2), 3).f(new x3e(this, 2)).w(new eme(list, new m2e(16)));
    }

    public final drd d(List list) {
        hm9.m("a4e", "getStickersSetsFromNetwork: %s", list);
        au auVar = new au(3, nd7.j(list));
        ztc ztc = this.o;
        rqd rqd = new rqd(new e0a(new q28(((k4a) this.c).K(auVar, ztc).h(new gd1(12, eu.class)).h(new m2e(14)), new jj9(2), 3), new x3e(this, 0), 3).v(), new x3e(this, 1), 2);
        fme fme = this.Y;
        fme.getClass();
        return rqd.j(new dme(fme, 2, 0)).m(ztc);
    }
}
