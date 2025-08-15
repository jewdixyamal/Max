package one.me.folders.pickerfolders;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/folders/pickerfolders/FoldersPickerScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "serverChatId", "(J)V", "folders_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class FoldersPickerScreen extends Widget {
    public static final /* synthetic */ bc7[] s0;
    public final q7c X;
    public final q7c Y;
    public final qm0 Z;
    public final x27 a;
    public final fs b;
    public final je7 c;
    public final jv5 o;

    static {
        Class<FoldersPickerScreen> cls = FoldersPickerScreen.class;
        hob hob = new hob(cls, "serverChatId", "getServerChatId()J", 0);
        oec oec = nec.a;
        s0 = new bc7[]{hob, zr6.e(oec, cls, "foldersRecycler", "getFoldersRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0), zr6.f(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0, oec), zr6.f(cls, "createButton", "getCreateButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0, oec), zr6.f(cls, "emptyView", "getEmptyView()Lone/me/sdk/uikit/common/emptyview/OneMeEmptyView;", 0, oec)};
    }

    public FoldersPickerScreen(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        this.a = x27.d;
        this.b = new fs(Long.class, 0L, "arg_chat_id");
        this.c = createViewModelLazy(yw5.class, new nj4(6, new mw5(this, 0)));
        this.o = new jv5(((iba) xv5.a.getAccessor().c(iba.class)).a(), (Object) new f(1, this, FoldersPickerScreen.class, "onFolderClick", "onFolderClick(Lone/me/folders/list/adapter/UserFolderListItem;)V", 0, 23), 6);
        this.X = viewBinding(oba.m);
        viewBinding(oba.o);
        this.Y = viewBinding(oba.d);
        this.Z = binding(new mw5(this, 1));
    }

    public final x27 getInsetsConfig() {
        return this.a;
    }

    public final yw5 m0() {
        return (yw5) this.c.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        cla cla = new cla(getContext(), 6);
        cla.setId(oba.o);
        cla.setForm(uka.a);
        cla.setTitle(qba.q);
        cla.setLeftActions(new kka(new nw5(this, 0)));
        OneMeButton oneMeButton = new OneMeButton(getContext(), (AttributeSet) null);
        oneMeButton.setId(oba.d);
        oneMeButton.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
        oneMeButton.setEnabled(false);
        oneMeButton.setAppearance(z6a.o);
        oneMeButton.setSize(c7a.c);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setText(qba.h);
        tu0.K(oneMeButton, 300, new ow5(this, 0));
        RecyclerView recyclerView = new RecyclerView(getContext(), (AttributeSet) null);
        recyclerView.setId(oba.m);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.setItemAnimator((mdc) null);
        recyclerView.setClipChildren(false);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.o);
        float f = (float) 6;
        recyclerView.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), recyclerView.getPaddingTop(), tu0.G(f * fk4.d().getDisplayMetrics().density), recyclerView.getPaddingBottom());
        nw5 nw5 = new nw5(this, 1);
        recyclerView.j(new c03(new pw5(recyclerView, 0), new nw5(this, 2), nw5, nw5));
        recyclerView.l(new w54(recyclerView));
        recyclerView.j(new kq(7));
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        constraintLayout.setId(oba.n);
        ti3 ti3 = new ti3(0, -2);
        ti3.i = 0;
        ti3.e = 0;
        ti3.h = 0;
        constraintLayout.addView(cla, ti3);
        ti3 ti32 = new ti3(0, 0);
        ti32.j = cla.getId();
        ti32.e = 0;
        ti32.h = 0;
        ti32.k = oneMeButton.getId();
        constraintLayout.addView(recyclerView, ti32);
        ti3 ti33 = new ti3(0, -2);
        ti33.e = 0;
        ti33.h = 0;
        ti33.l = 0;
        float f2 = (float) 12;
        ti33.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f2), 0, tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        constraintLayout.addView(oneMeButton, ti33);
        v3c.y(new xh0(3, (Continuation) null, 13), constraintLayout);
        return constraintLayout;
    }

    public final void onViewCreated(View view) {
        w7c w7c = m0().t0;
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(w7c, getViewLifecycleOwner().Q(), fg7), new rw5((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(m0().y0, getViewLifecycleOwner().Q(), fg7), new sw5((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(m0().v0, getViewLifecycleOwner().Q(), fg7), new tw5((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public FoldersPickerScreen(long j) {
        this(dy7.g(new kpa("arg_chat_id", Long.valueOf(j))));
    }
}
