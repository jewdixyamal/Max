package defpackage;

import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import one.me.notifications.settings.screens.other.OtherNotificationsSettingsScreen;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: fna  reason: default package */
public final /* synthetic */ class fna implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ OtherNotificationsSettingsScreen b;

    public /* synthetic */ fna(OtherNotificationsSettingsScreen otherNotificationsSettingsScreen, int i) {
        this.a = i;
        this.b = otherNotificationsSettingsScreen;
    }

    public final Object invoke() {
        OtherNotificationsSettingsScreen otherNotificationsSettingsScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = OtherNotificationsSettingsScreen.Y;
                cla cla = new cla(otherNotificationsSettingsScreen.getContext(), 6);
                cla.setId(dea.t);
                cla.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                cla.setForm(uka.a);
                cla.setTitle(eea.o);
                cla.setLeftActions(new kka(new ww9(14)));
                return cla;
            default:
                bc7[] bc7Arr2 = OtherNotificationsSettingsScreen.Y;
                EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(otherNotificationsSettingsScreen.getContext(), (AttributeSet) null, 6);
                endlessRecyclerView2.setId(dea.r);
                endlessRecyclerView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                endlessRecyclerView2.getContext();
                endlessRecyclerView2.setLayoutManager(new LinearLayoutManager());
                endlessRecyclerView2.setOverScrollMode(2);
                endlessRecyclerView2.setAdapter(otherNotificationsSettingsScreen.c);
                endlessRecyclerView2.j(new q1d(qp4.u0.j(endlessRecyclerView2), new jj9(23), (l) null, 12));
                endlessRecyclerView2.j(new sc1(2));
                return endlessRecyclerView2;
        }
    }
}
