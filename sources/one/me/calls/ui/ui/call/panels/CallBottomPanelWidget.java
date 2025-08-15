package one.me.calls.ui.ui.call.panels;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/calls/ui/ui/call/panels/CallBottomPanelWidget;", "Lone/me/sdk/arch/Widget;", "Lxt3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "scopeId", "(Ljava/lang/String;Lz84;)V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class CallBottomPanelWidget extends Widget implements xt3 {
    public static final /* synthetic */ bc7[] s0;
    public final w4d X;
    public rt3 Y;
    public final q7c Z;
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 o;

    static {
        Class<CallBottomPanelWidget> cls = CallBottomPanelWidget.class;
        s0 = new bc7[]{new hob(cls, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;", 0), rh4.g(nec.a, cls, "audioLevelJob", "getAudioLevelJob()Lkotlinx/coroutines/Job;"), new hob(cls, "callBottomPanel", "getCallBottomPanel()Lone/me/calls/ui/view/controls/CallBottomControlViewWrapper;", 0)};
    }

    public CallBottomPanelWidget(String str, z84 z84) {
        this(dy7.g(new kpa(Widget.ARG_SCOPE_ID, new suc(str))));
    }

    public final r11 m0() {
        return (r11) this.Z.T0(this, s0[2]);
    }

    public final h21 n0() {
        return (h21) this.o.getValue();
    }

    public final void onAttach(View view) {
        super.onAttach(view);
        ac acVar = n0().Z;
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(acVar, getViewLifecycleOwner().Q(), fg7), new j21((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(n0().s0, getViewLifecycleOwner().Q(), fg7), new k21((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(n0().u0, getViewLifecycleOwner().Q(), fg7), new l21((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(n0().w0, getViewLifecycleOwner().Q(), fg7), new m21((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(n0().v0, getViewLifecycleOwner().Q(), fg7), new n21((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        r11 r11 = new r11(getContext());
        r11.setId(rvb.call_bottom_control);
        r11.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return r11;
    }

    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.X.o1(this, s0[1], (Object) null);
        m0().a();
        rt3 rt3 = this.Y;
        if (rt3 != null) {
            rt3.dismiss();
        }
        this.Y = null;
    }

    public final void onDismiss() {
        this.Y = null;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        je7 je7 = this.a;
        boolean z = false;
        boolean z2 = i == 159 && ((eua) je7.getValue()).b(eua.l);
        if (i == 160 && ((eua) je7.getValue()).b(eua.h)) {
            z = true;
        }
        m38 m38 = m38.b;
        if (z2) {
            n0().u(m38);
        } else if (z) {
            n0().s(m38);
        }
        if (z2 || z) {
            im requireActivity = requireActivity();
            ((hl1) this.b.getValue()).getClass();
            hl1.d(requireActivity);
        }
    }

    public final void onViewCreated(View view) {
        m0().setClickListener(new sy4(5, (Object) this));
    }

    public final void y(int i, Bundle bundle) {
        Object obj;
        CallsAudioDeviceInfo b2;
        h21 n0 = n0();
        Iterator it = n0.q().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((a51) obj).getId() == i) {
                break;
            }
        }
        a51 a51 = (a51) obj;
        if (a51 != null && (b2 = a51.b()) != null) {
            n0.r().l(b2);
        }
    }

    public CallBottomPanelWidget(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        fs fsVar = new fs(suc.class, new suc("default"), Widget.ARG_SCOPE_ID);
        n31 n31 = n31.a;
        this.a = n31.getAccessor().d(eua.class);
        this.b = n31.getAccessor().d(hl1.class);
        bc7 bc7 = s0[0];
        this.c = m82getSharedViewModelcp94BC8(((suc) fsVar.a(this)).a, el1.class, (k56) null);
        this.o = createViewModelLazy(h21.class, new s(9, new x5(20, this)));
        this.X = mqd.D();
        this.Z = viewBinding(rvb.call_bottom_control);
    }
}
