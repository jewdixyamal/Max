package defpackage;

import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: xk4  reason: default package */
public final class xk4 implements dab {
    public final /* synthetic */ int a;
    public final ide b;
    public final o84 c;
    public final dab d;

    public /* synthetic */ xk4(ide ide, o84 o84, dab dab, int i) {
        this.a = i;
        this.b = ide;
        this.c = o84;
        this.d = dab;
    }

    public static Map c(b47 b47, eab eab, boolean z, int i) {
        if (!b47.i(eab, "DiskCacheProducer")) {
            return null;
        }
        return z ? dx6.b("cached_value_found", String.valueOf(z), "encodedImageSize", String.valueOf(i)) : dx6.a("cached_value_found", String.valueOf(z));
    }

    public final void a(fi0 fi0, eab eab) {
        switch (this.a) {
            case 0:
                oj0 oj0 = (oj0) eab;
                wv6 wv6 = oj0.a;
                if (!wv6.d(16)) {
                    d(fi0, eab);
                    return;
                }
                hab hab = oj0.c;
                hab.j(eab, "DiskCacheProducer");
                o84 o84 = this.c;
                o84.getClass();
                tpd d2 = o84.d(wv6.b);
                bl4 bl4 = (bl4) this.b.get();
                du0 l = tpa.l(wv6, (du0) bl4.d.getValue(), bl4.a(), (dx6) bl4.f.getValue());
                if (l == null) {
                    hab.d(eab, "DiskCacheProducer", new Exception("Got no disk cache for CacheChoice: " + Integer.valueOf(wv6.a.ordinal()).toString()), (Map) null);
                    d(fi0, eab);
                    return;
                }
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                l.b(d2, atomicBoolean).continueWith(new vk4(this, (b47) hab, eab, fi0));
                oj0.a(new wk4(0, atomicBoolean));
                return;
            default:
                oj0 oj02 = (oj0) eab;
                if (oj02.X.a >= 2) {
                    oj02.h("disk", "nil-result_write");
                    fi0.g(1, (Object) null);
                    return;
                }
                if (oj02.a.d(32)) {
                    fi0 = new yk4(fi0, eab, this.b, this.c);
                }
                this.d.a(fi0, eab);
                return;
        }
    }

    public void d(fi0 fi0, eab eab) {
        oj0 oj0 = (oj0) eab;
        if (oj0.X.a >= 2) {
            oj0.h("disk", "nil-result_read");
            fi0.g(1, (Object) null);
            return;
        }
        this.d.a(fi0, eab);
    }
}
