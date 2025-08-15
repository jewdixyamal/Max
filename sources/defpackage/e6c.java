package defpackage;

import android.os.Handler;
import android.view.View;
import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieImageView;

/* renamed from: e6c  reason: default package */
public final class e6c implements View.OnAttachStateChangeListener {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ View b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public e6c(sv8 sv8, Handler handler, sv8 sv82, enf enf) {
        this.b = sv8;
        this.c = handler;
        this.o = null;
        this.X = sv82;
        this.Y = enf;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    public final void onViewAttachedToWindow(View view) {
        int i = this.a;
    }

    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                this.b.removeOnAttachStateChangeListener(this);
                hm9.m(((h6c) this.c).a, "onDetach", new Object[0]);
                RLottieDrawable rLottieDrawable = (RLottieDrawable) this.o;
                rLottieDrawable.removeDrawableLoadListener((f6c) this.X);
                rLottieDrawable.removeOnAllFramesRenderedListener((g6c) this.Y);
                return;
            default:
                this.b.removeOnAttachStateChangeListener(this);
                ((Handler) this.c).removeCallbacksAndMessages((Object) null);
                k56 k56 = (k56) this.o;
                if (k56 != null) {
                    k56.invoke();
                }
                ((View) this.X).removeOnLayoutChangeListener((View.OnLayoutChangeListener) this.Y);
                return;
        }
    }

    public e6c(RLottieImageView rLottieImageView, h6c h6c, RLottieDrawable rLottieDrawable, f6c f6c, g6c g6c) {
        this.b = rLottieImageView;
        this.c = h6c;
        this.o = rLottieDrawable;
        this.X = f6c;
        this.Y = g6c;
    }
}
