package ru.ok.tamtam.android.emoji.font;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.Keep;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.ForegroundWorker;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0002\u0013\u001bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH@¢\u0006\u0004\b\f\u0010\nR\u001b\u0010\u0012\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lru/ok/tamtam/android/emoji/font/LoadEmojiFontWorker;", "Lru/ok/tamtam/upload/workers/ForegroundWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lfm7;", "doForegroundWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lay5;", "createForegroundInfo", "Lfx4;", "emojiFontLoadingNotifications$delegate", "Lje7;", "getEmojiFontLoadingNotifications", "()Lfx4;", "emojiFontLoadingNotifications", "Lun7;", "state", "Lun7;", "", "getName", "()Ljava/lang/String;", "name", "Companion", "qn7", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
@Keep
public final class LoadEmojiFontWorker extends ForegroundWorker {
    public static final qn7 Companion = new Object();
    public static final String TAG = "LoadEmojiFontWorker";
    public static final String WAITING_FOR_WIFI = "waiting_for_wifi";
    private final je7 emojiFontLoadingNotifications$delegate = new khe(new zj7(1, this));
    /* access modifiers changed from: private */
    public volatile un7 state = new sn7(-1);

    public LoadEmojiFontWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* access modifiers changed from: private */
    public static final fx4 emojiFontLoadingNotifications_delegate$lambda$0(LoadEmojiFontWorker loadEmojiFontWorker) {
        return (fx4) ((jyc) loadEmojiFontWorker.getTamComponent()).l().j.getValue();
    }

    private final fx4 getEmojiFontLoadingNotifications() {
        return (fx4) this.emojiFontLoadingNotifications$delegate.getValue();
    }

    public static final void start(v7g v7g, boolean z) {
        Companion.getClass();
        qn7.a(v7g, z);
    }

    public Object createForegroundInfo(Continuation<? super ay5> continuation) {
        un7 un7 = this.state;
        sn7 sn7 = un7 instanceof sn7 ? (sn7) un7 : null;
        int i = sn7 != null ? sn7.a : -1;
        PendingIntent c = s7g.d(getApplicationContext()).c(getId());
        fx4 emojiFontLoadingNotifications = getEmojiFontLoadingNotifications();
        l7 l7Var = emojiFontLoadingNotifications.a;
        l7Var.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        long j = l7Var.c;
        if (j == 0 || currentTimeMillis - j > l7Var.b) {
            l7Var.c = currentTimeMillis;
            hm9.m("fx4", "getEmojiFontLoadingNotification: progress = %d", Integer.valueOf(i));
        }
        bea bea = emojiFontLoadingNotifications.c;
        bea.c();
        Intent f = bea.f(false);
        Context context = emojiFontLoadingNotifications.b;
        PendingIntent p = oag.p(context, 11, f);
        emojiFontLoadingNotifications.e.getClass();
        bu9 h = bea.h("ru.oneme.app.fileUpload", true, true);
        emojiFontLoadingNotifications.f.getClass();
        h.e = bu9.c(context.getString(jpc.a0));
        emojiFontLoadingNotifications.d.getClass();
        int i2 = gpc.m0;
        Notification notification = h.F;
        notification.icon = i2;
        boolean z = i == -1;
        h.o = 100;
        h.p = i;
        h.q = z;
        h.k = 0;
        h.g(0);
        h.p((Uri) null);
        h.i(16, false);
        h.v = "progress";
        notification.when = 0;
        h.i(2, true);
        h.b.add(new nt9(0, context.getString(jpc.r), c));
        h.g = p;
        Notification b = h.b();
        getEmojiFontLoadingNotifications().getClass();
        return new ay5(11, b, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009b, code lost:
        if ((!(r9 instanceof defpackage.sn7)) == false) goto L_0x00a2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0093 A[Catch:{ all -> 0x0115, all -> 0x005d }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b2 A[Catch:{ all -> 0x0115, all -> 0x005d }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00fc A[Catch:{ all -> 0x0115, all -> 0x005d }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0114 A[Catch:{ all -> 0x0115, all -> 0x005d }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object doForegroundWork(kotlin.coroutines.Continuation<? super defpackage.fm7> r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof defpackage.vn7
            if (r0 == 0) goto L_0x0013
            r0 = r15
            vn7 r0 = (defpackage.vn7) r0
            int r1 = r0.u0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.u0 = r1
            goto L_0x0018
        L_0x0013:
            vn7 r0 = new vn7
            r0.<init>(r14, r15)
        L_0x0018:
            java.lang.Object r15 = r0.s0
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.u0
            r3 = 0
            r4 = 0
            r5 = 3
            r6 = 2
            java.lang.String r7 = "LoadEmojiFontWorker"
            r8 = 1
            if (r2 == 0) goto L_0x0061
            if (r2 == r8) goto L_0x0050
            if (r2 == r6) goto L_0x0045
            if (r2 != r5) goto L_0x003d
            oke r14 = r0.Y
            ay4 r2 = r0.X
            ru.ok.tamtam.android.emoji.font.LoadEmojiFontWorker r9 = r0.o
            defpackage.od2.a0(r15)     // Catch:{ all -> 0x003a }
            r15 = r2
            r2 = r14
            r14 = r9
            goto L_0x008d
        L_0x003a:
            r15 = move-exception
            goto L_0x015f
        L_0x003d:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x0045:
            oke r14 = r0.Y
            ay4 r2 = r0.X
            ru.ok.tamtam.android.emoji.font.LoadEmojiFontWorker r9 = r0.o
            defpackage.od2.a0(r15)     // Catch:{ all -> 0x003a }
            goto L_0x00ff
        L_0x0050:
            ru.ok.tamtam.android.emoji.font.LoadEmojiFontWorker r14 = r0.Z
            oke r2 = r0.Y
            ay4 r9 = r0.X
            ru.ok.tamtam.android.emoji.font.LoadEmojiFontWorker r10 = r0.o
            defpackage.od2.a0(r15)     // Catch:{ all -> 0x005d }
            goto L_0x00e9
        L_0x005d:
            r15 = move-exception
        L_0x005e:
            r14 = r2
            goto L_0x015f
        L_0x0061:
            defpackage.od2.a0(r15)
            fke r15 = r14.getTamComponent()
            jyc r15 = (defpackage.jyc) r15
            v4 r15 = r15.getAccessor()
            java.lang.Class<ay4> r2 = defpackage.ay4.class
            java.lang.Object r15 = r15.c(r2)
            ay4 r15 = (defpackage.ay4) r15
            je7 r2 = r15.a
            java.lang.Object r2 = r2.getValue()
            oke r2 = (defpackage.oke) r2
            java.lang.String r9 = "doWork"
            defpackage.hm9.m(r7, r9, new java.lang.Object[0])     // Catch:{ all -> 0x005d }
            wd6 r9 = new wd6     // Catch:{ all -> 0x005d }
            r10 = 19
            r9.<init>((int) r10, (java.lang.Object) r14)     // Catch:{ all -> 0x005d }
            r2.c(r9)     // Catch:{ all -> 0x005d }
        L_0x008d:
            boolean r9 = r14.isStopped()     // Catch:{ all -> 0x005d }
            if (r9 == 0) goto L_0x00a2
            un7 r9 = r14.state     // Catch:{ all -> 0x005d }
            r9.getClass()     // Catch:{ all -> 0x00a0 }
            boolean r9 = r9 instanceof defpackage.sn7     // Catch:{ all -> 0x00a0 }
            r9 = r9 ^ r8
            if (r9 != 0) goto L_0x013d
            goto L_0x00a2
        L_0x009e:
            r15 = r14
            goto L_0x005e
        L_0x00a0:
            r14 = move-exception
            goto L_0x009e
        L_0x00a2:
            un7 r9 = r14.state     // Catch:{ all -> 0x005d }
            boolean r10 = r9 instanceof defpackage.rn7     // Catch:{ all -> 0x005d }
            if (r10 == 0) goto L_0x00b2
            rn7 r9 = (defpackage.rn7) r9     // Catch:{ all -> 0x005d }
            r9.getClass()     // Catch:{ all -> 0x005d }
            cm7 r14 = defpackage.fm7.a()     // Catch:{ all -> 0x005d }
            return r14
        L_0x00b2:
            boolean r10 = r9 instanceof defpackage.sn7     // Catch:{ all -> 0x005d }
            if (r10 == 0) goto L_0x0117
            java.lang.String r10 = "progress %f"
            r11 = r9
            sn7 r11 = (defpackage.sn7) r11     // Catch:{ all -> 0x005d }
            int r11 = r11.a     // Catch:{ all -> 0x005d }
            java.lang.Integer r12 = new java.lang.Integer     // Catch:{ all -> 0x0115 }
            r12.<init>(r11)     // Catch:{ all -> 0x0115 }
            java.lang.Object[] r11 = new java.lang.Object[]{r12}     // Catch:{ all -> 0x005d }
            defpackage.hm9.m(r7, r10, r11)     // Catch:{ all -> 0x005d }
            sn7 r9 = (defpackage.sn7) r9     // Catch:{ all -> 0x005d }
            int r9 = r9.a     // Catch:{ all -> 0x005d }
            float r9 = (float) r9     // Catch:{ all -> 0x005d }
            boolean r9 = r14.needToShowNotification(r9)     // Catch:{ all -> 0x005d }
            if (r9 == 0) goto L_0x0102
            r0.o = r14     // Catch:{ all -> 0x005d }
            r0.X = r15     // Catch:{ all -> 0x005d }
            r0.Y = r2     // Catch:{ all -> 0x005d }
            r0.Z = r14     // Catch:{ all -> 0x005d }
            r0.u0 = r8     // Catch:{ all -> 0x005d }
            java.lang.Object r9 = r14.getForegroundInfo(r0)     // Catch:{ all -> 0x005d }
            if (r9 != r1) goto L_0x00e5
            return r1
        L_0x00e5:
            r10 = r14
            r13 = r9
            r9 = r15
            r15 = r13
        L_0x00e9:
            ay5 r15 = (defpackage.ay5) r15     // Catch:{ all -> 0x005d }
            r0.o = r10     // Catch:{ all -> 0x005d }
            r0.X = r9     // Catch:{ all -> 0x005d }
            r0.Y = r2     // Catch:{ all -> 0x005d }
            r0.Z = r3     // Catch:{ all -> 0x005d }
            r0.u0 = r6     // Catch:{ all -> 0x005d }
            java.lang.Object r14 = r14.setForeground(r15, r0)     // Catch:{ all -> 0x005d }
            if (r14 != r1) goto L_0x00fc
            return r1
        L_0x00fc:
            r14 = r2
            r2 = r9
            r9 = r10
        L_0x00ff:
            r15 = r2
            r2 = r14
            r14 = r9
        L_0x0102:
            long r9 = r14.getWorkDelay()     // Catch:{ all -> 0x005d }
            r0.o = r14     // Catch:{ all -> 0x005d }
            r0.X = r15     // Catch:{ all -> 0x005d }
            r0.Y = r2     // Catch:{ all -> 0x005d }
            r0.u0 = r5     // Catch:{ all -> 0x005d }
            java.lang.Object r9 = defpackage.j47.x(r9, r0)     // Catch:{ all -> 0x005d }
            if (r9 != r1) goto L_0x008d
            return r1
        L_0x0115:
            r14 = move-exception
            goto L_0x009e
        L_0x0117:
            boolean r0 = r9 instanceof defpackage.tn7     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x0159
            tn7 r9 = (defpackage.tn7) r9     // Catch:{ all -> 0x005d }
            mx5 r0 = r9.a     // Catch:{ all -> 0x005d }
            r15.getClass()     // Catch:{ all -> 0x0156 }
            r0.b = r8     // Catch:{ all -> 0x0156 }
            xs r1 = r0.e     // Catch:{ all -> 0x0156 }
            if (r1 != 0) goto L_0x012f
            xs r1 = new xs     // Catch:{ all -> 0x0156 }
            r1.<init>((int) r4)     // Catch:{ all -> 0x0156 }
            r0.e = r1     // Catch:{ all -> 0x0156 }
        L_0x012f:
            xs r1 = r0.e     // Catch:{ all -> 0x0156 }
            r1.add(r15)     // Catch:{ all -> 0x0156 }
            r0.c = r4     // Catch:{ all -> 0x0156 }
            r0.d = r3     // Catch:{ all -> 0x0156 }
            r0.f = r4     // Catch:{ all -> 0x0156 }
            defpackage.vw4.c(r0)     // Catch:{ all -> 0x0156 }
        L_0x013d:
            boolean r14 = r14.isStopped()     // Catch:{ all -> 0x005d }
            if (r14 == 0) goto L_0x014c
            dm7 r14 = new dm7     // Catch:{ all -> 0x0149 }
            r14.<init>()     // Catch:{ all -> 0x0149 }
            goto L_0x017f
        L_0x0149:
            r14 = move-exception
            goto L_0x009e
        L_0x014c:
            java.lang.String r14 = "success!"
            defpackage.hm9.m(r7, r14, new java.lang.Object[0])     // Catch:{ all -> 0x005d }
            em7 r14 = defpackage.fm7.b()     // Catch:{ all -> 0x005d }
            goto L_0x017f
        L_0x0156:
            r14 = move-exception
            goto L_0x009e
        L_0x0159:
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x005d }
            r14.<init>()     // Catch:{ all -> 0x005d }
            throw r14     // Catch:{ all -> 0x005d }
        L_0x015f:
            java.lang.String r0 = "cancelled!"
            defpackage.hm9.l0(r7, r0, r15)
            r14.getClass()
            java.lang.Object[] r15 = new java.lang.Object[r4]
            java.lang.Object[] r15 = java.util.Arrays.copyOf(r15, r4)
            java.lang.String r0 = "oke"
            java.lang.String r1 = "cancelLoading"
            defpackage.hm9.k0(r0, r3, r1, r15)
            iq1 r15 = r14.s0
            defpackage.cqc.b(r15)
            r14.s0 = r3
            cm7 r14 = defpackage.fm7.a()
        L_0x017f:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.android.emoji.font.LoadEmojiFontWorker.doForegroundWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public String getName() {
        return TAG;
    }

    public static final void start(v7g v7g) {
        Companion.getClass();
        qn7.a(v7g, false);
    }
}
