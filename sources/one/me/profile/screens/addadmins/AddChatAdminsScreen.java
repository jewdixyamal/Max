package one.me.profile.screens.addadmins;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/profile/screens/addadmins/AddChatAdminsScreen;", "Lone/me/sdk/arch/Widget;", "Lbha;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "chatId", "(J)V", "profile_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class AddChatAdminsScreen extends Widget implements bha {
    public static final /* synthetic */ bc7[] x0;
    public final je7 X;
    public final q7c Y;
    public final q7c Z;
    public final glc a;
    public final x27 b;
    public final fs c;
    public final String o;
    public final q7c s0;
    public final boolean t0;
    public final bkg u0;
    public final e9 v0;
    public xu3 w0;

    static {
        Class<AddChatAdminsScreen> cls = AddChatAdminsScreen.class;
        hob hob = new hob(cls, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0);
        oec oec = nec.a;
        x0 = new bc7[]{hob, zr6.e(oec, cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), zr6.f(cls, "tabsView", "getTabsView()Lone/me/common/tablayout/OneMeTabLayout;", 0, oec), zr6.f(cls, "viewPager", "getViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0, oec)};
    }

    public AddChatAdminsScreen(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        List M;
        this.a = new glc(new m(1), (k56) null, 6);
        this.b = x27.d;
        this.c = new fs(Long.class, "profile:add_admins:chat_id");
        String i = ey8.i(m0(), "profile:add_admins:{", "}");
        this.o = i;
        this.X = createViewModelLazy(ro8.class, new s(2, new x5(2, this)));
        this.Y = viewBinding(wea.f);
        this.Z = viewBinding(wea.e);
        this.s0 = viewBinding(wea.g);
        boolean t = ((se5) ((qe5) ((khe) xcb.a.g()).getValue())).t();
        this.t0 = t;
        if (t) {
            M = Collections.singletonList(new g9(wea.c, yea.O, 1));
        } else {
            M = y53.M(new g9(wea.c, yea.O, 1), new g9(wea.d, yea.P, 2));
        }
        List list = M;
        this.u0 = new bkg(1, list);
        this.v0 = new e9(m0(), i, list, this);
    }

    public final void I(CharSequence charSequence) {
        ((ro8) this.X.getValue()).u(String.valueOf(charSequence));
    }

    public final void U() {
        ((ro8) this.X.getValue()).u((String) null);
    }

    public final x27 getInsetsConfig() {
        return this.b;
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m68getScopeIdIluPPks() {
        return this.o;
    }

    public final bvc getScreenDelegate() {
        return this.a;
    }

    public final long m0() {
        bc7 bc7 = x0[0];
        return ((Number) this.c.a(this)).longValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        cla cla = new cla(linearLayout.getContext(), 6);
        cla.setId(wea.f);
        cla.setTitle(yea.Q);
        cla.setLeftActions(new lka(new l(2, this)));
        cla.setRightActions(new pka((yka) null, new xka(this)));
        linearLayout.addView(cla);
        wja wja = new wja(linearLayout.getContext(), (AttributeSet) null);
        wja.setId(wea.e);
        wja.setLayoutParams(new dm(-1, -2));
        wja.setTabMode(1);
        wja.setElevation(fk4.d().getDisplayMetrics().density * 10.0f);
        wja.setVisibility(this.t0 ^ true ? 0 : 8);
        linearLayout.addView(wja);
        ViewPager2 viewPager2 = new ViewPager2(linearLayout.getContext());
        viewPager2.setId(wea.g);
        viewPager2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        fm9.z(viewPager2);
        linearLayout.addView(viewPager2);
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        bc7[] bc7Arr = x0;
        mr0.I((cla) this.Y.T0(this, bc7Arr[1]));
        if (!requireActivity().isChangingConfigurations()) {
            ((ViewPager2) this.s0.T0(this, bc7Arr[3])).setAdapter((hdc) null);
        }
        xu3 xu3 = this.w0;
        if (xu3 != null) {
            xu3.c();
        }
        this.w0 = null;
    }

    public final void onViewCreated(View view) {
        bc7[] bc7Arr = x0;
        bc7 bc7 = bc7Arr[3];
        q7c q7c = this.s0;
        ViewPager2 viewPager2 = (ViewPager2) q7c.T0(this, bc7);
        viewPager2.setAdapter(this.v0);
        viewPager2.setOffscreenPageLimit(1);
        if (!this.t0) {
            wja wja = (wja) this.Z.T0(this, bc7Arr[2]);
            bkg bkg = this.u0;
            bkg.getClass();
            xu3 xu3 = new xu3(wja, (ViewPager2) q7c.T0(this, bc7Arr[3]), new f9(bkg, 0, wja));
            xu3.a();
            this.w0 = xu3;
        }
        od2.L(new zn5(tu0.g(((ro8) this.X.getValue()).X, getViewLifecycleOwner().Q(), fg7.o), new h9((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final void p() {
        ((ro8) this.X.getValue()).u((String) null);
    }

    public AddChatAdminsScreen(long j) {
        this(dy7.g(new kpa("profile:add_admins:chat_id", Long.valueOf(j))));
    }
}
