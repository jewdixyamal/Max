package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* renamed from: j34  reason: default package */
public final class j34 extends View implements kre {
    public static final /* synthetic */ bc7[] D0;
    public static final TextPaint E0 = new TextPaint();
    public final je7 A0 = tu0.r(3, new zf3(13));
    public final i34 B0 = new i34(this, 0);
    public final ai9 C0;
    public final float a = (fk4.d().getDisplayMetrics().density * 4.0f);
    public final int b = tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density);
    public int c;
    public final int o = tu0.G(((float) 6) * fk4.d().getDisplayMetrics().density);
    public final int s0 = tu0.G(((float) 3) * fk4.d().getDisplayMetrics().density);
    public final float t0 = (fk4.d().getDisplayMetrics().density * 10.0f);
    public final je7 u0 = tu0.r(3, new zf3(12));
    public int v0 = -1;
    public final i34 w0 = new i34(this, 1);
    public zof x0 = zof.None;
    public Drawable y0;
    public Layout z0;

    static {
        Class<j34> cls = j34.class;
        D0 = new bc7[]{new oi9(cls, "isBackgroundEnabled", "isBackgroundEnabled$message_list_release()Z"), rh4.g(nec.a, cls, "text", "getText()Ljava/lang/CharSequence;")};
    }

    public j34(Context context) {
        super(context);
        setId(mda.K);
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        setTranslationZ(Float.MAX_VALUE);
        TextPaint textPaint = E0;
        textPaint.setAntiAlias(true);
        kqe kqe = os2.c;
        textPaint.setTextSize(ck4.c(kqe.g(du4.b), context));
        textPaint.setLetterSpacing(ck4.c(kqe.e, context));
        textPaint.setTypeface(Typeface.create(Typeface.create(kqe.f, 0), rh4.b(kqe.g)));
        setWillNotDraw(false);
        this.C0 = new ai9(zof.s0.getSize());
    }

    /* access modifiers changed from: private */
    public final BoringLayout.Metrics getMetrics() {
        return (BoringLayout.Metrics) this.A0.getValue();
    }

    private final CharSequence getText() {
        bc7 bc7 = D0[1];
        return (CharSequence) this.B0.b;
    }

    private final int getViewStatusTintColor() {
        int i = h34.$EnumSwitchMapping$0[this.x0.ordinal()];
        pq9 pq9 = qp4.u0;
        return i == 1 ? pq9.j(this).a().k().b.c : b() ? pq9.j(this).a().k().b.h : pq9.j(this).a().k().b.g;
    }

    private final void setText(CharSequence charSequence) {
        this.B0.o1(this, D0[1], charSequence);
    }

    public final boolean b() {
        bc7 bc7 = D0[0];
        return ((Boolean) this.w0.b).booleanValue();
    }

    public final void c(CharSequence charSequence, boolean z) {
        if (z) {
            charSequence = new SpannableStringBuilder(getContext().getString(oda.R0)).append(" · ").append(charSequence);
        }
        setText(charSequence);
    }

    public final void d(zof zof) {
        Drawable drawable = this.y0;
        if (drawable == null) {
            return;
        }
        if (zof == zof.Error) {
            EnhancedVectorDrawable enhancedVectorDrawable = drawable instanceof EnhancedVectorDrawable ? (EnhancedVectorDrawable) drawable : null;
            if (enhancedVectorDrawable != null) {
                c54.Z(enhancedVectorDrawable, "error", getViewStatusTintColor());
                return;
            }
            return;
        }
        drawable.setTint(getViewStatusTintColor());
    }

    /* JADX INFO: finally extract failed */
    public final void onDraw(Canvas canvas) {
        Layout layout = this.z0;
        if (layout != null) {
            layout.getPaint().setColor(this.v0);
            float height = ((float) (getHeight() - layout.getHeight())) * 0.5f;
            float f = 0.0f;
            if (b()) {
                f = 0.0f + ((float) this.o);
                je7 je7 = this.u0;
                ((Paint) je7.getValue()).setColor(this.c);
                float f2 = this.t0;
                canvas.drawRoundRect(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), f2, f2, (Paint) je7.getValue());
            }
            boolean K = c54.K(this);
            float f3 = this.a;
            if (K) {
                Drawable drawable = this.y0;
                if (drawable != null) {
                    int save = canvas.save();
                    canvas.translate(f, ((float) (getHeight() - drawable.getBounds().height())) * 0.5f);
                    try {
                        drawable.draw(canvas);
                        canvas.restoreToCount(save);
                        f += ((float) drawable.getBounds().width()) + f3;
                    } catch (Throwable th) {
                        canvas.restoreToCount(save);
                        throw th;
                    }
                }
                int save2 = canvas.save();
                canvas.translate(f, height);
                try {
                    layout.draw(canvas);
                } finally {
                    canvas.restoreToCount(save2);
                }
            } else {
                int save3 = canvas.save();
                canvas.translate(f, height);
                try {
                    layout.draw(canvas);
                    canvas.restoreToCount(save3);
                    Drawable drawable2 = this.y0;
                    if (drawable2 != null) {
                        int save4 = canvas.save();
                        canvas.translate(f + ((float) layout.getWidth()) + f3, ((float) (getHeight() - drawable2.getBounds().height())) * 0.5f);
                        try {
                            drawable2.draw(canvas);
                        } finally {
                            canvas.restoreToCount(save4);
                        }
                    }
                } catch (Throwable th2) {
                    canvas.restoreToCount(save3);
                    throw th2;
                }
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        Layout layout = this.z0;
        if (layout != null) {
            i3 = layout.getWidth();
            i4 = layout.getHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        Drawable drawable = this.y0;
        if (drawable != null) {
            i3 += drawable.getBounds().width() + tu0.G(this.a);
            i4 = Math.max(i4, drawable.getBounds().height());
        }
        if (b()) {
            i3 += this.o * 2;
            i4 += this.s0 * 2;
        }
        setMeasuredDimension(i3, i4);
    }

    public final void onThemeChanged(fka fka) {
        Drawable drawable = this.y0;
        qe qeVar = drawable instanceof qe ? (qe) drawable : null;
        if (qeVar != null) {
            qeVar.a(getViewStatusTintColor());
        }
    }

    public void setBackgroundColor(int i) {
        if (this.c != i) {
            this.c = i;
            invalidate();
        }
    }

    public final void setBackgroundEnabled$message_list_release(boolean z) {
        this.w0.o1(this, D0[0], Boolean.valueOf(z));
    }

    public final void setStatus$message_list_release(zof zof) {
        Drawable drawable;
        Object obj;
        this.x0 = zof;
        Integer num = zof.a;
        if (num == null) {
            drawable = null;
        } else {
            int intValue = num.intValue();
            ai9 ai9 = this.C0;
            Object c2 = ai9.c(intValue);
            if (c2 == null) {
                int ordinal = this.x0.ordinal();
                if (ordinal == 1) {
                    qe qeVar = new qe(getContext());
                    ((EnhancedAnimatedVectorDrawable) qeVar.getDrawable()).setCallback(this);
                    qeVar.a(getViewStatusTintColor());
                    qeVar.start();
                    obj = qeVar;
                } else if (ordinal != 4) {
                    obj = kt3.b(getContext(), num.intValue());
                } else {
                    c2 = new EnhancedVectorDrawable(getContext(), num.intValue());
                    int a2 = ai9.a(intValue);
                    ai9.b[a2] = intValue;
                    ai9.c[a2] = c2;
                }
                c2 = obj;
                int a22 = ai9.a(intValue);
                ai9.b[a22] = intValue;
                ai9.c[a22] = c2;
            }
            drawable = (Drawable) c2;
        }
        boolean f = true ^ tpa.f(this.y0, drawable);
        if (drawable != null) {
            int i = this.b;
            drawable.setBounds(0, 0, i, i);
        }
        this.y0 = drawable;
        d(zof);
        invalidate();
        if (f) {
            requestLayout();
        }
    }

    public final void setTextColor$message_list_release(int i) {
        if (this.v0 != i) {
            this.v0 = i;
            E0.setColor(i);
            d(this.x0);
            invalidate();
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return (drawable instanceof Animatable) || super.verifyDrawable(drawable);
    }
}
