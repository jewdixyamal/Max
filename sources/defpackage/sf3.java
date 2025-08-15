package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.settings.privacy.ui.pincode.ConfirmPinCodeScreen;

/* renamed from: sf3  reason: default package */
public final class sf3 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ConfirmPinCodeScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sf3(Continuation continuation, ConfirmPinCodeScreen confirmPinCodeScreen) {
        super(2, continuation);
        this.Y = confirmPinCodeScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((sf3) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        sf3 sf3 = new sf3(continuation, this.Y);
        sf3.X = obj;
        return sf3;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        wha wha = new wha((Widget) this.Y);
        wha.h(eae.g0((String) this.X));
        wha.i();
        return e5f.a;
    }
}
