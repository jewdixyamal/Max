package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import one.me.profile.screens.avatars.ProfileAvatarWidget;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: q46  reason: default package */
public final /* synthetic */ class q46 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ GestureDetector b;

    public /* synthetic */ q46(GestureDetector gestureDetector, int i) {
        this.a = i;
        this.b = gestureDetector;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.b;
        switch (this.a) {
            case 0:
                gestureDetector.onTouchEvent(motionEvent);
                return false;
            case 1:
                gestureDetector.onTouchEvent(motionEvent);
                return false;
            case 2:
                return gestureDetector.onTouchEvent(motionEvent);
            case 3:
                return gestureDetector.onTouchEvent(motionEvent);
            case 4:
                return gestureDetector.onTouchEvent(motionEvent);
            case 5:
                bc7[] bc7Arr = MessageWriteWidget.F0;
                return gestureDetector.onTouchEvent(motionEvent);
            case 6:
                bc7[] bc7Arr2 = ProfileAvatarWidget.X;
                if (motionEvent != null) {
                    gestureDetector.onTouchEvent(motionEvent);
                    return false;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case 7:
                return gestureDetector.onTouchEvent(motionEvent);
            default:
                return gestureDetector.onTouchEvent(motionEvent);
        }
    }
}
