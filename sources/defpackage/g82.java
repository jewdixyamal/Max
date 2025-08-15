package defpackage;

import java.util.Map;

/* renamed from: g82  reason: default package */
public final /* synthetic */ class g82 implements sj3 {
    public final /* synthetic */ p82 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Integer d = null;
    public final /* synthetic */ boolean e = true;
    public final /* synthetic */ long f;

    public /* synthetic */ g82(p82 p82, long j, long j2, long j3) {
        this.a = p82;
        this.b = j;
        this.c = j2;
        this.f = j3;
    }

    public final void accept(Object obj) {
        u82 u82 = (u82) obj;
        p82 p82 = this.a;
        p82.getClass();
        Map d2 = u82.d();
        long j = this.b;
        Long l = (Long) d2.get(Long.valueOf(j));
        if (l != null) {
            long longValue = l.longValue();
            long j2 = this.c;
            boolean z = longValue != j2;
            if (z) {
                d2.put(Long.valueOf(j), Long.valueOf(j2));
            }
            Integer num = this.d;
            if (num != null) {
                u82.m = num.intValue();
            }
            if (this.e && z && j == p82.K()) {
                rm4 rm4 = p82.B;
                if (rm4.get() != null) {
                    ((rw9) rm4.get()).e(this.f, j2);
                }
            }
        }
    }
}
