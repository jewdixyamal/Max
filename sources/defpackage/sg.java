package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: sg  reason: default package */
public final class sg extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ k56 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sg(k56 k56, FrameLayout frameLayout, k56 k562, int i) {
        this.a = i;
        this.b = k56;
        this.c = frameLayout;
        this.d = k562;
    }

    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                this.c.setTag(y7a.m, (Object) null);
                this.b.invoke();
                return;
            case 1:
                ((f6b) this.c).requestLayout();
                ((k56) this.d).invoke();
                return;
            default:
                ((uge) this.c).requestLayout();
                ((k56) this.d).invoke();
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.c.setTag(y7a.m, (Object) null);
                this.b.invoke();
                return;
            case 1:
                f6b f6b = (f6b) this.c;
                f6b.requestLayout();
                ((k56) this.d).invoke();
                f6b.s0 = null;
                return;
            default:
                uge uge = (uge) this.c;
                uge.requestLayout();
                ((k56) this.d).invoke();
                uge.c = null;
                return;
        }
    }

    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationStart(animator);
                this.c.setTag(y7a.m, (String) this.d);
                return;
            case 1:
                this.b.invoke();
                return;
            default:
                this.b.invoke();
                return;
        }
    }

    public sg(View view, int i, String str, k81 k81) {
        this.a = 0;
        this.c = view;
        this.d = str;
        this.b = k81;
    }
}
