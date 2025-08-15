package defpackage;

import android.view.MotionEvent;
import android.widget.FrameLayout;

/* renamed from: w12  reason: default package */
public class w12 extends FrameLayout implements yu3 {
    public int a;

    public final void a(uu3 uu3, uu3 uu32, boolean z) {
        this.a++;
    }

    public final void b(uu3 uu3, uu3 uu32, boolean z) {
        this.a--;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.a > 0 || super.onInterceptTouchEvent(motionEvent);
    }
}
