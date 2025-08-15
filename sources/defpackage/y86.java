package defpackage;

import android.view.View;
import android.view.ViewStub;
import one.me.sdk.gallery.view.NumericCheckButton;

/* renamed from: y86  reason: default package */
public final /* synthetic */ class y86 implements ViewStub.OnInflateListener {
    public final /* synthetic */ z86 a;

    public /* synthetic */ y86(z86 z86) {
        this.a = z86;
    }

    public final void onInflate(ViewStub viewStub, View view) {
        View findViewById = view.findViewById(fga.b);
        NumericCheckButton numericCheckButton = (NumericCheckButton) view.findViewById(fga.a);
        z86 z86 = this.a;
        z86.G0 = numericCheckButton;
        int G = tu0.G(((float) 10) * z86.a.getContext().getResources().getDisplayMetrics().density);
        if (findViewById != null) {
            findViewById.post(new uc3(numericCheckButton, G, G, G, G, findViewById, 1));
        }
    }
}
