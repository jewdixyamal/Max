package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import java.text.DecimalFormat;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: caa  reason: default package */
public final class caa extends View implements kre, kx5 {
    public static final /* synthetic */ bc7[] P0;
    public final int A0;
    public final int B0;
    public final GradientDrawable C0;
    public boolean D0;
    public final baa E0;
    public final baa F0;
    public final TextPaint G0;
    public final baa H0;
    public final baa I0;
    public final baa J0;
    public long K0;
    public Interpolator L0;
    public int M0;
    public int N0 = 4;
    public int O0;
    public boolean a;
    public int b = -1;
    public String c = "";
    public ValueAnimator o;
    public float s0 = 1.0f;
    public StaticLayout t0;
    public StaticLayout u0;
    public StaticLayout v0;
    public StaticLayout w0;
    public int x0;
    public int y0;
    public final int z0;

    static {
        Class<caa> cls = caa.class;
        P0 = new bc7[]{new oi9(cls, "textFont", "getTextFont()Lone/me/sdk/design/dynamicfont/DynamicFont;"), rh4.g(nec.a, cls, "typography", "getTypography()Lone/me/sdk/design/TextStyle;"), new oi9(cls, "appearance", "getAppearance()Lone/me/common/counter/OneMeCounter$Appearance;"), new oi9(cls, "hasBackgroundStroke", "getHasBackgroundStroke()Z"), new oi9(cls, "hasBackground", "getHasBackground()Z")};
    }

    public caa(Context context) {
        super(context, (AttributeSet) null);
        float f = (float) 20;
        this.z0 = tu0.G(fk4.d().getDisplayMetrics().density * f);
        this.A0 = tu0.G(f * fk4.d().getDisplayMetrics().density);
        this.B0 = tu0.G(((float) 6) * fk4.d().getDisplayMetrics().density);
        float f2 = fk4.d().getDisplayMetrics().density * 20.0f;
        GradientDrawable c0 = hm9.c0((Integer) null, (Integer) null, (Integer) null, new float[]{f2, f2, f2, f2, f2, f2, f2, f2});
        this.C0 = c0;
        this.E0 = new baa(this, 0);
        this.F0 = new baa((Object) i4f.o, this);
        TextPaint textPaint = new TextPaint(1);
        getTypography().a(textPaint, getResources().getDisplayMetrics(), du4.b);
        this.G0 = textPaint;
        this.H0 = new baa(this, 2);
        this.I0 = new baa(this, 3);
        this.J0 = new baa(this, 4);
        this.K0 = 400;
        this.M0 = 255;
        this.O0 = 2;
        setBackground(c0);
        f(qp4.u0.j(this));
    }

    public static String e(int i) {
        String format;
        String str;
        long j = (long) i;
        int i2 = (j > 1000000000 ? 1 : (j == 1000000000 ? 0 : -1));
        DecimalFormat decimalFormat = p9e.a;
        if (i2 >= 0) {
            format = decimalFormat.format(((double) j) / 1.0E9d);
            str = "B";
        } else if (j >= 1000000) {
            format = decimalFormat.format(((double) j) / 1000000.0d);
            str = "M";
        } else if (j >= 1000) {
            format = decimalFormat.format(((double) j) / 1000.0d);
            str = "K";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(j);
            return sb.toString();
        }
        return au1.g(format, str);
    }

    /* access modifiers changed from: private */
    public final du4 getTextFont() {
        bc7 bc7 = P0[0];
        return (du4) this.E0.b;
    }

    private final kqe getTypography() {
        bc7 bc7 = P0[1];
        return (kqe) this.F0.b;
    }

    private final void setCounterWithoutAnimation(int i) {
        this.b = i;
        this.y0 = this.x0;
        String e = e(i);
        int measureText = (int) this.G0.measureText(e);
        this.x0 = measureText;
        this.t0 = i(measureText, e);
        if (this.x0 != this.y0) {
            requestLayout();
        }
        invalidate();
    }

    private final void setTextFont(du4 du4) {
        this.E0.o1(this, P0[0], du4);
    }

    private final void setTypographyInternal(kqe kqe) {
        this.F0.o1(this, P0[1], kqe);
    }

    public final void a(du4 du4) {
        boolean z = true;
        this.D0 = true;
        setTextFont(du4);
        getTypography().a(this.G0, getResources().getDisplayMetrics(), du4);
        int s = au1.s(this.O0);
        if (s == 0) {
            int i = this.b;
            this.b = -1;
            ValueAnimator valueAnimator = this.o;
            if (valueAnimator == null || !valueAnimator.isStarted()) {
                z = false;
            }
            g(i, z);
        } else if (s == 1) {
            this.O0 = 2;
            ValueAnimator valueAnimator2 = this.o;
            if (valueAnimator2 != null) {
                valueAnimator2.end();
            }
            this.b = 0;
            this.t0 = null;
            requestLayout();
        } else if (s == 2) {
            h();
        } else if (s == 3) {
            setText(this.c);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.D0 = false;
        requestLayout();
        invalidate();
    }

    public final int c(String str) {
        if (str.length() != 0) {
            char charAt = str.charAt(0);
            TextPaint textPaint = this.G0;
            float measureText = textPaint.measureText(String.valueOf(charAt));
            int v02 = w9e.v0(str);
            int i = 1;
            if (1 <= v02) {
                while (true) {
                    measureText = Math.max(measureText, textPaint.measureText(String.valueOf(str.charAt(i))));
                    if (i == v02) {
                        break;
                    }
                    i++;
                }
            }
            return (int) measureText;
        }
        throw new NoSuchElementException();
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.t0;
        if (staticLayout != null) {
            int save = canvas.save();
            canvas.translate(((float) (canvas.getWidth() - this.x0)) / 2.0f, ((float) (getHeight() - staticLayout.getHeight())) / 2.0f);
            try {
                staticLayout.draw(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(defpackage.fka r11) {
        /*
            r10 = this;
            boolean r0 = r10.isEnabled()
            android.text.TextPaint r1 = r10.G0
            android.graphics.drawable.GradientDrawable r2 = r10.C0
            r3 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r0 == 0) goto L_0x00bf
            x9a r0 = r10.getAppearance()
            int r0 = r0.ordinal()
            r9 = -1
            if (r0 == 0) goto L_0x0043
            if (r0 == r8) goto L_0x003c
            if (r0 == r7) goto L_0x0035
            if (r0 == r6) goto L_0x0030
            if (r0 != r5) goto L_0x002a
            xoe r0 = r11.getText()
            int r0 = r0.e
            goto L_0x0047
        L_0x002a:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L_0x0030:
            r11.getText()
        L_0x0033:
            r0 = r9
            goto L_0x0047
        L_0x0035:
            xoe r0 = r11.getText()
            int r0 = r0.g
            goto L_0x0047
        L_0x003c:
            xoe r0 = r11.getText()
            int r0 = r0.f
            goto L_0x0047
        L_0x0043:
            r11.getText()
            goto L_0x0033
        L_0x0047:
            r1.setColor(r0)
            x9a r0 = r10.getAppearance()
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0087
            if (r0 == r8) goto L_0x007d
            if (r0 == r7) goto L_0x0074
            if (r0 == r6) goto L_0x006b
            if (r0 != r5) goto L_0x0065
            ne0 r0 = r11.b()
            me0 r0 = r0.a
            int r9 = r0.c
            goto L_0x008f
        L_0x0065:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L_0x006b:
            ne0 r0 = r11.b()
            me0 r0 = r0.a
            int r9 = r0.e
            goto L_0x008f
        L_0x0074:
            ne0 r0 = r11.b()
            me0 r0 = r0.a
            int r9 = r0.g
            goto L_0x008f
        L_0x007d:
            ne0 r0 = r11.b()
            me0 r0 = r0.a
            r0.getClass()
            goto L_0x008f
        L_0x0087:
            ne0 r0 = r11.b()
            me0 r0 = r0.a
            int r9 = r0.m
        L_0x008f:
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r9)
            r2.setColor(r0)
            boolean r0 = r10.getHasBackgroundStroke()
            if (r0 == 0) goto L_0x0188
            android.content.res.Resources r0 = defpackage.fk4.d()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            double r5 = (double) r0
            double r5 = r5 * r3
            int r0 = defpackage.tu0.F(r5)
            gae r11 = r11.i()
            iae r11 = r11.a
            hae r11 = r11.a
            int r11 = r11.a
            android.content.res.ColorStateList r11 = android.content.res.ColorStateList.valueOf(r11)
            r2.setStroke(r0, r11)
            goto L_0x0188
        L_0x00bf:
            x9a r0 = r10.getAppearance()
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0103
            if (r0 == r8) goto L_0x00f8
            if (r0 == r7) goto L_0x00ed
            if (r0 == r6) goto L_0x00e2
            if (r0 != r5) goto L_0x00dc
            a1e r0 = r11.d()
            e1e r0 = r0.c
            f1e r0 = r0.b
            int r0 = r0.e
            goto L_0x010d
        L_0x00dc:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L_0x00e2:
            a1e r0 = r11.d()
            e1e r0 = r0.c
            f1e r0 = r0.b
            int r0 = r0.b
            goto L_0x010d
        L_0x00ed:
            a1e r0 = r11.d()
            e1e r0 = r0.c
            f1e r0 = r0.b
            int r0 = r0.e
            goto L_0x010d
        L_0x00f8:
            a1e r0 = r11.d()
            e1e r0 = r0.c
            f1e r0 = r0.b
            int r0 = r0.e
            goto L_0x010d
        L_0x0103:
            a1e r0 = r11.d()
            e1e r0 = r0.c
            f1e r0 = r0.b
            int r0 = r0.b
        L_0x010d:
            r1.setColor(r0)
            x9a r0 = r10.getAppearance()
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0150
            if (r0 == r8) goto L_0x0145
            if (r0 == r7) goto L_0x013e
            if (r0 == r6) goto L_0x0133
            if (r0 != r5) goto L_0x012d
            a1e r0 = r11.d()
            y0e r0 = r0.a
            z0e r0 = r0.b
            int r0 = r0.b
            goto L_0x015a
        L_0x012d:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L_0x0133:
            a1e r0 = r11.d()
            y0e r0 = r0.a
            z0e r0 = r0.b
            int r0 = r0.d
            goto L_0x015a
        L_0x013e:
            ne0 r0 = r11.b()
            int r0 = r0.l
            goto L_0x015a
        L_0x0145:
            a1e r0 = r11.d()
            y0e r0 = r0.a
            z0e r0 = r0.b
            int r0 = r0.c
            goto L_0x015a
        L_0x0150:
            a1e r0 = r11.d()
            y0e r0 = r0.a
            z0e r0 = r0.b
            int r0 = r0.l
        L_0x015a:
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r2.setColor(r0)
            boolean r0 = r10.getHasBackgroundStroke()
            if (r0 == 0) goto L_0x0188
            android.content.res.Resources r0 = defpackage.fk4.d()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            double r5 = (double) r0
            double r5 = r5 * r3
            int r0 = defpackage.tu0.F(r5)
            gae r11 = r11.i()
            iae r11 = r11.a
            hae r11 = r11.a
            int r11 = r11.a
            android.content.res.ColorStateList r11 = android.content.res.ColorStateList.valueOf(r11)
            r2.setStroke(r0, r11)
        L_0x0188:
            int r11 = r1.getColor()
            int r11 = r11 >> 24
            r11 = r11 & 255(0xff, float:3.57E-43)
            r10.M0 = r11
            r10.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.caa.f(fka):void");
    }

    public final void g(int i, boolean z) {
        int i2;
        int i3;
        if (i != this.b && !tpa.f(e(i), e(this.b))) {
            this.O0 = 1;
            ValueAnimator valueAnimator = this.o;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (!z || this.O0 == 2 || ((i2 = this.b) == 0 && i > 0)) {
                setCounterWithoutAnimation(i);
                return;
            }
            if (i2 < 0) {
                this.G0.setAlpha(0);
                this.C0.setAlpha(0);
                i3 = 1;
            } else {
                i3 = 3;
            }
            this.N0 = i3;
            this.s0 = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            int i4 = this.N0;
            int[] iArr = aaa.$EnumSwitchMapping$0;
            ofFloat.setInterpolator(iArr[au1.s(i4)] == 1 ? this.L0 : null);
            ofFloat.setDuration(iArr[au1.s(this.N0)] == 1 ? this.K0 : 150);
            ofFloat.addUpdateListener(new z00(13, (Object) this));
            ofFloat.addListener(new eh(ofFloat, 0, new zj7(16, this)));
            this.o = ofFloat;
            String e = e(i);
            String e2 = e(this.b);
            if (this.t0 != null) {
                if (e2.length() == e.length()) {
                    int c2 = c(e2);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(e2);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(e);
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(e);
                    int length = e2.length();
                    for (int i5 = 0; i5 < length; i5++) {
                        if (e2.charAt(i5) == e.charAt(i5)) {
                            int i6 = i5 + 1;
                            spannableStringBuilder.setSpan(new ReplacementSpan(), i5, i6, 0);
                            spannableStringBuilder2.setSpan(new ReplacementSpan(), i5, i6, 0);
                            spannableStringBuilder3.setSpan(new z9a(c2), i5, i6, 0);
                        } else {
                            int i7 = i5 + 1;
                            spannableStringBuilder.setSpan(new z9a(c2), i5, i7, 0);
                            spannableStringBuilder2.setSpan(new z9a(c2), i5, i7, 0);
                            spannableStringBuilder3.setSpan(new ReplacementSpan(), i5, i7, 0);
                        }
                    }
                    int length2 = e2.length() * c2;
                    this.u0 = i(length2, spannableStringBuilder);
                    this.w0 = i(length2, spannableStringBuilder3);
                    this.v0 = i(length2, spannableStringBuilder2);
                } else {
                    this.u0 = this.t0;
                }
            }
            this.y0 = this.x0;
            this.a = i > this.b;
            ValueAnimator valueAnimator2 = this.o;
            if (valueAnimator2 != null) {
                valueAnimator2.start();
            }
            if (i >= 0) {
                int c3 = c(e);
                this.x0 = e.length() * c3;
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(e);
                int length3 = e.length();
                int i8 = 0;
                while (i8 < length3) {
                    int i9 = i8 + 1;
                    spannableStringBuilder4.setSpan(new z9a(c3), i8, i9, 0);
                    i8 = i9;
                }
                this.t0 = i(this.x0, spannableStringBuilder4);
            }
            this.b = i;
            if (this.x0 != this.y0) {
                requestLayout();
            }
        }
    }

    public final x9a getAppearance() {
        bc7 bc7 = P0[2];
        return (x9a) this.H0.b;
    }

    public final boolean getHasBackground() {
        bc7 bc7 = P0[4];
        return ((Boolean) this.J0.b).booleanValue();
    }

    public final boolean getHasBackgroundStroke() {
        bc7 bc7 = P0[3];
        return ((Boolean) this.I0.b).booleanValue();
    }

    public final long getReplaceDuration() {
        return this.K0;
    }

    public final Interpolator getReplaceInterpolator() {
        return this.L0;
    }

    public final void h() {
        this.O0 = 3;
        ValueAnimator valueAnimator = this.o;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        this.b = 0;
        int measureText = (int) this.G0.measureText("!");
        this.x0 = measureText;
        this.t0 = i(measureText, "!");
        if (this.x0 != this.y0) {
            requestLayout();
        }
        invalidate();
    }

    public final StaticLayout i(int i, CharSequence charSequence) {
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.G0, i).setAlignment(Layout.Alignment.ALIGN_CENTER).setIncludePad(false).setMaxLines(1).build();
    }

    public final void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        float f = this.s0;
        boolean z = false;
        boolean z2 = !(f == 1.0f);
        TextPaint textPaint = this.G0;
        if (!z2 || !((i = this.N0) == 1 || i == 2)) {
            if (!(!(f == 1.0f)) || this.N0 != 3) {
                if (f == 1.0f) {
                    z = true;
                }
                if (!(!z)) {
                    d(canvas);
                    return;
                }
                return;
            }
            float f2 = f * ((float) 2);
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            canvas.save();
            StaticLayout staticLayout = this.v0;
            if (staticLayout != null) {
                float height = (((float) (getHeight() - staticLayout.getHeight())) / 2.0f) + ((1.0f - f2) * ((float) tu0.G((this.a ? (float) 13 : (float) -13) * fk4.d().getDisplayMetrics().density)));
                int save = canvas.save();
                canvas.translate(((float) (canvas.getWidth() - this.x0)) / 2.0f, height);
                try {
                    textPaint.setAlpha((int) (((float) this.M0) * f2));
                    staticLayout.draw(canvas);
                } finally {
                    canvas.restoreToCount(save);
                }
            } else {
                StaticLayout staticLayout2 = this.t0;
                if (staticLayout2 != null) {
                    float height2 = (((float) (getHeight() - staticLayout2.getHeight())) / 2.0f) + ((1.0f - f2) * ((float) tu0.G((this.a ? (float) 13 : (float) -13) * fk4.d().getDisplayMetrics().density)));
                    int save2 = canvas.save();
                    canvas.translate(((float) (canvas.getWidth() - this.x0)) / 2.0f, height2);
                    try {
                        textPaint.setAlpha((int) (((float) this.M0) * f2));
                        staticLayout2.draw(canvas);
                    } finally {
                        canvas.restoreToCount(save2);
                    }
                }
            }
            StaticLayout staticLayout3 = this.u0;
            if (staticLayout3 != null) {
                float height3 = (((float) (getHeight() - staticLayout3.getHeight())) / 2.0f) + (((float) tu0.G((this.a ? (float) -13 : (float) 13) * fk4.d().getDisplayMetrics().density)) * f2);
                int save3 = canvas.save();
                canvas.translate(((float) (canvas.getWidth() - this.x0)) / 2.0f, height3);
                try {
                    textPaint.setAlpha((int) ((1.0f - f2) * ((float) this.M0)));
                    staticLayout3.draw(canvas);
                } finally {
                    canvas.restoreToCount(save3);
                }
            }
            StaticLayout staticLayout4 = this.w0;
            if (staticLayout4 != null) {
                int save4 = canvas.save();
                canvas.translate(((float) (canvas.getWidth() - this.x0)) / 2.0f, ((float) (getHeight() - this.w0.getHeight())) / 2.0f);
                try {
                    textPaint.setAlpha(this.M0);
                    staticLayout4.draw(canvas);
                } finally {
                    canvas.restoreToCount(save4);
                }
            }
            textPaint.setAlpha(this.M0);
            canvas.restore();
            return;
        }
        d(canvas);
        this.C0.setAlpha((int) (this.s0 * ((float) 255)));
        textPaint.setAlpha((int) (this.s0 * ((float) this.M0)));
    }

    public final void onMeasure(int i, int i2) {
        int length;
        int c2;
        super.onMeasure(i, i2);
        if (this.O0 != 4) {
            String e = e(this.b);
            length = e.length();
            c2 = c(e);
        } else {
            String str = this.c;
            length = str.length();
            c2 = c(str);
        }
        int i3 = c2 * length;
        if (getHasBackground()) {
            int i4 = this.z0;
            i3 = i3 > i4 / 2 ? i3 + (this.B0 * 2) : i4;
        }
        Paint.FontMetrics fontMetrics = this.G0.getFontMetrics();
        setMeasuredDimension(i3, Math.max((int) ((float) Math.ceil((double) (fontMetrics.descent - fontMetrics.ascent))), this.A0));
    }

    public final void onThemeChanged(fka fka) {
        f(fka);
    }

    public final void setAppearance(x9a x9a) {
        this.H0.o1(this, P0[2], x9a);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        f(qp4.u0.j(this));
    }

    public final void setHasBackground(boolean z) {
        this.J0.o1(this, P0[4], Boolean.valueOf(z));
    }

    public final void setHasBackgroundStroke(boolean z) {
        this.I0.o1(this, P0[3], Boolean.valueOf(z));
    }

    public final void setReplaceDuration(long j) {
        this.K0 = j;
    }

    public final void setReplaceInterpolator(Interpolator interpolator) {
        this.L0 = interpolator;
    }

    public final void setText(String str) {
        if (!w9e.C0(str)) {
            this.O0 = 4;
            ValueAnimator valueAnimator = this.o;
            if (valueAnimator != null) {
                valueAnimator.end();
            }
            this.b = 0;
            this.c = str;
            int measureText = (int) this.G0.measureText(str);
            this.x0 = measureText;
            this.t0 = i(measureText, str);
            if (this.x0 != this.y0) {
                requestLayout();
            }
            invalidate();
            return;
        }
        this.c = "";
        this.O0 = 2;
        ValueAnimator valueAnimator2 = this.o;
        if (valueAnimator2 != null) {
            valueAnimator2.end();
        }
        this.b = 0;
        this.t0 = null;
        requestLayout();
    }

    public final void setTextColor(int i) {
        TextPaint textPaint = this.G0;
        textPaint.setColor(ote.b0(i, 1.0f));
        this.M0 = textPaint.getAlpha();
        invalidate();
    }

    public final void setTypography(kqe kqe) {
        setTypographyInternal(kqe);
    }
}
