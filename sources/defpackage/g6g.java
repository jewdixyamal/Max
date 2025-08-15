package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.List;

/* renamed from: g6g  reason: default package */
public final class g6g extends j6g {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final vb5 f = new vb5(0);
    public static final DecelerateInterpolator g = new DecelerateInterpolator();

    public static void e(View view, k6g k6g) {
        q42 j = j(view);
        if (j != null) {
            j.b(k6g);
            if (j.a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i), k6g);
            }
        }
    }

    public static void f(View view, k6g k6g, WindowInsets windowInsets, boolean z) {
        q42 j = j(view);
        if (j != null) {
            j.b = windowInsets;
            if (!z) {
                j.c(k6g);
                z = j.a == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), k6g, windowInsets, z);
            }
        }
    }

    public static void g(View view, x6g x6g, List list) {
        q42 j = j(view);
        if (j != null) {
            x6g = j.d(x6g, list);
            if (j.a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), x6g, list);
            }
        }
    }

    public static void h(View view, k6g k6g, l7b l7b) {
        q42 j = j(view);
        if (j != null) {
            j.e(k6g, l7b);
            if (j.a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                h(viewGroup.getChildAt(i), k6g, l7b);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        return view.getTag(twb.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static q42 j(View view) {
        Object tag = view.getTag(twb.tag_window_insets_animation_callback);
        if (tag instanceof f6g) {
            return ((f6g) tag).a;
        }
        return null;
    }
}
