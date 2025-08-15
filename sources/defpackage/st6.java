package defpackage;

/* renamed from: st6  reason: default package */
public final class st6 implements o9f, ev6, ose {
    public static final aa0 X = new aa0(ot6.class, (Object) null, "camerax.core.imageAnalysis.outputImageFormat");
    public static final aa0 Y;
    public static final aa0 Z;
    public static final aa0 b = new aa0(lt6.class, (Object) null, "camerax.core.imageAnalysis.backpressureStrategy");
    public static final aa0 c = new aa0(Integer.TYPE, (Object) null, "camerax.core.imageAnalysis.imageQueueDepth");
    public static final aa0 o = new aa0(rv6.class, (Object) null, "camerax.core.imageAnalysis.imageReaderProxyProvider");
    public final wma a;

    static {
        Class<Boolean> cls = Boolean.class;
        Y = new aa0(cls, (Object) null, "camerax.core.imageAnalysis.onePixelShiftEnabled");
        Z = new aa0(cls, (Object) null, "camerax.core.imageAnalysis.outputImageRotationEnabled");
    }

    public st6(wma wma) {
        this.a = wma;
    }

    public final ce3 getConfig() {
        return this.a;
    }

    public final int getInputFormat() {
        return 35;
    }
}
