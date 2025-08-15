package defpackage;

import java.util.Map;

/* renamed from: yk4  reason: default package */
public final class yk4 extends rg4 {
    public final eab c;
    public final ide d;
    public final o84 e;

    public yk4(fi0 fi0, eab eab, ide ide, o84 o84) {
        super(fi0);
        this.c = eab;
        this.d = ide;
        this.e = o84;
    }

    public final void h(int i, Object obj) {
        g05 g05 = (g05) obj;
        eab eab = this.c;
        oj0 oj0 = (oj0) eab;
        oj0.c.j(eab, "DiskCacheWriteProducer");
        boolean b = fi0.b(i);
        hab hab = oj0.c;
        fi0 fi0 = this.b;
        if (!b && g05 != null && (i & 10) == 0) {
            g05.o0();
            if (g05.c != ou6.c) {
                o84 o84 = this.e;
                o84.getClass();
                wv6 wv6 = oj0.a;
                tpd d2 = o84.d(wv6.b);
                bl4 bl4 = (bl4) this.d.get();
                du0 l = tpa.l(wv6, (du0) bl4.d.getValue(), bl4.a(), (dx6) bl4.f.getValue());
                if (l == null) {
                    hab.d(eab, "DiskCacheWriteProducer", new Exception("Got no disk cache for CacheChoice: " + Integer.valueOf(wv6.a.ordinal()).toString()), (Map) null);
                    fi0.g(i, g05);
                    return;
                }
                l.d(d2, g05);
                hab.a(eab, "DiskCacheWriteProducer", (Map) null);
                fi0.g(i, g05);
                return;
            }
        }
        hab.a(eab, "DiskCacheWriteProducer", (Map) null);
        fi0.g(i, g05);
    }
}
