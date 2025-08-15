package defpackage;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: hre  reason: default package */
public final class hre extends pu9 {
    public TextureView e;
    public SurfaceTexture f;
    public oq1 g;
    public see h;
    public boolean i;
    public SurfaceTexture j;
    public AtomicReference k;
    public u00 l;

    public final View f() {
        return this.e;
    }

    public final Bitmap g() {
        TextureView textureView = this.e;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.e.getBitmap();
    }

    public final void j() {
        SurfaceTexture surfaceTexture;
        if (this.i && this.j != null && this.e.getSurfaceTexture() != (surfaceTexture = this.j)) {
            this.e.setSurfaceTexture(surfaceTexture);
            this.j = null;
            this.i = false;
        }
    }

    public final void k() {
        this.i = true;
    }

    public final void l(see see, u00 u00) {
        this.b = see.b;
        this.l = u00;
        FrameLayout frameLayout = (FrameLayout) this.c;
        frameLayout.getClass();
        ((Size) this.b).getClass();
        TextureView textureView = new TextureView(frameLayout.getContext());
        this.e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(((Size) this.b).getWidth(), ((Size) this.b).getHeight()));
        this.e.setSurfaceTextureListener(new gre(this));
        frameLayout.removeAllViews();
        frameLayout.addView(this.e);
        see see2 = this.h;
        if (see2 != null) {
            see2.d();
        }
        this.h = see;
        Executor a = ot3.a(this.e.getContext());
        see.k.a(new fre(this, 0, see), a);
        p();
    }

    public final bm7 o() {
        return f8.g(new bqc(29, this));
    }

    public final void p() {
        SurfaceTexture surfaceTexture;
        Size size = (Size) this.b;
        if (size != null && (surfaceTexture = this.f) != null && this.h != null) {
            surfaceTexture.setDefaultBufferSize(size.getWidth(), ((Size) this.b).getHeight());
            Surface surface = new Surface(this.f);
            see see = this.h;
            oq1 g2 = f8.g(new ypc(this, 11, surface));
            this.g = g2;
            g2.b.d(new yg3((Object) this, (Object) surface, (Object) g2, (Object) see, 16), ot3.a(this.e.getContext()));
            this.a = true;
            m();
        }
    }
}
