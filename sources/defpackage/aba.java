package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.coroutines.Continuation;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: aba  reason: default package */
public class aba extends ConstraintLayout implements kre {
    public static final /* synthetic */ bc7[] L0;
    public final ImageView G0;
    public final TextView H0;
    public final TextView I0;
    public final OneMeButton J0;
    public final yj K0 = new yj(20, this);

    static {
        oi9 oi9 = new oi9(aba.class, "customTheme", "getCustomTheme()Lone/me/sdk/design/OneMeTheme;");
        nec.a.getClass();
        L0 = new bc7[]{oi9};
    }

    public aba(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ImageView imageView = new ImageView(context);
        imageView.setId(vxb.oneme_empty_view_icon);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setElevation(fk4.d().getDisplayMetrics().density * 8.0f);
        pq9 pq9 = qp4.u0;
        imageView.setImageTintList(ColorStateList.valueOf(pq9.j(imageView).getIcon().b));
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, hm9.a(pq9.b(context).i()));
        gradientDrawable.setShape(1);
        imageView.setBackground(gradientDrawable);
        this.G0 = imageView;
        TextView textView = new TextView(context);
        textView.setId(vxb.oneme_empty_view_title);
        i4f.c.b(textView, du4.b);
        this.H0 = textView;
        TextView textView2 = new TextView(context);
        textView2.setId(vxb.oneme_empty_view_subtitle);
        textView2.setMaxLines(4);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        i4f.n.b(textView2, du4.b);
        textView2.setVisibility(8);
        this.I0 = textView2;
        OneMeButton oneMeButton = new OneMeButton(context, (AttributeSet) null);
        oneMeButton.setId(vxb.oneme_empty_view_main_action);
        oneMeButton.setVisibility(8);
        oneMeButton.setAppearance(z6a.o);
        this.J0 = oneMeButton;
        float f = (float) 80;
        addView(imageView, tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        addView(textView, -2, -2);
        addView(textView2, 0, -2);
        addView(oneMeButton, -2, -2);
        onThemeChanged(pq9.b(context).i());
        v3c.y(new xh0((Object) context, (Continuation) null, 24), this);
        setBackground(new lmd(context));
        float f2 = (float) 32;
        int G = tu0.G(fk4.d().getDisplayMetrics().density * f2);
        dj3 q = fp3.q(this);
        int id = imageView.getId();
        q.d(id, 3, 0, 3);
        q.d(id, 6, 0, 6);
        q.d(id, 7, 0, 7);
        q.d(id, 4, 0, 4);
        q.g(id).d.x = 0.4f;
        int id2 = textView.getId();
        q.d(id2, 3, imageView.getId(), 4);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(q, 3, id2, 4));
        q.d(id2, 6, 0, 6);
        new l2a(q, 6, id2, 4).e(G);
        q.d(id2, 7, 0, 7);
        new l2a(q, 7, id2, 4).e(G);
        int id3 = textView2.getId();
        q.d(id3, 3, textView.getId(), 4);
        au1.p((float) 8, fk4.d().getDisplayMetrics().density, new l2a(q, 3, id3, 4));
        q.d(id3, 6, 0, 6);
        new l2a(q, 6, id3, 4).e(G);
        q.d(id3, 7, 0, 7);
        new l2a(q, 7, id3, 4).e(G);
        int id4 = oneMeButton.getId();
        q.d(id4, 3, textView2.getId(), 4);
        au1.p((float) 24, fk4.d().getDisplayMetrics().density, new l2a(q, 3, id4, 4));
        q.d(id4, 6, 0, 6);
        new l2a(q, 6, id4, 4).e(G);
        q.d(id4, 7, 0, 7);
        new l2a(q, 7, id4, 4).e(G);
        q.a(this);
    }

    /* access modifiers changed from: private */
    public final fka getCurrentTheme() {
        fka customTheme = getCustomTheme();
        return customTheme == null ? qp4.u0.j(this) : customTheme;
    }

    public final fka getCustomTheme() {
        bc7 bc7 = L0[0];
        return (fka) this.K0.b;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        onThemeChanged(getCurrentTheme());
        lmd background = getBackground();
        if (background != null) {
            background.start();
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        lmd background = getBackground();
        if (background != null) {
            background.stop();
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            int top = this.G0.getTop();
            lmd background = getBackground();
            if (background != null) {
                background.a(top);
            }
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        lmd background = getBackground();
        if (background != null) {
            background.setPadding(0, 0, 0, getPaddingBottom());
        }
    }

    public final void onThemeChanged(fka fka) {
        lmd background = getBackground();
        if (background != null) {
            background.onThemeChanged(getCurrentTheme());
        }
        ColorStateList valueOf = ColorStateList.valueOf(getCurrentTheme().getIcon().b);
        ImageView imageView = this.G0;
        imageView.setImageTintList(valueOf);
        ((GradientDrawable) imageView.getBackground()).setColors(hm9.a(getCurrentTheme()));
        this.H0.setTextColor(getCurrentTheme().getText().e);
        this.I0.setTextColor(getCurrentTheme().getText().g);
        this.J0.setCustomTheme(getCustomTheme());
    }

    public final void setCustomTheme(fka fka) {
        this.K0.o1(this, L0[0], fka);
    }

    public final void setIcon(int i) {
        this.G0.setImageResource(i);
    }

    public final void setSubtitle(jqe jqe) {
        TextView textView = this.I0;
        textView.setText(jqe.b(textView.getContext()));
        CharSequence text = textView.getText();
        int i = 0;
        if (!(!(text == null || text.length() == 0))) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public final void setTitle(jqe jqe) {
        TextView textView = this.H0;
        textView.setText(jqe.b(textView.getContext()));
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        lmd background = getBackground();
        return background != null && background.b(drawable);
    }

    public final void x(String str, View.OnClickListener onClickListener) {
        OneMeButton oneMeButton = this.J0;
        oneMeButton.setVisibility(0);
        oneMeButton.setText((CharSequence) str);
        tu0.K(oneMeButton, 300, onClickListener);
    }

    public lmd getBackground() {
        Drawable background = super.getBackground();
        if (background instanceof lmd) {
            return (lmd) background;
        }
        return null;
    }
}
