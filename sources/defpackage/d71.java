package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: d71  reason: default package */
public final class d71 extends ndc {
    public final /* synthetic */ int a;
    public final int b;

    public d71() {
        this.a = 5;
        this.b = tu0.G(((float) 24) * fk4.d().getDisplayMetrics().density);
    }

    public final void f(Rect rect, View view, RecyclerView recyclerView, zdc zdc) {
        int R;
        int R2;
        switch (this.a) {
            case 0:
                hdc adapter = recyclerView.getAdapter();
                if (adapter != null && (R = RecyclerView.R(view)) >= 0 && R <= adapter.j() && view.getLayoutParams().width != 0) {
                    int i = this.b;
                    rect.bottom = i;
                    rect.top = i;
                    rect.left = i;
                    rect.right = i;
                    return;
                }
                return;
            case 1:
                hdc adapter2 = recyclerView.getAdapter();
                if (adapter2 != null && (R2 = RecyclerView.R(view)) >= 0 && R2 <= adapter2.j()) {
                    int i2 = this.b;
                    rect.bottom = i2;
                    rect.top = i2;
                    rect.left = i2;
                    rect.right = i2;
                    return;
                }
                return;
            case 2:
                recyclerView.getClass();
                int R3 = RecyclerView.R(view);
                int i3 = this.b;
                if (R3 == 0) {
                    rect.top += i3;
                }
                hdc adapter3 = recyclerView.getAdapter();
                if (R3 == (adapter3 != null ? adapter3.j() : 0) - 1) {
                    rect.bottom = tu0.F(((double) i3) * 1.0d) + rect.bottom;
                    return;
                }
                return;
            case 3:
                recyclerView.getClass();
                int R4 = RecyclerView.R(view);
                int b2 = zdc.b() - 1;
                int i4 = this.b;
                if (R4 == b2) {
                    rect.left = i4;
                    rect.right = 0;
                    return;
                } else if (RecyclerView.R(view) == 0) {
                    rect.left = 0;
                    rect.right = i4;
                    return;
                } else {
                    rect.left = i4;
                    rect.right = i4;
                    return;
                }
            case 4:
                int i5 = this.b;
                rect.right = i5;
                rect.left = i5;
                return;
            default:
                dec T = recyclerView.T(view);
                if (T != null) {
                    int R5 = RecyclerView.R(view);
                    hdc adapter4 = recyclerView.getAdapter();
                    if (T.Y != 0 && adapter4 != null && R5 >= 0 && R5 < adapter4.j() && R5 == 0) {
                        int i6 = this.b;
                        rect.top = i6;
                        rect.bottom = i6;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ d71(int i, int i2) {
        this.a = i2;
        this.b = i;
    }
}
