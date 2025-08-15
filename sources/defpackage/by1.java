package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: by1  reason: default package */
public final class by1 implements cne {
    public static final aa0 X = new aa0(Executor.class, (Object) null, "camerax.core.appConfig.cameraExecutor");
    public static final aa0 Y = new aa0(Handler.class, (Object) null, "camerax.core.appConfig.schedulerHandler");
    public static final aa0 Z = new aa0(Integer.TYPE, (Object) null, "camerax.core.appConfig.minimumLoggingLevel");
    public static final aa0 b = new aa0(av1.class, (Object) null, "camerax.core.appConfig.cameraFactoryProvider");
    public static final aa0 c = new aa0(bv1.class, (Object) null, "camerax.core.appConfig.deviceSurfaceManagerProvider");
    public static final aa0 o = new aa0(av1.class, (Object) null, "camerax.core.appConfig.useCaseConfigFactoryProvider");
    public static final aa0 s0 = new aa0(px1.class, (Object) null, "camerax.core.appConfig.availableCamerasLimiter");
    public static final aa0 t0 = new aa0(Long.TYPE, (Object) null, "camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming");
    public static final aa0 u0 = new aa0(akc.class, (Object) null, "camerax.core.appConfig.cameraProviderInitRetryPolicy");
    public static final aa0 v0 = new aa0(wrb.class, (Object) null, "camerax.core.appConfig.quirksSettings");
    public final wma a;

    public by1(wma wma) {
        this.a = wma;
    }

    public final px1 a() {
        Object obj;
        aa0 aa0 = s0;
        wma wma = this.a;
        wma.getClass();
        try {
            obj = wma.h(aa0);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        return (px1) obj;
    }

    public final av1 b() {
        Object obj;
        aa0 aa0 = b;
        wma wma = this.a;
        wma.getClass();
        try {
            obj = wma.h(aa0);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        return (av1) obj;
    }

    public final long c() {
        aa0 aa0 = t0;
        long j = -1L;
        wma wma = this.a;
        wma.getClass();
        try {
            j = wma.h(aa0);
        } catch (IllegalArgumentException unused) {
        }
        return ((Long) j).longValue();
    }

    public final bv1 d() {
        Object obj;
        aa0 aa0 = c;
        wma wma = this.a;
        wma.getClass();
        try {
            obj = wma.h(aa0);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        return (bv1) obj;
    }

    public final ce3 getConfig() {
        return this.a;
    }

    public final av1 j() {
        Object obj;
        aa0 aa0 = o;
        wma wma = this.a;
        wma.getClass();
        try {
            obj = wma.h(aa0);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        return (av1) obj;
    }
}
