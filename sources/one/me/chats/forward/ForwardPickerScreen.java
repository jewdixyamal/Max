package one.me.chats.forward;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.chats.picker.chats.PickerChatsListWidget;
import one.me.chats.picker.chats.PickerChatsTabWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0011\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB1\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0007\u0010\u0010¨\u0006\u0011"}, d2 = {"Lone/me/chats/forward/ForwardPickerScreen;", "Lone/me/chats/picker/AbstractPickerScreen;", "Liz5;", "Lng3;", "Lxt3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "messagesIds", "", "attachId", "", "isForwardAttach", "showExternalSharing", "([JLjava/lang/Long;ZZ)V", "forward-message_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ForwardPickerScreen extends AbstractPickerScreen<iz5> implements ng3, xt3 {
    public static final /* synthetic */ bc7[] I0;
    public static final x27 J0 = new x27(4, new yq0(4, 3, false));
    public final qm0 A0;
    public final q7c B0;
    public final je7 C0;
    public w12 D0;
    public znc E0;
    public final tz5 F0;
    public hc8 G0;
    public ywe H0;
    public final glc t0;
    public final x27 u0;
    public final x3c v0;
    public final fs w0;
    public final fs x0;
    public k56 y0;
    public final AutoTransition z0;

    static {
        Class<ForwardPickerScreen> cls = ForwardPickerScreen.class;
        I0 = new bc7[]{new oi9(cls, "messagesIds", "getMessagesIds()[J"), rh4.g(nec.a, cls, "attachId", "getAttachId()J"), new oi9(cls, "isForwardAttach", "isForwardAttach()Z"), new hob(cls, "showExternalSharing", "getShowExternalSharing()Z", 0), new oi9(cls, "isInMultiSelect", "isInMultiSelect()Z"), new hob(cls, "inputView", "getInputView()Lone/me/sdk/uikit/common/chat/MessageInputView;", 0), new hob(cls, "quoteView", "getQuoteView()Lone/me/sdk/uikit/common/chat/QuoteView;", 0)};
    }

    public ForwardPickerScreen(long[] jArr, Long l, boolean z, boolean z2) {
        this(dy7.g(new kpa("messages_to_forward", jArr), new kpa("attach_to_forward", l), new kpa("is_forward_attach", Boolean.valueOf(z)), new kpa("show_external_sharing", Boolean.valueOf(z2))));
    }

    public static final void x0(ForwardPickerScreen forwardPickerScreen, View view, eqe eqe, boolean z) {
        forwardPickerScreen.getClass();
        float f = (float) 6;
        Point point = new Point(tu0.G(fk4.d().getDisplayMetrics().density * f), rh4.q(f, fk4.d().getDisplayMetrics().density, forwardPickerScreen.requireView().getBottom() - forwardPickerScreen.z0().getTop()));
        ywe ywe = forwardPickerScreen.H0;
        if (ywe != null) {
            ywe.dismiss();
        }
        ywe ywe2 = new ywe(forwardPickerScreen.getContext(), view, (k56) new pz5(forwardPickerScreen, 0), (k56) null, 0, 1, 56);
        ywe2.d(eqe);
        ywe2.e(point, 8388691, z ? 2500 : 800);
        ywe2.setOnDismissListener(new m11(4, forwardPickerScreen));
        forwardPickerScreen.H0 = ywe2;
    }

    public final boolean A0() {
        bc7 bc7 = I0[2];
        return ((Boolean) this.w0.a(this)).booleanValue();
    }

    public final boolean B0() {
        bc7 bc7 = I0[4];
        return ((Boolean) this.x0.a(this)).booleanValue();
    }

    public final void C0(boolean z) {
        coc coc;
        bc7 bc7 = I0[4];
        this.x0.b(this, Boolean.valueOf(z));
        coc coc2 = (coc) x53.i0(getChildRouter((ViewGroup) this.Z.T0(this, AbstractPickerScreen.s0[3])).e());
        uu3 uu3 = coc2 != null ? coc2.a : null;
        Widget widget = uu3 instanceof Widget ? (Widget) uu3 : null;
        PickerChatsTabWidget pickerChatsTabWidget = widget instanceof PickerChatsTabWidget ? (PickerChatsTabWidget) widget : null;
        if (pickerChatsTabWidget != null) {
            bc7 bc72 = PickerChatsTabWidget.y0[1];
            pickerChatsTabWidget.b.b(pickerChatsTabWidget, Boolean.valueOf(z));
            hdc adapter = pickerChatsTabWidget.n0().getAdapter();
            if (adapter != null) {
                int j = adapter.j();
                for (int i = 0; i < j; i++) {
                    znc znc = (znc) pickerChatsTabWidget.w0.s0.get(i);
                    uu3 uu32 = (znc == null || (coc = (coc) x53.i0(znc.e())) == null) ? null : coc.a;
                    PickerChatsListWidget pickerChatsListWidget = uu32 instanceof PickerChatsListWidget ? (PickerChatsListWidget) uu32 : null;
                    if (pickerChatsListWidget != null) {
                        bc7[] bc7Arr = PickerChatsListWidget.C0;
                        bc7 bc73 = bc7Arr[2];
                        Boolean valueOf = Boolean.valueOf(z);
                        fs fsVar = pickerChatsListWidget.X;
                        fsVar.b(pickerChatsListWidget, valueOf);
                        bc7 bc74 = bc7Arr[2];
                        boolean booleanValue = ((Boolean) fsVar.a(pickerChatsListWidget)).booleanValue();
                        je7 je7 = pickerChatsListWidget.B0;
                        if (booleanValue) {
                            pickerChatsListWidget.p0().j((c03) je7.getValue());
                        } else {
                            pickerChatsListWidget.p0().p0((c03) je7.getValue());
                        }
                    }
                }
            }
        }
    }

    public final x27 getInsetsConfig() {
        return this.u0;
    }

    public final bvc getScreenDelegate() {
        return this.t0;
    }

    public final void h(int i, Bundle bundle) {
        if (i == xoc.r0) {
            dz5.c.P1().d();
        }
    }

    public final boolean handleBack() {
        znc znc = this.E0;
        if (znc != null && znc.n()) {
            ((iz5) v0().c).r.z(1);
            return true;
        } else if (!(!((Collection) v0().Z.a.getValue()).isEmpty())) {
            return super.handleBack();
        } else {
            bc7[] bc7Arr = BottomSheetWidget.x0;
            znc znc2 = null;
            lg3 e = wg0.e(yoc.m0, 6, (Bundle) null);
            e.b(xoc.r0, new eqe(yoc.l0));
            e.c(xoc.q0, new eqe(yoc.k0));
            ConfirmationBottomSheet e2 = e.e();
            e2.setTargetController(this);
            uu3 uu3 = this;
            while (uu3.getParentController() != null) {
                uu3 = uu3.getParentController();
            }
            foc foc = uu3 instanceof foc ? (foc) uu3 : null;
            if (foc != null) {
                znc2 = foc.T();
            }
            e2.z0(this);
            if (znc2 == null) {
                return true;
            }
            coc coc = new coc(e2, (String) null, (zu3) null, (zu3) null, false, -1);
            wg0.l(false, coc, true, "BottomSheetWidget");
            znc2.G(coc);
            return true;
        }
    }

    public final Iterable m0() {
        csb csb = new csb(getContext());
        csb.setId(m8a.c);
        v3c.y(new xh0(3, (Continuation) null, 14), csb);
        csb.setLayoutParams(new LinearLayout.LayoutParams(-1, tu0.G(((float) 52) * fk4.d().getDisplayMetrics().density)));
        od2.L(new zn5(((iz5) v0().c).n, new qz5(csb, this, (Continuation) null), 5), getViewLifecycleScope());
        return y53.M(csb, y0());
    }

    public final sya n0() {
        wy5 wy5 = wy5.a;
        return new m5d(this.v0, new xs2(wy5.getAccessor().d(iy2.class)), (je7) wy5.getAccessor().d(ds3.class), (je7) wy5.getAccessor().d(q33.class));
    }

    public final Widget o0(String str) {
        return new PickerChatsTabWidget(str, B0(), new oz5(this, 0), oa2.b, (z84) null);
    }

    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.D0 = null;
        this.E0 = null;
        hc8 hc8 = this.G0;
        if (hc8 != null) {
            hc8.a();
        }
        this.G0 = null;
        ywe ywe = this.H0;
        if (ywe != null) {
            ywe.dismiss();
        }
        this.H0 = null;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [android.widget.FrameLayout, android.view.View, w12, android.view.ViewGroup] */
    public final void onViewCreated(View view) {
        View view2 = view;
        super.onViewCreated(view);
        ViewGroup viewGroup = (ViewGroup) view2;
        br7.d(t0(), J0, (m56) null);
        ? frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setId(m8a.b);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        frameLayout.setLayoutParams(layoutParams);
        int i = vc7.a;
        frameLayout.setTranslationY((float) vc7.a(frameLayout.getContext()));
        br7.d(frameLayout, new x27(0, new yq0(5, 1, false), 1), (m56) null);
        this.D0 = frameLayout;
        this.E0 = getChildRouter(frameLayout);
        viewGroup.addView(frameLayout);
        od2.L(new zn5(v0().Z, new yz5(this, view2, (Continuation) null), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(new ac(((iz5) v0().c).t, 24, this), getViewLifecycleOwner().Q(), fg7.o), new wz5((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(((iz5) v0().c).q, new zz5((Continuation) null, this), 5), getViewLifecycleScope());
        ViewGroup t02 = t0();
        znc znc = this.E0;
        w12 w12 = this.D0;
        if (znc != null && w12 != null) {
            pz5 pz5 = new pz5(this, 1);
            boolean z = ((gta) wy5.a.getAccessor().c(gta.class)).b && Build.VERSION.SDK_INT >= 30;
            pg7 viewLifecycleScope = getViewLifecycleScope();
            uy8 uy8 = (uy8) ((w7c) ((iz5) v0().c).r.c).a.getValue();
            this.G0 = new hc8(znc, w12, t02, pz5, z, viewLifecycleScope, (uy8 != null ? uy8.a : 0) == 2, new yf3(this, 12, t02));
            new bc8((cc8) this.C0.getValue(), y0()).a(getViewLifecycleScope());
            od2.L(new zn5(new t03((w7c) ((iz5) v0().c).r.c, 11), new sz5(this, t02, (Continuation) null), 5), getViewLifecycleScope());
        }
    }

    public final cla p0(Context context) {
        cla cla = new cla(context, 6);
        cla.setId(m8a.d);
        cla.setTransitionName(context.getString(r8a.q));
        cla.setTitle(r8a.U);
        float f = (float) 4;
        cla.setActionsHorizontalPadding(new kpa(Integer.valueOf(tu0.G(fk4.d().getDisplayMetrics().density * f)), Integer.valueOf(tu0.G(f * fk4.d().getDisplayMetrics().density))));
        cla.setForm(uka.a);
        cla.setLeftActions(new kka(new oz5(this, 1)));
        cla.setRightActions(new pka(new xka(new rz5(this, 0)), new vka(woc.t0, new oz5(this, 2))));
        return cla;
    }

    public final qza q0() {
        Set set = null;
        Long valueOf = getArgs().getLong("attach_to_forward") == 0 ? null : Long.valueOf(getArgs().getLong("attach_to_forward"));
        long[] longArray = getArgs().getLongArray("messages_to_forward");
        if (longArray != null) {
            set = ys.n0(longArray);
        }
        wz4 wz4 = set == null ? wz4.a : set;
        wy5 wy5 = wy5.a;
        return new iz5(wz4, (d06) wy5.getAccessor().c(d06.class), this.v0, valueOf, A0(), (Context) wy5.getAccessor().c(Context.class), wy5.getAccessor().d(kke.class), wy5.getAccessor().d(lu0.class), wy5.getAccessor().d(sy5.class), wy5.getAccessor().d(bz5.class), wy5.getAccessor().d(wha.class), wy5.getAccessor().d(q33.class));
    }

    public final g9a r0() {
        return null;
    }

    public final j0e s0() {
        return null;
    }

    public final Set w0(Bundle bundle) {
        return wz4.a;
    }

    public final void y(int i, Bundle bundle) {
        iz5 iz5 = (iz5) v0().c;
        iz5.getClass();
        int i2 = m8a.f;
        kld kld = iz5.p;
        if (i == i2) {
            kld.g(new lz5());
        } else if (i == m8a.e) {
            kld.g(kz5.a);
        }
    }

    public final sv8 y0() {
        bc7 bc7 = I0[5];
        return (sv8) this.A0.getValue();
    }

    public final csb z0() {
        return (csb) this.B0.T0(this, I0[6]);
    }

    public ForwardPickerScreen(Bundle bundle) {
        super(bundle);
        this.t0 = new glc(new fh5(7), (k56) null, 6);
        this.u0 = x27.c;
        wy5 wy5 = wy5.a;
        this.v0 = new x3c((je7) wy5.getAccessor().d(q33.class), (je7) wy5.getAccessor().d(kke.class), (je7) wy5.getAccessor().d(iy2.class), 8);
        Boolean bool = Boolean.FALSE;
        Class<Boolean> cls = Boolean.class;
        this.w0 = new fs(cls, bool, "is_forward_attach");
        this.x0 = new fs(cls, bool, "is_in_multiselect");
        this.y0 = new fh5(8);
        AutoTransition autoTransition = new AutoTransition();
        int i = m8a.c;
        autoTransition.addTarget(i);
        autoTransition.addTarget(p8a.c0);
        autoTransition.addTarget(m8a.a);
        autoTransition.setOrdering(0);
        autoTransition.setDuration(100);
        autoTransition.addListener(new a6(1, this));
        this.z0 = autoTransition;
        this.A0 = binding(new pz5(this, 2));
        this.B0 = viewBinding(i);
        this.C0 = createViewModelLazy(cc8.class, new nj4(7, new fh5(9)));
        this.F0 = new tz5(this, 0);
        wy5.getAccessor().d(y7d.class);
        kr0 kr0 = new kr0((uu3) this, (k56) new pz5(this, 3));
        if (getRouter() != null) {
            getRouter().a(kr0);
        } else {
            addLifecycleListener(new o9(this, kr0, 6));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ForwardPickerScreen(long[] jArr, Long l, boolean z, boolean z2, int i, z84 z84) {
        this(jArr, (i & 2) != 0 ? null : l, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
    }
}
