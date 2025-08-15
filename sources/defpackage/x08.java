package defpackage;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* renamed from: x08  reason: default package */
public class x08 {
    public OnBackInvokedCallback a;

    public OnBackInvokedCallback a(w08 w08) {
        Objects.requireNonNull(w08);
        return new wm(1, w08);
    }

    public void b(w08 w08, View view, boolean z) {
        OnBackInvokedDispatcher m;
        if (this.a == null && (m = view.findOnBackInvokedDispatcher()) != null) {
            OnBackInvokedCallback a2 = a(w08);
            this.a = a2;
            m.registerOnBackInvokedCallback(z ? 1000000 : 0, a2);
        }
    }

    public void c(View view) {
        OnBackInvokedDispatcher m = view.findOnBackInvokedDispatcher();
        if (m != null) {
            m.unregisterOnBackInvokedCallback(this.a);
            this.a = null;
        }
    }
}
