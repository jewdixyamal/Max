package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.WeakHashMap;

/* renamed from: bg0  reason: default package */
public final class bg0 extends Drawable implements cpe {
    public static final int y0 = m2c.Widget_MaterialComponents_Badge;
    public static final int z0 = tsb.badgeStyle;
    public final dg0 X;
    public float Y;
    public float Z;
    public final WeakReference a;
    public final q18 b;
    public final dpe c;
    public final Rect o = new Rect();
    public final int s0;
    public float t0;
    public float u0;
    public float v0;
    public WeakReference w0;
    public WeakReference x0;

    public bg0(int i, int i2, Context context) {
        voe voe;
        WeakReference weakReference = new WeakReference(context);
        this.a = weakReference;
        sre.c(context, sre.b, "Theme.MaterialComponents");
        dpe dpe = new dpe(this);
        this.c = dpe;
        TextPaint textPaint = dpe.a;
        textPaint.setTextAlign(Paint.Align.CENTER);
        dg0 dg0 = new dg0(i, i2, context);
        this.X = dg0;
        boolean e = e();
        cg0 cg0 = dg0.b;
        q18 q18 = new q18(gjd.a(context, e ? cg0.Z.intValue() : cg0.X.intValue(), e() ? cg0.s0.intValue() : cg0.Y.intValue(), new a0((float) 0)).c());
        this.b = q18;
        g();
        Context context2 = (Context) weakReference.get();
        if (!(context2 == null || dpe.g == (voe = new voe(context2, cg0.o.intValue())))) {
            dpe.c(voe, context2);
            textPaint.setColor(cg0.c.intValue());
            invalidateSelf();
            i();
            invalidateSelf();
        }
        int i3 = cg0.w0;
        if (i3 != -2) {
            this.s0 = ((int) Math.pow(10.0d, ((double) i3) - 1.0d)) - 1;
        } else {
            this.s0 = cg0.x0;
        }
        dpe.e = true;
        i();
        invalidateSelf();
        dpe.e = true;
        g();
        i();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(cg0.b.intValue());
        if (q18.a.c != valueOf) {
            q18.l(valueOf);
            invalidateSelf();
        }
        textPaint.setColor(cg0.c.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.w0;
        if (!(weakReference2 == null || weakReference2.get() == null)) {
            View view = (View) this.w0.get();
            WeakReference weakReference3 = this.x0;
            h(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
        }
        i();
        setVisible(cg0.E0.booleanValue(), false);
    }

    public final void a() {
        invalidateSelf();
    }

    public final String b() {
        dg0 dg0 = this.X;
        cg0 cg0 = dg0.b;
        String str = cg0.u0;
        boolean z = str != null;
        WeakReference weakReference = this.a;
        if (z) {
            int i = cg0.w0;
            if (i == -2 || str == null || str.length() <= i) {
                return str;
            }
            Context context = (Context) weakReference.get();
            if (context == null) {
                return "";
            }
            return String.format(context.getString(wzb.m3_exceed_max_badge_text_suffix), new Object[]{str.substring(0, i - 1), "…"});
        } else if (!f()) {
            return null;
        } else {
            int i2 = this.s0;
            cg0 cg02 = dg0.b;
            if (i2 == -2 || d() <= this.s0) {
                return NumberFormat.getInstance(cg02.y0).format((long) d());
            }
            Context context2 = (Context) weakReference.get();
            return context2 == null ? "" : String.format(cg02.y0, context2.getString(wzb.mtrl_exceed_max_badge_number_suffix), new Object[]{Integer.valueOf(this.s0), "+"});
        }
    }

    public final FrameLayout c() {
        WeakReference weakReference = this.x0;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    public final int d() {
        int i = this.X.b.v0;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    public final void draw(Canvas canvas) {
        String b2;
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.b.draw(canvas);
            if (e() && (b2 = b()) != null) {
                Rect rect = new Rect();
                dpe dpe = this.c;
                dpe.a.getTextBounds(b2, 0, b2.length(), rect);
                float exactCenterY = this.Z - rect.exactCenterY();
                canvas.drawText(b2, this.Y, (float) (rect.bottom <= 0 ? (int) exactCenterY : Math.round(exactCenterY)), dpe.a);
            }
        }
    }

    public final boolean e() {
        return this.X.b.u0 != null || f();
    }

    public final boolean f() {
        cg0 cg0 = this.X.b;
        return cg0.u0 == null && cg0.v0 != -1;
    }

    public final void g() {
        Context context = (Context) this.a.get();
        if (context != null) {
            boolean e = e();
            dg0 dg0 = this.X;
            this.b.setShapeAppearanceModel(gjd.a(context, e ? dg0.b.Z.intValue() : dg0.b.X.intValue(), e() ? dg0.b.s0.intValue() : dg0.b.Y.intValue(), new a0((float) 0)).c());
            invalidateSelf();
        }
    }

    public final int getAlpha() {
        return this.X.b.t0;
    }

    public final int getIntrinsicHeight() {
        return this.o.height();
    }

    public final int getIntrinsicWidth() {
        return this.o.width();
    }

    public final int getOpacity() {
        return -3;
    }

    public final void h(View view, FrameLayout frameLayout) {
        this.w0 = new WeakReference(view);
        this.x0 = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        i();
        invalidateSelf();
    }

    public final void i() {
        float f;
        float f2;
        float f3;
        WeakReference weakReference = this.a;
        Context context = (Context) weakReference.get();
        WeakReference weakReference2 = this.w0;
        ViewGroup viewGroup = null;
        View view = weakReference2 != null ? (View) weakReference2.get() : null;
        if (context != null && view != null) {
            Rect rect = new Rect();
            Rect rect2 = this.o;
            rect.set(rect2);
            Rect rect3 = new Rect();
            view.getDrawingRect(rect3);
            WeakReference weakReference3 = this.x0;
            if (weakReference3 != null) {
                viewGroup = (ViewGroup) weakReference3.get();
            }
            if (viewGroup != null) {
                viewGroup.offsetDescendantRectToMyCoords(view, rect3);
            }
            boolean e = e();
            dg0 dg0 = this.X;
            float f4 = e ? dg0.d : dg0.c;
            this.t0 = f4;
            if (f4 != -1.0f) {
                this.u0 = f4;
                this.v0 = f4;
            } else {
                this.u0 = (float) Math.round((e() ? dg0.g : dg0.e) / 2.0f);
                this.v0 = (float) Math.round((e() ? dg0.h : dg0.f) / 2.0f);
            }
            if (e()) {
                String b2 = b();
                float f5 = this.u0;
                dpe dpe = this.c;
                this.u0 = Math.max(f5, (dpe.a(b2) / 2.0f) + ((float) dg0.b.F0.intValue()));
                float f6 = this.v0;
                if (!dpe.e) {
                    f3 = dpe.d;
                } else {
                    dpe.b(b2);
                    f3 = dpe.d;
                }
                float max = Math.max(f6, (f3 / 2.0f) + ((float) dg0.b.G0.intValue()));
                this.v0 = max;
                this.u0 = Math.max(this.u0, max);
            }
            int intValue = dg0.b.I0.intValue();
            boolean e2 = e();
            cg0 cg0 = dg0.b;
            if (e2) {
                intValue = cg0.K0.intValue();
                Context context2 = (Context) weakReference.get();
                if (context2 != null) {
                    intValue = og.c(intValue, og.b(0.0f, 1.0f, 0.3f, 1.0f, context2.getResources().getConfiguration().fontScale - 1.0f), intValue - cg0.N0.intValue());
                }
            }
            int i = dg0.k;
            if (i == 0) {
                intValue -= Math.round(this.v0);
            }
            int intValue2 = cg0.M0.intValue() + intValue;
            int intValue3 = cg0.D0.intValue();
            if (intValue3 == 8388691 || intValue3 == 8388693) {
                this.Z = (float) (rect3.bottom - intValue2);
            } else {
                this.Z = (float) (rect3.top + intValue2);
            }
            int intValue4 = e() ? cg0.J0.intValue() : cg0.H0.intValue();
            if (i == 1) {
                intValue4 += e() ? dg0.j : dg0.i;
            }
            int intValue5 = cg0.L0.intValue() + intValue4;
            int intValue6 = cg0.D0.intValue();
            if (intValue6 == 8388659 || intValue6 == 8388691) {
                WeakHashMap weakHashMap = zmf.a;
                this.Y = view.getLayoutDirection() == 0 ? (((float) rect3.left) - this.u0) + ((float) intValue5) : (((float) rect3.right) + this.u0) - ((float) intValue5);
            } else {
                WeakHashMap weakHashMap2 = zmf.a;
                this.Y = view.getLayoutDirection() == 0 ? (((float) rect3.right) + this.u0) - ((float) intValue5) : (((float) rect3.left) - this.u0) + ((float) intValue5);
            }
            if (cg0.O0.booleanValue()) {
                View c2 = c();
                if (c2 != null) {
                    FrameLayout c3 = c();
                    if (c3 == null || c3.getId() != ivb.mtrl_anchor_parent) {
                        f2 = 0.0f;
                        f = 0.0f;
                    } else if (c2.getParent() instanceof View) {
                        f2 = c2.getY();
                        f = c2.getX();
                        c2 = (View) c2.getParent();
                    }
                } else if (view.getParent() instanceof View) {
                    float y = view.getY();
                    f = view.getX();
                    View view2 = (View) view.getParent();
                    f2 = y;
                    c2 = view2;
                }
                float y2 = c2.getY() + (this.Z - this.v0) + f2;
                float x = c2.getX() + (this.Y - this.u0) + f;
                float height = c2.getParent() instanceof View ? ((this.Z + this.v0) - (((float) ((View) c2.getParent()).getHeight()) - c2.getY())) + f2 : 0.0f;
                float width = c2.getParent() instanceof View ? ((this.Y + this.u0) - (((float) ((View) c2.getParent()).getWidth()) - c2.getX())) + f : 0.0f;
                if (y2 < 0.0f) {
                    this.Z = Math.abs(y2) + this.Z;
                }
                if (x < 0.0f) {
                    this.Y = Math.abs(x) + this.Y;
                }
                if (height > 0.0f) {
                    this.Z -= Math.abs(height);
                }
                if (width > 0.0f) {
                    this.Y -= Math.abs(width);
                }
            }
            float f7 = this.Y;
            float f8 = this.Z;
            float f9 = this.u0;
            float f10 = this.v0;
            rect2.set((int) (f7 - f9), (int) (f8 - f10), (int) (f7 + f9), (int) (f8 + f10));
            float f11 = this.t0;
            int i2 = (f11 > -1.0f ? 1 : (f11 == -1.0f ? 0 : -1));
            q18 q18 = this.b;
            if (i2 != 0) {
                i8g e3 = q18.a.a.e();
                e3.e = new a0(f11);
                e3.f = new a0(f11);
                e3.g = new a0(f11);
                e3.h = new a0(f11);
                q18.setShapeAppearanceModel(e3.c());
            }
            if (!rect.equals(rect2)) {
                q18.setBounds(rect2);
            }
        }
    }

    public final boolean isStateful() {
        return false;
    }

    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public final void setAlpha(int i) {
        dg0 dg0 = this.X;
        dg0.a.t0 = i;
        dg0.b.t0 = i;
        this.c.a.setAlpha(getAlpha());
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
