package one.me.chatmedia.viewer;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.conductor.changehandlers.swipe.SwipeWidget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB1\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\b\u0010\u0012¨\u0006\u0013"}, d2 = {"Lone/me/chatmedia/viewer/ChatMediaViewerScreen;", "Lone/me/sdk/conductor/changehandlers/swipe/SwipeWidget;", "Ljwa;", "Ldmf;", "Lzvc;", "Lxt3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "chatId", "", "attachId", "msgId", "", "singleMode", "descOrder", "(JLjava/lang/String;JZZ)V", "chat-media-viewer_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ChatMediaViewerScreen extends SwipeWidget implements jwa, dmf, zvc, xt3 {
    public static final /* synthetic */ bc7[] K0;
    public static final x27 L0 = new x27(5, (yq0) null, 2);
    public static final x27 M0 = new x27(0, new yq0(5, 1, false), 1);
    public yk8 A0;
    public a7g B0;
    public AnimatorSet C0;
    public final rg2 D0;
    public final je7 E0;
    public final je7 F0;
    public float G0;
    public boolean H0;
    public vxd I0;
    public vha J0;
    public final fs X;
    public final fs Y;
    public final fs Z;
    public final fs o;
    public final fs s0;
    public final je7 t0;
    public final glc u0;
    public final boolean v0;
    public final je7 w0;
    public final q7c x0;
    public final q7c y0;
    public final q7c z0;

    static {
        Class<ChatMediaViewerScreen> cls = ChatMediaViewerScreen.class;
        K0 = new bc7[]{new hob(cls, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), z7b.g(nec.a, cls, "attachId", "getAttachId()Ljava/lang/String;", 0), new hob(cls, "msgId", "getMsgId()J", 0), new hob(cls, "descOrder", "getDescOrder()Z", 0), new hob(cls, "singleMode", "getSingleMode()Z", 0), new hob(cls, "viewPager", "getViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0), new hob(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new hob(cls, "infoPanel", "getInfoPanel()Lone/me/chatmedia/viewer/InformationPanelView;", 0)};
    }

    public ChatMediaViewerScreen(Bundle bundle) {
        super(bundle);
        Class<Long> cls = Long.class;
        this.o = new fs(cls, 0L, "chat.media.viewer.chat_id");
        this.X = new fs(String.class, "", "chat.media.viewer.attach_id");
        this.Y = new fs(cls, 0L, "chat.media.viewer.message_id");
        Boolean bool = Boolean.FALSE;
        Class<Boolean> cls2 = Boolean.class;
        this.Z = new fs(cls2, bool, "chat.media.viewer.desc_order");
        this.s0 = new fs(cls2, bool, "chat.media.viewer.single_mode");
        ee2 ee2 = ee2.a;
        this.t0 = ee2.getAccessor().d(qe5.class);
        this.u0 = new glc(new m52(14), (k56) null, 6);
        this.v0 = true;
        this.w0 = createViewModelLazy(ck2.class, new ti2(0, new ii2(this, 0)));
        this.x0 = viewBinding(k8a.e);
        this.y0 = viewBinding(k8a.i);
        this.z0 = viewBinding(k8a.d);
        this.D0 = new rg2(this, ((iba) ee2.getAccessor().c(iba.class)).a());
        this.E0 = ee2.getAccessor().d(jrd.class);
        this.F0 = tu0.r(3, new ii2(this, 1));
        this.G0 = -1.0f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r1 = r1.I0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean v0(one.me.chatmedia.viewer.ChatMediaViewerScreen r1) {
        /*
            je7 r0 = r1.F0
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x0014
            vxd r1 = r1.I0
            if (r1 == 0) goto L_0x0014
            boolean r1 = r1.isActive()
            r0 = 1
            if (r1 != r0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.chatmedia.viewer.ChatMediaViewerScreen.v0(one.me.chatmedia.viewer.ChatMediaViewerScreen):boolean");
    }

    public final g07 A0() {
        return (g07) this.z0.T0(this, K0[7]);
    }

    public final dkf B0() {
        return (dkf) this.F0.getValue();
    }

    public final cla C0() {
        return (cla) this.y0.T0(this, K0[6]);
    }

    public final ck2 D0() {
        return (ck2) this.w0.getValue();
    }

    public final void E0(boolean z) {
        vha vha = this.J0;
        if (vha != null) {
            vha.a();
        }
        String string = getContext().getString(z ? h0c.oneme_chatmedia_viewer_load_video_fail : h0c.oneme_chatmedia_viewer_load_photo_fail);
        wha wha = new wha((Widget) this);
        wha.h(string);
        wha.c(new eia(0, 0, w0(), 3));
        wha.e(new kia(woc.I));
        this.J0 = wha.i();
    }

    public final void F0() {
        dkf B02 = B0();
        int i = ft4.o;
        this.I0 = od2.L(tu0.g(new zn5(od2.x(new mqc(new ekf(B02, z7.R(50, kt4.MILLISECONDS), (Continuation) null))), new ui2((Continuation) null, this), 5), getViewLifecycleOwner().Q(), fg7.o), getViewLifecycleScope());
    }

    public final void G0(boolean z) {
        AnimatorSet animatorSet = this.C0;
        if ((animatorSet == null || !animatorSet.isRunning()) && getView() != null) {
            float f = (C0().getVisibility() == 0 || A0().getVisibility() == 0) ? 0.0f : 1.0f;
            kl7 l = j1e.l();
            cla C02 = C0();
            Property property = View.ALPHA;
            l.add(ObjectAnimator.ofFloat(C02, property, new float[]{C0().getAlpha(), f}));
            l.add(ObjectAnimator.ofFloat(A0(), property, new float[]{A0().getAlpha(), f}));
            yk8 yk8 = this.A0;
            ObjectAnimator ofFloat = yk8 != null ? ObjectAnimator.ofFloat(yk8.a(), property, new float[]{yk8.a().getAlpha(), f}) : null;
            if (z && ofFloat != null) {
                l.add(ofFloat);
            }
            kl7 d = j1e.d(l);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(d);
            animatorSet2.setDuration(200);
            animatorSet2.addListener(new vi2(this, z, f));
            animatorSet2.addListener(new vi2(f, this, z));
            animatorSet2.start();
            this.C0 = animatorSet2;
        }
    }

    public final boolean P() {
        return this.v0;
    }

    public final boolean S() {
        return ((se5) ((qe5) this.t0.getValue())).u();
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m45getScopeIdIluPPks() {
        return "chatMediaViewer";
    }

    public final bvc getScreenDelegate() {
        return this.u0;
    }

    public final boolean handleBack() {
        z0();
        vha vha = this.J0;
        if (vha != null) {
            vha.a();
        }
        return super.handleBack();
    }

    public final void o0() {
        Window window;
        Window window2;
        View view = getView();
        pq9 pq9 = qp4.u0;
        if (view != null) {
            view.setBackgroundColor(pq9.o(getContext()).c.b().j);
        }
        Activity activity = getActivity();
        if (!(activity == null || (window2 = activity.getWindow()) == null)) {
            window2.setStatusBarColor(pq9.o(getContext()).c.b().j);
        }
        Activity activity2 = getActivity();
        if (!(activity2 == null || (window = activity2.getWindow()) == null)) {
            window.setNavigationBarColor(pq9.o(getContext()).c.b().j);
        }
        y0(true);
        x0(false);
    }

    public final void onActivityStarted(Activity activity) {
        super.onActivityStarted(activity);
        if (getView() != null && A0().getVisibility() == 0) {
            Window window = activity.getWindow();
            pq9 pq9 = qp4.u0;
            window.setStatusBarColor(pq9.o(getContext()).c.b().j);
            activity.getWindow().setNavigationBarColor(pq9.o(getContext()).c.b().j);
            y0(true);
        }
    }

    public final void onChangeStarted(zu3 zu3, av3 av3) {
        super.onChangeStarted(zu3, av3);
        if (!av3.b) {
            z0();
        }
        if (av3 == av3.POP_EXIT && this.F0.a()) {
            ck2 D02 = D0();
            long F02 = B0().F0();
            D02.getClass();
            xq9 xq9 = xq9.a;
            uj2 uj2 = new uj2(D02, F02, (Continuation) null);
            j47.S(D02.a, xq9, vx3.c, uj2);
            B0().Y = null;
            fic fic = ((jrd) this.E0.getValue()).g;
            if (fic.a()) {
                dkf dkf = (dkf) fic.getValue();
                hm9.m(dkf.c, "Player. Release", new Object[0]);
                u75 u75 = dkf.o;
                u75.w2();
                u75.D0.Y.e(dkf);
                u75.r0(dkf);
                u75.w2();
                u75.p2((Object) null);
                u75.k2(0, 0);
                u75.release();
                dkf.X.k();
                fic.reset();
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        pge pge = new pge(getContext());
        pge.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ViewPager2 viewPager2 = new ViewPager2(pge.getContext());
        viewPager2.setId(k8a.e);
        viewPager2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        viewPager2.setOffscreenPageLimit(1);
        viewPager2.setAdapter(this.D0);
        fm9.z(viewPager2);
        pge.addView(viewPager2);
        cla cla = new cla(pge.getContext(), 6);
        cla.setId(k8a.i);
        cla.setLayoutParams(new FrameLayout.LayoutParams(-1, tu0.G(((float) 64) * fk4.d().getDisplayMetrics().density)));
        cla.setForm(uka.a);
        pq9 pq9 = qp4.u0;
        cla.setCustomTheme(pq9.p(cla).c);
        cla.setLeftActions(new kka(new ji2(this, 0)));
        int i = woc.t0;
        f fVar = r0;
        f fVar2 = new f(1, this, ChatMediaViewerScreen.class, "showDropdownMenu", "showDropdownMenu(Landroid/view/View;)V", 0, 13);
        wka wka = new wka(i, 0, fVar, 14);
        bc7 bc7 = K0[4];
        if (((Boolean) this.s0.a(this)).booleanValue()) {
            cla.setRightActions(new pka((yka) null, wka));
        } else {
            cla.setRightActions(new pka(new wka(yfa.e, 0, new ji2(this, 1), 14), wka));
        }
        cla.setBackgroundColor(pq9.p(cla).c.b().j);
        br7.d(cla, L0, (m56) null);
        pge.addView(cla);
        pge.setClipChildren(false);
        pge.setClipToPadding(false);
        g07 g07 = new g07(pge.getContext());
        g07.setId(k8a.d);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        g07.setLayoutParams(layoutParams);
        g07.setClipChildren(false);
        g07.setClipToPadding(false);
        float f = (float) 9;
        g07.setPadding(g07.getPaddingLeft(), tu0.G(fk4.d().getDisplayMetrics().density * f), g07.getPaddingRight(), tu0.G(f * fk4.d().getDisplayMetrics().density));
        g07.setBackgroundColor(pq9.p(g07).c.b().j);
        br7.d(g07, M0, (m56) null);
        pge.addView(g07);
        Activity activity = getActivity();
        if (activity != null) {
            activity.getWindow().setStatusBarColor(pq9.p(pge).c.b().j);
            activity.getWindow().setNavigationBarColor(pq9.p(pge).c.b().j);
            a7g a7g = new a7g(activity.getWindow(), activity.getWindow().getDecorView());
            a7g.a.w();
            this.B0 = a7g;
        }
        y0(true);
        pge.setBackgroundColor(pq9.p(pge).c.b().j);
        this.A0 = new yk8(pge, new gaa((Object) this));
        return pge;
    }

    public final void onDestroy() {
        super.onDestroy();
        je7 je7 = this.F0;
        if (je7.a()) {
            ((jrd) this.E0.getValue()).a((dkf) je7.getValue());
        }
    }

    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.A0 = null;
    }

    public final void onViewCreated(View view) {
        w7c w7c = D0().Q0;
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(w7c, getViewLifecycleOwner().Q(), fg7), new ki2((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(D0().U0, getViewLifecycleOwner().Q(), fg7), new li2((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(D0().S0, getViewLifecycleOwner().Q(), fg7), new mi2((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(D0().N0, getViewLifecycleOwner().Q(), fg7), new ni2((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(D0().O0, getViewLifecycleOwner().Q(), fg7), new oi2((Continuation) null, this), 5), getViewLifecycleScope());
        ((ViewPager2) this.x0.T0(this, K0[5])).b(new lh0(3, this));
        od2.L(new zn5(tu0.g(A0().getEvents(), getViewLifecycleOwner().Q(), fg7), new pi2((Continuation) null, this), 5), getViewLifecycleScope());
        ck2 D02 = D0();
        pnf.n(D02, ((w9a) D02.t0).b(), (vx3) null, new sj2(D02, (Continuation) null), 2);
        od2.L(new zn5(tu0.g(D0().Y0, getViewLifecycleOwner().Q(), fg7), new qi2((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final void q0() {
        Window window;
        Window window2;
        View view = getView();
        pq9 pq9 = qp4.u0;
        if (view != null) {
            pq9.o(getContext()).c.b();
            view.setBackgroundColor(0);
        }
        Activity activity = getActivity();
        if (!(activity == null || (window2 = activity.getWindow()) == null)) {
            pq9.o(getContext()).c.b();
            window2.setStatusBarColor(0);
        }
        Activity activity2 = getActivity();
        if (activity2 != null && (window = activity2.getWindow()) != null) {
            pq9.o(getContext()).c.b();
            window.setNavigationBarColor(0);
        }
    }

    public final void r0() {
        if (getView() == null) {
            return;
        }
        if (C0().getVisibility() == 0) {
            C0().setVisibility(8);
            A0().setVisibility(8);
            yk8 yk8 = this.A0;
            if (yk8 != null) {
                yk8.c(false);
                return;
            }
            return;
        }
        z0();
    }

    public final Long t0() {
        return 1000L;
    }

    public final Integer u0() {
        return Integer.valueOf(qp4.u0.o(getContext()).c.b().j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = defpackage.br7.v(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int w0() {
        /*
            r3 = this;
            android.view.View r0 = r3.getView()
            r1 = 0
            if (r0 == 0) goto L_0x0012
            java.lang.Integer r0 = defpackage.br7.v(r0)
            if (r0 == 0) goto L_0x0012
            int r0 = r0.intValue()
            goto L_0x0013
        L_0x0012:
            r0 = r1
        L_0x0013:
            g07 r2 = r3.A0()
            int r2 = r2.getMeasuredHeight()
            if (r0 != 0) goto L_0x0031
            g07 r3 = r3.A0()
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            boolean r0 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x002c
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            goto L_0x002d
        L_0x002c:
            r3 = 0
        L_0x002d:
            if (r3 == 0) goto L_0x0031
            int r1 = r3.bottomMargin
        L_0x0031:
            int r2 = r2 + r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.chatmedia.viewer.ChatMediaViewerScreen.w0():int");
    }

    public final void x0(boolean z) {
        if (z) {
            a7g a7g = this.B0;
            if (a7g != null) {
                a7g.a.x(1);
                return;
            }
            return;
        }
        a7g a7g2 = this.B0;
        if (a7g2 != null) {
            a7g2.a.k(1);
        }
    }

    public final void y(int i, Bundle bundle) {
        D0().E(i);
    }

    public final void y0(boolean z) {
        Window window;
        Activity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            boolean z2 = qp4.u0.j(window.getDecorView()).h() == l63.a && !z;
            a7g a7g = this.B0;
            if (a7g != null) {
                a7g.b(z2);
            }
            a7g a7g2 = this.B0;
            if (a7g2 != null) {
                a7g2.a(z2);
            }
        }
    }

    public final void z0() {
        Window window;
        Window window2;
        Activity activity = getActivity();
        pq9 pq9 = qp4.u0;
        if (!(activity == null || (window2 = activity.getWindow()) == null)) {
            pq9.o(getContext()).c.b();
            window2.setStatusBarColor(0);
        }
        Activity activity2 = getActivity();
        if (!(activity2 == null || (window = activity2.getWindow()) == null)) {
            pq9.o(getContext()).c.b();
            window.setNavigationBarColor(0);
        }
        y0(false);
        x0(true);
    }

    public ChatMediaViewerScreen(long j, String str, long j2, boolean z, boolean z2) {
        this(dy7.g(new kpa("chat.media.viewer.chat_id", Long.valueOf(j)), new kpa("chat.media.viewer.attach_id", str), new kpa("chat.media.viewer.message_id", Long.valueOf(j2)), new kpa("chat.media.viewer.single_mode", Boolean.valueOf(z)), new kpa("chat.media.viewer.desc_order", Boolean.valueOf(z2))));
    }
}
