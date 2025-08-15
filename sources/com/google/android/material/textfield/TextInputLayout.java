package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int N1 = m2c.Widget_Design_TextInputLayout;
    public static final int[][] O1 = {new int[]{16842919}, new int[0]};
    public boolean A0;
    public int A1;
    public mpe B0 = new hme(6);
    public int B1;
    public AppCompatTextView C0;
    public int C1;
    public int D0;
    public int D1;
    public int E0;
    public int E1;
    public CharSequence F0;
    public boolean F1;
    public boolean G0;
    public final s53 G1;
    public AppCompatTextView H0;
    public boolean H1;
    public ColorStateList I0;
    public boolean I1;
    public int J0;
    public ValueAnimator J1;
    public wa5 K0;
    public boolean K1;
    public wa5 L0;
    public boolean L1;
    public ColorStateList M0;
    public boolean M1;
    public ColorStateList N0;
    public ColorStateList O0;
    public ColorStateList P0;
    public boolean Q0;
    public CharSequence R0;
    public boolean S0;
    public q18 T0;
    public q18 U0;
    public StateListDrawable V0;
    public boolean W0;
    public q18 X0;
    public q18 Y0;
    public gjd Z0;
    public final FrameLayout a;
    public boolean a1;
    public final myd b;
    public final int b1;
    public final m15 c;
    public int c1;
    public int d1;
    public int e1;
    public int f1;
    public int g1;
    public int h1;
    public int i1;
    public final Rect j1 = new Rect();
    public final Rect k1 = new Rect();
    public final RectF l1 = new RectF();
    public Typeface m1;
    public ColorDrawable n1;
    public EditText o;
    public int o1;
    public final LinkedHashSet p1 = new LinkedHashSet();
    public ColorDrawable q1;
    public int r1;
    public CharSequence s0;
    public Drawable s1;
    public int t0 = -1;
    public ColorStateList t1;
    public int u0 = -1;
    public ColorStateList u1;
    public int v0 = -1;
    public int v1;
    public int w0 = -1;
    public int w1;
    public final b07 x0 = new b07(this);
    public int x1;
    public boolean y0;
    public ColorStateList y1;
    public int z0;
    public int z1;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r17, android.util.AttributeSet r18) {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            int r8 = defpackage.tsb.textInputStyle
            int r9 = N1
            r1 = r17
            android.content.Context r1 = defpackage.y18.a(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = -1
            r0.t0 = r10
            r0.u0 = r10
            r0.v0 = r10
            r0.w0 = r10
            b07 r1 = new b07
            r1.<init>(r0)
            r0.x0 = r1
            hme r1 = new hme
            r2 = 6
            r1.<init>(r2)
            r0.B0 = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.j1 = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.k1 = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.l1 = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.p1 = r1
            s53 r1 = new s53
            r1.<init>(r0)
            r0.G1 = r1
            r11 = 0
            r0.M1 = r11
            android.content.Context r12 = r16.getContext()
            r13 = 1
            r0.setOrientation(r13)
            r0.setWillNotDraw(r11)
            r0.setAddStatesFromChildren(r13)
            android.widget.FrameLayout r14 = new android.widget.FrameLayout
            r14.<init>(r12)
            r0.a = r14
            r14.setAddStatesFromChildren(r13)
            android.view.animation.LinearInterpolator r2 = defpackage.og.a
            r1.W = r2
            r1.i(r11)
            r1.V = r2
            r1.i(r11)
            r2 = 8388659(0x800033, float:1.1755015E-38)
            r1.l(r2)
            int[] r15 = defpackage.z2c.TextInputLayout
            int r1 = defpackage.z2c.TextInputLayout_counterTextAppearance
            int r2 = defpackage.z2c.TextInputLayout_counterOverflowTextAppearance
            int r3 = defpackage.z2c.TextInputLayout_errorTextAppearance
            int r4 = defpackage.z2c.TextInputLayout_helperTextTextAppearance
            int r5 = defpackage.z2c.TextInputLayout_hintTextAppearance
            int[] r6 = new int[]{r1, r2, r3, r4, r5}
            defpackage.sre.a(r12, r7, r8, r9)
            r1 = r12
            r2 = r18
            r3 = r15
            r4 = r8
            r5 = r9
            defpackage.sre.b(r1, r2, r3, r4, r5, r6)
            k8g r1 = new k8g
            android.content.res.TypedArray r2 = r12.obtainStyledAttributes(r7, r15, r8, r9)
            r1.<init>((java.lang.Object) r12, (java.lang.Object) r2)
            myd r3 = new myd
            r3.<init>(r0, r1)
            r0.b = r3
            int r4 = defpackage.z2c.TextInputLayout_hintEnabled
            boolean r4 = r2.getBoolean(r4, r13)
            r0.Q0 = r4
            int r4 = defpackage.z2c.TextInputLayout_android_hint
            java.lang.CharSequence r4 = r2.getText(r4)
            r0.setHint((java.lang.CharSequence) r4)
            int r4 = defpackage.z2c.TextInputLayout_hintAnimationEnabled
            boolean r4 = r2.getBoolean(r4, r13)
            r0.I1 = r4
            int r4 = defpackage.z2c.TextInputLayout_expandedHintEnabled
            boolean r4 = r2.getBoolean(r4, r13)
            r0.H1 = r4
            int r4 = defpackage.z2c.TextInputLayout_android_minEms
            boolean r4 = r2.hasValue(r4)
            if (r4 == 0) goto L_0x00d8
            int r4 = defpackage.z2c.TextInputLayout_android_minEms
            int r4 = r2.getInt(r4, r10)
            r0.setMinEms(r4)
            goto L_0x00e9
        L_0x00d8:
            int r4 = defpackage.z2c.TextInputLayout_android_minWidth
            boolean r4 = r2.hasValue(r4)
            if (r4 == 0) goto L_0x00e9
            int r4 = defpackage.z2c.TextInputLayout_android_minWidth
            int r4 = r2.getDimensionPixelSize(r4, r10)
            r0.setMinWidth(r4)
        L_0x00e9:
            int r4 = defpackage.z2c.TextInputLayout_android_maxEms
            boolean r4 = r2.hasValue(r4)
            if (r4 == 0) goto L_0x00fb
            int r4 = defpackage.z2c.TextInputLayout_android_maxEms
            int r4 = r2.getInt(r4, r10)
            r0.setMaxEms(r4)
            goto L_0x010c
        L_0x00fb:
            int r4 = defpackage.z2c.TextInputLayout_android_maxWidth
            boolean r4 = r2.hasValue(r4)
            if (r4 == 0) goto L_0x010c
            int r4 = defpackage.z2c.TextInputLayout_android_maxWidth
            int r4 = r2.getDimensionPixelSize(r4, r10)
            r0.setMaxWidth(r4)
        L_0x010c:
            i8g r4 = defpackage.gjd.b(r12, r7, r8, r9)
            gjd r4 = r4.c()
            r0.Z0 = r4
            android.content.res.Resources r4 = r12.getResources()
            int r5 = defpackage.stb.mtrl_textinput_box_label_cutout_padding
            int r4 = r4.getDimensionPixelOffset(r5)
            r0.b1 = r4
            int r4 = defpackage.z2c.TextInputLayout_boxCollapsedPaddingTop
            int r4 = r2.getDimensionPixelOffset(r4, r11)
            r0.d1 = r4
            int r4 = defpackage.z2c.TextInputLayout_boxStrokeWidth
            android.content.res.Resources r5 = r12.getResources()
            int r6 = defpackage.stb.mtrl_textinput_box_stroke_width_default
            int r5 = r5.getDimensionPixelSize(r6)
            int r4 = r2.getDimensionPixelSize(r4, r5)
            r0.f1 = r4
            int r4 = defpackage.z2c.TextInputLayout_boxStrokeWidthFocused
            android.content.res.Resources r5 = r12.getResources()
            int r6 = defpackage.stb.mtrl_textinput_box_stroke_width_focused
            int r5 = r5.getDimensionPixelSize(r6)
            int r4 = r2.getDimensionPixelSize(r4, r5)
            r0.g1 = r4
            int r4 = r0.f1
            r0.e1 = r4
            int r4 = defpackage.z2c.TextInputLayout_boxCornerRadiusTopStart
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = r2.getDimension(r4, r5)
            int r6 = defpackage.z2c.TextInputLayout_boxCornerRadiusTopEnd
            float r6 = r2.getDimension(r6, r5)
            int r7 = defpackage.z2c.TextInputLayout_boxCornerRadiusBottomEnd
            float r7 = r2.getDimension(r7, r5)
            int r8 = defpackage.z2c.TextInputLayout_boxCornerRadiusBottomStart
            float r5 = r2.getDimension(r8, r5)
            gjd r8 = r0.Z0
            i8g r8 = r8.e()
            r9 = 0
            int r15 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r15 < 0) goto L_0x017e
            a0 r15 = new a0
            r15.<init>(r4)
            r8.e = r15
        L_0x017e:
            int r4 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r4 < 0) goto L_0x0189
            a0 r4 = new a0
            r4.<init>(r6)
            r8.f = r4
        L_0x0189:
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 < 0) goto L_0x0194
            a0 r4 = new a0
            r4.<init>(r7)
            r8.g = r4
        L_0x0194:
            int r4 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r4 < 0) goto L_0x019f
            a0 r4 = new a0
            r4.<init>(r5)
            r8.h = r4
        L_0x019f:
            gjd r4 = r8.c()
            r0.Z0 = r4
            int r4 = defpackage.z2c.TextInputLayout_boxBackgroundColor
            android.content.res.ColorStateList r4 = defpackage.ju0.p(r12, r1, r4)
            if (r4 == 0) goto L_0x0205
            int r5 = r4.getDefaultColor()
            r0.z1 = r5
            r0.i1 = r5
            boolean r5 = r4.isStateful()
            r6 = 16843623(0x1010367, float:2.3696E-38)
            r7 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r5 == 0) goto L_0x01e6
            int[] r5 = new int[]{r7}
            int r5 = r4.getColorForState(r5, r10)
            r0.A1 = r5
            r5 = 16842908(0x101009c, float:2.3693995E-38)
            r7 = 16842910(0x101009e, float:2.3694E-38)
            int[] r5 = new int[]{r5, r7}
            int r5 = r4.getColorForState(r5, r10)
            r0.B1 = r5
            int[] r5 = new int[]{r6, r7}
            int r4 = r4.getColorForState(r5, r10)
            r0.C1 = r4
            goto L_0x020f
        L_0x01e6:
            int r4 = r0.z1
            r0.B1 = r4
            int r4 = defpackage.etb.mtrl_filled_background_color
            android.content.res.ColorStateList r4 = defpackage.z7.n(r12, r4)
            int[] r5 = new int[]{r7}
            int r5 = r4.getColorForState(r5, r10)
            r0.A1 = r5
            int[] r5 = new int[]{r6}
            int r4 = r4.getColorForState(r5, r10)
            r0.C1 = r4
            goto L_0x020f
        L_0x0205:
            r0.i1 = r11
            r0.z1 = r11
            r0.A1 = r11
            r0.B1 = r11
            r0.C1 = r11
        L_0x020f:
            int r4 = defpackage.z2c.TextInputLayout_android_textColorHint
            boolean r4 = r2.hasValue(r4)
            if (r4 == 0) goto L_0x0221
            int r4 = defpackage.z2c.TextInputLayout_android_textColorHint
            android.content.res.ColorStateList r4 = r1.l(r4)
            r0.u1 = r4
            r0.t1 = r4
        L_0x0221:
            int r4 = defpackage.z2c.TextInputLayout_boxStrokeColor
            android.content.res.ColorStateList r4 = defpackage.ju0.p(r12, r1, r4)
            int r5 = defpackage.z2c.TextInputLayout_boxStrokeColor
            int r5 = r2.getColor(r5, r11)
            r0.x1 = r5
            int r5 = defpackage.etb.mtrl_textinput_default_box_stroke_color
            int r5 = defpackage.lt3.a(r12, r5)
            r0.v1 = r5
            int r5 = defpackage.etb.mtrl_textinput_disabled_color
            int r5 = defpackage.lt3.a(r12, r5)
            r0.D1 = r5
            int r5 = defpackage.etb.mtrl_textinput_hovered_box_stroke_color
            int r5 = defpackage.lt3.a(r12, r5)
            r0.w1 = r5
            if (r4 == 0) goto L_0x024c
            r0.setBoxStrokeColorStateList(r4)
        L_0x024c:
            int r4 = defpackage.z2c.TextInputLayout_boxStrokeErrorColor
            boolean r4 = r2.hasValue(r4)
            if (r4 == 0) goto L_0x025d
            int r4 = defpackage.z2c.TextInputLayout_boxStrokeErrorColor
            android.content.res.ColorStateList r4 = defpackage.ju0.p(r12, r1, r4)
            r0.setBoxStrokeErrorColor(r4)
        L_0x025d:
            int r4 = defpackage.z2c.TextInputLayout_hintTextAppearance
            int r4 = r2.getResourceId(r4, r10)
            if (r4 == r10) goto L_0x026e
            int r4 = defpackage.z2c.TextInputLayout_hintTextAppearance
            int r4 = r2.getResourceId(r4, r11)
            r0.setHintTextAppearance(r4)
        L_0x026e:
            int r4 = defpackage.z2c.TextInputLayout_cursorColor
            android.content.res.ColorStateList r4 = r1.l(r4)
            r0.O0 = r4
            int r4 = defpackage.z2c.TextInputLayout_cursorErrorColor
            android.content.res.ColorStateList r4 = r1.l(r4)
            r0.P0 = r4
            int r4 = defpackage.z2c.TextInputLayout_errorTextAppearance
            int r4 = r2.getResourceId(r4, r11)
            int r5 = defpackage.z2c.TextInputLayout_errorContentDescription
            java.lang.CharSequence r5 = r2.getText(r5)
            int r6 = defpackage.z2c.TextInputLayout_errorAccessibilityLiveRegion
            int r6 = r2.getInt(r6, r13)
            int r7 = defpackage.z2c.TextInputLayout_errorEnabled
            boolean r7 = r2.getBoolean(r7, r11)
            int r8 = defpackage.z2c.TextInputLayout_helperTextTextAppearance
            int r8 = r2.getResourceId(r8, r11)
            int r9 = defpackage.z2c.TextInputLayout_helperTextEnabled
            boolean r9 = r2.getBoolean(r9, r11)
            int r12 = defpackage.z2c.TextInputLayout_helperText
            java.lang.CharSequence r12 = r2.getText(r12)
            int r15 = defpackage.z2c.TextInputLayout_placeholderTextAppearance
            int r15 = r2.getResourceId(r15, r11)
            int r13 = defpackage.z2c.TextInputLayout_placeholderText
            java.lang.CharSequence r13 = r2.getText(r13)
            int r10 = defpackage.z2c.TextInputLayout_counterEnabled
            boolean r10 = r2.getBoolean(r10, r11)
            int r11 = defpackage.z2c.TextInputLayout_counterMaxLength
            r18 = r12
            r12 = -1
            int r11 = r2.getInt(r11, r12)
            r0.setCounterMaxLength(r11)
            int r11 = defpackage.z2c.TextInputLayout_counterTextAppearance
            r12 = 0
            int r11 = r2.getResourceId(r11, r12)
            r0.E0 = r11
            int r11 = defpackage.z2c.TextInputLayout_counterOverflowTextAppearance
            int r11 = r2.getResourceId(r11, r12)
            r0.D0 = r11
            int r11 = defpackage.z2c.TextInputLayout_boxBackgroundMode
            int r11 = r2.getInt(r11, r12)
            r0.setBoxBackgroundMode(r11)
            r0.setErrorContentDescription(r5)
            r0.setErrorAccessibilityLiveRegion(r6)
            int r5 = r0.D0
            r0.setCounterOverflowTextAppearance(r5)
            r0.setHelperTextTextAppearance(r8)
            r0.setErrorTextAppearance(r4)
            int r4 = r0.E0
            r0.setCounterTextAppearance(r4)
            r0.setPlaceholderText(r13)
            r0.setPlaceholderTextAppearance(r15)
            int r4 = defpackage.z2c.TextInputLayout_errorTextColor
            boolean r4 = r2.hasValue(r4)
            if (r4 == 0) goto L_0x030d
            int r4 = defpackage.z2c.TextInputLayout_errorTextColor
            android.content.res.ColorStateList r4 = r1.l(r4)
            r0.setErrorTextColor(r4)
        L_0x030d:
            int r4 = defpackage.z2c.TextInputLayout_helperTextTextColor
            boolean r4 = r2.hasValue(r4)
            if (r4 == 0) goto L_0x031e
            int r4 = defpackage.z2c.TextInputLayout_helperTextTextColor
            android.content.res.ColorStateList r4 = r1.l(r4)
            r0.setHelperTextColor(r4)
        L_0x031e:
            int r4 = defpackage.z2c.TextInputLayout_hintTextColor
            boolean r4 = r2.hasValue(r4)
            if (r4 == 0) goto L_0x032f
            int r4 = defpackage.z2c.TextInputLayout_hintTextColor
            android.content.res.ColorStateList r4 = r1.l(r4)
            r0.setHintTextColor(r4)
        L_0x032f:
            int r4 = defpackage.z2c.TextInputLayout_counterTextColor
            boolean r4 = r2.hasValue(r4)
            if (r4 == 0) goto L_0x0340
            int r4 = defpackage.z2c.TextInputLayout_counterTextColor
            android.content.res.ColorStateList r4 = r1.l(r4)
            r0.setCounterTextColor(r4)
        L_0x0340:
            int r4 = defpackage.z2c.TextInputLayout_counterOverflowTextColor
            boolean r4 = r2.hasValue(r4)
            if (r4 == 0) goto L_0x0351
            int r4 = defpackage.z2c.TextInputLayout_counterOverflowTextColor
            android.content.res.ColorStateList r4 = r1.l(r4)
            r0.setCounterOverflowTextColor(r4)
        L_0x0351:
            int r4 = defpackage.z2c.TextInputLayout_placeholderTextColor
            boolean r4 = r2.hasValue(r4)
            if (r4 == 0) goto L_0x0362
            int r4 = defpackage.z2c.TextInputLayout_placeholderTextColor
            android.content.res.ColorStateList r4 = r1.l(r4)
            r0.setPlaceholderTextColor(r4)
        L_0x0362:
            m15 r4 = new m15
            r4.<init>(r0, r1)
            r0.c = r4
            int r5 = defpackage.z2c.TextInputLayout_android_enabled
            r6 = 1
            boolean r2 = r2.getBoolean(r5, r6)
            r1.z()
            java.util.WeakHashMap r1 = defpackage.zmf.a
            r1 = 2
            r0.setImportantForAccessibility(r1)
            defpackage.rmf.m(r0, r6)
            r14.addView(r3)
            r14.addView(r4)
            r0.addView(r14)
            r0.setEnabled(r2)
            r0.setHelperTextEnabled(r9)
            r0.setErrorEnabled(r7)
            r0.setCounterEnabled(r10)
            r1 = r18
            r0.setHelperText(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.o;
        if (!(editText instanceof AutoCompleteTextView) || ft.n(editText)) {
            return this.T0;
        }
        int z = mr0.z(this.o, tsb.colorControlHighlight);
        int i = this.c1;
        int[][] iArr = O1;
        if (i == 2) {
            Context context = getContext();
            q18 q18 = this.T0;
            int y = mr0.y(tsb.colorSurface, context, "TextInputLayout");
            q18 q182 = new q18(q18.a.a);
            int N = mr0.N(z, 0.1f, y);
            q182.l(new ColorStateList(iArr, new int[]{N, 0}));
            q182.setTint(y);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{N, y});
            q18 q183 = new q18(q18.a.a);
            q183.setTint(-1);
            return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, q182, q183), q18});
        } else if (i != 1) {
            return null;
        } else {
            q18 q184 = this.T0;
            int i2 = this.i1;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{mr0.N(z, 0.1f, i2), i2}), q184, q184);
        }
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.V0 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.V0 = stateListDrawable;
            stateListDrawable.addState(new int[]{16842922}, getOrCreateOutlinedDropDownMenuBackground());
            this.V0.addState(new int[0], f(false));
        }
        return this.V0;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.U0 == null) {
            this.U0 = f(true);
        }
        return this.U0;
    }

    public static void k(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.o == null) {
            if (getEndIconMode() != 3) {
                boolean z = editText instanceof TextInputEditText;
            }
            this.o = editText;
            int i = this.t0;
            if (i != -1) {
                setMinEms(i);
            } else {
                setMinWidth(this.v0);
            }
            int i2 = this.u0;
            if (i2 != -1) {
                setMaxEms(i2);
            } else {
                setMaxWidth(this.w0);
            }
            this.W0 = false;
            i();
            setTextInputAccessibilityDelegate(new lpe(this));
            Typeface typeface = this.o.getTypeface();
            s53 s53 = this.G1;
            boolean m = s53.m(typeface);
            boolean o2 = s53.o(typeface);
            if (m || o2) {
                s53.i(false);
            }
            float textSize = this.o.getTextSize();
            if (s53.l != textSize) {
                s53.l = textSize;
                s53.i(false);
            }
            float letterSpacing = this.o.getLetterSpacing();
            if (s53.g0 != letterSpacing) {
                s53.g0 = letterSpacing;
                s53.i(false);
            }
            int gravity = this.o.getGravity();
            s53.l((gravity & -113) | 48);
            if (s53.j != gravity) {
                s53.j = gravity;
                s53.i(false);
            }
            WeakHashMap weakHashMap = zmf.a;
            this.E1 = editText.getMinimumHeight();
            this.o.addTextChangedListener(new kpe(this, editText));
            if (this.t1 == null) {
                this.t1 = this.o.getHintTextColors();
            }
            if (this.Q0) {
                if (TextUtils.isEmpty(this.R0)) {
                    CharSequence hint = this.o.getHint();
                    this.s0 = hint;
                    setHint(hint);
                    this.o.setHint((CharSequence) null);
                }
                this.S0 = true;
            }
            p();
            if (this.C0 != null) {
                n(this.o.getText());
            }
            r();
            this.x0.b();
            this.b.bringToFront();
            m15 m15 = this.c;
            m15.bringToFront();
            Iterator it = this.p1.iterator();
            while (it.hasNext()) {
                ((l15) it.next()).a(this);
            }
            m15.m();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            u(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.R0)) {
            this.R0 = charSequence;
            s53 s53 = this.G1;
            if (charSequence == null || !TextUtils.equals(s53.G, charSequence)) {
                s53.G = charSequence;
                s53.H = null;
                Bitmap bitmap = s53.K;
                if (bitmap != null) {
                    bitmap.recycle();
                    s53.K = null;
                }
                s53.i(false);
            }
            if (!this.F1) {
                j();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.G0 != z) {
            if (z) {
                AppCompatTextView appCompatTextView = this.H0;
                if (appCompatTextView != null) {
                    this.a.addView(appCompatTextView);
                    this.H0.setVisibility(0);
                }
            } else {
                AppCompatTextView appCompatTextView2 = this.H0;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setVisibility(8);
                }
                this.H0 = null;
            }
            this.G0 = z;
        }
    }

    public final void a(float f) {
        s53 s53 = this.G1;
        if (s53.b != f) {
            if (this.J1 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.J1 = valueAnimator;
                valueAnimator.setInterpolator(z7.Q(getContext(), tsb.motionEasingEmphasizedInterpolator, og.b));
                this.J1.setDuration((long) z7.P(tsb.motionDurationMedium4, 167, getContext()));
                this.J1.addUpdateListener(new yj0(8, this));
            }
            this.J1.setFloatValues(new float[]{s53.b, f});
            this.J1.start();
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            FrameLayout frameLayout = this.a;
            frameLayout.addView(view, layoutParams2);
            frameLayout.setLayoutParams(layoutParams);
            t();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    public final void b() {
        int i;
        int i2;
        q18 q18 = this.T0;
        if (q18 != null) {
            gjd gjd = q18.a.a;
            gjd gjd2 = this.Z0;
            if (gjd != gjd2) {
                q18.setShapeAppearanceModel(gjd2);
            }
            if (this.c1 == 2 && (i = this.e1) > -1 && (i2 = this.h1) != 0) {
                q18 q182 = this.T0;
                q182.a.k = (float) i;
                q182.invalidateSelf();
                q182.n(ColorStateList.valueOf(i2));
            }
            int i3 = this.i1;
            if (this.c1 == 1) {
                i3 = s63.g(this.i1, mr0.x(tsb.colorSurface, 0, getContext()));
            }
            this.i1 = i3;
            this.T0.l(ColorStateList.valueOf(i3));
            q18 q183 = this.X0;
            if (!(q183 == null || this.Y0 == null)) {
                if (this.e1 > -1 && this.h1 != 0) {
                    q183.l(this.o.isFocused() ? ColorStateList.valueOf(this.v1) : ColorStateList.valueOf(this.h1));
                    this.Y0.l(ColorStateList.valueOf(this.h1));
                }
                invalidate();
            }
            s();
        }
    }

    public final int c() {
        float e;
        if (!this.Q0) {
            return 0;
        }
        int i = this.c1;
        s53 s53 = this.G1;
        if (i == 0) {
            e = s53.e();
        } else if (i != 2) {
            return 0;
        } else {
            e = s53.e() / 2.0f;
        }
        return (int) e;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [wa5, gqf, w1f] */
    public final wa5 d() {
        ? gqf = new gqf();
        gqf.c = (long) z7.P(tsb.motionDurationShort2, 87, getContext());
        gqf.o = z7.Q(getContext(), tsb.motionEasingLinearInterpolator, og.a);
        return gqf;
    }

    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.o;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.s0 != null) {
            boolean z = this.S0;
            this.S0 = false;
            CharSequence hint = editText.getHint();
            this.o.setHint(this.s0);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
            } finally {
                this.o.setHint(hint);
                this.S0 = z;
            }
        } else {
            viewStructure.setAutofillId(getAutofillId());
            onProvideAutofillStructure(viewStructure, i);
            onProvideAutofillVirtualStructure(viewStructure, i);
            FrameLayout frameLayout = this.a;
            viewStructure.setChildCount(frameLayout.getChildCount());
            for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
                View childAt = frameLayout.getChildAt(i2);
                ViewStructure newChild = viewStructure.newChild(i2);
                childAt.dispatchProvideAutofillStructure(newChild, i);
                if (childAt == this.o) {
                    newChild.setHint(getHint());
                }
            }
        }
    }

    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.L1 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.L1 = false;
    }

    public final void draw(Canvas canvas) {
        q18 q18;
        super.draw(canvas);
        boolean z = this.Q0;
        s53 s53 = this.G1;
        if (z) {
            s53.d(canvas);
        }
        if (this.Y0 != null && (q18 = this.X0) != null) {
            q18.draw(canvas);
            if (this.o.isFocused()) {
                Rect bounds = this.Y0.getBounds();
                Rect bounds2 = this.X0.getBounds();
                float f = s53.b;
                int centerX = bounds2.centerX();
                bounds.left = og.c(centerX, f, bounds2.left);
                bounds.right = og.c(centerX, f, bounds2.right);
                this.Y0.draw(canvas);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.K1
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 1
            r4.K1 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            s53 r3 = r4.G1
            if (r3 == 0) goto L_0x002f
            r3.R = r1
            android.content.res.ColorStateList r1 = r3.o
            if (r1 == 0) goto L_0x0020
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L_0x002a
        L_0x0020:
            android.content.res.ColorStateList r1 = r3.n
            if (r1 == 0) goto L_0x002f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L_0x002f
        L_0x002a:
            r3.i(r2)
            r1 = r0
            goto L_0x0030
        L_0x002f:
            r1 = r2
        L_0x0030:
            android.widget.EditText r3 = r4.o
            if (r3 == 0) goto L_0x0047
            java.util.WeakHashMap r3 = defpackage.zmf.a
            boolean r3 = r4.isLaidOut()
            if (r3 == 0) goto L_0x0043
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            r0 = r2
        L_0x0044:
            r4.u(r0, r2)
        L_0x0047:
            r4.r()
            r4.x()
            if (r1 == 0) goto L_0x0052
            r4.invalidate()
        L_0x0052:
            r4.K1 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final boolean e() {
        return this.Q0 && !TextUtils.isEmpty(this.R0) && (this.T0 instanceof y04);
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [hm9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v0, types: [hm9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v0, types: [hm9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v0, types: [hm9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v0, types: [vu4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v0, types: [vu4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v0, types: [vu4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v0, types: [vu4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v3, types: [gjd, java.lang.Object] */
    public final q18 f(boolean z) {
        float dimensionPixelOffset = (float) getResources().getDimensionPixelOffset(stb.mtrl_shape_corner_size_small_component);
        float f = z ? dimensionPixelOffset : 0.0f;
        EditText editText = this.o;
        float popupElevation = editText instanceof u08 ? ((u08) editText).getPopupElevation() : (float) getResources().getDimensionPixelOffset(stb.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(stb.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        ? obj = new Object();
        ? obj2 = new Object();
        ? obj3 = new Object();
        ? obj4 = new Object();
        ? obj5 = new Object();
        ? obj6 = new Object();
        ? obj7 = new Object();
        ? obj8 = new Object();
        a0 a0Var = new a0(f);
        a0 a0Var2 = new a0(f);
        a0 a0Var3 = new a0(dimensionPixelOffset);
        a0 a0Var4 = new a0(dimensionPixelOffset);
        ? obj9 = new Object();
        obj9.a = obj;
        obj9.b = obj2;
        obj9.c = obj3;
        obj9.d = obj4;
        obj9.e = a0Var;
        obj9.f = a0Var2;
        obj9.g = a0Var4;
        obj9.h = a0Var3;
        obj9.i = obj5;
        obj9.j = obj6;
        obj9.k = obj7;
        obj9.l = obj8;
        EditText editText2 = this.o;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof u08 ? ((u08) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = q18.I0;
            dropDownBackgroundTintList = ColorStateList.valueOf(mr0.y(tsb.colorSurface, context, q18.class.getSimpleName()));
        }
        q18 q18 = new q18();
        q18.j(context);
        q18.l(dropDownBackgroundTintList);
        q18.k(popupElevation);
        q18.setShapeAppearanceModel(obj9);
        p18 p18 = q18.a;
        if (p18.h == null) {
            p18.h = new Rect();
        }
        q18.a.h.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        q18.invalidateSelf();
        return q18;
    }

    public final int g(int i, boolean z) {
        return ((z || getPrefixText() == null) ? (!z || getSuffixText() == null) ? this.o.getCompoundPaddingLeft() : this.c.c() : this.b.a()) + i;
    }

    public int getBaseline() {
        EditText editText = this.o;
        if (editText == null) {
            return super.getBaseline();
        }
        int baseline = editText.getBaseline();
        return c() + getPaddingTop() + baseline;
    }

    public q18 getBoxBackground() {
        int i = this.c1;
        if (i == 1 || i == 2) {
            return this.T0;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.i1;
    }

    public int getBoxBackgroundMode() {
        return this.c1;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.d1;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean t = mqd.t(this);
        RectF rectF = this.l1;
        return t ? this.Z0.h.a(rectF) : this.Z0.g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean t = mqd.t(this);
        RectF rectF = this.l1;
        return t ? this.Z0.g.a(rectF) : this.Z0.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean t = mqd.t(this);
        RectF rectF = this.l1;
        return t ? this.Z0.e.a(rectF) : this.Z0.f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean t = mqd.t(this);
        RectF rectF = this.l1;
        return t ? this.Z0.f.a(rectF) : this.Z0.e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.x1;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.y1;
    }

    public int getBoxStrokeWidth() {
        return this.f1;
    }

    public int getBoxStrokeWidthFocused() {
        return this.g1;
    }

    public int getCounterMaxLength() {
        return this.z0;
    }

    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (!this.y0 || !this.A0 || (appCompatTextView = this.C0) == null) {
            return null;
        }
        return appCompatTextView.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.N0;
    }

    public ColorStateList getCounterTextColor() {
        return this.M0;
    }

    public ColorStateList getCursorColor() {
        return this.O0;
    }

    public ColorStateList getCursorErrorColor() {
        return this.P0;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.t1;
    }

    public EditText getEditText() {
        return this.o;
    }

    public CharSequence getEndIconContentDescription() {
        return this.c.u0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.c.u0.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.c.A0;
    }

    public int getEndIconMode() {
        return this.c.w0;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.c.B0;
    }

    public CheckableImageButton getEndIconView() {
        return this.c.u0;
    }

    public CharSequence getError() {
        b07 b07 = this.x0;
        if (b07.q) {
            return b07.p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.x0.t;
    }

    public CharSequence getErrorContentDescription() {
        return this.x0.s;
    }

    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.x0.r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.c.c.getDrawable();
    }

    public CharSequence getHelperText() {
        b07 b07 = this.x0;
        if (b07.x) {
            return b07.w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.x0.y;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.Q0) {
            return this.R0;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.G1.e();
    }

    public final int getHintCurrentCollapsedTextColor() {
        s53 s53 = this.G1;
        return s53.f(s53.o);
    }

    public ColorStateList getHintTextColor() {
        return this.u1;
    }

    public mpe getLengthCounter() {
        return this.B0;
    }

    public int getMaxEms() {
        return this.u0;
    }

    public int getMaxWidth() {
        return this.w0;
    }

    public int getMinEms() {
        return this.t0;
    }

    public int getMinWidth() {
        return this.v0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.c.u0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.c.u0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.G0) {
            return this.F0;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.J0;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.I0;
    }

    public CharSequence getPrefixText() {
        return this.b.c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.b.b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.b.b;
    }

    public gjd getShapeAppearanceModel() {
        return this.Z0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.b.o.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.b.o.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.b.u0;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.b.v0;
    }

    public CharSequence getSuffixText() {
        return this.c.D0;
    }

    public ColorStateList getSuffixTextColor() {
        return this.c.E0.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.c.E0;
    }

    public Typeface getTypeface() {
        return this.m1;
    }

    public final int h(int i, boolean z) {
        return i - ((z || getSuffixText() == null) ? (!z || getPrefixText() == null) ? this.o.getCompoundPaddingRight() : this.b.a() : this.c.c());
    }

    public final void i() {
        int i = this.c1;
        if (i == 0) {
            this.T0 = null;
            this.X0 = null;
            this.Y0 = null;
        } else if (i == 1) {
            this.T0 = new q18(this.Z0);
            this.X0 = new q18();
            this.Y0 = new q18();
        } else if (i == 2) {
            if (!this.Q0 || (this.T0 instanceof y04)) {
                this.T0 = new q18(this.Z0);
            } else {
                gjd gjd = this.Z0;
                int i2 = y04.K0;
                if (gjd == null) {
                    gjd = new gjd();
                }
                this.T0 = new y04(new x04(gjd, new RectF()));
            }
            this.X0 = null;
            this.Y0 = null;
        } else {
            throw new IllegalArgumentException(zr6.j(new StringBuilder(), this.c1, " is illegal; only @BoxBackgroundMode constants are supported."));
        }
        s();
        x();
        if (this.c1 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.d1 = getResources().getDimensionPixelSize(stb.material_font_2_0_box_collapsed_padding_top);
            } else if (ju0.A(getContext())) {
                this.d1 = getResources().getDimensionPixelSize(stb.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.o != null && this.c1 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.o;
                WeakHashMap weakHashMap = zmf.a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(stb.material_filled_edittext_font_2_0_padding_top), this.o.getPaddingEnd(), getResources().getDimensionPixelSize(stb.material_filled_edittext_font_2_0_padding_bottom));
            } else if (ju0.A(getContext())) {
                EditText editText2 = this.o;
                WeakHashMap weakHashMap2 = zmf.a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(stb.material_filled_edittext_font_1_3_padding_top), this.o.getPaddingEnd(), getResources().getDimensionPixelSize(stb.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.c1 != 0) {
            t();
        }
        EditText editText3 = this.o;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.c1;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i3 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j() {
        /*
            r12 = this;
            boolean r0 = r12.e()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            android.widget.EditText r0 = r12.o
            int r0 = r0.getWidth()
            android.widget.EditText r1 = r12.o
            int r1 = r1.getGravity()
            s53 r2 = r12.G1
            java.lang.CharSequence r3 = r2.G
            boolean r3 = r2.b(r3)
            r2.I = r3
            r4 = 5
            r5 = 1073741824(0x40000000, float:2.0)
            r6 = 8388613(0x800005, float:1.175495E-38)
            r7 = 1
            r8 = 17
            android.graphics.Rect r9 = r2.h
            if (r1 == r8) goto L_0x004f
            r10 = r1 & 7
            if (r10 != r7) goto L_0x002f
            goto L_0x004f
        L_0x002f:
            r10 = r1 & r6
            if (r10 == r6) goto L_0x0044
            r10 = r1 & 5
            if (r10 != r4) goto L_0x0038
            goto L_0x0044
        L_0x0038:
            if (r3 == 0) goto L_0x0040
            int r3 = r9.right
            float r3 = (float) r3
            float r10 = r2.j0
            goto L_0x0054
        L_0x0040:
            int r3 = r9.left
        L_0x0042:
            float r3 = (float) r3
            goto L_0x0055
        L_0x0044:
            if (r3 == 0) goto L_0x0049
            int r3 = r9.left
            goto L_0x0042
        L_0x0049:
            int r3 = r9.right
            float r3 = (float) r3
            float r10 = r2.j0
            goto L_0x0054
        L_0x004f:
            float r3 = (float) r0
            float r3 = r3 / r5
            float r10 = r2.j0
            float r10 = r10 / r5
        L_0x0054:
            float r3 = r3 - r10
        L_0x0055:
            int r10 = r9.left
            float r10 = (float) r10
            float r3 = java.lang.Math.max(r3, r10)
            android.graphics.RectF r10 = r12.l1
            r10.left = r3
            int r11 = r9.top
            float r11 = (float) r11
            r10.top = r11
            if (r1 == r8) goto L_0x008d
            r8 = r1 & 7
            if (r8 != r7) goto L_0x006c
            goto L_0x008d
        L_0x006c:
            r0 = r1 & r6
            if (r0 == r6) goto L_0x0081
            r0 = r1 & 5
            if (r0 != r4) goto L_0x0075
            goto L_0x0081
        L_0x0075:
            boolean r0 = r2.I
            if (r0 == 0) goto L_0x007d
            int r0 = r9.right
        L_0x007b:
            float r0 = (float) r0
            goto L_0x0093
        L_0x007d:
            float r0 = r2.j0
            float r0 = r0 + r3
            goto L_0x0093
        L_0x0081:
            boolean r0 = r2.I
            if (r0 == 0) goto L_0x008a
            float r0 = r2.j0
            float r3 = r3 + r0
            r0 = r3
            goto L_0x0093
        L_0x008a:
            int r0 = r9.right
            goto L_0x007b
        L_0x008d:
            float r0 = (float) r0
            float r0 = r0 / r5
            float r1 = r2.j0
            float r1 = r1 / r5
            float r0 = r0 + r1
        L_0x0093:
            int r1 = r9.right
            float r1 = (float) r1
            float r0 = java.lang.Math.min(r0, r1)
            r10.right = r0
            int r0 = r9.top
            float r0 = (float) r0
            float r1 = r2.e()
            float r1 = r1 + r0
            r10.bottom = r1
            float r0 = r10.width()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f0
            float r0 = r10.height()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00b8
            goto L_0x00f0
        L_0x00b8:
            float r0 = r10.left
            int r1 = r12.b1
            float r1 = (float) r1
            float r0 = r0 - r1
            r10.left = r0
            float r0 = r10.right
            float r0 = r0 + r1
            r10.right = r0
            int r0 = r12.getPaddingLeft()
            int r0 = -r0
            float r0 = (float) r0
            int r1 = r12.getPaddingTop()
            int r1 = -r1
            float r1 = (float) r1
            float r2 = r10.height()
            float r2 = r2 / r5
            float r1 = r1 - r2
            int r2 = r12.e1
            float r2 = (float) r2
            float r1 = r1 + r2
            r10.offset(r0, r1)
            q18 r12 = r12.T0
            y04 r12 = (defpackage.y04) r12
            r12.getClass()
            float r0 = r10.left
            float r1 = r10.top
            float r2 = r10.right
            float r3 = r10.bottom
            r12.r(r0, r1, r2, r3)
        L_0x00f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.j():void");
    }

    public final void l(TextView textView, int i) {
        try {
            textView.setTextAppearance(i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        textView.setTextAppearance(m2c.TextAppearance_AppCompat_Caption);
        textView.setTextColor(lt3.a(getContext(), etb.design_error));
    }

    public final boolean m() {
        b07 b07 = this.x0;
        return b07.o == 1 && b07.r != null && !TextUtils.isEmpty(b07.p);
    }

    public final void n(Editable editable) {
        ((hme) this.B0).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z = this.A0;
        int i = this.z0;
        String str = null;
        if (i == -1) {
            this.C0.setText(String.valueOf(length));
            this.C0.setContentDescription((CharSequence) null);
            this.A0 = false;
        } else {
            this.A0 = length > i;
            Context context = getContext();
            this.C0.setContentDescription(context.getString(this.A0 ? wzb.character_counter_overflowed_content_description : wzb.character_counter_content_description, new Object[]{Integer.valueOf(length), Integer.valueOf(this.z0)}));
            if (z != this.A0) {
                o();
            }
            rl0 c2 = rl0.c();
            AppCompatTextView appCompatTextView = this.C0;
            String string = getContext().getString(wzb.character_counter_pattern, new Object[]{Integer.valueOf(length), Integer.valueOf(this.z0)});
            if (string == null) {
                c2.getClass();
            } else {
                str = c2.d(string, c2.c).toString();
            }
            appCompatTextView.setText(str);
        }
        if (this.o != null && z != this.A0) {
            u(false, false);
            x();
            r();
        }
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.C0;
        if (appCompatTextView != null) {
            l(appCompatTextView, this.A0 ? this.D0 : this.E0);
            if (!this.A0 && (colorStateList2 = this.M0) != null) {
                this.C0.setTextColor(colorStateList2);
            }
            if (this.A0 && (colorStateList = this.N0) != null) {
                this.C0.setTextColor(colorStateList);
            }
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.G1.h(configuration);
    }

    public final void onGlobalLayout() {
        int max;
        m15 m15 = this.c;
        m15.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.M1 = false;
        if (this.o != null && this.o.getMeasuredHeight() < (max = Math.max(m15.getMeasuredHeight(), this.b.getMeasuredHeight()))) {
            this.o.setMinimumHeight(max);
            z = true;
        }
        boolean q = q();
        if (z || q) {
            this.o.post(new ule(2, this));
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.o;
        if (editText != null) {
            ThreadLocal threadLocal = uh4.a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.j1;
            rect.set(0, 0, width, height);
            uh4.b(this, editText, rect);
            q18 q18 = this.X0;
            if (q18 != null) {
                int i5 = rect.bottom;
                q18.setBounds(rect.left, i5 - this.f1, rect.right, i5);
            }
            q18 q182 = this.Y0;
            if (q182 != null) {
                int i6 = rect.bottom;
                q182.setBounds(rect.left, i6 - this.g1, rect.right, i6);
            }
            if (this.Q0) {
                float textSize = this.o.getTextSize();
                s53 s53 = this.G1;
                if (s53.l != textSize) {
                    s53.l = textSize;
                    s53.i(false);
                }
                int gravity = this.o.getGravity();
                s53.l((gravity & -113) | 48);
                if (s53.j != gravity) {
                    s53.j = gravity;
                    s53.i(false);
                }
                if (this.o != null) {
                    boolean t = mqd.t(this);
                    int i7 = rect.bottom;
                    Rect rect2 = this.k1;
                    rect2.bottom = i7;
                    int i8 = this.c1;
                    if (i8 == 1) {
                        rect2.left = g(rect.left, t);
                        rect2.top = rect.top + this.d1;
                        rect2.right = h(rect.right, t);
                    } else if (i8 != 2) {
                        rect2.left = g(rect.left, t);
                        rect2.top = getPaddingTop();
                        rect2.right = h(rect.right, t);
                    } else {
                        rect2.left = this.o.getPaddingLeft() + rect.left;
                        rect2.top = rect.top - c();
                        rect2.right = rect.right - this.o.getPaddingRight();
                    }
                    int i9 = rect2.left;
                    int i10 = rect2.top;
                    int i11 = rect2.right;
                    int i12 = rect2.bottom;
                    Rect rect3 = s53.h;
                    if (!(rect3.left == i9 && rect3.top == i10 && rect3.right == i11 && rect3.bottom == i12)) {
                        rect3.set(i9, i10, i11, i12);
                        s53.S = true;
                    }
                    if (this.o != null) {
                        TextPaint textPaint = s53.U;
                        textPaint.setTextSize(s53.l);
                        textPaint.setTypeface(s53.z);
                        textPaint.setLetterSpacing(s53.g0);
                        float f = -textPaint.ascent();
                        rect2.left = this.o.getCompoundPaddingLeft() + rect.left;
                        rect2.top = (this.c1 != 1 || this.o.getMinLines() > 1) ? rect.top + this.o.getCompoundPaddingTop() : (int) (((float) rect.centerY()) - (f / 2.0f));
                        rect2.right = rect.right - this.o.getCompoundPaddingRight();
                        int compoundPaddingBottom = (this.c1 != 1 || this.o.getMinLines() > 1) ? rect.bottom - this.o.getCompoundPaddingBottom() : (int) (((float) rect2.top) + f);
                        rect2.bottom = compoundPaddingBottom;
                        int i13 = rect2.left;
                        int i14 = rect2.top;
                        int i15 = rect2.right;
                        Rect rect4 = s53.g;
                        if (!(rect4.left == i13 && rect4.top == i14 && rect4.right == i15 && rect4.bottom == compoundPaddingBottom)) {
                            rect4.set(i13, i14, i15, compoundPaddingBottom);
                            s53.S = true;
                        }
                        s53.i(false);
                        if (e() && !this.F1) {
                            j();
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException();
                }
                throw new IllegalStateException();
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        EditText editText;
        super.onMeasure(i, i2);
        boolean z = this.M1;
        m15 m15 = this.c;
        if (!z) {
            m15.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.M1 = true;
        }
        if (!(this.H0 == null || (editText = this.o) == null)) {
            this.H0.setGravity(editText.getGravity());
            this.H0.setPadding(this.o.getCompoundPaddingLeft(), this.o.getCompoundPaddingTop(), this.o.getCompoundPaddingRight(), this.o.getCompoundPaddingBottom());
        }
        m15.m();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof npe)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        npe npe = (npe) parcelable;
        super.onRestoreInstanceState(npe.a);
        setError(npe.c);
        if (npe.o) {
            post(new q57(29, this));
        }
        requestLayout();
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [vu4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v0, types: [vu4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v0, types: [vu4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v0, types: [vu4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v3, types: [gjd, java.lang.Object] */
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z != this.a1) {
            hx3 hx3 = this.Z0.e;
            RectF rectF = this.l1;
            float a2 = hx3.a(rectF);
            float a3 = this.Z0.f.a(rectF);
            float a4 = this.Z0.h.a(rectF);
            float a5 = this.Z0.g.a(rectF);
            gjd gjd = this.Z0;
            hm9 hm9 = gjd.a;
            hm9 hm92 = gjd.b;
            hm9 hm93 = gjd.d;
            hm9 hm94 = gjd.c;
            ? obj = new Object();
            ? obj2 = new Object();
            ? obj3 = new Object();
            ? obj4 = new Object();
            i8g.d(hm92);
            i8g.d(hm9);
            i8g.d(hm94);
            i8g.d(hm93);
            a0 a0Var = new a0(a3);
            a0 a0Var2 = new a0(a2);
            a0 a0Var3 = new a0(a5);
            a0 a0Var4 = new a0(a4);
            ? obj5 = new Object();
            obj5.a = hm92;
            obj5.b = hm9;
            obj5.c = hm93;
            obj5.d = hm94;
            obj5.e = a0Var;
            obj5.f = a0Var2;
            obj5.g = a0Var4;
            obj5.h = a0Var3;
            obj5.i = obj;
            obj5.j = obj2;
            obj5.k = obj3;
            obj5.l = obj4;
            this.a1 = z;
            setShapeAppearanceModel(obj5);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [npe, android.os.Parcelable, z] */
    public final Parcelable onSaveInstanceState() {
        ? zVar = new z(super.onSaveInstanceState());
        if (m()) {
            zVar.c = getError();
        }
        m15 m15 = this.c;
        zVar.o = m15.w0 != 0 && m15.u0.o;
        return zVar;
    }

    public final void p() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.O0;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue C = kq0.C(context, tsb.colorControlActivated);
            if (C != null) {
                int i = C.resourceId;
                if (i != 0) {
                    colorStateList2 = z7.n(context, i);
                } else {
                    int i2 = C.data;
                    if (i2 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i2);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.o;
        if (editText != null && editText.getTextCursorDrawable() != null) {
            Drawable mutate = this.o.getTextCursorDrawable().mutate();
            if ((m() || (this.C0 != null && this.A0)) && (colorStateList = this.P0) != null) {
                colorStateList2 = colorStateList;
            }
            aq4.h(mutate, colorStateList2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean q() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.o
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            android.graphics.drawable.Drawable r0 = r10.getStartIconDrawable()
            r2 = 0
            r3 = 2
            r4 = 3
            r5 = 1
            if (r0 != 0) goto L_0x0020
            java.lang.CharSequence r0 = r10.getPrefixText()
            if (r0 == 0) goto L_0x005f
            android.widget.TextView r0 = r10.getPrefixTextView()
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x005f
        L_0x0020:
            myd r0 = r10.b
            int r6 = r0.getMeasuredWidth()
            if (r6 <= 0) goto L_0x005f
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.o
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            android.graphics.drawable.ColorDrawable r6 = r10.n1
            if (r6 == 0) goto L_0x003b
            int r6 = r10.o1
            if (r6 == r0) goto L_0x0047
        L_0x003b:
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.n1 = r6
            r10.o1 = r0
            r6.setBounds(r1, r1, r0, r5)
        L_0x0047:
            android.widget.EditText r0 = r10.o
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
            r6 = r0[r1]
            android.graphics.drawable.ColorDrawable r7 = r10.n1
            if (r6 == r7) goto L_0x0078
            android.widget.EditText r6 = r10.o
            r8 = r0[r5]
            r9 = r0[r3]
            r0 = r0[r4]
            r6.setCompoundDrawablesRelative(r7, r8, r9, r0)
            goto L_0x0076
        L_0x005f:
            android.graphics.drawable.ColorDrawable r0 = r10.n1
            if (r0 == 0) goto L_0x0078
            android.widget.EditText r0 = r10.o
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
            android.widget.EditText r6 = r10.o
            r7 = r0[r5]
            r8 = r0[r3]
            r0 = r0[r4]
            r6.setCompoundDrawablesRelative(r2, r7, r8, r0)
            r10.n1 = r2
        L_0x0076:
            r0 = r5
            goto L_0x0079
        L_0x0078:
            r0 = r1
        L_0x0079:
            m15 r6 = r10.c
            boolean r7 = r6.e()
            if (r7 != 0) goto L_0x008f
            int r7 = r6.w0
            if (r7 == 0) goto L_0x008b
            boolean r7 = r6.d()
            if (r7 != 0) goto L_0x008f
        L_0x008b:
            java.lang.CharSequence r7 = r6.D0
            if (r7 == 0) goto L_0x0110
        L_0x008f:
            int r7 = r6.getMeasuredWidth()
            if (r7 <= 0) goto L_0x0110
            androidx.appcompat.widget.AppCompatTextView r7 = r6.E0
            int r7 = r7.getMeasuredWidth()
            android.widget.EditText r8 = r10.o
            int r8 = r8.getPaddingRight()
            int r7 = r7 - r8
            boolean r8 = r6.e()
            if (r8 == 0) goto L_0x00ab
            com.google.android.material.internal.CheckableImageButton r2 = r6.c
            goto L_0x00b7
        L_0x00ab:
            int r8 = r6.w0
            if (r8 == 0) goto L_0x00b7
            boolean r8 = r6.d()
            if (r8 == 0) goto L_0x00b7
            com.google.android.material.internal.CheckableImageButton r2 = r6.u0
        L_0x00b7:
            if (r2 == 0) goto L_0x00ca
            int r6 = r2.getMeasuredWidth()
            int r6 = r6 + r7
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r2 = r2.getMarginStart()
            int r7 = r2 + r6
        L_0x00ca:
            android.widget.EditText r2 = r10.o
            android.graphics.drawable.Drawable[] r2 = r2.getCompoundDrawablesRelative()
            android.graphics.drawable.ColorDrawable r6 = r10.q1
            if (r6 == 0) goto L_0x00eb
            int r8 = r10.r1
            if (r8 == r7) goto L_0x00eb
            r10.r1 = r7
            r6.setBounds(r1, r1, r7, r5)
            android.widget.EditText r0 = r10.o
            r1 = r2[r1]
            r3 = r2[r5]
            android.graphics.drawable.ColorDrawable r10 = r10.q1
            r2 = r2[r4]
            r0.setCompoundDrawablesRelative(r1, r3, r10, r2)
            goto L_0x010e
        L_0x00eb:
            if (r6 != 0) goto L_0x00f9
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.q1 = r6
            r10.r1 = r7
            r6.setBounds(r1, r1, r7, r5)
        L_0x00f9:
            r3 = r2[r3]
            android.graphics.drawable.ColorDrawable r6 = r10.q1
            if (r3 == r6) goto L_0x010d
            r10.s1 = r3
            android.widget.EditText r10 = r10.o
            r0 = r2[r1]
            r1 = r2[r5]
            r2 = r2[r4]
            r10.setCompoundDrawablesRelative(r0, r1, r6, r2)
            goto L_0x010e
        L_0x010d:
            r5 = r0
        L_0x010e:
            r0 = r5
            goto L_0x0132
        L_0x0110:
            android.graphics.drawable.ColorDrawable r6 = r10.q1
            if (r6 == 0) goto L_0x0132
            android.widget.EditText r6 = r10.o
            android.graphics.drawable.Drawable[] r6 = r6.getCompoundDrawablesRelative()
            r3 = r6[r3]
            android.graphics.drawable.ColorDrawable r7 = r10.q1
            if (r3 != r7) goto L_0x012e
            android.widget.EditText r0 = r10.o
            r1 = r6[r1]
            r3 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.s1
            r4 = r6[r4]
            r0.setCompoundDrawablesRelative(r1, r3, r7, r4)
            goto L_0x012f
        L_0x012e:
            r5 = r0
        L_0x012f:
            r10.q1 = r2
            goto L_0x010e
        L_0x0132:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.q():boolean");
    }

    public final void r() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this.o;
        if (editText != null && this.c1 == 0 && (background = editText.getBackground()) != null) {
            int[] iArr = hq4.a;
            Drawable mutate = background.mutate();
            if (m()) {
                mutate.setColorFilter(gn.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
            } else if (!this.A0 || (appCompatTextView = this.C0) == null) {
                mutate.clearColorFilter();
                this.o.refreshDrawableState();
            } else {
                mutate.setColorFilter(gn.c(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    public final void s() {
        EditText editText = this.o;
        if (editText != null && this.T0 != null) {
            if ((this.W0 || editText.getBackground() == null) && this.c1 != 0) {
                Drawable editTextBoxBackground = getEditTextBoxBackground();
                EditText editText2 = this.o;
                WeakHashMap weakHashMap = zmf.a;
                editText2.setBackground(editTextBoxBackground);
                this.W0 = true;
            }
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.i1 != i) {
            this.i1 = i;
            this.z1 = i;
            this.B1 = i;
            this.C1 = i;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(lt3.a(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.z1 = defaultColor;
        this.i1 = defaultColor;
        this.A1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.B1 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.C1 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i) {
        if (i != this.c1) {
            this.c1 = i;
            if (this.o != null) {
                i();
            }
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.d1 = i;
    }

    public void setBoxCornerFamily(int i) {
        i8g e = this.Z0.e();
        hx3 hx3 = this.Z0.e;
        hm9 f = nu0.f(i);
        e.a = f;
        i8g.d(f);
        e.e = hx3;
        hx3 hx32 = this.Z0.f;
        hm9 f2 = nu0.f(i);
        e.b = f2;
        i8g.d(f2);
        e.f = hx32;
        hx3 hx33 = this.Z0.h;
        hm9 f3 = nu0.f(i);
        e.d = f3;
        i8g.d(f3);
        e.h = hx33;
        hx3 hx34 = this.Z0.g;
        hm9 f4 = nu0.f(i);
        e.c = f4;
        i8g.d(f4);
        e.g = hx34;
        this.Z0 = e.c();
        b();
    }

    public void setBoxStrokeColor(int i) {
        if (this.x1 != i) {
            this.x1 = i;
            x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.v1 = colorStateList.getDefaultColor();
            this.D1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.w1 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.x1 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.x1 != colorStateList.getDefaultColor()) {
            this.x1 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.y1 != colorStateList) {
            this.y1 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f1 = i;
        x();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.g1 = i;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.y0 != z) {
            Editable editable = null;
            b07 b07 = this.x0;
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
                this.C0 = appCompatTextView;
                appCompatTextView.setId(ivb.textinput_counter);
                Typeface typeface = this.m1;
                if (typeface != null) {
                    this.C0.setTypeface(typeface);
                }
                this.C0.setMaxLines(1);
                b07.a(this.C0, 2);
                ((ViewGroup.MarginLayoutParams) this.C0.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(stb.mtrl_textinput_counter_margin_start));
                o();
                if (this.C0 != null) {
                    EditText editText = this.o;
                    if (editText != null) {
                        editable = editText.getText();
                    }
                    n(editable);
                }
            } else {
                b07.g(this.C0, 2);
                this.C0 = null;
            }
            this.y0 = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.z0 != i) {
            if (i > 0) {
                this.z0 = i;
            } else {
                this.z0 = -1;
            }
            if (this.y0 && this.C0 != null) {
                EditText editText = this.o;
                n(editText == null ? null : editText.getText());
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.D0 != i) {
            this.D0 = i;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.N0 != colorStateList) {
            this.N0 = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.E0 != i) {
            this.E0 = i;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.M0 != colorStateList) {
            this.M0 = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.O0 != colorStateList) {
            this.O0 = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.P0 != colorStateList) {
            this.P0 = colorStateList;
            if (m() || (this.C0 != null && this.A0)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.t1 = colorStateList;
        this.u1 = colorStateList;
        if (this.o != null) {
            u(false, false);
        }
    }

    public void setEnabled(boolean z) {
        k(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.c.u0.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.c.u0.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        m15 m15 = this.c;
        CharSequence text = i != 0 ? m15.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = m15.u0;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        m15 m15 = this.c;
        Drawable n = i != 0 ? s36.n(m15.getContext(), i) : null;
        CheckableImageButton checkableImageButton = m15.u0;
        checkableImageButton.setImageDrawable(n);
        if (n != null) {
            ColorStateList colorStateList = m15.y0;
            PorterDuff.Mode mode = m15.z0;
            TextInputLayout textInputLayout = m15.a;
            a14.d(textInputLayout, checkableImageButton, colorStateList, mode);
            a14.I(textInputLayout, checkableImageButton, m15.y0);
        }
    }

    public void setEndIconMinSize(int i) {
        m15 m15 = this.c;
        if (i < 0) {
            m15.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        } else if (i != m15.A0) {
            m15.A0 = i;
            CheckableImageButton checkableImageButton = m15.u0;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = m15.c;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.c.g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        m15 m15 = this.c;
        View.OnLongClickListener onLongClickListener = m15.C0;
        CheckableImageButton checkableImageButton = m15.u0;
        checkableImageButton.setOnClickListener(onClickListener);
        a14.J(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        m15 m15 = this.c;
        m15.C0 = onLongClickListener;
        CheckableImageButton checkableImageButton = m15.u0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        a14.J(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        m15 m15 = this.c;
        m15.B0 = scaleType;
        m15.u0.setScaleType(scaleType);
        m15.c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        m15 m15 = this.c;
        if (m15.y0 != colorStateList) {
            m15.y0 = colorStateList;
            a14.d(m15.a, m15.u0, colorStateList, m15.z0);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        m15 m15 = this.c;
        if (m15.z0 != mode) {
            m15.z0 = mode;
            a14.d(m15.a, m15.u0, m15.y0, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.c.h(z);
    }

    public void setError(CharSequence charSequence) {
        b07 b07 = this.x0;
        if (!b07.q) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            b07.c();
            b07.p = charSequence;
            b07.r.setText(charSequence);
            int i = b07.n;
            if (i != 1) {
                b07.o = 1;
            }
            b07.i(i, b07.o, b07.h(b07.r, charSequence));
            return;
        }
        b07.f();
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        b07 b07 = this.x0;
        b07.t = i;
        AppCompatTextView appCompatTextView = b07.r;
        if (appCompatTextView != null) {
            WeakHashMap weakHashMap = zmf.a;
            appCompatTextView.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        b07 b07 = this.x0;
        b07.s = charSequence;
        AppCompatTextView appCompatTextView = b07.r;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        b07 b07 = this.x0;
        if (b07.q != z) {
            b07.c();
            TextInputLayout textInputLayout = b07.h;
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(b07.g, (AttributeSet) null);
                b07.r = appCompatTextView;
                appCompatTextView.setId(ivb.textinput_error);
                b07.r.setTextAlignment(5);
                Typeface typeface = b07.B;
                if (typeface != null) {
                    b07.r.setTypeface(typeface);
                }
                int i = b07.u;
                b07.u = i;
                AppCompatTextView appCompatTextView2 = b07.r;
                if (appCompatTextView2 != null) {
                    textInputLayout.l(appCompatTextView2, i);
                }
                ColorStateList colorStateList = b07.v;
                b07.v = colorStateList;
                AppCompatTextView appCompatTextView3 = b07.r;
                if (!(appCompatTextView3 == null || colorStateList == null)) {
                    appCompatTextView3.setTextColor(colorStateList);
                }
                CharSequence charSequence = b07.s;
                b07.s = charSequence;
                AppCompatTextView appCompatTextView4 = b07.r;
                if (appCompatTextView4 != null) {
                    appCompatTextView4.setContentDescription(charSequence);
                }
                int i2 = b07.t;
                b07.t = i2;
                AppCompatTextView appCompatTextView5 = b07.r;
                if (appCompatTextView5 != null) {
                    WeakHashMap weakHashMap = zmf.a;
                    appCompatTextView5.setAccessibilityLiveRegion(i2);
                }
                b07.r.setVisibility(4);
                b07.a(b07.r, 0);
            } else {
                b07.f();
                b07.g(b07.r, 0);
                b07.r = null;
                textInputLayout.r();
                textInputLayout.x();
            }
            b07.q = z;
        }
    }

    public void setErrorIconDrawable(int i) {
        m15 m15 = this.c;
        m15.i(i != 0 ? s36.n(m15.getContext(), i) : null);
        a14.I(m15.a, m15.c, m15.o);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        m15 m15 = this.c;
        CheckableImageButton checkableImageButton = m15.c;
        View.OnLongClickListener onLongClickListener = m15.t0;
        checkableImageButton.setOnClickListener(onClickListener);
        a14.J(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        m15 m15 = this.c;
        m15.t0 = onLongClickListener;
        CheckableImageButton checkableImageButton = m15.c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        a14.J(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        m15 m15 = this.c;
        if (m15.o != colorStateList) {
            m15.o = colorStateList;
            a14.d(m15.a, m15.c, colorStateList, m15.s0);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        m15 m15 = this.c;
        if (m15.s0 != mode) {
            m15.s0 = mode;
            a14.d(m15.a, m15.c, m15.o, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        b07 b07 = this.x0;
        b07.u = i;
        AppCompatTextView appCompatTextView = b07.r;
        if (appCompatTextView != null) {
            b07.h.l(appCompatTextView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        b07 b07 = this.x0;
        b07.v = colorStateList;
        AppCompatTextView appCompatTextView = b07.r;
        if (appCompatTextView != null && colorStateList != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.H1 != z) {
            this.H1 = z;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        b07 b07 = this.x0;
        if (!isEmpty) {
            if (!b07.x) {
                setHelperTextEnabled(true);
            }
            b07.c();
            b07.w = charSequence;
            b07.y.setText(charSequence);
            int i = b07.n;
            if (i != 2) {
                b07.o = 2;
            }
            b07.i(i, b07.o, b07.h(b07.y, charSequence));
        } else if (b07.x) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        b07 b07 = this.x0;
        b07.A = colorStateList;
        AppCompatTextView appCompatTextView = b07.y;
        if (appCompatTextView != null && colorStateList != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z) {
        b07 b07 = this.x0;
        if (b07.x != z) {
            b07.c();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(b07.g, (AttributeSet) null);
                b07.y = appCompatTextView;
                appCompatTextView.setId(ivb.textinput_helper_text);
                b07.y.setTextAlignment(5);
                Typeface typeface = b07.B;
                if (typeface != null) {
                    b07.y.setTypeface(typeface);
                }
                b07.y.setVisibility(4);
                AppCompatTextView appCompatTextView2 = b07.y;
                WeakHashMap weakHashMap = zmf.a;
                appCompatTextView2.setAccessibilityLiveRegion(1);
                int i = b07.z;
                b07.z = i;
                AppCompatTextView appCompatTextView3 = b07.y;
                if (appCompatTextView3 != null) {
                    appCompatTextView3.setTextAppearance(i);
                }
                ColorStateList colorStateList = b07.A;
                b07.A = colorStateList;
                AppCompatTextView appCompatTextView4 = b07.y;
                if (!(appCompatTextView4 == null || colorStateList == null)) {
                    appCompatTextView4.setTextColor(colorStateList);
                }
                b07.a(b07.y, 1);
                b07.y.setAccessibilityDelegate(new a07(0, b07));
            } else {
                b07.c();
                int i2 = b07.n;
                if (i2 == 2) {
                    b07.o = 0;
                }
                b07.i(i2, b07.o, b07.h(b07.y, ""));
                b07.g(b07.y, 1);
                b07.y = null;
                TextInputLayout textInputLayout = b07.h;
                textInputLayout.r();
                textInputLayout.x();
            }
            b07.x = z;
        }
    }

    public void setHelperTextTextAppearance(int i) {
        b07 b07 = this.x0;
        b07.z = i;
        AppCompatTextView appCompatTextView = b07.y;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.Q0) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.I1 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.Q0) {
            this.Q0 = z;
            if (!z) {
                this.S0 = false;
                if (!TextUtils.isEmpty(this.R0) && TextUtils.isEmpty(this.o.getHint())) {
                    this.o.setHint(this.R0);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint = this.o.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.R0)) {
                        setHint(hint);
                    }
                    this.o.setHint((CharSequence) null);
                }
                this.S0 = true;
            }
            if (this.o != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        s53 s53 = this.G1;
        s53.k(i);
        this.u1 = s53.o;
        if (this.o != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.u1 != colorStateList) {
            if (this.t1 == null) {
                s53 s53 = this.G1;
                if (s53.o != colorStateList) {
                    s53.o = colorStateList;
                    s53.i(false);
                }
            }
            this.u1 = colorStateList;
            if (this.o != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(mpe mpe) {
        this.B0 = mpe;
    }

    public void setMaxEms(int i) {
        this.u0 = i;
        EditText editText = this.o;
        if (editText != null && i != -1) {
            editText.setMaxEms(i);
        }
    }

    public void setMaxWidth(int i) {
        this.w0 = i;
        EditText editText = this.o;
        if (editText != null && i != -1) {
            editText.setMaxWidth(i);
        }
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.t0 = i;
        EditText editText = this.o;
        if (editText != null && i != -1) {
            editText.setMinEms(i);
        }
    }

    public void setMinWidth(int i) {
        this.v0 = i;
        EditText editText = this.o;
        if (editText != null && i != -1) {
            editText.setMinWidth(i);
        }
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        m15 m15 = this.c;
        m15.u0.setContentDescription(i != 0 ? m15.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        m15 m15 = this.c;
        m15.u0.setImageDrawable(i != 0 ? s36.n(m15.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        m15 m15 = this.c;
        if (z && m15.w0 != 1) {
            m15.g(1);
        } else if (!z) {
            m15.g(0);
        } else {
            m15.getClass();
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        m15 m15 = this.c;
        m15.y0 = colorStateList;
        a14.d(m15.a, m15.u0, colorStateList, m15.z0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        m15 m15 = this.c;
        m15.z0 = mode;
        a14.d(m15.a, m15.u0, m15.y0, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        Editable editable = null;
        if (this.H0 == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
            this.H0 = appCompatTextView;
            appCompatTextView.setId(ivb.textinput_placeholder);
            AppCompatTextView appCompatTextView2 = this.H0;
            WeakHashMap weakHashMap = zmf.a;
            appCompatTextView2.setImportantForAccessibility(2);
            wa5 d = d();
            this.K0 = d;
            d.b = 67;
            this.L0 = d();
            setPlaceholderTextAppearance(this.J0);
            setPlaceholderTextColor(this.I0);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.G0) {
                setPlaceholderTextEnabled(true);
            }
            this.F0 = charSequence;
        }
        EditText editText = this.o;
        if (editText != null) {
            editable = editText.getText();
        }
        v(editable);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.J0 = i;
        AppCompatTextView appCompatTextView = this.H0;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.I0 != colorStateList) {
            this.I0 = colorStateList;
            AppCompatTextView appCompatTextView = this.H0;
            if (appCompatTextView != null && colorStateList != null) {
                appCompatTextView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        myd myd = this.b;
        myd.getClass();
        myd.c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        myd.b.setText(charSequence);
        myd.e();
    }

    public void setPrefixTextAppearance(int i) {
        this.b.b.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.b.b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(gjd gjd) {
        q18 q18 = this.T0;
        if (q18 != null && q18.a.a != gjd) {
            this.Z0 = gjd;
            b();
        }
    }

    public void setStartIconCheckable(boolean z) {
        this.b.o.setCheckable(z);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.b.o;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? s36.n(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        myd myd = this.b;
        if (i < 0) {
            myd.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        } else if (i != myd.u0) {
            myd.u0 = i;
            CheckableImageButton checkableImageButton = myd.o;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        myd myd = this.b;
        View.OnLongClickListener onLongClickListener = myd.w0;
        CheckableImageButton checkableImageButton = myd.o;
        checkableImageButton.setOnClickListener(onClickListener);
        a14.J(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        myd myd = this.b;
        myd.w0 = onLongClickListener;
        CheckableImageButton checkableImageButton = myd.o;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        a14.J(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        myd myd = this.b;
        myd.v0 = scaleType;
        myd.o.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        myd myd = this.b;
        if (myd.s0 != colorStateList) {
            myd.s0 = colorStateList;
            a14.d(myd.a, myd.o, colorStateList, myd.t0);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        myd myd = this.b;
        if (myd.t0 != mode) {
            myd.t0 = mode;
            a14.d(myd.a, myd.o, myd.s0, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.b.c(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        m15 m15 = this.c;
        m15.getClass();
        m15.D0 = TextUtils.isEmpty(charSequence) ? null : charSequence;
        m15.E0.setText(charSequence);
        m15.n();
    }

    public void setSuffixTextAppearance(int i) {
        this.c.E0.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.c.E0.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(lpe lpe) {
        EditText editText = this.o;
        if (editText != null) {
            zmf.j(editText, lpe);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.m1) {
            this.m1 = typeface;
            s53 s53 = this.G1;
            boolean m = s53.m(typeface);
            boolean o2 = s53.o(typeface);
            if (m || o2) {
                s53.i(false);
            }
            b07 b07 = this.x0;
            if (typeface != b07.B) {
                b07.B = typeface;
                AppCompatTextView appCompatTextView = b07.r;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = b07.y;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.C0;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.c1 != 1) {
            FrameLayout frameLayout = this.a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int c2 = c();
            if (c2 != layoutParams.topMargin) {
                layoutParams.topMargin = c2;
                frameLayout.requestLayout();
            }
        }
    }

    public final void u(boolean z, boolean z2) {
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        boolean isEnabled = isEnabled();
        EditText editText = this.o;
        boolean z3 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.o;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.t1;
        s53 s53 = this.G1;
        if (colorStateList2 != null) {
            s53.j(colorStateList2);
        }
        Editable editable = null;
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.t1;
            s53.j(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.D1) : this.D1));
        } else if (m()) {
            AppCompatTextView appCompatTextView2 = this.x0.r;
            s53.j(appCompatTextView2 != null ? appCompatTextView2.getTextColors() : null);
        } else if (this.A0 && (appCompatTextView = this.C0) != null) {
            s53.j(appCompatTextView.getTextColors());
        } else if (!(!z4 || (colorStateList = this.u1) == null || s53.o == colorStateList)) {
            s53.o = colorStateList;
            s53.i(false);
        }
        m15 m15 = this.c;
        myd myd = this.b;
        if (z3 || !this.H1 || (isEnabled() && z4)) {
            if (z2 || this.F1) {
                ValueAnimator valueAnimator = this.J1;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.J1.cancel();
                }
                if (!z || !this.I1) {
                    s53.p(1.0f);
                } else {
                    a(1.0f);
                }
                this.F1 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.o;
                if (editText3 != null) {
                    editable = editText3.getText();
                }
                v(editable);
                myd.x0 = false;
                myd.e();
                m15.F0 = false;
                m15.n();
            }
        } else if (z2 || !this.F1) {
            ValueAnimator valueAnimator2 = this.J1;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.J1.cancel();
            }
            if (!z || !this.I1) {
                s53.p(0.0f);
            } else {
                a(0.0f);
            }
            if (e() && (!((y04) this.T0).J0.v.isEmpty()) && e()) {
                ((y04) this.T0).r(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.F1 = true;
            AppCompatTextView appCompatTextView3 = this.H0;
            if (appCompatTextView3 != null && this.G0) {
                appCompatTextView3.setText((CharSequence) null);
                c2f.a(this.a, this.L0);
                this.H0.setVisibility(4);
            }
            myd.x0 = true;
            myd.e();
            m15.F0 = true;
            m15.n();
        }
    }

    public final void v(Editable editable) {
        ((hme) this.B0).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.a;
        if (length != 0 || this.F1) {
            AppCompatTextView appCompatTextView = this.H0;
            if (appCompatTextView != null && this.G0) {
                appCompatTextView.setText((CharSequence) null);
                c2f.a(frameLayout, this.L0);
                this.H0.setVisibility(4);
            }
        } else if (this.H0 != null && this.G0 && !TextUtils.isEmpty(this.F0)) {
            this.H0.setText(this.F0);
            c2f.a(frameLayout, this.K0);
            this.H0.setVisibility(0);
            this.H0.bringToFront();
            announceForAccessibility(this.F0);
        }
    }

    public final void w(boolean z, boolean z2) {
        int defaultColor = this.y1.getDefaultColor();
        int colorForState = this.y1.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.y1.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.h1 = colorForState2;
        } else if (z2) {
            this.h1 = colorForState;
        } else {
            this.h1 = defaultColor;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r7.o;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x() {
        /*
            r7 = this;
            q18 r0 = r7.T0
            if (r0 == 0) goto L_0x0128
            int r0 = r7.c1
            if (r0 != 0) goto L_0x000a
            goto L_0x0128
        L_0x000a:
            boolean r0 = r7.isFocused()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001f
            android.widget.EditText r0 = r7.o
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = r1
            goto L_0x0020
        L_0x001f:
            r0 = r2
        L_0x0020:
            boolean r3 = r7.isHovered()
            if (r3 != 0) goto L_0x0030
            android.widget.EditText r3 = r7.o
            if (r3 == 0) goto L_0x0031
            boolean r3 = r3.isHovered()
            if (r3 == 0) goto L_0x0031
        L_0x0030:
            r1 = r2
        L_0x0031:
            boolean r3 = r7.isEnabled()
            if (r3 != 0) goto L_0x003c
            int r3 = r7.D1
            r7.h1 = r3
            goto L_0x007a
        L_0x003c:
            boolean r3 = r7.m()
            if (r3 == 0) goto L_0x0051
            android.content.res.ColorStateList r3 = r7.y1
            if (r3 == 0) goto L_0x004a
            r7.w(r0, r1)
            goto L_0x007a
        L_0x004a:
            int r3 = r7.getErrorCurrentTextColors()
            r7.h1 = r3
            goto L_0x007a
        L_0x0051:
            boolean r3 = r7.A0
            if (r3 == 0) goto L_0x0068
            androidx.appcompat.widget.AppCompatTextView r3 = r7.C0
            if (r3 == 0) goto L_0x0068
            android.content.res.ColorStateList r4 = r7.y1
            if (r4 == 0) goto L_0x0061
            r7.w(r0, r1)
            goto L_0x007a
        L_0x0061:
            int r3 = r3.getCurrentTextColor()
            r7.h1 = r3
            goto L_0x007a
        L_0x0068:
            if (r0 == 0) goto L_0x006f
            int r3 = r7.x1
            r7.h1 = r3
            goto L_0x007a
        L_0x006f:
            if (r1 == 0) goto L_0x0076
            int r3 = r7.w1
            r7.h1 = r3
            goto L_0x007a
        L_0x0076:
            int r3 = r7.v1
            r7.h1 = r3
        L_0x007a:
            r7.p()
            m15 r3 = r7.c
            r3.l()
            com.google.android.material.internal.CheckableImageButton r4 = r3.c
            android.content.res.ColorStateList r5 = r3.o
            com.google.android.material.textfield.TextInputLayout r6 = r3.a
            defpackage.a14.I(r6, r4, r5)
            android.content.res.ColorStateList r4 = r3.y0
            com.google.android.material.internal.CheckableImageButton r5 = r3.u0
            defpackage.a14.I(r6, r5, r4)
            n15 r4 = r3.b()
            boolean r4 = r4 instanceof defpackage.qs4
            if (r4 == 0) goto L_0x00c0
            boolean r4 = r6.m()
            if (r4 == 0) goto L_0x00b9
            android.graphics.drawable.Drawable r4 = r5.getDrawable()
            if (r4 == 0) goto L_0x00b9
            android.graphics.drawable.Drawable r3 = r5.getDrawable()
            android.graphics.drawable.Drawable r3 = r3.mutate()
            int r4 = r6.getErrorCurrentTextColors()
            defpackage.aq4.g(r3, r4)
            r5.setImageDrawable(r3)
            goto L_0x00c0
        L_0x00b9:
            android.content.res.ColorStateList r4 = r3.y0
            android.graphics.PorterDuff$Mode r3 = r3.z0
            defpackage.a14.d(r6, r5, r4, r3)
        L_0x00c0:
            myd r3 = r7.b
            com.google.android.material.internal.CheckableImageButton r4 = r3.o
            android.content.res.ColorStateList r5 = r3.s0
            com.google.android.material.textfield.TextInputLayout r3 = r3.a
            defpackage.a14.I(r3, r4, r5)
            int r3 = r7.c1
            r4 = 2
            if (r3 != r4) goto L_0x0102
            int r3 = r7.e1
            if (r0 == 0) goto L_0x00df
            boolean r4 = r7.isEnabled()
            if (r4 == 0) goto L_0x00df
            int r4 = r7.g1
            r7.e1 = r4
            goto L_0x00e3
        L_0x00df:
            int r4 = r7.f1
            r7.e1 = r4
        L_0x00e3:
            int r4 = r7.e1
            if (r4 == r3) goto L_0x0102
            boolean r3 = r7.e()
            if (r3 == 0) goto L_0x0102
            boolean r3 = r7.F1
            if (r3 != 0) goto L_0x0102
            boolean r3 = r7.e()
            if (r3 == 0) goto L_0x00ff
            q18 r3 = r7.T0
            y04 r3 = (defpackage.y04) r3
            r4 = 0
            r3.r(r4, r4, r4, r4)
        L_0x00ff:
            r7.j()
        L_0x0102:
            int r3 = r7.c1
            if (r3 != r2) goto L_0x0125
            boolean r2 = r7.isEnabled()
            if (r2 != 0) goto L_0x0111
            int r0 = r7.A1
            r7.i1 = r0
            goto L_0x0125
        L_0x0111:
            if (r1 == 0) goto L_0x011a
            if (r0 != 0) goto L_0x011a
            int r0 = r7.C1
            r7.i1 = r0
            goto L_0x0125
        L_0x011a:
            if (r0 == 0) goto L_0x0121
            int r0 = r7.B1
            r7.i1 = r0
            goto L_0x0125
        L_0x0121:
            int r0 = r7.z1
            r7.i1 = r0
        L_0x0125:
            r7.b()
        L_0x0128:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.x():void");
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.b.b(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.c.u0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.c.u0.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.c.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.c.u0;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        m15 m15 = this.c;
        CheckableImageButton checkableImageButton = m15.u0;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = m15.y0;
            PorterDuff.Mode mode = m15.z0;
            TextInputLayout textInputLayout = m15.a;
            a14.d(textInputLayout, checkableImageButton, colorStateList, mode);
            a14.I(textInputLayout, checkableImageButton, m15.y0);
        }
    }
}
