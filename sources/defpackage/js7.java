package defpackage;

import java.util.EnumSet;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: js7  reason: default package */
public final class js7 implements qu7 {
    public final je7 X;
    public final je7 Y;
    public final ix Z;
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 o;
    public final khe s0;

    public js7(zp zpVar, kke kke, je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, je7 je76, je7 je77) {
        je7 je78 = je7;
        je7 je79 = je73;
        this.a = je72;
        this.b = je79;
        this.c = je74;
        this.o = je78;
        this.X = je76;
        this.Y = je77;
        int i = ft4.o;
        w9a w9a = (w9a) kke;
        this.Z = new ix(w9a.b(), w9a.a(), z7.R(1000, kt4.MILLISECONDS), new g27(7), new hs7(je78, (Continuation) null), new es7(this, je75));
        this.s0 = new khe(new z30(16, je79));
        ((lqf) zpVar).i.add(new fs7(0, this));
    }

    public static void g(js7 js7, boolean z, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        if (!js7.c()) {
            boolean z2 = ((gh3) js7.X.getValue()).b() == zh3.c;
            boolean e = js7.e();
            boolean contains = ((EnumSet) js7.s0.getValue()).contains(gs7.b);
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                ir6.d(us7.X, "LogController", "Trying to flush analytics, timeFromLastSend=" + nu0.G(Long.valueOf(((hyc) ((q33) js7.a.getValue())).g.getLong("user.lastSentLogTime", 0))) + ", timeToSend=" + e + ", wifi=" + z2 + ", force=" + z + ", sendOnAnyNetwork=" + contains, (Throwable) null);
            }
            if (contains || z2 || e || z) {
                ((s8g) js7.c.getValue()).a(new c9d(false, true));
            }
        }
    }

    public final void a() {
    }

    public final hmc b() {
        return (hmc) this.o.getValue();
    }

    public final boolean c() {
        se5 se5 = (se5) ((qe5) this.Y.getValue());
        se5.getClass();
        return !se5.n(PmsKey.f4analyticsenabled, true);
    }

    public final boolean d() {
        int i = ft4.o;
        qyc qyc = (qyc) ((y7d) this.b.getValue());
        qyc.getClass();
        long S = z7.S(qyc.q(PmsKey.f112sendlogsintervalsec, 10800) / ((long) 12), kt4.SECONDS);
        long currentTimeMillis = System.currentTimeMillis();
        kt4 kt4 = kt4.MILLISECONDS;
        return ft4.c(ft4.g(z7.S(currentTimeMillis, kt4), z7.S(((hyc) ((q33) this.a.getValue())).g.getLong("user.lastSentCriticalLogTime", 0), kt4)), S) >= 0;
    }

    public final boolean e() {
        int i = ft4.o;
        long currentTimeMillis = System.currentTimeMillis();
        kt4 kt4 = kt4.MILLISECONDS;
        long g = ft4.g(z7.S(currentTimeMillis, kt4), z7.S(((hyc) ((q33) this.a.getValue())).g.getLong("user.lastSentLogTime", 0), kt4));
        qyc qyc = (qyc) ((y7d) this.b.getValue());
        qyc.getClass();
        long S = z7.S(qyc.q(PmsKey.f112sendlogsintervalsec, 10800), kt4.SECONDS);
        if (ft4.c(S, 0) < 0) {
            S = z7.R(3, kt4.HOURS);
        }
        return ft4.c(g, S) > 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(boolean r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.is7
            if (r0 == 0) goto L_0x0013
            r0 = r12
            is7 r0 = (defpackage.is7) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            is7 r0 = new is7
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            e5f r3 = defpackage.e5f.a
            r4 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r4) goto L_0x002c
            js7 r10 = r0.o
            defpackage.od2.a0(r12)
            goto L_0x00a1
        L_0x002c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0034:
            defpackage.od2.a0(r12)
            boolean r12 = r10.c()
            if (r12 == 0) goto L_0x003e
            return r3
        L_0x003e:
            boolean r12 = r10.d()
            ir6 r2 = defpackage.hm9.m
            if (r2 != 0) goto L_0x0047
            goto L_0x0090
        L_0x0047:
            boolean r5 = r2.c()
            if (r5 == 0) goto L_0x0090
            us7 r5 = defpackage.us7.X
            je7 r6 = r10.a
            java.lang.Object r6 = r6.getValue()
            q33 r6 = (defpackage.q33) r6
            hyc r6 = (defpackage.hyc) r6
            ne7 r6 = r6.g
            java.lang.String r7 = "user.lastSentCriticalLogTime"
            r8 = 0
            long r6 = r6.getLong(r7, r8)
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r6)
            java.lang.String r6 = defpackage.nu0.G(r8)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Trying to flush critical analytics, awaitFlush="
            r7.<init>(r8)
            r7.append(r11)
            java.lang.String r8 = ", timeFromLastSend="
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = ", timeToSend="
            r7.append(r6)
            r7.append(r12)
            java.lang.String r6 = r7.toString()
            r7 = 0
            java.lang.String r8 = "LogController"
            r2.d(r5, r8, r6, r7)
        L_0x0090:
            if (r12 == 0) goto L_0x00b2
            if (r11 == 0) goto L_0x00a1
            ix r11 = r10.Z
            r0.o = r10
            r0.Z = r4
            java.lang.Object r11 = r11.c(r0)
            if (r11 != r1) goto L_0x00a1
            return r1
        L_0x00a1:
            je7 r10 = r10.c
            java.lang.Object r10 = r10.getValue()
            s8g r10 = (defpackage.s8g) r10
            c9d r11 = new c9d
            r12 = 0
            r11.<init>(r12, r12)
            r10.a(r11)
        L_0x00b2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.js7.f(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
