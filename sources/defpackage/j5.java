package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import ru.ok.messages.media.attaches.ActAttachesView;

/* renamed from: j5  reason: default package */
public final class j5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActAttachesView b;

    public /* synthetic */ j5(ActAttachesView actAttachesView, int i) {
        this.a = i;
        this.b = actAttachesView;
    }

    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                this.b.n1.setVisibility(4);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.n1.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
