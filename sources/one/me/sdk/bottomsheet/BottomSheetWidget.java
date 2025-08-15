package one.me.sdk.bottomsheet;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "bottom-sheet_release"}, k = 1, mv = {2, 0, 0})
public abstract class BottomSheetWidget extends BaseBottomSheetWidget {
    public static final /* synthetic */ bc7[] x0;
    public final boolean s0;
    public yp4 t0;
    public View u0;
    public final fs v0;
    public final fv3 w0;

    static {
        oi9 oi9 = new oi9(BottomSheetWidget.class, "wasKeyboardOpened", "getWasKeyboardOpened()Z");
        nec.a.getClass();
        x0 = new bc7[]{oi9};
    }

    public BottomSheetWidget() {
        this((Bundle) null, 1, (z84) null);
    }

    public final void onContextAvailable(Context context) {
        super.onContextAvailable(context);
        getRouter().a(this.w0);
    }

    public final void onContextUnavailable() {
        super.onContextUnavailable();
        getRouter().K(this.w0);
    }

    public void onDestroyView(View view) {
        this.t0 = null;
        super.onDestroyView(view);
    }

    public final void w0(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle) {
        int G = tu0.G(((float) 10) * fk4.d().getDisplayMetrics().density);
        float f = (float) 12;
        frameLayout.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), G, tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(((float) 15) * fk4.d().getDisplayMetrics().density));
        frameLayout.addView(x0(layoutInflater, frameLayout), new ViewGroup.LayoutParams(-1, -2));
        yp4 yp4 = new yp4(frameLayout.getContext());
        yp4.setTranslationY((float) rh4.c((float) 6, fk4.d().getDisplayMetrics().density, -G));
        this.t0 = yp4;
        frameLayout.addView(yp4);
    }

    public abstract View x0(LayoutInflater layoutInflater, FrameLayout frameLayout);

    public boolean y0() {
        return this.s0;
    }

    public final void z0(Widget widget) {
        uu3 uu3;
        while (true) {
            uu3 parentController = uu3.getParentController();
            uu3 = widget;
            if (parentController == null) {
                break;
            }
            uu3 = uu3.getParentController();
        }
        znc znc = null;
        foc foc = uu3 instanceof foc ? (foc) uu3 : null;
        if (foc != null) {
            znc = foc.C();
        }
        if (znc != null) {
            znc.a(new kr0(znc, this));
        }
    }

    public BottomSheetWidget(Bundle bundle) {
        super(bundle);
        this.s0 = true;
        this.v0 = new fs(Boolean.class, Boolean.FALSE, "was_keyboard_opened");
        this.w0 = new fv3(getInstanceId(), new jr0(this, 0), new jr0(this, 1));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BottomSheetWidget(Bundle bundle, int i, z84 z84) {
        this((i & 1) != 0 ? null : bundle);
    }
}
