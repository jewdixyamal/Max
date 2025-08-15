package defpackage;

/* renamed from: gu6  reason: default package */
public final class gu6 implements o9f, ev6, n67 {
    public static final aa0 X;
    public static final aa0 Y;
    public static final aa0 Z = new aa0(rv6.class, (Object) null, "camerax.core.imageCapture.imageReaderProxyProvider");
    public static final aa0 b;
    public static final aa0 c;
    public static final aa0 o = new aa0(iz1.class, (Object) null, "camerax.core.imageCapture.captureBundle");
    public static final aa0 s0 = new aa0(Boolean.TYPE, (Object) null, "camerax.core.imageCapture.useSoftwareJpegEncoder");
    public static final aa0 t0;
    public static final aa0 u0;
    public static final aa0 v0 = new aa0(eu6.class, (Object) null, "camerax.core.imageCapture.screenFlash");
    public static final aa0 w0 = new aa0(Boolean.class, (Object) null, "camerax.core.useCase.isPostviewEnabled");
    public final wma a;

    static {
        Class cls = Integer.TYPE;
        b = new aa0(cls, (Object) null, "camerax.core.imageCapture.captureMode");
        c = new aa0(cls, (Object) null, "camerax.core.imageCapture.flashMode");
        Class<Integer> cls2 = Integer.class;
        X = new aa0(cls2, (Object) null, "camerax.core.imageCapture.bufferFormat");
        Y = new aa0(cls2, (Object) null, "camerax.core.imageCapture.outputFormat");
        t0 = new aa0(cls, (Object) null, "camerax.core.imageCapture.flashType");
        u0 = new aa0(cls, (Object) null, "camerax.core.imageCapture.jpegCompressionQuality");
    }

    public gu6(wma wma) {
        this.a = wma;
    }

    public final ce3 getConfig() {
        return this.a;
    }

    public final int getInputFormat() {
        return ((Integer) h(tu6.z)).intValue();
    }
}
