package one.me.login;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import one.me.login.inputphone.InputPhoneScreen;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/login/LoginScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "login_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class LoginScreen extends Widget {
    public static final /* synthetic */ bc7[] c;
    public final q7c a = Widget.childRouter$default(this, hwb.oneme_login_conductor, (m56) null, 2, (Object) null);
    public final String b = "LoginScope";

    static {
        hob hob = new hob(LoginScreen.class, "loginRouter", "getLoginRouter()Lcom/bluelinelabs/conductor/Router;", 0);
        nec.a.getClass();
        c = new bc7[]{hob};
    }

    public LoginScreen() {
        super((Bundle) null, 0, 3, (z84) null);
        createViewModelLazy(iu7.class, new nj4(17, new m57(20)));
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m63getScopeIdIluPPks() {
        return this.b;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(hwb.oneme_login_conductor);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        bc7[] bc7Arr = c;
        bc7 bc7 = bc7Arr[0];
        q7c q7c = this.a;
        if (!((znc) q7c.T0(this, bc7)).n()) {
            ((znc) q7c.T0(this, bc7Arr[0])).e = 1;
            ((znc) q7c.T0(this, bc7Arr[0])).R(new coc(new InputPhoneScreen(), (String) null, (zu3) null, (zu3) null, false, -1));
        }
    }
}
