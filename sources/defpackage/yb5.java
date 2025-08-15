package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import com.futuremind.recyclerviewfastscroll.FastScroller;

/* renamed from: yb5  reason: default package */
public final class yb5 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yb5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f;
        int width;
        int width2;
        ln lnVar;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                FastScroller fastScroller = (FastScroller) obj;
                fastScroller.requestDisallowInterceptTouchEvent(true);
                if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                    int i = FastScroller.B0;
                    fastScroller.getClass();
                    fastScroller.z0 = true;
                    if (fastScroller.c()) {
                        float rawY = motionEvent.getRawY();
                        View view2 = fastScroller.o;
                        int[] iArr = {0, (int) view2.getY()};
                        ((View) view2.getParent()).getLocationInWindow(iArr);
                        f = rawY - ((float) iArr[1]);
                        width = fastScroller.getHeight();
                        width2 = fastScroller.o.getHeight();
                    } else {
                        float rawX = motionEvent.getRawX();
                        View view3 = fastScroller.o;
                        int[] iArr2 = {(int) view3.getX(), 0};
                        ((View) view3.getParent()).getLocationInWindow(iArr2);
                        f = rawX - ((float) iArr2[0]);
                        width = fastScroller.getWidth();
                        width2 = fastScroller.o.getWidth();
                    }
                    float f2 = f / ((float) (width - width2));
                    fastScroller.setScrollerPosition(f2);
                    fastScroller.setRecyclerViewPosition(f2);
                    return true;
                } else if (motionEvent.getAction() != 1) {
                    return false;
                } else {
                    fastScroller.z0 = false;
                    fastScroller.getClass();
                    return true;
                }
            case 1:
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                wl7 wl7 = (wl7) obj;
                if (action == 0 && (lnVar = wl7.K0) != null && lnVar.isShowing() && x >= 0 && x < wl7.K0.getWidth() && y >= 0 && y < wl7.K0.getHeight()) {
                    wl7.G0.postDelayed(wl7.C0, 250);
                } else if (action == 1) {
                    wl7.G0.removeCallbacks(wl7.C0);
                }
                return false;
            default:
                if (((Checkable) view).isChecked()) {
                    return ((GestureDetector) obj).onTouchEvent(motionEvent);
                }
                return false;
        }
    }
}
