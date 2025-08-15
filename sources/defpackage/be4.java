package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* renamed from: be4  reason: default package */
public final /* synthetic */ class be4 implements tj3 {
    public final /* synthetic */ ce4 a;
    public final /* synthetic */ see b;
    public final /* synthetic */ SurfaceTexture c;
    public final /* synthetic */ Surface d;

    public /* synthetic */ be4(ce4 ce4, see see, SurfaceTexture surfaceTexture, Surface surface) {
        this.a = ce4;
        this.b = see;
        this.c = surfaceTexture;
        this.d = surface;
    }

    public final void accept(Object obj) {
        bc0 bc0 = (bc0) obj;
        ce4 ce4 = this.a;
        ce4.getClass();
        see see = this.b;
        synchronized (see.a) {
            see.n = null;
            see.o = null;
        }
        SurfaceTexture surfaceTexture = this.c;
        surfaceTexture.setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener) null);
        surfaceTexture.release();
        this.d.release();
        ce4.t0--;
        ce4.d();
    }
}
