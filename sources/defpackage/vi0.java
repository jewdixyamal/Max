package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: vi0  reason: default package */
public final /* synthetic */ class vi0 implements qj3, grd {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object o;

    public /* synthetic */ vi0(zf2 zf2, long j, boolean z) {
        this.o = zf2;
        this.b = j;
        this.c = z;
    }

    public void accept(Object obj) {
        Map map = (Map) obj;
        qy7 qy7 = (qy7) this.o;
        qy7.getClass();
        boolean z = this.c;
        sn0 sn0 = z ? (sn0) map.get(uy7.a) : (sn0) map.get(uy7.c);
        for (xi0 xi0 : qy7.b.values()) {
            int i = (xi0.b.j > this.b ? 1 : (xi0.b.j == this.b ? 0 : -1));
            y8 y8Var = xi0.a;
            if (i != 0) {
                y8Var.G(sn0);
            } else if (z) {
                y8Var.G((sn0) map.get(uy7.b));
            } else {
                y8Var.G((sn0) map.get(uy7.o));
            }
            y8Var.I();
        }
    }

    public void j(nqd nqd) {
        long j = this.b;
        Object obj = this.o;
        switch (this.a) {
            case 1:
                zf2 zf2 = (zf2) obj;
                zf2.getClass();
                hm9.m("zf2", "loadNetworkPrevPage, messageId = " + j, new Object[0]);
                au8 au8 = zf2.r;
                cu8 q = au8.q(j);
                ArrayList l = ((k24) au8.a).c.l(zf2.a, q != null ? q.o : Long.MAX_VALUE, zf2.f, (Integer) null, this.c);
                ArrayList b2 = zf2.u.b(l);
                Iterator it = l.iterator();
                while (it.hasNext()) {
                    zf2.t.e((cu8) it.next());
                }
                nqd.a(b2);
                return;
            default:
                el3 el3 = (el3) obj;
                el3.b();
                uj3 h = el3.h(j, this.c);
                if (h != null) {
                    if (!nqd.h()) {
                        nqd.a(h);
                        return;
                    }
                    return;
                } else if (!nqd.h()) {
                    nqd.onError(new Exception(ey8.h(j, "contact not found: ")));
                    return;
                } else {
                    return;
                }
        }
    }

    public /* synthetic */ vi0(el3 el3, long j) {
        this.o = el3;
        this.b = j;
        this.c = false;
    }

    public /* synthetic */ vi0(qy7 qy7, boolean z, long j) {
        this.o = qy7;
        this.c = z;
        this.b = j;
    }
}
