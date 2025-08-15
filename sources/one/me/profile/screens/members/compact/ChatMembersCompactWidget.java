package one.me.profile.screens.members.compact;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/profile/screens/members/compact/ChatMembersCompactWidget;", "Lone/me/sdk/arch/Widget;", "Lng3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "chatId", "(J)V", "profile_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ChatMembersCompactWidget extends Widget implements ng3 {
    public static final /* synthetic */ bc7[] Z;
    public final je7 X;
    public final q7c Y;
    public final fs a;
    public final String b;
    public final je7 c;
    public vha o;

    static {
        Class<ChatMembersCompactWidget> cls = ChatMembersCompactWidget.class;
        Z = new bc7[]{new hob(cls, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), zr6.e(nec.a, cls, "membersListRouter", "getMembersListRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0)};
    }

    public ChatMembersCompactWidget(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        this.a = new fs(Long.class, "id");
        this.b = ey8.i(m0(), "profile:compactChatMembersList:{", "}");
        this.c = createViewModelLazy(bl2.class, new ti2(1, new gk2(this, 1)));
        this.X = createViewModelLazy(ro8.class, new ti2(2, new gk2(this, 2)));
        mn5 mn5 = n0().y0;
        gh7 Q = this.lifecycleOwner.Q();
        fg7 fg7 = fg7.o;
        od2.L(tu0.g(mn5, Q, fg7), getLifecycleScope());
        od2.L(new zn5(tu0.g(o0().X, this.lifecycleOwner.Q(), fg7), new ik2(this, (Continuation) null), 5), getLifecycleScope());
        od2.L(new zn5(tu0.g(n0().x0, this.lifecycleOwner.Q(), fg7), new lq0(2, this, ChatMembersCompactWidget.class, "processEvents", "processEvents(Lone/me/profile/screens/members/ProfileListMembersEvents;)V", 4, 6), 5), getLifecycleScope());
        this.Y = childSlotRouter(wea.w0);
    }

    public final x27 getInsetsConfig() {
        x27 x27 = x27.c;
        return x27.c;
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m72getScopeIdIluPPks() {
        return this.b;
    }

    public final void h(int i, Bundle bundle) {
        long[] longArray;
        long[] longArray2;
        int i2 = wea.B0;
        List list = nz4.a;
        List list2 = null;
        if (i == i2) {
            if (!(bundle == null || (longArray2 = bundle.getLongArray("profile:memberslist:ids_to_delete")) == null)) {
                list2 = ys.l0(longArray2);
            }
            if (list2 != null) {
                list = list2;
            }
            o0().q();
            o0().s(list);
            n0().u(list, false);
        } else if (i == wea.D0) {
            if (!(bundle == null || (longArray = bundle.getLongArray("profile:memberslist:ids_to_delete")) == null)) {
                list2 = ys.l0(longArray);
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
        bc7 bc7 = Z[0];
        return ((Number) this.a.a(this)).longValue();
    }

    public final bl2 n0() {
        return (bl2) this.c.getValue();
    }

    public final ro8 o0() {
        return (ro8) this.X.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(wea.w0);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }

    public final void onDestroyView(View view) {
        vha vha = this.o;
        if (vha != null) {
            vha.a();
        }
        this.o = null;
        n0().w();
        super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        ((j03) this.Y.T0(this, Z[1])).d("compact_members_list_widget", new gk2(this, 0));
    }

    public ChatMembersCompactWidget(long j) {
        this(dy7.g(new kpa("id", Long.valueOf(j))));
    }
}
