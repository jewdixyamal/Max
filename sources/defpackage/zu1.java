package defpackage;

import android.hardware.camera2.TotalCaptureResult;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: zu1  reason: default package */
public final class zu1 implements tu1 {
    public static final long g = TimeUnit.SECONDS.toNanos(2);
    public static final /* synthetic */ int h = 0;
    public final st1 a;
    public final int b;
    public boolean c = false;
    public final Executor d;
    public final ScheduledExecutorService e;
    public final boolean f;

    public zu1(st1 st1, int i, Executor executor, ScheduledExecutorService scheduledExecutorService, boolean z) {
        this.a = st1;
        this.b = i;
        this.d = executor;
        this.e = scheduledExecutorService;
        this.f = z;
    }

    public final bm7 a(TotalCaptureResult totalCaptureResult) {
        u40.g(this.b, totalCaptureResult);
        if (!u40.g(this.b, totalCaptureResult) || this.a.r) {
            return kq0.r(Boolean.FALSE);
        }
        this.c = true;
        b76 a2 = b76.a(f8.g(new yu1(this, 0)));
        yu1 yu1 = new yu1(this, 1);
        Executor executor = this.d;
        a2.getClass();
        k12 K = kq0.K(kq0.K(a2, yu1, executor), new yu1(this, 2), this.d);
        mu1 mu1 = new mu1(4);
        return kq0.K(K, new re6(15, (Object) mu1), ju0.k());
    }

    public final boolean b() {
        return this.b == 0;
    }

    public final void c() {
        if (this.c) {
            st1 st1 = this.a;
            st1.j.a((lq1) null, false);
            if (this.f) {
                st1.h.a(false, true);
            }
        }
    }
}
