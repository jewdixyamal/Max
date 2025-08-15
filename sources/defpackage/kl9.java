package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import ru.ok.messages.video.widgets.VideoPlayerSeekBar;
import ru.ok.messages.video.widgets.VideoView;
import ru.ok.messages.views.widgets.VideoThumbnailView;
import ru.ok.utils.widgets.RoundedRectFrameLayout;

/* renamed from: kl9  reason: default package */
public final class kl9 extends v2 implements pl9, nse {
    public final float[] X;
    public VideoView Y;
    public ImageButton Z;
    public final tg o;
    public ImageButton s0;
    public ImageView t0;
    public ImageButton u0;
    public ImageButton v0;
    public ImageButton w0;
    public VideoPlayerSeekBar x0;
    public VideoThumbnailView y0;
    public LayerDrawable z0;

    public kl9(Context context, tg tgVar, float[] fArr) {
        super(context);
        this.o = tgVar;
        this.X = fArr;
        l((ViewGroup) null, yyb.view_small_video_player);
    }

    public static StateListDrawable A(sme sme) {
        int i = sme.r;
        return hm9.g0(hm9.S(Integer.valueOf(i), (Integer) null, (Integer) null), hm9.S(Integer.valueOf(ote.b0(i, 0.8f)), (Integer) null, (Integer) null), (GradientDrawable) null);
    }

    public static void B(View view, boolean z) {
        if (z) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    public final void a(int i, int i2) {
        this.Y.d();
        VideoThumbnailView videoThumbnailView = this.y0;
        videoThumbnailView.z0 = i;
        videoThumbnailView.A0 = i2;
        videoThumbnailView.requestLayout();
    }

    public final void b(slf slf) {
        this.Y.a(slf);
    }

    public final void c() {
        khe khe = sme.a0;
        sme R = fm9.R((Context) this.b);
        ngg.G(this.z0.findDrawableByLayerId(16908288), R.r);
        Drawable findDrawableByLayerId = this.z0.findDrawableByLayerId(16908301);
        int i = R.t;
        ngg.G(findDrawableByLayerId, i);
        ngg.G(this.z0.findDrawableByLayerId(16908303), ote.b0(i, 0.3f));
        ImageButton imageButton = this.Z;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageButton.setColorFilter(i, mode);
        this.s0.setColorFilter(i, mode);
        this.u0.setColorFilter(i, mode);
        this.v0.setColorFilter(i, mode);
        this.w0.setColorFilter(i, mode);
        this.Z.setBackground(A(R));
        this.s0.setBackground(A(R));
        this.u0.setBackground(A(R));
        this.v0.setBackground(A(R));
        this.w0.setBackground(A(R));
    }

    public final void d(hkf hkf) {
        tg tgVar = this.o;
        if (tgVar.p()) {
            e2f e2f = new e2f();
            e2f.R(new gqf());
            e2f.I(tgVar.a.b());
            e2f.p(xxb.view_small_video_player__v_video);
            e2f.p(xxb.view_small_video_player__iv_thumbnail);
            c2f.a((ViewGroup) ((View) this.c), e2f);
        }
        boolean z = hkf.a;
        boolean z2 = hkf.c;
        if (z) {
            if (z2) {
                this.s0.setVisibility(8);
                this.Z.setVisibility(8);
            } else if (hkf.b) {
                B(this.s0, true);
                this.Z.setVisibility(8);
            } else {
                this.s0.setVisibility(8);
                B(this.Z, true);
            }
            B(this.v0, true);
            if (hkf.d) {
                B(this.w0, true);
                this.u0.setVisibility(8);
            } else {
                this.w0.setVisibility(8);
                B(this.u0, true);
            }
        } else {
            this.s0.setVisibility(8);
            this.Z.setVisibility(8);
            this.w0.setVisibility(8);
            this.u0.setVisibility(8);
            this.v0.setVisibility(8);
        }
        B(this.t0, z2);
        if (hkf.g) {
            this.x0.setVisibility(8);
        } else {
            B(this.x0, true);
            VideoPlayerSeekBar videoPlayerSeekBar = this.x0;
            videoPlayerSeekBar.setMax((int) hkf.j);
            videoPlayerSeekBar.setProgress((int) hkf.k);
            this.x0.setSecondaryProgress((int) hkf.l);
        }
        k20 k20 = hkf.o;
        Drawable drawable = hkf.p;
        if (drawable != null) {
            this.y0.n(k20, drawable);
            return;
        }
        Uri uri = hkf.q;
        if (uri != null) {
            this.y0.o(k20, uri);
        }
    }

    public final BitmapDrawable e() {
        return this.Y.getVideoScreenShot();
    }

    public final void m() {
        float[] fArr = this.X;
        if (fArr != null) {
            ((RoundedRectFrameLayout) ((View) this.c)).setCornersRadii(fArr);
        }
        this.Y = (VideoView) ((View) this.c).findViewById(xxb.view_small_video_player__v_video);
        this.Z = (ImageButton) ((View) this.c).findViewById(xxb.view_small_video_player__ib_play);
        this.s0 = (ImageButton) ((View) this.c).findViewById(xxb.view_small_video_player__ib_pause);
        ImageView imageView = (ImageView) ((View) this.c).findViewById(xxb.view_small_video_player__progress);
        this.t0 = imageView;
        imageView.setImageDrawable(new r20(((View) this.c).getContext(), 0));
        this.x0 = (VideoPlayerSeekBar) ((View) this.c).findViewById(xxb.view_small_video_player__sb_seek);
        LayerDrawable layerDrawable = (LayerDrawable) ((Context) this.b).getResources().getDrawable(gpc.R0);
        this.z0 = layerDrawable;
        this.x0.setProgressDrawable(layerDrawable);
        this.u0 = (ImageButton) ((View) this.c).findViewById(xxb.view_small_video_player__ib_pip);
        this.v0 = (ImageButton) ((View) this.c).findViewById(xxb.view_small_video_player__ib_full_screen);
        this.w0 = (ImageButton) ((View) this.c).findViewById(xxb.view_small_video_player__ib_close);
        this.y0 = (VideoThumbnailView) ((View) this.c).findViewById(xxb.view_small_video_player__iv_thumbnail);
        nd7.h(this.Y, new jl9(this, 0));
        nd7.h(this.Z, new jl9(this, 1));
        nd7.h(this.s0, new jl9(this, 2));
        nd7.h(this.u0, new jl9(this, 3));
        nd7.h(this.v0, new jl9(this, 4));
        nd7.h(this.w0, new jl9(this, 5));
        nd7.h(this.y0, new jl9(this, 6));
        this.Y.setOnLongClickListener(new zl0(7, this));
        c();
    }

    public final void release() {
        this.Y.b();
    }
}
