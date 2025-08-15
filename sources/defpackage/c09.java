package defpackage;

import android.widget.PopupWindow;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: c09  reason: default package */
public final /* synthetic */ class c09 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageWriteWidget b;

    public /* synthetic */ c09(MessageWriteWidget messageWriteWidget, int i) {
        this.a = i;
        this.b = messageWriteWidget;
    }

    public final void onDismiss() {
        switch (this.a) {
            case 0:
                this.b.D0 = null;
                return;
            default:
                this.b.D0 = null;
                return;
        }
    }
}
