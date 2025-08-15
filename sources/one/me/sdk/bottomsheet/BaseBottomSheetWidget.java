package one.me.sdk.bottomsheet;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.webapp.rootscreen.WebAppRootScreen;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "nd2", "t9", "bottom-sheet_release"}, k = 1, mv = {2, 0, 0})
public abstract class BaseBottomSheetWidget extends Widget {
    public static final nd2 X = new nd2(7);
    public static final /* synthetic */ bc7[] Y;
    public static final String Z = "need_dim";
    public f6b a;
    public final fs b;
    public final q7c c;
    public final x27 o;

    static {
        Class<BaseBottomSheetWidget> cls = BaseBottomSheetWidget.class;
        Y = new bc7[]{new oi9(cls, "needDim", "getNeedDim()Z"), z7b.g(nec.a, cls, "cardView", "getCardView()Landroid/view/View;", 0)};
    }

    public BaseBottomSheetWidget() {
        this((Bundle) null, 1, (z84) null);
    }

    public boolean handleBack() {
        s0(true);
        return true;
    }

    public boolean isDialog() {
        return !(this instanceof WebAppRootScreen);
    }

    public FrameLayout m0(LayoutInflater layoutInflater, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(ufa.b);
        frameLayout.setClipToPadding(false);
        frameLayout.setOutlineProvider(new xq0(1, fk4.d().getDisplayMetrics().density * 20.0f));
        w0(frameLayout, layoutInflater, bundle);
        v3c.y(new xh0((Object) this, (Continuation) null, 0), frameLayout);
        return frameLayout;
    }

    public z5b n0() {
        return new t9(this, 1);
    }

    public x27 o0() {
        return this.o;
    }

    public void onAttach(View view) {
        super.onAttach(view);
        f6b f6b = this.a;
        if (f6b != null && f6b.getScrollState() == d6b.a) {
            pla.a(f6b, new re(4, f6b, f6b));
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        f6b f6b = new f6b(layoutInflater.getContext());
        f6b.setId(ufa.a);
        FrameLayout m0 = m0(layoutInflater, bundle);
        ViewGroup.LayoutParams layoutParams = m0.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        f6b.addView(m0, layoutParams);
        f6b.setCallback(n0());
        br7.d(m0, o0(), (m56) null);
        v3c.y(new c3(this, (Continuation) null, 2), f6b);
        this.a = f6b;
        return f6b;
    }

    public void onDestroyView(View view) {
        f6b f6b = this.a;
        if (f6b != null) {
            f6b.setCallback((z5b) null);
        }
        f6b f6b2 = this.a;
        if (f6b2 != null) {
            ValueAnimator valueAnimator = f6b2.s0;
            if (valueAnimator != null) {
                ju0.i(valueAnimator);
            }
            f6b2.s0 = null;
        }
        this.a = null;
        super.onDestroyView(view);
    }

    public final View p0() {
        return (View) this.c.T0(this, Y[1]);
    }

    public fka q0() {
        return null;
    }

    public boolean r0() {
        return true;
    }

    public final void s0(boolean z) {
        f6b f6b = this.a;
        if (f6b == null) {
            t0();
        } else if (f6b.getScrollState() != d6b.a) {
            u0();
            f6b.j(z);
        }
    }

    public void t0() {
        u0();
        getRouter().B(this);
    }

    public void u0() {
    }

    public final void v0(boolean z) {
        bc7 bc7 = Y[0];
        this.b.b(this, Boolean.valueOf(z));
    }

    public abstract void w0(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle);

    public BaseBottomSheetWidget(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        this.b = new fs(Boolean.class, Boolean.TRUE, Z);
        this.c = viewBinding(ufa.b);
        this.o = new x27(5, new yq0(3, 3, false));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BaseBottomSheetWidget(Bundle bundle, int i, z84 z84) {
        this((i & 1) != 0 ? null : bundle);
    }
}
