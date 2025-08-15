package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;

/* renamed from: uyc  reason: default package */
public final class uyc extends FrameLayout implements kre {
    public final void onThemeChanged(fka fka) {
        View childAt = getChildAt(0);
        ProgressBar progressBar = childAt instanceof ProgressBar ? (ProgressBar) childAt : null;
        if (progressBar != null) {
            ngg.H(progressBar, fka.getIcon().i);
        }
    }
}
