package defpackage;

import java.util.Collections;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: ft8  reason: default package */
public final /* synthetic */ class ft8 implements m56 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ xs8 b;
    public final /* synthetic */ ht8 c;

    public /* synthetic */ ft8(xs8 xs8, ht8 ht8) {
        this.b = xs8;
        this.c = ht8;
    }

    public final Object invoke(Object obj) {
        g7c g7c;
        xx6 xx6;
        c6c c6c;
        e5f e5f = e5f.a;
        xs8 xs8 = this.b;
        ht8 ht8 = this.c;
        switch (this.a) {
            case 0:
                ht8.K(xs8, (String) obj);
                return e5f;
            default:
                v5c v5c = (v5c) obj;
                long j = ht8.J0;
                bc7[] bc7Arr = MessagesListWidget.X0;
                MessagesListWidget messagesListWidget = ((b69) xs8).a;
                MessageModel d = ((l29) messagesListWidget.x0().p1.getValue()).d(j);
                v5c v5c2 = null;
                if (d == null) {
                    g7c = null;
                } else {
                    g7c = new g7c(v5c, d.a, d.b, d.B0);
                }
                if (g7c != null) {
                    messagesListWidget.t0().q().l(g7c);
                    ix8 ix8 = g7c.d;
                    if (!(ix8 == null || (c6c = ix8.c) == null)) {
                        v5c2 = c6c.b;
                    }
                    if (!tpa.f(v5c2, v5c) && (xx6 = (xx6) o19.a.getAccessor().e()) != null) {
                        xx6.f(Collections.singleton(new wx6(ux6.ADD_2_REACTIONS, 1)), wuc.CHAT);
                    }
                }
                return e5f;
        }
    }

    public /* synthetic */ ft8(ht8 ht8, xs8 xs8) {
        this.c = ht8;
        this.b = xs8;
    }
}
