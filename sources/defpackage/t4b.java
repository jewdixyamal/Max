package defpackage;

import android.view.MotionEvent;
import android.widget.SeekBar;

/* renamed from: t4b  reason: default package */
public final class t4b extends SeekBar {
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }
}
