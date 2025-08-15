package defpackage;

import kotlin.coroutines.Continuation;
import one.me.login.inputphone.InputPhoneScreen;

/* renamed from: b27  reason: default package */
public final class b27 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ InputPhoneScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b27(Continuation continuation, InputPhoneScreen inputPhoneScreen) {
        super(2, continuation);
        this.Y = inputPhoneScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((b27) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        b27 b27 = new b27(continuation, this.Y);
        b27.X = obj;
        return b27;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        boolean booleanValue = ((Boolean) this.X).booleanValue();
        bc7[] bc7Arr = InputPhoneScreen.E0;
        this.Y.o0().setEnabled(booleanValue);
        return e5f.a;
    }
}
