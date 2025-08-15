package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import java.util.WeakHashMap;

/* renamed from: qn  reason: default package */
public final class qn extends va8 {
    public final SeekBar X;
    public Drawable Y;
    public ColorStateList Z = null;
    public PorterDuff.Mode s0 = null;
    public boolean t0 = false;
    public boolean u0 = false;

    public qn(SeekBar seekBar) {
        super(1, (Object) seekBar);
        this.X = seekBar;
    }

    public final void A(AttributeSet attributeSet, int i) {
        super.A(attributeSet, i);
        SeekBar seekBar = this.X;
        k8g x = k8g.x(seekBar.getContext(), attributeSet, p3c.AppCompatSeekBar, i, 0);
        SeekBar seekBar2 = this.X;
        Context context = seekBar2.getContext();
        int[] iArr = p3c.AppCompatSeekBar;
        WeakHashMap weakHashMap = zmf.a;
        umf.d(seekBar2, context, iArr, attributeSet, (TypedArray) x.b, i, 0);
        Drawable o = x.o(p3c.AppCompatSeekBar_android_thumb);
        if (o != null) {
            seekBar.setThumb(o);
        }
        Drawable n = x.n(p3c.AppCompatSeekBar_tickMark);
        Drawable drawable = this.Y;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
        this.Y = n;
        if (n != null) {
            n.setCallback(seekBar);
            bq4.b(n, seekBar.getLayoutDirection());
            if (n.isStateful()) {
                n.setState(seekBar.getDrawableState());
            }
            G();
        }
        seekBar.invalidate();
        int i2 = p3c.AppCompatSeekBar_tickMarkTintMode;
        TypedArray typedArray = (TypedArray) x.b;
        if (typedArray.hasValue(i2)) {
            this.s0 = hq4.c(typedArray.getInt(p3c.AppCompatSeekBar_tickMarkTintMode, -1), this.s0);
            this.u0 = true;
        }
        if (typedArray.hasValue(p3c.AppCompatSeekBar_tickMarkTint)) {
            this.Z = x.l(p3c.AppCompatSeekBar_tickMarkTint);
            this.t0 = true;
        }
        x.z();
        G();
    }

    public final void G() {
        Drawable drawable = this.Y;
        if (drawable == null) {
            return;
        }
        if (this.t0 || this.u0) {
            Drawable mutate = drawable.mutate();
            this.Y = mutate;
            if (this.t0) {
                aq4.h(mutate, this.Z);
            }
            if (this.u0) {
                aq4.i(this.Y, this.s0);
            }
            if (this.Y.isStateful()) {
                this.Y.setState(this.X.getDrawableState());
            }
        }
    }

    public final void H(Canvas canvas) {
        if (this.Y != null) {
            SeekBar seekBar = this.X;
            int max = seekBar.getMax();
            int i = 1;
            if (max > 1) {
                int intrinsicWidth = this.Y.getIntrinsicWidth();
                int intrinsicHeight = this.Y.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight / 2;
                }
                this.Y.setBounds(-i2, -i, i2, i);
                float width = ((float) ((seekBar.getWidth() - seekBar.getPaddingLeft()) - seekBar.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) seekBar.getPaddingLeft(), (float) (seekBar.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    this.Y.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
