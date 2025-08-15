package one.me.calllist.ui;

import android.animation.StateListAnimator;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lone/me/calllist/ui/CallHistoryScreen;", "Lone/me/sdk/arch/Widget;", "Lng3;", "<init>", "()V", "call-list_release"}, k = 1, mv = {2, 0, 0})
public final class CallHistoryScreen extends Widget implements ng3 {
    public static final /* synthetic */ bc7[] C0;
    public static final int[] D0 = {-11664148, -7436801};
    public final x27 A0;
    public final String B0;
    public final q7c X = viewBinding(r7a.i);
    public final q7c Y = viewBinding(r7a.k);
    public final q7c Z = viewBinding(pvb.call_history_tabs);
    public final je7 a = iyc.l;
    public final je7 b = fua.a.b();
    public final je7 c = createViewModelLazy(u81.class, new s(12, new o81(this, 1)));
    public final je7 o = tu0.r(3, new o81(this, 2));
    public final q7c s0 = viewBinding(pvb.call_history_pager);
    public final q7c t0 = viewBinding(r7a.j);
    public final q7c u0 = viewBinding(r7a.h);
    public final q7c v0 = viewBinding(r7a.g);
    public final q7c w0 = viewBinding(pvb.call_history_empty);
    public final y8 x0;
    public final f81 y0;
    public xu3 z0;

    static {
        Class<CallHistoryScreen> cls = CallHistoryScreen.class;
        hob hob = new hob(cls, "container", "getContainer()Landroidx/coordinatorlayout/widget/CoordinatorLayout;", 0);
        oec oec = nec.a;
        C0 = new bc7[]{hob, zr6.e(oec, cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), zr6.f(cls, "callTabLayout", "getCallTabLayout()Lone/me/common/tablayout/OneMeTabLayout;", 0, oec), zr6.f(cls, "callHistoryPager", "getCallHistoryPager()Landroidx/viewpager2/widget/ViewPager2;", 0, oec), zr6.f(cls, "createGroupCallButton", "getCreateGroupCallButton()Lone/me/calllist/view/CallActionItemView;", 0, oec), zr6.f(cls, "callToContactButton", "getCallToContactButton()Lone/me/calllist/view/CallActionItemView;", 0, oec), zr6.f(cls, "micPermissionBanner", "getMicPermissionBanner()Lone/me/sdk/uikit/common/banner/OneMeCompactBannerView;", 0, oec), zr6.f(cls, "callEmptyHistoryView", "getCallEmptyHistoryView()Lone/me/sdk/uikit/common/emptyview/OneMeEmptyView;", 0, oec)};
    }

    /* JADX WARNING: type inference failed for: r0v25, types: [java.lang.Object, y8] */
    public CallHistoryScreen() {
        super((Bundle) null, 0, 3, (z84) null);
        ? obj = new Object();
        obj.a = nz4.a;
        this.x0 = obj;
        this.y0 = new f81(this);
        this.A0 = x27.d;
        this.B0 = "call_history_scope_id";
    }

    public final x27 getInsetsConfig() {
        return this.A0;
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m43getScopeIdIluPPks() {
        return this.B0;
    }

    public final void h(int i, Bundle bundle) {
        ((rg1) this.o.getValue()).g(i);
    }

    public final ViewPager2 m0() {
        return (ViewPager2) this.s0.T0(this, C0[3]);
    }

    public final u81 n0() {
        return (u81) this.c.getValue();
    }

    public final void onAttach(View view) {
        Object value;
        super.onAttach(view);
        u81 n0 = n0();
        q0e q0e = n0.t0;
        do {
            value = q0e.getValue();
        } while (!q0e.c(value, ls1.a((ls1) value, (List) null, false, !((eua) n0.X.getValue()).b(eua.h), 3)));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        cla cla = new cla(linearLayout.getContext(), 6);
        cla.setId(r7a.k);
        cla.setForm(uka.b);
        cla.setTitle(c0c.call_history_call_title);
        cla.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        linearLayout.addView(cla);
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(linearLayout.getContext(), (AttributeSet) null);
        coordinatorLayout.setId(r7a.i);
        coordinatorLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        fm fmVar = new fm(coordinatorLayout.getContext());
        fmVar.setElevation(fk4.d().getDisplayMetrics().density * 0.0f);
        fmVar.setLayoutParams(new rw3(-1, -2));
        fmVar.setBackground((Drawable) null);
        w53 w53 = new w53(fmVar.getContext());
        w53.setTitleEnabled(false);
        dm dmVar = new dm(-1, -2);
        dmVar.a = 3;
        w53.setLayoutParams(dmVar);
        LinearLayout linearLayout2 = new LinearLayout(w53.getContext());
        linearLayout2.setOrientation(1);
        x8a x8a = new x8a(linearLayout2.getContext(), (AttributeSet) null);
        x8a.setId(r7a.g);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f = (float) 12;
        layoutParams.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f));
        layoutParams.setMarginEnd(tu0.G(fk4.d().getDisplayMetrics().density * f));
        layoutParams.bottomMargin = tu0.G(f * fk4.d().getDisplayMetrics().density);
        x8a.setLayoutParams(layoutParams);
        x8a.setTitle(x8a.getContext().getString(t7a.d));
        x8a.setSubtitle(x8a.getContext().getString(t7a.c));
        float f2 = (float) 24;
        x8a.x(kt3.b(x8a.getContext(), woc.X0), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        x8a.R0.setColors(D0, new float[]{0.0f, 1.0f});
        tu0.K(x8a, 300, new n81(this, 1));
        linearLayout2.addView(x8a);
        qy0 qy0 = new qy0(linearLayout2.getContext(), (AttributeSet) null);
        float f3 = (float) 16;
        float f4 = (float) 0;
        qy0.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(fk4.d().getDisplayMetrics().density * f4), tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(fk4.d().getDisplayMetrics().density * f4));
        qy0.setId(r7a.h);
        qy0.setActionIcon(q7a.b);
        qy0.setActionText(c0c.call_history_call_contact_action);
        tu0.K(qy0, 300, new y20(2));
        float f5 = (float) 52;
        qy0.setLayoutParams(new LinearLayout.LayoutParams(-1, tu0.G(fk4.d().getDisplayMetrics().density * f5)));
        linearLayout2.addView(qy0);
        qy0 qy02 = new qy0(linearLayout2.getContext(), (AttributeSet) null);
        qy02.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(fk4.d().getDisplayMetrics().density * f4), tu0.G(f3 * fk4.d().getDisplayMetrics().density), tu0.G(f4 * fk4.d().getDisplayMetrics().density));
        qy02.setId(r7a.j);
        qy02.setActionIcon(q7a.f);
        qy02.setActionText(c0c.call_history_call_create_group_call_by_link);
        tu0.K(qy02, 300, new n81(this, 0));
        qy02.setVisibility(8);
        qy02.setLayoutParams(new LinearLayout.LayoutParams(-1, tu0.G(f5 * fk4.d().getDisplayMetrics().density)));
        linearLayout2.addView(qy02);
        linearLayout2.setLayoutParams(new t53(-1, -2));
        w53.addView(linearLayout2);
        fmVar.addView(w53);
        wja wja = new wja(fmVar.getContext(), (AttributeSet) null);
        wja.setId(pvb.call_history_tabs);
        wja.setTabMode(0);
        wja.setLayoutParams(new dm(-1, -2));
        fmVar.addView(wja);
        fmVar.setStateListAnimator((StateListAnimator) null);
        coordinatorLayout.addView(fmVar);
        ViewPager2 viewPager2 = new ViewPager2(coordinatorLayout.getContext());
        viewPager2.setId(pvb.call_history_pager);
        rw3 rw3 = new rw3(-1, -1);
        rw3.b(new AppBarLayout$ScrollingViewBehavior());
        viewPager2.setLayoutParams(rw3);
        fm9.z(viewPager2);
        coordinatorLayout.addView(viewPager2);
        linearLayout.addView(coordinatorLayout);
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        q0e q0e;
        Object value;
        super.onDestroyView(view);
        if (!requireActivity().isChangingConfigurations()) {
            m0().setAdapter((hdc) null);
            u81 n0 = n0();
            do {
                q0e = n0.Z;
                value = q0e.getValue();
                s81 s81 = (s81) value;
            } while (!q0e.c(value, new s81()));
        }
        xu3 xu3 = this.z0;
        if (xu3 != null) {
            xu3.c();
        }
        this.z0 = null;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (!((rg1) this.o.getValue()).b(i, strArr, iArr)) {
            if (i != 160 || !((eua) this.b.getValue()).b(strArr)) {
                for (int i2 : iArr) {
                    if (i2 == -1) {
                        new l5g(this, 0).g(t7a.b, t7a.a);
                        return;
                    }
                }
                return;
            }
            ((x8a) this.v0.T0(this, C0[6])).setVisibility(8);
        }
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        q0e q0e = n0().u0;
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(q0e, getViewLifecycleOwner().Q(), fg7), new p81((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(n0().s0, getViewLifecycleOwner().Q(), fg7), new q81((Continuation) null, this), 5), getViewLifecycleScope());
        m0().setAdapter(this.y0);
        m0().setOffscreenPageLimit(1);
        wja wja = (wja) this.Z.T0(this, C0[2]);
        ViewPager2 m0 = m0();
        y8 y8Var = this.x0;
        y8Var.getClass();
        xu3 xu3 = new xu3(wja, m0, new f9(y8Var, 7, wja));
        xu3.a();
        this.z0 = xu3;
    }
}
