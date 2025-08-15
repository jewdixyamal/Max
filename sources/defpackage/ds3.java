package defpackage;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ds3  reason: default package */
public final class ds3 {
    public final el3 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final ConcurrentHashMap e = new ConcurrentHashMap();

    public ds3(el3 el3, khe khe, je7 je7, je7 je72) {
        this.a = el3;
        this.b = khe;
        this.c = je7;
        this.d = je72;
        el3.q = this;
    }

    public final uj3 a(long j) {
        return uj3.b(j, ((p7b) ((m7b) this.d.getValue())).a.f("server.timeDelta", 0), (ida) this.c.getValue());
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Comparable b(long r5, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.bs3
            if (r0 == 0) goto L_0x0013
            r0 = r7
            bs3 r0 = (defpackage.bs3) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            bs3 r0 = new bs3
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            defpackage.od2.a0(r7)     // Catch:{ all -> 0x0062 }
            goto L_0x005f
        L_0x0027:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x002f:
            defpackage.od2.a0(r7)
            el3 r4 = r4.a
            java.util.concurrent.ConcurrentHashMap r7 = r4.a
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            java.lang.Object r7 = r7.get(r2)
            uj3 r7 = (defpackage.uj3) r7
            if (r7 == 0) goto L_0x0043
            return r7
        L_0x0043:
            vi0 r7 = new vi0     // Catch:{ all -> 0x0062 }
            r7.<init>(r4, r5)     // Catch:{ all -> 0x0062 }
            q1a r4 = new q1a     // Catch:{ all -> 0x0062 }
            r5 = 1
            r4.<init>(r5, r7)     // Catch:{ all -> 0x0062 }
            ztc r5 = defpackage.muc.b()     // Catch:{ all -> 0x0062 }
            drd r4 = r4.m(r5)     // Catch:{ all -> 0x0062 }
            r0.Y = r3     // Catch:{ all -> 0x0062 }
            java.lang.Object r7 = defpackage.s36.f(r4, r0)     // Catch:{ all -> 0x0062 }
            if (r7 != r1) goto L_0x005f
            return r1
        L_0x005f:
            uj3 r7 = (defpackage.uj3) r7     // Catch:{ all -> 0x0062 }
            return r7
        L_0x0062:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ds3.b(long, kotlin.coroutines.Continuation):java.lang.Comparable");
    }

    public final w7c c(long j) {
        return new w7c((ti9) this.e.computeIfAbsent(Long.valueOf(j), new di(8, new nq2(this, j, 1))));
    }

    public final Integer d() {
        el3 el3 = this.a;
        el3.getClass();
        EnumSet enumSet = el3.r;
        Set set = el3.s;
        int i = 0;
        uj3 i2 = el3.i(((p7b) el3.h).a.t(), false);
        Collection<uj3> values = el3.a.values();
        if (!(values instanceof Collection) || !values.isEmpty()) {
            int i3 = 0;
            for (uj3 uj3 : values) {
                try {
                    if (uj3 != i2 && set.contains(uj3.a.c.k)) {
                        i3++;
                    }
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
            i = i3;
        }
        return new Integer(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(java.util.List r5, defpackage.ol3 r6, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.cs3
            if (r0 == 0) goto L_0x0013
            r0 = r7
            cs3 r0 = (defpackage.cs3) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            cs3 r0 = new cs3
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            defpackage.od2.a0(r7)
            goto L_0x0041
        L_0x0027:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x002f:
            defpackage.od2.a0(r7)
            a81 r7 = new a81
            r2 = 2
            r7.<init>(r4, r5, r6, r2)
            r0.Y = r3
            java.lang.Object r7 = defpackage.ema.C(r7, r0)
            if (r7 != r1) goto L_0x0041
            return r1
        L_0x0041:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ds3.e(java.util.List, ol3, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
