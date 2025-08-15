package one.me.keyboardmedia.stickers;

import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\f"}, d2 = {"Lone/me/keyboardmedia/stickers/KeyboardStickersWidget;", "Lone/me/sdk/arch/Widget;", "Lng3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "chatId", "Lsuc;", "scopeId", "(JLjava/lang/String;Lz84;)V", "keyboard-media_release"}, k = 1, mv = {2, 0, 0})
public final class KeyboardStickersWidget extends Widget implements ng3 {
    public static final /* synthetic */ bc7[] t0;
    public final q7c X;
    public final ly4 Y;
    public final m4e Z;
    public final je7 a;
    public final je7 b;
    public gw7 c;
    public final q7c o;
    public final g02 s0;

    static {
        Class<KeyboardStickersWidget> cls = KeyboardStickersWidget.class;
        t0 = new bc7[]{new hob(cls, "contentRecyclerView", "getContentRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), zr6.e(nec.a, cls, "stickersTabsRecyclerView", "getStickersTabsRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    }

    /* JADX WARNING: type inference failed for: r5v9, types: [ffe, g66] */
    public KeyboardStickersWidget(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        Class<b8e> cls = b8e.class;
        this.a = createViewModelLazy(cls, new nj4(15, new eh2(bundle, 5)));
        this.b = m82getSharedViewModelcp94BC8(bundle.getString(Widget.ARG_SCOPE_ID), cc8.class, (k56) null);
        this.o = viewBinding(jca.n);
        this.X = viewBinding(jca.o);
        kc7 kc7 = kc7.a;
        Class<iba> cls2 = iba.class;
        this.Y = new ly4(((iba) kc7.getAccessor().c(cls2)).a(), new jy2(24, this), (byte) 0);
        m4e m4e = new m4e(((iba) kc7.getAccessor().c(cls2)).a(), new ad7(this, bundle));
        this.Z = m4e;
        b8e o0 = o0();
        o0.getClass();
        hm9.m(cls.getName(), "loadStickers", new Object[0]);
        kq1 c2 = c37.c(((o2e) o0.c.getValue()).a());
        kq1 c3 = c37.c(((md5) o0.X.getValue()).a());
        ml0 ml0 = ((sc5) o0.Y.getValue()).s0;
        ml0.getClass();
        kq1 c4 = c37.c(new e0a(new mz9(ml0, 0), new nc5(23), 3));
        bod bod = (bod) o0.Z.getValue();
        od2.L(od2.F(new zn5(od2.s(c2, c3, c4, new j31(new ap8(c37.c(((o2e) bod.a.getValue()).l), bod, 10), ((b6e) bod.b.getValue()).e, aod.s0, 4), new ffe(5, (Continuation) null)), new w7e(o0, (Continuation) null), 5), ((w9a) o0.b).b()), o0.a);
        od2.L(new zn5(o0().u0, new xc7(this, (Continuation) null), 5), getLifecycleScope());
        this.s0 = new g02(m4e, new f(1, o0(), b8e.class, "onNewItemInFocus", "onNewItemInFocus(Lone/me/sdk/lists/adapter/ListItem;)V", 0, 29));
    }

    public final void h(int i, Bundle bundle) {
        if (i == jca.g) {
            b8e o0 = o0();
            vxd S = j47.S(o0.a, ((w9a) o0.b).b(), vx3.b, new x7e(o0, (Continuation) null));
            o0.A0.o1(o0, b8e.B0[2], S);
        }
    }

    public final EndlessRecyclerView2 m0() {
        return (EndlessRecyclerView2) this.o.T0(this, t0[0]);
    }

    public final RecyclerView n0() {
        return (RecyclerView) this.X.T0(this, t0[1]);
    }

    public final b8e o0() {
        return (b8e) this.a.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(jca.l);
        int G = tu0.G(((float) 44) * fk4.d().getDisplayMetrics().density);
        RecyclerView recyclerView = new RecyclerView(frameLayout.getContext(), (AttributeSet) null);
        recyclerView.setId(jca.o);
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, G));
        int G2 = tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density);
        int G3 = tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density);
        recyclerView.setPadding(G3, G2, G3, G2);
        recyclerView.setClipToPadding(false);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setItemAnimator((mdc) null);
        v3c.y(new nc7(3, (Continuation) null, 2), recyclerView);
        frameLayout.addView(recyclerView);
        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(frameLayout.getContext(), (AttributeSet) null, 6);
        endlessRecyclerView2.setId(jca.n);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = G;
        endlessRecyclerView2.setLayoutParams(layoutParams);
        v3c.y(new br(3, (Continuation) null, 8), endlessRecyclerView2);
        endlessRecyclerView2.setClipToPadding(false);
        endlessRecyclerView2.setClipChildren(false);
        int G4 = tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
        endlessRecyclerView2.setPadding(G4, endlessRecyclerView2.getPaddingTop(), G4, tu0.G(((float) 48) * fk4.d().getDisplayMetrics().density));
        frameLayout.addView(endlessRecyclerView2);
        return frameLayout;
    }

    public final void onDestroyView(View view) {
        m0().setAdapter((hdc) null);
        m0().s0(this.s0);
        n0().setAdapter((hdc) null);
    }

    public final void onViewCreated(View view) {
        n0().setAdapter(this.Y);
        n0().j(new d71(tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density), 3));
        EndlessRecyclerView2 m0 = m0();
        gw7 gw7 = this.c;
        m4e m4e = this.Z;
        m4e.Z = gw7;
        int A = z7.A(m0.getContext());
        m0.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(A);
        gridLayoutManager.K = new mc7(gridLayoutManager, (hdc) m4e);
        m0.setLayoutManager(gridLayoutManager);
        m0.j(new ry0(A, tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density), 8));
        m0.m(this.s0);
        m0.m(new s15(2, this));
        m0.k(new yc7(0, this));
        m0.setAdapter(m4e);
        od2.L(new zn5(o0().x0, new zc7(this, (Continuation) null), 5), getViewLifecycleScope());
    }

    public KeyboardStickersWidget(long j, String str, z84 z84) {
        this(dy7.g(new kpa("arg_key_chat_id", Long.valueOf(j)), new kpa(Widget.ARG_SCOPE_ID, str)));
    }
}
