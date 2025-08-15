package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import ru.ok.messages.video.widgets.LiveVideoPlaceHolderView;
import ru.ok.messages.video.widgets.PinchToZoomVideoViewWrapper;
import ru.ok.messages.video.widgets.VideoPlayerSeekBar;
import ru.ok.messages.video.widgets.VideoPlayerSeekBarPreview;
import ru.ok.messages.video.widgets.VideoView;
import ru.ok.messages.video.widgets.doubleTap.DoubleTapVideoViewWrapper;
import ru.ok.messages.views.widgets.VideoThumbnailView;

/* renamed from: wk9  reason: default package */
public final class wk9 extends v2 implements pl9, nse, SeekBar.OnSeekBarChangeListener {
    public View A0;
    public View B0;
    public View C0;
    public LiveVideoPlaceHolderView D0;
    public hkf E0;
    public final ad X;
    public VideoView Y;
    public PinchToZoomVideoViewWrapper Z;
    public final tg o;
    public ImageButton s0;
    public ImageButton t0;
    public ImageView u0;
    public VideoPlayerSeekBarPreview v0;
    public VideoThumbnailView w0;
    public TextView x0;
    public TextView y0;
    public ImageButton z0;

    public wk9(Context context, View view, tg tgVar, ad adVar) {
        super(context);
        this.o = tgVar;
        this.X = adVar;
        this.c = view;
        m();
    }

    public static void B(View view, boolean z) {
        if (z) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    public final void A(Rect rect) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A0.getLayoutParams();
        marginLayoutParams.topMargin = rect.top;
        marginLayoutParams.bottomMargin = rect.bottom;
        this.A0.setLayoutParams(marginLayoutParams);
        View view = this.C0;
        view.setPadding(rect.left, view.getPaddingTop(), rect.right, this.C0.getPaddingBottom());
    }

    public final void a(int i, int i2) {
        this.Y.d();
        VideoThumbnailView videoThumbnailView = this.w0;
        videoThumbnailView.z0 = i;
        videoThumbnailView.A0 = i2;
        videoThumbnailView.requestLayout();
    }

    public final void b(slf slf) {
        this.Y.a(slf);
    }

    /* JADX WARNING: type inference failed for: r4v6, types: [glf, g06, android.graphics.drawable.Drawable] */
    public final void c() {
        khe khe = sme.a0;
        Context context = (Context) this.b;
        sme R = fm9.R(context);
        ImageButton imageButton = this.s0;
        int i = R.t;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageButton.setColorFilter(i, mode);
        this.t0.setColorFilter(R.t, mode);
        ImageButton imageButton2 = this.s0;
        int i2 = R.r;
        imageButton2.setBackground(hm9.g0(hm9.S(Integer.valueOf(i2), (Integer) null, (Integer) null), hm9.S(Integer.valueOf(ote.b0(i2, 0.8f)), (Integer) null, (Integer) null), (GradientDrawable) null));
        this.t0.setBackground(hm9.g0(hm9.S(Integer.valueOf(i2), (Integer) null, (Integer) null), hm9.S(Integer.valueOf(ote.b0(i2, 0.8f)), (Integer) null, (Integer) null), (GradientDrawable) null));
        TextView textView = this.y0;
        int i3 = R.w;
        textView.setTextColor(i3);
        this.x0.setTextColor(i3);
        ImageButton imageButton3 = this.z0;
        ? g06 = new g06(ngg.u(lpc.a, i3, context));
        g06.t0 = new RectF();
        g06.u0 = new Path();
        vl vlVar = vl.o;
        bk4 b = bk4.b();
        g06.X = b;
        Paint paint = new Paint();
        g06.Z = paint;
        paint.setColor(-16777216);
        paint.setTextSize(b.G);
        paint.setStrokeWidth((float) b.a);
        paint.setTypeface(glf.v0);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        g06.s0 = paint2;
        paint2.setColor(-1);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        imageButton3.setImageDrawable(g06);
        this.z0.setBackground(R.a());
        this.v0.c();
        this.B0.setBackgroundColor(R.m);
    }

    public final void d(hkf hkf) {
        Drawable drawable;
        this.E0 = hkf;
        tg tgVar = this.o;
        if (tgVar.p()) {
            e2f e2f = new e2f();
            e2f.R(new gqf());
            e2f.I(tgVar.a.b());
            e2f.p(xxb.view_full_screen_video_player__v_video);
            e2f.p(xxb.view_full_screen_video_player__iv_thumbnail);
            c2f.a((ViewGroup) ((View) this.c), e2f);
        }
        int i = 0;
        boolean z = hkf.a;
        boolean z2 = hkf.c;
        if (z) {
            B(this.A0, true);
            boolean z3 = hkf.i;
            boolean z4 = hkf.b;
            if (z2) {
                if (z4) {
                    B(this.t0, true);
                    this.s0.setVisibility(8);
                } else {
                    this.t0.setVisibility(8);
                    B(this.s0, !z3);
                }
                B(this.u0, true);
            } else {
                if (z4) {
                    B(this.t0, true);
                    this.s0.setVisibility(8);
                } else {
                    this.t0.setVisibility(8);
                    B(this.s0, !z3);
                }
                this.u0.setVisibility(8);
            }
            B(this.x0, true);
            String str = null;
            if (hkf.g) {
                this.v0.setVisibility(8);
                int i2 = gpc.y0;
                TextView textView = this.x0;
                Context context = (Context) this.b;
                if (i2 != -1) {
                    try {
                        drawable = kt3.b(context, i2);
                    } catch (Resources.NotFoundException unused) {
                        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                    }
                } else {
                    drawable = null;
                }
                pag.I(drawable, (Drawable) null, (Drawable) null, (Drawable) null, textView);
                this.x0.setText(jpc.p3);
                this.y0.setVisibility(8);
            } else {
                this.x0.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                B(this.v0, true);
                VideoPlayerSeekBar videoPlayerSeekBar = this.v0.b;
                long j = hkf.j;
                videoPlayerSeekBar.setMax((int) j);
                long j2 = hkf.k;
                videoPlayerSeekBar.setProgress((int) j2);
                this.v0.setSecondaryProgress(hkf.l);
                if (j >= 0) {
                    TextView textView2 = this.y0;
                    String[] strArr = are.b;
                    textView2.setText(tfg.c(j));
                    this.y0.setVisibility(0);
                } else {
                    this.y0.setVisibility(8);
                }
                B(this.y0, true);
                TextView textView3 = this.x0;
                String[] strArr2 = are.b;
                textView3.setText(tfg.c(j2));
                VideoPlayerSeekBarPreview videoPlayerSeekBarPreview = this.v0;
                int width = this.y0.getWidth();
                videoPlayerSeekBarPreview.C0 = -this.x0.getWidth();
                videoPlayerSeekBarPreview.D0 = width;
            }
            if (hkf.f) {
                B(this.z0, true);
                mqb mqb = hkf.m;
                if (mqb != null) {
                    str = mqb.a;
                }
                glf glf = (glf) this.z0.getDrawable();
                glf.Y = str;
                if (!oag.t(str)) {
                    int measureText = oag.t(glf.Y) ? 0 : (int) glf.Z.measureText(glf.Y);
                    RectF rectF = glf.t0;
                    int intrinsicWidth = glf.getIntrinsicWidth() - measureText;
                    bk4 bk4 = glf.X;
                    rectF.set((float) (intrinsicWidth - bk4.b), (((float) glf.getIntrinsicHeight()) - glf.Z.getTextSize()) - ((float) bk4.d), (float) glf.getIntrinsicWidth(), (float) (glf.getIntrinsicHeight() - bk4.b));
                    Path path = glf.u0;
                    path.reset();
                    float f = rectF.left;
                    float f2 = (float) bk4.b;
                    RectF rectF2 = new RectF(f - f2, rectF.top - f2, rectF.right + f2, rectF.bottom + f2);
                    float f3 = (float) bk4.b;
                    path.addRoundRect(rectF2, f3, f3, Path.Direction.CW);
                }
                glf.invalidateSelf();
                this.z0.requestLayout();
            } else {
                this.z0.setVisibility(8);
            }
        } else {
            this.A0.setVisibility(8);
            B(this.u0, z2);
            this.s0.setVisibility(8);
            this.t0.setVisibility(8);
            this.v0.setVisibility(8);
            this.y0.setVisibility(8);
            this.x0.setVisibility(8);
            this.z0.setVisibility(8);
        }
        k20 k20 = hkf.o;
        Drawable drawable2 = hkf.p;
        if (drawable2 != null) {
            this.w0.n(k20, drawable2);
        } else {
            Uri uri = hkf.q;
            if (uri != null) {
                this.w0.o(k20, uri);
            }
        }
        fef fef = hkf.n;
        if (fef != null) {
            this.v0.setVideoContent(fef);
        }
        VideoView videoView = this.Y;
        if (!hkf.s) {
            i = 4;
        }
        videoView.setVisibility(i);
        this.Z.setEnabled(hkf.t);
        if (hkf.h) {
            LiveVideoPlaceHolderView liveVideoPlaceHolderView = this.D0;
            liveVideoPlaceHolderView.L0 = k20;
            liveVideoPlaceHolderView.x();
            B(this.D0, true);
            return;
        }
        this.D0.setVisibility(8);
    }

    public final BitmapDrawable e() {
        return this.Y.getVideoScreenShot();
    }

    /* JADX WARNING: type inference failed for: r2v8, types: [java.lang.Object, qk9] */
    public final void m() {
        this.Y = (VideoView) ((View) this.c).findViewById(xxb.view_full_screen_video_player__v_video);
        this.Z = (PinchToZoomVideoViewWrapper) ((View) this.c).findViewById(xxb.view_full_screen_video_player__pinch_to_zoom_v_video_wrapper);
        this.s0 = (ImageButton) ((View) this.c).findViewById(xxb.view_full_screen_video_player__btn_play);
        this.t0 = (ImageButton) ((View) this.c).findViewById(xxb.view_full_screen_video_player__btn_pause);
        ImageView imageView = (ImageView) ((View) this.c).findViewById(xxb.view_full_screen_video_player__progress);
        this.u0 = imageView;
        imageView.setImageDrawable(new r20(((View) this.c).getContext(), 0));
        this.v0 = (VideoPlayerSeekBarPreview) ((View) this.c).findViewById(xxb.view_video_player_controls__sb_seek_preview);
        this.w0 = (VideoThumbnailView) ((View) this.c).findViewById(xxb.view_full_screen_video_player__iv_thumbnail);
        this.x0 = (TextView) ((View) this.c).findViewById(xxb.view_video_player_controls__tv_time);
        this.y0 = (TextView) ((View) this.c).findViewById(xxb.view_video_player_controls__tv_duration);
        this.z0 = (ImageButton) ((View) this.c).findViewById(xxb.view_video_player_controls__btn_settings);
        this.A0 = ((View) this.c).findViewById(xxb.view_full_screen_video_player__controls);
        this.B0 = ((View) this.c).findViewById(xxb.view_video_player_controls__v_background);
        this.C0 = ((View) this.c).findViewById(xxb.view_video_player_controls__cl_content);
        this.D0 = (LiveVideoPlaceHolderView) ((View) this.c).findViewById(xxb.view_full_screen_video_player__live_placeholder);
        ((ViewGroup) this.A0).setClipChildren(false);
        ((ViewGroup) this.C0).setClipChildren(false);
        nd7.h(this.s0, new vk9(this, 0));
        nd7.h(this.t0, new vk9(this, 1));
        nd7.h(this.z0, new vk9(this, 2));
        this.v0.a.add(this);
        c();
        tg tgVar = this.o;
        Context context = (Context) this.b;
        sk9 sk9 = new sk9(context, (DoubleTapVideoViewWrapper) ((View) this.c).findViewById(xxb.view_full_screen_video_player__double_tap_wrapper), tgVar);
        ? obj = new Object();
        obj.c = false;
        obj.a = 0;
        new oj9(sk9, new rk9((qk9) obj), context, this.X).u0 = this;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        n(new fj0(24));
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        n(new cy1(4, seekBar));
    }

    public final void release() {
        this.Y.b();
        PinchToZoomVideoViewWrapper pinchToZoomVideoViewWrapper = this.Z;
        pinchToZoomVideoViewWrapper.c = p0b.b;
        pinchToZoomVideoViewWrapper.s0 = 1.0f;
    }
}
