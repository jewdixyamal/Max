package one.me.calls.ui.ui.indicator;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/calls/ui/ui/indicator/CallIndicatorWidget;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
public final class CallIndicatorWidget extends Widget {
    public static final /* synthetic */ bc7[] X;
    public final je7 a = zi1.a.c();
    public final qm0 b = binding(new v91(this, 0));
    public final qm0 c = binding(new v91(this, 1));
    public final je7 o = createViewModelLazy(s91.class, new s(14, new v91(this, 2)));

    static {
        Class<CallIndicatorWidget> cls = CallIndicatorWidget.class;
        X = new bc7[]{new hob(cls, "indicatorView", "getIndicatorView()Lone/me/calls/ui/view/indicator/CallIndicatorView;", 0), zr6.e(nec.a, cls, "fakeIndicatorView", "getFakeIndicatorView()Landroid/view/View;", 0)};
    }

    public CallIndicatorWidget() {
        super((Bundle) null, 0, 3, (z84) null);
    }

    public static final o91 m0(CallIndicatorWidget callIndicatorWidget) {
        callIndicatorWidget.getClass();
        bc7 bc7 = X[0];
        return (o91) callIndicatorWidget.b.getValue();
    }

    public static final void n0(CallIndicatorWidget callIndicatorWidget, boolean z) {
        int i = z ? qp4.u0.o(callIndicatorWidget.getContext()).c.b().k : 0;
        callIndicatorWidget.getClass();
        bc7 bc7 = X[1];
        Drawable background = ((View) callIndicatorWidget.c.getValue()).getBackground();
        ColorDrawable colorDrawable = null;
        ColorDrawable colorDrawable2 = background instanceof ColorDrawable ? (ColorDrawable) background : null;
        if (colorDrawable2 != null) {
            if (colorDrawable2.getColor() != i) {
                colorDrawable = colorDrawable2;
            }
            if (colorDrawable != null) {
                colorDrawable.setColor(i);
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return new x91(this, getContext());
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        je7 je7 = this.o;
        od2.L(new zn5(((s91) je7.getValue()).Y, new y91(this, (Continuation) null), 5), getViewLifecycleScope());
        od2.L(new zn5(((s91) je7.getValue()).s0, new z91(this, (Continuation) null), 5), getViewLifecycleScope());
    }
}
