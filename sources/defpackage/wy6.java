package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: wy6  reason: default package */
public final /* synthetic */ class wy6 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ wy6(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    public final Object invoke(Object obj) {
        boolean z = false;
        e5f e5f = e5f.a;
        int i = this.b;
        switch (this.a) {
            case 0:
                Throwable th = (Throwable) obj;
                if (th != null) {
                    String str = fz6.E0;
                    hm9.p(str, "prefetch " + i + " fetchVirtualAlbums() completed by error", th);
                }
                return e5f;
            case 1:
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    String str2 = fz6.E0;
                    hm9.p(str2, "prefetch " + i + " fetchRealAlbums() completed by error", th2);
                }
                return e5f;
            case 2:
                bc7[] bc7Arr = OneMeButton.B0;
                if (((View) obj).getId() != i) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                l17 l17 = (l17) obj;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
                ofFloat.setDuration(200);
                ofFloat.addUpdateListener(new vtd(l17, 0));
                ofFloat.addListener(new qg(i, 2, l17));
                ofFloat.start();
                return e5f;
        }
    }

    public /* synthetic */ wy6(bud bud, int i) {
        this.a = 3;
        this.b = i;
    }
}
