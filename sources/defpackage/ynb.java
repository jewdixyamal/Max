package defpackage;

/* renamed from: ynb  reason: default package */
public final class ynb implements wj8 {
    public final q24 a;
    public final yt8 b;
    public final pl8 c;
    public final huc d;
    public final int e = 1048576;

    /* JADX WARNING: type inference failed for: r1v1, types: [huc, java.lang.Object] */
    public ynb(q24 q24, va4 va4) {
        yt8 yt8 = new yt8(24, (Object) va4);
        pl8 pl8 = new pl8();
        ? obj = new Object();
        this.a = q24;
        this.b = yt8;
        this.c = pl8;
        this.d = obj;
    }

    public final wj8 a() {
        fm9.i((Object) null, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        throw null;
    }

    public final wj8 c() {
        fm9.i((Object) null, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        throw null;
    }

    public final ej0 e(tb8 tb8) {
        tb8.b.getClass();
        return new aob(tb8, this.a, this.b, this.c.x(tb8), this.d, this.e);
    }
}
