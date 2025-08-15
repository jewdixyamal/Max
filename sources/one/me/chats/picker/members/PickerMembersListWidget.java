package one.me.chats.picker.members;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0006\u0010\u000e¨\u0006\u000f"}, d2 = {"Lone/me/chats/picker/members/PickerMembersListWidget;", "Lone/me/sdk/arch/Widget;", "Lmxa;", "", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "scopeId", "", "chatId", "", "decorsEnabled", "(Ljava/lang/String;JZLz84;)V", "chats-list_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class PickerMembersListWidget extends Widget implements mxa {
    public static final /* synthetic */ bc7[] x0;
    public final ExecutorService X;
    public final nxa Y;
    public final nxa Z;
    public final fs a;
    public final fs b;
    public final je7 c;
    public final je7 o;
    public final qm0 s0;
    public final qm0 t0;
    public dle u0;
    public bo6 v0;
    public h8e w0;

    static {
        Class<PickerMembersListWidget> cls = PickerMembersListWidget.class;
        hob hob = new hob(cls, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0);
        oec oec = nec.a;
        x0 = new bc7[]{hob, zr6.e(oec, cls, "decorsEnabled", "getDecorsEnabled()Z", 0), zr6.f(cls, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0, oec)};
    }

    public PickerMembersListWidget(String str, long j, boolean z, z84 z84) {
        this(dy7.g(new kpa(Widget.ARG_SCOPE_ID, new suc(str)), new kpa("chat_id", Long.valueOf(j)), new kpa("decors_enabled", Boolean.valueOf(z))));
    }

    public final void m0(EndlessRecyclerView2 endlessRecyclerView2) {
        em2 em2 = new em2(4, new wz7(18, this));
        h8e h8e = new h8e(endlessRecyclerView2, this.Y, em2);
        this.w0 = h8e;
        endlessRecyclerView2.j(h8e);
        bo6 bo6 = new bo6(em2);
        this.v0 = bo6;
        endlessRecyclerView2.j(bo6);
        v3c.y(new qb(h8e, (Continuation) null, 3), endlessRecyclerView2);
    }

    public final boolean n0() {
        bc7 bc7 = x0[1];
        return ((Boolean) this.b.a(this)).booleanValue();
    }

    public final txa o0() {
        return (txa) this.c.getValue();
    }

    public final void onContextAvailable(Context context) {
        super.onContextAvailable(context);
        od2.L(new zn5(o0().u0, new lq0(2, (pza) this.o.getValue(), pza.class, "onSearch", "onSearch(Ljava/lang/String;)V", 4, 28), 5), getLifecycleScope());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.addView(p0());
        return frameLayout;
    }

    public final void onDestroyView(View view) {
        dle dle = this.u0;
        if (dle != null) {
            dle.B(p0());
        }
        this.u0 = null;
        this.v0 = null;
        this.w0 = null;
        super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        od2.L(new zn5(tu0.g(((pza) this.o.getValue()).Y, getViewLifecycleOwner().Q(), fg7.o), new jza((Continuation) null, this, view), 5), getViewLifecycleScope());
        od2.L(new zn5(o0().Z, new kza(this, (Continuation) null), 5), getViewLifecycleScope());
        od2.L(new zn5(o0().u0, new lza(this, (Continuation) null), 5), getViewLifecycleScope());
    }

    public final EndlessRecyclerView2 p0() {
        bc7 bc7 = x0[2];
        return (EndlessRecyclerView2) this.t0.getValue();
    }

    public final void z(long j, fza fza) {
        o0().q(j, fza);
    }

    public PickerMembersListWidget(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        w7c w7c;
        this.a = new fs(Long.class, 0L, "chat_id");
        this.b = new fs(Boolean.class, Boolean.TRUE, "decors_enabled");
        Class<suc> cls = suc.class;
        Object v = ay7.v(bundle, Widget.ARG_SCOPE_ID, cls);
        if (v != null) {
            this.c = m82getSharedViewModelcp94BC8(((suc) ((Parcelable) v)).a, txa.class, (k56) null);
            je7 createViewModelLazy = createViewModelLazy(pza.class, new jp8(13, new hza(this, 0)));
            this.o = createViewModelLazy;
            ExecutorService a2 = ys2.a.c().a();
            this.X = a2;
            this.Y = new nxa(this, a2, 0);
            this.Z = new nxa(this, a2, 0);
            this.s0 = binding(new hza(this, 1));
            this.t0 = binding(new hza(this, 2));
            pza pza = (pza) createViewModelLazy.getValue();
            boolean r = pza.r();
            mp8 mp8 = pza.c;
            if (r) {
                ap8 ap8 = new ap8(((xp8) mp8).k, pza, 4);
                nz4 nz4 = nz4.a;
                w7c = od2.X(ap8, pza.a, wld.a, nz4);
            } else {
                w7c = ((xp8) mp8).k;
            }
            od2.L(new zn5(w7c, new iza(this, (Continuation) null), 5), getLifecycleScope());
            return;
        }
        throw new IllegalArgumentException(zr6.i("No value passed for key arg_key_scope_id of type ", cls.getSimpleName(), " in bundle").toString());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PickerMembersListWidget(String str, long j, boolean z, int i, z84 z84) {
        this(str, (i & 2) != 0 ? 0 : j, (i & 4) != 0 ? true : z, (z84) null);
    }
}
