package defpackage;

import android.graphics.Rect;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;

/* renamed from: ywc  reason: default package */
public final class ywc extends v3c {
    public final RecyclerView d;

    public ywc(RecyclerView recyclerView) {
        this.d = recyclerView;
    }

    public final void l(Rect rect, Rect rect2) {
        if (rect.height() <= rect2.height()) {
            int i = rect.top;
            int i2 = rect2.top;
            boolean z = false;
            RecyclerView recyclerView = this.d;
            if (i < i2) {
                int i3 = i - i2;
                int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                int i4 = computeVerticalScrollOffset + i3;
                if (computeVerticalScrollOffset > 0) {
                    recyclerView.scrollBy(0, i3);
                }
                if (i4 < 0) {
                    recyclerView.c0(Math.abs(i4));
                    recyclerView.Y();
                }
                rect.offset(0, -i3);
                return;
            }
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            if (i5 > i6) {
                int i7 = i5 - i6;
                int computeVerticalScrollRange = recyclerView.computeVerticalScrollRange() - (recyclerView.computeVerticalScrollExtent() + recyclerView.computeVerticalScrollOffset());
                if (computeVerticalScrollRange < 0) {
                    computeVerticalScrollRange = 0;
                }
                if (computeVerticalScrollRange > 0) {
                    recyclerView.scrollBy(0, i7);
                }
                int i8 = computeVerticalScrollRange - i7;
                a layoutManager = recyclerView.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                hdc adapter = recyclerView.getAdapter();
                int j = (adapter != null ? adapter.j() : 1) - 1;
                boolean z2 = linearLayoutManager != null && linearLayoutManager.T0() == 0;
                if (linearLayoutManager != null && linearLayoutManager.X0() == j) {
                    z = true;
                }
                if (z2 && z) {
                    recyclerView.c0(-i7);
                } else if (i8 < 0) {
                    recyclerView.c0(i8);
                }
            }
        }
    }
}
