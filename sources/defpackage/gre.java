package defpackage;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import java.util.Objects;

/* renamed from: gre  reason: default package */
public final class gre implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ hre a;

    public gre(hre hre) {
        this.a = hre;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        hre hre = this.a;
        hre.f = surfaceTexture;
        if (hre.g != null) {
            hre.h.getClass();
            Objects.toString(hre.h);
            hre.h.l.a();
            return;
        }
        hre.p();
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        hre hre = this.a;
        hre.f = null;
        oq1 oq1 = hre.g;
        if (oq1 == null) {
            return true;
        }
        kq0.a(oq1, new b9b(this, surfaceTexture, false, 9), ot3.a(hre.e.getContext()));
        hre.j = surfaceTexture;
        return false;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        lq1 lq1 = (lq1) this.a.k.getAndSet((Object) null);
        if (lq1 != null) {
            lq1.b((Object) null);
        }
    }
}
