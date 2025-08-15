package androidx.media3.exoplayer.hls;

import java.util.List;

public final class HlsMediaSource$Factory implements wj8 {
    public final w4d a;
    public final cb4 b;
    public final hx9 c = new Object();
    public final av1 d = hb4.B0;
    public final oq9 e;
    public final pl8 f = new pl8();
    public final huc g;
    public final boolean h;
    public final int i;
    public final long j;

    /* JADX WARNING: type inference failed for: r4v2, types: [hx9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v1, types: [huc, java.lang.Object] */
    public HlsMediaSource$Factory(q24 q24) {
        this.a = new w4d(12, (Object) q24);
        cb4 cb4 = am6.a;
        this.b = cb4;
        this.g = new Object();
        this.e = new oq9(9);
        this.i = 1;
        this.j = -9223372036854775807L;
        this.h = true;
        cb4.c = true;
    }

    public final wj8 a() {
        fm9.i((Object) null, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        throw null;
    }

    public final void b(boolean z) {
        this.b.c = z;
    }

    public final wj8 c() {
        fm9.i((Object) null, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        throw null;
    }

    public final void d(b46 b46) {
        cb4 cb4 = this.b;
        b46.getClass();
        cb4.b = b46;
    }

    /* renamed from: f */
    public final sm6 e(tb8 tb8) {
        tb8.b.getClass();
        en6 en6 = this.c;
        List list = tb8.b.e;
        if (!list.isEmpty()) {
            en6 = new y7g((Object) en6, 17, (Object) list);
        }
        cb4 cb4 = this.b;
        tr4 x = this.f.x(tb8);
        huc huc = this.g;
        this.d.getClass();
        hb4 hb4 = new hb4(this.a, huc, en6);
        return new sm6(tb8, this.a, cb4, this.e, x, huc, hb4, this.j, this.h, this.i);
    }
}
