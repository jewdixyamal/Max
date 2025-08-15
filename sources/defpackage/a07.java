package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;

/* renamed from: a07  reason: default package */
public final class a07 extends View.AccessibilityDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a07(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.a) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                EditText editText = ((b07) this.b).h.getEditText();
                if (editText != null) {
                    accessibilityNodeInfo.setLabeledBy(editText);
                    return;
                }
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                return;
        }
    }

    public void sendAccessibilityEvent(View view, int i) {
        Object value;
        switch (this.a) {
            case 1:
                if (i == 8192) {
                    sv8 sv8 = (sv8) this.b;
                    q0e q0e = sv8.L0;
                    do {
                        value = q0e.getValue();
                        ((Number) value).intValue();
                    } while (!q0e.c(value, Integer.valueOf(sv8.c.getSelectionEnd())));
                    return;
                }
                return;
            default:
                super.sendAccessibilityEvent(view, i);
                return;
        }
    }
}
