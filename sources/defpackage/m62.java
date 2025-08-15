package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.BitSet;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* renamed from: m62  reason: default package */
public final class m62 extends ViewGroup implements kre {
    public final View A0;
    public final View B0;
    public final View C0;
    public final BitSet D0;
    public final BitSet E0;
    public final int F0;
    public final int G0;
    public final int H0;
    public final int I0;
    public final int J0;
    public final int K0;
    public final int L0;
    public final int M0;
    public final int N0;
    public boolean O0;
    public final cu1 P0;
    public long Q0;
    public final e4f R0;
    public final s5a a;
    public final TextView b;
    public final iw4 c;
    public final iw4 o;
    public final TextView s0;
    public final uv9 t0;
    public Drawable u0;
    public final je7 v0;
    public final je7 w0 = tu0.r(3, new k62(this, 0));
    public final je7 x0 = tu0.r(3, new k62(this, 1));
    public final je7 y0;
    public final je7 z0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public m62(android.content.Context r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r3)
            s5a r2 = new s5a
            r2.<init>(r1)
            r2.setFocusable(r3)
            r0.a = r2
            android.widget.TextView r4 = new android.widget.TextView
            r4.<init>(r1)
            kqe r5 = defpackage.i4f.I
            r5.b(r4, defpackage.du4.b)
            pq9 r5 = defpackage.qp4.u0
            fka r6 = r5.j(r4)
            xoe r6 = r6.getText()
            int r6 = r6.e
            r4.setTextColor(r6)
            r4.setSingleLine()
            r4.setFallbackLineSpacing(r3)
            android.text.TextUtils$TruncateAt r6 = android.text.TextUtils.TruncateAt.END
            r4.setEllipsize(r6)
            r4.setFocusable(r3)
            r0.b = r4
            iw4 r7 = new iw4
            r7.<init>(r1)
            kqe r8 = defpackage.i4f.K
            r8.b(r7, defpackage.du4.b)
            fka r9 = r5.j(r7)
            xoe r9 = r9.getText()
            int r9 = r9.g
            r7.setTextColor(r9)
            r9 = 2
            r7.setMaxLines(r9)
            r7.setFallbackLineSpacing(r3)
            r7.setEllipsize(r6)
            r7.setFocusable(r3)
            defpackage.np8.n(r7)
            r0.c = r7
            iw4 r10 = new iw4
            r10.<init>(r1)
            r8.b(r10, defpackage.du4.b)
            fka r8 = r5.j(r10)
            xoe r8 = r8.getText()
            int r8 = r8.g
            r10.setTextColor(r8)
            r10.setFallbackLineSpacing(r3)
            r10.setMaxLines(r9)
            r10.setEllipsize(r6)
            r10.setFocusable(r3)
            r0.o = r10
            android.widget.TextView r6 = new android.widget.TextView
            r6.<init>(r1)
            kqe r8 = defpackage.i4f.J
            r8.b(r6, defpackage.du4.b)
            r6.setFallbackLineSpacing(r3)
            fka r8 = r5.j(r6)
            xoe r8 = r8.getText()
            int r8 = r8.i
            r6.setTextColor(r8)
            r6.setFocusable(r3)
            r0.s0 = r6
            uv9 r8 = new uv9
            r8.<init>(r1)
            r8.setFocusable(r3)
            r0.t0 = r8
            j62 r11 = new j62
            r12 = 0
            r11.<init>(r1, r0, r12)
            r12 = 3
            je7 r11 = defpackage.tu0.r(r12, r11)
            r0.v0 = r11
            k62 r11 = new k62
            r13 = 0
            r11.<init>(r0, r13)
            je7 r11 = defpackage.tu0.r(r12, r11)
            r0.w0 = r11
            k62 r11 = new k62
            r13 = 1
            r11.<init>(r0, r13)
            je7 r11 = defpackage.tu0.r(r12, r11)
            r0.x0 = r11
            j62 r11 = new j62
            r11.<init>(r1, r0, r13)
            je7 r11 = defpackage.tu0.r(r12, r11)
            r0.y0 = r11
            k62 r11 = new k62
            r13 = 2
            r11.<init>(r0, r13)
            je7 r11 = defpackage.tu0.r(r12, r11)
            r0.z0 = r11
            android.view.View r11 = new android.view.View
            r11.<init>(r1)
            int r13 = defpackage.woc.D1
            android.content.Context r14 = r11.getContext()
            android.graphics.drawable.Drawable r13 = defpackage.kt3.b(r14, r13)
            fka r14 = r5.j(r11)
            bs6 r14 = r14.getIcon()
            int r14 = r14.h
            defpackage.ngg.G(r13, r14)
            r11.setBackground(r13)
            r11.setFocusable(r3)
            r0.A0 = r11
            android.view.View r13 = new android.view.View
            r13.<init>(r1)
            int r14 = defpackage.woc.t1
            android.content.Context r15 = r13.getContext()
            android.graphics.drawable.Drawable r14 = defpackage.kt3.b(r15, r14)
            fka r15 = r5.j(r13)
            bs6 r15 = r15.getIcon()
            int r15 = r15.h
            defpackage.ngg.G(r14, r15)
            r13.setBackground(r14)
            r13.setFocusable(r3)
            r0.B0 = r13
            android.view.View r14 = new android.view.View
            r14.<init>(r1)
            android.graphics.drawable.ColorDrawable r15 = new android.graphics.drawable.ColorDrawable
            r12 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
            r15.<init>(r12)
            r14.setBackground(r15)
            r14.setFocusable(r3)
            r0.C0 = r14
            java.util.BitSet r12 = new java.util.BitSet
            r15 = 8
            r12.<init>(r15)
            r0.D0 = r12
            java.util.BitSet r3 = new java.util.BitSet
            r3.<init>(r15)
            r0.E0 = r3
            r15 = 1
            r0.F0 = r15
            r0.G0 = r9
            r9 = 3
            r0.H0 = r9
            r9 = 4
            r0.I0 = r9
            r9 = 5
            r0.J0 = r9
            r9 = 6
            r0.K0 = r9
            r15 = 7
            r0.L0 = r15
            r15 = 8
            r0.M0 = r15
            r15 = 9
            r0.N0 = r15
            cu1 r15 = new cu1
            r9 = 11
            r15.<init>(r9, r0)
            r0.P0 = r15
            e4f r9 = new e4f
            qp4 r1 = r5.b(r1)
            fka r1 = r1.i()
            we1 r5 = new we1
            r15 = 7
            r5.<init>(r15)
            r9.<init>(r1, r5)
            r1 = 20
            float r1 = (float) r1
            android.content.res.Resources r5 = defpackage.fk4.d()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r1 = r1 * r5
            int r1 = defpackage.tu0.G(r1)
            r5 = 0
            r9.setBounds(r5, r5, r1, r1)
            r9.setCallback(r0)
            r0.R0 = r9
            android.graphics.drawable.RippleDrawable r1 = r16.getRippleDrawable()
            r0.setBackground(r1)
            r0.addView(r2)
            r1 = -1
            r2 = -2
            r0.addView(r4, r1, r2)
            r0.addView(r7, r1, r2)
            r0.addView(r10, r1, r2)
            r0.addView(r6)
            r0.addView(r13)
            r0.addView(r8)
            r0.addView(r11)
            r0.addView(r14)
            r1 = 6
            float r1 = (float) r1
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r1
            int r2 = defpackage.tu0.G(r2)
            r4 = 10
            float r4 = (float) r4
            android.content.res.Resources r5 = defpackage.fk4.d()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r5 = r5 * r4
            int r5 = defpackage.tu0.G(r5)
            android.content.res.Resources r6 = defpackage.fk4.d()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r1 = r1 * r6
            int r1 = defpackage.tu0.G(r1)
            android.content.res.Resources r6 = defpackage.fk4.d()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r4 = r4 * r6
            int r4 = defpackage.tu0.G(r4)
            r0.setPadding(r2, r5, r1, r4)
            int r0 = r12.size()
            r1 = 0
            r2 = 1
            r12.set(r1, r0, r2)
            int r0 = r3.size()
            r3.set(r1, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m62.<init>(android.content.Context):void");
    }

    private final RippleDrawable getRippleDrawable() {
        return (RippleDrawable) this.z0.getValue();
    }

    public final boolean a(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        iw4 iw4 = this.c;
        return iw4.getPaint().measureText(str) > ((float) iw4.getMeasuredWidth());
    }

    public final boolean b(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        TextView textView = this.b;
        return textView.getPaint().measureText(str) > ((float) textView.getMeasuredWidth());
    }

    public final void c(Uri uri, CharSequence charSequence, Long l) {
        String uri2 = uri != null ? uri.toString() : null;
        Long valueOf = Long.valueOf(l.longValue());
        if (charSequence == null) {
            charSequence = "";
        }
        s5a.i(this.a, uri2, valueOf, charSequence);
        this.D0.set(0, true);
        requestLayout();
        this.E0.set(0, true);
    }

    public final void d(BitSet bitSet, boolean z) {
        bitSet.set(this.I0, z);
    }

    public final void e(int i, boolean z) {
        uv9 uv9 = this.t0;
        tv9 tv9 = uv9.o;
        int i2 = tv9.a;
        tv9 a2 = tv9.a(tv9, i, false, false, false, 14);
        uv9.o = a2;
        boolean z2 = false;
        if (i2 != i) {
            BitSet bitSet = uv9.s0;
            int i3 = uv9.u0;
            boolean z3 = z && bitSet.get(i3);
            caa caa = uv9.x0;
            caa.g(a2.a, z3);
            caa.setAppearance(a2.d ? x9a.c : x9a.a);
            bitSet.set(i3, a2.e);
            uv9.requestLayout();
        }
        BitSet bitSet2 = this.E0;
        int i4 = this.I0;
        if (bitSet2.get(i4) || i > 0) {
            z2 = true;
        }
        bitSet2.set(i4, z2);
        d(this.D0, true);
        requestLayout();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: qe} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAttachedToWindow() {
        /*
            r3 = this;
            super.onAttachedToWindow()
            pq9 r0 = defpackage.qp4.u0
            fka r0 = r0.j(r3)
            r3.onThemeChanged(r0)
            iw4 r0 = r3.o
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0019
            e4f r0 = r3.R0
            r0.start()
        L_0x0019:
            android.graphics.drawable.Drawable r0 = r3.u0
            if (r0 == 0) goto L_0x003d
            je7 r3 = r3.v0
            boolean r1 = r3.a()
            r2 = 0
            if (r1 == 0) goto L_0x0028
            r1 = r3
            goto L_0x0029
        L_0x0028:
            r1 = r2
        L_0x0029:
            if (r1 == 0) goto L_0x0032
            java.lang.Object r1 = r1.getValue()
            r2 = r1
            qe r2 = (defpackage.qe) r2
        L_0x0032:
            if (r0 != r2) goto L_0x003d
            java.lang.Object r3 = r3.getValue()
            qe r3 = (defpackage.qe) r3
            r3.start()
        L_0x003d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m62.onAttachedToWindow():void");
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        BitSet bitSet = this.D0;
        bitSet.set(0, bitSet.size(), true);
        requestLayout();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: qe} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDetachedFromWindow() {
        /*
            r2 = this;
            super.onDetachedFromWindow()
            e4f r0 = r2.R0
            r0.stop()
            je7 r2 = r2.v0
            boolean r0 = r2.a()
            r1 = 0
            if (r0 == 0) goto L_0x0013
            r0 = r2
            goto L_0x0014
        L_0x0013:
            r0 = r1
        L_0x0014:
            if (r0 == 0) goto L_0x001d
            java.lang.Object r0 = r0.getValue()
            r1 = r0
            qe r1 = (defpackage.qe) r1
        L_0x001d:
            if (r1 == 0) goto L_0x0034
            java.lang.Object r0 = r2.getValue()
            qe r0 = (defpackage.qe) r0
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x0034
            java.lang.Object r2 = r2.getValue()
            qe r2 = (defpackage.qe) r2
            r2.stop()
        L_0x0034:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m62.onDetachedFromWindow():void");
    }

    /* JADX INFO: finally extract failed */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        iw4 iw4 = this.o;
        if (iw4.getVisibility() == 0) {
            Rect bottomLineRect = iw4.getBottomLineRect();
            if (!bottomLineRect.isEmpty()) {
                bottomLineRect.offset(iw4.getLeft(), iw4.getTop());
                e4f e4f = this.R0;
                int save = canvas.save();
                canvas.translate(((float) bottomLineRect.right) - ((float) e4f.getBounds().width()), (float) bottomLineRect.top);
                try {
                    e4f.draw(canvas);
                    canvas.restoreToCount(save);
                    e4f.start();
                } catch (Throwable th) {
                    canvas.restoreToCount(save);
                    throw th;
                }
            }
        } else {
            Drawable drawable = this.u0;
            if (drawable != null && drawable != null) {
                TextView textView = this.s0;
                float x = (textView.getX() - ((float) tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density))) - ((float) tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density));
                float y = textView.getY();
                int save2 = canvas.save();
                canvas.translate(x, y);
                try {
                    drawable.draw(canvas);
                } finally {
                    canvas.restoreToCount(save2);
                }
            }
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth;
        int i5;
        int i6;
        float measuredHeight = ((float) (getMeasuredHeight() - (getPaddingBottom() + getPaddingTop()))) / 2.0f;
        s5a s5a = this.a;
        int paddingTop = (int) ((measuredHeight + ((float) getPaddingTop())) - (((float) s5a.getMeasuredWidth()) / 2.0f));
        BitSet bitSet = this.E0;
        int i7 = 0;
        if (bitSet.get(0)) {
            c54.L(getPaddingStart(), paddingTop, getPaddingStart() + s5a.getMeasuredWidth(), s5a.getMeasuredHeight() + paddingTop, this.a, this);
        }
        float f = (float) 12;
        int c2 = rh4.c(f, fk4.d().getDisplayMetrics().density, s5a.getMeasuredWidth() + getPaddingStart());
        boolean z2 = bitSet.get(this.F0);
        TextView textView = this.b;
        if (z2) {
            c54.L(c2, getPaddingTop(), textView.getMeasuredWidth() + c2, textView.getMeasuredHeight() + getPaddingTop(), textView, this);
        }
        float measuredHeight2 = ((float) textView.getMeasuredHeight()) / 2.0f;
        View view = this.B0;
        int top = (int) ((measuredHeight2 + ((float) textView.getTop())) - (((float) view.getMeasuredHeight()) / 2.0f));
        if (bitSet.get(this.L0)) {
            if (z2) {
                i6 = rh4.c((float) 4, fk4.d().getDisplayMetrics().density, textView.getMeasuredWidth());
            } else {
                i6 = 0;
            }
            int i8 = i6 + c2;
            if (z2) {
                i7 = rh4.c((float) 4, fk4.d().getDisplayMetrics().density, textView.getMeasuredWidth());
            }
            c54.L(i8, top, view.getMeasuredWidth() + c2 + i7, view.getMeasuredHeight() + top, view, this);
        }
        int c3 = rh4.c(f, fk4.d().getDisplayMetrics().density, s5a.getMeasuredWidth() + getPaddingStart());
        int c4 = rh4.c((float) 2, fk4.d().getDisplayMetrics().density, textView.getBottom());
        if (bitSet.get(this.G0)) {
            iw4 iw4 = this.c;
            c54.L(c3, c4, iw4.getMeasuredWidth() + c3, this.c.getMeasuredHeight() + c4, iw4, this);
        }
        if (bitSet.get(this.N0)) {
            iw4 iw42 = this.o;
            c54.L(c3, c4, iw42.getMeasuredWidth() + c3, this.o.getMeasuredHeight() + c4, iw42, this);
        }
        int measuredWidth2 = getMeasuredWidth() - getPaddingEnd();
        float measuredHeight3 = ((float) textView.getMeasuredHeight()) / 2.0f;
        View view2 = this.A0;
        int top2 = (int) ((measuredHeight3 + ((float) textView.getTop())) - (((float) view2.getMeasuredHeight()) / 2.0f));
        int i9 = this.K0;
        if (bitSet.get(i9)) {
            c54.L(measuredWidth2 - view2.getMeasuredWidth(), top2, measuredWidth2, view2.getMeasuredHeight() + top2, view2, this);
        }
        if (bitSet.get(i9)) {
            measuredWidth = rh4.q((float) 4, fk4.d().getDisplayMetrics().density, measuredWidth2 - view2.getMeasuredWidth());
        } else {
            measuredWidth = getMeasuredWidth() - getPaddingEnd();
        }
        int i10 = measuredWidth;
        float measuredHeight4 = ((float) textView.getMeasuredHeight()) / 2.0f;
        TextView textView2 = this.s0;
        int top3 = (int) ((measuredHeight4 + ((float) textView.getTop())) - (((float) textView2.getMeasuredHeight()) / 2.0f));
        if (bitSet.get(this.H0)) {
            c54.L(i10 - textView2.getMeasuredWidth(), top3, i10, textView2.getMeasuredHeight() + top3, textView2, this);
        }
        int measuredWidth3 = getMeasuredWidth() - getPaddingEnd();
        int i11 = this.I0;
        boolean z3 = bitSet.get(i11);
        uv9 uv9 = this.t0;
        if (z3) {
            int q = rh4.q((float) 1, fk4.d().getDisplayMetrics().density, c4);
            uv9 uv92 = this.t0;
            c54.L(measuredWidth3 - uv92.getMeasuredWidth(), q, measuredWidth3, uv9.getMeasuredHeight() + q, uv92, this);
        }
        if (bitSet.get(i11)) {
            i5 = rh4.q((float) 4, fk4.d().getDisplayMetrics().density, measuredWidth3 - uv9.getMeasuredWidth());
        } else {
            i5 = measuredWidth3;
        }
        if (bitSet.get(this.M0)) {
            View view3 = this.C0;
            c54.L(i5 - view3.getMeasuredWidth(), c4, i5, view3.getMeasuredHeight() + c4, view3, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:177:0x040f  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x041f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r29, int r30) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            r2 = r30
            android.widget.TextView r3 = r0.b
            boolean r4 = defpackage.qqe.c(r3)
            r5 = 1
            if (r4 == 0) goto L_0x0012
            r0.setVerified(r5)
        L_0x0012:
            java.util.BitSet r4 = r0.E0
            r6 = 0
            boolean r7 = r4.get(r6)
            if (r7 == 0) goto L_0x001d
            r7 = r6
            goto L_0x001f
        L_0x001d:
            r7 = 8
        L_0x001f:
            s5a r9 = r0.a
            r9.setVisibility(r7)
            int r7 = r0.F0
            boolean r10 = r4.get(r7)
            if (r10 == 0) goto L_0x002e
            r10 = r6
            goto L_0x0030
        L_0x002e:
            r10 = 8
        L_0x0030:
            r3.setVisibility(r10)
            int r10 = r0.N0
            boolean r11 = r4.get(r10)
            if (r11 == 0) goto L_0x003d
            r11 = r6
            goto L_0x003f
        L_0x003d:
            r11 = 8
        L_0x003f:
            iw4 r12 = r0.o
            r12.setVisibility(r11)
            int r11 = r0.G0
            boolean r13 = r4.get(r11)
            if (r13 == 0) goto L_0x004e
            r13 = r6
            goto L_0x0050
        L_0x004e:
            r13 = 8
        L_0x0050:
            iw4 r14 = r0.c
            r14.setVisibility(r13)
            android.widget.TextView r13 = r0.s0
            int r15 = r0.H0
            boolean r16 = r4.get(r15)
            if (r16 == 0) goto L_0x0061
            r8 = r6
            goto L_0x0063
        L_0x0061:
            r8 = 8
        L_0x0063:
            r13.setVisibility(r8)
            android.view.View r8 = r0.B0
            int r5 = r0.L0
            boolean r17 = r4.get(r5)
            if (r17 == 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            r6 = 8
        L_0x0073:
            r8.setVisibility(r6)
            int r6 = r0.I0
            boolean r18 = r4.get(r6)
            r19 = r11
            if (r18 == 0) goto L_0x0084
            r18 = r12
            r12 = 0
            goto L_0x0088
        L_0x0084:
            r18 = r12
            r12 = 8
        L_0x0088:
            uv9 r11 = r0.t0
            r11.setVisibility(r12)
            android.view.View r12 = r0.A0
            r20 = r14
            int r14 = r0.K0
            boolean r21 = r4.get(r14)
            if (r21 == 0) goto L_0x009d
            r21 = r11
            r11 = 0
            goto L_0x00a1
        L_0x009d:
            r21 = r11
            r11 = 8
        L_0x00a1:
            r12.setVisibility(r11)
            android.view.View r11 = r0.C0
            r22 = r6
            int r6 = r0.M0
            boolean r23 = r4.get(r6)
            if (r23 == 0) goto L_0x00b4
            r23 = r6
            r6 = 0
            goto L_0x00b8
        L_0x00b4:
            r23 = r6
            r6 = 8
        L_0x00b8:
            r11.setVisibility(r6)
            boolean r6 = r4.get(r10)
            r16 = r10
            e4f r10 = r0.R0
            if (r6 == 0) goto L_0x00ca
            r10.start()
        L_0x00c8:
            r6 = r11
            goto L_0x00ce
        L_0x00ca:
            r10.stop()
            goto L_0x00c8
        L_0x00ce:
            long r10 = r0.Q0
            r24 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r27 = r6
            r26 = r7
            long r6 = r10 & r24
            int r6 = (int) r6
            java.util.BitSet r7 = r0.D0
            r24 = 32
            if (r6 != r1) goto L_0x00e7
            long r10 = r10 << r24
            int r6 = (int) r10
            if (r6 == r2) goto L_0x00f0
        L_0x00e7:
            int r6 = r7.size()
            r10 = 1
            r11 = 0
            r7.set(r11, r6, r10)
        L_0x00f0:
            long r10 = (long) r1
            long r1 = (long) r2
            long r1 = r1 << r24
            long r1 = r1 | r10
            r0.Q0 = r1
            int r1 = android.view.View.MeasureSpec.getMode(r29)
            if (r1 != 0) goto L_0x00ff
            r10 = 1
            goto L_0x0100
        L_0x00ff:
            r10 = 0
        L_0x0100:
            if (r10 == 0) goto L_0x0111
            android.content.Context r1 = r28.getContext()
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.widthPixels
            goto L_0x0115
        L_0x0111:
            int r1 = android.view.View.MeasureSpec.getSize(r29)
        L_0x0115:
            r2 = 54
            float r2 = (float) r2
            android.content.res.Resources r6 = defpackage.fk4.d()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r2 = r2 * r6
            int r2 = defpackage.tu0.G(r2)
            int r6 = r28.getPaddingStart()
            int r6 = r1 - r6
            int r11 = r28.getPaddingEnd()
            int r6 = r6 - r11
            int r11 = r28.getPaddingStart()
            int r11 = r1 - r11
            int r24 = r28.getPaddingEnd()
            int r11 = r11 - r24
            r30 = r1
            r1 = 0
            boolean r17 = r4.get(r1)
            r24 = r10
            r10 = 1073741824(0x40000000, float:2.0)
            if (r17 == 0) goto L_0x015c
            boolean r25 = r7.get(r1)
            if (r25 == 0) goto L_0x015c
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r10)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r10)
            r9.measure(r1, r2)
        L_0x015c:
            int r1 = r9.getMeasuredWidth()
            r2 = 12
            float r2 = (float) r2
            android.content.res.Resources r25 = defpackage.fk4.d()
            android.util.DisplayMetrics r10 = r25.getDisplayMetrics()
            float r10 = r10.density
            float r10 = r10 * r2
            int r10 = defpackage.tu0.G(r10)
            int r10 = r10 + r1
            int r6 = r6 - r10
            int r1 = r9.getMeasuredWidth()
            android.content.res.Resources r9 = defpackage.fk4.d()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            float r9 = r9 * r2
            int r9 = defpackage.tu0.G(r9)
            int r9 = r9 + r1
            int r11 = r11 - r9
            boolean r1 = r4.get(r15)
            if (r1 == 0) goto L_0x0193
            r1 = 0
            r13.measure(r1, r1)
        L_0x0193:
            int r1 = r13.getMeasuredWidth()
            int r6 = r6 - r1
            int r1 = r0.J0
            boolean r9 = r4.get(r1)
            r10 = 16
            if (r9 == 0) goto L_0x01c9
            android.graphics.drawable.Drawable r9 = r0.u0
            if (r9 == 0) goto L_0x01b7
            float r9 = (float) r10
            android.content.res.Resources r13 = defpackage.fk4.d()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            float r13 = r13.density
            float r9 = r9 * r13
            int r9 = defpackage.tu0.G(r9)
            goto L_0x01c8
        L_0x01b7:
            r9 = 0
            float r13 = (float) r9
            android.content.res.Resources r9 = defpackage.fk4.d()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            float r13 = r13 * r9
            int r9 = defpackage.tu0.G(r13)
        L_0x01c8:
            int r6 = r6 - r9
        L_0x01c9:
            boolean r9 = r4.get(r1)
            r13 = 2
            if (r9 == 0) goto L_0x01e5
            boolean r9 = r4.get(r15)
            if (r9 == 0) goto L_0x01e5
            float r9 = (float) r13
            android.content.res.Resources r25 = defpackage.fk4.d()
            android.util.DisplayMetrics r13 = r25.getDisplayMetrics()
            float r13 = r13.density
            int r6 = defpackage.rh4.q(r9, r13, r6)
        L_0x01e5:
            boolean r9 = r4.get(r14)
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r9 == 0) goto L_0x021f
            boolean r9 = r7.get(r14)
            if (r9 == 0) goto L_0x021f
            float r9 = (float) r10
            android.content.res.Resources r25 = defpackage.fk4.d()
            android.util.DisplayMetrics r10 = r25.getDisplayMetrics()
            float r10 = r10.density
            float r10 = r10 * r9
            int r10 = defpackage.tu0.G(r10)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r13)
            android.content.res.Resources r25 = defpackage.fk4.d()
            android.util.DisplayMetrics r13 = r25.getDisplayMetrics()
            float r13 = r13.density
            float r9 = r9 * r13
            int r9 = defpackage.tu0.G(r9)
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r13)
            r12.measure(r10, r9)
        L_0x021f:
            boolean r9 = r4.get(r14)
            r10 = 4
            if (r9 == 0) goto L_0x0246
            int r9 = r12.getMeasuredWidth()
            int r6 = r6 - r9
            boolean r9 = r4.get(r15)
            if (r9 != 0) goto L_0x0237
            boolean r9 = r4.get(r1)
            if (r9 == 0) goto L_0x0246
        L_0x0237:
            float r9 = (float) r10
            android.content.res.Resources r12 = defpackage.fk4.d()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            float r12 = r12.density
            int r6 = defpackage.rh4.q(r9, r12, r6)
        L_0x0246:
            boolean r9 = r4.get(r5)
            if (r9 == 0) goto L_0x0280
            boolean r9 = r7.get(r5)
            if (r9 == 0) goto L_0x0280
            r9 = 16
            float r9 = (float) r9
            android.content.res.Resources r12 = defpackage.fk4.d()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            float r12 = r12.density
            float r12 = r12 * r9
            int r12 = defpackage.tu0.G(r12)
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r13)
            android.content.res.Resources r25 = defpackage.fk4.d()
            android.util.DisplayMetrics r10 = r25.getDisplayMetrics()
            float r10 = r10.density
            float r9 = r9 * r10
            int r9 = defpackage.tu0.G(r9)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r13)
            r8.measure(r12, r9)
        L_0x0280:
            boolean r9 = r4.get(r5)
            if (r9 == 0) goto L_0x029d
            int r8 = r8.getMeasuredWidth()
            r9 = 4
            float r9 = (float) r9
            android.content.res.Resources r10 = defpackage.fk4.d()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            float r10 = r10.density
            float r9 = r9 * r10
            int r9 = defpackage.tu0.G(r9)
            int r9 = r9 + r8
            int r6 = r6 - r9
        L_0x029d:
            boolean r8 = r4.get(r15)
            if (r8 != 0) goto L_0x02b3
            boolean r8 = r4.get(r1)
            if (r8 != 0) goto L_0x02b3
            boolean r8 = r4.get(r14)
            if (r8 == 0) goto L_0x02b0
            goto L_0x02b3
        L_0x02b0:
            r8 = r26
            goto L_0x02c2
        L_0x02b3:
            android.content.res.Resources r8 = defpackage.fk4.d()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            int r6 = defpackage.rh4.q(r2, r8, r6)
            goto L_0x02b0
        L_0x02c2:
            boolean r9 = r4.get(r8)
            if (r9 == 0) goto L_0x02ee
            boolean r8 = r7.get(r8)
            if (r8 != 0) goto L_0x02f1
            boolean r8 = r7.get(r15)
            if (r8 != 0) goto L_0x02f1
            boolean r1 = r7.get(r1)
            if (r1 != 0) goto L_0x02f1
            boolean r1 = r7.get(r14)
            if (r1 != 0) goto L_0x02f1
            boolean r1 = r7.get(r5)
            if (r1 == 0) goto L_0x02e7
            goto L_0x02f1
        L_0x02e7:
            boolean r1 = r3.isLayoutRequested()
            if (r1 == 0) goto L_0x02ee
            goto L_0x02f1
        L_0x02ee:
            r1 = r22
            goto L_0x030c
        L_0x02f1:
            if (r6 > 0) goto L_0x02f5
            r5 = 0
            goto L_0x02fb
        L_0x02f5:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r1)
        L_0x02fb:
            int r1 = r3.getLineHeight()
            r6 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r6)
            r3.forceLayout()
            r3.measure(r5, r1)
            goto L_0x02ee
        L_0x030c:
            boolean r5 = r4.get(r1)
            if (r5 == 0) goto L_0x031f
            boolean r5 = r7.get(r1)
            if (r5 == 0) goto L_0x031f
            r6 = r21
            r5 = 0
            r6.measure(r5, r5)
            goto L_0x0321
        L_0x031f:
            r6 = r21
        L_0x0321:
            boolean r5 = r4.get(r1)
            if (r5 == 0) goto L_0x032c
            int r5 = r6.getMeasuredWidth()
            int r11 = r11 - r5
        L_0x032c:
            r5 = r23
            boolean r6 = r4.get(r5)
            if (r6 == 0) goto L_0x036e
            boolean r6 = r7.get(r5)
            if (r6 == 0) goto L_0x036e
            r6 = 68
            float r6 = (float) r6
            android.content.res.Resources r8 = defpackage.fk4.d()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r6 = r6 * r8
            int r6 = defpackage.tu0.G(r6)
            r8 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r8)
            r9 = 20
            float r9 = (float) r9
            android.content.res.Resources r10 = defpackage.fk4.d()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            float r10 = r10.density
            float r9 = r9 * r10
            int r9 = defpackage.tu0.G(r9)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r8)
            r8 = r27
            r8.measure(r6, r9)
            goto L_0x0370
        L_0x036e:
            r8 = r27
        L_0x0370:
            boolean r6 = r4.get(r5)
            if (r6 == 0) goto L_0x037b
            int r6 = r8.getMeasuredWidth()
            int r11 = r11 - r6
        L_0x037b:
            boolean r6 = r4.get(r5)
            if (r6 != 0) goto L_0x0387
            boolean r6 = r4.get(r1)
            if (r6 == 0) goto L_0x0395
        L_0x0387:
            android.content.res.Resources r6 = defpackage.fk4.d()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            int r11 = defpackage.rh4.q(r2, r6, r11)
        L_0x0395:
            if (r11 > 0) goto L_0x0399
            r11 = 0
            goto L_0x039f
        L_0x0399:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r2)
        L_0x039f:
            int r2 = r20.getLineHeight()
            r6 = 2
            int r2 = r2 * r6
            r6 = 1073741824(0x40000000, float:2.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r6)
            r6 = r19
            boolean r8 = r4.get(r6)
            if (r8 == 0) goto L_0x03dc
            boolean r6 = r7.get(r6)
            if (r6 != 0) goto L_0x03d1
            boolean r6 = r7.get(r5)
            if (r6 != 0) goto L_0x03d1
            boolean r6 = r7.get(r1)
            if (r6 != 0) goto L_0x03d1
            boolean r6 = r20.isLayoutRequested()
            if (r6 == 0) goto L_0x03cc
            goto L_0x03d1
        L_0x03cc:
            r8 = r16
            r6 = r20
            goto L_0x03df
        L_0x03d1:
            r20.forceLayout()
            r6 = r20
            r6.measure(r11, r2)
        L_0x03d9:
            r8 = r16
            goto L_0x03df
        L_0x03dc:
            r6 = r20
            goto L_0x03d9
        L_0x03df:
            boolean r4 = r4.get(r8)
            if (r4 == 0) goto L_0x0405
            boolean r4 = r7.get(r8)
            if (r4 != 0) goto L_0x03fd
            boolean r4 = r7.get(r5)
            if (r4 != 0) goto L_0x03fd
            boolean r1 = r7.get(r1)
            if (r1 != 0) goto L_0x03fd
            boolean r1 = r18.isLayoutRequested()
            if (r1 == 0) goto L_0x0405
        L_0x03fd:
            r18.forceLayout()
            r1 = r18
            r1.measure(r11, r2)
        L_0x0405:
            cu1 r1 = r0.P0
            if (r24 == 0) goto L_0x041f
            int r2 = android.view.View.MeasureSpec.getSize(r29)
            if (r2 > 0) goto L_0x041f
            android.os.Handler r2 = r28.getHandler()
            if (r2 == 0) goto L_0x0438
            r2.removeCallbacks(r1)
            r2.post(r1)
            r1 = 1
            r0.O0 = r1
            goto L_0x0438
        L_0x041f:
            boolean r2 = r0.O0
            if (r2 == 0) goto L_0x0430
            android.os.Handler r2 = r28.getHandler()
            if (r2 == 0) goto L_0x042c
            r2.removeCallbacks(r1)
        L_0x042c:
            r1 = 0
            r0.O0 = r1
            goto L_0x0431
        L_0x0430:
            r1 = 0
        L_0x0431:
            int r2 = r7.size()
            r7.set(r1, r2, r1)
        L_0x0438:
            int r1 = r28.getPaddingTop()
            int r2 = r28.getPaddingBottom()
            int r2 = r2 + r1
            int r1 = r3.getMeasuredHeight()
            int r1 = r1 + r2
            int r2 = r6.getMeasuredHeight()
            int r2 = r2 + r1
            r1 = 2
            float r1 = (float) r1
            android.content.res.Resources r3 = defpackage.fk4.d()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            int r1 = defpackage.rh4.c(r1, r3, r2)
            r2 = 82
            float r2 = (float) r2
            android.content.res.Resources r3 = defpackage.fk4.d()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r2 = r2 * r3
            int r2 = defpackage.tu0.G(r2)
            int r1 = java.lang.Math.max(r1, r2)
            r2 = r30
            r0.setMeasuredDimension(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m62.onMeasure(int, int):void");
    }

    public final void onThemeChanged(fka fka) {
        Drawable drawable;
        Drawable drawable2;
        qe qeVar;
        Drawable drawable3;
        this.a.onThemeChanged(fka);
        TextView textView = this.b;
        textView.setTextColor(fka.getText().e);
        xoe text = fka.getText();
        iw4 iw4 = this.c;
        iw4.setTextColor(text.g);
        TextView textView2 = this.s0;
        textView2.setTextColor(fka.getText().i);
        this.t0.onThemeChanged(fka);
        ngg.G(this.A0.getBackground(), fka.getIcon().h);
        ngg.G(this.B0.getBackground(), fka.getIcon().h);
        je7 je7 = this.w0;
        Object[] objArr = null;
        je7 je72 = je7.a() ? je7 : null;
        if (!(je72 == null || (drawable3 = (Drawable) je72.getValue()) == null)) {
            ngg.G(drawable3, fka.getIcon().k);
        }
        je7 je73 = this.v0;
        if (!je73.a()) {
            je73 = null;
        }
        pq9 pq9 = qp4.u0;
        if (!(je73 == null || (qeVar = (qe) je73.getValue()) == null)) {
            qeVar.a(pq9.j(this).getIcon().h);
        }
        if (!je7.a()) {
            je7 = null;
        }
        if (!(je7 == null || (drawable2 = (Drawable) je7.getValue()) == null)) {
            ngg.G(drawable2, fka.getIcon().k);
        }
        je7 je74 = this.x0;
        if (!je74.a()) {
            je74 = null;
        }
        if (!(je74 == null || (drawable = (Drawable) je74.getValue()) == null)) {
            ngg.G(drawable, fka.getIcon().k);
        }
        je7 je75 = this.y0;
        if (!je75.a()) {
            je75 = null;
        }
        Drawable drawable4 = je75 != null ? (Drawable) je75.getValue() : null;
        EnhancedVectorDrawable enhancedVectorDrawable = drawable4 instanceof EnhancedVectorDrawable ? (EnhancedVectorDrawable) drawable4 : null;
        if (enhancedVectorDrawable != null) {
            c54.Z(enhancedVectorDrawable, "error", fka.b().a.e);
        }
        getRippleDrawable().setColor(ColorStateList.valueOf(fka.d().a.a.h));
        CharSequence text2 = textView.getText();
        Spanned spanned = text2 instanceof Spanned ? (Spanned) text2 : null;
        Class<kre> cls = kre.class;
        Object[] spans = spanned != null ? spanned.getSpans(0, textView.getText().length(), cls) : null;
        if (spans == null) {
            spans = new kre[0];
        }
        for (Object obj : spans) {
            kre kre = (kre) obj;
            kre.onThemeChanged(fka);
            qqe.b(textView, kre);
        }
        CharSequence text3 = iw4.getText();
        Spanned spanned2 = text3 instanceof Spanned ? (Spanned) text3 : null;
        Object[] spans2 = spanned2 != null ? spanned2.getSpans(0, iw4.getText().length(), cls) : null;
        if (spans2 == null) {
            spans2 = new kre[0];
        }
        for (Object obj2 : spans2) {
            kre kre2 = (kre) obj2;
            kre2.onThemeChanged(fka);
            qqe.b(iw4, kre2);
        }
        CharSequence text4 = textView2.getText();
        Spanned spanned3 = text4 instanceof Spanned ? (Spanned) text4 : null;
        Object[] spans3 = spanned3 != null ? spanned3.getSpans(0, textView2.getText().length(), cls) : null;
        if (spans3 == null) {
            spans3 = new kre[0];
        }
        for (Object obj3 : spans3) {
            kre kre3 = (kre) obj3;
            kre3.onThemeChanged(fka);
            qqe.b(textView2, kre3);
        }
        this.R0.onThemeChanged(fka);
        fka j = pq9.j(this);
        iw4 iw42 = this.o;
        CharSequence text5 = iw42.getText();
        Spanned spanned4 = text5 instanceof Spanned ? (Spanned) text5 : null;
        if (spanned4 != null) {
            objArr = spanned4.getSpans(0, iw42.getText().length(), cls);
        }
        if (objArr == null) {
            objArr = new kre[0];
        }
        for (Object obj4 : objArr) {
            kre kre4 = (kre) obj4;
            kre4.onThemeChanged(j);
            qqe.b(iw42, kre4);
        }
        invalidate();
    }

    public final void setAvatarClickListener(View.OnClickListener onClickListener) {
        tu0.K(this.a, 300, onClickListener);
    }

    public final void setCall(CharSequence charSequence) {
        BitSet bitSet = this.E0;
        boolean z = charSequence == null || w9e.C0(charSequence);
        int i = this.M0;
        bitSet.set(i, !z);
        this.D0.set(i, true);
        requestLayout();
    }

    public final void setCallBadge(boolean z) {
        this.a.setCallBadgeVisibility(z);
        this.D0.set(0, true);
        requestLayout();
    }

    public final void setMention(boolean z) {
        this.t0.c(z);
        BitSet bitSet = this.E0;
        d(bitSet, bitSet.get(this.I0) || z);
        d(this.D0, true);
        requestLayout();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setMuted(boolean r13) {
        /*
            r12 = this;
            java.util.BitSet r0 = r12.E0
            int r1 = r12.L0
            r0.set(r1, r13)
            java.util.BitSet r2 = r12.D0
            boolean r3 = r2.get(r1)
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x0025
            android.view.View r3 = r12.B0
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x001b
            r3 = r5
            goto L_0x001c
        L_0x001b:
            r3 = r4
        L_0x001c:
            boolean r6 = r0.get(r1)
            if (r3 == r6) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r3 = r4
            goto L_0x0026
        L_0x0025:
            r3 = r5
        L_0x0026:
            r2.set(r1, r3)
            uv9 r1 = r12.t0
            tv9 r6 = r1.o
            boolean r3 = r6.d
            r7 = 0
            r11 = 7
            r8 = 0
            r9 = 0
            r10 = r13
            tv9 r6 = defpackage.tv9.a(r6, r7, r8, r9, r10, r11)
            r1.o = r6
            if (r3 == r13) goto L_0x0045
            pq9 r3 = defpackage.qp4.u0
            fka r3 = r3.j(r1)
            r1.b(r13, r3)
        L_0x0045:
            int r1 = r12.I0
            boolean r3 = r0.get(r1)
            if (r3 != 0) goto L_0x004f
            if (r13 == 0) goto L_0x0050
        L_0x004f:
            r4 = r5
        L_0x0050:
            r0.set(r1, r4)
            r2.set(r1, r5)
            r12.requestLayout()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m62.setMuted(boolean):void");
    }

    public final void setOnline(boolean z) {
        this.a.setOnlineBadgeVisibility(z);
        this.D0.set(0, true);
        requestLayout();
    }

    public final void setPinned(boolean z) {
        this.E0.set(this.K0, z);
        requestLayout();
    }

    public final void setReaction(boolean z) {
        this.t0.d(z);
        BitSet bitSet = this.E0;
        d(bitSet, bitSet.get(this.I0) || z);
        d(this.D0, true);
        requestLayout();
    }

    public final void setStatus(l62 l62) {
        Drawable drawable;
        int ordinal = l62.ordinal();
        Animatable animatable = null;
        boolean z = true;
        if (ordinal == 0) {
            drawable = null;
        } else if (ordinal == 1) {
            drawable = (Drawable) this.v0.getValue();
        } else if (ordinal == 2) {
            drawable = (Drawable) this.w0.getValue();
        } else if (ordinal == 3) {
            drawable = (Drawable) this.x0.getValue();
        } else if (ordinal == 4) {
            drawable = (Drawable) this.y0.getValue();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (drawable instanceof Animatable) {
            animatable = (Animatable) drawable;
        }
        if (animatable != null) {
            animatable.start();
        }
        boolean z2 = !tpa.f(this.u0, drawable);
        if (drawable != null) {
            float f = (float) 16;
            drawable.setBounds(0, 0, tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        }
        int i = this.J0;
        this.D0.set(i, !tpa.f(this.u0, drawable));
        this.u0 = drawable;
        BitSet bitSet = this.E0;
        if (drawable == null) {
            z = false;
        }
        bitSet.set(i, z);
        invalidate();
        if (z2) {
            requestLayout();
        }
    }

    public final void setSubtitle(CharSequence charSequence) {
        iw4 iw4 = this.c;
        CharSequence text = iw4.getText();
        BitSet bitSet = this.D0;
        int i = this.G0;
        boolean z = true;
        if (text != charSequence) {
            iw4.setText(charSequence);
            bitSet.set(i, true);
        }
        BitSet bitSet2 = this.E0;
        bitSet2.set(i, charSequence != null && !w9e.C0(charSequence) && !bitSet2.get(this.N0));
        if (!bitSet.get(i)) {
            if (bitSet2.get(i) == (iw4.getVisibility() == 0)) {
                z = false;
            }
        }
        bitSet.set(i, z);
        fka j = qp4.u0.j(this);
        CharSequence text2 = iw4.getText();
        Object[] objArr = null;
        Spanned spanned = text2 instanceof Spanned ? (Spanned) text2 : null;
        if (spanned != null) {
            objArr = spanned.getSpans(0, iw4.getText().length(), kre.class);
        }
        if (objArr == null) {
            objArr = new kre[0];
        }
        for (Object obj : objArr) {
            kre kre = (kre) obj;
            kre.onThemeChanged(j);
            qqe.b(iw4, kre);
        }
        requestLayout();
    }

    public final void setTime(CharSequence charSequence) {
        TextView textView = this.s0;
        CharSequence text = textView.getText();
        BitSet bitSet = this.D0;
        int i = this.H0;
        boolean z = true;
        if (text != charSequence) {
            textView.setText(charSequence);
            bitSet.set(i, true);
        }
        BitSet bitSet2 = this.E0;
        bitSet2.set(i, charSequence != null && !w9e.C0(charSequence));
        if (!bitSet.get(i)) {
            if (bitSet2.get(i) == (textView.getVisibility() == 0)) {
                z = false;
            }
        }
        bitSet.set(i, z);
        requestLayout();
    }

    public final void setTitle(CharSequence charSequence) {
        TextView textView = this.b;
        CharSequence text = textView.getText();
        BitSet bitSet = this.D0;
        int i = this.F0;
        boolean z = true;
        if (text != charSequence) {
            textView.setText(charSequence);
            bitSet.set(i, true);
        }
        BitSet bitSet2 = this.E0;
        bitSet2.set(i, charSequence != null && !w9e.C0(charSequence));
        if (!bitSet.get(i)) {
            if (bitSet2.get(i) == (textView.getVisibility() == 0)) {
                z = false;
            }
        }
        bitSet.set(i, z);
        fka j = qp4.u0.j(this);
        CharSequence text2 = textView.getText();
        Object[] objArr = null;
        Spanned spanned = text2 instanceof Spanned ? (Spanned) text2 : null;
        if (spanned != null) {
            objArr = spanned.getSpans(0, textView.getText().length(), kre.class);
        }
        if (objArr == null) {
            objArr = new kre[0];
        }
        for (Object obj : objArr) {
            kre kre = (kre) obj;
            kre.onThemeChanged(j);
            qqe.b(textView, kre);
        }
        requestLayout();
    }

    public final void setTyping(CharSequence charSequence) {
        iw4 iw4 = this.o;
        CharSequence text = iw4.getText();
        BitSet bitSet = this.D0;
        int i = this.N0;
        boolean z = true;
        if (text != charSequence) {
            iw4.setText(charSequence);
            this.R0.start();
            bitSet.set(i, true);
        }
        BitSet bitSet2 = this.E0;
        bitSet2.set(i, charSequence != null && !w9e.C0(charSequence));
        iw4 iw42 = this.c;
        CharSequence text2 = iw42.getText();
        bitSet2.set(this.G0, text2 != null && !w9e.C0(text2) && !bitSet2.get(i));
        if (!bitSet.get(i)) {
            if (bitSet2.get(i) == (iw42.getVisibility() == 0)) {
                z = false;
            }
        }
        bitSet.set(i, z);
        fka j = qp4.u0.j(this);
        CharSequence text3 = iw4.getText();
        Object[] objArr = null;
        Spanned spanned = text3 instanceof Spanned ? (Spanned) text3 : null;
        if (spanned != null) {
            objArr = spanned.getSpans(0, iw4.getText().length(), kre.class);
        }
        if (objArr == null) {
            objArr = new kre[0];
        }
        for (Object obj : objArr) {
            kre kre = (kre) obj;
            kre.onThemeChanged(j);
            qqe.b(iw4, kre);
        }
        requestLayout();
    }

    public final void setVerified(boolean z) {
        ecf ecf;
        TextView textView = this.b;
        int I = i24.I(qqe.e(textView));
        int i = 0;
        if (z) {
            ecf a2 = qqe.a(textView);
            if ((a2 != null ? a2.a : 0) == I) {
                return;
            }
        }
        if (z) {
            ecf a3 = qqe.a(textView);
            if (a3 != null) {
                i = a3.a;
            }
            if (i != I) {
                ecf = new ecf(getContext(), I, new we1(8));
                qqe.d(textView, ecf);
            }
        }
        ecf = null;
        qqe.d(textView, ecf);
    }

    public final boolean verifyDrawable(Drawable drawable) {
        qe qeVar;
        if (!super.verifyDrawable(drawable) && drawable != this.R0) {
            je7 je7 = this.v0;
            Drawable drawable2 = null;
            if (!je7.a()) {
                je7 = null;
            }
            if (!(je7 == null || (qeVar = (qe) je7.getValue()) == null)) {
                drawable2 = qeVar.getDrawable();
            }
            return drawable == drawable2;
        }
    }
}
