package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.stickerssettings.stickersscreen.StickersScreen;

/* renamed from: z4e  reason: default package */
public final /* synthetic */ class z4e implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StickersScreen b;

    public /* synthetic */ z4e(StickersScreen stickersScreen, int i) {
        this.a = i;
        this.b = stickersScreen;
    }

    public final Object invoke() {
        StickersScreen stickersScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = StickersScreen.v0;
                bc7 bc7 = StickersScreen.v0[0];
                long longValue = ((Number) stickersScreen.b.a(stickersScreen)).longValue();
                k6e k6e = k6e.a;
                khe d = k6e.getAccessor().d(o2e.class);
                khe d2 = k6e.getAccessor().d(x9c.class);
                khe d3 = k6e.getAccessor().d(md5.class);
                khe d4 = k6e.getAccessor().d(sc5.class);
                khe d5 = k6e.getAccessor().d(a4e.class);
                khe d6 = k6e.getAccessor().d(qe5.class);
                return new a8e(stickersScreen.a, longValue, (Context) k6e.getAccessor().c(Context.class), (kke) k6e.getAccessor().c(kke.class), d, d2, d3, d4, d5, d6);
            case 1:
                bc7[] bc7Arr2 = StickersScreen.v0;
                return new o4e(stickersScreen.getContext());
            default:
                bc7[] bc7Arr3 = StickersScreen.v0;
                OneMeButton oneMeButton = new OneMeButton(stickersScreen.getContext(), (AttributeSet) null);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
                int G = tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
                layoutParams.leftMargin = G;
                layoutParams.rightMargin = G;
                layoutParams.topMargin = G;
                layoutParams.bottomMargin = G;
                oneMeButton.setLayoutParams(layoutParams);
                oneMeButton.setSize(c7a.c);
                oneMeButton.setMode(b7a.b);
                oneMeButton.setAppearance(z6a.c);
                oneMeButton.setText(hja.n);
                tu0.K(oneMeButton, 300, new elb(8, (Object) stickersScreen));
                return oneMeButton;
        }
    }
}
