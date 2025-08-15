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

/* renamed from: mk9  reason: default package */
public final class mk9 extends v2 implements pl9, nse {
    public final float[] X;
    public VideoView Y;
    public VideoPlayerSeekBar Z;
    public final tg o;
    public VideoThumbnailView s0;
    public ImageButton t0;
    public ImageView u0;
    public LayerDrawable v0;

    public mk9(Context context, tg tgVar, float[] fArr) {
        super(context);
        this.o = tgVar;
        this.X = fArr;
        l((ViewGroup) null, yyb.view_auto_play_video_player);
    }

    public static void A(View view, boolean z) {
        if (z) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    public final void a(int i, int i2) {
        this.Y.d();
        VideoThumbnailView videoThumbnailView = this.s0;
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
        ngg.G(this.v0.findDrawableByLayerId(16908288), R.r);
        Drawable findDrawableByLayerId = this.v0.findDrawableByLayerId(16908301);
        int i = R.t;
        ngg.G(findDrawableByLayerId, i);
        ngg.G(this.v0.findDrawableByLayerId(16908303), ote.b0(i, 0.3f));
        this.t0.setColorFilter(i, PorterDuff.Mode.SRC_IN);
        ImageButton imageButton = this.t0;
        int i2 = R.r;
        imageButton.setBackground(hm9.g0(hm9.S(Integer.valueOf(i2), (Integer) null, (Integer) null), hm9.S(Integer.valueOf(ote.b0(i2, 0.8f)), (Integer) null, (Integer) null), (GradientDrawable) null));
    }

    public final void d(hkf hkf) {
        tg tgVar = this.o;
        if (tgVar.p()) {
            e2f e2f = new e2f();
            e2f.R(new gqf());
            e2f.I(tgVar.a.b());
            e2f.p(xxb.view_auto_play_video_player__v_video);
            e2f.p(xxb.view_auto_play_video_player__iv_thumbnail);
            c2f.a((ViewGroup) ((View) this.c), e2f);
        }
        A(this.u0, hkf.c);
        if (hkf.g) {
            this.Z.setVisibility(8);
        } else {
            A(this.Z, true);
            VideoPlayerSeekBar videoPlayerSeekBar = this.Z;
            videoPlayerSeekBar.setMax((int) hkf.j);
            videoPlayerSeekBar.setProgress((int) hkf.k);
            this.Z.setSecondaryProgress((int) hkf.l);
        }
        VideoPlayerSeekBar videoPlayerSeekBar2 = this.Z;
        boolean z = hkf.b;
        A(videoPlayerSeekBar2, z);
        if (hkf.r) {
            this.t0.setVisibility(8);
        } else {
            this.t0.setSelected(hkf.e);
            A(this.t0, z);
        }
        k20 k20 = hkf.o;
        Drawable drawable = hkf.p;
        if (drawable != null) {
            this.s0.n(k20, drawable);
            return;
        }
        Uri uri = hkf.q;
        if (uri != null) {
            this.s0.o(k20, uri);
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
        this.Y = (VideoView) ((View) this.c).findViewById(xxb.view_auto_play_video_player__v_video);
        this.Z = (VideoPlayerSeekBar) ((View) this.c).findViewById(xxb.view_auto_play_video_player__sb_seek);
        this.v0 = (LayerDrawable) ((Context) this.b).getResources().getDrawable(gpc.R0);
        this.s0 = (VideoThumbnailView) ((View) this.c).findViewById(xxb.view_auto_play_video_player__iv_thumbnail);
        ImageButton imageButton = (ImageButton) ((View) this.c).findViewById(xxb.view_auto_play_video_player__ib_sound);
        this.t0 = imageButton;
        Drawable drawable = ((View) this.c).getResources().getDrawable(gpc.i0);
        Drawable drawable2 = ((View) this.c).getResources().getDrawable(gpc.k0);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842913}, drawable2);
        stateListDrawable.addState(new int[0], drawable);
        imageButton.setImageDrawable(stateListDrawable);
        ImageView imageView = (ImageView) ((View) this.c).findViewById(xxb.view_auto_play_video_player__progress);
        this.u0 = imageView;
        imageView.setImageDrawable(new r20(((View) this.c).getContext(), 0));
        nd7.h(this.Y, new lk9(this, 0));
        nd7.h(this.s0, new lk9(this, 1));
        nd7.h(this.t0, new lk9(this, 2));
        this.Y.setOnLongClickListener(new zl0(5, this));
        c();
    }

    public final void release() {
        this.Y.b();
    }
}
