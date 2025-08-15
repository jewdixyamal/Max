package defpackage;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.DrawableWrapper;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;
import one.me.sdk.richvector.VectorPath;

/* renamed from: qe  reason: default package */
public final class qe extends DrawableWrapper implements Animatable {
    public final je7 a = tu0.r(3, new pe(this, 0));
    public final je7 b = tu0.r(3, new pe(this, 1));
    public final je7 c = tu0.r(3, new pe(this, 2));

    public qe(Context context) {
        super(new EnhancedAnimatedVectorDrawable(context, woc.X));
    }

    public final void a(int i) {
        VectorPath vectorPath = (VectorPath) this.a.getValue();
        if (vectorPath != null) {
            vectorPath.setStrokeColor(i);
        }
        VectorPath vectorPath2 = (VectorPath) this.b.getValue();
        if (vectorPath2 != null) {
            vectorPath2.setStrokeColor(i);
        }
        VectorPath vectorPath3 = (VectorPath) this.c.getValue();
        if (vectorPath3 != null) {
            vectorPath3.setStrokeColor(i);
        }
        ((EnhancedAnimatedVectorDrawable) getDrawable()).invalidatePath();
    }

    public final boolean isRunning() {
        return ((EnhancedAnimatedVectorDrawable) getDrawable()).isRunning();
    }

    public final void start() {
        ((EnhancedAnimatedVectorDrawable) getDrawable()).start();
    }

    public final void stop() {
        ((EnhancedAnimatedVectorDrawable) getDrawable()).stop();
    }
}
