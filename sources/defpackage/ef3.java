package defpackage;

import kotlin.coroutines.Continuation;
import one.me.login.confirm.ConfirmPhoneScreen;

/* renamed from: ef3  reason: default package */
public final class ef3 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ConfirmPhoneScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ef3(ConfirmPhoneScreen confirmPhoneScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = confirmPhoneScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ef3) n((String) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ef3 ef3 = new ef3(this.Y, continuation);
        ef3.X = obj;
        return ef3;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        bc7[] bc7Arr = ConfirmPhoneScreen.C0;
        this.Y.p0().J0(0, (String) this.X);
        return e5f.a;
    }
}
