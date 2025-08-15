package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* renamed from: rof  reason: default package */
public final class rof extends RecyclerView {
    public final /* synthetic */ ViewPager2 V1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rof(ViewPager2 viewPager2, Context context) {
        super(context, (AttributeSet) null);
        this.V1 = viewPager2;
    }

    public final CharSequence getAccessibilityClassName() {
        this.V1.H0.getClass();
        return super.getAccessibilityClassName();
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        ViewPager2 viewPager2 = this.V1;
        accessibilityEvent.setFromIndex(viewPager2.o);
        accessibilityEvent.setToIndex(viewPager2.o);
        accessibilityEvent.setSource((ViewPager2) viewPager2.H0.X);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.V1.F0 && super.onInterceptTouchEvent(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.V1.F0 && super.onTouchEvent(motionEvent);
    }
}
