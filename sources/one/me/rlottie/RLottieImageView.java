package one.me.rlottie;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.HashMap;
import java.util.Map;

public class RLottieImageView extends AppCompatImageView {
    public boolean cached;
    public HashMap o;
    public RLottieDrawable s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;
    public boolean w0;

    public RLottieImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    public void a() {
        playAnimation();
    }

    public void clearAnimationDrawable() {
        RLottieDrawable rLottieDrawable = this.s0;
        if (rLottieDrawable != null) {
            rLottieDrawable.stop();
        }
        this.s0 = null;
        setImageDrawable((Drawable) null);
    }

    public void clearLayerColors() {
        this.o.clear();
    }

    public void d() {
        stopAnimation();
    }

    public RLottieDrawable getAnimatedDrawable() {
        return this.s0;
    }

    public ImageReceiver getImageReceiver() {
        return null;
    }

    public boolean isPlaying() {
        RLottieDrawable rLottieDrawable = this.s0;
        return rLottieDrawable != null && rLottieDrawable.isRunning();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.u0 = true;
        RLottieDrawable rLottieDrawable = this.s0;
        if (rLottieDrawable != null) {
            rLottieDrawable.setCallback(this);
            if (this.v0) {
                this.s0.start();
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.u0 = false;
        RLottieDrawable rLottieDrawable = this.s0;
        if (rLottieDrawable != null) {
            rLottieDrawable.stop();
        }
    }

    public void playAnimation() {
        RLottieDrawable rLottieDrawable = this.s0;
        if (rLottieDrawable != null) {
            this.v0 = true;
            if (this.u0 && rLottieDrawable != null) {
                rLottieDrawable.start();
            }
        }
    }

    public void replaceColors(int[] iArr) {
        RLottieDrawable rLottieDrawable = this.s0;
        if (rLottieDrawable != null) {
            rLottieDrawable.replaceColors(iArr);
        }
    }

    public void setAnimation(int i, int i2, int i3) {
        setAnimation(i, i2, i3, (int[]) null);
    }

    public void setAutoRepeat(boolean z) {
        this.t0 = z;
        this.w0 = true;
        RLottieDrawable rLottieDrawable = this.s0;
        if (rLottieDrawable != null && z) {
            rLottieDrawable.setAutoRepeat(1);
        }
    }

    public void setImageDrawable(Drawable drawable) {
        if (drawable instanceof RLottieDrawable) {
            RLottieDrawable rLottieDrawable = (RLottieDrawable) drawable;
            this.s0 = rLottieDrawable;
            if (this.w0) {
                if (this.t0) {
                    rLottieDrawable.setAutoRepeat(1);
                } else {
                    rLottieDrawable.setAutoRepeat(0);
                }
            }
            this.s0.setMasterParent(this);
            if (this.t0) {
                this.s0.setAutoRepeat(1);
            }
            if (this.o != null) {
                this.s0.beginApplyLayerColors();
                for (Map.Entry entry : this.o.entrySet()) {
                    this.s0.setLayerColor((String) entry.getKey(), ((Integer) entry.getValue()).intValue());
                }
                this.s0.commitApplyLayerColors();
            }
            this.s0.setAllowDecodeSingleFrame(true);
            this.v0 = this.s0.b1;
        } else {
            this.v0 = false;
        }
        super.setImageDrawable(this.s0);
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
        this.s0 = null;
    }

    public void setLayerColor(String str, int i) {
        if (this.o == null) {
            this.o = new HashMap();
        }
        this.o.put(str, Integer.valueOf(i));
        RLottieDrawable rLottieDrawable = this.s0;
        if (rLottieDrawable != null) {
            rLottieDrawable.setLayerColor(str, i);
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        RLottieDrawable rLottieDrawable = this.s0;
        if (rLottieDrawable != null) {
            rLottieDrawable.setOnAnimationEndListener(runnable);
        }
    }

    public void setOnlyLastFrame(boolean z) {
    }

    public void setProgress(float f) {
        RLottieDrawable rLottieDrawable = this.s0;
        if (rLottieDrawable != null) {
            rLottieDrawable.setProgress(f);
        }
    }

    public void setReverse() {
        RLottieDrawable rLottieDrawable = this.s0;
        if (rLottieDrawable != null) {
            rLottieDrawable.setPlayInDirectionOfCustomEndFrame(true);
            RLottieDrawable rLottieDrawable2 = this.s0;
            rLottieDrawable2.setCurrentFrame(rLottieDrawable2.getFramesCount());
            this.s0.setCustomEndFrame(0);
        }
    }

    public void stopAnimation() {
        RLottieDrawable rLottieDrawable = this.s0;
        if (rLottieDrawable != null) {
            this.v0 = false;
            if (this.u0 && rLottieDrawable != null) {
                rLottieDrawable.stop();
            }
        }
    }

    public RLottieImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.w0 = false;
    }

    public void setAnimation(int i, int i2, int i3, int[] iArr) {
        setAnimation(new RLottieDrawable(i, zr6.h(i, ""), he.a((float) i2), he.a((float) i3), false, iArr));
    }

    public void setAnimation(RLottieDrawable rLottieDrawable) {
        if (this.s0 != rLottieDrawable) {
            this.s0 = rLottieDrawable;
            rLottieDrawable.setMasterParent(this);
            if (this.t0) {
                this.s0.setAutoRepeat(1);
            }
            if (this.o != null) {
                this.s0.beginApplyLayerColors();
                for (Map.Entry entry : this.o.entrySet()) {
                    this.s0.setLayerColor((String) entry.getKey(), ((Integer) entry.getValue()).intValue());
                }
                this.s0.commitApplyLayerColors();
            }
            this.s0.setAllowDecodeSingleFrame(true);
            setImageDrawable(this.s0);
        }
    }
}
