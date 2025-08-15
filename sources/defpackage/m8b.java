package defpackage;

import android.hardware.display.DisplayManager;
import android.view.Display;

/* renamed from: m8b  reason: default package */
public final class m8b implements DisplayManager.DisplayListener {
    public final /* synthetic */ q8b a;

    public m8b(q8b q8b) {
        this.a = q8b;
    }

    public final void onDisplayAdded(int i) {
    }

    public final void onDisplayChanged(int i) {
        q8b q8b = this.a;
        Display display = q8b.getDisplay();
        if (display != null && display.getDisplayId() == i) {
            q8b.b();
        }
    }

    public final void onDisplayRemoved(int i) {
    }
}
