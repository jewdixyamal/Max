package one.me.calllist.ui.callinfo;

import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000fB\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0005\u0010\u000e¨\u0006\u0010"}, d2 = {"Lone/me/calllist/ui/callinfo/CallLinkInfoScreen;", "Lone/me/sdk/arch/Widget;", "Lng3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "", "link", "title", "", "isLinkCall", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Z)V", "b46", "call-list_release"}, k = 1, mv = {2, 0, 0})
public final class CallLinkInfoScreen extends Widget implements ng3 {
    public static final b46 B0 = new Object();
    public static final /* synthetic */ bc7[] C0;
    public final glc A0;
    public final je7 X;
    public final je7 Y;
    public final q7c Z;
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final khe o;
    public final q7c s0;
    public final q7c t0;
    public final q7c u0;
    public final q7c v0;
    public final q7c w0;
    public final q7c x0;
    public aof y0;
    public final da1 z0;

    /* JADX WARNING: type inference failed for: r0v7, types: [b46, java.lang.Object] */
    static {
        Class<CallLinkInfoScreen> cls = CallLinkInfoScreen.class;
        bc7 hob = new hob(cls, "collapsibleContainerLinearLayout", "getCollapsibleContainerLinearLayout()Landroid/widget/LinearLayout;", 0);
        oec oec = nec.a;
        C0 = new bc7[]{hob, zr6.e(oec, cls, "appBarLayout", "getAppBarLayout()Lcom/google/android/material/appbar/AppBarLayout;", 0), zr6.f(cls, "oneMeToolbar", "getOneMeToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0, oec), zr6.f(cls, "titleTextView", "getTitleTextView()Landroid/widget/TextView;", 0, oec), zr6.f(cls, "linkTextView", "getLinkTextView()Landroid/widget/TextView;", 0, oec), zr6.f(cls, "button", "getButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0, oec), zr6.f(cls, "icon", "getIcon()Lone/me/sdk/uikit/common/avatar/OneMeAvatarView;", 0, oec)};
    }

    public CallLinkInfoScreen() {
        this((Bundle) null, 1, (z84) null);
    }

    public final x27 getInsetsConfig() {
        x27 x27 = x27.c;
        return x27.d;
    }

    public final bvc getScreenDelegate() {
        return this.A0;
    }

    public final void h(int i, Bundle bundle) {
        ((rg1) this.Y.getValue()).g(i);
    }

    public final bt1 m0() {
        return (bt1) this.b.getValue();
    }

    public final dd1 n0() {
        return (dd1) this.c.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        tc1 tc1 = new tc1(this, 0);
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(getContext(), (AttributeSet) null);
        coordinatorLayout.setId(r7a.q);
        coordinatorLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        tc1.invoke(coordinatorLayout);
        return coordinatorLayout;
    }

    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.y0 = null;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        ((rg1) this.Y.getValue()).b(i, strArr, iArr);
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        wb5 wb5 = new wb5();
        bc7[] bc7Arr = C0;
        bc7 bc7 = bc7Arr[1];
        q7c q7c = this.s0;
        ((fm) q7c.T0(this, bc7)).a(s36.D(new vc1(wb5, this, 0), (fm) q7c.T0(this, bc7Arr[1]), getViewLifecycleOwner()));
        s35 s35 = n0().v0;
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(s35, getViewLifecycleOwner().Q(), fg7), new wc1((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(n0().u0, getViewLifecycleOwner().Q(), fg7), new xc1((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public CallLinkInfoScreen(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        s71 s71 = s71.a;
        this.a = s71.getAccessor().d(kke.class);
        this.b = s71.getAccessor().d(bt1.class);
        this.c = createViewModelLazy(dd1.class, new s(16, new x2(bundle, (Widget) this, 11)));
        this.o = new khe(new uc1(this, 1));
        this.X = tu0.r(3, new uc1(this, 2));
        this.Y = tu0.r(3, new uc1(this, 3));
        this.Z = viewBinding(r7a.p);
        this.s0 = viewBinding(r7a.n);
        this.t0 = viewBinding(r7a.t);
        this.u0 = viewBinding(r7a.u);
        this.v0 = viewBinding(r7a.s);
        this.w0 = viewBinding(r7a.o);
        this.x0 = viewBinding(r7a.r);
        this.z0 = new da1(new bkg(5, this), ((iba) s71.getAccessor().c(iba.class)).a());
        this.A0 = new glc(new k11(16), (k56) null, 6);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CallLinkInfoScreen(Bundle bundle, int i, z84 z84) {
        this((i & 1) != 0 ? null : bundle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CallLinkInfoScreen(java.lang.Long r4, java.lang.String r5, java.lang.String r6, boolean r7) {
        /*
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "link_param"
            r0.putString(r1, r5)
            java.lang.String r5 = "title_param"
            r0.putString(r5, r6)
            if (r4 == 0) goto L_0x001a
            java.lang.String r5 = "id_param"
            long r1 = r4.longValue()
            r0.putLong(r5, r1)
        L_0x001a:
            java.lang.String r4 = "is_link_call"
            r0.putBoolean(r4, r7)
            r3.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.calllist.ui.callinfo.CallLinkInfoScreen.<init>(java.lang.Long, java.lang.String, java.lang.String, boolean):void");
    }
}
