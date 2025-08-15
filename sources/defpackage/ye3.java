package defpackage;

import android.view.View;
import one.me.login.confirm.ConfirmPhoneScreen;

/* renamed from: ye3  reason: default package */
public final /* synthetic */ class ye3 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConfirmPhoneScreen b;

    public /* synthetic */ ye3(ConfirmPhoneScreen confirmPhoneScreen, int i) {
        this.a = i;
        this.b = confirmPhoneScreen;
    }

    public final Object invoke(Object obj) {
        e5f e5f = e5f.a;
        ConfirmPhoneScreen confirmPhoneScreen = this.b;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                bc7[] bc7Arr = ConfirmPhoneScreen.C0;
                confirmPhoneScreen.getRouter().C();
                return e5f;
            default:
                gg3 gg3 = (gg3) obj;
                bc7[] bc7Arr2 = ConfirmPhoneScreen.C0;
                if (gg3 == gg3.SUCCESS) {
                    confirmPhoneScreen.r0().B0.m((Object) null, Boolean.TRUE);
                }
                return e5f;
        }
    }
}
