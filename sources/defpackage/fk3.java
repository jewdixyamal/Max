package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: fk3  reason: default package */
public final class fk3 extends ConstraintLayout implements kre {
    public final s5a G0;
    public final TextView H0;
    public final TextView I0;
    public final je7 J0;
    public final je7 K0;
    public final je7 L0;
    public final ViewStub M0;
    public final ViewStub N0;
    public final ViewStub O0;
    public o9g P0;
    public boolean Q0;
    public long R0 = Long.MAX_VALUE;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fk3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = context;
        this.J0 = tu0.r(3, new dk3(context2, this, 0));
        this.K0 = tu0.r(3, new dk3(context2, this, 1));
        this.L0 = tu0.r(3, new dk3(context2, this, 2));
        setLayoutParams(new ti3(-1, -2));
        float f = (float) 12;
        float f2 = (float) 10;
        setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        setBackground(getBackgroundDrawable());
        setOnLongClickListener(new zl0(2, this));
        tu0.K(this, 300, new ek3(this, 0));
        s5a s5a = new s5a(context2);
        s5a.setId(xoc.s);
        s5a.setAvatarShape(j5a.a);
        this.G0 = s5a;
        TextView textView = new TextView(context2);
        textView.setId(xoc.x);
        i4f.j.b(textView, du4.b);
        textView.setTextColor(getTitleText());
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        this.H0 = textView;
        TextView textView2 = new TextView(context2);
        textView2.setId(xoc.t);
        i4f.m.b(textView2, du4.b);
        textView2.setTextColor(getDescriptionColor());
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        Object tag = textView2.getTag(vxb.oneme_theme_textview_for_span_attach_listener);
        if ((tag instanceof View.OnAttachStateChangeListener ? (View.OnAttachStateChangeListener) tag : null) != null) {
            String p = v3c.p(textView2);
            hm9.m0("ViewThemeUtils", "try to observe onThemeChanged for spans in TextView more than once for " + p, new Object[0]);
        } else {
            ck ckVar = new ck();
            textView2.setTag(vxb.oneme_theme_textview_for_span_attach_listener, ckVar);
            if (textView2.isAttachedToWindow()) {
                ckVar.onViewAttachedToWindow(textView2);
            }
            textView2.addOnAttachStateChangeListener(ckVar);
        }
        this.I0 = textView2;
        ViewStub viewStub = new ViewStub(context2);
        viewStub.setId(xoc.v);
        this.M0 = viewStub;
        ViewStub viewStub2 = new ViewStub(context2);
        viewStub2.setId(xoc.u);
        this.N0 = viewStub2;
        ViewStub viewStub3 = new ViewStub(context2);
        viewStub3.setId(xoc.w);
        this.O0 = viewStub3;
        float f3 = (float) 40;
        addView(s5a, tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f3 * fk4.d().getDisplayMetrics().density));
        addView(textView, 0, -2);
        addView(textView2, 0, -2);
        addView(viewStub);
        addView(viewStub2);
        addView(viewStub3);
        dj3 q = fp3.q(this);
        int id = s5a.getId();
        q.d(id, 3, 0, 3);
        q.d(id, 6, 0, 6);
        q.d(id, 4, 0, 4);
        int id2 = textView.getId();
        q.d(id2, 3, s5a.getId(), 3);
        q.d(id2, 6, s5a.getId(), 7);
        new l2a(q, 6, id2, 4).e(tu0.G(f * fk4.d().getDisplayMetrics().density));
        q.d(id2, 7, viewStub.getId(), 6);
        float f4 = (float) 8;
        new l2a(q, 7, id2, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f4));
        q.d(id2, 4, textView2.getId(), 3);
        q.g(id2).d.W = 2;
        q.g(id2).d.l0 = true;
        int id3 = textView2.getId();
        q.d(id3, 3, textView.getId(), 4);
        new l2a(q, 3, id3, 4).e(tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density));
        q.d(id3, 6, textView.getId(), 6);
        q.d(id3, 7, textView.getId(), 7);
        q.d(id3, 4, s5a.getId(), 4);
        q.g(id3).d.l0 = true;
        int id4 = viewStub.getId();
        q.d(id4, 3, 0, 3);
        q.d(id4, 7, viewStub2.getId(), 6);
        au1.p(f4, fk4.d().getDisplayMetrics().density, new l2a(q, 7, id4, 4));
        q.d(id4, 4, 0, 4);
        int id5 = viewStub2.getId();
        q.d(id5, 3, 0, 3);
        q.d(id5, 7, viewStub3.getId(), 6);
        q.d(id5, 4, 0, 4);
        int id6 = viewStub3.getId();
        q.d(id6, 3, 0, 3);
        q.d(id6, 7, 0, 7);
        q.d(id6, 4, 0, 4);
        q.a(this);
    }

    private final ImageView getAudioCallButton() {
        return (ImageView) this.K0.getValue();
    }

    private final RippleDrawable getBackgroundDrawable() {
        int i = qp4.u0.j(this).d().a.a.h;
        return new RippleDrawable(ColorStateList.valueOf(i), (Drawable) null, new ColorDrawable(-1));
    }

    private final int getDescriptionColor() {
        return qp4.u0.j(this).getText().g;
    }

    private final RippleDrawable getRippleDrawableButton() {
        int i = qp4.u0.j(this).d().a.a.h;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(-1);
        return new RippleDrawable(ColorStateList.valueOf(i), (Drawable) null, shapeDrawable);
    }

    private final TextView getTimeTextView() {
        return (TextView) this.J0.getValue();
    }

    private final int getTitleText() {
        boolean z = this.Q0;
        xoe text = qp4.u0.j(this).getText();
        return z ? text.b : text.e;
    }

    private final ImageView getVideoCallButton() {
        return (ImageView) this.L0.getValue();
    }

    public static ImageView w(Context context, fk3 fk3) {
        ImageView imageView = new ImageView(context);
        float f = (float) 40;
        imageView.setLayoutParams(new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
        imageView.setImageResource(woc.n2);
        rh4.p((float) 8, fk4.d().getDisplayMetrics().density, imageView);
        imageView.setBackground(fk3.getRippleDrawableButton());
        imageView.setContentDescription(context.getString(yoc.b));
        imageView.setVisibility(8);
        imageView.setImageTintList(ColorStateList.valueOf(qp4.u0.j(imageView).getIcon().f));
        tu0.K(imageView, 300, new ek3(fk3, 1));
        return imageView;
    }

    public static TextView x(Context context, fk3 fk3) {
        TextView textView = new TextView(context);
        textView.setLayoutParams(new ti3(-2, -2));
        i4f.p.b(textView, du4.b);
        textView.setTextColor(fk3.getDescriptionColor());
        return textView;
    }

    public static ImageView y(Context context, fk3 fk3) {
        ImageView imageView = new ImageView(context);
        float f = (float) 40;
        imageView.setLayoutParams(new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
        rh4.p((float) 8, fk4.d().getDisplayMetrics().density, imageView);
        imageView.setImageResource(woc.c0);
        imageView.setBackground(fk3.getRippleDrawableButton());
        imageView.setContentDescription(context.getString(yoc.a));
        imageView.setVisibility(8);
        imageView.setImageTintList(ColorStateList.valueOf(qp4.u0.j(imageView).getIcon().f));
        tu0.K(imageView, 300, new ek3(fk3, 2));
        return imageView;
    }

    public final void A(boolean z) {
        ViewStub viewStub = this.N0;
        if (br7.G(viewStub) || z) {
            br7.F(viewStub, getAudioCallButton(), (k56) null);
            getAudioCallButton().setVisibility(z ? 0 : 8);
        }
    }

    public final void B(boolean z) {
        ViewStub viewStub = this.O0;
        if (br7.G(viewStub) || z) {
            br7.F(viewStub, getVideoCallButton(), (k56) null);
            getVideoCallButton().setVisibility(z ? 0 : 8);
        }
    }

    public final void C(boolean z) {
        this.Q0 = z;
        this.H0.setTextColor(getTitleText());
    }

    public final void E(long j, CharSequence charSequence, String str) {
        String obj = str != null ? str.toString() : null;
        Long valueOf = Long.valueOf(j);
        if (charSequence == null) {
            charSequence = "";
        }
        s5a.i(this.G0, obj, valueOf, charSequence);
    }

    public final void onThemeChanged(fka fka) {
        this.H0.setTextColor(getTitleText());
        getTimeTextView().setTextColor(getDescriptionColor());
        this.I0.setTextColor(getDescriptionColor());
        getAudioCallButton().setBackground(getRippleDrawableButton());
        getVideoCallButton().setBackground(getRippleDrawableButton());
        setBackground(getBackgroundDrawable());
        getAudioCallButton().setImageTintList(ColorStateList.valueOf(fka.getIcon().f));
        getVideoCallButton().setImageTintList(ColorStateList.valueOf(fka.getIcon().f));
    }

    public final void setAvatarOverlay(od0 od0) {
        this.G0.setCustomOverlay(od0);
    }

    public final void setAvatarPlaceholder(Drawable drawable) {
        s5a.j(this.G0, drawable, (m5a) null, 30);
    }

    public final void setDescription(CharSequence charSequence) {
        this.I0.setText(charSequence);
    }

    public final void setTime(CharSequence charSequence) {
        ViewStub viewStub = this.M0;
        if (br7.G(viewStub) || !w9e.C0(charSequence)) {
            br7.F(viewStub, getTimeTextView(), (k56) null);
            getTimeTextView().setText(charSequence);
        }
    }

    public final void setTitle(CharSequence charSequence) {
        this.H0.setText(charSequence);
    }
}
