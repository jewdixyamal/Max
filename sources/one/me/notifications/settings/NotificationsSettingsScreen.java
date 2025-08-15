package one.me.notifications.settings;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/notifications/settings/NotificationsSettingsScreen;", "Lone/me/sdk/arch/Widget;", "Lwq3;", "Lnta;", "<init>", "()V", "notifications-settings_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class NotificationsSettingsScreen extends Widget implements wq3, nta {
    public static final /* synthetic */ bc7[] v0;
    public final mfd X;
    public final je7 Y;
    public final a3g Z;
    public final glc a = new glc(new j78(16), (k56) null, 6);
    public final x27 b = x27.d;
    public final je7 c = createViewModelLazy(gx9.class, new jp8(6, new j78(17)));
    public final je7 o;
    public final qm0 s0;
    public final qm0 t0;
    public final qm0 u0;

    static {
        Class<NotificationsSettingsScreen> cls = NotificationsSettingsScreen.class;
        hob hob = new hob(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0);
        oec oec = nec.a;
        v0 = new bc7[]{hob, zr6.e(oec, cls, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), zr6.f(cls, "resetDefaultsButton", "getResetDefaultsButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0, oec)};
    }

    public NotificationsSettingsScreen() {
        super((Bundle) null, 0, 3, (z84) null);
        sw9 sw9 = sw9.a;
        this.o = sw9.getAccessor().d(eua.class);
        this.X = new mfd(new gd1(17, this), sw9.getExecutors().a());
        this.Y = createViewModelLazy(bh0.class, new jp8(7, new j78(18)));
        this.Z = new a3g((Object) this, sw9.getExecutors().a(), 2);
        this.s0 = binding(new vw9(this, 0));
        this.t0 = binding(new vw9(this, 1));
        this.u0 = binding(new vw9(this, 2));
    }

    public final void Y(boolean z) {
        if (!z) {
            gx9 m0 = m0();
            m0.t0.m((Object) null, Boolean.TRUE);
        }
    }

    public final x27 getInsetsConfig() {
        return this.b;
    }

    public final bvc getScreenDelegate() {
        return this.a;
    }

    public final gx9 m0() {
        return (gx9) this.c.getValue();
    }

    public final void onAttach(View view) {
        super.onAttach(view);
        gx9 m0 = m0();
        m0.w0.m((Object) null, Boolean.valueOf(m0.b.b()));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setId(dea.n);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        bc7[] bc7Arr = v0;
        bc7 bc7 = bc7Arr[0];
        linearLayout.addView((cla) this.s0.getValue());
        bc7 bc72 = bc7Arr[1];
        linearLayout.addView((EndlessRecyclerView2) this.t0.getValue());
        bc7 bc73 = bc7Arr[2];
        linearLayout.addView((OneMeButton) this.u0.getValue());
        v3c.y(new o(3, (Continuation) null, 7), linearLayout);
        return linearLayout;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 177) {
            gx9 m0 = m0();
            boolean z = false;
            if (iArr[0] != 0) {
                z = true;
            }
            m0.t0.m((Object) null, Boolean.valueOf(z));
        }
    }

    public final void onViewCreated(View view) {
        w7c w7c = m0().v0;
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(w7c, getViewLifecycleOwner().Q(), fg7), new xw9((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(new j31(((bh0) this.Y.getValue()).s0, m0().u0, new xi1(3, (Continuation) null, 4), 4), getViewLifecycleOwner().Q(), fg7), new yw9((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(m0().s0, getViewLifecycleOwner().Q(), fg7), new zw9((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(m0().y0, getViewLifecycleOwner().Q(), fg7), new ax9((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final void w(int i) {
        if (i == 5) {
            gx9 m0 = m0();
            m0.getClass();
            pnf.o(m0.y0, uw9.b);
        }
    }
}
