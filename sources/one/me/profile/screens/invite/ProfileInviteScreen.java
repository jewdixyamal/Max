package one.me.profile.screens.invite;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f¨\u0006\r"}, d2 = {"Lone/me/profile/screens/invite/ProfileInviteScreen;", "Lone/me/sdk/arch/Widget;", "Lwhb;", "Lng3;", "Lmkd;", "Lxt3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "(J)V", "profile_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ProfileInviteScreen extends Widget implements whb, ng3, mkd, xt3 {
    public static final /* synthetic */ bc7[] Y;
    public final q7c X;
    public final glc a;
    public final x27 b;
    public final je7 c;
    public final xhb o;

    static {
        hob hob = new hob(ProfileInviteScreen.class, "moreActionsButton", "getMoreActionsButton()Landroid/widget/ImageView;", 0);
        nec.a.getClass();
        Y = new bc7[]{hob};
    }

    public ProfileInviteScreen(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        this.a = new glc(new lab(19), (k56) null, 6);
        this.b = x27.d;
        this.c = createViewModelLazy(jib.class, new jp8(19, new eh2(bundle, 7)));
        xhb xhb = new xhb(((iba) xcb.a.getAccessor().c(iba.class)).a(), this);
        this.o = xhb;
        this.X = viewBinding(wea.J);
        w7c w7c = m0().A0;
        gh7 Q = this.lifecycleOwner.Q();
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(w7c, Q, fg7), new shb(2, xhb, xhb.class, "submitList", "submitList(Ljava/util/List;)V", 4, 0), 5), getLifecycleScope());
        od2.L(new zn5(tu0.g(m0().C0, this.lifecycleOwner.Q(), fg7), new thb(this, (Continuation) null), 5), getLifecycleScope());
        od2.L(new zn5(tu0.g(m0().B0, this.lifecycleOwner.Q(), fg7), new uhb(this, (Continuation) null), 5), getLifecycleScope());
    }

    public final x27 getInsetsConfig() {
        return this.b;
    }

    public final bvc getScreenDelegate() {
        return this.a;
    }

    public final void h(int i, Bundle bundle) {
        jib m0 = m0();
        m0.getClass();
        if (i == wea.N) {
            ckb ckb = ckb.c;
            dp3 dp3 = hdb.b;
            ckb.getClass();
            pnf.o(m0.B0, new c64(zr6.k(new StringBuilder(":profile?id="), m0.b, "&type=local_chat")));
            m0.y0.set(false);
        } else if (i == wea.G) {
            vxd T = j47.T(m0.a, ((w9a) ((kke) m0.o.getValue())).b(), (vx3) null, new cib(m0, (Continuation) null), 2);
            m0.v0.o1(m0, jib.D0[0], T);
        }
    }

    public final jib m0() {
        return (jib) this.c.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        wz7 wz7 = new wz7(25, this);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        v3c.y(new ee1(3, (Continuation) null, 2), linearLayout);
        wz7.invoke(linearLayout);
        return linearLayout;
    }

    public final void y(int i, Bundle bundle) {
        jib m0 = m0();
        m0.getClass();
        if (i == wea.K) {
            pnf.o(m0.C0, new mhb(new eqe(yea.a1), new eqe(yea.Z0), y53.M(new mg3(wea.G, new eqe(yea.W0), 3, false), new mg3(wea.y, new eqe(yea.X0), 2, false))));
        }
    }

    public ProfileInviteScreen(long j) {
        this(dy7.g(new kpa("id", Long.valueOf(j))));
    }
}
