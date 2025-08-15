package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import one.me.sdk.media.ffmpeg.AnimatedFileDrawable;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: z3g  reason: default package */
public final class z3g extends ImageView implements AnimatedFileDrawable.OnNextFrameRenderedListener, ew7 {
    public String a;
    public boolean b;
    public y3g c;
    public boolean o;
    public AnimatedFileDrawable s0;
    public final gi t0 = new gi(4, this);

    public z3g(Context context) {
        super(context, (AttributeSet) null);
    }

    public final void a() {
        AnimatedFileDrawable animatedFileDrawable;
        this.o = true;
        if (isAttachedToWindow() && (animatedFileDrawable = this.s0) != null) {
            animatedFileDrawable.start();
        }
    }

    public final void c() {
        AnimatedFileDrawable animatedFileDrawable;
        if (this.s0 != null) {
            this.o = false;
            if (isAttachedToWindow() && (animatedFileDrawable = this.s0) != null) {
                animatedFileDrawable.stop();
            }
        }
        AnimatedFileDrawable animatedFileDrawable2 = this.s0;
        if (animatedFileDrawable2 != null) {
            animatedFileDrawable2.recycle();
        }
        AnimatedFileDrawable animatedFileDrawable3 = this.s0;
        if (animatedFileDrawable3 != null) {
            animatedFileDrawable3.stop();
        }
        this.s0 = null;
        setImageDrawable((Drawable) null);
        this.a = null;
    }

    public final void d() {
        AnimatedFileDrawable animatedFileDrawable;
        if (this.s0 != null) {
            this.o = false;
            if (isAttachedToWindow() && (animatedFileDrawable = this.s0) != null) {
                animatedFileDrawable.stop();
            }
        }
    }

    public final void onAttachedToWindow() {
        AnimatedFileDrawable animatedFileDrawable;
        super.onAttachedToWindow();
        AnimatedFileDrawable animatedFileDrawable2 = this.s0;
        if (animatedFileDrawable2 != null) {
            animatedFileDrawable2.setCallback(this);
        }
        AnimatedFileDrawable animatedFileDrawable3 = this.s0;
        if (animatedFileDrawable3 != null) {
            animatedFileDrawable3.addParent(this.t0);
        }
        if (this.o && (animatedFileDrawable = this.s0) != null) {
            animatedFileDrawable.start();
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatedFileDrawable animatedFileDrawable = this.s0;
        if (animatedFileDrawable != null) {
            animatedFileDrawable.stop();
        }
        AnimatedFileDrawable animatedFileDrawable2 = this.s0;
        if (animatedFileDrawable2 != null) {
            animatedFileDrawable2.removeParent(this.t0);
        }
    }

    public final void onNextFrameRendered(AnimatedFileDrawable animatedFileDrawable) {
        if (this.b) {
            y3g y3g = this.c;
            if (y3g != null) {
                a4g a4g = (a4g) ((gte) y3g).b;
                ((OneMeDraweeView) a4g.a.b).setVisibility(8);
                if (a4g.c) {
                    a4g.o = true;
                }
            }
            this.b = false;
        }
    }

    public void setImageDrawable(Drawable drawable) {
        if (drawable instanceof AnimatedFileDrawable) {
            AnimatedFileDrawable animatedFileDrawable = (AnimatedFileDrawable) drawable;
            this.s0 = animatedFileDrawable;
            AnimatedFileDrawable animatedFileDrawable2 = drawable instanceof AnimatedFileDrawable ? animatedFileDrawable : null;
            gi giVar = this.t0;
            if (animatedFileDrawable2 != null) {
                animatedFileDrawable2.removeParent(giVar);
            }
            animatedFileDrawable.addParent(giVar);
            this.o = true;
        } else {
            this.o = false;
        }
        super.setImageDrawable(drawable);
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
        this.s0 = null;
    }

    public final void setOnFirstFrameListener(y3g y3g) {
        this.c = y3g;
        this.b = true;
    }
}
