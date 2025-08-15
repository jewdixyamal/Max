package defpackage;

import android.util.AttributeSet;
import one.me.profileedit.ProfileEditScreen;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: yfb  reason: default package */
public final /* synthetic */ class yfb implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileEditScreen b;

    public /* synthetic */ yfb(ProfileEditScreen profileEditScreen, int i) {
        this.a = i;
        this.b = profileEditScreen;
    }

    public final Object invoke() {
        ProfileEditScreen profileEditScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = ProfileEditScreen.y0;
                return profileEditScreen.a == ((hyc) ((q33) neb.a.getAccessor().d(q33.class).getValue())).t() ? wuc.SETTINGS_PROFILE_EDITING : wuc.CHAT_INFO_EDITING;
            default:
                bc7[] bc7Arr2 = ProfileEditScreen.y0;
                OneMeButton oneMeButton = new OneMeButton(profileEditScreen.getContext(), (AttributeSet) null);
                oneMeButton.setId(sea.d0);
                oneMeButton.setSize(c7a.c);
                oneMeButton.setMode(b7a.a);
                oneMeButton.setAppearance(z6a.o);
                rw3 rw3 = new rw3(-1, -2);
                rw3.c = 80;
                float f = (float) 16;
                rw3.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), 0, tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density));
                oneMeButton.setLayoutParams(rw3);
                oneMeButton.setText(vea.V);
                tu0.K(oneMeButton, 300, new agb(profileEditScreen, 1));
                return oneMeButton;
        }
    }
}
