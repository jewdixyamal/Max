package defpackage;

import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: l82  reason: default package */
public final /* synthetic */ class l82 implements qj3 {
    public final /* synthetic */ AtomicBoolean X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ p82 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int o;

    public /* synthetic */ l82(p82 p82, long j, long j2, int i, AtomicBoolean atomicBoolean, boolean z) {
        this.a = p82;
        this.b = j;
        this.c = j2;
        this.o = i;
        this.X = atomicBoolean;
        this.Y = z;
    }

    public final void accept(Object obj) {
        u82 u82 = (u82) obj;
        p82 p82 = this.a;
        p82.getClass();
        Map d = u82.d();
        long j = this.b;
        Long l = (Long) d.get(Long.valueOf(j));
        if (l != null) {
            long longValue = l.longValue();
            long j2 = this.c;
            boolean z = false;
            boolean z2 = longValue != j2;
            if (z2) {
                d.put(Long.valueOf(j), Long.valueOf(j2));
            }
            int i = this.o;
            if (i >= 0) {
                u82.m = i;
            }
            if (this.Y && z2 && j == p82.K()) {
                z = true;
            }
            this.X.set(z);
        }
    }
}
