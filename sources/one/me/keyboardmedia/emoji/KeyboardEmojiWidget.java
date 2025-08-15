package one.me.keyboardmedia.emoji;

import android.os.Bundle;
import android.os.Parcelable;
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

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/keyboardmedia/emoji/KeyboardEmojiWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "scopeId", "(Ljava/lang/String;Lz84;)V", "keyboard-media_release"}, k = 1, mv = {2, 0, 0})
public final class KeyboardEmojiWidget extends Widget {
    public static final /* synthetic */ bc7[] s0;
    public final jv5 X;
    public final ly4 Y;
    public final g02 Z;
    public final je7 a;
    public final je7 b;
    public final q7c c;
    public final q7c o;

    static {
        Class<KeyboardEmojiWidget> cls = KeyboardEmojiWidget.class;
        s0 = new bc7[]{new hob(cls, "contentRecyclerView", "getContentRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), zr6.e(nec.a, cls, "tabsRecyclerView", "getTabsRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    }

    public KeyboardEmojiWidget(String str, z84 z84) {
        this(dy7.g(new kpa(Widget.ARG_SCOPE_ID, new suc(str))));
    }

    public final RecyclerView m0() {
        return (RecyclerView) this.c.T0(this, s0[0]);
    }

    public final RecyclerView n0() {
        return (RecyclerView) this.o.T0(this, s0[1]);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(jca.b);
        int G = tu0.G(((float) 44) * fk4.d().getDisplayMetrics().density);
        RecyclerView recyclerView = new RecyclerView(frameLayout.getContext(), (AttributeSet) null);
        recyclerView.setId(jca.d);
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, G));
        int G2 = tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density);
        int G3 = tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density);
        recyclerView.setPadding(G3, G2, G3, G2);
        recyclerView.setClipToPadding(false);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setNestedScrollingEnabled(false);
        v3c.y(new nc7(3, (Continuation) null, 0), recyclerView);
        frameLayout.addView(recyclerView);
        RecyclerView recyclerView2 = new RecyclerView(frameLayout.getContext(), (AttributeSet) null);
        recyclerView2.setId(jca.c);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = G;
        recyclerView2.setLayoutParams(layoutParams);
        v3c.y(new nc7(3, (Continuation) null, 1), recyclerView2);
        recyclerView2.setClipToPadding(false);
        recyclerView2.setClipChildren(false);
        recyclerView2.setItemAnimator((mdc) null);
        int G4 = tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
        recyclerView2.setPadding(G4, recyclerView2.getPaddingTop(), G4, tu0.G(((float) 48) * fk4.d().getDisplayMetrics().density));
        frameLayout.addView(recyclerView2);
        return frameLayout;
    }

    public final void onDestroyView(View view) {
        m0().setAdapter((hdc) null);
        m0().s0(this.Z);
        n0().setAdapter((hdc) null);
    }

    public final void onViewCreated(View view) {
        n0().setAdapter(this.Y);
        n0().j(new d71(tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density), 3));
        RecyclerView m0 = m0();
        int G = tu0.G(((float) 32) * fk4.d().getDisplayMetrics().density);
        int G2 = tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
        int G3 = tu0.G(((float) 11) * fk4.d().getDisplayMetrics().density);
        int i = (m0.getContext().getResources().getDisplayMetrics().widthPixels - (G2 * 2)) / (G + G3);
        if (i < 1) {
            i = 1;
        }
        mc7 mc7 = new mc7(this, m0);
        m0.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(i);
        gridLayoutManager.K = mc7;
        m0.setLayoutManager(gridLayoutManager);
        m0.m(this.Z);
        m0.j(new ry0(i, G3, 1));
        m0.setAdapter(this.X);
        od2.L(new zn5(((az4) this.a.getValue()).Z, new oc7(this, (Continuation) null), 5), getViewLifecycleScope());
    }

    public KeyboardEmojiWidget(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        je7 createViewModelLazy = createViewModelLazy(az4.class, new nj4(14, new m57(7)));
        this.a = createViewModelLazy;
        Class<suc> cls = suc.class;
        Object v = ay7.v(bundle, Widget.ARG_SCOPE_ID, cls);
        if (v != null) {
            this.b = m82getSharedViewModelcp94BC8(((suc) ((Parcelable) v)).a, cc8.class, (k56) null);
            this.c = viewBinding(jca.c);
            this.o = viewBinding(jca.d);
            kc7 kc7 = kc7.a;
            Class<iba> cls2 = iba.class;
            jv5 jv5 = new jv5(((iba) kc7.getAccessor().c(cls2)).a(), (Object) new bkg(15, this), 5);
            this.X = jv5;
            this.Y = new ly4(((iba) kc7.getAccessor().c(cls2)).a(), new jy2(23, this));
            this.Z = new g02(jv5, new f(1, (az4) createViewModelLazy.getValue(), az4.class, "onNewItemInFocus", "onNewItemInFocus(Lone/me/sdk/lists/adapter/ListItem;)V", 0, 28));
            od2.L(new zn5(((az4) createViewModelLazy.getValue()).u0, new lc7(this, (Continuation) null), 5), getLifecycleScope());
            return;
        }
        throw new IllegalArgumentException(zr6.i("No value passed for key arg_key_scope_id of type ", cls.getSimpleName(), " in bundle").toString());
    }
}
