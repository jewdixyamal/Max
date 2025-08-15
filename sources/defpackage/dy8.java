package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.util.Size;
import android.view.Display;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: dy8  reason: default package */
public final class dy8 extends View implements ay8, View.OnLongClickListener, hk7, GestureDetector.OnDoubleTapListener, hx4 {
    public static final /* synthetic */ bc7[] H0;
    public boolean A0;
    public by8 B0;
    public Drawable C0;
    public int D0;
    public int E0;
    public final Rect F0;
    public final gi G0;
    public final j33 a;
    public final je7 b = tu0.r(3, new j78(11));
    public View.OnLongClickListener c;
    public i33 o;
    public final kk7 s0 = new kk7((hk7) null, new zj7(7, this), 7);
    public hk7 t0;
    public final yj u0 = new yj(14, this);
    public j33 v0;
    public int w0;
    public float x0;
    public float y0;
    public float z0;

    static {
        oi9 oi9 = new oi9(dy8.class, "onDoubleClickListener", "getOnDoubleClickListener()Lkotlin/jvm/functions/Function1;");
        nec.a.getClass();
        H0 = new bc7[]{oi9};
    }

    public dy8(Context context) {
        super(context, (AttributeSet) null, 0);
        j33 j33 = new j33(context, new yt8(1, (Object) this));
        this.a = j33;
        this.v0 = j33;
        this.w0 = 1;
        this.A0 = true;
        Display defaultDisplay = nd7.z(context).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        this.E0 = new Size(point.x, point.y).getHeight();
        this.F0 = new Rect();
        this.G0 = new gi(3, this);
        super.setOnLongClickListener(this);
    }

    public static void f(dy8 dy8) {
        ArrayList arrayList = dy8.getHighlightTextHelper().a;
        if (!arrayList.isEmpty()) {
            arrayList.clear();
        }
        CharSequence text = dy8.getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable != null) {
            for (Object obj : spannable.getSpans(0, spannable.length(), ozc.class)) {
                ozc ozc = (ozc) obj;
                ForegroundColorSpan foregroundColorSpan = ozc.a;
                if (foregroundColorSpan != null) {
                    spannable.removeSpan(foregroundColorSpan);
                }
                BackgroundColorSpan backgroundColorSpan = ozc.b;
                if (backgroundColorSpan != null) {
                    spannable.removeSpan(backgroundColorSpan);
                }
                spannable.removeSpan(ozc);
            }
        }
        dy8.invalidate();
    }

    private final ik6 getHighlightTextHelper() {
        return (ik6) this.b.getValue();
    }

    /* access modifiers changed from: private */
    public static final void setStartDrawable$lambda$6(Drawable drawable) {
        ((AnimationDrawable) drawable).start();
    }

    public final void a(nu8 nu8) {
        hk7 hk7 = this.t0;
        if (hk7 != null) {
            hk7.a(nu8);
        }
    }

    public final void b(String str, lk7 lk7, ClickableSpan clickableSpan) {
        hk7 hk7 = this.t0;
        if (hk7 != null) {
            hk7.b(str, lk7, clickableSpan);
        }
    }

    public final void d() {
        invalidate();
    }

    public final int e(int i) {
        Layout layout = getLayout();
        return layout == null ? i : layout.getLineCount() == 1 ? getMeasuredWidth() : layout.getLineCount() > 1 ? (int) layout.getLineRight(layout.getLineCount() - 1) : i;
    }

    public final void g(List list) {
        ik6 ik6;
        CharSequence charSequence;
        ik6 highlightTextHelper = getHighlightTextHelper();
        CharSequence text = getText();
        Layout layout = getLayout();
        ArrayList arrayList = highlightTextHelper.a;
        if (!arrayList.isEmpty()) {
            arrayList.clear();
        }
        if (!(list == null || list.isEmpty() || text == null || w9e.C0(text) || layout == null)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                a0d a0d = (a0d) it.next();
                float height = (float) (layout.getHeight() / layout.getLineCount());
                int i = a0d.a;
                while (true) {
                    int lineForOffset = layout.getLineForOffset(i);
                    int lineEnd = layout.getLineEnd(lineForOffset);
                    int i2 = a0d.b;
                    boolean z = i2 <= lineEnd;
                    if (!z) {
                        i2 = lineEnd;
                    }
                    String obj = text.subSequence(i, i2).toString();
                    ArrayList arrayList2 = highlightTextHelper.a;
                    ik6 = highlightTextHelper;
                    hk6 hk6 = r6;
                    charSequence = text;
                    hk6 hk62 = new hk6(lineForOffset, obj, layout.getPrimaryHorizontal(i), (float) layout.getLineTop(lineForOffset), (float) layout.getLineBaseline(lineForOffset), layout.getPaint().measureText(obj), height);
                    arrayList2.add(hk6);
                    if (z) {
                        break;
                    }
                    i = lineEnd;
                    text = charSequence;
                    highlightTextHelper = ik6;
                }
                text = charSequence;
                highlightTextHelper = ik6;
            }
        }
        invalidate();
    }

    public final j33 getDefaultMovementMethod() {
        return this.a;
    }

    public final Layout getLayout() {
        by8 by8 = this.B0;
        if (by8 != null) {
            return by8.a();
        }
        return null;
    }

    public final int getLineCount() {
        Layout a2;
        by8 by8 = this.B0;
        if (by8 == null || (a2 = by8.a()) == null) {
            return 0;
        }
        return a2.getLineCount();
    }

    public final boolean getLinksClickable() {
        return this.A0;
    }

    public final int getMaxHeightForClip() {
        return this.E0;
    }

    public final j33 getMovementMethod() {
        return this.v0;
    }

    public final m56 getOnDoubleClickListener() {
        bc7 bc7 = H0[0];
        return (m56) this.u0.b;
    }

    public final CharSequence getText() {
        Layout a2;
        by8 by8 = this.B0;
        if (by8 == null || (a2 = by8.a()) == null) {
            return null;
        }
        return a2.getText();
    }

    public final void h() {
        int i;
        by8 by8 = this.B0;
        Layout a2 = by8 != null ? by8.a() : null;
        Drawable drawable = this.C0;
        int i2 = 0;
        int intrinsicWidth = drawable != null ? drawable.getIntrinsicWidth() + this.D0 : 0;
        this.y0 = (float) intrinsicWidth;
        int paddingLeft = getPaddingLeft();
        if (a2 == null) {
            i = 0;
        } else {
            int lineCount = a2.getLineCount();
            i = 0;
            for (int i3 = 0; i3 < lineCount; i3++) {
                i = Math.max(i, tu0.G(a2.getLineMax(i3)));
            }
        }
        int paddingRight = getPaddingRight() + paddingLeft + i + intrinsicWidth;
        if (a2 != null) {
            i2 = a2.getHeight();
        }
        setMeasuredDimension(paddingRight, i2);
    }

    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        by8 by8 = this.B0;
        if (by8 != null) {
            by8.d.add(this);
        }
        CharSequence text = getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable != null) {
            this.s0.c(spannable);
        }
        by8 by82 = this.B0;
        if (by82 != null) {
            od2.W(this, by82.a(), this.G0);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        by8 by8 = this.B0;
        if (by8 != null) {
            by8.d.remove(this);
        }
        CharSequence text = getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable != null) {
            this.s0.getClass();
            kk7.a(spannable);
        }
        by8 by82 = this.B0;
        if (by82 != null) {
            od2.Y(by82.a(), this.G0);
        }
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        m56 onDoubleClickListener = getOnDoubleClickListener();
        return onDoubleClickListener != null && ((Boolean) onDoubleClickListener.invoke(this)).booleanValue();
    }

    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return onDoubleTap(motionEvent);
    }

    public final void onDraw(Canvas canvas) {
        Layout layout = getLayout();
        if (layout != null) {
            yb9 yb9 = qh.a;
            Rect rect = this.F0;
            if (!rect.isEmpty()) {
                canvas.clipRect(rect);
            }
            Drawable drawable = this.C0;
            int save = canvas.save();
            if (drawable != null) {
                canvas.translate(this.x0, this.z0);
                drawable.draw(canvas);
            }
            canvas.translate(this.x0 + this.y0, 0.0f);
            layout.draw(canvas);
            ik6 highlightTextHelper = getHighlightTextHelper();
            fka j = qp4.u0.j(this);
            TextPaint textPaint = (TextPaint) highlightTextHelper.c.getValue();
            textPaint.set(layout.getPaint());
            textPaint.setColor(j.getText().a);
            je7 je7 = highlightTextHelper.b;
            ((Paint) je7.getValue()).setColor(j.f().c);
            Iterator it = highlightTextHelper.a.iterator();
            while (it.hasNext()) {
                hk6 hk6 = (hk6) it.next();
                float f = hk6.c;
                float f2 = hk6.d;
                canvas.drawRect(f, f2, f + hk6.f, f2 + hk6.g, (Paint) je7.getValue());
                canvas.drawText(hk6.b, hk6.c, hk6.e, textPaint);
            }
            canvas.restoreToCount(save);
            yb9 yb92 = qh.a;
        }
    }

    public final boolean onLongClick(View view) {
        View.OnLongClickListener onLongClickListener = this.c;
        if (onLongClickListener == null) {
            return true;
        }
        onLongClickListener.onLongClick(view);
        return true;
    }

    public final void onMeasure(int i, int i2) {
        h();
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return performClick();
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.x0 = (float) (this.w0 == -1 ? getPaddingRight() : getPaddingLeft());
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        j33 j33 = this.v0;
        if ((getText() instanceof Spannable) && this.A0 && j33 != null) {
            Layout layout = getLayout();
            SpannableString spannableString = new SpannableString(getText());
            if (motionEvent.getAction() == 0) {
                j33.d = new qz7((Object) new WeakReference(this), 12, (Object) layout);
                j33.e = spannableString;
            }
            if (j33.l.onTouchEvent(motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void scrollTo(int i, int i2) {
    }

    public final void setLayout(by8 by8) {
        by8 by82 = this.B0;
        if (by82 != null) {
            by82.d.remove(this);
        }
        this.B0 = by8;
        by8.d.add(this);
        this.w0 = by8.a().getParagraphDirection(0);
        by8.a().getLineRight(0);
        CharSequence text = getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable != null) {
            this.s0.c(spannable);
        }
        od2.W(this, by8.a(), this.G0);
        this.z0 = (float) by8.a().getTopPadding();
        requestLayout();
        invalidate();
        setContentDescription(getText());
    }

    public final void setLinkListener(hk7 hk7) {
        Layout a2;
        this.t0 = hk7;
        kk7 kk7 = this.s0;
        kk7.a = hk7;
        by8 by8 = this.B0;
        if (by8 != null && (a2 = by8.a()) != null) {
            kk7.c(a2.getText());
        }
    }

    public final void setLinkLongClickListener(i33 i33) {
        this.o = i33;
    }

    public final void setLinksClickable(boolean z) {
        this.A0 = z;
    }

    public final void setMaxHeightForClip(int i) {
        this.E0 = i;
    }

    public final void setMovementMethod(j33 j33) {
        this.v0 = j33;
    }

    public final void setOnDoubleClickListener(m56 m56) {
        this.u0.o1(this, H0[0], m56);
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.c = onLongClickListener;
    }

    public final void setSingleClickAction(Runnable runnable) {
        if (runnable == null) {
            j33 j33 = this.v0;
            if (j33 != null) {
                j33.h = null;
                return;
            }
            return;
        }
        j33 j332 = this.v0;
        if (j332 != null) {
            j332.h = new i55(runnable, 1);
        }
    }

    public final void setStartDrawable(Drawable drawable) {
        this.C0 = drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        if (drawable instanceof AnimationDrawable) {
            post(new cy8(drawable, 0));
        }
        requestLayout();
    }

    public final void setStartDrawablePadding(int i) {
        if (this.D0 != i) {
            this.D0 = i;
            requestLayout();
        }
    }

    public final void setTextColors(is0 is0) {
        TextPaint paint;
        Layout layout = getLayout();
        ls0 ls0 = is0.d;
        if (!(layout == null || (paint = layout.getPaint()) == null)) {
            paint.setColor(ls0.e);
        }
        CharSequence text = getText();
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        if (spanned != null) {
            Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
            if (spans != null) {
                for (Object obj : spans) {
                    if (obj instanceof qu8) {
                        ((qu8) obj).b = ls0.b;
                    } else if (obj instanceof ek7) {
                        ((ek7) obj).a = ls0.b;
                    } else if (obj instanceof gk7) {
                        ((gk7) obj).b = ls0.b;
                    }
                }
            }
        }
        invalidate();
    }

    public final void setTryToSingleClickAction(Runnable runnable) {
        j33 j33 = this.v0;
        if (j33 != null) {
            j33.j = runnable;
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return (drawable instanceof Animatable) || super.verifyDrawable(drawable);
    }
}
