package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: k71  reason: default package */
public final class k71 implements sdc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k71(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void b(boolean z) {
    }

    private final void d(MotionEvent motionEvent) {
    }

    public final void a(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                return;
            default:
                f77 f77 = (f77) this.b;
                ((GestureDetector) f77.I0.a).onTouchEvent(motionEvent);
                VelocityTracker velocityTracker = f77.E0;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (f77.w0 != -1) {
                    int actionMasked = motionEvent.getActionMasked();
                    int findPointerIndex = motionEvent.findPointerIndex(f77.w0);
                    if (findPointerIndex >= 0) {
                        f77.k(actionMasked, findPointerIndex, motionEvent);
                    }
                    dec dec = f77.c;
                    if (dec != null) {
                        int i = 0;
                        if (actionMasked != 1) {
                            if (actionMasked != 2) {
                                if (actionMasked == 3) {
                                    VelocityTracker velocityTracker2 = f77.E0;
                                    if (velocityTracker2 != null) {
                                        velocityTracker2.clear();
                                    }
                                } else if (actionMasked == 6) {
                                    int actionIndex = motionEvent.getActionIndex();
                                    if (motionEvent.getPointerId(actionIndex) == f77.w0) {
                                        if (actionIndex == 0) {
                                            i = 1;
                                        }
                                        f77.w0 = motionEvent.getPointerId(i);
                                        f77.u(f77.z0, actionIndex, motionEvent);
                                        return;
                                    }
                                    return;
                                } else {
                                    return;
                                }
                            } else if (findPointerIndex >= 0) {
                                f77.u(f77.z0, findPointerIndex, motionEvent);
                                f77.q(dec);
                                RecyclerView recyclerView = f77.C0;
                                q57 q57 = f77.D0;
                                recyclerView.removeCallbacks(q57);
                                q57.run();
                                f77.C0.invalidate();
                                return;
                            } else {
                                return;
                            }
                        }
                        f77.s((dec) null, 0);
                        f77.w0 = -1;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public final boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        int findPointerIndex;
        switch (this.a) {
            case 0:
                if (recyclerView.H(motionEvent.getX(), motionEvent.getY()) != null) {
                    return false;
                }
                ((m71) this.b).N0.onTouchEvent(motionEvent);
                return false;
            default:
                f77 f77 = (f77) this.b;
                ((GestureDetector) f77.I0.a).onTouchEvent(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                b77 b77 = null;
                if (actionMasked == 0) {
                    f77.w0 = motionEvent.getPointerId(0);
                    f77.o = motionEvent.getX();
                    f77.X = motionEvent.getY();
                    VelocityTracker velocityTracker = f77.E0;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    f77.E0 = VelocityTracker.obtain();
                    if (f77.c == null) {
                        ArrayList arrayList = f77.A0;
                        if (!arrayList.isEmpty()) {
                            View n = f77.n(motionEvent);
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    b77 b772 = (b77) arrayList.get(size);
                                    if (b772.e.a == n) {
                                        b77 = b772;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        }
                        if (b77 != null) {
                            f77.o -= b77.i;
                            f77.X -= b77.j;
                            dec dec = b77.e;
                            f77.m(dec, true);
                            if (f77.a.remove(dec.a)) {
                                f77.x0.a(f77.C0, dec);
                            }
                            f77.s(dec, b77.f);
                            f77.u(f77.z0, 0, motionEvent);
                        }
                    }
                } else if (actionMasked == 3 || actionMasked == 1) {
                    f77.w0 = -1;
                    f77.s((dec) null, 0);
                } else {
                    int i = f77.w0;
                    if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                        f77.k(actionMasked, findPointerIndex, motionEvent);
                    }
                }
                VelocityTracker velocityTracker2 = f77.E0;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                return f77.c != null;
        }
    }

    public final void e(boolean z) {
        switch (this.a) {
            case 0:
                return;
            default:
                if (z) {
                    ((f77) this.b).s((dec) null, 0);
                    return;
                }
                return;
        }
    }
}
