package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: g5c  reason: default package */
public final class g5c extends ConstraintLayout {
    public int G0;
    public f5c H0;

    public final int getSelected() {
        return this.G0 + 1;
    }

    public final void setOnSelectListener(f5c f5c) {
        this.H0 = f5c;
    }
}
