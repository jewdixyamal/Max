package one.me.profileedit.screens.changelink;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB!\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0007\u0010\u000f¨\u0006\u0010"}, d2 = {"Lone/me/profileedit/screens/changelink/ProfileChangeLinkScreen;", "Lone/me/sdk/arch/Widget;", "Lng3;", "Ljcb;", "Lxt3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "Lreb;", "type", "Lqeb;", "flow", "(JLreb;Lqeb;)V", "profile-edit_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ProfileChangeLinkScreen extends Widget implements ng3, jcb, xt3 {
    public static final /* synthetic */ bc7[] v0;
    public final je7 X;
    public final a3g Y;
    public final q7c Z;
    public final fs a;
    public final fs b;
    public final glc c;
    public final x27 o;
    public final q7c s0;
    public final q7c t0;
    public final q7c u0;

    static {
        Class<ProfileChangeLinkScreen> cls = ProfileChangeLinkScreen.class;
        hob hob = new hob(cls, "flowType", "getFlowType()Lone/me/profileedit/deeplink/ProfileEditDeepLinkRoutes$FlowType;", 0);
        oec oec = nec.a;
        v0 = new bc7[]{hob, zr6.e(oec, cls, "idType", "getIdType()Lone/me/profileedit/deeplink/ProfileEditDeepLinkRoutes$Type;", 0), zr6.f(cls, "shortLinkMoreButton", "getShortLinkMoreButton()Landroid/widget/ImageView;", 0, oec), zr6.f(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0, oec), zr6.f(cls, "button", "getButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0, oec), zr6.f(cls, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0, oec)};
    }

    public ProfileChangeLinkScreen(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        this.a = new fs(qeb.class, "entity:flow_type");
        this.b = new fs(reb.class, "entity:id_type");
        this.c = new glc(new lwa(5, this), (k56) null, 6);
        this.o = x27.d;
        this.X = createViewModelLazy(l22.class, new jp8(16, new zja(bundle, 3, this)));
        this.Y = new a3g(((iba) neb.a.getAccessor().c(iba.class)).a(), (Object) this, 9);
        this.Z = viewBinding(sea.w0);
        this.s0 = viewBinding(sea.y0);
        this.t0 = viewBinding(sea.D0);
        this.u0 = viewBinding(sea.x0);
        od2.L(new zn5(new t03(p0().o, 11), new kcb((Continuation) null, this), 5), getLifecycleScope());
        od2.L(new zn5(p0().s0, new lcb((Continuation) null, this), 5), getLifecycleScope());
    }

    public static final OneMeButton m0(ProfileChangeLinkScreen profileChangeLinkScreen) {
        profileChangeLinkScreen.getClass();
        return (OneMeButton) profileChangeLinkScreen.t0.T0(profileChangeLinkScreen, v0[4]);
    }

    public final x27 getInsetsConfig() {
        return this.o;
    }

    public final bvc getScreenDelegate() {
        return this.c;
    }

    public final void h(int i, Bundle bundle) {
        p0().b.h(i);
    }

    public final boolean handleBack() {
        View view = getView();
        if (view != null) {
            view.clearFocus();
        }
        mr0.G(this);
        return super.handleBack();
    }

    public final qeb n0() {
        bc7 bc7 = v0[0];
        return (qeb) this.a.a(this);
    }

    public final cla o0() {
        return (cla) this.s0.T0(this, v0[3]);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        qka qka;
        int i;
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        RecyclerView recyclerView = new RecyclerView(frameLayout.getContext(), (AttributeSet) null);
        recyclerView.setId(sea.x0);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1, 48);
        float f = (float) 16;
        layoutParams2.topMargin = tu0.G(fk4.d().getDisplayMetrics().density * f);
        recyclerView.setLayoutParams(layoutParams2);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.Y);
        recyclerView.setItemAnimator((mdc) null);
        recyclerView.setClipChildren(false);
        yt8 yt8 = new yt8(21, (Object) this);
        pq9 pq9 = qp4.u0;
        recyclerView.j(new q1d(pq9.j(recyclerView), yt8, (l) null, 12));
        recyclerView.j(new nz7(0));
        frameLayout.addView(recyclerView);
        cla cla = new cla(frameLayout.getContext(), 6);
        cla.setId(sea.y0);
        wz7 wz7 = new wz7(23, this);
        int ordinal = n0().ordinal();
        if (ordinal == 0) {
            qka = new kka(new a42(5, wz7));
        } else if (ordinal == 1) {
            qka = new lka(new a42(6, wz7));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        cla.setLeftActions(qka);
        cla.setRightActions(nka.a);
        cla.setForm(uka.a);
        cla.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 48));
        cla.setBackgroundColor(pq9.j(cla).b().j);
        frameLayout.addView(cla);
        OneMeButton oneMeButton = new OneMeButton(frameLayout.getContext(), (AttributeSet) null);
        oneMeButton.setId(sea.D0);
        oneMeButton.setSize(c7a.c);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setAppearance(z6a.c);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2, 80);
        layoutParams3.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), 0, tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density));
        oneMeButton.setLayoutParams(layoutParams3);
        int ordinal2 = n0().ordinal();
        if (ordinal2 == 0) {
            i = vea.R1;
        } else if (ordinal2 == 1) {
            i = vea.S1;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        oneMeButton.setText(i);
        tu0.K(oneMeButton, 300, new xx5(27, this));
        frameLayout.addView(oneMeButton);
        v3c.y(new c3(this, (Continuation) null, 24), frameLayout);
        return frameLayout;
    }

    public final void onViewCreated(View view) {
        cla o0 = o0();
        pla.a(o0, new i76((Object) o0, 15, (Object) this));
        od2.L(new zn5(new t03(p0().Y, 11), new ncb((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(p0().Z, getViewLifecycleOwner().Q(), fg7.o), new mcb((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final l22 p0() {
        return (l22) this.X.getValue();
    }

    public final void y(int i, Bundle bundle) {
        p0().b.i(i);
    }

    public ProfileChangeLinkScreen(long j, reb reb, qeb qeb) {
        this(dy7.g(new kpa("entity:id", Long.valueOf(j)), new kpa("entity:id_type", reb), new kpa("entity:flow_type", qeb)));
    }
}
