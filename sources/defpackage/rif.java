package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* renamed from: rif  reason: default package */
public final class rif implements tj3 {
    public final see a;
    public final SurfaceTexture b;
    public final Surface c;
    public final /* synthetic */ sif d;

    public rif(sif sif, see see, SurfaceTexture surfaceTexture, Surface surface) {
        this.d = sif;
        this.a = see;
        this.b = surfaceTexture;
        this.c = surface;
    }

    public final void accept(Object obj) {
        sif sif = this.d;
        String str = sif.a;
        int i = ((bc0) obj).a;
        hm9.m(str, "onSurfaceRequestResult event=" + (i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? zr6.h(i, "SerufaceRequest.Result_UNKNOWN_code_") : "WILL_NOT_PROVIDE_SURFACE" : "SURFACE_ALREADY_PROVIDED" : "INVALID_SURFACE" : "REQUEST_CANCELLED" : "SURFACE_USED_SUCCESSFULLY"), new Object[0]);
        sif.e();
        see see = this.a;
        synchronized (see.a) {
            see.n = null;
            see.o = null;
        }
        SurfaceTexture surfaceTexture = this.b;
        surfaceTexture.setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener) null);
        surfaceTexture.release();
        this.c.release();
        sif.w0--;
        sif.f();
    }
}
