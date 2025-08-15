package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;

/* renamed from: q85  reason: default package */
public final class q85 extends w4d {
    public final /* synthetic */ r85 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q85(r85 r85) {
        super(1);
        this.c = r85;
    }

    public final l4 D(int i) {
        return new l4(AccessibilityNodeInfo.obtain(this.c.r(i).a));
    }

    public final l4 E(int i) {
        r85 r85 = this.c;
        int i2 = i == 2 ? r85.k : r85.l;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return D(i2);
    }

    public final boolean K(int i, int i2, Bundle bundle) {
        int i3;
        r85 r85 = this.c;
        View view = r85.i;
        if (i != -1) {
            boolean z = true;
            if (i2 == 1) {
                return r85.w(i);
            }
            if (i2 == 2) {
                return r85.j(i);
            }
            if (i2 == 64) {
                AccessibilityManager accessibilityManager = r85.h;
                if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i3 = r85.k) != i) {
                    if (i3 != Integer.MIN_VALUE) {
                        r85.k = Integer.MIN_VALUE;
                        r85.i.invalidate();
                        r85.x(i3, 65536);
                    }
                    r85.k = i;
                    view.invalidate();
                    r85.x(i, 32768);
                    return z;
                }
            } else if (i2 != 128) {
                return r85.s(i, i2, bundle);
            } else {
                if (r85.k == i) {
                    r85.k = Integer.MIN_VALUE;
                    view.invalidate();
                    r85.x(i, 65536);
                    return z;
                }
            }
            z = false;
            return z;
        }
        WeakHashMap weakHashMap = zmf.a;
        return view.performAccessibilityAction(i2, bundle);
    }
}
