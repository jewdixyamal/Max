package defpackage;

import android.widget.ImageView;
import one.me.rlottie.ImageReceiver;

/* renamed from: gi  reason: default package */
public final class gi implements ImageReceiver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gi(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void invalidate() {
        switch (this.a) {
            case 0:
                ((hi) this.b).invalidate();
                return;
            case 1:
                ((ImageView) ((mw4) this.b).a).invalidate();
                return;
            case 2:
                ((iw8) this.b).invalidate();
                return;
            case 3:
                ((dy8) this.b).invalidate();
                return;
            default:
                ((z3g) this.b).invalidate();
                return;
        }
    }
}
