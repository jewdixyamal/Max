package defpackage;

import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: a09  reason: default package */
public final /* synthetic */ class a09 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageWriteWidget b;

    public /* synthetic */ a09(MessageWriteWidget messageWriteWidget, int i) {
        this.a = i;
        this.b = messageWriteWidget;
    }

    public final void onClick(View view) {
        MessageWriteWidget messageWriteWidget = this.b;
        switch (this.a) {
            case 0:
                int i = messageWriteWidget.E0;
                if (i != 0) {
                    xz8 v0 = messageWriteWidget.v0();
                    CharSequence charSequence = (CharSequence) messageWriteWidget.q0().getMessageState().getValue();
                    Integer num = (Integer) messageWriteWidget.q0().getMessagePosition().getValue();
                    v0.getClass();
                    int s = au1.s(i);
                    if (s == 0) {
                        xz8.C(v0, (Long) null, (CharSequence) null, (Integer) null, 14);
                        return;
                    } else if (s == 1) {
                        v0.P0.m((Object) null, new bz8(charSequence, num));
                        v0.D((Long) null);
                        return;
                    } else if (s == 2) {
                        pnf.o(v0.z0, new Object());
                        return;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    return;
                }
            default:
                bc7[] bc7Arr = MessageWriteWidget.F0;
                messageWriteWidget.X.f.k = messageWriteWidget.q0().getText();
                xz8 v02 = messageWriteWidget.v0();
                pnf.o(v02.z0, jz8.a);
                return;
        }
    }
}
