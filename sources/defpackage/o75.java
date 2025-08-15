package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* renamed from: o75  reason: default package */
public final class o75 implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final /* synthetic */ u75 a;

    public o75(u75 u75) {
        this.a = u75;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        u75 u75 = this.a;
        u75.getClass();
        Surface surface = new Surface(surfaceTexture);
        u75.p2(surface);
        u75.c1 = surface;
        u75.k2(i, i2);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        u75 u75 = this.a;
        u75.p2((Object) null);
        u75.k2(0, 0);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.a.k2(i, i2);
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.a.k2(i2, i3);
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.a.getClass();
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        u75 u75 = this.a;
        u75.getClass();
        u75.k2(0, 0);
    }
}
