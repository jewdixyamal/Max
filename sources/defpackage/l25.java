package defpackage;

import kotlin.coroutines.Continuation;
import one.me.settings.privacy.ui.pincode.EnterPinCodeScreen;

/* renamed from: l25  reason: default package */
public final class l25 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ EnterPinCodeScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l25(Continuation continuation, EnterPinCodeScreen enterPinCodeScreen) {
        super(2, continuation);
        this.Y = enterPinCodeScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((l25) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        l25 l25 = new l25(continuation, this.Y);
        l25.X = obj;
        return l25;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        e5f e5f = (e5f) this.X;
        i3a onBackPressedDispatcher = this.Y.getOnBackPressedDispatcher();
        if (onBackPressedDispatcher != null) {
            onBackPressedDispatcher.d();
        }
        return e5f.a;
    }
}
