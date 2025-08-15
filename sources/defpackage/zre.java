package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;

/* renamed from: zre  reason: default package */
public final class zre extends View implements kre {
    public static final /* synthetic */ bc7[] x0;
    public final xre a = new xre(qp4.u0.p(this).a, this, 0);
    public final GradientDrawable b;
    public final xre c;
    public final Paint o;
    public final Paint s0;
    public final RectF t0;
    public final RectF u0;
    public LinearGradient v0;
    public LinearGradient w0;

    static {
        Class<zre> cls = zre.class;
        x0 = new bc7[]{new oi9(cls, "themeName", "getThemeName()Ljava/lang/String;"), rh4.g(nec.a, cls, "patternDrawable", "getPatternDrawable()Landroid/graphics/drawable/Drawable;")};
    }

    public zre(Context context) {
        super(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(fk4.d().getDisplayMetrics().density * 10.0f);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.BL_TR);
        l73 l73 = getTheme().a().s().b.a;
        gradientDrawable.setColors(new int[]{l73.g, l73.h});
        this.b = gradientDrawable;
        this.c = new xre(gradientDrawable, this, 1);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(fk4.d().getDisplayMetrics().density * 1.0f);
        paint.setColor(getTheme().i().b.b);
        this.o = paint;
        this.s0 = new Paint(1);
        this.t0 = new RectF();
        this.u0 = new RectF();
        setBackground(gradientDrawable);
        setClipToOutline(true);
        setOutlineProvider(new e62(this, 5));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0018, code lost:
        r1 = r1.a(r0.b(getContext()).j());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.fka getTheme() {
        /*
            r3 = this;
            pq9 r0 = defpackage.qp4.u0
            android.content.Context r1 = r3.getContext()
            qp4 r1 = r0.b(r1)
            java.lang.String r2 = r3.getThemeName()
            java.lang.Object r1 = r1.X
            adb r1 = (defpackage.adb) r1
            sba r1 = r1.f(r2)
            if (r1 == 0) goto L_0x002a
            android.content.Context r2 = r3.getContext()
            qp4 r2 = r0.b(r2)
            boolean r2 = r2.j()
            fka r1 = r1.a(r2)
            if (r1 != 0) goto L_0x0036
        L_0x002a:
            android.content.Context r3 = r3.getContext()
            qp4 r3 = r0.b(r3)
            fka r1 = r3.i()
        L_0x0036:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zre.getTheme():fka");
    }

    public final void b() {
        float f = fk4.d().getDisplayMetrics().density * 8.0f;
        float f2 = fk4.d().getDisplayMetrics().density * 30.0f;
        float f3 = (fk4.d().getDisplayMetrics().density * 48.0f) + f;
        float f4 = (fk4.d().getDisplayMetrics().density * 24.0f) + f2;
        int[] incomingColors = getIncomingColors();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.v0 = new LinearGradient(f3, f2, f, f4, incomingColors, (float[]) null, tileMode);
        float f5 = fk4.d().getDisplayMetrics().density * 16.0f;
        this.w0 = new LinearGradient((fk4.d().getDisplayMetrics().density * 48.0f) + f5, (fk4.d().getDisplayMetrics().density * 4.0f) + f4, f5, ((float) getHeight()) - (fk4.d().getDisplayMetrics().density * 30.0f), getOutgoingColors(), (float[]) null, tileMode);
    }

    public final int[] getIncomingColors() {
        return getTheme().a().g().a.o;
    }

    public final int[] getOutgoingColors() {
        return getTheme().a().k().a.o;
    }

    public final Drawable getPatternDrawable() {
        bc7 bc7 = x0[1];
        return (Drawable) this.c.b;
    }

    public final String getThemeName() {
        bc7 bc7 = x0[0];
        return (String) this.a.b;
    }

    public final void onDraw(Canvas canvas) {
        float f = (fk4.d().getDisplayMetrics().density * 1.0f) / ((float) 2);
        canvas.drawRoundRect(f, f, ((float) getWidth()) - f, ((float) getHeight()) - f, (fk4.d().getDisplayMetrics().density * 10.0f) - f, (fk4.d().getDisplayMetrics().density * 10.0f) - f, this.o);
        RectF rectF = this.t0;
        rectF.set(fk4.d().getDisplayMetrics().density * 8.0f, fk4.d().getDisplayMetrics().density * 30.0f, (fk4.d().getDisplayMetrics().density * 48.0f) + (fk4.d().getDisplayMetrics().density * 8.0f), (fk4.d().getDisplayMetrics().density * 24.0f) + (fk4.d().getDisplayMetrics().density * 30.0f));
        Paint paint = this.s0;
        paint.setShader(this.v0);
        canvas.drawRoundRect(rectF, fk4.d().getDisplayMetrics().density * 8.0f, fk4.d().getDisplayMetrics().density * 8.0f, paint);
        RectF rectF2 = this.u0;
        rectF2.set(fk4.d().getDisplayMetrics().density * 16.0f, (fk4.d().getDisplayMetrics().density * 4.0f) + rectF.bottom, (fk4.d().getDisplayMetrics().density * 48.0f) + (fk4.d().getDisplayMetrics().density * 16.0f), ((float) getHeight()) - (fk4.d().getDisplayMetrics().density * 30.0f));
        paint.setShader(this.w0);
        canvas.drawRoundRect(rectF2, fk4.d().getDisplayMetrics().density * 8.0f, fk4.d().getDisplayMetrics().density * 8.0f, paint);
    }

    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(tu0.G(((float) 72) * fk4.d().getDisplayMetrics().density), tu0.G(((float) 112) * fk4.d().getDisplayMetrics().density));
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        b();
    }

    public final void onThemeChanged(fka fka) {
        this.o.setColor(getTheme().i().b.b);
        GradientDrawable gradientDrawable = this.b;
        l73 l73 = getTheme().a().s().b.a;
        gradientDrawable.setColors(new int[]{l73.g, l73.h});
        b();
        invalidate();
    }

    public final void setBackgroundPattern(Drawable drawable) {
        setBackground(drawable);
    }

    public final void setPatternDrawable(Drawable drawable) {
        this.c.o1(this, x0[1], drawable);
    }

    public final void setThemeName(String str) {
        this.a.o1(this, x0[0], str);
    }
}
