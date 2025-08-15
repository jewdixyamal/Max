package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.SeekBar;

/* renamed from: usd  reason: default package */
public abstract class usd extends ck0 {
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public int getActiveThumbIndex() {
        return this.h1;
    }

    public int getFocusedThumbIndex() {
        return this.i1;
    }

    public int getHaloRadius() {
        return this.U0;
    }

    public ColorStateList getHaloTintList() {
        return this.r1;
    }

    public int getLabelBehavior() {
        return this.P0;
    }

    public float getStepSize() {
        return this.j1;
    }

    public float getThumbElevation() {
        return this.z1.a.n;
    }

    public int getThumbHeight() {
        return this.T0;
    }

    public int getThumbRadius() {
        return this.S0 / 2;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.z1.a.d;
    }

    public float getThumbStrokeWidth() {
        return this.z1.a.k;
    }

    public ColorStateList getThumbTintList() {
        return this.z1.a.c;
    }

    public int getThumbTrackGapSize() {
        return this.V0;
    }

    public int getThumbWidth() {
        return this.S0;
    }

    public int getTickActiveRadius() {
        return this.m1;
    }

    public ColorStateList getTickActiveTintList() {
        return this.s1;
    }

    public int getTickInactiveRadius() {
        return this.n1;
    }

    public ColorStateList getTickInactiveTintList() {
        return this.t1;
    }

    public ColorStateList getTickTintList() {
        if (this.t1.equals(this.s1)) {
            return this.s1;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    public ColorStateList getTrackActiveTintList() {
        return this.u1;
    }

    public int getTrackHeight() {
        return this.Q0;
    }

    public ColorStateList getTrackInactiveTintList() {
        return this.v1;
    }

    public int getTrackInsideCornerSize() {
        return this.Z0;
    }

    public int getTrackSidePadding() {
        return this.R0;
    }

    public int getTrackStopIndicatorSize() {
        return this.Y0;
    }

    public ColorStateList getTrackTintList() {
        if (this.v1.equals(this.u1)) {
            return this.u1;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    public int getTrackWidth() {
        return this.o1;
    }

    public float getValue() {
        return getValues().get(0).floatValue();
    }

    public float getValueFrom() {
        return this.e1;
    }

    public float getValueTo() {
        return this.f1;
    }

    public void setCustomThumbDrawable(int i) {
        setCustomThumbDrawable(getResources().getDrawable(i));
    }

    public /* bridge */ /* synthetic */ void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setFocusedThumbIndex(int i) {
        if (i < 0 || i >= this.g1.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.i1 = i;
        this.v0.w(i);
        postInvalidate();
    }

    public void setHaloRadius(int i) {
        if (i != this.U0) {
            this.U0 = i;
            Drawable background = getBackground();
            if ((!(getBackground() instanceof RippleDrawable)) || !(background instanceof RippleDrawable)) {
                postInvalidate();
            } else {
                ((RippleDrawable) background).setRadius(this.U0);
            }
        }
    }

    public void setHaloRadiusResource(int i) {
        setHaloRadius(getResources().getDimensionPixelSize(i));
    }

    public void setHaloTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.r1)) {
            this.r1 = colorStateList;
            Drawable background = getBackground();
            if ((!(getBackground() instanceof RippleDrawable)) || !(background instanceof RippleDrawable)) {
                Paint paint = this.o;
                paint.setColor(h(colorStateList));
                paint.setAlpha(63);
                invalidate();
                return;
            }
            ((RippleDrawable) background).setColor(colorStateList);
        }
    }

    public void setLabelBehavior(int i) {
        if (this.P0 != i) {
            this.P0 = i;
            requestLayout();
        }
    }

    public /* bridge */ /* synthetic */ void setLabelFormatter(pd7 pd7) {
    }

    public void setStepSize(float f) {
        if (f < 0.0f) {
            float f2 = this.e1;
            float f3 = this.f1;
            throw new IllegalArgumentException("The stepSize(" + f + ") must be 0, or a factor of the valueFrom(" + f2 + ")-valueTo(" + f3 + ") range");
        } else if (this.j1 != f) {
            this.j1 = f;
            this.q1 = true;
            postInvalidate();
        }
    }

    public void setThumbElevation(float f) {
        this.z1.k(f);
    }

    public void setThumbElevationResource(int i) {
        setThumbElevation(getResources().getDimension(i));
    }

    public void setThumbHeight(int i) {
        if (i != this.T0) {
            this.T0 = i;
            this.z1.setBounds(0, 0, this.S0, i);
            Drawable drawable = this.A1;
            if (drawable != null) {
                a(drawable);
            }
            for (Drawable a : this.B1) {
                a(a);
            }
            y();
        }
    }

    public void setThumbHeightResource(int i) {
        setThumbHeight(getResources().getDimensionPixelSize(i));
    }

    public void setThumbRadius(int i) {
        int i2 = i * 2;
        setThumbWidth(i2);
        setThumbHeight(i2);
    }

    public void setThumbRadiusResource(int i) {
        setThumbRadius(getResources().getDimensionPixelSize(i));
    }

    public void setThumbStrokeColor(ColorStateList colorStateList) {
        this.z1.n(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(int i) {
        if (i != 0) {
            setThumbStrokeColor(z7.n(getContext(), i));
        }
    }

    public void setThumbStrokeWidth(float f) {
        q18 q18 = this.z1;
        q18.a.k = f;
        q18.invalidateSelf();
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(int i) {
        if (i != 0) {
            setThumbStrokeWidth(getResources().getDimension(i));
        }
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        q18 q18 = this.z1;
        if (!colorStateList.equals(q18.a.c)) {
            q18.l(colorStateList);
            invalidate();
        }
    }

    public void setThumbTrackGapSize(int i) {
        if (this.V0 != i) {
            this.V0 = i;
            invalidate();
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [vu4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v0, types: [vu4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v0, types: [vu4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v0, types: [vu4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v3, types: [gjd, java.lang.Object] */
    public void setThumbWidth(int i) {
        if (i != this.S0) {
            this.S0 = i;
            q18 q18 = this.z1;
            ? obj = new Object();
            ? obj2 = new Object();
            ? obj3 = new Object();
            ? obj4 = new Object();
            float f = ((float) this.S0) / 2.0f;
            hm9 f2 = nu0.f(0);
            i8g.d(f2);
            i8g.d(f2);
            i8g.d(f2);
            i8g.d(f2);
            a0 a0Var = new a0(f);
            a0 a0Var2 = new a0(f);
            a0 a0Var3 = new a0(f);
            a0 a0Var4 = new a0(f);
            ? obj5 = new Object();
            obj5.a = f2;
            obj5.b = f2;
            obj5.c = f2;
            obj5.d = f2;
            obj5.e = a0Var;
            obj5.f = a0Var2;
            obj5.g = a0Var3;
            obj5.h = a0Var4;
            obj5.i = obj;
            obj5.j = obj2;
            obj5.k = obj3;
            obj5.l = obj4;
            q18.setShapeAppearanceModel(obj5);
            q18.setBounds(0, 0, this.S0, this.T0);
            Drawable drawable = this.A1;
            if (drawable != null) {
                a(drawable);
            }
            for (Drawable a : this.B1) {
                a(a);
            }
            y();
        }
    }

    public void setThumbWidthResource(int i) {
        setThumbWidth(getResources().getDimensionPixelSize(i));
    }

    public void setTickActiveRadius(int i) {
        if (this.m1 != i) {
            this.m1 = i;
            this.t0.setStrokeWidth((float) (i * 2));
            y();
        }
    }

    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.s1)) {
            this.s1 = colorStateList;
            this.t0.setColor(h(colorStateList));
            invalidate();
        }
    }

    public void setTickInactiveRadius(int i) {
        if (this.n1 != i) {
            this.n1 = i;
            this.s0.setStrokeWidth((float) (i * 2));
            y();
        }
    }

    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.t1)) {
            this.t1 = colorStateList;
            this.s0.setColor(h(colorStateList));
            invalidate();
        }
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z) {
        if (this.l1 != z) {
            this.l1 = z;
            postInvalidate();
        }
    }

    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.u1)) {
            this.u1 = colorStateList;
            this.b.setColor(h(colorStateList));
            this.u0.setColor(h(this.u1));
            invalidate();
        }
    }

    public void setTrackHeight(int i) {
        if (this.Q0 != i) {
            this.Q0 = i;
            this.a.setStrokeWidth((float) i);
            this.b.setStrokeWidth((float) this.Q0);
            y();
        }
    }

    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.v1)) {
            this.v1 = colorStateList;
            this.a.setColor(h(colorStateList));
            invalidate();
        }
    }

    public void setTrackInsideCornerSize(int i) {
        if (this.Z0 != i) {
            this.Z0 = i;
            invalidate();
        }
    }

    public void setTrackStopIndicatorSize(int i) {
        if (this.Y0 != i) {
            this.Y0 = i;
            this.u0.setStrokeWidth((float) i);
            invalidate();
        }
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValue(float f) {
        setValues(Float.valueOf(f));
    }

    public void setValueFrom(float f) {
        this.e1 = f;
        this.q1 = true;
        postInvalidate();
    }

    public void setValueTo(float f) {
        this.f1 = f;
        this.q1 = true;
        postInvalidate();
    }

    public void setCustomThumbDrawable(Drawable drawable) {
        Drawable newDrawable = drawable.mutate().getConstantState().newDrawable();
        a(newDrawable);
        this.A1 = newDrawable;
        this.B1.clear();
        postInvalidate();
    }
}
