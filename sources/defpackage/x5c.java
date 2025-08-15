package defpackage;

import android.animation.Animator;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: x5c  reason: default package */
public final class x5c implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x5c(Object obj, float f, int i) {
        this.a = i;
        this.c = obj;
        this.b = f;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }

    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                return;
            default:
                bc7[] bc7Arr = RecordControlsWidget.b1;
                ((RecordControlsWidget) this.c).z0().setTranslationY(this.b);
                return;
        }
    }

    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                z5c z5c = (z5c) this.c;
                z5c.a = true;
                z5c.o = this.b;
                return;
            default:
                return;
        }
    }
}
