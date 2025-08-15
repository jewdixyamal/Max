package defpackage;

import android.animation.Animator;
import android.view.View;

/* renamed from: n6c  reason: default package */
public final class n6c implements Animator.AnimatorListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ p6c b;
    public final /* synthetic */ View c;

    public n6c(boolean z, p6c p6c, View view) {
        this.a = z;
        this.b = p6c;
        this.c = view;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            boolean booleanValue = ((Boolean) this.b.a.invoke()).booleanValue();
            View view = this.c;
            if (booleanValue) {
                z5c z5c = view instanceof z5c ? (z5c) view : null;
                if (z5c == null || !z5c.b()) {
                    return;
                }
            }
            pag.F(view, mi6.CONFIRM);
        }
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }
}
