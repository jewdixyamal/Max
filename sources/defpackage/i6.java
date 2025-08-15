package defpackage;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: i6  reason: default package */
public final class i6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActionBarOverlayLayout b;

    public /* synthetic */ i6(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.a = i;
        this.b = actionBarOverlayLayout;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.b;
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.K0 = actionBarOverlayLayout.o.animate().translationY(0.0f).setListener(actionBarOverlayLayout.L0);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.b;
                actionBarOverlayLayout2.b();
                actionBarOverlayLayout2.K0 = actionBarOverlayLayout2.o.animate().translationY((float) (-actionBarOverlayLayout2.o.getHeight())).setListener(actionBarOverlayLayout2.L0);
                return;
        }
    }
}
