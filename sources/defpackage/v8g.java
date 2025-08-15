package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: v8g  reason: default package */
public final class v8g implements Runnable {
    public static final String D0 = a14.O("WorkerWrapper");
    public final dcd A0 = new Object();
    public final dcd B0 = new Object();
    public volatile boolean C0;
    public final h8g X;
    public gm7 Y;
    public final wne Z;
    public final Context a;
    public final String b;
    public final List c;
    public final glc o;
    public fm7 s0 = fm7.a();
    public final me3 t0;
    public final cy5 u0;
    public final WorkDatabase v0;
    public final i8g w0;
    public final ph4 x0;
    public final List y0;
    public String z0;

    /* JADX WARNING: type inference failed for: r0v1, types: [dcd, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v2, types: [dcd, java.lang.Object] */
    public v8g(qp4 qp4) {
        this.a = (Context) qp4.b;
        this.Z = (wne) qp4.a;
        this.u0 = (cy5) qp4.c;
        h8g h8g = (h8g) qp4.Y;
        this.X = h8g;
        this.b = h8g.a;
        this.c = (List) qp4.Z;
        this.o = (glc) qp4.t0;
        this.Y = null;
        this.t0 = (me3) qp4.o;
        WorkDatabase workDatabase = (WorkDatabase) qp4.X;
        this.v0 = workDatabase;
        this.w0 = workDatabase.y();
        this.x0 = workDatabase.t();
        this.y0 = (List) qp4.s0;
    }

    public final void a(fm7 fm7) {
        boolean z = fm7 instanceof em7;
        h8g h8g = this.X;
        String str = D0;
        if (z) {
            a14 u = a14.u();
            u.x(str, "Worker result SUCCESS for " + this.z0);
            if (h8g.d()) {
                d();
                return;
            }
            ph4 ph4 = this.x0;
            String str2 = this.b;
            i8g i8g = this.w0;
            WorkDatabase workDatabase = this.v0;
            workDatabase.c();
            try {
                i8g.q(m7g.c, str2);
                i8g.p(str2, ((em7) this.s0).a);
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it = ph4.n(str2).iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    if (i8g.j(str3) == m7g.X && ph4.q(str3)) {
                        a14 u2 = a14.u();
                        u2.x(str, "Setting status to enqueued for " + str3);
                        i8g.q(m7g.a, str3);
                        i8g.o(currentTimeMillis, str3);
                    }
                }
                workDatabase.r();
                workDatabase.l();
                e(false);
            } catch (Throwable th) {
                workDatabase.l();
                e(false);
                throw th;
            }
        } else if (fm7 instanceof dm7) {
            a14 u3 = a14.u();
            u3.x(str, "Worker result RETRY for " + this.z0);
            c();
        } else {
            a14 u4 = a14.u();
            u4.x(str, "Worker result FAILURE for " + this.z0);
            if (h8g.d()) {
                d();
            } else {
                g();
            }
        }
    }

    public final void b() {
        boolean h = h();
        WorkDatabase workDatabase = this.v0;
        String str = this.b;
        if (!h) {
            workDatabase.c();
            try {
                m7g j = this.w0.j(str);
                workDatabase.x().f(str);
                if (j == null) {
                    e(false);
                } else if (j == m7g.b) {
                    a(this.s0);
                } else if (!j.a()) {
                    c();
                }
                workDatabase.r();
                workDatabase.l();
            } catch (Throwable th) {
                workDatabase.l();
                throw th;
            }
        }
        List<auc> list = this.c;
        if (list != null) {
            for (auc d : list) {
                d.d(str);
            }
            nuc.a(this.t0, workDatabase, list);
        }
    }

    public final void c() {
        String str = this.b;
        i8g i8g = this.w0;
        WorkDatabase workDatabase = this.v0;
        workDatabase.c();
        try {
            i8g.q(m7g.a, str);
            i8g.o(System.currentTimeMillis(), str);
            i8g.n(-1, str);
            workDatabase.r();
        } finally {
            workDatabase.l();
            e(true);
        }
    }

    public final void d() {
        ilc ilc;
        ktf ktf;
        q36 f;
        ktf ktf2;
        q36 f2;
        String str = this.b;
        i8g i8g = this.w0;
        WorkDatabase workDatabase = this.v0;
        workDatabase.c();
        try {
            i8g.o(System.currentTimeMillis(), str);
            ilc = (ilc) i8g.a;
            i8g.q(m7g.a, str);
            ilc.b();
            ktf = (ktf) i8g.j;
            f = ktf.f();
            if (str == null) {
                f.W(1);
            } else {
                f.f(1, str);
            }
            ilc.c();
            f.n();
            ilc.r();
            ilc.l();
            ktf.t(f);
            ilc.b();
            ktf2 = (ktf) i8g.f;
            f2 = ktf2.f();
            if (str == null) {
                f2.W(1);
            } else {
                f2.f(1, str);
            }
            ilc.c();
            f2.n();
            ilc.r();
            ilc.l();
            ktf2.t(f2);
            i8g.n(-1, str);
            workDatabase.r();
            workDatabase.l();
            e(false);
        } catch (Throwable th) {
            workDatabase.l();
            e(false);
            throw th;
        }
    }

    public final void e(boolean z) {
        xlc a2;
        Cursor o2;
        boolean containsKey;
        this.v0.c();
        try {
            i8g y = this.v0.y();
            y.getClass();
            a2 = xlc.a(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
            ilc ilc = (ilc) y.a;
            ilc.b();
            o2 = ilc.o(a2, (CancellationSignal) null);
            boolean z2 = o2.moveToFirst() && o2.getInt(0) != 0;
            o2.close();
            a2.n();
            if (!z2) {
                woa.a(this.a, RescheduleReceiver.class, false);
            }
            if (z) {
                this.w0.q(m7g.a, this.b);
                this.w0.n(-1, this.b);
            }
            if (!(this.X == null || this.Y == null)) {
                cy5 cy5 = this.u0;
                String str = this.b;
                y9b y9b = (y9b) cy5;
                synchronized (y9b.w0) {
                    containsKey = y9b.Y.containsKey(str);
                }
                if (containsKey) {
                    cy5 cy52 = this.u0;
                    String str2 = this.b;
                    y9b y9b2 = (y9b) cy52;
                    synchronized (y9b2.w0) {
                        y9b2.Y.remove(str2);
                        y9b2.i();
                    }
                }
            }
            this.v0.r();
            this.v0.l();
            this.A0.j(Boolean.valueOf(z));
        } catch (Throwable th) {
            this.v0.l();
            throw th;
        }
    }

    public final void f() {
        i8g i8g = this.w0;
        String str = this.b;
        m7g j = i8g.j(str);
        m7g m7g = m7g.b;
        String str2 = D0;
        if (j == m7g) {
            a14 u = a14.u();
            u.n(str2, "Status for " + str + " is RUNNING; not doing any work and rescheduling for later execution");
            e(true);
            return;
        }
        a14 u2 = a14.u();
        u2.n(str2, "Status for " + str + " is " + j + " ; not doing any work");
        e(false);
    }

    public final void g() {
        String str = this.b;
        WorkDatabase workDatabase = this.v0;
        workDatabase.c();
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (true) {
                boolean isEmpty = linkedList.isEmpty();
                i8g i8g = this.w0;
                if (!isEmpty) {
                    String str2 = (String) linkedList.remove();
                    if (i8g.j(str2) != m7g.Y) {
                        i8g.q(m7g.o, str2);
                    }
                    linkedList.addAll(this.x0.n(str2));
                } else {
                    i8g.p(str, ((cm7) this.s0).a);
                    workDatabase.r();
                    return;
                }
            }
        } finally {
            workDatabase.l();
            e(false);
        }
    }

    public final boolean h() {
        if (!this.C0) {
            return false;
        }
        a14 u = a14.u();
        String str = D0;
        u.n(str, "Work interrupted for " + this.z0);
        m7g j = this.w0.j(this.b);
        if (j == null) {
            e(false);
        } else {
            e(!j.a());
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r2v0, types: [androidx.work.WorkerParameters, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0091, code lost:
        if ((r5.b == r9 && r5.k > 0) != false) goto L_0x0093;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r24 = this;
            r1 = r24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Work [ id="
            r0.<init>(r3)
            java.lang.String r3 = r1.b
            r0.append(r3)
            java.lang.String r4 = ", tags={ "
            r0.append(r4)
            java.util.List r4 = r1.y0
            java.util.Iterator r5 = r4.iterator()
            r6 = 1
            r7 = r6
        L_0x001b:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x0034
            java.lang.Object r8 = r5.next()
            java.lang.String r8 = (java.lang.String) r8
            if (r7 == 0) goto L_0x002b
            r7 = 0
            goto L_0x0030
        L_0x002b:
            java.lang.String r9 = ", "
            r0.append(r9)
        L_0x0030:
            r0.append(r8)
            goto L_0x001b
        L_0x0034:
            java.lang.String r5 = " } ]"
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r1.z0 = r0
            h8g r5 = r1.X
            java.lang.String r0 = "Delaying execution for "
            boolean r7 = r24.h()
            if (r7 == 0) goto L_0x004b
            goto L_0x02b5
        L_0x004b:
            androidx.work.impl.WorkDatabase r7 = r1.v0
            r7.c()
            m7g r8 = r5.b     // Catch:{ all -> 0x007d }
            m7g r9 = defpackage.m7g.a
            java.lang.String r10 = r5.c
            java.lang.String r11 = D0
            if (r8 == r9) goto L_0x0080
            r24.f()     // Catch:{ all -> 0x007d }
            r7.r()     // Catch:{ all -> 0x007d }
            a14 r0 = defpackage.a14.u()     // Catch:{ all -> 0x007d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x007d }
            r1.<init>()     // Catch:{ all -> 0x007d }
            r1.append(r10)     // Catch:{ all -> 0x007d }
            java.lang.String r2 = " is not in ENQUEUED state. Nothing more to do"
            r1.append(r2)     // Catch:{ all -> 0x007d }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x007d }
            r0.n(r11, r1)     // Catch:{ all -> 0x007d }
        L_0x0078:
            r7.l()
            goto L_0x02b5
        L_0x007d:
            r0 = move-exception
            goto L_0x02c1
        L_0x0080:
            boolean r8 = r5.d()     // Catch:{ all -> 0x007d }
            if (r8 != 0) goto L_0x0093
            m7g r8 = r5.b     // Catch:{ all -> 0x007d }
            if (r8 != r9) goto L_0x0090
            int r8 = r5.k     // Catch:{ all -> 0x007d }
            if (r8 <= 0) goto L_0x0090
            r8 = r6
            goto L_0x0091
        L_0x0090:
            r8 = 0
        L_0x0091:
            if (r8 == 0) goto L_0x00be
        L_0x0093:
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x007d }
            long r14 = r5.a()     // Catch:{ all -> 0x007d }
            int r8 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r8 >= 0) goto L_0x00be
            a14 r2 = defpackage.a14.u()     // Catch:{ all -> 0x007d }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x007d }
            r3.<init>(r0)     // Catch:{ all -> 0x007d }
            r3.append(r10)     // Catch:{ all -> 0x007d }
            java.lang.String r0 = " because it is being executed before schedule."
            r3.append(r0)     // Catch:{ all -> 0x007d }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x007d }
            r2.n(r11, r0)     // Catch:{ all -> 0x007d }
            r1.e(r6)     // Catch:{ all -> 0x007d }
            r7.r()     // Catch:{ all -> 0x007d }
            goto L_0x0078
        L_0x00be:
            r7.r()     // Catch:{ all -> 0x007d }
            r7.l()
            boolean r0 = r5.d()
            i8g r8 = r1.w0
            me3 r12 = r1.t0
            if (r0 == 0) goto L_0x00d2
            d24 r0 = r5.e
            goto L_0x0176
        L_0x00d2:
            xxc r0 = r12.d
            java.lang.String r13 = r5.d
            r0.getClass()
            java.lang.String r0 = defpackage.n17.a
            r14 = 0
            java.lang.Class r0 = java.lang.Class.forName(r13)     // Catch:{ Exception -> 0x00eb }
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r14)     // Catch:{ Exception -> 0x00eb }
            java.lang.Object r0 = r0.newInstance(r14)     // Catch:{ Exception -> 0x00eb }
            n17 r0 = (defpackage.n17) r0     // Catch:{ Exception -> 0x00eb }
            goto L_0x00fc
        L_0x00eb:
            r0 = move-exception
            a14 r15 = defpackage.a14.u()
            java.lang.String r2 = "Trouble instantiating + "
            java.lang.String r2 = defpackage.wg0.i(r2, r13)
            java.lang.String r13 = defpackage.n17.a
            r15.r(r13, r2, r0)
            r0 = r14
        L_0x00fc:
            if (r0 != 0) goto L_0x011a
            a14 r0 = defpackage.a14.u()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Could not create Input Merger "
            r2.<init>(r3)
            java.lang.String r3 = r5.d
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.q(r11, r2)
            r24.g()
            goto L_0x02b5
        L_0x011a:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            d24 r13 = r5.e
            r2.add(r13)
            r8.getClass()
            java.lang.String r13 = "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)"
            xlc r13 = defpackage.xlc.a(r6, r13)
            if (r3 != 0) goto L_0x0133
            r13.W(r6)
            goto L_0x0136
        L_0x0133:
            r13.f(r6, r3)
        L_0x0136:
            java.lang.Object r15 = r8.a
            ilc r15 = (defpackage.ilc) r15
            r15.b()
            android.database.Cursor r15 = r15.o(r13, r14)
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x0166 }
            int r6 = r15.getCount()     // Catch:{ all -> 0x0166 }
            r14.<init>(r6)     // Catch:{ all -> 0x0166 }
        L_0x014a:
            boolean r6 = r15.moveToNext()     // Catch:{ all -> 0x0166 }
            if (r6 == 0) goto L_0x0169
            r6 = 0
            boolean r16 = r15.isNull(r6)     // Catch:{ all -> 0x0166 }
            if (r16 == 0) goto L_0x015a
            r18 = 0
            goto L_0x015e
        L_0x015a:
            byte[] r18 = r15.getBlob(r6)     // Catch:{ all -> 0x0166 }
        L_0x015e:
            d24 r6 = defpackage.d24.a(r18)     // Catch:{ all -> 0x0166 }
            r14.add(r6)     // Catch:{ all -> 0x0166 }
            goto L_0x014a
        L_0x0166:
            r0 = move-exception
            goto L_0x02ba
        L_0x0169:
            r15.close()
            r13.n()
            r2.addAll(r14)
            d24 r0 = r0.a(r2)
        L_0x0176:
            androidx.work.WorkerParameters r2 = new androidx.work.WorkerParameters
            java.util.UUID r6 = java.util.UUID.fromString(r3)
            int r5 = r5.k
            java.util.concurrent.Executor r13 = r12.a
            b8g r14 = new b8g
            wne r15 = r1.Z
            r14.<init>(r7, r15)
            r17 = r9
            k7g r9 = new k7g
            r18 = r3
            cy5 r3 = r1.u0
            r9.<init>(r7, r3, r15)
            r2.<init>()
            r2.a = r6
            r2.b = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r4)
            r2.c = r0
            glc r0 = r1.o
            r2.d = r0
            r2.e = r5
            r2.f = r13
            r2.g = r15
            p8g r0 = r12.c
            r2.h = r0
            r2.i = r14
            r2.j = r9
            gm7 r3 = r1.Y
            if (r3 != 0) goto L_0x01be
            android.content.Context r3 = r1.a
            gm7 r0 = r0.b(r3, r10, r2)
            r1.Y = r0
        L_0x01be:
            gm7 r0 = r1.Y
            if (r0 != 0) goto L_0x01dc
            a14 r0 = defpackage.a14.u()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Could not create Worker "
            r2.<init>(r3)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            r0.q(r11, r2)
            r24.g()
            goto L_0x02b5
        L_0x01dc:
            boolean r0 = r0.isUsed()
            if (r0 == 0) goto L_0x0201
            a14 r0 = defpackage.a14.u()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Received an already-used Worker "
            r2.<init>(r3)
            r2.append(r10)
            java.lang.String r3 = "; Worker Factory should return new instances"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.q(r11, r2)
            r24.g()
            goto L_0x02b5
        L_0x0201:
            gm7 r0 = r1.Y
            r0.setUsed()
            r7.c()
            r2 = r18
            m7g r0 = r8.j(r2)     // Catch:{ all -> 0x024c }
            r3 = r17
            if (r0 != r3) goto L_0x024e
            m7g r0 = defpackage.m7g.b     // Catch:{ all -> 0x024c }
            r8.q(r0, r2)     // Catch:{ all -> 0x024c }
            java.lang.Object r0 = r8.a     // Catch:{ all -> 0x024c }
            r3 = r0
            ilc r3 = (defpackage.ilc) r3     // Catch:{ all -> 0x024c }
            r3.b()     // Catch:{ all -> 0x024c }
            java.lang.Object r0 = r8.i     // Catch:{ all -> 0x024c }
            r4 = r0
            ktf r4 = (defpackage.ktf) r4     // Catch:{ all -> 0x024c }
            q36 r5 = r4.f()     // Catch:{ all -> 0x024c }
            if (r2 != 0) goto L_0x0230
            r6 = 1
            r5.W(r6)     // Catch:{ all -> 0x024c }
            goto L_0x0234
        L_0x0230:
            r6 = 1
            r5.f(r6, r2)     // Catch:{ all -> 0x024c }
        L_0x0234:
            r3.c()     // Catch:{ all -> 0x024c }
            r5.n()     // Catch:{ all -> 0x0244 }
            r3.r()     // Catch:{ all -> 0x0244 }
            r3.l()     // Catch:{ all -> 0x024c }
            r4.t(r5)     // Catch:{ all -> 0x024c }
            goto L_0x024f
        L_0x0244:
            r0 = move-exception
            r3.l()     // Catch:{ all -> 0x024c }
            r4.t(r5)     // Catch:{ all -> 0x024c }
            throw r0     // Catch:{ all -> 0x024c }
        L_0x024c:
            r0 = move-exception
            goto L_0x02b6
        L_0x024e:
            r6 = 0
        L_0x024f:
            r7.r()     // Catch:{ all -> 0x024c }
            r7.l()
            if (r6 == 0) goto L_0x02b2
            boolean r0 = r24.h()
            if (r0 == 0) goto L_0x025e
            goto L_0x02b5
        L_0x025e:
            j7g r0 = new j7g
            gm7 r2 = r1.Y
            android.content.Context r3 = r1.a
            h8g r4 = r1.X
            wne r5 = r1.Z
            r18 = r0
            r19 = r3
            r20 = r4
            r21 = r2
            r22 = r9
            r23 = r5
            r18.<init>(r19, r20, r21, r22, r23)
            bkb r15 = (defpackage.bkb) r15
            java.lang.Object r2 = r15.c
            k40 r2 = (defpackage.k40) r2
            r2.execute(r0)
            fre r2 = new fre
            dcd r0 = r0.a
            r3 = 22
            r2.<init>(r1, r3, r0)
            ok4 r3 = new ok4
            r4 = 5
            r3.<init>(r4)
            dcd r4 = r1.B0
            r4.d(r2, r3)
            i76 r2 = new i76
            r3 = 27
            r5 = 0
            r2.<init>((java.lang.Object) r1, (java.lang.Object) r0, (boolean) r5, (int) r3)
            java.lang.Object r3 = r15.c
            k40 r3 = (defpackage.k40) r3
            r0.d(r2, r3)
            java.lang.String r0 = r1.z0
            u8g r2 = new u8g
            r2.<init>(r1, r5, r0)
            java.lang.Object r0 = r15.a
            qm r0 = (defpackage.qm) r0
            r4.d(r2, r0)
            goto L_0x02b5
        L_0x02b2:
            r24.f()
        L_0x02b5:
            return
        L_0x02b6:
            r7.l()
            throw r0
        L_0x02ba:
            r15.close()
            r13.n()
            throw r0
        L_0x02c1:
            r7.l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v8g.run():void");
    }
}
