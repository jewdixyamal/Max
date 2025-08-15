package defpackage;

import java.io.File;
import ru.ok.tamtam.upload.workers.DownloadFileAttachWorker;

/* renamed from: ao4  reason: default package */
public final class ao4 implements cfe {
    public final /* synthetic */ DownloadFileAttachWorker a;

    public ao4(DownloadFileAttachWorker downloadFileAttachWorker) {
        this.a = downloadFileAttachWorker;
    }

    public final void a() {
        DownloadFileAttachWorker downloadFileAttachWorker = this.a;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            pne g = downloadFileAttachWorker.g();
            ir6.d(us7, "ru.ok.tamtam.upload.workers.DownloadFileAttachWorker", "onFileDownloadFailed: " + g, (Throwable) null);
        }
        if (this.a.g().h) {
            ((av0) this.a.u0.getValue()).c(new hn4(this.a.g().g, this.a.g().b, this.a.g().o, this.a.g().a));
        }
        this.a.D0 = qn4.a;
    }

    public final e5f b() {
        DownloadFileAttachWorker downloadFileAttachWorker = this.a;
        ir6 ir6 = hm9.m;
        File file = null;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, "ru.ok.tamtam.upload.workers.DownloadFileAttachWorker", zr6.h(downloadFileAttachWorker.g().l, "invalidate count="), (Throwable) null);
        }
        int i = this.a.g().l;
        e5f e5f = e5f.a;
        tn4 tn4 = tn4.a;
        if (i >= 10) {
            hm9.p("ru.ok.tamtam.upload.workers.DownloadFileAttachWorker", "Reached max link invalidate count:", (Throwable) null);
            ((cba) ((o45) this.a.t0.getValue())).c(new Exception("Reached max link invalidate count"), true);
            this.a.D0 = tn4;
            return e5f;
        }
        cu8 q = this.a.e().q(this.a.g().a);
        if (q == null || !q.u() || q.v0 == vx8.DELETED) {
            hm9.p("ru.ok.tamtam.upload.workers.DownloadFileAttachWorker", "Message deleted or now audio", (Throwable) null);
            this.a.D0 = tn4;
            return e5f;
        }
        e52 C = ((p82) this.a.X.getValue()).C(q.t0);
        if (C != null) {
            hm9.m("ru.ok.tamtam.upload.workers.DownloadFileAttachWorker", "Create invalidateAndDownloadAudio task", new Object[0]);
            pk pkVar = (pk) this.a.s0.getValue();
            File file2 = this.a.E0;
            if (file2 != null) {
                file = file2;
            }
            String absolutePath = file.getAbsolutePath();
            long j = C.b.a;
            long j2 = q.c;
            pne g = this.a.g();
            k4a k4a = (k4a) pkVar;
            k4a.getClass();
            c37.d(ome.d(k4a.z(), new q47(((p7b) k4a.y()).a.o(), absolutePath, j, j2, g), false, 0, 12));
        } else {
            hm9.p("ru.ok.tamtam.upload.workers.DownloadFileAttachWorker", "Chat is null", (Throwable) null);
            this.a.D0 = tn4;
        }
        return e5f;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: sn4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: sn4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: sn4} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0114 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x015c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x015d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(float r19, long r20, long r22, kotlin.coroutines.Continuation r24) {
        /*
            r18 = this;
            r0 = r18
            r1 = r24
            boolean r2 = r1 instanceof defpackage.zn4
            if (r2 == 0) goto L_0x0017
            r2 = r1
            zn4 r2 = (defpackage.zn4) r2
            int r3 = r2.s0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.s0 = r3
            goto L_0x001c
        L_0x0017:
            zn4 r2 = new zn4
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.Y
            tx3 r13 = defpackage.tx3.a
            int r3 = r2.s0
            d20 r14 = defpackage.d20.X
            e5f r15 = defpackage.e5f.a
            r12 = 0
            r11 = 3
            r9 = 2
            r4 = 1
            if (r3 == 0) goto L_0x0057
            if (r3 == r4) goto L_0x004b
            if (r3 == r9) goto L_0x003f
            if (r3 != r11) goto L_0x0037
            defpackage.od2.a0(r1)
            goto L_0x015d
        L_0x0037:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003f:
            java.lang.Object r0 = r2.o
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r0 = (ru.ok.tamtam.upload.workers.DownloadFileAttachWorker) r0
            defpackage.od2.a0(r1)
            r3 = r1
            r1 = r0
            r0 = r12
            goto L_0x014f
        L_0x004b:
            float r0 = r2.X
            java.lang.Object r3 = r2.o
            ao4 r3 = (defpackage.ao4) r3
            defpackage.od2.a0(r1)
            r1 = r0
            r0 = r12
            goto L_0x00b8
        L_0x0057:
            defpackage.od2.a0(r1)
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r0.a
            pne r1 = r1.g()
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x015d
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r0.a
            pne r1 = r1.g()
            boolean r1 = r1.h
            if (r1 != 0) goto L_0x0072
            goto L_0x015d
        L_0x0072:
            long r5 = java.lang.System.currentTimeMillis()
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r3 = r0.a
            long r7 = r3.C0
            long r7 = r5 - r7
            r16 = 500(0x1f4, double:2.47E-321)
            int r1 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r1 >= 0) goto L_0x0083
            return r15
        L_0x0083:
            r3.C0 = r5
            int r6 = defpackage.tu0.G(r19)
            r2.o = r0
            r1 = r19
            r2.X = r1
            r2.s0 = r4
            au8 r4 = r3.e()
            pne r5 = r3.g()
            long r7 = r5.a
            cu8 r4 = r4.q(r7)
            r16 = 0
            r5 = r14
            r7 = r20
            r0 = r9
            r9 = r22
            r11 = r16
            r0 = r12
            r12 = r2
            java.lang.Object r3 = r3.h(r4, r5, r6, r7, r9, r11, r12)
            if (r3 != r13) goto L_0x00b2
            goto L_0x00b3
        L_0x00b2:
            r3 = r15
        L_0x00b3:
            if (r3 != r13) goto L_0x00b6
            return r13
        L_0x00b6:
            r3 = r18
        L_0x00b8:
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r4 = r3.a
            au8 r4 = r4.e()
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r5 = r3.a
            pne r5 = r5.g()
            long r5 = r5.a
            cu8 r4 = r4.q(r5)
            if (r4 == 0) goto L_0x0105
            boolean r5 = r4.n()
            if (r5 == 0) goto L_0x0105
            s10 r5 = r4.g()
            if (r5 != 0) goto L_0x00de
            k20 r5 = r4.l()
            if (r5 == 0) goto L_0x0105
        L_0x00de:
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r5 = r3.a
            pne r5 = r5.g()
            java.lang.String r5 = r5.b
            l20 r5 = defpackage.s5c.A(r4, r5)
            if (r5 == 0) goto L_0x0105
            d20 r5 = r5.o
            if (r5 != r14) goto L_0x0105
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r5 = r3.a
            sn4 r6 = new sn4
            long r7 = r4.o
            long r9 = r4.t0
            r18 = r6
            r19 = r1
            r20 = r7
            r22 = r9
            r18.<init>(r19, r20, r22)
            r5.D0 = r6
        L_0x0105:
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r3.a
            un4 r1 = r1.D0
            boolean r4 = r1 instanceof defpackage.sn4
            if (r4 == 0) goto L_0x0111
            r12 = r1
            sn4 r12 = (defpackage.sn4) r12
            goto L_0x0112
        L_0x0111:
            r12 = r0
        L_0x0112:
            if (r12 != 0) goto L_0x0115
            return r15
        L_0x0115:
            ir6 r1 = defpackage.hm9.m
            if (r1 != 0) goto L_0x011a
            goto L_0x0137
        L_0x011a:
            boolean r4 = r1.c()
            if (r4 == 0) goto L_0x0137
            us7 r4 = defpackage.us7.X
            float r5 = r12.a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "update notification "
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "ru.ok.tamtam.upload.workers.DownloadFileAttachWorker"
            r1.d(r4, r6, r5, r0)
        L_0x0137:
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r3.a
            float r4 = r12.a
            boolean r1 = r1.needToShowNotification(r4)
            if (r1 == 0) goto L_0x015d
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r3.a
            r2.o = r1
            r3 = 2
            r2.s0 = r3
            java.lang.Object r3 = r1.getForegroundInfo(r2)
            if (r3 != r13) goto L_0x014f
            return r13
        L_0x014f:
            ay5 r3 = (defpackage.ay5) r3
            r2.o = r0
            r0 = 3
            r2.s0 = r0
            java.lang.Object r0 = r1.setForeground(r3, r2)
            if (r0 != r13) goto L_0x015d
            return r13
        L_0x015d:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ao4.c(float, long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(kotlin.coroutines.Continuation r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof defpackage.xn4
            if (r0 == 0) goto L_0x0014
            r0 = r13
            xn4 r0 = (defpackage.xn4) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.Z = r1
        L_0x0012:
            r10 = r0
            goto L_0x001a
        L_0x0014:
            xn4 r0 = new xn4
            r0.<init>(r12, r13)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r13 = r10.X
            tx3 r0 = defpackage.tx3.a
            int r1 = r10.Z
            e5f r11 = defpackage.e5f.a
            r2 = 1
            if (r1 == 0) goto L_0x0035
            if (r1 != r2) goto L_0x002d
            ao4 r12 = r10.o
            defpackage.od2.a0(r13)
            goto L_0x0093
        L_0x002d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0035:
            defpackage.od2.a0(r13)
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r13 = r12.a
            ir6 r1 = defpackage.hm9.m
            if (r1 != 0) goto L_0x003f
            goto L_0x005f
        L_0x003f:
            boolean r3 = r1.c()
            if (r3 == 0) goto L_0x005f
            us7 r3 = defpackage.us7.X
            pne r13 = r13.g()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "onFileDownloadCancelled: "
            r4.<init>(r5)
            r4.append(r13)
            java.lang.String r13 = r4.toString()
            r4 = 0
            java.lang.String r5 = "ru.ok.tamtam.upload.workers.DownloadFileAttachWorker"
            r1.d(r3, r5, r13, r4)
        L_0x005f:
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r13 = r12.a
            pne r13 = r13.g()
            boolean r13 = r13.a()
            if (r13 == 0) goto L_0x0093
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r12.a
            d20 r3 = defpackage.d20.b
            int r4 = r1.B0
            r10.o = r12
            r10.Z = r2
            au8 r13 = r1.e()
            pne r2 = r1.g()
            long r5 = r2.a
            cu8 r2 = r13.q(r5)
            r9 = 0
            r5 = 0
            r7 = 0
            java.lang.Object r13 = r1.h(r2, r3, r4, r5, r7, r9, r10)
            if (r13 != r0) goto L_0x008f
            goto L_0x0090
        L_0x008f:
            r13 = r11
        L_0x0090:
            if (r13 != r0) goto L_0x0093
            return r0
        L_0x0093:
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r12 = r12.a
            on4 r13 = defpackage.on4.a
            r12.D0 = r13
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ao4.d(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void e(boolean z, boolean z2) {
        un4 un4;
        d20 d20;
        DownloadFileAttachWorker downloadFileAttachWorker = this.a;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            pne g = downloadFileAttachWorker.g();
            int i = downloadFileAttachWorker.A0.get();
            ir6.d(us7, "ru.ok.tamtam.upload.workers.DownloadFileAttachWorker", "onFileDownloadInterrupted: " + g + ", isNetworkProblem:" + z + ", retryCount:" + i, (Throwable) null);
        }
        if (this.a.g().h) {
            ((av0) this.a.u0.getValue()).c(new hn4(this.a.g().g, this.a.g().b, this.a.g().o, this.a.g().a));
        }
        l20 A = s5c.A(this.a.e().q(this.a.g().a), this.a.g().b);
        int incrementAndGet = z ? this.a.A0.incrementAndGet() : 0;
        DownloadFileAttachWorker downloadFileAttachWorker2 = this.a;
        if (A == null || (d20 = A.o) == null || !d20.a()) {
            un4 = (!z || incrementAndGet > 10) ? new rn4(false) : new rn4(true);
        } else {
            hm9.m0("ru.ok.tamtam.upload.workers.DownloadFileAttachWorker", "File download. onFileDownloadInterrupted: cancelled outside!", new Object[0]);
            un4 = on4.a;
        }
        downloadFileAttachWorker2.D0 = un4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(java.io.File r14, kotlin.coroutines.Continuation r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof defpackage.yn4
            if (r0 == 0) goto L_0x0014
            r0 = r15
            yn4 r0 = (defpackage.yn4) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.s0 = r1
        L_0x0012:
            r10 = r0
            goto L_0x001a
        L_0x0014:
            yn4 r0 = new yn4
            r0.<init>(r13, r15)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r15 = r10.Y
            tx3 r0 = defpackage.tx3.a
            int r1 = r10.s0
            r2 = 1
            r11 = 0
            if (r1 == 0) goto L_0x0038
            if (r1 != r2) goto L_0x0030
            java.io.File r14 = r10.X
            ao4 r13 = r10.o
            defpackage.od2.a0(r15)
            goto L_0x00d1
        L_0x0030:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0038:
            defpackage.od2.a0(r15)
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r15 = r13.a
            pne r15 = r15.g()
            java.lang.Object[] r15 = new java.lang.Object[]{r15}
            java.lang.String r1 = "ru.ok.tamtam.upload.workers.DownloadFileAttachWorker"
            java.lang.String r3 = "onFileDownloadCompleted: %s"
            defpackage.hm9.m(r1, r3, r15)
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r15 = r13.a
            au8 r15 = r15.e()
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r13.a
            pne r1 = r1.g()
            long r3 = r1.a
            cu8 r15 = r15.q(r3)
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r13.a
            pne r1 = r1.g()
            long r3 = r1.e
            int r1 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r1 <= 0) goto L_0x00ac
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r13.a
            khe r1 = r1.Z
            java.lang.Object r1 = r1.getValue()
            af8 r1 = (defpackage.af8) r1
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r3 = r13.a
            zi5 r3 = r3.d()
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r4 = r13.a
            pne r4 = r4.g()
            long r4 = r4.e
            java.lang.String r4 = java.lang.String.valueOf(r4)
            kk5 r3 = (defpackage.kk5) r3
            java.io.File r3 = r3.l(r4)
            cj0 r1 = (defpackage.cj0) r1
            r1.b(r14, r3)
            if (r15 == 0) goto L_0x00ac
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r13.a
            au8 r1 = r1.e()
            long r3 = r15.b
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r5 = r13.a
            pne r5 = r5.g()
            java.lang.String r5 = r5.b
            ta4 r6 = new ta4
            r7 = 6
            r6.<init>(r7)
            r1.v(r3, r5, r6)
        L_0x00ac:
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r13.a
            pne r1 = r1.g()
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x00d1
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r13.a
            d20 r3 = defpackage.d20.c
            r10.o = r13
            r10.X = r14
            r10.s0 = r2
            r5 = 0
            r7 = 0
            r4 = 100
            r2 = r15
            r9 = r14
            java.lang.Object r15 = r1.h(r2, r3, r4, r5, r7, r9, r10)
            if (r15 != r0) goto L_0x00d1
            return r0
        L_0x00d1:
            r15 = 0
            if (r14 == 0) goto L_0x0150
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r0 = r13.a
            pne r0 = r0.g()
            boolean r0 = r0.h
            if (r0 == 0) goto L_0x0115
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r0 = r13.a
            khe r0 = r0.u0
            java.lang.Object r0 = r0.getValue()
            av0 r0 = (defpackage.av0) r0
            fn4 r9 = new fn4
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r13.a
            pne r1 = r1.g()
            long r2 = r1.o
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r13.a
            pne r1 = r1.g()
            java.lang.String r6 = r1.g
            java.lang.String r7 = r14.getAbsolutePath()
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r13.a
            pne r1 = r1.g()
            java.lang.String r8 = r1.b
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r13.a
            pne r1 = r1.g()
            long r4 = r1.a
            r1 = r9
            r1.<init>(r2, r4, r6, r7, r8)
            r0.c(r9)
        L_0x0115:
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r0 = r13.a
            pne r0 = r0.g()
            long r0 = r0.c
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x0150
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r0 = r13.a
            pne r0 = r0.g()
            boolean r0 = r0.n
            if (r0 != 0) goto L_0x0150
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r0 = r13.a
            khe r0 = r0.Z
            java.lang.Object r0 = r0.getValue()
            af8 r0 = (defpackage.af8) r0
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r13.a
            pne r1 = r1.g()
            long r1 = r1.c
            ada r0 = (defpackage.ada) r0
            khe r1 = r0.k
            java.lang.Object r1 = r1.getValue()
            sx3 r1 = (defpackage.sx3) r1
            zca r2 = new zca
            r2.<init>(r0, r14, r15)
            r0 = 3
            defpackage.j47.T(r1, r15, r15, r2, r0)
        L_0x0150:
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r0 = r13.a
            pne r0 = r0.g()
            long r0 = r0.j
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x015d
            goto L_0x015e
        L_0x015d:
            r14 = r15
        L_0x015e:
            if (r14 == 0) goto L_0x016d
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r15 = r13.a
            khe r15 = r15.v0
            java.lang.Object r15 = r15.getValue()
            mh5 r15 = (defpackage.mh5) r15
            r15.b(r14)
        L_0x016d:
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r13 = r13.a
            pn4 r14 = defpackage.pn4.a
            r13.D0 = r14
            e5f r13 = defpackage.e5f.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ao4.f(java.io.File, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final String getDownloadContext() {
        DownloadFileAttachWorker downloadFileAttachWorker = this.a;
        if (downloadFileAttachWorker.g().c > 0) {
            long j = downloadFileAttachWorker.g().a;
            long j2 = downloadFileAttachWorker.g().c;
            StringBuilder sb = new StringBuilder();
            sb.append(j);
            sb.append(j2);
            return sb.toString();
        } else if (downloadFileAttachWorker.g().d > 0) {
            long j3 = downloadFileAttachWorker.g().a;
            long j4 = downloadFileAttachWorker.g().d;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(j3);
            sb2.append(j4);
            return sb2.toString();
        } else if (downloadFileAttachWorker.g().e > 0) {
            long j5 = downloadFileAttachWorker.g().a;
            long j6 = downloadFileAttachWorker.g().e;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(j5);
            sb3.append(j6);
            return sb3.toString();
        } else if (downloadFileAttachWorker.g().f > 0) {
            long j7 = downloadFileAttachWorker.g().a;
            long j8 = downloadFileAttachWorker.g().f;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(j7);
            sb4.append(j8);
            return sb4.toString();
        } else if (downloadFileAttachWorker.g().j > 0) {
            long j9 = downloadFileAttachWorker.g().a;
            long j10 = downloadFileAttachWorker.g().j;
            StringBuilder sb5 = new StringBuilder();
            sb5.append(j9);
            sb5.append(j10);
            return sb5.toString();
        } else {
            throw new AssertionError("DownloadListener.getContext() must return not null value");
        }
    }
}
