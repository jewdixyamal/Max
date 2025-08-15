package defpackage;

import android.widget.PopupWindow;
import one.me.pinbars.PinBarsWidget;

/* renamed from: hr8  reason: default package */
public final class hr8 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hr8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onDismiss() {
        switch (this.a) {
            case 0:
                ((ir8) this.b).c();
                return;
            default:
                ((PinBarsWidget) this.b).a = null;
                return;
        }
    }
}
