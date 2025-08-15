package one.me.settings.privacy.ui.pincode;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/settings/privacy/ui/pincode/SetupPinCodeScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "settings-privacy_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class SetupPinCodeScreen extends Widget {
    public static final /* synthetic */ int o = 0;
    public final je7 a = createViewModelLazy(ajd.class, new nhd(2, new xid(0)));
    public final glc b = new glc(wuc.SETTINGS_PRIVACY_NEW_PINCODE);
    public final x27 c = x27.d;

    public SetupPinCodeScreen() {
        super((Bundle) null, 0, 3, (z84) null);
    }

    public final x27 getInsetsConfig() {
        return this.c;
    }

    public final bvc getScreenDelegate() {
        return this.b;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        m0b m0b = new m0b(viewGroup.getContext());
        m0b.setId(kxb.oneme_settings_privacy_setup_pin_code_root_view);
        m0b.setListener((ajd) this.a.getValue());
        m0b.setTitle(p1c.oneme_settings_privacy_onboarding_come_up_pin_code);
        m0b.setLocked(false);
        m0b.setOnBackPress(new zja(m0b, 20, this));
        return m0b;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [a66, ffe] */
    public final void onViewCreated(View view) {
        od2.L(new zn5(tu0.g(new t03(((ajd) this.a.getValue()).X, 11), getViewLifecycleOwner().Q(), fg7.o), new ffe(2, (Continuation) null), 5), getViewLifecycleScope());
    }
}
