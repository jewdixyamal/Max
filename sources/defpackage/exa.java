package defpackage;

import android.util.AttributeSet;
import android.widget.LinearLayout;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.startconversation.channel.PickSubscribersScreen;

/* renamed from: exa  reason: default package */
public final /* synthetic */ class exa implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickSubscribersScreen b;

    public /* synthetic */ exa(PickSubscribersScreen pickSubscribersScreen, int i) {
        this.a = i;
        this.b = pickSubscribersScreen;
    }

    public final Object invoke() {
        PickSubscribersScreen pickSubscribersScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = PickSubscribersScreen.z0;
                OneMeButton oneMeButton = new OneMeButton(pickSubscribersScreen.getContext(), (AttributeSet) null);
                oneMeButton.setId(zia.l);
                oneMeButton.setSize(c7a.c);
                oneMeButton.setAppearance(z6a.o);
                oneMeButton.setMode(b7a.a);
                oneMeButton.setText(r8a.Q);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                int G = tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
                layoutParams.setMargins(G, G, G, G);
                oneMeButton.setLayoutParams(layoutParams);
                return oneMeButton;
            default:
                bc7[] bc7Arr2 = PickSubscribersScreen.z0;
                int i = vc7.a;
                if (vc7.b(vc7.c)) {
                    mr0.G(pickSubscribersScreen);
                }
                return e5f.a;
        }
    }
}
