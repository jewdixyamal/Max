package one.me.calls.ui.ui.incoming;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lone/me/calls/ui/ui/incoming/CallIncomingScreen;", "Lone/me/sdk/arch/Widget;", "Liq9;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "crd", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
public final class CallIncomingScreen extends Widget implements iq9 {
    public static final crd Z = new Object();
    public static final /* synthetic */ bc7[] s0;
    public final je7 X;
    public final je7 Y;
    public final kr1 a = n31.a.d();
    public final je7 b;
    public final q7c c;
    public final je7 o;

    /* JADX WARNING: type inference failed for: r0v1, types: [crd, java.lang.Object] */
    static {
        bc7 hob = new hob(CallIncomingScreen.class, "avatarView", "getAvatarView()Lone/me/calls/ui/view/CallUserLargeView;", 0);
        nec.a.getClass();
        s0 = new bc7[]{hob};
    }

    public CallIncomingScreen(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        this.b = createViewModelLazy(e91.class, new s(13, new x2(bundle, (Widget) this, 9)));
        this.c = viewBinding(rvb.call_incoming_avatar);
        this.o = tu0.r(3, new k11(12));
        this.X = yi1.c();
        this.Y = tu0.r(3, new x5(26, this));
    }

    public final e91 m0() {
        return (e91) this.b.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return new y81(this, getContext());
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 160) {
            if (((eua) this.o.getValue()).getClass()) {
                m0().q();
            }
        }
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        dy7.D(requireActivity(), true);
        i3a h = getRouter().h();
        if (h != null) {
            h.a(getViewLifecycleOwner(), new ru3((Widget) this, 1));
        }
        od2.L(new zn5(m0().u0, new z81(this, (Continuation) null), 5), getViewLifecycleScope());
    }
}
