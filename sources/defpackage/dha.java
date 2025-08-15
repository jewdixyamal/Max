package defpackage;

import android.animation.Animator;
import android.text.Editable;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;

/* renamed from: dha  reason: default package */
public final class dha implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ eha b;

    public /* synthetic */ dha(eha eha, int i) {
        this.a = i;
        this.b = eha;
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

    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                mr0.V((View) this.b.C0.getValue());
                return;
            default:
                eha eha = this.b;
                ((AppCompatEditText) eha.C0.getValue()).setHint(eha.s0);
                eha.A0 = cha.c;
                bha bha = eha.u0;
                if (bha != null) {
                    bha.n();
                    return;
                }
                return;
        }
    }

    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                return;
            default:
                eha eha = this.b;
                je7 je7 = eha.E0;
                int i = 8;
                if (je7.a()) {
                    ((ImageView) je7.getValue()).setVisibility(8);
                }
                je7 je72 = eha.D0;
                if (je72.a()) {
                    ((AppCompatImageView) je72.getValue()).setVisibility(8);
                }
                ((View) eha.B0.getValue()).setVisibility(0);
                View view = (View) eha.F0.getValue();
                je7 je73 = eha.C0;
                Editable text = ((AppCompatEditText) je73.getValue()).getText();
                if (!(text == null || text.length() == 0)) {
                    i = 0;
                }
                view.setVisibility(i);
                ((View) je73.getValue()).setVisibility(0);
                eha.A0 = cha.o;
                return;
        }
    }
}
