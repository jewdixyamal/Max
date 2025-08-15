package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.List;

/* renamed from: xkd  reason: default package */
public final class xkd extends ViewGroup implements k34, x5d, qpe, nk6, l7c, jw8, aoa, u5d, ck7 {
    public i33 A0;
    public final dy8 B0;
    public final je7 C0;
    public final je7 D0;
    public final je7 E0;
    public final je7 F0;
    public final j34 G0;
    public final r6c a;
    public final dw8 b;
    public final boa c;
    public final s5d o;
    public final m56 s0;
    public is0 t0;
    public final Paint u0;
    public final Rect v0 = new Rect();
    public boolean w0;
    public final je7 x0 = tu0.r(3, new vkd(this, 0));
    public final je7 y0 = tu0.r(3, new vkd(this, 1));
    public final y5d z0 = new y5d(this);

    /* JADX WARNING: type inference failed for: r2v0, types: [boa, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xkd(Context context, om8 om8) {
        super(context);
        r6c r6c = new r6c();
        dw8 dw8 = new dw8();
        ? obj = new Object();
        s5d s5d = new s5d();
        this.a = r6c;
        this.b = dw8;
        this.c = obj;
        this.o = s5d;
        this.s0 = om8;
        pq9 pq9 = qp4.u0;
        this.t0 = pq9.j(this).a().d(true);
        Paint paint = new Paint(1);
        paint.setColor(getInternalBubbleBackgroundColor());
        this.u0 = paint;
        dy8 dy8 = new dy8(context);
        dy8.setId(mda.N);
        dy8.setLinkLongClickListener(new bqc(11, this));
        dy8.setOnLongClickListener(new zl0(9, this));
        dy8.setSingleClickAction(new wkd(this, 0));
        dy8.setTryToSingleClickAction(new wkd(this, 1));
        this.B0 = dy8;
        this.C0 = tu0.r(3, new ukd(context, this, 1));
        this.D0 = tu0.r(3, new ukd(context, this, 2));
        this.E0 = tu0.r(3, new ukd(context, this, 3));
        this.F0 = tu0.r(3, new ukd(context, this, 0));
        j34 j34 = new j34(context);
        j34.setBackgroundEnabled$message_list_release(false);
        this.G0 = j34;
        r6c.b = this;
        dw8.b = this;
        s5d.b = this;
        addView(dy8, new ViewGroup.LayoutParams(-2, -2));
        addView(j34, new ViewGroup.LayoutParams(-2, -2));
        setClipChildren(true);
        setClickable(true);
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        qx7 qx7 = vs8.y;
        fka j = pq9.j(this);
        qx7.getClass();
        setBackground(qx7.e(j));
        setTransitionGroup(true);
    }

    public static AppCompatTextView a(Context context, xkd xkd) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        kqe kqe = i4f.a;
        os2.k.b(appCompatTextView, du4.b);
        appCompatTextView.setTextColor(xkd.getAdditionalTextColor());
        appCompatTextView.setEmojiCompatEnabled(false);
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        xkd.addView(appCompatTextView, new ViewGroup.LayoutParams(-2, -2));
        return appCompatTextView;
    }

    public static RippleDrawable b(xkd xkd) {
        float f = fk4.d().getDisplayMetrics().density * 12.0f;
        int internalBubbleBackgroundContentColor = xkd.getInternalBubbleBackgroundContentColor();
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = f;
        }
        return new RippleDrawable(ColorStateList.valueOf(internalBubbleBackgroundContentColor), (Drawable) null, new ShapeDrawable(new RoundRectShape(fArr, (RectF) null, (float[]) null)));
    }

    public static AppCompatTextView d(Context context, xkd xkd) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        kqe kqe = i4f.a;
        os2.f.b(appCompatTextView, du4.b);
        appCompatTextView.setTextColor(xkd.getAdditionalTextColor());
        appCompatTextView.setEmojiCompatEnabled(false);
        appCompatTextView.setMaxLines(5);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        xkd.addView(appCompatTextView, new ViewGroup.LayoutParams(-2, -2));
        return appCompatTextView;
    }

    private final int getAdditionalTextColor() {
        return this.t0.d.f;
    }

    /* access modifiers changed from: private */
    public final ShapeDrawable getBorderDrawable() {
        return (ShapeDrawable) this.y0.getValue();
    }

    private final int getInternalBubbleBackgroundBorderColor() {
        return this.t0.c.b;
    }

    private final int getInternalBubbleBackgroundColor() {
        return this.t0.a.m;
    }

    private final int getInternalBubbleBackgroundContentColor() {
        qp4.u0.j(this).d().a.a.getClass();
        return -1907998;
    }

    /* access modifiers changed from: private */
    public final RippleDrawable getRippleDrawable() {
        return (RippleDrawable) this.x0.getValue();
    }

    private final int getTitleColor() {
        return this.t0.d.e;
    }

    public static AppCompatTextView h(Context context, xkd xkd) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        kqe kqe = i4f.a;
        os2.i.b(appCompatTextView, du4.b);
        appCompatTextView.setTextColor(xkd.getTitleColor());
        appCompatTextView.setEmojiCompatEnabled(false);
        appCompatTextView.setMaxLines(3);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        xkd.addView(appCompatTextView, new ViewGroup.LayoutParams(-2, -2));
        return appCompatTextView;
    }

    public static ShapeDrawable i(xkd xkd) {
        float f = fk4.d().getDisplayMetrics().density * 12.0f;
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = f;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(xkd.getInternalBubbleBackgroundBorderColor());
        shapeDrawable.getPaint().setStrokeWidth(fk4.d().getDisplayMetrics().density * 1.0f);
        shapeDrawable.getPaint().setStyle(Paint.Style.STROKE);
        return shapeDrawable;
    }

    public final void c(is0 is0) {
        this.b.c(is0);
    }

    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        RippleDrawable rippleDrawable = getRippleDrawable();
        Rect rect = this.v0;
        rippleDrawable.setBounds(rect);
        getRippleDrawable().draw(canvas);
        getBorderDrawable().setBounds(rect);
        getBorderDrawable().draw(canvas);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getRippleDrawable().setState(getDrawableState());
        getBorderDrawable().setState(getDrawableState());
        invalidate();
    }

    public final void e(List list, a66 a66) {
        dy8 dy8 = this.B0;
        CharSequence text = dy8.getText();
        if (text != null) {
            if (list == null || list.isEmpty() || a66 == null) {
                dy8.f(dy8);
            } else {
                dy8.g((List) a66.invoke(text.toString(), list));
            }
        }
    }

    public final void f(ix8 ix8, boolean z) {
        this.a.f(ix8, z);
    }

    public final void g(CharSequence charSequence, boolean z) {
        this.G0.c(charSequence, z);
    }

    public int getAliasWidthWithPaddings() {
        return this.o.h0();
    }

    public boolean getDependOnOutsideView() {
        return this.c.a;
    }

    public i33 getOnLinkLongClickListener() {
        return this.A0;
    }

    public final void k(is0 is0, boolean z) {
        this.a.k(is0, z);
    }

    public final void l() {
        this.b.l();
    }

    public final void n(is0 is0) {
        this.t0 = is0;
        je7 je7 = this.D0;
        if (je7.a()) {
            ((AppCompatTextView) je7.getValue()).setTextColor(getTitleColor());
        }
        je7 je72 = this.C0;
        if (je72.a()) {
            ((AppCompatTextView) je72.getValue()).setTextColor(getAdditionalTextColor());
        }
        je7 je73 = this.E0;
        if (je73.a()) {
            ((AppCompatTextView) je73.getValue()).setTextColor(getAdditionalTextColor());
        }
        this.u0.setColor(getInternalBubbleBackgroundColor());
        getRippleDrawable().setColor(ColorStateList.valueOf(getInternalBubbleBackgroundContentColor()));
        getBorderDrawable().getPaint().setColor(getInternalBubbleBackgroundBorderColor());
        setDateTextColor(is0.d.m);
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Rect rect = this.v0;
        if (!rect.isEmpty()) {
            float f = fk4.d().getDisplayMetrics().density * 12.0f;
            canvas.drawRoundRect(new RectF(rect), f, f, this.u0);
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        float f = (float) 10;
        int G = tu0.G(fk4.d().getDisplayMetrics().density * f);
        float f2 = (float) 8;
        int G2 = tu0.G(fk4.d().getDisplayMetrics().density * f2);
        int G3 = tu0.G(f2 * fk4.d().getDisplayMetrics().density);
        y5d y5d = this.z0;
        if (br7.H(y5d.b)) {
            y5d.c(G, G3);
            i5 = rh4.c((float) 4, fk4.d().getDisplayMetrics().density, y5d.a() + G3);
        } else {
            i5 = G;
        }
        s5d s5d = this.o;
        if (br7.H((je7) s5d.c) && br7.H(y5d.b)) {
            s5d.T((getMeasuredWidth() - G) - s5d.L(), ((y5d.a() / 2) - (s5d.K() / 2)) + G3);
        }
        dw8 dw8 = this.b;
        if (br7.H((je7) dw8.c)) {
            dw8.T(G, i5);
            i5 += dw8.K();
        }
        dy8 dy8 = this.B0;
        ote.E(dy8, G, i5, 0, 12);
        int G4 = tu0.G(((float) 6) * fk4.d().getDisplayMetrics().density) + dy8.getMeasuredHeight() + i5 + G2;
        int i7 = G + G2;
        je7 je7 = this.C0;
        if (br7.H(je7)) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) je7.getValue();
            ote.E(appCompatTextView, i7, G4, 0, 12);
            i6 = appCompatTextView.getMeasuredHeight() + G4;
        } else {
            i6 = G4;
        }
        je7 je72 = this.D0;
        if (br7.H(je72)) {
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) je72.getValue();
            ote.E(appCompatTextView2, i7, i6, 0, 12);
            i6 += appCompatTextView2.getMeasuredHeight();
        }
        je7 je73 = this.E0;
        if (br7.H(je73)) {
            AppCompatTextView appCompatTextView3 = (AppCompatTextView) je73.getValue();
            ote.E(appCompatTextView3, i7, i6, 0, 12);
            i6 += appCompatTextView3.getMeasuredHeight();
        }
        je7 je74 = this.F0;
        if (br7.H(je74)) {
            bu6 bu6 = (bu6) je74.getValue();
            boolean z2 = this.w0;
            if (z2) {
                G4 = i6 + G2;
            }
            ote.E(bu6, z2 ? G : ((getMeasuredWidth() - G) - G2) - bu6.getMeasuredWidth(), G4, 0, 12);
            float f3 = this.w0 ? 0.0f : fk4.d().getDisplayMetrics().density * 4.0f;
            float f4 = this.w0 ? fk4.d().getDisplayMetrics().density * 12.0f : 4.0f * fk4.d().getDisplayMetrics().density;
            ((la6) bu6.getHierarchy()).n(wnc.a(f3, f3, f4, f4));
            bu6.getMeasuredHeight();
        }
        r6c r6c = this.a;
        if (br7.H((je7) r6c.c)) {
            r6c.T(tu0.G(f * fk4.d().getDisplayMetrics().density), rh4.q((float) 2, fk4.d().getDisplayMetrics().density, rh4.q(f, fk4.d().getDisplayMetrics().density, getMeasuredHeight())) - r6c.K());
        }
        int measuredWidth = getMeasuredWidth();
        j34 j34 = this.G0;
        ote.E(j34, (measuredWidth - j34.getMeasuredWidth()) - G, rh4.q((float) 4, fk4.d().getDisplayMetrics().density, getMeasuredHeight() - j34.getMeasuredHeight()), 0, 12);
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = i2;
        int size = getDependOnOutsideView() ? View.MeasureSpec.getSize(i) : wg0.m((float) 10, fk4.d().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        float f = (float) 10;
        int G = tu0.G(fk4.d().getDisplayMetrics().density * f);
        dy8 dy8 = this.B0;
        dy8.h();
        int i7 = G * 2;
        int max = Math.max(dy8.getMeasuredWidth() + i7, size);
        int i8 = max - i7;
        float f2 = (float) 8;
        int G2 = tu0.G(fk4.d().getDisplayMetrics().density * f2);
        s5d s5d = this.o;
        boolean H = br7.H((je7) s5d.c);
        y5d y5d = this.z0;
        if (H && br7.H(y5d.b)) {
            s5d.U(View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE), i6);
            max = Math.max(max, s5d.L());
        }
        if (br7.H(y5d.b)) {
            y5d.d(View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE), i6);
            max = Math.max(max, y5d.b() + i7 + s5d.h0());
            i3 = rh4.c((float) 4, fk4.d().getDisplayMetrics().density, y5d.a() + tu0.G(fk4.d().getDisplayMetrics().density * f2));
        } else {
            i3 = G;
        }
        dw8 dw8 = this.b;
        if (br7.H((je7) dw8.c)) {
            dw8.U(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), i6);
            max = Math.max(max, (tu0.G(fk4.d().getDisplayMetrics().density * f) * 2) + dw8.L());
            i3 += dw8.K();
        }
        int d = wg0.d((float) 6, fk4.d().getDisplayMetrics().density, dy8.getMeasuredHeight(), i3);
        int i9 = G2 * 2;
        int i10 = i8 - i9;
        je7 je7 = this.F0;
        boolean z = false;
        boolean z2 = true;
        if (br7.H(je7)) {
            bu6 bu6 = (bu6) je7.getValue();
            boolean z3 = bu6.getImageAttach().c * 2 >= i8;
            this.w0 = z3;
            if (z3) {
                bu6.measure(View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(tu0.G(((float) 128) * fk4.d().getDisplayMetrics().density), 1073741824));
            } else {
                int G3 = tu0.G(((float) 32) * fk4.d().getDisplayMetrics().density);
                bu6.measure(View.MeasureSpec.makeMeasureSpec(G3, 1073741824), View.MeasureSpec.makeMeasureSpec(G3, 1073741824));
                i10 -= G3 + G2;
            }
            z = true;
        }
        je7 je72 = this.C0;
        if (br7.H(je72)) {
            i4 = Integer.MIN_VALUE;
            ((AppCompatTextView) je72.getValue()).measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i6);
            z = true;
        } else {
            i4 = Integer.MIN_VALUE;
        }
        je7 je73 = this.D0;
        if (br7.H(je73)) {
            ((AppCompatTextView) je73.getValue()).measure(View.MeasureSpec.makeMeasureSpec(i10, i4), i6);
            z = true;
        }
        je7 je74 = this.E0;
        if (br7.H(je74)) {
            ((AppCompatTextView) je74.getValue()).measure(View.MeasureSpec.makeMeasureSpec(i10, i4), i6);
        } else {
            z2 = z;
        }
        if (z2) {
            int A = br7.A(je74) + br7.A(je73) + br7.A(je72) + i9;
            if (this.w0) {
                i5 = br7.A(je7) + A;
            } else {
                int A2 = br7.A(je7) + i9;
                if (A < A2) {
                    A = A2;
                }
                i5 = A;
            }
            int i11 = i5 + d;
            this.v0.set(G, d, max - G, i11);
            d = i11;
        }
        r6c r6c = this.a;
        if (br7.H((je7) r6c.c)) {
            r6c.U(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), i6);
            d = wg0.d(f, fk4.d().getDisplayMetrics().density, r6c.K(), d);
            max = Math.max(max, (tu0.G(fk4.d().getDisplayMetrics().density * f) * 2) + r6c.L());
        }
        j34 j34 = this.G0;
        j34.measure(i, i6);
        setMeasuredDimension(max, d + (br7.H((je7) r6c.c) ? tu0.G(f * fk4.d().getDisplayMetrics().density) : rh4.c(f2, fk4.d().getDisplayMetrics().density, j34.getMeasuredHeight() + tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density))));
    }

    public final void q(boolean z) {
        this.a.q(z);
    }

    public void setAlias(Layout layout) {
        this.o.setAlias(layout);
    }

    public void setAliasColor(int i) {
        this.o.setAliasColor(i);
    }

    public void setChipObserver(w5c w5c) {
        this.a.setChipObserver(w5c);
    }

    public void setDateBackgroundColor(int i) {
    }

    public void setDateTextColor(int i) {
        this.G0.setTextColor$message_list_release(i);
    }

    public void setDateViewStatus(zof zof) {
        this.G0.setStatus$message_list_release(zof);
    }

    public void setDependOnOutsideView(boolean z) {
        this.c.a = z;
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

    public void setOnLinkLongClickListener(i33 i33) {
        this.A0 = i33;
    }

    public void setReplyClickListener(a66 a66) {
        this.b.o = a66;
    }

    public void setSenderName(Layout layout) {
        this.z0.e(layout);
    }

    public void setSenderNameColor(int i) {
        this.z0.f(i);
    }

    public void setStackFromEnd(boolean z) {
        this.a.Z = z;
    }

    public void setTextMessageColors(is0 is0) {
        this.B0.setTextColors(is0);
    }

    public void setTextMessageLayout(by8 by8) {
        this.B0.setLayout(by8);
    }

    public void setTextMessageLinkClickListener(hk7 hk7) {
        this.B0.setLinkListener(hk7);
    }
}
