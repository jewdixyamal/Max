package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: kab  reason: default package */
public final class kab {
    public final khe A;
    public final khe B;
    public final khe C;
    public final ContentResolver a;
    public final gab b;
    public final mr0 c;
    public final boolean d;
    public final aab e;
    public final bp4 f;
    public final boolean g;
    public final zv6 h;
    public final Set i;
    public final LinkedHashMap j = new LinkedHashMap();
    public final LinkedHashMap k = new LinkedHashMap();
    public final khe l;
    public final khe m;
    public final khe n;
    public final khe o;
    public final khe p;
    public final khe q;
    public final khe r;
    public final khe s;
    public final khe t;
    public final khe u;
    public final khe v;
    public final khe w;
    public final khe x;
    public final khe y;
    public final khe z;

    public kab(ContentResolver contentResolver, gab gab, mr0 mr0, boolean z2, aab aab, bp4 bp4, boolean z3, zv6 zv6, Set set) {
        this.a = contentResolver;
        this.b = gab;
        this.c = mr0;
        this.d = z2;
        this.e = aab;
        this.f = bp4;
        this.g = z3;
        this.h = zv6;
        this.i = set;
        new LinkedHashMap();
        this.l = new khe(new jab(this, 0));
        this.m = new khe(new jab(this, 17));
        this.n = new khe(new jab(this, 1));
        this.o = new khe(new jab(this, 2));
        this.p = new khe(new jab(this, 3));
        this.q = new khe(new jab(this, 4));
        this.r = new khe(new jab(this, 5));
        this.s = new khe(new jab(this, 6));
        this.t = new khe(new jab(this, 7));
        this.u = new khe(new jab(this, 8));
        this.v = new khe(new jab(this, 9));
        this.w = new khe(new jab(this, 10));
        this.x = new khe(new jab(this, 11));
        this.y = new khe(new jab(this, 12));
        this.z = new khe(new jab(this, 13));
        this.A = new khe(new jab(this, 14));
        this.B = new khe(new jab(this, 15));
        this.C = new khe(new jab(this, 16));
    }

    public final dab a(wv6 wv6) {
        f46.I();
        Uri uri = wv6.b;
        int i2 = wv6.c;
        if (i2 == 0) {
            return (dab) this.o.getValue();
        }
        khe khe = this.w;
        boolean z2 = wv6.g;
        switch (i2) {
            case 2:
                return z2 ? e() : (dab) khe.getValue();
            case 3:
                return z2 ? e() : (dab) this.v.getValue();
            case 4:
                if (z2) {
                    return e();
                }
                String type = this.a.getType(uri);
                Map map = ym8.a;
                boolean z3 = false;
                if (type != null) {
                    z3 = eae.o0(type, "video/", false);
                }
                return z3 ? (dab) khe.getValue() : (dab) this.x.getValue();
            case 5:
                return (dab) this.B.getValue();
            case 6:
                return (dab) this.A.getValue();
            case 7:
                return (dab) this.C.getValue();
            case 8:
                return (dab) this.z.getValue();
            default:
                Set set = this.i;
                if (set != null) {
                    Iterator it = set.iterator();
                    if (it.hasNext()) {
                        au1.r(it.next());
                        throw null;
                    }
                }
                throw new IllegalArgumentException(wg0.i("Unsupported uri scheme! Uri is: ", nd2.d(uri)));
        }
    }

    public final dab b(wv6 wv6) {
        dab dab;
        dab a2 = a(wv6);
        synchronized (this) {
            dab = (dab) this.k.get(a2);
            if (dab == null) {
                this.b.getClass();
                dab = new r9(a2, 2);
                this.k.put(a2, dab);
            }
        }
        return dab;
    }

    public final dab c(wv6 wv6) {
        nd2.f(wv6);
        int i2 = wv6.c;
        if (i2 == 0) {
            return (dab) this.q.getValue();
        }
        if (i2 == 2 || i2 == 3) {
            return (dab) this.s.getValue();
        }
        throw new IllegalArgumentException(wg0.i("Unsupported uri scheme for encoded image fetch! Uri is: ", nd2.d(wv6.b)));
    }

    public final dab d(wv6 wv6) {
        f46.I();
        int i2 = wv6.c;
        nd2.f(wv6);
        if (i2 == 0) {
            return (dab) this.l.getValue();
        }
        if (i2 == 2 || i2 == 3) {
            return (dab) this.m.getValue();
        }
        if (i2 == 4) {
            return (dab) this.n.getValue();
        }
        Set set = this.i;
        if (set != null) {
            Iterator it = set.iterator();
            if (it.hasNext()) {
                au1.r(it.next());
                throw null;
            }
        }
        throw new IllegalArgumentException(wg0.i("Unsupported uri scheme for encoded image fetch! Uri is: ", nd2.d(wv6.b)));
    }

    public final dab e() {
        return (dab) this.y.getValue();
    }

    public final synchronized dab f(dab dab) {
        dab dab2;
        dab2 = (dab) this.j.get(dab);
        if (dab2 == null) {
            gab gab = this.b;
            un9 un9 = new un9(dab, gab.p, (Executor) gab.j.d());
            gab gab2 = this.b;
            fo0 fo0 = new fo0((y7g) gab2.n, gab2.o, un9, 2);
            this.j.put(dab, fo0);
            dab2 = fo0;
        }
        return dab2;
    }

    public final dab g(dab dab) {
        gab gab = this.b;
        lq8 lq8 = gab.n;
        o84 o84 = gab.o;
        return new fo0(gab.n, o84, new sse(new eo0(o84, new fo0(lq8, o84, dab, 0)), this.e, 0), 0);
    }

    public final dab h(dab dab) {
        boolean W = f46.W();
        gab gab = this.b;
        if (!W) {
            return g(gab.a(dab));
        }
        f46.e("ProducerSequenceFactory#newBitmapCacheGetToDecodeSequence");
        try {
            return g(gab.a(dab));
        } finally {
            f46.A();
        }
    }

    public final dab i(jp7 jp7, nte[] nteArr) {
        r9 r9Var = new r9(k(jp7), 0);
        gab gab = this.b;
        zv6 zv6 = this.h;
        return h(new sse(gab.b(new r9(nteArr), true, zv6), new ite(gab.j.c(), gab.b(r9Var, true, zv6)), 1));
    }

    public final synchronized iic j(mr0 mr0) {
        gab gab;
        try {
            f46.I();
            gab = this.b;
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return this.b.b(new r9(k(new un9(gab.k, gab.d, mr0)), 0), this.d && this.f != bp4.c, this.h);
    }

    public final eo0 k(dab dab) {
        boolean z2 = this.g;
        gab gab = this.b;
        if (z2) {
            f46.I();
            ide ide = gab.l;
            o84 o84 = gab.o;
            dab = new xk4(ide, o84, new xk4(ide, o84, dab, 1), 0);
        }
        o84 o842 = gab.o;
        return new eo0(o842, gab.s, new fo0((y7g) gab.m, o842, dab, 1));
    }
}
