package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import ru.ok.messages.settings.view.SliderWithCustomTicks;

/* renamed from: ck0  reason: default package */
public abstract class ck0 extends View {
    public static final int F1 = m2c.Widget_MaterialComponents_Slider;
    public static final int G1 = tsb.motionDurationMedium4;
    public static final int H1 = tsb.motionDurationShort3;
    public static final int I1 = tsb.motionEasingEmphasizedInterpolator;
    public static final int J1 = tsb.motionEasingEmphasizedAccelerateInterpolator;
    public final ArrayList A0 = new ArrayList();
    public Drawable A1;
    public final ArrayList B0 = new ArrayList();
    public List B1;
    public boolean C0 = false;
    public float C1;
    public ValueAnimator D0;
    public int D1;
    public ValueAnimator E0;
    public final xj0 E1;
    public final int F0;
    public final int G0;
    public final int H0;
    public final int I0;
    public final int J0;
    public final int K0;
    public final int L0;
    public final int M0;
    public final int N0;
    public int O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public int V0;
    public int W0 = -1;
    public int X0 = -1;
    public int Y0;
    public int Z0;
    public final Paint a;
    public final int a1;
    public final Paint b;
    public float b1;
    public final Paint c;
    public MotionEvent c1;
    public boolean d1 = false;
    public float e1;
    public float f1;
    public ArrayList g1 = new ArrayList();
    public int h1 = -1;
    public int i1 = -1;
    public float j1 = 0.0f;
    public float[] k1;
    public boolean l1 = true;
    public int m1;
    public int n1;
    public final Paint o;
    public int o1;
    public boolean p1 = false;
    public boolean q1;
    public ColorStateList r1;
    public final Paint s0;
    public ColorStateList s1;
    public final Paint t0;
    public ColorStateList t1;
    public final Paint u0;
    public ColorStateList u1;
    public final ak0 v0;
    public ColorStateList v1;
    public final AccessibilityManager w0;
    public final Path w1 = new Path();
    public zj0 x0;
    public final RectF x1 = new RectF();
    public final int y0;
    public final RectF y1 = new RectF();
    public final ArrayList z0 = new ArrayList();
    public final q18 z1;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ck0(android.content.Context r18, android.util.AttributeSet r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r7 = r19
            r8 = r20
            int r9 = F1
            r1 = r18
            android.content.Context r1 = defpackage.y18.a(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.z0 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.A0 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.B0 = r1
            r10 = 0
            r0.C0 = r10
            r1 = -1
            r0.W0 = r1
            r0.X0 = r1
            r0.d1 = r10
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.g1 = r2
            r0.h1 = r1
            r0.i1 = r1
            r11 = 0
            r0.j1 = r11
            r12 = 1
            r0.l1 = r12
            r0.p1 = r10
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r0.w1 = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.x1 = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.y1 = r1
            q18 r13 = new q18
            r13.<init>()
            r0.z1 = r13
            java.util.List r1 = java.util.Collections.emptyList()
            r0.B1 = r1
            r0.D1 = r10
            xj0 r1 = new xj0
            r14 = r0
            usd r14 = (defpackage.usd) r14
            r1.<init>(r14)
            r0.E1 = r1
            android.content.Context r15 = r17.getContext()
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r0.a = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r0.b = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>(r12)
            r0.c = r1
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            r1.setStyle(r2)
            android.graphics.PorterDuffXfermode r3 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.CLEAR
            r3.<init>(r4)
            r1.setXfermode(r3)
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>(r12)
            r0.o = r1
            r1.setStyle(r2)
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r0.s0 = r1
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE
            r1.setStyle(r3)
            android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.ROUND
            r1.setStrokeCap(r4)
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r0.t0 = r1
            r1.setStyle(r3)
            r1.setStrokeCap(r4)
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r0.u0 = r1
            r1.setStyle(r2)
            r1.setStrokeCap(r4)
            android.content.res.Resources r1 = r15.getResources()
            int r2 = defpackage.stb.mtrl_slider_widget_height
            int r2 = r1.getDimensionPixelSize(r2)
            r0.N0 = r2
            int r2 = defpackage.stb.mtrl_slider_track_side_padding
            int r2 = r1.getDimensionPixelOffset(r2)
            r0.G0 = r2
            r0.R0 = r2
            int r2 = defpackage.stb.mtrl_slider_thumb_radius
            int r2 = r1.getDimensionPixelSize(r2)
            r0.H0 = r2
            int r2 = defpackage.stb.mtrl_slider_track_height
            int r2 = r1.getDimensionPixelSize(r2)
            r0.I0 = r2
            int r2 = defpackage.stb.mtrl_slider_tick_radius
            int r2 = r1.getDimensionPixelSize(r2)
            r0.J0 = r2
            int r2 = defpackage.stb.mtrl_slider_tick_radius
            int r2 = r1.getDimensionPixelSize(r2)
            r0.K0 = r2
            int r2 = defpackage.stb.mtrl_slider_tick_min_spacing
            int r2 = r1.getDimensionPixelSize(r2)
            r0.L0 = r2
            int r2 = defpackage.stb.mtrl_slider_label_padding
            int r1 = r1.getDimensionPixelSize(r2)
            r0.a1 = r1
            int[] r6 = defpackage.z2c.Slider
            int[] r5 = new int[r10]
            defpackage.sre.a(r15, r7, r8, r9)
            r1 = r15
            r2 = r19
            r3 = r6
            r4 = r20
            r16 = r5
            r5 = r9
            r10 = r6
            r6 = r16
            defpackage.sre.b(r1, r2, r3, r4, r5, r6)
            android.content.res.TypedArray r1 = r15.obtainStyledAttributes(r7, r10, r8, r9)
            int r2 = defpackage.z2c.Slider_labelStyle
            int r3 = defpackage.m2c.Widget_MaterialComponents_Tooltip
            int r2 = r1.getResourceId(r2, r3)
            r0.y0 = r2
            int r2 = defpackage.z2c.Slider_android_valueFrom
            float r2 = r1.getFloat(r2, r11)
            r0.e1 = r2
            int r2 = defpackage.z2c.Slider_android_valueTo
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r1.getFloat(r2, r3)
            r0.f1 = r2
            float r2 = r0.e1
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Float[] r2 = new java.lang.Float[]{r2}
            r0.setValues((java.lang.Float[]) r2)
            int r2 = defpackage.z2c.Slider_android_stepSize
            float r2 = r1.getFloat(r2, r11)
            r0.j1 = r2
            android.content.Context r2 = r17.getContext()
            r3 = 48
            float r2 = defpackage.mqd.h(r2, r3)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            float r2 = (float) r2
            int r3 = defpackage.z2c.Slider_minTouchTargetSize
            float r2 = r1.getDimension(r3, r2)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            r0.M0 = r2
            int r2 = defpackage.z2c.Slider_trackColor
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L_0x0188
            int r3 = defpackage.z2c.Slider_trackColor
            goto L_0x018a
        L_0x0188:
            int r3 = defpackage.z2c.Slider_trackColorInactive
        L_0x018a:
            if (r2 == 0) goto L_0x018f
            int r2 = defpackage.z2c.Slider_trackColor
            goto L_0x0191
        L_0x018f:
            int r2 = defpackage.z2c.Slider_trackColorActive
        L_0x0191:
            android.content.res.ColorStateList r3 = defpackage.ju0.q(r15, r1, r3)
            if (r3 == 0) goto L_0x0198
            goto L_0x019e
        L_0x0198:
            int r3 = defpackage.etb.material_slider_inactive_track_color
            android.content.res.ColorStateList r3 = defpackage.z7.n(r15, r3)
        L_0x019e:
            r0.setTrackInactiveTintList(r3)
            android.content.res.ColorStateList r2 = defpackage.ju0.q(r15, r1, r2)
            if (r2 == 0) goto L_0x01a8
            goto L_0x01ae
        L_0x01a8:
            int r2 = defpackage.etb.material_slider_active_track_color
            android.content.res.ColorStateList r2 = defpackage.z7.n(r15, r2)
        L_0x01ae:
            r0.setTrackActiveTintList(r2)
            int r2 = defpackage.z2c.Slider_thumbColor
            android.content.res.ColorStateList r2 = defpackage.ju0.q(r15, r1, r2)
            r13.l(r2)
            int r2 = defpackage.z2c.Slider_thumbStrokeColor
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L_0x01cb
            int r2 = defpackage.z2c.Slider_thumbStrokeColor
            android.content.res.ColorStateList r2 = defpackage.ju0.q(r15, r1, r2)
            r0.setThumbStrokeColor(r2)
        L_0x01cb:
            int r2 = defpackage.z2c.Slider_thumbStrokeWidth
            float r2 = r1.getDimension(r2, r11)
            r0.setThumbStrokeWidth(r2)
            int r2 = defpackage.z2c.Slider_haloColor
            android.content.res.ColorStateList r2 = defpackage.ju0.q(r15, r1, r2)
            if (r2 == 0) goto L_0x01dd
            goto L_0x01e3
        L_0x01dd:
            int r2 = defpackage.etb.material_slider_halo_color
            android.content.res.ColorStateList r2 = defpackage.z7.n(r15, r2)
        L_0x01e3:
            r0.setHaloTintList(r2)
            int r2 = defpackage.z2c.Slider_tickVisible
            boolean r2 = r1.getBoolean(r2, r12)
            r0.l1 = r2
            int r2 = defpackage.z2c.Slider_tickColor
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L_0x01f9
            int r3 = defpackage.z2c.Slider_tickColor
            goto L_0x01fb
        L_0x01f9:
            int r3 = defpackage.z2c.Slider_tickColorInactive
        L_0x01fb:
            if (r2 == 0) goto L_0x0200
            int r2 = defpackage.z2c.Slider_tickColor
            goto L_0x0202
        L_0x0200:
            int r2 = defpackage.z2c.Slider_tickColorActive
        L_0x0202:
            android.content.res.ColorStateList r3 = defpackage.ju0.q(r15, r1, r3)
            if (r3 == 0) goto L_0x0209
            goto L_0x020f
        L_0x0209:
            int r3 = defpackage.etb.material_slider_inactive_tick_marks_color
            android.content.res.ColorStateList r3 = defpackage.z7.n(r15, r3)
        L_0x020f:
            r0.setTickInactiveTintList(r3)
            android.content.res.ColorStateList r2 = defpackage.ju0.q(r15, r1, r2)
            if (r2 == 0) goto L_0x0219
            goto L_0x021f
        L_0x0219:
            int r2 = defpackage.etb.material_slider_active_tick_marks_color
            android.content.res.ColorStateList r2 = defpackage.z7.n(r15, r2)
        L_0x021f:
            r0.setTickActiveTintList(r2)
            int r2 = defpackage.z2c.Slider_thumbTrackGapSize
            r3 = 0
            int r2 = r1.getDimensionPixelSize(r2, r3)
            r0.setThumbTrackGapSize(r2)
            int r2 = defpackage.z2c.Slider_trackStopIndicatorSize
            int r2 = r1.getDimensionPixelSize(r2, r3)
            r0.setTrackStopIndicatorSize(r2)
            int r2 = defpackage.z2c.Slider_trackInsideCornerSize
            int r2 = r1.getDimensionPixelSize(r2, r3)
            r0.setTrackInsideCornerSize(r2)
            int r2 = defpackage.z2c.Slider_thumbRadius
            int r2 = r1.getDimensionPixelSize(r2, r3)
            int r4 = defpackage.z2c.Slider_thumbWidth
            int r2 = r2 * 2
            int r4 = r1.getDimensionPixelSize(r4, r2)
            int r5 = defpackage.z2c.Slider_thumbHeight
            int r2 = r1.getDimensionPixelSize(r5, r2)
            r0.setThumbWidth(r4)
            r0.setThumbHeight(r2)
            int r2 = defpackage.z2c.Slider_haloRadius
            int r2 = r1.getDimensionPixelSize(r2, r3)
            r0.setHaloRadius(r2)
            int r2 = defpackage.z2c.Slider_thumbElevation
            float r2 = r1.getDimension(r2, r11)
            r0.setThumbElevation(r2)
            int r2 = defpackage.z2c.Slider_trackHeight
            int r2 = r1.getDimensionPixelSize(r2, r3)
            r0.setTrackHeight(r2)
            int r2 = defpackage.z2c.Slider_tickRadiusActive
            int r3 = r0.Y0
            int r3 = r3 / 2
            int r2 = r1.getDimensionPixelSize(r2, r3)
            r0.setTickActiveRadius(r2)
            int r2 = defpackage.z2c.Slider_tickRadiusInactive
            int r3 = r0.Y0
            int r3 = r3 / 2
            int r2 = r1.getDimensionPixelSize(r2, r3)
            r0.setTickInactiveRadius(r2)
            int r2 = defpackage.z2c.Slider_labelBehavior
            r3 = 0
            int r2 = r1.getInt(r2, r3)
            r0.setLabelBehavior(r2)
            int r2 = defpackage.z2c.Slider_android_enabled
            boolean r2 = r1.getBoolean(r2, r12)
            if (r2 != 0) goto L_0x02a2
            r0.setEnabled(r3)
        L_0x02a2:
            r1.recycle()
            r0.setFocusable(r12)
            r0.setClickable(r12)
            r13.m()
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r15)
            int r1 = r1.getScaledTouchSlop()
            r0.F0 = r1
            ak0 r1 = new ak0
            r1.<init>(r14)
            r0.v0 = r1
            defpackage.zmf.j(r0, r1)
            android.content.Context r1 = r17.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            r0.w0 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ck0.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final boolean A(float f) {
        return i(new BigDecimal(Float.toString(f)).subtract(new BigDecimal(Float.toString(this.e1)), MathContext.DECIMAL64).doubleValue());
    }

    public final float B(float f) {
        return (o(f) * ((float) this.o1)) + ((float) this.R0);
    }

    public final void a(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, this.S0, this.T0);
            return;
        }
        float max = ((float) Math.max(this.S0, this.T0)) / ((float) Math.max(intrinsicWidth, intrinsicHeight));
        drawable.setBounds(0, 0, (int) (((float) intrinsicWidth) * max), (int) (((float) intrinsicHeight) * max));
    }

    public final int b() {
        int i = this.O0 / 2;
        int i2 = this.P0;
        int i3 = 0;
        if (i2 == 1 || i2 == 3) {
            i3 = ((uwe) this.z0.get(0)).getIntrinsicHeight();
        }
        return i + i3;
    }

    public final ValueAnimator c(boolean z) {
        int i;
        TimeInterpolator timeInterpolator;
        float f = 1.0f;
        float f2 = z ? 0.0f : 1.0f;
        ValueAnimator valueAnimator = z ? this.E0 : this.D0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            f2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
        }
        if (!z) {
            f = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f2, f});
        if (z) {
            i = z7.P(G1, 83, getContext());
            timeInterpolator = z7.Q(getContext(), I1, og.e);
        } else {
            i = z7.P(H1, 117, getContext());
            timeInterpolator = z7.Q(getContext(), J1, og.c);
        }
        ofFloat.setDuration((long) i);
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.addUpdateListener(new yj0(0, this));
        return ofFloat;
    }

    public final void d(Canvas canvas, int i, int i2, float f, Drawable drawable) {
        canvas.save();
        canvas.translate(((float) (this.R0 + ((int) (o(f) * ((float) i))))) - (((float) drawable.getBounds().width()) / 2.0f), ((float) i2) - (((float) drawable.getBounds().height()) / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.v0.m(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.a.setColor(h(this.v1));
        this.b.setColor(h(this.u1));
        this.s0.setColor(h(this.t1));
        this.t0.setColor(h(this.s1));
        this.u0.setColor(h(this.u1));
        Iterator it = this.z0.iterator();
        while (it.hasNext()) {
            uwe uwe = (uwe) it.next();
            if (uwe.isStateful()) {
                uwe.setState(getDrawableState());
            }
        }
        q18 q18 = this.z1;
        if (q18.isStateful()) {
            q18.setState(getDrawableState());
        }
        Paint paint = this.o;
        paint.setColor(h(this.r1));
        paint.setAlpha(63);
    }

    public final void e() {
        if (!this.C0) {
            this.C0 = true;
            ValueAnimator c2 = c(true);
            this.D0 = c2;
            this.E0 = null;
            c2.start();
        }
        ArrayList arrayList = this.z0;
        Iterator it = arrayList.iterator();
        for (int i = 0; i < this.g1.size() && it.hasNext(); i++) {
            if (i != this.i1) {
                q((uwe) it.next(), ((Float) this.g1.get(i)).floatValue());
            }
        }
        if (it.hasNext()) {
            q((uwe) it.next(), ((Float) this.g1.get(this.i1)).floatValue());
            return;
        }
        throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", new Object[]{Integer.valueOf(arrayList.size()), Integer.valueOf(this.g1.size())}));
    }

    public final void f() {
        if (this.C0) {
            this.C0 = false;
            ValueAnimator c2 = c(false);
            this.E0 = c2;
            this.D0 = null;
            c2.addListener(new h6(2, (Object) this));
            this.E0.start();
        }
    }

    public final float[] g() {
        float floatValue = ((Float) this.g1.get(0)).floatValue();
        float floatValue2 = ((Float) wg0.f(this.g1, 1)).floatValue();
        if (this.g1.size() == 1) {
            floatValue = this.e1;
        }
        float o2 = o(floatValue);
        float o3 = o(floatValue2);
        if (k()) {
            return new float[]{o3, o2};
        }
        return new float[]{o2, o3};
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.v0.k;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public abstract int getThumbRadius();

    public abstract float getValueFrom();

    public abstract float getValueTo();

    public List<Float> getValues() {
        return new ArrayList(this.g1);
    }

    public final int h(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    public final boolean i(double d) {
        double doubleValue = new BigDecimal(Double.toString(d)).divide(new BigDecimal(Float.toString(this.j1)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(doubleValue)) - doubleValue) < 1.0E-4d;
    }

    public final boolean j(MotionEvent motionEvent) {
        if (motionEvent.getToolType(0) == 3) {
            return false;
        }
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    public final boolean k() {
        WeakHashMap weakHashMap = zmf.a;
        return getLayoutDirection() == 1;
    }

    public final void l() {
        if (this.j1 > 0.0f) {
            z();
            int min = Math.min((int) (((this.f1 - this.e1) / this.j1) + 1.0f), (this.o1 / this.L0) + 1);
            float[] fArr = this.k1;
            if (fArr == null || fArr.length != min * 2) {
                this.k1 = new float[(min * 2)];
            }
            float f = ((float) this.o1) / ((float) (min - 1));
            for (int i = 0; i < min * 2; i += 2) {
                float[] fArr2 = this.k1;
                fArr2[i] = ((((float) i) / 2.0f) * f) + ((float) this.R0);
                fArr2[i + 1] = (float) b();
            }
        }
    }

    public final boolean m(int i) {
        int i2 = this.i1;
        long j = ((long) i2) + ((long) i);
        long size = (long) (this.g1.size() - 1);
        if (j < 0) {
            j = 0;
        } else if (j > size) {
            j = size;
        }
        int i3 = (int) j;
        this.i1 = i3;
        if (i3 == i2) {
            return false;
        }
        if (this.h1 != -1) {
            this.h1 = i3;
        }
        v();
        postInvalidate();
        return true;
    }

    public final void n(int i) {
        if (k()) {
            i = i == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i;
        }
        m(i);
    }

    public final float o(float f) {
        float f2 = this.e1;
        float f3 = (f - f2) / (this.f1 - f2);
        return k() ? 1.0f - f3 : f3;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.E1);
        Iterator it = this.z0.iterator();
        while (it.hasNext()) {
            uwe uwe = (uwe) it.next();
            ViewGroup j = mqd.j(this);
            if (j == null) {
                uwe.getClass();
            } else {
                uwe.getClass();
                int[] iArr = new int[2];
                j.getLocationOnScreen(iArr);
                uwe.V0 = iArr[0];
                j.getWindowVisibleDisplayFrame(uwe.O0);
                j.addOnLayoutChangeListener(uwe.N0);
            }
        }
    }

    public final void onDetachedFromWindow() {
        zj0 zj0 = this.x0;
        if (zj0 != null) {
            removeCallbacks(zj0);
        }
        this.C0 = false;
        Iterator it = this.z0.iterator();
        while (it.hasNext()) {
            uwe uwe = (uwe) it.next();
            y7f k = mqd.k(this);
            if (k != null) {
                ((ViewOverlay) k.b).remove(uwe);
                ViewGroup j = mqd.j(this);
                if (j == null) {
                    uwe.getClass();
                } else {
                    j.removeOnLayoutChangeListener(uwe.N0);
                }
            }
        }
        getViewTreeObserver().removeOnScrollChangedListener(this.E1);
        super.onDetachedFromWindow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:0x0180 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0172  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r19) {
        /*
            r18 = this;
            r6 = r18
            r7 = r19
            boolean r0 = r6.q1
            if (r0 == 0) goto L_0x000e
            r18.z()
            r18.l()
        L_0x000e:
            super.onDraw(r19)
            int r8 = r18.b()
            java.util.ArrayList r0 = r6.g1
            r9 = 0
            java.lang.Object r0 = r0.get(r9)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            java.util.ArrayList r1 = r6.g1
            r10 = 1
            java.lang.Object r1 = defpackage.wg0.f(r1, r10)
            java.lang.Float r1 = (java.lang.Float) r1
            float r11 = r1.floatValue()
            float r1 = r6.f1
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            android.graphics.RectF r12 = r6.x1
            r13 = 3
            r15 = 1073741824(0x40000000, float:2.0)
            if (r1 < 0) goto L_0x0048
            java.util.ArrayList r1 = r6.g1
            int r1 = r1.size()
            if (r1 <= r10) goto L_0x00cc
            float r1 = r6.e1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00cc
        L_0x0048:
            int r0 = r6.o1
            float[] r16 = r18.g()
            int r1 = r6.R0
            float r2 = (float) r1
            r3 = r16[r10]
            float r5 = (float) r0
            float r3 = r3 * r5
            float r2 = r2 + r3
            int r3 = r1 + r0
            float r3 = (float) r3
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            android.graphics.Paint r4 = r6.a
            if (r3 >= 0) goto L_0x0076
            int r3 = r6.V0
            if (r3 <= 0) goto L_0x0079
            float r3 = (float) r3
            float r2 = r2 + r3
            float r3 = (float) r8
            int r10 = r6.Q0
            float r10 = (float) r10
            float r10 = r10 / r15
            float r14 = r3 - r10
            int r1 = r1 + r0
            float r0 = (float) r1
            float r0 = r0 + r10
            float r10 = r10 + r3
            r12.set(r2, r14, r0, r10)
            r6.x(r7, r4, r12, r13)
        L_0x0076:
            r14 = r4
            r10 = r5
            goto L_0x0093
        L_0x0079:
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r4.setStyle(r1)
            android.graphics.Paint$Cap r1 = android.graphics.Paint.Cap.ROUND
            r4.setStrokeCap(r1)
            float r10 = (float) r8
            int r1 = r6.R0
            int r1 = r1 + r0
            float r3 = (float) r1
            r0 = r19
            r1 = r2
            r2 = r10
            r14 = r4
            r4 = r10
            r10 = r5
            r5 = r14
            r0.drawLine(r1, r2, r3, r4, r5)
        L_0x0093:
            int r0 = r6.R0
            float r1 = (float) r0
            r2 = r16[r9]
            float r2 = r2 * r10
            float r3 = r2 + r1
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x00cc
            int r1 = r6.V0
            if (r1 <= 0) goto L_0x00b7
            float r0 = (float) r0
            int r2 = r6.Q0
            float r2 = (float) r2
            float r2 = r2 / r15
            float r0 = r0 - r2
            float r4 = (float) r8
            float r5 = r4 - r2
            float r1 = (float) r1
            float r3 = r3 - r1
            float r2 = r2 + r4
            r12.set(r0, r5, r3, r2)
            r0 = 2
            r6.x(r7, r14, r12, r0)
            goto L_0x00cc
        L_0x00b7:
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r14.setStyle(r0)
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.ROUND
            r14.setStrokeCap(r0)
            int r0 = r6.R0
            float r1 = (float) r0
            float r4 = (float) r8
            r0 = r19
            r2 = r4
            r5 = r14
            r0.drawLine(r1, r2, r3, r4, r5)
        L_0x00cc:
            float r0 = r6.e1
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0194
            int r0 = r6.o1
            float[] r1 = r18.g()
            int r2 = r6.R0
            float r2 = (float) r2
            r3 = 1
            r4 = r1[r3]
            float r0 = (float) r0
            float r4 = r4 * r0
            float r3 = r4 + r2
            r1 = r1[r9]
            float r1 = r1 * r0
            float r1 = r1 + r2
            int r0 = r6.V0
            if (r0 <= 0) goto L_0x00ec
            r0 = 1
            goto L_0x00ed
        L_0x00ec:
            r0 = r9
        L_0x00ed:
            android.graphics.Paint r5 = r6.b
            if (r0 == 0) goto L_0x0183
            java.util.ArrayList r0 = r6.g1
            int r0 = r0.size()
            r2 = 1
            if (r0 != r2) goto L_0x0104
            boolean r0 = r18.k()
            if (r0 == 0) goto L_0x0102
            r0 = r13
            goto L_0x0105
        L_0x0102:
            r0 = 2
            goto L_0x0105
        L_0x0104:
            r0 = 4
        L_0x0105:
            r2 = r9
        L_0x0106:
            java.util.ArrayList r4 = r6.g1
            int r4 = r4.size()
            if (r2 >= r4) goto L_0x0194
            java.util.ArrayList r4 = r6.g1
            int r4 = r4.size()
            r10 = 1
            if (r4 <= r10) goto L_0x0146
            if (r2 <= 0) goto L_0x012b
            java.util.ArrayList r1 = r6.g1
            int r3 = r2 + -1
            java.lang.Object r1 = r1.get(r3)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            float r1 = r6.B(r1)
        L_0x012b:
            java.util.ArrayList r3 = r6.g1
            java.lang.Object r3 = r3.get(r2)
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            float r3 = r6.B(r3)
            boolean r4 = r18.k()
            if (r4 == 0) goto L_0x0146
            r17 = r3
            r3 = r1
            r1 = r17
        L_0x0146:
            int r4 = defpackage.au1.s(r0)
            r10 = 1
            if (r4 == r10) goto L_0x0164
            r10 = 2
            if (r4 == r10) goto L_0x0159
            if (r4 == r13) goto L_0x0153
            goto L_0x016d
        L_0x0153:
            int r4 = r6.V0
            float r4 = (float) r4
            float r1 = r1 + r4
        L_0x0157:
            float r3 = r3 - r4
            goto L_0x016d
        L_0x0159:
            int r4 = r6.V0
            float r4 = (float) r4
            float r1 = r1 + r4
            int r4 = r6.Q0
            float r4 = (float) r4
            float r4 = r4 / r15
            float r4 = r4 + r3
            r3 = r4
            goto L_0x016d
        L_0x0164:
            int r4 = r6.Q0
            float r4 = (float) r4
            float r4 = r4 / r15
            float r1 = r1 - r4
            int r4 = r6.V0
            float r4 = (float) r4
            goto L_0x0157
        L_0x016d:
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 < 0) goto L_0x0172
            goto L_0x0180
        L_0x0172:
            float r4 = (float) r8
            int r10 = r6.Q0
            float r10 = (float) r10
            float r10 = r10 / r15
            float r11 = r4 - r10
            float r10 = r10 + r4
            r12.set(r1, r11, r3, r10)
            r6.x(r7, r5, r12, r0)
        L_0x0180:
            int r2 = r2 + 1
            goto L_0x0106
        L_0x0183:
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r5.setStyle(r0)
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.ROUND
            r5.setStrokeCap(r0)
            float r4 = (float) r8
            r0 = r19
            r2 = r4
            r0.drawLine(r1, r2, r3, r4, r5)
        L_0x0194:
            boolean r0 = r6.l1
            if (r0 == 0) goto L_0x01f0
            float r0 = r6.j1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x01a0
            goto L_0x01f0
        L_0x01a0:
            float[] r0 = r18.g()
            r1 = r0[r9]
            float[] r2 = r6.k1
            int r2 = r2.length
            float r2 = (float) r2
            float r2 = r2 / r15
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r3
            float r2 = r2 * r1
            double r1 = (double) r2
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            r2 = 1
            r0 = r0[r2]
            float[] r2 = r6.k1
            int r2 = r2.length
            float r2 = (float) r2
            float r2 = r2 / r15
            float r2 = r2 - r3
            float r2 = r2 * r0
            double r2 = (double) r2
            double r2 = java.lang.Math.floor(r2)
            int r0 = (int) r2
            android.graphics.Paint r2 = r6.s0
            if (r1 <= 0) goto L_0x01d0
            float[] r3 = r6.k1
            int r4 = r1 * 2
            r7.drawPoints(r3, r9, r4, r2)
        L_0x01d0:
            if (r1 > r0) goto L_0x01e2
            float[] r3 = r6.k1
            int r4 = r1 * 2
            int r1 = r0 - r1
            r5 = 1
            int r1 = r1 + r5
            r10 = 2
            int r1 = r1 * r10
            android.graphics.Paint r11 = r6.t0
            r7.drawPoints(r3, r4, r1, r11)
            goto L_0x01e4
        L_0x01e2:
            r5 = 1
            r10 = 2
        L_0x01e4:
            int r0 = r0 + r5
            int r0 = r0 * r10
            float[] r1 = r6.k1
            int r3 = r1.length
            if (r0 >= r3) goto L_0x01f0
            int r3 = r1.length
            int r3 = r3 - r0
            r7.drawPoints(r1, r0, r3, r2)
        L_0x01f0:
            int r0 = r6.Y0
            if (r0 > 0) goto L_0x01f5
            goto L_0x023d
        L_0x01f5:
            java.util.ArrayList r0 = r6.g1
            int r0 = r0.size()
            android.graphics.Paint r1 = r6.u0
            r2 = 1
            if (r0 < r2) goto L_0x021a
            java.util.ArrayList r0 = r6.g1
            java.lang.Object r0 = defpackage.wg0.f(r0, r2)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            float r2 = r6.f1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x021a
            float r0 = r6.B(r2)
            float r2 = (float) r8
            r7.drawPoint(r0, r2, r1)
        L_0x021a:
            java.util.ArrayList r0 = r6.g1
            int r0 = r0.size()
            r2 = 1
            if (r0 <= r2) goto L_0x023d
            java.util.ArrayList r0 = r6.g1
            java.lang.Object r0 = r0.get(r9)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            float r2 = r6.e1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x023d
            float r0 = r6.B(r2)
            float r2 = (float) r8
            r7.drawPoint(r0, r2, r1)
        L_0x023d:
            boolean r0 = r6.d1
            if (r0 != 0) goto L_0x0247
            boolean r0 = r18.isFocused()
            if (r0 == 0) goto L_0x027c
        L_0x0247:
            boolean r0 = r18.isEnabled()
            if (r0 == 0) goto L_0x027c
            int r0 = r6.o1
            android.graphics.drawable.Drawable r1 = r18.getBackground()
            boolean r1 = r1 instanceof android.graphics.drawable.RippleDrawable
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x027c
            int r1 = r6.R0
            float r1 = (float) r1
            java.util.ArrayList r2 = r6.g1
            int r3 = r6.i1
            java.lang.Object r2 = r2.get(r3)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            float r2 = r6.o(r2)
            float r0 = (float) r0
            float r2 = r2 * r0
            float r2 = r2 + r1
            int r0 = (int) r2
            float r0 = (float) r0
            float r1 = (float) r8
            int r2 = r6.U0
            float r2 = (float) r2
            android.graphics.Paint r3 = r6.o
            r7.drawCircle(r0, r1, r2, r3)
        L_0x027c:
            r18.w()
            int r10 = r6.o1
        L_0x0281:
            java.util.ArrayList r0 = r6.g1
            int r0 = r0.size()
            if (r9 >= r0) goto L_0x02e7
            java.util.ArrayList r0 = r6.g1
            java.lang.Object r0 = r0.get(r9)
            java.lang.Float r0 = (java.lang.Float) r0
            float r4 = r0.floatValue()
            android.graphics.drawable.Drawable r5 = r6.A1
            if (r5 == 0) goto L_0x02a3
            r0 = r18
            r1 = r19
            r2 = r10
            r3 = r8
            r0.d(r1, r2, r3, r4, r5)
            goto L_0x02e4
        L_0x02a3:
            java.util.List r0 = r6.B1
            int r0 = r0.size()
            if (r9 >= r0) goto L_0x02be
            java.util.List r0 = r6.B1
            java.lang.Object r0 = r0.get(r9)
            r5 = r0
            android.graphics.drawable.Drawable r5 = (android.graphics.drawable.Drawable) r5
            r0 = r18
            r1 = r19
            r2 = r10
            r3 = r8
            r0.d(r1, r2, r3, r4, r5)
            goto L_0x02e4
        L_0x02be:
            boolean r0 = r18.isEnabled()
            if (r0 != 0) goto L_0x02d9
            int r0 = r6.R0
            float r0 = (float) r0
            float r1 = r6.o(r4)
            float r2 = (float) r10
            float r1 = r1 * r2
            float r1 = r1 + r0
            float r0 = (float) r8
            int r2 = r18.getThumbRadius()
            float r2 = (float) r2
            android.graphics.Paint r3 = r6.c
            r7.drawCircle(r1, r0, r2, r3)
        L_0x02d9:
            q18 r5 = r6.z1
            r0 = r18
            r1 = r19
            r2 = r10
            r3 = r8
            r0.d(r1, r2, r3, r4, r5)
        L_0x02e4:
            int r9 = r9 + 1
            goto L_0x0281
        L_0x02e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ck0.onDraw(android.graphics.Canvas):void");
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        ak0 ak0 = this.v0;
        if (!z) {
            this.h1 = -1;
            ak0.j(this.i1);
            return;
        }
        if (i == 1) {
            m(Integer.MAX_VALUE);
        } else if (i == 2) {
            m(Integer.MIN_VALUE);
        } else if (i == 17) {
            n(Integer.MAX_VALUE);
        } else if (i == 66) {
            n(Integer.MIN_VALUE);
        }
        ak0.w(this.i1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.Boolean} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: type inference failed for: r3v20 */
    /* JADX WARNING: type inference failed for: r3v21 */
    /* JADX WARNING: type inference failed for: r3v22 */
    /* JADX WARNING: type inference failed for: r3v23 */
    /* JADX WARNING: type inference failed for: r3v24 */
    /* JADX WARNING: type inference failed for: r3v25 */
    /* JADX WARNING: type inference failed for: r3v26 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onKeyDown(int r14, android.view.KeyEvent r15) {
        /*
            r13 = this;
            boolean r0 = r13.isEnabled()
            if (r0 != 0) goto L_0x000b
            boolean r13 = super.onKeyDown(r14, r15)
            return r13
        L_0x000b:
            java.util.ArrayList r0 = r13.g1
            int r0 = r0.size()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L_0x0017
            r13.h1 = r1
        L_0x0017:
            int r0 = r13.h1
            r3 = 0
            r4 = 70
            r5 = 69
            r6 = 81
            r7 = 66
            r8 = 61
            r9 = -1
            if (r0 != r9) goto L_0x0083
            if (r14 == r8) goto L_0x0057
            if (r14 == r7) goto L_0x004d
            if (r14 == r6) goto L_0x0047
            if (r14 == r5) goto L_0x0041
            if (r14 == r4) goto L_0x0047
            switch(r14) {
                case 21: goto L_0x003b;
                case 22: goto L_0x0035;
                case 23: goto L_0x004d;
                default: goto L_0x0034;
            }
        L_0x0034:
            goto L_0x0077
        L_0x0035:
            r13.n(r2)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            goto L_0x0077
        L_0x003b:
            r13.n(r9)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            goto L_0x0077
        L_0x0041:
            r13.m(r9)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            goto L_0x0077
        L_0x0047:
            r13.m(r2)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            goto L_0x0077
        L_0x004d:
            int r0 = r13.i1
            r13.h1 = r0
            r13.postInvalidate()
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            goto L_0x0077
        L_0x0057:
            boolean r0 = r15.hasNoModifiers()
            if (r0 == 0) goto L_0x0066
            boolean r0 = r13.m(r2)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            goto L_0x0077
        L_0x0066:
            boolean r0 = r15.isShiftPressed()
            if (r0 == 0) goto L_0x0075
            boolean r0 = r13.m(r9)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            goto L_0x0077
        L_0x0075:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
        L_0x0077:
            if (r3 == 0) goto L_0x007e
            boolean r13 = r3.booleanValue()
            goto L_0x0082
        L_0x007e:
            boolean r13 = super.onKeyDown(r14, r15)
        L_0x0082:
            return r13
        L_0x0083:
            boolean r0 = r13.p1
            boolean r10 = r15.isLongPress()
            r0 = r0 | r10
            r13.p1 = r0
            r10 = 1065353216(0x3f800000, float:1.0)
            r11 = 0
            if (r0 == 0) goto L_0x00af
            float r0 = r13.j1
            int r11 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r11 != 0) goto L_0x0098
            goto L_0x0099
        L_0x0098:
            r10 = r0
        L_0x0099:
            float r0 = r13.f1
            float r11 = r13.e1
            float r0 = r0 - r11
            float r0 = r0 / r10
            r11 = 20
            float r11 = (float) r11
            int r12 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r12 > 0) goto L_0x00a7
            goto L_0x00b7
        L_0x00a7:
            float r0 = r0 / r11
            int r0 = java.lang.Math.round(r0)
            float r0 = (float) r0
            float r10 = r10 * r0
            goto L_0x00b7
        L_0x00af:
            float r0 = r13.j1
            int r11 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r11 != 0) goto L_0x00b6
            goto L_0x00b7
        L_0x00b6:
            r10 = r0
        L_0x00b7:
            r0 = 21
            if (r14 == r0) goto L_0x00dd
            r0 = 22
            if (r14 == r0) goto L_0x00d1
            if (r14 == r5) goto L_0x00cb
            if (r14 == r4) goto L_0x00c6
            if (r14 == r6) goto L_0x00c6
            goto L_0x00e9
        L_0x00c6:
            java.lang.Float r3 = java.lang.Float.valueOf(r10)
            goto L_0x00e9
        L_0x00cb:
            float r0 = -r10
            java.lang.Float r3 = java.lang.Float.valueOf(r0)
            goto L_0x00e9
        L_0x00d1:
            boolean r0 = r13.k()
            if (r0 == 0) goto L_0x00d8
            float r10 = -r10
        L_0x00d8:
            java.lang.Float r3 = java.lang.Float.valueOf(r10)
            goto L_0x00e9
        L_0x00dd:
            boolean r0 = r13.k()
            if (r0 == 0) goto L_0x00e4
            goto L_0x00e5
        L_0x00e4:
            float r10 = -r10
        L_0x00e5:
            java.lang.Float r3 = java.lang.Float.valueOf(r10)
        L_0x00e9:
            if (r3 == 0) goto L_0x010d
            java.util.ArrayList r14 = r13.g1
            int r15 = r13.h1
            java.lang.Object r14 = r14.get(r15)
            java.lang.Float r14 = (java.lang.Float) r14
            float r14 = r14.floatValue()
            float r15 = r3.floatValue()
            float r15 = r15 + r14
            int r14 = r13.h1
            boolean r14 = r13.s(r14, r15)
            if (r14 == 0) goto L_0x010c
            r13.v()
            r13.postInvalidate()
        L_0x010c:
            return r2
        L_0x010d:
            r0 = 23
            if (r14 == r0) goto L_0x0131
            if (r14 == r8) goto L_0x011a
            if (r14 == r7) goto L_0x0131
            boolean r13 = super.onKeyDown(r14, r15)
            return r13
        L_0x011a:
            boolean r14 = r15.hasNoModifiers()
            if (r14 == 0) goto L_0x0125
            boolean r13 = r13.m(r2)
            return r13
        L_0x0125:
            boolean r14 = r15.isShiftPressed()
            if (r14 == 0) goto L_0x0130
            boolean r13 = r13.m(r9)
            return r13
        L_0x0130:
            return r1
        L_0x0131:
            r13.h1 = r9
            r13.postInvalidate()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ck0.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        this.p1 = false;
        return super.onKeyUp(i, keyEvent);
    }

    public final void onMeasure(int i, int i2) {
        int i3 = this.O0;
        int i4 = this.P0;
        int i5 = 0;
        if (i4 == 1 || i4 == 3) {
            i5 = ((uwe) this.z0.get(0)).getIntrinsicHeight();
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3 + i5, 1073741824));
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        bk0 bk0 = (bk0) parcelable;
        super.onRestoreInstanceState(bk0.getSuperState());
        this.e1 = bk0.a;
        this.f1 = bk0.b;
        r(bk0.c);
        this.j1 = bk0.o;
        if (bk0.X) {
            requestFocus();
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, bk0] */
    public final Parcelable onSaveInstanceState() {
        ? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.a = this.e1;
        baseSavedState.b = this.f1;
        baseSavedState.c = new ArrayList(this.g1);
        baseSavedState.o = this.j1;
        baseSavedState.X = hasFocus();
        return baseSavedState;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.o1 = Math.max(i - (this.R0 * 2), 0);
        l();
        v();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        if (r2 != 3) goto L_0x013f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            float r0 = r8.getX()
            int r2 = r7.R0
            float r2 = (float) r2
            float r2 = r0 - r2
            int r3 = r7.o1
            float r3 = (float) r3
            float r2 = r2 / r3
            r7.C1 = r2
            r3 = 0
            float r2 = java.lang.Math.max(r3, r2)
            r7.C1 = r2
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = java.lang.Math.min(r3, r2)
            r7.C1 = r2
            int r2 = r8.getActionMasked()
            r3 = -1
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x00f2
            int r6 = r7.F0
            if (r2 == r5) goto L_0x0075
            if (r2 == r4) goto L_0x003a
            r0 = 3
            if (r2 == r0) goto L_0x0075
            goto L_0x013f
        L_0x003a:
            boolean r2 = r7.d1
            if (r2 != 0) goto L_0x005b
            boolean r2 = r7.j(r8)
            if (r2 == 0) goto L_0x0051
            float r2 = r7.b1
            float r0 = r0 - r2
            float r0 = java.lang.Math.abs(r0)
            float r2 = (float) r6
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0051
            return r1
        L_0x0051:
            android.view.ViewParent r0 = r7.getParent()
            r0.requestDisallowInterceptTouchEvent(r5)
            r7.p()
        L_0x005b:
            r0 = r7
            usd r0 = (defpackage.usd) r0
            int r2 = r0.getActiveThumbIndex()
            if (r2 == r3) goto L_0x0065
            goto L_0x0068
        L_0x0065:
            r0.setActiveThumbIndex(r1)
        L_0x0068:
            r7.d1 = r5
            r7.t()
            r7.v()
            r7.invalidate()
            goto L_0x013f
        L_0x0075:
            r7.d1 = r1
            android.view.MotionEvent r0 = r7.c1
            if (r0 == 0) goto L_0x00b8
            int r0 = r0.getActionMasked()
            if (r0 != 0) goto L_0x00b8
            android.view.MotionEvent r0 = r7.c1
            float r0 = r0.getX()
            float r2 = r8.getX()
            float r0 = r0 - r2
            float r0 = java.lang.Math.abs(r0)
            float r2 = (float) r6
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x00b8
            android.view.MotionEvent r0 = r7.c1
            float r0 = r0.getY()
            float r4 = r8.getY()
            float r0 = r0 - r4
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x00b8
            r0 = r7
            usd r0 = (defpackage.usd) r0
            int r2 = r0.getActiveThumbIndex()
            if (r2 == r3) goto L_0x00b2
            goto L_0x00b5
        L_0x00b2:
            r0.setActiveThumbIndex(r1)
        L_0x00b5:
            r7.p()
        L_0x00b8:
            int r0 = r7.h1
            if (r0 == r3) goto L_0x00ee
            r7.t()
            r7.v()
            int r0 = r7.V0
            if (r0 <= 0) goto L_0x00d6
            int r0 = r7.W0
            if (r0 == r3) goto L_0x00d6
            int r1 = r7.X0
            if (r1 == r3) goto L_0x00d6
            r7.setThumbWidth(r0)
            int r0 = r7.X0
            r7.setThumbTrackGapSize(r0)
        L_0x00d6:
            r7.h1 = r3
            java.util.ArrayList r0 = r7.B0
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L_0x00e5
            goto L_0x00ee
        L_0x00e5:
            java.lang.Object r7 = r0.next()
            defpackage.au1.r(r7)
            r7 = 0
            throw r7
        L_0x00ee:
            r7.invalidate()
            goto L_0x013f
        L_0x00f2:
            r7.b1 = r0
            boolean r0 = r7.j(r8)
            if (r0 == 0) goto L_0x00fb
            goto L_0x013f
        L_0x00fb:
            android.view.ViewParent r0 = r7.getParent()
            r0.requestDisallowInterceptTouchEvent(r5)
            r0 = r7
            usd r0 = (defpackage.usd) r0
            int r2 = r0.getActiveThumbIndex()
            if (r2 == r3) goto L_0x010c
            goto L_0x010f
        L_0x010c:
            r0.setActiveThumbIndex(r1)
        L_0x010f:
            r7.requestFocus()
            r7.d1 = r5
            r7.t()
            r7.v()
            int r0 = r7.V0
            if (r0 <= 0) goto L_0x0139
            int r1 = r7.S0
            r7.W0 = r1
            r7.X0 = r0
            float r0 = (float) r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r1
            int r0 = java.lang.Math.round(r0)
            int r1 = r7.S0
            int r1 = r1 - r0
            r7.setThumbWidth(r0)
            int r0 = r7.V0
            int r1 = r1 / r4
            int r0 = r0 - r1
            r7.setThumbTrackGapSize(r0)
        L_0x0139:
            r7.invalidate()
            r7.p()
        L_0x013f:
            boolean r0 = r7.d1
            r7.setPressed(r0)
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r8)
            r7.c1 = r8
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ck0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void onVisibilityChanged(View view, int i) {
        y7f k;
        super.onVisibilityChanged(view, i);
        if (i != 0 && (k = mqd.k(this)) != null) {
            Iterator it = this.z0.iterator();
            while (it.hasNext()) {
                ((ViewOverlay) k.b).remove((uwe) it.next());
            }
        }
    }

    public final void p() {
        Iterator it = this.B0.iterator();
        if (it.hasNext()) {
            au1.r(it.next());
            throw null;
        }
    }

    public final void q(uwe uwe, float f) {
        String format = String.format(((float) ((int) f)) == f ? "%.0f" : "%.2f", new Object[]{Float.valueOf(f)});
        if (!TextUtils.equals(uwe.J0, format)) {
            uwe.J0 = format;
            uwe.M0.e = true;
            uwe.invalidateSelf();
        }
        int o2 = (this.R0 + ((int) (o(f) * ((float) this.o1)))) - (uwe.getIntrinsicWidth() / 2);
        int b2 = b() - ((this.T0 / 2) + this.a1);
        uwe.setBounds(o2, b2 - uwe.getIntrinsicHeight(), uwe.getIntrinsicWidth() + o2, b2);
        Rect rect = new Rect(uwe.getBounds());
        uh4.b(mqd.j(this), this, rect);
        uwe.setBounds(rect);
        ((ViewOverlay) mqd.k(this).b).add(uwe);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ef, code lost:
        r4 = r2.getResourceId(r4, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r(java.util.ArrayList r11) {
        /*
            r10 = this;
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x01f7
            java.util.Collections.sort(r11)
            java.util.ArrayList r0 = r10.g1
            int r0 = r0.size()
            int r1 = r11.size()
            if (r0 != r1) goto L_0x001e
            java.util.ArrayList r0 = r10.g1
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x001e
            return
        L_0x001e:
            r10.g1 = r11
            r11 = 1
            r10.q1 = r11
            r0 = 0
            r10.i1 = r0
            r10.v()
            java.util.ArrayList r1 = r10.z0
            int r2 = r1.size()
            java.util.ArrayList r3 = r10.g1
            int r3 = r3.size()
            if (r2 <= r3) goto L_0x007d
            java.util.ArrayList r2 = r10.g1
            int r2 = r2.size()
            int r3 = r1.size()
            java.util.List r2 = r1.subList(r2, r3)
            java.util.Iterator r3 = r2.iterator()
        L_0x0049:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x007a
            java.lang.Object r4 = r3.next()
            uwe r4 = (defpackage.uwe) r4
            java.util.WeakHashMap r5 = defpackage.zmf.a
            boolean r5 = r10.isAttachedToWindow()
            if (r5 == 0) goto L_0x0049
            y7f r5 = defpackage.mqd.k(r10)
            if (r5 == 0) goto L_0x0049
            java.lang.Object r5 = r5.b
            android.view.ViewOverlay r5 = (android.view.ViewOverlay) r5
            r5.remove(r4)
            android.view.ViewGroup r5 = defpackage.mqd.j(r10)
            if (r5 != 0) goto L_0x0074
            r4.getClass()
            goto L_0x0049
        L_0x0074:
            qq0 r4 = r4.N0
            r5.removeOnLayoutChangeListener(r4)
            goto L_0x0049
        L_0x007a:
            r2.clear()
        L_0x007d:
            int r2 = r1.size()
            java.util.ArrayList r3 = r10.g1
            int r3 = r3.size()
            if (r2 >= r3) goto L_0x01a2
            android.content.Context r2 = r10.getContext()
            int r7 = r10.y0
            uwe r9 = new uwe
            r9.<init>(r2, r7)
            int[] r5 = defpackage.z2c.Tooltip
            int[] r8 = new int[r0]
            android.content.Context r3 = r9.K0
            r4 = 0
            r6 = 0
            android.content.res.TypedArray r2 = defpackage.sre.d(r3, r4, r5, r6, r7, r8)
            android.content.Context r3 = r9.K0
            android.content.res.Resources r4 = r3.getResources()
            int r5 = defpackage.stb.mtrl_tooltip_arrowSize
            int r4 = r4.getDimensionPixelSize(r5)
            r9.U0 = r4
            int r4 = defpackage.z2c.Tooltip_showMarker
            boolean r4 = r2.getBoolean(r4, r11)
            r9.T0 = r4
            if (r4 == 0) goto L_0x00ce
            p18 r4 = r9.a
            gjd r4 = r4.a
            i8g r4 = r4.e()
            i2a r5 = r9.s()
            r4.k = r5
            gjd r4 = r4.c()
            r9.setShapeAppearanceModel(r4)
            goto L_0x00d0
        L_0x00ce:
            r9.U0 = r0
        L_0x00d0:
            int r4 = defpackage.z2c.Tooltip_android_text
            java.lang.CharSequence r4 = r2.getText(r4)
            java.lang.CharSequence r5 = r9.J0
            boolean r5 = android.text.TextUtils.equals(r5, r4)
            dpe r6 = r9.M0
            if (r5 != 0) goto L_0x00e7
            r9.J0 = r4
            r6.e = r11
            r9.invalidateSelf()
        L_0x00e7:
            int r4 = defpackage.z2c.Tooltip_android_textAppearance
            boolean r5 = r2.hasValue(r4)
            if (r5 == 0) goto L_0x00fb
            int r4 = r2.getResourceId(r4, r0)
            if (r4 == 0) goto L_0x00fb
            voe r5 = new voe
            r5.<init>(r3, r4)
            goto L_0x00fc
        L_0x00fb:
            r5 = 0
        L_0x00fc:
            if (r5 == 0) goto L_0x010e
            int r4 = defpackage.z2c.Tooltip_android_textColor
            boolean r4 = r2.hasValue(r4)
            if (r4 == 0) goto L_0x010e
            int r4 = defpackage.z2c.Tooltip_android_textColor
            android.content.res.ColorStateList r4 = defpackage.ju0.q(r3, r2, r4)
            r5.j = r4
        L_0x010e:
            r6.c(r5, r3)
            int r4 = defpackage.tsb.colorOnBackground
            java.lang.Class<uwe> r5 = defpackage.uwe.class
            java.lang.String r6 = r5.getCanonicalName()
            int r4 = defpackage.mr0.y(r4, r3, r6)
            r6 = 16842801(0x1010031, float:2.3693695E-38)
            java.lang.String r7 = r5.getCanonicalName()
            int r6 = defpackage.mr0.y(r6, r3, r7)
            r7 = 229(0xe5, float:3.21E-43)
            int r6 = defpackage.s63.i(r6, r7)
            r7 = 153(0x99, float:2.14E-43)
            int r4 = defpackage.s63.i(r4, r7)
            int r4 = defpackage.s63.g(r4, r6)
            int r6 = defpackage.z2c.Tooltip_backgroundTint
            int r4 = r2.getColor(r6, r4)
            android.content.res.ColorStateList r4 = android.content.res.ColorStateList.valueOf(r4)
            r9.l(r4)
            int r4 = defpackage.tsb.colorSurface
            java.lang.String r5 = r5.getCanonicalName()
            int r3 = defpackage.mr0.y(r4, r3, r5)
            android.content.res.ColorStateList r3 = android.content.res.ColorStateList.valueOf(r3)
            r9.n(r3)
            int r3 = defpackage.z2c.Tooltip_android_padding
            int r3 = r2.getDimensionPixelSize(r3, r0)
            r9.P0 = r3
            int r3 = defpackage.z2c.Tooltip_android_minWidth
            int r3 = r2.getDimensionPixelSize(r3, r0)
            r9.Q0 = r3
            int r3 = defpackage.z2c.Tooltip_android_minHeight
            int r3 = r2.getDimensionPixelSize(r3, r0)
            r9.R0 = r3
            int r3 = defpackage.z2c.Tooltip_android_layout_margin
            int r3 = r2.getDimensionPixelSize(r3, r0)
            r9.S0 = r3
            r2.recycle()
            r1.add(r9)
            java.util.WeakHashMap r2 = defpackage.zmf.a
            boolean r2 = r10.isAttachedToWindow()
            if (r2 == 0) goto L_0x007d
            android.view.ViewGroup r2 = defpackage.mqd.j(r10)
            if (r2 != 0) goto L_0x018c
            goto L_0x007d
        L_0x018c:
            r3 = 2
            int[] r3 = new int[r3]
            r2.getLocationOnScreen(r3)
            r3 = r3[r0]
            r9.V0 = r3
            android.graphics.Rect r3 = r9.O0
            r2.getWindowVisibleDisplayFrame(r3)
            qq0 r3 = r9.N0
            r2.addOnLayoutChangeListener(r3)
            goto L_0x007d
        L_0x01a2:
            int r2 = r1.size()
            if (r2 != r11) goto L_0x01a9
            r11 = r0
        L_0x01a9:
            java.util.Iterator r0 = r1.iterator()
        L_0x01ad:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01c2
            java.lang.Object r1 = r0.next()
            uwe r1 = (defpackage.uwe) r1
            float r2 = (float) r11
            p18 r3 = r1.a
            r3.k = r2
            r1.invalidateSelf()
            goto L_0x01ad
        L_0x01c2:
            java.util.ArrayList r11 = r10.A0
            java.util.Iterator r11 = r11.iterator()
        L_0x01c8:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x01f3
            java.lang.Object r0 = r11.next()
            kj0 r0 = (defpackage.kj0) r0
            java.util.ArrayList r1 = r10.g1
            java.util.Iterator r1 = r1.iterator()
        L_0x01da:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01c8
            java.lang.Object r2 = r1.next()
            java.lang.Float r2 = (java.lang.Float) r2
            r2.getClass()
            r2 = r0
            ru.ok.messages.settings.view.SliderWithCustomTicks r2 = (ru.ok.messages.settings.view.SliderWithCustomTicks) r2
            r2.getClass()
            r2 = r10
            usd r2 = (defpackage.usd) r2
            goto L_0x01da
        L_0x01f3:
            r10.postInvalidate()
            return
        L_0x01f7:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "At least one value must be set"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ck0.r(java.util.ArrayList):void");
    }

    public final boolean s(int i, float f) {
        this.i1 = i;
        if (((double) Math.abs(f - ((Float) this.g1.get(i)).floatValue())) < 1.0E-4d) {
            return false;
        }
        float minSeparation = getMinSeparation();
        if (this.D1 == 0) {
            if (minSeparation == 0.0f) {
                minSeparation = 0.0f;
            } else {
                float f2 = (minSeparation - ((float) this.R0)) / ((float) this.o1);
                float f3 = this.e1;
                minSeparation = z7b.f(f3, this.f1, f2, f3);
            }
        }
        if (k()) {
            minSeparation = -minSeparation;
        }
        int i2 = i + 1;
        int i3 = i - 1;
        this.g1.set(i, Float.valueOf(z04.o(f, i3 < 0 ? this.e1 : minSeparation + ((Float) this.g1.get(i3)).floatValue(), i2 >= this.g1.size() ? this.f1 : ((Float) this.g1.get(i2)).floatValue() - minSeparation)));
        Iterator it = this.A0.iterator();
        while (it.hasNext()) {
            ((Float) this.g1.get(i)).getClass();
            SliderWithCustomTicks sliderWithCustomTicks = (SliderWithCustomTicks) ((kj0) it.next());
            sliderWithCustomTicks.getClass();
            usd usd = (usd) this;
            pag.F(sliderWithCustomTicks, mi6.VIRTUAL_KEY);
        }
        AccessibilityManager accessibilityManager = this.w0;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return true;
        }
        zj0 zj0 = this.x0;
        if (zj0 == null) {
            this.x0 = new zj0(this);
        } else {
            removeCallbacks(zj0);
        }
        zj0 zj02 = this.x0;
        zj02.b = i;
        postDelayed(zj02, 200);
        return true;
    }

    public void setActiveThumbIndex(int i) {
        this.h1 = i;
    }

    public void setCustomThumbDrawablesForValues(int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            drawableArr[i] = getResources().getDrawable(iArr[i]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setLayerType(z ? 0 : 2, (Paint) null);
    }

    public abstract void setHaloRadius(int i);

    public abstract void setHaloTintList(ColorStateList colorStateList);

    public abstract void setLabelBehavior(int i);

    public void setSeparationUnit(int i) {
        this.D1 = i;
        this.q1 = true;
        postInvalidate();
    }

    public abstract void setThumbElevation(float f);

    public abstract void setThumbHeight(int i);

    public abstract void setThumbStrokeColor(ColorStateList colorStateList);

    public abstract void setThumbStrokeWidth(float f);

    public abstract void setThumbTrackGapSize(int i);

    public abstract void setThumbWidth(int i);

    public abstract void setTickActiveRadius(int i);

    public abstract void setTickActiveTintList(ColorStateList colorStateList);

    public abstract void setTickInactiveRadius(int i);

    public abstract void setTickInactiveTintList(ColorStateList colorStateList);

    public abstract void setTrackActiveTintList(ColorStateList colorStateList);

    public abstract void setTrackHeight(int i);

    public abstract void setTrackInactiveTintList(ColorStateList colorStateList);

    public abstract void setTrackInsideCornerSize(int i);

    public abstract void setTrackStopIndicatorSize(int i);

    public void setValues(Float... fArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        r(arrayList);
    }

    public final void t() {
        double d;
        float f = this.C1;
        float f2 = this.j1;
        if (f2 > 0.0f) {
            int i = (int) ((this.f1 - this.e1) / f2);
            d = ((double) Math.round(f * ((float) i))) / ((double) i);
        } else {
            d = (double) f;
        }
        if (k()) {
            d = 1.0d - d;
        }
        float f3 = this.f1;
        float f4 = this.e1;
        s(this.h1, (float) ((d * ((double) (f3 - f4))) + ((double) f4)));
    }

    public final void u(int i, Rect rect) {
        int o2 = this.R0 + ((int) (o(getValues().get(i).floatValue()) * ((float) this.o1)));
        int b2 = b();
        int max = Math.max(this.S0 / 2, this.M0 / 2);
        int max2 = Math.max(this.T0 / 2, this.M0 / 2);
        rect.set(o2 - max, b2 - max2, o2 + max, b2 + max2);
    }

    public final void v() {
        if (!(!(getBackground() instanceof RippleDrawable)) && getMeasuredWidth() > 0) {
            Drawable background = getBackground();
            if (background instanceof RippleDrawable) {
                int o2 = (int) ((o(((Float) this.g1.get(this.i1)).floatValue()) * ((float) this.o1)) + ((float) this.R0));
                int b2 = b();
                int i = this.U0;
                aq4.f(background, o2 - i, b2 - i, o2 + i, b2 + i);
            }
        }
    }

    public final void w() {
        int i = this.P0;
        if (i == 0 || i == 1) {
            if (this.h1 == -1 || !isEnabled()) {
                f();
            } else {
                e();
            }
        } else if (i == 2) {
            f();
        } else if (i == 3) {
            if (isEnabled()) {
                Rect rect = new Rect();
                mqd.j(this).getHitRect(rect);
                if (getLocalVisibleRect(rect)) {
                    e();
                    return;
                }
            }
            f();
        } else {
            throw new IllegalArgumentException("Unexpected labelBehavior: " + this.P0);
        }
    }

    public final void x(Canvas canvas, Paint paint, RectF rectF, int i) {
        float f;
        float f2 = ((float) this.Q0) / 2.0f;
        int s = au1.s(i);
        if (s == 1) {
            f = (float) this.Z0;
        } else if (s != 2) {
            if (s == 3) {
                f2 = (float) this.Z0;
            }
            f = f2;
        } else {
            f = f2;
            f2 = (float) this.Z0;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        Path path = this.w1;
        path.reset();
        if (rectF.width() >= f2 + f) {
            path.addRoundRect(rectF, new float[]{f2, f2, f, f, f, f, f2, f2}, Path.Direction.CW);
            canvas.drawPath(path, paint);
            return;
        }
        float min = Math.min(f2, f);
        float max = Math.max(f2, f);
        canvas.save();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        canvas.clipPath(path);
        int s2 = au1.s(i);
        RectF rectF2 = this.y1;
        if (s2 == 1) {
            float f3 = rectF.left;
            rectF2.set(f3, rectF.top, (2.0f * max) + f3, rectF.bottom);
        } else if (s2 != 2) {
            rectF2.set(rectF.centerX() - max, rectF.top, rectF.centerX() + max, rectF.bottom);
        } else {
            float f4 = rectF.right;
            rectF2.set(f4 - (2.0f * max), rectF.top, f4, rectF.bottom);
        }
        canvas.drawRoundRect(rectF2, max, max, paint);
        canvas.restore();
    }

    public final void y() {
        boolean z;
        int max = Math.max(this.N0, Math.max(this.Q0 + getPaddingBottom() + getPaddingTop(), getPaddingBottom() + getPaddingTop() + this.T0));
        boolean z2 = false;
        if (max == this.O0) {
            z = false;
        } else {
            this.O0 = max;
            z = true;
        }
        int max2 = Math.max(Math.max(Math.max((this.S0 / 2) - this.H0, 0), Math.max((this.Q0 - this.I0) / 2, 0)), Math.max(Math.max(this.m1 - this.J0, 0), Math.max(this.n1 - this.K0, 0))) + this.G0;
        if (this.R0 != max2) {
            this.R0 = max2;
            WeakHashMap weakHashMap = zmf.a;
            if (isLaidOut()) {
                this.o1 = Math.max(getWidth() - (this.R0 * 2), 0);
                l();
            }
            z2 = true;
        }
        if (z) {
            requestLayout();
        } else if (z2) {
            postInvalidate();
        }
    }

    public final void z() {
        if (this.q1) {
            float f = this.e1;
            float f2 = this.f1;
            if (f >= f2) {
                float f3 = this.e1;
                float f4 = this.f1;
                throw new IllegalStateException("valueFrom(" + f3 + ") must be smaller than valueTo(" + f4 + ")");
            } else if (f2 <= f) {
                float f5 = this.f1;
                float f6 = this.e1;
                throw new IllegalStateException("valueTo(" + f5 + ") must be greater than valueFrom(" + f6 + ")");
            } else if (this.j1 <= 0.0f || A(f2)) {
                Iterator it = this.g1.iterator();
                while (it.hasNext()) {
                    Float f7 = (Float) it.next();
                    if (f7.floatValue() < this.e1 || f7.floatValue() > this.f1) {
                        float f8 = this.e1;
                        float f9 = this.f1;
                        throw new IllegalStateException("Slider value(" + f7 + ") must be greater or equal to valueFrom(" + f8 + "), and lower or equal to valueTo(" + f9 + ")");
                    } else if (this.j1 > 0.0f && !A(f7.floatValue())) {
                        float f10 = this.e1;
                        float f11 = this.j1;
                        throw new IllegalStateException("Value(" + f7 + ") must be equal to valueFrom(" + f10 + ") plus a multiple of stepSize(" + f11 + ") when using stepSize(" + f11 + ")");
                    }
                }
                float minSeparation = getMinSeparation();
                if (minSeparation >= 0.0f) {
                    float f12 = this.j1;
                    if (f12 > 0.0f && minSeparation > 0.0f) {
                        if (this.D1 != 1) {
                            float f13 = this.j1;
                            throw new IllegalStateException("minSeparation(" + minSeparation + ") cannot be set as a dimension when using stepSize(" + f13 + ")");
                        } else if (minSeparation < f12 || !i((double) minSeparation)) {
                            float f14 = this.j1;
                            throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal and a multiple of stepSize(" + f14 + ") when using stepSize(" + f14 + ")");
                        }
                    }
                    this.q1 = false;
                    return;
                }
                throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal to 0");
            } else {
                float f15 = this.j1;
                float f16 = this.e1;
                float f17 = this.f1;
                throw new IllegalStateException("The stepSize(" + f15 + ") must be 0, or a factor of the valueFrom(" + f16 + ")-valueTo(" + f17 + ") range");
            }
        }
    }

    public void setValues(List<Float> list) {
        r(new ArrayList(list));
    }

    public void setCustomThumbDrawablesForValues(Drawable... drawableArr) {
        this.A1 = null;
        this.B1 = new ArrayList();
        for (Drawable mutate : drawableArr) {
            List list = this.B1;
            Drawable newDrawable = mutate.mutate().getConstantState().newDrawable();
            a(newDrawable);
            list.add(newDrawable);
        }
        postInvalidate();
    }
}
