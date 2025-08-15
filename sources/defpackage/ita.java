package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* renamed from: ita  reason: default package */
public final class ita {
    public final ax7 a;
    public final je7 b;
    public final je7 c;
    public final yo d = yo.a;

    public ita(ax7 ax7, je7 je7, je7 je72) {
        this.a = ax7;
        this.b = je72;
        this.c = je7;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [e47, java.lang.Object] */
    public final ms7 a(zsa zsa, ky7 ky7) {
        ? obj = new Object();
        obj.c = "PERF";
        obj.o = zsa.a;
        obj.b = ((hyc) ((q33) this.b.getValue())).t();
        obj.a = System.currentTimeMillis();
        obj.b(ky7);
        return obj.c();
    }

    public final ky7 b(boolean z, boolean z2, int i, int i2, List list) {
        kl7 l = j1e.l();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bta bta = (bta) it.next();
            ky7 ky7 = new ky7();
            ky7.put("name", bta.a.a);
            long j = bta.e;
            Long valueOf = Long.valueOf(j);
            Long l2 = null;
            if (j == -1) {
                valueOf = null;
            }
            if (valueOf != null) {
                ky7.put("duration", Long.valueOf(bta.e));
            }
            long j2 = bta.f;
            Long valueOf2 = Long.valueOf(j2);
            if (j2 == -1) {
                valueOf2 = null;
            }
            if (valueOf2 != null) {
                ky7.put("span_id", Long.valueOf(bta.f));
            }
            long j3 = bta.g;
            Long valueOf3 = Long.valueOf(j3);
            if (j3 != -1) {
                l2 = valueOf3;
            }
            if (l2 != null) {
                ky7.put("parent_span_id", Long.valueOf(bta.g));
            }
            List<dta> list2 = bta.h;
            if (list2 != null) {
                for (dta dta : list2) {
                    dta.getClass();
                    ky7.put("hasData", dta.a);
                }
            }
            l.add(ky7.b());
        }
        kl7 d2 = j1e.d(l);
        ky7 ky72 = new ky7();
        ky72.put("session_id", Long.valueOf(((t33) ((q33) this.b.getValue())).F()));
        ky72.put("start_type", z ? "cold" : "warm");
        if (z2) {
            ky72.put("source", "push");
        }
        ky72.put("trace_id", UUID.randomUUID().toString());
        ky72.put("spans", d2);
        int i3 = 1;
        if (i != 1) {
            if (i == 2) {
                i3 = 0;
            } else {
                throw null;
            }
        }
        ky72.put("status", Integer.valueOf(i3));
        if (i2 != 0) {
            ky72.put("errorType", Integer.valueOf(au1.s(i2)));
        }
        return ky72.b();
    }

    public final void c() {
        this.d.getClass();
        if (yo.c) {
            cta cta = cta.APP_INIT;
            qi9 qi9 = yo.b;
            bta bta = (bta) qi9.f(cta);
            eta eta = bta != null ? new eta(bta.e, x53.D0(new ky5(qi9))) : null;
            if (eta != null) {
                ((ad) this.c.getValue()).j(a(zsa.APP_INIT, b(true, this.a.i, 1, 0, eta.a)));
                for (bta bta2 : eta.a) {
                    yo.b.i(bta2.a);
                }
                yo.c = false;
            }
        }
    }

    public final void d(int i, int i2) {
        this.d.getClass();
        boolean z = yo.c;
        ax7 ax7 = this.a;
        boolean z2 = ax7.i;
        c();
        zsa zsa = zsa.EVENT_OPEN_CHAT;
        eta c2 = ax7.c(zsa);
        if (c2 != null) {
            bta bta = new bta(cta.OPEN_CHAT_ROOT_SPAN, -1);
            bta.e = c2.b;
            List singletonList = Collections.singletonList(bta);
            List list = c2.a;
            ((ad) this.c.getValue()).j(a(zsa, b(z, z2, i, i2, x53.t0(singletonList, list))));
            ax7.e(zsa, list);
        }
    }

    public final void e(int i, int i2) {
        this.d.getClass();
        boolean z = yo.c;
        ax7 ax7 = this.a;
        boolean z2 = ax7.i;
        c();
        zsa zsa = zsa.EVENT_OPEN_CHATS;
        eta c2 = ax7.c(zsa);
        if (c2 != null) {
            bta bta = new bta(cta.OPEN_CHATS_ROOT_SPAN, -1);
            bta.e = c2.b;
            List singletonList = Collections.singletonList(bta);
            List list = c2.a;
            ((ad) this.c.getValue()).j(a(zsa, b(z, z2, i, i2, x53.t0(singletonList, list))));
            ax7.e(zsa, list);
        }
    }
}
