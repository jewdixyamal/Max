package ru.ok.messages.views.widgets.audiowave;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ok/messages/views/widgets/audiowave/AudioWaveView;", "Landroid/view/View;", "Lkre;", "Ls70;", "listener", "Le5f;", "setListener", "(Ls70;)V", "", "B0", "Z", "isIncomingMessage", "()Z", "setIncomingMessage", "(Z)V", "", "getDataWidth", "()I", "dataWidth", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class AudioWaveView extends View implements kre {
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public s70 D0;
    public final byte[] E0;
    public final int[] a;
    public final float b;
    public final float c;
    public final float o;
    public final float s0;
    public byte[] t0;
    public int u0;
    public final Paint v0;
    public final Paint w0;
    public final Paint x0;
    public final Paint y0;
    public final Path z0;

    public AudioWaveView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final int getDataWidth() {
        byte[] bArr = this.t0;
        if (bArr == null) {
            return 0;
        }
        return (int) ((((float) (bArr.length - 1)) * this.c) + (((float) bArr.length) * this.o));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float a(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int[] r0 = r4.a
            r4.getLocationOnScreen(r0)
            r1 = 0
            r0 = r0[r1]
            float r5 = r5.getRawX()
            int r4 = r4.getWidth()
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            if (r4 != 0) goto L_0x0017
        L_0x0015:
            r5 = r2
            goto L_0x0029
        L_0x0017:
            int r3 = r0 + r4
            float r3 = (float) r3
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x0020
            r5 = r1
            goto L_0x0029
        L_0x0020:
            float r0 = (float) r0
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 > 0) goto L_0x0026
            goto L_0x0015
        L_0x0026:
            float r5 = r5 - r0
            float r4 = (float) r4
            float r5 = r5 / r4
        L_0x0029:
            int r4 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0035
            r4 = 0
            r2 = 1
            long r4 = r4 - r2
            float r4 = (float) r4
            float r5 = r1 / r4
        L_0x0035:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.views.widgets.audiowave.AudioWaveView.a(android.view.MotionEvent):float");
    }

    /* JADX INFO: finally extract failed */
    public final void onDraw(Canvas canvas) {
        float f;
        Path path = this.z0;
        if (!path.isEmpty()) {
            float measuredHeight = ((float) getMeasuredHeight()) / 2.0f;
            float width = ((((float) 0) / ((float) 0)) * ((float) getWidth())) + 0.5f;
            boolean z = this.C0;
            float G = (float) tu0.G(((float) 6) * getContext().getResources().getDisplayMetrics().density);
            if (this.C0) {
                G += (float) tu0.G(((float) 2) * getContext().getResources().getDisplayMetrics().density);
            }
            if (z) {
                canvas.save();
                float G2 = ((float) tu0.G(((float) 2) * getContext().getResources().getDisplayMetrics().density)) + G;
                f = width < G2 ? G2 : width;
                if (f > ((float) getWidth()) - G2) {
                    f = ((float) getWidth()) - G2;
                }
                s70 s70 = this.D0;
                if (s70 != null) {
                    s70.a(f);
                }
            } else {
                f = 0.0f;
            }
            Paint paint = this.v0;
            if (!z) {
                canvas.drawPath(path, paint);
                return;
            }
            int save = canvas.save();
            try {
                canvas.clipRect(0.0f, 0.0f, width, (float) canvas.getHeight());
                canvas.drawPath(path, this.w0);
                canvas.restoreToCount(save);
                int save2 = canvas.save();
                try {
                    canvas.clipRect(width, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight());
                    canvas.drawPath(path, paint);
                    canvas.restoreToCount(save2);
                    canvas.drawCircle(f, measuredHeight, this.s0 + G, this.y0);
                    canvas.drawCircle(f, measuredHeight, G, this.x0);
                } catch (Throwable th) {
                    canvas.restoreToCount(save2);
                    throw th;
                }
            } catch (Throwable th2) {
                canvas.restoreToCount(save);
                throw th2;
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public final void onThemeChanged(fka fka) {
        is0 is0;
        sme sme;
        sme sme2;
        if (this.B0) {
            if (isInEditMode()) {
                sme2 = ee4.e0;
            } else {
                Context context = getContext();
                khe khe = sme.a0;
                sme2 = fm9.R(context);
            }
            is0 = sme2.h;
        } else {
            if (isInEditMode()) {
                sme = ee4.e0;
            } else {
                Context context2 = getContext();
                khe khe2 = sme.a0;
                sme = fm9.R(context2);
            }
            is0 = sme.g;
        }
        this.v0.setColor(is0.a.f);
        Paint paint = this.x0;
        bs0 bs0 = is0.a;
        paint.setColor(bs0.e);
        this.y0.setColor(is0.c.a);
        this.w0.setColor(bs0.e);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r0 != 3) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            boolean r0 = r4.C0
            if (r0 == 0) goto L_0x0059
            int r0 = r5.getAction()
            r1 = 1
            if (r0 == 0) goto L_0x0042
            r2 = 0
            if (r0 == r1) goto L_0x002c
            r3 = 2
            if (r0 == r3) goto L_0x0015
            r3 = 3
            if (r0 == r3) goto L_0x002c
            goto L_0x0058
        L_0x0015:
            boolean r0 = r4.C0
            if (r0 != 0) goto L_0x001a
            goto L_0x0058
        L_0x001a:
            boolean r0 = r4.A0
            if (r0 == 0) goto L_0x0020
            r4.A0 = r2
        L_0x0020:
            s70 r0 = r4.D0
            if (r0 == 0) goto L_0x0058
            float r4 = r4.a(r5)
            r0.d(r4)
            goto L_0x0058
        L_0x002c:
            r4.A0 = r2
            r4.C0 = r2
            s70 r0 = r4.D0
            if (r0 == 0) goto L_0x003a
            r4.a(r5)
            r0.b()
        L_0x003a:
            android.view.ViewParent r4 = r4.getParent()
            r4.requestDisallowInterceptTouchEvent(r2)
            goto L_0x0058
        L_0x0042:
            r4.A0 = r1
            r4.C0 = r1
            android.view.ViewParent r0 = r4.getParent()
            r0.requestDisallowInterceptTouchEvent(r1)
            s70 r0 = r4.D0
            if (r0 == 0) goto L_0x0058
            float r4 = r4.a(r5)
            r0.e(r4)
        L_0x0058:
            return r1
        L_0x0059:
            boolean r4 = super.onTouchEvent(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.views.widgets.audiowave.AudioWaveView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setIncomingMessage(boolean z) {
        this.B0 = z;
    }

    public final void setListener(s70 s70) {
        this.D0 = s70;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AudioWaveView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.a = new int[2];
        this.z0 = new Path();
        setLayerType(1, (Paint) null);
        this.b = fk4.d().getDisplayMetrics().density * 5.0f;
        this.c = fk4.d().getDisplayMetrics().density * 2.0f;
        float f = fk4.d().getDisplayMetrics().density * 2.0f;
        this.o = f;
        this.s0 = fk4.d().getDisplayMetrics().density * 2.0f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(f);
        this.v0 = paint;
        Paint paint2 = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.x0 = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        this.y0 = paint3;
        this.w0 = new Paint(paint);
        c54.c(this);
        if (c54.K(this)) {
            setScaleX(-1.0f);
        }
        this.E0 = new byte[0];
    }
}
