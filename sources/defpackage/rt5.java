package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: rt5  reason: default package */
public final class rt5 extends ndc {
    public final /* synthetic */ int a = 1;
    public final int b;
    public final int c;
    public final Object o;

    public rt5(int i, u4a u4a) {
        this.b = i;
        this.o = u4a;
        this.c = tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
    }

    public final void f(Rect rect, View view, RecyclerView recyclerView, zdc zdc) {
        GridLayoutManager q;
        kg6 kg6;
        int R;
        switch (this.a) {
            case 0:
                recyclerView.getClass();
                int R2 = RecyclerView.R(view);
                hdc adapter = recyclerView.getAdapter();
                if (adapter != null && R2 >= 0 && R2 < adapter.j()) {
                    int i = this.c;
                    rect.left = i;
                    rect.right = i;
                    int i2 = ((o1d) this.o).i(R2);
                    if (i2 == 0 || i2 == 1 || i2 == 4) {
                        rect.top = this.b;
                        return;
                    }
                    return;
                }
                return;
            default:
                hdc adapter2 = recyclerView.getAdapter();
                if (adapter2 != null && (q = z7.q(recyclerView)) != null && (kg6 = q.K) != null && (R = RecyclerView.R(view)) >= 0 && R < adapter2.j()) {
                    int b2 = kg6.b(R, 8);
                    int a2 = kg6.a(R, 8);
                    int a3 = kg6.a(adapter2.j() - 1, 8);
                    int i3 = this.c / 2;
                    if (((Boolean) ((k56) this.o).invoke()).booleanValue()) {
                        if (a2 == 0) {
                            rect.bottom = i3;
                        } else if (a2 == a3) {
                            rect.top = i3;
                        } else {
                            rect.bottom = i3;
                            rect.top = i3;
                        }
                    }
                    int i4 = this.b;
                    rect.left = (b2 * i4) / 8;
                    rect.right = i4 - (((b2 + 1) * i4) / 8);
                    return;
                }
                return;
        }
    }

    public rt5(q64 q64) {
        this.o = q64;
        this.b = tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density);
        this.c = tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
    }
}
