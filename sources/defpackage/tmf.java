package defpackage;

import android.view.View;
import android.view.autofill.AutofillId;
import java.util.Objects;

/* renamed from: tmf  reason: default package */
public abstract class tmf {
    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View$OnUnhandledKeyEventListener, java.lang.Object] */
    public static void a(View view, ymf ymf) {
        qpd qpd = (qpd) view.getTag(twb.tag_unhandled_key_listeners);
        if (qpd == null) {
            qpd = new qpd();
            view.setTag(twb.tag_unhandled_key_listeners, qpd);
        }
        Objects.requireNonNull(ymf);
        ? obj = new Object();
        qpd.put(ymf, obj);
        view.addOnUnhandledKeyEventListener(obj);
    }

    public static CharSequence b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean c(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(View view, ymf ymf) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        qpd qpd = (qpd) view.getTag(twb.tag_unhandled_key_listeners);
        if (qpd != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) qpd.get(ymf)) != null) {
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }
    }

    public static <T> T f(View view, int i) {
        return view.requireViewById(i);
    }

    public static void g(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, oc0 oc0) {
        view.setAutofillId((AutofillId) null);
    }

    public static void j(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }
}
