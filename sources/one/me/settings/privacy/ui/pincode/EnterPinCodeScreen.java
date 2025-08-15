package one.me.settings.privacy.ui.pincode;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lone/me/settings/privacy/ui/pincode/EnterPinCodeScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "j25", "settings-privacy_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class EnterPinCodeScreen extends Widget {
    public static final /* synthetic */ bc7[] X;
    public final x27 a = x27.d;
    public final glc b = new glc(wuc.SETTINGS_PRIVACY_INSERT_PINCODE);
    public final je7 c = createViewModelLazy(o25.class, new nj4(1, new zf3(26)));
    public final q7c o = viewBinding(kxb.oneme_settings_privacy_enter_pin_code_root);

    static {
        hob hob = new hob(EnterPinCodeScreen.class, "pinCodeView", "getPinCodeView()Lone/me/settings/privacy/ui/pincode/PinCodeView;", 0);
        nec.a.getClass();
        X = new bc7[]{hob};
    }

    public EnterPinCodeScreen() {
        super((Bundle) null, 0, 3, (z84) null);
    }

    public final x27 getInsetsConfig() {
        return this.a;
    }

    public final bvc getScreenDelegate() {
        return this.b;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        m0b m0b = new m0b(viewGroup.getContext());
        m0b.setId(kxb.oneme_settings_privacy_enter_pin_code_root);
        m0b.setListener((o25) this.c.getValue());
        m0b.setTitle(p1c.oneme_settings_privacy_enter_pin_code_title);
        m0b.setDescription(Integer.valueOf(p1c.oneme_settings_privacy_enter_pin_code_description));
        m0b.setLocked(true);
        m0b.setOnBackPress(new i25(this, 0));
        m0b.setForgotPinCodeClickListener(new i25(this, 1));
        return m0b;
    }

    public final void onDetach(View view) {
        mr0.I(view);
    }

    public final void onViewCreated(View view) {
        je7 je7 = this.c;
        s35 s35 = ((o25) je7.getValue()).X;
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(s35, getViewLifecycleOwner().Q(), fg7), new k25((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(((o25) je7.getValue()).Y, getViewLifecycleOwner().Q(), fg7), new l25((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(((o25) je7.getValue()).Z, getViewLifecycleOwner().Q(), fg7), new m25((Continuation) null, this), 5), getViewLifecycleScope());
    }
}
