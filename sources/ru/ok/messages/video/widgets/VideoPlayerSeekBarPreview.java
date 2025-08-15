package ru.ok.messages.video.widgets;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class VideoPlayerSeekBarPreview extends LinearLayout implements SeekBar.OnSeekBarChangeListener, nse {
    public static final /* synthetic */ int E0 = 0;
    public long A0;
    public long B0;
    public int C0;
    public int D0;
    public final HashSet a = new HashSet();
    public final VideoPlayerSeekBar b;
    public final VideoFramePreview c;
    public final r26 o;
    public final tg s0;
    public g28 t0;
    public sd7 u0;
    public fef v0;
    public ph4 w0;
    public ph4 x0;
    public final int y0;
    public final int z0;

    public VideoPlayerSeekBarPreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        bk4.b();
        this.y0 = fk4.b((int) 120.0f);
        this.z0 = fk4.b((int) 146.0f);
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        View inflate = View.inflate(context, yyb.view_video_player_seekbar_preview, this);
        this.c = (VideoFramePreview) inflate.findViewById(xxb.video_frame_preview);
        VideoPlayerSeekBar videoPlayerSeekBar = (VideoPlayerSeekBar) inflate.findViewById(xxb.video_player_seek_bar);
        this.b = videoPlayerSeekBar;
        videoPlayerSeekBar.setOnSeekBarChangeListener(this);
        this.s0 = ((y8a) vl.b()).c();
        q26 q26 = (q26) ((y8a) vl.b()).getAccessor().c(q26.class);
        q26.getClass();
        this.o = new r26((hle) q26.d.getValue(), (o45) q26.b.getValue(), q26.a, (ti4) q26.c.getValue());
        c();
    }

    public final void a() {
        ph4 ph4 = this.w0;
        VideoFramePreview videoFramePreview = this.c;
        if (ph4 != null) {
            ph4.h();
            this.w0 = null;
            videoFramePreview.setVisibility(4);
            videoFramePreview.setAlpha(1.0f);
        }
        if (videoFramePreview.getVisibility() == 0 && this.x0 == null) {
            ph4 g = this.s0.g(videoFramePreview);
            g.u(new gkf(this, 1));
            this.x0 = g;
        }
    }

    public final void c() {
        Context context = getContext();
        khe khe = sme.a0;
        sme R = fm9.R(context);
        int i = R.w;
        VideoPlayerSeekBar videoPlayerSeekBar = this.b;
        videoPlayerSeekBar.setProgressColor(i);
        videoPlayerSeekBar.setThumbColor(R.w);
        this.c.c();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cqc.b(this.t0);
        cqc.b(this.u0);
        ph4 ph4 = this.w0;
        if (ph4 != null) {
            ph4.h();
        }
        ph4 ph42 = this.x0;
        if (ph42 != null) {
            ph42.h();
        }
        r26 r26 = this.o;
        lp7 lp7 = r26.h;
        if (lp7 != null) {
            cqc.b(lp7.g);
            try {
                lp7.h.release();
            } catch (Throwable th) {
                hm9.p("lp7", "fail to release", th);
            }
            lp7.j = 0;
            List<Bitmap> list = (List) lp7.f.A();
            if (list != null) {
                for (Bitmap bitmap : list) {
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                }
            }
        }
        rfc rfc = r26.i;
        if (rfc != null) {
            g0 g0Var = rfc.g;
            if (g0Var != null) {
                g0Var.a();
                rfc.g = null;
            }
            g0 g0Var2 = rfc.h;
            if (g0Var2 != null) {
                g0Var2.a();
                rfc.h = null;
            }
        }
        this.a.clear();
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        float f;
        f28 f28;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((SeekBar.OnSeekBarChangeListener) it.next()).onProgressChanged(seekBar, i, z);
        }
        if (z && this.v0 == null) {
            return;
        }
        if (!z) {
            a();
            return;
        }
        long j = (long) i;
        if (this.v0 != null) {
            r26 r26 = this.o;
            if (r26.b() && (((ok0) this.v0).a == 0 || ((double) Math.abs(this.A0 - j)) > ((double) ((ok0) this.v0).a) * 0.01d)) {
                if (cqc.c(this.u0)) {
                    r0a n = qy9.u(1000, TimeUnit.MILLISECONDS, muc.a()).n(ce.a());
                    sd7 sd7 = new sd7(new fkf(this, 0), new n2f(23), ft.d);
                    n.a(sd7);
                    this.u0 = sd7;
                }
                cqc.b(this.t0);
                fef fef = r26.e;
                if (fef == null) {
                    hm9.p("r26", "You should call setVideoContent before extractFrame!", (Throwable) null);
                    f28 = m28.a;
                } else {
                    Uri l = ((ok0) fef).l();
                    int i2 = maf.a;
                    String scheme = l.getScheme();
                    if (TextUtils.isEmpty(scheme) || "file".equals(scheme)) {
                        lp7 lp7 = r26.h;
                        int min = Math.min(lp7.i - 1, (int) Math.floor((double) (((float) j) / ((float) (lp7.j / ((long) lp7.i))))));
                        ml0 ml0 = lp7.f;
                        z64 z64 = new z64(min, 3);
                        ml0.getClass();
                        f28 = new s28(new sz9(new ty9(ml0, z64, 1)), new z64(min, 4), 0);
                    } else {
                        rfc rfc = r26.i;
                        g0 g0Var = rfc.h;
                        if (g0Var != null) {
                            g0Var.a();
                            rfc.h = null;
                        }
                        f28 = new k28(new lt1((Object) rfc, j, 8));
                    }
                }
                a38 f2 = f28.f(ce.a());
                g28 g28 = new g28(new fkf(this, 1), new lt1((Object) this, j, 11), new e5(23, this));
                f2.a(g28);
                this.t0 = g28;
                this.A0 = j;
            }
            ph4 ph4 = this.x0;
            VideoFramePreview videoFramePreview = this.c;
            if (ph4 != null) {
                ph4.h();
                this.x0 = null;
                videoFramePreview.setVisibility(0);
                videoFramePreview.setAlpha(1.0f);
            }
            if (videoFramePreview.getVisibility() != 0 && this.w0 == null) {
                videoFramePreview.setAlpha(0.0f);
                ph4 i3 = this.s0.i(videoFramePreview);
                i3.u(new gkf(this, 0));
                this.w0 = i3;
            }
            AppCompatTextView appCompatTextView = videoFramePreview.t0;
            String[] strArr = are.b;
            appCompatTextView.setText(tfg.c(j));
            boolean K = c54.K(this);
            VideoPlayerSeekBar videoPlayerSeekBar = this.b;
            if (K) {
                int paddingLeft = getPaddingLeft() + videoPlayerSeekBar.getThumb().getBounds().centerX();
                f = Math.min((float) (-this.C0), Math.max((float) ((videoFramePreview.getWidth() - this.D0) - videoPlayerSeekBar.getWidth()), (((float) videoFramePreview.getWidth()) / 2.0f) + ((float) ((videoPlayerSeekBar.getThumbOffset() + paddingLeft) - videoPlayerSeekBar.getWidth()))));
            } else {
                int paddingLeft2 = getPaddingLeft() + videoPlayerSeekBar.getThumb().getBounds().centerX();
                f = Math.min((float) ((videoPlayerSeekBar.getWidth() + this.D0) - videoFramePreview.getWidth()), Math.max((float) this.C0, ((float) (videoPlayerSeekBar.getThumbOffset() + paddingLeft2)) - (((float) videoFramePreview.getWidth()) / 2.0f)));
            }
            videoFramePreview.setTranslationX(f);
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((SeekBar.OnSeekBarChangeListener) it.next()).onStartTrackingTouch(seekBar);
        }
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((SeekBar.OnSeekBarChangeListener) it.next()).onStopTrackingTouch(seekBar);
        }
        if (this.v0 != null) {
            a();
        }
    }

    public void setSecondaryProgress(long j) {
        this.b.setSecondaryProgress((int) j);
    }

    public void setVideoContent(fef fef) {
        int i;
        if (!fef.equals(this.v0)) {
            this.v0 = fef;
            int width = fef.getWidth();
            int height = fef.getHeight();
            int i2 = this.y0;
            if (width <= 0 || height <= 0) {
                i = i2;
            } else if (width < height) {
                int[] G = j47.G(i2, i2, width, height);
                i2 = G[0];
                i = G[1];
            } else {
                int i3 = this.z0;
                int[] G2 = j47.G(i3, i3, width, height);
                i2 = G2[0];
                i = G2[1];
            }
            VideoFramePreview videoFramePreview = this.c;
            ViewGroup.LayoutParams layoutParams = videoFramePreview.getLayoutParams();
            layoutParams.width = i2;
            layoutParams.height = i;
            videoFramePreview.setLayoutParams(layoutParams);
            r26 r26 = this.o;
            r26.a(fef, i2, i);
            if (r26.b()) {
                videoFramePreview.setPreviewEnabled(true);
                if (r26.e == null) {
                    hm9.p("r26", "You should call setVideoContent before prepare!", (Throwable) null);
                } else if (r26.b()) {
                    Uri l = ((ok0) r26.e).l();
                    int i4 = maf.a;
                    String scheme = l.getScheme();
                    if (TextUtils.isEmpty(scheme) || "file".equals(scheme)) {
                        lp7 lp7 = r26.h;
                        if (lp7.e == null) {
                            hm9.p("lp7", "You should call setVideoContent before prepare!", (Throwable) null);
                            return;
                        }
                        hb3 hb3 = new hb3(2, new z16(11, lp7));
                        hle hle = lp7.a;
                        hle.getClass();
                        jle jle = (jle) hle;
                        r0a n = hb3.r(jle.a()).n(jle.b());
                        ml0 ml0 = lp7.f;
                        Objects.requireNonNull(ml0);
                        sd7 sd7 = new sd7(new z16(12, ml0), new kp7(0), ft.d);
                        n.a(sd7);
                        lp7.g = sd7;
                        return;
                    }
                    rfc rfc = r26.i;
                    fef fef2 = rfc.e;
                    if (fef2 == null) {
                        hm9.p("rfc", "You should call setVideoContent before prepare!", (Throwable) null);
                        return;
                    }
                    uy uyVar = ((ok0) fef2).f;
                    if (uyVar == null) {
                        hm9.p("rfc", "Video collage is null", (Throwable) null);
                        return;
                    }
                    rfc.g = rfc.f.f(xv6.d(Uri.parse((String) uyVar.Y)).a(), (t68) null);
                }
            } else {
                videoFramePreview.setPreviewEnabled(false);
                videoFramePreview.a(false);
            }
        }
    }
}
