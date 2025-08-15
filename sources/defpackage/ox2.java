package defpackage;

import android.os.Bundle;
import android.util.AttributeSet;
import one.me.chats.list.ChatsListWidget;

/* renamed from: ox2  reason: default package */
public final /* synthetic */ class ox2 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatsListWidget b;

    public /* synthetic */ ox2(ChatsListWidget chatsListWidget, int i) {
        this.a = i;
        this.b = chatsListWidget;
    }

    public final Object invoke() {
        boolean z = true;
        ChatsListWidget chatsListWidget = this.b;
        switch (this.a) {
            case 0:
                if (tpa.f(chatsListWidget.b, "all.chat.folder")) {
                    return (qn3) hr3.a.getAccessor().c(qn3.class);
                }
                qn3.a.getClass();
                return pn3.b;
            case 1:
                bc7[] bc7Arr = ChatsListWidget.M0;
                return chatsListWidget.getRouter();
            case 2:
                bc7[] bc7Arr2 = ChatsListWidget.M0;
                hn2 hn2 = new hn2(8);
                ((q84) dh0.a.getAccessor().c(q84.class)).getClass();
                return new oz2(chatsListWidget.b, hn2);
            case 3:
                bc7[] bc7Arr3 = ChatsListWidget.M0;
                if (((mt2) chatsListWidget.p0().G0.getValue()).b && !chatsListWidget.o0().O0()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                bc7[] bc7Arr4 = ChatsListWidget.M0;
                return new nx2((qn3) chatsListWidget.X.getValue(), chatsListWidget.b, (rg1) chatsListWidget.J0.getValue());
            case 5:
                bc7[] bc7Arr5 = ChatsListWidget.M0;
                return new bh0(new khe(new ox2(chatsListWidget, 2)), false, (po3) null, 62);
            case 6:
                bc7[] bc7Arr6 = ChatsListWidget.M0;
                aba aba = new aba(chatsListWidget.getContext(), (AttributeSet) null);
                aba.setIcon(woc.A0);
                aba.setTitle(new eqe(j0c.chats_list_empty_state_title));
                pla.a(aba, new re(9, aba, chatsListWidget));
                return aba;
            case 7:
                bc7[] bc7Arr7 = ChatsListWidget.M0;
                gy2.c.P1().b(":settings/folder/members-picker?folder_id=".concat(chatsListWidget.b), (Bundle) null);
                return e5f.a;
            case 8:
                bc7[] bc7Arr8 = ChatsListWidget.M0;
                return new rg1(new khe(new ox2(chatsListWidget, 1)), new l5g(chatsListWidget, 0));
            default:
                bc7[] bc7Arr9 = ChatsListWidget.M0;
                return new xu2(chatsListWidget.o0(), new ox2(chatsListWidget, 3), hr3.a.getAccessor().d(l67.class));
        }
    }
}
