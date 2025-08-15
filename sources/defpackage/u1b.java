package defpackage;

import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: u1b  reason: default package */
public final class u1b implements x1b {
    public float X;
    public w1b Y = w1b.e;
    public final View a;
    public final vg1 b;
    public final aa1 c;
    public float o;

    public u1b(View view, wd6 wd6, aa1 aa1) {
        this.a = view;
        this.b = wd6;
        this.c = aa1;
    }

    public final void a() {
        View view = this.a;
        float translationX = view.getTranslationX();
        float f = this.Y.a;
        if (translationX >= f) {
            float translationX2 = view.getTranslationX();
            f = this.Y.b;
            if (translationX2 <= f) {
                f = view.getTranslationX();
            }
        }
        float translationY = view.getTranslationY();
        float f2 = this.Y.c;
        if (translationY >= f2) {
            float translationY2 = view.getTranslationY();
            f2 = this.Y.d;
            if (translationY2 <= f2) {
                f2 = view.getTranslationY();
            }
        }
        if (f == view.getTranslationX() && f2 == view.getTranslationY()) {
            b();
        } else {
            view.animate().setDuration(200).translationX(f).translationY(f2).setListener(new mf(6, (Object) this)).start();
        }
    }

    public final void b() {
        View view = this.a;
        float x = view.getX();
        float y = view.getY();
        PointF pointF = ((ba1) this.c).b;
        pointF.x = x;
        pointF.y = y;
    }

    public final boolean e(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        View view = this.a;
        if (action == 0) {
            this.o = motionEvent.getRawX();
            this.X = motionEvent.getRawY();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
        int action2 = motionEvent.getAction();
        if (action2 == 1) {
            a();
            return motionEvent.getAction() == 1 && motionEvent.getEventTime() - motionEvent.getDownTime() < 100;
        } else if (action2 == 2) {
            view.setTranslationX((motionEvent.getRawX() - this.o) + view.getTranslationX());
            view.setTranslationY((motionEvent.getRawY() - this.X) + view.getTranslationY());
            this.o = motionEvent.getRawX();
            this.X = motionEvent.getRawY();
            this.b.T(view.getX(), view.getY());
            return true;
        } else if (action2 != 3) {
            return true;
        } else {
            a();
            return true;
        }
    }

    public final void i(float f, float f2) {
        View view = this.a;
        view.setTranslationX(f);
        view.setTranslationY(f2);
        a();
    }

    public final void j(float f, float f2, int i, int i2, j1b j1b) {
        this.Y = kq0.d(this.a.getContext(), f, f2, i, i2, j1b);
    }
}
