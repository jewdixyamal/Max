package one.me.sdk.messagewrite.mention;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/sdk/messagewrite/mention/SuggestionsWidget;", "Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Loce;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "scopeId", "(Ljava/lang/String;Lz84;)V", "message-write-widget_release"}, k = 1, mv = {2, 0, 0})
public final class SuggestionsWidget extends BaseBottomSheetWidget implements oce {
    public static final /* synthetic */ bc7[] B0;
    public final qm0 A0;
    public final je7 s0;
    public final q7c t0;
    public final je7 u0;
    public final qm0 v0;
    public final qm0 w0;
    public final qm0 x0;
    public final qm0 y0;
    public final qm0 z0;

    static {
        Class<SuggestionsWidget> cls = SuggestionsWidget.class;
        B0 = new bc7[]{new oi9(cls, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;"), z7b.g(nec.a, cls, "suggestionsContainer", "getSuggestionsContainer()Landroidx/constraintlayout/widget/ConstraintLayout;", 0), new hob(cls, "dragView", "getDragView()Landroid/widget/FrameLayout;", 0), new hob(cls, "suggestionsRecyclerView", "getSuggestionsRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView;", 0), new hob(cls, "closeView", "getCloseView()Landroidx/appcompat/widget/AppCompatImageView;", 0), new hob(cls, "titleView", "getTitleView()Landroidx/appcompat/widget/AppCompatTextView;", 0), new hob(cls, "closePanelView", "getClosePanelView()Landroid/widget/FrameLayout;", 0), new hob(cls, "notFoundView", "getNotFoundView()Landroidx/appcompat/widget/AppCompatTextView;", 0)};
    }

    public SuggestionsWidget(String str, z84 z84) {
        this(dy7.g(new kpa(Widget.ARG_SCOPE_ID, new suc(str))));
    }

    public final z15 A0() {
        bc7 bc7 = B0[3];
        return (z15) this.w0.getValue();
    }

    public final yce B0() {
        return (yce) this.s0.getValue();
    }

    public final void C0() {
        q0e q0e;
        Object value;
        yce B02 = B0();
        do {
            q0e = B02.I0;
            value = q0e.getValue();
            rce rce = (rce) value;
        } while (!q0e.c(value, (Object) null));
        s0(true);
    }

    public final boolean handleBack() {
        C0();
        return true;
    }

    public final z5b n0() {
        return new t9(this, 6);
    }

    public final x27 o0() {
        return new x27(0, new yq0(1, 3, false), 1);
    }

    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        A0().setAdapter((hdc) null);
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        A0().setAdapter((pce) this.u0.getValue());
        od2.L(new zn5(B0().D0, new ade(this, (Continuation) null), 5), getViewLifecycleScope());
        v3c.y(new r1b((Object) this, (Continuation) null, 17), view);
    }

    public final void w0(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle) {
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addView(y0());
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        constraintLayout.setId(lga.E);
        constraintLayout.addView(x0(), -1, -2);
        constraintLayout.addView(A0());
        constraintLayout.addView(z0());
        dj3 q = fp3.q(constraintLayout);
        int id = y0().getId();
        q.d(id, 3, 0, 3);
        q.d(id, 6, 0, 6);
        q.d(id, 7, 0, 7);
        int id2 = x0().getId();
        q.d(id2, 3, 0, 3);
        q.d(id2, 7, 0, 7);
        float f = (float) 8;
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(q, 7, id2, 4));
        q.d(id2, 6, 0, 6);
        new l2a(q, 6, id2, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f));
        int id3 = z0().getId();
        q.d(id3, 3, x0().getId(), 4);
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(q, 3, id3, 4));
        q.d(id3, 6, 0, 6);
        int id4 = A0().getId();
        q.d(id4, 3, x0().getId(), 4);
        au1.p((float) 20, fk4.d().getDisplayMetrics().density, new l2a(q, 3, id4, 4));
        q.d(id4, 7, 0, 7);
        q.d(id4, 6, 0, 6);
        q.d(id4, 4, 0, 4);
        q.g(id4).d.m0 = true;
        q.g(id4).d.x = 0.0f;
        q.a(constraintLayout);
        frameLayout.addView(constraintLayout, -1, -1);
    }

    public final FrameLayout x0() {
        bc7 bc7 = B0[6];
        return (FrameLayout) this.z0.getValue();
    }

    public final FrameLayout y0() {
        bc7 bc7 = B0[2];
        return (FrameLayout) this.v0.getValue();
    }

    public final AppCompatTextView z0() {
        bc7 bc7 = B0[7];
        return (AppCompatTextView) this.A0.getValue();
    }

    public SuggestionsWidget(Bundle bundle) {
        super(bundle);
        fs fsVar = new fs(suc.class, Widget.ARG_SCOPE_ID);
        bc7 bc7 = B0[0];
        this.s0 = m82getSharedViewModelcp94BC8(((suc) fsVar.a(this)).a, yce.class, (k56) null);
        this.t0 = viewBinding(lga.E);
        this.u0 = tu0.r(3, new zce(this, 0));
        this.v0 = binding(new zce(this, 1));
        this.w0 = binding(new zce(this, 2));
        this.x0 = binding(new zce(this, 3));
        this.y0 = binding(new zce(this, 4));
        this.z0 = binding(new zce(this, 5));
        this.A0 = binding(new zce(this, 6));
        v0(false);
    }
}
