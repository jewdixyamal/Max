package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
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

/* renamed from: pa6  reason: default package */
public final class pa6 extends ViewGroup implements k34, x5d, l7c, jw8, u5d {
    public final int A0;
    public final int B0;
    public final int C0;
    public final r6c a;
    public final dw8 b;
    public final s5d c;
    public is0 o;
    public final khe s0 = new khe(new es3(22, this));
    public final y5d t0 = new y5d(this);
    public final TextView u0;
    public final TextView v0;
    public final AppCompatImageView w0;
    public final j34 x0;
    public final int y0;
    public final int z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pa6(Context context) {
        super(context);
        r6c r6c = new r6c();
        dw8 dw8 = new dw8();
        s5d s5d = new s5d();
        this.a = r6c;
        this.b = dw8;
        this.c = s5d;
        pq9 pq9 = qp4.u0;
        this.o = pq9.j(this).a().g();
        TextView textView = new TextView(context);
        kqe kqe = i4f.a;
        os2.i.b(textView, du4.b);
        textView.setTextColor(getTitleColor());
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        this.u0 = textView;
        TextView textView2 = new TextView(context);
        os2.f.b(textView2, du4.b);
        textView2.setTextColor(getSubtitleColor());
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        this.v0 = textView2;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        appCompatImageView.setBackground(getIconBackground());
        int G = tu0.G(((float) 6) * fk4.d().getDisplayMetrics().density);
        appCompatImageView.setPadding(G, G, G, G);
        this.w0 = appCompatImageView;
        j34 j34 = new j34(context);
        j34.setBackgroundEnabled$message_list_release(false);
        this.x0 = j34;
        this.y0 = tu0.G(((float) 10) * fk4.d().getDisplayMetrics().density);
        float f = (float) 4;
        this.z0 = tu0.G(fk4.d().getDisplayMetrics().density * f);
        this.A0 = tu0.G(fk4.d().getDisplayMetrics().density * f);
        this.B0 = tu0.G(f * fk4.d().getDisplayMetrics().density);
        int G2 = tu0.G(((float) 40) * fk4.d().getDisplayMetrics().density);
        this.C0 = G2;
        dw8.b = this;
        r6c.b = this;
        s5d.b = this;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(appCompatImageView, new ViewGroup.LayoutParams(G2, G2));
        addView(textView, new ViewGroup.LayoutParams(-2, -2));
        addView(textView2, new ViewGroup.LayoutParams(-2, -2));
        addView(j34, new ViewGroup.LayoutParams(-2, -2));
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        qx7 qx7 = vs8.y;
        fka j = pq9.j(this);
        qx7.getClass();
        setBackground(qx7.e(j));
    }

    public static ShapeDrawable a(pa6 pa6) {
        float f = fk4.d().getDisplayMetrics().density * 12.0f;
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = f;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(pa6.getIconBackgroundColor());
        return shapeDrawable;
    }

    private final ShapeDrawable getIconBackground() {
        return (ShapeDrawable) this.s0.getValue();
    }

    private final int getIconBackgroundColor() {
        return this.o.a.i;
    }

    private final int getIconColor() {
        return this.o.b.f;
    }

    private final int getSubtitleColor() {
        return this.o.d.f;
    }

    private final int getTitleColor() {
        return this.o.d.e;
    }

    public final void b(oa6 oa6, boolean z) {
        this.o = qp4.u0.j(this).a().d(z);
        TextView textView = this.u0;
        textView.setText(oa6.b);
        textView.setTextColor(getTitleColor());
        TextView textView2 = this.v0;
        textView2.setText(oa6.c);
        textView2.setTextColor(getSubtitleColor());
        AppCompatImageView appCompatImageView = this.w0;
        appCompatImageView.setImageResource(woc.P);
        appCompatImageView.setImageTintList(ColorStateList.valueOf(getIconColor()));
    }

    public final void c(is0 is0) {
        this.b.c(is0);
    }

    public final void d(is0 is0) {
        this.o = is0;
        this.u0.setTextColor(getTitleColor());
        this.v0.setTextColor(getSubtitleColor());
        this.w0.setImageTintList(ColorStateList.valueOf(getIconColor()));
        getIconBackground().getPaint().setColor(getIconBackgroundColor());
        this.x0.setTextColor$message_list_release(this.o.d.m);
    }

    public final void f(ix8 ix8, boolean z) {
        this.a.f(ix8, z);
    }

    public final void g(CharSequence charSequence, boolean z) {
        bc7[] bc7Arr = j34.D0;
        this.x0.c(charSequence, false);
    }

    public int getAliasWidthWithPaddings() {
        return this.c.h0();
    }

    public final void k(is0 is0, boolean z) {
        this.a.k(is0, z);
    }

    public final void l() {
        this.b.l();
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        y5d y5d = this.t0;
        boolean H = br7.H(y5d.b);
        int i6 = this.y0;
        if (H) {
            y5d.c(i6, i6);
            i5 = y5d.a() + this.z0 + i6;
        } else {
            i5 = i6;
        }
        s5d s5d = this.c;
        boolean H2 = br7.H((je7) s5d.c);
        int i7 = this.y0;
        if (H2 && br7.H(y5d.b)) {
            s5d.T((getMeasuredWidth() - i7) - s5d.L(), ((y5d.a() / 2) - (s5d.K() / 2)) + i7);
        }
        dw8 dw8 = this.b;
        if (br7.H((je7) dw8.c)) {
            dw8.T(i6, i5);
            i5 += dw8.K() + this.B0;
        }
        AppCompatImageView appCompatImageView = this.w0;
        int i8 = this.C0;
        int i9 = i5;
        c54.L(i6, i9, i6 + i8, i5 + i8, appCompatImageView, this);
        int i10 = i6 + i8 + i7;
        TextView textView = this.u0;
        int i11 = i10;
        c54.L(i11, i9, textView.getMeasuredWidth() + i10, textView.getMeasuredHeight() + i5, textView, this);
        int measuredHeight = textView.getMeasuredHeight() + i5;
        TextView textView2 = this.v0;
        c54.L(i11, measuredHeight, textView2.getMeasuredWidth() + i10, textView2.getMeasuredHeight() + measuredHeight, textView2, this);
        int bottom = appCompatImageView.getBottom();
        r6c r6c = this.a;
        if (br7.H((je7) r6c.c)) {
            float f = (float) 10;
            r6c.T(tu0.G(f * fk4.d().getDisplayMetrics().density), rh4.c(f, fk4.d().getDisplayMetrics().density, bottom));
            r6c.K();
        }
        int measuredWidth = getMeasuredWidth();
        j34 j34 = this.x0;
        int measuredWidth2 = (measuredWidth - j34.getMeasuredWidth()) - i7;
        int measuredHeight2 = (getMeasuredHeight() - j34.getMeasuredHeight()) - this.A0;
        j34 j342 = this.x0;
        c54.L(measuredWidth2, measuredHeight2, j342.getMeasuredWidth() + measuredWidth2, j34.getMeasuredHeight() + measuredHeight2, j342, this);
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int i4 = this.y0;
        int i5 = size - (i4 * 2);
        s5d s5d = this.c;
        boolean H = br7.H((je7) s5d.c);
        y5d y5d = this.t0;
        int i6 = 0;
        if (H && br7.H(y5d.b)) {
            s5d.U(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), i2);
            i6 = Math.max(0, s5d.L());
        }
        if (br7.H(y5d.b)) {
            y5d.d(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), i2);
            i6 = Math.max(i6, (i4 * 2) + y5d.b() + s5d.h0());
            i3 = y5d.a() + this.z0 + i4;
        } else {
            i3 = i4;
        }
        dw8 dw8 = this.b;
        if (br7.H((je7) dw8.c)) {
            dw8.U(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), i2);
            i6 = Math.max(i6, (i4 * 2) + dw8.L());
            i3 += dw8.K() + this.B0;
        }
        j34 j34 = this.x0;
        j34.measure(i, i2);
        this.w0.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), i2);
        int i7 = this.C0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((i5 - i7) - (i4 * 2), Integer.MIN_VALUE);
        TextView textView = this.u0;
        textView.measure(makeMeasureSpec, i2);
        TextView textView2 = this.v0;
        textView2.measure(makeMeasureSpec, i2);
        int max = Math.max(Math.min(i5, j34.getMeasuredWidth() + Math.max(textView.getMeasuredWidth(), textView2.getMeasuredWidth()) + i7) + i4, i6);
        int measuredHeight = textView2.getMeasuredHeight();
        int measuredHeight2 = j34.getMeasuredHeight() + rh4.c((float) 2, fk4.d().getDisplayMetrics().density, textView.getMeasuredHeight() + measuredHeight) + this.A0 + i3;
        r6c r6c = this.a;
        if (br7.H((je7) r6c.c)) {
            r6c.U(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), i2);
            float f = (float) 10;
            max = Math.max(max, (tu0.G(fk4.d().getDisplayMetrics().density * f) * 2) + r6c.L());
            measuredHeight2 = wg0.d(f, fk4.d().getDisplayMetrics().density, r6c.K(), measuredHeight2);
        }
        setMeasuredDimension(max, measuredHeight2);
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
        this.x0.setTextColor$message_list_release(i);
    }

    public void setDateViewStatus(zof zof) {
        this.x0.setStatus$message_list_release(zof);
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
