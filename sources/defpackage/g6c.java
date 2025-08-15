package defpackage;

import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieImageView;

/* renamed from: g6c  reason: default package */
public final class g6c implements RLottieDrawable.OnAllFramesRenderedListener {
    public boolean a;
    public final /* synthetic */ h6c b;
    public final /* synthetic */ RLottieImageView c;

    public g6c(h6c h6c, RLottieImageView rLottieImageView) {
        this.b = h6c;
        this.c = rLottieImageView;
    }

    public final void onAllFramesRendered(RLottieDrawable rLottieDrawable, boolean z) {
        h6c h6c = this.b;
        String str = h6c.a;
        boolean z2 = this.a;
        hm9.m(str, "Reaction effect. OnAllFramesRendered, called:" + z2, new Object[0]);
        if (!this.a) {
            h6c.post(new v05((Object) this, (Object) h6c, (Object) this.c, 23));
        }
    }
}
