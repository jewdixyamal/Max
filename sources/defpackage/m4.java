package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: m4  reason: default package */
public final class m4 extends AccessibilityNodeProvider {
    public final w4d a;

    public m4(w4d w4d) {
        this.a = w4d;
    }

    public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        this.a.getClass();
    }

    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        l4 D = this.a.D(i);
        if (D == null) {
            return null;
        }
        return D.a;
    }

    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.a.getClass();
        return null;
    }

    public final AccessibilityNodeInfo findFocus(int i) {
        l4 E = this.a.E(i);
        if (E == null) {
            return null;
        }
        return E.a;
    }

    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.a.K(i, i2, bundle);
    }
}
