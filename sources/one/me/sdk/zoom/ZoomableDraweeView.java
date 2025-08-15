package one.me.sdk.zoom;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;

public class ZoomableDraweeView extends na6 implements iag {
    public static final /* synthetic */ int F0 = 0;
    public volatile fre A0 = null;
    public final Runnable B0 = new kag(this, 0);
    public final n5 C0 = new n5(5, this);
    public mq4 D0;
    public jag E0 = new uf4(new b9b(new r68()));
    public final RectF v0 = new RectF();
    public final RectF w0 = new RectF();
    public boolean x0;
    public GestureDetector y0;
    public lag z0;

    public ZoomableDraweeView(Context context) {
        super(context);
        m();
    }

    public void f(Matrix matrix) {
        ta5.d(ZoomableDraweeView.class, Integer.valueOf(hashCode()), "onTransformChanged: view %x");
        if (this.D0 != null && f46.K(((uf4) this.E0).k) > 1.1f) {
            p(this.D0);
        }
        invalidate();
    }

    public jag getZoomableController() {
        return this.E0;
    }

    public final void invalidateDrawable(Drawable drawable) {
        removeCallbacks(this.A0);
        this.A0 = new fre(this, 23, drawable);
        br7.N(this, this.A0);
    }

    public final void m() {
        ((uf4) this.E0).b = this;
        this.y0 = new GestureDetector(getContext(), new q00(19, this));
    }

    public void n(Throwable th) {
        ta5.d(ZoomableDraweeView.class, Integer.valueOf(hashCode()), "onFinalImageSet: view %x");
        lag lag = this.z0;
        if (lag != null) {
            lag.d(th);
        }
        requestLayout();
        postInvalidate();
    }

    public void o(ru6 ru6) {
        ta5.d(ZoomableDraweeView.class, Integer.valueOf(hashCode()), "onFinalImageSet: view %x");
        if (!((uf4) this.E0).c) {
            q();
            jag jag = this.E0;
            boolean z = this.x0;
            uf4 uf4 = (uf4) jag;
            uf4.c = z;
            if (!z) {
                uf4.reset();
            }
        }
        requestLayout();
        postInvalidate();
    }

    public void onDraw(Canvas canvas) {
        int i = 0;
        boolean z = this.x0 && !((uf4) this.E0).k.isIdentity();
        if (z) {
            i = canvas.save();
            canvas.concat(((uf4) this.E0).k);
        }
        super.onDraw(canvas);
        if (z) {
            canvas.restoreToCount(i);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ta5.d(ZoomableDraweeView.class, Integer.valueOf(hashCode()), "onLayout: view %x");
        super.onLayout(z, i, i2, i3, i4);
        q();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        if (r1 != 6) goto L_0x018b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x019c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r15) {
        /*
            r14 = this;
            android.view.GestureDetector r0 = r14.y0
            r0.onTouchEvent(r15)
            jag r0 = r14.E0
            uf4 r0 = (defpackage.uf4) r0
            boolean r1 = r0.c
            if (r1 == 0) goto L_0x01a4
            b9b r0 = r0.a
            java.lang.Object r0 = r0.b
            r68 r0 = (defpackage.r68) r0
            r0.getClass()
            int r1 = r15.getActionMasked()
            r2 = 1
            r3 = 0
            java.lang.Cloneable r4 = r0.g
            float[] r4 = (float[]) r4
            java.lang.Cloneable r5 = r0.f
            float[] r5 = (float[]) r5
            java.lang.Object r6 = r0.c
            int[] r6 = (int[]) r6
            r7 = 6
            r8 = -1
            r9 = 2
            if (r1 == 0) goto L_0x0132
            if (r1 == r2) goto L_0x0132
            if (r1 == r9) goto L_0x0043
            r10 = 3
            if (r1 == r10) goto L_0x003b
            r10 = 5
            if (r1 == r10) goto L_0x0132
            if (r1 == r7) goto L_0x0132
            goto L_0x018b
        L_0x003b:
            r0.d()
            r0.b()
            goto L_0x018b
        L_0x0043:
            r1 = r3
        L_0x0044:
            if (r1 >= r9) goto L_0x005d
            r7 = r6[r1]
            int r7 = r15.findPointerIndex(r7)
            if (r7 == r8) goto L_0x005a
            float r10 = r15.getX(r7)
            r5[r1] = r10
            float r7 = r15.getY(r7)
            r4[r1] = r7
        L_0x005a:
            int r1 = r1 + 1
            goto L_0x0044
        L_0x005d:
            boolean r15 = r0.a
            if (r15 != 0) goto L_0x0065
            if (r15 != 0) goto L_0x0065
            r0.a = r2
        L_0x0065:
            boolean r15 = r0.a
            if (r15 == 0) goto L_0x018b
            java.lang.Object r15 = r0.h
            b9b r15 = (defpackage.b9b) r15
            if (r15 == 0) goto L_0x018b
            java.lang.Object r0 = r15.c
            uf4 r0 = (defpackage.uf4) r0
            if (r0 == 0) goto L_0x018b
            boolean r1 = r0.d
            if (r1 == 0) goto L_0x007b
            goto L_0x018b
        L_0x007b:
            android.graphics.Matrix r1 = r0.k
            android.graphics.Matrix r4 = r0.j
            r1.set(r4)
            java.lang.Object r15 = r15.b
            r68 r15 = (defpackage.r68) r15
            int r4 = r15.b
            java.lang.Cloneable r5 = r15.g
            float[] r5 = (float[]) r5
            java.lang.Cloneable r6 = r15.f
            float[] r6 = (float[]) r6
            java.io.Serializable r7 = r15.e
            float[] r7 = (float[]) r7
            java.lang.Object r8 = r15.d
            float[] r8 = (float[]) r8
            if (r4 >= r9) goto L_0x009d
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00c1
        L_0x009d:
            r4 = r8[r2]
            r9 = r8[r3]
            float r4 = r4 - r9
            r9 = r7[r2]
            r10 = r7[r3]
            float r9 = r9 - r10
            r10 = r6[r2]
            r11 = r6[r3]
            float r10 = r10 - r11
            r11 = r5[r2]
            r3 = r5[r3]
            float r11 = r11 - r3
            double r3 = (double) r4
            double r12 = (double) r9
            double r3 = java.lang.Math.hypot(r3, r12)
            float r3 = (float) r3
            double r9 = (double) r10
            double r11 = (double) r11
            double r9 = java.lang.Math.hypot(r9, r11)
            float r4 = (float) r9
            float r3 = r4 / r3
        L_0x00c1:
            java.lang.Object r4 = r15.d
            float[] r4 = (float[]) r4
            int r9 = r15.b
            float r4 = defpackage.b9b.f(r9, r4)
            java.io.Serializable r9 = r15.e
            float[] r9 = (float[]) r9
            int r10 = r15.b
            float r9 = defpackage.b9b.f(r10, r9)
            r1.postScale(r3, r3, r4, r9)
            java.lang.Object r3 = r15.d
            float[] r3 = (float[]) r3
            int r4 = r15.b
            float r3 = defpackage.b9b.f(r4, r3)
            java.io.Serializable r4 = r15.e
            float[] r4 = (float[]) r4
            int r9 = r15.b
            float r4 = defpackage.b9b.f(r9, r4)
            float r9 = defpackage.f46.K(r1)
            float r10 = r0.e
            int r11 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r11 >= 0) goto L_0x0100
            float r10 = r10 / r9
            r1.postScale(r10, r10, r3, r4)
            b9b r3 = r0.a
            r3.q()
            goto L_0x010a
        L_0x0100:
            float r10 = r0.f
            int r11 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r11 <= 0) goto L_0x010a
            float r10 = r10 / r9
            r1.postScale(r10, r10, r3, r4)
        L_0x010a:
            int r3 = r15.b
            float r3 = defpackage.b9b.f(r3, r6)
            int r4 = r15.b
            float r4 = defpackage.b9b.f(r4, r8)
            float r3 = r3 - r4
            int r4 = r15.b
            float r4 = defpackage.b9b.f(r4, r5)
            int r15 = r15.b
            float r15 = defpackage.b9b.f(r15, r7)
            float r4 = r4 - r15
            r1.postTranslate(r3, r4)
            r0.b()
            iag r15 = r0.b
            if (r15 == 0) goto L_0x018b
            r15.f(r1)
            goto L_0x018b
        L_0x0132:
            boolean r1 = r0.a
            r0.d()
            r0.b()
        L_0x013a:
            if (r3 >= r9) goto L_0x017f
            int r10 = r15.getPointerCount()
            int r11 = r15.getActionMasked()
            int r12 = r15.getActionIndex()
            if (r11 == r2) goto L_0x014c
            if (r11 != r7) goto L_0x0151
        L_0x014c:
            if (r3 < r12) goto L_0x0151
            int r11 = r3 + 1
            goto L_0x0152
        L_0x0151:
            r11 = r3
        L_0x0152:
            if (r11 >= r10) goto L_0x0155
            goto L_0x0156
        L_0x0155:
            r11 = r8
        L_0x0156:
            if (r11 != r8) goto L_0x0159
            goto L_0x017f
        L_0x0159:
            int r10 = r15.getPointerId(r11)
            r6[r3] = r10
            float r10 = r15.getX(r11)
            java.lang.Object r12 = r0.d
            float[] r12 = (float[]) r12
            r12[r3] = r10
            r5[r3] = r10
            float r10 = r15.getY(r11)
            java.io.Serializable r11 = r0.e
            float[] r11 = (float[]) r11
            r11[r3] = r10
            r4[r3] = r10
            int r10 = r0.b
            int r10 = r10 + r2
            r0.b = r10
            int r3 = r3 + 1
            goto L_0x013a
        L_0x017f:
            if (r1 == 0) goto L_0x018b
            int r15 = r0.b
            if (r15 <= 0) goto L_0x018b
            boolean r15 = r0.a
            if (r15 != 0) goto L_0x018b
            r0.a = r2
        L_0x018b:
            jag r15 = r14.E0
            uf4 r15 = (defpackage.uf4) r15
            android.graphics.Matrix r15 = r15.k
            float r15 = defpackage.f46.K(r15)
            r0 = 1066192077(0x3f8ccccd, float:1.1)
            int r15 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r15 <= 0) goto L_0x01a3
            android.view.ViewParent r14 = r14.getParent()
            r14.requestDisallowInterceptTouchEvent(r2)
        L_0x01a3:
            return r2
        L_0x01a4:
            boolean r14 = super.onTouchEvent(r15)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.zoom.ZoomableDraweeView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(mq4 mq4) {
        mq4 controller = getController();
        if (controller instanceof k0) {
            k0 k0Var = (k0) controller;
            n5 n5Var = this.C0;
            k0Var.getClass();
            n5Var.getClass();
            ev3 ev3 = k0Var.f;
            if (ev3 instanceof j0) {
                j0 j0Var = (j0) ev3;
                synchronized (j0Var) {
                    int indexOf = j0Var.a.indexOf(n5Var);
                    if (indexOf != -1) {
                        j0Var.a.set(indexOf, (Object) null);
                    }
                }
            } else if (ev3 == n5Var) {
                k0Var.f = null;
            }
        }
        if (mq4 instanceof k0) {
            ((k0) mq4).a(this.C0);
        }
        this.D0 = null;
        super.setController(mq4);
    }

    public final void q() {
        g06 g06 = ((la6) getHierarchy()).f;
        Matrix matrix = g06.o;
        g06.n(matrix);
        Rect bounds = g06.getBounds();
        RectF rectF = this.v0;
        rectF.set(bounds);
        matrix.mapRect(rectF);
        RectF rectF2 = this.w0;
        rectF2.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
        ((uf4) this.E0).h.set(rectF);
        ((uf4) this.E0).g.set(rectF2);
        ta5.f(ZoomableDraweeView.class, "updateZoomableControllerBounds: view %x, view bounds: %s, image bounds: %s", Integer.valueOf(hashCode()), rectF2, rectF);
    }

    public void setController(mq4 mq4) {
        p((mq4) null);
        uf4 uf4 = (uf4) this.E0;
        uf4.c = false;
        uf4.reset();
        p(mq4);
    }

    public void setListener(lag lag) {
        this.z0 = lag;
    }

    public void setZoomEnabled(boolean z) {
        this.x0 = z;
        jag jag = this.E0;
        if (jag != null) {
            uf4 uf4 = (uf4) jag;
            uf4.c = z;
            if (!z) {
                uf4.reset();
            }
        }
    }

    public void setZoomableController(jag jag) {
        jag.getClass();
        ((uf4) this.E0).b = null;
        this.E0 = jag;
        ((uf4) jag).b = this;
    }

    public ZoomableDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m();
    }

    public ZoomableDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        m();
    }
}
