package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;

/* renamed from: r03  reason: default package */
public final class r03 implements ViewGroup.OnHierarchyChangeListener {
    public ViewGroup.OnHierarchyChangeListener a;
    public final /* synthetic */ ChipGroup b;

    public r03(ChipGroup chipGroup) {
        this.b = chipGroup;
    }

    public final void onChildViewAdded(View view, View view2) {
        ChipGroup chipGroup = this.b;
        if (view == chipGroup && (view2 instanceof Chip)) {
            if (view2.getId() == -1) {
                WeakHashMap weakHashMap = zmf.a;
                view2.setId(View.generateViewId());
            }
            ana ana = chipGroup.v0;
            Chip chip = (Chip) view2;
            ((HashMap) ana.c).put(Integer.valueOf(chip.getId()), chip);
            if (chip.isChecked()) {
                ana.f(chip);
            }
            chip.setInternalOnCheckedChangeListener(new o9g(9, (Object) ana));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    public final void onChildViewRemoved(View view, View view2) {
        ChipGroup chipGroup = this.b;
        if (view == chipGroup && (view2 instanceof Chip)) {
            ana ana = chipGroup.v0;
            Chip chip = (Chip) view2;
            ana.getClass();
            chip.setInternalOnCheckedChangeListener((m18) null);
            ((HashMap) ana.c).remove(Integer.valueOf(chip.getId()));
            ((HashSet) ana.o).remove(Integer.valueOf(chip.getId()));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
