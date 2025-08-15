package ru.ok.messages.views.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;
import android.util.AttributeSet;
import one.me.sdk.zoom.ZoomableDraweeView;
import ru.ok.messages.views.ActAvatarCrop;
import ru.ok.tamtam.android.prefs.PmsKey;

public class AvatarCropView extends ZoomableDraweeView {
    public final int G0;
    public final int H0;
    public final int I0;
    public final int J0;
    public final Path K0;
    public final Paint L0;
    public final Paint M0;
    public final Rect N0;
    public int O0;
    public int P0 = 0;
    public gd0 Q0;

    public AvatarCropView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getContext();
        bk4 b = bk4.b();
        int i = b.n;
        this.G0 = i;
        this.H0 = b.D;
        this.I0 = i;
        this.J0 = b.A;
        z7d z7d = ((y8a) vl.b()).n().b;
        z7d.getClass();
        setZoomableController(new oz3(new b9b(new r68()), (int) z7d.q(PmsKey.f84minimagesidesize, (long) 64)));
        this.K0 = new Path();
        this.N0 = new Rect();
        Paint paint = new Paint();
        this.L0 = paint;
        paint.setColor(qp4.u0.j(this).b().e);
        this.L0.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.M0 = paint2;
        paint2.setColor(getResources().getColor(epc.f));
        this.M0.setStyle(Paint.Style.STROKE);
        this.M0.setAntiAlias(true);
        this.M0.setStrokeWidth((float) b.a);
    }

    public final void f(Matrix matrix) {
        super.f(matrix);
        ((ActAvatarCrop) this.Q0).Y0.setVisibility(0);
    }

    public final void o(ru6 ru6) {
        super.o(ru6);
        this.O0 = ru6.getWidth();
        ((oz3) getZoomableController()).e();
        if (this.P0 == 0) {
            ((oz3) getZoomableController()).d(this.O0);
        }
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.clipPath(this.K0, Region.Op.DIFFERENCE);
        canvas.drawRect(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getMeasuredHeight(), this.L0);
        canvas.restore();
        if (this.P0 == 1) {
            Canvas canvas2 = canvas;
            canvas2.drawRect((float) ((getMeasuredWidth() / 2) - (this.N0.width() / 2)), (float) ((getMeasuredHeight() / 2) - (this.N0.height() / 2)), (float) ((this.N0.width() / 2) + (getMeasuredWidth() / 2)), (float) ((this.N0.height() / 2) + (getMeasuredHeight() / 2)), this.M0);
            return;
        }
        canvas.drawCircle((float) this.N0.centerX(), (float) this.N0.centerY(), (float) (this.N0.width() / 2), this.M0);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ((oz3) getZoomableController()).e();
        if (this.O0 > 0 && this.P0 == 0) {
            ((oz3) getZoomableController()).d(this.O0);
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        super.onMeasure(i, i2);
        if (this.P0 == 1) {
            i3 = getMeasuredWidth() - (this.I0 * 2);
            i4 = getMeasuredHeight() - (this.J0 * 2);
        } else {
            i3 = Math.min(getMeasuredWidth() - (this.G0 * 2), getMeasuredHeight() - (this.H0 * 2));
            i4 = i3;
        }
        this.K0.reset();
        if (this.P0 == 1) {
            int i5 = i3 / 2;
            int i6 = i4 / 2;
            this.K0.addRect((float) ((getMeasuredWidth() / 2) - i5), (float) ((getMeasuredHeight() / 2) - i6), (float) ((getMeasuredWidth() / 2) + i5), (float) ((getMeasuredHeight() / 2) + i6), Path.Direction.CCW);
        } else {
            this.K0.addCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), (float) (i3 / 2), Path.Direction.CCW);
        }
        int i7 = i3 / 2;
        int i8 = i4 / 2;
        this.N0.set((getMeasuredWidth() / 2) - i7, (getMeasuredHeight() / 2) - i8, (getMeasuredWidth() / 2) + i7, (getMeasuredHeight() / 2) + i8);
        ((oz3) getZoomableController()).m = this.N0;
    }

    public void setMode(int i) {
        this.P0 = i;
        if (i == 1) {
            this.M0.setAlpha(255);
            ((oz3) getZoomableController()).o = false;
            return;
        }
        this.M0.setAlpha(50);
        ((oz3) getZoomableController()).o = true;
    }

    public void setTransformChangeListener(gd0 gd0) {
        this.Q0 = gd0;
    }
}
