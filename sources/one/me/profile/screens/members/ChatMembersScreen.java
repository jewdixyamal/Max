package one.me.profile.screens.members;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\r"}, d2 = {"Lone/me/profile/screens/members/ChatMembersScreen;", "Lone/me/sdk/arch/Widget;", "Lng3;", "Lbha;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "chatId", "Lek2;", "chatMemberType", "(JLek2;)V", "profile_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ChatMembersScreen extends Widget implements ng3, bha {
    public static final /* synthetic */ bc7[] u0;
    public final je7 X;
    public final je7 Y;
    public final q7c Z;
    public final glc a;
    public final x27 b;
    public final fs c;
    public final String o;
    public final q7c s0;
    public vha t0;

    static {
        Class<ChatMembersScreen> cls = ChatMembersScreen.class;
        hob hob = new hob(cls, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0);
        oec oec = nec.a;
        u0 = new bc7[]{hob, zr6.e(oec, cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), zr6.f(cls, "membersListRouter", "getMembersListRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0, oec)};
    }

    public ChatMembersScreen(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        this.a = new glc(new m52(19), (k56) null, 6);
        this.b = x27.d;
        this.c = new fs(Long.class, "profile:memberslist:id");
        this.o = ey8.i(m0(), "profile:chatMembersList:{", "}");
        this.X = createViewModelLazy(bl2.class, new ti2(3, new lk2(this, 0)));
        this.Y = createViewModelLazy(ro8.class, new ti2(4, new lk2(this, 1)));
        this.Z = viewBinding(wea.F0);
        mn5 mn5 = n0().y0;
        gh7 Q = this.lifecycleOwner.Q();
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(mn5, Q, fg7), new nk2((Continuation) null, this), 5), getLifecycleScope());
        od2.L(new zn5(tu0.g(o0().X, this.lifecycleOwner.Q(), fg7), new ok2((Continuation) null, this), 5), getLifecycleScope());
        od2.L(new zn5(tu0.g(n0().x0, this.lifecycleOwner.Q(), fg7), new lq0(2, this, ChatMembersScreen.class, "processEvents", "processEvents(Lone/me/profile/screens/members/ProfileListMembersEvents;)V", 4, 7), 5), getLifecycleScope());
        this.s0 = childSlotRouter(wea.w0);
    }

    public final void I(CharSequence charSequence) {
        o0().u(String.valueOf(charSequence));
    }

    public final void U() {
        o0().u((String) null);
    }

    public final x27 getInsetsConfig() {
        return this.b;
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m71getScopeIdIluPPks() {
        return this.o;
    }

    public final bvc getScreenDelegate() {
        return this.a;
    }

    public final void h(int i, Bundle bundle) {
        long[] longArray;
        long[] longArray2;
        int i2 = wea.B0;
        List list = nz4.a;
        List list2 = null;
        if (i == i2 || i == wea.A0) {
            if (!(bundle == null || (longArray = bundle.getLongArray("profile:memberslist:ids_to_delete")) == null)) {
                list2 = ys.l0(longArray);
            }
            if (list2 != null) {
                list = list2;
            }
            o0().q();
            o0().s(list);
            n0().u(list, false);
        } else if (i == wea.D0) {
            if (!(bundle == null || (longArray2 = bundle.getLongArray("profile:memberslist:ids_to_delete")) == null)) {
                list2 = ys.l0(longArray2);
            }
            if (list2 != null) {
                list = list2;
            }
            o0().q();
            o0().s(list);
            n0().u(list, true);
        }
    }

    public final long m0() {
        bc7 bc7 = u0[0];
        return ((Number) this.c.a(this)).longValue();
    }

    public final bl2 n0() {
        return (bl2) this.X.getValue();
    }

    public final ro8 o0() {
        return (ro8) this.Y.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        cla cla = new cla(linearLayout.getContext(), 6);
        cla.setId(wea.F0);
        cla.setLeftActions(new kka(new mk2(this, 0)));
        linearLayout.addView(cla);
        FrameLayout frameLayout = new FrameLayout(linearLayout.getContext());
        frameLayout.setId(wea.w0);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView(frameLayout);
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        mr0.I(p0());
        o0().q();
        vha vha = this.t0;
        if (vha != null) {
            vha.a();
        }
        this.t0 = null;
        n0().w();
        super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        i3a h = getRouter().h();
        if (h != null) {
            h.a(getViewLifecycleOwner(), new ru3((Widget) this, 4));
        }
        ((j03) this.s0.T0(this, u0[2])).d("members_list_widget", new lk2(this, 2));
        od2.L(new zn5(tu0.g(o0().s0, getViewLifecycleOwner().Q(), fg7.o), new pk2((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final void p() {
        o0().u((String) null);
    }

    public final cla p0() {
        return (cla) this.Z.T0(this, u0[1]);
    }

    public ChatMembersScreen(long j, ek2 ek2) {
        this(dy7.g(new kpa("profile:memberslist:id", Long.valueOf(j)), new kpa("profile:memberslist:type", ek2.a)));
    }
}
