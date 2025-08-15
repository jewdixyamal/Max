package defpackage;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;

/* renamed from: b4  reason: default package */
public final class b4 implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final q64 a;

    public b4(q64 q64) {
        this.a = q64;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4)) {
            return false;
        }
        return this.a.equals(((b4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void onTouchExplorationStateChanged(boolean z) {
        qs4 qs4 = (qs4) this.a.b;
        AutoCompleteTextView autoCompleteTextView = qs4.h;
        if (autoCompleteTextView != null && !ft.n(autoCompleteTextView)) {
            int i = z ? 2 : 1;
            WeakHashMap weakHashMap = zmf.a;
            qs4.d.setImportantForAccessibility(i);
        }
    }
}
