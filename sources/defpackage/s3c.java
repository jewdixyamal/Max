package defpackage;

import com.google.gson.Gson;
import one.me.rlottie.RLottie;
import one.me.rlottie.RLottieDrawable;

/* renamed from: s3c  reason: default package */
public final /* synthetic */ class s3c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RLottieDrawable b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ s3c(RLottieDrawable rLottieDrawable, Runnable runnable, int i) {
        this.a = i;
        this.b = rLottieDrawable;
        this.c = runnable;
    }

    public final void run() {
        Runnable runnable = this.c;
        RLottieDrawable rLottieDrawable = this.b;
        switch (this.a) {
            case 0:
                Gson gson = RLottieDrawable.gson;
                rLottieDrawable.getClass();
                try {
                    vo0 vo0 = rLottieDrawable.s1;
                    if (vo0 != null) {
                        vo0.b();
                    }
                } catch (Throwable th) {
                    RLottie.getLogger().o(th);
                }
                he.d(new s3c(rLottieDrawable, runnable, 1));
                return;
            default:
                Gson gson2 = RLottieDrawable.gson;
                rLottieDrawable.getClass();
                runnable.run();
                if (rLottieDrawable.G0 != null) {
                    rLottieDrawable.G0 = null;
                    vo0.c();
                    return;
                }
                return;
        }
    }
}
