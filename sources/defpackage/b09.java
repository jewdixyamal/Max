package defpackage;

import android.view.KeyEvent;
import android.view.View;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: b09  reason: default package */
public final /* synthetic */ class b09 implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b09(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        CharSequence text;
        Object obj = this.b;
        boolean z = true;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = MessageWriteWidget.F0;
                MessageWriteWidget messageWriteWidget = (MessageWriteWidget) obj;
                if (!((Boolean) messageWriteWidget.t0.getValue()).booleanValue() || i != 66 || keyEvent.getAction() != 0 || (text = messageWriteWidget.q0().getText()) == null || w9e.C0(text)) {
                    return false;
                }
                messageWriteWidget.A0();
                return true;
            default:
                if (!(keyEvent.getAction() == 0 && i == 67)) {
                    z = false;
                }
                ((lea) obj).s0 = z;
                return false;
        }
    }
}
