package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: yia  reason: default package */
public final class yia extends ViewGroup {
    public int a = tu0.G(((float) 28) * fk4.d().getDisplayMetrics().density);
    public int b = tu0.G(((float) 10) * fk4.d().getDisplayMetrics().density);
    public int c = tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density);
    public final Paint o;
    public final je7 s0;
    public final pf t0;
    public final ArrayList u0;

    public yia(Context context) {
        super(context);
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.o = paint;
        this.s0 = tu0.r(3, new xda(context, 6));
        this.t0 = new pf(3, this);
        this.u0 = new ArrayList();
    }

    private final int getAvatarsWidth() {
        int i = this.a;
        ArrayList arrayList = this.u0;
        return (arrayList.size() * i) - ((arrayList.size() - 1) * this.b);
    }

    /* JADX INFO: finally extract failed */
    public final void dispatchDraw(Canvas canvas) {
        float f = ((float) this.a) / 2.0f;
        float measuredHeight = (((float) getMeasuredHeight()) / 2.0f) - f;
        float f2 = fk4.d().getDisplayMetrics().density * 0.0f;
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), (Paint) null);
        ArrayList arrayList = this.u0;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                Drawable drawable = (Drawable) next;
                int save = canvas.save();
                canvas.translate(f2, measuredHeight);
                try {
                    int i3 = this.a;
                    int i4 = i3 - this.b;
                    float f3 = ((float) i3) / 2.0f;
                    float f4 = (float) i4;
                    f2 += f4;
                    drawable.draw(canvas);
                    if (i != y53.L(arrayList)) {
                        canvas.drawCircle(f4 + f, f3, ((float) this.c) + f, this.o);
                    }
                    canvas.restoreToCount(save);
                    i = i2;
                } catch (Throwable th) {
                    canvas.restoreToCount(save);
                    throw th;
                }
            } else {
                y53.R();
                throw null;
            }
        }
        canvas.restoreToCount(saveLayer);
        super.dispatchDraw(canvas);
    }

    public final int getAvatarOffset() {
        return this.b;
    }

    public final int getAvatarSize() {
        return this.a;
    }

    public final int getStrokeWidth() {
        return this.c;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View z2 = br7.z(this.s0);
        if (z2 != null) {
            int c2 = rh4.c((float) 8, fk4.d().getDisplayMetrics().density, getAvatarsWidth());
            z2.layout(c2, (getMeasuredHeight() / 2) - (z2.getMeasuredHeight() / 2), z2.getMeasuredWidth() + c2, (z2.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2));
        }
    }

    /* JADX WARNING: type inference failed for: r2v6, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            int r8 = r6.getAvatarsWidth()
            int r0 = r6.a
            je7 r1 = r6.s0
            android.view.View r1 = defpackage.br7.z(r1)
            if (r1 == 0) goto L_0x0077
            int r7 = r7 - r8
            r0 = 8
            float r0 = (float) r0
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            int r7 = defpackage.rh4.q(r0, r2, r7)
            android.view.ViewGroup$LayoutParams r2 = r6.getLayoutParams()
            boolean r3 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            r4 = 0
            if (r3 == 0) goto L_0x0030
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            goto L_0x0031
        L_0x0030:
            r2 = r4
        L_0x0031:
            r3 = 0
            if (r2 == 0) goto L_0x0037
            int r2 = r2.leftMargin
            goto L_0x0038
        L_0x0037:
            r2 = r3
        L_0x0038:
            int r7 = r7 - r2
            android.view.ViewGroup$LayoutParams r2 = r6.getLayoutParams()
            boolean r5 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r5 == 0) goto L_0x0044
            r4 = r2
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
        L_0x0044:
            if (r4 == 0) goto L_0x0049
            int r2 = r4.rightMargin
            goto L_0x004a
        L_0x0049:
            r2 = r3
        L_0x004a:
            int r7 = r7 - r2
            if (r7 >= 0) goto L_0x004e
            r7 = r3
        L_0x004e:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r2)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            r1.measure(r7, r2)
            int r7 = r1.getMeasuredWidth()
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            int r8 = defpackage.wg0.d(r0, r2, r7, r8)
            int r7 = r6.a
            int r0 = r1.getMeasuredHeight()
            int r0 = java.lang.Math.max(r7, r0)
        L_0x0077:
            r6.setMeasuredDimension(r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yia.onMeasure(int, int):void");
    }

    public final void setAvatarOffset(int i) {
        this.b = i;
        requestLayout();
        invalidate();
    }

    public final void setAvatarSize(int i) {
        this.a = i;
        requestLayout();
        invalidate();
    }

    public final void setAvatars(List<kpa> list) {
        ArrayList arrayList = this.u0;
        arrayList.clear();
        if (list == null) {
            requestLayout();
            invalidate();
            return;
        }
        for (kpa kpa : list) {
            g5a g5a = new g5a(getContext());
            g5a.setCallback(this.t0);
            int i = this.a;
            g5a.setBounds(0, 0, i, i);
            g5a.b((uc0) kpa.a, (String) kpa.b);
            arrayList.add(g5a);
        }
        requestLayout();
        invalidate();
    }

    public final void setStrokeWidth(int i) {
        this.c = i;
        requestLayout();
        invalidate();
    }

    public final void setTitle(jqe jqe) {
        je7 je7 = this.s0;
        if (jqe == null) {
            ((TextView) je7.getValue()).setText((CharSequence) null);
            ((TextView) je7.getValue()).setVisibility(8);
            return;
        }
        ay7.b(this, (View) je7.getValue(), -1);
        ((TextView) je7.getValue()).setText(jqe.b(getContext()));
        ((TextView) je7.getValue()).setVisibility(0);
    }
}
