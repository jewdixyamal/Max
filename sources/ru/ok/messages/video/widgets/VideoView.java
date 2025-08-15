package ru.ok.messages.video.widgets;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;

public class VideoView extends FrameLayout implements TextureView.SurfaceTextureListener {
    public qme a;
    public Surface b;
    public SurfaceTexture c;
    public slf o;
    public int s0;
    public int t0;
    public int u0;
    public int v0;

    public VideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [qme, android.view.TextureView] */
    public final void a(slf slf) {
        this.o = slf;
        this.v0 = slf.j();
        d();
        if (this.a == null) {
            ? textureView = new TextureView(getContext());
            this.a = textureView;
            textureView.setSurfaceTextureListener(this);
            addView(this.a, 0);
        }
    }

    public final void b() {
        this.o = null;
        this.v0 = 0;
        this.s0 = 0;
        this.t0 = 0;
        this.u0 = 0;
        qme qme = this.a;
        if (qme != null) {
            qme.setListener((pme) null);
            this.a.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
            removeView(this.a);
            this.a = null;
        }
        Surface surface = this.b;
        if (surface != null) {
            surface.release();
            this.b = null;
        }
        SurfaceTexture surfaceTexture = this.c;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.c = null;
        }
    }

    public final void c(int i, int i2, int i3, boolean z) {
        if (!z) {
            this.s0 = i;
            this.t0 = i2;
            this.u0 = i3;
            requestLayout();
        } else if (i > 0 && i2 > 0 && getMeasuredWidth() > 0 && getMeasuredHeight() > 0 && this.v0 != 0) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            jt jtVar = new jt(measuredWidth, measuredHeight, 8);
            jt jtVar2 = new jt(i, i2, 8);
            Matrix matrix = new Matrix();
            matrix.postConcat(np8.y(jtVar2, jtVar, this.v0));
            float f = ((float) measuredWidth) / 2.0f;
            float f2 = ((float) measuredHeight) / 2.0f;
            matrix.postRotate((float) i3, f, f2);
            if (i3 == 90 || i3 == 270) {
                float measuredHeight2 = ((float) getMeasuredHeight()) / ((float) getMeasuredWidth());
                matrix.postScale(1.0f / measuredHeight2, measuredHeight2, f, f2);
            }
            qme qme = this.a;
            if (qme != null) {
                qme.setTransform(matrix);
            }
            this.s0 = i;
            this.t0 = i2;
            this.u0 = i3;
        }
        qme qme2 = this.a;
        if (qme2 != null) {
            qme2.setVisibility((this.s0 <= 0 || this.t0 <= 0) ? 4 : 0);
        }
    }

    public final void d() {
        slf slf = this.o;
        int R = slf == null ? 0 : slf.R();
        slf slf2 = this.o;
        int M0 = slf2 == null ? 0 : slf2.M0();
        slf slf3 = this.o;
        c(R, M0, slf3 == null ? 0 : slf3.i1(), false);
    }

    public BitmapDrawable getVideoScreenShot() {
        qme qme = this.a;
        if (qme == null || this.u0 != 0 || !qme.isAvailable() || !this.a.isShown() || this.s0 <= 0 || this.t0 <= 0) {
            return null;
        }
        int width = this.a.getWidth();
        int height = this.a.getHeight();
        if (width <= 0 || height <= 0) {
            return null;
        }
        float f = (float) width;
        float f2 = 1.0f;
        float f3 = f > 640.0f ? 640.0f / f : 1.0f;
        float f4 = (float) height;
        if (f4 > 480.0f) {
            f2 = 480.0f / f4;
        }
        int min = (int) Math.min(f3, f2);
        Bitmap bitmap = this.a.getBitmap(width * min, height * min);
        if (bitmap == null) {
            return null;
        }
        return new BitmapDrawable(getResources(), bitmap);
    }

    public final void onMeasure(int i, int i2) {
        if (this.s0 <= 0 || this.t0 <= 0) {
            super.onMeasure(i, i2);
            return;
        }
        int[] G = j47.G(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2), this.s0, this.t0);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(G[0], 1073741824), View.MeasureSpec.makeMeasureSpec(G[1], 1073741824));
        c(this.s0, this.t0, this.u0, true);
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface = this.b;
        if (surface != null) {
            surface.release();
            this.b = null;
        }
        SurfaceTexture surfaceTexture2 = this.c;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
            this.c = null;
        }
        this.c = surfaceTexture;
        this.b = new Surface(surfaceTexture);
        d();
        slf slf = this.o;
        if (slf != null) {
            slf.G(this.b);
            this.a.setListener(new gte(this, surfaceTexture));
        }
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        d();
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
