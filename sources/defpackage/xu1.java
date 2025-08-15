package defpackage;

import android.hardware.camera2.TotalCaptureResult;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: xu1  reason: default package */
public final class xu1 implements tu1 {
    public static final long f = TimeUnit.SECONDS.toNanos(2);
    public static final /* synthetic */ int g = 0;
    public final st1 a;
    public final Executor b;
    public final ScheduledExecutorService c;
    public final eu6 d;
    public final w4d e;

    public xu1(st1 st1, Executor executor, ScheduledExecutorService scheduledExecutorService, w4d w4d) {
        this.a = st1;
        this.b = executor;
        this.c = scheduledExecutorService;
        this.e = w4d;
        eu6 eu6 = st1.q;
        Objects.requireNonNull(eu6);
        this.d = eu6;
    }

    public final bm7 a(TotalCaptureResult totalCaptureResult) {
        AtomicReference atomicReference = new AtomicReference();
        oq1 g2 = f8.g(new dt0(atomicReference, 1));
        b76 a2 = b76.a(f8.g(new f9(this, 14, atomicReference)));
        vu1 vu1 = new vu1(this, 1);
        a2.getClass();
        Executor executor = this.b;
        k12 K = kq0.K(kq0.K(kq0.K(kq0.K(kq0.K(a2, vu1, executor), new vu1(this, 2), executor), new f9(this, 15, g2), executor), new vu1(this, 3), executor), new vu1(this, 4), executor);
        mu1 mu1 = new mu1(3);
        return kq0.K(K, new re6(15, (Object) mu1), ju0.k());
    }

    public final boolean b() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r6 = this;
            w4d r0 = r6.e
            java.lang.Object r0 = r0.b
            androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk r0 = (androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk) r0
            r1 = 1
            r2 = 5
            r3 = 0
            if (r0 == 0) goto L_0x001b
            xv1 r0 = r0.a
            int r0 = defpackage.st1.t(r0, r2)
            if (r0 != r2) goto L_0x0015
            r0 = r1
            goto L_0x0016
        L_0x0015:
            r0 = r3
        L_0x0016:
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x001b
            r0 = r1
            goto L_0x001c
        L_0x001b:
            r0 = r3
        L_0x001c:
            st1 r4 = r6.a
            if (r0 == 0) goto L_0x0023
            r4.r(r3)
        L_0x0023:
            xs5 r0 = r4.h
            st1 r5 = r0.a
            xv1 r5 = r5.e
            int r5 = defpackage.st1.t(r5, r2)
            if (r5 == r2) goto L_0x0032
            dw6 r0 = defpackage.dw6.c
            goto L_0x003c
        L_0x0032:
            fe4 r2 = new fe4
            r5 = 1
            r2.<init>(r0, r3, r5)
            oq1 r0 = defpackage.f8.g(r2)
        L_0x003c:
            kc r2 = new kc
            r5 = 6
            r2.<init>(r5)
            java.util.concurrent.Executor r5 = r6.b
            r0.d(r2, r5)
            xs5 r0 = r4.h
            r0.a(r3, r1)
            zh6 r0 = defpackage.ju0.D()
            eu6 r6 = r6.d
            java.util.Objects.requireNonNull(r6)
            cu1 r1 = new cu1
            r2 = 2
            r1.<init>(r2, r6)
            r0.execute(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xu1.c():void");
    }
}
