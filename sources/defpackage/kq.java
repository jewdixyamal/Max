package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: kq  reason: default package */
public final class kq extends ndc {
    public final /* synthetic */ int a;

    public /* synthetic */ kq(int i) {
        this.a = i;
    }

    public final void f(Rect rect, View view, RecyclerView recyclerView, zdc zdc) {
        int R;
        switch (this.a) {
            case 0:
                recyclerView.getClass();
                int R2 = RecyclerView.R(view);
                hdc adapter = recyclerView.getAdapter();
                xq0 xq0 = null;
                Integer valueOf = adapter != null ? Integer.valueOf(adapter.j()) : null;
                if (R2 != -1 && valueOf != null) {
                    view.setClipToOutline(true);
                    if (R2 == 0) {
                        xq0 = new xq0(1, fk4.d().getDisplayMetrics().density * 16.0f);
                    } else if (R2 == valueOf.intValue() - 1) {
                        xq0 = new xq0(0, fk4.d().getDisplayMetrics().density * 16.0f);
                    }
                    view.setOutlineProvider(xq0);
                    return;
                }
                return;
            case 1:
                float f = (float) 4;
                rect.top = tu0.G(fk4.d().getDisplayMetrics().density * f);
                rect.bottom = tu0.G(f * fk4.d().getDisplayMetrics().density);
                return;
            case 2:
                recyclerView.getClass();
                int R3 = RecyclerView.R(view);
                if (c54.K(view)) {
                    rect.right = tu0.G((R3 == 0 ? (float) 16 : (float) 8) * fk4.d().getDisplayMetrics().density);
                    return;
                } else {
                    rect.left = tu0.G((R3 == 0 ? (float) 16 : (float) 8) * fk4.d().getDisplayMetrics().density);
                    return;
                }
            case 3:
                dec T = recyclerView.T(view);
                if (T != null) {
                    int i = T.Y;
                    if (i == p8a.a || i == p8a.b || i == p8a.u || i == p8a.v) {
                        float f2 = (float) 6;
                        rect.set(tu0.G(fk4.d().getDisplayMetrics().density * f2), 0, tu0.G(f2 * fk4.d().getDisplayMetrics().density), 0);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                recyclerView.getClass();
                int R4 = RecyclerView.R(view);
                rect.set((R4 == -1 || R4 == 0) ? 0 : tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density), tu0.G(((float) 24) * fk4.d().getDisplayMetrics().density), rect.right, 0);
                return;
            case 5:
                super.f(rect, view, recyclerView, zdc);
                hdc adapter2 = recyclerView.getAdapter();
                if (adapter2 != null && (R = RecyclerView.R(view)) > 0) {
                    int l = adapter2.l(R);
                    if ((l == z8a.m || l == z8a.s) && adapter2.l(R - 1) == gca.c) {
                        rect.top = tu0.G(((float) 10) * fk4.d().getDisplayMetrics().density);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                recyclerView.getClass();
                int R5 = RecyclerView.R(view);
                hdc adapter3 = recyclerView.getAdapter();
                Integer valueOf2 = adapter3 != null ? Integer.valueOf(adapter3.j()) : null;
                if (R5 != -1 && valueOf2 != null) {
                    int i2 = 0;
                    rect.top = R5 == 0 ? tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density) : 0;
                    float f3 = (float) 12;
                    rect.left = tu0.G(fk4.d().getDisplayMetrics().density * f3);
                    rect.right = tu0.G(f3 * fk4.d().getDisplayMetrics().density);
                    if (R5 == valueOf2.intValue() - 1) {
                        i2 = tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density);
                    }
                    rect.bottom = i2;
                    return;
                }
                return;
            case 7:
                recyclerView.getClass();
                int R6 = RecyclerView.R(view);
                hdc adapter4 = recyclerView.getAdapter();
                Integer valueOf3 = adapter4 != null ? Integer.valueOf(adapter4.j()) : null;
                if (R6 != -1 && valueOf3 != null) {
                    rect.top = R6 == 0 ? tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density) : 0;
                    return;
                }
                return;
            case 8:
                hdc adapter5 = recyclerView.getAdapter();
                if (adapter5 != null) {
                    if (RecyclerView.R(view) != adapter5.j() - 1) {
                    }
                    rect.left = tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density);
                    rect.top = tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density);
                    rect.right = tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density);
                    rect.bottom = tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density);
                    return;
                }
                return;
            case 9:
                recyclerView.getClass();
                if (RecyclerView.R(view) != -1 && (view instanceof OneMeButton)) {
                    rect.set(rect.left, tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density), rect.right, rect.bottom);
                    return;
                }
                return;
            case 10:
                recyclerView.getClass();
                int R7 = RecyclerView.R(view);
                if (R7 != -1 && R7 != 0 && (view instanceof AppCompatTextView)) {
                    rect.set(rect.left, tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density), rect.right, rect.bottom);
                    return;
                }
                return;
            default:
                recyclerView.getClass();
                int R8 = RecyclerView.R(view);
                if (c54.K(view)) {
                    rect.right = tu0.G((R8 == 0 ? (float) 4 : (float) 6) * fk4.d().getDisplayMetrics().density);
                    if (z7.H(recyclerView, R8)) {
                        rect.left = tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density);
                    }
                } else {
                    rect.left = tu0.G((R8 == 0 ? (float) 4 : (float) 6) * fk4.d().getDisplayMetrics().density);
                    if (z7.H(recyclerView, R8)) {
                        rect.right = tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density);
                    }
                }
                float f4 = (float) 4;
                rect.top = tu0.G(fk4.d().getDisplayMetrics().density * f4);
                rect.bottom = tu0.G(f4 * fk4.d().getDisplayMetrics().density);
                return;
        }
    }
}
