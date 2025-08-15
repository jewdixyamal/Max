package defpackage;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;

/* renamed from: lre  reason: default package */
public final class lre extends DrawableWrapper implements kre, Animatable {
    public final int a;

    public lre(int i, Context context, Drawable drawable) {
        super(drawable);
        this.a = i;
        if (context != null) {
            setTint(qp4.u0.b(context).i().c(i));
        }
    }

    public final boolean isRunning() {
        Drawable drawable = getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable != null) {
            return animatable.isRunning();
        }
        return false;
    }

    public final void onThemeChanged(fka fka) {
        if (getDrawable() instanceof kre) {
            Drawable drawable = getDrawable();
            kre kre = drawable instanceof kre ? (kre) drawable : null;
            if (kre != null) {
                kre.onThemeChanged(fka);
                return;
            }
            return;
        }
        Drawable drawable2 = getDrawable();
        if (drawable2 != null) {
            drawable2.setTint(fka.c(this.a));
        }
    }

    public final void start() {
        Drawable drawable = getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable != null) {
            animatable.start();
        }
    }

    public final void stop() {
        Drawable drawable = getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
