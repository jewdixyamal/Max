package ru.ok.tamtam.upload.workers;

import android.app.PendingIntent;
import android.content.Context;
import androidx.work.WorkerParameters;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.transfer.exceptions.HttpErrorException;
import ru.ok.tamtam.errors.TamErrorException;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ok/tamtam/upload/workers/UploadFileAttachWorker;", "Lru/ok/tamtam/upload/workers/ForegroundWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class UploadFileAttachWorker extends ForegroundWorker {
    public sd7 A0;
    public volatile float B0 = -1.0f;
    public volatile fm7 C0;
    public final khe X = new khe(new t7f(this, 14));
    public final khe Y = new khe(new t7f(this, 1));
    public final khe Z = new khe(new t7f(this, 2));
    public final khe a = new khe(new t7f(this, 0));
    public final khe b = new khe(new t7f(this, 11));
    public final khe c = new khe(new t7f(this, 12));
    public final khe o = new khe(new t7f(this, 13));
    public final khe s0 = new khe(new t7f(this, 3));
    public final khe t0 = new khe(new t7f(this, 4));
    public final khe u0 = new khe(new t7f(this, 5));
    public final khe v0 = new khe(new t7f(this, 6));
    public final khe w0 = new khe(new t7f(this, 7));
    public final khe x0 = new khe(new t7f(this, 8));
    public final khe y0 = new khe(new t7f(this, 9));
    public final khe z0 = new khe(new t7f(this, 10));

    public UploadFileAttachWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public final iy8 c() {
        return (iy8) this.a.getValue();
    }

    public final Object createForegroundInfo(Continuation continuation) {
        Object obj;
        String string;
        PendingIntent c2 = s7g.d(getApplicationContext()).c(getId());
        e52 C = ((p82) this.Z.getValue()).C(c().a.b);
        if (C == null) {
            hm9.p("UploadFileAttachWorker", "chat is null in getForegroundInfo!", (Throwable) null);
            h();
            this.C0 = fm7.a();
        }
        try {
            obj = new File(c().b).getName();
        } catch (Throwable th) {
            obj = new njc(th);
        }
        if (obj instanceof njc) {
            obj = "";
        }
        String j = rh4.j(getApplicationContext().getString(((qh5) this.v0.getValue()).h), " ", (String) obj);
        qh5 qh5 = (qh5) this.v0.getValue();
        long j2 = c().a.b;
        if (C == null || (string = C.q()) == null) {
            string = getApplicationContext().getString(((qh5) this.v0.getValue()).h);
        }
        return new ay5(c().a.hashCode(), qh5.b(j2, (Long) null, (Long) null, string, C == null ? null : j, tu0.G(this.B0), true, c2), 1);
    }

    public final au8 d() {
        return (au8) this.o.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object doForegroundWork(kotlin.coroutines.Continuation r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.v7f
            if (r0 == 0) goto L_0x0013
            r0 = r9
            v7f r0 = (defpackage.v7f) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            v7f r0 = new v7f
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 == r5) goto L_0x003b
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            defpackage.od2.a0(r9)
            goto L_0x00ed
        L_0x002e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0036:
            defpackage.od2.a0(r9)
            goto L_0x00cc
        L_0x003b:
            ru.ok.tamtam.upload.workers.UploadFileAttachWorker r8 = r0.o
            defpackage.od2.a0(r9)
            goto L_0x0091
        L_0x0041:
            defpackage.od2.a0(r9)
            khe r9 = r8.z0
            java.lang.Object r9 = r9.getValue()
            gh3 r9 = (defpackage.gh3) r9
            r0.o = r8
            r0.getClass()
            r0.Z = r5
            sy1 r2 = new sy1
            kotlin.coroutines.Continuation r6 = defpackage.v3c.u(r0)
            r2.<init>(r5, r6)
            r2.n()
            boolean r5 = r9.f()
            if (r5 == 0) goto L_0x006b
            e5f r9 = defpackage.e5f.a
            r2.resumeWith(r9)
            goto L_0x008a
        L_0x006b:
            fr1 r5 = new fr1
            r6 = 1
            r5.<init>(r9, r2, r6)
            java.lang.Class r6 = r9.getClass()
            java.lang.String r6 = r6.getName()
            java.lang.String r7 = "Network connection lost, waiting network."
            defpackage.hm9.m(r6, r7, new java.lang.Object[0])
            r9.c(r5)
            zp1 r6 = new zp1
            r7 = 3
            r6.<init>(r9, r7, r5)
            r2.d(r6)
        L_0x008a:
            java.lang.Object r9 = r2.m()
            if (r9 != r1) goto L_0x0091
            return r1
        L_0x0091:
            khe r9 = r8.w0
            java.lang.Object r9 = r9.getValue()
            m7b r9 = (defpackage.m7b) r9
            p7b r9 = (defpackage.p7b) r9
            se5 r9 = r9.e
            r9.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r2 = ru.ok.tamtam.android.prefs.PmsKey.f96newuploaderenabled
            r5 = 0
            boolean r9 = r9.n(r2, r5)
            java.lang.String r2 = "UploadFileAttachWorker"
            r5 = 0
            if (r9 == 0) goto L_0x00cd
            ir6 r9 = defpackage.hm9.m
            if (r9 != 0) goto L_0x00b1
            goto L_0x00be
        L_0x00b1:
            boolean r3 = r9.c()
            if (r3 == 0) goto L_0x00be
            us7 r3 = defpackage.us7.X
            java.lang.String r6 = "doForegroundWork: Using new uploader"
            r9.d(r3, r2, r6, r5)
        L_0x00be:
            r0.o = r5
            r0.getClass()
            r0.Z = r4
            java.lang.Object r9 = r8.k(r0)
            if (r9 != r1) goto L_0x00cc
            return r1
        L_0x00cc:
            return r9
        L_0x00cd:
            ir6 r9 = defpackage.hm9.m
            if (r9 != 0) goto L_0x00d2
            goto L_0x00df
        L_0x00d2:
            boolean r4 = r9.c()
            if (r4 == 0) goto L_0x00df
            us7 r4 = defpackage.us7.X
            java.lang.String r6 = "doForegroundWork: Using old uploader"
            r9.d(r4, r2, r6, r5)
        L_0x00df:
            r0.o = r5
            r0.getClass()
            r0.Z = r3
            java.lang.Object r9 = r8.l(r0)
            if (r9 != r1) goto L_0x00ed
            return r1
        L_0x00ed:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.UploadFileAttachWorker.doForegroundWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void e(Throwable th) {
        hm9.q("UploadFileAttachWorker", "onUploadFailed: %s", c().a, th);
        if (th instanceof HttpErrorException) {
            long j = c().a.b;
            ((av0) this.c.getValue()).c(new fk5(((HttpErrorException) th).a));
        } else if (th instanceof TamErrorException) {
            ((av0) this.c.getValue()).c(new oi0(((TamErrorException) th).a));
        }
        this.B0 = -1.0f;
        cu8 q = d().q(c().a.a);
        if (q == null || q.v0 == vx8.DELETED) {
            hm9.p("UploadFileAttachWorker", "failMessageUpload: message is deleted", (Throwable) null);
        } else {
            d().x(q, iu8.ERROR);
            d().v(c().a.a, c().a.c, new n2f(8));
            ((av0) this.c.getValue()).c(new l6f(c().a.b, c().a.a, 0));
        }
        r9d.y((s8g) this.X.getValue());
        h();
        ((dg5) this.Y.getValue()).a(c().a.a);
        this.C0 = fm7.a();
    }

    public final void g(ly8 ly8) {
        k8g k8g;
        hm9.m("UploadFileAttachWorker", "onUploadUpdate %s", ly8);
        v6f v6f = ly8.a;
        q8f q8f = v6f.g;
        if (v6f.a()) {
            hm9.m("UploadFileAttachWorker", "onUploadSuccess: key=%s, messageUploadState=%s", c().a, ly8);
            long j = c().a.a;
            String str = c().a.c;
            long j2 = c().a.b;
            d().v(j, str, new g7f(ly8, 2));
            ((d00) this.y0.getValue()).a(new p5c(j, ly8.a.f));
            h();
            ((av0) this.c.getValue()).c(new l6f(j2, j, 0));
            r9d.y((s8g) this.X.getValue());
            this.C0 = fm7.b();
        } else if (q8f == q8f.UPLOADING) {
            hm9.m("UploadFileAttachWorker", "onUploadProgress %s, %s", c(), ly8);
            long j3 = c().a.a;
            String str2 = c().a.c;
            long j4 = c().a.b;
            cu8 q = d().q(c().a.a);
            if (!(q == null || q.v0 == vx8.DELETED || (k8g = q.z0) == null || k8g.i() <= 0)) {
                for (l20 l20 : (List) k8g.a) {
                    if (tpa.f(l20.r, c().a.c)) {
                        v6f v6f2 = ly8.a;
                        i(tfg.a(v6f2.a.c));
                        this.B0 = v6f2.e;
                        d().v(j3, str2, new a7f(v6f2, 2));
                        ((d00) this.y0.getValue()).a(new q5c(v6f2.e, j3, v6f2.f));
                        ((av0) this.c.getValue()).c(new l6f(j4, j3, 0));
                        return;
                    }
                }
            }
            hm9.k0("UploadFileAttachWorker", (Exception) null, "cancelUploadIfMessageIsDeleted: message or attach is deleted %s", Arrays.copyOf(new Object[]{c()}, 1));
            h();
            this.C0 = fm7.a();
        } else {
            Throwable th = new Throwable("Internal error. Unknown upload state");
            hm9.r("UploadFileAttachWorker", th, "onUploadUpdate: failed. Unknown upload state. key=%s, state=%s", c().a, ly8);
            e(th);
        }
    }

    public final String getName() {
        String e = getInputData().e("workName");
        return e == null ? "UploadFileAttachWorker" : e;
    }

    public final void h() {
        hm9.m("UploadFileAttachWorker", "removeUpload %s", c());
        hm9.m("UploadFileAttachWorker", "stopTyping %s", c());
        e52 C = ((p82) this.Z.getValue()).C(c().a.b);
        if (C != null) {
            long j = C.b.a;
            long j2 = c().a.a;
            ((sna) this.s0.getValue()).getClass();
            sna.b(j, j2);
        }
        sd7 sd7 = this.A0;
        if (sd7 != null) {
            dm4.a(sd7);
        }
        try {
            new qa3(((py8) this.b.getValue()).b(), 2, new yt8(3, (Object) c().a)).a();
            hm9.m("UploadFileAttachWorker", "removeUploadFromStorage: success %s", c());
        } catch (Throwable th) {
            hm9.p("UploadFileAttachWorker", "removeUploadFromStorage failure", th);
        }
    }

    public final void i(b10 b10) {
        hm9.m("UploadFileAttachWorker", "sendTyping %s", c());
        e52 C = ((p82) this.Z.getValue()).C(c().a.b);
        if (C != null) {
            ((sna) this.s0.getValue()).f(C.b.a, b10, c().a.a);
        }
    }

    public final void j() {
        hm9.m("UploadFileAttachWorker", "startUpload", new Object[0]);
        b10 a2 = tfg.a(c().d);
        if (a2 == b10.UNKNOWN) {
            e(new Throwable("Internal error. Unknown attach type for upload type"));
            return;
        }
        i(a2);
        r0a n = ((g8f) this.t0.getValue()).a(c()).n(muc.d);
        sd7 sd7 = new sd7(new xje(2, (Object) this), new y7f(0, this), ft.d);
        n.a(sd7);
        this.A0 = sd7;
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [java.lang.Object, lec] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(kotlin.coroutines.Continuation r27) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = 19
            r3 = 3
            r4 = 1
            boolean r5 = r1 instanceof defpackage.z7f
            if (r5 == 0) goto L_0x001b
            r5 = r1
            z7f r5 = (defpackage.z7f) r5
            int r6 = r5.s0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L_0x001b
            int r6 = r6 - r7
            r5.s0 = r6
            goto L_0x0020
        L_0x001b:
            z7f r5 = new z7f
            r5.<init>(r0, r1)
        L_0x0020:
            java.lang.Object r1 = r5.Y
            tx3 r6 = defpackage.tx3.a
            int r7 = r5.s0
            java.lang.String r8 = "UploadFileAttachWorker"
            r9 = 0
            r10 = 2
            if (r7 == 0) goto L_0x0047
            if (r7 == r4) goto L_0x0041
            if (r7 != r10) goto L_0x0039
            long r2 = r5.X
            ru.ok.tamtam.upload.workers.UploadFileAttachWorker r0 = r5.o
            defpackage.od2.a0(r1)
            goto L_0x017f
        L_0x0039:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0041:
            ru.ok.tamtam.upload.workers.UploadFileAttachWorker r0 = r5.o
            defpackage.od2.a0(r1)
            goto L_0x007f
        L_0x0047:
            defpackage.od2.a0(r1)
            ir6 r1 = defpackage.hm9.m
            if (r1 != 0) goto L_0x004f
            goto L_0x005c
        L_0x004f:
            boolean r7 = r1.c()
            if (r7 == 0) goto L_0x005c
            us7 r7 = defpackage.us7.X
            java.lang.String r11 = "Started foreground uploading"
            r1.d(r7, r8, r11, r9)
        L_0x005c:
            r5.o = r0
            r5.s0 = r4
            khe r1 = r0.x0
            java.lang.Object r1 = r1.getValue()
            kke r1 = (defpackage.kke) r1
            w9a r1 = (defpackage.w9a) r1
            nx3 r1 = r1.b()
            x7f r7 = new x7f
            r7.<init>(r0, r9)
            java.lang.Object r1 = defpackage.j47.t0(r1, r7, r5)
            if (r1 != r6) goto L_0x007a
            goto L_0x007c
        L_0x007a:
            e5f r1 = defpackage.e5f.a
        L_0x007c:
            if (r1 != r6) goto L_0x007f
            return r6
        L_0x007f:
            iy8 r1 = r0.c()
            int r1 = r1.d
            b10 r1 = defpackage.tfg.a(r1)
            b10 r7 = defpackage.b10.UNKNOWN
            if (r1 != r7) goto L_0x00a8
            java.lang.Throwable r1 = new java.lang.Throwable
            java.lang.String r2 = "Internal error. Unknown attach type for upload type"
            r1.<init>(r2)
            r0.e(r1)
            fm7 r0 = r0.C0
            if (r0 == 0) goto L_0x009c
            return r0
        L_0x009c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00a8:
            r0.i(r1)
            long r14 = java.lang.System.currentTimeMillis()
            lec r1 = new lec
            r1.<init>()
            r11 = -1
            r1.a = r11
            khe r7 = r0.u0
            java.lang.Object r7 = r7.getValue()
            ige r7 = (defpackage.ige) r7
            iy8 r11 = r0.c()
            r7.getClass()
            qn5 r12 = new qn5
            r12.<init>(r3, r11)
            gge r13 = new gge
            r13.<init>(r7, r9)
            t03 r12 = defpackage.od2.D(r12, r13)
            fge r13 = new fge
            r10 = 0
            r13.<init>(r12, r7, r10)
            shb r10 = new shb
            je7 r12 = r7.b
            java.lang.Object r12 = r12.getValue()
            r18 = r12
            cge r18 = (defpackage.cge) r18
            java.lang.Class<cge> r19 = defpackage.cge.class
            java.lang.String r20 = "upload"
            r17 = 2
            java.lang.String r21 = "upload(Lone/me/sdk/transfer/domain/UploadData;)Lkotlinx/coroutines/flow/Flow;"
            r22 = 4
            r23 = 22
            r16 = r10
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            t03 r10 = defpackage.od2.D(r13, r10)
            fge r12 = new fge
            r12.<init>(r10, r7, r4)
            vp5 r10 = new vp5
            r13 = 11
            r10.<init>(r7, r11, r9, r13)
            ac r11 = new ac
            r13 = 18
            r11.<init>(r12, r13, r10)
            qfe r10 = new qfe
            r10.<init>(r7, r9, r4)
            ac r4 = new ac
            r4.<init>(r11, r2, r10)
            je7 r7 = r7.a
            java.lang.Object r7 = r7.getValue()
            kke r7 = (defpackage.kke) r7
            w9a r7 = (defpackage.w9a) r7
            nx3 r7 = r7.b()
            mn5 r4 = defpackage.od2.F(r4, r7)
            a8f r7 = new a8f
            r7.<init>(r0, r9)
            zn5 r10 = new zn5
            r10.<init>(r4, r7, r3)
            shb r3 = new shb
            java.lang.String r16 = "onUploadUpdate(Lru/ok/tamtam/upload/messages/MessageUploadState;)V"
            r17 = 4
            r12 = 2
            java.lang.Class<ru.ok.tamtam.upload.workers.UploadFileAttachWorker> r4 = ru.ok.tamtam.upload.workers.UploadFileAttachWorker.class
            java.lang.String r7 = "onUploadUpdate"
            r18 = 24
            r11 = r3
            r13 = r0
            r24 = r14
            r14 = r4
            r15 = r7
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            zn5 r4 = new zn5
            r7 = 5
            r4.<init>(r10, r3, r7)
            int r3 = defpackage.ft4.o
            r3 = 500(0x1f4, float:7.0E-43)
            kt4 r7 = defpackage.kt4.MILLISECONDS
            long r10 = defpackage.z7.R(r3, r7)
            m32 r3 = defpackage.nu0.Q(r4, r10)
            r1b r4 = new r1b
            r4.<init>((java.lang.Object) r0, (kotlin.coroutines.Continuation) r9, (int) r2)
            cp5 r2 = new cp5
            r2.<init>(r3, r4)
            c8f r3 = new c8f
            r3.<init>(r0, r1)
            r5.o = r0
            r10 = r24
            r5.X = r10
            r1 = 2
            r5.s0 = r1
            java.lang.Object r1 = r2.d(r3, r5)
            if (r1 != r6) goto L_0x017e
            return r6
        L_0x017e:
            r2 = r10
        L_0x017f:
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r2
            ir6 r1 = defpackage.hm9.m
            if (r1 != 0) goto L_0x0189
            goto L_0x01ac
        L_0x0189:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x01ac
            us7 r2 = defpackage.us7.X
            fm7 r3 = r0.C0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "doWork finish by "
            r6.<init>(r7)
            r6.append(r3)
            java.lang.String r3 = " and duration="
            r6.append(r3)
            r6.append(r4)
            java.lang.String r3 = r6.toString()
            r1.d(r2, r8, r3, r9)
        L_0x01ac:
            fm7 r0 = r0.C0
            if (r0 != 0) goto L_0x01b4
            cm7 r0 = defpackage.fm7.a()
        L_0x01b4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.UploadFileAttachWorker.k(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00be A[Catch:{ all -> 0x004a }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0123 A[Catch:{ all -> 0x004a }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x014f A[Catch:{ all -> 0x004a }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0169 A[Catch:{ all -> 0x004a }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x016a A[Catch:{ all -> 0x004a }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0173 A[Catch:{ all -> 0x004a }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x017c A[Catch:{ all -> 0x004a }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x017d A[Catch:{ all -> 0x004a }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01a7 A[Catch:{ all -> 0x004a }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(kotlin.coroutines.Continuation r21) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            boolean r2 = r0 instanceof defpackage.d8f
            if (r2 == 0) goto L_0x0017
            r2 = r0
            d8f r2 = (defpackage.d8f) r2
            int r3 = r2.u0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.u0 = r3
            goto L_0x001c
        L_0x0017:
            d8f r2 = new d8f
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.s0
            tx3 r3 = defpackage.tx3.a
            int r4 = r2.u0
            java.lang.String r5 = "UploadFileAttachWorker"
            r6 = 0
            r7 = -1
            r9 = 5
            r10 = 3
            r11 = 2
            r12 = 1
            r13 = 4
            if (r4 == 0) goto L_0x0087
            if (r4 == r12) goto L_0x0081
            if (r4 == r11) goto L_0x0078
            if (r4 == r10) goto L_0x0061
            if (r4 == r13) goto L_0x0055
            if (r4 != r9) goto L_0x004d
            long r14 = r2.Z
            r16 = r14
            long r13 = r2.Y
            ru.ok.tamtam.upload.workers.UploadFileAttachWorker r1 = r2.o
            defpackage.od2.a0(r0)     // Catch:{ all -> 0x004a }
            r4 = r9
            r12 = r13
            r14 = r16
            r7 = 4
            goto L_0x016c
        L_0x004a:
            r0 = move-exception
            goto L_0x01ac
        L_0x004d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0055:
            long r12 = r2.Z
            long r14 = r2.Y
            ru.ok.tamtam.upload.workers.UploadFileAttachWorker r1 = r2.o
            defpackage.od2.a0(r0)     // Catch:{ all -> 0x004a }
            r7 = 4
            goto L_0x0150
        L_0x0061:
            long r12 = r2.Z
            long r14 = r2.Y
            ru.ok.tamtam.upload.workers.UploadFileAttachWorker r1 = r2.X
            ru.ok.tamtam.upload.workers.UploadFileAttachWorker r4 = r2.o
            defpackage.od2.a0(r0)     // Catch:{ all -> 0x0074 }
            r18 = r2
            r2 = r1
            r1 = r4
            r4 = r18
            goto L_0x013b
        L_0x0074:
            r0 = move-exception
            r1 = r4
            goto L_0x01ac
        L_0x0078:
            long r12 = r2.Y
            ru.ok.tamtam.upload.workers.UploadFileAttachWorker r1 = r2.o
            defpackage.od2.a0(r0)     // Catch:{ all -> 0x004a }
            goto L_0x00ff
        L_0x0081:
            ru.ok.tamtam.upload.workers.UploadFileAttachWorker r1 = r2.o
            defpackage.od2.a0(r0)     // Catch:{ all -> 0x004a }
            goto L_0x00b2
        L_0x0087:
            defpackage.od2.a0(r0)
            java.lang.String r0 = "doWork"
            defpackage.hm9.m(r5, r0, new java.lang.Object[0])     // Catch:{ all -> 0x004a }
            r2.o = r1     // Catch:{ all -> 0x004a }
            r2.u0 = r12     // Catch:{ all -> 0x004a }
            khe r0 = r1.x0     // Catch:{ all -> 0x004a }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x004a }
            kke r0 = (defpackage.kke) r0     // Catch:{ all -> 0x004a }
            w9a r0 = (defpackage.w9a) r0     // Catch:{ all -> 0x004a }
            nx3 r0 = r0.b()     // Catch:{ all -> 0x004a }
            x7f r4 = new x7f     // Catch:{ all -> 0x004a }
            r4.<init>(r1, r6)     // Catch:{ all -> 0x004a }
            java.lang.Object r0 = defpackage.j47.t0(r0, r4, r2)     // Catch:{ all -> 0x004a }
            if (r0 != r3) goto L_0x00ad
            goto L_0x00af
        L_0x00ad:
            e5f r0 = defpackage.e5f.a     // Catch:{ all -> 0x004a }
        L_0x00af:
            if (r0 != r3) goto L_0x00b2
            return r3
        L_0x00b2:
            r1.j()     // Catch:{ all -> 0x004a }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x004a }
            r14 = r7
        L_0x00ba:
            fm7 r0 = r1.C0     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x0173
            java.lang.String r0 = "progress =%f"
            float r4 = r1.B0     // Catch:{ all -> 0x004a }
            java.lang.Float r9 = new java.lang.Float     // Catch:{ all -> 0x004a }
            r9.<init>(r4)     // Catch:{ all -> 0x004a }
            java.lang.Object[] r4 = new java.lang.Object[]{r9}     // Catch:{ all -> 0x004a }
            defpackage.hm9.m(r5, r0, r4)     // Catch:{ all -> 0x004a }
            float r0 = r1.B0     // Catch:{ all -> 0x004a }
            int r0 = defpackage.tu0.G(r0)     // Catch:{ all -> 0x004a }
            float r0 = (float) r0     // Catch:{ all -> 0x004a }
            boolean r0 = r1.needToShowNotification(r0)     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0153
            int r0 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0105
            r2.o = r1     // Catch:{ all -> 0x004a }
            r2.Y = r12     // Catch:{ all -> 0x004a }
            r2.u0 = r11     // Catch:{ all -> 0x004a }
            khe r0 = r1.x0     // Catch:{ all -> 0x004a }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x004a }
            kke r0 = (defpackage.kke) r0     // Catch:{ all -> 0x004a }
            w9a r0 = (defpackage.w9a) r0     // Catch:{ all -> 0x004a }
            nx3 r0 = r0.b()     // Catch:{ all -> 0x004a }
            w7f r4 = new w7f     // Catch:{ all -> 0x004a }
            r4.<init>(r1, r6)     // Catch:{ all -> 0x004a }
            java.lang.Object r0 = defpackage.j47.t0(r0, r4, r2)     // Catch:{ all -> 0x004a }
            if (r0 != r3) goto L_0x00ff
            return r3
        L_0x00ff:
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ all -> 0x004a }
            long r14 = r0.longValue()     // Catch:{ all -> 0x004a }
        L_0x0105:
            khe r0 = r1.w0     // Catch:{ all -> 0x004a }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x004a }
            m7b r0 = (defpackage.m7b) r0     // Catch:{ all -> 0x004a }
            p7b r0 = (defpackage.p7b) r0     // Catch:{ all -> 0x004a }
            z7d r0 = r0.b     // Catch:{ all -> 0x004a }
            r0.getClass()     // Catch:{ all -> 0x004a }
            ru.ok.tamtam.android.prefs.PmsKey r4 = ru.ok.tamtam.android.prefs.PmsKey.f67maxdownloadedsizefornotifykb     // Catch:{ all -> 0x004a }
            r9 = 1024(0x400, float:1.435E-42)
            long r7 = (long) r9     // Catch:{ all -> 0x004a }
            long r7 = r0.q(r4, r7)     // Catch:{ all -> 0x004a }
            int r0 = (int) r7     // Catch:{ all -> 0x004a }
            long r7 = (long) r0     // Catch:{ all -> 0x004a }
            int r0 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0153
            r2.o = r1     // Catch:{ all -> 0x004a }
            r2.X = r1     // Catch:{ all -> 0x004a }
            r2.Y = r12     // Catch:{ all -> 0x004a }
            r2.Z = r14     // Catch:{ all -> 0x004a }
            r2.u0 = r10     // Catch:{ all -> 0x004a }
            java.lang.Object r0 = r1.getForegroundInfo(r2)     // Catch:{ all -> 0x004a }
            if (r0 != r3) goto L_0x0134
            return r3
        L_0x0134:
            r4 = r2
            r2 = r1
            r18 = r12
            r12 = r14
            r14 = r18
        L_0x013b:
            ay5 r0 = (defpackage.ay5) r0     // Catch:{ all -> 0x004a }
            r4.o = r1     // Catch:{ all -> 0x004a }
            r4.X = r6     // Catch:{ all -> 0x004a }
            r4.Y = r14     // Catch:{ all -> 0x004a }
            r4.Z = r12     // Catch:{ all -> 0x004a }
            r7 = 4
            r4.u0 = r7     // Catch:{ all -> 0x004a }
            java.lang.Object r0 = r2.setForeground(r0, r4)     // Catch:{ all -> 0x004a }
            if (r0 != r3) goto L_0x014f
            return r3
        L_0x014f:
            r2 = r4
        L_0x0150:
            r8 = r12
            r13 = r14
            goto L_0x0156
        L_0x0153:
            r7 = 4
            r8 = r14
            r13 = r12
        L_0x0156:
            long r10 = r1.getWorkDelay()     // Catch:{ all -> 0x004a }
            r2.o = r1     // Catch:{ all -> 0x004a }
            r2.Y = r13     // Catch:{ all -> 0x004a }
            r2.Z = r8     // Catch:{ all -> 0x004a }
            r4 = 5
            r2.u0 = r4     // Catch:{ all -> 0x004a }
            java.lang.Object r10 = defpackage.j47.x(r10, r2)     // Catch:{ all -> 0x004a }
            if (r10 != r3) goto L_0x016a
            return r3
        L_0x016a:
            r12 = r13
            r14 = r8
        L_0x016c:
            r9 = r4
            r7 = -1
            r10 = 3
            r11 = 2
            goto L_0x00ba
        L_0x0173:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x004a }
            long r2 = r2 - r12
            ir6 r0 = defpackage.hm9.m     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x017d
            goto L_0x01a3
        L_0x017d:
            boolean r4 = r0.c()     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x01a3
            us7 r4 = defpackage.us7.X     // Catch:{ all -> 0x004a }
            fm7 r7 = r1.C0     // Catch:{ all -> 0x004a }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x004a }
            r8.<init>()     // Catch:{ all -> 0x004a }
            java.lang.String r9 = "doWork finish by "
            r8.append(r9)     // Catch:{ all -> 0x004a }
            r8.append(r7)     // Catch:{ all -> 0x004a }
            java.lang.String r7 = " and duration="
            r8.append(r7)     // Catch:{ all -> 0x004a }
            r8.append(r2)     // Catch:{ all -> 0x004a }
            java.lang.String r2 = r8.toString()     // Catch:{ all -> 0x004a }
            r0.d(r4, r5, r2, r6)     // Catch:{ all -> 0x004a }
        L_0x01a3:
            fm7 r0 = r1.C0     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x01bc
            cm7 r0 = defpackage.fm7.a()     // Catch:{ all -> 0x004a }
            goto L_0x01bc
        L_0x01ac:
            java.lang.String r2 = "cancelled!"
            defpackage.hm9.p(r5, r2, r0)
            sd7 r0 = r1.A0
            if (r0 == 0) goto L_0x01b8
            defpackage.dm4.a(r0)
        L_0x01b8:
            cm7 r0 = defpackage.fm7.a()
        L_0x01bc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.UploadFileAttachWorker.l(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
