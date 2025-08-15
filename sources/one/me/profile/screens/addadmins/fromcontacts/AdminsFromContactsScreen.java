package one.me.profile.screens.addadmins.fromcontacts;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.views.EmptySearchView;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\f"}, d2 = {"Lone/me/profile/screens/addadmins/fromcontacts/AdminsFromContactsScreen;", "Lone/me/sdk/arch/Widget;", "Lkb;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "scopeId", "", "chatId", "(Ljava/lang/String;JLz84;)V", "profile_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class AdminsFromContactsScreen extends Widget implements kb {
    public static final /* synthetic */ bc7[] u0;
    public final q7c X;
    public zwe Y;
    public h8e Z;
    public final fs a;
    public final je7 b;
    public final je7 c;
    public final q7c o;
    public final ExecutorService s0;
    public final a3g t0;

    static {
        Class<AdminsFromContactsScreen> cls = AdminsFromContactsScreen.class;
        hob hob = new hob(cls, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0);
        oec oec = nec.a;
        u0 = new bc7[]{hob, zr6.e(oec, cls, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), zr6.f(cls, "emptySearchView", "getEmptySearchView()Lone/me/sdk/uikit/common/views/EmptySearchView;", 0, oec)};
    }

    public AdminsFromContactsScreen(String str, long j, z84 z84) {
        this(dy7.g(new kpa("arg_scope_id", new suc(str)), new kpa("profile:add_admins_from_contacts:chat_id", Long.valueOf(j))));
    }

    public final void m0(RecyclerView recyclerView) {
        h8e h8e = new h8e(recyclerView, this.t0, new em2(4, new l(7, this)));
        this.Z = h8e;
        recyclerView.j(h8e);
        v3c.y(new qb(h8e, (Continuation) null, 0), recyclerView);
    }

    public final RecyclerView n0() {
        return (RecyclerView) this.o.T0(this, u0[1]);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        RecyclerView recyclerView = new RecyclerView(frameLayout.getContext(), (AttributeSet) null);
        recyclerView.setId(wea.b);
        recyclerView.setItemAnimator((mdc) null);
        recyclerView.setAdapter(this.t0);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setClipToPadding(false);
        this.Y = z7.m(recyclerView);
        m0(recyclerView);
        frameLayout.addView(recyclerView);
        EmptySearchView emptySearchView = new EmptySearchView(frameLayout.getContext(), (AttributeSet) null);
        emptySearchView.setId(wea.a);
        emptySearchView.setGravity(17);
        emptySearchView.setTitle(yoc.d0);
        emptySearchView.setDescription(yoc.c0);
        emptySearchView.setIsButtonVisible(false);
        frameLayout.addView(emptySearchView);
        return frameLayout;
    }

    public final void onDestroyView(View view) {
        zwe zwe = this.Y;
        if (zwe != null) {
            zwe.B(n0());
        }
        this.Y = null;
        this.Z = null;
        super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        ac acVar = ((bc) this.c.getValue()).s0;
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(acVar, getViewLifecycleOwner().Q(), fg7), new rb((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(((ro8) this.b.getValue()).u0, getViewLifecycleOwner().Q(), fg7), new sb((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public AdminsFromContactsScreen(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        this.a = new fs(Long.class, "profile:add_admins_from_contacts:chat_id");
        Class<suc> cls = suc.class;
        Object v = ay7.v(bundle, "arg_scope_id", cls);
        if (v != null) {
            this.b = m82getSharedViewModelcp94BC8(((suc) ((Parcelable) v)).a, ro8.class, (k56) null);
            this.c = createViewModelLazy(bc.class, new s(5, new x5(6, this)));
            this.o = viewBinding(wea.b);
            this.X = viewBinding(wea.a);
            ExecutorService a2 = ((iba) xcb.a.getAccessor().c(iba.class)).a();
            this.s0 = a2;
            this.t0 = new a3g((Object) this, a2, 1);
            return;
        }
        throw new IllegalArgumentException(zr6.i("No value passed for key arg_scope_id of type ", cls.getSimpleName(), " in bundle").toString());
    }
}
