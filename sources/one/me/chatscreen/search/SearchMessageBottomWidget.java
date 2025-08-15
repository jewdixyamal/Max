package one.me.chatscreen.search;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/chatscreen/search/SearchMessageBottomWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "scopeId", "(Ljava/lang/String;Lz84;)V", "chat-screen_release"}, k = 1, mv = {2, 0, 0})
public final class SearchMessageBottomWidget extends Widget {
    public static final /* synthetic */ bc7[] s0;
    public final qm0 X;
    public boolean Y;
    public boolean Z;
    public final je7 a;
    public final qm0 b;
    public final qm0 c;
    public final qm0 o;

    static {
        Class<SearchMessageBottomWidget> cls = SearchMessageBottomWidget.class;
        s0 = new bc7[]{new oi9(cls, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;"), z7b.g(nec.a, cls, "searchResultTextView", "getSearchResultTextView()Landroidx/appcompat/widget/AppCompatTextView;", 0), new hob(cls, "upButton", "getUpButton()Landroidx/appcompat/widget/AppCompatImageView;", 0), new hob(cls, "downButton", "getDownButton()Landroidx/appcompat/widget/AppCompatImageView;", 0), new hob(cls, "separatorView", "getSeparatorView()Landroid/view/View;", 0)};
    }

    public SearchMessageBottomWidget(String str, z84 z84) {
        this(dy7.g(new kpa(Widget.ARG_SCOPE_ID, new suc(str))));
    }

    public final AppCompatImageView m0() {
        bc7 bc7 = s0[3];
        return (AppCompatImageView) this.o.getValue();
    }

    public final AppCompatTextView n0() {
        bc7 bc7 = s0[1];
        return (AppCompatTextView) this.b.getValue();
    }

    public final View o0() {
        bc7 bc7 = s0[4];
        return (View) this.X.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        float f = (float) 12;
        float f2 = (float) 4;
        constraintLayout.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        constraintLayout.setMinHeight(tu0.G(((float) 44) * fk4.d().getDisplayMetrics().density));
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        constraintLayout.addView(n0());
        constraintLayout.addView(p0());
        constraintLayout.addView(o0());
        constraintLayout.addView(m0());
        v3c.y(new r1b((Object) this, (Continuation) null, 10), constraintLayout);
        dj3 q = fp3.q(constraintLayout);
        int id = n0().getId();
        q.d(id, 6, 0, 6);
        q.d(id, 3, 0, 3);
        q.d(id, 7, p0().getId(), 6);
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(q, 7, id, 4));
        q.d(id, 4, 0, 4);
        q.g(id).d.l0 = true;
        q.g(id).d.w = 0.0f;
        int id2 = p0().getId();
        q.d(id2, 3, 0, 3);
        q.d(id2, 7, o0().getId(), 6);
        float f3 = (float) 10;
        au1.p(f3, fk4.d().getDisplayMetrics().density, new l2a(q, 7, id2, 4));
        q.d(id2, 4, 0, 4);
        int id3 = o0().getId();
        q.d(id3, 3, 0, 3);
        q.d(id3, 7, m0().getId(), 6);
        au1.p(f3, fk4.d().getDisplayMetrics().density, new l2a(q, 7, id3, 4));
        q.d(id3, 4, 0, 4);
        int id4 = m0().getId();
        q.d(id4, 3, 0, 3);
        q.d(id4, 7, 0, 7);
        q.d(id4, 4, 0, 4);
        q.a(constraintLayout);
        return constraintLayout;
    }

    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        q0().q();
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        i3a h = getRouter().h();
        if (h != null) {
            h.b(q0().X);
        }
        od2.L(new zn5(q0().Y, new xyc(view, this, (Continuation) null), 5), getViewLifecycleScope());
        od2.L(new zn5(new t03(tu0.g(q0().s0, this.lifecycleOwner.Q(), fg7.o), 11), new yyc(this, (Continuation) null), 5), getViewLifecycleScope());
    }

    public final AppCompatImageView p0() {
        bc7 bc7 = s0[2];
        return (AppCompatImageView) this.c.getValue();
    }

    public final hzc q0() {
        return (hzc) this.a.getValue();
    }

    public final void r0(AppCompatImageView appCompatImageView, boolean z) {
        appCompatImageView.setImageTintList(ColorStateList.valueOf(z ? s0().d.d : s0().d.g));
    }

    public final i9g s0() {
        return qp4.u0.b(getContext()).i().a().h();
    }

    public SearchMessageBottomWidget(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        fs fsVar = new fs(suc.class, Widget.ARG_SCOPE_ID);
        bc7 bc7 = s0[0];
        this.a = m82getSharedViewModelcp94BC8(((suc) fsVar.a(this)).a, hzc.class, (k56) null);
        this.b = binding(new vyc(this, 0));
        this.c = binding(new vyc(this, 1));
        this.o = binding(new vyc(this, 2));
        this.X = binding(new vyc(this, 3));
    }
}
