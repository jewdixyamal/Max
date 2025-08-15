package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* renamed from: pn  reason: default package */
public class pn extends SeekBar {
    public final qn a;

    public pn(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, vsb.seekBarStyle);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        qn qnVar = this.a;
        Drawable drawable = qnVar.Y;
        if (drawable != null && drawable.isStateful()) {
            SeekBar seekBar = qnVar.X;
            if (drawable.setState(seekBar.getDrawableState())) {
                seekBar.invalidateDrawable(drawable);
            }
        }
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a.Y;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.a.H(canvas);
    }

    public pn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        gse.a(getContext(), this);
        qn qnVar = new qn(this);
        this.a = qnVar;
        qnVar.A(attributeSet, i);
    }
}
