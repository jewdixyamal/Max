package one.me.stickerssettings;

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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/stickerssettings/StickersSettingsScreen;", "Lone/me/sdk/arch/Widget;", "Lxt3;", "Lng3;", "<init>", "()V", "stickers-settings_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class StickersSettingsScreen extends Widget implements xt3, ng3 {
    public static final /* synthetic */ bc7[] Y;
    public final j6e X = new j6e(((iba) k6e.a.getAccessor().c(iba.class)).a(), new m6e(this, 2), new m6e(this, 3), new m6e(this, 4));
    public final glc a = new glc(new xid(15), (k56) null, 6);
    public final je7 b = createViewModelLazy(w6e.class, new nhd(10, new xid(16)));
    public final q7c c = viewBinding(gja.f);
    public f77 o;

    static {
        hob hob = new hob(StickersSettingsScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0);
        nec.a.getClass();
        Y = new bc7[]{hob};
    }

    public StickersSettingsScreen() {
        super((Bundle) null, 0, 3, (z84) null);
        od2.L(new zn5(m0().Y, new n6e((Continuation) null, this), 5), getLifecycleScope());
    }

    public final x27 getInsetsConfig() {
        x27 x27 = x27.c;
        return x27.d;
    }

    public final bvc getScreenDelegate() {
        return this.a;
    }

    public final void h(int i, Bundle bundle) {
        w6e m0 = m0();
        Long l = m0.y0;
        if (l != null) {
            long longValue = l.longValue();
            m0.y0 = null;
            if (i == gja.b) {
                vxd S = j47.S(m0.a, ((w9a) m0.c).b(), vx3.b, new t6e(m0, longValue, (Continuation) null));
                m0.A0.o1(m0, w6e.B0[2], S);
            }
        }
    }

    public final w6e m0() {
        return (w6e) this.b.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        cla cla = new cla(linearLayout.getContext(), 6);
        cla.setId(gja.x);
        cla.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        cla.setTitle(hja.G);
        cla.setForm(uka.a);
        cla.setLeftActions(new kka(new m6e(this, 0)));
        linearLayout.addView(cla);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), (AttributeSet) null);
        recyclerView.setId(gja.f);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.X);
        bqc bqc = new bqc(18, this);
        pq9 pq9 = qp4.u0;
        recyclerView.j(new q1d(pq9.j(recyclerView), bqc, (l) null, 12));
        recyclerView.j(new jn3(pq9.j(recyclerView)));
        recyclerView.j(new ry0(6));
        f77 f77 = new f77(new z67(new bk(19, this), new m6e(this, 1)));
        this.o = f77;
        f77.i(recyclerView);
        linearLayout.addView(recyclerView);
        v3c.y(new o(3, (Continuation) null, 15), linearLayout);
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        ((RecyclerView) this.c.T0(this, Y[0])).setAdapter((hdc) null);
        f77 f77 = this.o;
        if (f77 != null) {
            f77.i((RecyclerView) null);
        }
        this.o = null;
        super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        s35 s35 = m0().Z;
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(s35, getViewLifecycleOwner().Q(), fg7), new o6e((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(m0().s0, getViewLifecycleOwner().Q(), fg7), new p6e((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final void y(int i, Bundle bundle) {
        w6e m0 = m0();
        Long l = m0.x0;
        if (l != null) {
            long longValue = l.longValue();
            m0.x0 = null;
            vxd S = j47.S(m0.a, ((w9a) m0.c).a(), vx3.b, new v6e(m0, longValue, i, (Continuation) null));
            m0.z0.o1(m0, w6e.B0[1], S);
        }
    }
}
