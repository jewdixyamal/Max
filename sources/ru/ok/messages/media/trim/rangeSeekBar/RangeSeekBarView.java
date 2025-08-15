package ru.ok.messages.media.trim.rangeSeekBar;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.LongSparseArray;
import android.view.View;
import java.util.Set;
import ru.ok.messages.media.trim.FrgTrimVideo;

public class RangeSeekBarView extends View implements gqb {
    public static int Q0 = 0;
    public static float R0 = 1.0f;
    public static float S0 = 1.0f;
    public float A0;
    public float B0;
    public float C0;
    public float D0;
    public long E0;
    public boolean F0;
    public final LongSparseArray G0 = new LongSparseArray();
    public Rect H0;
    public FrgTrimVideo I0;
    public sd7 J0;
    public final Paint K0;
    public int L0;
    public float M0;
    public long N0;
    public final bk4 O0;
    public final boolean P0;
    public final int a;
    public final int b;
    public final int c;
    public u3a o;
    public final int s0;
    public final Paint t0;
    public int u0;
    public f5b v0;
    public aq0 w0;
    public aq0 x0;
    public boolean y0;
    public float z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RangeSeekBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        boolean z = false;
        getContext();
        bk4 b2 = bk4.b();
        this.O0 = b2;
        int i = b2.h;
        this.a = i;
        int i2 = b2.e;
        this.b = i2;
        this.c = i + i2;
        Paint paint = new Paint();
        this.t0 = paint;
        Context context2 = getContext();
        khe khe = sme.a0;
        sme R = fm9.R(context2);
        paint.setColor(ote.b0(R.m, 0.8f));
        Paint paint2 = new Paint();
        this.K0 = paint2;
        paint2.setColor(R.m);
        paint2.setStrokeWidth(1.0f);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        this.s0 = b2.z;
        setLayerType(1, (Paint) null);
        this.P0 = getContext().getResources().getConfiguration().getLayoutDirection() == 1 ? true : z;
    }

    public final void a() {
        int i = this.u0;
        if (i == 0) {
            if (this.w0.b() > this.x0.b()) {
                this.w0.e(this.x0.b());
            } else if (this.w0.b() < 0.0f) {
                this.w0.e(0.0f);
            }
            if (this.x0.b() - this.w0.b() > this.A0) {
                this.w0.e(this.x0.b() - this.A0);
            } else if (this.x0.b() - this.w0.b() < this.z0) {
                this.w0.e(this.x0.b() - this.z0);
            }
        } else if (i == 1) {
            if (this.x0.b() < this.w0.b()) {
                this.x0.e(this.w0.b());
            } else {
                float b2 = this.x0.b();
                float f = R0;
                if (b2 > f) {
                    this.x0.e(f);
                }
            }
            if (this.x0.b() - this.w0.b() > this.A0) {
                this.x0.e(this.w0.b() + this.A0);
            } else if (this.x0.b() - this.w0.b() < this.z0) {
                this.x0.e(this.w0.b() + this.z0);
            }
        }
        if (this.v0.a() < this.w0.b()) {
            this.v0.c(this.w0.b());
            this.y0 = true;
        } else if (this.v0.a() > this.x0.b()) {
            this.v0.c(this.x0.b());
            this.y0 = true;
        }
        getContext();
        float f2 = this.x0.j.left - ((float) (this.O0.j * 2));
        aq0 aq0 = this.w0;
        RectF rectF = aq0.j;
        float f3 = rectF.right;
        if (((float) bk4.a(48.0f)) > f2 - f3) {
            aq0.d();
            this.x0.d();
            return;
        }
        RectF rectF2 = aq0.k;
        float f4 = rectF.left;
        float f5 = (float) aq0.d;
        rectF2.set(f4 - f5, rectF.top, f3 + f5, rectF.bottom);
        aq0 aq02 = this.x0;
        RectF rectF3 = aq02.k;
        RectF rectF4 = aq02.j;
        float f6 = rectF4.left;
        float f7 = (float) aq02.d;
        rectF3.set(f6 - f7, rectF4.top, rectF4.right + f7, rectF4.bottom);
    }

    public final float b(float f) {
        return (((f - 0.0f) / S0) * ((float) Q0)) + ((float) this.O0.j) + ((float) this.a);
    }

    public final float c(float f) {
        return ((((f - ((float) this.O0.j)) - ((float) this.a)) * S0) / ((float) Q0)) + 0.0f;
    }

    public final int d(long j) {
        long j2 = this.E0;
        return ((int) (((((float) j) - (0.0f * ((float) j2))) / (S0 * ((float) j2))) * ((float) Q0))) + this.O0.j + this.a;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cqc.b(this.J0);
    }

    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        if (this.F0) {
            boolean z = this.P0;
            if (z) {
                canvas.save();
                canvas2.scale(-1.0f, 1.0f, (float) (canvas.getWidth() / 2), (float) (canvas.getHeight() / 2));
            }
            canvas.save();
            canvas2.translate(0.0f, (float) this.b);
            if (this.N0 != 0) {
                canvas.save();
                canvas2.clipRect(this.H0);
                long j = this.N0;
                long j2 = (((long) (((float) this.E0) * 0.0f)) / j) * j;
                long j3 = (j * ((long) (((int) this.M0) + 2))) + j2;
                int d = d(j2);
                int d2 = d(j3);
                int i = d;
                while (i < d2) {
                    float f = (float) i;
                    float f2 = f;
                    int i2 = i;
                    canvas.drawLine(f, (float) 0, f2, (float) this.L0, this.K0);
                    i = i2 + this.L0;
                    j3 = j3;
                }
                long j4 = j3;
                LongSparseArray longSparseArray = this.G0;
                if (longSparseArray.size() != 0) {
                    if (z) {
                        canvas.save();
                        canvas2.scale(-1.0f, 1.0f, (float) (canvas.getWidth() / 2), (float) (canvas.getHeight() / 2));
                    }
                    for (int i3 = 0; i3 < longSparseArray.size(); i3++) {
                        long keyAt = longSparseArray.keyAt(i3);
                        int d3 = d(keyAt);
                        if (z) {
                            d3 = getWidth() - d3;
                        }
                        if (keyAt > j2 || keyAt < j4) {
                            canvas2.drawBitmap((Bitmap) longSparseArray.valueAt(i3), (float) d3, (float) 0, (Paint) null);
                        }
                    }
                    if (z) {
                        canvas.restore();
                    }
                }
                canvas.restore();
            }
            float b2 = this.w0.b();
            bk4 bk4 = this.O0;
            int i4 = (b2 > c((float) (bk4.j / 2)) ? 1 : (b2 == c((float) (bk4.j / 2)) ? 0 : -1));
            Paint paint = this.t0;
            if (i4 > 0) {
                canvas.drawRect(b(0.0f), (float) 0, b(this.w0.b()) - ((float) (bk4.j / 2)), (float) bk4.z, paint);
            }
            if (this.x0.b() < R0 - (c((float) (bk4.j / 2)) - 0.0f)) {
                Canvas canvas3 = canvas;
                canvas3.drawRect(((float) (bk4.j / 2)) + b(this.x0.b()), (float) 0, b(R0), (float) bk4.z, paint);
            }
            this.w0.a(canvas2);
            this.x0.a(canvas2);
            canvas.restore();
            f5b f5b = this.v0;
            RectF rectF = f5b.i;
            canvas2.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.width() / 2.0f, f5b.c);
            RectF rectF2 = f5b.j;
            Paint paint2 = f5b.e;
            canvas2.drawRect(rectF2, paint2);
            canvas2.drawRect(f5b.k, paint2);
            canvas2.drawCircle(f5b.g.centerX(), (float) f5b.f, (float) f5b.b, f5b.d);
            if (z) {
                canvas.restore();
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        bk4 bk4 = this.O0;
        setMeasuredDimension(View.MeasureSpec.getSize(i), bk4.z + this.c + bk4.h + bk4.i);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int width = getWidth();
        bk4 bk4 = this.O0;
        int i5 = width - (bk4.j * 2);
        int i6 = this.a;
        Q0 = i5 - (i6 * 2);
        this.v0 = new f5b(this.b + bk4.z + this.c + bk4.h, getContext(), this);
        int i7 = 0;
        this.w0 = new aq0(0, getContext(), this);
        this.x0 = new aq0(1, getContext(), this);
        this.w0.e(this.B0);
        this.x0.e(this.C0);
        this.v0.c(this.D0);
        this.u0 = 1;
        a();
        this.u0 = 3;
        int i8 = bk4.j + i6;
        int i9 = this.s0;
        this.H0 = new Rect(i8, 0, Q0 + i8, i9);
        this.L0 = i9;
        float width2 = ((float) (getWidth() - (bk4.j * 2))) / ((float) this.L0);
        this.M0 = width2;
        this.N0 = (long) ((int) ((S0 * ((float) this.E0)) / width2));
        cqc.b(this.J0);
        LongSparseArray longSparseArray = this.G0;
        longSparseArray.clear();
        long j = this.N0;
        if (j != 0) {
            long j2 = (((long) (0.0f * ((float) this.E0))) / j) * j;
            long j3 = (j * ((long) (((int) this.M0) + 2))) + j2;
            while (i7 < longSparseArray.size()) {
                long keyAt = longSparseArray.keyAt(i7);
                long j4 = this.N0 * 30;
                if (keyAt < j2 - j4 || keyAt > j4 + j3) {
                    longSparseArray.removeAt(i7);
                    i7--;
                }
                i7++;
            }
            r0a n = new hb3(2, new lt1((Object) this, j2, 7)).r(muc.a()).n(ce.a());
            sd7 sd7 = new sd7(new yt8(25, (Object) this), new p4c(0), ft.d);
            n.a(sd7);
            this.J0 = sd7;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        if (r2 != 3) goto L_0x02c0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            aq0 r0 = r10.w0
            r1 = 0
            if (r0 == 0) goto L_0x02d3
            aq0 r0 = r10.x0
            if (r0 == 0) goto L_0x02d3
            f5b r0 = r10.v0
            if (r0 != 0) goto L_0x000f
            goto L_0x02d3
        L_0x000f:
            boolean r0 = r10.P0
            if (r0 == 0) goto L_0x0024
            int r2 = r10.getWidth()
            float r2 = (float) r2
            float r3 = r11.getX()
            float r2 = r2 - r3
            float r3 = r11.getY()
            r11.setLocation(r2, r3)
        L_0x0024:
            int r2 = r11.getAction()
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0263
            java.lang.String r6 = "ru.ok.messages.media.trim.rangeSeekBar.RangeSeekBarView"
            java.lang.String r7 = "Unknown moving type: %s"
            if (r2 == r5) goto L_0x0179
            if (r2 == r4) goto L_0x0039
            if (r2 == r3) goto L_0x0179
            goto L_0x02c0
        L_0x0039:
            int r2 = r10.u0
            if (r2 == 0) goto L_0x005b
            if (r2 == r5) goto L_0x0055
            if (r2 == r4) goto L_0x004f
            if (r2 == r3) goto L_0x0176
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            defpackage.hm9.q(r6, r7, r2)
            goto L_0x0060
        L_0x004f:
            f5b r2 = r10.v0
            r2.b(r11)
            goto L_0x0060
        L_0x0055:
            aq0 r2 = r10.x0
            r2.c(r11)
            goto L_0x0060
        L_0x005b:
            aq0 r2 = r10.w0
            r2.c(r11)
        L_0x0060:
            r10.a()
            u3a r2 = r10.o
            if (r2 != 0) goto L_0x006c
            r10.invalidate()
            goto L_0x0176
        L_0x006c:
            int r8 = r10.u0
            if (r8 == 0) goto L_0x0110
            if (r8 == r5) goto L_0x00c0
            if (r8 == r4) goto L_0x0083
            if (r8 == r3) goto L_0x0125
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            defpackage.hm9.q(r6, r7, r2)
            goto L_0x0125
        L_0x0083:
            f5b r3 = r10.v0
            float r3 = r3.a()
            long r6 = r10.E0
            float r4 = (float) r6
            float r3 = r3 * r4
            long r3 = (long) r3
            nl9 r2 = (defpackage.nl9) r2
            java.lang.Object r2 = r2.a
            java.util.Set r2 = (java.util.Set) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x0098:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0125
            java.lang.Object r6 = r2.next()
            hk9 r6 = (defpackage.hk9) r6
            r6.u0 = r3
            we8 r7 = r6.Y
            bq7 r7 = (defpackage.bq7) r7
            boolean r7 = r7.k()
            if (r7 == 0) goto L_0x00b3
            r6.pause()
        L_0x00b3:
            r6.Z1()
            java.lang.Long r7 = java.lang.Long.valueOf(r3)
            xpb r6 = r6.v0
            r6.e(r7)
            goto L_0x0098
        L_0x00c0:
            aq0 r3 = r10.x0
            float r3 = r3.b()
            long r6 = r10.E0
            float r4 = (float) r6
            float r3 = r3 * r4
            long r3 = (long) r3
            nl9 r2 = (defpackage.nl9) r2
            java.lang.Object r2 = r2.a
            java.util.Set r2 = (java.util.Set) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x00d5:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0125
            java.lang.Object r6 = r2.next()
            hk9 r6 = (defpackage.hk9) r6
            we8 r7 = r6.Y
            bq7 r7 = (defpackage.bq7) r7
            boolean r7 = r7.k()
            if (r7 == 0) goto L_0x00ee
            r6.pause()
        L_0x00ee:
            java.lang.Object r7 = r6.b
            kk9 r7 = (defpackage.kk9) r7
            nl9 r7 = (defpackage.nl9) r7
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r8 = r8.toSeconds(r3)
            java.lang.String r8 = defpackage.ay7.l(r8)
            android.widget.TextView r7 = r7.x0
            r7.setText(r8)
            r6.Z1()
            java.lang.Long r7 = java.lang.Long.valueOf(r3)
            xpb r6 = r6.v0
            r6.e(r7)
            goto L_0x00d5
        L_0x0110:
            aq0 r3 = r10.w0
            float r3 = r3.b()
            long r6 = r10.E0
            float r4 = (float) r6
            float r3 = r3 * r4
            long r3 = (long) r3
            nl9 r2 = (defpackage.nl9) r2
            ll9 r6 = new ll9
            r6.<init>(r3)
            r2.n(r6)
        L_0x0125:
            boolean r2 = r10.y0
            if (r2 == 0) goto L_0x0173
            int r2 = r10.u0
            if (r2 == 0) goto L_0x012f
            if (r2 != r5) goto L_0x0173
        L_0x012f:
            u3a r2 = r10.o
            f5b r3 = r10.v0
            float r3 = r3.a()
            long r6 = r10.E0
            float r4 = (float) r6
            float r3 = r3 * r4
            long r3 = (long) r3
            nl9 r2 = (defpackage.nl9) r2
            r2.getClass()
            java.lang.Object r2 = r2.a
            java.util.Set r2 = (java.util.Set) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x0149:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0171
            java.lang.Object r6 = r2.next()
            hk9 r6 = (defpackage.hk9) r6
            r6.u0 = r3
            we8 r7 = r6.Y
            bq7 r7 = (defpackage.bq7) r7
            boolean r7 = r7.k()
            if (r7 == 0) goto L_0x0164
            r6.pause()
        L_0x0164:
            r6.Z1()
            java.lang.Long r7 = java.lang.Long.valueOf(r3)
            xpb r6 = r6.v0
            r6.e(r7)
            goto L_0x0149
        L_0x0171:
            r10.y0 = r1
        L_0x0173:
            r10.invalidate()
        L_0x0176:
            r1 = r5
            goto L_0x02c0
        L_0x0179:
            u3a r2 = r10.o
            if (r2 == 0) goto L_0x025d
            int r8 = r10.u0
            if (r8 == 0) goto L_0x01f5
            if (r8 == r5) goto L_0x01c2
            if (r8 == r4) goto L_0x0194
            if (r8 == r3) goto L_0x0220
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            defpackage.hm9.q(r6, r7, r2)
            goto L_0x0220
        L_0x0194:
            f5b r4 = r10.v0
            float r4 = r4.a()
            long r6 = r10.E0
            float r6 = (float) r6
            float r4 = r4 * r6
            long r6 = (long) r4
            nl9 r2 = (defpackage.nl9) r2
            java.lang.Object r2 = r2.a
            java.util.Set r2 = (java.util.Set) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x01a9:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0220
            java.lang.Object r4 = r2.next()
            hk9 r4 = (defpackage.hk9) r4
            r4.u0 = r6
            r4.b2()
            we8 r4 = r4.Y
            bq7 r4 = (defpackage.bq7) r4
            r4.q(r6)
            goto L_0x01a9
        L_0x01c2:
            aq0 r4 = r10.x0
            float r4 = r4.b()
            long r6 = r10.E0
            float r6 = (float) r6
            float r4 = r4 * r6
            long r6 = (long) r4
            nl9 r2 = (defpackage.nl9) r2
            java.lang.Object r2 = r2.a
            java.util.Set r2 = (java.util.Set) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x01d7:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0220
            java.lang.Object r4 = r2.next()
            hk9 r4 = (defpackage.hk9) r4
            r4.t0 = r6
            r4.c2()
            r4.b2()
            long r8 = r4.u0
            we8 r4 = r4.Y
            bq7 r4 = (defpackage.bq7) r4
            r4.q(r8)
            goto L_0x01d7
        L_0x01f5:
            aq0 r4 = r10.w0
            r4.b()
            nl9 r2 = (defpackage.nl9) r2
            java.lang.Object r2 = r2.a
            java.util.Set r2 = (java.util.Set) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x0204:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0220
            java.lang.Object r4 = r2.next()
            hk9 r4 = (defpackage.hk9) r4
            r4.c2()
            r4.b2()
            long r6 = r4.u0
            we8 r4 = r4.Y
            bq7 r4 = (defpackage.bq7) r4
            r4.q(r6)
            goto L_0x0204
        L_0x0220:
            boolean r2 = r10.y0
            if (r2 == 0) goto L_0x025d
            int r2 = r10.u0
            if (r2 == 0) goto L_0x022a
            if (r2 != r5) goto L_0x025d
        L_0x022a:
            u3a r2 = r10.o
            f5b r4 = r10.v0
            float r4 = r4.a()
            long r6 = r10.E0
            float r6 = (float) r6
            float r4 = r4 * r6
            long r6 = (long) r4
            nl9 r2 = (defpackage.nl9) r2
            r2.getClass()
            java.lang.Object r2 = r2.a
            java.util.Set r2 = (java.util.Set) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x0244:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x025d
            java.lang.Object r4 = r2.next()
            hk9 r4 = (defpackage.hk9) r4
            r4.u0 = r6
            r4.b2()
            we8 r4 = r4.Y
            bq7 r4 = (defpackage.bq7) r4
            r4.q(r6)
            goto L_0x0244
        L_0x025d:
            r10.u0 = r3
            r10.y0 = r1
            goto L_0x0176
        L_0x0263:
            aq0 r2 = r10.w0
            float r6 = r11.getX()
            float r7 = r11.getY()
            android.graphics.RectF r2 = r2.k
            boolean r2 = r2.contains(r6, r7)
            if (r2 == 0) goto L_0x027d
            r10.u0 = r1
            aq0 r1 = r10.w0
            r1.c(r11)
            goto L_0x02b3
        L_0x027d:
            aq0 r1 = r10.x0
            float r2 = r11.getX()
            float r6 = r11.getY()
            android.graphics.RectF r1 = r1.k
            boolean r1 = r1.contains(r2, r6)
            if (r1 == 0) goto L_0x0297
            r10.u0 = r5
            aq0 r1 = r10.x0
            r1.c(r11)
            goto L_0x02b3
        L_0x0297:
            f5b r1 = r10.v0
            float r2 = r11.getX()
            float r6 = r11.getY()
            android.graphics.RectF r1 = r1.g
            boolean r1 = r1.contains(r2, r6)
            if (r1 == 0) goto L_0x02b1
            r10.u0 = r4
            f5b r1 = r10.v0
            r1.b(r11)
            goto L_0x02b3
        L_0x02b1:
            r10.u0 = r3
        L_0x02b3:
            int r1 = r10.u0
            if (r1 == r3) goto L_0x0176
            android.view.ViewParent r1 = r10.getParent()
            r1.requestDisallowInterceptTouchEvent(r5)
            goto L_0x0176
        L_0x02c0:
            if (r0 == 0) goto L_0x02d3
            int r10 = r10.getWidth()
            float r10 = (float) r10
            float r0 = r11.getX()
            float r10 = r10 - r0
            float r0 = r11.getY()
            r11.setLocation(r10, r0)
        L_0x02d3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.trim.rangeSeekBar.RangeSeekBarView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setEndPosition(long j) {
        this.x0.e(((float) j) / ((float) this.E0));
        a();
        invalidate();
    }

    public void setOnChangeRangeSeekBarListener(u3a u3a) {
        aq0 aq0;
        this.o = u3a;
        if (u3a != null && (aq0 = this.w0) != null && this.x0 != null && this.v0 != null) {
            aq0.b();
            Set<hk9> set = (Set) ((nl9) u3a).a;
            for (hk9 hk9 : set) {
                hk9.c2();
                hk9.b2();
                ((bq7) hk9.Y).q(hk9.u0);
            }
            long b2 = (long) (this.x0.b() * ((float) this.E0));
            for (hk9 hk92 : set) {
                hk92.t0 = b2;
                hk92.c2();
                hk92.b2();
                ((bq7) hk92.Y).q(hk92.u0);
            }
            long a2 = (long) (this.v0.a() * ((float) this.E0));
            for (hk9 hk93 : set) {
                hk93.u0 = a2;
                hk93.b2();
                ((bq7) hk93.Y).q(a2);
            }
        }
    }

    public void setPointerPosition(long j) {
        this.v0.c(((float) j) / ((float) this.E0));
        a();
        invalidate();
    }

    public void setStartPosition(long j) {
        this.w0.e(((float) j) / ((float) this.E0));
        a();
        invalidate();
    }
}
