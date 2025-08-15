package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: zs8  reason: default package */
public final class zs8 extends ViewGroup {
    public boolean a;
    public final int b = tu0.G(((float) 32) * fk4.d().getDisplayMetrics().density);
    public final int c;
    public final int o;
    public final int s0;
    public final int t0;
    public View u0;
    public View v0;
    public final je7 w0;
    public long x0;
    public final RectF y0;
    public m56 z0;

    public zs8(Context context) {
        super(context);
        float f = (float) 6;
        this.c = tu0.G(fk4.d().getDisplayMetrics().density * f);
        this.o = tu0.G(f * fk4.d().getDisplayMetrics().density);
        this.s0 = tu0.G(((float) 38) * fk4.d().getDisplayMetrics().density);
        this.t0 = tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density);
        this.w0 = o19.a.getAccessor().d(os0.class);
        setClipToPadding(false);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setWillNotDraw(false);
        this.y0 = new RectF();
    }

    private final os0 getBubbleUiOptions() {
        return (os0) this.w0.getValue();
    }

    public final int a(int i, ys8 ys8) {
        if (this.a) {
            i -= this.s0;
        }
        int marginStart = ys8.getMarginStart();
        int paddingEnd = getPaddingEnd();
        return i - (ys8.getMarginEnd() + (paddingEnd + (getPaddingStart() + marginStart)));
    }

    public final long getAvatarId() {
        return this.x0;
    }

    public final View getContentView$message_list_release() {
        return this.u0;
    }

    public final int getContentViewTopMargin() {
        View view = this.u0;
        if (view == null) {
            return 0;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    public final int getMaxAvailableWidth$message_list_release() {
        View view = this.v0;
        View view2 = this.u0;
        if (view != null && view.getVisibility() == 0) {
            return a(getMeasuredWidth(), (ys8) view.getLayoutParams());
        } else if (view2 == null) {
            return getMeasuredWidth();
        } else {
            return a(getMeasuredWidth(), (ys8) view2.getLayoutParams());
        }
    }

    public final boolean getOffsetBubbleByAvatar() {
        return this.a;
    }

    public final m56 getOnAvatarClickListener$message_list_release() {
        return this.z0;
    }

    public final View getOutsideBubbleView$message_list_release() {
        return this.v0;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        View view = this.u0;
        if (view != null) {
            int paddingStart = getPaddingStart();
            ys8 ys8 = (ys8) view.getLayoutParams();
            if (ys8.a) {
                if (this.a) {
                    paddingStart += this.b + this.o;
                }
                i5 = ys8.getMarginStart() + paddingStart;
            } else {
                int measuredWidth = i3 - view.getMeasuredWidth();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                i5 = (measuredWidth - (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd() : 0)) - getPaddingEnd();
            }
            int i6 = ys8.topMargin;
            ote.E(view, i5, i6, 0, 12);
            View view2 = this.v0;
            if (view2 != null && view2.getVisibility() == 0) {
                ote.E(view2, i5, view.getMeasuredHeight() + i6 + this.t0, 0, 12);
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.a) {
            int i5 = this.b;
            i3 = this.c;
            i4 = i5 + i3;
        } else {
            i3 = 0;
            i4 = 0;
        }
        int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        View view = this.u0;
        if (view != null) {
            View view2 = this.v0;
            int i6 = (view2 == null || view2.getVisibility() != 0) ? Integer.MIN_VALUE : 1073741824;
            ys8 ys8 = (ys8) view.getLayoutParams();
            int a2 = a(defaultSize, ys8);
            int intValue = ((Number) ((w6a) getBubbleUiOptions()).d.getValue()).intValue();
            if (intValue <= a2) {
                a2 = intValue;
            }
            view.measure(View.MeasureSpec.makeMeasureSpec(a2, i6), i2);
            i4 = Math.max(i4 + i3, view.getMeasuredHeight() + ys8.topMargin + ys8.bottomMargin);
            if (view2 != null && view2.getVisibility() == 0) {
                ys8 ys82 = (ys8) view2.getLayoutParams();
                int a3 = a(defaultSize, ys82);
                int intValue2 = ((Number) ((w6a) getBubbleUiOptions()).d.getValue()).intValue();
                if (intValue2 <= a3) {
                    a3 = intValue2;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(a3, 1073741824), i2);
                i4 = view2.getMeasuredHeight() + this.t0 + ys82.topMargin + ys82.bottomMargin + i4;
            }
        }
        setMeasuredDimension(defaultSize, i4);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        m56 m56;
        RectF rectF = this.y0;
        if (rectF.isEmpty() || this.x0 <= 0 || !rectF.contains(motionEvent.getX(), motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 1 && (m56 = this.z0) != null) {
            m56.invoke(Long.valueOf(this.x0));
        }
        return true;
    }

    public final void setAvatarId(long j) {
        this.x0 = j;
    }

    public final void setListener(xs8 xs8) {
    }

    public final void setOffsetBubbleByAvatar(boolean z) {
        this.a = z;
    }

    public final void setOnAvatarClickListener$message_list_release(m56 m56) {
        this.z0 = m56;
    }
}
