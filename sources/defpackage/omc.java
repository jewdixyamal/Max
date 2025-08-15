package defpackage;

import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import one.me.android.root.RootController;

/* renamed from: omc  reason: default package */
public final /* synthetic */ class omc implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ RootController b;

    public /* synthetic */ omc(RootController rootController, int i) {
        this.a = i;
        this.b = rootController;
    }

    public final Object invoke() {
        RootController rootController = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = RootController.u0;
                w12 b2 = s36.b(rootController.getContext());
                b2.setId(kvb.root_screen);
                rw3 rw3 = new rw3(-1, -1);
                rw3.b(new AppBarLayout$ScrollingViewBehavior());
                b2.setLayoutParams(rw3);
                return b2;
            default:
                bc7[] bc7Arr2 = RootController.u0;
                w12 b3 = s36.b(rootController.getContext());
                b3.setId(kvb.root_top_indicator);
                b3.setLayoutParams(new rw3(-1, -2));
                b3.setTranslationY(-((float) tu0.G(((float) 100) * fk4.d().getDisplayMetrics().density)));
                return b3;
        }
    }
}
