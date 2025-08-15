package defpackage;

import android.util.AttributeSet;
import android.widget.FrameLayout;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: geb  reason: default package */
public final /* synthetic */ class geb implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileEditAdminPermissionsWidget b;

    public /* synthetic */ geb(ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget, int i) {
        this.a = i;
        this.b = profileEditAdminPermissionsWidget;
    }

    public final Object invoke() {
        int i = 0;
        ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = ProfileEditAdminPermissionsWidget.x0;
                bc7 bc7 = bc7Arr[0];
                long longValue = ((Number) profileEditAdminPermissionsWidget.b.a(profileEditAdminPermissionsWidget)).longValue();
                bc7 bc72 = bc7Arr[1];
                long longValue2 = ((Number) profileEditAdminPermissionsWidget.c.a(profileEditAdminPermissionsWidget)).longValue();
                rdb n0 = profileEditAdminPermissionsWidget.n0();
                boolean m0 = profileEditAdminPermissionsWidget.m0();
                neb neb = neb.a;
                return new feb(longValue, longValue2, n0, m0, (iy2) ((khe) neb.c()).getValue(), (ds3) neb.getAccessor().d(ds3.class).getValue(), neb.getAccessor().d(qab.class), neb.b(), neb.d(), neb.getAccessor().d(qe5.class), neb.getAccessor().d(ea.class), neb.getAccessor().d(q33.class));
            default:
                bc7[] bc7Arr2 = ProfileEditAdminPermissionsWidget.x0;
                OneMeButton oneMeButton = new OneMeButton(profileEditAdminPermissionsWidget.getContext(), (AttributeSet) null);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
                int G = tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
                layoutParams.leftMargin = G;
                layoutParams.rightMargin = G;
                layoutParams.topMargin = G;
                layoutParams.bottomMargin = G;
                oneMeButton.setLayoutParams(layoutParams);
                oneMeButton.setSize(c7a.c);
                oneMeButton.setMode(b7a.a);
                oneMeButton.setAppearance(z6a.c);
                if (profileEditAdminPermissionsWidget.n0() != rdb.SETUP_NEW_ADMIN) {
                    i = 8;
                }
                oneMeButton.setVisibility(i);
                oneMeButton.setText(profileEditAdminPermissionsWidget.n0() == rdb.CHANGE_ADMIN ? vea.j1 : vea.L0);
                tu0.K(oneMeButton, 300, new xx5(29, profileEditAdminPermissionsWidget));
                return oneMeButton;
        }
    }
}
