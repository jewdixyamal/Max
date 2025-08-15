package defpackage;

import android.net.Uri;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: iv6  reason: default package */
public final class iv6 {
    public static final CancellationException l = new CancellationException("Prefetching is not enabled");
    public final kab a;
    public final ide b;
    public final ide c;
    public final p06 d;
    public final o06 e;
    public final lq8 f;
    public final lq8 g;
    public final o84 h;
    public final ide i;
    public final AtomicLong j = new AtomicLong();
    public final kv6 k;

    static {
        new CancellationException("ImageRequest is null");
        new CancellationException("Modified URL is null");
    }

    public iv6(kab kab, Set set, Set set2, nde nde, y7g y7g, y7g y7g2, ide ide, o84 o84, ide ide2, kv6 kv6) {
        this.a = kab;
        this.b = nde;
        this.c = ide;
        this.d = new p06(set);
        this.e = new o06(set2);
        this.f = y7g;
        this.g = y7g2;
        this.h = o84;
        this.i = ide2;
        this.k = kv6;
    }

    public final g0 a(wv6 wv6, Object obj) {
        return b(wv6, obj, (vv6) null, (uhc) null, (String) null);
    }

    public final g0 b(wv6 wv6, Object obj, vv6 vv6, uhc uhc, String str) {
        if (wv6 == null) {
            return ju0.x(new NullPointerException());
        }
        try {
            kab kab = this.a;
            kab.getClass();
            f46.I();
            q6b q6b = wv6.q;
            dab a2 = kab.a(wv6);
            if (q6b != null) {
                a2 = kab.f(a2);
            }
            dab dab = a2;
            if (vv6 == null) {
                vv6 = vv6.FULL_FETCH;
            }
            return h(dab, wv6, vv6, obj, uhc, str);
        } catch (Exception e2) {
            return ju0.x(e2);
        }
    }

    public final g0 c(wv6 wv6) {
        if (wv6.b != null) {
            try {
                dab d2 = this.a.d(wv6);
                if (wv6.i != null) {
                    xv6 b2 = xv6.b(wv6);
                    b2.d = null;
                    wv6 = b2.a();
                }
                return h(d2, wv6, vv6.FULL_FETCH, (Object) null, (uhc) null, (String) null);
            } catch (Exception e2) {
                return ju0.x(e2);
            }
        } else {
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    public final do0 d(wv6 wv6, t68 t68) {
        f46.I();
        q6b q6b = wv6.q;
        o84 o84 = this.h;
        return q6b != null ? o84.j(wv6, t68) : o84.b(wv6, t68);
    }

    public final p06 e(wv6 wv6, uhc uhc) {
        if (wv6 != null) {
            p06 p06 = this.d;
            uhc uhc2 = wv6.r;
            if (uhc == null) {
                if (uhc2 == null) {
                    return p06;
                }
                return new p06(p06, uhc2);
            } else if (uhc2 == null) {
                return new p06(p06, uhc);
            } else {
                return new p06(p06, uhc, uhc2);
            }
        } else {
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    public final g0 f(wv6 wv6, t68 t68) {
        f46.I();
        a9b a9b = a9b.b;
        CancellationException cancellationException = l;
        ide ide = this.i;
        kv6 kv6 = this.k;
        if (!((Boolean) this.b.get()).booleanValue()) {
            return ju0.x(cancellationException);
        }
        try {
            kv6.v.getClass();
            if (wv6 != null) {
                Boolean bool = wv6.p;
                boolean booleanValue = bool != null ? !bool.booleanValue() : ((Boolean) ide.get()).booleanValue();
                kab kab = this.a;
                return i(booleanValue ? kab.c(wv6) : kab.b(wv6), wv6, t68, a9b);
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (Exception e2) {
            return ju0.x(e2);
        }
    }

    public final g0 g(wv6 wv6) {
        a9b a9b = a9b.c;
        if (!((Boolean) this.b.get()).booleanValue()) {
            return ju0.x(l);
        }
        if (wv6 == null) {
            return ju0.x(new NullPointerException("imageRequest is null"));
        }
        try {
            return i(this.a.c(wv6), wv6, (t68) null, a9b);
        } catch (Exception e2) {
            return ju0.x(e2);
        }
    }

    public final g0 h(dab dab, wv6 wv6, vv6 vv6, Object obj, uhc uhc, String str) {
        boolean z;
        wv6 wv62 = wv6;
        f46.I();
        b47 b47 = new b47(e(wv6, uhc), this.e);
        try {
            vv6 vv62 = wv62.l;
            vv6 vv63 = vv6;
            vv6 vv64 = vv62.a > vv63.a ? vv62 : vv63;
            String valueOf = String.valueOf(this.j.getAndIncrement());
            if (!wv62.e) {
                if (e9f.e(wv62.b)) {
                    z = false;
                    oj0 oj0 = new oj0(wv6, valueOf, str, b47, obj, vv64, false, z, wv62.k, this.k);
                    f46.I();
                    dab dab2 = dab;
                    m43 m43 = new m43(dab, oj0, b47, 0);
                    f46.I();
                    return m43;
                }
            }
            z = true;
            oj0 oj02 = new oj0(wv6, valueOf, str, b47, obj, vv64, false, z, wv62.k, this.k);
            f46.I();
            dab dab22 = dab;
            m43 m432 = new m43(dab, oj02, b47, 0);
            f46.I();
            return m432;
        } catch (Exception e2) {
            return ju0.x(e2);
        }
    }

    public final g0 i(dab dab, wv6 wv6, t68 t68, a9b a9b) {
        wv6 wv62 = wv6;
        vv6 vv6 = vv6.FULL_FETCH;
        b47 b47 = new b47(e(wv62, (uhc) null), this.e);
        Uri uri = wv62.b;
        if (!uri.equals(uri)) {
            xv6 b2 = xv6.b(wv6);
            b2.a = uri;
            wv62 = b2.a();
        }
        wv6 wv63 = wv62;
        try {
            vv6 vv62 = wv63.l;
            vv6 vv63 = vv62.a > 1 ? vv62 : vv6;
            String valueOf = String.valueOf(this.j.getAndIncrement());
            kv6 kv6 = this.k;
            ho9 ho9 = kv6.v;
            return new m43(dab, new oj0(wv63, valueOf, (String) null, b47, t68, vv63, true, false, a9b, kv6), b47, 1);
        } catch (Exception e2) {
            return ju0.x(e2);
        }
    }
}
