package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: rud  reason: default package */
public final class rud extends rxd {
    public View c;
    public WindowInsetsController o;

    public final void Z() {
        WindowInsetsController windowInsetsController = this.o;
        View view = this.c;
        if (windowInsetsController == null) {
            windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        }
        if (windowInsetsController != null) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            qud qud = new qud(atomicBoolean);
            windowInsetsController.addOnControllableInsetsChangedListener(qud);
            if (!atomicBoolean.get() && view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(qud);
            windowInsetsController.hide(WindowInsets.Type.ime());
            return;
        }
        super.Z();
    }

    public final void f0() {
        View view = this.c;
        if (view != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        WindowInsetsController windowInsetsController = this.o;
        if (windowInsetsController == null) {
            windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        }
        if (windowInsetsController != null) {
            windowInsetsController.show(WindowInsets.Type.ime());
        }
        super.f0();
    }
}
