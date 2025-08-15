package defpackage;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: f4  reason: default package */
public final class f4 {
    public static final f4 e = new f4(16);
    public static final f4 f = new f4(4096);
    public static final f4 g = new f4(8192);
    public static final f4 h = new f4(262144);
    public static final f4 i = new f4(524288);
    public static final f4 j = new f4(1048576);
    public static final f4 k = new f4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, (String) null, (u4) null, (Class) null);
    public static final f4 l = new f4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, (String) null, (u4) null, (Class) null);
    public static final f4 m = new f4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, 16908349, (String) null, (u4) null, r4.class);
    public final Object a;
    public final int b;
    public final Class c;
    public final u4 d;

    static {
        new f4(1);
        new f4(2);
        new f4(4);
        new f4(8);
        new f4(32);
        new f4(64);
        new f4(128);
        Class<n4> cls = n4.class;
        new f4(cls, 256);
        new f4(cls, 512);
        Class<o4> cls2 = o4.class;
        new f4(cls2, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        new f4(cls2, 2048);
        new f4(16384);
        new f4(32768);
        new f4(65536);
        new f4(s4.class, 131072);
        new f4(t4.class, 2097152);
        int i2 = Build.VERSION.SDK_INT;
        new f4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, (String) null, (u4) null, (Class) null);
        new f4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, (String) null, (u4) null, q4.class);
        new f4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, (String) null, (u4) null, (Class) null);
        new f4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, (String) null, (u4) null, (Class) null);
        new f4(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP, 16908358, (String) null, (u4) null, (Class) null);
        new f4(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN, 16908359, (String) null, (u4) null, (Class) null);
        new f4(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT, 16908360, (String) null, (u4) null, (Class) null);
        new f4(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT, 16908361, (String) null, (u4) null, (Class) null);
        new f4(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, (String) null, (u4) null, (Class) null);
        new f4(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, 16908354, (String) null, (u4) null, p4.class);
        new f4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, 16908356, (String) null, (u4) null, (Class) null);
        new f4(AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, 16908357, (String) null, (u4) null, (Class) null);
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
        new f4(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, (String) null, (u4) null, (Class) null);
        new f4(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, 16908372, (String) null, (u4) null, (Class) null);
        new f4(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, 16908373, (String) null, (u4) null, (Class) null);
        new f4(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, 16908374, (String) null, (u4) null, (Class) null);
        new f4(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, 16908375, (String) null, (u4) null, (Class) null);
        new f4(i2 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, 16908376, (String) null, (u4) null, (Class) null);
        if (i2 >= 34) {
            accessibilityAction = i4.a();
        }
        new f4(accessibilityAction, 16908382, (String) null, (u4) null, (Class) null);
    }

    public f4(int i2) {
        this((Object) null, i2, (String) null, (u4) null, (Class) null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof f4)) {
            return false;
        }
        Object obj2 = ((f4) obj).a;
        Object obj3 = this.a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String d2 = l4.d(this.b);
        if (d2.equals("ACTION_UNKNOWN")) {
            Object obj = this.a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                d2 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(d2);
        return sb.toString();
    }

    public f4(Class cls, int i2) {
        this((Object) null, i2, (String) null, (u4) null, cls);
    }

    public f4(Object obj, int i2, String str, u4 u4Var, Class cls) {
        this.b = i2;
        this.d = u4Var;
        if (obj == null) {
            this.a = new AccessibilityNodeInfo.AccessibilityAction(i2, str);
        } else {
            this.a = obj;
        }
        this.c = cls;
    }
}
