package ru.ok.tamtam.markdown.ui.preview;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000eB\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ok/tamtam/markdown/ui/preview/MarkdownMenuView;", "Landroid/widget/LinearLayout;", "Lnse;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "enabled", "Le5f;", "setEnabled", "(Z)V", "Lvz7;", "listener", "setListener", "(Lvz7;)V", "markdown-ui_release"}, k = 1, mv = {2, 0, 0})
public final class MarkdownMenuView extends LinearLayout implements nse {
    public static final /* synthetic */ int u0 = 0;
    public final ArrayList a;
    public final RectF b = new RectF();
    public int c;
    public final Paint o;
    public AnimatorSet s0;
    public final float t0;

    public MarkdownMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        paint.setDither(true);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        paint.setAlpha(25);
        this.o = paint;
        setOrientation(1);
        setWillNotDraw(false);
        sz7.c.getClass();
        LinkedHashSet linkedHashSet = sz7.o;
        ArrayList arrayList = new ArrayList(z53.S(linkedHashSet, 10));
        int i = 0;
        for (Object next : linkedHashSet) {
            int i2 = i + 1;
            if (i >= 0) {
                sz7 sz7 = (sz7) next;
                tz7 tz7 = new tz7(context);
                tz7.setTag(sz7);
                tz7.setTitle(sz7.b);
                tu0.K(tz7, 300, new vu5(this, 12, sz7));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, getContext().getResources().getDimensionPixelSize(ktb.markdown_button_size));
                layoutParams.gravity = 8388613;
                layoutParams.bottomMargin = i == sz7.values().length - 1 ? 0 : tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density);
                addView(tz7, layoutParams);
                tz7.a(i == this.c, false);
                arrayList.add(tz7);
                i = i2;
            } else {
                y53.R();
                throw null;
            }
        }
        this.a = arrayList;
        c();
        this.t0 = fk4.d().getDisplayMetrics().density * 100.0f;
    }

    public final void a(int i, boolean z) {
        AnimatorSet animatorSet;
        tz7 tz7 = (tz7) this.a.get(i);
        boolean isInEditMode = isInEditMode();
        RectF rectF = this.b;
        if (isInEditMode || !z || (!mr0.w(this).p())) {
            rectF.left = (float) tz7.getLeft();
            rectF.top = (float) tz7.getTop();
            rectF.right = (float) tz7.getRight();
            rectF.bottom = (float) tz7.getBottom();
            invalidate();
            return;
        }
        tg w = mr0.w(this);
        AnimatorSet animatorSet2 = this.s0;
        if (!(animatorSet2 == null || !animatorSet2.isRunning() || (animatorSet = this.s0) == null)) {
            animatorSet.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{rectF.top, (float) tz7.getTop()});
        ofFloat.addUpdateListener(new uz7(this, 0));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{rectF.left, (float) tz7.getLeft()});
        ofFloat2.addUpdateListener(new uz7(this, 1));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{rectF.right, (float) tz7.getRight()});
        ofFloat3.addUpdateListener(new uz7(this, 2));
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(new float[]{rectF.bottom, (float) tz7.getBottom()});
        ofFloat4.addUpdateListener(new uz7(this, 3));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.s0 = animatorSet3;
        animatorSet3.setDuration(w.a.b());
        animatorSet3.setInterpolator(w.a.k());
        animatorSet3.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3, ofFloat4});
        animatorSet3.addListener(new qg(i, 1, this));
        animatorSet3.start();
    }

    public final void c() {
        if (!isInEditMode()) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((tz7) it.next()).c();
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.s0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void onDraw(Canvas canvas) {
        RectF rectF = this.b;
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = rectF.right;
        float f4 = rectF.bottom;
        Paint paint = this.o;
        float f5 = this.t0;
        canvas.drawRoundRect(f, f2, f3, f4, f5, f5, paint);
        super.onDraw(canvas);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.b.isEmpty()) {
            a(0, false);
        }
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            removeAllViews();
        }
    }

    public final void setListener(vz7 vz7) {
    }
}
