package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Size;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: qv0  reason: default package */
public final class qv0 extends View {
    public final TextPaint A0;
    public final TextPaint B0;
    public ov0 C0;
    public fv0 D0;
    public kv0 E0;
    public final Drawable F0;
    public final Drawable G0;
    public final Drawable H0;
    public final Drawable I0;
    public ColorStateList J0;
    public ColorStateList K0;
    public sz6 L0;
    public final Path M0;
    public final RectF N0;
    public final float[] O0;
    public final Size P0;
    public boolean Q0;
    public boolean R0;
    public final GestureDetector S0;
    public final int a = tu0.G(((float) 40) * fk4.d().getDisplayMetrics().density);
    public final int b = tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density);
    public final int c = tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density);
    public final float o = (fk4.d().getDisplayMetrics().density * 6.0f);
    public final int s0 = tu0.G(((float) 20) * fk4.d().getDisplayMetrics().density);
    public final int t0 = tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density);
    public int u0;
    public ArrayList v0 = new ArrayList();
    public ic7 w0;
    public final Paint x0;
    public final Paint y0;
    public final Paint z0;

    public qv0(Context context) {
        super(context, (AttributeSet) null);
        pq9 pq9 = qp4.u0;
        pq9.j(this).getIcon();
        this.J0 = ColorStateList.valueOf(-1);
        this.K0 = ColorStateList.valueOf(pq9.j(this).getIcon().f);
        this.M0 = new Path();
        this.N0 = new RectF();
        this.O0 = new float[8];
        this.S0 = new GestureDetector(context, new q00(1, this));
        this.P0 = new Size(s5c.G(context).getWidth(), s5c.G(context).getHeight());
        int i = lda.l;
        pq9.j(this).getIcon();
        this.F0 = ngg.u(i, -1, context);
        int i2 = lda.k;
        pq9.j(this).getIcon();
        this.G0 = ngg.u(i2, -1, context);
        int i3 = lda.b;
        pq9.j(this).getIcon();
        this.I0 = ngg.u(i3, -1, context);
        int i4 = lda.a;
        pq9.j(this).getIcon();
        this.H0 = ngg.u(i4, -1, context);
        pq9.j(this).getText();
        this.A0 = b(-1);
        this.B0 = b(pq9.j(this).getText().e);
        this.x0 = a(pq9.j(this).a().d(true).a.a.a);
        this.y0 = a(pq9.j(this).a().s().b.m);
        this.z0 = a(pq9.j(this).a().d(true).a.a.c);
        v3c.y(new br(3, (Continuation) null, 2), this);
    }

    public static Paint a(int i) {
        Paint paint = new Paint();
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setAntiAlias(true);
        return paint;
    }

    public final TextPaint b(int i) {
        TextPaint textPaint = new TextPaint();
        textPaint.setColor(i);
        i4f.D.a(textPaint, getResources().getDisplayMetrics(), du4.b);
        textPaint.setTextSize(fk4.d().getDisplayMetrics().density * 16.0f);
        textPaint.setTextAlign(Paint.Align.CENTER);
        return textPaint;
    }

    public final ic7 getKeyboard() {
        return this.w0;
    }

    public final void onDraw(Canvas canvas) {
        Paint paint;
        Canvas canvas2 = canvas;
        if (!this.v0.isEmpty()) {
            Iterator it = this.v0.iterator();
            while (it.hasNext()) {
                jq0 jq0 = (jq0) it.next();
                a20 a20 = jq0.b;
                RectF rectF = this.N0;
                rectF.set(a20.b, a20.c, a20.d, a20.e);
                fv0 fv0 = this.D0;
                boolean z = jq0.e;
                fv0 fv02 = jq0.a;
                if (fv02 == fv0) {
                    int i = pv0.$EnumSwitchMapping$1[au1.s(fv02.c)];
                    paint = this.z0;
                } else if (z || !this.R0) {
                    int i2 = pv0.$EnumSwitchMapping$1[au1.s(fv02.c)];
                    paint = this.x0;
                } else {
                    paint = this.y0;
                }
                a20 a202 = jq0.b;
                float[] fArr = jq0.h;
                if (fArr != null) {
                    Path path = this.M0;
                    path.reset();
                    float f = fArr[0];
                    float[] fArr2 = this.O0;
                    fArr2[0] = f;
                    fArr2[1] = fArr[0];
                    float f2 = fArr[1];
                    fArr2[2] = f2;
                    fArr2[3] = f2;
                    float f3 = fArr[2];
                    fArr2[4] = f3;
                    fArr2[5] = f3;
                    float f4 = fArr[3];
                    fArr2[6] = f4;
                    fArr2[7] = f4;
                    path.addRoundRect(rectF, fArr2, Path.Direction.CCW);
                    canvas2.drawPath(path, paint);
                } else {
                    rectF.set(a202.b, a202.c, a202.d, a202.e);
                    float f5 = this.o;
                    canvas2.drawRoundRect(rectF, f5, f5, paint);
                }
                if (fv02.s0) {
                    sz6 sz6 = this.L0;
                    if (sz6 != null) {
                        float f6 = a202.b;
                        float f7 = a202.d;
                        int i3 = this.s0 / 2;
                        float f8 = a202.c;
                        float f9 = a202.e;
                        sz6.setBounds(((int) ((f6 + f7) * 0.5f)) - i3, ((int) ((f8 + f9) * 0.5f)) - i3, ((int) ((f6 + f7) * 0.5f)) + i3, i3 + ((int) ((f8 + f9) * 0.5f)));
                    }
                    sz6 sz62 = this.L0;
                    if (sz62 != null) {
                        sz62.draw(canvas2);
                    }
                } else {
                    String str = jq0.i;
                    float f10 = (a202.b + a202.d) * 0.5f;
                    TextPaint textPaint = this.A0;
                    float ascent = ((a202.c + a202.e) * 0.5f) - ((textPaint.ascent() + textPaint.descent()) / ((float) 2));
                    if (!z && this.R0) {
                        textPaint = this.B0;
                    }
                    canvas2.drawText(str, f10, ascent, textPaint);
                }
                int i4 = this.b;
                int i5 = ((int) a202.d) - i4;
                int i6 = this.t0;
                int i7 = i5 - i6;
                int i8 = ((int) a202.c) + i4;
                int i9 = i6 + i8;
                int ordinal = fv02.b.ordinal();
                Drawable drawable = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 5 ? null : this.F0 : this.I0 : this.H0 : this.G0;
                if (drawable != null) {
                    drawable.setTintList((z || !this.R0) ? this.J0 : this.K0);
                    drawable.setBounds(i7, i8, i5, i9);
                    drawable.draw(canvas2);
                }
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        ic7 ic7 = this.w0;
        if (this.v0.size() == 0 || ic7 == null) {
            super.onMeasure(i, i2);
            return;
        }
        int size = ((z07) ic7).a.size();
        int size2 = View.MeasureSpec.getSize(i);
        if (!this.Q0) {
            Size size3 = this.P0;
            if (((double) size2) > Math.min((double) size3.getWidth(), (double) size3.getHeight())) {
                size2 = (int) (((float) (size3.getWidth() * size2)) / ((float) size3.getHeight()));
            }
        }
        boolean z = this.R0;
        int i3 = this.b;
        int i4 = this.c;
        int i5 = z ? i4 : i3;
        int i6 = this.a;
        setMeasuredDimension(size2, (i5 + i6) * size);
        int i7 = 0;
        a20 a20 = ((jq0) this.v0.get(0)).b;
        if ((a20.b == 0.0f && a20.c == 0.0f && a20.d == 0.0f && a20.e == 0.0f) || this.u0 != getMeasuredWidth()) {
            int measuredWidth = getMeasuredWidth();
            ArrayList arrayList = this.v0;
            if (!this.R0) {
                i4 = i3;
            }
            l lVar = new l(16, this);
            Iterator it = arrayList.iterator();
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (it.hasNext()) {
                jq0 jq0 = (jq0) it.next();
                int i11 = jq0.c;
                if (i11 != -1) {
                    i10 = (measuredWidth - (i11 * i3)) / i11;
                    i8 = i7;
                }
                boolean z2 = jq0.g;
                if (z2) {
                    i10 += i3;
                }
                float f = (float) i8;
                float f2 = (float) i9;
                int i12 = jq0.d ? i8 + measuredWidth : i8 + i10;
                int i13 = i9 + i6;
                int i14 = measuredWidth;
                Iterator it2 = it;
                a20 a202 = jq0.b;
                a202.b = f;
                a202.c = f2;
                a202.d = (float) i12;
                a202.e = (float) i13;
                lVar.invoke(jq0);
                i8 = i8 + i10 + i3;
                if (z2) {
                    i9 = i13 + i4;
                }
                measuredWidth = i14;
                it = it2;
                i7 = 0;
            }
        }
        this.u0 = getMeasuredWidth();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        this.S0.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        mpa mpa = null;
        if (action == 0) {
            ArrayList arrayList = this.v0;
            ic7 ic7 = this.w0;
            List list = ic7 != null ? ((z07) ic7).a : null;
            if (list == null) {
                list = nz4.a;
            }
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (!arrayList.isEmpty() && !list.isEmpty()) {
                int y = (int) (motionEvent.getY() / ((float) (measuredHeight / list.size())));
                int size = list.size() - 1;
                Class<kq0> cls = kq0.class;
                if (y > size) {
                    String name = cls.getName();
                    ir6 ir6 = hm9.m;
                    if (ir6 != null && ir6.c()) {
                        ir6.d(us7.s0, name, rh4.h("Calculated wrong row index=", y, size, ", correct index="), (Throwable) null);
                    }
                    y = size;
                }
                lv0 lv0 = (lv0) list.get(y);
                if (!lv0.isEmpty()) {
                    int x = (int) (motionEvent.getX() / ((float) (measuredWidth / lv0.size())));
                    int size2 = lv0.size() - 1;
                    if (x > size2) {
                        String name2 = cls.getName();
                        ir6 ir62 = hm9.m;
                        if (ir62 != null && ir62.c()) {
                            ir62.d(us7.s0, name2, rh4.h("Calculated wrong column index=", x, size2, ", correct index="), (Throwable) null);
                        }
                        x = size2;
                    }
                    mpa = new mpa(new kv0(y, x), lv0.get(x));
                }
            }
            if (mpa == null) {
                return true;
            }
            this.E0 = (kv0) mpa.a;
            this.D0 = (fv0) mpa.b;
            invalidate();
            return true;
        } else if (action != 1 && action != 3) {
            return false;
        } else {
            this.D0 = null;
            this.E0 = null;
            invalidate();
            return false;
        }
    }

    public final void setClickListener(ov0 ov0) {
        this.C0 = ov0;
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return (drawable instanceof sz6) || super.verifyDrawable(drawable);
    }
}
