package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import java.util.EnumMap;
import one.me.sdk.richvector.VectorPath;

/* renamed from: ph5  reason: default package */
public final class ph5 extends Drawable implements kre {
    public final TextPaint X;
    public final je7 Y;
    public final BoringLayout.Metrics Z;
    public final Context a;
    public final oh5 b;
    public uf5 c;
    public final RectF o;
    public BoringLayout s0;
    public final float t0;
    public float u0;

    public /* synthetic */ ph5(Context context) {
        this(context, new oh5(context));
    }

    public final void a(uf5 uf5) {
        if (!tpa.f(this.c, uf5)) {
            this.c = uf5;
            onThemeChanged(qp4.u0.b(this.a).i());
            onBoundsChange(getBounds());
            invalidateSelf();
        }
    }

    /* JADX INFO: finally extract failed */
    public final void draw(Canvas canvas) {
        float f = fk4.d().getDisplayMetrics().density * 6.0f * this.u0;
        float f2 = fk4.d().getDisplayMetrics().density * 2.0f * this.u0;
        int save = canvas.save();
        canvas.translate(f, f2);
        try {
            this.b.draw(canvas);
            canvas.restoreToCount(save);
            float f3 = fk4.d().getDisplayMetrics().density * 4.0f * this.u0;
            RectF rectF = this.o;
            je7 je7 = this.Y;
            canvas.drawRoundRect(rectF, f3, f3, (Paint) je7.getValue());
            BoringLayout boringLayout = this.s0;
            if (boringLayout != null) {
                float f4 = z7b.f(rectF.width(), (float) boringLayout.getWidth(), 0.5f, rectF.left);
                float f5 = z7b.f(rectF.height(), (float) boringLayout.getHeight(), 0.5f, rectF.top);
                int save2 = canvas.save();
                canvas.translate(f4, f5);
                try {
                    boringLayout.getPaint().setAlpha(((Paint) je7.getValue()).getAlpha());
                    boringLayout.draw(canvas);
                } finally {
                    canvas.restoreToCount(save2);
                }
            }
        } catch (Throwable th) {
            canvas.restoreToCount(save);
            throw th;
        }
    }

    public final int getOpacity() {
        return 0;
    }

    public final void invalidateSelf() {
        oh5 oh5 = this.b;
        if (oh5.getCallback() != getCallback()) {
            oh5.setCallback(getCallback());
        }
        oh5.invalidateSelf();
        super.invalidateSelf();
    }

    public final void onBoundsChange(Rect rect) {
        int width = rect.width();
        if (width != 0) {
            float f = (float) width;
            this.u0 = f / ((float) tu0.G(((float) 40) * fk4.d().getDisplayMetrics().density));
            uf5 uf5 = this.c;
            if (uf5 != null) {
                this.b.setBounds(0, 0, tu0.G(((float) tu0.G(((float) 28) * fk4.d().getDisplayMetrics().density)) * this.u0), tu0.G(((float) tu0.G(((float) 36) * fk4.d().getDisplayMetrics().density)) * this.u0));
                RectF rectF = this.o;
                rectF.set(fk4.d().getDisplayMetrics().density * 4.0f * this.u0, fk4.d().getDisplayMetrics().density * 18.0f * this.u0, f - ((fk4.d().getDisplayMetrics().density * 4.0f) * this.u0), f - ((fk4.d().getDisplayMetrics().density * 8.0f) * this.u0));
                TextPaint textPaint = this.X;
                try {
                    textPaint.setTextSize(this.t0 * fk4.d().getDisplayMetrics().density * this.u0);
                    BoringLayout.Metrics metrics = this.Z;
                    textPaint.getFontMetricsInt(metrics);
                    this.s0 = BoringLayout.make(uf5.a(), textPaint, tu0.G(rectF.width()), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, metrics, false);
                } catch (Throwable th) {
                    this.s0 = null;
                    String name = ph5.class.getName();
                    String a2 = uf5.a();
                    hm9.p(name, "fail to generate boring layout for " + a2, th);
                }
            }
        }
    }

    public final void onThemeChanged(fka fka) {
        uf5 uf5 = this.c;
        if (uf5 != null) {
            int i = fka.a().s().b.b.e;
            int c2 = fka.a().c(uf5.b().b);
            int c3 = fka.a().c(uf5.b().c);
            oh5 oh5 = this.b;
            VectorPath vectorPath = (VectorPath) oh5.a.getValue();
            if (vectorPath != null) {
                vectorPath.setFillColor(i);
            }
            VectorPath vectorPath2 = (VectorPath) oh5.b.getValue();
            if (vectorPath2 != null) {
                vectorPath2.setFillColor(c2);
            }
            VectorPath vectorPath3 = (VectorPath) oh5.c.getValue();
            if (vectorPath3 != null) {
                vectorPath3.setFillColor(c3);
            }
            ((Paint) this.Y.getValue()).setColor(fka.a().c(uf5.b().a));
            this.X.setColor(fka.a().c(uf5.b().X));
            invalidateSelf();
        }
    }

    public final void setAlpha(int i) {
        this.b.setAlpha(i);
        ((Paint) this.Y.getValue()).setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public ph5(Context context, oh5 oh5) {
        this.a = context;
        this.b = oh5;
        this.o = new RectF();
        TextPaint textPaint = new TextPaint();
        this.X = textPaint;
        this.Y = tu0.r(3, new fh5(2));
        this.Z = new BoringLayout.Metrics();
        this.t0 = 9.0f;
        long b2 = ck4.b(1, 9.0f);
        long b3 = ck4.b(1, 14.0f);
        long b4 = ck4.b(0, 0.03f);
        String str = i4f.s.f;
        Class<du4> cls = du4.class;
        EnumMap enumMap = new EnumMap(cls);
        du4 du4 = du4.b;
        k7d.l(b2, enumMap, du4, cls).put(du4, new ck4(b3));
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        textPaint.setTypeface(Typeface.create(Typeface.create(str, 0), 500, false));
        textPaint.setLetterSpacing(ck4.d(b4, displayMetrics));
        ck4 ck4 = (ck4) enumMap.get(du4);
        textPaint.setTextSize(ck4.d((ck4 == null ? (ck4) x53.f0(enumMap.values()) : ck4).a, displayMetrics));
        textPaint.setLinearText(true);
        textPaint.setSubpixelText(true);
        textPaint.setAntiAlias(true);
        this.u0 = 1.0f;
    }
}
