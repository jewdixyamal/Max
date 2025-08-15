package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import one.me.android.root.RootController;

/* renamed from: tv3  reason: default package */
public final class tv3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tv3(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    public final void onAnimationCancel(Animator animator) {
        Object obj = this.c;
        switch (this.a) {
            case 0:
                uv3.a((uv3) obj, this.b);
                return;
            case 1:
                this.b = true;
                return;
            case 2:
                bc7[] bc7Arr = RootController.u0;
                ((RootController) obj).r0(this.b);
                return;
            default:
                super.onAnimationCancel(animator);
                this.b = true;
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        Object obj = this.c;
        switch (this.a) {
            case 0:
                uv3.a((uv3) obj, this.b);
                return;
            case 1:
                if (this.b) {
                    this.b = false;
                    return;
                }
                zb5 zb5 = (zb5) obj;
                if (((Float) zb5.K0.getAnimatedValue()).floatValue() == 0.0f) {
                    zb5.L0 = 0;
                    zb5.l(0);
                    return;
                }
                zb5.L0 = 2;
                zb5.D0.invalidate();
                return;
            case 2:
                bc7[] bc7Arr = RootController.u0;
                ((RootController) obj).r0(this.b);
                return;
            default:
                super.onAnimationEnd(animator);
                if (!this.b) {
                    ((View) obj).setVisibility(4);
                }
                this.b = false;
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ((uv3) this.c).i.invoke(Boolean.valueOf(this.b));
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public tv3(View view) {
        this.a = 3;
        this.c = view;
    }

    public tv3(zb5 zb5) {
        this.a = 1;
        this.c = zb5;
        this.b = false;
    }
}
