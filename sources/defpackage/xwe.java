package defpackage;

import android.animation.Animator;
import android.view.View;

/* renamed from: xwe  reason: default package */
public final class xwe implements Animator.AnimatorListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ String b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ float f;
    public final /* synthetic */ k56 g;

    public xwe(View view, int i, String str, float f2, float f3, boolean z, float f4, k56 k56) {
        this.a = view;
        this.b = str;
        this.c = f2;
        this.d = f3;
        this.e = z;
        this.f = f4;
        this.g = k56;
    }

    public final void onAnimationCancel(Animator animator) {
        int i = this.e ? 0 : 8;
        View view = this.a;
        view.setVisibility(i);
        k56 k56 = this.g;
        if (k56 != null) {
            k56.invoke();
        }
        view.setTag(xoc.R0, (Object) null);
    }

    public final void onAnimationEnd(Animator animator) {
        View view = this.a;
        view.setAlpha(this.d);
        view.setVisibility(this.e ? 0 : 8);
        view.setTranslationY(this.f);
        k56 k56 = this.g;
        if (k56 != null) {
            k56.invoke();
        }
        view.setTag(xoc.R0, (Object) null);
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        int i = xoc.R0;
        View view = this.a;
        view.setTag(i, this.b);
        view.setAlpha(this.c);
        view.setVisibility(0);
    }
}
