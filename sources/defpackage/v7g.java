package defpackage;

import android.content.Context;
import android.os.Looper;
import androidx.work.impl.model.WorkersQueueDao;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: v7g  reason: default package */
public final class v7g {
    public static final /* synthetic */ int l = 0;
    public final Context a;
    public final ztc b;
    public final y7d c;
    public final ml0 d = ml0.z(Boolean.TRUE);
    public final je7 e;
    public final Set f;
    public volatile zl4 g;
    public volatile boolean h;
    public final je7 i;
    public final tz9 j;
    public volatile int k;

    public v7g(Context context, ztc ztc, ztc ztc2, khe khe, y7d y7d) {
        this.a = context;
        this.b = ztc2;
        this.c = y7d;
        this.e = khe;
        this.f = bcd.a0("ru.ok.tamtam.", "ru.ok.messages.");
        this.i = tu0.r(1, new rzd(20, this));
        this.j = new tz9(new e0a(new ty9(new iz9(new ld5(1, this), 0).r(ztc).n(ztc), nd2.Y, 1), new gd1(22, this), 3));
        this.k = 999;
        d();
    }

    public static ae3 e(v7g v7g, String str, int i2, mta mta, boolean z, int i3) {
        if ((i3 & 16) != 0) {
            z = false;
        }
        if (v7g.k < v7g.f()) {
            hm9.m("v7g", "enqueueUniquePeriodicWork %s", str);
            v7g.k++;
            v7g.h().b(str, i2, mta);
            return new ae3(2, false, false);
        }
        hm9.k0("v7g", (Exception) null, "enqueueUniquePeriodicWork: put %s in backlog", Arrays.copyOf(new Object[]{str}, 1));
        q8g q8g = new q8g(str, i2 == 2 ? h65.b : h65.a, mta);
        v7g.a(q8g, z);
        p7g h2 = v7g.h();
        qyc qyc = (qyc) v7g.c;
        qyc.getClass();
        int q = (int) qyc.q(PmsKey.f138wmbacklogworkerbackoffdelaysec, (long) 10);
        if (q < 1) {
            q = 1;
        }
        xfg.B(h2, Integer.valueOf(q), q8g).l();
        return new ae3(2, true, false);
    }

    public final void a(q8g q8g, boolean z) {
        if (z || tpa.f(Looper.getMainLooper(), Looper.myLooper())) {
            this.b.b(new fre(this, 21, q8g));
            return;
        }
        try {
            g().insert(q8g);
        } catch (Throwable th) {
            hm9.r("v7g", th, "fail to add item %s", q8g.b);
        }
    }

    public final mh7 b(String str, h65 h65, rla rla, boolean z) {
        if (z || this.k < f()) {
            hm9.m("v7g", "beginUniqueWork %s", str);
            if (z) {
                hm9.k0("v7g", (Exception) null, "ATTENTION! run NOT LIMITED WORK %s", Arrays.copyOf(new Object[]{str}, 1));
            }
            this.k++;
            p7g h2 = h();
            h2.getClass();
            List singletonList = Collections.singletonList(rla);
            s7g s7g = (s7g) h2;
            if (!singletonList.isEmpty()) {
                return new mh7(false, new g7g(s7g, str, h65, singletonList));
            }
            throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
        }
        hm9.k0("v7g", (Exception) null, "beginUniqueWork: put %s in backlog", Arrays.copyOf(new Object[]{str}, 1));
        q8g q8g = new q8g(str, h65, rla);
        a(q8g, false);
        p7g h3 = h();
        qyc qyc = (qyc) this.c;
        qyc.getClass();
        int q = (int) qyc.q(PmsKey.f138wmbacklogworkerbackoffdelaysec, (long) 10);
        if (q < 1) {
            q = 1;
        }
        return new mh7(true, xfg.B(h3, Integer.valueOf(q), q8g));
    }

    public final void c(String str) {
        hm9.m("v7g", "cancelUniqueWork %s", str);
        s7g s7g = (s7g) h();
        s7g.getClass();
        s7g.d.l(new my1(s7g, str, true));
    }

    public final void d() {
        hm9.m("v7g", "enableWorkManager", new Object[0]);
        this.d.e(Boolean.TRUE);
        if (!this.h) {
            tz9 tz9 = this.j;
            qje qje = new qje(4, this);
            c32 c32 = c32.Z;
            tz9.getClass();
            tz9.k(new iq1(qje, 2, c32));
        }
    }

    public final int f() {
        y7d y7d = this.c;
        qyc qyc = (qyc) y7d;
        qyc.getClass();
        int q = (int) qyc.q(PmsKey.f141wmworkerslimit, (long) 16);
        if (q < 1) {
            q = 1;
        }
        qyc qyc2 = (qyc) y7d;
        qyc2.getClass();
        int q2 = (int) qyc2.q(PmsKey.f142wmworkersoffset, (long) 2);
        if (q2 < 0) {
            q2 = 0;
        }
        int i2 = q - q2;
        if (i2 < 1) {
            return 1;
        }
        return i2;
    }

    public final WorkersQueueDao g() {
        return (WorkersQueueDao) this.e.getValue();
    }

    public final p7g h() {
        return (p7g) this.i.getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009d, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009e, code lost:
        defpackage.v3c.i(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a1, code lost:
        throw r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(defpackage.p7g r8) {
        /*
            r7 = this;
            zl4 r0 = r7.g
            if (r0 == 0) goto L_0x0007
            r0.g()
        L_0x0007:
            java.util.Set r1 = r7.f
            w8c r5 = new w8c
            r0 = 29
            r5.<init>(r0)
            java.lang.String r4 = ")"
            r6 = 24
            java.lang.String r2 = " OR "
            java.lang.String r3 = "("
            java.lang.String r0 = defpackage.x53.n0(r1, r2, r3, r4, r5, r6)
            r1 = r8
            s7g r1 = (defpackage.s7g) r1
            androidx.work.impl.WorkDatabase r1 = r1.c
            xde r1 = r1.h()
            k36 r1 = r1.getReadableDatabase()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "SELECT COUNT(*) FROM workspec WHERE "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = " AND state=0 AND schedule_requested_at<>-1"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.database.Cursor r0 = r1.q0(r0)
            r0.moveToFirst()     // Catch:{ all -> 0x005c }
            r1 = 0
            boolean r2 = r0.isNull(r1)     // Catch:{ all -> 0x005c }
            r3 = 0
            if (r2 == 0) goto L_0x004d
            r2 = r3
            goto L_0x0055
        L_0x004d:
            int r2 = r0.getInt(r1)     // Catch:{ all -> 0x005c }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x005c }
        L_0x0055:
            if (r2 == 0) goto L_0x005e
            int r1 = r2.intValue()     // Catch:{ all -> 0x005c }
            goto L_0x005e
        L_0x005c:
            r7 = move-exception
            goto L_0x009c
        L_0x005e:
            defpackage.v3c.i(r0, r3)
            r7.k = r1
            int r0 = r7.k
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "v7g"
            java.lang.String r2 = "scheduleWorkersCountChecking: workersCount = %d"
            defpackage.hm9.m(r1, r2, r0)
            ztc r0 = r7.b
            fre r1 = new fre
            r2 = 20
            r1.<init>(r7, r2, r8)
            y7d r8 = r7.c
            qyc r8 = (defpackage.qyc) r8
            r8.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r2 = ru.ok.tamtam.android.prefs.PmsKey.f140wmcheckworkerscountintervalsec
            r3 = 10
            long r3 = (long) r3
            long r2 = r8.q(r2, r3)
            int r8 = (int) r2
            r2 = 1
            if (r8 >= r2) goto L_0x0092
            r8 = r2
        L_0x0092:
            long r2 = (long) r8
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS
            zl4 r8 = r0.c(r1, r2, r8)
            r7.g = r8
            return
        L_0x009c:
            throw r7     // Catch:{ all -> 0x009d }
        L_0x009d:
            r8 = move-exception
            defpackage.v3c.i(r0, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v7g.i(p7g):void");
    }
}
