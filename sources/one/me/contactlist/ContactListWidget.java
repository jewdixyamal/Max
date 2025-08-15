package one.me.contactlist;

import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\bB\u0013\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000f¨\u0006\u0010"}, d2 = {"Lone/me/contactlist/ContactListWidget;", "Lone/me/sdk/arch/Widget;", "Lvm9;", "Lfn3;", "Lqd6;", "Lwq3;", "Lnr3;", "Lxt3;", "Lng3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Luo3;", "type", "(Luo3;)V", "contact-list_release"}, k = 1, mv = {2, 0, 0})
public final class ContactListWidget extends Widget implements vm9, fn3, qd6, wq3, nr3, xt3, ng3 {
    public static final /* synthetic */ bc7[] P0;
    public final je7 A0;
    public final qm0 B0;
    public final q7c C0;
    public final je7 D0;
    public final List E0;
    public final je7 F0;
    public final je7 G0;
    public final khe H0;
    public final w4d I0;
    public final fs J0;
    public final fs K0;
    public final fs L0;
    public final fs M0;
    public final fs N0;
    public final glc O0;
    public final ExecutorService X;
    public final a3g Y;
    public final a3g Z;
    public final x27 a;
    public final je7 b;
    public final je7 c;
    public final je7 o;
    public final a3g s0;
    public final jv5 t0;
    public final a3g u0;
    public final nd3 v0;
    public final je7 w0;
    public final qm0 x0;
    public final je7 y0;
    public final je7 z0;

    static {
        Class<ContactListWidget> cls = ContactListWidget.class;
        P0 = new bc7[]{new hob(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), z7b.g(nec.a, cls, "snackBar", "getSnackBar()Lone/me/sdk/snackbar/OneMeSnackbar;", 0), new hob(cls, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), new oi9(cls, "contextMenuJob", "getContextMenuJob()Lkotlinx/coroutines/Job;"), new oi9(cls, "selectedContactIdForAction", "getSelectedContactIdForAction()Ljava/lang/Long;"), new oi9(cls, "searchQuery", "getSearchQuery()Ljava/lang/CharSequence;"), new oi9(cls, "isInSearch", "isInSearch()Z"), new oi9(cls, "isNeedScrollToTop", "isNeedScrollToTop()Z"), new oi9(cls, "isPermissionChecked", "isPermissionChecked()Z")};
    }

    public ContactListWidget() {
        this((Bundle) null, 1, (z84) null);
    }

    public final void J(rd6 rd6) {
        mr0.G(this);
        j47.T(getViewLifecycleScope(), (lx3) null, (vx3) null, new xo3(this, rd6, (Continuation) null), 3);
    }

    public final void M(rd6 rd6, boolean z) {
        ((bt1) this.c.getValue()).e(zs1.CALL_CONTACT, z);
        j47.T(getViewLifecycleScope(), (lx3) null, (vx3) null, new wo3(this, rd6, z, (Continuation) null), 3);
    }

    public final void N() {
        bc7 bc7 = P0[1];
        wha wha = (wha) this.B0.getValue();
        wha.h(getContext().getString(a9a.s));
        wha.i();
    }

    public final void Q() {
        r0();
    }

    public final void d(long j) {
        Object obj;
        List list = ((dn3) p0().z0.a.getValue()).c;
        pua pua = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((nn3) obj).a == j) {
                    break;
                }
            }
            nn3 nn3 = (nn3) obj;
            if (nn3 != null) {
                pua = nn3.w0;
            }
        }
        if (pua != null) {
            p0().r();
        }
    }

    public final void f(long j, boolean z) {
        ((bt1) this.c.getValue()).e(zs1.CALL_CONTACT, z);
        mr0.G(this);
        ((rg1) this.D0.getValue()).l(j, z, new ro3(j, z));
    }

    public final x27 getInsetsConfig() {
        return this.a;
    }

    public final bvc getScreenDelegate() {
        return this.O0;
    }

    public final void h(int i, Bundle bundle) {
        if (!((rg1) this.D0.getValue()).g(i) && bundle != null) {
            p0().q(i, bundle.getLong("selected.contactId.Action"));
        }
    }

    public final void k(long j, View view) {
        int ordinal = p0().b.ordinal();
        if (ordinal == 0) {
            return;
        }
        if (ordinal == 1) {
            vxd T = j47.T(getViewLifecycleScope(), (lx3) null, vx3.b, new bp3(this, j, view, (Continuation) null), 1);
            this.I0.o1(this, P0[3], T);
            return;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final eua m0() {
        return (eua) this.F0.getValue();
    }

    public final CharSequence n0() {
        bc7 bc7 = P0[5];
        return (CharSequence) this.K0.a(this);
    }

    public final wuc o() {
        return q0() ? wuc.CONTACTS_SEARCH : wuc.CONTACTS_TAB;
    }

    public final cla o0() {
        bc7 bc7 = P0[0];
        return (cla) this.x0.getValue();
    }

    public final void onAttach(View view) {
        super.onAttach(view);
        bc7[] bc7Arr = P0;
        bc7 bc7 = bc7Arr[8];
        fs fsVar = this.N0;
        if (!((Boolean) fsVar.a(this)).booleanValue()) {
            bc7 bc72 = bc7Arr[8];
            fsVar.b(this, Boolean.TRUE);
            boolean b2 = m0().b(eua.f);
            je7 je7 = this.G0;
            if (!b2) {
                ((hyc) ((q33) je7.getValue())).j("app.writeConctatsRequested", true);
                m0().e(new l5g(this, 1));
                return;
            }
            eua m0 = m0();
            String[] strArr = eua.g;
            if (!m0.b(strArr)) {
                hyc hyc = (hyc) ((q33) je7.getValue());
                hyc.getClass();
                if (!((t33) hyc).g.getBoolean("app.writeConctatsRequested", false)) {
                    ((hyc) ((q33) je7.getValue())).j("app.writeConctatsRequested", true);
                    m0().f(new l5g(this, 1), strArr, 156);
                }
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        constraintLayout.setId(z8a.n);
        cla o0 = o0();
        ti3 ti3 = new ti3(-1, -2);
        ti3.i = 0;
        ti3.e = 0;
        ti3.h = 0;
        constraintLayout.addView(o0, ti3);
        aba aba = new aba(constraintLayout.getContext(), (AttributeSet) null);
        aba.setIcon(woc.l0);
        aba.setTitle(new eqe(a9a.n));
        aba.setSubtitle(new eqe(a9a.m));
        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(constraintLayout.getContext(), (AttributeSet) null, 6);
        endlessRecyclerView2.setId(wvb.oneme_contactlist_rv);
        endlessRecyclerView2.setItemAnimator((mdc) null);
        nd3 nd3 = this.v0;
        endlessRecyclerView2.setAdapter(nd3);
        endlessRecyclerView2.getContext();
        endlessRecyclerView2.setLayoutManager(new LinearLayoutManager(1, false));
        endlessRecyclerView2.setClipToPadding(false);
        endlessRecyclerView2.setEmptyView(aba);
        em2 em2 = new em2(4, new qo3(this, 0));
        h8e h8e = new h8e(endlessRecyclerView2, nd3, em2);
        endlessRecyclerView2.j(h8e);
        endlessRecyclerView2.j(new jn3(em2, qp4.u0.j(endlessRecyclerView2), (in3) new v02(21, this)));
        h8e h8e2 = new h8e(endlessRecyclerView2, nd3, new em2(2, new ga(this, 11, endlessRecyclerView2)));
        endlessRecyclerView2.j(h8e2);
        v3c.y(new c3(h8e, h8e2, (Continuation) null, 8), endlessRecyclerView2);
        ti3 ti32 = new ti3(-1, 0);
        ti32.j = o0().getId();
        ti32.e = 0;
        ti32.h = 0;
        ti32.l = 0;
        constraintLayout.addView(endlessRecyclerView2, ti32);
        ti3 ti33 = new ti3(-1, 0);
        ti33.j = o0().getId();
        ti33.e = 0;
        ti33.h = 0;
        ti33.l = 0;
        constraintLayout.addView(aba, ti33);
        return constraintLayout;
    }

    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        ((EndlessRecyclerView2) this.C0.T0(this, P0[2])).setAdapter((hdc) null);
        ((yo3) this.y0.getValue()).e();
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!((rg1) this.D0.getValue()).b(i, strArr, iArr)) {
            if (i == 156) {
                eua m0 = m0();
                l5g l5g = new l5g(this, 1);
                String[] strArr2 = eua.e;
                int i2 = jpc.Q1;
                int i3 = jpc.W1;
                m0.getClass();
                eua.k(l5g, strArr, iArr, strArr2, i2, i3);
            }
            s0();
        }
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        i3a h = getRouter().h();
        if (h != null) {
            h.b((yo3) this.y0.getValue());
        }
        od2.L(new j31(p0().z0, ((bh0) this.A0.getValue()).s0, new c3(this, (Continuation) null, 9), 4), getViewLifecycleScope());
        od2.L(new zn5(p0().F0, new zo3(this, (Continuation) null), 5), getViewLifecycleScope());
        od2.L(new zn5(p0().B0.i, new ap3(this, (Continuation) null), 5), getViewLifecycleScope());
    }

    public final oo3 p0() {
        return (oo3) this.w0.getValue();
    }

    public final boolean q0() {
        bc7 bc7 = P0[6];
        return ((Boolean) this.L0.a(this)).booleanValue();
    }

    public final void r0() {
        m0().f(new l5g(this, 1), eua.e, 156);
    }

    public final void s0() {
        boolean b2 = ((dn3) p0().B0.i.a.getValue()).b();
        jv5 jv5 = this.t0;
        a3g a3g = this.u0;
        if (!b2 || !q0()) {
            CharSequence n0 = n0();
            a3g.E((n0 == null || n0.length() == 0) ? (List) ((bh0) this.A0.getValue()).s0.a.getValue() : nz4.a);
            jv5.E((List) null);
            return;
        }
        boolean b3 = m0().b(eua.f);
        pr3 pr3 = new pr3(woc.J0, a9a.r, b3 ? a9a.q : a9a.p, b3 ? null : Integer.valueOf(a9a.o));
        a3g.E((List) null);
        jv5.E(Collections.singletonList(pr3));
    }

    public final void t() {
        r0();
    }

    public final void v(long j) {
        mr0.G(this);
        p0().q(z8a.i, j);
    }

    public final void w(int i) {
        int s = au1.s(i);
        if (s == 5 || s == 6) {
            m0().f(new l5g(this, 1), eua.h, 160);
        } else {
            r0();
        }
    }

    public final void y(int i, Bundle bundle) {
        bc7[] bc7Arr = P0;
        bc7 bc7 = bc7Arr[4];
        fs fsVar = this.J0;
        Long l = (Long) fsVar.a(this);
        long longValue = l != null ? l.longValue() : 0;
        bc7 bc72 = bc7Arr[4];
        fsVar.b(this, (Object) null);
        p0().q(i, longValue);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ContactListWidget(Bundle bundle, int i, z84 z84) {
        this((i & 1) != 0 ? null : bundle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ContactListWidget(android.os.Bundle r29) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            r3 = 1
            r4 = 4
            r5 = 6
            r6 = 5
            r7 = 3
            r8 = 0
            r9 = 2
            r10 = 0
            r0.<init>(r1, r8, r9, r10)
            x27 r11 = defpackage.x27.d
            r0.a = r11
            hr3 r11 = defpackage.hr3.a
            v4 r12 = r11.getAccessor()
            java.lang.Class<an9> r13 = defpackage.an9.class
            khe r12 = r12.d(r13)
            r0.b = r12
            v4 r12 = r11.getAccessor()
            java.lang.Class<bt1> r13 = defpackage.bt1.class
            khe r12 = r12.d(r13)
            r0.c = r12
            v4 r12 = r11.getAccessor()
            java.lang.Class<l67> r13 = defpackage.l67.class
            khe r12 = r12.d(r13)
            r0.o = r12
            v4 r12 = r11.getAccessor()
            java.lang.Class<iba> r13 = defpackage.iba.class
            java.lang.Object r12 = r12.c(r13)
            iba r12 = (defpackage.iba) r12
            java.util.concurrent.ExecutorService r12 = r12.a()
            r0.X = r12
            a3g r13 = new a3g
            r13.<init>((java.lang.Object) r0, (java.util.concurrent.ExecutorService) r12, (int) r7)
            r0.Y = r13
            a3g r14 = new a3g
            r14.<init>((java.lang.Object) r0, (java.util.concurrent.ExecutorService) r12, (int) r5)
            r0.Z = r14
            a3g r15 = new a3g
            r15.<init>((java.lang.Object) r0, (java.util.concurrent.ExecutorService) r12, (int) r7)
            r0.s0 = r15
            jv5 r10 = new jv5
            r10.<init>((java.lang.Object) r0, (java.util.concurrent.ExecutorService) r12, (int) r4)
            r0.t0 = r10
            a3g r5 = new a3g
            r5.<init>((java.lang.Object) r0, (java.util.concurrent.ExecutorService) r12, (int) r9)
            r0.u0 = r5
            nd3 r12 = new nd3
            md3 r2 = new md3
            r2.<init>((boolean) r8, (int) r3)
            hdc[] r4 = new defpackage.hdc[r6]
            r4[r8] = r5
            r4[r3] = r13
            r4[r9] = r14
            r4[r7] = r15
            r3 = 4
            r4[r3] = r10
            r12.<init>(r2, r4)
            pz4 r2 = new pz4
            po3 r3 = new po3
            r3.<init>(r0, r8)
            r4 = 7
            r2.<init>(r4, r3)
            r12.z(r2)
            r0.v0 = r12
            eh2 r2 = new eh2
            r2.<init>(r1, r9)
            ti2 r3 = new ti2
            r4 = 28
            r3.<init>(r4, r2)
            java.lang.Class<oo3> r2 = defpackage.oo3.class
            je7 r2 = r0.createViewModelLazy(r2, r3)
            r0.w0 = r2
            po3 r2 = new po3
            r2.<init>(r0, r7)
            qm0 r2 = r0.binding(r2)
            r0.x0 = r2
            po3 r2 = new po3
            r3 = 4
            r2.<init>(r0, r3)
            je7 r2 = defpackage.tu0.r(r7, r2)
            r0.y0 = r2
            eh2 r2 = new eh2
            r2.<init>(r1, r7)
            je7 r1 = defpackage.tu0.r(r7, r2)
            r0.z0 = r1
            po3 r1 = new po3
            r1.<init>(r0, r6)
            ti2 r2 = new ti2
            r3 = 29
            r2.<init>(r3, r1)
            java.lang.Class<bh0> r1 = defpackage.bh0.class
            je7 r1 = r0.createViewModelLazy(r1, r2)
            r0.A0 = r1
            po3 r1 = new po3
            r2 = 6
            r1.<init>(r0, r2)
            qm0 r1 = r0.binding(r1)
            r0.B0 = r1
            int r1 = defpackage.wvb.oneme_contactlist_rv
            q7c r1 = r0.viewBinding(r1)
            r0.C0 = r1
            po3 r1 = new po3
            r2 = 7
            r1.<init>(r0, r2)
            je7 r1 = defpackage.tu0.r(r7, r1)
            r0.D0 = r1
            tt3 r1 = new tt3
            int r17 = defpackage.z8a.q
            int r2 = defpackage.a9a.i
            eqe r3 = new eqe
            r3.<init>(r2)
            int r2 = defpackage.woc.M0
            java.lang.Integer r19 = java.lang.Integer.valueOf(r2)
            r21 = 20
            r20 = 0
            r16 = r1
            r18 = r3
            r16.<init>((int) r17, (defpackage.jqe) r18, (java.lang.Integer) r19, (java.lang.Integer) r20, (int) r21)
            tt3 r2 = new tt3
            int r23 = defpackage.z8a.r
            int r3 = defpackage.jpc.a
            eqe r4 = new eqe
            r4.<init>(r3)
            int r3 = defpackage.woc.f2
            java.lang.Integer r25 = java.lang.Integer.valueOf(r3)
            r27 = 20
            r26 = 0
            r22 = r2
            r24 = r4
            r22.<init>((int) r23, (defpackage.jqe) r24, (java.lang.Integer) r25, (java.lang.Integer) r26, (int) r27)
            tt3 r3 = new tt3
            int r17 = defpackage.gca.d
            int r4 = defpackage.hca.e
            eqe r5 = new eqe
            r5.<init>(r4)
            int r4 = defpackage.woc.f1
            java.lang.Integer r19 = java.lang.Integer.valueOf(r4)
            r21 = 20
            r20 = 0
            r16 = r3
            r18 = r5
            r16.<init>((int) r17, (defpackage.jqe) r18, (java.lang.Integer) r19, (java.lang.Integer) r20, (int) r21)
            tt3 r4 = new tt3
            int r23 = defpackage.gca.k
            int r5 = defpackage.hca.k
            eqe r8 = new eqe
            r8.<init>(r5)
            int r5 = defpackage.woc.N1
            java.lang.Integer r25 = java.lang.Integer.valueOf(r5)
            r27 = 20
            r26 = 0
            r22 = r4
            r24 = r8
            r22.<init>((int) r23, (defpackage.jqe) r24, (java.lang.Integer) r25, (java.lang.Integer) r26, (int) r27)
            tt3 r5 = new tt3
            int r17 = defpackage.gca.e
            int r8 = defpackage.hca.f
            eqe r9 = new eqe
            r9.<init>(r8)
            int r8 = defpackage.woc.c0
            java.lang.Integer r19 = java.lang.Integer.valueOf(r8)
            r21 = 20
            r20 = 0
            r16 = r5
            r18 = r9
            r16.<init>((int) r17, (defpackage.jqe) r18, (java.lang.Integer) r19, (java.lang.Integer) r20, (int) r21)
            tt3[] r1 = new defpackage.tt3[]{r1, r2, r3, r4, r5}
            java.util.List r1 = defpackage.y53.M(r1)
            r0.E0 = r1
            fua r1 = defpackage.fua.a
            je7 r1 = r1.b()
            r0.F0 = r1
            v4 r1 = r11.getAccessor()
            java.lang.Class<q33> r2 = defpackage.q33.class
            khe r1 = r1.d(r2)
            r0.G0 = r1
            v4 r1 = r11.getAccessor()
            java.lang.Class<y7d> r2 = defpackage.y7d.class
            r1.d(r2)
            v4 r1 = r11.getAccessor()
            java.lang.Class<bva> r2 = defpackage.bva.class
            r1.d(r2)
            zf3 r1 = new zf3
            r1.<init>(r6)
            khe r2 = new khe
            r2.<init>(r1)
            r0.H0 = r2
            w4d r1 = defpackage.mqd.D()
            r0.I0 = r1
            fs r1 = new fs
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            java.lang.String r3 = "selected.contactId.Action"
            r4 = 0
            r1.<init>(r2, r4, r3)
            r0.J0 = r1
            fs r1 = new fs
            java.lang.Class<java.lang.CharSequence> r2 = java.lang.CharSequence.class
            java.lang.String r3 = "contact_list_widget_search_query"
            r1.<init>(r2, r4, r3)
            r0.K0 = r1
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            fs r2 = new fs
            java.lang.String r3 = "contact_list_widget_is_in_search"
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            r2.<init>(r4, r1, r3)
            r0.L0 = r2
            fs r2 = new fs
            java.lang.String r3 = "contact_list_widget_is_need_scroll_to_top"
            r2.<init>(r4, r1, r3)
            r0.M0 = r2
            fs r2 = new fs
            java.lang.String r3 = "contact_list_widget_permission_check"
            r2.<init>(r4, r1, r3)
            r0.N0 = r2
            glc r1 = new glc
            po3 r2 = new po3
            r3 = 8
            r2.<init>(r0, r3)
            r3 = 0
            r4 = 6
            r1.<init>(r2, r3, r4)
            r0.O0 = r1
            oo3 r1 = r28.p0()
            s35 r1 = r1.C0
            eh7 r2 = r0.lifecycleOwner
            gh7 r2 = r2.Q()
            fg7 r4 = defpackage.fg7.o
            kq1 r1 = defpackage.tu0.g(r1, r2, r4)
            so3 r2 = new so3
            r2.<init>(r0, r3)
            zn5 r3 = new zn5
            r3.<init>(r1, r2, r6)
            pg7 r1 = r28.getLifecycleScope()
            defpackage.od2.L(r3, r1)
            oo3 r1 = r28.p0()
            s35 r1 = r1.D0
            eh7 r2 = r0.lifecycleOwner
            gh7 r2 = r2.Q()
            kq1 r1 = defpackage.tu0.g(r1, r2, r4)
            t03 r2 = new t03
            r2.<init>(r1, r7)
            to3 r1 = new to3
            r3 = 0
            r1.<init>(r0, r3)
            zn5 r3 = new zn5
            r3.<init>(r2, r1, r6)
            pg7 r0 = r28.getLifecycleScope()
            defpackage.od2.L(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.contactlist.ContactListWidget.<init>(android.os.Bundle):void");
    }

    public ContactListWidget(uo3 uo3) {
        this(dy7.g(new kpa("contact_screen_open_mode", uo3.name())));
    }
}
