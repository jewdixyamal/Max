package defpackage;

import android.view.View;
import one.me.settings.storage.ui.SettingsStorageScreen;

/* renamed from: eid  reason: default package */
public final /* synthetic */ class eid implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ rxd b;
    public final /* synthetic */ ol7 c;

    public /* synthetic */ eid(rxd rxd, l1d l1d, int i) {
        this.a = i;
        this.b = rxd;
        this.c = l1d;
    }

    public final void onClick(View view) {
        rxd rxd = this.b;
        ol7 ol7 = this.c;
        switch (this.a) {
            case 0:
                long j = ((i1d) ol7).b;
                rxd.getClass();
                bc7[] bc7Arr = SettingsStorageScreen.X;
                ((vid) ((SettingsStorageScreen) rxd.b).a.getValue()).t((int) j);
                return;
            default:
                long j2 = ((k1d) ol7).o;
                rxd.getClass();
                bc7[] bc7Arr2 = SettingsStorageScreen.X;
                ((vid) ((SettingsStorageScreen) rxd.b).a.getValue()).t((int) j2);
                return;
        }
    }
}
