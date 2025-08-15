package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;

/* renamed from: h33  reason: default package */
public final class h33 extends n15 {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public final TimeInterpolator h;
    public EditText i;
    public final c5 j = new c5(19, (Object) this);
    public final e33 k = new e33(0, this);
    public AnimatorSet l;
    public ValueAnimator m;

    public h33(m15 m15) {
        super(m15);
        this.e = z7.P(tsb.motionDurationShort3, 100, m15.getContext());
        this.f = z7.P(tsb.motionDurationShort3, 150, m15.getContext());
        this.g = z7.Q(m15.getContext(), tsb.motionEasingLinearInterpolator, og.a);
        this.h = z7.Q(m15.getContext(), tsb.motionEasingEmphasizedInterpolator, og.d);
    }

    public final void a() {
        if (this.b.D0 == null) {
            t(u());
        }
    }

    public final int c() {
        return wzb.clear_text_end_icon_content_description;
    }

    public final int d() {
        return yub.mtrl_ic_cancel;
    }

    public final View.OnFocusChangeListener e() {
        return this.k;
    }

    public final View.OnClickListener f() {
        return this.j;
    }

    public final View.OnFocusChangeListener g() {
        return this.k;
    }

    public final void m(EditText editText) {
        this.i = editText;
        this.a.setEndIconVisible(u());
    }

    public final void p(boolean z) {
        if (this.b.D0 != null) {
            t(z);
        }
    }

    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(this.h);
        ofFloat.setDuration((long) this.f);
        ofFloat.addUpdateListener(new f33(this, 1));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        TimeInterpolator timeInterpolator = this.g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i2 = this.e;
        ofFloat2.setDuration((long) i2);
        ofFloat2.addUpdateListener(new f33(this, 0));
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        this.l.addListener(new g33(this, 0));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration((long) i2);
        ofFloat3.addUpdateListener(new f33(this, 0));
        this.m = ofFloat3;
        ofFloat3.addListener(new g33(this, 1));
    }

    public final void s() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new cu1(14, this));
        }
    }

    public final void t(boolean z) {
        boolean z2 = this.b.d() == z;
        if (z && !this.l.isRunning()) {
            this.m.cancel();
            this.l.start();
            if (z2) {
                this.l.end();
            }
        } else if (!z) {
            this.l.cancel();
            this.m.start();
            if (z2) {
                this.m.end();
            }
        }
    }

    public final boolean u() {
        EditText editText = this.i;
        return editText != null && (editText.hasFocus() || this.d.hasFocus()) && this.i.getText().length() > 0;
    }
}
