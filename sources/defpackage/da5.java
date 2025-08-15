package defpackage;

import android.graphics.SurfaceTexture;

/* renamed from: da5  reason: default package */
public final /* synthetic */ class da5 implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ fa5 a;
    public final /* synthetic */ nx0 b;

    public /* synthetic */ da5(fa5 fa5, nx0 nx0) {
        this.a = fa5;
        this.b = nx0;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        fa5 fa5 = this.a;
        fa5.getClass();
        this.b.v(new ca5(fa5, 4));
    }
}
