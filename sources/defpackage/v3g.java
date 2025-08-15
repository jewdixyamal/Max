package defpackage;

import android.view.MotionEvent;
import android.webkit.WebView;

/* renamed from: v3g  reason: default package */
public final class v3g extends WebView {
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return false;
    }

    public final boolean performClick() {
        super.performClick();
        return false;
    }
}
