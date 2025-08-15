package defpackage;

import android.os.Bundle;
import java.lang.Thread;
import java.util.EnumMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: ate  reason: default package */
public final class ate implements pi4 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final EnumMap e = new EnumMap(Thread.State.class);
    public final ContextScope f;
    public z87 g;
    public final wwc h;

    public ate(je7 je7) {
        AtomicLong atomicLong = ei4.b;
        this.a = atomicLong.incrementAndGet();
        this.b = atomicLong.incrementAndGet();
        this.c = atomicLong.incrementAndGet();
        this.d = atomicLong.incrementAndGet();
        this.f = j1e.a(((w9a) ((kke) je7.getValue())).a());
        e5f e5f = e5f.a;
        ua3 ua3 = new ua3((x77) null);
        ua3.makeCompleting$kotlinx_coroutines_core(e5f);
        this.g = ua3;
        this.h = new wwc(this);
    }

    public final j0e c() {
        return this.h;
    }

    /* JADX WARNING: type inference failed for: r5v5, types: [a66, ffe] */
    public final void d(b54 b54) {
        long j = b54.a;
        if (ei4.a(j, this.a) && !this.g.isActive()) {
            this.g = j47.T(this.f, (lx3) null, (vx3) null, new ffe(2, (Continuation) null), 3);
        } else if (ei4.a(j, this.d)) {
            hi4.c.P1().b(":settings/dev/threadsviewer", (Bundle) null);
        }
    }
}
