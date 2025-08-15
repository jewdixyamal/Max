package one.me.calls.ui.bottomsheet.more;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/calls/ui/bottomsheet/more/CallMoreBottomSheet;", "Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "scopeId", "Lbe1;", "type", "(Ljava/lang/String;Lbe1;Lz84;)V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
public final class CallMoreBottomSheet extends BaseBottomSheetWidget {
    public static final /* synthetic */ bc7[] x0;
    public final je7 s0;
    public final je7 t0;
    public final q7c u0;
    public final je7 v0;
    public final ae1 w0;

    static {
        Class<CallMoreBottomSheet> cls = CallMoreBottomSheet.class;
        x0 = new bc7[]{new hob(cls, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;", 0), zr6.e(nec.a, cls, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    }

    public CallMoreBottomSheet(String str, be1 be1, z84 z84) {
        this(dy7.g(new kpa(Widget.ARG_SCOPE_ID, new suc(str)), new kpa("open_type", be1.name())));
    }

    public final void onDestroyView(View view) {
        ((RecyclerView) this.u0.T0(this, x0[1])).setAdapter((hdc) null);
        super.onDestroyView(view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004c, code lost:
        r1 = ((defpackage.yz0) ((defpackage.ez0) r1.X.getValue())).d().a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r12) {
        /*
            r11 = this;
            r12 = 5
            je7 r0 = r11.t0
            java.lang.Object r1 = r0.getValue()
            ie1 r1 = (defpackage.ie1) r1
            el1 r2 = r1.c
            w7c r3 = r2.C0
            j0e r3 = r3.a
            java.lang.Object r3 = r3.getValue()
            la1 r3 = (defpackage.la1) r3
            be1 r4 = r1.b
            int r4 = r4.ordinal()
            if (r4 == 0) goto L_0x0101
            r5 = 1
            if (r4 == r5) goto L_0x0033
            r1 = 2
            if (r4 != r1) goto L_0x002d
            sy0 r1 = defpackage.qpa.a
            yj1 r1 = r3.j
            kl7 r1 = defpackage.qpa.b(r1)
            goto L_0x0103
        L_0x002d:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        L_0x0033:
            boolean r4 = r3.g
            ak1 r6 = r3.i
            if (r4 == 0) goto L_0x00db
            sy0 r4 = defpackage.qpa.a
            je7 r4 = r1.Y
            java.lang.Object r4 = r4.getValue()
            qe5 r4 = (defpackage.qe5) r4
            se5 r4 = (defpackage.se5) r4
            boolean r4 = r4.q()
            r7 = 0
            if (r4 == 0) goto L_0x0065
            je7 r1 = r1.X
            java.lang.Object r1 = r1.getValue()
            ez0 r1 = (defpackage.ez0) r1
            yz0 r1 = (defpackage.yz0) r1
            fw3 r1 = r1.d()
            ru.ok.android.externcalls.sdk.Conversation r1 = r1.a()
            if (r1 == 0) goto L_0x0065
            boolean r1 = r1.isMeCreatorOrAdmin()
            goto L_0x0066
        L_0x0065:
            r1 = r7
        L_0x0066:
            khe r4 = r2.z0
            java.lang.Object r4 = r4.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            khe r8 = r2.B0
            java.lang.Object r8 = r8.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            w7c r2 = r2.N0
            j0e r2 = r2.a
            java.lang.Object r2 = r2.getValue()
            nnf r2 = (defpackage.nnf) r2
            kl7 r9 = defpackage.j1e.l()
            boolean r10 = r3.l
            if (r10 == 0) goto L_0x0098
            boolean r10 = r6.a()
            if (r10 == 0) goto L_0x0097
            goto L_0x0098
        L_0x0097:
            r5 = r7
        L_0x0098:
            nnf r7 = defpackage.nnf.c
            if (r2 != r7) goto L_0x00a4
            if (r5 == 0) goto L_0x00a4
            sy0 r2 = defpackage.qpa.m
            r9.add(r2)
            goto L_0x00bf
        L_0x00a4:
            if (r2 != r7) goto L_0x00ac
            sy0 r2 = defpackage.qpa.l
            r9.add(r2)
            goto L_0x00bf
        L_0x00ac:
            nnf r7 = defpackage.nnf.a
            if (r2 != r7) goto L_0x00b8
            if (r5 == 0) goto L_0x00b8
            sy0 r2 = defpackage.qpa.k
            r9.add(r2)
            goto L_0x00bf
        L_0x00b8:
            if (r2 != r7) goto L_0x00bf
            sy0 r2 = defpackage.qpa.j
            r9.add(r2)
        L_0x00bf:
            if (r4 == 0) goto L_0x00c4
            defpackage.qpa.a(r9, r6)
        L_0x00c4:
            if (r8 == 0) goto L_0x00cf
            yj1 r2 = r3.j
            kl7 r2 = defpackage.qpa.b(r2)
            r9.addAll(r2)
        L_0x00cf:
            if (r1 == 0) goto L_0x00d6
            sy0 r1 = defpackage.qpa.n
            r9.add(r1)
        L_0x00d6:
            kl7 r1 = defpackage.j1e.d(r9)
            goto L_0x0103
        L_0x00db:
            sy0 r1 = defpackage.qpa.a
            khe r1 = r2.A0
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            kl7 r2 = defpackage.j1e.l()
            if (r1 == 0) goto L_0x00f2
            defpackage.qpa.a(r2, r6)
        L_0x00f2:
            sy0 r1 = defpackage.qpa.b
            r2.add(r1)
            sy0 r1 = defpackage.qpa.a
            r2.add(r1)
            kl7 r1 = defpackage.j1e.d(r2)
            goto L_0x0103
        L_0x0101:
            nz4 r1 = defpackage.nz4.a
        L_0x0103:
            ae1 r2 = r11.w0
            r2.E(r1)
            java.lang.Object r1 = r0.getValue()
            ie1 r1 = (defpackage.ie1) r1
            ac r1 = r1.t0
            fg7 r2 = defpackage.fg7.o
            eh7 r3 = r11.getViewLifecycleOwner()
            gh7 r3 = r3.Q()
            kq1 r1 = defpackage.tu0.g(r1, r3, r2)
            ce1 r3 = new ce1
            r4 = 0
            r3.<init>(r4, r11)
            zn5 r5 = new zn5
            r5.<init>(r1, r3, r12)
            pg7 r1 = r11.getViewLifecycleScope()
            defpackage.od2.L(r5, r1)
            java.lang.Object r0 = r0.getValue()
            ie1 r0 = (defpackage.ie1) r0
            s35 r0 = r0.u0
            eh7 r1 = r11.getViewLifecycleOwner()
            gh7 r1 = r1.Q()
            kq1 r0 = defpackage.tu0.g(r0, r1, r2)
            de1 r1 = new de1
            r1.<init>(r4, r11)
            zn5 r2 = new zn5
            r2.<init>(r0, r1, r12)
            pg7 r11 = r11.getViewLifecycleScope()
            defpackage.od2.L(r2, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet.onViewCreated(android.view.View):void");
    }

    public final fka q0() {
        return qp4.u0.o(getContext()).c;
    }

    public final void w0(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(linearLayout.getContext());
        frameLayout2.setId(y7a.m0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(tu0.G(((float) 36) * fk4.d().getDisplayMetrics().density), tu0.G(((float) 5) * fk4.d().getDisplayMetrics().density));
        layoutParams2.gravity = 49;
        float f = (float) 12;
        layoutParams2.topMargin = tu0.G(fk4.d().getDisplayMetrics().density * f);
        layoutParams2.bottomMargin = tu0.G(f * fk4.d().getDisplayMetrics().density);
        frameLayout2.setLayoutParams(layoutParams2);
        frameLayout2.setOutlineProvider(new ix3(fk4.d().getDisplayMetrics().density * 40.0f));
        frameLayout2.setBackgroundColor(qp4.u0.p(frameLayout2).c.getIcon().h);
        linearLayout.addView(frameLayout2);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), (AttributeSet) null);
        recyclerView.setId(y7a.k0);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.w0);
        recyclerView.setItemAnimator((mdc) null);
        recyclerView.j(new ry0(0));
        linearLayout.addView(recyclerView);
        v3c.y(new ee1(3, (Continuation) null, 0), linearLayout);
        frameLayout.addView(linearLayout);
    }

    public CallMoreBottomSheet(Bundle bundle) {
        super(bundle);
        fs fsVar = new fs(suc.class, new suc("default"), Widget.ARG_SCOPE_ID);
        bc7 bc7 = x0[0];
        this.s0 = m82getSharedViewModelcp94BC8(((suc) fsVar.a(this)).a, el1.class, (k56) null);
        this.t0 = createViewModelLazy(ie1.class, new s(17, new x2(bundle, (Widget) this, 13)));
        this.u0 = viewBinding(y7a.k0);
        je7 r = tu0.r(3, new k11(17));
        this.v0 = r;
        this.w0 = new ae1(new wmc(this, false), (acc) r.getValue(), ((iba) zi1.a.getAccessor().c(iba.class)).a());
    }
}
