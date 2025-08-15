package defpackage;

import java.util.HashMap;

/* renamed from: wef  reason: default package */
public final class wef {
    public final af8 a;
    public final yef b;
    public final zi5 c;
    public final ad d;
    public final fuc e;
    public final ztc f;
    public final euc g;
    public final msf h = new msf();
    public final HashMap i = new HashMap();

    public wef(af8 af8, yef yef, zi5 zi5, ad adVar, fuc fuc, ztc ztc, euc euc) {
        this.a = af8;
        this.b = yef;
        this.c = zi5;
        this.d = adVar;
        this.e = fuc;
        this.f = ztc;
        this.g = euc;
    }

    public final synchronized void a(lef lef) {
        this.i.remove(lef);
        nd7.U(new qa3(this.b.a(), 2, new sef(lef, 2)).l(), ft.e, new sef(lef, 0), new e5(21, lef));
    }
}
