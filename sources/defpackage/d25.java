package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;

/* renamed from: d25  reason: default package */
public final class d25 extends AnimatorListenerAdapter {
    public final /* synthetic */ EnhancedAnimatedVectorDrawable a;

    public d25(EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable) {
        this.a = enhancedAnimatedVectorDrawable;
    }

    public final void onAnimationEnd(Animator animator) {
        EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = this.a;
        for (le a2 : x53.D0(enhancedAnimatedVectorDrawable.animationCallbacks)) {
            a2.a(enhancedAnimatedVectorDrawable);
        }
    }

    public final void onAnimationStart(Animator animator) {
        EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = this.a;
        for (le b : x53.D0(enhancedAnimatedVectorDrawable.animationCallbacks)) {
            b.b(enhancedAnimatedVectorDrawable);
        }
    }
}
