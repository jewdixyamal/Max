package defpackage;

import java.util.Collections;

/* renamed from: o9d  reason: default package */
public final class o9d extends d8d {
    public final long b;
    public final long c;

    public o9d(l7 l7Var) {
        this.b = l7Var.b;
        this.c = l7Var.c;
    }

    public final void x() {
        long j;
        String name = o9d.class.getName();
        long j2 = this.b;
        Long valueOf = Long.valueOf(j2);
        long j3 = this.c;
        hm9.m(name, "process, chatId = %d, botId = %d, suspend = %b", valueOf, Long.valueOf(j3), Boolean.TRUE);
        if (g().C(j2) != null) {
            p82 g = g();
            g.getClass();
            g.h(j2, false, new l01(true, 1));
            g().p(j2);
            k4a k4a = (k4a) a();
            long j4 = this.b;
            if (!k4a.o(j4)) {
                j = 0;
            } else {
                j = ome.d(k4a.z(), new xee(((p7b) k4a.y()).a.o(), j4, true, this.c), false, 0, 12);
            }
            t().c(new vz2(Collections.singletonList(Long.valueOf(j2)), true, false, (mg4) null, (h9b) null, 124));
            t().c(new ps3(j, Collections.singletonList(Long.valueOf(j3))));
            t().c(new yee(j2));
        }
    }
}
