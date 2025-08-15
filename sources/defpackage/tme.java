package defpackage;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: tme  reason: default package */
public final class tme implements ase {
    public static final /* synthetic */ int x0 = 0;
    public final el3 X;
    public final p82 Y;
    public final float Z = 100.0f;
    public final Context a;
    public final p7b b;
    public final t7 c;
    public final t6b o;
    public zl4 s0;
    public sd7 t0;
    public sme u0;
    public sme v0;
    public sme w0;

    public tme(Context context, p7b p7b, t7 t7Var, t6b t6b, p82 p82, el3 el3) {
        this.a = context;
        this.b = p7b;
        this.c = t7Var;
        this.o = t6b;
        this.Y = p82;
        this.X = el3;
        sme.b0 = this;
        c();
    }

    public final void a(String str, boolean z) {
        if (z) {
            this.v0 = null;
            this.b.c.m("app.theme", str);
            qp4.u0.b(this.a).l(str, true);
        }
        this.u0 = null;
        q0e q0e = sme.c0;
        q0e.setValue((Object) null);
        this.o.a();
        this.X.e();
        this.Y.s();
        sme c2 = c();
        this.u0 = c2;
        q0e.setValue(c2);
        Iterator it = this.c.a.iterator();
        while (it.hasNext()) {
            Activity activity = (Activity) ((WeakReference) it.next()).get();
            if (activity instanceof q5) {
                hm9.m("tme", "changeTamTheme: call recreate for ".concat(activity.getClass().getName()), new Object[0]);
                q5 q5Var = (q5) activity;
                sme sme = this.u0;
                if (q5Var.h0()) {
                    q5Var.N0 = sme;
                    try {
                        q5Var.a0();
                        q5.X(sme, q5Var.S().c.f());
                    } catch (Exception unused) {
                        q5Var.recreate();
                    }
                } else {
                    q5Var.recreate();
                }
            }
        }
    }

    public final void b(boolean z) {
        sd7 sd7;
        if (!this.b.c.g.getString("app.night.mode", "app.night.mode.system").equals("app.night.mode")) {
            if (z || (sd7 = this.t0) == null || sd7.h()) {
                sme d = d();
                if (!d.e.equals(c().e)) {
                    if (z) {
                        sd7 sd72 = this.t0;
                        if (sd72 != null) {
                            if (!sd72.h()) {
                                sd7 sd73 = this.t0;
                                sd73.getClass();
                                dm4.a(sd73);
                            }
                            this.t0 = null;
                        }
                        StringBuilder sb = new StringBuilder("checkNightModeState: change theme to ");
                        String str = d.e;
                        sb.append(str);
                        hm9.m("tme", sb.toString(), new Object[0]);
                        a(str, false);
                    } else {
                        hm9.m("tme", "changeThemeAfterNightModeCheck: schedule theme change after delay", new Object[0]);
                        r0a n = qy9.u(MultiFileUploader.UPLOAD_NEXT_INTERVAL, TimeUnit.MILLISECONDS, muc.a()).n(ce.a());
                        sd7 sd74 = new sd7(new hme(3), new hme(4), new e5(18, this));
                        n.a(sd74);
                        this.t0 = sd74;
                    }
                    if (z) {
                        f();
                    }
                }
            }
        }
    }

    public final sme c() {
        if (this.u0 == null) {
            sme d = d();
            this.u0 = d;
            sme.c0.setValue(d);
        }
        return this.u0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0094, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        defpackage.v3c.i(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0098, code lost:
        throw r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.sme d() {
        /*
            r8 = this;
            boolean r0 = r8.e()
            if (r0 == 0) goto L_0x000c
            sme r1 = r8.w0
            if (r1 == 0) goto L_0x000c
            goto L_0x00f4
        L_0x000c:
            if (r0 != 0) goto L_0x0014
            sme r1 = r8.v0
            if (r1 == 0) goto L_0x0014
            goto L_0x00f4
        L_0x0014:
            p7b r1 = r8.b
            jp r1 = r1.c
            r1.getClass()
            if (r0 == 0) goto L_0x002a
            hq9 r2 = defpackage.hq9.e0
            java.lang.String r2 = r2.e
            ne7 r1 = r1.g
            java.lang.String r3 = "app.night.theme"
            java.lang.String r1 = r1.getString(r3, r2)
            goto L_0x0036
        L_0x002a:
            ee4 r2 = defpackage.ee4.e0
            java.lang.String r2 = r2.e
            ne7 r1 = r1.g
            java.lang.String r3 = "app.theme"
            java.lang.String r1 = r1.getString(r3, r2)
        L_0x0036:
            r2 = 0
            boolean r2 = defpackage.sme.b(r1, r2)
            r3 = 1
            boolean r4 = defpackage.sme.b(r1, r3)
            khe r5 = defpackage.sme.a0
            java.lang.Object r5 = r5.getValue()
            java.util.Set r5 = (java.util.Set) r5
            boolean r6 = r5 instanceof java.util.Collection
            java.lang.String r7 = "tme"
            if (r6 == 0) goto L_0x0055
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L_0x0055
            goto L_0x006e
        L_0x0055:
            java.util.Iterator r5 = r5.iterator()
        L_0x0059:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x006e
            java.lang.Object r6 = r5.next()
            sme r6 = (defpackage.sme) r6
            java.lang.String r6 = r6.e
            boolean r6 = defpackage.tpa.f(r6, r1)
            if (r6 == 0) goto L_0x0059
            goto L_0x00a7
        L_0x006e:
            if (r4 == 0) goto L_0x00a7
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x0099 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0099 }
            java.nio.charset.Charset r1 = defpackage.a52.a     // Catch:{ Exception -> 0x0099 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0099 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0099 }
            r4.<init>(r2)     // Catch:{ Exception -> 0x0099 }
            r3.<init>(r4, r1)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r1 = r2.getPath()     // Catch:{ all -> 0x0092 }
            java.lang.String r2 = defpackage.m6d.H(r3)     // Catch:{ all -> 0x0092 }
            sme r1 = defpackage.ema.n(r2, r1)     // Catch:{ all -> 0x0092 }
            r2 = 0
            defpackage.v3c.i(r3, r2)     // Catch:{ Exception -> 0x0099 }
            goto L_0x00ed
        L_0x0092:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0094 }
        L_0x0094:
            r2 = move-exception
            defpackage.v3c.i(r3, r1)     // Catch:{ Exception -> 0x0099 }
            throw r2     // Catch:{ Exception -> 0x0099 }
        L_0x0099:
            r1 = move-exception
            java.lang.String r2 = "failed to get file theme"
            defpackage.hm9.p(r7, r2, r1)
            if (r0 == 0) goto L_0x00a4
            hq9 r1 = defpackage.hq9.e0
            goto L_0x00ed
        L_0x00a4:
            ee4 r1 = defpackage.ee4.e0
            goto L_0x00ed
        L_0x00a7:
            if (r2 != 0) goto L_0x00de
            khe r2 = defpackage.sme.a0     // Catch:{ Exception -> 0x00d3 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ Exception -> 0x00d3 }
            java.util.Set r2 = (java.util.Set) r2     // Catch:{ Exception -> 0x00d3 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x00d3 }
        L_0x00b5:
            boolean r3 = r2.hasNext()     // Catch:{ Exception -> 0x00d3 }
            if (r3 == 0) goto L_0x00cb
            java.lang.Object r3 = r2.next()     // Catch:{ Exception -> 0x00d3 }
            sme r3 = (defpackage.sme) r3     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r4 = r3.e     // Catch:{ Exception -> 0x00d3 }
            boolean r4 = defpackage.tpa.f(r4, r1)     // Catch:{ Exception -> 0x00d3 }
            if (r4 == 0) goto L_0x00b5
            r1 = r3
            goto L_0x00ed
        L_0x00cb:
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r0 = "Collection contains no element matching the predicate."
            r8.<init>(r0)     // Catch:{ Exception -> 0x00d3 }
            throw r8     // Catch:{ Exception -> 0x00d3 }
        L_0x00d3:
            r8 = move-exception
            java.lang.String r0 = "TamTheme.getThemeBy(themeId) failure, themeId = %s"
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            defpackage.hm9.r(r7, r8, r0, r1)
            throw r8
        L_0x00de:
            if (r0 == 0) goto L_0x00e5
            hq9 r2 = defpackage.hq9.e0     // Catch:{ Exception -> 0x00e3 }
            goto L_0x00e7
        L_0x00e3:
            r8 = move-exception
            goto L_0x00f5
        L_0x00e5:
            ee4 r2 = defpackage.ee4.e0     // Catch:{ Exception -> 0x00e3 }
        L_0x00e7:
            java.lang.String r4 = r2.e     // Catch:{ Exception -> 0x00e3 }
            r8.a(r4, r3)     // Catch:{ Exception -> 0x00e3 }
            r1 = r2
        L_0x00ed:
            if (r0 == 0) goto L_0x00f2
            r8.w0 = r1
            goto L_0x00f4
        L_0x00f2:
            r8.v0 = r1
        L_0x00f4:
            return r1
        L_0x00f5:
            java.lang.String r0 = "TamTheme.changeCurrentTheme(themeId) failure, themeId = %s"
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            defpackage.hm9.r(r7, r8, r0, r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tme.d():sme");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e() {
        /*
            r16 = this;
            r0 = r16
            r1 = -1
            r2 = 1
            r3 = 0
            java.lang.String r4 = "app.night.mode.system"
            p7b r5 = r0.b
            jp r6 = r5.c
            ne7 r6 = r6.g
            java.lang.String r7 = "app.night.mode"
            java.lang.String r6 = r6.getString(r7, r4)
            r6.getClass()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r3)
            jp r5 = r5.c
            int r7 = r6.hashCode()
            switch(r7) {
                case -700569351: goto L_0x0044;
                case -123544841: goto L_0x0039;
                case 1712040927: goto L_0x002e;
                case 2051489143: goto L_0x0025;
                default: goto L_0x0023;
            }
        L_0x0023:
            r4 = r1
            goto L_0x004e
        L_0x0025:
            boolean r4 = r6.equals(r4)
            if (r4 != 0) goto L_0x002c
            goto L_0x0023
        L_0x002c:
            r4 = 3
            goto L_0x004e
        L_0x002e:
            java.lang.String r4 = "app.night.mode.schedule"
            boolean r4 = r6.equals(r4)
            if (r4 != 0) goto L_0x0037
            goto L_0x0023
        L_0x0037:
            r4 = 2
            goto L_0x004e
        L_0x0039:
            java.lang.String r4 = "app.night.mode.auto"
            boolean r4 = r6.equals(r4)
            if (r4 != 0) goto L_0x0042
            goto L_0x0023
        L_0x0042:
            r4 = r2
            goto L_0x004e
        L_0x0044:
            java.lang.String r4 = "app.night.mode.enabled"
            boolean r4 = r6.equals(r4)
            if (r4 != 0) goto L_0x004d
            goto L_0x0023
        L_0x004d:
            r4 = r3
        L_0x004e:
            switch(r4) {
                case 0: goto L_0x0122;
                case 1: goto L_0x00fa;
                case 2: goto L_0x0068;
                case 3: goto L_0x0054;
                default: goto L_0x0051;
            }
        L_0x0051:
            r2 = r3
            goto L_0x0122
        L_0x0054:
            android.content.Context r0 = r0.a
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & 48
            r1 = 32
            if (r0 != r1) goto L_0x0051
            goto L_0x0122
        L_0x0068:
            ne7 r0 = r5.g
            java.lang.String r4 = "app.night.mode.start.h"
            r6 = 23
            int r4 = r0.getInt(r4, r6)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
            java.lang.String r4 = "app.night.mode.start.m"
            int r0 = r0.getInt(r4, r3)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            ne7 r0 = r5.g
            java.lang.String r4 = "app.night.mode.end.h"
            r5 = 8
            int r4 = r0.getInt(r4, r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "app.night.mode.end.m"
            int r0 = r0.getInt(r5, r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.TimeZone r5 = java.util.TimeZone.getDefault()
            long r6 = java.lang.System.currentTimeMillis()
            n34 r5 = defpackage.n34.g(r6, r5)
            n34 r6 = new n34
            java.lang.Integer r8 = r5.a
            java.lang.Integer r9 = r5.b
            java.lang.Integer r10 = r5.c
            r7 = r6
            r13 = r15
            r14 = r15
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            n34 r14 = new n34
            java.lang.Integer r8 = r5.a
            java.lang.Integer r9 = r5.b
            java.lang.Integer r10 = r5.c
            r7 = r14
            r11 = r4
            r12 = r0
            r13 = r15
            r0 = r14
            r14 = r15
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            int r4 = r5.compareTo(r6)
            if (r4 >= 0) goto L_0x00df
            int r4 = r5.compareTo(r0)
            if (r4 >= 0) goto L_0x00df
            int r4 = r6.compareTo(r0)
            if (r4 <= 0) goto L_0x00df
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            n34 r6 = r6.l(r1)
        L_0x00dd:
            r14 = r0
            goto L_0x00ed
        L_0x00df:
            int r1 = r0.compareTo(r6)
            if (r1 >= 0) goto L_0x00dd
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            n34 r14 = r0.l(r1)
        L_0x00ed:
            int r0 = r5.compareTo(r6)
            if (r0 < 0) goto L_0x0051
            int r0 = r5.compareTo(r14)
            if (r0 >= 0) goto L_0x0051
            goto L_0x0122
        L_0x00fa:
            ne7 r1 = r5.g
            java.lang.String r4 = "app.night.mode.brightness"
            r5 = 30
            int r1 = r1.getInt(r4, r5)
            float r0 = r0.Z
            r4 = 0
            int r5 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x010c
            r0 = r4
        L_0x010c:
            r4 = 1176256512(0x461c4000, float:10000.0)
            int r5 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r5 <= 0) goto L_0x0114
            r0 = r4
        L_0x0114:
            double r4 = (double) r0
            double r4 = java.lang.Math.log10(r4)
            r6 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r4 = r4 / r6
            r6 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r4 = r4 * r6
            int r0 = (int) r4
            if (r0 > r1) goto L_0x0051
        L_0x0122:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tme.e():boolean");
    }

    public final void f() {
        long j;
        zl4 zl4 = this.s0;
        if (zl4 != null) {
            if (!zl4.h()) {
                this.s0.g();
            }
            this.s0 = null;
        }
        p7b p7b = this.b;
        if (!p7b.c.g.getString("app.night.mode", "app.night.mode.system").equals("app.night.mode")) {
            jp jpVar = p7b.c;
            if (jpVar.g.getString("app.night.mode", "app.night.mode.system").equals("app.night.mode.schedule")) {
                n34 g = n34.g(System.currentTimeMillis(), TimeZone.getDefault());
                ne7 ne7 = jpVar.g;
                Integer valueOf = Integer.valueOf(ne7.getInt("app.night.mode.start.h", 23));
                Integer valueOf2 = Integer.valueOf(ne7.getInt("app.night.mode.start.m", 0));
                ne7 ne72 = jpVar.g;
                Integer valueOf3 = Integer.valueOf(ne72.getInt("app.night.mode.end.h", 8));
                Integer valueOf4 = Integer.valueOf(ne72.getInt("app.night.mode.end.m", 0));
                n34 n34 = new n34(g.a, g.b, g.c, valueOf, valueOf2, 0, 0);
                n34 n342 = new n34(g.a, g.b, g.c, valueOf3, valueOf4, 0, 0);
                if (n34.compareTo(g) < 0) {
                    n34 = n34.l(1);
                }
                if (n342.compareTo(g) < 0) {
                    n342 = n342.l(1);
                }
                if (n34.compareTo(n342) >= 0) {
                    n34 = n342;
                }
                if (!g.n(1, 2, 3) || !n34.n(1, 2, 3)) {
                    j = 0;
                } else {
                    n34.f();
                    g.f();
                    j = (long) (((n34.c() - 2400001) - (g.c() - 2400001)) * 86400);
                }
                long k = (j - ((long) g.k())) + ((long) n34.k());
                hm9.m("tme", "createScheduledJobsIfNeed: next time to check: " + n34.toString() + " delay: " + k, new Object[0]);
                this.s0 = ce.a().c(new ule(1, this), k, TimeUnit.SECONDS);
            }
        }
    }

    public final sme u() {
        return c();
    }
}
