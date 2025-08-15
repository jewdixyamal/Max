package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: j33  reason: default package */
public final class j33 extends LinkMovementMethod {
    public static final String m = nec.a(j33.class).b();
    public final i33 a;
    public final RectF b = new RectF();
    public String c;
    public qz7 d;
    public Spannable e;
    public ClickableSpan f;
    public boolean g;
    public k56 h;
    public boolean i;
    public Runnable j;
    public final q00 k;
    public final GestureDetector l;

    public j33(Context context, i33 i33) {
        this.a = i33;
        q00 q00 = new q00(5, this);
        this.k = q00;
        this.l = new GestureDetector(context, q00);
    }

    public static final ClickableSpan a(j33 j33, qz7 qz7, Spannable spannable, MotionEvent motionEvent) {
        WeakReference weakReference;
        View view;
        Layout layout;
        Object obj;
        j33.getClass();
        ClickableSpan clickableSpan = null;
        if (qz7 == null || (weakReference = (WeakReference) qz7.b) == null || (view = (View) weakReference.get()) == null || (layout = (Layout) qz7.c) == null) {
            return null;
        }
        int x = ((int) motionEvent.getX()) - view.getPaddingLeft();
        int scrollY = view.getScrollY() + (((int) motionEvent.getY()) - view.getPaddingTop());
        int lineForVertical = layout.getLineForVertical(scrollY);
        float scrollX = (float) (view.getScrollX() + x);
        try {
            int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, scrollX);
            RectF rectF = j33.b;
            rectF.left = layout.getLineLeft(lineForVertical);
            rectF.top = (float) layout.getLineTop(lineForVertical);
            rectF.right = layout.getLineMax(lineForVertical) + rectF.left;
            rectF.bottom = (float) layout.getLineBottom(lineForVertical);
            obj = rectF.contains(scrollX, (float) scrollY) ? (ClickableSpan) ys.e0(spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class)) : null;
        } catch (Throwable th) {
            obj = new njc(th);
        }
        Throwable a2 = pjc.a(obj);
        if (a2 != null) {
            hm9.p(m, "findClickableSpanUnderTouch failed:", a2);
        }
        if (!(obj instanceof njc)) {
            clickableSpan = obj;
        }
        return clickableSpan;
    }

    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.d = new qz7((Object) new WeakReference(textView), 12, (Object) textView.getLayout());
            this.e = spannable;
        }
        return this.l.onTouchEvent(motionEvent);
    }
}
