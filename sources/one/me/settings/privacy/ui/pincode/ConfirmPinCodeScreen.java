package one.me.settings.privacy.ui.pincode;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/settings/privacy/ui/pincode/ConfirmPinCodeScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "hash", "(Ljava/lang/String;)V", "settings-privacy_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ConfirmPinCodeScreen extends Widget {
    public static final /* synthetic */ bc7[] Y;
    public final q7c X;
    public final fs a;
    public final je7 b;
    public final glc c;
    public final x27 o;

    static {
        Class<ConfirmPinCodeScreen> cls = ConfirmPinCodeScreen.class;
        Y = new bc7[]{new hob(cls, "hash", "getHash()Ljava/lang/String;", 0), zr6.e(nec.a, cls, "pinCodeView", "getPinCodeView()Lone/me/settings/privacy/ui/pincode/PinCodeView;", 0)};
    }

    public ConfirmPinCodeScreen(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        this.a = new fs(String.class, "confirm_pin_code:hash");
        this.b = createViewModelLazy(wf3.class, new ti2(26, new pf3(this, 1)));
        this.c = new glc(wuc.SETTINGS_PRIVACY_ACCEPT_PINCODE);
        this.o = x27.d;
        this.X = viewBinding(kxb.oneme_settings_privacy_setup_pin_code_root_view);
    }

    public static final m0b m0(ConfirmPinCodeScreen confirmPinCodeScreen) {
        confirmPinCodeScreen.getClass();
        return (m0b) confirmPinCodeScreen.X.T0(confirmPinCodeScreen, Y[1]);
    }

    public final x27 getInsetsConfig() {
        return this.o;
    }

    public final bvc getScreenDelegate() {
        return this.c;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        m0b m0b = new m0b(viewGroup.getContext());
        m0b.setId(kxb.oneme_settings_privacy_setup_pin_code_root_view);
        m0b.setListener((wf3) this.b.getValue());
        m0b.setTitle(p1c.oneme_settings_privacy_onboarding_re_enter_pin_code);
        m0b.setLocked(true);
        m0b.setOnBackPress(new pf3(this, 0));
        return m0b;
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [a66, ffe] */
    public final void onViewCreated(View view) {
        je7 je7 = this.b;
        t03 t03 = ((wf3) je7.getValue()).s0;
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(t03, getViewLifecycleOwner().Q(), fg7), new qf3((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(((wf3) je7.getValue()).v0, getViewLifecycleOwner().Q(), fg7), new ffe(2, (Continuation) null), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(((wf3) je7.getValue()).u0, getViewLifecycleOwner().Q(), fg7), new sf3((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public ConfirmPinCodeScreen(String str) {
        this(dy7.g(new kpa("confirm_pin_code:hash", str)));
    }
}
