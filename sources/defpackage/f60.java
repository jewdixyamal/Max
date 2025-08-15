package defpackage;

import android.animation.Animator;
import android.view.View;

/* renamed from: f60  reason: default package */
public final class f60 implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f60(View view, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = view;
        this.c = obj;
        this.d = obj2;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ((g60) this.b).A0 = false;
                k56 k56 = (k56) this.d;
                if (k56 != null) {
                    k56.invoke();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                g60 g60 = (g60) this.b;
                g60.A0 = false;
                g60.setVisibility(8);
                g60.y0 = null;
                k56 k56 = (k56) this.c;
                if (k56 != null) {
                    k56.invoke();
                    return;
                }
                return;
            default:
                ((rwc) this.b).u0.put((lwc) this.c, (Object) null);
                return;
        }
    }

    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ((g60) this.b).setVisibility(0);
                return;
            default:
                View view = (View) this.d;
                view.setVisibility(0);
                if (view.getTranslationY() == 0.0f) {
                    view.setTranslationY(fk4.d().getDisplayMetrics().density * 4.0f);
                    return;
                }
                return;
        }
    }
}
