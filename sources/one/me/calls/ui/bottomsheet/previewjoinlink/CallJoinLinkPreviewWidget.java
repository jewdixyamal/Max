package one.me.calls.ui.bottomsheet.previewjoinlink;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/calls/ui/bottomsheet/previewjoinlink/CallJoinLinkPreviewWidget;", "Lone/me/sdk/arch/Widget;", "Lng3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "link", "(Ljava/lang/String;)V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
public final class CallJoinLinkPreviewWidget extends Widget implements ng3 {
    public static final /* synthetic */ bc7[] B0;
    public final glc A0;
    public final qm0 X;
    public final qm0 Y;
    public final qm0 Z;
    public final l5g a;
    public final tta b;
    public final je7 c;
    public final je7 o;
    public final qm0 s0;
    public final qm0 t0;
    public final qm0 u0;
    public final q7c v0;
    public final je7 w0;
    public final je7 x0;
    public final je7 y0;
    public final je7 z0;

    static {
        Class<CallJoinLinkPreviewWidget> cls = CallJoinLinkPreviewWidget.class;
        hob hob = new hob(cls, "titleView", "getTitleView()Landroid/widget/TextView;", 0);
        oec oec = nec.a;
        B0 = new bc7[]{hob, zr6.e(oec, cls, "closeView", "getCloseView()Lone/me/calls/ui/view/RoundButtonView;", 0), zr6.f(cls, "oneMeStackAvatarView", "getOneMeStackAvatarView()Lone/me/sdk/uikit/common/avatar/OneMeStackAvatarView;", 0, oec), zr6.f(cls, "microphoneSwitch", "getMicrophoneSwitch()Lone/me/calls/ui/view/RoundButtonView;", 0, oec), zr6.f(cls, "videoSwitch", "getVideoSwitch()Lone/me/calls/ui/view/RoundButtonView;", 0, oec), zr6.f(cls, "button", "getButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0, oec), zr6.f(cls, "previewView", "getPreviewView()Lone/me/calls/ui/view/CallUserView;", 0, oec)};
    }

    public CallJoinLinkPreviewWidget(String str) {
        this(dy7.g(new kpa("call_join_link", str)));
    }

    public static void s0(knc knc, Drawable drawable, Drawable drawable2, m38 m38, eqe eqe, eqe eqe2) {
        knc.setVisibility(m38 != m38.o ? 0 : 8);
        int ordinal = m38.ordinal();
        fnc fnc = fnc.o;
        pq9 pq9 = qp4.u0;
        if (ordinal == 0) {
            knc.A(drawable2, pq9.p(knc).c.getIcon().g);
            knc.setMode(fnc);
            knc.setAccessibility((jqe) eqe2);
        } else if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return;
                }
                if (ordinal != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            knc.A(drawable2, pq9.p(knc).c.getIcon().c);
            knc.setMode(fnc);
            knc.setAccessibility((jqe) eqe2);
        } else {
            pq9.p(knc).c.getIcon();
            knc.A(drawable, -1);
            knc.setMode(fnc.X);
            knc.setAccessibility((jqe) eqe);
        }
    }

    public final x27 getInsetsConfig() {
        x27 x27 = x27.c;
        return x27.d;
    }

    public final bvc getScreenDelegate() {
        return this.A0;
    }

    public final void h(int i, Bundle bundle) {
        ((rg1) this.c.getValue()).g(i);
    }

    public final knc m0() {
        bc7 bc7 = B0[3];
        return (knc) this.s0.getValue();
    }

    public final yia n0() {
        bc7 bc7 = B0[2];
        return (yia) this.Z.getValue();
    }

    public final TextView o0() {
        bc7 bc7 = B0[0];
        return (TextView) this.X.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        constraintLayout.setLayoutParams(new ti3(-1, -1));
        pq9 pq9 = qp4.u0;
        constraintLayout.setBackgroundColor(pq9.p(constraintLayout).c.b().j);
        FrameLayout frameLayout = new FrameLayout(constraintLayout.getContext());
        frameLayout.setId(y7a.e0);
        ap1 ap1 = new ap1(frameLayout.getContext(), (AttributeSet) null);
        ap1.setId(y7a.d0);
        ap1.setMode(yo1.o);
        ap1.J((String) null, ap1.getContext().getString(b8a.g0));
        zb1 zb1 = new zb1(this);
        ap1.h1 = gg1.c;
        ap1.b1 = zb1;
        ap1.setCustomTheme(pq9.p(ap1).c);
        frameLayout.addView(ap1, -1, -1);
        constraintLayout.addView(frameLayout, -1, 0);
        constraintLayout.addView(o0(), -2, -2);
        bc7[] bc7Arr = B0;
        bc7 bc7 = bc7Arr[1];
        qm0 qm0 = this.Y;
        constraintLayout.addView((knc) qm0.getValue());
        constraintLayout.addView(n0());
        constraintLayout.addView(m0(), -2, -2);
        constraintLayout.addView(p0(), -2, -2);
        bc7 bc72 = bc7Arr[5];
        qm0 qm02 = this.u0;
        constraintLayout.addView((OneMeButton) qm02.getValue(), -1, -2);
        dj3 q = fp3.q(constraintLayout);
        int id = o0().getId();
        q.d(id, 6, 0, 6);
        float f = (float) 60;
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(q, 6, id, 4));
        q.d(id, 3, 0, 3);
        float f2 = (float) 16;
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(q, 3, id, 4));
        q.d(id, 7, 0, 7);
        new l2a(q, 7, id, 4).e(tu0.G(f * fk4.d().getDisplayMetrics().density));
        q.g(id).d.l0 = true;
        bc7 bc73 = bc7Arr[1];
        int id2 = ((knc) qm0.getValue()).getId();
        q.d(id2, 3, o0().getId(), 3);
        q.d(id2, 4, o0().getId(), 4);
        q.d(id2, 7, 0, 7);
        new l2a(q, 7, id2, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        int id3 = n0().getId();
        q.d(id3, 3, o0().getId(), 4);
        float f3 = (float) 24;
        au1.p(f3, fk4.d().getDisplayMetrics().density, new l2a(q, 3, id3, 4));
        q.d(id3, 7, 0, 7);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(q, 7, id3, 4));
        q.d(id3, 6, 0, 6);
        new l2a(q, 6, id3, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        q.d(id3, 4, frameLayout.getId(), 3);
        int id4 = frameLayout.getId();
        q.d(id4, 3, n0().getId(), 4);
        au1.p(f3, fk4.d().getDisplayMetrics().density, new l2a(q, 3, id4, 4));
        q.d(id4, 7, 0, 7);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(q, 7, id4, 4));
        q.d(id4, 6, 0, 6);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(q, 6, id4, 4));
        bc7 bc74 = bc7Arr[5];
        q.d(id4, 4, ((OneMeButton) qm02.getValue()).getId(), 3);
        new l2a(q, 4, id4, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        int id5 = m0().getId();
        q.d(id5, 4, frameLayout.getId(), 4);
        new l2a(q, 4, id5, 4).e(tu0.G(f3 * fk4.d().getDisplayMetrics().density));
        q.d(id5, 7, p0().getId(), 6);
        q.d(id5, 6, 0, 6);
        q.g(id5).d.V = 2;
        int id6 = p0().getId();
        q.d(id6, 4, m0().getId(), 4);
        q.d(id6, 3, m0().getId(), 3);
        q.d(id6, 7, 0, 7);
        q.d(id6, 6, m0().getId(), 7);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(q, 6, id6, 4));
        bc7 bc75 = bc7Arr[5];
        int id7 = ((OneMeButton) qm02.getValue()).getId();
        q.d(id7, 7, frameLayout.getId(), 7);
        new l2a(q, 7, id7, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        q.d(id7, 6, frameLayout.getId(), 6);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(q, 6, id7, 4));
        q.d(id7, 4, 0, 4);
        new l2a(q, 4, id7, 4).e(tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        q.a(constraintLayout);
        return constraintLayout;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        tta tta = this.b;
        if (i == 159 && tta.a().b(eua.l)) {
            q0().s(true);
        } else if (i != 160 || !tta.a().b(eua.h)) {
            ((rg1) this.c.getValue()).b(i, strArr, iArr);
        } else {
            q0().r(true);
        }
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        s35 s35 = q0().A0;
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(s35, getViewLifecycleOwner().Q(), fg7), new ac1((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(q0().x0, getViewLifecycleOwner().Q(), fg7), new bc1((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final knc p0() {
        bc7 bc7 = B0[4];
        return (knc) this.t0.getValue();
    }

    public final vb1 q0() {
        return (vb1) this.o.getValue();
    }

    public final void r0() {
        getRouter().B(this);
    }

    public CallJoinLinkPreviewWidget(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        this.a = new l5g(this, 1);
        this.b = new tta(fua.a.b());
        this.c = tu0.r(3, new wb1(this, 0));
        this.o = createViewModelLazy(vb1.class, new s(15, new x2(bundle, (Widget) this, 10)));
        this.X = binding(new wb1(this, 7));
        this.Y = binding(new wb1(this, 8));
        this.Z = binding(new wb1(this, 9));
        this.s0 = binding(new wb1(this, 10));
        this.t0 = binding(new wb1(this, 11));
        this.u0 = binding(new wb1(this, 1));
        this.v0 = viewBinding(y7a.d0);
        this.w0 = tu0.r(3, new wb1(this, 2));
        this.x0 = tu0.r(3, new wb1(this, 3));
        this.y0 = tu0.r(3, new wb1(this, 5));
        this.z0 = tu0.r(3, new wb1(this, 6));
        this.A0 = new glc(new k11(15), (k56) null, 6);
    }
}
