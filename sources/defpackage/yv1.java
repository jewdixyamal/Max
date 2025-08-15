package defpackage;

/* renamed from: yv1  reason: default package */
public interface yv1 extends t7c {
    public static final aa0 g = new aa0(r9f.class, (Object) null, "camerax.core.camera.useCaseConfigFactory");
    public static final aa0 h = new aa0(Integer.class, (Object) null, "camerax.core.camera.useCaseCombinationRequiredRule");
    public static final aa0 i = new aa0(rad.class, (Object) null, "camerax.core.camera.SessionProcessor");
    public static final aa0 j;
    public static final aa0 k;

    static {
        Class<Boolean> cls = Boolean.class;
        j = new aa0(cls, (Object) null, "camerax.core.camera.isPostviewSupported");
        k = new aa0(cls, (Object) null, "camerax.core.camera.isCaptureProcessProgressSupported");
    }

    void P() {
        au1.r(f(i, (Object) null));
    }
}
