package defpackage;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: oi4  reason: default package */
public final class oi4 implements pi4 {
    public final long a;
    public final long b;
    public final w7c c;

    public oi4() {
        AtomicLong atomicLong = ei4.b;
        long incrementAndGet = atomicLong.incrementAndGet();
        this.a = incrementAndGet;
        long incrementAndGet2 = atomicLong.incrementAndGet();
        this.b = incrementAndGet2;
        eqe eqe = new eqe(m0c.oneme_settings_old_dev_menu);
        int i = woc.S;
        z44 z44 = z44.e;
        this.c = new w7c(r0e.a(y53.M(new b54(incrementAndGet, eqe, i, (jqe) null, z44, 8), new b54(incrementAndGet2, new eqe(m0c.oneme_settings_old_logs_menu), woc.e, (jqe) null, z44, 8))));
    }

    public final j0e c() {
        return this.c;
    }

    public final void d(b54 b54) {
        long j = b54.a;
        if (ei4.a(j, this.b)) {
            hi4.c.P1().b(":settings/dev/logsviewer", (Bundle) null);
        } else if (ei4.a(j, this.a)) {
            hi4.c.P1().b(":settings/dev/showroom", (Bundle) null);
        }
    }
}
