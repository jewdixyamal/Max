package defpackage;

import android.animation.Animator;

/* renamed from: cif  reason: default package */
public final class cif implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ dif b;

    public /* synthetic */ cif(dif dif, int i) {
        this.a = i;
        this.b = dif;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                je7 je7 = (je7) this.b.s0.c;
                if (je7.a()) {
                    amf amf = (amf) je7.getValue();
                    amf.setAlpha(1.0f);
                    amf.setVisibility(0);
                    return;
                }
                return;
            default:
                dif.e(this.b);
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                je7 je7 = (je7) this.b.s0.c;
                if (je7.a()) {
                    amf amf = (amf) je7.getValue();
                    amf.setAlpha(1.0f);
                    amf.setVisibility(0);
                    return;
                }
                return;
            default:
                dif.e(this.b);
                return;
        }
    }

    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationStart(Animator animator) {
        int i = this.a;
    }
}
