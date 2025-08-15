package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: su1  reason: default package */
public final class su1 {
    public static final long j;
    public static final long k;
    public final int a;
    public final Executor b;
    public final ScheduledExecutorService c;
    public final st1 d;
    public final oq0 e;
    public final boolean f;
    public long g = j;
    public final ArrayList h = new ArrayList();
    public final qu1 i = new qu1(this);

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        j = timeUnit.toNanos(1);
        k = timeUnit.toNanos(5);
    }

    public su1(int i2, Executor executor, ScheduledExecutorService scheduledExecutorService, st1 st1, boolean z, oq0 oq0) {
        this.a = i2;
        this.b = executor;
        this.c = scheduledExecutorService;
        this.d = st1;
        this.f = z;
        this.e = oq0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: dw6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: oq1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: dw6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: dw6} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.bm7 a(int r5) {
        /*
            r4 = this;
            dw6 r0 = defpackage.dw6.c
            java.util.ArrayList r1 = r4.h
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x004a
            qu1 r1 = r4.i
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x002c
            uu1 r0 = new uu1
            r1 = 0
            r0.<init>(r1)
            st1 r1 = r4.d
            r1.p(r0)
            wt1 r2 = new wt1
            r3 = 4
            r2.<init>(r1, r3, r0)
            oq1 r0 = r0.b
            nq1 r3 = r0.b
            java.util.concurrent.Executor r1 = r1.c
            r3.d(r2, r1)
        L_0x002c:
            b76 r0 = defpackage.b76.a(r0)
            hd0 r1 = new hd0
            r2 = 2
            r1.<init>(r5, r2, r4)
            r0.getClass()
            java.util.concurrent.Executor r5 = r4.b
            k12 r0 = defpackage.kq0.K(r0, r1, r5)
            ync r1 = new ync
            r2 = 26
            r1.<init>(r2, r4)
            k12 r0 = defpackage.kq0.K(r0, r1, r5)
        L_0x004a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.su1.a(int):bm7");
    }
}
