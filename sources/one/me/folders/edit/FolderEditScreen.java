package one.me.folders.edit;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bB\t\b\u0016¢\u0006\u0004\b\u0007\u0010\f¨\u0006\r"}, d2 = {"Lone/me/folders/edit/FolderEditScreen;", "Lone/me/sdk/arch/Widget;", "Lng3;", "Ljt5;", "Ldv5;", "", "folderId", "<init>", "(Ljava/lang/String;)V", "", "serverChatId", "(J)V", "()V", "folders_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class FolderEditScreen extends Widget implements ng3, jt5, dv5 {
    public static final /* synthetic */ bc7[] s0;
    public final kt5 X;
    public final q7c Y;
    public final q7c Z;
    public final x27 a;
    public final fs b;
    public final fs c;
    public final je7 o;

    static {
        Class<FolderEditScreen> cls = FolderEditScreen.class;
        hob hob = new hob(cls, "folderId", "getFolderId()Ljava/lang/String;", 0);
        oec oec = nec.a;
        s0 = new bc7[]{hob, zr6.e(oec, cls, "serverChatId", "getServerChatId()J", 0), zr6.f(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0, oec), zr6.f(cls, "createButton", "getCreateButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0, oec)};
    }

    public FolderEditScreen(String str) {
        this(dy7.g(new kpa("key_folder_id", str)));
    }

    public static final cla m0(FolderEditScreen folderEditScreen) {
        folderEditScreen.getClass();
        return (cla) folderEditScreen.Y.T0(folderEditScreen, s0[2]);
    }

    public final x27 getInsetsConfig() {
        return this.a;
    }

    public final void h(int i, Bundle bundle) {
        nu5 n0 = n0();
        n0.getClass();
        if (i == oba.d) {
            n0.u();
        } else if (i == oba.c && n0.b != null) {
            pnf.n(n0, ((w9a) n0.o).b(), (vx3) null, new hu5(n0, (Continuation) null), 2);
        }
    }

    public final nu5 n0() {
        return (nu5) this.o.getValue();
    }

    public final void o0() {
        int i = vc7.a;
        if (vc7.b(vc7.c)) {
            mr0.G(this);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        cla cla = new cla(getContext(), 6);
        cla.setId(oba.g);
        cla.setForm(uka.a);
        cla.setLeftActions(new kka(new ut5(this, 0)));
        RecyclerView recyclerView = new RecyclerView(getContext(), (AttributeSet) null);
        recyclerView.setId(oba.e);
        recyclerView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setClipToPadding(false);
        recyclerView.setClipChildren(false);
        recyclerView.setAdapter(this.X);
        recyclerView.setItemAnimator((mdc) null);
        q64 q64 = new q64(29, (Object) this);
        recyclerView.j(new q1d(qp4.u0.j(recyclerView), q64, (l) null, 12));
        recyclerView.j(new rt5(q64));
        OneMeButton oneMeButton = new OneMeButton(getContext(), (AttributeSet) null);
        oneMeButton.setId(oba.d);
        oneMeButton.setEnabled(false);
        oneMeButton.setAppearance(z6a.o);
        oneMeButton.setSize(c7a.c);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setText(qba.h);
        tu0.K(oneMeButton, 300, new c5(28, (Object) this));
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        constraintLayout.setId(oba.f);
        ti3 ti3 = new ti3(0, -2);
        ti3.i = 0;
        ti3.e = 0;
        ti3.h = 0;
        constraintLayout.addView(cla, ti3);
        ti3 ti32 = new ti3(0, 0);
        ti32.j = cla.getId();
        ti32.e = 0;
        ti32.h = 0;
        ti32.l = 0;
        constraintLayout.addView(recyclerView, ti32);
        ti3 ti33 = new ti3(0, -2);
        ti33.e = 0;
        ti33.h = 0;
        ti33.l = 0;
        float f = (float) 12;
        ti33.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), 0, tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        constraintLayout.addView(oneMeButton, ti33);
        v3c.y(new br(3, (Continuation) null, 7), constraintLayout);
        return constraintLayout;
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        od2.L(new zn5(n0().x0, new vt5(this, (Continuation) null), 5), getViewLifecycleScope());
        od2.L(new zn5(n0().u0, new wt5(this, (Continuation) null), 5), getViewLifecycleScope());
    }

    public FolderEditScreen(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        this.a = x27.d;
        this.b = new fs(String.class, "key_folder_id");
        this.c = new fs(Long.class, 0L, "key_server_chat_id");
        this.o = createViewModelLazy(nu5.class, new nj4(4, new es3(17, this)));
        kt5 kt5 = new kt5(((iba) xv5.a.getAccessor().c(iba.class)).a(), this);
        this.X = kt5;
        this.Y = viewBinding(oba.g);
        this.Z = viewBinding(oba.d);
        od2.L(new zn5(n0().w0, new lq0(2, kt5, kt5.class, "submitList", "submitList(Ljava/util/List;)V", 4, 17), 5), getLifecycleScope());
    }

    public FolderEditScreen(long j) {
        this(dy7.g(new kpa("key_server_chat_id", Long.valueOf(j))));
    }

    public FolderEditScreen() {
        this((Bundle) null);
    }
}
