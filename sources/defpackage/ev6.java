package defpackage;

import android.util.Size;
import java.util.List;

/* renamed from: ev6  reason: default package */
public interface ev6 extends t7c {
    public static final aa0 B = new aa0(ft.class, (Object) null, "camerax.core.imageOutput.targetAspectRatio");
    public static final aa0 C;
    public static final aa0 D;
    public static final aa0 E;
    public static final aa0 F;
    public static final aa0 G;
    public static final aa0 H;
    public static final aa0 I;
    public static final aa0 J = new aa0(kic.class, (Object) null, "camerax.core.imageOutput.resolutionSelector");
    public static final aa0 K;

    static {
        Class cls = Integer.TYPE;
        C = new aa0(cls, (Object) null, "camerax.core.imageOutput.targetRotation");
        D = new aa0(cls, (Object) null, "camerax.core.imageOutput.appTargetRotation");
        E = new aa0(cls, (Object) null, "camerax.core.imageOutput.mirrorMode");
        Class<Size> cls2 = Size.class;
        F = new aa0(cls2, (Object) null, "camerax.core.imageOutput.targetResolution");
        G = new aa0(cls2, (Object) null, "camerax.core.imageOutput.defaultResolution");
        H = new aa0(cls2, (Object) null, "camerax.core.imageOutput.maxResolution");
        Class<List> cls3 = List.class;
        I = new aa0(cls3, (Object) null, "camerax.core.imageOutput.supportedResolutions");
        K = new aa0(cls3, (Object) null, "camerax.core.imageOutput.customOrderedResolutions");
    }

    static void e0(ev6 ev6) {
        boolean o = ev6.o(B);
        boolean z = ((Size) ev6.f(F, (Object) null)) != null;
        if (o && z) {
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        } else if (((kic) ev6.f(J, (Object) null)) == null) {
        } else {
            if (o || z) {
                throw new IllegalArgumentException("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    int f0(int i) {
        return ((Integer) f(C, Integer.valueOf(i))).intValue();
    }
}
