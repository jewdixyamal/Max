package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* renamed from: npf  reason: default package */
public final class npf implements View.OnAttachStateChangeListener {
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        WeakHashMap weakHashMap = zmf.a;
        mmf.c(view);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
