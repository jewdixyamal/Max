package ru.ok.tamtam.upload.workers;

import android.app.PendingIntent;
import android.content.Context;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ok/tamtam/upload/workers/UploadDraftMediaWorker;", "Lru/ok/tamtam/upload/workers/ForegroundWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class UploadDraftMediaWorker extends ForegroundWorker {
    public final khe X = new khe(new f7f(this, 7));
    public final khe Y = new khe(new f7f(this, 8));
    public final khe Z = new khe(new f7f(this, 9));
    public final khe a = new khe(new f7f(this, 0));
    public final khe b = new khe(new f7f(this, 4));
    public final khe c = new khe(new f7f(this, 5));
    public final khe o = new khe(new f7f(this, 6));
    public final khe s0 = new khe(new f7f(this, 10));
    public final khe t0 = new khe(new f7f(this, 1));
    public final khe u0 = new khe(new f7f(this, 2));
    public final khe v0 = new khe(new f7f(this, 3));
    public sd7 w0;
    public volatile float x0 = -1.0f;
    public volatile fm7 y0;

    public UploadDraftMediaWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public final p82 c() {
        return (p82) this.o.getValue();
    }

    public final Object createForegroundInfo(Continuation continuation) {
        String string;
        PendingIntent c2 = s7g.d(getApplicationContext()).c(getId());
        e52 C = c().C(d().a.a);
        if (C == null) {
            i();
        }
        qh5 qh5 = (qh5) this.t0.getValue();
        long j = d().a.a;
        if (C == null || (string = C.q()) == null) {
            string = getApplicationContext().getString(((qh5) this.t0.getValue()).f);
        }
        return new ay5(d().a.hashCode(), qh5.b(j, (Long) null, (Long) null, string, C == null ? null : getApplicationContext().getString(((qh5) this.t0.getValue()).f), (int) this.x0, true, c2), 1);
    }

    public final lp4 d() {
        return (lp4) this.a.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008b A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00cf A[Catch:{ all -> 0x0035 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d0 A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d4 A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object doForegroundWork(kotlin.coroutines.Continuation r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.i7f
            if (r0 == 0) goto L_0x0013
            r0 = r12
            i7f r0 = (defpackage.i7f) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x0018
        L_0x0013:
            i7f r0 = new i7f
            r0.<init>(r11, r12)
        L_0x0018:
            java.lang.Object r12 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 3
            r4 = 2
            r5 = 1
            java.lang.String r6 = "UploadDraftMediaWorker"
            r7 = 4
            r8 = 0
            if (r2 == 0) goto L_0x0059
            if (r2 == r5) goto L_0x0053
            if (r2 == r4) goto L_0x0047
            if (r2 == r3) goto L_0x0040
            if (r2 != r7) goto L_0x0038
            ru.ok.tamtam.upload.workers.UploadDraftMediaWorker r11 = r0.o
            defpackage.od2.a0(r12)     // Catch:{ all -> 0x0035 }
            goto L_0x0087
        L_0x0035:
            r12 = move-exception
            goto L_0x00d9
        L_0x0038:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0040:
            ru.ok.tamtam.upload.workers.UploadDraftMediaWorker r11 = r0.o
            defpackage.od2.a0(r12)     // Catch:{ all -> 0x0035 }
            goto L_0x00c1
        L_0x0047:
            ru.ok.tamtam.upload.workers.UploadDraftMediaWorker r11 = r0.X
            ru.ok.tamtam.upload.workers.UploadDraftMediaWorker r2 = r0.o
            defpackage.od2.a0(r12)     // Catch:{ all -> 0x004f }
            goto L_0x00b1
        L_0x004f:
            r12 = move-exception
            r11 = r2
            goto L_0x00d9
        L_0x0053:
            ru.ok.tamtam.upload.workers.UploadDraftMediaWorker r11 = r0.o
            defpackage.od2.a0(r12)     // Catch:{ all -> 0x0035 }
            goto L_0x0084
        L_0x0059:
            defpackage.od2.a0(r12)
            java.lang.String r12 = "doWork"
            defpackage.hm9.m(r6, r12, new java.lang.Object[0])     // Catch:{ all -> 0x0035 }
            r0.o = r11     // Catch:{ all -> 0x0035 }
            r0.s0 = r5     // Catch:{ all -> 0x0035 }
            khe r12 = r11.v0     // Catch:{ all -> 0x0035 }
            java.lang.Object r12 = r12.getValue()     // Catch:{ all -> 0x0035 }
            kke r12 = (defpackage.kke) r12     // Catch:{ all -> 0x0035 }
            w9a r12 = (defpackage.w9a) r12     // Catch:{ all -> 0x0035 }
            nx3 r12 = r12.b()     // Catch:{ all -> 0x0035 }
            j7f r2 = new j7f     // Catch:{ all -> 0x0035 }
            r2.<init>(r11, r8)     // Catch:{ all -> 0x0035 }
            java.lang.Object r12 = defpackage.j47.t0(r12, r2, r0)     // Catch:{ all -> 0x0035 }
            if (r12 != r1) goto L_0x007f
            goto L_0x0081
        L_0x007f:
            e5f r12 = defpackage.e5f.a     // Catch:{ all -> 0x0035 }
        L_0x0081:
            if (r12 != r1) goto L_0x0084
            return r1
        L_0x0084:
            r11.h()     // Catch:{ all -> 0x0035 }
        L_0x0087:
            fm7 r12 = r11.y0     // Catch:{ all -> 0x0035 }
            if (r12 != 0) goto L_0x00d0
            java.lang.String r12 = "update %f"
            float r2 = r11.x0     // Catch:{ all -> 0x0035 }
            java.lang.Float r5 = new java.lang.Float     // Catch:{ all -> 0x0035 }
            r5.<init>(r2)     // Catch:{ all -> 0x0035 }
            java.lang.Object[] r2 = new java.lang.Object[]{r5}     // Catch:{ all -> 0x0035 }
            defpackage.hm9.m(r6, r12, r2)     // Catch:{ all -> 0x0035 }
            float r12 = r11.x0     // Catch:{ all -> 0x0035 }
            boolean r12 = r11.needToShowNotification(r12)     // Catch:{ all -> 0x0035 }
            if (r12 == 0) goto L_0x00c1
            r0.o = r11     // Catch:{ all -> 0x0035 }
            r0.X = r11     // Catch:{ all -> 0x0035 }
            r0.s0 = r4     // Catch:{ all -> 0x0035 }
            java.lang.Object r12 = r11.getForegroundInfo(r0)     // Catch:{ all -> 0x0035 }
            if (r12 != r1) goto L_0x00b0
            return r1
        L_0x00b0:
            r2 = r11
        L_0x00b1:
            ay5 r12 = (defpackage.ay5) r12     // Catch:{ all -> 0x004f }
            r0.o = r2     // Catch:{ all -> 0x004f }
            r0.X = r8     // Catch:{ all -> 0x004f }
            r0.s0 = r3     // Catch:{ all -> 0x004f }
            java.lang.Object r11 = r11.setForeground(r12, r0)     // Catch:{ all -> 0x004f }
            if (r11 != r1) goto L_0x00c0
            return r1
        L_0x00c0:
            r11 = r2
        L_0x00c1:
            long r9 = r11.getWorkDelay()     // Catch:{ all -> 0x0035 }
            r0.o = r11     // Catch:{ all -> 0x0035 }
            r0.s0 = r7     // Catch:{ all -> 0x0035 }
            java.lang.Object r12 = defpackage.j47.x(r9, r0)     // Catch:{ all -> 0x0035 }
            if (r12 != r1) goto L_0x0087
            return r1
        L_0x00d0:
            fm7 r12 = r11.y0     // Catch:{ all -> 0x0035 }
            if (r12 != 0) goto L_0x00e5
            cm7 r12 = defpackage.fm7.a()     // Catch:{ all -> 0x0035 }
            goto L_0x00e5
        L_0x00d9:
            java.lang.String r0 = "cancelled!"
            defpackage.hm9.p(r6, r0, r12)
            r11.i()
            cm7 r12 = defpackage.fm7.a()
        L_0x00e5:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.UploadDraftMediaWorker.doForegroundWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void e(Throwable th) {
        ep4 ep4 = d().a;
        hm9.p("UploadDraftMediaWorker", "onUploadFailed: draftMediaUploadKey = " + ep4, th);
        ep4 ep42 = d().a;
        hm9.p("UploadDraftMediaWorker", "failDraftUpload: key = " + ep42, (Throwable) null);
        e52 C = c().C(d().a.a);
        if (C == null) {
            hm9.p("UploadDraftMediaWorker", "failDraftUpload: chat is null", (Throwable) null);
        } else {
            uaa uaa = C.b.f0;
            if (uaa == null) {
                hm9.p("UploadDraftMediaWorker", "failDraftUpload: draft is null", (Throwable) null);
            } else {
                ((jp4) this.X.getValue()).c(uaa);
                p82 c2 = c();
                Long b2 = uaa.b();
                c2.k(C.a, b2 != null ? b2.longValue() : 0, uaa);
                r9d.y((s8g) this.c.getValue());
            }
        }
        g();
        ((dg5) this.u0.getValue()).b(d().a.a);
        this.y0 = fm7.a();
    }

    public final void g() {
        try {
            new qa3(((up4) this.b.getValue()).a(), 2, new gd1(10, d().a)).a();
            ep4 ep4 = d().a;
            hm9.m("UploadDraftMediaWorker", "removeUploadFromStorage: success for key = " + ep4, new Object[0]);
        } catch (Throwable th) {
            ep4 ep42 = d().a;
            hm9.p("UploadDraftMediaWorker", "removeUploadFromStorage: failed for key = " + ep42, th);
        }
    }

    public final String getName() {
        String e = getInputData().e("workName");
        return e == null ? "UploadDraftMediaWorker" : e;
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [hy8, java.lang.Object] */
    public final void h() {
        b10 b10;
        lp4 d = d();
        hm9.m("UploadDraftMediaWorker", "startUpload: draftUpload = " + d, new Object[0]);
        int i = d().d;
        if (i != 0) {
            switch (r8f.$EnumSwitchMapping$0[au1.s(i)]) {
                case 1:
                    b10 = b10.UNKNOWN;
                    break;
                case 2:
                case 3:
                    b10 = b10.VIDEO;
                    break;
                case 4:
                case 5:
                    b10 = b10.PHOTO;
                    break;
                case 6:
                    b10 = b10.FILE;
                    break;
                case 7:
                    b10 = b10.AUDIO;
                    break;
                case 8:
                    b10 = b10.STICKER;
                    break;
                default:
                    b10 = b10.UNKNOWN;
                    break;
            }
            if (b10 == b10.UNKNOWN) {
                e(new IllegalStateException("Internal error. Unknown attach type for upload type"));
                return;
            }
            ? obj = new Object();
            obj.e = d().e;
            obj.b = d().b;
            obj.d = d().d;
            obj.c = d().c;
            obj.f = d().a.b;
            r0a n = ((g8f) this.Z.getValue()).a(new iy8(obj)).n((ztc) this.s0.getValue());
            sd7 sd7 = new sd7(new w5e(this), new qje(2, this), ft.d);
            n.a(sd7);
            this.w0 = sd7;
            return;
        }
        throw null;
    }

    public final void i() {
        ep4 ep4 = d().a;
        hm9.m("UploadDraftMediaWorker", "cancel: key =" + ep4, new Object[0]);
        cqc.b(this.w0);
        g();
        String str = d().a.b;
        hm9.m("UploadDraftMediaWorker", "cancel: finished for key = " + str, new Object[0]);
        this.y0 = fm7.a();
    }
}
