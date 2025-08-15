package ru.ok.tamtam.workmanager;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.HashSet;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ok/tamtam/workmanager/BacklogWorker;", "Lru/ok/tamtam/workmanager/SdkCoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "xfg", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class BacklogWorker extends SdkCoroutineWorker {
    public static BacklogWorker Y;
    public volatile boolean X;
    public final khe a = new khe(new af0(this, 0));
    public final khe b = new khe(new af0(this, 1));
    public final Object c = new Object();
    public final HashSet o = new HashSet();

    public BacklogWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* JADX WARNING: type inference failed for: r9v16, types: [java.lang.Object, mec] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(java.util.List r7, int r8, kotlin.coroutines.Continuation r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.bf0
            if (r0 == 0) goto L_0x0013
            r0 = r9
            bf0 r0 = (defpackage.bf0) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.t0 = r1
            goto L_0x0018
        L_0x0013:
            bf0 r0 = new bf0
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.Z
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.t0
            r3 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            int r6 = r0.Y
            mec r7 = r0.X
            java.util.List r8 = r0.o
            defpackage.od2.a0(r9)
            r5 = r8
            r8 = r6
            r6 = r5
            goto L_0x0072
        L_0x0030:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0038:
            defpackage.od2.a0(r9)
            mec r9 = new mec
            r9.<init>()
            r9.a = r6
            r6 = r7
            r7 = r9
        L_0x0044:
            r9 = 10
            if (r8 <= r9) goto L_0x004b
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L_0x004b:
            java.lang.Object r9 = r7.a
            ru.ok.tamtam.workmanager.BacklogWorker r9 = (ru.ok.tamtam.workmanager.BacklogWorker) r9
            khe r9 = r9.a
            java.lang.Object r9 = r9.getValue()
            kke r9 = (defpackage.kke) r9
            w9a r9 = (defpackage.w9a) r9
            nx3 r9 = r9.b()
            cf0 r2 = new cf0
            r4 = 0
            r2.<init>(r7, r6, r4)
            r0.o = r6
            r0.X = r7
            r0.Y = r8
            r0.t0 = r3
            java.lang.Object r9 = defpackage.j47.t0(r9, r2, r0)
            if (r9 != r1) goto L_0x0072
            return r1
        L_0x0072:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L_0x0082
            java.lang.Object r9 = r7.a
            ru.ok.tamtam.workmanager.BacklogWorker r9 = (ru.ok.tamtam.workmanager.BacklogWorker) r9
            int r8 = r8 + r3
            r7.a = r9
            goto L_0x0044
        L_0x0082:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.workmanager.BacklogWorker.c(java.util.List, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r9v6, types: [java.lang.Object, mec] */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final java.lang.Object d(kotlin.coroutines.Continuation r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.df0
            if (r0 == 0) goto L_0x0013
            r0 = r9
            df0 r0 = (defpackage.df0) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            df0 r0 = new df0
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            mec r8 = r0.o
            defpackage.od2.a0(r9)
            goto L_0x009b
        L_0x0029:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0031:
            defpackage.od2.a0(r9)
            mec r9 = new mec
            r9.<init>()
            r9.a = r8
            r8 = r9
        L_0x003c:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.lang.Object r2 = r8.a
            ru.ok.tamtam.workmanager.BacklogWorker r2 = (ru.ok.tamtam.workmanager.BacklogWorker) r2
            java.lang.Object r2 = r2.c
            monitor-enter(r2)
            java.lang.String r4 = "BACKLOG_WORKER"
            java.lang.String r5 = "checkStayAliveAndRunIfNeeded %d"
            java.lang.Object r6 = r8.a     // Catch:{ all -> 0x0082 }
            ru.ok.tamtam.workmanager.BacklogWorker r6 = (ru.ok.tamtam.workmanager.BacklogWorker) r6     // Catch:{ all -> 0x0082 }
            java.util.HashSet r6 = r6.o     // Catch:{ all -> 0x0082 }
            int r6 = r6.size()     // Catch:{ all -> 0x0082 }
            java.lang.Integer r7 = new java.lang.Integer     // Catch:{ all -> 0x0082 }
            r7.<init>(r6)     // Catch:{ all -> 0x0082 }
            java.lang.Object[] r6 = new java.lang.Object[]{r7}     // Catch:{ all -> 0x0082 }
            defpackage.hm9.m(r4, r5, r6)     // Catch:{ all -> 0x0082 }
            java.lang.Object r4 = r8.a     // Catch:{ all -> 0x0082 }
            ru.ok.tamtam.workmanager.BacklogWorker r4 = (ru.ok.tamtam.workmanager.BacklogWorker) r4     // Catch:{ all -> 0x0082 }
            java.util.HashSet r4 = r4.o     // Catch:{ all -> 0x0082 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0082 }
            r4 = r4 ^ r3
            if (r4 == 0) goto L_0x0084
            java.lang.Object r4 = r8.a     // Catch:{ all -> 0x0082 }
            ru.ok.tamtam.workmanager.BacklogWorker r4 = (ru.ok.tamtam.workmanager.BacklogWorker) r4     // Catch:{ all -> 0x0082 }
            java.util.HashSet r4 = r4.o     // Catch:{ all -> 0x0082 }
            r9.addAll(r4)     // Catch:{ all -> 0x0082 }
            java.lang.Object r4 = r8.a     // Catch:{ all -> 0x0082 }
            ru.ok.tamtam.workmanager.BacklogWorker r4 = (ru.ok.tamtam.workmanager.BacklogWorker) r4     // Catch:{ all -> 0x0082 }
            java.util.HashSet r4 = r4.o     // Catch:{ all -> 0x0082 }
            r4.clear()     // Catch:{ all -> 0x0082 }
            goto L_0x0084
        L_0x0082:
            r8 = move-exception
            goto L_0x00a5
        L_0x0084:
            monitor-exit(r2)
            boolean r2 = r9.isEmpty()
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x00a2
            java.lang.Object r2 = r8.a
            ru.ok.tamtam.workmanager.BacklogWorker r2 = (ru.ok.tamtam.workmanager.BacklogWorker) r2
            r0.o = r8
            r0.Z = r3
            java.lang.Object r9 = r2.g(r9, r0)
            if (r9 != r1) goto L_0x009b
            return r1
        L_0x009b:
            java.lang.Object r9 = r8.a
            ru.ok.tamtam.workmanager.BacklogWorker r9 = (ru.ok.tamtam.workmanager.BacklogWorker) r9
            r8.a = r9
            goto L_0x003c
        L_0x00a2:
            e5f r8 = defpackage.e5f.a
            return r8
        L_0x00a5:
            monitor-exit(r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.workmanager.BacklogWorker.d(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0055 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object doWork(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.ef0
            if (r0 == 0) goto L_0x0013
            r0 = r7
            ef0 r0 = (defpackage.ef0) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            ef0 r0 = new ef0
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 == r5) goto L_0x0033
            if (r2 != r4) goto L_0x002b
            defpackage.od2.a0(r7)
            goto L_0x0056
        L_0x002b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0033:
            ru.ok.tamtam.workmanager.BacklogWorker r6 = r0.o
            defpackage.od2.a0(r7)
            goto L_0x004b
        L_0x0039:
            defpackage.od2.a0(r7)
            Y = r6
            r0.o = r6
            r0.Z = r5
            nz4 r7 = defpackage.nz4.a
            java.lang.Object r7 = r6.g(r7, r0)
            if (r7 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r0.o = r3
            r0.Z = r4
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L_0x0056
            return r1
        L_0x0056:
            Y = r3
            em7 r6 = defpackage.fm7.b()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.workmanager.BacklogWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final v7g e() {
        return (v7g) this.b.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0081 A[Catch:{ all -> 0x014b }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ca A[Catch:{ all -> 0x0044 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e7 A[Catch:{ all -> 0x0044 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f5 A[Catch:{ all -> 0x0044 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f7 A[Catch:{ all -> 0x0044 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00fa A[Catch:{ all -> 0x0044 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0110 A[Catch:{ all -> 0x0044 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0112 A[Catch:{ all -> 0x0044 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0132 A[Catch:{ all -> 0x0044 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0146 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(java.util.List r19, kotlin.coroutines.Continuation r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            boolean r2 = r1 instanceof defpackage.ff0
            if (r2 == 0) goto L_0x0017
            r2 = r1
            ff0 r2 = (defpackage.ff0) r2
            int r3 = r2.t0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.t0 = r3
            goto L_0x001c
        L_0x0017:
            ff0 r2 = new ff0
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.Z
            tx3 r3 = defpackage.tx3.a
            int r4 = r2.t0
            r5 = 1
            r6 = 0
            r7 = 3
            r8 = 2
            java.lang.String r9 = "BACKLOG_WORKER"
            r10 = 4
            if (r4 == 0) goto L_0x006d
            if (r4 == r5) goto L_0x0063
            if (r4 == r8) goto L_0x0058
            if (r4 == r7) goto L_0x004f
            if (r4 != r10) goto L_0x0047
            int r0 = r2.Y
            java.util.List r4 = r2.X
            ru.ok.tamtam.workmanager.BacklogWorker r11 = r2.o
            defpackage.od2.a0(r1)     // Catch:{ all -> 0x0044 }
        L_0x003c:
            r1 = r11
            r16 = r4
            r4 = r0
            r0 = r16
            goto L_0x0147
        L_0x0044:
            r0 = move-exception
            goto L_0x014d
        L_0x0047:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004f:
            java.util.List r0 = r2.X
            ru.ok.tamtam.workmanager.BacklogWorker r11 = r2.o
            defpackage.od2.a0(r1)     // Catch:{ all -> 0x0044 }
            goto L_0x0108
        L_0x0058:
            int r0 = r2.Y
            java.util.List r4 = r2.X
            ru.ok.tamtam.workmanager.BacklogWorker r11 = r2.o
            defpackage.od2.a0(r1)     // Catch:{ all -> 0x0044 }
            goto L_0x00df
        L_0x0063:
            int r0 = r2.Y
            java.util.List r4 = r2.X
            ru.ok.tamtam.workmanager.BacklogWorker r11 = r2.o
            defpackage.od2.a0(r1)     // Catch:{ all -> 0x0044 }
            goto L_0x00ae
        L_0x006d:
            defpackage.od2.a0(r1)
            java.lang.String r1 = "run"
            defpackage.hm9.m(r9, r1, new java.lang.Object[0])
            r0.X = r5
            r1 = r0
            r4 = r5
            r0 = r19
        L_0x007b:
            boolean r11 = r1.isStopped()     // Catch:{ all -> 0x014b }
            if (r11 != 0) goto L_0x0153
            khe r11 = r1.a     // Catch:{ all -> 0x014b }
            java.lang.Object r11 = r11.getValue()     // Catch:{ all -> 0x014b }
            kke r11 = (defpackage.kke) r11     // Catch:{ all -> 0x014b }
            w9a r11 = (defpackage.w9a) r11     // Catch:{ all -> 0x014b }
            nx3 r11 = r11.b()     // Catch:{ all -> 0x014b }
            gf0 r12 = new gf0     // Catch:{ all -> 0x014b }
            r13 = 0
            r12.<init>(r1, r13)     // Catch:{ all -> 0x014b }
            r2.o = r1     // Catch:{ all -> 0x014b }
            r2.X = r0     // Catch:{ all -> 0x014b }
            r2.Y = r4     // Catch:{ all -> 0x014b }
            r2.t0 = r5     // Catch:{ all -> 0x014b }
            java.lang.Object r11 = defpackage.j47.t0(r11, r12, r2)     // Catch:{ all -> 0x014b }
            if (r11 != r3) goto L_0x00a4
            return r3
        L_0x00a4:
            r16 = r4
            r4 = r0
            r0 = r16
            r17 = r11
            r11 = r1
            r1 = r17
        L_0x00ae:
            java.lang.Number r1 = (java.lang.Number) r1     // Catch:{ all -> 0x0044 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x0044 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0044 }
            r12.<init>()     // Catch:{ all -> 0x0044 }
            java.lang.String r13 = "run: queue count = "
            r12.append(r13)     // Catch:{ all -> 0x0044 }
            r12.append(r1)     // Catch:{ all -> 0x0044 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0044 }
            defpackage.hm9.m(r9, r12, new java.lang.Object[0])     // Catch:{ all -> 0x0044 }
            if (r1 != 0) goto L_0x00e9
            boolean r1 = r4.isEmpty()     // Catch:{ all -> 0x0044 }
            if (r1 != 0) goto L_0x0152
            r2.o = r11     // Catch:{ all -> 0x0044 }
            r2.X = r4     // Catch:{ all -> 0x0044 }
            r2.Y = r0     // Catch:{ all -> 0x0044 }
            r2.t0 = r8     // Catch:{ all -> 0x0044 }
            java.lang.Object r1 = r11.c(r4, r6, r2)     // Catch:{ all -> 0x0044 }
            if (r1 != r3) goto L_0x00df
            return r3
        L_0x00df:
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x0044 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0044 }
            if (r1 != 0) goto L_0x00e9
            goto L_0x0152
        L_0x00e9:
            v7g r1 = r11.e()     // Catch:{ all -> 0x0044 }
            int r12 = r1.k     // Catch:{ all -> 0x0044 }
            int r1 = r1.f()     // Catch:{ all -> 0x0044 }
            if (r12 >= r1) goto L_0x00f7
            r1 = r5
            goto L_0x00f8
        L_0x00f7:
            r1 = r6
        L_0x00f8:
            if (r1 == 0) goto L_0x0115
            r2.o = r11     // Catch:{ all -> 0x0044 }
            r2.X = r4     // Catch:{ all -> 0x0044 }
            r2.t0 = r7     // Catch:{ all -> 0x0044 }
            java.lang.Object r1 = r11.h(r2)     // Catch:{ all -> 0x0044 }
            if (r1 != r3) goto L_0x0107
            return r3
        L_0x0107:
            r0 = r4
        L_0x0108:
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x0044 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x0112
            r1 = r8
            goto L_0x0113
        L_0x0112:
            r1 = r5
        L_0x0113:
            r4 = r0
            r0 = r1
        L_0x0115:
            long r12 = (long) r0     // Catch:{ all -> 0x0044 }
            fke r1 = r11.getTamComponent()     // Catch:{ all -> 0x0044 }
            jyc r1 = (defpackage.jyc) r1     // Catch:{ all -> 0x0044 }
            m7b r1 = r1.q()     // Catch:{ all -> 0x0044 }
            p7b r1 = (defpackage.p7b) r1     // Catch:{ all -> 0x0044 }
            z7d r1 = r1.b     // Catch:{ all -> 0x0044 }
            r1.getClass()     // Catch:{ all -> 0x0044 }
            ru.ok.tamtam.android.prefs.PmsKey r14 = ru.ok.tamtam.android.prefs.PmsKey.f139wmbacklogworkercheckdelaysec     // Catch:{ all -> 0x0044 }
            r15 = 5
            long r7 = (long) r15     // Catch:{ all -> 0x0044 }
            long r7 = r1.q(r14, r7)     // Catch:{ all -> 0x0044 }
            int r1 = (int) r7     // Catch:{ all -> 0x0044 }
            if (r1 >= r5) goto L_0x0133
            r1 = r5
        L_0x0133:
            long r7 = (long) r1     // Catch:{ all -> 0x0044 }
            r14 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r14
            long r7 = r7 * r12
            r2.o = r11     // Catch:{ all -> 0x0044 }
            r2.X = r4     // Catch:{ all -> 0x0044 }
            r2.Y = r0     // Catch:{ all -> 0x0044 }
            r2.t0 = r10     // Catch:{ all -> 0x0044 }
            java.lang.Object r1 = defpackage.j47.x(r7, r2)     // Catch:{ all -> 0x0044 }
            if (r1 != r3) goto L_0x003c
            return r3
        L_0x0147:
            r7 = 3
            r8 = 2
            goto L_0x007b
        L_0x014b:
            r0 = move-exception
            r11 = r1
        L_0x014d:
            java.lang.String r1 = "run failure!"
            defpackage.hm9.p(r9, r1, r0)
        L_0x0152:
            r1 = r11
        L_0x0153:
            java.lang.String r0 = "run: finish!"
            defpackage.hm9.m(r9, r0, new java.lang.Object[0])
            r1.X = r6
            e5f r0 = defpackage.e5f.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.workmanager.BacklogWorker.g(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(kotlin.coroutines.Continuation r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            boolean r2 = r1 instanceof defpackage.hf0
            if (r2 == 0) goto L_0x0017
            r2 = r1
            hf0 r2 = (defpackage.hf0) r2
            int r3 = r2.t0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.t0 = r3
            goto L_0x001c
        L_0x0017:
            hf0 r2 = new hf0
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.Z
            tx3 r3 = defpackage.tx3.a
            int r4 = r2.t0
            r5 = 1
            r6 = 0
            r7 = 2
            r8 = 0
            r9 = 3
            java.lang.String r10 = "BACKLOG_WORKER"
            if (r4 == 0) goto L_0x0057
            if (r4 == r5) goto L_0x004f
            if (r4 == r7) goto L_0x0042
            if (r4 != r9) goto L_0x003a
            java.lang.Object r0 = r2.o
            java.util.HashSet r0 = (java.util.HashSet) r0
            defpackage.od2.a0(r1)
            goto L_0x0219
        L_0x003a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0042:
            java.util.HashSet r0 = r2.Y
            java.util.HashSet r4 = r2.X
            java.lang.Object r7 = r2.o
            ru.ok.tamtam.workmanager.BacklogWorker r7 = (ru.ok.tamtam.workmanager.BacklogWorker) r7
            defpackage.od2.a0(r1)
            goto L_0x01e9
        L_0x004f:
            java.lang.Object r0 = r2.o
            ru.ok.tamtam.workmanager.BacklogWorker r0 = (ru.ok.tamtam.workmanager.BacklogWorker) r0
            defpackage.od2.a0(r1)
            goto L_0x009e
        L_0x0057:
            defpackage.od2.a0(r1)
            v7g r1 = r22.e()
            int r4 = r1.f()
            int r11 = r1.k
            int r4 = r4 - r11
            int r1 = r1.f()
            int r1 = defpackage.ote.e(r4, r8, r1)
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r1)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r11 = "runPendingWorkers: pendingLimit = %d"
            defpackage.hm9.m(r10, r11, r4)
            if (r1 != 0) goto L_0x0080
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L_0x0080:
            khe r4 = r0.a
            java.lang.Object r4 = r4.getValue()
            kke r4 = (defpackage.kke) r4
            w9a r4 = (defpackage.w9a) r4
            nx3 r4 = r4.b()
            kf0 r11 = new kf0
            r11.<init>(r0, r1, r6)
            r2.o = r0
            r2.t0 = r5
            java.lang.Object r1 = defpackage.j47.t0(r4, r11, r2)
            if (r1 != r3) goto L_0x009e
            return r3
        L_0x009e:
            java.util.List r1 = (java.util.List) r1
            int r4 = r1.size()
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r11}
            java.lang.String r11 = "runPendingWorkers: items.count = %d"
            defpackage.hm9.m(r10, r11, r4)
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L_0x00bb
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L_0x00bb:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x00c9:
            boolean r12 = r1.hasNext()
            if (r12 == 0) goto L_0x01bc
            java.lang.Object r12 = r1.next()
            q8g r12 = (defpackage.q8g) r12
            v7g r13 = r0.e()
            int r14 = r13.k
            int r13 = r13.f()
            if (r14 >= r13) goto L_0x01b6
            h8g r13 = r12.d
            boolean r14 = r13.d()
            if (r14 == 0) goto L_0x00f9
            lta r14 = new lta
            java.lang.String r15 = r13.c
            java.lang.Class r15 = java.lang.Class.forName(r15)
            long r6 = r13.n
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            r14.<init>(r15, r6, r9)
            goto L_0x0104
        L_0x00f9:
            qla r14 = new qla
            java.lang.String r6 = r13.c
            java.lang.Class r6 = java.lang.Class.forName(r6)
            r14.<init>(r6)
        L_0x0104:
            java.lang.String r6 = r12.a
            java.util.UUID r6 = java.util.UUID.fromString(r6)
            java.lang.Class r7 = r14.getClass()
            java.lang.Class r7 = r7.getSuperclass()
            java.lang.String r9 = "workSpec"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r9)
            r7.setAccessible(r5)
            r7.set(r14, r13)
            java.lang.Class r7 = r14.getClass()
            java.lang.Class r7 = r7.getSuperclass()
            java.lang.String r9 = "id"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r9)
            r7.setAccessible(r5)
            r7.set(r14, r6)
            java.util.Set r6 = r12.e
            java.util.Iterator r6 = r6.iterator()
        L_0x0138:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0148
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            r14.addTag(r7)
            goto L_0x0138
        L_0x0148:
            androidx.work.WorkRequest r6 = r14.build()
            boolean r7 = r6 instanceof defpackage.rla
            if (r7 == 0) goto L_0x0163
            v7g r7 = r0.e()
            java.lang.String r9 = r12.b
            h65 r13 = r12.c
            rla r6 = (defpackage.rla) r6
            mh7 r6 = r7.b(r9, r13, r6, r8)
            ae3 r6 = r6.l()
            goto L_0x0187
        L_0x0163:
            boolean r7 = r6 instanceof defpackage.mta
            if (r7 == 0) goto L_0x01b1
            v7g r16 = r0.e()
            java.lang.String r7 = r12.b
            h65 r9 = r12.c
            h65 r13 = defpackage.h65.b
            if (r9 != r13) goto L_0x0176
            r18 = 2
            goto L_0x0179
        L_0x0176:
            r9 = 4
            r18 = r9
        L_0x0179:
            r19 = r6
            mta r19 = (defpackage.mta) r19
            r21 = 16
            r20 = 0
            r17 = r7
            ae3 r6 = defpackage.v7g.e(r16, r17, r18, r19, r20, r21)
        L_0x0187:
            boolean r6 = r6.b
            if (r6 == 0) goto L_0x01a1
            java.lang.String r6 = r12.b
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r5)
            java.lang.String r7 = "work %s is enqueued!"
            r9 = 0
            defpackage.hm9.k0(r10, r9, r7, r6)
            java.lang.String r6 = r12.a
            r4.add(r6)
            goto L_0x01b1
        L_0x01a1:
            java.lang.String r6 = r12.b
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r7 = "work %s is running!"
            defpackage.hm9.m(r10, r7, r6)
            java.lang.String r6 = r12.a
            r11.add(r6)
        L_0x01b1:
            r6 = 0
            r7 = 2
            r9 = 3
            goto L_0x00c9
        L_0x01b6:
            java.lang.String r6 = r12.a
            r4.add(r6)
            goto L_0x01b1
        L_0x01bc:
            boolean r1 = r4.isEmpty()
            r1 = r1 ^ r5
            if (r1 == 0) goto L_0x01ec
            khe r1 = r0.a
            java.lang.Object r1 = r1.getValue()
            kke r1 = (defpackage.kke) r1
            w9a r1 = (defpackage.w9a) r1
            nx3 r1 = r1.b()
            if0 r6 = new if0
            r7 = 0
            r6.<init>(r0, r4, r7)
            r2.o = r0
            r2.X = r4
            r2.Y = r11
            r7 = 2
            r2.t0 = r7
            java.lang.Object r1 = defpackage.j47.t0(r1, r6, r2)
            if (r1 != r3) goto L_0x01e7
            return r3
        L_0x01e7:
            r7 = r0
            r0 = r11
        L_0x01e9:
            r11 = r0
        L_0x01ea:
            r0 = r4
            goto L_0x01ee
        L_0x01ec:
            r7 = r0
            goto L_0x01ea
        L_0x01ee:
            boolean r1 = r11.isEmpty()
            r1 = r1 ^ r5
            if (r1 == 0) goto L_0x0219
            khe r1 = r7.a
            java.lang.Object r1 = r1.getValue()
            kke r1 = (defpackage.kke) r1
            w9a r1 = (defpackage.w9a) r1
            nx3 r1 = r1.b()
            jf0 r4 = new jf0
            r5 = 0
            r4.<init>(r7, r11, r5)
            r2.o = r0
            r2.X = r5
            r2.Y = r5
            r5 = 3
            r2.t0 = r5
            java.lang.Object r1 = defpackage.j47.t0(r1, r4, r2)
            if (r1 != r3) goto L_0x0219
            return r3
        L_0x0219:
            boolean r0 = r0.isEmpty()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.workmanager.BacklogWorker.h(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
