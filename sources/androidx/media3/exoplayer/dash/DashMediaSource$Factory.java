package androidx.media3.exoplayer.dash;

import androidx.work.WorkRequest;
import java.util.List;

public final class DashMediaSource$Factory implements wj8 {
    public final jn a;
    public final q24 b;
    public final pl8 c = new pl8();
    public final oq9 d = new oq9(9);
    public final huc e = new Object();
    public final long f = WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
    public final long g = 5000000;

    /* JADX WARNING: type inference failed for: r4v2, types: [huc, java.lang.Object] */
    public DashMediaSource$Factory(q24 q24) {
        jn jnVar = new jn(q24);
        this.a = jnVar;
        this.b = q24;
        ((cb4) jnVar.o).c = true;
    }

    public final wj8 a() {
        fm9.i((Object) null, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        throw null;
    }

    public final void b(boolean z) {
        ((cb4) this.a.o).c = z;
    }

    public final wj8 c() {
        fm9.i((Object) null, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        throw null;
    }

    public final void d(b46 b46) {
        b46.getClass();
        cb4 cb4 = (cb4) this.a.o;
        cb4.getClass();
        cb4.b = b46;
    }

    /* renamed from: f */
    public final y14 e(tb8 tb8) {
        tb8.b.getClass();
        zpa m14 = new m14();
        List list = tb8.b.e;
        return new y14(tb8, this.b, !list.isEmpty() ? new qz7((Object) m14, 19, (Object) list) : m14, this.a, this.d, this.c.x(tb8), this.e, this.f, this.g);
    }
}
