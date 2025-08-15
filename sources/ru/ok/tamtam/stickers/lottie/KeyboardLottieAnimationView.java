package ru.ok.tamtam.stickers.lottie;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.drawee.view.SimpleDraweeView;
import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieImageView;
import ru.ok.messages.stickers.widgets.StickerView;

@Deprecated
public class KeyboardLottieAnimationView extends RLottieImageView implements RLottieDrawable.OnNextFrameRenderedListener, RLottieDrawable.DrawableLoadListener {
    public boolean x0;
    public rc7 y0;
    public qc7 z0;

    public KeyboardLottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void onError(Throwable th) {
        qc7 qc7 = this.z0;
        if (qc7 != null) {
            ((m2e) qc7).getClass();
            int i = StickerView.x0;
            hm9.p("ru.ok.messages.stickers.widgets.StickerView", "lottie set animation failed: ", th);
        }
    }

    public final void onLoaded(RLottieDrawable rLottieDrawable) {
        hm9.m("ru.ok.tamtam.stickers.lottie.KeyboardLottieAnimationView", "onLoaded %s", rLottieDrawable);
    }

    public final void onNextFrameRendered(RLottieDrawable rLottieDrawable, int i) {
        if (this.x0) {
            rc7 rc7 = this.y0;
            if (rc7 != null) {
                int i2 = StickerView.x0;
                StickerView stickerView = (StickerView) ((bqc) rc7).b;
                stickerView.removeCallbacks(stickerView.w0);
                SimpleDraweeView simpleDraweeView = stickerView.o;
                if (((la6) simpleDraweeView.getHierarchy()).e.a(1) != null) {
                    ((la6) simpleDraweeView.getHierarchy()).i((Drawable) null, 1);
                }
                simpleDraweeView.setController((mq4) null);
            }
            this.x0 = false;
        }
    }

    public void setFailureListener(qc7 qc7) {
        this.z0 = qc7;
    }

    public void setOnFirstFrameListener(rc7 rc7) {
        this.y0 = rc7;
        this.x0 = true;
    }
}
