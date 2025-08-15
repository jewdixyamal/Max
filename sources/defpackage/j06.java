package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: j06  reason: default package */
public final class j06 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k06 b;

    public /* synthetic */ j06(k06 k06, int i) {
        this.a = i;
        this.b = k06;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ViewParent parent = this.b.o.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                k06 k06 = this.b;
                k06.a();
                View view = k06.o;
                if (view.isEnabled() && !view.isLongClickable() && k06.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    k06.Z = true;
                    return;
                }
                return;
        }
    }
}
