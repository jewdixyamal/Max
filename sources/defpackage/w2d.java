package defpackage;

import android.net.Uri;

/* renamed from: w2d  reason: default package */
public final class w2d extends ppc {
    public final /* synthetic */ t24 s0;
    public final /* synthetic */ a34 t0;
    public final /* synthetic */ a3d u0;

    public w2d(a3d a3d, ow0 ow0, a34 a34) {
        this.u0 = a3d;
        this.s0 = ow0;
        this.t0 = a34;
    }

    /* JADX INFO: finally extract failed */
    public final Object c() {
        zpa zpa = this.u0.b;
        t24 t24 = this.s0;
        u1e u1e = new u1e(t24);
        yn7.b.getAndIncrement();
        u1e.b = 0;
        w24 w24 = new w24((t24) u1e, this.t0);
        try {
            w24.m();
            Uri uri = t24.getUri();
            uri.getClass();
            Object a = zpa.a(uri, w24);
            oaf.h(w24);
            a.getClass();
            return (ok5) a;
        } catch (Throwable th) {
            oaf.h(w24);
            throw th;
        }
    }
}
