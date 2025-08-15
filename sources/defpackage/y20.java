package defpackage;

import android.os.Bundle;
import android.view.View;
import one.me.calllist.ui.CallHistoryScreen;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.profile.screens.avatars.ProfileAvatarsScreen;
import one.me.settings.privacy.ui.onboarding.SafeModeOnboardingScreen;
import ru.ok.messages.media.attaches.AudioAttachView;
import ru.ok.messages.media.audio.AudioListenView;

/* renamed from: y20  reason: default package */
public final /* synthetic */ class y20 implements View.OnClickListener {
    public final /* synthetic */ int a;

    public /* synthetic */ y20(int i) {
        this.a = i;
    }

    private final void a(View view) {
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                int i = AudioAttachView.w0;
                return;
            case 1:
                int i2 = AudioListenView.B0;
                return;
            case 2:
                bc7[] bc7Arr = CallHistoryScreen.C0;
                z71.c.P1().b(":call-contact", (Bundle) null);
                return;
            case 3:
                bc7[] bc7Arr2 = CallHistoryScreen.C0;
                z71.c.P1().b(":call-contact", (Bundle) null);
                return;
            case 4:
                bc7[] bc7Arr3 = MediaKeyboardWidget.C0;
                sc7.c.P1().b(":stickers/settings", (Bundle) null);
                return;
            case 5:
                return;
            case 6:
                bc7[] bc7Arr4 = ProfileAvatarsScreen.z0;
                return;
            default:
                int i3 = SafeModeOnboardingScreen.c;
                ihd.c.P1().b(":settings/privacy/pincode?mode=setup&replace_top=true", (Bundle) null);
                return;
        }
    }
}
