package one.me.profileedit;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u000e"}, d2 = {"Lone/me/profileedit/ProfileEditScreen;", "Lone/me/sdk/arch/Widget;", "Ligb;", "Lng3;", "Lad0;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "Lreb;", "type", "(JLreb;)V", "profile-edit_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ProfileEditScreen extends Widget implements igb, ng3, ad0 {
    public static final /* synthetic */ bc7[] y0;
    public final a3g X;
    public final q7c Y;
    public final q7c Z;
    public final long a;
    public final glc b;
    public final x27 c;
    public final je7 o;
    public final q7c s0;
    public final q7c t0;
    public final q7c u0;
    public final je7 v0;
    public final je7 w0;
    public final qm0 x0;

    static {
        Class<ProfileEditScreen> cls = ProfileEditScreen.class;
        hob hob = new hob(cls, "appBarLayout", "getAppBarLayout()Lcom/google/android/material/appbar/AppBarLayout;", 0);
        oec oec = nec.a;
        y0 = new bc7[]{hob, zr6.e(oec, cls, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), zr6.f(cls, "oneMeToolbar", "getOneMeToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0, oec), zr6.f(cls, "collapsibleContainerLinearLayout", "getCollapsibleContainerLinearLayout()Landroid/widget/LinearLayout;", 0, oec), zr6.f(cls, "avatar", "getAvatar()Lone/me/sdk/uikit/common/avatar/OneMeAvatarView;", 0, oec)};
    }

    public ProfileEditScreen(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        this.a = bundle.getLong("profile:id");
        this.b = new glc(new yfb(this, 0), (k56) null, 6);
        this.c = x27.d;
        this.o = createViewModelLazy(vgb.class, new jp8(18, new zja(this, 5, bundle)));
        neb neb = neb.a;
        this.X = new a3g(((iba) neb.getAccessor().c(iba.class)).a(), (Object) this, 10);
        this.Y = viewBinding(sea.U);
        this.Z = viewBinding(sea.r0);
        this.s0 = viewBinding(sea.q0);
        this.t0 = viewBinding(sea.b0);
        this.u0 = viewBinding(sea.V);
        this.v0 = neb.getAccessor().d(eua.class);
        this.w0 = neb.getAccessor().d(an9.class);
        od2.L(new zn5(new t03(n0().t0, 11), new bgb(this, (Continuation) null), 5), getLifecycleScope());
        od2.L(tu0.g(new zn5(new t03(n0().w0, 11), new cgb(this, (Continuation) null), 5), this.lifecycleOwner.Q(), fg7.X), getLifecycleScope());
        od2.L(new zn5(n0().x0, new dgb(this, (Continuation) null), 5), getLifecycleScope());
        this.x0 = binding(new yfb(this, 1));
    }

    public final void a(String str, RectF rectF, Rect rect) {
        vgb n0 = n0();
        j47.T(n0.a, ((w9a) n0.q()).b(), (vx3) null, new qgb(n0, str, rectF, (Continuation) null), 2);
    }

    public final x27 getInsetsConfig() {
        return this.c;
    }

    public final bvc getScreenDelegate() {
        return this.b;
    }

    public final void h(int i, Bundle bundle) {
        vgb n0 = n0();
        n0.getClass();
        int i2 = sea.d0;
        s35 s35 = n0.w0;
        if (i == i2) {
            pnf.o(s35, ofb.b);
        } else if (i == sea.c0) {
            pnf.o(s35, g43.b);
        } else if (i == sea.a0) {
            pnf.o(s35, qfb.b);
        } else {
            int i3 = sea.Y;
            gv4 gv4 = n0.b;
            if (i == i3) {
                gfb gfb = gfb.c;
                long e = gv4.e();
                gfb.getClass();
                wg0.k(":neuro-avatars?id=" + e, s35);
            } else if (i == sea.Z) {
                n0.r();
            } else if (i == sea.X) {
                gv4.j();
            } else if (i != sea.e && i != sea.g0 && i != sea.W) {
                gv4.g(i);
            }
        }
    }

    public final boolean handleBack() {
        mr0.G(this);
        vgb n0 = n0();
        gv4 gv4 = n0.b;
        jv4 jv4 = (jv4) gv4.i.getValue();
        Boolean bool = null;
        if (jv4 != null && jv4.a((jv4) gv4.j.getValue())) {
            pnf.o(n0.w0, new rfb(new eqe(vea.U), (jqe) null, y53.M(new mg3(sea.d0, new eqe(vea.V), 3, false), new mg3(sea.c0, new eqe(vea.T), 2, false))));
            bool = Boolean.TRUE;
        }
        return bool != null ? bool.booleanValue() : super.handleBack();
    }

    public final cla m0() {
        return (cla) this.s0.T0(this, y0[2]);
    }

    public final vgb n0() {
        return (vgb) this.o.getValue();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 333) {
            if (i != 666 || i2 != -1) {
                return;
            }
            if (intent == null) {
                hm9.p(ProfileEditScreen.class.getName(), "data from ActAvatarCrop is null", (Throwable) null);
                n0().t();
                return;
            }
            vgb n0 = n0();
            j47.T(n0.a, ((w9a) n0.q()).b(), (vx3) null, new rgb(intent, n0, (Continuation) null), 2);
        } else if (i2 == -1) {
            vgb n02 = n0();
            j47.T(n02.a, ((w9a) n02.q()).b(), (vx3) null, new ogb(n02, intent != null ? intent.getData() : null, (Continuation) null), 2);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        zfb zfb = new zfb(this, 1);
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(getContext(), (AttributeSet) null);
        coordinatorLayout.setId(sea.a);
        coordinatorLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        v3c.y(new egb(3, (Continuation) null, 0), coordinatorLayout);
        zfb.invoke(coordinatorLayout);
        return coordinatorLayout;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 158 && ((eua) this.v0.getValue()).b(strArr)) {
            n0().r();
        }
    }

    public final void onViewCreated(View view) {
        wb5 wb5 = new wb5();
        bc7[] bc7Arr = y0;
        bc7 bc7 = bc7Arr[0];
        q7c q7c = this.Y;
        ((fm) q7c.T0(this, bc7)).a(s36.D(new vc1(wb5, this, 2), (fm) q7c.T0(this, bc7Arr[0]), getViewLifecycleOwner()));
        od2.L(new zn5(new t03(n0().v0, 11), new fgb(this, view, (Continuation) null), 5), getViewLifecycleScope());
    }

    public ProfileEditScreen(long j, reb reb) {
        this(dy7.g(new kpa("profile:id", Long.valueOf(j)), new kpa("profile:type", reb)));
    }
}
