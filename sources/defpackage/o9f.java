package defpackage;

import android.util.Range;

/* renamed from: o9f  reason: default package */
public interface o9f extends cne, tu6 {
    public static final aa0 g0 = new aa0(fad.class, (Object) null, "camerax.core.useCase.defaultSessionConfig");
    public static final aa0 h0 = new aa0(kz1.class, (Object) null, "camerax.core.useCase.defaultCaptureConfig");
    public static final aa0 i0 = new aa0(dv1.class, (Object) null, "camerax.core.useCase.sessionConfigUnpacker");
    public static final aa0 j0 = new aa0(lu1.class, (Object) null, "camerax.core.useCase.captureConfigUnpacker");
    public static final aa0 k0;
    public static final aa0 l0 = new aa0(Range.class, (Object) null, "camerax.core.useCase.targetFrameRate");
    public static final aa0 m0;
    public static final aa0 n0;
    public static final aa0 o0 = new aa0(q9f.class, (Object) null, "camerax.core.useCase.captureType");
    public static final aa0 p0;
    public static final aa0 q0;

    static {
        Class cls = Integer.TYPE;
        k0 = new aa0(cls, (Object) null, "camerax.core.useCase.surfaceOccupancyPriority");
        Class cls2 = Boolean.TYPE;
        m0 = new aa0(cls2, (Object) null, "camerax.core.useCase.zslDisabled");
        n0 = new aa0(cls2, (Object) null, "camerax.core.useCase.highResolutionDisabled");
        p0 = new aa0(cls, (Object) null, "camerax.core.useCase.previewStabilizationMode");
        q0 = new aa0(cls, (Object) null, "camerax.core.useCase.videoStabilizationMode");
    }

    q9f N() {
        return (q9f) h(o0);
    }

    int O() {
        return ((Integer) f(q0, 0)).intValue();
    }

    int X() {
        return ((Integer) f(p0, 0)).intValue();
    }
}
