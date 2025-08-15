package defpackage;

import android.content.Context;
import android.content.Intent;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.sdk.arch.Widget;
import org.apache.http.protocol.HTTP;

/* renamed from: ui1  reason: default package */
public final class ui1 implements km1 {
    public final /* synthetic */ CallScreen a;

    public ui1(CallScreen callScreen) {
        this.a = callScreen;
    }

    public final void d() {
        CallScreen callScreen = this.a;
        Context context = callScreen.getContext();
        String D = c37.D(callScreen.D0().s().k);
        die die = new die(context, 13);
        die.R(context.getString(f0c.call_link_share_dialog_share_link_description, new Object[]{D}));
        die.c = context.getString(f0c.call_link_share_dialog_share_link_dialog_intent_title);
        ((Intent) die.b).setType(HTTP.PLAIN_TEXT_TYPE);
        die.S();
    }

    public final void e() {
        yxc yxc = CallScreen.R0;
        CallScreen callScreen = this.a;
        tpa.o(callScreen.getContext(), c37.D(callScreen.D0().s().k));
        if (tpa.s()) {
            String string = callScreen.getContext().getString(f0c.call_link_share_dialog_share_link_copy);
            wha wha = new wha((Widget) callScreen);
            wha.h(string);
            wha.d(new ho1(3, (k56) null));
            wha.c(new eia(0, 0, 0, 3));
            wha.i();
        }
    }

    public final void h() {
        yxc yxc = CallScreen.R0;
        this.a.D0().r();
    }

    public final void m() {
        yxc yxc = CallScreen.R0;
        el1 D0 = this.a.D0();
        D0.getClass();
        pnf.o(D0.M0, new qj1(c37.D(D0.s().k)));
    }
}
