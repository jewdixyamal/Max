package defpackage;

import kotlin.coroutines.Continuation;
import one.me.login.confirm.ConfirmPhoneScreen;

/* renamed from: df3  reason: default package */
public final class df3 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ConfirmPhoneScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public df3(ConfirmPhoneScreen confirmPhoneScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = confirmPhoneScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((df3) n((String) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        df3 df3 = new df3(this.Y, continuation);
        df3.X = obj;
        return df3;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        String str = (String) this.X;
        bc7[] bc7Arr = ConfirmPhoneScreen.C0;
        ConfirmPhoneScreen confirmPhoneScreen = this.Y;
        confirmPhoneScreen.getClass();
        x77 x77 = (x77) confirmPhoneScreen.B0.T0(confirmPhoneScreen, ConfirmPhoneScreen.C0[7]);
        e5f e5f = e5f.a;
        if ((x77 != null && x77.isActive()) || confirmPhoneScreen.A0 != null) {
            return e5f;
        }
        confirmPhoneScreen.s0(str);
        return e5f;
    }
}
