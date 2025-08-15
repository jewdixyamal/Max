package one.me.profile.screens.members;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/profile/screens/members/ChatAdminsScreen;", "Lone/me/sdk/arch/Widget;", "Lng3;", "Lbha;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "chatId", "(J)V", "profile_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ChatAdminsScreen extends Widget implements ng3, bha {
    public static final /* synthetic */ bc7[] w0;
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final glc a;
    public final x27 b;
    public final fs c;
    public final String o;
    public final je7 s0;
    public final q7c t0;
    public vha u0;
    public final q7c v0;

    static {
        Class<ChatAdminsScreen> cls = ChatAdminsScreen.class;
        hob hob = new hob(cls, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0);
        oec oec = nec.a;
        w0 = new bc7[]{hob, zr6.e(oec, cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), zr6.f(cls, "membersListRouter", "getMembersListRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0, oec)};
    }

    public ChatAdminsScreen(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        this.a = new glc(new dk1(28), (k56) null, 6);
        this.b = x27.d;
        this.c = new fs(Long.class, "id");
        this.o = ey8.i(n0(), "profile:chatMembersList:{", "}");
        this.X = createViewModelLazy(u52.class, new s(25, new l52(this, 1)));
        this.Y = createViewModelLazy(ro8.class, new s(26, new l52(this, 2)));
        this.Z = tu0.r(3, new dk1(29));
        this.s0 = tu0.r(3, new m52(0));
        this.t0 = viewBinding(wea.G0);
        s35 s35 = o0().X;
        gh7 Q = this.lifecycleOwner.Q();
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(s35, Q, fg7), new n52(this, (Continuation) null), 5), getLifecycleScope());
        od2.L(new zn5(tu0.g(m0().w0, this.lifecycleOwner.Q(), fg7), new lq0(2, this, ChatAdminsScreen.class, "processEvents", "processEvents(Lone/me/profile/screens/members/ProfileListMembersEvents;)V", 4, 5), 5), getLifecycleScope());
        this.v0 = childSlotRouter(wea.x0);
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
    public final String m70getScopeIdIluPPks() {
        return this.o;
    }

    public final bvc getScreenDelegate() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r2 = r3.getLongArray("profile:adminslist:ids_to_delete");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(int r2, android.os.Bundle r3) {
        /*
            r1 = this;
            int r0 = defpackage.wea.y0
            if (r2 != r0) goto L_0x0039
            if (r3 == 0) goto L_0x0013
            java.lang.String r2 = "profile:adminslist:ids_to_delete"
            long[] r2 = r3.getLongArray(r2)
            if (r2 == 0) goto L_0x0013
            java.util.List r2 = defpackage.ys.l0(r2)
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            if (r2 != 0) goto L_0x0018
            nz4 r2 = defpackage.nz4.a
        L_0x0018:
            ro8 r3 = r1.o0()
            r3.s(r2)
            u52 r1 = r1.m0()
            java.util.ArrayList r3 = r1.v0
            r3.addAll(r2)
            gjb r2 = new gjb
            int r3 = defpackage.yea.d2
            eqe r0 = new eqe
            r0.<init>(r3)
            r2.<init>(r0)
            s35 r1 = r1.w0
            defpackage.pnf.o(r1, r2)
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.profile.screens.members.ChatAdminsScreen.h(int, android.os.Bundle):void");
    }

    public final u52 m0() {
        return (u52) this.X.getValue();
    }

    public final long n0() {
        bc7 bc7 = w0[0];
        return ((Number) this.c.a(this)).longValue();
    }

    public final ro8 o0() {
        return (ro8) this.Y.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        cla cla = new cla(linearLayout.getContext(), 6);
        cla.setId(wea.G0);
        cla.setTitle(yea.u2);
        cla.setLeftActions(new kka(new l(24, this)));
        cla.setRightActions(new pka((yka) null, new xka(this)));
        linearLayout.addView(cla);
        FrameLayout frameLayout = new FrameLayout(linearLayout.getContext());
        frameLayout.setId(wea.x0);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView(frameLayout);
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        mr0.I((cla) this.t0.T0(this, w0[1]));
        vha vha = this.u0;
        if (vha != null) {
            vha.a();
        }
        this.u0 = null;
        m0().r();
        super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        ((j03) this.v0.T0(this, w0[2])).d("admins_list_widget", new l52(this, 0));
    }

    public final void p() {
        o0().u((String) null);
    }

    public ChatAdminsScreen(long j) {
        this(dy7.g(new kpa("id", Long.valueOf(j))));
    }
}
