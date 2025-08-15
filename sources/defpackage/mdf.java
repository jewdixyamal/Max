package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: mdf  reason: default package */
public final class mdf extends View {
    public static final /* synthetic */ bc7[] D0;
    public static final TextPaint E0 = new TextPaint();
    public Layout A0;
    public final je7 B0;
    public final ldf C0;
    public final fe7 a = ((fe7) o19.a.getAccessor().c(fe7.class));
    public final float b = (fk4.d().getDisplayMetrics().density * 4.0f);
    public final int c;
    public final int o;
    public final int s0;
    public final float t0;
    public final je7 u0;
    public final int v0;
    public final ldf w0;
    public final ldf x0;
    public final ldf y0;
    public Drawable z0;

    static {
        Class<mdf> cls = mdf.class;
        D0 = new bc7[]{new oi9(cls, "isBackgroundEnabled", "isBackgroundEnabled()Z"), rh4.g(nec.a, cls, "isCapsuleInside", "isCapsuleInside()Z"), new oi9(cls, "isDrawableEnabled", "isDrawableEnabled()Z"), new oi9(cls, "text", "getText()Ljava/lang/CharSequence;")};
    }

    public mdf(Context context) {
        super(context);
        int G = tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
        this.c = G;
        this.o = tu0.G(((float) 6) * fk4.d().getDisplayMetrics().density);
        this.s0 = tu0.G(((float) 3) * fk4.d().getDisplayMetrics().density);
        this.t0 = fk4.d().getDisplayMetrics().density * 10.0f;
        this.u0 = tu0.r(3, new bse(9));
        this.v0 = qp4.u0.j(this).a().s().g.a;
        this.w0 = new ldf(this, 1);
        this.x0 = new ldf(this, 2);
        ldf ldf = new ldf(this, 3);
        this.y0 = ldf;
        this.B0 = tu0.r(3, new bse(10));
        this.C0 = new ldf(this, 0);
        setId(mda.P);
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        setTranslationZ(Float.MAX_VALUE);
        TextPaint textPaint = E0;
        textPaint.setAntiAlias(true);
        kqe kqe = os2.c;
        textPaint.setTextSize(ck4.c(kqe.g(du4.b), context));
        textPaint.setLetterSpacing(ck4.c(kqe.e, context));
        textPaint.setTypeface(Typeface.create(Typeface.create(kqe.f, 0), rh4.b(kqe.g)));
        setWillNotDraw(false);
        bc7 bc7 = D0[2];
        if (((Boolean) ldf.b).booleanValue()) {
            Drawable b2 = kt3.b(getContext(), woc.l2);
            b2.setBounds(0, 0, G, G);
            b2.setTint(getDrawableColor());
            this.z0 = b2;
        }
    }

    private final int getBackgroundColor() {
        bc7 bc7 = D0[1];
        boolean booleanValue = ((Boolean) this.x0.b).booleanValue();
        pq9 pq9 = qp4.u0;
        return booleanValue ? pq9.j(this).a().s().b.f : pq9.j(this).a().s().b.g;
    }

    /* access modifiers changed from: private */
    public final int getDrawableColor() {
        qp4.u0.j(this).a().s().c.getClass();
        return -1;
    }

    /* access modifiers changed from: private */
    public final BoringLayout.Metrics getMetrics() {
        return (BoringLayout.Metrics) this.B0.getValue();
    }

    private final CharSequence getText() {
        bc7 bc7 = D0[3];
        return (CharSequence) this.C0.b;
    }

    private final void setText(CharSequence charSequence) {
        this.C0.o1(this, D0[3], charSequence);
    }

    /* JADX INFO: finally extract failed */
    public final void onDraw(Canvas canvas) {
        Layout layout = this.A0;
        if (layout != null) {
            layout.getPaint().setColor(this.v0);
            float height = ((float) (getHeight() - layout.getHeight())) * 0.5f;
            bc7 bc7 = D0[0];
            float f = 0.0f;
            if (((Boolean) this.w0.b).booleanValue()) {
                f = 0.0f + ((float) this.o);
                je7 je7 = this.u0;
                ((Paint) je7.getValue()).setColor(getBackgroundColor());
                float f2 = this.t0;
                canvas.drawRoundRect(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), f2, f2, (Paint) je7.getValue());
            }
            boolean K = c54.K(this);
            float f3 = this.b;
            if (K) {
                int save = canvas.save();
                canvas.translate(f, height);
                try {
                    layout.draw(canvas);
                    canvas.restoreToCount(save);
                    Drawable drawable = this.z0;
                    if (drawable != null) {
                        int save2 = canvas.save();
                        canvas.translate(f + ((float) layout.getWidth()) + f3, ((float) (getHeight() - drawable.getBounds().height())) * 0.5f);
                        try {
                            drawable.draw(canvas);
                        } finally {
                            canvas.restoreToCount(save2);
                        }
                    }
                } catch (Throwable th) {
                    canvas.restoreToCount(save);
                    throw th;
                }
            } else {
                Drawable drawable2 = this.z0;
                if (drawable2 != null) {
                    int save3 = canvas.save();
                    canvas.translate(f, ((float) (getHeight() - drawable2.getBounds().height())) * 0.5f);
                    try {
                        drawable2.draw(canvas);
                        canvas.restoreToCount(save3);
                        f += ((float) drawable2.getBounds().width()) + f3;
                    } catch (Throwable th2) {
                        canvas.restoreToCount(save3);
                        throw th2;
                    }
                }
                int save4 = canvas.save();
                canvas.translate(f, height);
                try {
                    layout.draw(canvas);
                } finally {
                    canvas.restoreToCount(save4);
                }
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        Layout layout = this.A0;
        if (layout != null) {
            i4 = layout.getWidth();
            i3 = layout.getHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        Drawable drawable = this.z0;
        if (drawable != null) {
            i4 += drawable.getBounds().width() + tu0.G(this.b);
            i3 = Math.max(i3, drawable.getBounds().height());
        }
        bc7 bc7 = D0[0];
        if (((Boolean) this.w0.b).booleanValue()) {
            i4 += this.o * 2;
            i3 += this.s0 * 2;
        }
        setMeasuredDimension(i4, i3);
    }

    public final void setBackgroundEnabled(boolean z) {
        this.w0.o1(this, D0[0], Boolean.valueOf(z));
    }

    public final void setCapsuleInside(boolean z) {
        this.x0.o1(this, D0[1], Boolean.valueOf(z));
    }

    public final void setContent(CharSequence charSequence) {
        setText(charSequence);
    }

    public final void setDrawableEnabled(boolean z) {
        this.y0.o1(this, D0[2], Boolean.valueOf(z));
    }
}
