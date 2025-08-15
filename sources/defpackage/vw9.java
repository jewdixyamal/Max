package defpackage;

import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import one.me.notifications.settings.NotificationsSettingsScreen;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: vw9  reason: default package */
public final /* synthetic */ class vw9 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationsSettingsScreen b;

    public /* synthetic */ vw9(NotificationsSettingsScreen notificationsSettingsScreen, int i) {
        this.a = i;
        this.b = notificationsSettingsScreen;
    }

    public final Object invoke() {
        NotificationsSettingsScreen notificationsSettingsScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = NotificationsSettingsScreen.v0;
                cla cla = new cla(notificationsSettingsScreen.getContext(), 6);
                cla.setId(dea.x);
                cla.setForm(uka.a);
                cla.setTitle(eea.r);
                cla.setLeftActions(new kka(new ww9(0)));
                return cla;
            case 1:
                bc7[] bc7Arr2 = NotificationsSettingsScreen.v0;
                EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(notificationsSettingsScreen.getContext(), (AttributeSet) null, 6);
                endlessRecyclerView2.setId(dea.u);
                endlessRecyclerView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                endlessRecyclerView2.getContext();
                endlessRecyclerView2.setLayoutManager(new LinearLayoutManager());
                endlessRecyclerView2.setAdapter(new nd3(notificationsSettingsScreen.Z, notificationsSettingsScreen.X));
                endlessRecyclerView2.setOverScrollMode(2);
                endlessRecyclerView2.j(new q1d(qp4.u0.j(endlessRecyclerView2), new y98((Object) endlessRecyclerView2, 17, (Object) notificationsSettingsScreen), (l) null, 12));
                endlessRecyclerView2.j(new ry0(3));
                return endlessRecyclerView2;
            default:
                bc7[] bc7Arr3 = NotificationsSettingsScreen.v0;
                OneMeButton oneMeButton = new OneMeButton(notificationsSettingsScreen.getContext(), (AttributeSet) null);
                oneMeButton.setId(dea.v);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                float f = (float) 12;
                layoutParams.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f));
                layoutParams.setMarginEnd(tu0.G(f * fk4.d().getDisplayMetrics().density));
                oneMeButton.setLayoutParams(layoutParams);
                oneMeButton.setAppearance(z6a.b);
                oneMeButton.setSize(c7a.b);
                oneMeButton.setMode(b7a.c);
                oneMeButton.setText(eea.p);
                tu0.K(oneMeButton, 300, new xx5(19, notificationsSettingsScreen));
                return oneMeButton;
        }
    }
}
