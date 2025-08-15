package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: sp0  reason: default package */
public final class sp0 extends Drawable {
    public static final int[] n = new int[2];
    public static final int[] o = new int[2];
    public final int a;
    public final boolean b;
    public op0 c;
    public final khe d;
    public final qp0 e;
    public boolean f;
    public Bitmap g;
    public pp0 h;
    public k56 i;
    public k56 j;
    public final float k;
    public boolean l;
    public final rp0 m;

    public sp0(Context context, int i2, float f2, boolean z, boolean z2) {
        this.a = i2;
        this.b = z;
        this.c = (z2 || Build.VERSION.SDK_INT < 31) ? new bme(context) : new aea(1);
        this.d = new khe(new a5(context, 5));
        this.e = new qp0(0, this);
        this.k = f2;
        this.m = new rp0(this, context, z2);
    }

    public final View a() {
        Drawable.Callback callback = getCallback();
        while (callback != null) {
            if (callback instanceof Drawable) {
                callback = ((Drawable) callback).getCallback();
            }
            if (callback instanceof View) {
                return (View) callback;
            }
        }
        return null;
    }

    public final void b(boolean z) {
        View rootView;
        View a2 = a();
        if (a2 != null && (rootView = a2.getRootView()) != null) {
            ViewTreeObserver viewTreeObserver = a2.getViewTreeObserver();
            qp0 qp0 = this.e;
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnPreDrawListener(qp0);
            }
            ViewTreeObserver viewTreeObserver2 = rootView.getViewTreeObserver();
            if (viewTreeObserver2 != null) {
                viewTreeObserver2.removeOnPreDrawListener(qp0);
            }
            if (z) {
                rootView.getViewTreeObserver().addOnPreDrawListener(qp0);
                if (!tpa.f(rootView.getWindowId(), a2.getWindowId())) {
                    a2.getViewTreeObserver().addOnPreDrawListener(qp0);
                }
            }
        }
    }

    public final void c() {
        Bitmap bitmap;
        View a2;
        op0 op0;
        pp0 pp0 = this.h;
        if (pp0 != null && (bitmap = this.g) != null && (a2 = a()) != null && (op0 = this.c) != null) {
            View rootView = a2.getRootView();
            bitmap.eraseColor(0);
            pp0.save();
            k56 k56 = this.i;
            if (k56 != null) {
                k56.invoke();
            }
            int[] iArr = n;
            rootView.getLocationOnScreen(iArr);
            int[] iArr2 = o;
            a2.getLocationOnScreen(iArr2);
            int i2 = iArr2[1] - iArr[1];
            float height = ((float) a2.getHeight()) / ((float) bitmap.getHeight());
            float width = ((float) a2.getWidth()) / ((float) bitmap.getWidth());
            pp0.translate(((float) (-(iArr2[0] - iArr[0]))) / width, ((float) (-i2)) / height);
            float f2 = (float) 1;
            pp0.scale(f2 / width, f2 / height);
            try {
                rootView.draw(pp0);
            } catch (Throwable th) {
                hm9.l0(sp0.class.getName(), "fail to draw blur", th);
            }
            pp0.restore();
            if (!bitmap.isRecycled()) {
                op0.d(bitmap, this.k);
                this.f = true;
            }
            k56 k562 = this.j;
            if (k562 != null) {
                k562.invoke();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        if (this.f && !(canvas instanceof pp0) && (bitmap = this.g) != null && !bitmap.isRecycled()) {
            float width = ((float) getBounds().width()) / ((float) bitmap.getWidth());
            float height = ((float) getBounds().height()) / ((float) bitmap.getHeight());
            int save = canvas.save();
            canvas.scale(width, height, 0.0f, 0.0f);
            try {
                if (canvas.isHardwareAccelerated()) {
                    op0 op0 = this.c;
                    if (op0 != null) {
                        op0.c(canvas, bitmap);
                    }
                } else {
                    ((bme) this.d.getValue()).c(canvas, bitmap);
                }
                canvas.restoreToCount(save);
                int i2 = this.a;
                if (i2 != 0) {
                    canvas.drawColor(i2);
                }
            } catch (Throwable th) {
                canvas.restoreToCount(save);
                throw th;
            }
        }
    }

    public final int getOpacity() {
        return -1;
    }

    public final void invalidateSelf() {
        super.invalidateSelf();
        c();
        if (!this.l) {
            View a2 = a();
            if (a2 != null) {
                a2.addOnAttachStateChangeListener(this.m);
            }
            this.l = true;
        }
    }

    /* JADX WARNING: type inference failed for: r6v5, types: [pp0, android.graphics.Canvas] */
    public final void onBoundsChange(Rect rect) {
        b(this.b);
        int width = rect.width();
        int height = rect.height();
        if (((int) Math.ceil((double) (((float) width) / 6.0f))) != 0 && ((int) Math.ceil((double) (((float) height) / 6.0f))) != 0) {
            this.f = false;
            int ceil = (int) Math.ceil((double) (((float) rect.width()) / 6.0f));
            int i2 = ceil % 64;
            if (i2 != 0) {
                ceil = (ceil - i2) + 64;
            }
            int ceil2 = (int) Math.ceil((double) (((float) rect.height()) / (((float) rect.width()) / ((float) ceil))));
            Bitmap bitmap = this.g;
            if (bitmap == null || bitmap.isRecycled() || ceil >= bitmap.getWidth() || ceil2 >= bitmap.getHeight()) {
                bitmap = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                Bitmap bitmap2 = this.g;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                this.g = bitmap;
            } else {
                bitmap.reconfigure(ceil, ceil2, Bitmap.Config.ARGB_8888);
            }
            this.h = new Canvas(bitmap);
            c();
        }
    }

    public final void setAlpha(int i2) {
        op0 op0 = this.c;
        if (op0 != null) {
            op0.p(i2);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
