package one.me.folders.list;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lone/me/folders/list/FoldersListScreen;", "Lone/me/sdk/arch/Widget;", "Ly67;", "Lng3;", "Lxt3;", "<init>", "()V", "folders_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class FoldersListScreen extends Widget implements y67, ng3, xt3 {
    public static final /* synthetic */ bc7[] Z;
    public final aw5 X = new aw5(((iba) xv5.a.getAccessor().c(iba.class)).a(), new f(1, this, FoldersListScreen.class, "onFolderClick", "onFolderClick(Lone/me/folders/list/adapter/UserFolderListItem;)V", 0, 22), new ut0(3, this, FoldersListScreen.class, "onActionMenuClick", "onActionMenuClick(Landroid/view/View;Lone/me/folders/list/adapter/UserFolderListItem;I)V", 0, 2), new re6(14, (Object) this));
    public final q7c Y = viewBinding(oba.m);
    public final glc a = new glc(new fh5(5), (k56) null, 6);
    public final x27 b = x27.d;
    public final je7 c = createViewModelLazy(iw5.class, new nj4(5, new fh5(6)));
    public final f77 o = new f77(new a77(this));

    static {
        hob hob = new hob(FoldersListScreen.class, "foldersRecycler", "getFoldersRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0);
        nec.a.getClass();
        Z = new bc7[]{hob};
    }

    public FoldersListScreen() {
        super((Bundle) null, 0, 3, (z84) null);
    }

    public final void W(int i, int i2) {
        this.X.W(i, i2);
    }

    public final x27 getInsetsConfig() {
        return this.b;
    }

    public final bvc getScreenDelegate() {
        return this.a;
    }

    public final void h(int i, Bundle bundle) {
        if (i == oba.c) {
            iw5 m0 = m0();
            j47.T(m0.a, ((w9a) m0.c).a(), (vx3) null, new fw5(m0, (Continuation) null), 2);
        }
    }

    public final iw5 m0() {
        return (iw5) this.c.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        cla cla = new cla(getContext(), 6);
        cla.setId(oba.o);
        cla.setForm(uka.a);
        cla.setTitle(qba.c);
        cla.setLeftActions(new kka(new jy2(16, this)));
        RecyclerView recyclerView = new RecyclerView(getContext(), (AttributeSet) null);
        recyclerView.setId(oba.m);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.setItemAnimator((mdc) null);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.X);
        this.o.i(recyclerView);
        recyclerView.j(new kq(6));
        recyclerView.j(new nz7(2));
        recyclerView.j(new bw5((Context) xv5.a.getAccessor().c(Context.class)));
        recyclerView.j(new bw5(qp4.u0.j(recyclerView)));
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setId(oba.n);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        linearLayout.addView(cla);
        linearLayout.addView(recyclerView);
        v3c.y(new o(3, (Continuation) null, 4), linearLayout);
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.o.i((RecyclerView) null);
    }

    public final void onViewCreated(View view) {
        s35 s35 = m0().Z;
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(s35, getViewLifecycleOwner().Q(), fg7), new cw5((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(m0().Y, getViewLifecycleOwner().Q(), fg7), new dw5((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final void y(int i, Bundle bundle) {
        w9f w9f;
        at5 at5;
        CharSequence charSequence;
        at5 at52;
        String str;
        if (i == oba.j) {
            iw5 m0 = m0();
            w9f w9f2 = m0.t0;
            if (w9f2 != null && (at52 = w9f2.a) != null && (str = at52.a) != null) {
                bv5.c.getClass();
                pnf.o(m0.Z, new c64(":settings/folder/edit?id=".concat(str)));
            }
        } else if (i == oba.k && (w9f = m0().t0) != null && (at5 = w9f.a) != null && (charSequence = at5.b) != null) {
            nd7.S(charSequence, this);
        }
    }
}
