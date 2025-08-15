package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RecordingCanvas;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: amf  reason: default package */
public final class amf extends FrameLayout implements TextureView.SurfaceTextureListener {
    public static final /* synthetic */ bc7[] A0;
    public final String a = amf.class.getName();
    public ylf b;
    public Surface c;
    public SurfaceTexture o;
    public tlf s0;
    public int t0;
    public int u0;
    public int v0;
    public final int[] w0 = new int[2];
    public final zlf x0 = new zlf(this, 0);
    public final zlf y0 = new zlf(this, 1);
    public final Path z0 = new Path();

    static {
        Class<amf> cls = amf.class;
        A0 = new bc7[]{new oi9(cls, "videoShape", "getVideoShape()Lone/me/sdk/media/player/view/VideoView$VideoShape;"), rh4.g(nec.a, cls, "videoContentMode", "getVideoContentMode()Lone/me/sdk/media/player/view/VideoView$VideoContentMode;")};
    }

    public amf(Context context) {
        super(context);
    }

    public final void a(tlf tlf) {
        String str = this.a;
        ir6 ir6 = hm9.m;
        boolean z = false;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, str, ey8.j("Video view. Bind listener and create surface, has listener:", tlf != null), (Throwable) null);
        }
        this.s0 = tlf;
        this.v0 = tlf != null ? tlf.j() : 0;
        d();
        if (this.b != null) {
            String str2 = this.a;
            ir6 ir62 = hm9.m;
            if (ir62 != null && ir62.c()) {
                us7 us7 = us7.X;
                if (this.c != null) {
                    z = true;
                }
                ir62.d(us7, str2, ey8.j("Video view. Already has texture, has surface:", z), (Throwable) null);
            }
            Surface surface = this.c;
            if (surface != null && tlf != null) {
                tlf.G(surface);
                return;
            }
            return;
        }
        ylf ylf = new ylf(this, getContext());
        ylf.setSurfaceTextureListener(this);
        addView(ylf, 0);
        this.b = ylf;
    }

    public final void b() {
        this.s0 = null;
        this.v0 = 0;
        this.t0 = 0;
        this.u0 = 0;
        ylf ylf = this.b;
        if (ylf != null) {
            ylf.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
            removeView(ylf);
            this.b = null;
        }
        Surface surface = this.c;
        if (surface != null) {
            surface.release();
        }
        this.c = null;
        SurfaceTexture surfaceTexture = this.o;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.o = null;
    }

    public final void c(int i, int i2, boolean z) {
        int i3 = 0;
        if (z) {
            int i4 = this.v0;
            boolean z2 = true;
            boolean z3 = i > 0 && i2 > 0;
            if (getMeasuredWidth() <= 0 || getMeasuredHeight() <= 0) {
                z2 = false;
            }
            if (z3 && z2 && i4 != 0) {
                jt jtVar = new jt(getMeasuredWidth(), getMeasuredHeight(), 8);
                jt jtVar2 = new jt(i, i2, 8);
                Matrix matrix = new Matrix();
                matrix.postConcat(np8.y(jtVar2, jtVar, i4));
                ylf ylf = this.b;
                if (ylf != null) {
                    ylf.setTransform(matrix);
                }
                this.t0 = i;
                this.u0 = i2;
            }
        } else {
            this.t0 = i;
            this.u0 = i2;
            requestLayout();
        }
        ylf ylf2 = this.b;
        if (ylf2 != null) {
            if (this.t0 <= 0 || this.u0 <= 0) {
                i3 = 4;
            }
            ylf2.setVisibility(i3);
        }
    }

    public final void d() {
        tlf tlf = this.s0;
        int R = tlf != null ? tlf.R() : 0;
        tlf tlf2 = this.s0;
        c(R, tlf2 != null ? tlf2.M0() : 0, false);
    }

    public final void dispatchDraw(Canvas canvas) {
        Path path = this.z0;
        if (!path.isEmpty()) {
            int save = canvas.save();
            canvas.clipPath(path);
            try {
                super.dispatchDraw(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        } else {
            super.dispatchDraw(canvas);
        }
    }

    public final boolean drawChild(Canvas canvas, View view, long j) {
        return ((canvas instanceof RecordingCanvas) || canvas.getClass().equals(Canvas.class)) && super.drawChild(canvas, view, j);
    }

    public final ulf getVideoContentMode() {
        bc7 bc7 = A0[1];
        return (ulf) this.y0.b;
    }

    public final xlf getVideoShape() {
        bc7 bc7 = A0[0];
        return (xlf) this.x0.b;
    }

    public final void onMeasure(int i, int i2) {
        int[] iArr;
        if (this.t0 <= 0 || this.u0 <= 0) {
            super.onMeasure(i, i2);
        } else {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            int ordinal = getVideoContentMode().ordinal();
            if (ordinal == 0) {
                int i3 = this.t0;
                int i4 = this.u0;
                int[] iArr2 = this.w0;
                hm9.z(size, size2, i3, i4, iArr2);
                iArr = iArr2;
            } else if (ordinal == 1) {
                iArr = this.w0;
                iArr[0] = size;
                iArr[1] = size2;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iArr[0], 1073741824), View.MeasureSpec.makeMeasureSpec(iArr[1], 1073741824));
            c(this.t0, this.u0, true);
        }
        xlf videoShape = getVideoShape();
        if (videoShape != null && getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            this.z0.reset();
            if (videoShape instanceof vlf) {
                if (measuredWidth == measuredHeight) {
                    float f = ((float) measuredWidth) / 2.0f;
                    this.z0.addCircle(f, ((float) measuredHeight) / 2.0f, f, Path.Direction.CW);
                    return;
                }
                String str = this.a;
                ir6 ir6 = hm9.m;
                if (ir6 != null && ir6.c()) {
                    ir6.d(us7.Z, str, rh4.h("VideoShape.AsCircle requires square dimensions but got width=", measuredWidth, measuredHeight, ", height="), (Throwable) null);
                }
            } else if (videoShape instanceof wlf) {
                this.z0.addRoundRect(0.0f, 0.0f, (float) measuredWidth, (float) measuredHeight, ((wlf) videoShape).a, Path.Direction.CW);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        String str = this.a;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            boolean z = this.s0 != null;
            ir6.d(us7, str, "Video view. Surface available " + surfaceTexture + ", has listener:" + z, (Throwable) null);
        }
        Surface surface = this.c;
        if (surface != null) {
            surface.release();
        }
        this.c = null;
        SurfaceTexture surfaceTexture2 = this.o;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
        }
        this.o = surfaceTexture;
        this.c = new Surface(surfaceTexture);
        d();
        tlf tlf = this.s0;
        if (tlf != null) {
            tlf.G(this.c);
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

    public final void setVideoContentMode(ulf ulf) {
        this.y0.o1(this, A0[1], ulf);
    }

    public final void setVideoShape(xlf xlf) {
        this.x0.o1(this, A0[0], xlf);
    }
}
