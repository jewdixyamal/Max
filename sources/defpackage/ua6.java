package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: ua6  reason: default package */
public final class ua6 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k56 b;

    public /* synthetic */ ua6(int i, k56 k56) {
        this.a = i;
        this.b = k56;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                this.b.invoke();
                return true;
            default:
                this.b.invoke();
                return true;
        }
    }
}
