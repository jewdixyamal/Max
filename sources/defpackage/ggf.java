package defpackage;

import android.hardware.display.DisplayManager;
import android.os.Handler;

/* renamed from: ggf  reason: default package */
public final class ggf implements DisplayManager.DisplayListener, fgf {
    public final /* synthetic */ int a = 1;
    public final DisplayManager b;
    public Object c;

    public ggf(kgf kgf, DisplayManager displayManager) {
        this.c = kgf;
        this.b = displayManager;
    }

    private final void a(int i) {
    }

    private final void d(int i) {
    }

    private final void e(int i) {
    }

    private final void f(int i) {
    }

    public void b(gte gte) {
        this.c = gte;
        Handler m = maf.m((Handler.Callback) null);
        DisplayManager displayManager = this.b;
        displayManager.registerDisplayListener(this, m);
        gte.c(displayManager.getDisplay(0));
    }

    public void c() {
        this.b.unregisterDisplayListener(this);
        this.c = null;
    }

    public final void onDisplayAdded(int i) {
        int i2 = this.a;
    }

    public final void onDisplayChanged(int i) {
        switch (this.a) {
            case 0:
                if (i == 0) {
                    kgf.a((kgf) this.c, this.b.getDisplay(0));
                    return;
                }
                return;
            default:
                gte gte = (gte) this.c;
                if (gte != null && i == 0) {
                    gte.c(this.b.getDisplay(0));
                    return;
                }
                return;
        }
    }

    public final void onDisplayRemoved(int i) {
        int i2 = this.a;
    }

    public ggf(DisplayManager displayManager) {
        this.b = displayManager;
    }
}
