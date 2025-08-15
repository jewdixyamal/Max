package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import java.util.BitSet;
import java.util.Objects;

/* renamed from: q18  reason: default package */
public class q18 extends Drawable implements rjd {
    public static final Paint I0;
    public final ejd A0;
    public final ey1 B0;
    public final vk8 C0;
    public PorterDuffColorFilter D0;
    public PorterDuffColorFilter E0;
    public int F0;
    public final RectF G0;
    public final boolean H0;
    public boolean X;
    public final Matrix Y;
    public final Path Z;
    public p18 a;
    public final ojd[] b;
    public final ojd[] c;
    public final BitSet o;
    public final Path s0;
    public final RectF t0;
    public final RectF u0;
    public final Region v0;
    public final Region w0;
    public gjd x0;
    public final Paint y0;
    public final Paint z0;

    static {
        Paint paint = new Paint(1);
        I0 = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public q18() {
        this(new gjd());
    }

    public void a() {
        invalidateSelf();
    }

    public final void b(RectF rectF, Path path) {
        p18 p18 = this.a;
        this.C0.d(p18.a, p18.j, rectF, this.B0, path);
        if (this.a.i != 1.0f) {
            Matrix matrix = this.Y;
            matrix.reset();
            float f = this.a.i;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.G0, true);
    }

    public final PorterDuffColorFilter c(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        if (colorStateList == null || mode == null) {
            if (z) {
                int color = paint.getColor();
                int d = d(color);
                this.F0 = d;
                if (d != color) {
                    return new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN);
                }
            }
            return null;
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = d(colorForState);
        }
        this.F0 = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    public final int d(int i) {
        p18 p18 = this.a;
        float f = p18.n + p18.o + p18.m;
        ew4 ew4 = p18.b;
        return ew4 != null ? ew4.a(i, f) : i;
    }

    public void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        Paint paint = this.y0;
        paint.setColorFilter(this.D0);
        int alpha = paint.getAlpha();
        int i = this.a.l;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.z0;
        paint2.setColorFilter(this.E0);
        paint2.setStrokeWidth(this.a.k);
        int alpha2 = paint2.getAlpha();
        int i2 = this.a.l;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z = this.X;
        Path path = this.Z;
        if (z) {
            float f = 0.0f;
            float f2 = -(i() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            gjd gjd = this.a.a;
            i8g e = gjd.e();
            hx3 hx3 = gjd.e;
            if (!(hx3 instanceof nfc)) {
                hx3 = new z9(f2, hx3);
            }
            e.e = hx3;
            hx3 hx32 = gjd.f;
            if (!(hx32 instanceof nfc)) {
                hx32 = new z9(f2, hx32);
            }
            e.f = hx32;
            hx3 hx33 = gjd.h;
            if (!(hx33 instanceof nfc)) {
                hx33 = new z9(f2, hx33);
            }
            e.h = hx33;
            hx3 hx34 = gjd.g;
            if (!(hx34 instanceof nfc)) {
                hx34 = new z9(f2, hx34);
            }
            e.g = hx34;
            gjd c2 = e.c();
            this.x0 = c2;
            float f3 = this.a.j;
            RectF rectF = this.u0;
            rectF.set(h());
            if (i()) {
                f = paint2.getStrokeWidth() / 2.0f;
            }
            rectF.inset(f, f);
            this.C0.d(c2, f3, rectF, (ey1) null, this.s0);
            b(h(), path);
            this.X = false;
        }
        p18 p18 = this.a;
        int i3 = p18.p;
        if (i3 != 1 && p18.q > 0) {
            if (i3 == 2) {
                canvas.save();
                p18 p182 = this.a;
                double sin = Math.sin(Math.toRadians((double) p182.s));
                p18 p183 = this.a;
                canvas2.translate((float) ((int) (sin * ((double) p182.r))), (float) ((int) (Math.cos(Math.toRadians((double) p183.s)) * ((double) p183.r))));
                if (!this.H0) {
                    e(canvas);
                    canvas.restore();
                } else {
                    RectF rectF2 = this.G0;
                    int width = (int) (rectF2.width() - ((float) getBounds().width()));
                    int height = (int) (rectF2.height() - ((float) getBounds().height()));
                    if (width < 0 || height < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap createBitmap = Bitmap.createBitmap((this.a.q * 2) + ((int) rectF2.width()) + width, (this.a.q * 2) + ((int) rectF2.height()) + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas3 = new Canvas(createBitmap);
                    float f4 = (float) ((getBounds().left - this.a.q) - width);
                    float f5 = (float) ((getBounds().top - this.a.q) - height);
                    canvas3.translate(-f4, -f5);
                    e(canvas3);
                    canvas2.drawBitmap(createBitmap, f4, f5, (Paint) null);
                    createBitmap.recycle();
                    canvas.restore();
                }
            } else if (!p18.a.d(h())) {
                path.isConvex();
            }
        }
        p18 p184 = this.a;
        Paint.Style style = p184.u;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            f(canvas, paint, path, p184.a, h());
        }
        if (i()) {
            g(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public final void e(Canvas canvas) {
        this.o.cardinality();
        int i = this.a.r;
        Path path = this.Z;
        ejd ejd = this.A0;
        if (i != 0) {
            canvas.drawPath(path, ejd.a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            ojd ojd = this.b[i2];
            int i3 = this.a.q;
            Matrix matrix = ojd.b;
            ojd.a(matrix, ejd, i3, canvas);
            this.c[i2].a(matrix, ejd, this.a.q, canvas);
        }
        if (this.H0) {
            p18 p18 = this.a;
            int sin = (int) (Math.sin(Math.toRadians((double) p18.s)) * ((double) p18.r));
            p18 p182 = this.a;
            int cos = (int) (Math.cos(Math.toRadians((double) p182.s)) * ((double) p182.r));
            canvas.translate((float) (-sin), (float) (-cos));
            canvas.drawPath(path, I0);
            canvas.translate((float) sin, (float) cos);
        }
    }

    public final void f(Canvas canvas, Paint paint, Path path, gjd gjd, RectF rectF) {
        if (gjd.d(rectF)) {
            float a2 = gjd.f.a(rectF) * this.a.j;
            canvas.drawRoundRect(rectF, a2, a2, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    public void g(Canvas canvas) {
        Paint paint = this.z0;
        Path path = this.s0;
        gjd gjd = this.x0;
        RectF rectF = this.u0;
        rectF.set(h());
        float strokeWidth = i() ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        f(canvas, paint, path, gjd, rectF);
    }

    public int getAlpha() {
        return this.a.l;
    }

    public final Drawable.ConstantState getConstantState() {
        return this.a;
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        p18 p18 = this.a;
        if (p18.p != 2) {
            if (p18.a.d(h())) {
                outline.setRoundRect(getBounds(), this.a.a.e.a(h()) * this.a.j);
                return;
            }
            RectF h = h();
            Path path = this.Z;
            b(h, path);
            if (Build.VERSION.SDK_INT >= 30) {
                gq4.a(outline, path);
                return;
            }
            try {
                fq4.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.a.h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.v0;
        region.set(bounds);
        RectF h = h();
        Path path = this.Z;
        b(h, path);
        Region region2 = this.w0;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final RectF h() {
        RectF rectF = this.t0;
        rectF.set(getBounds());
        return rectF;
    }

    public final boolean i() {
        Paint.Style style = this.a.u;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.z0.getStrokeWidth() > 0.0f;
    }

    public final void invalidateSelf() {
        this.X = true;
        super.invalidateSelf();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = r1.a.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r1 = r1.a.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.a.f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r1.a.e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0039
            p18 r0 = r1.a
            android.content.res.ColorStateList r0 = r0.f
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x0012:
            p18 r0 = r1.a
            android.content.res.ColorStateList r0 = r0.e
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x001e:
            p18 r0 = r1.a
            android.content.res.ColorStateList r0 = r0.d
            if (r0 == 0) goto L_0x002a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x002a:
            p18 r1 = r1.a
            android.content.res.ColorStateList r1 = r1.c
            if (r1 == 0) goto L_0x0037
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r1 = 0
            goto L_0x003a
        L_0x0039:
            r1 = 1
        L_0x003a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q18.isStateful():boolean");
    }

    public final void j(Context context) {
        this.a.b = new ew4(context);
        q();
    }

    public final void k(float f) {
        p18 p18 = this.a;
        if (p18.n != f) {
            p18.n = f;
            q();
        }
    }

    public final void l(ColorStateList colorStateList) {
        p18 p18 = this.a;
        if (p18.c != colorStateList) {
            p18.c = colorStateList;
            onStateChange(getState());
        }
    }

    public final void m() {
        p18 p18 = this.a;
        if (p18.p != 2) {
            p18.p = 2;
            super.invalidateSelf();
        }
    }

    public Drawable mutate() {
        this.a = new p18(this.a);
        return this;
    }

    public final void n(ColorStateList colorStateList) {
        p18 p18 = this.a;
        if (p18.d != colorStateList) {
            p18.d = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean o(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.a.c == null || (color2 = paint2.getColor()) == (colorForState2 = this.a.c.getColorForState(iArr, color2))) {
            z = false;
        } else {
            (paint2 = this.y0).setColor(colorForState2);
            z = true;
        }
        if (this.a.d == null || (color = paint.getColor()) == (colorForState = this.a.d.getColorForState(iArr, color))) {
            return z;
        }
        (paint = this.z0).setColor(colorForState);
        return true;
    }

    public void onBoundsChange(Rect rect) {
        this.X = true;
        super.onBoundsChange(rect);
    }

    public boolean onStateChange(int[] iArr) {
        boolean z = o(iArr) || p();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public final boolean p() {
        PorterDuffColorFilter porterDuffColorFilter = this.D0;
        PorterDuffColorFilter porterDuffColorFilter2 = this.E0;
        p18 p18 = this.a;
        this.D0 = c(p18.f, p18.g, this.y0, true);
        p18 p182 = this.a;
        this.E0 = c(p182.e, p182.g, this.z0, false);
        p18 p183 = this.a;
        if (p183.t) {
            int colorForState = p183.f.getColorForState(getState(), 0);
            ejd ejd = this.A0;
            ejd.getClass();
            ejd.d = s63.i(colorForState, 68);
            ejd.e = s63.i(colorForState, 20);
            ejd.f = s63.i(colorForState, 0);
            ejd.a.setColor(ejd.d);
        }
        return !Objects.equals(porterDuffColorFilter, this.D0) || !Objects.equals(porterDuffColorFilter2, this.E0);
    }

    public final void q() {
        p18 p18 = this.a;
        float f = p18.n + p18.o;
        p18.q = (int) Math.ceil((double) (0.75f * f));
        this.a.r = (int) Math.ceil((double) (f * 0.25f));
        p();
        super.invalidateSelf();
    }

    public void setAlpha(int i) {
        p18 p18 = this.a;
        if (p18.l != i) {
            p18.l = i;
            super.invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.a.getClass();
        super.invalidateSelf();
    }

    public final void setShapeAppearanceModel(gjd gjd) {
        this.a.a = gjd;
        invalidateSelf();
    }

    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.a.f = colorStateList;
        p();
        super.invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        p18 p18 = this.a;
        if (p18.g != mode) {
            p18.g = mode;
            p();
            super.invalidateSelf();
        }
    }

    public q18(Context context, AttributeSet attributeSet, int i, int i2) {
        this(gjd.b(context, attributeSet, i, i2).c());
    }

    public q18(gjd gjd) {
        this(new p18(gjd));
    }

    public q18(p18 p18) {
        vk8 vk8;
        this.b = new ojd[4];
        this.c = new ojd[4];
        this.o = new BitSet(8);
        this.Y = new Matrix();
        this.Z = new Path();
        this.s0 = new Path();
        this.t0 = new RectF();
        this.u0 = new RectF();
        this.v0 = new Region();
        this.w0 = new Region();
        Paint paint = new Paint(1);
        this.y0 = paint;
        Paint paint2 = new Paint(1);
        this.z0 = paint2;
        this.A0 = new ejd();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            vk8 = hjd.a;
        } else {
            vk8 = new vk8();
        }
        this.C0 = vk8;
        this.G0 = new RectF();
        this.H0 = true;
        this.a = p18;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        p();
        o(getState());
        this.B0 = new ey1(20, this);
    }
}
