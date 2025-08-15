package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* renamed from: us4  reason: default package */
public final /* synthetic */ class us4 implements tj3 {
    public final /* synthetic */ vs4 a;
    public final /* synthetic */ SurfaceTexture b;
    public final /* synthetic */ Surface c;

    public /* synthetic */ us4(vs4 vs4, SurfaceTexture surfaceTexture, Surface surface) {
        this.a = vs4;
        this.b = surfaceTexture;
        this.c = surface;
    }

    public final void accept(Object obj) {
        bc0 bc0 = (bc0) obj;
        vs4 vs4 = this.a;
        vs4.getClass();
        SurfaceTexture surfaceTexture = this.b;
        surfaceTexture.setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener) null);
        surfaceTexture.release();
        this.c.release();
        vs4.X--;
        vs4.d();
    }
}
