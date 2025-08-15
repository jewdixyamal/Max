package defpackage;

import one.me.messages.list.ui.MessagesListWidget;
import one.me.pinbars.PinBarsWidget;
import one.me.profile.screens.members.ChatMembersScreen;

/* renamed from: qk2  reason: default package */
public final class qk2 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qk2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Object invoke() {
        e5f e5f = e5f.a;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = ChatMembersScreen.u0;
                ((ChatMembersScreen) obj).o0().q();
                return e5f;
            case 1:
                return (ft2) obj;
            case 2:
                return (Boolean) ((jg3) obj).Y1.invoke();
            case 3:
                return Class.forName((String) obj);
            case 4:
                bc7[] bc7Arr2 = MessagesListWidget.X0;
                n59 x0 = ((MessagesListWidget) obj).x0();
                z2e z2e = (z2e) x0.A1.getValue();
                if (z2e != null) {
                    ((s8g) x0.T0.getValue()).a(new v8d(new u8d(x0.b.a, z2e.a, 1)));
                }
                xx6 xx6 = (xx6) o19.a.getAccessor().e();
                if (xx6 != null) {
                    xx6.f(bcd.a0(new wx6(ux6.SEND_5_MESSAGES, 1), new wx6(ux6.SEND_3_STICKERS, 1)), wuc.CHAT);
                }
                return e5f;
            default:
                return qp4.u0.o(((PinBarsWidget) obj).getContext()).c;
        }
    }
}
