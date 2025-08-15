package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Html;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.math.BigDecimal;
import java.text.NumberFormat;

/* renamed from: ood  reason: default package */
public final class ood extends View {
    public int A0;
    public final RectF A1;
    public boolean B0;
    public int B1;
    public boolean C0;
    public int C1;
    public boolean D0;
    public int D1;
    public int E0;
    public final Point E1;
    public int F0;
    public final Point F1;
    public int G0 = -1;
    public final Point G1;
    public int H0;
    public Paint H1;
    public boolean I0;
    public Paint I1;
    public int J0;
    public StaticLayout J1;
    public int K0;
    public final Path K1;
    public boolean L0;
    public final Path L1;
    public boolean M0;
    public String M1;
    public boolean N0;
    public boolean N1;
    public long O0;
    public TextPaint O1;
    public boolean P0;
    public NumberFormat P1;
    public boolean Q0;
    public nod Q1;
    public float R0;
    public final bk4 R1;
    public int S0;
    public float S1;
    public boolean T0;
    public int U0;
    public final int V0;
    public int W0;
    public int X0;
    public int Y0;
    public int Z0;
    public ValueAnimator a;
    public int a1;
    public float b;
    public int b1;
    public float c;
    public int c1;
    public float d1;
    public float e1;
    public float f1;
    public float g1;
    public float h1;
    public boolean i1;
    public final int j1;
    public boolean k1;
    public float l1;
    public float m1;
    public final Paint n1;
    public float o;
    public final Rect o1;
    public boolean p1 = true;
    public float q1;
    public hod r1;
    public boolean s0;
    public String[] s1;
    public int t0;
    public boolean t1;
    public int u0;
    public float u1;
    public int v0;
    public float v1;
    public int w0;
    public boolean w1;
    public int x0;
    public boolean x1;
    public int y0;
    public boolean y1;
    public int z0;
    public final Rect z1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ood(Context context) {
        super(context, (AttributeSet) null, 0);
        boolean z = false;
        getContext();
        this.R1 = bk4.b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, b3c.SignSeekBar, 0, 0);
        this.b = obtainStyledAttributes.getFloat(b3c.SignSeekBar_ssb_min, 0.0f);
        this.c = obtainStyledAttributes.getFloat(b3c.SignSeekBar_ssb_max, 100.0f);
        this.o = obtainStyledAttributes.getFloat(b3c.SignSeekBar_ssb_progress, this.b);
        this.s0 = obtainStyledAttributes.getBoolean(b3c.SignSeekBar_ssb_is_float_type, false);
        int i = (int) 2.0f;
        this.t0 = obtainStyledAttributes.getDimensionPixelSize(b3c.SignSeekBar_ssb_track_size, fk4.b(i));
        this.j1 = obtainStyledAttributes.getDimensionPixelSize(b3c.SignSeekBar_ssb_text_space, fk4.b(i));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(b3c.SignSeekBar_ssb_second_track_size, fk4.b(i) + this.t0);
        this.u0 = dimensionPixelSize;
        this.v0 = obtainStyledAttributes.getDimensionPixelSize(b3c.SignSeekBar_ssb_thumb_radius, fk4.b(i) + dimensionPixelSize);
        this.w0 = obtainStyledAttributes.getDimensionPixelSize(b3c.SignSeekBar_ssb_thumb_radius, this.u0 * 2);
        this.S0 = obtainStyledAttributes.getDimensionPixelSize(b3c.SignSeekBar_ssb_sign_border_size, fk4.b((int) 1.0f));
        this.A0 = obtainStyledAttributes.getInteger(b3c.SignSeekBar_ssb_section_count, 10);
        int i2 = b3c.SignSeekBar_ssb_track_color;
        int i3 = epc.a;
        this.x0 = obtainStyledAttributes.getColor(i2, lt3.a(context, i3));
        int color = obtainStyledAttributes.getColor(b3c.SignSeekBar_ssb_second_track_color, lt3.a(context, i3));
        this.y0 = color;
        this.z0 = obtainStyledAttributes.getColor(b3c.SignSeekBar_ssb_thumb_color, color);
        this.D0 = obtainStyledAttributes.getBoolean(b3c.SignSeekBar_ssb_show_section_text, false);
        this.E0 = obtainStyledAttributes.getDimensionPixelSize(b3c.SignSeekBar_ssb_section_text_size, (int) fk4.e(14.0f));
        this.F0 = obtainStyledAttributes.getColor(b3c.SignSeekBar_ssb_section_text_color, this.x0);
        this.N0 = obtainStyledAttributes.getBoolean(b3c.SignSeekBar_ssb_seek_by_section, false);
        int integer = obtainStyledAttributes.getInteger(b3c.SignSeekBar_ssb_section_text_position, -1);
        if (integer == 0) {
            this.G0 = 0;
        } else if (integer == 1) {
            this.G0 = 1;
        } else if (integer == 2) {
            this.G0 = 2;
        } else {
            this.G0 = -1;
        }
        this.H0 = obtainStyledAttributes.getInteger(b3c.SignSeekBar_ssb_section_text_interval, 1);
        this.I0 = obtainStyledAttributes.getBoolean(b3c.SignSeekBar_ssb_show_thumb_text, false);
        this.J0 = obtainStyledAttributes.getDimensionPixelSize(b3c.SignSeekBar_ssb_thumb_text_size, (int) fk4.e(14.0f));
        this.K0 = obtainStyledAttributes.getColor(b3c.SignSeekBar_ssb_thumb_text_color, this.y0);
        this.W0 = obtainStyledAttributes.getColor(b3c.SignSeekBar_ssb_sign_color, this.y0);
        this.U0 = obtainStyledAttributes.getColor(b3c.SignSeekBar_ssb_sign_border_color, this.y0);
        this.V0 = obtainStyledAttributes.getColor(b3c.SignSeekBar_ssb_unusable_color, -7829368);
        this.X0 = obtainStyledAttributes.getDimensionPixelSize(b3c.SignSeekBar_ssb_sign_text_size, (int) fk4.e(14.0f));
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(b3c.SignSeekBar_ssb_sign_height, fk4.b((int) 32.0f));
        this.a1 = dimensionPixelSize2;
        this.Z0 = dimensionPixelSize2;
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(b3c.SignSeekBar_ssb_sign_width, fk4.b((int) 40.0f));
        this.c1 = dimensionPixelSize3;
        this.b1 = dimensionPixelSize3;
        int i4 = (int) 3.0f;
        this.B1 = obtainStyledAttributes.getDimensionPixelSize(b3c.SignSeekBar_ssb_sign_arrow_height, fk4.b(i4));
        this.C1 = obtainStyledAttributes.getDimensionPixelSize(b3c.SignSeekBar_ssb_sign_arrow_width, fk4.b((int) 5.0f));
        this.D1 = obtainStyledAttributes.getDimensionPixelSize(b3c.SignSeekBar_ssb_sign_round, fk4.b(i4));
        this.Y0 = obtainStyledAttributes.getColor(b3c.SignSeekBar_ssb_sign_text_color, -1);
        this.B0 = obtainStyledAttributes.getBoolean(b3c.SignSeekBar_ssb_show_section_mark, false);
        this.C0 = obtainStyledAttributes.getBoolean(b3c.SignSeekBar_ssb_auto_adjust_section_mark, false);
        this.L0 = obtainStyledAttributes.getBoolean(b3c.SignSeekBar_ssb_show_progress_in_float, false);
        int integer2 = obtainStyledAttributes.getInteger(b3c.SignSeekBar_ssb_anim_duration, -1);
        this.O0 = integer2 < 0 ? 200 : (long) integer2;
        this.M0 = obtainStyledAttributes.getBoolean(b3c.SignSeekBar_ssb_touch_to_seek, false);
        this.T0 = obtainStyledAttributes.getBoolean(b3c.SignSeekBar_ssb_sign_show_border, false);
        int resourceId = obtainStyledAttributes.getResourceId(b3c.SignSeekBar_ssb_sides_labels, 0);
        this.u1 = obtainStyledAttributes.getFloat(b3c.SignSeekBar_ssb_thumb_bg_alpha, 0.2f);
        this.v1 = obtainStyledAttributes.getFloat(b3c.SignSeekBar_ssb_thumb_ratio, 0.7f);
        this.w1 = obtainStyledAttributes.getBoolean(b3c.SignSeekBar_ssb_show_thumb_shadow, false);
        this.x1 = obtainStyledAttributes.getBoolean(b3c.SignSeekBar_ssb_show_sign, false);
        this.y1 = obtainStyledAttributes.getBoolean(b3c.SignSeekBar_ssb_sign_arrow_autofloat, true);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.n1 = paint;
        paint.setAntiAlias(true);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setTextAlign(Paint.Align.CENTER);
        this.o1 = new Rect();
        if (resourceId > 0) {
            this.s1 = getResources().getStringArray(resourceId);
        }
        String[] strArr = this.s1;
        if (strArr != null && strArr.length > 0) {
            z = true;
        }
        this.t1 = z;
        this.A1 = new RectF();
        this.z1 = new Rect();
        this.E1 = new Point();
        this.F1 = new Point();
        this.G1 = new Point();
        Path path = new Path();
        this.K1 = path;
        path.setFillType(Path.FillType.EVEN_ODD);
        this.L1 = new Path();
        d();
        e();
    }

    private String getMaxText() {
        boolean z = this.s0;
        float f = this.c;
        return z ? String.valueOf(BigDecimal.valueOf((double) f).setScale(1, 4).floatValue()) : String.valueOf((int) f);
    }

    private String getMinText() {
        boolean z = this.s0;
        float f = this.b;
        return z ? String.valueOf(BigDecimal.valueOf((double) f).setScale(1, 4).floatValue()) : String.valueOf((int) f);
    }

    private int getSignAndThumbSpace() {
        this.R1.getClass();
        return fk4.b((int) 1.0f);
    }

    private int getSignOnTouchJumpHeight() {
        this.R1.getClass();
        return fk4.b((int) 10.0f) + this.w0;
    }

    public final void a(boolean z) {
        if (this.x1) {
            ValueAnimator valueAnimator = this.a;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.R0, z ? 1.0f : 0.0f});
            this.a = ofFloat;
            ofFloat.setDuration(100);
            this.a.addUpdateListener(new z00(17, (Object) this));
            this.a.start();
        }
    }

    public final void b() {
        ValueAnimator valueAnimator;
        float f = 0.0f;
        int i = 0;
        while (i <= this.A0) {
            float f2 = this.h1;
            f = (((float) i) * f2) + this.l1;
            float f3 = this.f1;
            if (f <= f3 && f3 - f <= f2) {
                break;
            }
            i++;
        }
        boolean z = BigDecimal.valueOf((double) this.f1).setScale(1, 4).floatValue() == f;
        AnimatorSet animatorSet = new AnimatorSet();
        if (!z) {
            float f4 = this.f1;
            float f5 = this.h1;
            valueAnimator = f4 - f <= f5 / 2.0f ? ValueAnimator.ofFloat(new float[]{f4, f}) : ValueAnimator.ofFloat(new float[]{f4, (((float) (i + 1)) * f5) + this.l1});
            valueAnimator.setInterpolator(new LinearInterpolator());
            valueAnimator.addUpdateListener(new yj0(6, this));
        } else {
            valueAnimator = null;
        }
        if (!z) {
            animatorSet.setDuration(this.O0).playTogether(new Animator[]{valueAnimator});
        }
        animatorSet.addListener(new lod(this, 1));
        animatorSet.start();
    }

    public final void c() {
        String str;
        String str2;
        if (this.L0) {
            float progressFloat = getProgressFloat();
            str = String.valueOf(progressFloat);
            NumberFormat numberFormat = this.P1;
            if (numberFormat != null) {
                str = numberFormat.format((double) progressFloat);
            }
        } else {
            int progress = getProgress();
            str = String.valueOf(progress);
            NumberFormat numberFormat2 = this.P1;
            if (numberFormat2 != null) {
                str = numberFormat2.format((long) progress);
            }
        }
        nod nod = this.Q1;
        if (nod != null) {
            str = ((o46) nod).a(Float.parseFloat(str));
        } else if (!(str == null || (str2 = this.M1) == null || str2.isEmpty())) {
            if (!this.N1) {
                String str3 = this.M1;
                str = str.concat(" <small>" + str3 + "</small> ");
            } else {
                String str4 = this.M1;
                str = (" " + str4 + " ").concat(str);
            }
        }
        this.J1 = new StaticLayout(Html.fromHtml(str), this.O1, this.b1, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
    }

    public final void d() {
        Paint paint = new Paint(1);
        this.H1 = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.H1.setAntiAlias(true);
        this.H1.setColor(this.W0);
        Paint paint2 = new Paint(1);
        this.I1 = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.I1.setStrokeWidth((float) this.S0);
        this.I1.setColor(this.U0);
        this.I1.setAntiAlias(true);
        TextPaint textPaint = new TextPaint(1);
        this.O1 = textPaint;
        textPaint.setStyle(style);
        this.O1.setTextSize((float) this.X0);
        this.O1.setColor(this.Y0);
    }

    public final void e() {
        if (this.b == this.c) {
            this.b = 0.0f;
            this.c = 100.0f;
        }
        float f = this.b;
        float f2 = this.c;
        if (f > f2) {
            this.c = f;
            this.b = f2;
        }
        float f3 = this.o;
        float f4 = this.b;
        if (f3 < f4) {
            this.o = f4;
        }
        float f5 = this.o;
        float f6 = this.c;
        if (f5 > f6) {
            this.o = f6;
        }
        int i = this.u0;
        int i2 = this.t0;
        bk4 bk4 = this.R1;
        if (i < i2) {
            bk4.getClass();
            this.u0 = fk4.b((int) 2.0f) + i2;
        }
        int i3 = this.v0;
        int i4 = this.u0;
        if (i3 <= i4) {
            bk4.getClass();
            this.v0 = fk4.b((int) 2.0f) + i4;
        }
        int i5 = this.w0;
        int i6 = this.u0;
        if (i5 <= i6) {
            this.w0 = i6 * 2;
        }
        if (this.A0 <= 0) {
            this.A0 = 10;
        }
        float f7 = this.c - this.b;
        this.d1 = f7;
        float f8 = f7 / ((float) this.A0);
        this.e1 = f8;
        if (f8 < 1.0f) {
            this.s0 = true;
        }
        if (this.s0) {
            this.L0 = true;
        }
        int i7 = this.G0;
        if (i7 != -1) {
            this.D0 = true;
        }
        if (this.D0) {
            if (i7 == -1) {
                this.G0 = 0;
            }
            if (this.G0 == 2) {
                this.B0 = true;
            }
        }
        if (this.H0 < 1) {
            this.H0 = 1;
        }
        if (this.C0 && !this.B0) {
            this.C0 = false;
        }
        if (this.N0) {
            this.q1 = this.o;
            this.B0 = true;
            this.C0 = true;
            this.M0 = false;
        }
        setProgress(this.o);
        this.J0 = (this.s0 || this.N0 || (this.D0 && this.G0 == 2)) ? this.E0 : this.J0;
    }

    public final void f() {
        String str = null;
        if (this.L0) {
            float progressFloat = getProgressFloat();
            nod nod = this.Q1;
            if (nod != null) {
                str = ((o46) nod).a(progressFloat);
            }
        } else {
            int progress = getProgress();
            nod nod2 = this.Q1;
            if (nod2 != null) {
                str = ((o46) nod2).a((float) progress);
            }
        }
        if (!TextUtils.isEmpty(str)) {
            TextPaint textPaint = this.O1;
            int length = str.length();
            Rect rect = this.o1;
            textPaint.getTextBounds(str, 0, length, rect);
            bk4 bk4 = this.R1;
            bk4.getClass();
            int b2 = fk4.b((int) 14.0f);
            bk4.getClass();
            int b3 = fk4.b((int) 7.0f);
            int width = rect.width() + b2 + b2;
            int i = this.c1;
            if (width > i) {
                this.b1 = width;
            } else {
                this.b1 = i;
            }
            int height = rect.height() + b3 + this.B1 + b3;
            int i2 = this.a1;
            if (height > i2) {
                this.Z0 = height;
            } else {
                this.Z0 = i2;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, hod] */
    public hod getConfigBuilder() {
        if (this.r1 == null) {
            ? obj = new Object();
            obj.a = this;
            this.r1 = obj;
        }
        hod hod = this.r1;
        hod.b = this.b;
        hod.c = this.c;
        hod.d = this.o;
        hod.e = this.s0;
        hod.f = this.t0;
        hod.g = this.u0;
        hod.h = this.v0;
        hod.i = this.w0;
        hod.j = this.x0;
        hod.k = this.y0;
        hod.l = this.z0;
        hod.m = this.A0;
        hod.n = this.B0;
        hod.o = this.C0;
        hod.p = this.D0;
        hod.q = this.E0;
        hod.r = this.F0;
        hod.s = this.G0;
        hod.t = this.H0;
        hod.u = this.I0;
        hod.v = this.J0;
        hod.w = this.K0;
        hod.x = this.L0;
        hod.y = this.O0;
        hod.z = this.M0;
        hod.A = this.N0;
        hod.F = this.s1;
        hod.G = this.u1;
        hod.H = this.v1;
        hod.I = this.w1;
        hod.J = this.M1;
        hod.U = this.N1;
        hod.T = this.P1;
        hod.B = this.W0;
        hod.C = this.X0;
        hod.D = this.Y0;
        hod.E = this.x1;
        hod.K = this.B1;
        hod.L = this.C1;
        hod.M = this.D1;
        hod.N = this.Z0;
        hod.O = this.b1;
        hod.Q = this.T0;
        hod.P = this.S0;
        hod.S = this.U0;
        hod.R = this.y1;
        hod.V = this.P0;
        hod.W = this.Q0;
        return hod;
    }

    public float getMax() {
        return this.c;
    }

    public float getMin() {
        return this.b;
    }

    public int getProgress() {
        if (!this.N0 || !this.k1) {
            return Math.round(this.o);
        }
        float f = this.e1;
        float f2 = f / 2.0f;
        float f3 = this.o;
        float f4 = this.q1;
        if (f3 >= f4) {
            if (f3 < f2 + f4) {
                return Math.round(f4);
            }
            float f5 = f4 + f;
            this.q1 = f5;
            return Math.round(f5);
        } else if (f3 >= f4 - f2) {
            return Math.round(f4);
        } else {
            float f6 = f4 - f;
            this.q1 = f6;
            return Math.round(f6);
        }
    }

    public float getProgressFloat() {
        return BigDecimal.valueOf((double) this.o).setScale(1, 4).floatValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02bb, code lost:
        if (r1 != r0.c) goto L_0x0338;
     */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x03d7  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0411  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0415  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x041f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0420  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x044b  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0463  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0466  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x046b  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0470  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x047d  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x047f  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0494  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x04a7  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x04e3  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x04f7  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x04fa  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x054d  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x05b5  */
    /* JADX WARNING: Removed duplicated region for block: B:235:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x012b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r22) {
        /*
            r21 = this;
            r0 = r21
            r7 = r22
            super.onDraw(r22)
            int r1 = r21.getPaddingLeft()
            float r1 = (float) r1
            int r2 = r21.getMeasuredWidth()
            int r3 = r21.getPaddingRight()
            int r2 = r2 - r3
            float r2 = (float) r2
            int r3 = r21.getPaddingTop()
            int r4 = r0.w0
            int r3 = r3 + r4
            float r3 = (float) r3
            boolean r4 = r0.x1
            if (r4 == 0) goto L_0x002e
            r21.f()
            int r4 = r0.Z0
            int r5 = r21.getSignOnTouchJumpHeight()
            int r4 = r4 + r5
            float r4 = (float) r4
            float r3 = r3 + r4
        L_0x002e:
            boolean r4 = r0.T0
            if (r4 == 0) goto L_0x0036
            int r4 = r0.S0
            float r4 = (float) r4
            float r3 = r3 + r4
        L_0x0036:
            r8 = r3
            boolean r3 = r0.x1
            bk4 r4 = r0.R1
            r9 = 2
            if (r3 == 0) goto L_0x0062
            boolean r3 = r0.y1
            if (r3 != 0) goto L_0x0062
            int r3 = r0.b1
            int r3 = r3 / r9
            int r5 = r0.S0
            int r3 = r3 + r5
            r4.getClass()
            r5 = 1077936128(0x40400000, float:3.0)
            int r5 = (int) r5
            int r6 = defpackage.fk4.b(r5)
            int r6 = r6 + r3
            float r3 = (float) r6
            float r1 = r1 + r3
            int r3 = r0.b1
            int r3 = r3 / r9
            int r6 = r0.S0
            int r3 = r3 + r6
            int r5 = defpackage.fk4.b(r5)
            int r5 = r5 + r3
            float r3 = (float) r5
            float r2 = r2 - r3
        L_0x0062:
            boolean r3 = r0.D0
            int r5 = r0.V0
            int r6 = r0.j1
            android.graphics.Rect r10 = r0.o1
            android.graphics.Paint r11 = r0.n1
            r12 = 1
            r13 = 1073741824(0x40000000, float:2.0)
            r14 = 0
            if (r3 == 0) goto L_0x0131
            int r3 = r0.E0
            float r3 = (float) r3
            r11.setTextSize(r3)
            boolean r3 = r21.isEnabled()
            if (r3 == 0) goto L_0x0081
            int r3 = r0.F0
            goto L_0x0082
        L_0x0081:
            r3 = r5
        L_0x0082:
            r11.setColor(r3)
            int r3 = r0.G0
            if (r3 != 0) goto L_0x00e1
            int r3 = r10.height()
            float r3 = (float) r3
            float r3 = r3 / r13
            float r3 = r3 + r8
            boolean r15 = r0.t1
            if (r15 == 0) goto L_0x0099
            java.lang.String[] r15 = r0.s1
            r15 = r15[r14]
            goto L_0x009d
        L_0x0099:
            java.lang.String r15 = r21.getMinText()
        L_0x009d:
            int r9 = r15.length()
            r11.getTextBounds(r15, r14, r9, r10)
            int r9 = r10.width()
            float r9 = (float) r9
            float r9 = r9 / r13
            float r9 = r9 + r1
            r7.drawText(r15, r9, r3, r11)
            int r9 = r10.width()
            int r9 = r9 + r6
            float r9 = (float) r9
            float r1 = r1 + r9
            boolean r9 = r0.t1
            if (r9 == 0) goto L_0x00c3
            java.lang.String[] r9 = r0.s1
            int r15 = r9.length
            if (r15 <= r12) goto L_0x00c3
            int r15 = r9.length
            int r15 = r15 - r12
            r9 = r9[r15]
            goto L_0x00c7
        L_0x00c3:
            java.lang.String r9 = r21.getMaxText()
        L_0x00c7:
            int r15 = r9.length()
            r11.getTextBounds(r9, r14, r15, r10)
            int r15 = r10.width()
            float r15 = (float) r15
            float r15 = r15 / r13
            float r15 = r2 - r15
            r7.drawText(r9, r15, r3, r11)
            int r3 = r10.width()
            int r3 = r3 + r6
            float r3 = (float) r3
            float r2 = r2 - r3
            goto L_0x013e
        L_0x00e1:
            if (r3 < r12) goto L_0x013e
            int r1 = r0.w0
            float r1 = (float) r1
            float r1 = r1 + r8
            float r2 = (float) r6
            float r1 = r1 + r2
            boolean r2 = r0.t1
            if (r2 == 0) goto L_0x00f2
            java.lang.String[] r2 = r0.s1
            r2 = r2[r14]
            goto L_0x00f6
        L_0x00f2:
            java.lang.String r2 = r21.getMinText()
        L_0x00f6:
            int r3 = r2.length()
            r11.getTextBounds(r2, r14, r3, r10)
            int r3 = r10.height()
            float r3 = (float) r3
            float r1 = r1 + r3
            float r3 = r0.l1
            int r9 = r0.G0
            if (r9 != r12) goto L_0x010c
            r7.drawText(r2, r3, r1, r11)
        L_0x010c:
            boolean r2 = r0.t1
            if (r2 == 0) goto L_0x011a
            java.lang.String[] r2 = r0.s1
            int r9 = r2.length
            if (r9 <= r12) goto L_0x011a
            int r9 = r2.length
            int r9 = r9 - r12
            r2 = r2[r9]
            goto L_0x011e
        L_0x011a:
            java.lang.String r2 = r21.getMaxText()
        L_0x011e:
            int r9 = r2.length()
            r11.getTextBounds(r2, r14, r9, r10)
            float r9 = r0.m1
            int r15 = r0.G0
            if (r15 != r12) goto L_0x012e
            r7.drawText(r2, r9, r1, r11)
        L_0x012e:
            r1 = r3
            r2 = r9
            goto L_0x013e
        L_0x0131:
            boolean r3 = r0.I0
            if (r3 == 0) goto L_0x013e
            int r3 = r0.G0
            r9 = -1
            if (r3 != r9) goto L_0x013e
            float r1 = r0.l1
            float r2 = r0.m1
        L_0x013e:
            boolean r3 = r0.D0
            if (r3 != 0) goto L_0x0146
            boolean r9 = r0.I0
            if (r9 == 0) goto L_0x014a
        L_0x0146:
            int r9 = r0.G0
            if (r9 != 0) goto L_0x014f
        L_0x014a:
            int r9 = r0.w0
            float r9 = (float) r9
            float r1 = r1 + r9
            float r2 = r2 - r9
        L_0x014f:
            r9 = r2
            r2 = r1
            if (r3 == 0) goto L_0x015a
            int r1 = r0.G0
            r3 = 2
            if (r1 != r3) goto L_0x015a
            r1 = r12
            goto L_0x015b
        L_0x015a:
            r1 = r14
        L_0x015b:
            java.lang.String r3 = "0123456789"
            if (r1 != 0) goto L_0x0168
            boolean r12 = r0.B0
            if (r12 == 0) goto L_0x0164
            goto L_0x0168
        L_0x0164:
            r16 = r3
            goto L_0x027a
        L_0x0168:
            boolean r12 = r0.P0
            if (r12 != 0) goto L_0x0164
            int r12 = r0.w0
            r4.getClass()
            int r4 = (int) r13
            int r4 = defpackage.fk4.b(r4)
            int r12 = r12 - r4
            float r4 = (float) r12
            float r4 = r4 / r13
            float r12 = r0.g1
            float r13 = r0.d1
            float r12 = r12 / r13
            float r13 = r0.o
            float r15 = r0.b
            float r13 = r13 - r15
            float r13 = java.lang.Math.abs(r13)
            float r13 = r13 * r12
            float r12 = r0.l1
            float r13 = r13 + r12
            int r12 = r0.E0
            float r12 = (float) r12
            r11.setTextSize(r12)
            r12 = 10
            r11.getTextBounds(r3, r14, r12, r10)
            int r12 = r10.height()
            float r12 = (float) r12
            float r12 = r12 + r8
            int r15 = r0.w0
            float r15 = (float) r15
            float r12 = r12 + r15
            float r15 = (float) r6
            float r12 = r12 + r15
            r15 = r14
        L_0x01a3:
            int r14 = r0.A0
            if (r15 > r14) goto L_0x0164
            float r14 = (float) r15
            r16 = r3
            float r3 = r0.h1
            float r3 = r3 * r14
            float r3 = r3 + r2
            int r17 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r17 > 0) goto L_0x01b7
            r17 = r5
            int r5 = r0.y0
            goto L_0x01bb
        L_0x01b7:
            r17 = r5
            int r5 = r0.x0
        L_0x01bb:
            r11.setColor(r5)
            r7.drawCircle(r3, r8, r4, r11)
            if (r1 == 0) goto L_0x0267
            float r5 = r0.b
            r18 = r1
            float r1 = r0.e1
            float r1 = r1 * r14
            float r1 = r1 + r5
            boolean r5 = r21.isEnabled()
            if (r5 == 0) goto L_0x01d4
        L_0x01d1:
            int r5 = r0.F0
            goto L_0x01e3
        L_0x01d4:
            float r5 = r0.o
            float r5 = r5 - r1
            float r5 = java.lang.Math.abs(r5)
            r14 = 0
            int r5 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r5 > 0) goto L_0x01e1
            goto L_0x01d1
        L_0x01e1:
            r5 = r17
        L_0x01e3:
            r11.setColor(r5)
            int r5 = r0.H0
            java.lang.String r14 = ""
            r19 = r4
            r4 = 1
            if (r5 <= r4) goto L_0x0228
            int r4 = r15 % r5
            if (r4 != 0) goto L_0x01fe
            boolean r4 = r0.t1
            if (r4 == 0) goto L_0x0202
            java.lang.String[] r1 = r0.s1
            r1 = r1[r15]
            r7.drawText(r1, r3, r12, r11)
        L_0x01fe:
            r20 = r13
            goto L_0x026c
        L_0x0202:
            boolean r4 = r0.s0
            if (r4 == 0) goto L_0x021a
            double r4 = (double) r1
            java.math.BigDecimal r1 = java.math.BigDecimal.valueOf(r4)
            r4 = 1
            r5 = 4
            java.math.BigDecimal r1 = r1.setScale(r4, r5)
            float r1 = r1.floatValue()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L_0x0224
        L_0x021a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r1 = (int) r1
            java.lang.String r1 = defpackage.zr6.j(r4, r1, r14)
        L_0x0224:
            r7.drawText(r1, r3, r12, r11)
            goto L_0x01fe
        L_0x0228:
            int r4 = r15 % r5
            if (r4 != 0) goto L_0x01fe
            boolean r4 = r0.t1
            if (r4 == 0) goto L_0x023f
            int r4 = r15 / r5
            java.lang.String[] r5 = r0.s1
            r20 = r13
            int r13 = r5.length
            if (r4 > r13) goto L_0x0241
            r1 = r5[r4]
            r7.drawText(r1, r3, r12, r11)
            goto L_0x026c
        L_0x023f:
            r20 = r13
        L_0x0241:
            boolean r4 = r0.s0
            if (r4 == 0) goto L_0x0259
            double r4 = (double) r1
            java.math.BigDecimal r1 = java.math.BigDecimal.valueOf(r4)
            r4 = 1
            r5 = 4
            java.math.BigDecimal r1 = r1.setScale(r4, r5)
            float r1 = r1.floatValue()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L_0x0263
        L_0x0259:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r1 = (int) r1
            java.lang.String r1 = defpackage.zr6.j(r4, r1, r14)
        L_0x0263:
            r7.drawText(r1, r3, r12, r11)
            goto L_0x026c
        L_0x0267:
            r18 = r1
            r19 = r4
            goto L_0x01fe
        L_0x026c:
            int r15 = r15 + 1
            r3 = r16
            r5 = r17
            r1 = r18
            r4 = r19
            r13 = r20
            goto L_0x01a3
        L_0x027a:
            boolean r1 = r0.i1
            if (r1 != 0) goto L_0x028d
            float r3 = r0.g1
            float r4 = r0.d1
            float r3 = r3 / r4
            float r4 = r0.o
            float r5 = r0.b
            float r3 = defpackage.z7b.f(r4, r5, r3, r2)
            r0.f1 = r3
        L_0x028d:
            boolean r3 = r0.I0
            if (r3 == 0) goto L_0x03a5
            if (r1 != 0) goto L_0x03a5
            boolean r1 = r0.p1
            if (r1 == 0) goto L_0x03a5
            int r1 = r0.K0
            r11.setColor(r1)
            int r1 = r0.J0
            float r1 = (float) r1
            r11.setTextSize(r1)
            boolean r1 = r0.s0
            if (r1 != 0) goto L_0x0338
            boolean r1 = r0.L0
            if (r1 == 0) goto L_0x02bf
            int r1 = r0.G0
            r3 = 1
            if (r1 != r3) goto L_0x02bf
            float r1 = r0.o
            float r3 = r0.b
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x02bf
            float r3 = r0.c
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x02bf
            goto L_0x0338
        L_0x02bf:
            int r1 = r21.getProgress()
            nod r3 = r0.Q1
            if (r3 == 0) goto L_0x02cf
            float r4 = (float) r1
            o46 r3 = (defpackage.o46) r3
            java.lang.String r3 = r3.a(r4)
            goto L_0x02d1
        L_0x02cf:
            r3 = r16
        L_0x02d1:
            int r4 = r3.length()
            r5 = 0
            r11.getTextBounds(r3, r5, r4, r10)
            int r3 = r10.height()
            float r3 = (float) r3
            float r3 = r3 + r8
            int r4 = r0.w0
            float r4 = (float) r4
            float r3 = r3 + r4
            float r4 = (float) r6
            float r3 = r3 + r4
            java.lang.String r4 = java.lang.String.valueOf(r1)
            java.text.NumberFormat r5 = r0.P1
            if (r5 == 0) goto L_0x02f2
            long r12 = (long) r1
            java.lang.String r4 = r5.format(r12)
        L_0x02f2:
            if (r4 == 0) goto L_0x0327
            java.lang.String r5 = r0.M1
            if (r5 == 0) goto L_0x0327
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0327
            boolean r5 = r0.N1
            if (r5 != 0) goto L_0x0315
            java.lang.String r5 = r0.M1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r4 = r4.concat(r5)
            goto L_0x0327
        L_0x0315:
            java.lang.String r5 = r0.M1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r4 = r5.concat(r4)
        L_0x0327:
            nod r5 = r0.Q1
            if (r5 == 0) goto L_0x0332
            float r1 = (float) r1
            o46 r5 = (defpackage.o46) r5
            java.lang.String r4 = r5.a(r1)
        L_0x0332:
            float r1 = r0.f1
            r7.drawText(r4, r1, r3, r11)
            goto L_0x03a5
        L_0x0338:
            float r1 = r21.getProgressFloat()
            nod r3 = r0.Q1
            if (r3 == 0) goto L_0x0347
            o46 r3 = (defpackage.o46) r3
            java.lang.String r3 = r3.a(r1)
            goto L_0x0349
        L_0x0347:
            r3 = r16
        L_0x0349:
            int r4 = r3.length()
            r12 = 0
            r11.getTextBounds(r3, r12, r4, r10)
            int r3 = r10.height()
            float r3 = (float) r3
            float r3 = r3 + r8
            int r4 = r0.w0
            float r4 = (float) r4
            float r3 = r3 + r4
            float r4 = (float) r6
            float r3 = r3 + r4
            java.lang.String r4 = java.lang.String.valueOf(r1)
            java.text.NumberFormat r5 = r0.P1
            if (r5 == 0) goto L_0x036a
            double r13 = (double) r1
            java.lang.String r4 = r5.format(r13)
        L_0x036a:
            if (r4 == 0) goto L_0x039f
            java.lang.String r1 = r0.M1
            if (r1 == 0) goto L_0x039f
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x039f
            boolean r1 = r0.N1
            if (r1 != 0) goto L_0x038d
            java.lang.String r1 = r0.M1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            java.lang.String r4 = r4.concat(r1)
            goto L_0x039f
        L_0x038d:
            java.lang.String r1 = r0.M1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            java.lang.String r4 = r1.concat(r4)
        L_0x039f:
            float r1 = r0.f1
            r7.drawText(r4, r1, r3, r11)
            goto L_0x03a6
        L_0x03a5:
            r12 = 0
        L_0x03a6:
            int r1 = r0.y0
            r11.setColor(r1)
            int r1 = r0.u0
            float r1 = (float) r1
            r11.setStrokeWidth(r1)
            float r4 = r0.f1
            r1 = r22
            r3 = r8
            r5 = r8
            r6 = r11
            r1.drawLine(r2, r3, r4, r5, r6)
            int r1 = r0.x0
            r11.setColor(r1)
            int r1 = r0.t0
            float r1 = (float) r1
            r11.setStrokeWidth(r1)
            float r2 = r0.f1
            r1 = r22
            r4 = r9
            r1.drawLine(r2, r3, r4, r5, r6)
            int r1 = r0.z0
            r11.setColor(r1)
            boolean r1 = r0.w1
            if (r1 == 0) goto L_0x040b
            float r1 = r0.f1
            boolean r2 = r0.i1
            if (r2 == 0) goto L_0x03e4
            int r2 = r0.w0
        L_0x03df:
            float r2 = (float) r2
            float r3 = r0.v1
            float r2 = r2 * r3
            goto L_0x03e7
        L_0x03e4:
            int r2 = r0.v0
            goto L_0x03df
        L_0x03e7:
            r7.drawCircle(r1, r8, r2, r11)
            int r1 = r0.z0
            float r2 = r0.u1
            int r3 = android.graphics.Color.alpha(r1)
            float r3 = (float) r3
            float r3 = r3 * r2
            int r2 = java.lang.Math.round(r3)
            int r3 = android.graphics.Color.red(r1)
            int r4 = android.graphics.Color.green(r1)
            int r1 = android.graphics.Color.blue(r1)
            int r1 = android.graphics.Color.argb(r2, r3, r4, r1)
            r11.setColor(r1)
        L_0x040b:
            float r1 = r0.f1
            boolean r2 = r0.i1
            if (r2 == 0) goto L_0x0415
            int r2 = r0.w0
        L_0x0413:
            float r2 = (float) r2
            goto L_0x0418
        L_0x0415:
            int r2 = r0.v0
            goto L_0x0413
        L_0x0418:
            r7.drawCircle(r1, r8, r2, r11)
            boolean r1 = r0.x1
            if (r1 != 0) goto L_0x0420
            return
        L_0x0420:
            float r1 = r0.f1
            int r1 = (int) r1
            boolean r2 = r0.i1
            if (r2 != 0) goto L_0x0431
            float r2 = r0.R0
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x042f
            goto L_0x0432
        L_0x042f:
            r5 = r12
            goto L_0x043b
        L_0x0431:
            r3 = 0
        L_0x0432:
            int r2 = r21.getSignOnTouchJumpHeight()
            float r2 = (float) r2
            float r4 = r0.R0
            float r2 = r2 * r4
            int r5 = (int) r2
        L_0x043b:
            int r2 = r21.getSignAndThumbSpace()
            int r4 = (int) r8
            int r6 = r0.Z0
            int r4 = r4 - r6
            int r4 = r4 - r5
            int r5 = r0.v0
            int r4 = r4 - r5
            boolean r5 = r0.T0
            if (r5 == 0) goto L_0x044e
            int r5 = r0.S0
            int r4 = r4 - r5
        L_0x044e:
            int r6 = r6 + r4
            int r5 = r0.B1
            int r6 = r6 - r5
            int r6 = r6 - r2
            int r2 = r0.b1
            r5 = 2
            int r2 = r2 / r5
            int r5 = r1 - r2
            int r2 = r2 + r1
            android.graphics.Rect r8 = r0.z1
            r8.set(r5, r4, r2, r6)
            boolean r2 = r0.T0
            if (r2 == 0) goto L_0x0466
            int r5 = r0.S0
            goto L_0x0467
        L_0x0466:
            r5 = r12
        L_0x0467:
            boolean r2 = r0.Q0
            if (r2 == 0) goto L_0x0470
            int r2 = r0.Z0
            r4 = 2
            int r2 = r2 / r4
            goto L_0x0472
        L_0x0470:
            int r2 = r0.D1
        L_0x0472:
            float r2 = (float) r2
            int r4 = r0.Z0
            float r4 = (float) r4
            r9 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r9
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x047f
            r15 = r2
            goto L_0x0480
        L_0x047f:
            r15 = r3
        L_0x0480:
            int r3 = r21.getPaddingLeft()
            float r3 = (float) r3
            float r3 = r3 - r15
            int r3 = (int) r3
            int r4 = r21.getPaddingRight()
            float r4 = (float) r4
            float r4 = r4 - r15
            int r4 = (int) r4
            int r9 = r8.left
            android.graphics.RectF r10 = r0.A1
            if (r9 >= r3) goto L_0x04a7
            int r4 = -r9
            int r4 = r4 + r3
            int r4 = r4 + r5
            int r9 = r9 + r4
            float r3 = (float) r9
            int r5 = r8.top
            float r5 = (float) r5
            int r9 = r8.right
            int r9 = r9 + r4
            float r4 = (float) r9
            int r8 = r8.bottom
            float r8 = (float) r8
            r10.set(r3, r5, r4, r8)
            goto L_0x04da
        L_0x04a7:
            int r3 = r8.right
            int r9 = r21.getMeasuredWidth()
            int r9 = r9 - r4
            if (r3 <= r9) goto L_0x04cb
            int r3 = r8.right
            int r9 = r21.getMeasuredWidth()
            int r3 = r3 - r9
            int r3 = r3 + r4
            int r3 = r3 + r5
            int r4 = r8.left
            int r4 = r4 - r3
            float r4 = (float) r4
            int r5 = r8.top
            float r5 = (float) r5
            int r9 = r8.right
            int r9 = r9 - r3
            float r3 = (float) r9
            int r8 = r8.bottom
            float r8 = (float) r8
            r10.set(r4, r5, r3, r8)
            goto L_0x04da
        L_0x04cb:
            int r3 = r8.left
            float r3 = (float) r3
            int r4 = r8.top
            float r4 = (float) r4
            int r5 = r8.right
            float r5 = (float) r5
            int r8 = r8.bottom
            float r8 = (float) r8
            r10.set(r3, r4, r5, r8)
        L_0x04da:
            android.graphics.Paint r3 = r0.H1
            r7.drawRoundRect(r10, r2, r2, r3)
            boolean r3 = r0.T0
            if (r3 == 0) goto L_0x04f3
            float r3 = r10.top
            int r4 = r0.S0
            float r4 = (float) r4
            r5 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r5
            float r4 = r4 + r3
            r10.top = r4
            android.graphics.Paint r3 = r0.I1
            r7.drawRoundRect(r10, r2, r2, r3)
        L_0x04f3:
            boolean r2 = r0.T0
            if (r2 == 0) goto L_0x04fa
            int r14 = r0.S0
            goto L_0x04fb
        L_0x04fa:
            r14 = r12
        L_0x04fb:
            int r6 = r6 + r14
            android.graphics.Point r2 = r0.E1
            int r3 = r0.C1
            r4 = 2
            int r3 = r3 / r4
            int r3 = r1 - r3
            r2.set(r3, r6)
            android.graphics.Point r3 = r0.F1
            int r5 = r0.C1
            int r5 = r5 / r4
            int r5 = r5 + r1
            r3.set(r5, r6)
            android.graphics.Point r4 = r0.G1
            int r5 = r0.B1
            int r6 = r6 + r5
            r4.set(r1, r6)
            android.graphics.Paint r1 = r0.H1
            android.graphics.Path r5 = r0.K1
            r5.reset()
            int r6 = r2.x
            float r6 = (float) r6
            int r8 = r2.y
            float r8 = (float) r8
            r5.moveTo(r6, r8)
            int r6 = r3.x
            float r6 = (float) r6
            int r8 = r3.y
            float r8 = (float) r8
            r5.lineTo(r6, r8)
            int r6 = r4.x
            float r6 = (float) r6
            int r8 = r4.y
            float r8 = (float) r8
            r5.lineTo(r6, r8)
            int r6 = r2.x
            float r6 = (float) r6
            int r8 = r2.y
            float r8 = (float) r8
            r5.lineTo(r6, r8)
            r5.close()
            r7.drawPath(r5, r1)
            boolean r1 = r0.T0
            if (r1 == 0) goto L_0x05ae
            android.graphics.Paint r1 = r0.I1
            android.graphics.Path r5 = r0.L1
            r5.reset()
            int r6 = r2.x
            float r6 = (float) r6
            int r8 = r2.y
            float r8 = (float) r8
            r5.moveTo(r6, r8)
            int r6 = r3.x
            float r6 = (float) r6
            int r8 = r3.y
            float r8 = (float) r8
            r5.lineTo(r6, r8)
            android.graphics.Paint r6 = r0.H1
            int r6 = r6.getColor()
            r1.setColor(r6)
            int r6 = r0.S0
            int r8 = r6 / 6
            float r8 = (float) r8
            float r6 = (float) r6
            r9 = 1065353216(0x3f800000, float:1.0)
            float r6 = r6 + r9
            r1.setStrokeWidth(r6)
            r7.drawPath(r5, r1)
            r5.reset()
            int r6 = r0.S0
            float r6 = (float) r6
            r1.setStrokeWidth(r6)
            int r6 = r2.x
            float r6 = (float) r6
            float r6 = r6 - r8
            int r2 = r2.y
            float r2 = (float) r2
            float r2 = r2 - r8
            r5.moveTo(r6, r2)
            int r2 = r4.x
            float r2 = (float) r2
            int r4 = r4.y
            float r4 = (float) r4
            r5.lineTo(r2, r4)
            int r2 = r3.x
            float r2 = (float) r2
            float r2 = r2 + r8
            int r3 = r3.y
            float r3 = (float) r3
            float r3 = r3 - r8
            r5.lineTo(r2, r3)
            int r2 = r0.U0
            r1.setColor(r2)
            r7.drawPath(r5, r1)
        L_0x05ae:
            r21.c()
            android.text.StaticLayout r1 = r0.J1
            if (r1 == 0) goto L_0x05d3
            float r1 = r10.left
            float r2 = r10.top
            float r3 = r10.height()
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            float r3 = r3 + r2
            android.text.StaticLayout r2 = r0.J1
            int r2 = r2.getHeight()
            r4 = 2
            int r2 = r2 / r4
            float r2 = (float) r2
            float r3 = r3 - r2
            r7.translate(r1, r3)
            android.text.StaticLayout r0 = r0.J1
            r0.draw(r7)
        L_0x05d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ood.onDraw(android.graphics.Canvas):void");
    }

    public final void onMeasure(int i, int i2) {
        String str;
        super.onMeasure(i, i2);
        int i3 = this.w0 * 2;
        boolean z = this.I0;
        String str2 = "j";
        int i4 = this.j1;
        Paint paint = this.n1;
        Rect rect = this.o1;
        if (z) {
            paint.setTextSize((float) this.J0);
            paint.getTextBounds(str2, 0, 1, rect);
            i3 += rect.height() + i4;
        }
        if (this.D0 && this.G0 >= 1) {
            if (this.t1) {
                str2 = this.s1[0];
            }
            paint.setTextSize((float) this.E0);
            paint.getTextBounds(str2, 0, str2.length(), rect);
            i3 = Math.max(i3, rect.height() + (this.w0 * 2) + i4);
        }
        if (this.x1) {
            f();
            i3 = i3 + this.Z0 + getSignOnTouchJumpHeight();
            if (this.T0) {
                i3 += this.S0;
            }
        }
        setMeasuredDimension(View.resolveSize(getSuggestedMinimumWidth(), i), i3);
        this.l1 = (float) (getPaddingLeft() + this.w0);
        this.m1 = (float) ((getMeasuredWidth() - getPaddingRight()) - this.w0);
        if (this.D0) {
            paint.setTextSize((float) this.E0);
            int i5 = this.G0;
            if (i5 == 0) {
                String minText = getMinText();
                paint.getTextBounds(minText, 0, minText.length(), rect);
                this.l1 += (float) (rect.width() + i4);
                String maxText = getMaxText();
                paint.getTextBounds(maxText, 0, maxText.length(), rect);
                this.m1 -= (float) (rect.width() + i4);
            } else if (i5 >= 1) {
                String minText2 = this.t1 ? this.s1[0] : getMinText();
                paint.getTextBounds(minText2, 0, minText2.length(), rect);
                this.l1 = ((float) getPaddingLeft()) + Math.max((float) this.w0, ((float) rect.width()) / 2.0f) + ((float) i4);
                if (this.t1) {
                    String[] strArr = this.s1;
                    str = strArr[strArr.length - 1];
                } else {
                    str = getMaxText();
                }
                paint.getTextBounds(str, 0, str.length(), rect);
                this.m1 = (((float) (getMeasuredWidth() - getPaddingRight())) - Math.max((float) this.w0, ((float) rect.width()) / 2.0f)) - ((float) i4);
            }
        } else if (this.I0 && this.G0 == -1) {
            paint.setTextSize((float) this.J0);
            String minText3 = getMinText();
            paint.getTextBounds(minText3, 0, minText3.length(), rect);
            this.l1 = ((float) getPaddingLeft()) + Math.max((float) this.w0, ((float) rect.width()) / 2.0f) + ((float) i4);
            String maxText2 = getMaxText();
            paint.getTextBounds(maxText2, 0, maxText2.length(), rect);
            this.m1 = (((float) (getMeasuredWidth() - getPaddingRight())) - Math.max((float) this.w0, ((float) rect.width()) / 2.0f)) - ((float) i4);
        }
        if (this.x1 && !this.y1) {
            this.l1 = Math.max(this.l1, (float) ((this.b1 / 2) + getPaddingLeft() + this.S0));
            this.m1 = Math.min(this.m1, (float) (((getMeasuredWidth() - getPaddingRight()) - (this.b1 / 2)) - this.S0));
        }
        float f = this.m1 - this.l1;
        this.g1 = f;
        this.h1 = (f * 1.0f) / ((float) this.A0);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.o = bundle.getFloat("progress");
            super.onRestoreInstanceState(bundle.getParcelable("save_instance"));
            setProgress(this.o);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("save_instance", super.onSaveInstanceState());
        bundle.putFloat("progress", this.o);
        return bundle;
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new kod(this, 0));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        if (r0 != 3) goto L_0x018e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0112  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.isEnabled()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            int r0 = r10.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x00a9
            if (r0 == r2) goto L_0x004b
            r3 = 2
            if (r0 == r3) goto L_0x0019
            r3 = 3
            if (r0 == r3) goto L_0x004b
            goto L_0x018e
        L_0x0019:
            boolean r0 = r9.i1
            if (r0 == 0) goto L_0x018e
            float r0 = r10.getX()
            float r3 = r9.S1
            float r0 = r0 + r3
            r9.f1 = r0
            float r3 = r9.l1
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x002e
            r9.f1 = r3
        L_0x002e:
            float r0 = r9.f1
            float r4 = r9.m1
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0038
            r9.f1 = r4
        L_0x0038:
            float r0 = r9.f1
            float r0 = r0 - r3
            float r3 = r9.d1
            float r0 = r0 * r3
            float r3 = r9.g1
            float r0 = r0 / r3
            float r3 = r9.b
            float r0 = r0 + r3
            r9.o = r0
            r9.invalidate()
            goto L_0x018e
        L_0x004b:
            android.view.ViewParent r0 = r9.getParent()
            r0.requestDisallowInterceptTouchEvent(r1)
            boolean r0 = r9.i1
            if (r0 == 0) goto L_0x0059
            r9.a(r1)
        L_0x0059:
            boolean r0 = r9.C0
            r3 = 300(0x12c, double:1.48E-321)
            r5 = 0
            if (r0 == 0) goto L_0x007a
            boolean r0 = r9.M0
            if (r0 == 0) goto L_0x0075
            kod r0 = new kod
            r7 = 1
            r0.<init>(r9, r7)
            boolean r7 = r9.i1
            if (r7 == 0) goto L_0x0070
            r3 = r5
        L_0x0070:
            r9.postDelayed(r0, r3)
            goto L_0x018e
        L_0x0075:
            r9.b()
            goto L_0x018e
        L_0x007a:
            boolean r0 = r9.i1
            if (r0 != 0) goto L_0x0082
            boolean r0 = r9.M0
            if (r0 == 0) goto L_0x018e
        L_0x0082:
            android.view.ViewPropertyAnimator r0 = r9.animate()
            long r7 = r9.O0
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r7)
            boolean r7 = r9.i1
            if (r7 != 0) goto L_0x0095
            boolean r7 = r9.M0
            if (r7 == 0) goto L_0x0095
            goto L_0x0096
        L_0x0095:
            r3 = r5
        L_0x0096:
            android.view.ViewPropertyAnimator r0 = r0.setStartDelay(r3)
            lod r3 = new lod
            r4 = 0
            r3.<init>(r9, r4)
            android.view.ViewPropertyAnimator r0 = r0.setListener(r3)
            r0.start()
            goto L_0x018e
        L_0x00a9:
            android.view.ViewParent r0 = r9.getParent()
            r0.requestDisallowInterceptTouchEvent(r2)
            boolean r0 = r9.isEnabled()
            if (r0 != 0) goto L_0x00b8
        L_0x00b6:
            r0 = r1
            goto L_0x00f9
        L_0x00b8:
            boolean r0 = r9.i1
            if (r0 == 0) goto L_0x00c0
            int r0 = r9.w0
        L_0x00be:
            float r0 = (float) r0
            goto L_0x00c3
        L_0x00c0:
            int r0 = r9.v0
            goto L_0x00be
        L_0x00c3:
            float r3 = r9.g1
            float r4 = r9.d1
            float r3 = r3 / r4
            float r4 = r9.o
            float r5 = r9.b
            float r4 = r4 - r5
            float r4 = r4 * r3
            float r3 = r9.l1
            float r4 = r4 + r3
            int r3 = r9.getMeasuredHeight()
            float r3 = (float) r3
            r5 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r5
            float r5 = r10.getX()
            float r5 = r5 - r4
            float r6 = r10.getX()
            float r6 = r6 - r4
            float r6 = r6 * r5
            float r4 = r10.getY()
            float r4 = r4 - r3
            float r5 = r10.getY()
            float r5 = r5 - r3
            float r5 = r5 * r4
            float r5 = r5 + r6
            float r3 = r9.l1
            float r3 = r3 + r0
            float r3 = r3 * r3
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x00b6
            r0 = r2
        L_0x00f9:
            r9.i1 = r0
            if (r0 == 0) goto L_0x0100
            r9.a(r2)
        L_0x0100:
            boolean r0 = r9.i1
            if (r0 == 0) goto L_0x0112
            boolean r0 = r9.N0
            if (r0 == 0) goto L_0x010e
            boolean r0 = r9.k1
            if (r0 != 0) goto L_0x010e
            r9.k1 = r2
        L_0x010e:
            r9.invalidate()
            goto L_0x0185
        L_0x0112:
            boolean r0 = r9.M0
            if (r0 == 0) goto L_0x0185
            boolean r0 = r9.isEnabled()
            if (r0 == 0) goto L_0x0185
            float r0 = r10.getX()
            int r3 = r9.getPaddingLeft()
            float r3 = (float) r3
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0185
            float r0 = r10.getX()
            int r3 = r9.getMeasuredWidth()
            int r4 = r9.getPaddingRight()
            int r3 = r3 - r4
            float r3 = (float) r3
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0185
            float r0 = r10.getY()
            int r3 = r9.getPaddingTop()
            float r3 = (float) r3
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0185
            float r0 = r10.getY()
            int r3 = r9.getMeasuredHeight()
            int r4 = r9.getPaddingBottom()
            int r3 = r3 - r4
            float r3 = (float) r3
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0185
            r9.i1 = r2
            float r0 = r10.getX()
            r9.f1 = r0
            float r3 = r9.l1
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x016a
            r9.f1 = r3
        L_0x016a:
            float r0 = r9.f1
            float r4 = r9.m1
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0174
            r9.f1 = r4
        L_0x0174:
            float r0 = r9.f1
            float r0 = r0 - r3
            float r3 = r9.d1
            float r0 = r0 * r3
            float r3 = r9.g1
            float r0 = r0 / r3
            float r3 = r9.b
            float r0 = r0 + r3
            r9.o = r0
            r9.invalidate()
        L_0x0185:
            float r0 = r9.f1
            float r3 = r10.getX()
            float r0 = r0 - r3
            r9.S1 = r0
        L_0x018e:
            boolean r0 = r9.i1
            if (r0 != 0) goto L_0x019c
            boolean r0 = r9.M0
            if (r0 != 0) goto L_0x019c
            boolean r9 = super.onTouchEvent(r10)
            if (r9 == 0) goto L_0x019d
        L_0x019c:
            r1 = r2
        L_0x019d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ood.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setOnProgressChangedListener(mod mod) {
    }

    public void setProgress(float f) {
        this.o = f;
        postInvalidate();
    }

    public void setUnit(String str) {
        this.M1 = str;
        c();
        invalidate();
        requestLayout();
    }

    public void setValueFormatListener(nod nod) {
        this.Q1 = nod;
    }
}
