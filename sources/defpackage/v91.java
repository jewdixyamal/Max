package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;

/* renamed from: v91  reason: default package */
public final /* synthetic */ class v91 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallIndicatorWidget b;

    public /* synthetic */ v91(CallIndicatorWidget callIndicatorWidget, int i) {
        this.a = i;
        this.b = callIndicatorWidget;
    }

    public final Object invoke() {
        CallIndicatorWidget callIndicatorWidget = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = CallIndicatorWidget.X;
                o91 o91 = new o91(callIndicatorWidget.getContext(), (AttributeSet) null);
                o91.setId(y7a.N);
                o91.setLayoutParams(new ViewGroup.LayoutParams(-1, tu0.G(((float) 100) * fk4.d().getDisplayMetrics().density)));
                tu0.K(o91, 300, new c5(9, (Object) callIndicatorWidget));
                br7.d(o91, new x27(3, (yq0) null, 2), (m56) null);
                return o91;
            case 1:
                bc7[] bc7Arr2 = CallIndicatorWidget.X;
                View view = new View(callIndicatorWidget.getContext());
                view.setId(y7a.P);
                view.setLayoutParams(new ViewGroup.LayoutParams(-1, rh4.q((float) 15, fk4.d().getDisplayMetrics().density, tu0.G(((float) 100) * fk4.d().getDisplayMetrics().density))));
                view.setBackground(new ColorDrawable(qp4.u0.p(view).c.b().k));
                return view;
            default:
                bc7[] bc7Arr3 = CallIndicatorWidget.X;
                n31 n31 = n31.a;
                return new s91((jt4) n31.getAccessor().c(jt4.class), n31.b(), n31.d(), new bn1(callIndicatorWidget.getContext()), (oqa) n31.getAccessor().c(oqa.class), (kke) zi1.a.getAccessor().c(kke.class));
        }
    }
}
