package defpackage;

import androidx.appcompat.widget.AppCompatCheckBox;

/* renamed from: yz2  reason: default package */
public final class yz2 extends AppCompatCheckBox {
    public int s0;

    public int getCompoundPaddingLeft() {
        return super.getCompoundPaddingLeft() + this.s0;
    }

    public final int getPaddingBetweenCheckbox() {
        return this.s0;
    }

    public final void setPaddingBetweenCheckbox(int i) {
        this.s0 = i;
        invalidate();
        requestLayout();
    }
}
