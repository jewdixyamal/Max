package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.BitSet;
import java.util.LinkedHashMap;

/* renamed from: uv9  reason: default package */
public final class uv9 extends ViewGroup implements kre {
    public final Path a = new Path();
    public final Rect b = new Rect();
    public final LinkedHashMap c = new LinkedHashMap();
    public tv9 o = new tv9(0, false, false, false);
    public final BitSet s0;
    public final int t0;
    public final int u0;
    public final rz7 v0;
    public final rz7 w0;
    public final caa x0;

    public uv9(Context context) {
        super(context, (AttributeSet) null);
        BitSet bitSet = new BitSet(3);
        this.s0 = bitSet;
        this.t0 = 1;
        this.u0 = 2;
        rz7 rz7 = new rz7(context);
        rz7.setId(xoc.k0);
        rz7.setIcon(woc.k1);
        rz7.setFocusable(0);
        this.v0 = rz7;
        rz7 rz72 = new rz7(context);
        rz72.setId(xoc.l0);
        rz72.setIcon(woc.T);
        rz72.setFocusable(0);
        float f = (float) 20;
        rz72.setLayoutParams(new ViewGroup.MarginLayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
        this.w0 = rz72;
        caa caa = new caa(context);
        caa.setId(xoc.j0);
        caa.setFocusable(0);
        this.x0 = caa;
        addView(caa);
        addView(rz7);
        addView(rz72);
        bitSet.set(0, bitSet.size(), false);
    }

    private final void setupMention(boolean z) {
        BitSet bitSet = this.s0;
        boolean z2 = false;
        bitSet.set(0, z);
        if (!z && this.o.b) {
            z2 = true;
        }
        bitSet.set(this.t0, z2);
        pq9 pq9 = qp4.u0;
        rz7 rz7 = this.v0;
        rz7.setBackgroundColor(pq9.j(rz7).b().a.m);
        pq9.j(rz7).getIcon();
        rz7.setIconColor(-1);
        requestLayout();
    }

    private final void setupReaction(boolean z) {
        int i;
        this.s0.set(this.t0, z && !this.o.c);
        boolean z2 = this.o.d;
        pq9 pq9 = qp4.u0;
        rz7 rz7 = this.w0;
        fka j = pq9.j(rz7);
        if (z2) {
            i = j.getIcon().j;
        } else {
            j.getIcon();
            i = -1;
        }
        boolean z3 = this.o.d;
        fka j2 = pq9.j(rz7);
        rz7.setBackgroundColor(z3 ? j2.b().a.g : j2.f().a);
        rz7.setIconColor(i);
        requestLayout();
    }

    public final void a(View view) {
        Path path = this.a;
        path.reset();
        int left = view.getLeft();
        int top = view.getTop();
        int right = view.getRight();
        int bottom = view.getBottom();
        Rect rect = this.b;
        rect.set(left, top, right, bottom);
        if (view instanceof rz7) {
            path.addCircle(rect.exactCenterX(), rect.exactCenterY(), ((float) Math.min(rect.width(), rect.height())) / 2.0f, Path.Direction.CCW);
        } else if (view instanceof caa) {
            float f = (float) rect.left;
            float f2 = (float) rect.top;
            float f3 = (float) rect.right;
            float f4 = (float) rect.bottom;
            Path.Direction direction = Path.Direction.CCW;
            path.addRect(f, f2, f3, f4, direction);
            BitSet bitSet = this.s0;
            rz7 rz7 = bitSet.get(0) ? this.v0 : bitSet.get(this.t0) ? this.w0 : null;
            if (rz7 != null) {
                Rect rect2 = new Rect(rz7.getLeft(), rz7.getTop(), rz7.getRight(), rz7.getBottom());
                Path path2 = new Path();
                path2.addCircle(rect2.exactCenterX(), rect2.exactCenterY(), (((float) Math.min(rect2.width(), rect2.height())) / 2.0f) + ((float) tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density)), direction);
                path.op(path2, Path.Op.DIFFERENCE);
            }
        }
        Path path3 = (Path) this.c.get(view);
        if (path3 != null) {
            path3.set(path);
        }
    }

    public final void b(boolean z, fka fka) {
        int i;
        if (z) {
            i = fka.getIcon().j;
        } else {
            fka.getIcon();
            i = -1;
        }
        int i2 = z ? fka.b().a.g : fka.f().a;
        rz7 rz7 = this.w0;
        rz7.setBackgroundColor(i2);
        rz7.setIconColor(i);
        int i3 = fka.b().a.m;
        rz7 rz72 = this.v0;
        rz72.setBackgroundColor(i3);
        rz72.setIconColor(-1);
        this.x0.setAppearance(z ? x9a.c : x9a.a);
        invalidate();
    }

    public final void c(boolean z) {
        tv9 tv9 = this.o;
        boolean z2 = tv9.c;
        this.o = tv9.a(tv9, 0, false, z, false, 11);
        if (z2 != z) {
            setupMention(z);
        }
    }

    public final void d(boolean z) {
        tv9 tv9 = this.o;
        boolean z2 = tv9.b;
        this.o = tv9.a(tv9, 0, z, false, false, 13);
        if (z2 != z) {
            setupReaction(z);
        }
    }

    public final boolean drawChild(Canvas canvas, View view, long j) {
        Object obj = this.c.get(view);
        if (obj != null) {
            int save = canvas.save();
            canvas.clipPath((Path) obj);
            try {
                return super.drawChild(canvas, view, j);
            } finally {
                canvas.restoreToCount(save);
            }
        } else {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingStart = getPaddingStart();
        BitSet bitSet = this.s0;
        if (bitSet.get(this.t0)) {
            int paddingStart2 = getPaddingStart();
            int paddingTop = getPaddingTop();
            int paddingStart3 = getPaddingStart();
            rz7 rz7 = this.w0;
            c54.L(paddingStart2, paddingTop, rz7.getMeasuredWidth() + paddingStart3, rz7.getMeasuredHeight() + getPaddingTop(), this.w0, this);
            a(rz7);
            paddingStart += rz7.getMeasuredWidth();
        }
        if (bitSet.get(0)) {
            int paddingStart4 = getPaddingStart();
            int paddingTop2 = getPaddingTop();
            int paddingStart5 = getPaddingStart();
            rz7 rz72 = this.v0;
            c54.L(paddingStart4, paddingTop2, rz72.getMeasuredWidth() + paddingStart5, rz72.getMeasuredHeight() + getPaddingTop(), this.v0, this);
            a(rz72);
            paddingStart += rz72.getMeasuredWidth();
        }
        int i5 = paddingStart;
        if (bitSet.get(this.u0)) {
            int measuredWidth = getMeasuredWidth() - getPaddingEnd();
            int paddingTop3 = getPaddingTop();
            int paddingTop4 = getPaddingTop();
            caa caa = this.x0;
            c54.L(i5, paddingTop3, measuredWidth, caa.getMeasuredHeight() + paddingTop4, this.x0, this);
            a(caa);
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        BitSet bitSet = this.s0;
        int i4 = 8;
        int i5 = bitSet.get(0) ? 0 : 8;
        rz7 rz7 = this.v0;
        rz7.setVisibility(i5);
        int i6 = bitSet.get(this.t0) ? 0 : 8;
        rz7 rz72 = this.w0;
        rz72.setVisibility(i6);
        int i7 = this.u0;
        if (bitSet.get(i7)) {
            i4 = 0;
        }
        caa caa = this.x0;
        caa.setVisibility(i4);
        float f = (float) 20;
        int G = tu0.G(fk4.d().getDisplayMetrics().density * f);
        if (bitSet.get(0)) {
            rz7.measure(View.MeasureSpec.makeMeasureSpec(tu0.G(fk4.d().getDisplayMetrics().density * f), 1073741824), View.MeasureSpec.makeMeasureSpec(tu0.G(fk4.d().getDisplayMetrics().density * f), 1073741824));
            i3 = rz7.getMeasuredWidth();
        } else {
            i3 = 0;
        }
        if (rz72.getVisibility() == 0) {
            rz72.measure(View.MeasureSpec.makeMeasureSpec(tu0.G(fk4.d().getDisplayMetrics().density * f), 1073741824), View.MeasureSpec.makeMeasureSpec(tu0.G(fk4.d().getDisplayMetrics().density * f), 1073741824));
            i3 += rz72.getMeasuredWidth();
        }
        if (bitSet.get(i7)) {
            caa.measure(0, View.MeasureSpec.makeMeasureSpec(tu0.G(f * fk4.d().getDisplayMetrics().density), 1073741824));
            i3 += caa.getMeasuredWidth();
        }
        setMeasuredDimension(i3, G);
    }

    public final void onThemeChanged(fka fka) {
        b(this.o.d, fka);
        this.x0.f(fka);
    }

    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        this.c.put(view, new Path());
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.c.remove(view);
    }
}
