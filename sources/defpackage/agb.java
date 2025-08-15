package defpackage;

import android.view.View;
import one.me.profileedit.ProfileEditScreen;

/* renamed from: agb  reason: default package */
public final /* synthetic */ class agb implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileEditScreen b;

    public /* synthetic */ agb(ProfileEditScreen profileEditScreen, int i) {
        this.a = i;
        this.b = profileEditScreen;
    }

    public final void onClick(View view) {
        ProfileEditScreen profileEditScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = ProfileEditScreen.y0;
                gv4 gv4 = profileEditScreen.n0().b;
                if (gv4.d()) {
                    gv4.k();
                    return;
                }
                return;
            default:
                bc7[] bc7Arr2 = ProfileEditScreen.y0;
                profileEditScreen.n0().u();
                return;
        }
    }
}
