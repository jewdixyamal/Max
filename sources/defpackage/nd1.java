package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;

/* renamed from: nd1  reason: default package */
public final class nd1 extends ViewGroup implements k34, x5d, l7c, u5d {
    public final r6c a;
    public final s5d b;
    public final khe c = new khe(new md1(0, this));
    public final y5d o = new y5d(this);
    public final TextView s0;
    public final TextView t0;
    public final AppCompatImageView u0;
    public final j34 v0;
    public final int w0;
    public final int x0;
    public boolean y0;
    public boolean z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nd1(Context context) {
        super(context);
        r6c r6c = new r6c();
        s5d s5d = new s5d();
        this.a = r6c;
        this.b = s5d;
        TextView textView = new TextView(context);
        kqe kqe = i4f.a;
        os2.i.b(textView, du4.b);
        textView.setTextColor(getTitleColor());
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        this.s0 = textView;
        TextView textView2 = new TextView(context);
        os2.f.b(textView2, du4.b);
        textView2.setTextColor(getSubtitleColor());
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        this.t0 = textView2;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        appCompatImageView.setBackground(getIconBackground());
        int G = tu0.G(((float) 6) * fk4.d().getDisplayMetrics().density);
        appCompatImageView.setPadding(G, G, G, G);
        this.u0 = appCompatImageView;
        j34 j34 = new j34(context);
        j34.setBackgroundEnabled$message_list_release(false);
        this.v0 = j34;
        this.w0 = tu0.G(((float) 10) * fk4.d().getDisplayMetrics().density);
        int G2 = tu0.G(((float) 40) * fk4.d().getDisplayMetrics().density);
        this.x0 = G2;
        r6c.b = this;
        s5d.b = this;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(appCompatImageView, new ViewGroup.LayoutParams(G2, G2));
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

    public static ShapeDrawable a(nd1 nd1) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{fk4.d().getDisplayMetrics().density * 12.0f, fk4.d().getDisplayMetrics().density * 12.0f, fk4.d().getDisplayMetrics().density * 12.0f, fk4.d().getDisplayMetrics().density * 12.0f, fk4.d().getDisplayMetrics().density * 12.0f, fk4.d().getDisplayMetrics().density * 12.0f, fk4.d().getDisplayMetrics().density * 12.0f, fk4.d().getDisplayMetrics().density * 12.0f}, (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(nd1.getIconBackgroundColor());
        return shapeDrawable;
    }

    private final is0 getColors() {
        return qp4.u0.j(this).a().d(this.z0);
    }

    private final ShapeDrawable getIconBackground() {
        return (ShapeDrawable) this.c.getValue();
    }

    private final int getIconBackgroundColor() {
        return getColors().a.i;
    }

    private final int getIconColor() {
        boolean z = this.z0;
        pq9 pq9 = qp4.u0;
        return (!z || !this.y0) ? z ? pq9.j(this).getIcon().f : getColors().b.f : pq9.j(this).getIcon().c;
    }

    private final int getSubtitleColor() {
        return getColors().d.f;
    }

    private final int getTitleColor() {
        return getColors().d.e;
    }

    private final void setIcon(Drawable drawable) {
        AppCompatImageView appCompatImageView = this.u0;
        appCompatImageView.setImageDrawable(drawable);
        appCompatImageView.setImageTintList(ColorStateList.valueOf(getIconColor()));
    }

    private final void setSubtitle(CharSequence charSequence) {
        this.t0.setText(charSequence);
    }

    private final void setTitle(CharSequence charSequence) {
        this.s0.setText(charSequence);
    }

    public final void b() {
        this.s0.setTextColor(getTitleColor());
        this.t0.setTextColor(getSubtitleColor());
        this.u0.setImageTintList(ColorStateList.valueOf(getIconColor()));
        getIconBackground().getPaint().setColor(getIconBackgroundColor());
        this.v0.setTextColor$message_list_release(getColors().d.m);
    }

    public final void c(y01 y01) {
        this.z0 = y01.f;
        this.y0 = y01.c;
        setTitle(y01.a);
        setSubtitle(y01.b);
        setIcon(y01.d);
    }

    public final void f(ix8 ix8, boolean z) {
        this.a.f(ix8, z);
    }

    public final void g(CharSequence charSequence, boolean z) {
        bc7[] bc7Arr = j34.D0;
        this.v0.c(charSequence, false);
    }

    public int getAliasWidthWithPaddings() {
        return this.b.h0();
    }

    public final void k(is0 is0, boolean z) {
        this.a.k(is0, z);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        y5d y5d = this.o;
        boolean H = br7.H(y5d.b);
        int i6 = this.w0;
        if (H) {
            y5d.c(i6, i6);
            i5 = wg0.d((float) 4, fk4.d().getDisplayMetrics().density, y5d.a(), i6);
        } else {
            i5 = i6;
        }
        s5d s5d = this.b;
        if (br7.H((je7) s5d.c) && br7.H(y5d.b)) {
            s5d.T((getMeasuredWidth() - i6) - s5d.L(), ((y5d.a() / 2) - (s5d.K() / 2)) + i6);
        }
        AppCompatImageView appCompatImageView = this.u0;
        int i7 = this.x0;
        int i8 = i6 + i7;
        ote.D(appCompatImageView, i6, i5, i8, i7 + i5);
        int i9 = i8 + i6;
        TextView textView = this.s0;
        ote.E(textView, i9, i5, 0, 12);
        int measuredHeight = textView.getMeasuredHeight() + i5;
        TextView textView2 = this.t0;
        ote.E(textView2, i9, measuredHeight, 0, 12);
        int measuredHeight2 = textView2.getMeasuredHeight() + measuredHeight;
        r6c r6c = this.a;
        if (br7.H((je7) r6c.c)) {
            float f = (float) 10;
            r6c.T(tu0.G(f * fk4.d().getDisplayMetrics().density), rh4.c(f, fk4.d().getDisplayMetrics().density, measuredHeight2));
        }
        int measuredWidth = getMeasuredWidth();
        j34 j34 = this.v0;
        ote.E(j34, (measuredWidth - j34.getMeasuredWidth()) - i6, rh4.q((float) 4, fk4.d().getDisplayMetrics().density, getMeasuredHeight() - j34.getMeasuredHeight()), 0, 12);
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        float f = (float) 10;
        int m = wg0.m(f, fk4.d().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        int G = tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density) * 2;
        s5d s5d = this.b;
        boolean H = br7.H((je7) s5d.c);
        y5d y5d = this.o;
        if (H && br7.H(y5d.b)) {
            s5d.U(View.MeasureSpec.makeMeasureSpec(m, Integer.MIN_VALUE), i2);
        }
        if (br7.H(y5d.b)) {
            y5d.d(View.MeasureSpec.makeMeasureSpec(m, Integer.MIN_VALUE), i2);
            i3 = s5d.h0() + y5d.b();
            G = wg0.d((float) 4, fk4.d().getDisplayMetrics().density, y5d.a(), G);
        } else {
            i3 = 0;
        }
        j34 j34 = this.v0;
        j34.measure(i, i2);
        this.u0.measure(View.MeasureSpec.makeMeasureSpec(m, 1073741824), i2);
        int i4 = this.x0;
        int i5 = this.w0;
        int i6 = m - (i4 + i5);
        TextView textView = this.s0;
        textView.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), i2);
        TextView textView2 = this.t0;
        textView2.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), i2);
        int i7 = i5 * 2;
        int min = i7 + Math.min(m, j34.getMeasuredWidth() + Math.max(textView.getMeasuredWidth(), Math.max(textView2.getMeasuredWidth(), i3)) + i4);
        int measuredHeight = j34.getMeasuredHeight() + textView.getMeasuredHeight() + textView2.getMeasuredHeight() + G;
        r6c r6c = this.a;
        if (br7.H((je7) r6c.c)) {
            r6c.U(View.MeasureSpec.makeMeasureSpec(m, Integer.MIN_VALUE), i2);
            min = Math.max(min, r6c.L());
            measuredHeight = wg0.d(f, fk4.d().getDisplayMetrics().density, r6c.K(), measuredHeight);
        }
        setMeasuredDimension(min, measuredHeight);
    }

    public final void q(boolean z) {
        this.a.q(z);
    }

    public void setAlias(Layout layout) {
        this.b.setAlias(layout);
    }

    public void setAliasColor(int i) {
        this.b.setAliasColor(i);
    }

    public void setChipObserver(w5c w5c) {
        this.a.setChipObserver(w5c);
    }

    public void setDateBackgroundColor(int i) {
    }

    public void setDateTextColor(int i) {
        this.v0.setTextColor$message_list_release(i);
    }

    public void setDateViewStatus(zof zof) {
        this.v0.setStatus$message_list_release(zof);
    }

    public void setIsIncoming(boolean z) {
        this.a.o = z;
    }

    public void setOnClickListener(m56 m56) {
        this.a.X = m56;
    }

    public void setSenderName(Layout layout) {
        this.o.e(layout);
    }

    public void setSenderNameColor(int i) {
        this.o.f(i);
    }

    public void setStackFromEnd(boolean z) {
        this.a.Z = z;
    }
}
