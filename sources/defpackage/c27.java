package defpackage;

import android.widget.EditText;
import kotlin.coroutines.Continuation;
import one.me.login.inputphone.InputPhoneScreen;

/* renamed from: c27  reason: default package */
public final class c27 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ InputPhoneScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c27(Continuation continuation, InputPhoneScreen inputPhoneScreen) {
        super(2, continuation);
        this.Y = inputPhoneScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((c27) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        c27 c27 = new c27(continuation, this.Y);
        c27.X = obj;
        return c27;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        e5f e5f = (e5f) this.X;
        bc7[] bc7Arr = InputPhoneScreen.E0;
        lea p0 = this.Y.p0();
        if (p0.hasWindowFocus()) {
            EditText editText = p0.w0;
            editText.requestFocus();
            editText.post(new do9(p0, 3, editText));
        } else {
            p0.setOnWindowFocusChanged(new c01(4, p0));
        }
        return e5f.a;
    }
}
