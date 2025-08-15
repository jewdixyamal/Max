package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: y9b  reason: default package */
public final class y9b implements w45, cy5 {
    public static final String x0 = a14.O("Processor");
    public final WorkDatabase X;
    public final HashMap Y = new HashMap();
    public final HashMap Z = new HashMap();
    public PowerManager.WakeLock a;
    public final Context b;
    public final me3 c;
    public final wne o;
    public final HashMap s0;
    public final List t0;
    public final HashSet u0;
    public final ArrayList v0;
    public final Object w0;

    public y9b(Context context, me3 me3, bkb bkb, WorkDatabase workDatabase, List list) {
        this.b = context;
        this.c = me3;
        this.o = bkb;
        this.X = workDatabase;
        this.t0 = list;
        this.u0 = new HashSet();
        this.v0 = new ArrayList();
        this.a = null;
        this.w0 = new Object();
        this.s0 = new HashMap();
    }

    public static boolean c(String str, v8g v8g) {
        if (v8g != null) {
            v8g.C0 = true;
            v8g.h();
            v8g.B0.cancel(true);
            if (v8g.Y == null || !(v8g.B0.a instanceof r0)) {
                a14.u().n(v8g.D0, "WorkSpec " + v8g.X + " is already done. Not interrupting.");
            } else {
                v8g.Y.stop();
            }
            a14 u = a14.u();
            String str2 = x0;
            u.n(str2, "WorkerWrapper interrupted for " + str);
            return true;
        }
        a14 u2 = a14.u();
        String str3 = x0;
        u2.n(str3, "WorkerWrapper could not be found for " + str);
        return false;
    }

    public final void a(w45 w45) {
        synchronized (this.w0) {
            this.v0.add(w45);
        }
    }

    public final void b(l7g l7g, boolean z) {
        synchronized (this.w0) {
            try {
                v8g v8g = (v8g) this.Z.get(l7g.a);
                if (v8g != null && l7g.equals(ju0.n(v8g.X))) {
                    this.Z.remove(l7g.a);
                }
                a14 u = a14.u();
                String str = x0;
                u.n(str, y9b.class.getSimpleName() + " " + l7g.a + " executed; reschedule = " + z);
                Iterator it = this.v0.iterator();
                while (it.hasNext()) {
                    ((w45) it.next()).b(l7g, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(String str) {
        boolean z;
        synchronized (this.w0) {
            try {
                if (!this.Z.containsKey(str)) {
                    if (!this.Y.containsKey(str)) {
                        z = false;
                    }
                }
                z = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final void e(w45 w45) {
        synchronized (this.w0) {
            this.v0.remove(w45);
        }
    }

    public final void f(l7g l7g) {
        ((k40) ((bkb) this.o).c).execute(new av2(this, l7g));
    }

    public final void g(String str, ay5 ay5) {
        synchronized (this.w0) {
            try {
                a14 u = a14.u();
                String str2 = x0;
                u.x(str2, "Moving WorkSpec (" + str + ") to the foreground");
                v8g v8g = (v8g) this.Z.remove(str);
                if (v8g != null) {
                    if (this.a == null) {
                        PowerManager.WakeLock a2 = qrf.a(this.b, "ProcessorForegroundLck");
                        this.a = a2;
                        a2.acquire();
                    }
                    this.Y.put(str, v8g);
                    nt3.b(this.b, uhe.d(this.b, ju0.n(v8g.X), ay5));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [qp4, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007f, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h(defpackage.yzd r13, defpackage.glc r14) {
        /*
            r12 = this;
            java.lang.String r0 = "Work "
            l7g r1 = r13.a
            java.lang.String r2 = r1.a
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            androidx.work.impl.WorkDatabase r4 = r12.X
            cu0 r5 = new cu0
            r6 = 2
            r5.<init>(r12, r3, r2, r6)
            java.lang.Object r4 = r4.p(r5)
            h8g r4 = (defpackage.h8g) r4
            r5 = 0
            if (r4 != 0) goto L_0x0037
            a14 r13 = defpackage.a14.u()
            java.lang.String r14 = x0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Didn't find WorkSpec for id "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r13.R(r14, r0)
            r12.f(r1)
            return r5
        L_0x0037:
            java.lang.Object r6 = r12.w0
            monitor-enter(r6)
            boolean r7 = r12.d(r2)     // Catch:{ all -> 0x0078 }
            if (r7 == 0) goto L_0x0080
            java.util.HashMap r14 = r12.s0     // Catch:{ all -> 0x0078 }
            java.lang.Object r14 = r14.get(r2)     // Catch:{ all -> 0x0078 }
            java.util.Set r14 = (java.util.Set) r14     // Catch:{ all -> 0x0078 }
            java.util.Iterator r2 = r14.iterator()     // Catch:{ all -> 0x0078 }
            java.lang.Object r2 = r2.next()     // Catch:{ all -> 0x0078 }
            yzd r2 = (defpackage.yzd) r2     // Catch:{ all -> 0x0078 }
            l7g r2 = r2.a     // Catch:{ all -> 0x0078 }
            int r2 = r2.b     // Catch:{ all -> 0x0078 }
            int r3 = r1.b     // Catch:{ all -> 0x0078 }
            if (r2 != r3) goto L_0x007b
            r14.add(r13)     // Catch:{ all -> 0x0078 }
            a14 r12 = defpackage.a14.u()     // Catch:{ all -> 0x0078 }
            java.lang.String r13 = x0     // Catch:{ all -> 0x0078 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0078 }
            r14.<init>(r0)     // Catch:{ all -> 0x0078 }
            r14.append(r1)     // Catch:{ all -> 0x0078 }
            java.lang.String r0 = " is already enqueued for processing"
            r14.append(r0)     // Catch:{ all -> 0x0078 }
            java.lang.String r14 = r14.toString()     // Catch:{ all -> 0x0078 }
            r12.n(r13, r14)     // Catch:{ all -> 0x0078 }
            goto L_0x007e
        L_0x0078:
            r12 = move-exception
            goto L_0x0118
        L_0x007b:
            r12.f(r1)     // Catch:{ all -> 0x0078 }
        L_0x007e:
            monitor-exit(r6)     // Catch:{ all -> 0x0078 }
            return r5
        L_0x0080:
            int r0 = r4.t     // Catch:{ all -> 0x0078 }
            int r7 = r1.b     // Catch:{ all -> 0x0078 }
            if (r0 == r7) goto L_0x008b
            r12.f(r1)     // Catch:{ all -> 0x0078 }
            monitor-exit(r6)     // Catch:{ all -> 0x0078 }
            return r5
        L_0x008b:
            qp4 r0 = new qp4     // Catch:{ all -> 0x0078 }
            android.content.Context r5 = r12.b     // Catch:{ all -> 0x0078 }
            me3 r7 = r12.c     // Catch:{ all -> 0x0078 }
            wne r8 = r12.o     // Catch:{ all -> 0x0078 }
            androidx.work.impl.WorkDatabase r9 = r12.X     // Catch:{ all -> 0x0078 }
            r0.<init>()     // Catch:{ all -> 0x0078 }
            glc r10 = new glc     // Catch:{ all -> 0x0078 }
            r11 = 14
            r10.<init>((int) r11)     // Catch:{ all -> 0x0078 }
            r0.t0 = r10     // Catch:{ all -> 0x0078 }
            android.content.Context r5 = r5.getApplicationContext()     // Catch:{ all -> 0x0078 }
            r0.b = r5     // Catch:{ all -> 0x0078 }
            r0.a = r8     // Catch:{ all -> 0x0078 }
            r0.c = r12     // Catch:{ all -> 0x0078 }
            r0.o = r7     // Catch:{ all -> 0x0078 }
            r0.X = r9     // Catch:{ all -> 0x0078 }
            r0.Y = r4     // Catch:{ all -> 0x0078 }
            r0.s0 = r3     // Catch:{ all -> 0x0078 }
            java.util.List r3 = r12.t0     // Catch:{ all -> 0x0078 }
            r0.Z = r3     // Catch:{ all -> 0x0078 }
            if (r14 == 0) goto L_0x00bb
            r0.t0 = r14     // Catch:{ all -> 0x0078 }
        L_0x00bb:
            v8g r14 = new v8g     // Catch:{ all -> 0x0078 }
            r14.<init>(r0)     // Catch:{ all -> 0x0078 }
            dcd r0 = r14.A0     // Catch:{ all -> 0x0078 }
            wi3 r3 = new wi3     // Catch:{ all -> 0x0078 }
            l7g r4 = r13.a     // Catch:{ all -> 0x0078 }
            r5 = 4
            r3.<init>(r12, r4, r0, r5)     // Catch:{ all -> 0x0078 }
            wne r4 = r12.o     // Catch:{ all -> 0x0078 }
            bkb r4 = (defpackage.bkb) r4     // Catch:{ all -> 0x0078 }
            java.lang.Object r4 = r4.c     // Catch:{ all -> 0x0078 }
            k40 r4 = (defpackage.k40) r4     // Catch:{ all -> 0x0078 }
            r0.d(r3, r4)     // Catch:{ all -> 0x0078 }
            java.util.HashMap r0 = r12.Z     // Catch:{ all -> 0x0078 }
            r0.put(r2, r14)     // Catch:{ all -> 0x0078 }
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x0078 }
            r0.<init>()     // Catch:{ all -> 0x0078 }
            r0.add(r13)     // Catch:{ all -> 0x0078 }
            java.util.HashMap r13 = r12.s0     // Catch:{ all -> 0x0078 }
            r13.put(r2, r0)     // Catch:{ all -> 0x0078 }
            monitor-exit(r6)     // Catch:{ all -> 0x0078 }
            wne r12 = r12.o
            bkb r12 = (defpackage.bkb) r12
            java.lang.Object r12 = r12.a
            qm r12 = (defpackage.qm) r12
            r12.execute(r14)
            a14 r12 = defpackage.a14.u()
            java.lang.String r13 = x0
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.Class<y9b> r0 = defpackage.y9b.class
            java.lang.String r0 = r0.getSimpleName()
            r14.append(r0)
            java.lang.String r0 = ": processing "
            r14.append(r0)
            r14.append(r1)
            java.lang.String r14 = r14.toString()
            r12.n(r13, r14)
            r12 = 1
            return r12
        L_0x0118:
            monitor-exit(r6)     // Catch:{ all -> 0x0078 }
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y9b.h(yzd, glc):boolean");
    }

    public final void i() {
        synchronized (this.w0) {
            try {
                if (!(!this.Y.isEmpty())) {
                    Context context = this.b;
                    String str = uhe.u0;
                    Intent intent = new Intent(context, SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    this.b.startService(intent);
                    PowerManager.WakeLock wakeLock = this.a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.a = null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
