package ru.ok.messages.video.widgets.doubleTap;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Set;

public class DoubleTapVideoViewWrapper extends FrameLayout {
    public an4 a;

    public DoubleTapVideoViewWrapper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        getContext();
        bk4 b = bk4.b();
        vm4 vm4 = new vm4(getContext(), 1);
        vm4.setId(xxb.double_tap_video_view_wrapper__arrows_view_left);
        vm4.setVisibility(8);
        int i = b.E;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i * 2);
        layoutParams.gravity = 8388627;
        super.addView(vm4, layoutParams);
        vm4 vm42 = new vm4(getContext(), 2);
        vm42.setId(xxb.double_tap_video_view_wrapper__arrows_view_right);
        vm42.setVisibility(8);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(fk4.b((int) 100.0f), fk4.b((int) 200.0f));
        layoutParams2.gravity = 8388629;
        super.addView(vm42, layoutParams2);
    }

    public final void addView(View view) {
        super.addView(view, getChildCount() - 2);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return motionEvent.getPointerCount() <= 1;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        sk9 sk9 = (sk9) this.a;
        oj9 oj9 = (oj9) x53.h0((Set) sk9.a);
        if (oj9 != null) {
            Rect rect = oj9.Z;
            ((View) sk9.c).getHitRect(rect);
            int x = (int) motionEvent.getX();
            int i = rect.right;
            int i2 = rect.left;
            int i3 = (i - i2) / 6;
            if (x >= i2 && x <= rect.centerX() - i3) {
                cn4 cn4 = oj9.c;
                cn4.b.onTouchEvent(motionEvent);
                if (cn4.c > 0) {
                    return true;
                }
            } else if (x < rect.centerX() + i3 || x > rect.right) {
                oj9.X.onTouchEvent(motionEvent);
            } else {
                cn4 cn42 = oj9.o;
                cn42.b.onTouchEvent(motionEvent);
                if (cn42.c > 0) {
                    return true;
                }
            }
        }
        getChildAt(0).dispatchTouchEvent(motionEvent);
        return true;
    }

    public void setTouchEventListener(an4 an4) {
        this.a = an4;
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, getChildCount() - 2, layoutParams);
    }
}
