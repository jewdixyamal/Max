package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

public class TrackSelectionView extends LinearLayout {
    public final CheckedTextView a;
    public final CheckedTextView b;
    public final SparseArray c = new SparseArray();
    public boolean o;
    public boolean s0;
    public boolean t0;

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16843534});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(context);
        e0d e0d = new e0d(14, this);
        getResources().getClass();
        sze sze = sze.o;
        CheckedTextView checkedTextView = (CheckedTextView) from.inflate(17367055, this, false);
        this.a = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(f2c.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(e0d);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(uyb.exo_list_divider, this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(17367055, this, false);
        this.b = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(f2c.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(e0d);
        addView(checkedTextView2);
    }

    public final void a() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount >= 3) {
                removeViewAt(childCount);
            } else {
                this.a.setEnabled(false);
                this.b.setEnabled(false);
                return;
            }
        }
    }

    public boolean getIsDisabled() {
        return this.t0;
    }

    public List<qe4> getOverrides() {
        SparseArray sparseArray = this.c;
        ArrayList arrayList = new ArrayList(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            arrayList.add((qe4) sparseArray.valueAt(i));
        }
        return arrayList;
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.o != z) {
            this.o = z;
            a();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if (this.s0 != z) {
            this.s0 = z;
            if (!z) {
                SparseArray sparseArray = this.c;
                if (sparseArray.size() > 1) {
                    for (int size = sparseArray.size() - 1; size > 0; size--) {
                        sparseArray.remove(size);
                    }
                }
            }
            a();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.a.setVisibility(z ? 0 : 8);
    }

    public void setTrackNameProvider(uze uze) {
        uze.getClass();
        a();
    }
}
