package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* renamed from: eb9  reason: default package */
public final class eb9 extends ConstraintLayout implements kre {
    public db9 G0;
    public final ImageView H0;
    public final TextView I0;
    public final TextView J0;
    public final ImageView K0;
    public final ImageView L0;
    public final wh7 M0;

    /* JADX WARNING: type inference failed for: r3v19, types: [android.widget.ProgressBar, wh7, sj0, android.view.View] */
    /* JADX WARNING: type inference failed for: r5v10, types: [wq4, nh7] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eb9(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        db9 db9 = db9.a;
        this.G0 = db9;
        ImageView imageView = new ImageView(getContext());
        cb9 cb9 = cb9.PLAYBACK;
        imageView.setId(cb9.a);
        float f = (float) 40;
        ti3 ti3 = new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f));
        ti3.t = 0;
        float f2 = (float) 4;
        ti3.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        ti3.i = 0;
        ti3.l = 0;
        imageView.setLayoutParams(ti3);
        imageView.setBackground(getSelectableItemOvalBackground());
        pq9 pq9 = qp4.u0;
        imageView.setColorFilter(pq9.j(imageView).getIcon().k);
        rh4.p((float) 8, fk4.d().getDisplayMetrics().density, imageView);
        imageView.setImageResource(pub.ic_play_24_filled);
        this.H0 = imageView;
        TextView textView = new TextView(getContext());
        cb9 cb92 = cb9.TITLE;
        textView.setId(cb92.a);
        ti3 ti32 = new ti3(0, -2);
        int i = cb92.a;
        textView.setId(i);
        ti32.i = 0;
        int i2 = cb9.a;
        ti32.s = i2;
        cb9 cb93 = cb9.SPEED;
        ti32.u = cb93.a;
        cb9 cb94 = cb9.SUBTITLE;
        ti32.k = cb94.a;
        ti32.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        float f3 = (float) 6;
        ti32.topMargin = tu0.G(fk4.d().getDisplayMetrics().density * f3);
        textView.setLayoutParams(ti32);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        i4f.q.b(textView, du4.b);
        textView.setTextColor(pq9.j(textView).getText().e);
        this.I0 = textView;
        TextView textView2 = new TextView(getContext());
        textView2.setId(cb94.a);
        ti3 ti33 = new ti3(0, -2);
        ti33.j = i;
        ti33.topMargin = tu0.G(((float) 3) * fk4.d().getDisplayMetrics().density);
        ti33.s = i2;
        ti33.setMarginStart(tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        int i3 = cb93.a;
        ti33.u = i3;
        ti33.l = 0;
        ti33.bottomMargin = tu0.G(fk4.d().getDisplayMetrics().density * f3);
        textView2.setLayoutParams(ti33);
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        i4f.s.b(textView2, du4.b);
        textView2.setTextColor(pq9.j(textView2).getText().g);
        this.J0 = textView2;
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setId(i3);
        ti3 ti34 = new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f));
        cb9 cb95 = cb9.CLOSE;
        ti34.u = cb95.a;
        ti34.i = 0;
        ti34.l = 0;
        int G = tu0.G(f3 * fk4.d().getDisplayMetrics().density);
        imageView2.setPadding(G, G, G, G);
        imageView2.setLayoutParams(ti34);
        imageView2.setBackground(getSelectableItemOvalBackground());
        w(imageView2, db9);
        this.K0 = imageView2;
        ImageView imageView3 = new ImageView(getContext());
        imageView3.setId(cb95.a);
        ti3 ti35 = new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        ti35.v = 0;
        ti35.i = 0;
        ti35.l = 0;
        int G2 = tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
        imageView3.setPadding(G2, G2, G2, G2);
        imageView3.setLayoutParams(ti35);
        imageView3.setImageResource(pub.cross_16);
        imageView3.setImageTintList(ColorStateList.valueOf(pq9.j(imageView3).getIcon().j));
        imageView3.setBackground(getSelectableItemOvalBackground());
        this.L0 = imageView3;
        ? sj0 = new sj0(getContext(), (AttributeSet) null, tsb.linearProgressIndicatorStyle, wh7.A0);
        xh7 xh7 = (xh7) sj0.a;
        ? wq4 = new wq4(xh7);
        wq4.b = 300.0f;
        Context context2 = sj0.getContext();
        sj0.setIndeterminateDrawable(new tz6(context2, xh7, wq4, xh7.h == 0 ? new oh7(xh7) : new qh7(context2, xh7)));
        sj0.setProgressDrawable(new di4(sj0.getContext(), xh7, wq4));
        sj0.setId(cb9.PROGRESS.a);
        float f4 = (float) 2;
        ti3 ti36 = new ti3(-1, tu0.G(fk4.d().getDisplayMetrics().density * f4));
        ti36.l = 0;
        sj0.setLayoutParams(ti36);
        sj0.setTrackCornerRadius(tu0.G(((float) 10) * fk4.d().getDisplayMetrics().density));
        sj0.setTrackThickness(tu0.G(f4 * fk4.d().getDisplayMetrics().density));
        sj0.setMin(0);
        sj0.setMax(1000);
        sj0.setProgress(0);
        sj0.setTrackColor(0);
        sj0.setIndicatorColor(pq9.j(sj0).b().a.m);
        this.M0 = sj0;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        addView(imageView);
        addView(textView);
        addView(textView2);
        addView(imageView2);
        addView(imageView3);
        addView(sj0);
    }

    private final Drawable getSelectableItemOvalBackground() {
        return new RippleDrawable(ColorStateList.valueOf(qp4.u0.j(this).d().a.a.d), (Drawable) null, new ShapeDrawable(new OvalShape()));
    }

    public final ImageView getCloseButton() {
        return this.L0;
    }

    public final ImageView getPlaybackButton() {
        return this.H0;
    }

    public final db9 getPlaybackSpeed() {
        return this.G0;
    }

    public final ImageView getPlaybackSpeedButton() {
        return this.K0;
    }

    public final wh7 getProgress() {
        return this.M0;
    }

    public final TextView getSubtitle() {
        return this.J0;
    }

    public final TextView getTitle() {
        return this.I0;
    }

    public final View getTooltipAnchor() {
        return this.K0;
    }

    public final void onThemeChanged(fka fka) {
        ImageView imageView = this.H0;
        imageView.setBackground(getSelectableItemOvalBackground());
        pq9 pq9 = qp4.u0;
        imageView.setColorFilter(pq9.j(imageView).getIcon().k);
        this.I0.setTextColor(pq9.j(this).getText().e);
        this.J0.setTextColor(pq9.j(this).getText().g);
        ImageView imageView2 = this.K0;
        Drawable drawable = imageView2.getDrawable();
        EnhancedVectorDrawable enhancedVectorDrawable = drawable instanceof EnhancedVectorDrawable ? (EnhancedVectorDrawable) drawable : null;
        if (enhancedVectorDrawable != null) {
            c54.Z(enhancedVectorDrawable, "border", pq9.j(imageView2).getIcon().h);
            c54.Z(enhancedVectorDrawable, "text", pq9.j(imageView2).getIcon().j);
        }
        imageView2.setBackground(getSelectableItemOvalBackground());
        ImageView imageView3 = this.L0;
        imageView3.setImageTintList(ColorStateList.valueOf(pq9.j(imageView3).getIcon().j));
        imageView3.setBackground(getSelectableItemOvalBackground());
        this.M0.setIndicatorColor(pq9.j(this).b().a.m);
    }

    public final void setIsPlaying(boolean z) {
        this.H0.setImageResource(z ? pub.ic_pause_24_filled : pub.ic_play_24_filled);
    }

    public final void setOnCloseClickListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.L0;
        if (onClickListener == null) {
            imageView.setOnClickListener((View.OnClickListener) null);
        } else {
            tu0.K(imageView, 1000, onClickListener);
        }
    }

    public final void setOnPlaybackClickListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.H0;
        if (onClickListener == null) {
            imageView.setOnClickListener((View.OnClickListener) null);
        } else {
            tu0.K(imageView, 200, onClickListener);
        }
    }

    public final void setOnPlaybackSpeedClick(m56 m56) {
        ImageView imageView = this.K0;
        if (m56 == null) {
            imageView.setOnClickListener((View.OnClickListener) null);
        } else {
            tu0.K(imageView, 200, new vu5(m56, 19, this));
        }
    }

    public final void setPlaybackSpeed(db9 db9) {
        ImageView imageView = this.K0;
        if (db9 != null) {
            w(imageView, db9);
        } else {
            imageView.setVisibility(8);
        }
    }

    public final void setProgress(float f) {
        wh7 wh7 = this.M0;
        wh7.setProgress(ote.e((int) ((f * ((float) (wh7.getMax() - wh7.getMin()))) + ((float) wh7.getMin())), wh7.getMin(), wh7.getMax()));
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.J0.setText(charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        this.I0.setText(charSequence);
    }

    public final void w(ImageView imageView, db9 db9) {
        int i;
        imageView.setVisibility(0);
        int ordinal = db9.ordinal();
        if (ordinal == 0) {
            i = pub.speed_1x;
        } else if (ordinal == 1) {
            i = pub.speed_1_5x;
        } else if (ordinal == 2) {
            i = pub.speed_2x;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable(imageView.getContext(), i);
        pq9 pq9 = qp4.u0;
        c54.Z(enhancedVectorDrawable, "border", pq9.j(imageView).getIcon().h);
        c54.Z(enhancedVectorDrawable, "text", pq9.j(imageView).getIcon().j);
        imageView.setImageDrawable(enhancedVectorDrawable);
        this.G0 = db9;
    }
}
