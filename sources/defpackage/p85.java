package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: p85  reason: default package */
public final class p85 extends View implements kre {
    public static final /* synthetic */ bc7[] C0;
    public Integer A0;
    public qp0 B0;
    public final fe7 a = ((fe7) xcb.a.getAccessor().c(fe7.class));
    public final CharSequence b;
    public final yj c;
    public final TextPaint o;
    public SpannableString s0;
    public int t0;
    public Layout u0;
    public Layout v0;
    public Layout w0;
    public boolean x0;
    public boolean y0;
    public boolean z0;

    static {
        oi9 oi9 = new oi9(p85.class, "typography", "getTypography()Lone/me/sdk/design/TextStyle;");
        nec.a.getClass();
        C0 = new bc7[]{oi9};
    }

    public p85(Context context) {
        super(context);
        String d = new eqe(yea.l).d(this);
        this.b = d == null ? "" : d;
        this.c = new yj(8, this, i4f.H);
        TextPaint textPaint = new TextPaint(1);
        getTypography().a(textPaint, getResources().getDisplayMetrics(), du4.b);
        pq9 pq9 = qp4.u0;
        textPaint.setColor(pq9.j(this).getText().e);
        this.o = textPaint;
        this.t0 = Integer.MAX_VALUE;
        onThemeChanged(pq9.j(this));
    }

    public final Layout a(int i, CharSequence charSequence) {
        int i2 = gvd.a;
        return this.a.a(crd.l(charSequence, true), this.o, i, Integer.MAX_VALUE, false, TextUtils.TruncateAt.END);
    }

    public final void b(int i) {
        Layout layout;
        Object obj;
        SpannableString spannableString = this.s0;
        if (spannableString != null) {
            Layout a2 = a(i, spannableString);
            this.w0 = a2;
            if (a2.getLineCount() <= this.t0) {
                layout = this.w0;
            } else {
                StringBuilder sb = new StringBuilder("… ");
                CharSequence charSequence = this.b;
                sb.append(charSequence);
                String sb2 = sb.toString();
                TextPaint textPaint = this.o;
                float measureText = textPaint.measureText(sb2);
                SpannableStringBuilder append = new SpannableStringBuilder(spannableString).append(sb2);
                Layout a3 = a(i, append);
                int lineCount = a3.getLineCount();
                int i2 = this.t0;
                if (lineCount > i2) {
                    int lineStart = a3.getLineStart(i2 - 1);
                    CharSequence subSequence = append.subSequence(0, a3.getLineEnd(this.t0 - 1));
                    while (true) {
                        if (((float) a3.getWidth()) > textPaint.measureText(subSequence, lineStart, subSequence.length()) + measureText) {
                            break;
                        }
                        int length = subSequence.length() - 1;
                        if (length < 0) {
                            length = 0;
                        }
                        subSequence = w9e.X0(length, subSequence);
                    }
                    int length2 = subSequence.length() - 1;
                    if (length2 >= 0) {
                        while (true) {
                            int i3 = length2 - 1;
                            if (subSequence.charAt(length2) != 10) {
                                obj = subSequence.subSequence(0, length2 + 1);
                                break;
                            } else if (i3 < 0) {
                                break;
                            } else {
                                length2 = i3;
                            }
                        }
                    }
                    obj = "";
                    append = (SpannableStringBuilder) obj;
                }
                layout = a(i, new SpannableStringBuilder(kp.z(append)).append("… ").append(charSequence, new e27(2, this), 33));
            }
            this.v0 = layout;
            if (this.z0) {
                layout = this.w0;
            }
            this.u0 = layout;
        }
    }

    public final void c() {
        if (isAttachedToWindow() && getMeasuredWidth() > 0) {
            b(getMeasuredWidth());
            this.x0 = true;
            requestLayout();
        } else if (this.B0 == null) {
            this.B0 = new qp0(1, this);
            getViewTreeObserver().addOnPreDrawListener(this.B0);
        }
    }

    public final SpannableString getText() {
        return this.s0;
    }

    public final Layout getTextLayout() {
        return this.u0;
    }

    public final kqe getTypography() {
        bc7 bc7 = C0[0];
        return (kqe) this.c.b;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c();
    }

    public final void onDetachedFromWindow() {
        qp0 qp0 = this.B0;
        if (qp0 != null) {
            if (getViewTreeObserver().isAlive()) {
                getViewTreeObserver().removeOnPreDrawListener(qp0);
            }
            this.B0 = null;
        }
        super.onDetachedFromWindow();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int save = canvas.save();
        canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
        try {
            Layout layout = this.u0;
            if (layout != null) {
                layout.draw(canvas);
            }
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        Integer num = this.A0;
        if (num == null) {
            Layout layout = this.u0;
            num = layout != null ? Integer.valueOf(layout.getHeight()) : null;
            if (num == null) {
                i3 = 0;
                setMeasuredDimension(size, i3);
            }
        }
        i3 = num.intValue();
        setMeasuredDimension(size, i3);
    }

    public final void onThemeChanged(fka fka) {
        Object[] objArr;
        this.o.setColor(fka.getText().e);
        SpannableString spannableString = this.s0;
        if (spannableString != null) {
            try {
                objArr = spannableString.getSpans(0, spannableString.length(), gk7.class);
            } catch (Throwable unused) {
                objArr = null;
            }
            gk7[] gk7Arr = (gk7[]) objArr;
            if (gk7Arr != null) {
                for (gk7 gk7 : gk7Arr) {
                    gk7.b = qp4.u0.j(this).getText().j;
                }
            }
        }
        invalidate();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        CharSequence text;
        if (motionEvent.getAction() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        Layout layout = this.u0;
        if (layout == null || (text = layout.getText()) == null) {
            return super.onTouchEvent(motionEvent);
        }
        Layout layout2 = this.u0;
        if (layout2 == null) {
            return super.onTouchEvent(motionEvent);
        }
        int offsetForHorizontal = layout2.getOffsetForHorizontal(layout2.getLineForVertical((int) (motionEvent.getY() - ((float) getPaddingTop()))), motionEvent.getX() - ((float) getPaddingLeft()));
        float f = (float) 2;
        int q = rh4.q(f, fk4.d().getDisplayMetrics().density, offsetForHorizontal);
        if (q < 0) {
            q = 0;
        }
        int c2 = rh4.c(f, fk4.d().getDisplayMetrics().density, offsetForHorizontal);
        int length = text.length();
        if (c2 > length) {
            c2 = length;
        }
        Object[] objArr = null;
        try {
            Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
            if (spanned != null) {
                objArr = spanned.getSpans(q, c2, ClickableSpan.class);
            }
        } catch (Throwable unused) {
        }
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) objArr;
        if (clickableSpanArr == null) {
            return super.onTouchEvent(motionEvent);
        }
        if (!(!(clickableSpanArr.length == 0))) {
            return super.onTouchEvent(motionEvent);
        }
        clickableSpanArr[0].onClick(this);
        return true;
    }

    public final void setCollapsedLines(int i) {
        this.t0 = i;
    }

    public final void setExpandWithAnimation(boolean z) {
        this.y0 = z;
    }

    public final void setText(SpannableString spannableString) {
        this.s0 = spannableString;
    }

    public final void setTextColor(int i) {
        this.o.setColor(i);
        invalidate();
    }

    public final void setTypography(kqe kqe) {
        this.c.o1(this, C0[0], kqe);
    }

    public final void setText(CharSequence charSequence) {
        gvd gvd;
        Spannable l = qx7.l(charSequence, qp4.u0.j(this).getText().j, 24);
        if (l != null) {
            int i = gvd.a;
            gvd = crd.l(l, true);
        } else {
            gvd = null;
        }
        this.s0 = gvd;
        this.z0 = false;
        this.x0 = false;
        c();
    }
}
