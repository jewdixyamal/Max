package defpackage;

import android.view.View;
import one.me.startconversation.channel.PickSubscribersScreen;

/* renamed from: fxa  reason: default package */
public final /* synthetic */ class fxa implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickSubscribersScreen b;

    public /* synthetic */ fxa(PickSubscribersScreen pickSubscribersScreen, int i) {
        this.a = i;
        this.b = pickSubscribersScreen;
    }

    public final Object invoke(Object obj) {
        e5f e5f = e5f.a;
        PickSubscribersScreen pickSubscribersScreen = this.b;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                bc7[] bc7Arr = PickSubscribersScreen.z0;
                i3a onBackPressedDispatcher = pickSubscribersScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                return e5f;
            default:
                syd syd = (syd) obj;
                syd.a2();
                bc7[] bc7Arr2 = PickSubscribersScreen.z0;
                pickSubscribersScreen.getClass();
                bc7 bc7 = PickSubscribersScreen.z0[1];
                syd.R1(syd.Z1(((Number) pickSubscribersScreen.u0.a(pickSubscribersScreen)).longValue()));
                return e5f;
        }
    }
}
