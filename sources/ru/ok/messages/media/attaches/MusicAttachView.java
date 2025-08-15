package ru.ok.messages.media.attaches;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.WeakHashMap;

public class MusicAttachView extends RelativeLayout implements View.OnClickListener, SeekBar.OnSeekBarChangeListener, wg9 {
    public final bk4 a;
    public final AppCompatTextView b;
    public final AppCompatTextView c;
    public final AppCompatTextView o;
    public final SimpleDraweeView s0;
    public final FrameLayout t0;
    public final sme u0;
    public final xg9 v0 = new xg9(this);

    public MusicAttachView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getContext();
        bk4 b2 = bk4.b();
        this.a = b2;
        int i = b2.i;
        WeakHashMap weakHashMap = zmf.a;
        setPaddingRelative(i, 0, i, 0);
        cv8 cv8 = (cv8) ((y8a) vl.b()).getAccessor().c(cv8.class);
        Context context2 = getContext();
        khe khe = sme.a0;
        this.u0 = fm9.R(context2);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.t0 = frameLayout;
        frameLayout.setOnClickListener(this);
        this.t0.setId(xxb.view_music_attach__ll_play);
        int i2 = this.a.w;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i2, i2);
        bk4 bk4 = this.a;
        layoutParams.topMargin = bk4.b;
        layoutParams.setMarginEnd(bk4.h);
        addView(this.t0, layoutParams);
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(getContext());
        this.s0 = simpleDraweeView;
        ((la6) simpleDraweeView.getHierarchy()).h(ssc.l);
        wnc wnc = new wnc();
        wnc.b = true;
        ((la6) this.s0.getHierarchy()).n(wnc);
        this.t0.addView(this.s0, new FrameLayout.LayoutParams(-1, -1));
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.o = appCompatTextView;
        appCompatTextView.setId(xxb.view_music_attach__tv_name);
        this.o.setTypeface(Typeface.create("sans-serif", 0));
        this.o.setMaxLines(1);
        this.o.setTextSize(0, this.a.I);
        AppCompatTextView appCompatTextView2 = this.o;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatTextView2.setEllipsize(truncateAt);
        this.o.setTextColor(this.u0.F);
        this.o.setGravity(8388611);
        this.o.setIncludeFontPadding(false);
        this.o.setTextAlignment(5);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(1, xxb.view_music_attach__ll_play);
        layoutParams2.addRule(17, xxb.view_music_attach__ll_play);
        layoutParams2.addRule(10, -1);
        this.o.setPaddingRelative(0, 0, this.a.e, 0);
        addView(this.o, layoutParams2);
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.c = appCompatTextView3;
        appCompatTextView3.setId(xxb.view_music_attach__tv_artist);
        this.c.setTypeface(Typeface.create("sans-serif", 0));
        this.c.setMaxLines(1);
        this.c.setTextSize(0, this.a.I);
        this.c.setEllipsize(truncateAt);
        this.c.setTextColor(this.u0.v);
        this.c.setIncludeFontPadding(false);
        j47.r(this.c, this.a.b);
        this.c.setTextAlignment(5);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(1, xxb.view_music_attach__ll_play);
        layoutParams3.addRule(17, xxb.view_music_attach__ll_play);
        layoutParams3.addRule(3, xxb.view_music_attach__tv_name);
        addView(this.c, layoutParams3);
        AppCompatTextView appCompatTextView4 = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.b = appCompatTextView4;
        appCompatTextView4.setTextSize(0, this.a.H);
        this.b.setTextColor(this.u0.v);
        this.b.setGravity(17);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, this.a.m);
        layoutParams4.addRule(1, xxb.view_music_attach__ll_play);
        layoutParams4.addRule(17, xxb.view_music_attach__ll_play);
        layoutParams4.addRule(3, xxb.view_music_attach__tv_artist);
        addView(this.b, layoutParams4);
    }

    private Drawable getPlayPauseSelector() {
        return hm9.g0(hm9.S(Integer.valueOf(this.u0.q), (Integer) null, (Integer) null), hm9.S(Integer.valueOf(ote.b0(this.u0.q, 0.8f)), (Integer) null, (Integer) null), (GradientDrawable) null);
    }

    public final void g() {
        if (!(this.t0.getForeground() instanceof r20)) {
            this.t0.setForeground(new r20(getContext()));
        }
        this.t0.getForeground().setLevel(0);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        xg9 xg9 = this.v0;
        getContext();
        xg9.a();
    }

    public final void onClick(View view) {
        if (view.getId() == xxb.view_music_attach__ll_play) {
            this.v0.getClass();
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.v0.g = true;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.v0.getClass();
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.v0.e = true;
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        xg9 xg9 = this.v0;
        seekBar.getProgress();
        xg9.getClass();
        nd7.R(new nn6(17, xg9), 500);
    }

    public void setArtistName(CharSequence charSequence) {
        this.c.setVisibility(0);
        this.c.setText(charSequence);
    }

    public void setDurationText(String str) {
        this.b.setText(str);
    }

    public void setListener(x20 x20) {
        this.v0.getClass();
    }

    public void setPlayButtonPauseSelector(boolean z) {
        Drawable playPauseSelector = getPlayPauseSelector();
        this.t0.setForeground(new lq4(playPauseSelector, ngg.u(gpc.S, this.u0.s, getContext())));
    }

    public void setPlayButtonPlaySelector(boolean z) {
        Drawable playPauseSelector = getPlayPauseSelector();
        this.t0.setForeground(new lq4(playPauseSelector, ngg.u(gpc.V, this.u0.s, getContext())));
    }

    public void setPlayButtonPreview(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.s0.setImageURI(str);
        } else {
            this.s0.setController((mq4) null);
        }
    }

    public void setTrackName(CharSequence charSequence) {
        this.o.setText(charSequence);
    }
}
