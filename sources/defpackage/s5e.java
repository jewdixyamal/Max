package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: s5e  reason: default package */
public final class s5e extends ViewGroup implements kre {
    public final v5e a;
    public final RecyclerView b;

    public s5e(Context context) {
        super(context, (AttributeSet) null);
        v5e v5e = new v5e(context);
        this.a = v5e;
        RecyclerView recyclerView = new RecyclerView(context, (AttributeSet) null);
        recyclerView.setId(tga.f);
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setOverScrollMode(2);
        int G = tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density);
        tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
        recyclerView.j(new sc1(G, G, 6));
        recyclerView.setHasFixedSize(true);
        this.b = recyclerView;
        setClipChildren(false);
        addView(v5e);
        addView(recyclerView);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        v5e v5e = this.a;
        v5e v5e2 = this.a;
        c54.L(paddingStart, paddingTop, v5e.getMeasuredWidth() + paddingStart, v5e2.getMeasuredHeight() + paddingTop, v5e, this);
        RecyclerView recyclerView = this.b;
        c54.L(0, v5e2.getBottom(), getMeasuredWidth(), recyclerView.getMeasuredHeight() + v5e2.getBottom(), recyclerView, this);
    }

    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        v5e v5e = this.a;
        v5e.measure(i, i2);
        RecyclerView recyclerView = this.b;
        recyclerView.measure(i, i2);
        setMeasuredDimension(size, recyclerView.getMeasuredHeight() + v5e.getMeasuredHeight());
    }

    public final void onThemeChanged(fka fka) {
        this.a.onThemeChanged(fka);
    }

    public final void setHeaderClickAction(k56 k56) {
        tu0.K(this.a.getHeaderButton(), 300, new m6(27, k56));
    }
}
