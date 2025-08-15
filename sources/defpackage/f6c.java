package defpackage;

import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieImageView;

/* renamed from: f6c  reason: default package */
public final class f6c implements RLottieDrawable.DrawableLoadListener {
    public boolean a;
    public final /* synthetic */ h6c b;
    public final /* synthetic */ RLottieImageView c;

    public f6c(h6c h6c, RLottieImageView rLottieImageView) {
        this.b = h6c;
        this.c = rLottieImageView;
    }

    public final void onLoaded(RLottieDrawable rLottieDrawable) {
        String str = this.b.a;
        boolean z = this.a;
        hm9.m(str, "Reaction effect. OnLoaded, called:" + z, new Object[0]);
        if (!this.a) {
            this.a = true;
            this.c.playAnimation();
        }
    }
}
