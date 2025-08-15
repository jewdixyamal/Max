package defpackage;

import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.work.WorkRequest;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* renamed from: s7g  reason: default package */
public final class s7g extends p7g {
    public static s7g k = null;
    public static s7g l = null;
    public static final Object m = new Object();
    public final Context a;
    public final me3 b;
    public final WorkDatabase c;
    public final wne d;
    public final List e;
    public final y9b f;
    public final wmc g;
    public boolean h;
    public BroadcastReceiver.PendingResult i;
    public final c8d j;

    static {
        a14.O("WorkManagerImpl");
    }

    /* JADX WARNING: type inference failed for: r5v17, types: [java.lang.Object, c8d] */
    public s7g(Context context, me3 me3, bkb bkb) {
        hlc hlc;
        boolean z = context.getResources().getBoolean(xsb.workmanager_test_configuration);
        Context applicationContext = context.getApplicationContext();
        qm qmVar = (qm) bkb.a;
        Class<WorkDatabase> cls = WorkDatabase.class;
        if (z) {
            hlc = new hlc(applicationContext, (String) null, cls);
            hlc.j = true;
        } else {
            hlc = fp3.u(applicationContext, "androidx.work.workdb", cls);
            hlc.i = new dp(applicationContext);
        }
        hlc.g = qmVar;
        hlc.d.add(m23.b);
        hlc.a(ea9.g);
        hlc.a(new dic(2, 3, applicationContext));
        hlc.a(ea9.h);
        hlc.a(ea9.i);
        hlc.a(new dic(5, 6, applicationContext));
        hlc.a(ea9.j);
        hlc.a(ea9.k);
        hlc.a(ea9.l);
        hlc.a(new dic(applicationContext));
        hlc.a(new dic(10, 11, applicationContext));
        hlc.a(ea9.d);
        hlc.a(ea9.e);
        hlc.a(ea9.f);
        hlc.l = false;
        hlc.m = true;
        WorkDatabase workDatabase = (WorkDatabase) hlc.b();
        Context applicationContext2 = context.getApplicationContext();
        int i2 = me3.f;
        et7 et7 = new et7(0, (byte) 0);
        synchronized (a14.e) {
            a14.f = et7;
        }
        il0 il0 = new il0(applicationContext2.getApplicationContext(), bkb, 0);
        il0 il02 = new il0(applicationContext2.getApplicationContext(), bkb, 1);
        Context applicationContext3 = applicationContext2.getApplicationContext();
        String str = zn9.a;
        yn9 yn9 = new yn9(applicationContext3, bkb);
        il0 il03 = new il0(applicationContext2.getApplicationContext(), bkb, 2);
        ? obj = new Object();
        obj.a = il0;
        obj.b = il02;
        obj.c = yn9;
        obj.o = il03;
        this.j = obj;
        String str2 = nuc.a;
        auc fie = new fie(applicationContext2, this);
        woa.a(applicationContext2, SystemJobService.class, true);
        a14.u().n(nuc.a, "Created SystemJobScheduler and enabled SystemJobService");
        List asList = Arrays.asList(new auc[]{fie, new uf6(applicationContext2, me3, obj, this)});
        y9b y9b = new y9b(context, me3, bkb, workDatabase, asList);
        Context applicationContext4 = context.getApplicationContext();
        this.a = applicationContext4;
        this.b = me3;
        this.d = bkb;
        this.c = workDatabase;
        this.e = asList;
        this.f = y9b;
        this.g = new wmc(workDatabase, false);
        this.h = false;
        if (!r7g.a(applicationContext4)) {
            this.d.l(new wx5(applicationContext4, this));
            return;
        }
        throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static defpackage.s7g d(android.content.Context r2) {
        /*
            java.lang.Object r0 = m
            monitor-enter(r0)
            monitor-enter(r0)     // Catch:{ all -> 0x0028 }
            s7g r1 = k     // Catch:{ all -> 0x000a }
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            goto L_0x000f
        L_0x000a:
            r2 = move-exception
            goto L_0x0034
        L_0x000c:
            s7g r1 = l     // Catch:{ all -> 0x000a }
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
        L_0x000f:
            if (r1 != 0) goto L_0x0032
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x0028 }
            boolean r1 = r2 instanceof defpackage.ke3     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x002a
            r1 = r2
            ke3 r1 = (defpackage.ke3) r1     // Catch:{ all -> 0x0028 }
            me3 r1 = r1.a()     // Catch:{ all -> 0x0028 }
            e(r2, r1)     // Catch:{ all -> 0x0028 }
            s7g r1 = d(r2)     // Catch:{ all -> 0x0028 }
            goto L_0x0032
        L_0x0028:
            r2 = move-exception
            goto L_0x0036
        L_0x002a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0028 }
            java.lang.String r1 = "WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider."
            r2.<init>(r1)     // Catch:{ all -> 0x0028 }
            throw r2     // Catch:{ all -> 0x0028 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return r1
        L_0x0034:
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            throw r2     // Catch:{ all -> 0x0028 }
        L_0x0036:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s7g.d(android.content.Context):s7g");
    }

    public static void e(Context context, me3 me3) {
        synchronized (m) {
            try {
                s7g s7g = k;
                if (s7g != null) {
                    if (l != null) {
                        throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                    }
                }
                if (s7g == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (l == null) {
                        l = new s7g(applicationContext, me3, new bkb(me3.b));
                    }
                    k = l;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final pma b(String str, int i2, mta mta) {
        if (i2 == 3) {
            imc imc = new imc(28);
            ((qm) ((bkb) this.d).a).execute(new vq1(this, str, imc, new t8g(mta, this, str, imc), (WorkRequest) mta));
            return imc;
        }
        return new g7g(this, str, i2 == 2 ? h65.b : h65.a, Collections.singletonList(mta)).l();
    }

    public final PendingIntent c(UUID uuid) {
        Context context = this.a;
        String uuid2 = uuid.toString();
        String str = uhe.u0;
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_CANCEL_WORK");
        intent.setData(Uri.parse("workspec://" + uuid2));
        intent.putExtra("KEY_WORKSPEC_ID", uuid2);
        return PendingIntent.getService(context, 0, intent, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
    }

    public final void f() {
        synchronized (m) {
            try {
                this.h = true;
                BroadcastReceiver.PendingResult pendingResult = this.i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void g() {
        ArrayList b2;
        WorkDatabase workDatabase = this.c;
        Context context = this.a;
        String str = fie.X;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (!(jobScheduler == null || (b2 = fie.b(context, jobScheduler)) == null || b2.isEmpty())) {
            Iterator it = b2.iterator();
            while (it.hasNext()) {
                fie.a(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        i8g y = workDatabase.y();
        ilc ilc = (ilc) y.a;
        ilc.b();
        ktf ktf = (ktf) y.l;
        q36 f2 = ktf.f();
        ilc.c();
        try {
            f2.n();
            ilc.r();
            ilc.l();
            ktf.t(f2);
            nuc.a(this.b, workDatabase, this.e);
        } catch (Throwable th) {
            ilc.l();
            ktf.t(f2);
            throw th;
        }
    }

    public final void h(yzd yzd, glc glc) {
        wne wne = this.d;
        wi3 wi3 = new wi3(6);
        wi3.b = this;
        wi3.c = yzd;
        wi3.o = glc;
        wne.l(wi3);
    }
}
