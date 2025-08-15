package ru.ok.tamtam.photoeditor.view.colorselector;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ColorSelectorView extends RecyclerView {
    public final m63 V1;
    public final int W1 = 0;

    public ColorSelectorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z = false;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, f3c.ColorSelectorView);
        this.W1 = obtainStyledAttributes.getInt(f3c.ColorSelectorView_color_selector_orientation, 0);
        obtainStyledAttributes.recycle();
        getContext();
        int i = this.W1;
        setLayoutManager(new LinearLayoutManager(i == 0 ? 0 : 1, i == 0 ? true : z));
        m63 m63 = new m63(getContext(), this.W1);
        this.V1 = m63;
        setAdapter(m63);
    }

    public void setColors(int[] iArr) {
        m63 m63 = this.V1;
        m63.X = iArr;
        m63.m();
    }

    public void setListener(o63 o63) {
        this.V1.u0 = o63;
    }
}
