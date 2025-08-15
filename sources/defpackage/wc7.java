package defpackage;

/* renamed from: wc7  reason: default package */
public final class wc7 {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public volatile boolean e;

    public wc7(je7 je7, je7 je72, je7 je73, je7 je74) {
        this.a = je7;
        this.b = je72;
        this.c = je73;
        this.d = je74;
    }

    public final void a() {
        if (!this.e) {
            this.e = true;
            o2e o2e = (o2e) this.a.getValue();
            o2e.getClass();
            cqc.a(new j2e(o2e, 1), o2e.h, (f6) null, new m2e(8), (ztc) null);
            md5 md5 = (md5) this.b.getValue();
            md5.getClass();
            s1a r = new iz9(new ld5(0, md5), 0).r((ztc) md5.d.get());
            rm4 rm4 = md5.c;
            r0a n = r.n((ztc) rm4.get());
            kd5 kd5 = new kd5(md5, 1);
            nc5 nc5 = new nc5(19);
            r66 r66 = ft.d;
            n.a(new sd7(kd5, nc5, r66));
            r0a n2 = md5.i.n((ztc) rm4.get());
            nc5 nc52 = new nc5(20);
            kj6 kj6 = ft.e;
            new oz9(n2, nc52, kj6, r66).f(new kd5(md5, 2)).a(new sd7(new kd5(md5, 3), new nc5(21), r66));
            sc5 sc5 = (sc5) this.c.getValue();
            q28 q28 = new q28(sc5.b(), new ta4(27), 3);
            je7 je7 = sc5.o;
            q28.r((ztc) je7.getValue()).n((ztc) je7.getValue()).a(new sd7(new kc5(sc5, 1), new ta4(28), r66));
            new oz9(sc5.Z.n((ztc) je7.getValue()), new ta4(29), kj6, r66).f(new kc5(sc5, 2)).a(new sd7(new kc5(sc5, 3), new nc5(0), r66));
            b6e b6e = (b6e) this.d.getValue();
        }
    }
}
