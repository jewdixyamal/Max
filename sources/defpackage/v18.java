package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: v18  reason: default package */
public final class v18 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ w18 c;

    public v18(w18 w18, boolean z, int i) {
        this.c = w18;
        this.a = z;
        this.b = i;
    }

    public final void onAnimationEnd(Animator animator) {
        w18 w18 = this.c;
        w18.b.setTranslationX(0.0f);
        w18.a(0.0f, this.a, this.b);
    }
}
