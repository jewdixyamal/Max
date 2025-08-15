package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;

/* renamed from: lp3  reason: default package */
public final class lp3 extends ViewGroup implements k34, x5d, l7c, jw8, u5d {
    public final int A0;
    public boolean B0;
    public final r6c a;
    public final dw8 b;
    public final s5d c;
    public final m56 o;
    public final khe s0 = new khe(new md1(26, this));
    public final y5d t0 = new y5d(this);
    public final TextView u0;
    public final TextView v0;
    public final s5a w0;
    public final je7 x0;
    public final je7 y0;
    public final j34 z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lp3(Context context, om8 om8) {
        super(context);
        r6c r6c = new r6c();
        dw8 dw8 = new dw8();
        s5d s5d = new s5d();
        this.a = r6c;
        this.b = dw8;
        this.c = s5d;
        this.o = om8;
        TextView textView = new TextView(context);
        kqe kqe = i4f.a;
        os2.i.b(textView, du4.b);
        textView.setTextColor(getTitleColor());
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        this.u0 = textView;
        TextView textView2 = new TextView(context);
        os2.f.b(textView2, du4.b);
        textView2.setTextColor(getSubtitleColor());
        this.v0 = textView2;
        s5a s5a = new s5a(context);
        this.w0 = s5a;
        this.x0 = tu0.r(3, new kp3(context, this, 0));
        this.y0 = tu0.r(3, new kp3(context, this, 1));
        j34 j34 = new j34(context);
        j34.setBackgroundEnabled$message_list_release(false);
        this.z0 = j34;
        this.A0 = 4;
        r6c.b = this;
        dw8.b = this;
        s5d.b = this;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        float f = (float) 44;
        addView(s5a, new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
        addView(textView, new ViewGroup.LayoutParams(-2, -2));
        addView(textView2, new ViewGroup.LayoutParams(-2, -2));
        addView(j34, new ViewGroup.LayoutParams(-2, -2));
        setClipChildren(true);
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        qx7 qx7 = vs8.y;
        fka j = qp4.u0.j(this);
        qx7.getClass();
        setBackground(qx7.e(j));
        setWillNotDraw(false);
        setTransitionGroup(true);
    }

    public static AppCompatImageView a(Context context, lp3 lp3) {
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        appCompatImageView.setBackground(lp3.getIconBackground());
        int G = tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density);
        appCompatImageView.setPadding(G, G, G, G);
        float f = (float) 32;
        lp3.addView(appCompatImageView, new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
        appCompatImageView.requestLayout();
        return appCompatImageView;
    }

    public static AppCompatImageView b(Context context, lp3 lp3) {
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        appCompatImageView.setBackground(lp3.getIconBackground());
        int G = tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density);
        appCompatImageView.setPadding(G, G, G, G);
        float f = (float) 32;
        lp3.addView(appCompatImageView, new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
        appCompatImageView.requestLayout();
        return appCompatImageView;
    }

    public static ShapeDrawable d(lp3 lp3) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(lp3.getIconBackgroundColor());
        return shapeDrawable;
    }

    private final is0 getColors() {
        return qp4.u0.j(this).a().d(this.B0);
    }

    private final ShapeDrawable getIconBackground() {
        return (ShapeDrawable) this.s0.getValue();
    }

    private final int getIconBackgroundColor() {
        return getColors().a.g;
    }

    private final int getIconColor() {
        return getColors().b.b;
    }

    private final int getSubtitleColor() {
        return getColors().d.f;
    }

    private final int getTitleColor() {
        return getColors().d.e;
    }

    private final void setSubtitle(CharSequence charSequence) {
        this.v0.setText(charSequence);
    }

    private final void setTitle(CharSequence charSequence) {
        this.u0.setText(charSequence);
    }

    public final void c(is0 is0) {
        this.b.c(is0);
    }

    public final void e() {
        this.u0.setTextColor(getTitleColor());
        this.v0.setTextColor(getSubtitleColor());
        getIconBackground().getPaint().setColor(getIconBackgroundColor());
        this.z0.setTextColor$message_list_release(getColors().d.m);
        je7 je7 = this.y0;
        if (je7.a()) {
            ((AppCompatImageView) je7.getValue()).setImageTintList(ColorStateList.valueOf(getIconColor()));
        }
        je7 je72 = this.x0;
        if (je72.a()) {
            ((AppCompatImageView) je72.getValue()).setImageTintList(ColorStateList.valueOf(getIconColor()));
        }
    }

    public final void f(ix8 ix8, boolean z) {
        this.a.f(ix8, z);
    }

    public final void g(CharSequence charSequence, boolean z) {
        bc7[] bc7Arr = j34.D0;
        this.z0.c(charSequence, false);
    }

    public int getAliasWidthWithPaddings() {
        return this.c.h0();
    }

    public final void h(je7 je7, Drawable drawable) {
        if (drawable != null) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) je7.getValue();
            int G = tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density);
            appCompatImageView.setPadding(G, G, G, G);
            appCompatImageView.setImageDrawable(drawable);
            appCompatImageView.setImageTintList(ColorStateList.valueOf(getIconColor()));
            appCompatImageView.setVisibility(0);
        } else if (je7.a()) {
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) je7.getValue();
            appCompatImageView2.setImageDrawable((Drawable) null);
            appCompatImageView2.setVisibility(8);
        }
    }

    public final void i(bk3 bk3) {
        this.B0 = bk3.g;
        setTitle(bk3.b);
        setSubtitle(bk3.h);
        j5a j5a = j5a.a;
        s5a s5a = this.w0;
        s5a.setAvatarShape(j5a);
        s5a.i(s5a, bk3.d, Long.valueOf(bk3.a), bk3.e);
        je7 je7 = this.y0;
        h(je7, bk3.j);
        je7 je72 = this.x0;
        h(je72, bk3.i);
        if (je7.a()) {
            tu0.K((AppCompatImageView) je7.getValue(), 300, new jp3(this, bk3, 0));
        }
        if (je72.a()) {
            tu0.K((AppCompatImageView) je72.getValue(), 300, new jp3(this, bk3, 1));
        }
    }

    public final void k(is0 is0, boolean z) {
        this.a.k(is0, z);
    }

    public final void l() {
        this.b.l();
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        float f;
        int i6;
        int i7;
        float f2 = (float) 8;
        int G = tu0.G(fk4.d().getDisplayMetrics().density * f2);
        float f3 = (float) 10;
        int G2 = tu0.G(fk4.d().getDisplayMetrics().density * f3);
        int G3 = tu0.G(((float) 32) * fk4.d().getDisplayMetrics().density);
        int G4 = tu0.G(fk4.d().getDisplayMetrics().density * f3);
        y5d y5d = this.t0;
        if (br7.H(y5d.b)) {
            y5d.c(G4, G2);
            i5 = wg0.d((float) 4, fk4.d().getDisplayMetrics().density, y5d.a(), G2);
        } else {
            i5 = G2;
        }
        s5d s5d = this.c;
        if (br7.H((je7) s5d.c) && br7.H(y5d.b)) {
            s5d.T((getMeasuredWidth() - G4) - s5d.L(), ((y5d.a() / 2) - (s5d.K() / 2)) + G2);
        }
        dw8 dw8 = this.b;
        if (br7.H((je7) dw8.c)) {
            dw8.T(G4, i5);
            i5 = wg0.d((float) 4, fk4.d().getDisplayMetrics().density, dw8.K(), i5);
        }
        s5a s5a = this.w0;
        int measuredWidth = s5a.getMeasuredWidth() + G + G4;
        TextView textView = this.u0;
        int measuredHeight = textView.getMeasuredHeight();
        TextView textView2 = this.v0;
        if (textView2.getMeasuredHeight() + measuredHeight > s5a.getMeasuredHeight()) {
            ote.E(textView, measuredWidth, i5, 0, 12);
            ote.E(textView2, measuredWidth, textView.getBottom(), 0, 12);
            i6 = tu0.G((((float) (textView2.getMeasuredHeight() + textView.getMeasuredHeight())) / 2.0f) + ((float) textView.getTop()));
            ote.E(s5a, G4, i6 - (s5a.getMeasuredHeight() / 2), 0, 12);
            i7 = textView2.getMeasuredHeight() + textView.getMeasuredHeight() + i5;
            f = f3;
        } else {
            ote.E(s5a, G4, i5, 0, 12);
            int measuredHeight2 = (s5a.getMeasuredHeight() / 2) + i5;
            f = f3;
            ote.D(textView, measuredWidth, measuredHeight2 - textView.getMeasuredHeight(), textView.getMeasuredWidth() + measuredWidth, textView.getMeasuredHeight() + measuredHeight2);
            ote.E(textView2, measuredWidth, measuredHeight2, 0, 12);
            i7 = s5a.getMeasuredHeight() + i5;
            i6 = measuredHeight2;
        }
        int i8 = i6 - (G3 / 2);
        int measuredWidth2 = getMeasuredWidth() - G2;
        je7 je7 = this.y0;
        if (br7.H(je7)) {
            int i9 = measuredWidth2 - G3;
            ote.D((AppCompatImageView) je7.getValue(), i9, i8, measuredWidth2, i8 + G3);
            measuredWidth2 = i9 - G;
        }
        je7 je72 = this.x0;
        if (br7.H(je72)) {
            ote.D((AppCompatImageView) je72.getValue(), measuredWidth2 - G3, i8, measuredWidth2, G3 + i8);
        }
        r6c r6c = this.a;
        if (br7.H((je7) r6c.c)) {
            r6c.T(tu0.G(fk4.d().getDisplayMetrics().density * f), rh4.c(f2, fk4.d().getDisplayMetrics().density, i7));
            r6c.K();
        }
        int measuredWidth3 = getMeasuredWidth();
        j34 j34 = this.z0;
        int measuredWidth4 = (measuredWidth3 - j34.getMeasuredWidth()) - G;
        int q = rh4.q((float) 6, fk4.d().getDisplayMetrics().density, getMeasuredHeight() - j34.getMeasuredHeight());
        int measuredWidth5 = j34.getMeasuredWidth() + measuredWidth4;
        int measuredHeight3 = j34.getMeasuredHeight() + q;
        View view = (View) j34.getParent();
        if (c54.K(j34)) {
            j34.layout(view.getMeasuredWidth() - measuredWidth5, q, view.getMeasuredWidth() - measuredWidth4, measuredHeight3);
        } else {
            j34.layout(measuredWidth4, q, measuredWidth5, measuredHeight3);
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5 = i2;
        int size = View.MeasureSpec.getSize(i);
        float f = (float) 10;
        int m = wg0.m(f, fk4.d().getDisplayMetrics().density, 2, size);
        int G = tu0.G(((float) 32) * fk4.d().getDisplayMetrics().density);
        int G2 = tu0.G(((float) 44) * fk4.d().getDisplayMetrics().density);
        float f2 = (float) 8;
        int G3 = tu0.G(fk4.d().getDisplayMetrics().density * f2);
        int G4 = tu0.G(fk4.d().getDisplayMetrics().density * f);
        je7 je7 = this.y0;
        int i6 = G + G3;
        Integer valueOf = Integer.valueOf(i6);
        if (!br7.H(je7)) {
            valueOf = 0;
        }
        int intValue = m - valueOf.intValue();
        je7 je72 = this.x0;
        Integer valueOf2 = Integer.valueOf(i6);
        if (!br7.H(je72)) {
            valueOf2 = 0;
        }
        int intValue2 = (((intValue - valueOf2.intValue()) - (G2 + G3)) - G4) - G4;
        s5d s5d = this.c;
        boolean H = br7.H((je7) s5d.c);
        y5d y5d = this.t0;
        if (H && br7.H(y5d.b)) {
            s5d.U(View.MeasureSpec.makeMeasureSpec(m, Integer.MIN_VALUE), i5);
        }
        if (br7.H(y5d.b)) {
            y5d.d(View.MeasureSpec.makeMeasureSpec(m, Integer.MIN_VALUE), i5);
            i3 = rh4.c((float) this.A0, fk4.d().getDisplayMetrics().density, y5d.a() + G3);
        } else {
            i3 = tu0.G(fk4.d().getDisplayMetrics().density * f);
        }
        dw8 dw8 = this.b;
        if (br7.H((je7) dw8.c)) {
            dw8.U(View.MeasureSpec.makeMeasureSpec(m, Integer.MIN_VALUE), i5);
            i3 += dw8.K();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(G2, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(G2, 1073741824);
        s5a s5a = this.w0;
        s5a.measure(makeMeasureSpec, makeMeasureSpec2);
        TextView textView = this.u0;
        textView.measure(View.MeasureSpec.makeMeasureSpec(intValue2, 1073741824), i5);
        TextView textView2 = this.v0;
        textView2.measure(View.MeasureSpec.makeMeasureSpec(intValue2, Integer.MIN_VALUE), i5);
        if (br7.H(je7)) {
            ((AppCompatImageView) je7.getValue()).measure(View.MeasureSpec.makeMeasureSpec(G, 1073741824), i5);
        }
        if (br7.H(je72)) {
            ((AppCompatImageView) je72.getValue()).measure(View.MeasureSpec.makeMeasureSpec(G, 1073741824), i5);
        }
        int max = Math.max(s5a.getMeasuredHeight(), textView2.getMeasuredHeight() + textView.getMeasuredHeight()) + i3;
        r6c r6c = this.a;
        if (br7.H((je7) r6c.c)) {
            r6c.U(View.MeasureSpec.makeMeasureSpec(m, Integer.MIN_VALUE), i5);
            max = wg0.d(f2, fk4.d().getDisplayMetrics().density, r6c.K(), max);
        }
        j34 j34 = this.z0;
        j34.measure(i, i5);
        float f3 = (float) 6;
        int c2 = rh4.c(f, fk4.d().getDisplayMetrics().density, j34.getMeasuredWidth() + rh4.c(f3, fk4.d().getDisplayMetrics().density, r6c.L()));
        if (!br7.H((je7) r6c.c) || c2 >= m) {
            i4 = wg0.d(f3, fk4.d().getDisplayMetrics().density, j34.getMeasuredHeight(), max);
        } else {
            i4 = rh4.c(f, fk4.d().getDisplayMetrics().density, max);
        }
        setMeasuredDimension(size, i4);
    }

    public final void q(boolean z) {
        this.a.q(z);
    }

    public void setAlias(Layout layout) {
        this.c.setAlias(layout);
    }

    public void setAliasColor(int i) {
        this.c.setAliasColor(i);
    }

    public void setChipObserver(w5c w5c) {
        this.a.setChipObserver(w5c);
    }

    public void setDateBackgroundColor(int i) {
    }

    public void setDateTextColor(int i) {
        this.z0.setTextColor$message_list_release(i);
    }

    public void setDateViewStatus(zof zof) {
        this.z0.setStatus$message_list_release(zof);
    }

    public void setForwardClickListener(m56 m56) {
        this.b.X = m56;
    }

    public void setIsIncoming(boolean z) {
        this.a.o = z;
    }

    public void setLink(cw8 cw8) {
        this.b.setLink(cw8);
    }

    public void setOnClickListener(m56 m56) {
        this.a.X = m56;
    }

    public void setReplyClickListener(a66 a66) {
        this.b.o = a66;
    }

    public void setSenderName(Layout layout) {
        this.t0.e(layout);
    }

    public void setSenderNameColor(int i) {
        this.t0.f(i);
    }

    public void setStackFromEnd(boolean z) {
        this.a.Z = z;
    }
}
