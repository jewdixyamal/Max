package one.me.chats.picker.chats;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import androidx.viewpager2.widget.ViewPager2;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B=\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0005\u0010\u0010¨\u0006\u0011"}, d2 = {"Lone/me/chats/picker/chats/PickerChatsTabWidget;", "Lone/me/sdk/arch/Widget;", "", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "scopeId", "", "isInMultiSelect", "Lkotlin/Function1;", "Le5f;", "onMultiSelectToggled", "Loa2;", "filter", "(Ljava/lang/String;ZLm56;Loa2;Lz84;)V", "chats-list_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class PickerChatsTabWidget extends Widget {
    public static final /* synthetic */ bc7[] y0;
    public final m56 X;
    public final qm0 Y;
    public final qm0 Z;
    public final fs a;
    public final fs b;
    public final fs c;
    public final x27 o;
    public final je7 s0;
    public s04 t0;
    public final x30 u0;
    public final int v0;
    public final kw5 w0;
    public final e2f x0;

    static {
        Class<PickerChatsTabWidget> cls = PickerChatsTabWidget.class;
        y0 = new bc7[]{new hob(cls, "sharedScopeId", "getSharedScopeId-IluPPks()Ljava/lang/String;", 0), rh4.g(nec.a, cls, "isInMultiSelect", "isInMultiSelect()Z"), new hob(cls, "itemsFilter", "getItemsFilter()Lone/me/chats/list/loader/ChatFilterEnum;", 0), new hob(cls, "foldersTabs", "getFoldersTabs()Lone/me/common/tablayout/OneMeTabLayout;", 0), new hob(cls, "foldersViewPager", "getFoldersViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0)};
    }

    public PickerChatsTabWidget(String str, boolean z, m56 m56, oa2 oa2, z84 z84) {
        this(dy7.g(new kpa("scope.id", new suc(str)), new kpa("is_in_multiselect", Boolean.valueOf(z)), new kpa("picker.filter", oa2)));
        this.X = m56;
    }

    public final x27 getInsetsConfig() {
        return this.o;
    }

    public final wja m0() {
        bc7 bc7 = y0[3];
        return (wja) this.Y.getValue();
    }

    public final ViewPager2 n0() {
        bc7 bc7 = y0[4];
        return (ViewPager2) this.Z.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        wja m0 = m0();
        ti3 ti3 = new ti3(0, -2);
        ti3.i = 0;
        ti3.e = 0;
        ti3.h = 0;
        constraintLayout.addView(m0, ti3);
        ViewPager2 n0 = n0();
        ti3 ti32 = new ti3(0, 0);
        ti32.j = p8a.e;
        ti32.l = 0;
        ti32.e = 0;
        ti32.h = 0;
        constraintLayout.addView(n0, ti32);
        return constraintLayout;
    }

    public final void onDestroyView(View view) {
        s04 s04 = this.t0;
        if (s04 != null) {
            s04.c();
        }
        this.t0 = null;
    }

    public final void onViewCreated(View view) {
        ViewPager2 n0 = n0();
        kw5 kw5 = this.w0;
        n0.setAdapter(kw5);
        n0().setOffscreenPageLimit(this.v0);
        s04 b2 = this.u0.b(m0(), n0(), new ww9(16), new ai0(21));
        b2.a();
        this.t0 = b2;
        View childAt = n0().getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setItemAnimator((mdc) null);
        }
        if (kw5.z0.size() > 0) {
            n0().e(0, false);
            n0().measure(View.MeasureSpec.makeMeasureSpec(getContext().getResources().getDisplayMetrics().widthPixels, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getContext().getResources().getDisplayMetrics().heightPixels, Integer.MIN_VALUE));
        }
        od2.L(new zn5(od2.x(new m58(((txa) this.s0.getValue()).u0, 23)), new qya(this, (Continuation) null), 5), getViewLifecycleScope());
    }

    public PickerChatsTabWidget(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        fs fsVar = new fs(suc.class, "scope.id");
        this.a = fsVar;
        this.b = new fs(Boolean.class, Boolean.TRUE, "is_in_multiselect");
        this.c = new fs(oa2.class, "picker.filter");
        this.o = x27.c;
        this.Y = binding(new nya(this, 0));
        this.Z = binding(new nya(this, 1));
        bc7 bc7 = y0[0];
        this.s0 = m82getSharedViewModelcp94BC8(((suc) fsVar.a(this)).a, txa.class, (k56) null);
        je7 createViewModelLazy = createViewModelLazy(mya.class, new jp8(10, new s4a(19)));
        this.u0 = new x30((ExecutorService) null, 6);
        this.v0 = 3;
        b bVar = new b();
        bVar.setMaxRecycledViews(rxa.a, 30);
        this.w0 = new kw5(this, bVar, new yt8(18, (Object) this));
        e2f e2f = new e2f();
        e2f.R(new w1f());
        e2f.R(new gqf());
        e2f.U(0);
        e2f.I(150);
        this.x0 = e2f;
        od2.L(new zn5(((mya) createViewModelLazy.getValue()).b, new oya(this, (Continuation) null), 5), getLifecycleScope());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PickerChatsTabWidget(String str, boolean z, m56 m56, oa2 oa2, int i, z84 z84) {
        this(str, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : m56, (i & 8) != 0 ? oa2.a : oa2, (z84) null);
    }
}
