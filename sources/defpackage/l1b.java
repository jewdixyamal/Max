package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* renamed from: l1b  reason: default package */
public final class l1b extends AnimatorListenerAdapter {
    public final /* synthetic */ m1b a;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;
    public final /* synthetic */ RectF d;
    public final /* synthetic */ k56 e;

    public l1b(m1b m1b, View view, xg1 xg1, RectF rectF, a81 a81) {
        this.a = m1b;
        this.b = view;
        this.c = xg1;
        this.d = rectF;
        this.e = a81;
    }

    public final void onAnimationCancel(Animator animator) {
        m1b m1b = this.a;
        m1b.getClass();
        xg1 xg1 = (xg1) this.c;
        View view = this.b;
        m1b.a(m1b, view, xg1, this.d);
        this.e.invoke();
        if (m1b.b()) {
            view.setLayerType(0, (Paint) null);
            xg1.setLayerType(0, (Paint) null);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        m1b m1b = this.a;
        m1b.getClass();
        xg1 xg1 = (xg1) this.c;
        View view = this.b;
        m1b.a(m1b, view, xg1, this.d);
        this.e.invoke();
        if (m1b.b()) {
            view.setLayerType(0, (Paint) null);
            xg1.setLayerType(0, (Paint) null);
        }
    }
}
