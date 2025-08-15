package defpackage;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;

/* renamed from: zmf  reason: default package */
public abstract class zmf {
    public static WeakHashMap a;
    public static final int[] b = {twb.accessibility_custom_action_0, twb.accessibility_custom_action_1, twb.accessibility_custom_action_2, twb.accessibility_custom_action_3, twb.accessibility_custom_action_4, twb.accessibility_custom_action_5, twb.accessibility_custom_action_6, twb.accessibility_custom_action_7, twb.accessibility_custom_action_8, twb.accessibility_custom_action_9, twb.accessibility_custom_action_10, twb.accessibility_custom_action_11, twb.accessibility_custom_action_12, twb.accessibility_custom_action_13, twb.accessibility_custom_action_14, twb.accessibility_custom_action_15, twb.accessibility_custom_action_16, twb.accessibility_custom_action_17, twb.accessibility_custom_action_18, twb.accessibility_custom_action_19, twb.accessibility_custom_action_20, twb.accessibility_custom_action_21, twb.accessibility_custom_action_22, twb.accessibility_custom_action_23, twb.accessibility_custom_action_24, twb.accessibility_custom_action_25, twb.accessibility_custom_action_26, twb.accessibility_custom_action_27, twb.accessibility_custom_action_28, twb.accessibility_custom_action_29, twb.accessibility_custom_action_30, twb.accessibility_custom_action_31};
    public static final jmf c = new Object();
    public static final lmf d = new lmf();

    public static vof a(View view) {
        if (a == null) {
            a = new WeakHashMap();
        }
        vof vof = (vof) a.get(view);
        if (vof != null) {
            return vof;
        }
        vof vof2 = new vof(view);
        a.put(view, vof2);
        return vof2;
    }

    public static x6g b(View view, x6g x6g) {
        WindowInsets e = x6g.e();
        if (e != null) {
            WindowInsets a2 = mmf.a(view, e);
            if (!a2.equals(e)) {
                return x6g.f(view, a2);
            }
        }
        return x6g;
    }

    public static ArrayList c(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(twb.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(twb.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] d(View view) {
        return Build.VERSION.SDK_INT >= 31 ? wmf.a(view) : (String[]) view.getTag(twb.tag_on_receive_content_mime_types);
    }

    public static void e(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = tmf.b(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            int i2 = 32;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z) {
                    i2 = 2048;
                }
                obtain.setEventType(i2);
                obtain.setContentChangeTypes(i);
                if (z) {
                    obtain.getText().add(tmf.b(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                obtain2.setContentChangeTypes(i);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(tmf.b(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                } catch (AbstractMethodError unused) {
                    view.getParent().getClass();
                }
            }
        }
    }

    public static x6g f(View view, x6g x6g) {
        WindowInsets e = x6g.e();
        if (e != null) {
            WindowInsets b2 = mmf.b(view, e);
            if (!b2.equals(e)) {
                return x6g.f(view, b2);
            }
        }
        return x6g;
    }

    public static bt3 g(View view, bt3 bt3) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(bt3);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return wmf.b(view, bt3);
        }
        v3a v3a = (v3a) view.getTag(twb.tag_on_receive_content_listener);
        w3a w3a = c;
        if (v3a != null) {
            bt3 a2 = v3a.a(view, bt3);
            if (a2 == null) {
                return null;
            }
            if (view instanceof w3a) {
                w3a = (w3a) view;
            }
            return w3a.b(a2);
        }
        if (view instanceof w3a) {
            w3a = (w3a) view;
        }
        return w3a.b(bt3);
    }

    public static void h(View view, int i) {
        ArrayList c2 = c(view);
        for (int i2 = 0; i2 < c2.size(); i2++) {
            if (((f4) c2.get(i2)).a() == i) {
                c2.remove(i2);
                return;
            }
        }
    }

    public static void i(View view, f4 f4Var, u4 u4Var) {
        if (u4Var == null) {
            h(view, f4Var.a());
            e(view, 0);
            return;
        }
        f4 f4Var2 = new f4((Object) null, f4Var.b, (String) null, u4Var, f4Var.c);
        View.AccessibilityDelegate a2 = umf.a(view);
        a4 a4Var = a2 == null ? null : a2 instanceof z3 ? ((z3) a2).a : new a4(a2);
        if (a4Var == null) {
            a4Var = new a4();
        }
        j(view, a4Var);
        h(view, f4Var2.a());
        c(view).add(f4Var2);
        e(view, 0);
    }

    public static void j(View view, a4 a4Var) {
        if (a4Var == null && (umf.a(view) instanceof z3)) {
            a4Var = new a4();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(a4Var == null ? null : a4Var.b);
    }

    public static void k(View view, CharSequence charSequence) {
        new kmf(twb.tag_accessibility_pane_title, CharSequence.class, 8, 28, 0).g(view, charSequence);
        lmf lmf = d;
        if (charSequence != null) {
            lmf.a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(lmf);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(lmf);
                return;
            }
            return;
        }
        lmf.a.remove(view);
        view.removeOnAttachStateChangeListener(lmf);
        view.getViewTreeObserver().removeOnGlobalLayoutListener(lmf);
    }

    public static void l(View view, q42 q42) {
        h6g h6g = null;
        if (Build.VERSION.SDK_INT >= 30) {
            if (q42 != null) {
                h6g = new h6g(q42);
            }
            view.setWindowInsetsAnimationCallback(h6g);
            return;
        }
        PathInterpolator pathInterpolator = g6g.e;
        Object tag = view.getTag(twb.tag_on_apply_window_listener);
        if (q42 == null) {
            view.setTag(twb.tag_window_insets_animation_callback, (Object) null);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) null);
                return;
            }
            return;
        }
        f6g f6g = new f6g(view, q42);
        view.setTag(twb.tag_window_insets_animation_callback, f6g);
        if (tag == null) {
            view.setOnApplyWindowInsetsListener(f6g);
        }
    }
}
