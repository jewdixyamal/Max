package defpackage;

import android.view.View;
import android.view.Window;
import androidx.fragment.app.b;

/* renamed from: pb3  reason: default package */
public final /* synthetic */ class pb3 implements ug7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yb3 b;

    public /* synthetic */ pb3(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    public final void m(eh7 eh7, eg7 eg7) {
        Window window;
        View peekDecorView;
        switch (this.a) {
            case 0:
                if (eg7 == eg7.ON_STOP && (window = this.b.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                    peekDecorView.cancelPendingInputEvents();
                    return;
                }
                return;
            default:
                yb3 yb3 = this.b;
                if (eg7 == eg7.ON_DESTROY) {
                    yb3.b.b = null;
                    if (!yb3.isChangingConfigurations()) {
                        yb3.w().a();
                    }
                    vb3 vb3 = yb3.Y;
                    yb3 yb32 = vb3.o;
                    yb32.getWindow().getDecorView().removeCallbacks(vb3);
                    yb32.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(vb3);
                    return;
                }
                return;
        }
    }
}
