package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;

/* renamed from: q53  reason: default package */
public final class q53 extends bl8 implements z43 {
    public final e53 C0;

    public q53(Context context) {
        super(context);
        this.C0 = new e53(context, this);
        setTransitionGroup(true);
    }

    public final int b(int i, int i2) {
        e53 e53 = this.C0;
        int i3 = e53.c;
        e53.b(i, i2);
        return e53.d;
    }

    public final void d(MotionEvent motionEvent, int[] iArr) {
        this.C0.e(tu0.G(motionEvent.getX()), tu0.G(motionEvent.getY()), iArr);
    }

    public final boolean h(MotionEvent motionEvent) {
        return false;
    }

    public final void invalidateDrawable(Drawable drawable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.invalidateDrawable(drawable);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new m53(this, drawable, 0));
        } else {
            post(new n53(this, drawable, 0));
        }
    }

    public final a53 n(MotionEvent motionEvent) {
        return this.C0.a(tu0.G(motionEvent.getX()), tu0.G(motionEvent.getY()));
    }

    public final void onDraw(Canvas canvas) {
        float measuredWidth = (float) getMeasuredWidth();
        float measuredHeight = (float) getMeasuredHeight();
        float f = (float) 2;
        Matrix a = k78.a();
        a.reset();
        a.setScale((measuredWidth - ((fk4.d().getDisplayMetrics().density * 1.0f) * f)) / measuredWidth, (measuredHeight - ((1.0f * fk4.d().getDisplayMetrics().density) * f)) / measuredHeight, measuredWidth / 2.0f, measuredHeight / 2.0f);
        Path b = k78.b();
        b.reset();
        b.set(((vs8) getBackground()).a());
        b.transform(k78.a());
        Path b2 = k78.b();
        int save = canvas.save();
        canvas.clipPath(b2);
        try {
            dispatchDraw(canvas);
            e53 e53 = this.C0;
            int length = e53.h.length;
            for (int i = 0; i < length; i++) {
                umc e = e53.e.i(i).e();
                if (e != null) {
                    e.draw(canvas);
                }
            }
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.C0.e.p();
    }

    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.C0.e.r();
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.scheduleDrawable(drawable, runnable, j);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new o53(this, drawable, runnable, j, 0));
            return;
        }
        post(new o53(this, drawable, runnable, j, 1));
    }

    public void setOnFinalImageSetCallback(m56 m56) {
        this.C0.g = m56;
    }

    public final long t(int i, int i2, int i3, int i4) {
        e53 e53 = this.C0;
        e53.c(i2);
        return dy7.l(e53.c, e53.d);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.unscheduleDrawable(drawable, runnable);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new p53(this, drawable, runnable, 0));
        } else {
            post(new p53(this, drawable, runnable, 1));
        }
    }

    public final void v(x38 x38) {
        f53 f53 = (f53) x38;
        float[] fArr = f53.a;
        e53 e53 = this.C0;
        e53.h = fArr;
        e53.f.o1(e53, e53.k[0], f53.b);
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return this.C0.g(drawable) || super.verifyDrawable(drawable);
    }

    public final void unscheduleDrawable(Drawable drawable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.unscheduleDrawable(drawable);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new m53(this, drawable, 1));
        } else {
            post(new n53(this, drawable, 1));
        }
    }
}
