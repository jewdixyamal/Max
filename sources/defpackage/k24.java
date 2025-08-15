package defpackage;

import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: k24  reason: default package */
public final class k24 implements c34 {
    public final pfa a;
    public final elc b;
    public final vlc c;
    public final glc d;
    public final wlc e;
    public final jmc f;
    public final hmc g;
    public final imc h;
    public final yef i;
    public final a9f j;
    public final py8 k;
    public final up4 l;
    public final dp3 m = new Object();
    public final nd2 n = new nd2(0);
    public final hd1 o;
    public final c4e p;
    public final wc5 q;
    public final hc5 r;
    public final p9c s;
    public final ka4 t;
    public final gj u;

    /* JADX WARNING: type inference failed for: r1v7, types: [java.lang.Object, py8] */
    /* JADX WARNING: type inference failed for: r1v11, types: [dp3, java.lang.Object] */
    public k24(pfa pfa, o45 o45, vxc vxc, q33 q33, je7 je7, pk pkVar, kke kke, rj rjVar, je7 je72) {
        pfa pfa2 = pfa;
        kke kke2 = kke;
        this.a = pfa2;
        this.b = new elc(pfa, je72);
        vxc vxc2 = vxc;
        je7 je73 = je7;
        this.c = new vlc(pfa, vxc, new v07(kke2), je7);
        this.d = new glc((jlc) pfa);
        this.e = new wlc(pfa);
        o45 o452 = o45;
        this.f = new jmc(pfa, o45);
        this.g = new hmc(kke2, pfa);
        this.h = new imc((jlc) pfa);
        ? obj = new Object();
        obj.a = pfa2;
        this.k = obj;
        this.l = new up4(pfa);
        this.j = new a9f(new khe(new es3(5, pfa)));
        this.i = new yef(pfa);
        this.o = new hd1(pfa);
        this.p = new c4e(pfa);
        this.q = new wc5(pfa);
        this.r = new hc5(pfa);
        this.s = new p9c(pfa, q33);
        this.t = new ka4(pfa);
        this.u = new gj(pkVar, pfa, q33, kke, rjVar, o45);
    }

    public final void a() {
        ((OneMeRoomDatabase) this.a.m()).c();
    }

    public final void b() {
        ((OneMeRoomDatabase) this.a.m()).l();
    }

    public final void c() {
        ((OneMeRoomDatabase) this.a.m()).r();
    }
}
