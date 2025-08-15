package one.me.login.neuroavatars;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0011B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0007\u0010\u0010¨\u0006\u0012"}, d2 = {"Lone/me/login/neuroavatars/NeuroAvatarsScreen;", "Lone/me/sdk/arch/Widget;", "", "Lng3;", "Lad0;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lafc;", "registrationData", "Le8b;", "presetAvatars", "(Lafc;Le8b;)V", "", "contactId", "(J)V", "dp9", "login_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class NeuroAvatarsScreen extends Widget implements ng3, ad0 {
    public static final /* synthetic */ bc7[] M0;
    public final je7 A0;
    public final cx5 B0;
    public final bp9 C0;
    public final fs D0;
    public final fs E0;
    public final fs F0;
    public final je7 G0;
    public final ExecutorService H0;
    public final jv5 I0;
    public final np9 J0;
    public final b46 K0;
    public final khe L0;
    public final q7c X;
    public final q7c Y;
    public final q7c Z;
    public final /* synthetic */ dp3 a;
    public final x27 b;
    public final glc c;
    public final je7 o;
    public final q7c s0;
    public final q7c t0;
    public final q7c u0;
    public final q7c v0;
    public final q7c w0;
    public final q7c x0;
    public final wb5 y0;
    public final je7 z0;

    static {
        Class<NeuroAvatarsScreen> cls = NeuroAvatarsScreen.class;
        hob hob = new hob(cls, "tabsView", "getTabsView()Lone/me/common/tablayout/OneMeTabLayout;", 0);
        oec oec = nec.a;
        M0 = new bc7[]{hob, zr6.e(oec, cls, "selectedAvatarView", "getSelectedAvatarView()Lone/me/sdk/uikit/common/avatar/OneMeAvatarView;", 0), zr6.f(cls, "collapsibleContainer", "getCollapsibleContainer()Landroid/view/ViewGroup;", 0, oec), zr6.f(cls, "appbarLayout", "getAppbarLayout()Lcom/google/android/material/appbar/AppBarLayout;", 0, oec), zr6.f(cls, "oneMeToolbar", "getOneMeToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0, oec), zr6.f(cls, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0, oec), zr6.f(cls, "buttonBackground", "getButtonBackground()Landroid/view/View;", 0, oec), zr6.f(cls, "continueBtn", "getContinueBtn()Lone/me/sdk/uikit/common/button/OneMeButton;", 0, oec), zr6.f(cls, "tabsShimmer", "getTabsShimmer()Lone/me/login/neuroavatars/NeuroAvatarsTabShimmerView;", 0, oec), zr6.f(cls, "registrationData", "getRegistrationData()Lone/me/login/common/RegistrationData;", 0, oec), zr6.f(cls, "presetAvatars", "getPresetAvatars()Lone/me/login/common/avatars/PresetAvatarsModel;", 0, oec), zr6.f(cls, "contactId", "getContactId()Ljava/lang/Long;", 0, oec)};
    }

    public NeuroAvatarsScreen(afc afc, e8b e8b) {
        this(dy7.g(new kpa("registration_data_args", afc), new kpa("avatars_args", e8b)));
    }

    public final void a(String str, RectF rectF, Rect rect) {
        mo9 mo9 = r0().b;
        mo9.getClass();
        j47.T(mo9.f, (lx3) null, (vx3) null, new jo9(str, rect, mo9, rectF, 2, (Continuation) null), 3);
    }

    public final x27 getInsetsConfig() {
        return this.b;
    }

    public final bvc getScreenDelegate() {
        return this.c;
    }

    public final void h(int i, Bundle bundle) {
        if (i == hwb.oneme_login_neuro_avatars_load_from_gallery_action) {
            du7.c.P1().b(":media-picker/select/photo", (Bundle) null);
        } else if (i == hwb.oneme_login_neuro_avatars_take_photo_action) {
            r0().q();
        } else if (i == hwb.oneme_login_neuro_avatars_remove_photo_action) {
            wp9 r0 = r0();
            r0.c.a((h4d) null);
            r0.b.i.setValue((Object) null);
        }
    }

    public final fm m0() {
        return (fm) this.s0.T0(this, M0[3]);
    }

    public final RecyclerView n0() {
        return (RecyclerView) this.u0.T0(this, M0[5]);
    }

    public final afc o0() {
        bc7 bc7 = M0[9];
        return (afc) this.D0.a(this);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 555) {
            if (i == 666 && i2 == -1) {
                mo9 mo9 = r0().b;
                mo9.getClass();
                if (intent == null) {
                    hm9.p(mo9.class.getName(), "data from ActAvatarCrop is null", (Throwable) null);
                    mo9.b();
                    return;
                }
                j47.T(mo9.f, (lx3) null, (vx3) null, new ko9(intent, mo9, (Continuation) null), 3);
            }
        } else if (i2 == -1) {
            wp9 r0 = r0();
            Uri data = intent != null ? intent.getData() : null;
            mo9 mo92 = r0.b;
            mo92.getClass();
            j47.T(mo92.f, (lx3) null, (vx3) null, new io9(mo92, data, (Continuation) null), 3);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(hwb.oneme_login_neuro_avatars_root_container);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        v3c.y(new ro2(3, (Continuation) null, 4), frameLayout);
        zo9 zo9 = new zo9(this, 6);
        CoordinatorLayout coordinatorLayout = Build.VERSION.SDK_INT >= 30 ? new CoordinatorLayout(frameLayout.getContext(), (AttributeSet) null) : new CoordinatorLayout(frameLayout.getContext(), (AttributeSet) null);
        zo9.invoke(coordinatorLayout);
        frameLayout.addView(coordinatorLayout);
        return frameLayout;
    }

    public final void onDestroyView(View view) {
        bp9 bp9;
        n0().setAdapter((hdc) null);
        n0().s0(this.J0);
        q0().l(this.B0);
        ArrayList arrayList = m0().v0;
        if (arrayList != null && (bp9 = this.C0) != null) {
            arrayList.remove(bp9);
        }
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 158 && ((eua) this.z0.getValue()).b(strArr)) {
            r0().q();
        }
    }

    public final void onViewCreated(View view) {
        w7c w7c = r0().u0;
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(w7c, getViewLifecycleOwner().Q(), fg7), new jp9((Continuation) null, this), 5), getViewLifecycleScope());
        gld gld = r0().s0;
        if (gld != null) {
            od2.L(new zn5(tu0.g(gld, getViewLifecycleOwner().Q(), fg7), new kp9((Continuation) null, this), 5), getViewLifecycleScope());
        }
        od2.L(new zn5(tu0.g(r0().Z, getViewLifecycleOwner().Q(), fg7), new lp9((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(r0().w0, getViewLifecycleOwner().Q(), fg7), new mp9((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(r0().b.h, getViewLifecycleOwner().Q(), fg7), new ip9((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(r0().z0, getViewLifecycleOwner().Q(), fg7), new hp9((Continuation) null, this), 5), getViewLifecycleScope());
        tu0.K((OneMeButton) this.w0.T0(this, M0[7]), 300, new yo9(this, 0));
        q0().a(this.B0);
        m0().a(s36.D(this.C0, m0(), getViewLifecycleOwner()));
        tu0.K(p0(), 300, new yo9(this, 1));
        jv5 jv5 = this.I0;
        jv5.z(new d8e(this, 1, jv5));
    }

    public final s5a p0() {
        return (s5a) this.Y.T0(this, M0[1]);
    }

    public final wja q0() {
        return (wja) this.X.T0(this, M0[0]);
    }

    public final wp9 r0() {
        return (wp9) this.G0.getValue();
    }

    /* JADX WARNING: type inference failed for: r12v1, types: [dp3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v10, types: [b46, java.lang.Object] */
    public NeuroAvatarsScreen(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        this.a = new Object();
        this.b = new x27(3, (yq0) null);
        this.c = new glc(new ap9(this, 2), (k56) null, 6);
        lt7 lt7 = lt7.a;
        this.o = lt7.getAccessor().d(d80.class);
        this.X = viewBinding(hwb.oneme_login_neuro_avatars_tabs);
        this.Y = viewBinding(hwb.oneme_login_neuro_avatars_avatar);
        this.Z = viewBinding(hwb.oneme_login_neuro_avatars_collapsible);
        this.s0 = viewBinding(hwb.oneme_login_neuro_avatars_appbar);
        this.t0 = viewBinding(hwb.oneme_login_neuro_avatars_toolbar);
        this.u0 = viewBinding(hwb.oneme_login_neuro_avatars_recycler_view);
        this.v0 = viewBinding(hwb.oneme_login_neuro_avatars_button_background);
        this.w0 = viewBinding(hwb.oneme_login_neuro_avatars_continue_btn);
        this.x0 = viewBinding(hwb.oneme_login_neuro_avatars_tabs_shimmer);
        this.y0 = new wb5();
        this.z0 = lt7.getAccessor().d(eua.class);
        this.A0 = lt7.getAccessor().d(an9.class);
        this.B0 = new cx5(1, this);
        this.C0 = new bp9(this);
        this.D0 = new fs(afc.class, "registration_data_args");
        this.E0 = new fs(e8b.class, "avatars_args");
        this.F0 = new fs(Long.class, "contact_id_args");
        this.G0 = createViewModelLazy(wp9.class, new jp8(5, new ap9(this, 3)));
        ExecutorService a2 = ((iba) lt7.getAccessor().c(iba.class)).a();
        this.H0 = a2;
        jv5 jv5 = new jv5(a2, (Object) new gp9(r0()), 9);
        this.I0 = jv5;
        this.J0 = new np9(jv5, new om8(1, r0(), wp9.class, "onNewItemInFocus", "onNewItemInFocus(Lone/me/login/common/avatars/NeuroAvatarModel;)V", 0, 8));
        this.K0 = new Object();
        this.L0 = new khe(new ap9(this, 4));
        od2.L(new zn5(r0().x0, new cp9((Continuation) null, this), 5), getLifecycleScope());
    }

    public NeuroAvatarsScreen(long j) {
        this(dy7.g(new kpa("contact_id_args", Long.valueOf(j))));
    }
}
