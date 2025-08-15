package defpackage;

import android.app.Application;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.messages.list.ui.recycler.MessagesLayoutManager;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* renamed from: p59  reason: default package */
public final /* synthetic */ class p59 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesListWidget b;

    public /* synthetic */ p59(MessagesListWidget messagesListWidget, int i) {
        this.a = i;
        this.b = messagesListWidget;
    }

    public final Object invoke() {
        boolean z = true;
        boolean z2 = false;
        MessagesListWidget messagesListWidget = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = MessagesListWidget.X0;
                return Boolean.valueOf(messagesListWidget.x0().A().d());
            case 1:
                bc7[] bc7Arr2 = MessagesListWidget.X0;
                return new fn5((Application) o19.a.getAccessor().c(Application.class), new o59(messagesListWidget, 3));
            case 2:
                bc7[] bc7Arr3 = MessagesListWidget.X0;
                return new v29(messagesListWidget.u0(), new p59(messagesListWidget, 7));
            case 3:
                bc7[] bc7Arr4 = MessagesListWidget.X0;
                p59 p59 = new p59(messagesListWidget, 4);
                qyc qyc = (qyc) ((y7d) o19.a.getAccessor().c(y7d.class));
                qyc.getClass();
                int i = 40;
                int q = (int) qyc.q(PmsKey.f87msggetreactionspagesize, (long) 40);
                if (q > 0) {
                    i = q;
                }
                if (((t5c) messagesListWidget.t0().q().n.getValue()).compareTo(t5c.b) < 0) {
                    z = false;
                }
                return new j7b(p59, i, z, (sj3) messagesListWidget.t0().q().o.getValue());
            case 4:
                bc7[] bc7Arr5 = MessagesListWidget.X0;
                List<MessageModel> list = ((l29) messagesListWidget.x0().p1.getValue()).a;
                ArrayList arrayList = new ArrayList(z53.S(list, 10));
                for (MessageModel messageModel : list) {
                    arrayList.add(Long.valueOf(messageModel.b));
                }
                return arrayList;
            case 5:
                bc7[] bc7Arr6 = MessagesListWidget.X0;
                return messagesListWidget.getRouter();
            case 6:
                bc7[] bc7Arr7 = MessagesListWidget.X0;
                return messagesListWidget.getContext();
            case 7:
                bc7[] bc7Arr8 = MessagesListWidget.X0;
                if ((((l29) messagesListWidget.x0().p1.getValue()).b || ((l29) messagesListWidget.x0().p1.getValue()).c) && !messagesListWidget.u0().O0()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 8:
                bc7[] bc7Arr9 = MessagesListWidget.X0;
                messagesListWidget.getContext();
                return new MessagesLayoutManager();
            case 9:
                bc7[] bc7Arr10 = MessagesListWidget.X0;
                n59 x0 = messagesListWidget.x0();
                e52 e52 = (e52) x0.o1.a.getValue();
                if (e52 != null && (x0.A().d() || !e52.U(((ns8) x0.F0.getValue()).g()) || !e52.b.g())) {
                    z2 = true;
                }
                return Boolean.valueOf(!z2);
            case 10:
                bc7[] bc7Arr11 = MessagesListWidget.X0;
                return new m89(messagesListWidget.u0(), messagesListWidget.x0().b, messagesListWidget.x0().B().o, messagesListWidget.A0, messagesListWidget.v0());
            case 11:
                bc7[] bc7Arr12 = MessagesListWidget.X0;
                FrameLayout frameLayout = new FrameLayout(messagesListWidget.getContext());
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                return frameLayout;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                bc7[] bc7Arr13 = MessagesListWidget.X0;
                h6c h6c = new h6c(messagesListWidget.getContext());
                h6c.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                return h6c;
            default:
                bc7[] bc7Arr14 = MessagesListWidget.X0;
                return new rg1(new khe(new p59(messagesListWidget, 5)), new l5g(messagesListWidget, 0));
        }
    }
}
