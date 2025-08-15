package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;

/* renamed from: x91  reason: default package */
public final class x91 extends FrameLayout implements bk1 {
    public final /* synthetic */ CallIndicatorWidget a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x91(CallIndicatorWidget callIndicatorWidget, Context context) {
        super(context);
        this.a = callIndicatorWidget;
        setId(y7a.O);
        setBackground(new ColorDrawable(0));
        bc7[] bc7Arr = CallIndicatorWidget.X;
        callIndicatorWidget.getClass();
        bc7 bc7 = CallIndicatorWidget.X[1];
        addView((View) callIndicatorWidget.c.getValue());
        addView(CallIndicatorWidget.m0(callIndicatorWidget));
    }

    public final void a(boolean z) {
        CallIndicatorWidget callIndicatorWidget = this.a;
        CallIndicatorWidget.n0(callIndicatorWidget, true);
        float f = (float) 100;
        if (CallIndicatorWidget.m0(callIndicatorWidget).getHeight() != tu0.G(fk4.d().getDisplayMetrics().density * f)) {
            o91 m0 = CallIndicatorWidget.m0(callIndicatorWidget);
            ViewGroup.LayoutParams layoutParams = m0.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.height = tu0.G(f * fk4.d().getDisplayMetrics().density);
                m0.setLayoutParams(marginLayoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        CallIndicatorWidget.m0(callIndicatorWidget).a(true);
    }

    public final void b(boolean z) {
        CallIndicatorWidget callIndicatorWidget = this.a;
        CallIndicatorWidget.n0(callIndicatorWidget, true);
        CallIndicatorWidget.m0(callIndicatorWidget).b(z);
    }

    public final void h(kl7 kl7, boolean z, long j) {
        CallIndicatorWidget callIndicatorWidget = this.a;
        CallIndicatorWidget.m0(callIndicatorWidget).h(kl7, z, j);
        float f = (float) 100;
        int q = rh4.q(f, fk4.d().getDisplayMetrics().density, ((ivc) ((ba1) ((aa1) callIndicatorWidget.a.getValue())).c.getValue()).a);
        int G = z ? q : tu0.G(fk4.d().getDisplayMetrics().density * f);
        if (z) {
            q = tu0.G(f * fk4.d().getDisplayMetrics().density);
        }
        o91 m0 = CallIndicatorWidget.m0(callIndicatorWidget);
        hg hgVar = new hg("height", G);
        ObjectAnimator ofInt = ObjectAnimator.ofInt((Object) null, hgVar, new int[]{G, q});
        ofInt.setDuration(j);
        ofInt.addUpdateListener(new pg(m0, hgVar, 1));
        kl7.add(ofInt);
        ObjectAnimator ofInt2 = ObjectAnimator.ofInt((Object) null, new hg("backgroundChange", 0), new int[]{0});
        ofInt2.addUpdateListener(new w91(callIndicatorWidget, z));
        kl7.add(ofInt2);
    }
}
