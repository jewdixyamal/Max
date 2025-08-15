package defpackage;

import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.coroutines.Continuation;
import one.me.notifications.settings.screens.chat.ChatNotificationsSettingsScreen;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: fm2  reason: default package */
public final /* synthetic */ class fm2 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatNotificationsSettingsScreen b;

    public /* synthetic */ fm2(ChatNotificationsSettingsScreen chatNotificationsSettingsScreen, int i) {
        this.a = i;
        this.b = chatNotificationsSettingsScreen;
    }

    public final Object invoke() {
        ChatNotificationsSettingsScreen chatNotificationsSettingsScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = ChatNotificationsSettingsScreen.Y;
                cla cla = new cla(chatNotificationsSettingsScreen.getContext(), 6);
                cla.setId(dea.e);
                cla.setForm(uka.a);
                cla.setTitle(eea.d);
                cla.setLeftActions(new kka(new we1(21)));
                return cla;
            default:
                bc7[] bc7Arr2 = ChatNotificationsSettingsScreen.Y;
                EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(chatNotificationsSettingsScreen.getContext(), (AttributeSet) null, 6);
                endlessRecyclerView2.setId(dea.c);
                endlessRecyclerView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                endlessRecyclerView2.getContext();
                endlessRecyclerView2.setLayoutManager(new LinearLayoutManager());
                endlessRecyclerView2.setOverScrollMode(2);
                mfd mfd = chatNotificationsSettingsScreen.c;
                endlessRecyclerView2.setAdapter(mfd);
                endlessRecyclerView2.j(new q1d(qp4.u0.j(endlessRecyclerView2), new v02(12, chatNotificationsSettingsScreen), (l) null, 12));
                endlessRecyclerView2.j(new sc1(1));
                h8e h8e = new h8e(endlessRecyclerView2, mfd, new em2(0, new ga(chatNotificationsSettingsScreen, 4, endlessRecyclerView2)));
                endlessRecyclerView2.j(h8e);
                v3c.y(new gm2(h8e, (Continuation) null, 0), endlessRecyclerView2);
                return endlessRecyclerView2;
        }
    }
}
