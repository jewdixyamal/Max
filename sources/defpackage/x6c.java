package defpackage;

import android.graphics.Rect;
import android.view.View;

/* renamed from: x6c  reason: default package */
public final class x6c implements View.OnLayoutChangeListener {
    public final /* synthetic */ y6c a;
    public final /* synthetic */ View b;
    public final /* synthetic */ long c;

    public x6c(y6c y6c, View view, long j) {
        this.a = y6c;
        this.b = view;
        this.c = j;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        View view2 = this.b;
        y6c y6c = this.a;
        Rect c2 = y6c.c(y6c, view2);
        if (c2 != null) {
            y6c.b.d(this.c, c2);
        }
    }
}
