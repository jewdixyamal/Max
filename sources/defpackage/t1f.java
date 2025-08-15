package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;

/* renamed from: t1f  reason: default package */
public abstract class t1f {
    public static long a(Animator animator) {
        return animator.getTotalDuration();
    }

    public static void b(Animator animator, long j) {
        ((AnimatorSet) animator).setCurrentPlayTime(j);
    }
}
