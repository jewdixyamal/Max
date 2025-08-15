package ru.ok.tamtam.stickers.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;

public class RecyclerAutofitGridView extends RecyclerView {
    public final GridLayoutManager V1;
    public int W1 = 5;
    public int X1;
    public View Y1;
    public final pz4 Z1 = new pz4(5, this);

    public RecyclerAutofitGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.W1);
        this.V1 = gridLayoutManager;
        setLayoutManager(gridLayoutManager);
    }

    public final void F0() {
        if (this.Y1 != null) {
            hdc adapter = getAdapter();
            this.Y1.setVisibility((adapter == null || adapter.j() <= 0) ? 0 : 8);
        }
    }

    public int getSpanCount() {
        return this.W1;
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.X1 > 0) {
            this.V1.A1(Math.max(1, getMeasuredWidth() / this.X1));
        }
    }

    public void setAdapter(hdc hdc) {
        hdc adapter = getAdapter();
        pz4 pz4 = this.Z1;
        if (adapter != null) {
            adapter.B(pz4);
        }
        super.setAdapter(hdc);
        if (this.Y1 != null) {
            if (hdc != null) {
                hdc.z(pz4);
            }
            F0();
        }
    }

    public void setColumnWidth(int i) {
        this.X1 = i;
        requestLayout();
    }

    public void setDefaultColumns(int i) {
        this.W1 = i;
        this.V1.A1(i);
        setLayoutManager((a) null);
        setLayoutManager(this.V1);
    }

    public void setEmptyView(View view) {
        this.Y1 = view;
        hdc adapter = getAdapter();
        if (adapter != null) {
            adapter.z(this.Z1);
        }
        F0();
    }

    public void setSpanSizeLookup(kg6 kg6) {
        this.V1.K = kg6;
    }
}
