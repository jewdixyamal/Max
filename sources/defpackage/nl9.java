package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.a;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import ru.ok.messages.media.trim.ActTrimVideo;
import ru.ok.messages.media.trim.FrgTrimVideo;
import ru.ok.messages.media.trim.rangeSeekBar.RangeSeekBarView;
import ru.ok.messages.video.widgets.VideoView;

/* renamed from: nl9  reason: default package */
public final class nl9 extends v2 implements nse, u3a, kk9 {
    public TextView A0;
    public AppCompatImageButton B0;
    public AppCompatImageButton C0;
    public ProgressBar D0;
    public sme E0;
    public final y7g X;
    public final FrgTrimVideo Y;
    public final tg Z;
    public final FrgTrimVideo o;
    public ai3 s0;
    public VideoView t0;
    public ImageButton u0;
    public ImageButton v0;
    public TextView w0;
    public TextView x0;
    public RangeSeekBarView y0;
    public ViewGroup z0;

    public nl9(Context context, ViewGroup viewGroup, FrgTrimVideo frgTrimVideo, y7g y7g, FrgTrimVideo frgTrimVideo2, tg tgVar) {
        super(context);
        this.o = frgTrimVideo;
        this.X = y7g;
        this.Y = frgTrimVideo2;
        this.Z = tgVar;
        l(viewGroup, yyb.cl_trim_video);
    }

    public final void A(long j, long j2, long j3, long j4) {
        RangeSeekBarView rangeSeekBarView = this.y0;
        rangeSeekBarView.E0 = j4;
        rangeSeekBarView.I0 = this.o;
        float f = (float) j4;
        rangeSeekBarView.D0 = ((float) j) / f;
        rangeSeekBarView.B0 = ((float) j2) / f;
        rangeSeekBarView.C0 = ((float) j3) / f;
        rangeSeekBarView.z0 = 1000.0f / f;
        rangeSeekBarView.A0 = 1.0f;
        rangeSeekBarView.F0 = true;
        RangeSeekBarView.R0 = 1.0f;
        RangeSeekBarView.S0 = 1.0f;
        rangeSeekBarView.invalidate();
        TextView textView = this.w0;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        textView.setText(ay7.l(timeUnit.toSeconds(j2)));
        this.x0.setText(ay7.l(timeUnit.toSeconds(j3)));
    }

    public final void B(boolean z) {
        if (z) {
            this.A0.setAlpha(1.0f);
            this.A0.setBackground(this.E0.a());
            return;
        }
        this.A0.setAlpha(0.3f);
        this.A0.setBackground((Drawable) null);
    }

    public final void C(boolean z, boolean z2) {
        tg tgVar = this.Z;
        if (z) {
            tgVar.i((Toolbar) this.s0.b);
            tgVar.i(this.z0);
        } else {
            tgVar.g((Toolbar) this.s0.b);
            tgVar.g(this.z0);
        }
        FrgTrimVideo frgTrimVideo = this.Y;
        if (z) {
            if (frgTrimVideo.b0() != null) {
                ((ActTrimVideo) frgTrimVideo.b0()).g0((View.OnSystemUiVisibilityChangeListener) null);
            }
        } else if (frgTrimVideo.b0() != null) {
            ((ActTrimVideo) frgTrimVideo.b0()).b0((View.OnSystemUiVisibilityChangeListener) null);
        }
        if (z2) {
            if (z) {
                tgVar.i(this.v0);
            } else {
                tgVar.g(this.v0);
            }
        } else if (z) {
            tgVar.i(this.u0);
        }
    }

    public final void c() {
        String str;
        if (((View) this.c) != null) {
            khe khe = sme.a0;
            sme R = fm9.R((Context) this.b);
            this.E0 = R;
            ((View) this.c).setBackgroundColor(R.m);
            sme sme = this.E0;
            Toolbar toolbar = (Toolbar) ((View) this.c).findViewById(xxb.trim_video__toolbar);
            int i = bk4.b().p;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) toolbar.getLayoutParams();
            if (marginLayoutParams.topMargin != i) {
                marginLayoutParams.topMargin = i;
                toolbar.setLayoutParams(marginLayoutParams);
            }
            go9 go9 = new go9(this.X, toolbar);
            go9.c = sme;
            ai3 ai3 = new ai3(go9);
            this.s0 = ai3;
            Toolbar toolbar2 = (Toolbar) ai3.b;
            if (toolbar2 != null) {
                toolbar2.setNavigationIcon((Drawable) null);
            }
            ai3 ai32 = this.s0;
            int i2 = jpc.e3;
            y7g y7g = (y7g) ai32.a;
            if (i2 == 0) {
                y7g.getClass();
                str = "";
            } else if (((WeakReference) y7g.c).get() != null) {
                str = ((im) ((WeakReference) y7g.c).get()).getString(i2);
            } else {
                WeakReference weakReference = (WeakReference) y7g.b;
                if (weakReference.get() != null) {
                    str = ((a) weakReference.get()).h0(i2);
                } else {
                    throw new IllegalStateException("ContextWeakWrapper should have Activity or Fragment");
                }
            }
            TextView textView = (TextView) ai32.o;
            if (!(textView == null || i2 == -1)) {
                textView.setText(str);
            }
            ai3 ai33 = this.s0;
            View view = (View) ai33.Y;
            if (view != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
                layoutParams.gravity = 17;
                ((View) ai33.Y).setLayoutParams(layoutParams);
            } else {
                TextView textView2 = (TextView) ai33.o;
                if (textView2 != null) {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) textView2.getLayoutParams();
                    layoutParams2.gravity = 17;
                    ((TextView) ai33.o).setLayoutParams(layoutParams2);
                }
            }
            TextView textView3 = (TextView) ai33.X;
            if (textView3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) textView3.getLayoutParams();
                layoutParams3.gravity = 17;
                ((TextView) ai33.X).setLayoutParams(layoutParams3);
            }
            this.u0.setColorFilter(this.E0.t);
            this.v0.setColorFilter(this.E0.t);
            ImageButton imageButton = this.u0;
            sme sme2 = this.E0;
            imageButton.setBackground(hm9.g0(hm9.S(Integer.valueOf(sme2.r), (Integer) null, (Integer) null), hm9.S(Integer.valueOf(ote.b0(sme2.r, 0.8f)), (Integer) null, (Integer) null), (GradientDrawable) null));
            ImageButton imageButton2 = this.v0;
            sme sme3 = this.E0;
            imageButton2.setBackground(hm9.g0(hm9.S(Integer.valueOf(sme3.r), (Integer) null, (Integer) null), hm9.S(Integer.valueOf(ote.b0(sme3.r, 0.8f)), (Integer) null, (Integer) null), (GradientDrawable) null));
            this.w0.setTextColor(this.E0.M);
            this.x0.setTextColor(this.E0.M);
            aq4.g(this.B0.getDrawable(), this.E0.w);
            aq4.g(this.C0.getDrawable(), this.E0.k);
            this.B0.setBackground(this.E0.a());
            this.C0.setBackground(this.E0.a());
            this.A0.setTextColor(this.E0.w);
            if (this.A0.getAlpha() == 1.0f) {
                this.A0.setBackground(this.E0.a());
            }
            this.A0.setBackground(this.E0.a());
            this.z0.setBackgroundColor(this.E0.m);
            aq4.g(this.D0.getIndeterminateDrawable(), this.E0.k);
        }
    }

    public final void m() {
        ImageButton imageButton = (ImageButton) ((View) this.c).findViewById(xxb.trim_video__btn_play);
        this.u0 = imageButton;
        nd7.h(imageButton, new ml9(this, 0));
        ImageButton imageButton2 = (ImageButton) ((View) this.c).findViewById(xxb.trim_video__btn_pause);
        this.v0 = imageButton2;
        nd7.h(imageButton2, new ml9(this, 1));
        RangeSeekBarView rangeSeekBarView = (RangeSeekBarView) ((View) this.c).findViewById(xxb.trim_video__range_seek_bar_view);
        this.y0 = rangeSeekBarView;
        rangeSeekBarView.setOnChangeRangeSeekBarListener(this);
        this.w0 = (TextView) ((View) this.c).findViewById(xxb.trim_video__startTime);
        this.x0 = (TextView) ((View) this.c).findViewById(xxb.trim_video__endTime);
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) ((View) this.c).findViewById(xxb.trim_video__close);
        this.B0 = appCompatImageButton;
        nd7.h(appCompatImageButton, new ml9(this, 2));
        TextView textView = (TextView) ((View) this.c).findViewById(xxb.trim_video__reset);
        this.A0 = textView;
        nd7.h(textView, new ml9(this, 3));
        AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) ((View) this.c).findViewById(xxb.trim_video__apply);
        this.C0 = appCompatImageButton2;
        nd7.h(appCompatImageButton2, new ml9(this, 4));
        this.D0 = (ProgressBar) ((View) this.c).findViewById(xxb.trim_video__apply_progress);
        this.z0 = (ViewGroup) ((View) this.c).findViewById(xxb.trim_video__bottom_group);
        VideoView videoView = (VideoView) ((View) this.c).findViewById(xxb.trim_video__view_video);
        this.t0 = videoView;
        nd7.h(videoView, new ml9(this, 5));
        c();
        ViewGroup viewGroup = this.z0;
        yt8 yt8 = new yt8(11, (Object) this);
        WeakHashMap weakHashMap = zmf.a;
        omf.u(viewGroup, yt8);
        mmf.c(this.z0);
    }

    public final void r(Object obj) {
        hk9 hk9 = (hk9) obj;
        super.r(hk9);
        this.t0.a(hk9);
    }
}
