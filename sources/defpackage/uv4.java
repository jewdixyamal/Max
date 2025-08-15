package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ru.ok.tamtam.photoeditor.view.EditorSurfaceViewContainer;

/* renamed from: uv4  reason: default package */
public final class uv4 extends View implements pv4, ScaleGestureDetector.OnScaleGestureListener {
    public ArrayList a;
    public ScaleGestureDetector b;
    public tv4 c;
    public Matrix o;
    public Matrix s0;
    public Float t0;
    public Float u0;
    public float[] v0;
    public float w0;
    public Rect x0;
    public boolean y0;
    public sv4 z0;

    private Matrix getCorrectionMatrix() {
        Matrix matrix;
        float f;
        float f2;
        Matrix matrix2 = this.o;
        float[] fArr = this.v0;
        matrix2.getValues(fArr);
        float f3 = fArr[0];
        if (f3 < 1.0f) {
            Matrix matrix3 = new Matrix();
            matrix3.setScale(1.0f, 1.0f, 0.5f, 0.5f);
            return matrix3;
        }
        if (f3 > this.w0) {
            matrix = new Matrix(matrix2);
            float f4 = this.w0 / f3;
            matrix.postScale(f4, f4, (float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2));
        } else {
            matrix = null;
        }
        RectF rectF = new RectF(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getMeasuredHeight());
        if (matrix != null) {
            matrix.mapRect(rectF);
        } else {
            matrix2.mapRect(rectF);
        }
        if (rectF.right < ((float) getMeasuredWidth())) {
            f = ((float) getMeasuredWidth()) - rectF.right;
        } else {
            float f5 = rectF.left;
            f = f5 > 0.0f ? -f5 : 0.0f;
        }
        if (rectF.bottom < ((float) getMeasuredHeight())) {
            f2 = ((float) getMeasuredHeight()) - rectF.bottom;
        } else {
            float f6 = rectF.top;
            f2 = f6 > 0.0f ? -f6 : 0.0f;
        }
        if (!(f == 0.0f && f2 == 0.0f)) {
            if (matrix == null) {
                matrix = new Matrix(matrix2);
            }
            matrix.postTranslate(f, f2);
        }
        return matrix;
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        canvas.save();
        canvas.concat(this.o);
        Rect rect = this.x0;
        if (rect != null) {
            canvas.clipRect(rect);
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((nv4) it.next()).draw(canvas);
        }
        canvas.restore();
    }

    public Rect getBounds() {
        Rect rect = this.x0;
        return rect != null ? rect : new Rect(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public List<nv4> getLayers() {
        return Collections.unmodifiableList(this.a);
    }

    public Rect getResultBounds() {
        sv4 sv4;
        Rect rect = this.x0;
        if (rect == null) {
            rect = new Rect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.y0 && (sv4 = this.z0) != null) {
            EditorSurfaceViewContainer editorSurfaceViewContainer = (EditorSurfaceViewContainer) sv4;
            editorSurfaceViewContainer.getClass();
            int i = rect.right;
            int i2 = rect.left;
            int i3 = i - i2;
            int i4 = rect.bottom;
            int i5 = rect.top;
            if (i4 - i5 >= i3) {
                rect.top = editorSurfaceViewContainer.a.getHeight() + i5;
                rect.bottom -= editorSurfaceViewContainer.b.getHeight();
            } else {
                rect.left = editorSurfaceViewContainer.a.getWidth() + i2;
                rect.right -= editorSurfaceViewContainer.b.getWidth();
            }
        }
        return rect;
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        float focusX = scaleGestureDetector.getFocusX();
        float focusY = scaleGestureDetector.getFocusY();
        Matrix matrix = this.o;
        matrix.postScale(scaleFactor, scaleFactor, focusX, focusY);
        Float f = this.t0;
        if (!(f == null || this.u0 == null)) {
            matrix.postTranslate(focusX - f.floatValue(), focusY - this.u0.floatValue());
        }
        matrix.invert(this.s0);
        this.t0 = Float.valueOf(focusX);
        this.u0 = Float.valueOf(focusY);
        invalidate();
        return true;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        tv4 tv4 = this.c;
        if (tv4 == null) {
            return true;
        }
        qv4 qv4 = (qv4) tv4;
        imc imc = qv4.c;
        if (imc != null) {
            imc.O().a(qv4.a);
        }
        qv4.c = null;
        return true;
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.t0 = null;
        this.u0 = null;
        Matrix correctionMatrix = getCorrectionMatrix();
        if (correctionMatrix != null) {
            Matrix matrix = this.o;
            float[] fArr = this.v0;
            matrix.getValues(fArr);
            float[] fArr2 = new float[9];
            correctionMatrix.getValues(fArr2);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat.addUpdateListener(new rv4(this, new float[9], fArr, fArr2, 0));
            ofFloat.addListener(new eh(this, fArr2, false, 4));
            ofFloat.setDuration(150);
            ofFloat.start();
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        sv4 sv4;
        tv4 tv4;
        if (this.y0 && (sv4 = this.z0) != null) {
            EditorSurfaceViewContainer editorSurfaceViewContainer = (EditorSurfaceViewContainer) sv4;
            editorSurfaceViewContainer.getClass();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            View view = editorSurfaceViewContainer.a;
            Rect rect = editorSurfaceViewContainer.s0;
            view.getHitRect(rect);
            View view2 = editorSurfaceViewContainer.b;
            Rect rect2 = editorSurfaceViewContainer.t0;
            view2.getHitRect(rect2);
            if (rect.contains(x, y) || rect2.contains(x, y)) {
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (tv4 = this.c) != null) {
                    ((qv4) tv4).c(motionEvent);
                }
                return true;
            }
        }
        this.b.onTouchEvent(motionEvent);
        if (!(this.c == null || motionEvent == null || this.b.isInProgress())) {
            motionEvent.transform(this.s0);
            ((qv4) this.c).c(motionEvent);
        }
        return true;
    }

    public void setBoundingListener(sv4 sv4) {
        this.z0 = sv4;
    }

    public void setBounds(Rect rect) {
        this.x0 = rect;
        invalidate();
    }

    public void setDrawStickerEnabled(boolean z) {
        if (z != this.y0) {
            this.y0 = z;
            sv4 sv4 = this.z0;
            if (sv4 != null) {
                sv4.setDrawStickerEnabled(z);
            }
        }
    }

    public void setListener(tv4 tv4) {
        this.c = tv4;
    }

    public void setMaxZoom(float f) {
        this.w0 = f;
    }
}
