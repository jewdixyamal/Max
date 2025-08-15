package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: ala  reason: default package */
public final class ala {
    public final /* synthetic */ cla a;

    public ala(cla cla) {
        this.a = cla;
    }

    public final void a() {
        cla cla = this.a;
        cla.F0 = true;
        cla.setPadding(0, cla.getPaddingTop(), tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density), cla.getPaddingBottom());
        View view = cla.C0;
        if (view instanceof eha) {
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMarginEnd(0);
                    view.setLayoutParams(marginLayoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
            View view2 = cla.B0;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
        cla.u0.setVisibility(8);
        je7 je7 = cla.v0;
        if (je7.a()) {
            ((fmd) je7.getValue()).setVisibility(8);
        }
        je7 je72 = cla.w0;
        if (je72.a()) {
            ((s5a) je72.getValue()).setVisibility(8);
        }
        je7 je73 = cla.x0;
        if (je73.a()) {
            ((ImageView) je73.getValue()).setVisibility(8);
        }
        OneMeButton oneMeButton = cla.A0;
        if (oneMeButton != null) {
            oneMeButton.setVisibility(8);
        }
    }
}
