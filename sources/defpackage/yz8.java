package defpackage;

import android.view.ViewGroup;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: yz8  reason: default package */
public final /* synthetic */ class yz8 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageWriteWidget b;

    public /* synthetic */ yz8(MessageWriteWidget messageWriteWidget, int i) {
        this.a = i;
        this.b = messageWriteWidget;
    }

    public final Object invoke() {
        pq9 pq9 = qp4.u0;
        MessageWriteWidget messageWriteWidget = this.b;
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((jp) ((hp) messageWriteWidget.Y.getValue())).g.getBoolean("app.messages.send.by.enter", false));
            case 1:
                bc7[] bc7Arr = MessageWriteWidget.F0;
                csb csb = new csb(messageWriteWidget.getContext());
                csb.setLayoutParams(new ViewGroup.LayoutParams(-1, tu0.G(((float) 52) * fk4.d().getDisplayMetrics().density)));
                csb.setEndIconDrawable(kt3.b(csb.getContext(), woc.v));
                csb.setEndIconClickListener(new a09(messageWriteWidget, 0));
                v3c.y(new br(3, (Continuation) null, 10), csb);
                if (!csb.isLaidOut() || csb.isLayoutRequested()) {
                    csb.addOnLayoutChangeListener(new hp1(csb, 3, messageWriteWidget));
                } else if (qqe.c(csb.getTitleView())) {
                    MessageWriteWidget.B0(csb, true);
                }
                return csb;
            case 2:
                bc7[] bc7Arr2 = MessageWriteWidget.F0;
                return pq9.o(messageWriteWidget.getContext()).c;
            default:
                bc7[] bc7Arr3 = MessageWriteWidget.F0;
                return pq9.o(messageWriteWidget.getContext()).c;
        }
    }
}
