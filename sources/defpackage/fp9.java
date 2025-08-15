package defpackage;

import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: fp9  reason: default package */
public final class fp9 extends CoordinatorLayout {
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).dispatchApplyWindowInsets(windowInsets);
        }
        return windowInsets;
    }
}
