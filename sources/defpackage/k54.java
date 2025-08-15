package defpackage;

import java.util.concurrent.Executor;

/* renamed from: k54  reason: default package */
public final class k54 implements dab {
    public final ja6 a;
    public final Executor b;
    public final lu6 c;
    public final ey1 d;
    public final bp4 e;
    public final boolean f;
    public final boolean g;
    public final dab h;
    public final int i;
    public final wd6 j;

    public k54(ja6 ja6, Executor executor, lu6 lu6, ey1 ey1, bp4 bp4, boolean z, boolean z2, dab dab, int i2, wd6 wd6) {
        this.a = ja6;
        this.b = executor;
        this.c = lu6;
        this.d = ey1;
        this.e = bp4;
        this.f = z;
        this.g = z2;
        this.h = dab;
        this.i = i2;
        this.j = wd6;
    }

    public final void a(fi0 fi0, eab eab) {
        j54 j54;
        j54 j542;
        boolean W = f46.W();
        dab dab = this.h;
        ja6 ja6 = this.a;
        if (!W) {
            wv6 wv6 = ((oj0) eab).a;
            if (e9f.e(wv6.b) || xv6.c(wv6.b)) {
                fi0 fi02 = fi0;
                eab eab2 = eab;
                j542 = new h54(this, fi02, eab2, new knb(ja6), this.d, this.g, this.i);
            } else {
                j542 = new j54(this, fi0, eab, this.g, this.i);
            }
            dab.a(j542, eab);
            return;
        }
        f46.e("DecodeProducer#produceResults");
        try {
            wv6 wv62 = ((oj0) eab).a;
            if (e9f.e(wv62.b) || xv6.c(wv62.b)) {
                j54 = new h54(this, fi0, eab, new knb(ja6), this.d, this.g, this.i);
            } else {
                j54 = new j54(this, fi0, eab, this.g, this.i);
            }
            dab.a(j54, eab);
            f46.A();
        } catch (Throwable th) {
            f46.A();
            throw th;
        }
    }
}
