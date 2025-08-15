package defpackage;

import android.os.SystemClock;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: an9  reason: default package */
public final class an9 {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final ContextScope e;
    public final String f = an9.class.getName();
    public final aj9 g = bj9.a();
    public final AtomicInteger h = new AtomicInteger(1);
    public volatile long i;
    public final AtomicReference j = new AtomicReference();
    public final AtomicReference k = new AtomicReference();
    public final AtomicReference l = new AtomicReference(v1e.a);

    public an9(kke kke, zp zpVar, w1e w1e, je7 je7, je7 je72, je7 je73, je7 je74) {
        this.a = je72;
        this.b = je73;
        this.c = je7;
        this.d = je74;
        ContextScope a2 = j1e.a(((w9a) kke).b());
        this.e = a2;
        ((lqf) zpVar).i.add(new fs7(1, this));
        od2.L(new zn5(w1e.b, new v59(2, this, an9.class, "onNewCondition", "onNewCondition(Lone/me/sdk/statistics/conditions/StatsExternalConditions$ConditionType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 1), 5), a2);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.an9 r7, kotlin.coroutines.Continuation r8) {
        /*
            r7.getClass()
            boolean r0 = r8 instanceof defpackage.zm9
            if (r0 == 0) goto L_0x0016
            r0 = r8
            zm9 r0 = (defpackage.zm9) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x001b
        L_0x0016:
            zm9 r0 = new zm9
            r0.<init>(r7, r8)
        L_0x001b:
            java.lang.Object r8 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            aj9 r7 = r0.X
            an9 r0 = r0.o
            defpackage.od2.a0(r8)
            r8 = r7
            r7 = r0
            goto L_0x005e
        L_0x0031:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0039:
            defpackage.od2.a0(r8)
            java.util.concurrent.atomic.AtomicReference r8 = r7.k
            r8.set(r4)
            java.util.concurrent.atomic.AtomicReference r8 = r7.j
            r8.set(r4)
            java.util.concurrent.atomic.AtomicInteger r8 = r7.h
            r8.set(r3)
            r5 = 0
            r7.i = r5
            aj9 r8 = r7.g
            r0.o = r7
            r0.X = r8
            r0.s0 = r3
            java.lang.Object r0 = r8.d(r0)
            if (r0 != r1) goto L_0x005e
            goto L_0x0087
        L_0x005e:
            je7 r0 = r7.a     // Catch:{ all -> 0x0088 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0088 }
            q33 r0 = (defpackage.q33) r0     // Catch:{ all -> 0x0088 }
            t33 r0 = (defpackage.t33) r0     // Catch:{ all -> 0x0088 }
            long r0 = r0.F()     // Catch:{ all -> 0x0088 }
            r2 = 1
            long r0 = r0 + r2
            je7 r7 = r7.a     // Catch:{ all -> 0x0088 }
            java.lang.Object r7 = r7.getValue()     // Catch:{ all -> 0x0088 }
            q33 r7 = (defpackage.q33) r7     // Catch:{ all -> 0x0088 }
            t33 r7 = (defpackage.t33) r7     // Catch:{ all -> 0x0088 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0088 }
            java.lang.String r1 = "app.stats.session.id"
            r7.l(r1, r0)     // Catch:{ all -> 0x0088 }
            r8.e(r4)
            e5f r1 = defpackage.e5f.a
        L_0x0087:
            return r1
        L_0x0088:
            r7 = move-exception
            r8.e(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.an9.a(an9, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static void g(an9 an9, wuc wuc) {
        an9.f(wuc, spa.f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001f, code lost:
        r6 = r7.e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ky7 b(int r6, defpackage.ms7 r7, defpackage.spa r8) {
        /*
            r5 = this;
            ky7 r0 = new ky7
            r0.<init>()
            java.util.concurrent.atomic.AtomicInteger r1 = r5.h
            int r1 = r1.getAndIncrement()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "action_id"
            r0.put(r2, r1)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r1 = "screen_to"
            r0.put(r1, r6)
            if (r7 == 0) goto L_0x0028
            java.util.Map r6 = r7.e
            if (r6 == 0) goto L_0x0028
            java.lang.Object r6 = r6.get(r1)
            goto L_0x0029
        L_0x0028:
            r6 = 0
        L_0x0029:
            if (r6 == 0) goto L_0x003b
            long r1 = r7.a
            java.lang.Long r7 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = "prev_time"
            r0.put(r1, r7)
            java.lang.String r7 = "screen_from"
            r0.put(r7, r6)
        L_0x003b:
            java.util.concurrent.atomic.AtomicReference r5 = r5.l
            java.lang.Object r5 = r5.get()
            v1e r5 = (defpackage.v1e) r5
            spa r6 = defpackage.spa.f
            boolean r6 = defpackage.tpa.f(r8, r6)
            r7 = 2
            r1 = 1
            v1e r2 = defpackage.v1e.c
            v1e r3 = defpackage.v1e.b
            java.lang.String r4 = "pip"
            if (r6 == 0) goto L_0x006a
            r5.getClass()
            if (r5 == r3) goto L_0x005a
            if (r5 != r2) goto L_0x00b7
        L_0x005a:
            if (r5 != r3) goto L_0x0060
            crd r5 = defpackage.b2b.b
            r7 = r1
            goto L_0x0062
        L_0x0060:
            crd r5 = defpackage.b2b.b
        L_0x0062:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            r0.put(r4, r5)
            goto L_0x00b7
        L_0x006a:
            b2b r6 = r8.a
            if (r6 == 0) goto L_0x0078
            int r5 = r6.a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.put(r4, r5)
            goto L_0x008e
        L_0x0078:
            r5.getClass()
            if (r5 == r3) goto L_0x007f
            if (r5 != r2) goto L_0x008e
        L_0x007f:
            if (r5 != r3) goto L_0x0085
            crd r5 = defpackage.b2b.b
            r7 = r1
            goto L_0x0087
        L_0x0085:
            crd r5 = defpackage.b2b.b
        L_0x0087:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            r0.put(r4, r5)
        L_0x008e:
            int r5 = r8.b
            if (r5 == 0) goto L_0x009f
            int r5 = defpackage.ey8.c(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "reason"
            r0.put(r6, r5)
        L_0x009f:
            java.lang.Long r5 = r8.d
            if (r5 == 0) goto L_0x00b7
            zud r6 = r8.c
            if (r6 == 0) goto L_0x00b7
            java.lang.String r7 = "source_id"
            r0.put(r7, r5)
            int r5 = r6.a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "source_type"
            r0.put(r6, r5)
        L_0x00b7:
            us r5 = r8.e
            if (r5 == 0) goto L_0x00cb
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L_0x00c2
            goto L_0x00cb
        L_0x00c2:
            java.util.Map r5 = java.util.Collections.unmodifiableMap(r5)
            java.lang.String r6 = "reason_meta"
            r0.put(r6, r5)
        L_0x00cb:
            ky7 r5 = r0.b()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.an9.b(int, ms7, spa):ky7");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [e47, java.lang.Object] */
    public final ms7 c(int i2, ky7 ky7) {
        String str;
        ? obj = new Object();
        obj.c = "NAV";
        je7 je7 = this.a;
        obj.b = ((hyc) ((q33) je7.getValue())).t();
        if (i2 == 1) {
            str = "COLD_START";
        } else if (i2 == 2) {
            str = "WARM_START";
        } else if (i2 == 3) {
            str = "GO";
        } else {
            throw null;
        }
        obj.o = str;
        obj.X = ((t33) ((q33) je7.getValue())).F();
        obj.a = System.currentTimeMillis();
        obj.b(ky7);
        return obj.c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r2 = r2.e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Integer d() {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r2 = r2.k
            java.lang.Object r2 = r2.get()
            ms7 r2 = (defpackage.ms7) r2
            r0 = 0
            if (r2 == 0) goto L_0x0016
            java.util.Map r2 = r2.e
            if (r2 == 0) goto L_0x0016
            java.lang.String r1 = "screen_to"
            java.lang.Object r2 = r2.get(r1)
            goto L_0x0017
        L_0x0016:
            r2 = r0
        L_0x0017:
            boolean r1 = r2 instanceof java.lang.Integer
            if (r1 == 0) goto L_0x001e
            r0 = r2
            java.lang.Integer r0 = (java.lang.Integer) r0
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.an9.d():java.lang.Integer");
    }

    public final boolean e() {
        qyc qyc = (qyc) ((y7d) this.b.getValue());
        qyc.getClass();
        return SystemClock.elapsedRealtime() - this.i < qyc.q(PmsKey.f117statsessionbackgroundthreshold, 60000);
    }

    public final void f(wuc wuc, spa spa) {
        Map map;
        ms7 ms7 = (ms7) this.k.get();
        int i2 = 3;
        int i3 = ms7 == null ? 1 : 3;
        Object obj = (ms7 == null || (map = ms7.e) == null) ? null : map.get("screen_to");
        if (tpa.f(obj, 1) && !e()) {
            v1e v1e = (v1e) this.l.get();
            v1e.getClass();
            if (!(v1e == v1e.b || v1e == v1e.c)) {
                return;
            }
        }
        j47.T(this.e, (lx3) null, (vx3) null, new ym9(i3, this, wuc, spa, ms7, (Continuation) null), 3);
        if (obj != null) {
            boolean equals = Integer.valueOf(wuc.a).equals(1);
            boolean equals2 = obj.equals(150);
            je7 je7 = this.d;
            if (equals2) {
                ita ita = (ita) je7.getValue();
                if (equals) {
                    i2 = 2;
                }
                ita.e(2, i2);
            } else if (obj.equals(350)) {
                ita ita2 = (ita) je7.getValue();
                if (equals) {
                    i2 = 2;
                }
                ita2.d(2, i2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008d, code lost:
        if (defpackage.tpa.f(r1, r4) == false) goto L_0x008f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(int r6, defpackage.ms7 r7, int r8, defpackage.spa r9, boolean r10, kotlin.coroutines.Continuation r11) {
        /*
            r5 = this;
            e5f r0 = defpackage.e5f.a
            if (r7 != 0) goto L_0x0006
            goto L_0x008f
        L_0x0006:
            java.lang.String r1 = "screen_to"
            java.util.Map r2 = r7.e
            java.lang.Object r1 = r2.get(r1)
            boolean r3 = r1 instanceof java.lang.Integer
            if (r3 != 0) goto L_0x0014
            goto L_0x008f
        L_0x0014:
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r6 == r1) goto L_0x001e
            goto L_0x008f
        L_0x001e:
            java.lang.String r1 = "pip"
            java.lang.Object r1 = r2.get(r1)
            b2b r3 = r9.a
            r4 = 0
            if (r3 == 0) goto L_0x0030
            int r3 = r3.a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0031
        L_0x0030:
            r3 = r4
        L_0x0031:
            boolean r1 = defpackage.tpa.f(r3, r1)
            if (r1 != 0) goto L_0x0038
            goto L_0x008f
        L_0x0038:
            java.lang.String r1 = "reason"
            java.lang.Object r1 = r2.get(r1)
            int r3 = r9.b
            if (r3 == 0) goto L_0x004b
            int r3 = defpackage.ey8.c(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x004c
        L_0x004b:
            r3 = r4
        L_0x004c:
            boolean r1 = defpackage.tpa.f(r3, r1)
            if (r1 != 0) goto L_0x0053
            goto L_0x008f
        L_0x0053:
            java.lang.String r1 = "source_type"
            java.lang.Object r1 = r2.get(r1)
            zud r3 = r9.c
            if (r3 == 0) goto L_0x0064
            int r3 = r3.a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0065
        L_0x0064:
            r3 = r4
        L_0x0065:
            boolean r1 = defpackage.tpa.f(r3, r1)
            if (r1 != 0) goto L_0x006c
            goto L_0x008f
        L_0x006c:
            java.lang.String r1 = "source_id"
            java.lang.Object r1 = r2.get(r1)
            java.lang.Long r3 = r9.d
            boolean r1 = defpackage.tpa.f(r3, r1)
            if (r1 != 0) goto L_0x007b
            goto L_0x008f
        L_0x007b:
            java.lang.String r1 = "reason_meta"
            java.lang.Object r1 = r2.get(r1)
            us r2 = r9.e
            if (r2 == 0) goto L_0x0089
            java.util.Map r4 = java.util.Collections.unmodifiableMap(r2)
        L_0x0089:
            boolean r1 = defpackage.tpa.f(r1, r4)
            if (r1 != 0) goto L_0x00ce
        L_0x008f:
            ky7 r7 = r5.b(r6, r7, r9)
            ms7 r7 = r5.c(r8, r7)
            java.util.concurrent.atomic.AtomicReference r8 = r5.k
            iz0 r1 = new iz0
            r2 = 7
            r1.<init>(r2, r7)
            r8.updateAndGet(r1)
            r8 = 1
            if (r6 == r8) goto L_0x00b1
            java.util.concurrent.atomic.AtomicReference r6 = r5.j
            iz0 r8 = new iz0
            r1 = 8
            r8.<init>(r1, r9)
            r6.updateAndGet(r8)
        L_0x00b1:
            je7 r5 = r5.c
            if (r10 == 0) goto L_0x00c5
            java.lang.Object r5 = r5.getValue()
            ad r5 = (defpackage.ad) r5
            java.lang.Object r5 = r5.k(r7, r11)
            tx3 r6 = defpackage.tx3.a
            if (r5 != r6) goto L_0x00c4
            return r5
        L_0x00c4:
            return r0
        L_0x00c5:
            java.lang.Object r5 = r5.getValue()
            ad r5 = (defpackage.ad) r5
            r5.j(r7)
        L_0x00ce:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.an9.h(int, ms7, int, spa, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
