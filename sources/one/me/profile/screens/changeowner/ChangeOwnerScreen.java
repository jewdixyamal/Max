package one.me.profile.screens.changeowner;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.members.list.MembersListWidget;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\r"}, d2 = {"Lone/me/profile/screens/changeowner/ChangeOwnerScreen;", "Lone/me/sdk/arch/Widget;", "Lbha;", "Lng3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "chatId", "", "leaveFromChat", "(JZ)V", "profile_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ChangeOwnerScreen extends Widget implements bha, ng3 {
    public static final /* synthetic */ bc7[] u0;
    public final String X;
    public final je7 Y;
    public final je7 Z;
    public final glc a;
    public final x27 b;
    public final fs c;
    public final fs o;
    public final q7c s0;
    public final q7c t0;

    static {
        Class<ChangeOwnerScreen> cls = ChangeOwnerScreen.class;
        hob hob = new hob(cls, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0);
        oec oec = nec.a;
        u0 = new bc7[]{hob, zr6.e(oec, cls, "leaveFromChat", "getLeaveFromChat()Z", 0), zr6.f(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0, oec), zr6.f(cls, "membersListRouter", "getMembersListRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0, oec)};
    }

    public ChangeOwnerScreen(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        this.a = new glc(new dk1(25), (k56) null, 6);
        this.b = x27.d;
        this.c = new fs(Long.class, "chat_id");
        this.o = new fs(Boolean.class, "leave_chat");
        this.X = ey8.i(m0(), "profile:chatMembersList:{", "}");
        this.Y = createViewModelLazy(a32.class, new s(23, new md1(7, this)));
        this.Z = createViewModelLazy(ro8.class, new s(24, new dk1(26)));
        this.s0 = viewBinding(wea.t);
        this.t0 = childSlotRouter(wea.s);
    }

    public final void I(CharSequence charSequence) {
        ((ro8) this.Z.getValue()).u(String.valueOf(charSequence));
    }

    public final void U() {
        ((ro8) this.Z.getValue()).u((String) null);
    }

    public final x27 getInsetsConfig() {
        return this.b;
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m69getScopeIdIluPPks() {
        return this.X;
    }

    public final bvc getScreenDelegate() {
        return this.a;
    }

    public final void h(int i, Bundle bundle) {
        if (i == wea.q && bundle != null) {
            long j = bundle.getLong("new_owner_id");
            a32 a32 = (a32) this.Y.getValue();
            boolean n0 = n0();
            long j2 = a32.b;
            e52 e52 = (e52) ((jz2) ((iy2) a32.o.getValue())).m(j2).a.getValue();
            if (e52 != null) {
                ((k4a) ((pk) a32.c.getValue())).h(a32.b, e52.b.a, j);
                s35 s35 = a32.s0;
                if (n0) {
                    pnf.n(a32, ((w9a) ((kke) a32.Y.getValue())).b(), (vx3) null, new z22(a32, (Continuation) null), 2);
                    pnf.o(s35, new x22(new eqe(yea.d0), Integer.valueOf(woc.z)));
                    return;
                }
                pnf.o(s35, new x22(new eqe(yea.k0), Integer.valueOf(woc.z)));
                pnf.o(a32.Z, new nkb(j2, hdb.LOCAL_CHAT));
            }
        }
    }

    public final long m0() {
        bc7 bc7 = u0[0];
        return ((Number) this.c.a(this)).longValue();
    }

    public final boolean n0() {
        bc7 bc7 = u0[1];
        return ((Boolean) this.o.a(this)).booleanValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        cla cla = new cla(linearLayout.getContext(), 6);
        cla.setId(wea.t);
        cla.setTitle(yea.m0);
        cla.setLeftActions(new kka(new l(23, this)));
        cla.setRightActions(new pka((yka) null, new xka(this)));
        linearLayout.addView(cla);
        FrameLayout frameLayout = new FrameLayout(linearLayout.getContext());
        frameLayout.setId(wea.s);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView(frameLayout);
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        mr0.I((cla) this.s0.T0(this, u0[2]));
        super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        j03 j03 = (j03) this.t0.T0(this, u0[3]);
        if (!tpa.f(j03.c(), "change_owner_widget")) {
            coc coc = new coc(new MembersListWidget(this.X, new go8(m0(), ek2.MEMBER, (Integer) null, 12), (z84) null), (String) null, (zu3) null, (zu3) null, false, -1);
            coc.d("change_owner_widget");
            j03.a.R(coc);
        }
        s35 s35 = ((ro8) this.Z.getValue()).X;
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(s35, getViewLifecycleOwner().Q(), fg7), new u22((Continuation) null, this), 5), getViewLifecycleScope());
        je7 je7 = this.Y;
        od2.L(new zn5(tu0.g(((a32) je7.getValue()).Z, getViewLifecycleOwner().Q(), fg7), new v22((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(((a32) je7.getValue()).s0, getViewLifecycleOwner().Q(), fg7), new w22((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final void p() {
        ((ro8) this.Z.getValue()).u((String) null);
    }

    public ChangeOwnerScreen(long j, boolean z) {
        this(dy7.g(new kpa("chat_id", Long.valueOf(j)), new kpa("leave_chat", Boolean.valueOf(z))));
    }
}
