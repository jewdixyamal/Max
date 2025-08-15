package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: csb  reason: default package */
public final class csb extends ViewGroup implements kre {
    public final TextView a;
    public final h2a b;
    public final bsb c;
    public final je7 o;
    public final Paint s0;
    public final je7 t0;
    public final je7 u0;
    public final int v0 = tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density);
    public final int w0;

    public csb(Context context) {
        super(context);
        TextView textView = new TextView(context);
        i4f.t.b(textView, du4.b);
        pq9 pq9 = qp4.u0;
        textView.setTextColor(pq9.j(textView).getText().g);
        textView.setSingleLine();
        textView.setFallbackLineSpacing(false);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setFocusable(0);
        this.a = textView;
        h2a h2a = new h2a(context);
        i4f.m.b(h2a, du4.b);
        h2a.setTextColor(pq9.j(h2a).getText().h);
        h2a.setSingleLine();
        h2a.setFallbackLineSpacing(false);
        h2a.setEllipsize(truncateAt);
        h2a.setFocusable(0);
        np8.n(h2a);
        h2a.setVisibility(8);
        this.b = h2a;
        bsb bsb = new bsb(context);
        bsb.setVisibility(8);
        this.c = bsb;
        this.o = tu0.r(3, new xda(context, 16));
        Paint paint = new Paint();
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(pq9.j(this).i().h);
        this.s0 = paint;
        this.t0 = tu0.r(3, new xda(context, 17));
        this.u0 = tu0.r(3, new xda(context, 18));
        float f = (float) 4;
        this.w0 = tu0.G(fk4.d().getDisplayMetrics().density * f);
        float f2 = (float) 6;
        setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f2 * fk4.d().getDisplayMetrics().density), tu0.G(f * fk4.d().getDisplayMetrics().density));
        addView(textView);
        addView(h2a);
        addView(bsb);
        onThemeChanged(pq9.j(this));
    }

    private final void setCounter(int i) {
        je7 je7 = this.o;
        caa caa = (caa) je7.getValue();
        caa.setVisibility(0);
        caa.g(i, false);
        br7.b(this, (View) je7.getValue(), (Integer) null);
        requestLayout();
        invalidate();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: uf5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: uf5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: sf5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: uf5} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r8, java.lang.String r9, java.lang.Integer r10, boolean r11) {
        /*
            r7 = this;
            bsb r7 = r7.c
            r7.getClass()
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L_0x0016
            if (r9 == 0) goto L_0x0011
            boolean r2 = defpackage.w9e.C0(r9)
            if (r2 == 0) goto L_0x0016
        L_0x0011:
            if (r10 == 0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            r2 = r1
            goto L_0x0017
        L_0x0016:
            r2 = r0
        L_0x0017:
            r3 = 8
            if (r2 == 0) goto L_0x001d
            r2 = r1
            goto L_0x001e
        L_0x001d:
            r2 = r3
        L_0x001e:
            r7.setVisibility(r2)
            one.me.sdk.uikit.common.views.OneMeDraweeView r2 = r7.b
            r4 = 0
            if (r9 == 0) goto L_0x002b
            wv6 r5 = defpackage.wv6.b(r9)
            goto L_0x002c
        L_0x002b:
            r5 = r4
        L_0x002c:
            int r6 = one.me.sdk.uikit.common.views.OneMeDraweeView.B0
            r2.o(r5, r4)
            rq4 r5 = r2.getHierarchy()
            la6 r5 = (defpackage.la6) r5
            if (r11 == 0) goto L_0x0041
            wnc r11 = new wnc
            r11.<init>()
            r11.b = r0
            goto L_0x0042
        L_0x0041:
            r11 = r4
        L_0x0042:
            r5.n(r11)
            je7 r11 = r7.o
            if (r9 == 0) goto L_0x0070
            boolean r9 = defpackage.w9e.C0(r9)
            if (r9 == 0) goto L_0x0050
            goto L_0x0070
        L_0x0050:
            r2.setVisibility(r1)
            boolean r8 = r11.a()
            if (r8 == 0) goto L_0x0062
            java.lang.Object r8 = r11.getValue()
            android.view.View r8 = (android.view.View) r8
            r8.setVisibility(r3)
        L_0x0062:
            rq4 r8 = r2.getHierarchy()
            la6 r8 = (defpackage.la6) r8
            r8.i(r4, r0)
            r7.setPadding(r1, r1, r1, r1)
            goto L_0x0114
        L_0x0070:
            if (r8 == 0) goto L_0x00bd
            r2.setVisibility(r3)
            java.lang.Object r9 = r11.getValue()
            android.view.View r9 = (android.view.View) r9
            r9.setVisibility(r1)
            r7.setPadding(r1, r1, r1, r1)
            java.lang.String r8 = defpackage.w9e.V0(r8)
            v25 r9 = defpackage.sf5.c
            java.util.Iterator r9 = r9.iterator()
        L_0x008b:
            r10 = r9
            u1 r10 = (defpackage.u1) r10
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00a6
            java.lang.Object r10 = r10.next()
            r11 = r10
            sf5 r11 = (defpackage.sf5) r11
            java.lang.String r11 = r11.name()
            boolean r11 = defpackage.eae.k0(r11, r8, r0)
            if (r11 == 0) goto L_0x008b
            r4 = r10
        L_0x00a6:
            sf5 r4 = (defpackage.sf5) r4
            if (r4 == 0) goto L_0x00ab
            goto L_0x00b1
        L_0x00ab:
            tf5 r9 = defpackage.tf5.c
            tf5 r4 = defpackage.ema.w(r8)
        L_0x00b1:
            je7 r7 = r7.c
            java.lang.Object r7 = r7.getValue()
            ph5 r7 = (defpackage.ph5) r7
            r7.a(r4)
            goto L_0x0114
        L_0x00bd:
            if (r10 == 0) goto L_0x0114
            r2.setVisibility(r1)
            boolean r8 = r11.a()
            if (r8 == 0) goto L_0x00d1
            java.lang.Object r8 = r11.getValue()
            android.view.View r8 = (android.view.View) r8
            r8.setVisibility(r3)
        L_0x00d1:
            rq4 r8 = r2.getHierarchy()
            la6 r8 = (defpackage.la6) r8
            android.content.Context r9 = r7.getContext()
            int r10 = r10.intValue()
            pq9 r11 = defpackage.qp4.u0
            fka r1 = r11.j(r7)
            bs6 r1 = r1.getIcon()
            int r1 = r1.i
            android.graphics.drawable.Drawable r9 = defpackage.ngg.u(r10, r1, r9)
            r8.i(r9, r0)
            float r8 = (float) r3
            android.content.res.Resources r9 = defpackage.fk4.d()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            float r8 = r8 * r9
            int r8 = defpackage.tu0.G(r8)
            r7.setPadding(r8, r8, r8, r8)
            fka r8 = r11.j(r7)
            ne0 r8 = r8.b()
            me0 r8 = r8.a
            int r8 = r8.g
            r7.setBackgroundColor(r8)
        L_0x0114:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csb.a(java.lang.String, java.lang.String, java.lang.Integer, boolean):void");
    }

    public final void dispatchDraw(Canvas canvas) {
        float f;
        float strokeWidth;
        float measuredWidth;
        float strokeWidth2;
        float f2;
        boolean K = c54.K(this);
        je7 je7 = this.t0;
        Paint paint = this.s0;
        if (K) {
            if (br7.H(je7)) {
                f2 = (float) 2;
                measuredWidth = (float) rh4.q(f2, fk4.d().getDisplayMetrics().density, (getMeasuredWidth() - getPaddingEnd()) - br7.B(je7));
                strokeWidth2 = paint.getStrokeWidth();
            } else {
                measuredWidth = (float) (getMeasuredWidth() - getPaddingEnd());
                strokeWidth2 = paint.getStrokeWidth();
                f2 = (float) 2;
            }
            f = measuredWidth - (strokeWidth2 / f2);
        } else {
            if (br7.H(je7)) {
                int B = br7.B(je7) + getPaddingStart();
                float f3 = (float) 2;
                strokeWidth = (paint.getStrokeWidth() / f3) + ((float) rh4.c(f3, fk4.d().getDisplayMetrics().density, B));
            } else {
                strokeWidth = (paint.getStrokeWidth() / ((float) 2)) + ((float) getPaddingStart());
            }
            f = strokeWidth;
        }
        canvas.drawLine(f, (float) getPaddingTop(), f, (float) (getMeasuredHeight() - getPaddingBottom()), paint);
        super.dispatchDraw(canvas);
    }

    public final boolean drawChild(Canvas canvas, View view, long j) {
        je7 je7 = this.o;
        if (!je7.a() || view != je7.getValue() || this.c.getVisibility() == 0) {
            return super.drawChild(canvas, view, j);
        }
        return true;
    }

    public final TextView getTitleView() {
        return this.a;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingStart = getPaddingStart();
        je7 je7 = this.t0;
        if (br7.H(je7)) {
            ImageView imageView = (ImageView) je7.getValue();
            ote.D(imageView, paddingStart, (getMeasuredHeight() / 2) - (imageView.getMeasuredHeight() / 2), imageView.getMeasuredWidth() + paddingStart, (imageView.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2));
            paddingStart = wg0.d((float) 2, fk4.d().getDisplayMetrics().density, imageView.getMeasuredWidth(), paddingStart);
        }
        int G = tu0.G(this.s0.getStrokeWidth());
        int i5 = this.v0;
        int i6 = G + i5 + paddingStart;
        bsb bsb = this.c;
        if (bsb.getVisibility() == 0) {
            ote.D(bsb, i6, (getMeasuredHeight() / 2) - (bsb.getMeasuredHeight() / 2), bsb.getMeasuredWidth() + i6, (bsb.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2));
            i6 += bsb.getMeasuredWidth() + i5;
            je7 je72 = this.o;
            if (je72.a()) {
                caa caa = (caa) je72.getValue();
                float f = (float) 2;
                ote.D(caa, rh4.q(f, fk4.d().getDisplayMetrics().density, bsb.getLeft()), rh4.c(f, fk4.d().getDisplayMetrics().density, bsb.getBottom()) - caa.getMeasuredHeight(), caa.getMeasuredWidth() + rh4.q(f, fk4.d().getDisplayMetrics().density, bsb.getLeft()), rh4.c(f, fk4.d().getDisplayMetrics().density, bsb.getBottom()));
            }
        }
        h2a h2a = this.b;
        int visibility = h2a.getVisibility();
        TextView textView = this.a;
        if (visibility == 0) {
            float f2 = (float) 4;
            ote.E(textView, i6, rh4.c(f2, fk4.d().getDisplayMetrics().density, getPaddingTop()), 0, 12);
            int q = rh4.q(f2, fk4.d().getDisplayMetrics().density, getMeasuredHeight() - getPaddingBottom());
            ote.D(h2a, i6, q - h2a.getMeasuredHeight(), h2a.getMeasuredWidth() + i6, q);
        } else {
            ote.D(textView, i6, (getMeasuredHeight() / 2) - (textView.getMeasuredHeight() / 2), textView.getMeasuredWidth() + i6, (textView.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2));
        }
        je7 je73 = this.u0;
        if (br7.H(je73)) {
            ImageView imageView2 = (ImageView) je73.getValue();
            int q2 = rh4.q((float) 36, fk4.d().getDisplayMetrics().density, getMeasuredWidth() - getPaddingEnd());
            ote.D(imageView2, q2, (getMeasuredHeight() / 2) - (imageView2.getMeasuredHeight() / 2), imageView2.getMeasuredWidth() + q2, (imageView2.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2));
        }
    }

    public final void onMeasure(int i, int i2) {
        Paint paint = this.s0;
        paint.setStrokeWidth(fk4.d().getDisplayMetrics().density * 2.0f);
        int size = View.MeasureSpec.getMode(i) == 0 ? getContext().getResources().getDisplayMetrics().widthPixels : View.MeasureSpec.getSize(i);
        int G = tu0.G(paint.getStrokeWidth()) + getPaddingStart();
        int i3 = this.v0;
        int paddingEnd = getPaddingEnd() + G + i3;
        je7 je7 = this.t0;
        if (br7.H(je7)) {
            int G2 = tu0.G(((float) 40) * fk4.d().getDisplayMetrics().density);
            ((ImageView) je7.getValue()).measure(View.MeasureSpec.makeMeasureSpec(G2, 1073741824), View.MeasureSpec.makeMeasureSpec(G2, 1073741824));
            paddingEnd = wg0.d((float) 2, fk4.d().getDisplayMetrics().density, ((ImageView) je7.getValue()).getMeasuredWidth(), paddingEnd);
        }
        bsb bsb = this.c;
        if (bsb.getVisibility() == 0) {
            int G3 = tu0.G(((float) 40) * fk4.d().getDisplayMetrics().density);
            bsb.measure(View.MeasureSpec.makeMeasureSpec(G3, 1073741824), View.MeasureSpec.makeMeasureSpec(G3, 1073741824));
            paddingEnd += bsb.getMeasuredWidth() + i3;
            je7 je72 = this.o;
            if (je72.a()) {
                ((caa) je72.getValue()).measure(0, 0);
            }
        }
        je7 je73 = this.u0;
        if (br7.H(je73)) {
            int G4 = tu0.G(((float) 36) * fk4.d().getDisplayMetrics().density);
            ((ImageView) je73.getValue()).measure(View.MeasureSpec.makeMeasureSpec(G4, 1073741824), View.MeasureSpec.makeMeasureSpec(G4, 1073741824));
            paddingEnd = wg0.d((float) 6, fk4.d().getDisplayMetrics().density, ((ImageView) je73.getValue()).getMeasuredWidth(), paddingEnd);
        }
        int i4 = size - paddingEnd;
        if (i4 < 0) {
            i4 = 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        TextView textView = this.a;
        textView.measure(makeMeasureSpec, 0);
        int measuredHeight = textView.getMeasuredHeight() + getPaddingTop() + getPaddingBottom();
        int i5 = this.w0;
        int i6 = (i5 * 2) + measuredHeight;
        h2a h2a = this.b;
        if (h2a.getVisibility() == 0) {
            h2a.measure(makeMeasureSpec, 0);
            i6 += h2a.getMeasuredHeight() + i5;
        }
        if (bsb.getVisibility() == 0) {
            setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + (tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density) * 2) + bsb.getMeasuredHeight());
        } else {
            setMeasuredDimension(size, i6);
        }
    }

    public final void onThemeChanged(fka fka) {
        this.a.setTextColor(fka.getText().g);
        this.b.setTextColor(fka.getText().h);
        this.s0.setColor(fka.i().h);
        je7 je7 = this.o;
        if (je7.a()) {
            ((caa) je7.getValue()).f(fka);
        }
        je7 je72 = this.t0;
        if (je72.a()) {
            ((ImageView) je72.getValue()).setImageTintList(ColorStateList.valueOf(fka.getIcon().k));
        }
        je7 je73 = this.u0;
        if (je73.a()) {
            ((ImageView) je73.getValue()).setImageTintList(ColorStateList.valueOf(fka.getIcon().i));
        }
        bsb bsb = this.c;
        je7 je74 = bsb.c;
        if (je74.a()) {
            ((ph5) je74.getValue()).onThemeChanged(fka);
        }
        OneMeDraweeView oneMeDraweeView = bsb.b;
        if (((la6) oneMeDraweeView.getHierarchy()).e.a(1) != null) {
            oneMeDraweeView.setBackgroundColor(fka.b().a.g);
        }
        je7 je75 = bsb.s0;
        if (je75.a() && ((LayerDrawable) je75.getValue()).getNumberOfLayers() > 1) {
            LayerDrawable layerDrawable = (LayerDrawable) je75.getValue();
            ne0 b2 = fka.b();
            Drawable drawable = layerDrawable.getDrawable(0);
            ngg.G(drawable, b2.e);
            layerDrawable.setDrawable(0, drawable);
            LayerDrawable layerDrawable2 = (LayerDrawable) je75.getValue();
            bs6 icon = fka.getIcon();
            Drawable drawable2 = layerDrawable2.getDrawable(1);
            ngg.G(drawable2, icon.b);
            layerDrawable2.setDrawable(1, drawable2);
        }
    }

    public final void setAttachDescription(ez ezVar) {
        Integer num = null;
        setBody(ezVar != null ? ezVar.a : null);
        String str = ezVar != null ? ezVar.b : null;
        String str2 = ezVar != null ? ezVar.c : null;
        Integer num2 = ezVar != null ? ezVar.d : null;
        boolean z = false;
        if (ezVar != null && ezVar.f) {
            z = true;
        }
        a(str, str2, num2, z);
        if (ezVar != null) {
            num = ezVar.e;
        }
        setCounter(num);
    }

    public final void setBody(CharSequence charSequence) {
        h2a h2a = this.b;
        if (charSequence == null || w9e.C0(charSequence)) {
            h2a.setVisibility(8);
            return;
        }
        h2a.setVisibility(0);
        h2a.setText(charSequence);
        requestLayout();
        invalidate();
    }

    public final void setDrawOverlay(boolean z) {
        this.c.setDrawOverlay(z);
    }

    public final void setEndIconClickListener(View.OnClickListener onClickListener) {
        je7 je7 = this.u0;
        if (je7.a()) {
            tu0.K((ImageView) je7.getValue(), 300, onClickListener);
        }
    }

    public final void setEndIconDrawable(Drawable drawable) {
        je7 je7 = this.u0;
        if (drawable != null) {
            ImageView imageView = (ImageView) je7.getValue();
            imageView.setImageDrawable(drawable);
            imageView.setVisibility(0);
            br7.b(this, (View) je7.getValue(), -1);
        } else if (je7.a()) {
            ImageView imageView2 = (ImageView) je7.getValue();
            imageView2.setImageDrawable((Drawable) null);
            imageView2.setVisibility(8);
        }
        requestLayout();
        invalidate();
    }

    public final void setImageClickListener(View.OnClickListener onClickListener) {
        tu0.K(this.c, 300, onClickListener);
    }

    public final void setStartIconClickListener(View.OnClickListener onClickListener) {
        je7 je7 = this.t0;
        if (je7.a()) {
            tu0.K((ImageView) je7.getValue(), 300, onClickListener);
        }
    }

    public final void setStartIconDrawable(Drawable drawable) {
        je7 je7 = this.t0;
        if (drawable != null) {
            ImageView imageView = (ImageView) je7.getValue();
            imageView.setImageDrawable(drawable);
            imageView.setVisibility(0);
            br7.b(this, (View) je7.getValue(), -1);
        } else if (je7.a()) {
            ImageView imageView2 = (ImageView) je7.getValue();
            imageView2.setImageDrawable((Drawable) null);
            imageView2.setVisibility(8);
        }
        requestLayout();
        invalidate();
    }

    public final void setTitle(CharSequence charSequence) {
        this.a.setText(charSequence);
        requestLayout();
        invalidate();
    }

    public final void setCounter(Integer num) {
        if (num == null) {
            je7 je7 = this.o;
            if (je7.a()) {
                ((caa) je7.getValue()).setVisibility(8);
                return;
            }
            return;
        }
        setCounter(num.intValue());
    }
}
