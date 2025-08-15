package ru.ok.messages.services;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.work.WorkerParameters;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.workmanager.SdkCoroutineWorker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ok/messages/services/PipWorker;", "Lru/ok/tamtam/workmanager/SdkCoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class PipWorker extends SdkCoroutineWorker {
    public final khe a = new khe(new lwa(3, this));

    public PipWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006e A[SYNTHETIC, Splitter:B:30:0x006e] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b4 A[Catch:{ all -> 0x0031 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object doWork(kotlin.coroutines.Continuation r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.c2b
            if (r0 == 0) goto L_0x0013
            r0 = r10
            c2b r0 = (defpackage.c2b) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x0018
        L_0x0013:
            c2b r0 = new c2b
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r10 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 3
            r4 = 2
            r5 = 1
            java.lang.String r6 = "PIP_WORKER"
            if (r2 == 0) goto L_0x004e
            if (r2 == r5) goto L_0x0042
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            ru.ok.messages.services.PipWorker r9 = r0.o
            defpackage.od2.a0(r10)     // Catch:{ all -> 0x0031 }
            goto L_0x0066
        L_0x0031:
            r10 = move-exception
            goto L_0x00bd
        L_0x0034:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003c:
            ru.ok.messages.services.PipWorker r9 = r0.o
            defpackage.od2.a0(r10)     // Catch:{ all -> 0x0031 }
            goto L_0x00a2
        L_0x0042:
            ru.ok.messages.services.PipWorker r9 = r0.X
            ru.ok.messages.services.PipWorker r2 = r0.o
            defpackage.od2.a0(r10)     // Catch:{ all -> 0x004a }
            goto L_0x0091
        L_0x004a:
            r10 = move-exception
            r9 = r2
            goto L_0x00bd
        L_0x004e:
            defpackage.od2.a0(r10)
            java.lang.String r10 = "doWork"
            defpackage.hm9.m(r6, r10, new java.lang.Object[0])
            r9.getApplicationContext()
            ed3 r10 = defpackage.vl.b()
            y8a r10 = (defpackage.y8a) r10
            ti4 r10 = r10.f()
            r10.f(r6)
        L_0x0066:
            boolean r10 = r9.isStopped()     // Catch:{ all -> 0x0031 }
            khe r2 = r9.a
            if (r10 != 0) goto L_0x00b8
            java.lang.Object r10 = r2.getValue()     // Catch:{ all -> 0x0031 }
            o1b r10 = (defpackage.o1b) r10     // Catch:{ all -> 0x0031 }
            e52 r10 = r10.H0     // Catch:{ all -> 0x0031 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x0031 }
            o1b r2 = (defpackage.o1b) r2     // Catch:{ all -> 0x0031 }
            es8 r2 = r2.G0     // Catch:{ all -> 0x0031 }
            if (r10 == 0) goto L_0x00b5
            if (r2 != 0) goto L_0x0083
            goto L_0x00b5
        L_0x0083:
            r0.o = r9     // Catch:{ all -> 0x0031 }
            r0.X = r9     // Catch:{ all -> 0x0031 }
            r0.s0 = r5     // Catch:{ all -> 0x0031 }
            java.lang.Object r10 = r9.getForegroundInfo(r0)     // Catch:{ all -> 0x0031 }
            if (r10 != r1) goto L_0x0090
            return r1
        L_0x0090:
            r2 = r9
        L_0x0091:
            ay5 r10 = (defpackage.ay5) r10     // Catch:{ all -> 0x004a }
            r0.o = r2     // Catch:{ all -> 0x004a }
            r7 = 0
            r0.X = r7     // Catch:{ all -> 0x004a }
            r0.s0 = r4     // Catch:{ all -> 0x004a }
            java.lang.Object r9 = r9.setForeground(r10, r0)     // Catch:{ all -> 0x004a }
            if (r9 != r1) goto L_0x00a1
            return r1
        L_0x00a1:
            r9 = r2
        L_0x00a2:
            int r10 = defpackage.ft4.o     // Catch:{ all -> 0x0031 }
            kt4 r10 = defpackage.kt4.SECONDS     // Catch:{ all -> 0x0031 }
            long r7 = defpackage.z7.R(r5, r10)     // Catch:{ all -> 0x0031 }
            r0.o = r9     // Catch:{ all -> 0x0031 }
            r0.s0 = r3     // Catch:{ all -> 0x0031 }
            java.lang.Object r10 = defpackage.j47.y(r7, r0)     // Catch:{ all -> 0x0031 }
            if (r10 != r1) goto L_0x0066
            return r1
        L_0x00b5:
            r9.stop()     // Catch:{ all -> 0x0031 }
        L_0x00b8:
            em7 r10 = defpackage.fm7.b()     // Catch:{ all -> 0x0031 }
            goto L_0x00c6
        L_0x00bd:
            java.lang.String r0 = "failure!"
            defpackage.hm9.p(r6, r0, r10)
            cm7 r10 = defpackage.fm7.a()
        L_0x00c6:
            java.lang.String r0 = "doWork finish %s"
            java.lang.Object[] r1 = new java.lang.Object[]{r10}
            defpackage.hm9.m(r6, r0, r1)
            r9.getApplicationContext()
            ed3 r9 = defpackage.vl.b()
            y8a r9 = (defpackage.y8a) r9
            ti4 r9 = r9.f()
            r9.g(r6)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.services.PipWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [pu9, hu9] */
    public final Object getForegroundInfo(Continuation continuation) {
        Uri uri;
        o1b o1b = (o1b) this.a.getValue();
        y1b y1b = o1b.x0;
        e52 e52 = o1b.H0;
        es8 es8 = o1b.G0;
        l20 l20 = o1b.F0;
        Bitmap bitmap = null;
        if (l20 == null) {
            uri = null;
        } else {
            uri = Uri.parse((s5c.P(l20) ? o1b.F0.j.d.d : o1b.F0.d).d);
        }
        boolean z = o1b.K0;
        y1b.b.c();
        bea bea = y1b.b;
        y1b.c.getClass();
        bu9 h = bea.h("ru.oneme.app.media", true, true);
        ? pu9 = new pu9();
        pu9.e = null;
        pu9.f = ((MediaSessionCompat) y1b.d.getValue()).getSessionToken();
        pu9.e = new int[]{0};
        va8 va8 = y1b.e;
        va8.getClass();
        Intent intent = new Intent("ru.ok.video.ACTION_VIDEO_STOP");
        PendingIntent.getBroadcast((Context) va8.b, 5, intent, oag.I(intent, oag.m(134217728)));
        if (uri != null) {
            o43 o43 = (o43) s36.o().a(wv6.a(uri), (Object) null).e();
            if (o43 != null) {
                o43.e0();
                l43 l43 = (l43) o43.e0();
                if (l43 instanceof CloseableStaticBitmap) {
                    bitmap = ((CloseableStaticBitmap) l43).getUnderlyingBitmap();
                }
            }
            if (bitmap != null) {
                h.k(bitmap);
            }
        }
        va8 va82 = y1b.e;
        va82.getClass();
        Intent intent2 = new Intent("ru.ok.video.ACTION_VIDEO_STOP");
        h.F.deleteIntent = PendingIntent.getBroadcast((Context) va82.b, 5, intent2, oag.I(intent2, oag.m(134217728)));
        h.i(2, z);
        h.m();
        if (e52 != null) {
            e52.k0();
            h.f(e52.u0);
            if (es8 != null) {
                va8 va83 = y1b.e;
                long j = e52.a;
                cu8 cu8 = es8.a;
                long j2 = cu8.o;
                long j3 = cu8.b;
                bea bea2 = (bea) va83.c;
                bea2.getClass();
                vw7 vw7 = vw7.c;
                Long valueOf = Long.valueOf(j2);
                Long valueOf2 = Long.valueOf(j3);
                vw7.getClass();
                h.g = oag.p((Context) va83.b, 5, bea2.k(vw7.Z1(j, valueOf, valueOf2)));
            }
        }
        h.e(y1b.a.getText(jpc.t3));
        h.F.icon = z ? gpc.o0 : gpc.p0;
        va8 va84 = y1b.e;
        va84.getClass();
        Intent intent3 = new Intent().setAction(z ? "ru.ok.video.ACTION_VIDEO_PAUSE" : "ru.ok.video.ACTION_VIDEO_PLAY").setPackage("one.me.android");
        h.a(new nt9(z ? gpc.S : gpc.V, "", PendingIntent.getBroadcast((Context) va84.b, 5, intent3, oag.I(intent3, oag.m(134217728)))));
        h.q(pu9);
        return new ay5(5, h.b(), 2);
    }
}
