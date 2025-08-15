package defpackage;

import android.graphics.drawable.Drawable;
import one.me.rlottie.RLottieDrawable;

/* renamed from: wj  reason: default package */
public final class wj implements RLottieDrawable.DrawableLoadListener {
    public final /* synthetic */ zj a;
    public final /* synthetic */ String b;

    public wj(zj zjVar, String str) {
        this.a = zjVar;
        this.b = str;
    }

    public final void onError(Throwable th) {
        zj zjVar = this.a;
        hm9.p(zjVar.s0, "Animoji lottie download. Fail", th);
        String str = this.b;
        if (str == null || str.length() == 0) {
            zjVar.e(uj.a);
        } else {
            zjVar.c(str);
        }
        RLottieDrawable rLottieDrawable = zjVar.x0;
        if (rLottieDrawable != null) {
            rLottieDrawable.setCallback((Drawable.Callback) null);
        }
        zjVar.x0 = null;
    }

    public final void onLoaded(RLottieDrawable rLottieDrawable) {
        String str = this.a.s0;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            String currentUrl = rLottieDrawable.getCurrentUrl();
            ir6.d(us7, str, "Animoji lottie download. Success, url:" + currentUrl + ", class: " + rLottieDrawable, (Throwable) null);
        }
        rLottieDrawable.setCallback(this.a.t0);
        zj zjVar = this.a;
        zjVar.x0 = rLottieDrawable;
        zjVar.e(uj.c);
        if (!rLottieDrawable.isRunning() && j1e.z(this.a.y0)) {
            rLottieDrawable.start();
        }
        if (rLottieDrawable.getBounds().isEmpty() && !this.a.getBounds().isEmpty()) {
            rLottieDrawable.setBounds(this.a.getBounds());
        }
        rLottieDrawable.invalidateInternal();
        rLottieDrawable.removeDrawableLoadListener(this);
    }
}
