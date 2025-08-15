package one.me.members.list;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0006\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\f¨\u0006\r"}, d2 = {"Lone/me/members/list/MembersListWidget;", "Lone/me/sdk/arch/Widget;", "Lfo8;", "Lgn8;", "Lxt3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "scopeId", "Lgo8;", "(Ljava/lang/String;Lgo8;Lz84;)V", "members-list_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class MembersListWidget extends Widget implements fo8, gn8, xt3 {
    public static final /* synthetic */ bc7[] D0;
    public final q7c A0;
    public c03 B0;
    public w54 C0;
    public final w4d X;
    public final je7 Y;
    public final fs Z;
    public final fs a;
    public final long b;
    public final ek2 c;
    public final Integer o;
    public final x27 s0;
    public final a3g t0;
    public final jv5 u0;
    public final jv5 v0;
    public final y51 w0;
    public final y51 x0;
    public final je7 y0;
    public final nd3 z0;

    static {
        Class<MembersListWidget> cls = MembersListWidget.class;
        D0 = new bc7[]{new hob(cls, "membersListArgs", "getMembersListArgs()Lone/me/members/list/MembersListArgs;", 0), rh4.g(nec.a, cls, "contextMenuJob", "getContextMenuJob()Lkotlinx/coroutines/Job;"), new oi9(cls, "selectedMemberIdForAction", "getSelectedMemberIdForAction()Ljava/lang/Long;"), new hob(cls, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0)};
    }

    public MembersListWidget(String str, go8 go8, z84 z84) {
        this(dy7.g(new kpa("arg_scope_id", new suc(str)), new kpa("memberslist:args", go8)));
    }

    public final x27 getInsetsConfig() {
        return this.s0;
    }

    public final go8 m0() {
        bc7 bc7 = D0[0];
        return (go8) this.a.a(this);
    }

    public final EndlessRecyclerView2 n0() {
        return (EndlessRecyclerView2) this.A0.T0(this, D0[3]);
    }

    public final ro8 o0() {
        return (ro8) this.Y.getValue();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [a66, ffe] */
    public final void onAttach(View view) {
        ((lp8) p0().s0.getValue()).e();
        od2.L(new zn5(o0().s0, new ffe(2, (Continuation) null), 5), getViewLifecycleScope());
        od2.L(new zn5(o0().Y, new gp8((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(o0().u0, new lq0(2, p0(), bp8.class, "searchMembers", "searchMembers(Ljava/lang/String;)V", 4, 21), 5), getViewLifecycleScope());
        ac acVar = p0().y0;
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(acVar, getViewLifecycleOwner().Q(), fg7), new dp8((Continuation) null, this, view), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(o0().s0, getViewLifecycleOwner().Q(), fg7), new ep8((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(getContext(), (AttributeSet) null, 6);
        endlessRecyclerView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        endlessRecyclerView2.setId(eda.c);
        endlessRecyclerView2.setItemAnimator((mdc) null);
        nd3 nd3 = this.z0;
        endlessRecyclerView2.setAdapter(nd3);
        endlessRecyclerView2.getContext();
        endlessRecyclerView2.setLayoutManager(new LinearLayoutManager(1, false));
        endlessRecyclerView2.setClipToPadding(false);
        z7.m(endlessRecyclerView2);
        endlessRecyclerView2.setPager(new j81(this, 5));
        endlessRecyclerView2.setIgnoreRefreshingFlagsForScrollEvent(true);
        endlessRecyclerView2.setThreshold(10);
        endlessRecyclerView2.setDelegate(new ar0((Object) this.w0));
        if (nd3.j() > 0) {
            endlessRecyclerView2.measure(View.MeasureSpec.makeMeasureSpec(endlessRecyclerView2.getContext().getResources().getDisplayMetrics().widthPixels, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(endlessRecyclerView2.getContext().getResources().getDisplayMetrics().heightPixels, Integer.MIN_VALUE));
        }
        return endlessRecyclerView2;
    }

    public final void onDismiss() {
        bc7[] bc7Arr = D0;
        bc7 bc7 = bc7Arr[2];
        this.Z.b(this, (Object) null);
        x77 x77 = (x77) this.X.T0(this, bc7Arr[1]);
        if (x77 != null) {
            x77.cancel((CancellationException) null);
        }
    }

    public final bp8 p0() {
        return (bp8) this.y0.getValue();
    }

    public final void y(int i, Bundle bundle) {
        bc7[] bc7Arr = D0;
        bc7 bc7 = bc7Arr[2];
        fs fsVar = this.Z;
        Long l = (Long) fsVar.a(this);
        if (l != null) {
            long longValue = l.longValue();
            ro8 o0 = o0();
            o0.getClass();
            pnf.o(o0.X, new lo8(i, longValue));
        }
        bc7 bc72 = bc7Arr[2];
        fsVar.b(this, (Object) null);
    }

    public MembersListWidget(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        this.a = new fs(go8.class, "memberslist:args");
        this.b = m0().a;
        this.c = m0().b;
        this.o = m0().o;
        this.X = mqd.D();
        Class<suc> cls = suc.class;
        Object v = ay7.v(bundle, "arg_scope_id", cls);
        if (v != null) {
            this.Y = m82getSharedViewModelcp94BC8(((suc) ((Parcelable) v)).a, ro8.class, (k56) null);
            this.Z = new fs(Long.class, (Object) null, "selected_member_id_for_action");
            this.s0 = x27.c;
            ko8 ko8 = ko8.a;
            a3g a3g = new a3g((Object) this, ko8.b(), 8);
            this.t0 = a3g;
            jv5 jv5 = new jv5((Object) this, ko8.b(), 8);
            this.u0 = jv5;
            jv5 jv52 = new jv5((Object) this, ko8.b(), 8);
            this.v0 = jv52;
            y51 y51 = new y51(ko8.b(), 6);
            this.w0 = y51;
            y51 y512 = new y51(ko8.b(), 2);
            this.x0 = y512;
            this.y0 = createViewModelLazy(bp8.class, new jp8(0, new cp8(this, 1)));
            this.z0 = new nd3(new md3(false, 1), jv5, a3g, jv52, y51, y512);
            this.A0 = viewBinding(eda.c);
            return;
        }
        throw new IllegalArgumentException(zr6.i("No value passed for key arg_scope_id of type ", cls.getSimpleName(), " in bundle").toString());
    }
}
