package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

/* renamed from: d7  reason: default package */
public final class d7 extends AppCompatImageView implements f7 {
    public final /* synthetic */ e7 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d7(e7 e7Var, Context context) {
        super(context, (AttributeSet) null, vsb.actionOverflowButtonStyle);
        this.o = e7Var;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        swe.a(this, getContentDescription());
        setOnTouchListener(new z6(this, this));
    }

    public final boolean b() {
        return false;
    }

    public final boolean e() {
        return false;
    }

    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.o.l();
        return true;
    }

    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (!(drawable == null || background == null)) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            aq4.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
