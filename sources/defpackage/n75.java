package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* renamed from: n75  reason: default package */
public final class n75 implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final /* synthetic */ t75 a;

    public n75(t75 t75) {
        this.a = t75;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        t75 t75 = this.a;
        t75.getClass();
        Surface surface = new Surface(surfaceTexture);
        t75.m2(surface);
        t75.Y0 = surface;
        t75.i2(i, i2);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        t75 t75 = this.a;
        t75.m2((Surface) null);
        t75.i2(0, 0);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.a.i2(i, i2);
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.a.i2(i2, i3);
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.a.getClass();
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        t75 t75 = this.a;
        t75.getClass();
        t75.i2(0, 0);
    }
}
