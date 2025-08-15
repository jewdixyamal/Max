package defpackage;

import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import one.me.notifications.settings.screens.dialog.DialogNotificationsSettingsScreen;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: kj4  reason: default package */
public final /* synthetic */ class kj4 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ DialogNotificationsSettingsScreen b;

    public /* synthetic */ kj4(DialogNotificationsSettingsScreen dialogNotificationsSettingsScreen, int i) {
        this.a = i;
        this.b = dialogNotificationsSettingsScreen;
    }

    public final Object invoke() {
        DialogNotificationsSettingsScreen dialogNotificationsSettingsScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = DialogNotificationsSettingsScreen.Y;
                cla cla = new cla(dialogNotificationsSettingsScreen.getContext(), 6);
                cla.setId(dea.l);
                cla.setForm(uka.a);
                cla.setTitle(eea.i);
                cla.setLeftActions(new kka(new pz2(14)));
                return cla;
            default:
                bc7[] bc7Arr2 = DialogNotificationsSettingsScreen.Y;
                EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(dialogNotificationsSettingsScreen.getContext(), (AttributeSet) null, 6);
                endlessRecyclerView2.setId(dea.j);
                endlessRecyclerView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                endlessRecyclerView2.getContext();
                endlessRecyclerView2.setLayoutManager(new LinearLayoutManager());
                endlessRecyclerView2.setOverScrollMode(2);
                endlessRecyclerView2.setAdapter(dialogNotificationsSettingsScreen.c);
                endlessRecyclerView2.j(new q1d(qp4.u0.j(endlessRecyclerView2), new ta4(5), (l) null, 12));
                endlessRecyclerView2.j(new sc1(2));
                return endlessRecyclerView2;
        }
    }
}
