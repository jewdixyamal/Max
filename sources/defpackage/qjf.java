package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: qjf  reason: default package */
public final class qjf implements View.OnTouchListener {
    public static final qjf b = new qjf(0);
    public final /* synthetic */ int a;

    public /* synthetic */ qjf(int i) {
        this.a = i;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return true;
        }
    }
}
