package one.me.settings.privacy.ui;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/settings/privacy/ui/SettingsPrivacyScreen;", "Lone/me/sdk/arch/Widget;", "Lng3;", "Lj25;", "<init>", "()V", "settings-privacy_release"}, k = 1, mv = {2, 0, 0})
public final class SettingsPrivacyScreen extends Widget implements ng3, j25 {
    public static final /* synthetic */ bc7[] Z;
    public static final String s0 = "settings-privacy";
    public final q7c X = viewBinding(iha.t);
    public final chd Y;
    public final glc a = new glc(wuc.SETTINGS_PRIVACY);
    public final x27 b = x27.d;
    public final je7 c = createViewModelLazy(cid.class, new nhd(0, new jhd(this, 0)));
    public final String o = s0;

    static {
        hob hob = new hob(SettingsPrivacyScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0);
        nec.a.getClass();
        Z = new bc7[]{hob};
    }

    public SettingsPrivacyScreen() {
        super((Bundle) null, 0, 3, (z84) null);
        chd chd = new chd(new qqd(23, (Object) this), ((iba) ehd.a.getAccessor().c(iba.class)).a());
        this.Y = chd;
        od2.L(new zn5(m0().A0, new shb(2, chd, chd.class, "submitList", "submitList(Ljava/util/List;)V", 4, 4), 5), getLifecycleScope());
    }

    public final x27 getInsetsConfig() {
        return this.b;
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m87getScopeIdIluPPks() {
        return this.o;
    }

    public final bvc getScreenDelegate() {
        return this.a;
    }

    public final void h(int i, Bundle bundle) {
        cid m0 = m0();
        m0.getClass();
        int i2 = iha.l;
        w4d w4d = m0.B0;
        if (i == i2) {
            w4d.o1(m0, cid.O0[0], pnf.n(m0, (lx3) null, (vx3) null, new vhd(m0, true, (Continuation) null), 3));
        } else if (i == iha.m) {
            if (((jp) m0.s()).g.getBoolean("app.privacy.online.show", true)) {
                m0.w(aed.g);
            }
        } else if (i == iha.o) {
        } else {
            if (i == iha.n) {
                w4d.o1(m0, cid.O0[0], pnf.n(m0, (lx3) null, (vx3) null, new vhd(m0, false, (Continuation) null), 3));
                return;
            }
            int i3 = iha.h;
            w4d w4d2 = m0.C0;
            if (i == i3) {
                w4d2.o1(m0, cid.O0[1], pnf.n(m0, (lx3) null, (vx3) null, new aid(m0, 1, (Continuation) null), 3));
            } else if (i == iha.i) {
                w4d2.o1(m0, cid.O0[1], pnf.n(m0, (lx3) null, (vx3) null, new aid(m0, 3, (Continuation) null), 3));
            } else {
                int i4 = iha.f;
                w4d w4d3 = m0.D0;
                if (i == i4) {
                    w4d3.o1(m0, cid.O0[2], pnf.n(m0, (lx3) null, (vx3) null, new zhd(m0, 1, (Continuation) null), 3));
                } else if (i == iha.g) {
                    w4d3.o1(m0, cid.O0[2], pnf.n(m0, (lx3) null, (vx3) null, new zhd(m0, 3, (Continuation) null), 3));
                } else {
                    int i5 = iha.r;
                    w4d w4d4 = m0.E0;
                    if (i == i5) {
                        w4d4.o1(m0, cid.O0[3], pnf.n(m0, (lx3) null, (vx3) null, new bid(m0, 1, (Continuation) null), 3));
                    } else if (i == iha.s) {
                        w4d4.o1(m0, cid.O0[3], pnf.n(m0, (lx3) null, (vx3) null, new bid(m0, 3, (Continuation) null), 3));
                    } else if (i == iha.k) {
                        if (m0.H0 == null) {
                            String d = ((xie) m0.Z.getValue()).d();
                            List singletonList = (d == null || w9e.C0(d)) ? nz4.a : Collections.singletonList(d);
                            k4a k4a = (k4a) m0.r();
                            m0.H0 = Long.valueOf(k4a.v(k4a, new kc2(1, ((p7b) k4a.y()).a.o(), singletonList)));
                        }
                    } else if (i != iha.j) {
                        int i6 = iha.q;
                        w4d w4d5 = m0.F0;
                        if (i == i6) {
                            w4d5.o1(m0, cid.O0[4], pnf.n(m0, (lx3) null, (vx3) null, new yhd(m0, true, (Continuation) null), 3));
                        } else if (i == iha.p) {
                            w4d5.o1(m0, cid.O0[4], pnf.n(m0, (lx3) null, (vx3) null, new yhd(m0, false, (Continuation) null), 3));
                        }
                    }
                }
            }
        }
    }

    public final cid m0() {
        return (cid) this.c.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        cla cla = new cla(linearLayout.getContext(), 6);
        cla.setId(iha.w);
        cla.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        cla.setTitle(kha.I);
        cla.setForm(uka.a);
        cla.setLeftActions(new kka(new rpc(5, this)));
        linearLayout.addView(cla);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), (AttributeSet) null);
        recyclerView.setId(iha.t);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.Y);
        recyclerView.setItemAnimator((mdc) null);
        recyclerView.j(new q1d(qp4.u0.j(recyclerView), new bqc(9, this), (l) null, 12));
        recyclerView.j(new ry0(5));
        recyclerView.j(new ohd(recyclerView.getContext()));
        linearLayout.addView(recyclerView);
        v3c.y(new o(3, (Continuation) null, 13), linearLayout);
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        ((RecyclerView) this.X.T0(this, Z[0])).setAdapter((hdc) null);
        super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        cid m0 = m0();
        pnf.n(m0, ((w9a) m0.o).a(), (vx3) null, new thd(m0, (Continuation) null), 2);
        v7c v7c = m0().M0;
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(v7c, getViewLifecycleOwner().Q(), fg7), new khd((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(m0().N0, getViewLifecycleOwner().Q(), fg7), new lhd((Continuation) null, this), 5), getViewLifecycleScope());
    }
}
